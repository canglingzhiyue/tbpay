package com.taobao.android.dinamicx;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.videoc.DXVideoControlConfig;
import com.taobao.android.fluid.framework.adapter.image.ImageAdapter;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import tb.dkt;
import tb.esd;
import tb.fvc;
import tb.fxw;
import tb.kge;

/* loaded from: classes.dex */
public class DXEngineConfig {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int DEFAULT_MAX_CACHE_COUNT = 100;
    public static final int DEFAULT_PERIOD_TIME;
    public static final int DOWN_GRADE_ONCE = 2;
    public static final int DOWN_GRADE_TO_PRESET = 1;
    public static final String DX_DEFAULT_BIZTYPE = "default_bizType";
    public static final String DX_DEFAULT_SUB_BIZTYPE = "default_sub_bizType";
    public static final int IMAGE_RENDER_STRATEGY_ASYNC = 2;
    public static final int IMAGE_RENDER_STRATEGY_NORMAL = 0;
    public static final int IMAGE_RENDER_STRATEGY_POST_RUNNABLE = 1;
    public static final int NOTIFICATION_TYPE_EVERY_ONE = 1;
    public static final int NOTIFICATION_TYPE_ONLY_ONE = 2;
    public static final int VIEW_RECYCLE_STRATEGY_ALL = 2;
    public static final int VIEW_RECYCLE_STRATEGY_DEFINE_NODE = 1;
    public static final int VIEW_RECYCLE_STRATEGY_NO = 0;
    private final com.taobao.android.dinamicx.model.f A;
    private boolean B;
    private boolean C;
    private esd D;
    private boolean E;
    private String F;
    private int G;
    private String H;

    /* renamed from: a  reason: collision with root package name */
    public String f11775a;
    public int b;
    public long c;
    public int d;
    public boolean e;
    public boolean f;
    public int g;
    public boolean h;
    public long i;
    private String j;
    private int k;
    private o l;
    private boolean m;
    private dkt n;
    private boolean o;
    private q p;
    private boolean q;
    private DXVideoControlConfig<fxw> r;
    private boolean s;
    private int t;
    private boolean u;
    private boolean v;
    private boolean w;
    private int x;
    private String y;
    private ImageQuality z;

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes5.dex */
    public @interface DXImageRenderStrategy {
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes5.dex */
    public @interface DXViewRecycleStrategy {
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes5.dex */
    public @interface DownGradeType {
    }

    /* loaded from: classes5.dex */
    public enum ImageQuality {
        q90(ImageAdapter.IMAGE_QUALITY_Q90, "90q"),
        q75("q75", "75q"),
        q60("q60", "60q"),
        q50("q50", "50q"),
        q30("q30", "30q"),
        non("", "");
        
        String ossQ;
        String tfsQ;

        ImageQuality(String str, String str2) {
            this.tfsQ = "";
            this.ossQ = "";
            this.tfsQ = str;
            this.ossQ = str2;
        }

        public String getImageQuality() {
            return this.tfsQ;
        }

        public String getOssQuality() {
            return this.ossQ;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes5.dex */
    public @interface RemoteTemplateDownloadNotificationType {
    }

    static {
        kge.a(225420651);
        DEFAULT_PERIOD_TIME = fvc.f28140a * 20;
    }

    public DXEngineConfig(String str) {
        this(str, new a(str));
    }

    private DXEngineConfig(String str, a aVar) {
        this.d = 1;
        this.q = true;
        this.t = 1;
        this.u = true;
        this.B = false;
        this.x = 0;
        this.y = DX_DEFAULT_SUB_BIZTYPE;
        this.C = false;
        this.G = 0;
        this.f11775a = str;
        this.b = a.a(aVar);
        this.c = a.b(aVar);
        this.d = a.c(aVar);
        this.e = a.d(aVar);
        this.g = a.e(aVar);
        this.h = a.f(aVar);
        this.f = aVar.f11776a;
        this.i = Math.max(a.g(aVar), 100L);
        if (StringUtils.isEmpty(str)) {
            this.f11775a = DX_DEFAULT_BIZTYPE;
        }
        this.k = a.h(aVar);
        this.j = a.i(aVar);
        this.F = a.j(aVar);
        this.n = a.k(aVar);
        this.l = a.l(aVar);
        this.m = a.m(aVar);
        if (a.n(aVar) != null) {
            this.p = new q(a.n(aVar));
        } else {
            this.p = (com.taobao.android.dinamicx.q) p.b;
        }
        this.o = a.o(aVar);
        this.q = a.p(aVar);
        this.r = a.q(aVar);
        this.s = a.r(aVar);
        this.t = a.s(aVar);
        this.u = a.t(aVar);
        this.v = a.u(aVar);
        this.w = a.v(aVar);
        if (bx.e() && a.w(aVar) == 0) {
            this.x = 1;
        } else {
            this.x = a.w(aVar);
        }
        this.y = a.x(aVar);
        this.z = a.y(aVar);
        this.A = a.z(aVar);
        this.B = a.A(aVar);
        this.C = a.B(aVar);
        this.E = a.C(aVar);
        if (!this.E) {
            this.E = au.a(str);
        } else if (!StringUtils.isEmpty(aVar.H)) {
            this.H = aVar.H;
            au.b(str, aVar.H);
        }
        this.D = a.D(aVar);
        this.G = a.E(aVar);
    }

    public int a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue() : this.b;
    }

    public long b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dd", new Object[]{this})).longValue() : this.c;
    }

    public boolean C() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3c5ab4e", new Object[]{this})).booleanValue() : this.e;
    }

    public String c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this}) : this.f11775a;
    }

    public int d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("596b2de", new Object[]{this})).intValue() : this.g;
    }

    public boolean e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue() : this.h;
    }

    public boolean f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[]{this})).booleanValue() : this.f;
    }

    public long g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5c0f962", new Object[]{this})).longValue() : this.i;
    }

    public String h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("5d9eff91", new Object[]{this}) : this.j;
    }

    public int i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5dd2863", new Object[]{this})).intValue() : this.k;
    }

    public String E() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f9567bd4", new Object[]{this}) : this.F;
    }

    public dkt j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (dkt) ipChange.ipc$dispatch("54428a48", new Object[]{this}) : this.n;
    }

    public o k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (o) ipChange.ipc$dispatch("a4cbda27", new Object[]{this}) : this.l;
    }

    public boolean l() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6076ef7", new Object[]{this})).booleanValue() : this.m;
    }

    public q m() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (q) ipChange.ipc$dispatch("727d59e7", new Object[]{this}) : this.p;
    }

    public boolean n() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6239df9", new Object[]{this})).booleanValue() : this.o;
    }

    public boolean o() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("631b57a", new Object[]{this})).booleanValue() : this.q;
    }

    public DXVideoControlConfig<fxw> p() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXVideoControlConfig) ipChange.ipc$dispatch("b512f4fc", new Object[]{this}) : this.r;
    }

    public boolean q() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("64de47c", new Object[]{this})).booleanValue() : this.s;
    }

    public int r() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("65bfbec", new Object[]{this})).intValue() : this.t;
    }

    public boolean y() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6bea084", new Object[]{this})).booleanValue() : this.A.b();
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            a(z, false);
        }
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else {
            this.A.a(i);
        }
    }

    public void a(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c194ce8", new Object[]{this, new Boolean(z), new Boolean(z2)});
            return;
        }
        this.A.a(z);
        this.A.b(z2);
    }

    public com.taobao.android.dinamicx.model.f z() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.dinamicx.model.f) ipChange.ipc$dispatch("9add4e85", new Object[]{this}) : this.A;
    }

    public esd B() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (esd) ipChange.ipc$dispatch("208143e7", new Object[]{this}) : this.D;
    }

    public boolean s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("66a137e", new Object[]{this})).booleanValue();
        }
        if (!bx.g()) {
            return this.u;
        }
        return false;
    }

    public boolean D() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3d3c2cf", new Object[]{this})).booleanValue() : this.E;
    }

    public ImageQuality t() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ImageQuality) ipChange.ipc$dispatch("39355def", new Object[]{this}) : this.z;
    }

    public boolean A() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3a97c4c", new Object[]{this})).booleanValue() : this.C;
    }

    public boolean u() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6864280", new Object[]{this})).booleanValue() : this.v;
    }

    public boolean v() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6945a01", new Object[]{this})).booleanValue() : this.w;
    }

    public int w() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6a27171", new Object[]{this})).intValue() : this.x;
    }

    public String x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c5faa981", new Object[]{this});
        }
        if (StringUtils.isEmpty(this.y)) {
            this.y = DX_DEFAULT_SUB_BIZTYPE;
        }
        return this.y;
    }

    /* loaded from: classes.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private boolean A;
        private esd D;
        private boolean E;
        private String F;
        public String H;

        /* renamed from: a  reason: collision with root package name */
        public boolean f11776a;
        private String b;
        private int c;
        private int d;
        private boolean e;
        private long f;
        private int g;
        private boolean h;
        private long i;
        private String j;
        private int k;
        private dkt l;
        private o m;
        private boolean n;
        private bm o;
        private boolean p;
        private ImageQuality q;
        private DXVideoControlConfig<fxw> s;
        private int u;
        private boolean w;
        private int x;
        private boolean y;
        private boolean r = true;
        private boolean t = false;
        private boolean v = true;
        private String z = DXEngineConfig.DX_DEFAULT_SUB_BIZTYPE;
        private final com.taobao.android.dinamicx.model.f B = new com.taobao.android.dinamicx.model.f();
        private boolean C = false;
        private int G = 0;

        static {
            kge.a(1329324354);
        }

        public static /* synthetic */ boolean A(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f0c4d453", new Object[]{aVar})).booleanValue() : aVar.A;
        }

        public static /* synthetic */ boolean B(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("344ff214", new Object[]{aVar})).booleanValue() : aVar.C;
        }

        public static /* synthetic */ boolean C(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("77db0fd5", new Object[]{aVar})).booleanValue() : aVar.E;
        }

        public static /* synthetic */ esd D(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (esd) ipChange.ipc$dispatch("2cb0c5fe", new Object[]{aVar}) : aVar.D;
        }

        public static /* synthetic */ int E(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("fef14b46", new Object[]{aVar})).intValue() : aVar.G;
        }

        public static /* synthetic */ int a(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("62288c62", new Object[]{aVar})).intValue() : aVar.c;
        }

        public static /* synthetic */ long b(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a5b3aa24", new Object[]{aVar})).longValue() : aVar.f;
        }

        public static /* synthetic */ int c(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("e93ec7e4", new Object[]{aVar})).intValue() : aVar.d;
        }

        public static /* synthetic */ boolean d(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("2cc9e5b6", new Object[]{aVar})).booleanValue() : aVar.e;
        }

        public static /* synthetic */ int e(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("70550366", new Object[]{aVar})).intValue() : aVar.g;
        }

        public static /* synthetic */ boolean f(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b3e02138", new Object[]{aVar})).booleanValue() : aVar.h;
        }

        public static /* synthetic */ long g(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("f76b3ee9", new Object[]{aVar})).longValue() : aVar.i;
        }

        public static /* synthetic */ int h(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("3af65ca9", new Object[]{aVar})).intValue() : aVar.k;
        }

        public static /* synthetic */ String i(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("626bd709", new Object[]{aVar}) : aVar.j;
        }

        public static /* synthetic */ String j(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("fed9d368", new Object[]{aVar}) : aVar.F;
        }

        public static /* synthetic */ dkt k(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (dkt) ipChange.ipc$dispatch("a4cebb40", new Object[]{aVar}) : aVar.l;
        }

        public static /* synthetic */ o l(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (o) ipChange.ipc$dispatch("5caca86f", new Object[]{aVar}) : aVar.m;
        }

        public static /* synthetic */ boolean m(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("8cadf17f", new Object[]{aVar})).booleanValue() : aVar.n;
        }

        public static /* synthetic */ bm n(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (bm) ipChange.ipc$dispatch("964b0f2b", new Object[]{aVar}) : aVar.o;
        }

        public static /* synthetic */ boolean o(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("13c42d01", new Object[]{aVar})).booleanValue() : aVar.p;
        }

        public static /* synthetic */ boolean p(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("574f4ac2", new Object[]{aVar})).booleanValue() : aVar.r;
        }

        public static /* synthetic */ DXVideoControlConfig q(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (DXVideoControlConfig) ipChange.ipc$dispatch("4bc55884", new Object[]{aVar}) : aVar.s;
        }

        public static /* synthetic */ boolean r(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("de658644", new Object[]{aVar})).booleanValue() : aVar.t;
        }

        public static /* synthetic */ int s(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("21f0a3f4", new Object[]{aVar})).intValue() : aVar.u;
        }

        public static /* synthetic */ boolean t(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("657bc1c6", new Object[]{aVar})).booleanValue() : aVar.v;
        }

        public static /* synthetic */ boolean u(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a906df87", new Object[]{aVar})).booleanValue() : aVar.y;
        }

        public static /* synthetic */ boolean v(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ec91fd48", new Object[]{aVar})).booleanValue() : aVar.w;
        }

        public static /* synthetic */ int w(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("301d1af8", new Object[]{aVar})).intValue() : aVar.x;
        }

        public static /* synthetic */ String x(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8cdda09a", new Object[]{aVar}) : aVar.z;
        }

        public static /* synthetic */ ImageQuality y(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (ImageQuality) ipChange.ipc$dispatch("e768757b", new Object[]{aVar}) : aVar.q;
        }

        public static /* synthetic */ com.taobao.android.dinamicx.model.f z(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (com.taobao.android.dinamicx.model.f) ipChange.ipc$dispatch("dd2cb34c", new Object[]{aVar}) : aVar.B;
        }

        public a(String str) {
            this.x = 0;
            this.b = str;
            if (!StringUtils.isEmpty(str)) {
                this.b = str;
            } else {
                this.b = DXEngineConfig.DX_DEFAULT_BIZTYPE;
            }
            this.f = System.currentTimeMillis();
            this.d = 1;
            this.e = false;
            this.g = 100;
            this.h = true;
            this.c = DXEngineConfig.DEFAULT_PERIOD_TIME;
            this.f11776a = false;
            this.i = 100L;
            this.k = -1;
            this.j = "";
            this.F = null;
            this.m = null;
            this.u = 1;
            this.w = false;
            this.x = 0;
            this.q = null;
            this.E = false;
            this.H = "";
            this.D = new esd();
        }

        public a a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("dfebf5e2", new Object[]{this, new Integer(i)});
            }
            this.c = i;
            return this;
        }

        public a b(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("237713a3", new Object[]{this, new Integer(i)});
            }
            this.d = i;
            return this;
        }

        public a a(bv bvVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("f39d094d", new Object[]{this, bvVar});
            }
            this.B.a(bvVar);
            return this;
        }

        public a c(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("67023164", new Object[]{this, new Integer(i)});
            }
            this.g = i;
            return this;
        }

        public a a(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("b660b5b1", new Object[]{this, new Boolean(z)});
            }
            this.h = z;
            return this;
        }

        public a c(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("712bf69", new Object[]{this, str});
            }
            this.H = str;
            return this;
        }

        public a a(ImageQuality imageQuality) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("298724c1", new Object[]{this, imageQuality});
            }
            this.q = imageQuality;
            return this;
        }

        public a b(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("f9ebd372", new Object[]{this, new Boolean(z)});
            }
            this.f11776a = z;
            return this;
        }

        public a d(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("aa8d4f25", new Object[]{this, new Integer(i)});
            }
            this.k = i;
            return this;
        }

        public a a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("ce36c6ab", new Object[]{this, str});
            }
            this.j = str;
            return this;
        }

        public a i(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("d2b9a3b9", new Object[]{this, new Boolean(z)});
            }
            this.C = z;
            return this;
        }

        public a a(dkt dktVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("df661092", new Object[]{this, dktVar});
            }
            this.l = dktVar;
            return this;
        }

        public a a(o oVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("678d74a0", new Object[]{this, oVar});
            }
            this.m = oVar;
            return this;
        }

        public a a(esd esdVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("b7a4bf3b", new Object[]{this, esdVar});
            }
            this.D = esdVar;
            return this;
        }

        public a a(boolean z, boolean z2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("dfa275b5", new Object[]{this, new Boolean(z), new Boolean(z2)});
            }
            this.B.a(z);
            this.B.b(z2);
            return this;
        }

        public a c(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("3d76f133", new Object[]{this, new Boolean(z)});
            }
            this.n = z;
            return this;
        }

        public a d(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("81020ef4", new Object[]{this, new Boolean(z)});
            }
            this.p = z;
            return this;
        }

        public a e(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("c48d2cb5", new Object[]{this, new Boolean(z)});
            }
            this.r = z;
            return this;
        }

        public a a(DXVideoControlConfig<fxw> dXVideoControlConfig) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("9596ab90", new Object[]{this, dXVideoControlConfig});
            }
            this.s = dXVideoControlConfig;
            return this;
        }

        public a f(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("8184a76", new Object[]{this, new Boolean(z)});
            }
            this.t = z;
            return this;
        }

        public a e(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("ee186ce6", new Object[]{this, new Integer(i)});
            }
            this.u = i;
            return this;
        }

        public a g(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("4ba36837", new Object[]{this, new Boolean(z)});
            }
            this.v = z;
            return this;
        }

        public a h(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("8f2e85f8", new Object[]{this, new Boolean(z)});
            }
            this.w = z;
            return this;
        }

        public a f(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("31a38aa7", new Object[]{this, new Integer(i)});
            }
            this.x = i;
            return this;
        }

        public a j(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("1644c17a", new Object[]{this, new Boolean(z)});
            }
            this.E = z;
            return this;
        }

        public a b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("6aa4c30a", new Object[]{this, str});
            }
            this.z = str;
            return this;
        }

        public a g(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("752ea868", new Object[]{this, new Integer(i)});
            }
            this.G = i;
            return this;
        }

        public DXEngineConfig a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (DXEngineConfig) ipChange.ipc$dispatch("3edbcd12", new Object[]{this}) : new DXEngineConfig(this.b, this);
        }
    }

    public int F() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("3eff1c0", new Object[]{this})).intValue() : this.G;
    }
}
