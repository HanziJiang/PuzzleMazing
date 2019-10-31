package com.puzzle.mazing.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.puzzle.mazing.R;

public class LoginActivity extends AppCompatActivity {

  //    /**
  //     * A UserManager.
  //     */
  //    private UserManager usermanager;
  //
  //    /**
  //     * The current player of the game.
  //     */
  //    public static User activePlayer;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_log);
    //        setSignInListener();
    //        setRegisterListener();
  }
  //
  //    /**
  //     *  Activate the signIn button.
  //     */
  //    @SuppressLint("SetTextI18n")
  //    public void setSignInListener() {
  //        Button signIn = findViewById(R.id.login);
  //        signIn.setOnClickListener((v) -> {
  //            TextView prompt_text = findViewById(R.id.login_title);
  //            EditText username = findViewById(R.id.username);
  //            EditText password = findViewById(R.id.password);
  //
  //            try{
  //                usermanager.authenticate(username.getText().toString(),
  // password.getText().toString());
  //            }
  //            catch (AuthenticatorException e){
  //                password.setError("Password is incorrect.");
  //                return;
  //            }
  //            catch (AccountsException e) {
  //                username.setError("Username is not found.");
  //                return;
  //            }
  //            prompt_text.setText("Sign In Successfully!");
  //            Intent tmp = new Intent(this, MainMenuActivity.class);
  //            startActivity(tmp);
  //        });
  //    }

  /** Activate the signUp button. */
  public void setRegisterListener() {
    Button register = findViewById(R.id.register);
    register.setOnClickListener(
        (v) -> {
          Intent tmp = new Intent(this, RegisterActivity.class);
          startActivity(tmp);
        });
  }
}
