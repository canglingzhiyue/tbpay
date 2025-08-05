package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* loaded from: classes4.dex */
public class ego {

    /* renamed from: a  reason: collision with root package name */
    public String f27293a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public Map<String, String> i;

    static {
        kge.a(-1004266199);
    }

    private ego(a aVar) {
        this.f27293a = aVar.f27294a;
        this.b = aVar.b;
        this.c = aVar.c;
        this.d = aVar.d;
        this.e = aVar.e;
        this.f = aVar.f;
        this.g = aVar.g;
        this.h = aVar.h;
        this.i = aVar.i;
        emu.a("com.taobao.android.detail.core.model.datamodel.track.MonitorInfo");
    }

    /* loaded from: classes4.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public String f27294a;
        public String b;
        public String c;
        public String d;
        public String e;
        public String f;
        public String g;
        public String h;
        public Map<String, String> i;

        static {
            kge.a(-330056960);
        }

        public a a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("1bdb2f8a", new Object[]{this, str});
            }
            this.b = str;
            return this;
        }

        public a b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("a40b6f69", new Object[]{this, str});
            }
            this.c = str;
            return this;
        }

        public a c(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("2c3baf48", new Object[]{this, str});
            }
            this.d = str;
            return this;
        }

        public a d(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("b46bef27", new Object[]{this, str});
            }
            this.e = str;
            return this;
        }

        public a e(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("3c9c2f06", new Object[]{this, str});
            }
            this.f = str;
            return this;
        }

        public a f(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("c4cc6ee5", new Object[]{this, str});
            }
            this.g = str;
            return this;
        }

        public a g(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("4cfcaec4", new Object[]{this, str});
            }
            this.h = str;
            return this;
        }

        public a a(Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("b717e1ff", new Object[]{this, map});
            }
            this.i = map;
            return this;
        }

        public ego a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (ego) ipChange.ipc$dispatch("f041eb1", new Object[]{this}) : new ego(this);
        }
    }
}
