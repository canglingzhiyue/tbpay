package tb;

import com.alibaba.fastjson.annotation.JSONField;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes9.dex */
public class xpq extends xpl<xpq> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private a c;
    private Map<String, String> d;

    static {
        kge.a(1052896964);
    }

    public xpq(String str, String str2, String str3) {
        super(str, str2, str3);
    }

    public xpq c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xpq) ipChange.ipc$dispatch("7dd0e3f9", new Object[]{this, str});
        }
        this.c = new a(str);
        return this;
    }

    public a a(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("ea00cefe", new Object[]{this, str, new Long(j)});
        }
        a aVar = this.c;
        if (aVar == null) {
            throw new IllegalStateException("请先调用name来创建Msg");
        }
        aVar.a(str, j);
        return this.c;
    }

    public xpq a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xpq) ipChange.ipc$dispatch("95422431", new Object[]{this, str, str2});
        }
        if (str != null && str2 != null) {
            if (this.d == null) {
                this.d = new HashMap();
            }
            this.d.put(str, str2);
        }
        return this;
    }

    public a g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("ca9575e2", new Object[]{this}) : this.c;
    }

    public Map<String, String> h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("3fbd54e4", new Object[]{this}) : this.d;
    }

    /* loaded from: classes9.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        @JSONField(name = "name")

        /* renamed from: a  reason: collision with root package name */
        private String f34461a;
        private Map<String, Long> b;

        static {
            kge.a(452360577);
        }

        public a(String str) {
            this.f34461a = str;
        }

        public a a(String str, long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("ea00cefe", new Object[]{this, str, new Long(j)});
            }
            if (this.b == null) {
                this.b = new HashMap();
            }
            this.b.put(str, Long.valueOf(j));
            return this;
        }

        public String a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.f34461a;
        }

        public Map<String, Long> b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("6dbf0a5e", new Object[]{this}) : this.b;
        }
    }
}
