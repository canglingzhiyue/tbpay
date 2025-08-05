package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.phenix.intf.b;
import com.taobao.phenix.request.ImageStatistics;
import com.taobao.phenix.request.a;
import com.taobao.phenix.request.c;

/* loaded from: classes.dex */
public class nhx {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static String f31473a;
    public static String b;
    public static String c;
    public static String d;
    public static String e;
    public static String f;
    public static String g;

    static {
        kge.a(-625221992);
        f31473a = "bizReqStart";
        b = "bizReqProcessStart";
        c = "bizRspProcessStart";
        d = "bizRspCbDispatch";
        e = "bizRspCbStart";
        f = "bizRspCbEnd";
        g = "bizFinish";
    }

    public static void a(ImageStatistics imageStatistics) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef635127", new Object[]{imageStatistics});
            return;
        }
        imageStatistics.a(System.currentTimeMillis());
        String str = f31473a;
        a(imageStatistics, str, "url=" + g(imageStatistics));
    }

    public static void b(ImageStatistics imageStatistics) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("292df306", new Object[]{imageStatistics});
            return;
        }
        imageStatistics.c = System.currentTimeMillis();
        b(imageStatistics, b);
    }

    public static void c(ImageStatistics imageStatistics) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62f894e5", new Object[]{imageStatistics});
            return;
        }
        imageStatistics.d = System.currentTimeMillis();
        b(imageStatistics, c);
    }

    public static void d(ImageStatistics imageStatistics) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cc336c4", new Object[]{imageStatistics});
            return;
        }
        imageStatistics.f = System.currentTimeMillis();
        b(imageStatistics, e);
    }

    public static void e(ImageStatistics imageStatistics) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d68dd8a3", new Object[]{imageStatistics});
            return;
        }
        imageStatistics.e = System.currentTimeMillis();
        b(imageStatistics, d);
    }

    public static void f(ImageStatistics imageStatistics) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10587a82", new Object[]{imageStatistics});
            return;
        }
        imageStatistics.g = System.currentTimeMillis();
        b(imageStatistics, f);
    }

    public static void a(ImageStatistics imageStatistics, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd4b1f31", new Object[]{imageStatistics, str});
        } else {
            a(imageStatistics, g, str);
        }
    }

    public static void b(ImageStatistics imageStatistics, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("277aa750", new Object[]{imageStatistics, str});
        } else {
            a(imageStatistics, str, "");
        }
    }

    public static void a(ImageStatistics imageStatistics, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2c33ebb", new Object[]{imageStatistics, str, str2});
            return;
        }
        a m = b.h().m();
        if (m == null) {
            return;
        }
        m.a(imageStatistics, str, str2);
    }

    private static String g(ImageStatistics imageStatistics) {
        c p;
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9979065f", new Object[]{imageStatistics}) : (imageStatistics == null || (p = imageStatistics.p()) == null) ? "" : p.g();
    }
}
