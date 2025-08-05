package com.alibaba.android.aura;

import com.alibaba.android.aura.plugincenter.AbsAURAPluginCenter;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.AbstractMap;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.aqn;
import tb.ark;
import tb.ete;
import tb.eth;
import tb.etj;
import tb.etk;
import tb.etl;
import tb.etn;
import tb.kge;

/* loaded from: classes2.dex */
public class AURATBDetailIndustryPluginCenter extends AbsAURAPluginCenter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(733951059);
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
    public Map<String, AbstractMap.SimpleEntry<String, Class<? extends ark>>> extensionMap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("1b59c5d9", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        hashMap.put("industryDetail.extension.render.component.creator.trwidget.lifecycle#1", new AbstractMap.SimpleEntry("industryDetail.impl.render.component.creator.triverwidget", etn.class));
        return Collections.unmodifiableMap(hashMap);
    }

    @Override // com.alibaba.android.aura.plugincenter.AbsAURAPluginCenter, com.alibaba.android.aura.IAURAPluginCenter
    public Map<String, Class<? extends ark>> extensionImplMap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("c4a7df19", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        hashMap.put("industryDetail.impl.lifecycle.component.industry", eth.class);
        hashMap.put("industryDetail.impl.event.picGalleryExpand.onExpand", etk.class);
        hashMap.put("industryDetail.impl.performance.monitor.render.trwidget.ext", com.taobao.android.detail.industry.scene.trwidget.e.class);
        hashMap.put("industryDetail.impl.aspect.error.monitor", ete.class);
        hashMap.put("industryDetail.impl.lifecycle.component.trwidget", com.taobao.android.detail.industry.scene.trwidget.d.class);
        hashMap.put("industryDetail.impl.lifecycle.component.page.ext.trwidget", com.taobao.android.detail.industry.scene.trwidget.a.class);
        hashMap.put("industryDetail.impl.component.weex2.lifecycle", com.taobao.android.detail.industry.scene.weex2.a.class);
        hashMap.put("industryDetail.impl.render.component.creator.triverwidget", com.taobao.android.detail.industry.scene.trwidget.c.class);
        hashMap.put("industryDetail.impl.component.trwidget.lifecycle", etj.class);
        hashMap.put("industryDetail.impl.event.picGalleryExitExpand.onExitExpand", etl.class);
        return Collections.unmodifiableMap(hashMap);
    }
}
