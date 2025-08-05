package com.alibaba.android.aura.plugincenter;

import com.alibaba.android.aura.IAURAInputField;
import com.alibaba.android.aura.IAURAPluginCenter;
import com.alibaba.android.aura.n;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.AbstractMap;
import java.util.List;
import java.util.Map;
import tb.aqn;
import tb.ark;
import tb.kge;

/* loaded from: classes2.dex */
public abstract class AbsAURAPluginCenter implements IAURAPluginCenter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1237749887);
        kge.a(-1098531831);
    }

    public Map<String, Class<? extends aqn>> branchConditionMap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("df0580bf", new Object[]{this});
        }
        return null;
    }

    @Override // com.alibaba.android.aura.IAURAPluginCenter
    public Map<String, Class<? extends ark>> extensionImplMap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("c4a7df19", new Object[]{this});
        }
        return null;
    }

    @Override // com.alibaba.android.aura.IAURAPluginCenter
    public Map<String, AbstractMap.SimpleEntry<String, Class<? extends ark>>> extensionMap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("1b59c5d9", new Object[]{this});
        }
        return null;
    }

    @Override // com.alibaba.android.aura.IAURAPluginCenter
    public Map<Class, List<Class<? extends IAURAInputField>>> inputFieldsTargetClass() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("994890c0", new Object[]{this});
        }
        return null;
    }

    public Map<String, List<String>> parentCodesOfExtensionMap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("4fd0534c", new Object[]{this});
        }
        return null;
    }

    @Override // com.alibaba.android.aura.IAURAPluginCenter
    public Map<String, Class<? extends n>> serviceMap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("e7e56123", new Object[]{this});
        }
        return null;
    }
}
