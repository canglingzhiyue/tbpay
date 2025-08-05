package tb;

import com.alibaba.android.aura.datamodel.render.AURARenderComponentContainer;
import com.alibaba.android.aura.o;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes2.dex */
public class asy {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-862775891);
    }

    public boolean a(AURARenderComponentContainer aURARenderComponentContainer) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d194ca20", new Object[]{this, aURARenderComponentContainer})).booleanValue() : aURARenderComponentContainer == null || aURARenderComponentContainer.isPreset || o.a.DX_PRESET_TEMPLATE_VERSION_STR.equals(aURARenderComponentContainer.version);
    }

    public boolean b(AURARenderComponentContainer aURARenderComponentContainer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d26348a1", new Object[]{this, aURARenderComponentContainer})).booleanValue();
        }
        if (a(aURARenderComponentContainer)) {
            return false;
        }
        aURARenderComponentContainer.isPreset = true;
        aURARenderComponentContainer.version = o.a.DX_PRESET_TEMPLATE_VERSION_STR;
        return true;
    }
}
