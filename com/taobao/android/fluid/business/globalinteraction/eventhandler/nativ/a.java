package com.taobao.android.fluid.business.globalinteraction.eventhandler.nativ;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.parser.JSONLexer;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilitykit.ability.pop.render.IAKPopRender;
import com.taobao.android.fluid.FluidSDK;
import com.taobao.android.fluid.business.globalinteraction.IInteractionService;
import com.taobao.android.fluid.business.globalinteraction.eventhandler.nativ.contacts.ReadContactsTask;
import com.taobao.android.fluid.business.usertrack.ITrackService;
import com.taobao.android.fluid.business.videocollection.helper.ICollectionService;
import com.taobao.android.fluid.business.videocollection.poplayer.INativeCollectionPoplayerService;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.activityresult.IActivityResultService;
import com.taobao.android.fluid.framework.back.IBackEventService;
import com.taobao.android.fluid.framework.card.ICardService;
import com.taobao.android.fluid.framework.container.IContainerService;
import com.taobao.android.fluid.framework.data.IDataService;
import com.taobao.android.fluid.framework.data.datamodel.a;
import com.taobao.android.fluid.framework.data.datamodel.b;
import com.taobao.android.fluid.framework.data.remote.c;
import com.taobao.android.fluid.framework.deprecated.message.IMessageService;
import com.taobao.android.fluid.framework.device.sensor.d;
import com.taobao.android.fluid.framework.lifecycle.ILifecycleService;
import com.taobao.android.fluid.framework.list.IFeedsListService;
import com.taobao.android.fluid.framework.media.IMediaService;
import com.taobao.android.fluid.framework.mute.helper.f;
import com.taobao.android.fluid.framework.scene.ISceneConfigService;
import com.taobao.android.fluid.framework.shareplayer.ISharePlayerService;
import com.taobao.weex.utils.WXUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.iqy;
import tb.jum;
import tb.kge;
import tb.ljq;
import tb.obo;
import tb.obu;
import tb.obz;
import tb.oeb;
import tb.oec;
import tb.ogv;
import tb.ohd;
import tb.psw;
import tb.ptk;
import tb.sii;
import tb.sjt;
import tb.skk;
import tb.slk;
import tb.smb;
import tb.spj;
import tb.spo;
import tb.spv;
import tb.spy;
import tb.spz;
import tb.suz;

/* loaded from: classes5.dex */
public class a extends ptk {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final FluidContext f12386a;
    private final Context b;
    private IInteractionService c;

    static {
        kge.a(-89343130);
    }

    public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ void a(a aVar, spy spyVar, slk.a aVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1bbccff4", new Object[]{aVar, spyVar, aVar2});
        } else {
            aVar.a(spyVar, aVar2);
        }
    }

    public a(FluidContext fluidContext, Context context) {
        this.f12386a = fluidContext;
        this.b = context;
        this.i = 2;
        b();
        this.c = (IInteractionService) fluidContext.getService(IInteractionService.class);
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        this.j.add("VSMSG_closeRightView");
        this.j.add("VSMSG_openRightView");
        this.j.add("VSMSG_onlyTouchWeex");
        this.j.add("VSMSG_onlyTouchOpenInteract");
        this.j.add("VSMSG_defaultTouch");
        this.j.add("VSMSG_addCart");
        this.j.add("VSMSG_navToUrl");
        this.j.add("VSMSG_printLog");
        this.j.add("VSMSG_edgeComputeFeedBack");
        this.j.add("VSMSG_reRank");
        this.j.add("VSMSG_playNext");
        this.j.add("VSMSG_playPre");
        this.j.add("VSMSG_showFocusView");
        this.j.add("VSMSG_setForceLoop");
        this.j.add("VSMSG_lockListView");
        this.j.add("VSMSG_getMuteState");
        this.j.add("VSMSG_clickMute");
        this.j.add("VSMSG_hasShowMuteTips");
        this.j.add("VSMSG_syncPageMap");
        this.j.add("VSMSG_syncProcessMap");
        this.j.add("VSMSG_getPageAggregateLog");
        this.j.add("VSMSG_getMainList");
        this.j.add("VSMSG_requestList");
        this.j.add("VSMSG_requestRecommend");
        this.j.add("VSMSG_requestRelatedCollection");
        this.j.add("VSMSG_scrollToItem");
        this.j.add("VSMSG_getCommonMuteState");
        this.j.add("VSMSG_getGlobalMuteState");
        this.j.add("VSMSG_stateChanged");
        this.j.add("VSMSG_mediaCardAnimated");
        this.j.add("VSMSG_clickExit");
        this.j.add("VSMSG_getContacts");
        this.j.add("VSMSG_enableInterceptBack");
        this.j.add("VSMSG_exitFullPage");
        this.j.add("VSMSG_getTabbarVisibility");
        this.j.add("VSMSG_removeAuthorCards");
        this.j.add("VSMSG_getVibrateSetting");
        this.j.add("VSMSG_setVibrateSetting");
        this.j.add("VSMSG_refreshSessionParams");
        this.j.add("VSMSG_isUnderageMode");
        this.j.add("VSMSG_getAppearState");
        this.j.add("VSMSG_getInitEnvOptions");
        this.j.add(suz.GET_CARD_DATA_NAME);
        this.j.add("VSMSG_openCompilationsPop");
        this.j.add("VSMSG_updateCommonTrack");
        this.j.add("VSMSG_interactionTaskPanelStatusChanged");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // tb.ptk, tb.spx
    public void a(spy spyVar) {
        char c;
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff34879c", new Object[]{this, spyVar});
            return;
        }
        Map<? extends String, ? extends Object> map = spyVar.i;
        IFeedsListService iFeedsListService = (IFeedsListService) this.f12386a.getService(IFeedsListService.class);
        IContainerService iContainerService = (IContainerService) this.f12386a.getService(IContainerService.class);
        ISceneConfigService iSceneConfigService = (ISceneConfigService) this.f12386a.getService(ISceneConfigService.class);
        String str = spyVar.c;
        int i = -1;
        switch (str.hashCode()) {
            case -2104671207:
                if (str.equals("VSMSG_onlyTouchWeex")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -2003200578:
                if (str.equals("VSMSG_stateChanged")) {
                    c = 29;
                    break;
                }
                c = 65535;
                break;
            case -1924032964:
                if (str.equals("VSMSG_openRightView")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -1775710179:
                if (str.equals("VSMSG_getMuteState")) {
                    c = 15;
                    break;
                }
                c = 65535;
                break;
            case -1610975460:
                if (str.equals("VSMSG_getInitEnvOptions")) {
                    c = '*';
                    break;
                }
                c = 65535;
                break;
            case -1596569540:
                if (str.equals("VSMSG_openCompilationsPop")) {
                    c = 24;
                    break;
                }
                c = 65535;
                break;
            case -1589874150:
                if (str.equals("VSMSG_reRank")) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case -1298205284:
                if (str.equals("VSMSG_updateCommonTrack")) {
                    c = ',';
                    break;
                }
                c = 65535;
                break;
            case -1171627014:
                if (str.equals("VSMSG_getGlobalMuteState")) {
                    c = 17;
                    break;
                }
                c = 65535;
                break;
            case -1022411886:
                if (str.equals("VSMSG_requestList")) {
                    c = 25;
                    break;
                }
                c = 65535;
                break;
            case -785628488:
                if (str.equals("VSMSG_onlyTouchOpenInteract")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -736075044:
                if (str.equals("VSMSG_mediaCardAnimated")) {
                    c = 30;
                    break;
                }
                c = 65535;
                break;
            case -726958853:
                if (str.equals(suz.GET_CARD_DATA_NAME)) {
                    c = '+';
                    break;
                }
                c = 65535;
                break;
            case -661806706:
                if (str.equals("VSMSG_getContacts")) {
                    c = '!';
                    break;
                }
                c = 65535;
                break;
            case -623596073:
                if (str.equals("VSMSG_exitFullPage")) {
                    c = ' ';
                    break;
                }
                c = 65535;
                break;
            case -460876056:
                if (str.equals("VSMSG_setVibrateSetting")) {
                    c = '&';
                    break;
                }
                c = 65535;
                break;
            case -446225527:
                if (str.equals("VSMSG_lockListView")) {
                    c = 14;
                    break;
                }
                c = 65535;
                break;
            case -322438921:
                if (str.equals("VSMSG_syncPageMap")) {
                    c = 20;
                    break;
                }
                c = 65535;
                break;
            case -315718193:
                if (str.equals("VSMSG_isUnderageMode")) {
                    c = '(';
                    break;
                }
                c = 65535;
                break;
            case -118747281:
                if (str.equals("VSMSG_getPageAggregateLog")) {
                    c = 22;
                    break;
                }
                c = 65535;
                break;
            case -103028942:
                if (str.equals("VSMSG_getMainList")) {
                    c = 23;
                    break;
                }
                c = 65535;
                break;
            case -21086648:
                if (str.equals("VSMSG_requestRecommend")) {
                    c = 27;
                    break;
                }
                c = 65535;
                break;
            case 21883554:
                if (str.equals("VSMSG_playNext")) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case 37936550:
                if (str.equals("VSMSG_addCart")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 151781064:
                if (str.equals("VSMSG_setForceLoop")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 167390923:
                if (str.equals("VSMSG_enableInterceptBack")) {
                    c = '\"';
                    break;
                }
                c = 65535;
                break;
            case 192898425:
                if (str.equals("VSMSG_removeAuthorCards")) {
                    c = '$';
                    break;
                }
                c = 65535;
                break;
            case 226633708:
                if (str.equals("VSMSG_navToUrl")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 408183420:
                if (str.equals("VSMSG_refreshSessionParams")) {
                    c = '\'';
                    break;
                }
                c = 65535;
                break;
            case 479276764:
                if (str.equals("VSMSG_getVibrateSetting")) {
                    c = WXUtils.PERCENT;
                    break;
                }
                c = 65535;
                break;
            case 606543819:
                if (str.equals("VSMSG_clickExit")) {
                    c = 31;
                    break;
                }
                c = 65535;
                break;
            case 606779590:
                if (str.equals("VSMSG_clickMute")) {
                    c = 18;
                    break;
                }
                c = 65535;
                break;
            case 663716406:
                if (str.equals("VSMSG_scrollToItem")) {
                    c = 28;
                    break;
                }
                c = 65535;
                break;
            case 693444884:
                if (str.equals("VSMSG_playPre")) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case 719015513:
                if (str.equals("VSMSG_defaultTouch")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 804147109:
                if (str.equals("VSMSG_showFocusView")) {
                    c = '\r';
                    break;
                }
                c = 65535;
                break;
            case 1163145178:
                if (str.equals("VSMSG_interactionTaskPanelStatusChanged")) {
                    c = '-';
                    break;
                }
                c = 65535;
                break;
            case 1181925389:
                if (str.equals("VSMSG_hasShowMuteTips")) {
                    c = 19;
                    break;
                }
                c = 65535;
                break;
            case 1271920562:
                if (str.equals("VSMSG_printLog")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case 1347407947:
                if (str.equals("VSMSG_getTabbarVisibility")) {
                    c = '#';
                    break;
                }
                c = 65535;
                break;
            case 1388453763:
                if (str.equals("VSMSG_syncProcessMap")) {
                    c = 21;
                    break;
                }
                c = 65535;
                break;
            case 1431703221:
                if (str.equals("VSMSG_requestRelatedCollection")) {
                    c = JSONLexer.EOI;
                    break;
                }
                c = 65535;
                break;
            case 1495606756:
                if (str.equals("VSMSG_closeRightView")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 1927154756:
                if (str.equals("VSMSG_edgeComputeFeedBack")) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case 2097598130:
                if (str.equals("VSMSG_getCommonMuteState")) {
                    c = 16;
                    break;
                }
                c = 65535;
                break;
            case 2120494305:
                if (str.equals("VSMSG_getAppearState")) {
                    c = ')';
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        String str2 = "";
        Bundle bundle = null;
        spo spoVar = null;
        switch (c) {
            case 0:
                return;
            case 1:
                IMediaService iMediaService = (IMediaService) this.f12386a.getService(IMediaService.class);
                if (iMediaService == null) {
                    return;
                }
                int a2 = oec.a(map.get("loop"), -1);
                if (1 == a2) {
                    iMediaService.getConfig().b(true);
                    return;
                } else if (a2 != 0) {
                    return;
                } else {
                    iMediaService.getConfig().b(false);
                    return;
                }
            case 2:
                return;
            case 3:
            case 4:
                if (iFeedsListService != null) {
                    iFeedsListService.setScrollLockedExternal(true);
                }
                if (iContainerService != null) {
                    iContainerService.setLockedTouchEvent(true);
                }
                if (iSceneConfigService == null) {
                    return;
                }
                iSceneConfigService.getSlidePageLockConfigure().a(true);
                return;
            case 5:
                if (iFeedsListService != null) {
                    iFeedsListService.setScrollLockedExternal(false);
                }
                if (iContainerService != null) {
                    iContainerService.setLockedTouchEvent(false);
                }
                if (iSceneConfigService == null) {
                    return;
                }
                iSceneConfigService.getSlidePageLockConfigure().a(false);
                return;
            case 6:
                ((IActivityResultService) this.f12386a.getService(IActivityResultService.class)).navToCartForResult(oec.a(map.get("itemId"), (String) null));
                return;
            case 7:
                Object obj = map.get("miniWindow");
                Object obj2 = map.get("enableSharePlayer");
                Object obj3 = map.get("url");
                if (obj3 == null) {
                    return;
                }
                String obj4 = obj3.toString();
                if (TextUtils.equals((String) obj2, "1")) {
                    if (spv.a().d(obj4)) {
                        ((ISharePlayerService) this.f12386a.getService(ISharePlayerService.class)).setEnableInnerSharePlayer(true);
                        obj4 = spv.a().a(this.f12386a, obj4);
                    }
                } else if ("1".equals(obj)) {
                    a(this.b, this.f12386a);
                }
                try {
                    com.taobao.android.fluid.framework.data.datamodel.a currentMediaSetData = ((IDataService) this.f12386a.getService(IDataService.class)).getCurrentMediaSetData();
                    if (c() && currentMediaSetData != null && currentMediaSetData.a() != null && currentMediaSetData.a().d != null && currentMediaSetData.a().d.get("transmitParams") != null) {
                        obj4 = iqy.a().a(this.f12386a, obj4, (JSONObject) currentMediaSetData.a().d.get("transmitParams"));
                    }
                } catch (Exception e) {
                    spz.c("GlobalNativeMessageHandler", "合集跳转拦截失败" + e);
                }
                Object obj5 = map.get("nativeParams");
                if (obj5 instanceof JSONObject) {
                    bundle = new Bundle();
                    for (Map.Entry<String, Object> entry : ((JSONObject) obj5).entrySet()) {
                        String key = entry.getKey();
                        Object value = entry.getValue();
                        if (value != null) {
                            bundle.putString(key, value.toString());
                        }
                    }
                }
                FluidSDK.getNavAdapter().nav(this.f12386a, this.b, obj4, bundle);
                return;
            case '\b':
                String a3 = map != null ? oec.a(map.get("tag"), str2) : str2;
                if (map != null) {
                    str2 = oec.a(map.get("message"), str2);
                }
                if ((map != null ? oec.a(map.get("level"), "debug") : "debug").equals("debug")) {
                    spz.a(a3, str2);
                    return;
                } else {
                    spz.c(a3, str2);
                    return;
                }
            case '\t':
                a(map);
                return;
            case '\n':
                return;
            case 11:
                if (iFeedsListService == null) {
                    return;
                }
                iFeedsListService.publicNextVideo();
                return;
            case '\f':
                if (iFeedsListService == null) {
                    return;
                }
                iFeedsListService.publicPreVideo();
                return;
            case '\r':
                return;
            case 14:
                boolean a4 = oec.a(map.get("isLocked"), false);
                spz.c("GlobalNativeMessageHandler", "VSMSG_lockListView; isLocked=" + a4);
                if (iFeedsListService == null) {
                    return;
                }
                iFeedsListService.setScrollLockedExternal(a4);
                return;
            case 15:
            case 16:
                if (spyVar.g == null) {
                    return;
                }
                spyVar.g.a(this, f.d(this.f12386a));
                return;
            case 17:
                if (spyVar.g == null) {
                    return;
                }
                spyVar.g.a(this, f.e(this.f12386a));
                return;
            case 18:
                f.a(this.f12386a, map);
                return;
            case 19:
                f.f(this.f12386a);
                return;
            case 20:
                if (iSceneConfigService != null) {
                    spoVar = iSceneConfigService.getGlobalState();
                }
                if (spoVar == null || map == null) {
                    return;
                }
                spoVar.f33816a.putAll(map);
                return;
            case 21:
                if (map == null) {
                    return;
                }
                obu.processMap.putAll(map);
                return;
            case 22:
                if (spyVar.g == null) {
                    return;
                }
                spyVar.g.a(this, ljq.f(this.f12386a));
                return;
            case 23:
                if (spyVar.g == null) {
                    return;
                }
                spyVar.g.a(this, a(this.f12386a));
                return;
            case 24:
                spz.c("GlobalNativeMessageHandler", "Native收到点击合集浮层事件");
                ArrayList<com.taobao.android.fluid.framework.data.datamodel.a> mediaSetList = ((IDataService) this.f12386a.getService(IDataService.class)).getMediaSetList();
                if (this.f12386a.getService(INativeCollectionPoplayerService.class) == null) {
                    return;
                }
                ((INativeCollectionPoplayerService) this.f12386a.getService(INativeCollectionPoplayerService.class)).clickCompilationsPop(mediaSetList, this.f12386a, this.b);
                return;
            case 25:
                if (map != null) {
                    Object obj6 = map.get("isTop");
                    if (obj6 instanceof String) {
                        z = Boolean.valueOf((String) obj6).booleanValue();
                    }
                    i = oec.a(map.get(c.COLLECTION_ORDER), -1);
                }
                a(z, null, i, spyVar);
                return;
            case 26:
                f(spyVar);
                return;
            case 27:
                e(spyVar);
                return;
            case 28:
                if (map == null) {
                    return;
                }
                Object obj7 = map.get("id");
                if (!(obj7 instanceof String) || iFeedsListService == null) {
                    return;
                }
                iFeedsListService.scrollToItem((String) obj7);
                return;
            case 29:
                if (!TextUtils.equals(oec.a(map.get("state"), (String) null), "active")) {
                    return;
                }
                this.c.setGlobalLayerVisibility(true);
                return;
            case 30:
                this.c.setGlobalLayerVisibility(true);
                return;
            case 31:
            case ' ':
                FluidContext fluidContext = this.f12386a;
                if (fluidContext == null) {
                    return;
                }
                ((IBackEventService) fluidContext.getService(IBackEventService.class)).handleExitFullPage();
                return;
            case '!':
                b(spyVar);
                return;
            case '\"':
                FluidContext fluidContext2 = this.f12386a;
                if (fluidContext2 == null) {
                    return;
                }
                ((IBackEventService) fluidContext2.getService(IBackEventService.class)).acceptEnableInterceptBackMsg(spyVar);
                return;
            case '#':
                if (spyVar.g == null) {
                    return;
                }
                HashMap hashMap = new HashMap();
                hashMap.put("visible", Boolean.valueOf(com.taobao.tao.flexbox.layoutmanager.adapter.a.a().b().g()));
                spyVar.g.a(this, hashMap);
                return;
            case '$':
                if (map != null) {
                    str2 = oec.a(map.get("authorId"), str2);
                }
                if (TextUtils.isEmpty(str2)) {
                    return;
                }
                ((IDataService) this.f12386a.getService(IDataService.class)).removeDetailListWithAuthor(str2);
                return;
            case '%':
                spz.c("GlobalNativeMessageHandler", "--MSG_GET_VIBERATE_SETTING");
                boolean a5 = d.a(this.f12386a.getContext());
                HashMap hashMap2 = new HashMap();
                hashMap2.put("enable", Boolean.toString(a5));
                spyVar.g.a(this, hashMap2);
                return;
            case '&':
                spz.c("GlobalNativeMessageHandler", map + "--MSG_SET_VIBERATE_SETTING");
                if (map == null) {
                    return;
                }
                d.a(((IMessageService) this.f12386a.getService(IMessageService.class)).getMessageCenter(), this.b, ((Boolean) map.get("setEnable")).booleanValue());
                return;
            case '\'':
                if (iSceneConfigService != null) {
                    iSceneConfigService.refreshSessionParams(map);
                }
                if (iContainerService == null) {
                    return;
                }
                iContainerService.refreshWithCallback(null);
                return;
            case '(':
                spz.c("GlobalNativeMessageHandler", "MSG_GET_IS_UNDERAGEMODE");
                if (spyVar.g == null) {
                    return;
                }
                HashMap hashMap3 = new HashMap();
                hashMap3.put("isUnderageMode", Boolean.valueOf(com.taobao.android.fluid.business.undermode.helper.a.INSTANCE.a()));
                spyVar.g.a(this, hashMap3);
                return;
            case ')':
                if (spyVar.g == null) {
                    return;
                }
                HashMap hashMap4 = new HashMap();
                if (((ILifecycleService) this.f12386a.getService(ILifecycleService.class)).getPageState() == 2) {
                    z = true;
                }
                hashMap4.put("appear", Boolean.valueOf(z));
                spyVar.g.a(this, hashMap4);
                return;
            case '*':
                if (spyVar.g == null) {
                    spz.c("GlobalNativeMessageHandler", "处理获取初始环境配置的消息，callback为空");
                    return;
                }
                HashMap hashMap5 = new HashMap();
                hashMap5.put("options", smb.a(this.f12386a, null));
                spyVar.g.a(this, hashMap5);
                return;
            case '+':
                if (spyVar.g == null) {
                    spz.c("GlobalNativeMessageHandler", "处理获取当前Active卡片数据的消息，callback为空");
                    return;
                }
                a.c d = d();
                if (d == null) {
                    spz.c("GlobalNativeMessageHandler", "处理获取当前Active卡片数据的消息，mediaDetail为空");
                    spyVar.g.a(this, (Object) null);
                    return;
                }
                Object json = JSON.toJSON(d.a(this.f12386a));
                if (json == null) {
                    spz.c("GlobalNativeMessageHandler", "处理获取当前Active卡片数据的消息，mediaDetailObject为空");
                    spyVar.g.a(this, (Object) null);
                    return;
                }
                JSONObject a6 = jum.a(this.f12386a);
                obz.a(a6, (JSONObject) json);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("id", (Object) d.c);
                jSONObject.put("data", (Object) a6);
                spyVar.g.a(this, jSONObject);
                return;
            case ',':
                if (map == null) {
                    return;
                }
                Map<String, String> a7 = oec.a(map.get("params"), (Map) null);
                ITrackService iTrackService = (ITrackService) this.f12386a.getService(ITrackService.class);
                if (iTrackService == null) {
                    return;
                }
                iTrackService.updateCommonTrack(a7);
                return;
            case '-':
                spz.c("GlobalNativeMessageHandler", "VSMSG_interactionTaskPanelStatusChanged, args=" + spyVar.i);
                if (!sjt.H()) {
                    return;
                }
                g(spyVar);
                return;
            default:
                spz.a("GlobalNativeMessageHandler", "没有处理消息:" + spyVar.toString());
                return;
        }
    }

    private void g(spy spyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9646aea2", new Object[]{this, spyVar});
            return;
        }
        ICardService iCardService = (ICardService) this.f12386a.getService(ICardService.class);
        if (iCardService == null) {
            spz.c("GlobalNativeMessageHandler", "VSMSG_interactionTaskPanelStatusChanged, cardService=null");
            return;
        }
        psw activeCard = iCardService.getActiveCard();
        if (spyVar.i == null || !(activeCard instanceof sii)) {
            return;
        }
        sii siiVar = (sii) activeCard;
        String a2 = oec.a(spyVar.i.get("status"), (String) null);
        float b = oec.b(spyVar.i.get("duration"), 0);
        com.taobao.android.fluid.framework.data.datamodel.pop.a aVar = new com.taobao.android.fluid.framework.data.datamodel.pop.a(ohd.b(this.f12386a.getContext(), oec.a(spyVar.i.get("startY"), 0)), ohd.b(this.f12386a.getContext(), oec.a(spyVar.i.get("endY"), 0)), 0, 0, 0, 0);
        aVar.h = (int) (b * 1000.0f);
        aVar.g = true;
        char c = 65535;
        switch (a2.hashCode()) {
            case -1893168552:
                if (a2.equals("willDismiss")) {
                    c = 2;
                    break;
                }
                break;
            case -1751938805:
                if (a2.equals("didDismiss")) {
                    c = 3;
                    break;
                }
                break;
            case -1166096913:
                if (a2.equals("willShow")) {
                    c = 0;
                    break;
                }
                break;
            case 1657043996:
                if (a2.equals("didShow")) {
                    c = 1;
                    break;
                }
                break;
        }
        if (c == 0) {
            siiVar.a(IAKPopRender.LifecycleType.IN_ANIMATION_START, aVar);
        } else if (c == 1) {
            siiVar.a(IAKPopRender.LifecycleType.IN_ANIMATION_END, aVar);
        } else if (c == 2) {
            siiVar.a(IAKPopRender.LifecycleType.OUT_ANIMATION_START, aVar);
        } else if (c != 3) {
        } else {
            siiVar.a(IAKPopRender.LifecycleType.BEFORE_CLOSE, aVar);
        }
    }

    private void e(spy spyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b940a1a0", new Object[]{this, spyVar});
        } else if (spyVar == null) {
        } else {
            Map map = spyVar.i;
            if (ogv.a(map)) {
                return;
            }
            Map a2 = oec.a(map.get("extendParameter"), (Map) null);
            boolean a3 = oec.a(map.get("clearListNextData"), false);
            boolean m = skk.m();
            spz.c("GlobalNativeMessageHandler", "MSG_REQUEST_RECOMMEND,推荐接口：" + map + ",isClearListNextData:" + a3);
            IDataService iDataService = (IDataService) this.f12386a.getService(IDataService.class);
            if (iDataService == null) {
                return;
            }
            if (m && a3) {
                iDataService.clearListNextData();
            }
            a(false, a2, spyVar);
        }
    }

    private void f(spy spyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7c3a821", new Object[]{this, spyVar});
        } else if (spyVar == null) {
        } else {
            Map map = spyVar.i;
            spz.c("GlobalNativeMessageHandler", "MSG_REQUEST_RECOMMEND 相关合集 " + map);
            if (!spj.b()) {
                return;
            }
            ((ICollectionService) this.f12386a.getService(ICollectionService.class)).setCollectionRecommendEnable(true);
            a(false, map, spyVar);
        }
    }

    private void a(boolean z, Map map, int i, final spy spyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff875cbe", new Object[]{this, new Boolean(z), map, new Integer(i), spyVar});
            return;
        }
        IDataService iDataService = (IDataService) this.f12386a.getService(IDataService.class);
        if (iDataService == null) {
            return;
        }
        iDataService.requestListForCollection(z, map, i, new com.taobao.android.fluid.core.a<slk.a>() { // from class: com.taobao.android.fluid.business.globalinteraction.eventhandler.nativ.a.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.fluid.core.a
            public void a(slk.a aVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("17894309", new Object[]{this, aVar});
                } else {
                    a.a(a.this, spyVar, aVar);
                }
            }
        });
    }

    private void a(spy spyVar, slk.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d49fed3d", new Object[]{this, spyVar, aVar});
        } else if (spyVar.g == null) {
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put("success", aVar == null ? "false" : "true");
            spyVar.g.a(this, hashMap);
        }
    }

    private void a(boolean z, Map map, final spy spyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51249ccd", new Object[]{this, new Boolean(z), map, spyVar});
            return;
        }
        IDataService iDataService = (IDataService) this.f12386a.getService(IDataService.class);
        if (iDataService == null) {
            return;
        }
        iDataService.requestList(z, map, new com.taobao.android.fluid.core.a<slk.a>() { // from class: com.taobao.android.fluid.business.globalinteraction.eventhandler.nativ.a.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.fluid.core.a
            public void a(slk.a aVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("17894309", new Object[]{this, aVar});
                } else if (spyVar.g == null) {
                } else {
                    HashMap hashMap = new HashMap();
                    hashMap.put("success", aVar == null ? "false" : "true");
                    spyVar.g.a(a.this, hashMap);
                }
            }
        });
    }

    private static Map a(FluidContext fluidContext) {
        a.c a2;
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("2c5bc44f", new Object[]{fluidContext});
        }
        HashMap hashMap = new HashMap();
        List<com.taobao.android.fluid.framework.data.datamodel.a> unmodifiableMediaSetList = ((IDataService) fluidContext.getService(IDataService.class)).getUnmodifiableMediaSetList();
        if (unmodifiableMediaSetList == null) {
            return hashMap;
        }
        ArrayList arrayList = new ArrayList();
        for (com.taobao.android.fluid.framework.data.datamodel.a aVar : unmodifiableMediaSetList) {
            if (aVar != null && (a2 = aVar.a()) != null && !obo.b(aVar) && (jSONObject = a2.d) != null) {
                arrayList.add(jSONObject);
            }
        }
        hashMap.put("list", arrayList);
        hashMap.put("topHasMore", String.valueOf(!((IDataService) fluidContext.getService(IDataService.class)).isUpNoMoreData()));
        hashMap.put("bottomHasMore", String.valueOf(!((IDataService) fluidContext.getService(IDataService.class)).isDownNoMoreData()));
        return hashMap;
    }

    private static void a(Context context, FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7daeb92", new Object[]{context, fluidContext});
        } else if (!(context instanceof Activity)) {
        } else {
            ((IMediaService) fluidContext.getService(IMediaService.class)).setNeedFloatWindow(true);
        }
    }

    private void a(Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
            return;
        }
        b a2 = b.a(((ISceneConfigService) this.f12386a.getService(ISceneConfigService.class)).getSessionParams(), ((IDataService) this.f12386a.getService(IDataService.class)).getConfig().j());
        a2.d(map);
        ((IDataService) this.f12386a.getService(IDataService.class)).feedbackRequest(a2);
    }

    @Override // tb.ptk, tb.spx
    public boolean d(spy spyVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("cabd9b23", new Object[]{this, spyVar})).booleanValue() : this.j.contains(spyVar.c);
    }

    private void b(final spy spyVar) {
        int parseInt;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edb78e1d", new Object[]{this, spyVar});
            return;
        }
        spz.c("GlobalNativeMessageHandler", "【getUserContacts】start");
        if (spyVar == null) {
            spz.c("GlobalNativeMessageHandler", "message is null");
            return;
        }
        if (spyVar.i != null) {
            try {
                parseInt = Integer.parseInt(String.valueOf(spyVar.i.get(ReadContactsTask.KEY_MAX_PHONE_NUMBER)));
            } catch (Exception e) {
                spz.c("GlobalNativeMessageHandler", "【getUserContacts】parse message args error: " + e.toString());
            }
            new ReadContactsTask(this.b, parseInt, new ReadContactsTask.a() { // from class: com.taobao.android.fluid.business.globalinteraction.eventhandler.nativ.a.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.fluid.business.globalinteraction.eventhandler.nativ.contacts.ReadContactsTask.a
                public void a(ReadContactsTask.ContactsModel contactsModel) {
                    IpChange ipChange2 = $ipChange;
                    int i = 0;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("a3952484", new Object[]{this, contactsModel});
                    } else if (spyVar.g == null) {
                    } else {
                        spyVar.g.a(a.this, contactsModel.toJSONObject());
                        if (contactsModel.phoneNumbers != null) {
                            i = contactsModel.phoneNumbers.size();
                        }
                        spz.c("GlobalNativeMessageHandler", "【getUserContacts】contacts data, phoneNumberSize: " + i);
                    }
                }
            }).execute(new Void[0]);
            spz.c("GlobalNativeMessageHandler", "【getUserContacts】end");
        }
        parseInt = 0;
        new ReadContactsTask(this.b, parseInt, new ReadContactsTask.a() { // from class: com.taobao.android.fluid.business.globalinteraction.eventhandler.nativ.a.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.fluid.business.globalinteraction.eventhandler.nativ.contacts.ReadContactsTask.a
            public void a(ReadContactsTask.ContactsModel contactsModel) {
                IpChange ipChange2 = $ipChange;
                int i = 0;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("a3952484", new Object[]{this, contactsModel});
                } else if (spyVar.g == null) {
                } else {
                    spyVar.g.a(a.this, contactsModel.toJSONObject());
                    if (contactsModel.phoneNumbers != null) {
                        i = contactsModel.phoneNumbers.size();
                    }
                    spz.c("GlobalNativeMessageHandler", "【getUserContacts】contacts data, phoneNumberSize: " + i);
                }
            }
        }).execute(new Void[0]);
        spz.c("GlobalNativeMessageHandler", "【getUserContacts】end");
    }

    private boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue() : oeb.a("ShortVideo.enableDxViewV3", true);
    }

    private a.c d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a.c) ipChange.ipc$dispatch("e2063008", new Object[]{this});
        }
        com.taobao.android.fluid.framework.data.datamodel.a currentMediaSetData = ((IDataService) this.f12386a.getService(IDataService.class)).getCurrentMediaSetData();
        if (currentMediaSetData == null) {
            return null;
        }
        return currentMediaSetData.a();
    }
}
