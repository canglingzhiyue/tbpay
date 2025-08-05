package com.sina.weibo.sdk.share;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import tb.kge;

/* loaded from: classes4.dex */
public class ShareResultActivity extends Activity {
    static {
        kge.a(-765670009);
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        Intent intent;
        String str;
        super.onCreate(bundle);
        try {
            intent = getIntent();
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (intent == null) {
            finish();
        } else if (intent.getIntExtra("start_flag", -1) != 1002) {
            finish();
        } else {
            String action = intent.getAction();
            if (!"com.sina.weibo.sdk.action.ACTION_SDK_REQ_ACTIVITY".equals(action)) {
                if ("com.sina.weibo.sdk.action.ACTION_SDK_REQ_STORY".equals(action)) {
                    str = "com.sina.weibo.sdk.share.ShareStoryActivity";
                }
                startActivity(intent);
                finish();
            }
            str = "com.sina.weibo.sdk.share.ShareTransActivity";
            intent.setClassName(this, str);
            startActivity(intent);
            finish();
        }
    }
}
