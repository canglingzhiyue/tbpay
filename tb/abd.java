package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes2.dex */
public class abd extends aqz {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final String p;
    public final String q;
    public final String r;
    public final String s;

    static {
        kge.a(-1742382706);
    }

    private abd(String str, String str2, String str3, String str4, String str5, float f, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13) {
        super(str, str2, str3, str4, str5, "error", f, str6, str7, 0L, str12, str13);
        this.p = str8;
        this.q = str9;
        this.r = str10;
        this.s = str11;
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : !TextUtils.isEmpty(this.c) && !TextUtils.isEmpty(this.k) && !TextUtils.isEmpty(this.l) && !TextUtils.isEmpty(this.n);
    }

    /* loaded from: classes2.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private String b;
        private String c;
        private String d;
        private String e;
        private float f;
        private String i;
        private String j;
        private String k;
        private String l;
        private String m;
        private String n;

        /* renamed from: a  reason: collision with root package name */
        private String f25201a = "";
        private String g = "";
        private String h = "";

        static {
            kge.a(-1202142619);
        }

        public a a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("14bc5774", new Object[]{this, str});
            }
            this.f25201a = str;
            return this;
        }

        public a a(float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("b40b660e", new Object[]{this, new Float(f)});
            }
            this.f = f;
            return this;
        }

        public a b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("9cec9753", new Object[]{this, str});
            }
            this.g = str;
            return this;
        }

        public a c(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("251cd732", new Object[]{this, str});
            }
            this.h = str;
            return this;
        }

        public abd a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (abd) ipChange.ipc$dispatch("f02391b", new Object[]{this}) : new abd(this.f25201a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.k, this.l, this.m, this.n, this.i, this.j);
        }
    }
}
