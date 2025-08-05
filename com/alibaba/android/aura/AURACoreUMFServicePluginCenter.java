package com.alibaba.android.aura;

import com.alibaba.android.aura.plugincenter.AbsAURAPluginCenter;
import com.alibaba.android.aura.service.nextrpc.extension.IAURANextRPCPrefetchExtension;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.AbstractMap;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.aqn;
import tb.ark;
import tb.arw;
import tb.arx;
import tb.ary;
import tb.asd;
import tb.asg;
import tb.ash;
import tb.asp;
import tb.asq;
import tb.asw;
import tb.ata;
import tb.atb;
import tb.atc;
import tb.atd;
import tb.ate;
import tb.atf;
import tb.atg;
import tb.ath;
import tb.ati;
import tb.atj;
import tb.auy;
import tb.avb;
import tb.bqp;
import tb.kge;

/* loaded from: classes2.dex */
public class AURACoreUMFServicePluginCenter extends AbsAURAPluginCenter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-493474276);
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
        HashMap hashMap = new HashMap();
        hashMap.put(auy.CODE, auy.class);
        hashMap.put("aura.service.cache", com.alibaba.android.aura.service.cache.b.class);
        hashMap.put(asd.NEXT_RPC_SERVICE_CODE, asd.class);
        hashMap.put(asw.RENDER_SERVICE_CODE, asw.class);
        hashMap.put(com.alibaba.android.aura.service.event.e.CODE, com.alibaba.android.aura.service.event.e.class);
        hashMap.put(com.alibaba.android.aura.service.parse.a.PARSE_SERVICE_CODE, com.alibaba.android.aura.service.parse.a.class);
        return Collections.unmodifiableMap(hashMap);
    }

    @Override // com.alibaba.android.aura.plugincenter.AbsAURAPluginCenter, com.alibaba.android.aura.IAURAPluginCenter
    public Map<String, AbstractMap.SimpleEntry<String, Class<? extends ark>>> extensionMap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("1b59c5d9", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        hashMap.put("aura.extension.event#1", new AbstractMap.SimpleEntry(com.alibaba.android.aura.service.event.e.CODE, arw.class));
        hashMap.put("aura.extension.parse.renderTreeFilter#1", new AbstractMap.SimpleEntry(com.alibaba.android.aura.service.parse.a.PARSE_SERVICE_CODE, asp.class));
        hashMap.put("aura.extension.render.scroll#1", new AbstractMap.SimpleEntry(asw.RENDER_SERVICE_CODE, atg.class));
        hashMap.put("aura.extension.render.component.creator#1", new AbstractMap.SimpleEntry(asw.RENDER_SERVICE_CODE, atc.class));
        hashMap.put("aura.extension.render#1", new AbstractMap.SimpleEntry(asw.RENDER_SERVICE_CODE, atf.class));
        hashMap.put("aura.extension.nextrpc.prefetch#1", new AbstractMap.SimpleEntry(asd.NEXT_RPC_SERVICE_CODE, IAURANextRPCPrefetchExtension.class));
        hashMap.put("aura.extension.render#2", new AbstractMap.SimpleEntry(asw.RENDER_SERVICE_CODE, ath.class));
        hashMap.put("aura.extension.nextrpc.stream.handler#1", new AbstractMap.SimpleEntry(asd.NEXT_RPC_SERVICE_CODE, com.alibaba.android.aura.service.nextrpc.extension.a.class));
        hashMap.put("aura.extension.event.redirect#1", new AbstractMap.SimpleEntry(com.alibaba.android.aura.service.event.e.CODE, arx.class));
        hashMap.put("aura.extension.parse.ext#1", new AbstractMap.SimpleEntry(com.alibaba.android.aura.service.parse.a.PARSE_SERVICE_CODE, bqp.class));
        hashMap.put("aura.extension.nextrpc#1", new AbstractMap.SimpleEntry(asd.NEXT_RPC_SERVICE_CODE, asg.class));
        hashMap.put("aura.extension.rule.localAdjust#1", new AbstractMap.SimpleEntry("umf.service.rule", avb.class));
        hashMap.put("aura.extension.parse.stateTree#1", new AbstractMap.SimpleEntry(com.alibaba.android.aura.service.parse.a.PARSE_SERVICE_CODE, asq.class));
        hashMap.put("aura.extension.render.canScroll#1", new AbstractMap.SimpleEntry(asw.RENDER_SERVICE_CODE, atb.class));
        hashMap.put("aura.extension.component.lifeCycle#1", new AbstractMap.SimpleEntry(asw.RENDER_SERVICE_CODE, atd.class));
        hashMap.put("aura.extension.component.lifeCycle#2", new AbstractMap.SimpleEntry(asw.RENDER_SERVICE_CODE, ate.class));
        hashMap.put("aura.extension.render.freeNode#1", new AbstractMap.SimpleEntry(asw.RENDER_SERVICE_CODE, ata.class));
        hashMap.put("aura.extension.nextrpc.handle#1", new AbstractMap.SimpleEntry(asd.NEXT_RPC_SERVICE_CODE, ash.class));
        return Collections.unmodifiableMap(hashMap);
    }

    @Override // com.alibaba.android.aura.plugincenter.AbsAURAPluginCenter, com.alibaba.android.aura.IAURAPluginCenter
    public Map<String, Class<? extends ark>> extensionImplMap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("c4a7df19", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        hashMap.put("aura.impl.render.component.creator.default", ati.class);
        hashMap.put("aura.impl.event.adjustRules", ary.class);
        hashMap.put("aura.impl.render.component.creator.dividerLine", atj.class);
        return Collections.unmodifiableMap(hashMap);
    }
}
