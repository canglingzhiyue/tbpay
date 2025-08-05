package com.taobao.orange;

import android.content.Context;
import com.taobao.orange.OConstant;
import com.taobao.orange.util.OLog;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import tb.kge;
import tb.mzx;
import tb.mzz;
import tb.naa;

/* loaded from: classes.dex */
public class a {
    public static volatile boolean A;
    public static volatile boolean B;
    public static volatile String C;
    public static volatile String D;
    public static volatile boolean E;
    public static volatile boolean F;
    public static volatile boolean G;
    public static volatile boolean H;
    public static volatile boolean I;
    public static OConstant.ENV J;
    public static String K;
    public static Set<String> L;
    public static String M;
    public static Set<String> N;
    public static AtomicInteger O;
    public static volatile long P;
    public static volatile long Q;
    public static volatile String R;
    public static volatile String S;
    public static int T;

    /* renamed from: a  reason: collision with root package name */
    public static volatile boolean f18576a;
    public static volatile boolean b;
    public static volatile boolean c;
    public static volatile boolean d;
    public static volatile boolean e;
    public static Class<? extends naa> f;
    public static Context g;
    public static String h;
    public static String i;
    public static String j;
    public static String k;
    public static String l;
    public static String m;
    public static volatile String n;
    public static volatile String o;
    public static volatile String p;
    public static volatile int q;
    public static volatile boolean r;
    public static boolean s;
    public static volatile long t;
    public static volatile Set<String> u;
    public static volatile OConstant.UPDMODE v;
    public static volatile int w;
    public static volatile boolean x;
    public static volatile int y;
    public static volatile String z;

    static {
        kge.a(-441807617);
        f18576a = false;
        b = true;
        c = false;
        d = false;
        e = false;
        try {
            Class.forName(OConstant.REFLECT_NETWORKSDK);
            f = mzz.class;
        } catch (ClassNotFoundException unused) {
            f = mzx.class;
            OLog.w("GlobalOrange", "init not found networksdk", new Object[0]);
        }
        h = "";
        i = "";
        j = "";
        k = "";
        l = "";
        m = "";
        p = "https";
        q = 3;
        r = false;
        s = false;
        t = 10L;
        u = Collections.synchronizedSet(new HashSet());
        v = OConstant.UPDMODE.O_XMD;
        w = 0;
        x = false;
        y = 0;
        z = "";
        A = true;
        B = true;
        C = "";
        D = "1200#3600#5";
        E = false;
        F = false;
        G = false;
        H = false;
        I = false;
        J = OConstant.ENV.ONLINE;
        L = Collections.synchronizedSet(new HashSet());
        N = Collections.synchronizedSet(new HashSet());
        O = new AtomicInteger(0);
        P = 0L;
        Q = 0L;
        R = "";
        S = "";
        T = 1;
    }
}
