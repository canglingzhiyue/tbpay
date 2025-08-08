package tb;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.cachecleaner.autoclear.biz.data.BizTaskData;

/* loaded from: classes2.dex */
public class ara extends aqz {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final String p;
    public final Boolean q;
    public final Integer r;
    public final String s;
    public final String t;
    public final String u;
    public final String v;
    public final String w;
    public final String x;
    public final String y;
    public final String z;

    static {
        kge.a(-1946927379);
    }

    private ara(String str, String str2, String str3, String str4, String str5, float f, String str6, String str7, String str8, Boolean bool, Integer num, String str9, long j, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18) {
        super(str, str2, str3, str4, str5, BizTaskData.MANUAL_TIME, f, str6, str8, j, str17, str18);
        this.p = str7;
        this.q = bool;
        this.r = num;
        this.s = str9;
        this.t = str10;
        this.u = str11;
        this.v = str12;
        this.w = str13;
        this.x = str14;
        this.y = str15;
        this.z = str16;
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : !StringUtils.isEmpty(this.c) && !StringUtils.isEmpty(this.k) && !StringUtils.isEmpty(this.p) && !StringUtils.isEmpty(this.l) && !StringUtils.isEmpty(this.n);
    }

    /* loaded from: classes2.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private String f25522a = "";
        private String b;
        private String c;
        private String d;
        private String e;
        private float f;
        private String g;
        private String h;
        private long i;
        private String j;
        private String k;
        private String l;
        private Boolean m;
        private Integer n;
        private String o;
        private String p;
        private String q;
        private String r;
        private String s;
        private String t;
        private String u;
        private String v;

        static {
            kge.a(987224260);
        }

        public a a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("159c7267", new Object[]{this, str});
            }
            this.f25522a = str;
            return this;
        }

        public a a(float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("b4eb8101", new Object[]{this, new Float(f)});
            }
            this.f = f;
            return this;
        }

        public a b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("9dccb246", new Object[]{this, str});
            }
            this.g = str;
            return this;
        }

        public a c(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("25fcf225", new Object[]{this, str});
            }
            this.h = str;
            return this;
        }

        public a d(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("ae2d3204", new Object[]{this, str});
            }
            this.j = str;
            return this;
        }

        public a e(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("365d71e3", new Object[]{this, str});
            }
            this.l = str;
            return this;
        }

        public a a(Boolean bool) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("932c7e14", new Object[]{this, bool});
            }
            this.m = bool;
            return this;
        }

        public a f(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("be8db1c2", new Object[]{this, str});
            }
            this.r = str;
            return this;
        }

        public ara a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (ara) ipChange.ipc$dispatch("f0274ce", new Object[]{this}) : new ara(this.f25522a, this.b, this.c, this.d, this.e, this.f, this.g, this.l, this.h, this.m, this.n, this.o, this.i, this.p, this.q, this.r, this.s, this.t, this.u, this.v, this.j, this.k);
        }
    }
}
