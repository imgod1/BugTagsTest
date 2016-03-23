package com.example.gaokang.bugtagstest;

import android.app.Application;

import com.bugtags.library.Bugtags;
import com.bugtags.library.BugtagsOptions;

/**
 * 项目名称：BugTagsTest
 * 类描述：
 * 创建人：gaokang
 * 创建时间：2016/3/23 12:06
 * 修改人：gaokang
 * 修改时间：2016/3/23 12:06
 * 修改备注：
 */
public class MyApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        initSdk();
    }

    private void initSdk() {
        BugtagsOptions.Builder builder = new BugtagsOptions.Builder();
        builder.trackingCrashLog(true);
        builder.trackingConsoleLog(true);
//      Bugtags.BTGInvocationEventBubble,在app中显示圆形小球
//      Bugtags.BTGInvocationEventNone,在app中不显示圆形小球
//      Bugtags.BTGInvocationEventShake,通过摇一摇让圆形小球显示出来
//      Bugtags.start("2d2314cb6ead8eea5647644da412fd5d", this, Bugtags.BTGInvocationEventNone);//这样在联机debug中不会上报异常
        Bugtags.start("2d2314cb6ead8eea5647644da412fd5d", this, Bugtags.BTGInvocationEventNone, builder.build());//联机debug中上报异常
    }
}
