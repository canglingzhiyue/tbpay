package com.alibaba.android.aura;

import com.alibaba.android.aura.plugincenter.AbsAURAPluginCenter;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.waitpay.extension.TBBuyRegisterRefreshExtension;
import java.util.AbstractMap;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.aqn;
import tb.ark;
import tb.jtf;
import tb.jtg;
import tb.jth;
import tb.jti;
import tb.jtj;
import tb.jtk;
import tb.jtl;
import tb.jtm;
import tb.jto;
import tb.jtq;
import tb.jtr;
import tb.jts;
import tb.jtt;
import tb.kge;

/* loaded from: classes2.dex */
public class AURATaobaoWaitPayDetailPluginCenter extends AbsAURAPluginCenter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1803112784);
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
        hashMap.put("tbwaitpay.impl.render.creator.freeNode.actionBar", jti.class);
        hashMap.put("tbwaitpay.impl.event.refresh", jth.class);
        hashMap.put("tbwaitpay.impl.popupWindow.ext", jtt.class);
        hashMap.put("tbwaitpay.impl.render.recyclerView.provider", jtg.class);
        hashMap.put("tbwaitpay.impl.aspect.error.downgrade", jto.class);
        hashMap.put("tbwaitpay.impl.submit.linkage.config", jts.class);
        hashMap.put("tbwaitpay.impl.event.submit.business.default", jtr.class);
        hashMap.put("tbwaitpay.impl.aspect.error.submit", jtq.class);
        hashMap.put("tbwaitpay.impl.aspect.error.build", jtl.class);
        hashMap.put("tbwaitpay.impl.lifecycle.dxEngine.config", jtm.class);
        hashMap.put("tbwaitpay.impl.aspect.error.adjust", jtk.class);
        hashMap.put("tbwaitpay.impl.event.registerNotify", TBBuyRegisterRefreshExtension.class);
        hashMap.put("tbwaitpay.impl.render.component.creator.recommend", jtf.class);
        hashMap.put("tbwaitpay.impl.linkage.adjust.config", jtj.class);
        return Collections.unmodifiableMap(hashMap);
    }
}
