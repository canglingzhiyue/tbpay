package tb;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.a;
import com.taobao.taolive.room.business.mess.LiveDetailMessinfoResponseData;
import com.taobao.taolive.room.service.c;
import com.taobao.taolive.room.utils.ao;
import com.taobao.taolive.room.utils.k;
import com.taobao.taolive.room.utils.n;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.model.common.FandomInfo;
import com.taobao.taolive.sdk.model.common.FandomPreLiveInfo;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import com.taobao.taolive.sdk.utils.VideoStatus;
import com.taobao.taolive.sdk.utils.b;
import java.util.Map;

/* loaded from: classes8.dex */
public class poy {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static Handler f32792a;

    static {
        kge.a(57147327);
        f32792a = new Handler(Looper.getMainLooper());
    }

    private static boolean aA(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("7a9af7a2", new Object[]{aVar})).booleanValue() : b(aVar, false);
    }

    private static boolean b(a aVar, boolean z) {
        IpChange ipChange = $ipChange;
        boolean z2 = true;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2ea106dc", new Object[]{aVar, new Boolean(z)})).booleanValue();
        }
        if (aB(aVar) == null) {
            z2 = false;
        }
        if (!z2 && !z && b.b()) {
            pmd.a().m().a("DataCenterUtil", Log.getStackTraceString(new Throwable()));
            Handler handler = f32792a;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
                f32792a.post(new Runnable() { // from class: tb.poy.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            ao.a(pmd.a().u().c(), "FrameContext为空，埋点数据异常，请关注");
                        }
                    }
                });
            }
        }
        return z2;
    }

    public static String a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5b9844e3", new Object[]{aVar});
        }
        if (aA(aVar)) {
            return aB(aVar).v();
        }
        return c.D;
    }

    public static void a(a aVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc30e1e7", new Object[]{aVar, str});
            return;
        }
        c.D = str;
        if (!aA(aVar)) {
            return;
        }
        poz.w(str, n.b(aVar));
    }

    public static void a(a aVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb15e917", new Object[]{aVar, new Boolean(z)});
            return;
        }
        c.e = z;
        if (!aA(aVar)) {
            return;
        }
        poz.t(z, n.b(aVar));
    }

    public static boolean b(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9c31b80", new Object[]{aVar})).booleanValue();
        }
        if (aA(aVar)) {
            return poz.C(n.b(aVar));
        }
        return c.e;
    }

    public static String c(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("131b3c65", new Object[]{aVar});
        }
        if (aA(aVar)) {
            return aB(aVar).aq();
        }
        return c.x;
    }

    public static void a(String str, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef33b5d3", new Object[]{str, aVar});
            return;
        }
        c.x = str;
        if (!aA(aVar)) {
            return;
        }
        aB(aVar).a(str);
    }

    private static ppa aB(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ppa) ipChange.ipc$dispatch("5c8bd3e8", new Object[]{aVar});
        }
        if (aVar == null) {
            return null;
        }
        return aVar.D();
    }

    public static void b(String str, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ba1b232", new Object[]{str, aVar});
            return;
        }
        c.S = str;
        if (!aA(aVar)) {
            return;
        }
        aB(aVar).b(str);
    }

    public static void c(String str, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("280fae91", new Object[]{str, aVar});
            return;
        }
        c.R = str;
        if (!aA(aVar)) {
            return;
        }
        aB(aVar).c(str);
    }

    public static Map<String, String> d(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("55736c6f", new Object[]{aVar});
        }
        if (aA(aVar)) {
            return aB(aVar).at();
        }
        return c.R();
    }

    public static boolean e(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dec00ddd", new Object[]{aVar})).booleanValue();
        }
        if (aA(aVar)) {
            return aB(aVar).as();
        }
        return c.ap;
    }

    public static void a(boolean z, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d75da4d9", new Object[]{new Boolean(z), aVar});
            return;
        }
        c.ap = z;
        if (aB(aVar) == null) {
            return;
        }
        aB(aVar).a(z);
    }

    public static Map<String, String> f(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("5235742d", new Object[]{aVar});
        }
        if (aA(aVar)) {
            return aB(aVar).ar();
        }
        return c.R();
    }

    public static void d(String str, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c47daaf0", new Object[]{str, aVar});
            return;
        }
        c.r(str);
        if (!aA(aVar)) {
            return;
        }
        aB(aVar).d(str);
    }

    public static void b(boolean z, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ae8c29a", new Object[]{new Boolean(z), aVar});
            return;
        }
        c.n = z;
        if (!aA(aVar)) {
            return;
        }
        aB(aVar).b(z);
    }

    public static boolean g(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c2135a1b", new Object[]{aVar})).booleanValue();
        }
        if (aA(aVar)) {
            return aB(aVar).au();
        }
        return c.P();
    }

    public static void c(boolean z, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e73e05b", new Object[]{new Boolean(z), aVar});
            return;
        }
        c.c(z);
        if (!aA(aVar)) {
            return;
        }
        aB(aVar).c(z);
    }

    public static boolean h(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b3bd003a", new Object[]{aVar})).booleanValue();
        }
        if (aA(aVar)) {
            return aB(aVar).av();
        }
        return c.Q();
    }

    public static void d(boolean z, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1fefe1c", new Object[]{new Boolean(z), aVar});
            return;
        }
        c.d(z);
        if (!aA(aVar)) {
            return;
        }
        aB(aVar).d(z);
    }

    public static boolean i(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a566a659", new Object[]{aVar})).booleanValue();
        }
        if (aA(aVar)) {
            return aB(aVar).am();
        }
        return c.ay;
    }

    public static String j(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("15659eac", new Object[]{aVar});
        }
        if (aA(aVar)) {
            return aB(aVar).an();
        }
        return c.az;
    }

    public static String k(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f1271a6d", new Object[]{aVar});
        }
        if (aA(aVar)) {
            return aB(aVar).ao();
        }
        return c.aA;
    }

    public static String l(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cce8962e", new Object[]{aVar});
        }
        if (aA(aVar)) {
            return aB(aVar).ap();
        }
        return c.aB;
    }

    public static void a(TBLiveDataModel tBLiveDataModel, VideoInfo videoInfo, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1d82879", new Object[]{tBLiveDataModel, videoInfo, aVar});
        } else if (!aA(aVar)) {
        } else {
            aB(aVar).a(tBLiveDataModel, videoInfo);
        }
    }

    public static String m(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a8aa11ef", new Object[]{aVar});
        }
        if (aA(aVar)) {
            return aB(aVar).aj();
        }
        return c.av;
    }

    public static String n(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("846b8db0", new Object[]{aVar});
        }
        if (aA(aVar)) {
            return aB(aVar).i();
        }
        return c.n();
    }

    public static String o(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("602d0971", new Object[]{aVar});
        }
        if (aA(aVar)) {
            return aB(aVar).ax();
        }
        return c.i();
    }

    public static LiveDetailMessinfoResponseData.AlimamaInfo p(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LiveDetailMessinfoResponseData.AlimamaInfo) ipChange.ipc$dispatch("dd513251", new Object[]{aVar});
        }
        if (aA(aVar)) {
            return aB(aVar).ak();
        }
        return c.E();
    }

    public static LiveDetailMessinfoResponseData.AlimamaInfo2 q(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LiveDetailMessinfoResponseData.AlimamaInfo2) ipChange.ipc$dispatch("d5709b52", new Object[]{aVar});
        }
        if (aA(aVar)) {
            return aB(aVar).al();
        }
        return c.F();
    }

    public static boolean b(VideoInfo videoInfo, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7c1d9385", new Object[]{videoInfo, aVar})).booleanValue();
        }
        if (aA(aVar)) {
            return aB(aVar).b(videoInfo);
        }
        return c.a(videoInfo);
    }

    public static boolean s(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("1607238f", new Object[]{aVar})).booleanValue() : c.C();
    }

    public static String t(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aaf47436", new Object[]{aVar});
        }
        if (aA(aVar)) {
            return aB(aVar).az();
        }
        return c.t();
    }

    public static VideoInfo u(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (VideoInfo) ipChange.ipc$dispatch("d1c8f86", new Object[]{aVar});
        }
        if (aA(aVar)) {
            return aB(aVar).aA();
        }
        return c.s();
    }

    public static boolean v(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("eb0415ec", new Object[]{aVar})).booleanValue();
        }
        if (aA(aVar)) {
            return aB(aVar).aB();
        }
        return c.I();
    }

    public static boolean w(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dcadbc0b", new Object[]{aVar})).booleanValue();
        }
        if (aA(aVar)) {
            return aB(aVar).aC();
        }
        return c.G();
    }

    public static String x(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("19fa633a", new Object[]{aVar});
        }
        if (aA(aVar)) {
            return aB(aVar).aD();
        }
        return c.r();
    }

    public static VideoStatus y(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (VideoStatus) ipChange.ipc$dispatch("4c0906fa", new Object[]{aVar});
        }
        if (aA(aVar)) {
            return aB(aVar).aE();
        }
        return c.b();
    }

    public static void a(VideoStatus videoStatus, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("663109f4", new Object[]{videoStatus, aVar});
            return;
        }
        c.a(videoStatus);
        if (!aA(aVar)) {
            return;
        }
        aB(aVar).a(videoStatus);
    }

    public static String z(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d17d5abc", new Object[]{aVar});
        }
        if (aA(aVar)) {
            return aB(aVar).aF();
        }
        return c.e();
    }

    public static void e(String str, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60eba74f", new Object[]{str, aVar});
            return;
        }
        c.d(str);
        if (!aA(aVar)) {
            return;
        }
        aB(aVar).e(str);
    }

    public static void f(String str, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd59a3ae", new Object[]{str, aVar});
            return;
        }
        c.e(str);
        if (!aA(aVar)) {
            return;
        }
        aB(aVar).f(str);
    }

    public static boolean A(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e2e4b181", new Object[]{aVar})).booleanValue();
        }
        if (aA(aVar)) {
            return aB(aVar).aG();
        }
        return c.d;
    }

    public static void f(boolean z, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2915399e", new Object[]{new Boolean(z), aVar});
            return;
        }
        c.d = z;
        if (!aA(aVar)) {
            return;
        }
        aB(aVar).f(z);
    }

    public static int B(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d48e578f", new Object[]{aVar})).intValue();
        }
        if (aA(aVar)) {
            return aB(aVar).aH();
        }
        return c.p();
    }

    public static void a(int i, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8e50a", new Object[]{new Integer(i), aVar});
            return;
        }
        c.a(i);
        if (!aA(aVar)) {
            return;
        }
        aB(aVar).a(i);
    }

    public static String C(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9aebc445", new Object[]{aVar});
        }
        if (aA(aVar)) {
            return aB(aVar).aI();
        }
        return c.c();
    }

    public static void g(String str, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99c7a00d", new Object[]{str, aVar});
            return;
        }
        c.b(str);
        if (!aA(aVar)) {
            return;
        }
        aB(aVar).g(str);
    }

    public static String D(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("76ad4006", new Object[]{aVar});
        }
        if (aA(aVar)) {
            return aB(aVar).aJ();
        }
        return c.a();
    }

    public static void h(String str, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36359c6c", new Object[]{str, aVar});
            return;
        }
        c.a(str);
        if (!aA(aVar)) {
            return;
        }
        aB(aVar).h(str);
    }

    public static String E(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("526ebbc7", new Object[]{aVar});
        }
        if (aA(aVar)) {
            return aB(aVar).aK();
        }
        return c.d();
    }

    public static void i(String str, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2a398cb", new Object[]{str, aVar});
            return;
        }
        c.c(str);
        if (!aA(aVar)) {
            return;
        }
        aB(aVar).i(str);
    }

    public static String F(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2e303788", new Object[]{aVar});
        }
        if (aA(aVar)) {
            return aB(aVar).aL();
        }
        return c.j();
    }

    public static void j(String str, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f11952a", new Object[]{str, aVar});
            return;
        }
        c.h(str);
        if (!aA(aVar)) {
            return;
        }
        aB(aVar).j(str);
    }

    public static FandomPreLiveInfo G(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FandomPreLiveInfo) ipChange.ipc$dispatch("d7cf6d2f", new Object[]{aVar});
        }
        if (aA(aVar)) {
            return aB(aVar).aM();
        }
        return c.v();
    }

    public static FandomInfo H(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FandomInfo) ipChange.ipc$dispatch("e0de499d", new Object[]{aVar});
        }
        if (aA(aVar)) {
            return aB(aVar).aN();
        }
        return c.u();
    }

    public static FandomInfo a(TBLiveDataModel tBLiveDataModel, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FandomInfo) ipChange.ipc$dispatch("f3426af", new Object[]{tBLiveDataModel, aVar});
        }
        if (aA(aVar)) {
            return aB(aVar).a(tBLiveDataModel);
        }
        return c.b(tBLiveDataModel);
    }

    public static int I(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7031e268", new Object[]{aVar})).intValue();
        }
        if (aA(aVar)) {
            return k.a();
        }
        return c.M();
    }

    public static boolean J(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("61db8898", new Object[]{aVar})).booleanValue();
        }
        if (aA(aVar)) {
            return aB(aVar).aO();
        }
        return c.w();
    }

    public static boolean b(TBLiveDataModel tBLiveDataModel, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2cac1d67", new Object[]{tBLiveDataModel, aVar})).booleanValue();
        }
        if (aA(aVar)) {
            return aB(aVar).b(tBLiveDataModel);
        }
        return c.c(tBLiveDataModel);
    }

    public static String K(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("78f7a24d", new Object[]{aVar});
        }
        if (aA(aVar)) {
            return aB(aVar).e();
        }
        return c.y();
    }

    public static String L(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("54b91e0e", new Object[]{aVar});
        }
        if (aA(aVar)) {
            return aB(aVar).f();
        }
        return c.B();
    }

    public static String M(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("307a99cf", new Object[]{aVar});
        }
        if (aA(aVar)) {
            return aB(aVar).h();
        }
        return c.f21681a;
    }

    public static String r(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f3717cb4", new Object[]{aVar});
        }
        if (aA(aVar)) {
            return aB(aVar).ay();
        }
        return c.b;
    }

    public static String N(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c3c1590", new Object[]{aVar});
        }
        if (aA(aVar)) {
            return aB(aVar).j();
        }
        return c.A();
    }

    public static String O(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e7fd9151", new Object[]{aVar});
        }
        if (aA(aVar)) {
            return aB(aVar).k();
        }
        return c.m;
    }

    public static String P(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c3bf0d12", new Object[]{aVar});
        }
        if (aA(aVar)) {
            return aB(aVar).n();
        }
        return c.s;
    }

    public static String Q(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f8088d3", new Object[]{aVar});
        }
        if (aA(aVar)) {
            return aB(aVar).o();
        }
        return c.u;
    }

    public static String R(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7b420494", new Object[]{aVar});
        }
        if (aA(aVar)) {
            return aB(aVar).p();
        }
        return c.v;
    }

    public static String S(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("57038055", new Object[]{aVar});
        }
        if (aA(aVar)) {
            return aB(aVar).q();
        }
        return c.y;
    }

    public static String T(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("32c4fc16", new Object[]{aVar});
        }
        if (aA(aVar)) {
            return aB(aVar).r();
        }
        return c.z;
    }

    public static String U(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e8677d7", new Object[]{aVar});
        }
        if (aA(aVar)) {
            return aB(aVar).s();
        }
        return c.A;
    }

    public static String V(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ea47f398", new Object[]{aVar});
        }
        if (aA(aVar)) {
            return aB(aVar).u();
        }
        return c.C;
    }

    public static int W(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a778f81a", new Object[]{aVar})).intValue();
        }
        if (aA(aVar)) {
            return aB(aVar).w();
        }
        return c.F;
    }

    public static String X(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a1caeb1a", new Object[]{aVar});
        }
        if (aA(aVar)) {
            return aB(aVar).y();
        }
        return c.I;
    }

    public static String Y(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7d8c66db", new Object[]{aVar});
        }
        if (aA(aVar)) {
            return aB(aVar).z();
        }
        return c.J;
    }

    public static void k(String str, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7f9189", new Object[]{str, aVar});
            return;
        }
        c.P = str;
        if (!aA(aVar)) {
            return;
        }
        poz.G(str, n.b(aVar));
    }

    public static String Z(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("594de29c", new Object[]{aVar});
        }
        if (aA(aVar)) {
            return aB(aVar).B();
        }
        return c.Q;
    }

    public static Map<String, String> aa(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("4fdcd933", new Object[]{aVar});
        }
        if (aA(aVar)) {
            return aB(aVar).F();
        }
        return c.o();
    }

    public static String ab(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7d0660a3", new Object[]{aVar});
        }
        if (aA(aVar)) {
            return aB(aVar).G();
        }
        return c.f;
    }

    public static void l(String str, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7ed8de8", new Object[]{str, aVar});
            return;
        }
        c.f = str;
        if (!aA(aVar)) {
            return;
        }
        poz.K(str, n.b(aVar));
    }

    public static String ac(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("58c7dc64", new Object[]{aVar});
        }
        if (aA(aVar)) {
            return aB(aVar).H();
        }
        return c.k();
    }

    public static String ad(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("34895825", new Object[]{aVar});
        }
        if (aA(aVar)) {
            return aB(aVar).I();
        }
        return c.l();
    }

    public static boolean ae(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("767653fe", new Object[]{aVar})).booleanValue();
        }
        if (aA(aVar)) {
            return aB(aVar).J();
        }
        return c.ag;
    }

    public static boolean af(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("681ffa1d", new Object[]{aVar})).booleanValue();
        }
        if (aA(aVar)) {
            return aB(aVar).K();
        }
        return c.f();
    }

    public static boolean ag(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("59c9a03c", new Object[]{aVar})).booleanValue();
        }
        if (aA(aVar)) {
            return aB(aVar).L();
        }
        return c.g();
    }

    public static boolean ah(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4b73465b", new Object[]{aVar})).booleanValue();
        }
        if (aA(aVar)) {
            return aB(aVar).N();
        }
        return c.q();
    }

    public static long ai(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3d1cec6a", new Object[]{aVar})).longValue();
        }
        if (aA(aVar)) {
            return aB(aVar).O();
        }
        return c.E;
    }

    public static boolean aj(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2ec69299", new Object[]{aVar})).booleanValue();
        }
        if (aA(aVar)) {
            return aB(aVar).P();
        }
        return c.Z;
    }

    public static String ak(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("36d3ba6c", new Object[]{aVar});
        }
        if (b(aVar, true)) {
            return aB(aVar).T();
        }
        return c.ai;
    }

    public static boolean al(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1219ded7", new Object[]{aVar})).booleanValue();
        }
        if (aA(aVar)) {
            return aB(aVar).U();
        }
        return c.ak;
    }

    public static boolean am(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3c384f6", new Object[]{aVar})).booleanValue();
        }
        if (aA(aVar)) {
            return aB(aVar).V();
        }
        return c.ar;
    }

    public static boolean an(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f56d2b15", new Object[]{aVar})).booleanValue();
        }
        if (aA(aVar)) {
            return aB(aVar).W();
        }
        return c.at;
    }

    public static int ap(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d8c07742", new Object[]{aVar})).intValue();
        }
        if (aA(aVar)) {
            return aB(aVar).Y();
        }
        return c.j;
    }

    public static int aq(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ca6a1d61", new Object[]{aVar})).intValue();
        }
        if (aA(aVar)) {
            return aB(aVar).Z();
        }
        return c.k;
    }

    public static int ar(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bc13c380", new Object[]{aVar})).intValue();
        }
        if (aA(aVar)) {
            return aB(aVar).aa();
        }
        return c.l;
    }

    public static String ao(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a5d9a970", new Object[]{aVar});
        }
        if (aA(aVar)) {
            return aB(aVar).ad();
        }
        return c.N();
    }

    public static boolean as(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("adbd69b0", new Object[]{aVar})).booleanValue();
        }
        if (aA(aVar)) {
            return aB(aVar).ab();
        }
        return c.al;
    }

    public static boolean at(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9f670fcf", new Object[]{aVar})).booleanValue();
        }
        if (aA(aVar)) {
            return aB(aVar).ac();
        }
        return c.am;
    }

    public static boolean av(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("82ba5c0d", new Object[]{aVar})).booleanValue() : poz.D(n.b(aVar));
    }

    public static boolean aw(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("7464022c", new Object[]{aVar})).booleanValue() : poz.A(n.b(aVar));
    }

    public static boolean ax(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("660da84b", new Object[]{aVar})).booleanValue() : poz.w(n.b(aVar));
    }

    public static String ay(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("3b687efa", new Object[]{aVar}) : poz.B(n.b(aVar));
    }

    public static long az(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("4960f479", new Object[]{aVar})).longValue() : poz.u(n.b(aVar));
    }
}
