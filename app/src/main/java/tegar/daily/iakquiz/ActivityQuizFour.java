package tegar.daily.iakquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class ActivityQuizFour extends AppCompatActivity {

    String jawabQuizOne;
    String jawabQuizTwo;
    String jawabQuizThree;
    String jawabQuizFour;

    RadioButton rb_a;
    RadioButton rb_b;
    RadioButton rb_c;
    RadioButton rb_d;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_four);
        //inisialisasi komponen view di kelas .java
        rb_a = (RadioButton) findViewById(R.id.rb_a);
        rb_b = (RadioButton) findViewById(R.id.rb_b);
        rb_c = (RadioButton) findViewById(R.id.rb_c);
        rb_d = (RadioButton) findViewById(R.id.rb_d);

        jawabQuizOne = getIntent().getStringExtra("jawabQuizOne");
        jawabQuizTwo = getIntent().getStringExtra("jawabQuizTwo");
        jawabQuizThree = getIntent().getStringExtra("jawabQuizThree");
    }

    public void radioOnclick(View view) {
        switch (view.getId()) {
            case R.id.rb_a:
                //Aksi ketika RadioButton dengan id rb_a di klik
                jawabQuizFour = rb_a.getText().toString();
                break;
            case R.id.rb_b:
                //Aksi ketika RadioButton dengan id rb_b di klik
                jawabQuizFour = rb_b.getText().toString();
                break;
            case R.id.rb_c:
                //Aksi ketika RadioButton dengan id rb_c di klik
                jawabQuizFour = rb_c.getText().toString();
                break;
            case R.id.rb_d:
                //Aksi ketika RadioButton dengan id rb_d di klik
                jawabQuizFour = rb_d.getText().toString();
                break;
        }
    }

    public void buttonOnclick(View view) {
        //Deklarasi untuk pindah activity
        Intent intent = new Intent(ActivityQuizFour.this, ActivityQuizFive.class);
        //penyisipan pesan nilai vaiabel String
        intent.putExtra("jawabQuizOne", jawabQuizOne);
        intent.putExtra("jawabQuizTwo", jawabQuizTwo);
        intent.putExtra("jawabQuizThree", jawabQuizThree);
        intent.putExtra("jawabQuizFour", jawabQuizFour);
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