package com.taobao.taolive.room.controller2;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.text.format.DateUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.proxy.smartlanding.ISmartLandingProxy;
import com.taobao.taolive.room.utils.aa;
import com.taobao.taolive.room.utils.ab;
import com.taobao.taolive.room.utils.ad;
import com.taobao.taolive.room.utils.aw;
import com.taobao.taolive.sdk.mergeInfo.UnImportantLiveInfoRequest;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import com.taobao.taolive.sdk.utils.v;
import java.io.PrintStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import tb.hkk;
import tb.kge;
import tb.phg;
import tb.poy;
import tb.pqj;
import tb.tkh;

/* loaded from: classes8.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-984475225);
    }

    public static /* synthetic */ void a(Context context, com.taobao.alilive.aliliveframework.frame.a aVar, TBLiveDataModel tBLiveDataModel, boolean z, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42a7d5d4", new Object[]{context, aVar, tBLiveDataModel, new Boolean(z), str, str2, str3});
        } else {
            b(context, aVar, tBLiveDataModel, z, str, str2, str3);
        }
    }

    public static void a(final Context context, final com.taobao.alilive.aliliveframework.frame.a aVar, final TBLiveDataModel tBLiveDataModel) {
        com.taobao.taolive.sdk.core.g b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c39cae1e", new Object[]{context, aVar, tBLiveDataModel});
        } else if ((aVar instanceof com.taobao.taolive.sdk.core.h) && ((com.taobao.taolive.sdk.core.h) aVar).O() != null && tBLiveDataModel != null && tBLiveDataModel.mVideoInfo != null && (b = com.taobao.taolive.room.utils.n.b(aVar)) != null && b.F != null && b.F.f() && aa.cX()) {
            b.F.a(true, "goods", new ISmartLandingProxy.d() { // from class: com.taobao.taolive.room.controller2.b.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.live.plugin.proxy.smartlanding.ISmartLandingProxy.d
                public boolean a(String str, JSONObject jSONObject, JSONObject jSONObject2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("5ca495b6", new Object[]{this, str, jSONObject, jSONObject2})).booleanValue();
                    }
                    ab.a("UnImportantLiveInfoRequestUtil", "getComponentList onTaskActionListener popId " + str + " actionData " + jSONObject + " " + jSONObject2);
                    String str2 = null;
                    String string = jSONObject == null ? null : jSONObject.getString(aw.PARAM_ITEM_HOLD_TYPE);
                    String string2 = jSONObject == null ? null : jSONObject.getString(aw.PARAM_ITEM_IDS);
                    if (jSONObject != null) {
                        str2 = jSONObject.getString(aw.PARAM_SJSD_ITEM_ID);
                    }
                    b.a(context, aVar, tBLiveDataModel, false, string, string2, str2);
                    return true;
                }
            });
        } else {
            b(context, aVar, tBLiveDataModel, true, null, null, null);
        }
    }

    private static void b(Context context, com.taobao.alilive.aliliveframework.frame.a aVar, TBLiveDataModel tBLiveDataModel, boolean z, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54b587b3", new Object[]{context, aVar, tBLiveDataModel, new Boolean(z), str, str2, str3});
            return;
        }
        VideoInfo videoInfo = tBLiveDataModel.mVideoInfo;
        UnImportantLiveInfoRequest unImportantLiveInfoRequest = new UnImportantLiveInfoRequest();
        a(context, aVar, unImportantLiveInfoRequest, videoInfo);
        a(context, aVar, unImportantLiveInfoRequest, videoInfo, z, str, str2, str3);
        a(context, aVar, unImportantLiveInfoRequest, videoInfo, tBLiveDataModel);
        c(context, aVar, unImportantLiveInfoRequest, videoInfo);
        d(context, aVar, unImportantLiveInfoRequest, videoInfo);
        e(context, aVar, unImportantLiveInfoRequest, videoInfo);
        f(context, aVar, unImportantLiveInfoRequest, videoInfo);
        g(context, aVar, unImportantLiveInfoRequest, videoInfo);
        h(context, aVar, unImportantLiveInfoRequest, videoInfo);
        i(context, aVar, unImportantLiveInfoRequest, videoInfo);
        com.taobao.taolive.sdk.mergeInfo.b O = ((com.taobao.taolive.sdk.core.h) aVar).O();
        if (O == null) {
            return;
        }
        O.a(unImportantLiveInfoRequest);
    }

    private static void a(Context context, com.taobao.alilive.aliliveframework.frame.a aVar, UnImportantLiveInfoRequest unImportantLiveInfoRequest, VideoInfo videoInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65f52b8f", new Object[]{context, aVar, unImportantLiveInfoRequest, videoInfo});
            return;
        }
        unImportantLiveInfoRequest.trivialReq = new UnImportantLiveInfoRequest.TrivialReq();
        unImportantLiveInfoRequest.trivialReq.liveId = videoInfo.liveId;
        if (videoInfo.broadCaster == null) {
            return;
        }
        unImportantLiveInfoRequest.trivialReq.creatorId = videoInfo.broadCaster.encodeAccountId;
        if (!TextUtils.isEmpty(unImportantLiveInfoRequest.trivialReq.creatorId)) {
            return;
        }
        unImportantLiveInfoRequest.trivialReq.creatorId = videoInfo.broadCaster.accountId;
    }

    private static void a(Context context, com.taobao.alilive.aliliveframework.frame.a aVar, UnImportantLiveInfoRequest unImportantLiveInfoRequest, VideoInfo videoInfo, boolean z, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ecc14d43", new Object[]{context, aVar, unImportantLiveInfoRequest, videoInfo, new Boolean(z), str, str2, str3});
        } else if (aVar == null || aVar.g() == null) {
        } else {
            UnImportantLiveInfoRequest.ItemCardListReq itemCardListReq = new UnImportantLiveInfoRequest.ItemCardListReq();
            itemCardListReq.liveId = videoInfo.liveId;
            if (videoInfo.interacts != null && !videoInfo.interacts.isEmpty()) {
                itemCardListReq.interacts = pqj.a(videoInfo.interacts);
            }
            if (videoInfo.broadCaster != null) {
                itemCardListReq.creatorId = videoInfo.broadCaster.accountId;
            }
            if (z) {
                itemCardListReq.itemHoldType = videoInfo.itemHoldType;
                itemCardListReq.holdItemIds = videoInfo.holdItemIds;
                String str4 = aVar.g().get(aw.PARAM_SJSD_ITEM_ID);
                if (!TextUtils.isEmpty(str4) && TextUtils.isEmpty(itemCardListReq.itemHoldType) && TextUtils.isEmpty(itemCardListReq.holdItemIds)) {
                    itemCardListReq.holdItemIds = str4;
                    itemCardListReq.itemHoldType = com.taobao.taolive.sdk.mergeInfo.b.VALUE_ITEM_HOLD_TYPE_CARD;
                }
            } else {
                itemCardListReq.itemHoldType = str;
                itemCardListReq.holdItemIds = str2;
                if (!TextUtils.isEmpty(str3) && TextUtils.isEmpty(itemCardListReq.itemHoldType) && TextUtils.isEmpty(itemCardListReq.holdItemIds)) {
                    itemCardListReq.holdItemIds = str3;
                    itemCardListReq.itemHoldType = com.taobao.taolive.sdk.mergeInfo.b.VALUE_ITEM_HOLD_TYPE_CARD;
                }
            }
            itemCardListReq.livesource = poy.ac(aVar);
            itemCardListReq.entryLiveSource = poy.R(aVar);
            itemCardListReq.needRecommendItem = v.b.a("goodlist", "enableRecSort", true);
            itemCardListReq.itemTransferInfo = videoInfo.itemTransferInfo == null ? "" : videoInfo.itemTransferInfo.toJSONString();
            if (hkk.ab()) {
                if (!DateUtils.isToday(ad.b("new_user_zone_card_show_time"))) {
                    ad.a("new_user_zone_card_show_count", 0);
                }
                itemCardListReq.todayExposureCount = String.valueOf(ad.b("new_user_zone_card_show_count", 0));
            }
            unImportantLiveInfoRequest.itemCardListReq = itemCardListReq;
        }
    }

    private static void a(Context context, com.taobao.alilive.aliliveframework.frame.a aVar, UnImportantLiveInfoRequest unImportantLiveInfoRequest, VideoInfo videoInfo, TBLiveDataModel tBLiveDataModel) {
        String str;
        String[] split;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7845cfc8", new Object[]{context, aVar, unImportantLiveInfoRequest, videoInfo, tBLiveDataModel});
        } else if (aVar != null) {
            UnImportantLiveInfoRequest.PopReq popReq = new UnImportantLiveInfoRequest.PopReq();
            popReq.liveId = videoInfo.liveId;
            if (videoInfo.broadCaster != null) {
                popReq.accountId = videoInfo.broadCaster.accountId;
            }
            String str2 = null;
            if (context instanceof Activity) {
                Activity activity = (Activity) context;
                if (activity.getIntent() != null) {
                    str2 = activity.getIntent().getDataString();
                }
            }
            if (tBLiveDataModel.mInitParams != null && !TextUtils.isEmpty(tBLiveDataModel.mInitParams.get(aw.PARAM_INTENT_URL))) {
                str2 = tBLiveDataModel.mInitParams.get(aw.PARAM_INTENT_URL);
            }
            JSONObject jSONObject = new JSONObject();
            Uri parse = Uri.parse(str2);
            String str3 = "";
            if (parse != null) {
                str3 = parse.getQueryParameter("itemIds");
                if (TextUtils.isEmpty(str3)) {
                    str3 = parse.getQueryParameter(aw.PARAM_SHAQRE_ITEM_ID);
                }
                str = parse.getQueryParameter("shareType");
                String queryParameter = parse.getQueryParameter("huanduanParams");
                if (!TextUtils.isEmpty(queryParameter) && (split = queryParameter.split(",")) != null) {
                    for (String str4 : split) {
                        if (!TextUtils.isEmpty(str4)) {
                            jSONObject.put(str4, (Object) parse.getQueryParameter(str4));
                        }
                    }
                }
            } else {
                str = str3;
            }
            jSONObject.put("versionCode", (Object) "20240626");
            String a2 = a(tBLiveDataModel);
            if (TextUtils.isEmpty(a2)) {
                a2 = str3;
            }
            popReq.itemIds = a2;
            popReq.entrySpm = poy.T(aVar);
            popReq.liveSource = poy.ac(aVar);
            popReq.entryLiveSource = poy.R(aVar);
            popReq.shareType = str;
            popReq.spm = poy.K(aVar);
            popReq.query = jSONObject.toJSONString();
            popReq.switchIndex = String.valueOf(poy.ai(aVar));
            popReq.recExtParams = b(tBLiveDataModel);
            popReq.s = "1";
            popReq.n = "10";
            popReq.expInfoList = "{}";
            unImportantLiveInfoRequest.popReq = popReq;
        }
    }

    private static String a(TBLiveDataModel tBLiveDataModel) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("fa41b5df", new Object[]{tBLiveDataModel}) : (tBLiveDataModel == null || tBLiveDataModel.mVideoInfo == null) ? "" : tBLiveDataModel.mVideoInfo.dispatchItemID;
    }

    private static void c(Context context, com.taobao.alilive.aliliveframework.frame.a aVar, UnImportantLiveInfoRequest unImportantLiveInfoRequest, VideoInfo videoInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aaf3b611", new Object[]{context, aVar, unImportantLiveInfoRequest, videoInfo});
        } else if (aVar == null) {
        } else {
            UnImportantLiveInfoRequest.MessReq messReq = new UnImportantLiveInfoRequest.MessReq();
            if (videoInfo.broadCaster != null) {
                messReq.creatorId = videoInfo.broadCaster.accountId;
            }
            messReq.liveId = videoInfo.liveId;
            messReq.type = "sponsor,timerInteractive4NeoProtocol,broadcasterScore,activity,liveHeadBanner,visitorIdentity,hasLive";
            messReq.serviceVersion = "6.0";
            if (poy.u(aVar) != null && poy.u(aVar).extraBizType == 1) {
                messReq.type += ",auction";
            }
            unImportantLiveInfoRequest.messReq = messReq;
        }
    }

    private static void d(Context context, com.taobao.alilive.aliliveframework.frame.a aVar, UnImportantLiveInfoRequest unImportantLiveInfoRequest, VideoInfo videoInfo) {
        com.taobao.taolive.sdk.controller.e y;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd72fb52", new Object[]{context, aVar, unImportantLiveInfoRequest, videoInfo});
        } else if (aVar == null) {
        } else {
            UnImportantLiveInfoRequest.ShareReq shareReq = new UnImportantLiveInfoRequest.ShareReq();
            shareReq.liveId = videoInfo.liveId;
            shareReq.anchorId = videoInfo.broadCaster.accountId;
            if (!phg.d().a() && (aVar instanceof com.taobao.taolive.sdk.core.e) && (y = ((com.taobao.taolive.sdk.core.e) aVar).y()) != null) {
                shareReq.liveSource = y.aJ_().a().N();
            }
            unImportantLiveInfoRequest.shareReq = shareReq;
        }
    }

    private static void e(Context context, com.taobao.alilive.aliliveframework.frame.a aVar, UnImportantLiveInfoRequest unImportantLiveInfoRequest, VideoInfo videoInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eff24093", new Object[]{context, aVar, unImportantLiveInfoRequest, videoInfo});
        } else if (aVar == null) {
        } else {
            UnImportantLiveInfoRequest.AtmosphereResourceReq atmosphereResourceReq = new UnImportantLiveInfoRequest.AtmosphereResourceReq();
            atmosphereResourceReq.liveId = videoInfo.liveId;
            if (videoInfo.broadCaster != null) {
                atmosphereResourceReq.anchorId = videoInfo.broadCaster.accountId;
                atmosphereResourceReq.encryptAnchorId = videoInfo.broadCaster.encodeAccountId;
            }
            unImportantLiveInfoRequest.atmosphereResourceReq = atmosphereResourceReq;
        }
    }

    private static void f(Context context, com.taobao.alilive.aliliveframework.frame.a aVar, UnImportantLiveInfoRequest unImportantLiveInfoRequest, VideoInfo videoInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("127185d4", new Object[]{context, aVar, unImportantLiveInfoRequest, videoInfo});
        } else if (aVar == null) {
        } else {
            UnImportantLiveInfoRequest.TabInfoReq tabInfoReq = new UnImportantLiveInfoRequest.TabInfoReq();
            tabInfoReq.anchorId = videoInfo.broadCaster.accountId;
            tabInfoReq.liveId = videoInfo.liveId;
            tabInfoReq.useWelfareCenterEntry = "true";
            unImportantLiveInfoRequest.tabInfoReq = tabInfoReq;
        }
    }

    private static void g(Context context, com.taobao.alilive.aliliveframework.frame.a aVar, UnImportantLiveInfoRequest unImportantLiveInfoRequest, VideoInfo videoInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34f0cb15", new Object[]{context, aVar, unImportantLiveInfoRequest, videoInfo});
        } else if (aVar == null) {
        } else {
            UnImportantLiveInfoRequest.SlideReq slideReq = new UnImportantLiveInfoRequest.SlideReq();
            if (videoInfo.broadCaster != null) {
                slideReq.anchorId = videoInfo.broadCaster.accountId;
                slideReq.liveId = videoInfo.liveId;
                slideReq.entryLiveId = poy.a(aVar);
                slideReq.liveSource = poy.ad(aVar);
                slideReq.entryLiveSource = poy.R(aVar);
                slideReq.entrySpm = poy.T(aVar);
                slideReq.needRec = false;
                slideReq.tppParam = null;
                JSONObject jSONObject = new JSONObject();
                String a2 = tkh.a("hasShowEndResources");
                if (!com.taobao.taolive.sdk.utils.l.e(a2)) {
                    JSONObject parseObject = JSONObject.parseObject(a2);
                    Long l = parseObject.getLong("saveTime");
                    String string = parseObject.getString("operatorId");
                    if (l.longValue() < a().longValue()) {
                        tkh.a("hasShowEndResources", null);
                    } else {
                        jSONObject.put("expoResourseIds", (Object) string);
                    }
                    slideReq.extendParams = jSONObject.toJSONString();
                }
            }
            unImportantLiveInfoRequest.slideReq = slideReq;
        }
    }

    private static void h(Context context, com.taobao.alilive.aliliveframework.frame.a aVar, UnImportantLiveInfoRequest unImportantLiveInfoRequest, VideoInfo videoInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57701056", new Object[]{context, aVar, unImportantLiveInfoRequest, videoInfo});
        } else if (aVar == null) {
        } else {
            UnImportantLiveInfoRequest.GrowthReq growthReq = new UnImportantLiveInfoRequest.GrowthReq();
            growthReq.liveId = videoInfo.liveId;
            growthReq.liveSource = poy.ac(aVar);
            unImportantLiveInfoRequest.growthReq = growthReq;
        }
    }

    private static void i(Context context, com.taobao.alilive.aliliveframework.frame.a aVar, UnImportantLiveInfoRequest unImportantLiveInfoRequest, VideoInfo videoInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79ef5597", new Object[]{context, aVar, unImportantLiveInfoRequest, videoInfo});
        } else if (aVar == null) {
        } else {
            UnImportantLiveInfoRequest.IntimacyReq intimacyReq = new UnImportantLiveInfoRequest.IntimacyReq();
            intimacyReq.setBizCode("live");
            intimacyReq.setInvokeType("native");
            intimacyReq.setRoomType(videoInfo.roomType);
            intimacyReq.setSource(poy.ac(aVar));
            if (videoInfo.broadCaster != null) {
                intimacyReq.setTargetUid(videoInfo.broadCaster.accountId);
                intimacyReq.setFollow(videoInfo.broadCaster.follow);
            }
            intimacyReq.setShowCodes("");
            intimacyReq.setLiveId(videoInfo.liveId);
            intimacyReq.setSpm(poy.K(aVar));
            intimacyReq.member = videoInfo.shopVip;
            intimacyReq.hasMember = videoInfo.shopHasVip;
            unImportantLiveInfoRequest.intimacyReq = intimacyReq;
        }
    }

    private static Long a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Long) ipChange.ipc$dispatch("c9b62fad", new Object[0]);
        }
        try {
            Date date = new Date();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
            String format = simpleDateFormat.format(Long.valueOf(date.getTime()));
            PrintStream printStream = System.out;
            printStream.println("当天日期" + format);
            return Long.valueOf(simpleDateFormat.parse(format).getTime());
        } catch (ParseException e) {
            e.printStackTrace();
            return 0L;
        }
    }

    private static String b(TBLiveDataModel tBLiveDataModel) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("96afb23e", new Object[]{tBLiveDataModel}) : (tBLiveDataModel == null || tBLiveDataModel.mVideoInfo == null) ? "" : tBLiveDataModel.mVideoInfo.recExtParams;
    }
}
