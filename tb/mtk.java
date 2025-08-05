package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.Map;

/* loaded from: classes7.dex */
public class mtk {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final int f31246a;
    public final String b;
    public final String c;
    public final Map<String, List<String>> d;
    public final Map<String, String> e;

    private mtk(a aVar) {
        this.f31246a = aVar.f31247a;
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
        return "SsrResponse{code=" + this.f31246a + ", retCode='" + this.b + "', message='" + this.c + "', headers=" + this.d + ", extProperties=" + this.e + '}';
    }

    /* loaded from: classes7.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public int f31247a = -1;
        public String b;
        public String c;
        public Map<String, List<String>> d;
        public Map<String, String> e;

        public a a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("e09b534a", new Object[]{this, new Integer(i)});
            }
            this.f31247a = i;
            return this;
        }

        public a a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("2a375493", new Object[]{this, str});
            }
            this.b = str;
            return this;
        }

        public a b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("b2679472", new Object[]{this, str});
            }
            this.c = str;
            return this;
        }

        public a a(Map<String, List<String>> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("c5740708", new Object[]{this, map});
            }
            this.d = map;
            return this;
        }

        public mtk a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (mtk) ipChange.ipc$dispatch("f07f1fa", new Object[]{this}) : new mtk(this);
        }
    }
}
