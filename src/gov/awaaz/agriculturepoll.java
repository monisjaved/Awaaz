package gov.awaaz;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class agriculturepoll extends Activity
{
   public void onCreate(Bundle icicle)
   {
      super.onCreate(icicle);
      setContentView(R.layout.energy);
      Button b1 = (Button) findViewById(R.id.b1);
      b1.setOnClickListener(new View.OnClickListener() {
         public void onClick(View arg0) {
         setResult(RESULT_OK);
         finish();
         }
      });
   }
}