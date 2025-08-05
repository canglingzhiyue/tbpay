package tb;

import android.taobao.windvane.export.adapter.ILocalizationService;
import android.taobao.windvane.jsbridge.WVH5PP;
import android.taobao.windvane.jsbridge.e;
import android.taobao.windvane.jsbridge.q;
import com.android.alibaba.ip.runtime.IpChange;
import tb.qgn;

/* loaded from: classes2.dex */
public class qgp {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static boolean f32919a;

    static {
        kge.a(414023791);
        f32919a = false;
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
        } else if (f32919a) {
        } else {
            synchronized (qgp.class) {
                if (f32919a) {
                    return;
                }
                b();
                f32919a = true;
            }
        }
    }

    private static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[0]);
            return;
        }
        f32919a = true;
        qgn.a(new qgn.b().a(oxu.class, new mwm()).a(oxv.class, new mwn()).a(qfu.class, new mws()).a(qfx.class, new mwt()).a(qfy.class, new mxt()).a(ILocalizationService.class, new fhx()).a());
        c();
    }

    private static void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[0]);
        } else {
            q.a("WVPerformance", (Class<? extends e>) WVH5PP.class);
        }
    }
}
