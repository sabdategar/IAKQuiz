package tegar.daily.iakquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ActivityResult extends AppCompatActivity {

    String jawabQuizOne;
    String jawabQuizTwo;
    String jawabQuizThree;
    String jawabQuizFour;
    String jawabQuizFive;

    TextView tv_jawabQuizOne;
    TextView tv_jawabQuizTwo;
    TextView tv_jawabQuizThree;
    TextView tv_jawabQuizFour;
    TextView tv_jawabQuizFive;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        tv_jawabQuizOne = (TextView) findViewById(R.id.tv_jawabQuizOne);
        tv_jawabQuizTwo = (TextView) findViewById(R.id.tv_jawabQuizTwo);
        tv_jawabQuizThree = (TextView) findViewById(R.id.tv_jawabQuizThree);
        tv_jawabQuizFour = (TextView) findViewById(R.id.tv_jawabQuizFour);
        tv_jawabQuizFive = (TextView) findViewById(R.id.tv_jawabQuizFive);

        jawabQuizOne = getIntent().getStringExtra("jawabQuizOne");
        jawabQuizTwo = getIntent().getStringExtra("jawabQuizTwo");
        jawabQuizThree = getIntent().getStringExtra("jawabQuizThree");
        jawabQuizFour = getIntent().getStringExtra("jawabQuizFour");
        jawabQuizFive = getIntent().getStringExtra("jawabQuizFive");

        tv_jawabQuizOne.setText(jawabQuizOne);
        tv_jawabQuizTwo.setText(jawabQuizTwo);
        tv_jawabQuizThree.setText(jawabQuizThree);
        tv_jawabQuizFour.setText(jawabQuizFour);
        tv_jawabQuizFive.setText(jawabQuizFive);
    }

    /**
     * Take care of popping the fragment back stack or finishing the activity
     * as appropriate.
     */
    @Override
    public void onBackPressed() {

    }
}
