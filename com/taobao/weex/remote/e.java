package com.taobao.weex.remote;

import android.content.Context;
import android.os.SystemClock;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.remoteso.component.Remo;
import com.taobao.android.remoteso.component.k;
import com.taobao.android.remoteso.component.l;
import com.taobao.tao.Globals;
import com.taobao.tao.log.TLog;
import com.taobao.weex.utils.Switch;
import tb.kge;

/* loaded from: classes9.dex */
public class e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* loaded from: classes9.dex */
    public interface a {
        void onError(String str);

        void onSuccess();
    }

    static {
        kge.a(-1333770646);
    }

    public static boolean a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e1d6464", new Object[]{context})).booleanValue();
        }
        if (Switch.isSwitchOn(".disableWeexRemote").booleanValue()) {
            return false;
        }
        if (context == null) {
            context = Globals.getApplication();
        }
        l a2 = Remo.a(k.a().a(context).a("flexa", "taobao_weex_adapter").a());
        boolean e = a2.e();
        TLog.loge("Weex", "TBWXRemoteManager", " remote install result : " + a2);
        return e;
    }

    public static String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[0]) : Remo.a("taobao_weex_adapter");
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue() : "remote".equals(a());
    }

    public static void a(String str, final String str2, Context context, boolean z, final a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("977de963", new Object[]{str, str2, context, new Boolean(z), aVar});
        } else if (Switch.isSwitchOn(".disableWeexRemote").booleanValue()) {
            aVar.onError("disableWeexRemote");
        } else {
            final boolean z2 = !"init".equals(str);
            if (z2) {
                com.taobao.appbundle.remote.a.b("taobao_weex_adapter", str2);
            }
            if (a(context)) {
                TLog.loge("Weex", "TBWXRemoteManager", " remote has installed:");
                aVar.onSuccess();
                return;
            }
            if (z2) {
                com.taobao.appbundle.remote.a.a("taobao_weex_adapter", str2);
            }
            final long uptimeMillis = SystemClock.uptimeMillis();
            Remo.b(k.a().a(context).a("flexa", "taobao_weex_adapter").a(z).a(new com.taobao.android.remoteso.component.d() { // from class: com.taobao.weex.remote.e.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.remoteso.component.d
                public void a(l lVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("fcc8199", new Object[]{this, lVar});
                        return;
                    }
                    long uptimeMillis2 = SystemClock.uptimeMillis() - uptimeMillis;
                    if (lVar.e()) {
                        TLog.loge("Weex", "TBWXRemoteManager", "install  success!");
                        if (z2) {
                            com.taobao.appbundle.remote.a.a("taobao_weex_adapter", str2, uptimeMillis2);
                        }
                        aVar.onSuccess();
                        return;
                    }
                    aVar.onError(lVar.d());
                    if (1003 == lVar.c() && z2) {
                        com.taobao.appbundle.remote.a.c("taobao_weex_adapter", str2);
                    }
                    TLog.loge("Triver", "TBWXRemoteManager", "install failed!");
                }
            }).a());
        }
    }
}
