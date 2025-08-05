package tb;

import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.festival.jsbridge.AliFestivalWVPlugin;

/* loaded from: classes2.dex */
public class arc implements ard {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String AURA_LOGGER = "AURA_LOGGER";

    /* renamed from: a  reason: collision with root package name */
    private static final arg f25524a;

    /* loaded from: classes2.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static final arc f25526a;

        static {
            kge.a(-662499138);
            f25526a = new arc();
        }

        public static /* synthetic */ arc a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (arc) ipChange.ipc$dispatch("f02750c", new Object[0]) : f25526a;
        }
    }

    static {
        kge.a(-1634652665);
        kge.a(-426691800);
        f25524a = new arg();
    }

    public static ard a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ard) ipChange.ipc$dispatch("f02752b", new Object[0]) : b.a();
    }

    private arc() {
    }

    public static void a(are areVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0906404", new Object[]{areVar});
        } else {
            f25524a.a(areVar);
        }
    }

    @Override // tb.are
    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            f25524a.a(str);
        }
    }

    @Override // tb.are
    public void a(String str, arf arfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("207b4e2d", new Object[]{this, str, arfVar});
        } else if (baw.a()) {
            f25524a.a(str, arfVar);
        } else {
            f25524a.b(str, arfVar);
        }
    }

    @Override // tb.are
    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else {
            f25524a.b(str);
        }
    }

    @Override // tb.are
    public void b(String str, arf arfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3564166e", new Object[]{this, str, arfVar});
        } else {
            f25524a.b(str, arfVar);
        }
    }

    @Override // tb.are
    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
        } else {
            f25524a.a(str, str2);
        }
    }

    @Override // tb.ard
    @Deprecated
    public void a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("929ad046", new Object[]{this, str, str2, str3});
        } else {
            f25524a.a(str3, d(str, str2, str3));
        }
    }

    @Override // tb.ard
    @Deprecated
    public void b(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3509d07", new Object[]{this, str, str2, str3});
        } else {
            f25524a.a(str3, d(str, str2, str3));
        }
    }

    @Override // tb.ard
    @Deprecated
    public void e(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d572034a", new Object[]{this, str, str2, str3});
        } else {
            f25524a.a(str3, d(str, str2, str3));
        }
    }

    @Override // tb.ard
    @Deprecated
    public void c(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b40669c8", new Object[]{this, str, str2, str3});
        } else {
            f25524a.b(str3, d(str, str2, str3));
        }
    }

    private arf d(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (arf) ipChange.ipc$dispatch("5a423428", new Object[]{this, str, str2, str3}) : a.a().a("AURA/other").a(AliFestivalWVPlugin.PARAMS_MODULE_NAME, str).a("functionName", str2).a("message", str3).b();
    }

    /* loaded from: classes2.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final arf f25525a = new arf();

        static {
            kge.a(1383894526);
            kge.a(-9039085);
        }

        private a() {
        }

        public static a a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("583917af", new Object[0]) : new a();
        }

        public a a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("159d5b25", new Object[]{this, str});
            }
            this.f25525a.a(str);
            return this;
        }

        public a b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("9dcd9b04", new Object[]{this, str});
            }
            this.f25525a.b(str);
            return this;
        }

        public a c(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("25fddae3", new Object[]{this, str});
            }
            this.f25525a.c(str);
            return this;
        }

        public a d(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("ae2e1ac2", new Object[]{this, str});
            }
            this.f25525a.d(str);
            return this;
        }

        public a a(String str, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("5c09db49", new Object[]{this, str, obj});
            }
            if ((obj instanceof View) && baw.a()) {
                throw new IllegalArgumentException("请不要传入View，以免发生死循环");
            }
            this.f25525a.a(str, obj);
            return this;
        }

        public a a(String str, JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("dff20fd9", new Object[]{this, str, jSONObject});
            }
            this.f25525a.a(str, jSONObject);
            return this;
        }

        public a a(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("261fed1b", new Object[]{this, str, str2});
            }
            this.f25525a.a(str, str2);
            return this;
        }

        public a a(String str, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("3df18075", new Object[]{this, str, new Boolean(z)});
            }
            this.f25525a.a(str, String.valueOf(z));
            return this;
        }

        public a a(String str, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("bb258526", new Object[]{this, str, new Integer(i)});
            }
            this.f25525a.a(str, String.valueOf(i));
            return this;
        }

        public a a(String str, long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("c2d72a85", new Object[]{this, str, new Long(j)});
            }
            this.f25525a.a(str, String.valueOf(j));
            return this;
        }

        public arf b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (arf) ipChange.ipc$dispatch("16b41ac8", new Object[]{this}) : this.f25525a;
        }
    }
}
