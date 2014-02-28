package info.kpaudel.passwordmanager;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;

public class LoginActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }  
    
    public void buttonLogin_Click(View view){
    	//Read Username and Password
    	String Id=((TextView)this.findViewById(R.id.editTextId)).getText().toString();
    	String password=((TextView)this.findViewById(R.id.editTextPassword)).getText().toString();    	
    	System.out.println("ID="+Id);
    	Intent launchMainScreen=new Intent(this, MainActivity.class);
    	this.startActivity(launchMainScreen);
    }
}
