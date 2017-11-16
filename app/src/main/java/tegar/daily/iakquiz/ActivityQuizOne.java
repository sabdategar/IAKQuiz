package tegar.daily.iakquiz;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RadioButton;

public class ActivityQuizOne extends AppCompatActivity {

    String jawabQuizOne;

    RadioButton rb_a;
    RadioButton rb_b;
    RadioButton rb_c;
    RadioButton rb_d;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_one);
        //inisialisasi komponen view di kelas .java
        rb_a = (RadioButton) findViewById(R.id.rb_a);
        rb_b = (RadioButton) findViewById(R.id.rb_b);
        rb_c = (RadioButton) findViewById(R.id.rb_c);
        rb_d = (RadioButton) findViewById(R.id.rb_d);
    }

    public void radioOnclick(View view){
        switch (view.getId()){
            case R.id.rb_a:
                //Aksi ketika RadioButton dengan id rb_a di klik
                jawabQuizOne = rb_a.getText().toString();
                break;
            case R.id.rb_b:
                //Aksi ketika RadioButton dengan id rb_b di klik
                jawabQuizOne = rb_b.getText().toString();
                break;
            case R.id.rb_c:
                //Aksi ketika RadioButton dengan id rb_c di klik
                jawabQuizOne = rb_c.getText().toString();
                break;
            case R.id.rb_d:
                //Aksi ketika RadioButton dengan id rb_d di klik
                jawabQuizOne = rb_d.getText().toString();
                break;
        }
    }

    public void buttonOnclick(View view){
        //Deklarasi untuk pindah activity
        Intent intent = new Intent(ActivityQuizOne.this, ActivityQuizTwo.class);
        //penyisipan pesan nilai vaiabel String
        intent.putExtra("jawabQuizOne", jawabQuizOne);
        startActivity(intent);
    }

    /**
     * Take care of popping the fragment back stack or finishing the activity
     * as appropriate.
     */
    @Override
    public void onBackPressed() {

    }
}
