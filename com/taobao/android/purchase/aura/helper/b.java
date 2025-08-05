package com.taobao.android.purchase.aura.helper;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.purchase.aura.utils.e;
import com.taobao.runtimepermission.d;
import com.taobao.runtimepermission.f;
import tb.arc;
import tb.ard;
import tb.bbh;
import tb.kge;

/* loaded from: classes6.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static volatile Boolean f14741a;

    static {
        kge.a(2120637616);
    }

    public static /* synthetic */ Boolean a(Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("42f93c22", new Object[]{bool});
        }
        f14741a = bool;
        return bool;
    }

    public static boolean a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e1d6464", new Object[]{context})).booleanValue();
        }
        if ("true".equals(e.a("enablePermissionRequest", "true"))) {
            if (f14741a != null) {
                b(context);
                return f14741a.booleanValue();
            }
            d a2 = f.a(context, "TB_SHOPPING_PROCESS", new String[]{com.taobao.tao.homepage.a.ACCESS_FINE_LOCATION});
            if (a2 != null && a2.b != null && a2.b.length > 0 && a2.b[0] == 0) {
                return true;
            }
            ard a3 = arc.a();
            a3.b("PermissionRequestcheckBizPermissionDemo: denied with msg " + a2.c[0]);
        }
        return false;
    }

    public static void b(final Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9eca0fff", new Object[]{context});
        } else {
            bbh.a(new Runnable() { // from class: com.taobao.android.purchase.aura.helper.b.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    d a2 = f.a(context, "TB_SHOPPING_PROCESS", new String[]{com.taobao.tao.homepage.a.ACCESS_FINE_LOCATION});
                    if (a2 != null && a2.b != null && a2.b.length > 0 && a2.b[0] == 0) {
                        b.a((Boolean) true);
                        return;
                    }
                    ard a3 = arc.a();
                    a3.b("PermissionRequestcheckBizPermissionDemo: denied with msg " + a2.c[0]);
                    b.a((Boolean) false);
                }
            });
        }
    }
}
