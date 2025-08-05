package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public class dgt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private String f26739a;
    private int b;
    private int c;
    private int d;
    private Map<String, String> e;

    static {
        kge.a(977812445);
    }

    public dgt(a aVar) {
        this.f26739a = a.a(aVar);
        this.b = a.b(aVar);
        this.c = a.c(aVar);
        this.d = a.d(aVar);
        this.e = a.e(aVar);
    }

    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.f26739a;
    }

    /* loaded from: classes4.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private String f26740a;
        private int b = 3;
        private int c;
        private int d;
        private Map<String, String> e;

        static {
            kge.a(1134028212);
        }

        public static /* synthetic */ String a(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("1d021a96", new Object[]{aVar}) : aVar.f26740a;
        }

        public static /* synthetic */ int b(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("620f817e", new Object[]{aVar})).intValue() : aVar.b;
        }

        public static /* synthetic */ int c(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("bbeaebbf", new Object[]{aVar})).intValue() : aVar.c;
        }

        public static /* synthetic */ int d(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("15c65600", new Object[]{aVar})).intValue() : aVar.d;
        }

        public static /* synthetic */ Map e(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("681e3203", new Object[]{aVar}) : aVar.e;
        }

        public a(String str) {
            this.f26740a = str;
        }

        public a a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("d08c9b7d", new Object[]{this, new Integer(i)});
            }
            this.b = i;
            return this;
        }

        public a b(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("2a6805be", new Object[]{this, new Integer(i)});
            }
            this.c = i;
            return this;
        }

        public a c(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("84436fff", new Object[]{this, new Integer(i)});
            }
            this.d = i;
            return this;
        }

        public a a(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("2aab2ebc", new Object[]{this, str, str2});
            }
            if (this.e == null) {
                this.e = new HashMap(16);
            }
            this.e.put(str, str2);
            return this;
        }

        public dgt a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (dgt) ipChange.ipc$dispatch("f03aaed", new Object[]{this}) : new dgt(this);
        }
    }
}
