package tb;

import android.content.Context;
import android.os.Build;
import android.os.Trace;
import anet.channel.util.ALog;
import com.alibaba.android.aura.util.AURATraceUtil;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import tb.arc;
import tb.iff;

/* loaded from: classes6.dex */
public class rib {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static boolean f33161a;
    private static boolean b;

    static {
        kge.a(-923523733);
    }

    public static void a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61b6362a", new Object[]{context, str});
            return;
        }
        iff iffVar = new iff(context);
        iffVar.a("温馨提示");
        iffVar.b(str);
        iffVar.a(new iff.b() { // from class: tb.rib.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.iff.b
            public void a(iff iffVar2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("ed8e834f", new Object[]{this, iffVar2});
                } else {
                    iffVar2.b();
                }
            }
        });
        iffVar.a();
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
        } else if (f33161a) {
        } else {
            if (baw.a() || new File("/data/local/tmp/.enableTBBuyTrace").exists()) {
                b();
                c();
                d();
                e();
            }
            f33161a = true;
        }
    }

    private static String b(String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("31bc34ca", new Object[]{strArr});
        }
        if (strArr == null || strArr.length == 0) {
            return "";
        }
        if (strArr.length == 1) {
            return strArr[0];
        }
        StringBuilder sb = new StringBuilder();
        for (String str : strArr) {
            sb.append(str);
        }
        return sb.toString();
    }

    public static void a(String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b26fb7", new Object[]{strArr});
        } else if (!b || Build.VERSION.SDK_INT < 18) {
        } else {
            Trace.beginSection(b(strArr));
            Trace.endSection();
        }
    }

    private static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[0]);
        } else if (!new File("/data/local/tmp/.enablePhenixTrace").exists()) {
        } else {
            niw.a(new qok());
            niw.b(3);
        }
    }

    private static void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[0]);
        } else if (!new File("/data/local/tmp/.enableNetworkTrace").exists()) {
        } else {
            ALog.setUseTlog(false);
            ALog.setPrintLog(true);
            ALog.setLevel(1);
        }
    }

    private static void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[0]);
        } else if (!new File("/data/local/tmp/.enableBuyTrace").exists()) {
        } else {
            b = true;
            AURATraceUtil.a(true);
            arc.a().a("enableBuyTrace", arc.a.a().a("AURA/performance").b());
        }
    }

    private static void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[0]);
        } else if (!new File("/data/local/tmp/.enableMethodTrace").exists()) {
        } else {
            b = true;
            AURATraceUtil.b(true);
            arc.a().a("enableBuyTrace", arc.a.a().a("AURA/performance").b());
        }
    }
}
