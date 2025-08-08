package tb;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes2.dex */
public class abe extends aqz {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(227153910);
    }

    private abe(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        super(str, str2, str3, str4, str5, "api_perf", 1.0f, null, str6, 0L, str7, null);
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : !StringUtils.isEmpty(this.c) && !StringUtils.isEmpty(this.k) && !StringUtils.isEmpty(this.l) && !StringUtils.isEmpty(this.n);
    }

    /* loaded from: classes2.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private String f25202a = "";
        private String b;
        private String c;
        private String d;
        private String e;
        private String f;
        private String g;

        static {
            kge.a(-1880319795);
        }

        public a a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("14bccbd3", new Object[]{this, str});
            }
            this.f25202a = str;
            return this;
        }

        public a b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("9ced0bb2", new Object[]{this, str});
            }
            this.f = str;
            return this;
        }

        public a c(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("251d4b91", new Object[]{this, str});
            }
            this.g = str;
            return this;
        }

        public abe a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (abe) ipChange.ipc$dispatch("f02393a", new Object[]{this}) : new abe(this.f25202a, this.b, this.c, this.d, this.e, this.f, this.g);
        }
    }
}
