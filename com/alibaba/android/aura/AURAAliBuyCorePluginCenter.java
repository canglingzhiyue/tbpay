package com.alibaba.android.aura;

import com.alibaba.android.aura.plugincenter.AbsAURAPluginCenter;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.AbstractMap;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.adw;
import tb.adx;
import tb.aqn;
import tb.ark;
import tb.dth;
import tb.dtm;
import tb.dtn;
import tb.dto;
import tb.dtp;
import tb.dtq;
import tb.dtr;
import tb.dts;
import tb.dtt;
import tb.dtu;
import tb.dtv;
import tb.dtw;
import tb.dtx;
import tb.dty;
import tb.dtz;
import tb.dua;
import tb.dub;
import tb.duc;
import tb.dud;
import tb.due;
import tb.duf;
import tb.duo;
import tb.gnr;
import tb.gnt;
import tb.hip;
import tb.iyo;
import tb.jcn;
import tb.jco;
import tb.kge;
import tb.kqt;
import tb.lbw;
import tb.tcx;
import tb.tdb;
import tb.tdc;
import tb.xiu;

/* loaded from: classes2.dex */
public class AURAAliBuyCorePluginCenter extends AbsAURAPluginCenter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(533962845);
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
        hashMap.put("alibuy.impl.nextrpc.prefetch", dua.class);
        hashMap.put("alibuy.impl.event.openurl.native.params.addAddress", dtv.class);
        hashMap.put("alibuy.impl.render.performance.jsTracker", gnt.class);
        hashMap.put("alibuy.impl.event.userTrack.pageInfo", adw.class);
        hashMap.put("alibuy.impl.event.executeAbility.callBack.noAddress", dtt.class);
        hashMap.put("alibuy.impl.render.scroll", duc.class);
        hashMap.put("alibuy.impl.lifecycle.reset.state", dub.class);
        hashMap.put("alibuy.impl.aspect.lifecycle.skeleton", dto.class);
        hashMap.put("alibuy.impl.event.bubble", dtq.class);
        hashMap.put("alibuy.impl.event.addAddress", dts.class);
        hashMap.put("alibuy.impl.event.handler.popupWindow.stream", kqt.class);
        hashMap.put("alibuy.impl.aspect.performance.jsTracker", gnr.class);
        hashMap.put("alibuy.impl.render.component.creator.scrollbar", duo.class);
        hashMap.put("alibuy.impl.aspect.lifecycle.fullScreen.loading", adx.class);
        hashMap.put("alibuy.impl.nextrpc.passParams", com.taobao.android.buy.extension.passparams.a.class);
        hashMap.put("alibuy.impl.aspect.lifecycle.loading", dtm.class);
        hashMap.put("alibuy.impl.parse.protocol.verify", dtr.class);
        hashMap.put("alibuy.impl.aspect.error.submit", dud.class);
        hashMap.put("alibuy.impl.autoTrack.config", dtp.class);
        hashMap.put("alibuy.impl.nextrpc.monitor", iyo.class);
        hashMap.put(dtu.CODE, dtu.class);
        hashMap.put("alibuy.impl.performance.customStage.containerTime", dtz.class);
        hashMap.put("alibuy.impl.submit.result.handler", xiu.class);
        hashMap.put("alibuy.impl.event.adjust.cache", tdc.class);
        hashMap.put("alibuy.impl.rule.localAdjust.validateData", dty.class);
        hashMap.put("alibuy.impl.event.validateData", com.taobao.android.buy.extension.ability.validate.a.class);
        hashMap.put("alibuy.impl.lifecycle.dxEngine.config", dtn.class);
        hashMap.put("alibuy.impl.popupWindow.ext", dth.class);
        hashMap.put("alibuy.impl.event.openurl.native.params.changeAddress", dtw.class);
        hashMap.put("alibuy.impl.nextrpc.protocol.cache", lbw.class);
        hashMap.put("alibuy.impl.aspect.error.alarm.monitor.handler", jcn.class);
        hashMap.put("alibuy.impl.linkage.adjust.config", dtx.class);
        hashMap.put("alibuy.impl.parse.stateTree.ccrc", hip.class);
        hashMap.put("alibuy.impl.nextrpc.stream.handler", tcx.class);
        hashMap.put("alibuy.impl.linkage.adjust.streamResponse", tdb.class);
        hashMap.put("alibuy.impl.aspect.lifecycle.stream", jco.class);
        hashMap.put("alibuy.impl.event.submit.business.default", duf.class);
        hashMap.put("alibuy.impl.submit.linkage.config", due.class);
        return Collections.unmodifiableMap(hashMap);
    }
}
