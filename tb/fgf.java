package tb;

import com.alibaba.fastjson.annotation.JSONField;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes6.dex */
public class fgf extends jps<fgf> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private a c;
    private Map<String, String> d;

    static {
        kge.a(1533933531);
    }

    public fgf(String str) {
        this(str, "27659-tracker", "http://taobao.com/jstracker/android/ultron.html");
    }

    public fgf(String str, String str2, String str3) {
        super(str, str2, str3);
    }

    public fgf a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fgf) ipChange.ipc$dispatch("7c6f3aef", new Object[]{this, str});
        }
        this.c = new a(str);
        return this;
    }

    public a a(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("cac5c032", new Object[]{this, str, new Long(j)});
        }
        a aVar = this.c;
        if (aVar == null) {
            throw new IllegalStateException("请先调用name来创建Msg");
        }
        aVar.a(str, j);
        return this.c;
    }

    public fgf a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fgf) ipChange.ipc$dispatch("9539d265", new Object[]{this, str, str2});
        }
        if (str != null && str2 != null) {
            if (this.d == null) {
                this.d = new HashMap();
            }
            this.d.put(str, str2);
        }
        return this;
    }

    public a f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("c97c9d77", new Object[]{this}) : this.c;
    }

    public Map<String, String> g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("7212f323", new Object[]{this}) : this.d;
    }

    /* loaded from: classes6.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        @JSONField(name = "name")

        /* renamed from: a  reason: collision with root package name */
        private String f27923a;
        private Map<String, Long> b;

        static {
            kge.a(-2118508776);
        }

        public a(String str) {
            this.f27923a = str;
        }

        public a a(String str, long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("cac5c032", new Object[]{this, str, new Long(j)});
            }
            if (this.b == null) {
                this.b = new HashMap();
            }
            this.b.put(str, Long.valueOf(j));
            return this;
        }

        public String a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.f27923a;
        }

        public Map<String, Long> b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("6dbf0a5e", new Object[]{this}) : this.b;
        }
    }
}
