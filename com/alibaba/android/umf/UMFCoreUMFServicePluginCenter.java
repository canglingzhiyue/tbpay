package com.alibaba.android.umf;

import com.alibaba.android.umf.node.service.data.rule.d;
import com.alibaba.android.umf.node.service.parse.a;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;
import tb.bqg;
import tb.bqi;
import tb.bqo;
import tb.bqp;
import tb.bqx;
import tb.brc;
import tb.bri;
import tb.brj;
import tb.brk;
import tb.brn;
import tb.bro;
import tb.brp;
import tb.brq;
import tb.kge;

/* loaded from: classes2.dex */
public class UMFCoreUMFServicePluginCenter implements IUMFPluginCenter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1001575866);
        kge.a(1032412719);
    }

    @Override // com.alibaba.android.umf.IUMFPluginCenter
    public Map<String, Class<? extends bqo>> serviceMap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("e7e56123", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        hashMap.put("umf.service.parse", a.class);
        hashMap.put("umf.service.render", bqx.class);
        hashMap.put("umf.service.rule", d.class);
        return hashMap;
    }

    @Override // com.alibaba.android.umf.IUMFPluginCenter
    public Map<String, AbstractMap.SimpleEntry<String, Class<? extends bqg>>> extensionMap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("1b59c5d9", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        hashMap.put("umf.ability.render.event", new AbstractMap.SimpleEntry("umf.service.render", bri.class));
        hashMap.put("umf.ability.render.component.creator", new AbstractMap.SimpleEntry("umf.service.render", brj.class));
        hashMap.put("umf.ability.parse.ext", new AbstractMap.SimpleEntry("umf.service.parse", bqp.class));
        hashMap.put("umf.ability.render.container", new AbstractMap.SimpleEntry("umf.service.render", brk.class));
        hashMap.put("umf.ability.rule.common", new AbstractMap.SimpleEntry("umf.service.rule", bqi.class));
        return hashMap;
    }

    @Override // com.alibaba.android.umf.IUMFPluginCenter
    public Map<String, Class<? extends bqg>> extensionImplMap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("c4a7df19", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        hashMap.put("umf.ability.impl.render.native.component.creator", brp.class);
        hashMap.put("umf.ability.impl.render.container", brq.class);
        hashMap.put("umf.ability.impl.render.default.component.creator", bro.class);
        hashMap.put("umf.ability.impl.adjustRules", brc.class);
        hashMap.put("umf.ability.impl.render.dx.component.creator", brn.class);
        return hashMap;
    }
}
