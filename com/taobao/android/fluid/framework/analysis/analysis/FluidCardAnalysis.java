package com.taobao.android.fluid.framework.analysis.analysis;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;
import tb.kge;

/* loaded from: classes5.dex */
public class FluidCardAnalysis extends a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* loaded from: classes5.dex */
    public enum Stage {
        CREATE,
        LOAD,
        RENDER
    }

    static {
        kge.a(-1723997523);
    }

    @Override // com.taobao.android.fluid.framework.analysis.analysis.b
    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        return true;
    }

    @Override // com.taobao.android.fluid.framework.analysis.analysis.b
    public String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this});
        }
        return null;
    }

    @Override // com.taobao.android.fluid.framework.analysis.analysis.b
    public List<String> d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("195b8bfc", new Object[]{this});
        }
        ArrayList arrayList = new ArrayList();
        for (Stage stage : Stage.values()) {
            arrayList.add(stage.name());
        }
        return arrayList;
    }
}
