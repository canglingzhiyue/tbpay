package com.vivo.push.sdk;

import android.content.Context;
import com.alibaba.android.split.core.splitcompat.j;
import com.vivo.push.sdk.service.LinkProxyActivity;

/* loaded from: classes9.dex */
public class LinkProxyClientActivity extends LinkProxyActivity {
    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        j.b(context);
    }
}
