package com.taobao.android.fluid.framework.card.cards.base.layer.interactive.eventhandler.nativ;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.parser.JSONLexer;
import com.alipay.mobile.common.logging.api.LogContext;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.business.containerframe.IContainerFrameService;
import com.taobao.android.fluid.business.usertrack.ITrackService;
import com.taobao.android.fluid.common.view.FscrmidFavorFrameLayout;
import com.taobao.android.fluid.common.view.RoundCornerLayout;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.back.IBackEventService;
import com.taobao.android.fluid.framework.card.ICardService;
import com.taobao.android.fluid.framework.card.cards.video.manager.landscape.LandscapeController;
import com.taobao.android.fluid.framework.container.IContainerService;
import com.taobao.android.fluid.framework.data.IDataService;
import com.taobao.android.fluid.framework.data.datamodel.AlbumData;
import com.taobao.android.fluid.framework.data.datamodel.a;
import com.taobao.android.fluid.framework.device.sensor.d;
import com.taobao.android.fluid.framework.hostapp.IHostAppService;
import com.taobao.android.fluid.framework.lifecycle.ILifecycleService;
import com.taobao.android.fluid.framework.scene.ISceneConfigService;
import com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.t;
import com.taobao.tao.infoflow.multitab.e;
import com.taobao.weex.utils.WXUtils;
import com.uc.webview.export.extension.UCClient;
import com.uc.webview.export.media.CommandID;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.dlu;
import tb.fxb;
import tb.iqw;
import tb.jqu;
import tb.kge;
import tb.ljq;
import tb.obu;
import tb.obv;
import tb.obw;
import tb.ocf;
import tb.oeb;
import tb.oec;
import tb.oek;
import tb.ohd;
import tb.ple;
import tb.plm;
import tb.psw;
import tb.psy;
import tb.ptf;
import tb.ptk;
import tb.qmq;
import tb.rgc;
import tb.riy;
import tb.shw;
import tb.shy;
import tb.sia;
import tb.sii;
import tb.sij;
import tb.sil;
import tb.sjm;
import tb.sjn;
import tb.sjq;
import tb.sjt;
import tb.slu;
import tb.smk;
import tb.soi;
import tb.spx;
import tb.spy;
import tb.spz;

/* loaded from: classes5.dex */
public class b extends ptk {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final Collection<String> b;

    /* renamed from: a  reason: collision with root package name */
    public boolean f12487a = false;
    private final qmq c;
    private final ptf e;
    private final FluidContext k;
    private final psw l;
    private final ViewGroup m;
    private obv n;
    private plm o;

    private String a(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9064aa65", new Object[]{this, new Integer(i)}) : i == 0 ? "visible" : i == 4 ? "invisible" : i == 8 ? "gone" : "";
    }

    public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    static {
        kge.a(-1346296957);
        Collection<String> h = h();
        b = h;
        h.add("VSMSG_playPlayer");
        b.add("VSMSG_pausePlayer");
        b.add("VSMSG_getComponentFrame");
        b.add("VSMSG_getCommonTrack");
        b.add("VSMSG_getCommonTrackV2");
        b.add("VSMSG_getDPVCommonTrack");
        b.add("VSMSG_clickComment");
        b.add("VSMSG_clickShare");
        b.add("VSMSG_clickFavor");
        b.add("VSMSG_clickGoods");
        b.add("VSMSG_clickLiveSubscribe");
        b.add("VSMSG_addFollow");
        b.add("VSMSG_addCollect");
        b.add("VSMSG_positiveFeedBack");
        b.add("VSMSG_getMobileInfo");
        b.add("VSMSG_enableDynamicRecommend");
        b.add("VSMSG_clickDislike");
        b.add("VSMSG_clickCollect");
        b.add("VSMSG_updateSettings");
        b.add("VSMSG_clickReport");
        b.add("VSMSG_clickAutoPlay");
        b.add("VSMSG_settingPanelStateChange");
        b.add("VSMSG_hideCommentList");
        b.add("VSMSG_showHideVideoBlur");
        b.add("VSMSG_cacheVideoSnapshot");
        b.add("VSMSG_showComponentList");
        b.add("VSMSG_setItemRecognizeShowing");
        b.add("VSMSG_toLandscape");
        b.add("VSMSG_removeCard");
        b.add("VSMSG_getListInfo");
        b.add("VSMSG_hookPalyEndEvent");
        b.add("VSMSG_resumePlay");
        b.add("VSMSG_activityCover");
        b.add("VSMSG_syncComment");
        b.add("VSMSG_refreshForPublisherEdit");
        b.add("VSMSG_refreshCurrentData");
        b.add("VSMSG_getNextListInfo");
        b.add("VSMSG_submitAggregateLog");
        b.add("VSMSG_syncCardMap");
        b.add("VSMSG_getCellAggregateLog");
        b.add("VSMSG_getVideoSize");
        b.add("VSMSG_handleAlbumDetail");
        b.add("VSMSG_screenMove");
        b.add("VSMSG_screenMoveV2");
        b.add("VSMSG_putNextCardMap");
        b.add("VSMSG_getCardMap");
        b.add("VSMSG_getPlayRateV2");
        b.add("VSMSG_setPlayRateV2");
        b.add("VSMSG_getProgressPosition");
        b.add("VSMSG_seekAndPause");
        b.add("VSMSG_updatePageGrayMask");
        b.add("VSMSG_setVisibleTitleBarMore");
        b.add("VSMSG_addRecommendExtendParams");
        b.add("VSMSG_getFeedbackState");
        b.add("VSMSG_animateMediaCard");
        b.add("VSMSG_mediaCardAnimated");
        b.add("VSMSG_setSlideMode");
        b.add("VSMSG_updatePlayerUtParams");
        b.add("VSMSG_immersiveVideo");
        b.add("VSMSG_setPlayerVolume");
        b.add(spy.MSG_DATA_CHANGE);
        b.add("VSMSG_getNextCollectionVideo");
        b.add("VSMSG_cancelPlayNextCollectionVideo");
        b.add("VSMSG_setTab2WebConfigs");
        b.add("VSMSG_commitUTWithNativeArgs");
        b.add("VSMSG_checkVerticalUI");
    }

    public b(ptf ptfVar, psw pswVar, ViewGroup viewGroup, qmq qmqVar) {
        this.e = ptfVar;
        this.m = viewGroup;
        this.c = qmqVar;
        this.i = 2;
        this.l = pswVar;
        this.k = pswVar.z();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // tb.ptk, tb.spx
    public void a(final spy spyVar) {
        char c;
        String g;
        String g2;
        plm plmVar;
        int a2;
        int i;
        int i2;
        Map<? extends String, ? extends Object> map;
        sjq b2;
        boolean z;
        Boolean bool;
        View moreButton;
        List a3;
        t trackTint;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff34879c", new Object[]{this, spyVar});
            return;
        }
        shw sessionIdRecorder = ((ICardService) this.l.z().getService(ICardService.class)).getSessionIdRecorder();
        a.c a4 = sessionIdRecorder.a(spyVar.d);
        slu detailUnlikeRecorder = ((IHostAppService) this.l.z().getService(IHostAppService.class)).getCurrentTabIndex() == 0 ? ((IDataService) this.k.getService(IDataService.class)).getDetailUnlikeRecorder() : null;
        String str = a.a(this.k).q;
        String str2 = spyVar.c;
        switch (str2.hashCode()) {
            case -2099047241:
                if (str2.equals("VSMSG_addFollow")) {
                    c = 14;
                    break;
                }
                c = 65535;
                break;
            case -1918031838:
                if (str2.equals("VSMSG_setPlayerVolume")) {
                    c = '9';
                    break;
                }
                c = 65535;
                break;
            case -1605391121:
                if (str2.equals("VSMSG_getNextCollectionVideo")) {
                    c = ';';
                    break;
                }
                c = 65535;
                break;
            case -1592092351:
                if (str2.equals("VSMSG_getVideoSize")) {
                    c = '\'';
                    break;
                }
                c = 65535;
                break;
            case -1580106927:
                if (str2.equals("VSMSG_getDPVCommonTrack")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case -1547049959:
                if (str2.equals("VSMSG_positiveFeedBack")) {
                    c = 16;
                    break;
                }
                c = 65535;
                break;
            case -1463329941:
                if (str2.equals("VSMSG_getComponentFrame")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -1456866862:
                if (str2.equals("VSMSG_seekAndPause")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -1409586030:
                if (str2.equals("VSMSG_clickComment")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case -1408749573:
                if (str2.equals("VSMSG_hookPalyEndEvent")) {
                    c = 31;
                    break;
                }
                c = 65535;
                break;
            case -1363729851:
                if (str2.equals("VSMSG_toLandscape")) {
                    c = 27;
                    break;
                }
                c = 65535;
                break;
            case -1245370259:
                if (str2.equals("VSMSG_activityCover")) {
                    c = '!';
                    break;
                }
                c = 65535;
                break;
            case -1017871455:
                if (str2.equals("VSMSG_setTab2WebConfigs")) {
                    c = '>';
                    break;
                }
                c = 65535;
                break;
            case -938699734:
                if (str2.equals(spy.MSG_DATA_CHANGE)) {
                    c = riy.CONDITION_IF_MIDDLE;
                    break;
                }
                c = 65535;
                break;
            case -879541144:
                if (str2.equals("VSMSG_showHideVideoBlur")) {
                    c = 23;
                    break;
                }
                c = 65535;
                break;
            case -819757646:
                if (str2.equals("VSMSG_settingPanelStateChange")) {
                    c = 21;
                    break;
                }
                c = 65535;
                break;
            case -774181563:
                if (str2.equals("VSMSG_putNextCardMap")) {
                    c = '+';
                    break;
                }
                c = 65535;
                break;
            case -773130929:
                if (str2.equals("VSMSG_removeCard")) {
                    c = 28;
                    break;
                }
                c = 65535;
                break;
            case -754864317:
                if (str2.equals("VSMSG_showComponentList")) {
                    c = 25;
                    break;
                }
                c = 65535;
                break;
            case -736075044:
                if (str2.equals("VSMSG_mediaCardAnimated")) {
                    c = '5';
                    break;
                }
                c = 65535;
                break;
            case -688342184:
                if (str2.equals("VSMSG_clickDislike")) {
                    c = 20;
                    break;
                }
                c = 65535;
                break;
            case -623144510:
                if (str2.equals("VSMSG_getCellAggregateLog")) {
                    c = '&';
                    break;
                }
                c = 65535;
                break;
            case -592666527:
                if (str2.equals("VSMSG_getCommonTrackV2")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case -475416940:
                if (str2.equals("VSMSG_screenMoveV2")) {
                    c = '*';
                    break;
                }
                c = 65535;
                break;
            case -422849055:
                if (str2.equals("VSMSG_cancelPlayNextCollectionVideo")) {
                    c = '<';
                    break;
                }
                c = 65535;
                break;
            case -381695280:
                if (str2.equals("VSMSG_playPlayer")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -280411247:
                if (str2.equals("VSMSG_getCardMap")) {
                    c = ',';
                    break;
                }
                c = 65535;
                break;
            case -163340133:
                if (str2.equals("VSMSG_immersiveVideo")) {
                    c = '8';
                    break;
                }
                c = 65535;
                break;
            case -82366589:
                if (str2.equals("VSMSG_refreshCurrentData")) {
                    c = '\"';
                    break;
                }
                c = 65535;
                break;
            case 223273020:
                if (str2.equals("VSMSG_pausePlayer")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 284602747:
                if (str2.equals("VSMSG_setVisibleTitleBarMore")) {
                    c = '1';
                    break;
                }
                c = 65535;
                break;
            case 334578437:
                if (str2.equals("VSMSG_getCommonTrack")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 338032270:
                if (str2.equals("VSMSG_animateMediaCard")) {
                    c = '4';
                    break;
                }
                c = 65535;
                break;
            case 372091402:
                if (str2.equals("VSMSG_updatePlayerUtParams")) {
                    c = '7';
                    break;
                }
                c = 65535;
                break;
            case 440820145:
                if (str2.equals("VSMSG_clickLiveSubscribe")) {
                    c = '\r';
                    break;
                }
                c = 65535;
                break;
            case 869904290:
                if (str2.equals("VSMSG_updatePageGrayMask")) {
                    c = fxb.DIR;
                    break;
                }
                c = 65535;
                break;
            case 919677479:
                if (str2.equals("VSMSG_updateSettings")) {
                    c = 18;
                    break;
                }
                c = 65535;
                break;
            case 986427968:
                if (str2.equals("VSMSG_hideCommentList")) {
                    c = 22;
                    break;
                }
                c = 65535;
                break;
            case 986491108:
                if (str2.equals("VSMSG_addCollect")) {
                    c = 15;
                    break;
                }
                c = 65535;
                break;
            case 1035044054:
                if (str2.equals("VSMSG_syncCardMap")) {
                    c = WXUtils.PERCENT;
                    break;
                }
                c = 65535;
                break;
            case 1056161355:
                if (str2.equals("VSMSG_getPlayRateV2")) {
                    c = '-';
                    break;
                }
                c = 65535;
                break;
            case 1064394845:
                if (str2.equals("VSMSG_handleAlbumDetail")) {
                    c = '(';
                    break;
                }
                c = 65535;
                break;
            case 1250970535:
                if (str2.equals("VSMSG_getListInfo")) {
                    c = 29;
                    break;
                }
                c = 65535;
                break;
            case 1293530544:
                if (str2.equals("VSMSG_clickAutoPlay")) {
                    c = 19;
                    break;
                }
                c = 65535;
                break;
            case 1298927051:
                if (str2.equals("VSMSG_commitUTWithNativeArgs")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 1420172535:
                if (str2.equals("VSMSG_checkVerticalUI")) {
                    c = riy.CONDITION_IF;
                    break;
                }
                c = 65535;
                break;
            case 1431526153:
                if (str2.equals("VSMSG_syncComment")) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case 1550819249:
                if (str2.equals("VSMSG_getFeedbackState")) {
                    c = '3';
                    break;
                }
                c = 65535;
                break;
            case 1623239985:
                if (str2.equals("VSMSG_clickFavor")) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case 1624573513:
                if (str2.equals("VSMSG_clickGoods")) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case 1628163670:
                if (str2.equals("VSMSG_addRecommendExtendParams")) {
                    c = '2';
                    break;
                }
                c = 65535;
                break;
            case 1635434194:
                if (str2.equals("VSMSG_clickShare")) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case 1654393339:
                if (str2.equals("VSMSG_enableDynamicRecommend")) {
                    c = 17;
                    break;
                }
                c = 65535;
                break;
            case 1830292567:
                if (str2.equals("VSMSG_setPlayRateV2")) {
                    c = '.';
                    break;
                }
                c = 65535;
                break;
            case 1845638616:
                if (str2.equals("VSMSG_submitAggregateLog")) {
                    c = '$';
                    break;
                }
                c = 65535;
                break;
            case 1866586268:
                if (str2.equals("VSMSG_resumePlay")) {
                    c = ' ';
                    break;
                }
                c = 65535;
                break;
            case 1896745880:
                if (str2.equals("VSMSG_cacheVideoSnapshot")) {
                    c = 24;
                    break;
                }
                c = 65535;
                break;
            case 1933318321:
                if (str2.equals("VSMSG_getProgressPosition")) {
                    c = '=';
                    break;
                }
                c = 65535;
                break;
            case 1939898938:
                if (str2.equals("VSMSG_getNextListInfo")) {
                    c = 30;
                    break;
                }
                c = 65535;
                break;
            case 1996676381:
                if (str2.equals("VSMSG_refreshForPublisherEdit")) {
                    c = '#';
                    break;
                }
                c = 65535;
                break;
            case 2006206968:
                if (str2.equals("VSMSG_screenMove")) {
                    c = ')';
                    break;
                }
                c = 65535;
                break;
            case 2040831057:
                if (str2.equals("VSMSG_setItemRecognizeShowing")) {
                    c = JSONLexer.EOI;
                    break;
                }
                c = 65535;
                break;
            case 2122273165:
                if (str2.equals("VSMSG_setSlideMode")) {
                    c = '6';
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                psw pswVar = this.l;
                if (!(pswVar instanceof sii)) {
                    return;
                }
                ((sii) pswVar).M();
                return;
            case 1:
                boolean z2 = true;
                if (!(this.l instanceof sii)) {
                    return;
                }
                if (oeb.a("ShortVideo.fixCardState", true)) {
                    z2 = ((ILifecycleService) this.l.z().getService(ILifecycleService.class)).getPageState() == 2;
                }
                if (z2) {
                    ((sii) this.l).N();
                    return;
                } else {
                    spz.c("CardNativeMessageHandler", "page is not appear, ignore doMediaResume");
                    return;
                }
            case 2:
                if (!sil.b() || !(this.l instanceof sii) || spyVar.i == null) {
                    return;
                }
                ((sii) this.l).k().a(oec.a(spyVar.i.get(CommandID.seekTo), -1), oec.a(spyVar.i.get("isPause"), false));
                this.f12487a = true;
                return;
            case 3:
                if (spyVar.g == null) {
                    return;
                }
                spyVar.g.a(this, a.a(this.k, this.c, this.m, spyVar.i.get("componentName").toString()));
                return;
            case 4:
            case 5:
                if (spyVar.g == null) {
                    return;
                }
                spyVar.g.a(this, ((ITrackService) this.l.z().getService(ITrackService.class)).getThisCardCommonTrack(this.l));
                return;
            case 6:
                a.a(this.l, spyVar);
                return;
            case 7:
                if (spyVar.g == null) {
                    return;
                }
                spyVar.g.a(this, ((ITrackService) this.l.z().getService(ITrackService.class)).getDPVCommonTrack());
                return;
            case '\b':
                ((IContainerFrameService) this.k.getService(IContainerFrameService.class)).popCommentFrame(sessionIdRecorder.a(spyVar.d));
                return;
            case '\t':
                ((IContainerFrameService) this.k.getService(IContainerFrameService.class)).onGoodsClick(sessionIdRecorder.a(spyVar.d), spyVar.i != null ? oec.a(spyVar.i.get("url"), (String) null) : null);
                return;
            case '\n':
                a.a(this.l, this.m, spyVar);
                return;
            case 11:
                a4.b("1".equals(spyVar.i.get("type")), oec.a(spyVar.i.get("count"), -1), oec.a(spyVar.i.get("countFmt"), (String) null));
                return;
            case '\f':
                a4.a(oec.a(spyVar.i.get("count"), -1), oec.a(spyVar.i.get("countFmt"), (String) null));
                return;
            case '\r':
                a4.c(true);
                return;
            case 14:
                boolean z3 = true;
                int a5 = oec.a(spyVar.i.get("type"), 1);
                int a6 = oec.a(spyVar.i.get("count"), -1);
                String a7 = oec.a(spyVar.i.get("countFmt"), (String) null);
                if (a5 != 1) {
                    z3 = false;
                }
                a4.c(z3, a6, a7);
                return;
            case 15:
                boolean z4 = true;
                int a8 = oec.a(spyVar.i.get("type"), 1);
                int a9 = oec.a(spyVar.i.get("count"), -1);
                String a10 = oec.a(spyVar.i.get("countFmt"), (String) null);
                if (a8 != 1) {
                    z4 = false;
                }
                a4.a(z4, a9, a10);
                return;
            case 16:
                a.a(this.k, sessionIdRecorder, spyVar);
                return;
            case 17:
                String a11 = oec.a(spyVar.i.get("id"), (String) null);
                String a12 = oec.a(spyVar.i.get("state"), (String) null);
                spz.c("CardNativeMessageHandler", "disableDynamicRecommend VSMSG_enableDynamicRecommend noDynamicContentId=" + a11 + " noDynamicState=" + a12);
                ((IDataService) this.k.getService(IDataService.class)).updateNoDynamicRecContents(a11, "disable".equals(a12));
                return;
            case 18:
                HashMap hashMap = new HashMap();
                hashMap.put("autoplay", Boolean.valueOf(sij.a(str)));
                if (a4.z()) {
                    g = a4.I();
                } else {
                    g = a4.g();
                }
                hashMap.put("dislike", Boolean.valueOf(detailUnlikeRecorder.a(g)));
                int a13 = sij.a();
                hashMap.put("autoPlaySettingState", a13 == 1 ? "true" : a13 == 2 ? "false" : "none");
                hashMap.put(dlu.API_VIBRATE, Boolean.valueOf(d.a(this.k.getContext())));
                psw pswVar2 = this.l;
                if (pswVar2 instanceof sii) {
                    sjm k = ((sii) pswVar2).k();
                    hashMap.put("enablePlayerRate", Boolean.valueOf(k.c()));
                    hashMap.put("playRate", k.cN_());
                }
                if (spyVar.g == null) {
                    return;
                }
                spyVar.g.a(this, hashMap);
                return;
            case 19:
                sij.a(!sij.a(str));
                if (spyVar.g == null) {
                    return;
                }
                HashMap hashMap2 = new HashMap();
                hashMap2.put("autoplay", Boolean.valueOf(sij.a(str)));
                spyVar.g.a(this, hashMap2);
                return;
            case 20:
                if (a4.z()) {
                    g2 = a4.I();
                } else {
                    g2 = a4.g();
                }
                HashMap hashMap3 = new HashMap();
                if (detailUnlikeRecorder.a(g2)) {
                    detailUnlikeRecorder.a(g2, a4.G(), false);
                    hashMap3.put("dislike", false);
                } else {
                    detailUnlikeRecorder.a(g2, a4.G(), true);
                    hashMap3.put("dislike", true);
                }
                if (spyVar.g == null) {
                    return;
                }
                spyVar.g.a(this, hashMap3);
                return;
            case 21:
                ((IContainerService) this.k.getService(IContainerService.class)).getConfig().b(oec.a(spyVar.i.get("isShow"), false));
                return;
            case 22:
                ((IContainerFrameService) this.k.getService(IContainerFrameService.class)).hideCommentFrame();
                return;
            case 23:
                if (this.n == null) {
                    this.n = new obv();
                }
                if ("1".equals(spyVar.i.get("show"))) {
                    this.n.a(this.e.c(), this.m);
                    if (this.m instanceof FscrmidFavorFrameLayout) {
                        ((FscrmidFavorFrameLayout) this.m).disableTouch(!"1".equals(spyVar.i.get("canTouch")));
                    }
                    ple backKeyEventDetector = ((IBackEventService) this.k.getService(IBackEventService.class)).getBackKeyEventDetector();
                    if (backKeyEventDetector == null) {
                        return;
                    }
                    plm plmVar2 = this.o;
                    if (plmVar2 != null) {
                        backKeyEventDetector.a(plmVar2);
                    }
                    this.o = new plm() { // from class: com.taobao.android.fluid.framework.card.cards.base.layer.interactive.eventhandler.nativ.b.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // tb.plm
                        public void d() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("596b2eb", new Object[]{this});
                            }
                        }

                        @Override // tb.plm
                        public boolean onHandleBackKeyEvent() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                return ((Boolean) ipChange2.ipc$dispatch("8cb96814", new Object[]{this})).booleanValue();
                            }
                            if (spyVar.g != null) {
                                HashMap hashMap4 = new HashMap();
                                hashMap4.put("type", "onbackpressed");
                                spyVar.g.a(b.this, hashMap4);
                            }
                            return true;
                        }
                    };
                    backKeyEventDetector.b(this.o);
                    return;
                }
                this.n.a();
                ViewGroup viewGroup = this.m;
                if (viewGroup instanceof FscrmidFavorFrameLayout) {
                    ((FscrmidFavorFrameLayout) viewGroup).disableTouch(false);
                }
                ple backKeyEventDetector2 = ((IBackEventService) this.k.getService(IBackEventService.class)).getBackKeyEventDetector();
                if (backKeyEventDetector2 == null || (plmVar = this.o) == null) {
                    return;
                }
                backKeyEventDetector2.a(plmVar);
                this.o = null;
                return;
            case 24:
                String a14 = soi.a(((sii) this.l).ah().b(), this.m);
                if (sil.b()) {
                    this.f12487a = false;
                }
                if (spyVar.g == null) {
                    return;
                }
                HashMap hashMap4 = new HashMap();
                if (a14 != null) {
                    hashMap4.put("key", a14);
                    hashMap4.put("state", "1");
                } else {
                    hashMap4.put("state", "0");
                }
                spyVar.g.a(this, hashMap4);
                return;
            case 25:
                List list = (List) spyVar.i.get("componentList");
                if (list == null) {
                    return;
                }
                for (int i3 = 0; i3 < list.size(); i3++) {
                    Map map2 = (Map) list.get(i3);
                    String str3 = (String) map2.get("name");
                    int c2 = c((String) map2.get("visibility"));
                    if (c2 >= 0) {
                        if ("topNavBar".equals(str3)) {
                            a2 = ((IContainerService) this.k.getService(IContainerService.class)).getAndSetTopLayoutVisibility(c2);
                        } else if ("h5Layer".equals(str3)) {
                            rgc a15 = this.e.a();
                            if (a15 != null) {
                                a2 = ocf.a(a15.b(), c2);
                            }
                            a2 = -1;
                        } else {
                            if ("progressBar".equals(str3)) {
                                psw pswVar3 = this.l;
                                if (pswVar3 instanceof sii) {
                                    a2 = ((sii) pswVar3).k().a(c2);
                                }
                            }
                            a2 = -1;
                        }
                        map2.put("visibility", a(a2));
                    }
                }
                if (spyVar.g == null) {
                    return;
                }
                spyVar.g.a(this, spyVar.i);
                return;
            case 26:
                ((ISceneConfigService) this.k.getService(ISceneConfigService.class)).setItemRecognizeShowing(oec.a(spyVar.i.get("isShow"), false));
                return;
            case 27:
                LandscapeController b3 = ((sii) this.l).p().b();
                if (b3 == null) {
                    return;
                }
                b3.b();
                return;
            case 28:
                Map map3 = spyVar.i;
                if (map3 != null) {
                    i = -1;
                    i2 = oec.a(map3.get("index"), -1);
                } else {
                    i = -1;
                    i2 = -1;
                }
                if (i2 == i) {
                    i2 = ((IDataService) this.k.getService(IDataService.class)).getIndexOfList(sessionIdRecorder.b(spyVar.d));
                }
                ((IDataService) this.k.getService(IDataService.class)).removeDetailListAtIndex(i2);
                return;
            case 29:
                int indexOfList = ((IDataService) this.k.getService(IDataService.class)).getIndexOfList(sessionIdRecorder.b(spyVar.d));
                int totalCount = ((IDataService) this.k.getService(IDataService.class)).getTotalCount();
                if (spyVar.g == null) {
                    return;
                }
                HashMap hashMap5 = new HashMap();
                hashMap5.put("index", Integer.valueOf(indexOfList));
                hashMap5.put("count", Integer.valueOf(totalCount));
                spyVar.g.a(this, hashMap5);
                return;
            case 30:
                if (spyVar.g == null) {
                    return;
                }
                try {
                    int indexOfList2 = ((IDataService) this.k.getService(IDataService.class)).getIndexOfList(sessionIdRecorder.b(spyVar.d));
                    HashMap hashMap6 = new HashMap();
                    List<com.taobao.android.fluid.framework.data.datamodel.a> unmodifiableMediaSetList = ((IDataService) this.k.getService(IDataService.class)).getUnmodifiableMediaSetList();
                    if (unmodifiableMediaSetList != null && indexOfList2 != -1) {
                        int i4 = indexOfList2 + 1;
                        if (i4 == ((IDataService) this.k.getService(IDataService.class)).getTotalCount()) {
                            spyVar.g.a(this, hashMap6);
                            return;
                        }
                        a.c a16 = unmodifiableMediaSetList.get(i4).a(0);
                        JSONObject jSONObject = new JSONObject();
                        if (a16 != null) {
                            jSONObject.putAll(a16.d);
                            jSONObject.put("cardMap", (Object) a16.b);
                        }
                        hashMap6.put("nextListInfo", jSONObject);
                        spyVar.g.a(this, hashMap6);
                        return;
                    }
                    spyVar.g.a(this, hashMap6);
                    return;
                } catch (Throwable th) {
                    spz.a("CardNativeMessageHandler", "", th);
                    return;
                }
            case 31:
                ((sii) this.l).e(oec.a(spyVar.i.get(obw.IS_HOOK_VIDEO_END), false));
                return;
            case ' ':
                ((sii) this.l).k().k();
                return;
            case '!':
                if (spyVar.g == null) {
                    return;
                }
                HashMap hashMap7 = new HashMap();
                hashMap7.put("coverState", Boolean.valueOf(c.a(this.l.z(), (Activity) this.m.getContext())));
                spyVar.g.a(this, hashMap7);
                return;
            case '\"':
            case '#':
                ((IDataService) this.k.getService(IDataService.class)).refreshCurrentData(sessionIdRecorder.b(spyVar.d), spyVar.g, this);
                return;
            case '$':
                try {
                    String a17 = oec.a(spyVar.i.get("lid"), (String) null);
                    String a18 = oec.a(spyVar.i.get("type"), (String) null);
                    String a19 = oec.a(spyVar.i.get("name"), (String) null);
                    Map a20 = oec.a(spyVar.i.get("props"), (Map) null);
                    Map a21 = oec.a(spyVar.i.get("ext"), (Map) null);
                    spz.c("CardNativeMessageHandler", "VSMSG_submitAggregateLog,   " + a17 + ", " + a18 + ", " + a19 + ", " + a20 + ", " + a21);
                    ljq.a(this.l, a17, a18, a19, a20, a21);
                    return;
                } catch (Exception e) {
                    spz.c("CardNativeMessageHandler", "VSMSG_submitAggregateLog, error : " + e.getMessage());
                    return;
                }
            case '%':
                if (a4 == null || (map = spyVar.i) == null) {
                    return;
                }
                a4.b.putAll(map);
                return;
            case '&':
                if (spyVar.g == null) {
                    return;
                }
                spyVar.g.a(this, ljq.b(this.l));
                return;
            case '\'':
                if (spyVar.g == null || (b2 = ((sii) this.l).ah().b()) == null) {
                    return;
                }
                HashMap hashMap8 = new HashMap(4);
                int i5 = b2.i;
                int i6 = b2.h;
                int i7 = b2.k;
                float h = ohd.h(obu.e());
                float f = ((i7 - i5) / 2.0f) + h;
                spz.a("CardNativeMessageHandler", "MSG_GET_VIDEO_SIZE = " + b2 + " statusbarHeight=" + h + " videoTop=" + f);
                hashMap8.put("videoTop", Float.valueOf(f));
                hashMap8.put("topHeight", Float.valueOf(h));
                hashMap8.put("videoHeight", Integer.valueOf(i5));
                hashMap8.put("videoWidth", Integer.valueOf(i6));
                spyVar.g.a(this, hashMap8);
                return;
            case '(':
                if (spyVar.i == null) {
                    return;
                }
                ((IContainerFrameService) this.k.getService(IContainerFrameService.class)).handleAlbumDetail(new AlbumData(oec.a(spyVar.i.get("type"), (String) null), oec.a(spyVar.i.get(LogContext.NEED_MOVE), (String) null), oec.a(spyVar.i.get("albumPosition"), (String) null)), sessionIdRecorder.b(spyVar.d));
                return;
            case ')':
            case '*':
                if (spyVar.i == null || !sjt.b()) {
                    return;
                }
                int a22 = oec.a(spyVar.i.get("animDura"), -1);
                int a23 = oec.a(spyVar.i.get("distance"), 0);
                boolean a24 = oec.a(spyVar.i.get("isAnimate"), false);
                boolean a25 = oec.a(spyVar.i.get("isWeexFollowMove"), false);
                boolean a26 = oec.a(spyVar.i.get("isReset"), false);
                int a27 = ohd.a((Context) null, a23);
                sia a28 = new sia.a().a(this.m).c(a22).a(a26 ? -a27 : 0).a(a24).b(a25).b(a27).d(a26).c(TextUtils.equals(spyVar.c, "VSMSG_screenMoveV2")).a(oec.a(spyVar.i.get("interpolatorType"), "linear")).b(oec.a(spyVar.i.get(e.KEY_BG_COLOR), (String) null)).a();
                if (iqw.j()) {
                    this.l.F().a(a28);
                }
                shy.a(a28);
                return;
            case '+':
                if (spyVar.i == null) {
                    return;
                }
                a.a(this.l, spyVar, oec.a(spyVar.i.get("contentId"), (String) null), "1".equals(spyVar.i.get("isUp")), oec.a(spyVar.i.get("data"), (Map) null));
                return;
            case ',':
                String a29 = spyVar.i != null ? oec.a(spyVar.i.get("key"), (String) null) : null;
                Map hashMap9 = new HashMap();
                if (a29 == null) {
                    hashMap9 = a4.b;
                } else {
                    hashMap9.put(a29, a4.b.get(a29));
                }
                if (spyVar.g == null) {
                    return;
                }
                spyVar.g.a(this, hashMap9);
                return;
            case '-':
                if (spyVar.g == null || !(this.l instanceof sii)) {
                    return;
                }
                HashMap hashMap10 = new HashMap();
                hashMap10.put("playRate", ((sii) this.l).k().cN_());
                spyVar.g.a(this, hashMap10);
                return;
            case '.':
                if (spyVar.i == null || spyVar.g == null || !(this.l instanceof sii)) {
                    return;
                }
                ((sii) this.l).k().a(oec.a(spyVar.i.get("playRate"), sjn.DEFAULT_PLAY_RATE));
                spyVar.g.a((spx) this, (Object) true);
                return;
            case '/':
                Map map4 = spyVar.i;
                if (map4 != null && (this.l instanceof psy)) {
                    if (map4.containsKey("upShow")) {
                        z = false;
                        bool = Boolean.valueOf(oec.a(map4.get("upShow"), false));
                    } else {
                        z = false;
                        bool = null;
                    }
                    ((psy) this.l).a(bool, map4.containsKey("downShow") ? Boolean.valueOf(oec.a(map4.get("downShow"), z)) : null);
                    break;
                }
                break;
            case '1':
                if (spyVar.i == null || (moreButton = ((IContainerService) this.k.getService(IContainerService.class)).getMoreButton()) == null) {
                    return;
                }
                moreButton.setVisibility(oec.a(spyVar.i.get("visible"), true) ? 0 : 8);
                return;
            case '2':
                try {
                    if (spyVar.i == null) {
                        return;
                    }
                    ((IDataService) this.k.getService(IDataService.class)).updateAppendRecommenParams(new JSONObject(spyVar.i));
                    return;
                } catch (Throwable th2) {
                    spz.c("CardNativeMessageHandler", "MSG_ADD_RECOMMEND_EXTENDPARAMS, error : " + th2.getMessage());
                    return;
                }
            case '3':
                try {
                    if (spyVar.i == null || spyVar.g == null) {
                        return;
                    }
                    jqu detailVideoPositiveFeedbackIdsModel = ((IDataService) this.k.getService(IDataService.class)).getDetailVideoPositiveFeedbackIdsModel();
                    String I = a4.I();
                    if (TextUtils.isEmpty(I)) {
                        I = a4.g();
                    }
                    boolean z5 = detailVideoPositiveFeedbackIdsModel != null && detailVideoPositiveFeedbackIdsModel.b(I);
                    HashMap hashMap11 = new HashMap();
                    hashMap11.put("state", z5 ? "true" : "false");
                    spyVar.g.a(this, hashMap11);
                    return;
                } catch (Throwable th3) {
                    spz.c("CardNativeMessageHandler", "MSG_GET_FEEDBACK_STATE, error : " + th3.getMessage());
                    return;
                }
            case '4':
                try {
                    oek.a(this.m.getContext(), new JSONObject(spyVar.i));
                    return;
                } catch (Throwable th4) {
                    spz.c("CardNativeMessageHandler", "MSG_ANIMATE_MEDIACARD, error : " + th4.getMessage());
                    return;
                }
            case '5':
                spz.c("CardNativeMessageHandler", "VSMSG_mediaCardAnimated");
                this.e.e();
                return;
            case '6':
                if (spyVar.i == null) {
                    return;
                }
                ViewGroup viewGroup2 = this.m;
                if (!(viewGroup2 instanceof RoundCornerLayout)) {
                    return;
                }
                ((RoundCornerLayout) viewGroup2).setLockList(oec.a(spyVar.i.get("lockList"), false));
                return;
            case '7':
                if (spyVar.i == null || !(this.l instanceof psy)) {
                    return;
                }
                spz.c("CardNativeMessageHandler", "VSMSG_updatePlayerUtParams, value=" + spyVar.i);
                ((psy) this.l).a(spyVar.i);
                return;
            case '8':
                if (spyVar.i == null) {
                    return;
                }
                smk.a(this.l.z(), oec.a(spyVar.i.get("type"), ""), oec.a(spyVar.i.get("contentId"), ""), oec.a(spyVar.i.get("index"), ""), oec.a(spyVar.i.get(UCClient.UI_PARAMS_KEY_GESTURE), ""), oec.a(spyVar.i.get("currentData"), ""));
                return;
            case '9':
                if (spyVar.i == null || !(this.l instanceof psy) || !a.a()) {
                    return;
                }
                float b4 = oec.b(spyVar.i.get("value"), -1);
                spz.c("CardNativeMessageHandler", "VSMSG_setPlayerVolume, value=" + b4);
                ((psy) this.l).a(b4);
                return;
            case ':':
                a.b(this.k, spyVar);
                return;
            case ';':
                a.a(this.k, this, spyVar);
                return;
            case '<':
                a.a(this.k, spyVar);
                return;
            case '=':
                if (spyVar.g == null) {
                    return;
                }
                String f2 = ((sii) this.l).aa().f();
                spz.c("CardNativeMessageHandler", "VSMSG_getProgressPosition，positionState=" + f2);
                HashMap hashMap12 = new HashMap();
                hashMap12.put("position", f2);
                spyVar.g.a(this, hashMap12);
                return;
            case '>':
                if (spyVar.i == null || (a3 = oec.a(spyVar.i.get("configs"), (List) null)) == null || (trackTint = ((ITrackService) this.k.getService(ITrackService.class)).getTrackTint()) == null) {
                    return;
                }
                trackTint.a(spyVar.f33836a, a3);
                return;
            case '?':
                if (spyVar.g == null) {
                    return;
                }
                spyVar.g.a(this, Boolean.valueOf(sjt.u()));
                return;
        }
        spz.a("CardNativeMessageHandler", "没有处理消息:" + spyVar.toString());
    }

    @Override // tb.ptk, tb.spx
    public boolean d(spy spyVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("cabd9b23", new Object[]{this, spyVar})).booleanValue() : "web".equals(spyVar.b) ? b.contains(spyVar.c) && b(spyVar.d) : b.contains(spyVar.c) && spyVar.d.equals(this.g);
    }

    private int c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("88097ea7", new Object[]{this, str})).intValue();
        }
        if ("visible".equals(str)) {
            return 0;
        }
        if ("gone".equals(str)) {
            return 8;
        }
        return "invisible".equals(str) ? 4 : -1;
    }
}
