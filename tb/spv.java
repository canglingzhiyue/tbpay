package tb;

import android.net.Uri;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.FluidSDK;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.shareplayer.ISharePlayerService;
import java.util.HashMap;

/* loaded from: classes5.dex */
public class spv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public boolean f33833a;
    private final HashMap<String, spw> b = new HashMap<>();
    private boolean c = false;
    private boolean d = false;
    private boolean e = false;

    /* loaded from: classes5.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static final spv f33834a;

        static {
            kge.a(-1559157257);
            f33834a = new spv();
        }

        public static /* synthetic */ spv a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (spv) ipChange.ipc$dispatch("f0a9e85", new Object[0]) : f33834a;
        }
    }

    static {
        kge.a(-547355903);
    }

    public static spv a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (spv) ipChange.ipc$dispatch("f0a9e85", new Object[0]) : a.a();
    }

    public boolean a(String str, String str2) {
        spw b;
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d9378d80", new Object[]{this, str, str2})).booleanValue() : e(str) && (b = b(str)) != null && StringUtils.equals(b.c(), str2);
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else if (!this.c) {
        } else {
            boolean e = e(str);
            if (c(str) == null || !e) {
                return;
            }
            b();
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        HashMap<String, spw> hashMap = this.b;
        if (hashMap == null) {
            return;
        }
        hashMap.clear();
    }

    public boolean a(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8fc4079e", new Object[]{this, fluidContext})).booleanValue();
        }
        if (this.c) {
            return ((ISharePlayerService) fluidContext.getService(ISharePlayerService.class)).isEnableInnerSharePlayer();
        }
        return false;
    }

    public spw b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (spw) ipChange.ipc$dispatch("7d21f339", new Object[]{this, str});
        }
        HashMap<String, spw> hashMap = this.b;
        if (hashMap != null && hashMap.size() > 0) {
            return this.b.get(str);
        }
        return null;
    }

    public snv c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (snv) ipChange.ipc$dispatch("7dce9737", new Object[]{this, str});
        }
        spw g = g(str);
        if (g == null) {
            return null;
        }
        return g.a();
    }

    public boolean d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d23b17f9", new Object[]{this, str})).booleanValue();
        }
        if (!f(str)) {
            return false;
        }
        this.c = e();
        return this.c;
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue() : this.d;
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.d = z;
        }
    }

    public boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue() : this.e;
    }

    public void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
        } else {
            this.e = z;
        }
    }

    public boolean e(String str) {
        spw g;
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("1c6cb13a", new Object[]{this, str})).booleanValue() : this.c && (g = g(str)) != null && g.d();
    }

    public void a(sii siiVar, boolean z, boolean z2, boolean z3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f1abd0f", new Object[]{this, siiVar, new Boolean(z), new Boolean(z2), new Boolean(z3)});
        } else if (!this.c || !d() || ((ISharePlayerService) siiVar.z().getService(ISharePlayerService.class)).isHasShowInnerSharePlayerPV() || !z || !z2 || siiVar == null) {
        } else {
            if (z3) {
                siiVar.c(false);
            }
            this.f33833a = true;
            a().b(false);
        }
    }

    public void a(sii siiVar, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76ae4265", new Object[]{this, siiVar, new Boolean(z), new Boolean(z2)});
        } else if (!this.c || !d() || ((ISharePlayerService) siiVar.z().getService(ISharePlayerService.class)).isHasShowInnerSharePlayerPV() || !z || !z2 || siiVar == null) {
        } else {
            siiVar.U();
            siiVar.b_(true);
            siiVar.S();
        }
    }

    public String a(FluidContext fluidContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("63b6da3c", new Object[]{this, fluidContext, str});
        }
        if (!this.c || StringUtils.isEmpty(str)) {
            return str;
        }
        String queryParameter = Uri.parse(str).getQueryParameter("id");
        String str2 = "snapshot" + queryParameter;
        String str3 = str + "&prePlayerMapKey=" + str2;
        a(fluidContext, str2, queryParameter);
        return str3;
    }

    public void a(String str, spw spwVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f1e14a8", new Object[]{this, str, spwVar});
            return;
        }
        HashMap<String, spw> hashMap = this.b;
        if (hashMap == null) {
            return;
        }
        hashMap.put(str, spwVar);
    }

    private void a(FluidContext fluidContext, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7e4f7ae", new Object[]{this, fluidContext, str, str2});
            return;
        }
        spw innerSharePlayerObject = ((ISharePlayerService) fluidContext.getService(ISharePlayerService.class)).getInnerSharePlayerObject();
        if (innerSharePlayerObject == null || !StringUtils.equals(innerSharePlayerObject.c(), str2)) {
            return;
        }
        innerSharePlayerObject.a(true);
        a(str, innerSharePlayerObject);
    }

    private boolean f(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("669e4a7b", new Object[]{this, str})).booleanValue() : !StringUtils.isEmpty(str) && !StringUtils.isEmpty(Uri.parse(str).getQueryParameter("id"));
    }

    private spw g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (spw) ipChange.ipc$dispatch("80814d54", new Object[]{this, str});
        }
        if (!StringUtils.isEmpty(str)) {
            return b(str);
        }
        return null;
    }

    private boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue();
        }
        boolean orangeBooleanConfig = FluidSDK.getRemoteConfigAdapter().getOrangeBooleanConfig("enableSharePlayerMH", true);
        ogg.b("卖货合集续播开关：orange开关打开：" + orangeBooleanConfig);
        return orangeBooleanConfig;
    }
}
