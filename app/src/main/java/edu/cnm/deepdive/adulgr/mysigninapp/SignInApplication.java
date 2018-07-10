package edu.cnm.deepdive.adulgr.mysigninapp;

import android.app.Application;
import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;

public class SignInApplication extends Application {

  private GoogleSignInClient signInClient;
  private GoogleSignInAccount signInAccount;

  @Override
  public void onCreate() {
    super.onCreate();
    GoogleSignInOptions options = new GoogleSignInOptions.Builder()
        .requestEmail()
        .requestId()
        .requestIdToken("439888938388-do7i5th4gb0q2cu7dgfh00klnhee88vu.apps.googleusercontent.com")
        .build();
    signInClient = GoogleSignIn.getClient(this, options);
  }

  public GoogleSignInClient getSignInClient() {
    return signInClient;
  }

  public void setSignInClient(GoogleSignInClient signInClient) {
    this.signInClient = signInClient;
  }

  public GoogleSignInAccount getSignInAccount() {
    return signInAccount;
  }

  public void setSignInAccount(GoogleSignInAccount signInAccount) {
    this.signInAccount = signInAccount;
  }
}
