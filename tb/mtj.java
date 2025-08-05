package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes7.dex */
public class mtj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f31244a;
    public final String b;
    public final Map<String, String> c;
    public final Map<String, String> d;
    public final int e;
    public String f;

    private mtj(a aVar) {
        this.f31244a = aVar.f31245a;
        this.b = aVar.b;
        this.c = aVar.c;
        this.d = aVar.d;
        this.e = aVar.e;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "SsrRequest{url='" + this.f31244a + "', method='" + this.b + "', headers=" + this.c + ", extProperties=" + this.d + ", timeoutMills=" + this.e + ", seqNo='" + this.f + "'}";
    }

    /* loaded from: classes7.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public String f31245a;
        public String b = "GET";
        public Map<String, String> c = new HashMap();
        public Map<String, String> d = new HashMap();
        public int e = 60000;

        public a a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("2a36e034", new Object[]{this, str});
            }
            if (str == null) {
                throw new IllegalArgumentException("url == null");
            }
            this.f31245a = str;
            return this;
        }

        public a a(Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("c57392a9", new Object[]{this, map});
            }
            this.c.clear();
            if (map != null) {
                this.c.putAll(map);
            }
            return this;
        }

        public a b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("b2672013", new Object[]{this, str});
            }
            this.b = str;
            return this;
        }

        public mtj a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (mtj) ipChange.ipc$dispatch("f07f1db", new Object[]{this});
            }
            if (this.f31245a == null) {
                throw new IllegalStateException("url == null");
            }
            return new mtj(this);
        }
    }
}
