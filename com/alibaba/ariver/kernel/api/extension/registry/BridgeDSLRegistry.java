package com.alibaba.ariver.kernel.api.extension.registry;

import com.alibaba.ariver.kernel.api.extension.bridge.BridgeDSL;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;
import tb.kge;

/* loaded from: classes2.dex */
public class BridgeDSLRegistry {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private List<BridgeDSL> f2903a;

    static {
        kge.a(-425720013);
    }

    public void register(List<BridgeDSL> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("536da29b", new Object[]{this, list});
            return;
        }
        if (this.f2903a == null) {
            this.f2903a = new ArrayList();
        }
        this.f2903a.addAll(list);
    }

    public void unRegister(BridgeDSL bridgeDSL) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("758f07b0", new Object[]{this, bridgeDSL});
            return;
        }
        List<BridgeDSL> list = this.f2903a;
        if (list == null) {
            return;
        }
        list.remove(bridgeDSL);
    }

    public List<BridgeDSL> getBridgeDSLs() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("d0258f4b", new Object[]{this});
        }
        List<BridgeDSL> list = this.f2903a;
        return list != null ? list : new ArrayList();
    }
}
