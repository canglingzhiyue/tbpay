package com.huawei.hms.support.api.push;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.alibaba.android.split.core.splitcompat.j;
import com.huawei.hms.push.r;
import com.taobao.taobao.R;

/* loaded from: classes4.dex */
public class TransActivity extends Activity {
    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        j.b(context);
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.hwpush_trans_activity);
        getWindow().addFlags(67108864);
        r.a(this, getIntent());
        finish();
    }
}
