package tb;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.card.cards.web.IWebViewListener;
import com.taobao.android.fluid.framework.card.cards.web.c;
import com.taobao.android.fluid.framework.data.datamodel.MediaContentDetailData;
import com.taobao.android.fluid.framework.data.datamodel.MediaMixContentDetail;
import com.taobao.android.fluid.framework.data.remote.MediaMixContentDetailResponse;
import com.taobao.mtop.wvplugin.a;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes5.dex */
public class sku {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_VIDEO_SOURCE = "videoSource";
    public static final String KEY_VIDEO_TYPE = "videoType";
    public static final String VALUE_NORMAL_VIDEO = "normal";
    public static final String VALUE_TB_VIDEO_URL = "TBVideoUrl";
    public static final String VALUE_URL_VIDEO = "url";

    static {
        kge.a(-450970992);
    }

    public static String a(boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f223e6b4", new Object[]{new Boolean(z)}) : z ? "sectionList" : "list";
    }

    public static MediaMixContentDetailResponse a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MediaMixContentDetailResponse) ipChange.ipc$dispatch("a7fc6997", new Object[]{jSONObject});
        }
        MediaMixContentDetailResponse mediaMixContentDetailResponse = new MediaMixContentDetailResponse();
        try {
            mediaMixContentDetailResponse.setApi(jSONObject.getString("api"));
            JSONArray jSONArray = jSONObject.getJSONArray(a.RESULT_KEY);
            String[] strArr = new String[jSONArray.size()];
            for (int i = 0; i < strArr.length; i++) {
                strArr[i] = jSONArray.getString(i);
            }
            mediaMixContentDetailResponse.setRet(strArr);
            mediaMixContentDetailResponse.setV(jSONObject.getString("v"));
            mediaMixContentDetailResponse.data = h(jSONObject);
        } catch (Throwable th) {
            spz.c("RecommendDataConvertHelper", "convertNewRecommendToDetailResponse convert new recommend to detail response failed:" + th.getMessage());
        }
        return mediaMixContentDetailResponse;
    }

    public static MediaMixContentDetailResponse a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MediaMixContentDetailResponse) ipChange.ipc$dispatch("717f4d2d", new Object[]{str});
        }
        try {
            return a(JSONObject.parseObject(str));
        } catch (Exception e) {
            spz.c("RecommendDataConvertHelper", "convertNewRecommendToDetailResponse error:" + e.getMessage());
            return null;
        }
    }

    private static MediaMixContentDetail h(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MediaMixContentDetail) ipChange.ipc$dispatch("c9c0bcc", new Object[]{jSONObject});
        }
        MediaMixContentDetail mediaMixContentDetail = new MediaMixContentDetail();
        if (jSONObject != null) {
            try {
                JSONObject jSONObject2 = jSONObject.getJSONObject("data");
                mediaMixContentDetail.config = jSONObject2.getJSONObject("config");
                mediaMixContentDetail.transmission = jSONObject2.getJSONObject("passParams");
                mediaMixContentDetail.noMoreData = jSONObject2.getString("noMoreData");
                mediaMixContentDetail.noMoreMsg = jSONObject2.getString("noMoreMsg");
                ArrayList arrayList = new ArrayList();
                JSONArray jSONArray = jSONObject2.getJSONArray(a(true));
                for (int i = 0; i < jSONArray.size(); i++) {
                    arrayList.add(g(jSONArray.getJSONObject(i)));
                }
                mediaMixContentDetail.list = arrayList;
            } catch (Throwable th) {
                spz.c("RecommendDataConvertHelper", "convertNewRecommendToDetail convert new recommend to detail failed:" + th.getMessage() + " data:" + jSONObject.toJSONString());
                th.printStackTrace();
            }
        }
        return mediaMixContentDetail;
    }

    private static MediaContentDetailData.Account i(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MediaContentDetailData.Account) ipChange.ipc$dispatch("af9772a0", new Object[]{jSONObject});
        }
        MediaContentDetailData.Account account = new MediaContentDetailData.Account();
        if (jSONObject != null) {
            account.idStr = jSONObject.getString("accountIdStr");
        }
        return account;
    }

    private static MediaContentDetailData.Content a(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return (MediaContentDetailData.Content) ipChange.ipc$dispatch("2a11da96", new Object[]{str, jSONObject, jSONObject2, jSONObject3});
        }
        MediaContentDetailData.Content content = new MediaContentDetailData.Content();
        content.id = str;
        if (jSONObject2 != null) {
            content.status = jSONObject2.getString("status");
            content.interactiveId = jSONObject2.getString("interactiveId");
            if (sjv.a()) {
                JSONObject jSONObject4 = jSONObject2.getJSONObject("blackScreenConfig");
                if (jSONObject4 != null) {
                    z = false;
                }
                content.isValid = z;
                if (jSONObject4 != null) {
                    content.errorText = jSONObject4.getString("text");
                    content.errorUrl = jSONObject4.getString("iconUrl");
                    content.errorType = jSONObject4.getString("blackScreenType");
                    content.errorUtpairs = jSONObject4.getString("blackScreenUtpairs");
                }
            }
        }
        if (jSONObject3 != null) {
            try {
                JSONObject jSONObject5 = jSONObject3.getJSONObject("itemData").getJSONObject("Description").getJSONObject("data");
                content.summary = jSONObject5.getString("summary");
                content.title = jSONObject5.getString("title");
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        if (jSONObject != null) {
            JSONObject jSONObject6 = jSONObject.getJSONObject("view");
            JSONObject jSONObject7 = jSONObject6.getJSONObject("mainMedia");
            if (jSONObject7 != null) {
                ArrayList arrayList = new ArrayList();
                if ("VIDEO".equals(jSONObject7.getString("type"))) {
                    JSONObject jSONObject8 = jSONObject7.getJSONObject("data").getJSONArray("data").getJSONObject(0);
                    JSONObject jSONObject9 = new JSONObject();
                    jSONObject9.put("type", (Object) jSONObject7.getString("type"));
                    jSONObject9.put("resourceStr", (Object) jSONObject8.getString("videoResourceStr"));
                    jSONObject9.put("firstFrameUrl", (Object) jSONObject8.getString("videoThumbnailURL"));
                    jSONObject9.put("videoId", (Object) jSONObject8.getString("videoId"));
                    jSONObject9.put("url", (Object) jSONObject8.getString("url"));
                    String string = jSONObject8.getString(KEY_VIDEO_SOURCE);
                    jSONObject9.put(KEY_VIDEO_SOURCE, (Object) string);
                    JSONObject jSONObject10 = jSONObject7.getJSONObject("data");
                    JSONObject jSONObject11 = jSONObject10.getJSONObject("extra");
                    jSONObject9.put("duration", (Object) jSONObject11.getString("duration"));
                    jSONObject9.put("height", (Object) jSONObject11.getString("height"));
                    jSONObject9.put("width", (Object) jSONObject11.getString("width"));
                    String a2 = oec.a((Object) jSONObject10.getString(KEY_VIDEO_TYPE), "normal");
                    jSONObject9.put(KEY_VIDEO_TYPE, (Object) a2);
                    arrayList.add(jSONObject9);
                    spz.c("RecommendDataConvertHelper", "解析videoElement字段2 videoType:" + a2 + ",videoSource:" + string);
                }
                content.elements = arrayList;
            }
            JSONObject jSONObject12 = jSONObject6.getJSONObject("music");
            if (jSONObject12 != null && "music".equals(jSONObject12.getString("type"))) {
                content.musicInfoVO = (MediaContentDetailData.MusicInfoVO) JSONObject.toJavaObject(jSONObject12.getJSONObject("data"), MediaContentDetailData.MusicInfoVO.class);
            }
            JSONObject jSONObject13 = jSONObject6.getJSONObject("live");
            if (jSONObject13 != null) {
                ArrayList arrayList2 = new ArrayList();
                if ("live".equals(jSONObject13.getString("type"))) {
                    JSONObject jSONObject14 = jSONObject13.getJSONObject("data");
                    jSONObject14.put("type", (Object) jSONObject13.getString("type"));
                    arrayList2.add(jSONObject14);
                    content.coverUrl = jSONObject14.getString("coverUrl");
                }
                content.elements = arrayList2;
            }
            if (c.a()) {
                JSONObject jSONObject15 = jSONObject6.getJSONObject(IWebViewListener.BIZ_SCENE);
                if (!ogv.a(jSONObject15) && StringUtils.equals("ggGame", jSONObject15.getString("type"))) {
                    JSONObject jSONObject16 = jSONObject15.getJSONObject("data");
                    if (!ogv.a(jSONObject16)) {
                        content.material = (MediaContentDetailData.Material) JSONObject.toJavaObject(jSONObject16.getJSONObject("material"), MediaContentDetailData.Material.class);
                        spz.c("RecommendDataConvertHelper", "[webcomponent]游戏卡片服务端返回数据：" + jSONObject16.toJSONString());
                    }
                }
            }
            if (skk.o()) {
                JSONObject jSONObject17 = jSONObject6.getJSONObject("hotTopic");
                if (!ogv.a(jSONObject17)) {
                    content.isSecondPageUpBar = StringUtils.equals("second", jSONObject17.getString("showBar"));
                }
            }
        }
        return content;
    }

    public static String b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("3f1ccf59", new Object[]{jSONObject}) : b(jSONObject, "videoResourceStr");
    }

    public static String d(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("91c579db", new Object[]{jSONObject}) : b(jSONObject, "videoThumbnailURL");
    }

    public static MediaContentDetailData g(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MediaContentDetailData) ipChange.ipc$dispatch("3fb10867", new Object[]{jSONObject});
        }
        MediaContentDetailData mediaContentDetailData = new MediaContentDetailData();
        if (jSONObject == null) {
            return mediaContentDetailData;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("detailInfo");
        JSONObject jSONObject3 = jSONObject.getJSONObject("extraData");
        JSONObject jSONObject4 = jSONObject.getJSONObject("args");
        int intValue = jSONObject.getIntValue("index");
        String string = jSONObject.getString("nid");
        String string2 = jSONObject.getString("subType");
        mediaContentDetailData.index = intValue;
        mediaContentDetailData.utPairs = (Map) JSONObject.toJavaObject(jSONObject4, Map.class);
        if (jSONObject3 != null) {
            mediaContentDetailData.adParam = jSONObject3.getJSONObject("adParam");
            mediaContentDetailData.relativeIndex = jSONObject3.getIntValue("relativeIndex");
            mediaContentDetailData.playletInfo = (MediaContentDetailData.PlayletInfo) JSONObject.toJavaObject(jSONObject3.getJSONObject("playletInfo"), MediaContentDetailData.PlayletInfo.class);
            mediaContentDetailData.bginteractive = (MediaContentDetailData.BGInteractive) JSONObject.toJavaObject(jSONObject3.getJSONObject("bginteractive"), MediaContentDetailData.BGInteractive.class);
            mediaContentDetailData.businessExtraMap = jSONObject3.getJSONObject(obo.BUSINESS_EXTRA_MAP);
            mediaContentDetailData.topTitle = (MediaContentDetailData.TopTitle) JSONObject.toJavaObject(jSONObject3.getJSONObject("topAtmosphereBar"), MediaContentDetailData.TopTitle.class);
            mediaContentDetailData.contentAdParams = jSONObject3.getJSONObject("contentAdParams");
            mediaContentDetailData.contentPassParams = jSONObject3.getJSONObject(com.taobao.android.fluid.framework.data.remote.c.KEY_CONTENT_PASSPARAMS);
            JSONObject jSONObject5 = jSONObject3.getJSONObject("collectionData");
            if (jSONObject5 != null) {
                mediaContentDetailData.sequenceNumber = oec.a(jSONObject5.get("index"), -1);
            }
            mediaContentDetailData.slideUpIncludeMultiCard = oec.a((Object) jSONObject3.getString("slideUpIncludeMultiCard"), false);
            mediaContentDetailData.slideUpTransparency = oec.a((Object) jSONObject3.getString("slideUpTransparency"), 10);
        }
        JSONObject jSONObject6 = null;
        try {
            jSONObject6 = jSONObject.getJSONObject("newCard").getJSONObject("data").getJSONObject("mainPic").getJSONObject("page").getJSONObject("global");
            mediaContentDetailData.config = (MediaContentDetailData.Config) JSONObject.toJavaObject(jSONObject6.getJSONObject("globalData").getJSONObject("data").getJSONObject("config"), MediaContentDetailData.Config.class);
        } catch (Throwable th) {
            spz.c("RecommendDataConvertHelper", "convertNewRecommendToDetail convert content config failed:" + th.getMessage());
            th.printStackTrace();
        }
        mediaContentDetailData.account = i(jSONObject3);
        mediaContentDetailData.content = a(string, jSONObject2, jSONObject3, jSONObject6);
        mediaContentDetailData.type = string2;
        mediaContentDetailData.id = string;
        return mediaContentDetailData;
    }

    public static String a(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f6e6d446", new Object[]{fluidContext}) : a(skk.a(fluidContext));
    }

    public static String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[0]) : a(true);
    }

    private static String b(JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3a29568f", new Object[]{jSONObject, str});
        }
        if (StringUtils.isEmpty(str) || ogv.a(jSONObject)) {
            return null;
        }
        try {
            JSONArray a2 = slm.a(jSONObject, "data", a(true));
            JSONObject jSONObject2 = ((a2 == null || a2.isEmpty()) ? null : a2.getJSONObject(0)).getJSONObject("detailInfo").getJSONObject("view").getJSONObject("mainMedia");
            if (jSONObject2 != null && "VIDEO".equals(jSONObject2.getString("type"))) {
                return jSONObject2.getJSONObject("data").getJSONArray("data").getJSONObject(0).getString(str);
            }
        } catch (Throwable th) {
            spz.c("RecommendDataConvertHelper", str + "FromDetailNew failed:" + th.getMessage());
        }
        return null;
    }
}
