package com.example.gaokang.bugtagstest;

import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;

import com.bugtags.library.Bugtags;

/**
 * 项目名称：BugTagsTest
 * 类描述：
 * 创建人：gaokang
 * 创建时间：2016/3/23 12:04
 * 修改人：gaokang
 * 修改时间：2016/3/23 12:04
 * 修改备注：
 */
public class BaseActivity extends AppCompatActivity {
    @Override
    protected void onResume() {
        super.onResume();
        //callback 1
        Bugtags.onResume(this);
    }

    @Override
    protected void onPause() {
        super.onPause();
        //callback 2
        Bugtags.onPause(this);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent event) {
        //callback 3
        Bugtags.onDispatchTouchEvent(this, event);
        return super.dispatchTouchEvent(event);
    }
}
