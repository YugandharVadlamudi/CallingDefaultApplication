package com.example.kiran.callingdefaultapplication;

import android.content.ComponentName;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
Button button1,button2,button3,button4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1=(Button)findViewById(R.id.button);
        button2=(Button)findViewById(R.id.button2);
        button3=(Button)findViewById(R.id.button3);
        button4=(Button)findViewById(R.id.button4);
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        Intent intent;
        switch(v.getId())
        {
            case R.id.button1:
                intent = new Intent(Intent.ACTION_VIEW);
                startActivity(intent);
                break;
            case R.id.button2:
                intent=new Intent(Intent.ACTION_DIAL);
                startActivity(intent);
                break;
            case R.id.button3:
                intent=new Intent(Intent.ACTION_PICK);
                startActivity(intent);
                break;
            case R.id.button4:
                intent=new Intent();
                /*
                * setComponent which is usefull for set the components like Activity,Service,BroadCastReceiver,ContentProvider
                * to the intent which is usefull to handle the intent explicitly
                *
                * */
                /**
                 * Component Create a new component identifier.
                 *Componentname("package name","excat class name in that package");
                 * @param pkg The name of the package that the component exists in.  Can
                 * not be null.
                 * @param cls The name of the class inside of <var>pkg</var> that
                 * implements the component.  Can not be null.
                 */
                intent.setComponent(new ComponentName("com.example.kiran.dummyapplication","com.example.kiran.dummyapplication.MainActivity"));
                startActivity(intent);
                break;
        }
    }
}
