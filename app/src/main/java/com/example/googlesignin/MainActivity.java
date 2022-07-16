package com.example.googlesignin;

//clientid
//1811066406-tf567alj2bhigirki32mst2iphvnbht7.apps.googleusercontent.com
//clientsecret
//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

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.SignInButton;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.Task;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    GoogleSignInOptions gso;
    GoogleSignInClient mGoogleSignInClient;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        

        // Set the dimensions of the sign-in button.
        SignInButton signInButton = findViewById(R.id.sign_in_button);
        signInButton.setSize(SignInButton.SIZE_STANDARD);
        signInButton.setOnClickListener(this);

        gso = new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
                .requestEmail()
                .build();

        // Build a GoogleSignInClient with the options specified by gso.
        mGoogleSignInClient = GoogleSignIn.getClient(this, gso);

        // Check for existing Google Sign In account, if the user is already signed in
        // the GoogleSignInAccount will be non-null.
        GoogleSignInAccount account = GoogleSignIn.getLastSignedInAccount(this);

        if (account == null){
            //null:the user haven't sign in yet
            Toast.makeText(this, "Please Sign-In with Google Account", Toast.LENGTH_SHORT).show();

        }else{
            //user already signed in, then it will show you to the secret page
            Intent intent = new Intent(this, RahsiaActivity.class);
            intent.putExtra("Name",account.getDisplayName());
            intent.putExtra("Email",account.getEmail());

            startActivity(intent);
        }

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){

            case R.id.sign_in_button:
                Intent signInIntent = mGoogleSignInClient.getSignInIntent();
                startActivityForResult(signInIntent, 10);
                break;
        }
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        // Result returned from launching the Intent from GoogleSignInClient.getSignInIntent(...);
        if (requestCode == 10) {
            // The Task returned from this call is always completed, no need to attach
            // a listener.
            Task<GoogleSignInAccount> task = GoogleSignIn.getSignedInAccountFromIntent(data);
            handleSignInResult(task);
        }
    }

    private void handleSignInResult(Task<GoogleSignInAccount> completedTask) {
        try {
            GoogleSignInAccount account = completedTask.getResult(ApiException.class);

            // Signed in successfully, show authenticated UI.
            // if already sign-in, it will place you at the secret places
            Toast.makeText(this, "Successfully Sign-In", Toast.LENGTH_SHORT).show();

            Intent intent = new Intent(this, RahsiaActivity.class);
            intent.putExtra("Name",account.getDisplayName());
            intent.putExtra("Email",account.getEmail());

            startActivity(intent);


        } catch (ApiException e) {

            // The ApiException status code indicates the detailed failure reason.
            // Please refer to the GoogleSignInStatusCodes class reference for more information.
            Log.w("Sorry it doesn't work", "signInResult:failed code=" + e.getStatusCode());

            //Here part when the user cannot sign-in
            Toast.makeText(this, "Cannot Sign-In", Toast.LENGTH_SHORT).show();
        }
    }


}