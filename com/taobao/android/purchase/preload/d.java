package com.taobao.android.purchase.preload;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import tb.arc;
import tb.ard;
import tb.bbh;
import tb.ijt;
import tb.kge;

/* loaded from: classes6.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-2119573481);
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
        } else {
            ijt.a().e();
        }
    }

    public static void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{context});
            return;
        }
        arc.a().a("预加载布局文件", arc.a.a().a("AURA/performance").b());
        ijt.a().a(context.getApplicationContext());
        ijt.a().a(R.layout.activity_purchase_v2);
        bbh.a(new Runnable() { // from class: com.taobao.android.purchase.preload.d.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                long currentTimeMillis = System.currentTimeMillis();
                ijt.a().b();
                ard a2 = arc.a();
                a2.a("预加载布局文件完成，耗时 = " + (System.currentTimeMillis() - currentTimeMillis), arc.a.a().a("AURA/performance").b());
            }
        });
    }
}
