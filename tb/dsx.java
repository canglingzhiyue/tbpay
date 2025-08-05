package tb;

import com.alibaba.android.aura.IAURAPluginCenter;
import com.alibaba.android.aura.nodemodel.AURAPluginContainerNodeModel;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;

/* loaded from: classes4.dex */
public abstract class dsx {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1293126074);
    }

    public String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this});
        }
        return null;
    }

    public AURAPluginContainerNodeModel b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AURAPluginContainerNodeModel) ipChange.ipc$dispatch("3f27bfab", new Object[]{this});
        }
        return null;
    }

    public IAURAPluginCenter[] c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IAURAPluginCenter[]) ipChange.ipc$dispatch("2b617e75", new Object[]{this});
        }
        return null;
    }

    public HashMap<String, Object> d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("9d11238e", new Object[]{this});
        }
        return null;
    }
}
