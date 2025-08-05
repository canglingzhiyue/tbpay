package tb;

import com.alibaba.android.aura.IAURAPluginCenter;
import com.alibaba.android.aura.datamodel.nextrpc.AURANextRPCEndpoint;
import com.alibaba.android.aura.nodemodel.AURAPluginContainerNodeModel;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* loaded from: classes4.dex */
public class duu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final String f27003a;
    private final AURAPluginContainerNodeModel b;
    private final IAURAPluginCenter[] c;
    private final AURANextRPCEndpoint d;
    private final AURANextRPCEndpoint e;
    private final AURANextRPCEndpoint f;
    private final Map<String, String> g;
    private final Map<String, String> h;

    static {
        kge.a(-1419925639);
    }

    public duu(a aVar) {
        this.f27003a = a.a(aVar);
        this.c = a.b(aVar);
        this.b = a.c(aVar);
        this.d = a.d(aVar);
        this.e = a.e(aVar);
        this.f = a.f(aVar);
        this.g = a.g(aVar);
        this.h = a.h(aVar);
    }

    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.f27003a;
    }

    public IAURAPluginCenter[] b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IAURAPluginCenter[]) ipChange.ipc$dispatch("2bd7e474", new Object[]{this}) : this.c;
    }

    public AURAPluginContainerNodeModel c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AURAPluginContainerNodeModel) ipChange.ipc$dispatch("30794f2c", new Object[]{this}) : this.b;
    }

    /* loaded from: classes4.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private String f27004a;
        private IAURAPluginCenter[] b;
        private AURAPluginContainerNodeModel c;
        private AURANextRPCEndpoint d;
        private AURANextRPCEndpoint e;
        private AURANextRPCEndpoint f;
        private Map<String, String> g;
        private Map<String, String> h;

        static {
            kge.a(-1010436784);
        }

        public static /* synthetic */ String a(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("2f498409", new Object[]{aVar}) : aVar.f27004a;
        }

        public static /* synthetic */ IAURAPluginCenter[] b(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (IAURAPluginCenter[]) ipChange.ipc$dispatch("57a5bdc3", new Object[]{aVar}) : aVar.b;
        }

        public static /* synthetic */ AURAPluginContainerNodeModel c(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (AURAPluginContainerNodeModel) ipChange.ipc$dispatch("14ebbdbb", new Object[]{aVar}) : aVar.c;
        }

        public static /* synthetic */ AURANextRPCEndpoint d(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (AURANextRPCEndpoint) ipChange.ipc$dispatch("1b1d4ebf", new Object[]{aVar}) : aVar.d;
        }

        public static /* synthetic */ AURANextRPCEndpoint e(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (AURANextRPCEndpoint) ipChange.ipc$dispatch("341ea05e", new Object[]{aVar}) : aVar.e;
        }

        public static /* synthetic */ AURANextRPCEndpoint f(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (AURANextRPCEndpoint) ipChange.ipc$dispatch("4d1ff1fd", new Object[]{aVar}) : aVar.f;
        }

        public static /* synthetic */ Map g(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("52bd3e72", new Object[]{aVar}) : aVar.g;
        }

        public static /* synthetic */ Map h(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("7c0d22f3", new Object[]{aVar}) : aVar.h;
        }

        public a a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("1aee5a33", new Object[]{this, str});
            }
            this.f27004a = str;
            return this;
        }

        public a a(IAURAPluginCenter[] iAURAPluginCenterArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("7382ac52", new Object[]{this, iAURAPluginCenterArr});
            }
            this.b = iAURAPluginCenterArr;
            return this;
        }

        public a a(AURAPluginContainerNodeModel aURAPluginContainerNodeModel) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("4e985bb", new Object[]{this, aURAPluginContainerNodeModel});
            }
            this.c = aURAPluginContainerNodeModel;
            return this;
        }

        public duu a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (duu) ipChange.ipc$dispatch("f03df9a", new Object[]{this});
            }
            if (this.c == null && this.f27004a == null) {
                throw new IllegalArgumentException("AURAConfigName and AURAPluginContainerNodeModel can not both NULL");
            }
            return new duu(this);
        }
    }
}
