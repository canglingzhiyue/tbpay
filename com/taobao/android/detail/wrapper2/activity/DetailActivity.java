package com.taobao.android.detail.wrapper2.activity;

import android.app.Activity;
import com.android.tools.ir.runtime.ApplicationInvoker;
import com.taobao.android.launcher.bootstrap.tao.f;
import com.taobao.tao.TaobaoApplication;

/* loaded from: classes5.dex */
public class DetailActivity extends Activity {
    public DetailActivity() {
        f.a("com.taobao.android.detail", "com.taobao.android.detail.wrapper2.activity.DetailActivity");
        ApplicationInvoker.getInstance("com.taobao.android.detail").invoke("com.taobao.android.detail.DetailApplication", TaobaoApplication.sApplication);
    }
}
