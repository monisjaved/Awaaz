package gov.awaaz;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Button;


public class agriculture extends Activity
{
   
	public void onBackPressed() {
        Log.d("CDA", "onBackPressed Called");
        Intent intent = new Intent(this,agriculture.class);
        startActivity(intent); 
	}
	
	public void onCreate(Bundle icicle)
   {
      super.onCreate(icicle);
      setContentView(R.layout.agriculture);
      
      Button button1 = (Button) findViewById(R.id.button1);
      button1.setOnClickListener(new View.OnClickListener() {
         public void onClick(View arg0) {
         setResult(RESULT_OK);
         finish();
         }
      });

      Button b1 = (Button) findViewById(R.id.b1);
      Button b2 = (Button) findViewById(R.id.b2);
      
      b1.setOnClickListener
      (new Button.OnClickListener()
          {
           public void onClick(View v)
              {
        	   	setContentView(R.layout.agriculturepoll);   
              }
          }
      );
      

  
      b2.setOnClickListener
      (new Button.OnClickListener()
          {
          public void onClick(View v)
              {
          			setContentView(R.layout.agriculturepost);   
          	
              }
          }
      );
      
   }
}