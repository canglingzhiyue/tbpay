package com.taobao.android.fluid.framework.card.cards.base.layer.interactive.eventhandler.nativ;

import android.app.Activity;
import android.graphics.Rect;
import android.graphics.RectF;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.FluidSDK;
import com.taobao.android.fluid.business.usertrack.ITrackService;
import com.taobao.android.fluid.business.usertrack.track.ut.videotracker.d;
import com.taobao.android.fluid.business.videocollection.helper.ICollectionService;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.adapter.IUTAdapter;
import com.taobao.android.fluid.framework.card.ICardService;
import com.taobao.android.fluid.framework.container.IContainerService;
import com.taobao.android.fluid.framework.data.IDataService;
import com.taobao.android.fluid.framework.data.datamodel.a;
import com.taobao.android.fluid.framework.deprecated.message.IMessageService;
import com.taobao.android.fluid.framework.media.IMediaService;
import com.taobao.android.fluid.framework.scene.ISceneConfigService;
import com.taobao.avplayer.DWNetworkAdapter;
import com.taobao.avplayer.common.w;
import com.taobao.avplayer.core.model.DWRequest;
import com.taobao.avplayer.core.model.DWResponse;
import com.taobao.tao.flexbox.layoutmanager.core.aa;
import com.ut.share.business.ShareBusinessListener;
import com.ut.share.business.ShareContent;
import com.ut.share.business.ShareTargetType;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.jqu;
import tb.kcn;
import tb.kge;
import tb.obq;
import tb.ocf;
import tb.oeb;
import tb.oec;
import tb.psw;
import tb.qmq;
import tb.shw;
import tb.skl;
import tb.spy;
import tb.spz;

/* loaded from: classes5.dex */
public final class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-517901616);
    }

    public static /* synthetic */ void a(FluidContext fluidContext, a.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2df10ed3", new Object[]{fluidContext, cVar});
        } else {
            b(fluidContext, cVar);
        }
    }

    public static void a(psw pswVar, spy spyVar) {
        Map<String, String> thisCardCommonTrack;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d249ab8", new Object[]{pswVar, spyVar});
            return;
        }
        try {
            boolean equals = "true".equals(spyVar.i.get("isDPV"));
            String str = (String) spyVar.i.get("pageName");
            int parseInt = Integer.parseInt((String) spyVar.i.get("eventId"));
            String str2 = (String) spyVar.i.get("arg1");
            String str3 = (String) spyVar.i.get("arg2");
            String str4 = (String) spyVar.i.get("arg3");
            JSONObject jSONObject = (JSONObject) spyVar.i.get("utArgs");
            HashMap hashMap = new HashMap();
            if (equals) {
                thisCardCommonTrack = ((ITrackService) pswVar.z().getService(ITrackService.class)).getDPVCommonTrack();
            } else {
                thisCardCommonTrack = ((ITrackService) pswVar.z().getService(ITrackService.class)).getThisCardCommonTrack(pswVar);
            }
            if (thisCardCommonTrack != null) {
                hashMap.putAll(thisCardCommonTrack);
            }
            if (jSONObject != null) {
                for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
                    hashMap.put(String.valueOf(entry.getKey()), String.valueOf(entry.getValue()));
                }
            }
            IUTAdapter withFluidContext = FluidSDK.getUTAdapter().withFluidContext(pswVar.z());
            if (StringUtils.isEmpty(str)) {
                str = "Page_videointeract";
            }
            withFluidContext.trackCustom(str, parseInt, str2, str3, str4, hashMap);
        } catch (Exception e) {
            spz.a("CardNativeMessageHandler", "ShortVideoMessage.MSG_COMMIT_UT error", e);
            e.printStackTrace();
        }
    }

    public static void a(psw pswVar, spy spyVar, String str, boolean z, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c806e8b3", new Object[]{pswVar, spyVar, str, new Boolean(z), map});
            return;
        }
        try {
            if (!StringUtils.isEmpty(str) && map != null && !map.isEmpty()) {
                FluidContext z2 = pswVar.z();
                shw sessionIdRecorder = ((ICardService) pswVar.z().getService(ICardService.class)).getSessionIdRecorder();
                if (sessionIdRecorder == null) {
                    return;
                }
                int indexOfList = ((IDataService) z2.getService(IDataService.class)).getIndexOfList(sessionIdRecorder.b(spyVar.d));
                List<com.taobao.android.fluid.framework.data.datamodel.a> unmodifiableMediaSetList = ((IDataService) z2.getService(IDataService.class)).getUnmodifiableMediaSetList();
                if (unmodifiableMediaSetList != null && indexOfList != -1) {
                    int totalCount = ((IDataService) z2.getService(IDataService.class)).getTotalCount();
                    if (z) {
                        for (int i = indexOfList - 1; i >= 0 && !a(str, map, unmodifiableMediaSetList, i); i--) {
                        }
                        return;
                    }
                    for (int i2 = indexOfList + 1; i2 < totalCount && !a(str, map, unmodifiableMediaSetList, i2); i2++) {
                    }
                }
            }
        } catch (Throwable th) {
            spz.a("CardNativeMessageHandler", "", th);
        }
    }

    private static boolean a(String str, Map map, List<com.taobao.android.fluid.framework.data.datamodel.a> list, int i) {
        a.c a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6e868783", new Object[]{str, map, list, new Integer(i)})).booleanValue();
        }
        com.taobao.android.fluid.framework.data.datamodel.a aVar = list.get(i);
        if (aVar == null || (a2 = aVar.a()) == null || !str.equals(a2.g())) {
            return false;
        }
        a2.b.putAll(map);
        return true;
    }

    public static void a(FluidContext fluidContext, shw shwVar, spy spyVar) {
        Boolean bool;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a0ba73c", new Object[]{fluidContext, shwVar, spyVar});
        } else if (a(fluidContext).a()) {
        } else {
            Map map = spyVar.i;
            Boolean bool2 = false;
            if (map.get("triggerFromModel") != null) {
                try {
                    bool = (Boolean) map.get("triggerFromModel");
                } catch (Error unused) {
                }
                try {
                    map.remove("triggerFromModel");
                    bool2 = bool;
                } catch (Error unused2) {
                    bool2 = bool;
                    spz.c("CardNativeMessageHandler", "triggerFromModel 数据异常");
                    a(fluidContext, bool2, shwVar.b(spyVar.d), map);
                }
            }
            a(fluidContext, bool2, shwVar.b(spyVar.d), map);
        }
    }

    private static void a(FluidContext fluidContext, Boolean bool, com.taobao.android.fluid.framework.data.datamodel.a aVar, Map map) {
        a.c a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc7e02c", new Object[]{fluidContext, bool, aVar, map});
        } else if (aVar == null || map == null || (a2 = aVar.a()) == null) {
        } else {
            Object obj = map.get("repeatable");
            Object obj2 = map.get("needVideo");
            map.remove("repeatable");
            map.remove("needVideo");
            String I = a2.I();
            if (StringUtils.isEmpty(I)) {
                I = a2.g();
            }
            jqu detailVideoPositiveFeedbackIdsModel = ((IDataService) fluidContext.getService(IDataService.class)).getDetailVideoPositiveFeedbackIdsModel();
            if (StringUtils.isEmpty(I)) {
                spz.a("CardNativeMessageHandler", "positiveFeedback videoDetailInfo.videoId isEmpty");
                return;
            }
            if (!bool.booleanValue() && !oec.a(obj, false)) {
                int videoProgress = ((IMediaService) fluidContext.getService(IMediaService.class)).getVideoProgress();
                if (a2.z() && videoProgress < 3) {
                    spz.a("CardNativeMessageHandler", "positiveFeedback currentVideoProgressInSecond=" + videoProgress);
                    return;
                } else if (detailVideoPositiveFeedbackIdsModel != null && detailVideoPositiveFeedbackIdsModel.b(I)) {
                    return;
                }
            }
            com.taobao.android.fluid.framework.data.datamodel.b a3 = com.taobao.android.fluid.framework.data.datamodel.b.a(((ISceneConfigService) fluidContext.getService(ISceneConfigService.class)).getSessionParams(), a(fluidContext));
            a3.f12532a = aVar;
            a3.a(map);
            if (!((IDataService) fluidContext.getService(IDataService.class)).feedbackRequest(a3)) {
                return;
            }
            if ((obj2 != null && !oec.a(obj2, false)) || bool.booleanValue()) {
                return;
            }
            detailVideoPositiveFeedbackIdsModel.a(I);
        }
    }

    public static void a(final psw pswVar, View view, spy spyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36985c02", new Object[]{pswVar, view, spyVar});
            return;
        }
        d.a(pswVar, "tmp_check_exist_shareclick", (String) null, (String) null, (String) null, (String) null);
        final a.c a2 = ((ICardService) pswVar.z().getService(ICardService.class)).getSessionIdRecorder().a(spyVar.d);
        FluidSDK.getShareAdapter().share(pswVar.z(), (Activity) view.getContext(), spyVar.d, spyVar.i, new ShareBusinessListener() { // from class: com.taobao.android.fluid.framework.card.cards.base.layer.interactive.eventhandler.nativ.a.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.ut.share.business.ShareBusinessListener
            public void onShare(ShareContent shareContent, ShareTargetType shareTargetType) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8a481375", new Object[]{this, shareContent, shareTargetType});
                } else if (shareTargetType == ShareTargetType.Share2DingTalk || shareTargetType == ShareTargetType.Share2SinaWeibo || shareTargetType == ShareTargetType.Share2Alipay) {
                } else {
                    a.a(psw.this.z(), a2);
                }
            }

            @Override // com.ut.share.business.ShareBusinessListener
            public void onFinished(Map<String, String> map) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("ff43b50d", new Object[]{this, map});
                } else if (!StringUtils.equals(map.get(com.taobao.mtop.wvplugin.a.RESULT_KEY), "success")) {
                } else {
                    a.a(psw.this.z(), a2);
                }
            }
        });
    }

    public static skl a(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (skl) ipChange.ipc$dispatch("24f95318", new Object[]{fluidContext}) : ((IDataService) fluidContext.getService(IDataService.class)).getConfig().j();
    }

    private static void b(FluidContext fluidContext, final a.c cVar) {
        String g;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("575887b2", new Object[]{fluidContext, cVar});
            return;
        }
        final IMessageService iMessageService = (IMessageService) fluidContext.getService(IMessageService.class);
        DWRequest dWRequest = new DWRequest();
        dWRequest.apiName = "mtop.taobao.media.share.add";
        dWRequest.apiVersion = "2.0";
        dWRequest.needLogin = true;
        dWRequest.paramMap = new HashMap();
        dWRequest.paramMap.put("namespace", "600010501");
        if (cVar.z()) {
            g = cVar.I();
        } else {
            g = cVar.g();
        }
        dWRequest.paramMap.put("targetId", g);
        new DWNetworkAdapter().sendRequest(new w() { // from class: com.taobao.android.fluid.framework.card.cards.base.layer.interactive.eventhandler.nativ.a.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.avplayer.common.w
            public void onSuccess(DWResponse dWResponse) {
                String g2;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("c6105f72", new Object[]{this, dWResponse});
                    return;
                }
                kcn.c("Share", dWResponse.toString());
                HashMap hashMap = new HashMap();
                hashMap.put("type", "1");
                hashMap.put("contentId", a.c.this.g());
                iMessageService.sendMessage(new spy("VSMSG_finishShare", a.c.this.c, hashMap));
                a.c.this.b();
                HashMap hashMap2 = new HashMap();
                HashMap hashMap3 = new HashMap();
                hashMap3.put("share", "1");
                hashMap3.put("type", a.c.this.G() != null ? a.c.this.G().toLowerCase() : "");
                if (a.c.this.z()) {
                    g2 = a.c.this.I();
                } else {
                    g2 = a.c.this.g();
                }
                hashMap2.put(g2, hashMap3);
                iMessageService.sendMessage(new spy("VSMSG_positiveFeedBack", a.c.this.c, hashMap2));
                if (a.c.this.j()) {
                    return;
                }
                HashMap hashMap4 = new HashMap();
                hashMap4.put("componentsName", "followTintView");
                iMessageService.sendMessage(new spy("VSMSG_showComponent", a.c.this.c, hashMap4));
            }

            @Override // com.taobao.avplayer.common.w
            public void onError(DWResponse dWResponse) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("1f1dda8d", new Object[]{this, dWResponse});
                    return;
                }
                kcn.a("Share", dWResponse.toString());
                HashMap hashMap = new HashMap();
                hashMap.put("type", "0");
                hashMap.put("contentId", a.c.this.g());
                iMessageService.sendMessage(new spy("VSMSG_finishShare", a.c.this.c, hashMap));
            }
        }, dWRequest);
    }

    public static Map a(FluidContext fluidContext, qmq qmqVar, ViewGroup viewGroup, String str) {
        aa a2;
        View x;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("a76735d3", new Object[]{fluidContext, qmqVar, viewGroup, str});
        }
        if (StringUtils.equals(str, "moreButton")) {
            return b(((IContainerService) fluidContext.getService(IContainerService.class)).getMoreButton(), viewGroup);
        }
        aa c = qmqVar.c();
        if (c != null && (a2 = c.a(str, false)) != null && (x = a2.x()) != null) {
            return a(a(x, viewGroup));
        }
        return new HashMap();
    }

    private static Rect a(View view, ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Rect) ipChange.ipc$dispatch("af7bae32", new Object[]{view, viewGroup});
        }
        RectF a2 = ocf.a(view, viewGroup);
        if (a2 == null) {
            return null;
        }
        Rect rect = new Rect();
        float width = 750.0f / viewGroup.getWidth();
        rect.left = (int) (a2.left * width);
        rect.right = (int) (a2.right * width);
        rect.top = (int) (a2.top * width);
        rect.bottom = (int) (a2.bottom * width);
        return rect;
    }

    private static Map b(View view, ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("3cc957bd", new Object[]{view, viewGroup});
        }
        if (view == null) {
            return new HashMap();
        }
        int[] iArr = new int[2];
        int[] iArr2 = new int[2];
        viewGroup.getLocationOnScreen(iArr);
        view.getLocationOnScreen(iArr2);
        int i = iArr2[1] - iArr[1];
        float width = 750.0f / viewGroup.getWidth();
        HashMap hashMap = new HashMap(6);
        hashMap.put("x", Float.valueOf((iArr2[0] - iArr[0]) * width));
        hashMap.put("y", Float.valueOf(i * width));
        hashMap.put("width", Float.valueOf(view.getWidth() * width));
        hashMap.put("height", Float.valueOf(view.getHeight() * width));
        return hashMap;
    }

    private static Map a(Rect rect) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("df92f9a6", new Object[]{rect});
        }
        if (rect == null) {
            return null;
        }
        HashMap hashMap = new HashMap(4);
        hashMap.put("x", Integer.valueOf(rect.left));
        hashMap.put("y", Integer.valueOf(rect.top));
        hashMap.put("width", Integer.valueOf(rect.right - rect.left));
        hashMap.put("height", Integer.valueOf(rect.bottom - rect.top));
        return hashMap;
    }

    public static void a(FluidContext fluidContext, final b bVar, final spy spyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc0185b2", new Object[]{fluidContext, bVar, spyVar});
        } else if (spyVar.i == null) {
            spz.c("CardNativeMessageHandler", "【requestCollectionNextVideo】The message args is null");
        } else {
            ((ICollectionService) fluidContext.getService(ICollectionService.class)).requestCollectionNextVideo(String.valueOf(spyVar.i.get("nextNid")), new obq.a() { // from class: com.taobao.android.fluid.framework.card.cards.base.layer.interactive.eventhandler.nativ.a.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.obq.a
                public void b() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("57a83e9", new Object[]{this});
                    } else if (spy.this.g == null) {
                    } else {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("status", (Object) "success");
                        spy.this.g.a(bVar, jSONObject);
                        spz.c("CardNativeMessageHandler", "【requestCollectionNextVideo】recommend api request success");
                    }
                }

                @Override // tb.obq.a
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    } else if (spy.this.g == null) {
                    } else {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("status", (Object) "failed");
                        spy.this.g.a(bVar, jSONObject);
                        spz.c("CardNativeMessageHandler", "【requestCollectionNextVideo】recommend api request failed");
                    }
                }
            });
        }
    }

    public static void a(FluidContext fluidContext, spy spyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a71ed0ce", new Object[]{fluidContext, spyVar});
        } else if (spyVar == null) {
            spz.c("CardNativeMessageHandler", "【clearCollectionNextVideo】The param mediaController or message is null");
        } else {
            ((ICollectionService) fluidContext.getService(ICollectionService.class)).cancelPlayCollectionNextVideo();
        }
    }

    public static void b(FluidContext fluidContext, spy spyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ccb2d9cf", new Object[]{fluidContext, spyVar});
        } else if (spyVar == null) {
            spz.c("CardNativeMessageHandler", "【clearCollectionNextVideo】The param mediaController or message is null");
        } else {
            ((ICollectionService) fluidContext.getService(ICollectionService.class)).clearCollectionNextVideo();
        }
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : oeb.a("ShortVideo.enableSetPlayerVolume", true);
    }
}
