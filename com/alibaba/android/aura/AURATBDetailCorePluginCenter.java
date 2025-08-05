package com.alibaba.android.aura;

import com.alibaba.android.aura.plugincenter.AbsAURAPluginCenter;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.aura.extension.event.openUrl.AliDetailOpenUrlEvent;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.aqn;
import tb.ark;
import tb.dwr;
import tb.dws;
import tb.dwt;
import tb.dwu;
import tb.dwv;
import tb.dww;
import tb.dwx;
import tb.dxa;
import tb.dxb;
import tb.dxc;
import tb.dxd;
import tb.dxg;
import tb.dxk;
import tb.dxl;
import tb.dxm;
import tb.dxn;
import tb.dxo;
import tb.dxp;
import tb.ejk;
import tb.ejl;
import tb.ejm;
import tb.ejn;
import tb.ejo;
import tb.ejp;
import tb.ejr;
import tb.ejs;
import tb.ejt;
import tb.eju;
import tb.ejv;
import tb.ejw;
import tb.ejy;
import tb.ejz;
import tb.eka;
import tb.ekb;
import tb.ekc;
import tb.eke;
import tb.ekf;
import tb.ekg;
import tb.ekh;
import tb.ekl;
import tb.ekm;
import tb.ekn;
import tb.eko;
import tb.ekp;
import tb.ekr;
import tb.eks;
import tb.ekt;
import tb.eku;
import tb.ekv;
import tb.ekw;
import tb.ekx;
import tb.eky;
import tb.ekz;
import tb.ela;
import tb.elb;
import tb.elc;
import tb.ele;
import tb.elg;
import tb.elh;
import tb.eli;
import tb.elj;
import tb.elk;
import tb.ell;
import tb.elm;
import tb.eln;
import tb.elo;
import tb.elv;
import tb.elx;
import tb.ely;
import tb.kge;

/* loaded from: classes2.dex */
public class AURATBDetailCorePluginCenter extends AbsAURAPluginCenter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(375916308);
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
    public Map<Class, List<Class<? extends IAURAInputField>>> inputFieldsTargetClass() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("994890c0", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(AliSDetailMainGalleryLoadMoreExtension_InputField_overPullContainerLayout.class);
        hashMap.put(ekf.class, arrayList);
        return Collections.unmodifiableMap(hashMap);
    }

    @Override // com.alibaba.android.aura.plugincenter.AbsAURAPluginCenter, com.alibaba.android.aura.IAURAPluginCenter
    public Map<String, AbstractMap.SimpleEntry<String, Class<? extends ark>>> extensionMap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("1b59c5d9", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        hashMap.put("aliDetail.extension.aspect.lifecycle.windvaneApiPluginRegister.config#1", new AbstractMap.SimpleEntry("aliDetail.impl.aspect.lifecycle.windvaneApiPluginRegister", com.taobao.android.detail.core.standard.mainpic.weex.a.class));
        hashMap.put("alidetail.extension.render.component.creator.progressBar.inside#1", new AbstractMap.SimpleEntry("alidetail.impl.render.component.creator.progressBar", ekv.class));
        hashMap.put("alidetail.extension.event.picGalleryExpand.onExpand#1", new AbstractMap.SimpleEntry("alidetail.impl.event.picGalleryExpand", ejz.class));
        hashMap.put("alidetail.extension.locator.receiver#1", new AbstractMap.SimpleEntry("alidetail.impl.locator.connector", ekl.class));
        hashMap.put("alidetail.extension.locator.trigger#1", new AbstractMap.SimpleEntry("alidetail.impl.locator.connector", ekm.class));
        hashMap.put("alidetail.extension.lifecycle.component.nestedcontainer.ext#1", new AbstractMap.SimpleEntry("alidetail.impl.lifecycle.component.nestedcontainer", ejm.class));
        hashMap.put("alidetail.extension.event.picGalleryExitExpand.onExitExpand#1", new AbstractMap.SimpleEntry("alidetail.impl.event.picGalleryExitExpand", ejy.class));
        hashMap.put("alidetail.extension.render.component.creator.mainpic.inside#1", new AbstractMap.SimpleEntry("alidetail.impl.render.component.creator.mainpic", eku.class));
        hashMap.put("alidetail.extension.render.component.creator.video.inside#1", new AbstractMap.SimpleEntry("alidetail.impl.render.component.creator.video", ekw.class));
        hashMap.put("alidetail.extension.lifecycle.component.page.ext#1", new AbstractMap.SimpleEntry("alidetail.impl.lifecycle.component.page", ejo.class));
        hashMap.put("alidetail.extension.render.component.creator.locatorbar.inside#1", new AbstractMap.SimpleEntry("alidetail.impl.render.component.creator.locatorbar", ekt.class));
        return Collections.unmodifiableMap(hashMap);
    }

    @Override // com.alibaba.android.aura.plugincenter.AbsAURAPluginCenter, com.alibaba.android.aura.IAURAPluginCenter
    public Map<String, Class<? extends ark>> extensionImplMap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("c4a7df19", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        hashMap.put("alidetail.impl.locator.connector.receiver.progressBar", elb.class);
        hashMap.put("alidetail.impl.locator.connector", ekg.class);
        hashMap.put("alidetail.impl.aspect.error.downgrade", com.taobao.android.detail.core.aura.extension.aspect.a.class);
        hashMap.put("aura.impl.event.expandTitle", dxg.class);
        hashMap.put("alidetail.impl.lifecycle.dxEngine.config", dws.class);
        hashMap.put("aldetail.impl.aspect.error.eventRedirectError", com.taobao.android.detail.core.aura.extension.aspect.b.class);
        hashMap.put("alidetail.impl.event.adjustState", dwt.class);
        hashMap.put("alidetail.impl.lifecycle.component.nestedcontainer", ejl.class);
        hashMap.put("alidetail.impl.render.component.creator.topmask", elg.class);
        hashMap.put("alidetail.impl.render.component.creator.mainpic", eks.class);
        hashMap.put("alidetail.impl.event.userTrack.commit", dxl.class);
        hashMap.put("alidetail.impl.userMotion.config", elx.class);
        hashMap.put("picGallery.impl.event.openSKU", eju.class);
        hashMap.put("alidetail.impl.component.lifeCycle.picGalleryExpand", ekc.class);
        hashMap.put("aura.impl.event.changeSKUImage", dxb.class);
        hashMap.put("alidetail.impl.aspect.lifecycle.mainscreen.resetparse", elv.class);
        hashMap.put("alidetail.impl.event.openAddress", com.taobao.android.detail.core.aura.extension.event.openUrl.a.class);
        hashMap.put("alidetail.impl.render.dx.video.lifecycle", dxp.class);
        hashMap.put("alidetail.impl.maingallery.switcher", elk.class);
        hashMap.put("aura.impl.event.clickContent", com.taobao.android.detail.core.detail.content.a.class);
        hashMap.put("alidetail.impl.event.picGalleryExpand", eke.class);
        hashMap.put("alidetail.impl.render.component.creator.progressBar.inside.ext", ela.class);
        hashMap.put("alidetail.impl.render.picGalleryVideoMiniWindow.scroll", com.taobao.android.detail.core.standard.video.l.class);
        hashMap.put("alidetail.impl.lifecycle.component.dx", ejk.class);
        hashMap.put("alidetail.impl.render.component.creator.locatorbar.inside.ext", ekx.class);
        hashMap.put("aura.impl.event.changeSkuFrameImage", dxa.class);
        hashMap.put("alidetail.impl.mainGallery.loadMore.handler", ekf.class);
        hashMap.put("alidetail.impl.maingallery.usertrack.frame.move", eli.class);
        hashMap.put("alidetail.impl.render.component.creator.barrage", eln.class);
        hashMap.put("alidetail.impl.render.component.lifecycle", dxn.class);
        hashMap.put("picGallery.impl.event.openLightOff", ejs.class);
        hashMap.put("alidetail.impl.mainGallery.recyclerView.provider", ekp.class);
        hashMap.put("alidetail.impl.locator.connector.receiver.video", com.taobao.android.detail.core.standard.video.i.class);
        hashMap.put("alidetail.impl.render.component.creator.locatorbar", ekr.class);
        hashMap.put("alidetail.impl.event.openUrl", AliDetailOpenUrlEvent.class);
        hashMap.put("alidetail.impl.render.component.creator.headerpic", elo.class);
        hashMap.put("alidetail.impl.render.picGalleryStructVideo.scroll", com.taobao.android.detail.core.standard.video.f.class);
        hashMap.put("alidetail.impl.topmask.data.adapter", elh.class);
        hashMap.put("aura.impl.event.changeSKUTab", dxc.class);
        hashMap.put("alidetail.impl.render.scroll.locator", dxo.class);
        hashMap.put("alidetail.impl.aspect.lifecycle.refreshCheckCollect", com.taobao.android.detail.core.aura.extension.aspect.c.class);
        hashMap.put("alidetail.impl.aspect.lifecycle.renderComponents", com.taobao.android.detail.core.aura.extension.aspect.d.class);
        hashMap.put("alidetail.impl.locator.receiver.lightOff", com.taobao.android.detail.core.standard.lightoff.d.class);
        hashMap.put("alidetail.impl.event.picGalleryExitExpand", ekb.class);
        hashMap.put("alidetail.impl.aspect.lifecycle.preloadLightOff", com.taobao.android.detail.core.standard.lightoff.e.class);
        hashMap.put("alidetail.impl.render.containerView", dwr.class);
        hashMap.put("alidetail.impl.locator.receiver.videoAutoPlay", com.taobao.android.detail.core.standard.video.g.class);
        hashMap.put("alidetail.impl.lifecycle.render.end", eko.class);
        hashMap.put("aura.impl.event.switchToMainPic", dxd.class);
        hashMap.put("alidetail.impl.render.component.creator.video", com.taobao.android.detail.core.standard.video.h.class);
        hashMap.put("picGallery.impl.event.openPop", ejt.class);
        hashMap.put("alidetail.impl.render.scroll.main.changesize.imp", ele.class);
        hashMap.put("alidetail.impl.render.headerLayoutFixer", elj.class);
        hashMap.put("alidetail.impl.render.component.creator.video.inside.ext", elc.class);
        hashMap.put("alidetail.impl.event.openurl.native.params", com.taobao.android.detail.core.aura.extension.event.openUrl.c.class);
        hashMap.put("picGallery.impl.render.canScroll", eka.class);
        hashMap.put("picGallery.impl.event.switchMainImage", ejv.class);
        hashMap.put("alidetail.impl.render.component.creator.progressBar", ekz.class);
        hashMap.put("alidetail.impl.exposureItem.strategy", dxm.class);
        hashMap.put("alidetail.impl.event.collectClick", dwx.class);
        hashMap.put("alidetail.impl.lifecycle.component.page.ext.dx", ejp.class);
        hashMap.put("alidetail.impl.motion.userTrack.args", ely.class);
        hashMap.put("alidetail.impl.mainpic.degrade", ejr.class);
        hashMap.put("alidetail.impl.locator.connector.trigger", ekh.class);
        hashMap.put("alidetail.impl.event.shopRecommendV2", dwv.class);
        hashMap.put("aliDetail.impl.aspect.lifecycle.windvaneApiPluginRegister", com.taobao.android.detail.core.standard.mainpic.weex.c.class);
        hashMap.put("aliDetail.impl.aspect.mega.args", dwu.class);
        hashMap.put("alidetail.impl.render.component.creator.mainpic.inside.ext", eky.class);
        hashMap.put("alidetail.impl.lifecycle.component.nestedcontainer.ext.dx", ejn.class);
        hashMap.put("picGallery.impl.event.updateSKU", ejw.class);
        hashMap.put("alidetail.impl.event.userTrack.args", dxk.class);
        hashMap.put("alidetail.impl.event.checkCollect", dww.class);
        hashMap.put("alidetail.impl.maingallery.frame.offsetAndResize", ekn.class);
        hashMap.put("alidetail.impl.lifecycle.component.page", com.taobao.android.detail.core.standard.componentlifecycle.page.a.class);
        hashMap.put("alidetail.impl.aspect.lifecycle.windvaneApiPluginRegister.config", com.taobao.android.detail.core.standard.mainpic.weex.b.class);
        hashMap.put("alidetail.impl.render.picGalleryFloatButton.scroll", com.taobao.android.detail.core.standard.video.e.class);
        return Collections.unmodifiableMap(hashMap);
    }

    @Override // com.alibaba.android.aura.plugincenter.AbsAURAPluginCenter
    public Map<String, Class<? extends aqn>> branchConditionMap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("df0580bf", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        hashMap.put("alidetail.condition.mainpage", elm.class);
        hashMap.put("alidetail.condition.asyncmodule.preload", ell.class);
        return Collections.unmodifiableMap(hashMap);
    }
}
