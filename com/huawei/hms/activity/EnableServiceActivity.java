package com.huawei.hms.activity;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.alibaba.android.split.core.splitcompat.j;
import com.huawei.hms.utils.ResourceLoaderUtil;

/* loaded from: classes4.dex */
public class EnableServiceActivity extends Activity {
    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        j.b(context);
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        setContentView(ResourceLoaderUtil.getLayoutId("activity_endisable_service"));
    }
}
