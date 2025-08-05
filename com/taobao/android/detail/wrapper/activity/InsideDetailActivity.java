package com.taobao.android.detail.wrapper.activity;

import com.android.tools.ir.runtime.ApplicationInvoker;
import com.taobao.android.launcher.bootstrap.tao.f;
import com.taobao.tao.TaobaoApplication;
import tb.kge;

/* loaded from: classes5.dex */
public class InsideDetailActivity extends DetailActivity {
    static {
        kge.a(-889810091);
    }

    public InsideDetailActivity() {
        f.a("com.taobao.android.detail", "com.taobao.android.detail.wrapper.activity.InsideDetailActivity");
        ApplicationInvoker.getInstance("com.taobao.android.detail").invoke("com.taobao.android.detail.DetailApplication", TaobaoApplication.sApplication);
    }
}
