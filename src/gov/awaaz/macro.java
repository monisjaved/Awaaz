package gov.awaaz;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class macro extends Activity
{
   public void onCreate(Bundle icicle)
   {
      super.onCreate(icicle);
      setContentView(R.layout.macro);
      Button button5 = (Button) findViewById(R.id.button5);
      button5.setOnClickListener(new View.OnClickListener() {
         public void onClick(View arg0) {
         setResult(RESULT_OK);
         finish();
         }
      });
   }
}