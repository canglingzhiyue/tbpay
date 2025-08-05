package tb;

import com.alibaba.android.aura.AURATaobaoPurchasePluginCenter;
import com.alibaba.android.aura.IAURAPluginCenter;
import com.alibaba.android.aura.nodemodel.AURAPluginContainerNodeModel;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.purchase.preload.e;
import java.util.HashMap;

/* loaded from: classes6.dex */
public class icu extends dsx {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private HashMap<String, Object> f28912a;

    static {
        kge.a(2145528829);
    }

    public icu() {
    }

    public icu(HashMap<String, Object> hashMap) {
        this.f28912a = hashMap;
    }

    @Override // tb.dsx
    public AURAPluginContainerNodeModel b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AURAPluginContainerNodeModel) ipChange.ipc$dispatch("3f27bfab", new Object[]{this}) : e.a();
    }

    @Override // tb.dsx
    public IAURAPluginCenter[] c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IAURAPluginCenter[]) ipChange.ipc$dispatch("2b617e75", new Object[]{this}) : new IAURAPluginCenter[]{new AURATaobaoPurchasePluginCenter()};
    }

    @Override // tb.dsx
    public HashMap<String, Object> d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HashMap) ipChange.ipc$dispatch("9d11238e", new Object[]{this}) : this.f28912a;
    }
}
