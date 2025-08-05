package com.alibaba.android.ultron.vfw.widget;

import android.app.Activity;
import android.content.Context;
import android.widget.Toast;
import com.alibaba.android.ultron.engine.utils.h;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.uikit.extend.component.unify.Toast.TBToast;
import tb.bpd;
import tb.kge;

/* loaded from: classes2.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1781635099);
    }

    public static void a(final Context context, final CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95562904", new Object[]{context, charSequence});
            return;
        }
        final boolean b = bpd.b();
        h.a(new Runnable() { // from class: com.alibaba.android.ultron.vfw.widget.a.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                if (!b) {
                    Context context2 = context;
                    if (context2 instanceof Activity) {
                        try {
                            TBToast.makeText((Activity) context2, charSequence, 3000L).show();
                            return;
                        } catch (Throwable unused) {
                            Toast.makeText(context, charSequence, 0).show();
                            return;
                        }
                    }
                }
                Toast.makeText(context, charSequence, 0).show();
            }
        });
    }
}
