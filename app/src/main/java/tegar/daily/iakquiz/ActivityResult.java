package tegar.daily.iakquiz;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class ActivityResult extends AppCompatActivity {

    String jawabQuizOne;
    String jawabQuizTwo;
    String jawabQuizThree;
    String jawabQuizFour;
    String jawabQuizFive;

    String jawabBenarQuizOne = "TextView";
    String jawabBenarQuizTwo= "android:textColor";
    String jawabBenarQuizThree = "ImageView";
    String jawabBenarQuizFour = "android:src";
    String jawabBenarQuizFive = "Button";

    int score;

    TextView tv_jawabQuizOne;
    TextView tv_jawabQuizTwo;
    TextView tv_jawabQuizThree;
    TextView tv_jawabQuizFour;
    TextView tv_jawabQuizFive;
    TextView tv_score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        tv_jawabQuizOne = (TextView) findViewById(R.id.tv_jawabQuizOne);
        tv_jawabQuizTwo = (TextView) findViewById(R.id.tv_jawabQuizTwo);
        tv_jawabQuizThree = (TextView) findViewById(R.id.tv_jawabQuizThree);
        tv_jawabQuizFour = (TextView) findViewById(R.id.tv_jawabQuizFour);
        tv_jawabQuizFive = (TextView) findViewById(R.id.tv_jawabQuizFive);
        tv_score = (TextView) findViewById(R.id.tv_score);

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

    public void onButtonClick(View view){
        score = 0;

        if (jawabQuizOne.equals(jawabBenarQuizOne)){
            score += 1;
        }
        if (jawabQuizTwo.equals(jawabBenarQuizTwo)){
            score += 1;
        }
        if (jawabQuizThree.equals(jawabBenarQuizThree)){
            score += 1;
        }
        if (jawabQuizFour.equals(jawabBenarQuizFour)){
            score += 1;
        }
        if (jawabQuizFive.equals(jawabBenarQuizFive)){
            score += 1;
        }

        tv_score.setText(String.valueOf(score));
    }

    /**
     * Take care of popping the fragment back stack or finishing the activity
     * as appropriate.
     */
    @Override
    public void onBackPressed() {

    }
}
