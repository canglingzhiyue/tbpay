package com.taobao.android.sku.utils;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.widget.Toast;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.uikit.extend.component.unify.Toast.TBToast;
import tb.jpx;
import tb.kge;

/* loaded from: classes6.dex */
public class r {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-800562931);
    }

    public static void a(final Context context, final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61b6362a", new Object[]{context, str});
        } else {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.taobao.android.sku.utils.r.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (!jpx.a(context)) {
                    } else {
                        r.a(context, str, 1);
                    }
                }
            });
        }
    }

    public static void a(Context context, CharSequence charSequence, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("156f6a7f", new Object[]{context, charSequence, new Integer(i)});
            return;
        }
        try {
            TBToast.makeText(context, charSequence, i).show();
        } catch (Throwable unused) {
            Toast.makeText(context, charSequence, i).show();
        }
    }
}
