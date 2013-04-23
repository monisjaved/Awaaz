package gov.awaaz;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class Main extends Activity {

 
	public void onBackPressed() {
        Log.d("CDA", "onBackPressed Called");
        Intent intent = new Intent(this,Main.class);
     //   setIntent.addCategory(Intent.CATEGORY_HOME);
    //    setIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent); 

        return;
    }   
	public void onCreate(Bundle icicle)
	   {
	      super.onCreate(icicle);
	      setContentView(R.layout.main);
	   /*  Button button8 = (Button)findViewById(R.id.button8);
	      button8.setOnClickListener(new View.OnClickListener() {
	         public void onClick(View arg0) {
	         Intent i = new Intent(Main.this, login.class);
	         startActivity(i);
	         }
	      });*/
	      
	      
	        Button button1 = (Button) findViewById(R.id.button1);
	        Button button2 = (Button) findViewById(R.id.button2);
	        Button button3 = (Button) findViewById(R.id.button3);
	        Button button4 = (Button) findViewById(R.id.button4);
	        Button button5 = (Button) findViewById(R.id.button5);
	        Button button6 = (Button) findViewById(R.id.button6);
	        Button button7 = (Button) findViewById(R.id.button7);
	        Button button8 = (Button) findViewById(R.id.button8);
	        Button button9 = (Button) findViewById(R.id.button9);
	        
	       

	      
	        button1.setOnClickListener
	        (new Button.OnClickListener()
	            {
	             public void onClick(View v)
	                {
	            	setContentView(R.layout.agriculture);   
	            	// Intent intent1 = new Intent(Main.this, agriculture.class);
	                //    startActivity(intent1);

	                }
	            }
	        );
	        

	    
	        button2.setOnClickListener
	        (new Button.OnClickListener()
	            {
	            public void onClick(View v)
	                {
	            	setContentView(R.layout.education);   
	            	// Intent intent2 = new Intent(Main.this, education.class);
	                //    startActivity(intent2);

	                }
	            }
	        );
	        
	        
	        button3.setOnClickListener
	        (new Button.OnClickListener()
	            {
	             public void onClick(View v)
	                {
	            	setContentView(R.layout.energy);   
	                }
	            }
	        );
	        
	        button4.setOnClickListener
	        (new Button.OnClickListener()
	            {
	             public void onClick(View v)
	                {
	            	setContentView(R.layout.health);   
	            	}
	            }
	        );
	        
	        button5.setOnClickListener
	        (new Button.OnClickListener()
	            {
	             public void onClick(View v)
	                {
	            	setContentView(R.layout.macro);   
	            	}
	            }
	        );
	        
	        button6.setOnClickListener
	        (new Button.OnClickListener()
	            {
	             public void onClick(View v)
	                {
	            	setContentView(R.layout.urban);   
	            	}
	            }
	        );
	        
	        button7.setOnClickListener
	        (new Button.OnClickListener()
	            {
	             public void onClick(View v)
	                {
	            	setContentView(R.layout.water);   
	            	}
	            }
	        );
	        
	        button8.setOnClickListener
	        (new Button.OnClickListener()
	            {
	             public void onClick(View v)
	                {
	            	setContentView(R.layout.login);   
	            	}
	            }
	        );
	        
	        button9.setOnClickListener
	        (new Button.OnClickListener()
	            {
	             public void onClick(View v)
	                {
	            	setContentView(R.layout.recent);   
	            	}
	            }
	        );
	        
	        
	        
	        }
	        
}
