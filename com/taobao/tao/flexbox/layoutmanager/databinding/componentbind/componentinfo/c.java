package com.taobao.tao.flexbox.layoutmanager.databinding.componentbind.componentinfo;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.core.Component;
import tb.kge;

/* loaded from: classes8.dex */
public class c implements b<Integer, a> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(448584668);
        kge.a(-2107952555);
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, java.lang.Integer] */
    @Override // com.taobao.tao.flexbox.layoutmanager.databinding.componentbind.componentinfo.b
    public /* synthetic */ Integer a(Component component) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("349b1f6f", new Object[]{this, component}) : b(component);
    }

    public Integer b(Component component) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Integer) ipChange.ipc$dispatch("bd75cbe9", new Object[]{this, component}) : Integer.valueOf(component.getLayoutHeight());
    }
}
