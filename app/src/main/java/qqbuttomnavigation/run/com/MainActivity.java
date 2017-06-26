package qqbuttomnavigation.run.com;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.run.qqbuttomnavigation.QQNavigation;

public class MainActivity extends AppCompatActivity {


    private QQNavigation mBubbleView;
    private QQNavigation mPersonView;
    private QQNavigation mStarView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mBubbleView = (QQNavigation) findViewById(R.id.qq_view_bubble);
        mPersonView = (QQNavigation) findViewById(R.id.qq_view_person);
        mStarView = (QQNavigation) findViewById(R.id.qq_view_star);
        mBubbleView.setBigIcon(R.drawable.bubble_big);
        mBubbleView.setSmallIcon(R.drawable.bubble_small);
    }

    public void onClick(View view){
        resetIcon();
        switch (view.getId()){
            case R.id.qq_view_bubble:
                mBubbleView.setBigIcon(R.drawable.bubble_big);
                mBubbleView.setSmallIcon(R.drawable.bubble_small);
                break;
            case R.id.qq_view_person:
                mPersonView.setBigIcon(R.drawable.person_big);
                mPersonView.setSmallIcon(R.drawable.person_small);
                break;
            case R.id.qq_view_star:
                mStarView.setBigIcon(R.drawable.star_big);
                mStarView.setSmallIcon(R.drawable.star_small);
                break;
        }
    }

    private void resetIcon() {
        mBubbleView.setBigIcon(R.drawable.pre_bubble_big);
        mBubbleView.setSmallIcon(R.drawable.pre_bubble_small);

        mPersonView.setBigIcon(R.drawable.pre_person_big);
        mPersonView.setSmallIcon(R.drawable.pre_person_small);

        mStarView.setBigIcon(R.drawable.pre_star_big);
        mStarView.setSmallIcon(R.drawable.pre_star_small);
    }


}
