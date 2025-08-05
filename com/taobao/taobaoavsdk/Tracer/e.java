package com.taobao.taobaoavsdk.Tracer;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import com.taobao.taobaoavsdk.Tracer.BaseAnalysis;
import java.util.ArrayList;
import java.util.List;
import tb.kge;

/* loaded from: classes8.dex */
public class e extends BaseAnalysis {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(489921408);
    }

    @Override // com.taobao.taobaoavsdk.Tracer.c
    public String g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d71944f2", new Object[]{this}) : "VIDEO";
    }

    @Override // com.taobao.taobaoavsdk.Tracer.c
    public boolean f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[]{this})).booleanValue() : com.taobao.taobaoavsdk.util.b.a(OrangeConfig.getInstance().getConfig("DWInteractive", "fullSpanAnalysis", "true"));
    }

    @Override // com.taobao.taobaoavsdk.Tracer.c
    public List<String> h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("b7e2e578", new Object[]{this});
        }
        ArrayList arrayList = new ArrayList();
        for (BaseAnalysis.Stage stage : BaseAnalysis.Stage.values()) {
            arrayList.add(stage.name());
        }
        return arrayList;
    }
}
