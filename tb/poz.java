package tb;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSONArray;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.room.business.mess.LiveDetailMessinfoResponseData;
import com.taobao.taolive.room.service.a;
import com.taobao.taolive.room.service.c;
import com.taobao.taolive.room.utils.ao;
import com.taobao.taolive.sdk.core.g;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.utils.b;
import com.taobao.taolive.sdk.utils.y;
import java.util.Map;

/* loaded from: classes8.dex */
public class poz {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static Handler f32793a;

    public static void i(String str, g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5074287", new Object[]{str, gVar});
        }
    }

    static {
        kge.a(-1537024062);
        f32793a = new Handler(Looper.getMainLooper());
    }

    public static void a(String str, g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("142b4d8f", new Object[]{str, gVar});
            return;
        }
        c.n(str);
        if (!F(gVar)) {
            return;
        }
        G(gVar).c(str);
    }

    public static String a(g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a6fc3327", new Object[]{gVar});
        }
        if (F(gVar)) {
            return G(gVar).e();
        }
        return c.y();
    }

    public static void Y(String str, g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("434f5897", new Object[]{str, gVar});
        } else if (!F(gVar)) {
        } else {
            G(gVar).X(str);
        }
    }

    public static void b(String str, g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e46cc2e", new Object[]{str, gVar});
            return;
        }
        c.q(str);
        if (!F(gVar)) {
            return;
        }
        G(gVar).e(str);
    }

    public static void c(String str, g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48624acd", new Object[]{str, gVar});
            return;
        }
        c.o(str);
        if (!F(gVar)) {
            return;
        }
        G(gVar).f(str);
    }

    public static void d(String str, g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("627dc96c", new Object[]{str, gVar});
            return;
        }
        c.f21681a = str;
        if (!F(gVar)) {
            return;
        }
        G(gVar).g(str);
    }

    public static void e(String str, g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c99480b", new Object[]{str, gVar});
            return;
        }
        c.p(str);
        if (!F(gVar)) {
            return;
        }
        G(gVar).i(str);
    }

    public static void f(String str, g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96b4c6aa", new Object[]{str, gVar});
            return;
        }
        c.m = str;
        if (!F(gVar)) {
            return;
        }
        G(gVar).j(str);
    }

    public static void g(String str, g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0d04549", new Object[]{str, gVar});
            return;
        }
        c.p = str;
        if (!F(gVar)) {
            return;
        }
        G(gVar).k(str);
    }

    public static void h(String str, g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("caebc3e8", new Object[]{str, gVar});
            return;
        }
        c.q = str;
        if (!F(gVar)) {
            return;
        }
        G(gVar).l(str);
    }

    public static void j(String str, g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff22c126", new Object[]{str, gVar});
            return;
        }
        c.r = str;
        if (!F(gVar)) {
            return;
        }
        G(gVar).m(str);
    }

    public static void k(String str, g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("193e3fc5", new Object[]{str, gVar});
            return;
        }
        c.s = str;
        if (!F(gVar)) {
            return;
        }
        G(gVar).n(str);
    }

    private static boolean F(g gVar) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c923b498", new Object[]{gVar})).booleanValue();
        }
        if (gVar != null && G(gVar) != null) {
            z = true;
        }
        if (!z && b.b()) {
            pmd.a().m().a("GlobalDataCenterUtil", Log.getStackTraceString(new Throwable()));
            Handler handler = f32793a;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
                f32793a.post(new Runnable() { // from class: tb.poz.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            ao.a(pmd.a().u().c(), "BaseGlobalContext为空，埋点数据异常，请关注");
                        }
                    }
                });
            }
        }
        return z;
    }

    public static void l(String str, g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3359be64", new Object[]{str, gVar});
            return;
        }
        c.aB = str;
        if (!F(gVar)) {
            return;
        }
        G(gVar).U(str);
    }

    public static void a(boolean z, g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dced5f15", new Object[]{new Boolean(z), gVar});
            return;
        }
        c.ay = z;
        if (!F(gVar)) {
            return;
        }
        G(gVar).u(z);
    }

    public static void m(String str, g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d753d03", new Object[]{str, gVar});
            return;
        }
        c.az = str;
        if (!F(gVar)) {
            return;
        }
        G(gVar).V(str);
    }

    public static void n(String str, g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6790bba2", new Object[]{str, gVar});
            return;
        }
        c.aA = str;
        if (!F(gVar)) {
            return;
        }
        G(gVar).W(str);
    }

    public static void o(String str, g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81ac3a41", new Object[]{str, gVar});
            return;
        }
        c.t = str;
        if (!F(gVar)) {
            return;
        }
        G(gVar).o(str);
    }

    public static void p(String str, g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9bc7b8e0", new Object[]{str, gVar});
            return;
        }
        c.u = str;
        if (!F(gVar)) {
            return;
        }
        G(gVar).p(str);
    }

    private static ibw G(g gVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ibw) ipChange.ipc$dispatch("1402bb75", new Object[]{gVar}) : gVar.aJ_();
    }

    public static void q(String str, g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5e3377f", new Object[]{str, gVar});
            return;
        }
        c.v = str;
        if (!F(gVar)) {
            return;
        }
        G(gVar).q(str);
    }

    public static void r(String str, g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cffeb61e", new Object[]{str, gVar});
            return;
        }
        c.y = str;
        if (!F(gVar)) {
            return;
        }
        G(gVar).r(str);
    }

    public static void s(String str, g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea1a34bd", new Object[]{str, gVar});
            return;
        }
        c.z = str;
        if (!F(gVar)) {
            return;
        }
        G(gVar).s(str);
    }

    public static void t(String str, g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("435b35c", new Object[]{str, gVar});
            return;
        }
        c.A = str;
        if (!F(gVar)) {
            return;
        }
        G(gVar).t(str);
    }

    public static void u(String str, g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e5131fb", new Object[]{str, gVar});
            return;
        }
        c.B = str;
        if (!F(gVar)) {
            return;
        }
        G(gVar).u(str);
    }

    public static void v(String str, g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("386cb09a", new Object[]{str, gVar});
            return;
        }
        c.C = str;
        if (!F(gVar)) {
            return;
        }
        G(gVar).v(str);
    }

    public static void w(String str, g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52882f39", new Object[]{str, gVar});
            return;
        }
        c.D = str;
        if (!F(gVar)) {
            return;
        }
        G(gVar).w(str);
    }

    public static void a(int i, g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cdd15906", new Object[]{new Integer(i), gVar});
            return;
        }
        c.F = i;
        if (!F(gVar)) {
            return;
        }
        G(gVar).a(i);
    }

    public static void x(String str, g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ca3add8", new Object[]{str, gVar});
            return;
        }
        c.G = str;
        if (!F(gVar)) {
            return;
        }
        G(gVar).x(str);
    }

    public static void y(String str, g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86bf2c77", new Object[]{str, gVar});
            return;
        }
        c.H = str;
        if (!F(gVar)) {
            return;
        }
        G(gVar).y(str);
    }

    public static void z(String str, g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0daab16", new Object[]{str, gVar});
            return;
        }
        c.I = str;
        if (!F(gVar)) {
            return;
        }
        G(gVar).z(str);
    }

    public static void A(String str, g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0bb79af", new Object[]{str, gVar});
            return;
        }
        c.J = str;
        if (!F(gVar)) {
            return;
        }
        G(gVar).A(str);
    }

    public static void B(String str, g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ead6f84e", new Object[]{str, gVar});
            return;
        }
        c.K = str;
        if (!F(gVar)) {
            return;
        }
        G(gVar).B(str);
    }

    public static void C(String str, g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f276ed", new Object[]{str, gVar});
            return;
        }
        c.L = str;
        if (!F(gVar)) {
            return;
        }
        G(gVar).C(str);
    }

    public static void D(String str, g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f0df58c", new Object[]{str, gVar});
            return;
        }
        c.M = str;
        if (!F(gVar)) {
            return;
        }
        G(gVar).D(str);
    }

    public static void E(String str, g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3929742b", new Object[]{str, gVar});
            return;
        }
        c.N = str;
        if (!F(gVar)) {
            return;
        }
        G(gVar).E(str);
    }

    public static void F(String str, g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5344f2ca", new Object[]{str, gVar});
            return;
        }
        c.O = str;
        if (!F(gVar)) {
            return;
        }
        G(gVar).F(str);
    }

    public static void G(String str, g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d607169", new Object[]{str, gVar});
            return;
        }
        c.P = str;
        if (!F(gVar)) {
            return;
        }
        G(gVar).G(str);
    }

    public static void H(String str, g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("877bf008", new Object[]{str, gVar});
            return;
        }
        c.Q = str;
        if (!F(gVar)) {
            return;
        }
        G(gVar).H(str);
    }

    public static void a(JSONArray jSONArray, g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e31f4871", new Object[]{jSONArray, gVar});
            return;
        }
        c.ao = jSONArray;
        if (!F(gVar)) {
            return;
        }
        G(gVar).a(jSONArray);
    }

    public static void I(String str, g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1976ea7", new Object[]{str, gVar});
            return;
        }
        c.au = str;
        if (!F(gVar)) {
            return;
        }
        G(gVar).I(str);
    }

    public static void J(String str, g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bbb2ed46", new Object[]{str, gVar});
            return;
        }
        c.k(str);
        if (!F(gVar)) {
            return;
        }
        G(gVar).J(str);
    }

    public static void a(Map<String, String> map, g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bfa18a44", new Object[]{map, gVar});
            return;
        }
        c.a(map);
        if (!F(gVar)) {
            return;
        }
        G(gVar).a(map);
    }

    public static void K(String str, g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5ce6be5", new Object[]{str, gVar});
            return;
        }
        c.f = str;
        if (!F(gVar)) {
            return;
        }
        G(gVar).K(str);
    }

    public static void b(boolean z, g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0953296", new Object[]{new Boolean(z), gVar});
            return;
        }
        c.V = z;
        if (!F(gVar)) {
            return;
        }
        G(gVar).a(z);
    }

    public static void L(String str, g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("efe9ea84", new Object[]{str, gVar});
            return;
        }
        c.i(str);
        if (!F(gVar)) {
            return;
        }
        G(gVar).L(str);
    }

    public static void M(String str, g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a056923", new Object[]{str, gVar});
            return;
        }
        c.j(str);
        if (!F(gVar)) {
            return;
        }
        G(gVar).M(str);
    }

    public static void N(String str, g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2420e7c2", new Object[]{str, gVar});
            return;
        }
        c.U = str;
        if (!F(gVar)) {
            return;
        }
        G(gVar).N(str);
    }

    public static void c(boolean z, g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43d0617", new Object[]{new Boolean(z), gVar});
            return;
        }
        c.a(z);
        if (!F(gVar)) {
            return;
        }
        G(gVar).b(z);
    }

    public static void a(long j, g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af11d25", new Object[]{new Long(j), gVar});
            return;
        }
        c.E = j;
        if (!F(gVar)) {
            return;
        }
        G(gVar).a(j);
    }

    public static void c(long j, g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3240c427", new Object[]{new Long(j), gVar});
            return;
        }
        c.bk = j;
        if (!F(gVar)) {
            return;
        }
        G(gVar).c(j);
    }

    public static void d(boolean z, g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17e4d998", new Object[]{new Boolean(z), gVar});
            return;
        }
        c.W = z;
        if (!F(gVar)) {
            return;
        }
        G(gVar).c(z);
    }

    public static void e(boolean z, g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b8cad19", new Object[]{new Boolean(z), gVar});
            return;
        }
        c.Y = z;
        if (!F(gVar)) {
            return;
        }
        G(gVar).d(z);
    }

    public static void f(boolean z, g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f34809a", new Object[]{new Boolean(z), gVar});
            return;
        }
        c.Z = z;
        if (!F(gVar)) {
            return;
        }
        G(gVar).e(z);
    }

    public static void g(boolean z, g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52dc541b", new Object[]{new Boolean(z), gVar});
            return;
        }
        c.aa = z;
        if (!F(gVar)) {
            return;
        }
        G(gVar).f(z);
    }

    public static void h(boolean z, g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6684279c", new Object[]{new Boolean(z), gVar});
            return;
        }
        c.ad = z;
        if (!F(gVar)) {
            return;
        }
        G(gVar).g(z);
    }

    public static void b(long j, g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e98f0a6", new Object[]{new Long(j), gVar});
            return;
        }
        c.ah = j;
        if (!F(gVar)) {
            return;
        }
        G(gVar).b(j);
    }

    public static void O(String str, g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e3c6661", new Object[]{str, gVar});
            return;
        }
        c.ai = str;
        if (!F(gVar)) {
            return;
        }
        G(gVar).O(str);
    }

    public static void i(boolean z, g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a2bfb1d", new Object[]{new Boolean(z), gVar});
            return;
        }
        c.ak = z;
        if (!F(gVar)) {
            return;
        }
        G(gVar).h(z);
    }

    public static void j(boolean z, g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dd3ce9e", new Object[]{new Boolean(z), gVar});
            return;
        }
        c.aq = z;
        if (!F(gVar)) {
            return;
        }
        G(gVar).i(z);
    }

    public static void k(boolean z, g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a17ba21f", new Object[]{new Boolean(z), gVar});
            return;
        }
        c.ar = z;
        if (!F(gVar)) {
            return;
        }
        G(gVar).j(z);
    }

    public static void l(boolean z, g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b52375a0", new Object[]{new Boolean(z), gVar});
            return;
        }
        c.at = z;
        if (!F(gVar)) {
            return;
        }
        G(gVar).k(z);
    }

    public static void P(String str, g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5857e500", new Object[]{str, gVar});
            return;
        }
        c.f(str);
        if (!F(gVar)) {
            return;
        }
        G(gVar).P(str);
    }

    public static void m(boolean z, g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8cb4921", new Object[]{new Boolean(z), gVar});
            return;
        }
        c.i = z;
        if (!F(gVar)) {
            return;
        }
        G(gVar).l(z);
    }

    public static void b(int i, g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1792c87", new Object[]{new Integer(i), gVar});
            return;
        }
        c.j = i;
        if (!F(gVar)) {
            return;
        }
        G(gVar).b(i);
    }

    public static void c(int i, g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5210008", new Object[]{new Integer(i), gVar});
            return;
        }
        c.k = i;
        if (!F(gVar)) {
            return;
        }
        G(gVar).c(i);
    }

    public static void d(int i, g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c8d389", new Object[]{new Integer(i), gVar});
            return;
        }
        c.l = i;
        if (!F(gVar)) {
            return;
        }
        G(gVar).d(i);
    }

    public static void n(boolean z, g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc731ca2", new Object[]{new Boolean(z), gVar});
            return;
        }
        c.b(z);
        if (!F(gVar)) {
            return;
        }
        G(gVar).m(z);
    }

    public static void Q(String str, g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7273639f", new Object[]{str, gVar});
            return;
        }
        c.t(str);
        if (!F(gVar)) {
            return;
        }
        G(gVar).Q(str);
    }

    public static void R(String str, g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c8ee23e", new Object[]{str, gVar});
            return;
        }
        c.u(str);
        if (!F(gVar)) {
            return;
        }
        G(gVar).R(str);
    }

    public static void o(boolean z, g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f01af023", new Object[]{new Boolean(z), gVar});
            return;
        }
        c.al = z;
        if (!F(gVar)) {
            return;
        }
        G(gVar).n(z);
    }

    public static void p(boolean z, g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c2c3a4", new Object[]{new Boolean(z), gVar});
            return;
        }
        c.am = z;
        if (!F(gVar)) {
            return;
        }
        G(gVar).o(z);
    }

    public static void q(boolean z, g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("176a9725", new Object[]{new Boolean(z), gVar});
            return;
        }
        c.an = z;
        if (!F(gVar)) {
            return;
        }
        G(gVar).p(z);
    }

    public static void S(String str, g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6aa60dd", new Object[]{str, gVar});
            return;
        }
        c.T = str;
        if (!F(gVar)) {
            return;
        }
        G(gVar).S(str);
    }

    public static void r(boolean z, g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b126aa6", new Object[]{new Boolean(z), gVar});
            return;
        }
        c.X = z;
        if (!F(gVar)) {
            return;
        }
        G(gVar).q(z);
    }

    public static void s(boolean z, g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3eba3e27", new Object[]{new Boolean(z), gVar});
            return;
        }
        c.ab = z;
        if (!F(gVar)) {
            return;
        }
        G(gVar).r(z);
    }

    public static void T(String str, g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0c5df7c", new Object[]{str, gVar});
            return;
        }
        c.w = str;
        if (!F(gVar)) {
            return;
        }
        G(gVar).T(str);
    }

    public static void t(boolean z, g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("526211a8", new Object[]{new Boolean(z), gVar});
            return;
        }
        c.e = z;
        if (!F(gVar)) {
            return;
        }
        G(gVar).s(z);
    }

    public static void u(boolean z, g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6609e529", new Object[]{new Boolean(z), gVar});
            return;
        }
        c.o = z;
        if (!F(gVar)) {
            return;
        }
        G(gVar).t(z);
    }

    public static String b(g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3436e4a8", new Object[]{gVar});
        }
        if (F(gVar)) {
            return G(gVar).f();
        }
        return c.B();
    }

    public static String c(g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c1719629", new Object[]{gVar});
        }
        if (F(gVar)) {
            return G(gVar).k();
        }
        return c.m;
    }

    public static String d(g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4eac47aa", new Object[]{gVar});
        }
        if (F(gVar)) {
            return G(gVar).l();
        }
        return c.p;
    }

    public static String e(g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("dbe6f92b", new Object[]{gVar});
        }
        if (F(gVar)) {
            return G(gVar).m();
        }
        return c.q;
    }

    public static String I(g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("697b8f0f", new Object[]{gVar});
        }
        if (F(gVar)) {
            return G(gVar).o();
        }
        return c.u;
    }

    public static String f(g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6921aaac", new Object[]{gVar});
        }
        if (F(gVar)) {
            return G(gVar).p();
        }
        return c.v;
    }

    public static String g(g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f65c5c2d", new Object[]{gVar});
        }
        if (F(gVar)) {
            return G(gVar).r();
        }
        return c.z;
    }

    public static String h(g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("83970dae", new Object[]{gVar});
        }
        if (F(gVar)) {
            return G(gVar).s();
        }
        return c.A;
    }

    public static String i(g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("10d1bf2f", new Object[]{gVar});
        }
        if (F(gVar)) {
            return G(gVar).v();
        }
        return c.D;
    }

    public static int J(g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9a209603", new Object[]{gVar})).intValue();
        }
        if (F(gVar)) {
            return G(gVar).w();
        }
        return c.F;
    }

    public static JSONArray j(g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("42ff3a4e", new Object[]{gVar});
        }
        if (F(gVar)) {
            return G(gVar).C();
        }
        return c.ao;
    }

    public static String k(g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2b472231", new Object[]{gVar});
        }
        if (F(gVar)) {
            return G(gVar).D();
        }
        return c.au;
    }

    public static String l(g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b881d3b2", new Object[]{gVar});
        }
        if (F(gVar)) {
            return G(gVar).E();
        }
        return c.m();
    }

    public static String m(g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("45bc8533", new Object[]{gVar});
        }
        if (F(gVar)) {
            return G(gVar).aj();
        }
        return c.av;
    }

    public static void U(String str, g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dae15e1b", new Object[]{str, gVar});
            return;
        }
        c.av = str;
        if (!F(gVar)) {
            return;
        }
        G(gVar).d(str);
    }

    public static void a(LiveDetailMessinfoResponseData.AlimamaInfo2 alimamaInfo2, g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fcb9a6b4", new Object[]{alimamaInfo2, gVar});
            return;
        }
        c.a(alimamaInfo2);
        if (!F(gVar)) {
            return;
        }
        G(gVar).a(alimamaInfo2);
    }

    public static void a(LiveDetailMessinfoResponseData.AlimamaInfo alimamaInfo, g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88d91850", new Object[]{alimamaInfo, gVar});
            return;
        }
        c.a(alimamaInfo);
        if (!F(gVar)) {
            return;
        }
        G(gVar).a(alimamaInfo);
    }

    public static void V(String str, g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4fcdcba", new Object[]{str, gVar});
            return;
        }
        c.g(str);
        if (!F(gVar)) {
            return;
        }
        G(gVar).a(str);
    }

    public static void W(String str, g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f185b59", new Object[]{str, gVar});
            return;
        }
        c.m(str);
        if (!F(gVar)) {
            return;
        }
        G(gVar).b(str);
    }

    public static Map<String, String> o(g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("f34fcec0", new Object[]{gVar});
        }
        if (F(gVar)) {
            return G(gVar).F();
        }
        return c.o();
    }

    public static String p(g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ed6c99b6", new Object[]{gVar});
        }
        if (F(gVar)) {
            return G(gVar).H();
        }
        return c.k();
    }

    public static String q(g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7aa74b37", new Object[]{gVar});
        }
        if (F(gVar)) {
            return G(gVar).I();
        }
        return c.l();
    }

    public static String r(g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7e1fcb8", new Object[]{gVar});
        }
        if (F(gVar)) {
            return G(gVar).M();
        }
        return c.U;
    }

    public static long s(g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("38409d3b", new Object[]{gVar})).longValue();
        }
        if (F(gVar)) {
            return G(gVar).O();
        }
        return c.E;
    }

    public static long E(g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("54e47c29", new Object[]{gVar})).longValue();
        }
        if (F(gVar)) {
            return G(gVar).aS();
        }
        return c.bk;
    }

    public static boolean H(g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b1a22556", new Object[]{gVar})).booleanValue();
        }
        if (F(gVar)) {
            return G(gVar).P();
        }
        return c.Z;
    }

    public static boolean t(g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ac7fd5aa", new Object[]{gVar})).booleanValue();
        }
        if (F(gVar)) {
            return G(gVar).Q();
        }
        return c.aa;
    }

    public static long u(g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("20bf0df9", new Object[]{gVar})).longValue();
        }
        if (F(gVar)) {
            return G(gVar).S();
        }
        return c.ah;
    }

    public static boolean v(g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("94fe4668", new Object[]{gVar})).booleanValue();
        }
        if (F(gVar)) {
            return G(gVar).X();
        }
        return c.i;
    }

    public static boolean w(g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("93d7ec7", new Object[]{gVar})).booleanValue();
        }
        if (F(gVar)) {
            return G(gVar).ag();
        }
        return c.ab;
    }

    public static int x(g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7d7cb715", new Object[]{gVar})).intValue();
        }
        if (F(gVar)) {
            return G(gVar).Y();
        }
        return c.j;
    }

    public static int y(g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f1bbef74", new Object[]{gVar})).intValue();
        }
        if (F(gVar)) {
            return G(gVar).Z();
        }
        return c.k;
    }

    public static boolean z(g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("65fb27e4", new Object[]{gVar})).booleanValue();
        }
        if (F(gVar)) {
            return G(gVar).ab();
        }
        return c.al;
    }

    public static boolean A(g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("83e79abd", new Object[]{gVar})).booleanValue();
        }
        if (F(gVar)) {
            return G(gVar).af();
        }
        return c.h();
    }

    public static String B(g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8ce0b488", new Object[]{gVar});
        }
        if (F(gVar)) {
            return G(gVar).ah();
        }
        return c.w;
    }

    public static boolean C(g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c660b7b", new Object[]{gVar})).booleanValue();
        }
        if (F(gVar)) {
            return G(gVar).ai();
        }
        return c.e;
    }

    public static void a(g gVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e06df5b", new Object[]{gVar, new Boolean(z)});
            return;
        }
        if (gVar != null && gVar.aJ_() != null && gVar.aJ_().c() != null) {
            gVar.aJ_().c().a(z);
        }
        c.e = z;
    }

    public static void X(String str, g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2933d9f8", new Object[]{str, gVar});
            return;
        }
        if (gVar != null && gVar.aJ_() != null && gVar.aJ_().c() != null) {
            gVar.aJ_().h(str);
        }
        c.l(str);
    }

    public static boolean D(g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e0a543da", new Object[]{gVar})).booleanValue();
        }
        if (F(gVar)) {
            return G(gVar).ae();
        }
        return c.J();
    }

    public static void a(g gVar, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98dba901", new Object[]{gVar, aVar});
            return;
        }
        if (F(gVar)) {
            G(gVar).a(aVar);
        }
        c.aE = aVar;
    }

    public static ViewGroup a(Context context, g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("ab1e6554", new Object[]{context, gVar});
        }
        if (F(gVar)) {
            return G(gVar).a(context);
        }
        return c.a(context);
    }

    public static ViewGroup b(Context context, g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("f31dc3b3", new Object[]{context, gVar});
        }
        ViewGroup a2 = a(context, gVar);
        if (a2 != null) {
            a2.setPadding((y.b(context) || y.i(context)) ? b.c() - y.f(context) : 0, 0, 0, 0);
        }
        return a2;
    }

    public static Map<String, String> a(g gVar, TBLiveDataModel tBLiveDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("2e9be407", new Object[]{gVar, tBLiveDataModel});
        }
        if (tBLiveDataModel != null) {
            return tBLiveDataModel.mInitParams;
        }
        return o(gVar);
    }

    public static void Z(String str, g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d6ad736", new Object[]{str, gVar});
        } else if (!F(gVar)) {
        } else {
            G(gVar).Y(str);
        }
    }
}
