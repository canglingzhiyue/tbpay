package com.alibaba.android.aura;

import com.alibaba.android.aura.plugincenter.AbsAURAPluginCenter;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.AbstractMap;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.afb;
import tb.afc;
import tb.aqn;
import tb.ark;
import tb.icx;
import tb.icy;
import tb.icz;
import tb.ida;
import tb.idb;
import tb.ide;
import tb.idf;
import tb.idg;
import tb.idh;
import tb.idi;
import tb.ido;
import tb.kge;
import tb.ojq;
import tb.oqg;

/* loaded from: classes2.dex */
public class AURATaobaoPurchasePluginCenter extends AbsAURAPluginCenter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-2033493531);
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
        hashMap.put("tbbuy.impl.render.component.creator.dx.autoSize", ojq.class);
        hashMap.put("tbbuy.impl.aspect.error.adjust", ide.class);
        hashMap.put("tbbuy.impl.aspect.zcache.prefetch", ido.class);
        hashMap.put("tbbuy.impl.parse.stateTree.userTrack", com.taobao.android.purchase.aura.extension.utTrack.a.class);
        hashMap.put("tbbuy.impl.aspect.bx.tracker", idf.class);
        hashMap.put("tbbuy.impl.nextrpc.infoFlow.preload", icy.class);
        hashMap.put("tbbuy.impl.event.verifyIdentity", icx.class);
        hashMap.put("tbbuy.impl.aspect.error.adjust.popupWindow", icz.class);
        hashMap.put("lightbuy.impl.nextrpc.attachedData.weex", afc.class);
        hashMap.put("tbbuy.impl.aspect.error.build", idg.class);
        hashMap.put("tbbuy.impl.render.creator.freeNode.actionBar", idb.class);
        hashMap.put("lightbuy.impl.nextrpc.requestParams", afb.class);
        hashMap.put("tbbuy.impl.aspect.error.downgrade", idh.class);
        hashMap.put("tbbuy.impl.render.component.creator.dx.float.autoSize", oqg.class);
        hashMap.put("tbbuy.impl.event.refresh", ida.class);
        hashMap.put("tbbuy.impl.aspect.monitor.buy2.0", idi.class);
        return Collections.unmodifiableMap(hashMap);
    }
}
