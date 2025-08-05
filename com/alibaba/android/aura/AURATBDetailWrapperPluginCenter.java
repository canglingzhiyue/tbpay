package com.alibaba.android.aura;

import com.alibaba.android.aura.plugincenter.AbsAURAPluginCenter;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.wrapper.aura.event.AliDetailCheckPreSaleEvent;
import com.taobao.android.detail.wrapper.aura.event.AliDetailInviteRateEvent;
import java.util.AbstractMap;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.aqn;
import tb.ark;
import tb.ezz;
import tb.faa;
import tb.ffb;
import tb.kge;

/* loaded from: classes2.dex */
public class AURATBDetailWrapperPluginCenter extends AbsAURAPluginCenter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1290179086);
    }

    @Override // com.alibaba.android.aura.plugincenter.AbsAURAPluginCenter
    public Map<String, Class<? extends aqn>> branchConditionMap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("df0580bf", new Object[]{this});
        }
        return null;
    }

    @Override // com.alibaba.android.aura.plugincenter.AbsAURAPluginCenter, com.alibaba.android.aura.IAURAPluginCenter
    public Map<String, AbstractMap.SimpleEntry<String, Class<? extends ark>>> extensionMap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("1b59c5d9", new Object[]{this});
        }
        return null;
    }

    @Override // com.alibaba.android.aura.plugincenter.AbsAURAPluginCenter, com.alibaba.android.aura.IAURAPluginCenter
    public Map<Class, List<Class<? extends IAURAInputField>>> inputFieldsTargetClass() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("994890c0", new Object[]{this});
        }
        return null;
    }

    @Override // com.alibaba.android.aura.plugincenter.AbsAURAPluginCenter, com.alibaba.android.aura.IAURAPluginCenter
    public Map<String, Class<? extends n>> serviceMap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("e7e56123", new Object[]{this});
        }
        return null;
    }

    @Override // com.alibaba.android.aura.plugincenter.AbsAURAPluginCenter, com.alibaba.android.aura.IAURAPluginCenter
    public Map<String, Class<? extends ark>> extensionImplMap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("c4a7df19", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        hashMap.put("tbdetail.impl.render.component.creator.weex", ffb.class);
        hashMap.put("alidetail.impl.event.querySMBagPrice", com.taobao.android.detail.wrapper.aura.event.d.class);
        hashMap.put("alidetail.impl.render.component.creator.picgallery", ezz.class);
        hashMap.put("alidetail.impl.event.inviteRate", AliDetailInviteRateEvent.class);
        hashMap.put("alidetail.impl.event.checkPreSale", AliDetailCheckPreSaleEvent.class);
        hashMap.put("tbdetail.impl.performance.mainHeader", faa.class);
        hashMap.put("alidetail.impl.event.openSKU", com.taobao.android.detail.wrapper.aura.event.c.class);
        hashMap.put("alidetail.impl.event.updateSKUQuantity", com.taobao.android.detail.wrapper.aura.event.f.class);
        hashMap.put("alidetail.impl.event.setRemind", com.taobao.android.detail.wrapper.aura.event.e.class);
        hashMap.put("alidetail.impl.event.addJhsWaiting", com.taobao.android.detail.wrapper.aura.event.a.class);
        hashMap.put("alidetail.impl.event.openRate", com.taobao.android.detail.wrapper.aura.event.b.class);
        return Collections.unmodifiableMap(hashMap);
    }
}
