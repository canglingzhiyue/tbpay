package com.taobao.android.detail.ttdetail.performance;

import android.content.Context;
import android.content.MutableContextWrapper;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.utils.bh;
import com.taobao.taobao.R;
import tb.kge;

/* loaded from: classes5.dex */
public class e extends MutableContextWrapper {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(335717976);
    }

    public e(Context context) {
        super(context.getApplicationContext());
        if (!bh.a(context.getApplicationContext())) {
            context.getApplicationContext().setTheme(R.style.Theme_AppCompat_Wrapper);
        }
    }

    public void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
        } else {
            setBaseContext(context);
        }
    }
}
