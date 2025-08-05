package com.alibaba.android.aura;

import com.alibaba.android.aura.plugincenter.AbsAURAPluginCenter;
import com.alibaba.android.aura.taobao.adapter.extension.event.locator.AURALocatorEvent;
import com.alibaba.android.aura.taobao.adapter.extension.event.openUrl.AURAOpenUrlEvent;
import com.alibaba.android.aura.taobao.adapter.extension.linkage.event.AURASubmitEvent;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.aee;
import tb.aqn;
import tb.ark;
import tb.ars;
import tb.avl;
import tb.avm;
import tb.avn;
import tb.avo;
import tb.avp;
import tb.avq;
import tb.avr;
import tb.avs;
import tb.avt;
import tb.avu;
import tb.awb;
import tb.awd;
import tb.awe;
import tb.awg;
import tb.awh;
import tb.awi;
import tb.awj;
import tb.awl;
import tb.awo;
import tb.awp;
import tb.awr;
import tb.aws;
import tb.awu;
import tb.awv;
import tb.aww;
import tb.awx;
import tb.awy;
import tb.axc;
import tb.axf;
import tb.axg;
import tb.axh;
import tb.axi;
import tb.axj;
import tb.axk;
import tb.axm;
import tb.axn;
import tb.axo;
import tb.axy;
import tb.axz;
import tb.ayb;
import tb.ayd;
import tb.aye;
import tb.ayf;
import tb.ayg;
import tb.ayh;
import tb.ayi;
import tb.ayj;
import tb.ayk;
import tb.ayl;
import tb.ayn;
import tb.ayp;
import tb.ayr;
import tb.ays;
import tb.ayt;
import tb.ayu;
import tb.ayv;
import tb.ayw;
import tb.ayx;
import tb.ayy;
import tb.ayz;
import tb.azc;
import tb.azf;
import tb.azg;
import tb.azi;
import tb.azj;
import tb.azk;
import tb.azl;
import tb.azm;
import tb.azn;
import tb.azo;
import tb.azp;
import tb.azq;
import tb.azr;
import tb.azs;
import tb.azt;
import tb.azw;
import tb.azy;
import tb.azz;
import tb.baa;
import tb.bab;
import tb.bah;
import tb.bai;
import tb.baj;
import tb.bak;
import tb.emt;
import tb.gug;
import tb.hic;
import tb.hif;
import tb.hih;
import tb.hnf;
import tb.hvq;
import tb.kge;

/* loaded from: classes2.dex */
public class AURATaobaoAdapterPluginCenter extends AbsAURAPluginCenter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(154689019);
    }

    @Override // com.alibaba.android.aura.plugincenter.AbsAURAPluginCenter, com.alibaba.android.aura.IAURAPluginCenter
    public Map<String, Class<? extends n>> serviceMap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("e7e56123", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        hashMap.put(ayr.CODE, ayr.class);
        hashMap.put(ays.CODE, ays.class);
        return Collections.unmodifiableMap(hashMap);
    }

    @Override // com.alibaba.android.aura.plugincenter.AbsAURAPluginCenter, com.alibaba.android.aura.IAURAPluginCenter
    public Map<Class, List<Class<? extends IAURAInputField>>> inputFieldsTargetClass() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("994890c0", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(AURARaxComponentExtension_InputField_floatView.class);
        hashMap.put(com.alibaba.android.aura.taobao.adapter.extension.common.render.rax.a.class, arrayList);
        ArrayList arrayList2 = new ArrayList(1);
        arrayList2.add(AURADismissFloatEvent_InputField_floatView.class);
        hashMap.put(azo.class, arrayList2);
        return Collections.unmodifiableMap(hashMap);
    }

    @Override // com.alibaba.android.aura.plugincenter.AbsAURAPluginCenter, com.alibaba.android.aura.IAURAPluginCenter
    public Map<String, AbstractMap.SimpleEntry<String, Class<? extends ark>>> extensionMap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("1b59c5d9", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        hashMap.put("aura.extension.render.creator.freeNode#1", new AbstractMap.SimpleEntry("aura.impl.render.creator.freeNode#AURA_CODE_SPLIT#aura.impl.parse.renderTreeFilter.freeNode", ayf.class));
        hashMap.put("aura.extension.render.component.creator.weex.lifecycle#1", new AbstractMap.SimpleEntry("aura.impl.render.component.creator.weex", awu.class));
        hashMap.put("aura.extension.render.component.creator.weex2.lifecycle#1", new AbstractMap.SimpleEntry("aura.impl.render.component.creator.weex2", bak.class));
        hashMap.put("aura.extension.aspect.error.alarm.monitor.handler#1", new AbstractMap.SimpleEntry(azc.AURA_CODE, hih.class));
        hashMap.put("aura.extension.performance.customStage#1", new AbstractMap.SimpleEntry("aura.impl.performance.customStage", azi.class));
        hashMap.put("aura.extension.event.userTrack.args#1", new AbstractMap.SimpleEntry(axo.AURA_CODE, axy.class));
        hashMap.put("aura.extension.autoTrack.config#1", new AbstractMap.SimpleEntry("aura.impl.aspect.lifecycle.dxDownload", awg.class));
        hashMap.put("aura.extension.submit.result#1", new AbstractMap.SimpleEntry(ays.CODE, ayx.class));
        hashMap.put("aura.extension.performance.monitor.render.ext#1", new AbstractMap.SimpleEntry("aura.impl.performance.monitor.render", azm.class));
        hashMap.put("aura.extension.aspect.error.alarm.monitor.slice#1", new AbstractMap.SimpleEntry(azc.AURA_CODE, azg.class));
        hashMap.put("aura.extension.event.adjust.judge#1", new AbstractMap.SimpleEntry("aura.impl.event.adjust", ayp.class));
        hashMap.put("aura.extension.render.component.creator.dx.autoSize#1", new AbstractMap.SimpleEntry(awl.EXTENSION_CODE, aee.class));
        hashMap.put("aura.extension.performance.monitor#1", new AbstractMap.SimpleEntry("aura.impl.performance#AURA_CODE_SPLIT#aura.impl.performance.render#AURA_CODE_SPLIT#aura.impl.performance.monitor.weex2.render#AURA_CODE_SPLIT#aura.impl.performance.commonArgs", azl.class));
        hashMap.put("aura.extension.lifecycle.dxEngine.config#1", new AbstractMap.SimpleEntry("aura.impl.aspect.lifecycle.dxDownload", avp.class));
        hashMap.put("aura.extension.event.adjust.confirmComponent#1", new AbstractMap.SimpleEntry("aura.impl.event.adjust", gug.class));
        hashMap.put("aura.extension.exposureItem.strategy#1", new AbstractMap.SimpleEntry("aura.impl.component.lifeCycle.exposureItem", awr.class));
        hashMap.put("aura.extension.aspect.lifecycle.dxDownload.ext#1", new AbstractMap.SimpleEntry("aura.impl.aspect.lifecycle.dxDownload", ars.class));
        hashMap.put("aura.extension.performance.monitor.ext#1", new AbstractMap.SimpleEntry("aura.impl.performance.monitor", azk.class));
        hashMap.put("aura.extension.submit.linkage#1", new AbstractMap.SimpleEntry(ays.CODE, ayw.class));
        hashMap.put("aura.extension.event.handler#1", new AbstractMap.SimpleEntry("aura.impl.event.popupWindow#AURA_CODE_SPLIT#aura.impl.event.adjust#AURA_CODE_SPLIT#aura.impl.event.submit", hif.class));
        hashMap.put("aura.extension.event.userTrack.commit#1", new AbstractMap.SimpleEntry(axo.AURA_CODE, axz.class));
        hashMap.put("aura.extension.linkage.submit.data#1", new AbstractMap.SimpleEntry(ayk.CODE, ayu.class));
        hashMap.put("aura.extension.event.openUrl.native.params#1", new AbstractMap.SimpleEntry(AURAOpenUrlEvent.CODE, axk.class));
        hashMap.put("aura.extension.aspect.error.alarm.monitor.sampling#1", new AbstractMap.SimpleEntry(azc.AURA_CODE, azf.class));
        hashMap.put("aura.extension.performance.monitor.network.ext#1", new AbstractMap.SimpleEntry("aura.impl.performance.monitor.network", azj.class));
        hashMap.put("aura.extension.event.adjust.trigger#2", new AbstractMap.SimpleEntry("aura.impl.event.adjust", emt.class));
        hashMap.put("aura.extension.event.submit.business#1", new AbstractMap.SimpleEntry("aura.impl.event.submit", ayl.class));
        hashMap.put("aura.extension.linkage.adjust.data#1", new AbstractMap.SimpleEntry(ayr.CODE, ayt.class));
        hashMap.put("aura.extension.popupWindow.ext#1", new AbstractMap.SimpleEntry("aura.impl.event.popupWindow", azr.class));
        hashMap.put("aura.extension.userMotion.config#1", new AbstractMap.SimpleEntry("aura.impl.component.userMotion", azy.class));
        hashMap.put("aura.extension.linkage.adjust#1", new AbstractMap.SimpleEntry(ayr.CODE, ayv.class));
        hashMap.put("aura.extension.render.dx.video.lifecycle#1", new AbstractMap.SimpleEntry(awl.EXTENSION_CODE, axc.class));
        hashMap.put("aura.extension.event.executeAbility.callBack#1", new AbstractMap.SimpleEntry("aura.impl.event.executeAbility", axi.class));
        return Collections.unmodifiableMap(hashMap);
    }

    @Override // com.alibaba.android.aura.plugincenter.AbsAURAPluginCenter, com.alibaba.android.aura.IAURAPluginCenter
    public Map<String, Class<? extends ark>> extensionImplMap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("c4a7df19", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        hashMap.put("aura.impl.event.locator", AURALocatorEvent.class);
        hashMap.put(awl.EXTENSION_CODE, awl.class);
        hashMap.put("aura.impl.protocolCropper.ultron.adjust", azs.class);
        hashMap.put("aura.impl.component.lifeCycle.asyncModuleEntry.build", avq.class);
        hashMap.put(ayk.CODE, ayk.class);
        hashMap.put("aura.impl.aspect.lifecycle.logger", ayz.class);
        hashMap.put(ayd.CODE, ayd.class);
        hashMap.put("aura.impl.event.pop", axf.class);
        hashMap.put("aura.impl.aspect.error.alarm.monitor.slice", com.alibaba.android.aura.taobao.adapter.extension.monitor.extension.impl.b.class);
        hashMap.put("aura.impl.render.scroll.component.blink", com.alibaba.android.aura.taobao.adapter.extension.event.locator.a.class);
        hashMap.put("aura.impl.event.adjust.trigger", ayg.class);
        hashMap.put("aura.impl.aspect.lifecycle.protocolCache", avn.class);
        hashMap.put("aura.impl.component.lifeCycle.completeExposure", hic.class);
        hashMap.put("aura.impl.aspect.error.alarm.monitor.sampling", com.alibaba.android.aura.taobao.adapter.extension.monitor.extension.impl.a.class);
        hashMap.put("aura.impl.lifecycle.dxEngine.config.autoTrack", awe.class);
        hashMap.put("aura.impl.event.dismissFloat", azo.class);
        hashMap.put("aura.impl.parse.stateTree.container.cache", awy.class);
        hashMap.put("aura.impl.component.userMotion", azz.class);
        hashMap.put("aura.impl.parse.dataRef", awh.class);
        hashMap.put("aura.impl.parse.stateTree.shareContext", azw.class);
        hashMap.put("aura.impl.render.scroll.userMotion", bab.class);
        hashMap.put(axn.CODE, axn.class);
        hashMap.put("aura.impl.event.weex2", bah.class);
        hashMap.put("aura.impl.event.quantityChange", axm.class);
        hashMap.put("aura.impl.component.lifeCycle.autoTrack", awb.class);
        hashMap.put("aura.impl.lifeCycle.linkage", ayi.class);
        hashMap.put(aye.CODE, aye.class);
        hashMap.put("aura.impl.component.lifeCycle.exposureItem", awp.class);
        hashMap.put("aura.impl.aspect.lifecycle.popupWindow", azq.class);
        hashMap.put("aura.impl.parse.stateTree.async.component", avt.class);
        hashMap.put("aura.impl.aspect.error.umbrella.monitor", avo.class);
        hashMap.put("aura.impl.parse.stateTree.linkage", ayj.class);
        hashMap.put("aura.impl.rule.localAdjust.writeShareContext", hvq.class);
        hashMap.put("aura.impl.render.component.creator.rax", com.alibaba.android.aura.taobao.adapter.extension.common.render.rax.a.class);
        hashMap.put("aura.impl.parse.stateTree.autoTrack", awd.class);
        hashMap.put("aura.impl.protocolCropper.ultron.submit", azt.class);
        hashMap.put("aura.impl.aspect.lifecycle.eventTrigger.afterRender", ayb.class);
        hashMap.put("aura.impl.userMarkTinct", com.alibaba.android.aura.taobao.adapter.extension.tinct.a.class);
        hashMap.put("aura.impl.component.lifeCycle.createItem", awo.class);
        hashMap.put("aura.impl.event.popupWindow", azp.class);
        hashMap.put("aura.impl.render.component.creator.weex2", bai.class);
        hashMap.put("aura.impl.parse.stateTree.decrypt", awi.class);
        hashMap.put(azc.AURA_CODE, azc.class);
        hashMap.put("aura.impl.aspect.lifecycle.dxDownload", avm.class);
        hashMap.put("aura.impl.event.adjust.judge.dataChange", ayh.class);
        hashMap.put("aura.impl.parse.stateTree.abTest", avl.class);
        hashMap.put("aura.impl.render.component.creator.weex", aws.class);
        hashMap.put("aura.impl.event.executeAbility", axh.class);
        hashMap.put("aura.impl.performance.render", com.alibaba.android.aura.taobao.adapter.extension.performance.e.class);
        hashMap.put("aura.impl.parse.component.groupSelected", awj.class);
        hashMap.put("aura.impl.performance", com.alibaba.android.aura.taobao.adapter.extension.performance.d.class);
        hashMap.put("aura.impl.aspect.error.logger", ayy.class);
        hashMap.put("aura.impl.event.submit", AURASubmitEvent.class);
        hashMap.put("aura.impl.event.toast", axg.class);
        hashMap.put("aura.impl.render.scroll.async.component", avu.class);
        hashMap.put("aura.impl.performance.commonArgs", com.alibaba.android.aura.taobao.adapter.extension.performance.b.class);
        hashMap.put("aura.impl.component.lifeCycle.userMotion", baa.class);
        hashMap.put(AURAOpenUrlEvent.CODE, AURAOpenUrlEvent.class);
        hashMap.put("aura.impl.event.adjust", ayn.class);
        hashMap.put("aura.impl.performance.customStage", com.alibaba.android.aura.taobao.adapter.extension.performance.c.class);
        hashMap.put("aura.impl.performance.monitor.ut", azn.class);
        hashMap.put("aura.impl.event.redirect.mega", axj.class);
        hashMap.put("aura.impl.event.asyncMR", avr.class);
        hashMap.put(axo.AURA_CODE, axo.class);
        hashMap.put("aura.impl.component.lifeCycle.async.component", avs.class);
        hashMap.put("aura.impl.aspect.lifecycle.exposurereset", hnf.class);
        hashMap.put("aura.impl.performance.monitor.weex2.render", baj.class);
        return Collections.unmodifiableMap(hashMap);
    }

    @Override // com.alibaba.android.aura.plugincenter.AbsAURAPluginCenter
    public Map<String, Class<? extends aqn>> branchConditionMap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("df0580bf", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        hashMap.put("aura.condition.debuggable", awv.class);
        hashMap.put("aura.condition.orange", awx.class);
        hashMap.put("aura.condition.deviceEvaluation", aww.class);
        return Collections.unmodifiableMap(hashMap);
    }
}
