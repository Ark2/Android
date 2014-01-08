package com.ark.abeer;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {
	long counterA , counterB ;
	Button add , sub , mul , div , equall , clear , decimal , back , B1 , B2 ,B3 , B4 , B5 ,B6 , B7 ,B8 ,B9 , B0 ;
	TextView display ;
	boolean operator ;
	String expression[] = new String[200];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        //Setting counter variable to 0
        
        //setting up buttons 
        add = (Button)findViewById(R.id.Badd);
        sub = (Button)findViewById(R.id.Bsub);
        mul = (Button)findViewById(R.id.Bmul);
        div = (Button)findViewById(R.id.Bdiv);
        equall = (Button)findViewById(R.id.Beql);
        clear = (Button)findViewById(R.id.Bclr);
        decimal = (Button)findViewById(R.id.Bdec);
        //back = (Button)findViewById(R.id.B_Back);
        B0 = (Button)findViewById(R.id.Bnum0);
        B1 = (Button)findViewById(R.id.Bnum1);
        B2 = (Button)findViewById(R.id.Bnum2);
        B3 = (Button)findViewById(R.id.Bnum3);
        B4 = (Button)findViewById(R.id.Bnum4);
        B5 = (Button)findViewById(R.id.Bnum5);
        B6 = (Button)findViewById(R.id.Bnum6);
        B7 = (Button)findViewById(R.id.Bnum7);
        B8 = (Button)findViewById(R.id.Bnum8);
        B9 = (Button)findViewById(R.id.Bnum9);
        display = (TextView) findViewById(R.id.Screen);
        
        
        
        
        // Buttons On Click Listner
        add.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
			}
		});
       
        sub.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				
			}
		});

div.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
			}
		});

mul.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
	}
});

equall.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
	}
});
B0.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
	}
});
B1.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
	}
});
  
B2.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
	}
});

B3.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
	}
});

B4.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
	}
});

B5.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
	}
});

B6.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
	}
});

B7.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
	}
});

B8.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
	}
});

B9.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
	}
});

decimal.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
	}
});

return true;
    }
    


}
