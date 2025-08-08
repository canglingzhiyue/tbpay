package tb;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.appbundle.c;
import java.util.UUID;
import mtopsdk.mtop.domain.EnvModeEnum;
import mtopsdk.mtop.global.MtopConfig;
import mtopsdk.mtop.intf.Mtop;

/* loaded from: classes6.dex */
public class izk {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static String f29425a;
    private static String b;
    private static String c;
    private static boolean d;
    private static boolean e;
    private static boolean f;

    static {
        kge.a(1422764224);
        d = true;
        e = false;
        f = false;
        try {
            System.loadLibrary("taopai_data_core");
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static void a(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d18de974", new Object[]{context, str, str2});
            return;
        }
        c = str;
        b = str2;
        qbs.a(context);
        izd.a(context);
        d = b(context);
    }

    public static void b(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3bbd7193", new Object[]{context, str, str2});
            return;
        }
        a(context, str, str2);
        f();
        if (pzb.d()) {
            qbw.a().a(context);
        }
        a(context);
        izl.a(str, str2, e);
    }

    public static String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[0]);
        }
        if (StringUtils.isEmpty(f29425a)) {
            f();
        }
        return f29425a;
    }

    public static String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[0]) : StringUtils.isEmpty(b) ? "source_blank" : b;
    }

    public static String c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[0]) : StringUtils.isEmpty(c) ? "source_blank" : c;
    }

    public static boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[0])).booleanValue() : d;
    }

    public static boolean e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[0])).booleanValue() : e;
    }

    private static void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[0]);
        } else {
            f29425a = UUID.randomUUID().toString();
        }
    }

    private static boolean b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9eca1003", new Object[]{context})).booleanValue();
        }
        MtopConfig mtopConfig = Mtop.instance((String) null, context).getMtopConfig();
        return (mtopConfig == null || mtopConfig.envMode == null || mtopConfig.envMode != EnvModeEnum.ONLINE) ? false : true;
    }

    public static boolean a(Context context) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e1d6464", new Object[]{context})).booleanValue();
        }
        if (caj.a().a(context, c.TAOPAI_FEATURE) == 1) {
            z = true;
        }
        e = z;
        return z;
    }
}
