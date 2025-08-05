package com.taobao.tao.image;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.util.TaobaoImageUrlStrategy;
import java.util.Map;

/* loaded from: classes.dex */
public class ImageStrategyConfig {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String BALA = "bala";
    public static final String DEFAULT = "default";
    public static final String DETAIL = "detail";
    public static final String GUANGGUANG = "guangguang";
    public static final String HOME = "home";
    public static final String SEARCH = "search";
    public static final String SHOP = "shop";
    public static final String TBCHANNEL = "tbchannel";
    public static final String WEAPP = "weapp";
    public static final String WEAPPSHARPEN = "weappsharpen";
    public static final String WEITAO = "weitao";

    /* renamed from: a  reason: collision with root package name */
    public static boolean f20621a;
    public static boolean b;
    public static boolean c;
    public boolean d;
    public String e;
    public String f;
    public String g;
    public int h;
    public int i;
    public int j;
    public boolean k;
    public boolean l;
    public TaobaoImageUrlStrategy.CutType m;
    public Boolean n;
    public Boolean o;
    public Boolean p;
    public Boolean q;
    public Boolean r;
    public TaobaoImageUrlStrategy.ImageQuality s;
    public TaobaoImageUrlStrategy.ImageBlur t;
    public Boolean u;
    public SizeLimitType v;
    public Map<String, String> w;

    /* loaded from: classes8.dex */
    public enum SizeLimitType {
        WIDTH_LIMIT,
        HEIGHT_LIMIT,
        ALL_LIMIT
    }

    public static a a(String str, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("ca654fbb", new Object[]{str, new Integer(i)}) : new a(str, i);
    }

    public static a a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("908ee5fa", new Object[]{str}) : new a(str, 0);
    }

    public static a a(String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("99757a70", new Object[]{str, str2}) : new a(str, str2);
    }

    private ImageStrategyConfig(a aVar) {
        this.e = aVar.d;
        this.f = aVar.c;
        this.h = aVar.f;
        this.d = aVar.f20622a;
        this.i = aVar.g;
        this.j = aVar.h;
        this.m = aVar.i;
        this.n = aVar.j;
        this.l = aVar.p;
        this.o = aVar.k;
        this.p = aVar.l;
        this.q = aVar.m;
        this.r = aVar.n;
        this.s = aVar.q;
        this.u = Boolean.valueOf(aVar.b);
        this.g = aVar.e;
        this.w = aVar.t;
        if (aVar.o != null) {
            this.k = aVar.o.booleanValue();
        }
        this.v = aVar.s;
        SizeLimitType sizeLimitType = this.v;
        if (sizeLimitType == null) {
            this.v = SizeLimitType.ALL_LIMIT;
        } else if (sizeLimitType == SizeLimitType.WIDTH_LIMIT) {
            this.j = 10000;
            this.i = 0;
        } else if (this.v == SizeLimitType.HEIGHT_LIMIT) {
            this.j = 0;
            this.i = 10000;
        }
        this.t = aVar.r;
    }

    public final String toString() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this}) : String.valueOf(this.h);
    }

    public String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder(300);
        sb.append("ImageStrategyConfig@");
        sb.append(hashCode());
        sb.append("\n");
        sb.append("bizName:");
        sb.append(this.e);
        sb.append("\n");
        sb.append("bizId:");
        sb.append(this.h);
        sb.append("\n");
        sb.append("skipped:");
        sb.append(this.d);
        sb.append("\n");
        sb.append("finalWidth:");
        sb.append(this.i);
        sb.append("\n");
        sb.append("finalHeight:");
        sb.append(this.j);
        sb.append("\n");
        sb.append("cutType:");
        sb.append(this.m);
        sb.append("\n");
        sb.append("enabledWebP:");
        sb.append(this.n);
        sb.append("\n");
        sb.append("enabledQuality:");
        sb.append(this.o);
        sb.append("\n");
        sb.append("enabledSharpen:");
        sb.append(this.p);
        sb.append("\n");
        sb.append("enabledMergeDomain:");
        sb.append(this.q);
        sb.append("\n");
        sb.append("enabledLevelModel:");
        sb.append(this.r);
        sb.append("\n");
        sb.append("finalImageQuality:");
        sb.append(this.s);
        sb.append("\n");
        sb.append("forcedWebPOn:");
        sb.append(this.k);
        sb.append("\n");
        sb.append("sizeLimitType:");
        sb.append(this.v);
        return sb.toString();
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : this.d;
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue() : this.l;
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.l = z;
        }
    }

    public String d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("43881515", new Object[]{this}) : this.e;
    }

    public int e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5a4ca5f", new Object[]{this})).intValue() : this.h;
    }

    public String f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("50938a53", new Object[]{this}) : this.g;
    }

    public Map<String, String> g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("7212f323", new Object[]{this}) : this.w;
    }

    public String h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("5d9eff91", new Object[]{this}) : this.f;
    }

    public int i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5dd2863", new Object[]{this})).intValue() : this.i;
    }

    public int j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5eb3fe4", new Object[]{this})).intValue() : this.j;
    }

    public TaobaoImageUrlStrategy.CutType k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TaobaoImageUrlStrategy.CutType) ipChange.ipc$dispatch("c422d2f9", new Object[]{this}) : this.m;
    }

    public Boolean l() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Boolean) ipChange.ipc$dispatch("8b9bc9b0", new Object[]{this}) : this.n;
    }

    public boolean m() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6158678", new Object[]{this})).booleanValue() : this.k;
    }

    public Boolean n() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Boolean) ipChange.ipc$dispatch("1ffefc32", new Object[]{this}) : this.o;
    }

    public Boolean o() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Boolean) ipChange.ipc$dispatch("6a309573", new Object[]{this}) : this.p;
    }

    public Boolean p() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Boolean) ipChange.ipc$dispatch("b4622eb4", new Object[]{this}) : this.q;
    }

    public Boolean q() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Boolean) ipChange.ipc$dispatch("fe93c7f5", new Object[]{this}) : this.r;
    }

    public Boolean r() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Boolean) ipChange.ipc$dispatch("48c56136", new Object[]{this}) : this.u;
    }

    public TaobaoImageUrlStrategy.ImageQuality s() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TaobaoImageUrlStrategy.ImageQuality) ipChange.ipc$dispatch("31256a05", new Object[]{this}) : this.s;
    }

    public SizeLimitType t() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SizeLimitType) ipChange.ipc$dispatch("aa2cc15e", new Object[]{this}) : this.v;
    }

    public TaobaoImageUrlStrategy.ImageBlur u() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TaobaoImageUrlStrategy.ImageBlur) ipChange.ipc$dispatch("f24d10a9", new Object[]{this}) : this.t;
    }

    /* loaded from: classes.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public boolean f20622a;
        public boolean b;
        public String c;
        public String d;
        public String e;
        public int f;
        public int g;
        public int h;
        public TaobaoImageUrlStrategy.CutType i;
        public Boolean j;
        public Boolean k;
        public Boolean l;
        public Boolean m;
        public Boolean n;
        public Boolean o;
        public boolean p;
        public TaobaoImageUrlStrategy.ImageQuality q;
        public TaobaoImageUrlStrategy.ImageBlur r;
        public SizeLimitType s;
        public Map<String, String> t;

        public a(String str, int i) {
            this.g = -1;
            this.h = -1;
            this.d = str;
            this.c = "";
            this.f = i;
        }

        public a(String str, String str2) {
            this.g = -1;
            this.h = -1;
            this.d = str;
            this.c = str2;
            this.f = 0;
        }

        public a a(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("d254de80", new Object[]{this, new Boolean(z)});
            }
            this.f20622a = z;
            return this;
        }

        public a b(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("d1de7881", new Object[]{this, new Boolean(z)});
            }
            this.b = z;
            return this;
        }

        public a a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("816476f1", new Object[]{this, new Integer(i)});
            }
            this.g = i;
            return this;
        }

        public a b(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("80ee10f2", new Object[]{this, new Integer(i)});
            }
            this.h = i;
            return this;
        }

        public a c(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("d1681282", new Object[]{this, new Boolean(z)});
            }
            this.j = Boolean.valueOf(z);
            return this;
        }

        public a a(SizeLimitType sizeLimitType) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("a8d93841", new Object[]{this, sizeLimitType});
            }
            this.s = sizeLimitType;
            return this;
        }

        public a d(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("d0f1ac83", new Object[]{this, new Boolean(z)});
            }
            this.o = Boolean.valueOf(z);
            return this;
        }

        public a e(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("d07b4684", new Object[]{this, new Boolean(z)});
            }
            this.k = Boolean.valueOf(z);
            return this;
        }

        public a f(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("d004e085", new Object[]{this, new Boolean(z)});
            }
            this.l = Boolean.valueOf(z);
            return this;
        }

        public a g(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("cf8e7a86", new Object[]{this, new Boolean(z)});
            }
            this.n = Boolean.valueOf(z);
            return this;
        }

        public a a(TaobaoImageUrlStrategy.ImageQuality imageQuality) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("55d22e59", new Object[]{this, imageQuality});
            }
            this.q = imageQuality;
            return this;
        }

        public a h(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("cf181487", new Object[]{this, new Boolean(z)});
            }
            this.p = z;
            return this;
        }

        public a a(TaobaoImageUrlStrategy.ImageBlur imageBlur) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("57eb8f95", new Object[]{this, imageBlur});
            }
            this.r = imageBlur;
            return this;
        }

        public ImageStrategyConfig a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (ImageStrategyConfig) ipChange.ipc$dispatch("95746ea1", new Object[]{this}) : new ImageStrategyConfig(this);
        }
    }
}
