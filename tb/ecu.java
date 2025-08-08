package tb;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* loaded from: classes4.dex */
public class ecu {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static boolean A;
    public static boolean B;
    public static boolean C;
    public static boolean D;
    public static boolean E;
    public static boolean F;
    public static boolean G;
    public static boolean H;
    public static boolean I;
    public static boolean J;
    public static String K;
    public static String L;
    public static boolean M;
    public static boolean N;
    public static boolean O;
    public static String P;
    public static String Q;
    public static Set<String> R;
    public static int S;
    public static boolean T;
    public static boolean U;
    public static boolean V;
    public static boolean W;
    public static boolean X;
    public static boolean Y;
    public static boolean Z;

    /* renamed from: a  reason: collision with root package name */
    public static boolean f27202a;
    public static boolean aa;
    public static List<String> ab;
    public static boolean ac;
    public static boolean b;
    public static boolean c;
    public static boolean d;
    public static boolean e;
    public static boolean g;
    public static boolean h;
    public static boolean i;
    public static boolean j;
    public static boolean k;
    public static boolean l;
    public static boolean m;
    public static boolean n;
    public static boolean o;
    public static boolean p;
    public static boolean q;
    public static boolean r;
    public static boolean s;
    public static boolean t;
    public static boolean u;
    public static boolean v;
    public static boolean w;
    public static boolean x;
    public static boolean y;
    public static boolean z;

    static {
        kge.a(-1126021395);
        emu.a("com.taobao.android.detail.core.detail.utils.SwitchConfig");
        f27202a = true;
        b = false;
        c = false;
        d = false;
        e = true;
        g = false;
        h = false;
        i = false;
        j = false;
        k = false;
        l = true;
        m = false;
        n = true;
        o = true;
        p = true;
        q = true;
        r = true;
        s = true;
        t = true;
        u = true;
        v = true;
        w = true;
        x = true;
        y = true;
        z = true;
        A = true;
        B = true;
        C = true;
        D = false;
        E = false;
        F = true;
        G = true;
        H = jqm.a();
        I = true;
        J = true;
        K = "0";
        L = "default";
        M = false;
        N = false;
        O = false;
        P = "0";
        Q = "https://main.m.taobao.com/detail/index.html";
        R = Collections.emptySet();
        S = 3;
        T = false;
        U = false;
        V = false;
        W = true;
        X = true;
        Y = false;
        Z = true;
        aa = false;
        ac = true;
    }

    public static boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{str})).booleanValue();
        }
        if (ab != null && !StringUtils.isEmpty(str)) {
            return ab.contains(str);
        }
        return false;
    }
}
