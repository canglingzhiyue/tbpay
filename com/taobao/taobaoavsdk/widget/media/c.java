package com.taobao.taobaoavsdk.widget.media;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.media.MediaConstant;
import com.taobao.orange.OrangeConfig;
import com.taobao.taobaoavsdk.Tracer.BaseAnalysis;
import java.util.HashMap;
import java.util.Map;
import tb.kge;

/* loaded from: classes8.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int DECODER_TYPE_HARDWARE = 1;
    public static final int DECODER_TYPE_SOFTWARE = 0;
    public static final int PLAYER_TYPE_FF = 1;
    public static final int PLAYER_TYPE_MEDIA = 2;
    public static final int PLAYER_TYPE_TAOBAO = 3;
    public static final int RENDER_TYPE_SURFACE_VIEW = 1;
    public static final int RENDER_TYPE_TEXTURE_VIEW = 2;
    public static final int RENDER_TYPE_VR_VIEW = 3;
    public static final int SCALE_TYPE_CENTER_CROP = 1;
    public static final int SCALE_TYPE_FIT_CENTER = 0;
    public static final int SCALE_TYPE_FIT_XY = 3;
    public static final int SCENARIO_TYPE_LINKLIVE = 1;
    public static final int SCENARIO_TYPE_LIVE = 0;
    public static final int SCENARIO_TYPE_PLAYBACK = 2;
    public static final int VR_RENDER_TYPE_180_LEFT_RIGHT = 3;
    public static final int VR_RENDER_TYPE_180_UP_DOWN = 2;
    public static final int VR_RENDER_TYPE_360_EQUIRECTANGULAR = 1;
    public static final int mDisableH26XByBlackList = 1;
    public static final int mDisableH26XByBusinessSet = 3;
    public static final int mDisableH26XByHWFailed = 4;
    public static final int mDisableH26XByInit = 0;
    public static final int mDisableH26XByTag = 5;
    public static final int mDisableH26XSetByConfig = 2;
    public String A;
    public String B;
    public String C;
    public String D;
    public String E;
    public String F;
    public String G;
    public String H;
    public int I;
    public String J;
    public boolean L;
    public boolean M;
    public String N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public String R;
    public boolean S;
    public boolean T;
    public String U;
    public String V;
    public String W;
    public boolean Y;
    public int Z;
    public String aD;
    public boolean aF;
    public int aG;
    public boolean aH;
    public boolean aJ;
    public boolean aK;
    public boolean aQ;
    public boolean aR;
    public boolean aS;
    public boolean aT;
    public boolean aU;
    public boolean aX;
    public Map<String, String> ab;
    public String af;
    public int ap;
    public String as;
    public boolean at;
    public String au;
    public String av;
    public String aw;
    public long ax;
    public boolean ay;
    public String az;
    public boolean bh;
    public BaseAnalysis bi;
    public int f;
    public int g;
    public int i;
    public boolean o;
    public String p;
    public String q;
    public String r;
    public String s;
    public String t;
    public int u;
    public String v;
    public String w;
    public String x;
    public String y;
    public String z;
    public int aZ = -1;

    /* renamed from: a  reason: collision with root package name */
    public int f21365a = 1;
    public int b = 0;
    public int c = 2;
    public int d = 1;
    @Deprecated
    public int e = 0;
    public int h = 0;
    public int j = 1;
    public int k = -1;
    public int l = -1;
    public boolean m = true;
    public boolean n = true;
    public int K = -1;
    public int bb = 0;
    public double bc = -1.0d;
    public double bd = -1.0d;
    public boolean X = false;
    public int ac = 0;
    public int ad = 0;
    public int ae = 0;
    public boolean ag = false;
    public boolean ah = false;
    public boolean ai = false;
    public boolean aj = true;
    public int ak = 0;
    public boolean al = false;
    public int am = 1;
    public int an = 0;
    public boolean ao = false;
    public boolean aq = true;
    public boolean ar = false;
    public int aA = 0;
    public long aB = -1;
    public long aC = -1;
    public long ba = -1;
    public boolean aE = true;
    public int aI = 0;
    public boolean aV = false;
    public boolean aW = false;
    public boolean bf = false;
    public boolean bg = false;
    public int aL = 0;
    public int aM = 0;
    public long aN = 0;
    public int aO = -1;
    public int aP = -1;
    public int aY = 0;
    public boolean bj = false;
    public boolean bk = false;
    public Map<String, String> aa = new HashMap();
    public Map<String, String> be = new HashMap();

    static {
        kge.a(1664379135);
    }

    public /* synthetic */ Object clone() throws CloneNotSupportedException {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("78b3604e", new Object[]{this}) : a();
    }

    private c() {
        this.f = 0;
        this.g = 0;
        if (com.taobao.taobaoavsdk.util.b.a(OrangeConfig.getInstance().getConfig("DWInteractive", MediaConstant.ORANGE_ENABLE_H26X_DEFAULT_HARDWARE, "true"))) {
            this.f = 1;
            this.g = 1;
        }
    }

    public c(String str) {
        this.f = 0;
        this.g = 0;
        this.x = str;
        if (com.taobao.taobaoavsdk.util.b.a(OrangeConfig.getInstance().getConfig("DWInteractive", MediaConstant.ORANGE_ENABLE_H26X_DEFAULT_HARDWARE, "true"))) {
            this.f = 1;
            this.g = 1;
        }
    }

    public c(String str, String str2) {
        this.f = 0;
        this.g = 0;
        this.x = str;
        this.A = str2;
        if (com.taobao.taobaoavsdk.util.b.a(OrangeConfig.getInstance().getConfig("DWInteractive", MediaConstant.ORANGE_ENABLE_H26X_DEFAULT_HARDWARE, "true"))) {
            this.f = 1;
            this.g = 1;
        }
    }

    public c a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("26042e1", new Object[]{this});
        }
        c cVar = new c(this.x);
        cVar.C = this.C;
        cVar.L = this.L;
        cVar.m = this.m;
        cVar.o = this.o;
        cVar.n = this.n;
        cVar.r = this.r;
        cVar.q = this.q;
        cVar.i = this.i;
        cVar.f = this.f;
        cVar.g = this.g;
        cVar.H = this.H;
        cVar.N = this.N;
        cVar.B = this.B;
        cVar.M = this.M;
        cVar.F = this.F;
        cVar.K = this.K;
        cVar.bb = this.bb;
        cVar.bc = this.bc;
        cVar.bd = this.bd;
        cVar.f21365a = this.f21365a;
        cVar.t = this.t;
        cVar.c = this.c;
        cVar.d = this.d;
        cVar.b = this.b;
        cVar.G = this.G;
        cVar.y = this.y;
        cVar.p = this.p;
        cVar.A = this.A;
        cVar.z = this.z;
        cVar.D = this.D;
        cVar.u = this.u;
        cVar.v = this.v;
        cVar.w = this.w;
        cVar.E = this.E;
        cVar.l = this.l;
        cVar.k = this.k;
        cVar.j = this.j;
        cVar.s = this.s;
        cVar.P = this.P;
        cVar.O = this.O;
        cVar.Q = this.Q;
        cVar.R = this.R;
        cVar.S = this.S;
        cVar.T = this.T;
        cVar.U = this.U;
        cVar.V = this.V;
        cVar.W = this.W;
        cVar.X = this.X;
        cVar.Y = this.Y;
        cVar.Z = this.Z;
        cVar.aa = this.aa;
        cVar.be = this.be;
        cVar.ab = this.ab;
        cVar.ag = this.ag;
        cVar.ah = this.ah;
        cVar.ai = this.ai;
        cVar.ak = this.ak;
        cVar.al = this.al;
        cVar.am = this.am;
        cVar.ap = this.ap;
        cVar.aq = this.aq;
        cVar.ar = this.ar;
        cVar.as = this.as;
        cVar.at = this.at;
        cVar.au = this.au;
        cVar.av = this.av;
        cVar.aw = this.aw;
        cVar.ax = this.ax;
        cVar.ay = this.ay;
        cVar.az = this.az;
        cVar.aF = this.aF;
        cVar.aG = this.aG;
        cVar.aH = this.aH;
        cVar.aK = this.aK;
        cVar.aj = this.aj;
        cVar.aI = this.aI;
        cVar.aJ = this.aJ;
        cVar.aL = this.aL;
        cVar.aM = this.aM;
        cVar.aN = this.aN;
        cVar.aA = this.aA;
        cVar.aV = this.aV;
        cVar.aW = this.aW;
        cVar.bf = this.bf;
        cVar.bg = this.bg;
        cVar.aB = this.aB;
        cVar.aC = this.aC;
        cVar.ba = this.ba;
        cVar.aD = this.aD;
        cVar.aE = this.aE;
        cVar.aO = this.aO;
        cVar.aP = this.aP;
        cVar.aQ = this.aQ;
        cVar.aR = this.aR;
        cVar.aS = this.aS;
        cVar.aT = this.aT;
        cVar.aU = this.aU;
        cVar.aX = this.aX;
        cVar.aY = this.aY;
        cVar.aZ = this.aZ;
        cVar.bh = this.bh;
        cVar.bj = this.bj;
        cVar.bk = this.bk;
        return cVar;
    }
}
