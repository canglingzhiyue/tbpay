package tb;

import android.taobao.util.j;
import mtopsdk.common.util.StringUtils;
import com.alipay.android.msp.framework.db.MspDBHelper;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.common.dynamic.bean.SearchDomBean;
import com.taobao.search.common.uikit.a;
import com.taobao.search.common.util.l;
import com.taobao.search.common.util.q;
import com.taobao.search.mmd.datasource.bean.AuctionBaseBean;
import com.taobao.search.mmd.datasource.bean.SelfOperationBean;
import com.taobao.search.mmd.datasource.bean.f;
import com.taobao.search.mmd.uikit.shopinfo.c;
import com.taobao.search.mmd.util.d;
import com.taobao.tao.infoflow.multitab.e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class nog {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CLICK_TRACE = "clickTrace";
    public static final String EXTRA_PARAMS = "extraParams";
    public static final String P4P_CONTENT_URL = "p4pContentUrl";
    public static final String PRD_CREDIT = "ratesum";
    public static final String PRD_H5URL = "h5Url";
    public static final String PRD_ICON_LIST = "iconList";
    public static final String PRD_IS_DYNAMIC_LAND_P4P = "isDynamicLandP4p";
    public static final String PRD_IS_P4P = "isP4p";
    public static final String PRD_ITEM_ID = "item_id";
    public static final String PRD_LOCATION = "location";
    public static final String PRD_NEW_DSR = "newDsr";
    public static final String PRD_NICK = "nick";
    public static final String PRD_O2O_SHOP_ID = "o2oShopId";
    public static final String PRD_P4P_URL = "clickUrl";
    public static final String PRD_PICURL = "pic_path";
    public static final String PRD_POSTFEE = "fastPostFee";
    public static final String PRD_REALSALES = "realSales";
    public static final String PRD_SAME_COUNT = "sameCount";
    public static final String PRD_SELLED = "sold";
    public static final String PRD_SIMILAR_COUNT = "similarCount";
    public static final String PRD_SIMILAR_URL = "similarURL";
    public static final String PRD_SPU_ID = "spuId";
    public static final String PRD_SUMMARY_TIP = "summaryTips";
    public static final String PRD_TITLE = "title";
    public static final String PRD_UNIQPID = "uniqpid";
    public static final String PRD_USERID = "userId";
    public static final String PRD_USER_TYPE = "userType";
    public static final String PRD_WF_PICURL = "uprightImg";
    public static final String PRD_WF_TITLE = "wfTitle";
    public static final String PRE_TITLE_COLOR = "pre_title_color";
    public static final String PRE_TITLE_TEXT = "pre_title";
    public static final String PRICE = "price";
    public static final String PRICE_BLOCK = "priceShow";
    public static final String PRICE_PREFIX = "preText";
    public static final String PRICE_SUFFIX = "suffixText";
    public static final String PRICE_UNIT = "unit";
    public static final String USER_TYPE_MALL = "1";
    public static final String VIDEO_URL = "videoUrl";

    static {
        kge.a(1544750077);
    }

    public static AuctionBaseBean a(JSONObject jSONObject, AuctionBaseBean auctionBaseBean, Map<String, SearchDomBean> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AuctionBaseBean) ipChange.ipc$dispatch("e9c8666b", new Object[]{jSONObject, auctionBaseBean, map});
        }
        auctionBaseBean.title = j.a(jSONObject.optString("title"));
        auctionBaseBean.wfTitle = jSONObject.optString(PRD_WF_TITLE);
        auctionBaseBean.isLongTitle = jSONObject.optBoolean("showLongTitle");
        auctionBaseBean.preTitleText = jSONObject.optString(PRE_TITLE_TEXT);
        auctionBaseBean.preTitleColor = jSONObject.optString(PRE_TITLE_COLOR);
        n(auctionBaseBean, jSONObject);
        o(auctionBaseBean, jSONObject);
        auctionBaseBean.postFee = j.a(jSONObject.optString(PRD_POSTFEE));
        auctionBaseBean.picUrl = a.a(j.a(jSONObject.optString(PRD_PICURL)));
        auctionBaseBean.mainPicJumpUrl = jSONObject.optString("mainPicJumpUrl");
        auctionBaseBean.wfPicUrl = j.a(jSONObject.optString(PRD_WF_PICURL));
        auctionBaseBean.uprightImgAspectRatio = jSONObject.optString("uprightImgAspectRatio");
        if (StringUtils.isEmpty(auctionBaseBean.uprightImgAspectRatio)) {
            auctionBaseBean.uprightImgAspectRatio = "0.66";
        }
        String trim = jSONObject.optString("location").trim();
        try {
            int indexOf = trim.indexOf(" ");
            if (indexOf != -1) {
                trim = trim.substring(indexOf + 1);
            }
        } catch (Exception unused) {
        }
        auctionBaseBean.area = j.a(trim);
        auctionBaseBean.selled = j.a(jSONObject.optString(PRD_SELLED));
        if (!jSONObject.optString(PRD_USER_TYPE).equals("1")) {
            auctionBaseBean.credit = j.a(jSONObject.optString(PRD_CREDIT));
            auctionBaseBean.rateSum = d.a(auctionBaseBean.credit, auctionBaseBean.rateSum, "AuctionParser", "fail to parse rateSum");
        }
        auctionBaseBean.realSales = jSONObject.optString(PRD_REALSALES);
        auctionBaseBean.similarCount = jSONObject.optInt(PRD_SIMILAR_COUNT, 0);
        auctionBaseBean.similarUrl = jSONObject.optString(PRD_SIMILAR_URL);
        auctionBaseBean.disable = jSONObject.optBoolean("disable");
        auctionBaseBean.sameCount = jSONObject.optInt(PRD_SAME_COUNT, 0);
        auctionBaseBean.h5Url = j.a(jSONObject.optString("h5Url"));
        auctionBaseBean.spuId = j.a(jSONObject.optString(PRD_SPU_ID));
        auctionBaseBean.uniqPid = j.a(jSONObject.optString(PRD_UNIQPID));
        String a2 = j.a(jSONObject.optString(PRD_ICON_LIST));
        if (!StringUtils.isEmpty(a2)) {
            Collections.addAll(auctionBaseBean.iconSet, a2.split(","));
        }
        if (map != null) {
            noh.a(jSONObject, auctionBaseBean.titleIconList, auctionBaseBean.listIconArray, auctionBaseBean.waterfallIconArray, auctionBaseBean.videoIconList, map);
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("summaryTips");
        if (optJSONArray != null && optJSONArray.length() > 0) {
            int length = optJSONArray.length();
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < length; i++) {
                if (!optJSONArray.isNull(i)) {
                    String optString = optJSONArray.optString(i);
                    if (!StringUtils.isEmpty(optString)) {
                        arrayList.add(optString);
                    }
                }
            }
            auctionBaseBean.summaryTipList = arrayList;
        }
        auctionBaseBean.summaryTipsColor = jSONObject.optString("summaryTipsColor");
        auctionBaseBean.o2oShopId = j.a(jSONObject.optString(PRD_O2O_SHOP_ID));
        auctionBaseBean.itemId = jSONObject.optString("item_id");
        if (StringUtils.isEmpty(auctionBaseBean.itemId)) {
            auctionBaseBean.itemId = jSONObject.optString("nid");
        }
        auctionBaseBean.nick = jSONObject.optString("nick");
        auctionBaseBean.userId = jSONObject.optString("userId");
        auctionBaseBean.newDsr = jSONObject.optString(PRD_NEW_DSR);
        auctionBaseBean.isP4p = jSONObject.optBoolean(PRD_IS_P4P);
        auctionBaseBean.isDynamicLandP4p = jSONObject.optBoolean(PRD_IS_DYNAMIC_LAND_P4P);
        auctionBaseBean.p4pUrl = jSONObject.optString(PRD_P4P_URL);
        auctionBaseBean.p4pContentUrl = jSONObject.optString(P4P_CONTENT_URL);
        auctionBaseBean.ifsUrl = jSONObject.optString("ifsUrl");
        auctionBaseBean.p4pPid = jSONObject.optString(MspDBHelper.BizEntry.COLUMN_NAME_PID);
        auctionBaseBean.etype = jSONObject.optString("etype");
        auctionBaseBean.daySold = jSONObject.optString("daySold");
        auctionBaseBean.shopAddress = j.a(jSONObject.optString("shopAddress"));
        auctionBaseBean.skuId = jSONObject.optString("skuId");
        auctionBaseBean.shopCoupon = jSONObject.optString("inShopCoupon");
        auctionBaseBean.clickTrace = jSONObject.optString(CLICK_TRACE);
        p(auctionBaseBean, jSONObject);
        q(auctionBaseBean, jSONObject);
        m(auctionBaseBean, jSONObject);
        a(auctionBaseBean, jSONObject);
        k(auctionBaseBean, jSONObject);
        i(auctionBaseBean, jSONObject);
        auctionBaseBean.touch = jSONObject.optBoolean("touch", true);
        auctionBaseBean.more = jSONObject.optBoolean("more", true);
        Map<String, String> map2 = auctionBaseBean.utLogMap;
        map2.put("x_object_type", "item");
        map2.put("x_object_type_search", "item");
        map2.put(kox.X_OBJECT_ID, auctionBaseBean.itemId);
        JSONObject optJSONObject = jSONObject.optJSONObject("utLogMap");
        if (optJSONObject != null) {
            Iterator<String> keys = optJSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                String optString2 = optJSONObject.optString(next);
                if (!StringUtils.isEmpty(next) && !StringUtils.isEmpty(optString2)) {
                    map2.put(next, optString2);
                }
            }
        }
        auctionBaseBean.newStoreDistance = jSONObject.optString("newStoreDistance");
        j(auctionBaseBean, jSONObject);
        JSONObject optJSONObject2 = jSONObject.optJSONObject("p4pIcon");
        if (optJSONObject2 != null) {
            auctionBaseBean.p4pIconUrl = optJSONObject2.optString("img");
            auctionBaseBean.p4pIconWidth = optJSONObject2.optInt("width");
            auctionBaseBean.p4pIconHeight = optJSONObject2.optInt("height");
            auctionBaseBean.p4pIconListTop = optJSONObject2.optInt("listTop");
            auctionBaseBean.p4pIconListLeft = optJSONObject2.optInt("listLeft");
            auctionBaseBean.p4pIconWfTop = optJSONObject2.optInt("wfTop");
            auctionBaseBean.p4pIconWfLeft = optJSONObject2.optInt("wfLeft");
        }
        auctionBaseBean.locType = jSONObject.optString(noa.KEY_LOC_TYPE);
        l(auctionBaseBean, jSONObject);
        h(auctionBaseBean, jSONObject);
        auctionBaseBean.wfTwoLineTitle = jSONObject.optBoolean("wfTwoLineTitle");
        auctionBaseBean.moreFuncIcon = jSONObject.optString("moreFuncIcon");
        auctionBaseBean.prefetchImgRatio = jSONObject.optString("prefetchImgRatio");
        c(auctionBaseBean, jSONObject);
        b(auctionBaseBean, jSONObject);
        return auctionBaseBean;
    }

    private static void b(AuctionBaseBean auctionBaseBean, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b71d9e96", new Object[]{auctionBaseBean, jSONObject});
            return;
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("structuredUSPInfo");
        if (optJSONArray == null || optJSONArray.length() == 0) {
            return;
        }
        auctionBaseBean.structuredUSPInfoList = new ArrayList(optJSONArray.length());
        int length = optJSONArray.length();
        for (int i = 0; i < length; i++) {
            try {
                auctionBaseBean.structuredUSPInfoList.add(f.a(optJSONArray.getJSONObject(i)));
            } catch (Exception unused) {
            }
        }
    }

    private static void c(AuctionBaseBean auctionBaseBean, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9796f497", new Object[]{auctionBaseBean, jSONObject});
            return;
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("leftSuperScriptInfo");
        if (optJSONArray == null || optJSONArray.length() == 0) {
            return;
        }
        auctionBaseBean.liveStageImg = null;
        auctionBaseBean.newStoreDistance = null;
        auctionBaseBean.showVideoIcon = false;
        auctionBaseBean.videoIcon = null;
        auctionBaseBean.wfVideoIcon = null;
        for (int i = 0; i < optJSONArray.length(); i++) {
            JSONObject optJSONObject = optJSONArray.optJSONObject(i);
            if (optJSONObject != null) {
                String optString = optJSONObject.optString("fieldTemplate");
                if (!StringUtils.isEmpty(optString)) {
                    char c = 65535;
                    switch (optString.hashCode()) {
                        case 75165:
                            if (optString.equals("LBS")) {
                                c = 2;
                                break;
                            }
                            break;
                        case 1332613012:
                            if (optString.equals("videoIcon")) {
                                c = 3;
                                break;
                            }
                            break;
                        case 1417350021:
                            if (optString.equals("liveIcon")) {
                                c = 0;
                                break;
                            }
                            break;
                        case 1525159562:
                            if (optString.equals("3DIcon")) {
                                c = 1;
                                break;
                            }
                            break;
                    }
                    if (c == 0) {
                        f(auctionBaseBean, optJSONObject);
                    } else if (c == 1) {
                        g(auctionBaseBean, optJSONObject);
                    } else if (c == 2) {
                        e(auctionBaseBean, optJSONObject);
                    } else if (c == 3) {
                        d(auctionBaseBean, optJSONObject);
                    }
                }
            }
        }
    }

    private static void d(AuctionBaseBean auctionBaseBean, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78104a98", new Object[]{auctionBaseBean, jSONObject});
            return;
        }
        String optString = jSONObject.optString("imageUrl");
        auctionBaseBean.showVideoIcon = true;
        auctionBaseBean.videoIcon = optString;
        auctionBaseBean.wfVideoIcon = optString;
    }

    private static void e(AuctionBaseBean auctionBaseBean, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889a099", new Object[]{auctionBaseBean, jSONObject});
        } else {
            auctionBaseBean.newStoreDistance = jSONObject.optString("text");
        }
    }

    private static void f(AuctionBaseBean auctionBaseBean, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3902f69a", new Object[]{auctionBaseBean, jSONObject});
            return;
        }
        auctionBaseBean.liveStageImg = jSONObject.optString("imageUrl");
        auctionBaseBean.liveViewNum = jSONObject.optString("liveViewNum");
        auctionBaseBean.liveWfLeft = jSONObject.optInt("wfLeft");
        auctionBaseBean.liveWfTop = jSONObject.optInt("wfTop");
        auctionBaseBean.liveListLeft = jSONObject.optInt("listLeft");
        auctionBaseBean.liveListTop = jSONObject.optInt("listTop");
    }

    private static void g(AuctionBaseBean auctionBaseBean, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("197c4c9b", new Object[]{auctionBaseBean, jSONObject});
            return;
        }
        String optString = jSONObject.optString("imageUrl");
        if (StringUtils.isEmpty(optString)) {
            return;
        }
        int optInt = jSONObject.optInt("width");
        int optInt2 = jSONObject.optInt("height");
        if (optInt <= 0 || optInt2 <= 0) {
            return;
        }
        auctionBaseBean.floatIconUrl = optString;
        auctionBaseBean.floatIconWidth = optInt;
        auctionBaseBean.floatIconHeight = optInt2;
        auctionBaseBean.floatIconWfLeft = jSONObject.optInt("wfLeft");
        auctionBaseBean.floatIconWfTop = jSONObject.optInt("wfTop");
        auctionBaseBean.floatIconListLeft = jSONObject.optInt("listLeft");
        auctionBaseBean.floatIconListTop = jSONObject.optInt("listTop");
    }

    public static void h(AuctionBaseBean auctionBaseBean, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9f5a29c", new Object[]{auctionBaseBean, jSONObject});
            return;
        }
        JSONObject optJSONObject = jSONObject.optJSONObject("jarvisData");
        if (optJSONObject == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        Iterator<String> keys = optJSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            String optString = optJSONObject.optString(next);
            if (!StringUtils.isEmpty(next) && !StringUtils.isEmpty(optString)) {
                hashMap.put(next, optString);
            }
        }
        hashMap.put(CLICK_TRACE, auctionBaseBean.clickTrace);
        auctionBaseBean.jarvisData = hashMap;
    }

    private static void i(AuctionBaseBean auctionBaseBean, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da6ef89d", new Object[]{auctionBaseBean, jSONObject});
            return;
        }
        JSONObject optJSONObject = jSONObject.optJSONObject("discountInfo");
        if (optJSONObject == null) {
            return;
        }
        auctionBaseBean.discountInfoText = optJSONObject.optString("text");
        auctionBaseBean.discountInfoIcon = optJSONObject.optString("icon");
        auctionBaseBean.discountInfoColor = optJSONObject.optString("textColor");
        auctionBaseBean.discountInfoBgColor = optJSONObject.optString(e.KEY_BG_COLOR);
        auctionBaseBean.discountInfoBorderColor = optJSONObject.optString("borderColor");
        if (!StringUtils.isEmpty(auctionBaseBean.discountInfoIcon)) {
            int optInt = optJSONObject.optInt("iconWidth");
            int optInt2 = optJSONObject.optInt("iconHeight");
            if (optInt > 0 && optInt2 > 0) {
                auctionBaseBean.discountInfoWidth = (int) ((optInt / optInt2) * l.a(10));
            }
        }
        String optString = optJSONObject.optString("prizeIds");
        if (StringUtils.isEmpty(optString)) {
            return;
        }
        Collections.addAll(auctionBaseBean.discountPrizeIdInfo, optString.split(","));
    }

    private static void j(AuctionBaseBean auctionBaseBean, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bae84e9e", new Object[]{auctionBaseBean, jSONObject});
            return;
        }
        JSONObject optJSONObject = jSONObject.optJSONObject("trace");
        if (optJSONObject == null) {
            return;
        }
        Iterator<String> keys = optJSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            String optString = optJSONObject.optString(next);
            if (!StringUtils.isEmpty(optString)) {
                auctionBaseBean.trace.put(next, optString);
            }
        }
    }

    public static void a(AuctionBaseBean auctionBaseBean, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6a44895", new Object[]{auctionBaseBean, jSONObject});
            return;
        }
        JSONObject optJSONObject = jSONObject.optJSONObject("video");
        if (optJSONObject == null) {
            return;
        }
        auctionBaseBean.showVideoIcon = optJSONObject.optBoolean("showIcon");
        String optString = optJSONObject.optString("videoUrl");
        String optString2 = optJSONObject.optString("videoDimension");
        String optString3 = optJSONObject.optString("videoId");
        String optString4 = optJSONObject.optString("iconUrl");
        String a2 = a.a(j.a(optJSONObject.optString("coverUrl")));
        int optInt = optJSONObject.optInt("playTimes");
        if (StringUtils.isEmpty(optString3) && StringUtils.isEmpty(optString)) {
            return;
        }
        auctionBaseBean.videoIcon = optString4;
        int indexOf = optString2.indexOf(58);
        if (indexOf == -1) {
            return;
        }
        try {
            int parseInt = Integer.parseInt(optString2.substring(0, indexOf));
            int parseInt2 = Integer.parseInt(optString2.substring(indexOf + 1, optString2.length()));
            auctionBaseBean.videoUrl = optString;
            auctionBaseBean.videoId = optString3;
            auctionBaseBean.videoWidth = parseInt;
            auctionBaseBean.videoHeight = parseInt2;
            auctionBaseBean.videoCover = a2;
            auctionBaseBean.playTimes = optInt;
            auctionBaseBean.delayTime = optJSONObject.optInt("delayTime", 100);
        } catch (Exception unused) {
            q.g("AuctionParser", "videoDimension=" + optString2);
        }
    }

    private static void k(AuctionBaseBean auctionBaseBean, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b61a49f", new Object[]{auctionBaseBean, jSONObject});
            return;
        }
        JSONObject optJSONObject = jSONObject.optJSONObject("wfVideo");
        if (optJSONObject == null) {
            return;
        }
        String optString = optJSONObject.optString("videoUrl");
        String optString2 = optJSONObject.optString("videoDimension");
        String optString3 = optJSONObject.optString("videoId");
        String optString4 = optJSONObject.optString("iconUrl");
        String a2 = a.a(j.a(optJSONObject.optString("coverUrl")));
        int optInt = optJSONObject.optInt("playTimes");
        if (StringUtils.isEmpty(optString3) && StringUtils.isEmpty(optString)) {
            return;
        }
        auctionBaseBean.videoIcon = optString4;
        int indexOf = optString2.indexOf(58);
        if (indexOf == -1) {
            return;
        }
        try {
            int parseInt = Integer.parseInt(optString2.substring(0, indexOf));
            int parseInt2 = Integer.parseInt(optString2.substring(indexOf + 1, optString2.length()));
            auctionBaseBean.wfVideoUrl = optString;
            auctionBaseBean.wfVideoId = optString3;
            auctionBaseBean.wfVideoWidth = parseInt;
            auctionBaseBean.wfVideoHeight = parseInt2;
            auctionBaseBean.wfVideoCover = a2;
            auctionBaseBean.wfPlayTimes = optInt;
            auctionBaseBean.wfDelayTime = optJSONObject.optInt("delayTime", 100);
        } catch (Exception unused) {
            q.g("AuctionParser", "videoDimension=" + optString2);
        }
    }

    private static void l(AuctionBaseBean auctionBaseBean, JSONObject jSONObject) {
        JSONObject optJSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7bdafaa0", new Object[]{auctionBaseBean, jSONObject});
        } else if (auctionBaseBean == null || jSONObject == null || (optJSONObject = jSONObject.optJSONObject("liveInfo")) == null) {
        } else {
            auctionBaseBean.liveAnchor = optJSONObject.optString("liveAnchor");
            auctionBaseBean.liveViewNum = optJSONObject.optString("liveViewNum");
            auctionBaseBean.liveShopLogo = optJSONObject.optString("shopLogo");
            auctionBaseBean.liveShopName = optJSONObject.optString("shopname");
            auctionBaseBean.liveLink = optJSONObject.optString("linkUrl");
            JSONObject optJSONObject2 = optJSONObject.optJSONObject("liveStageImgInfo");
            if (optJSONObject2 == null) {
                return;
            }
            auctionBaseBean.liveStageImg = optJSONObject2.optString("url");
        }
    }

    private static void m(AuctionBaseBean auctionBaseBean, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c5450a1", new Object[]{auctionBaseBean, jSONObject});
            return;
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("extraParams");
        if (optJSONArray == null) {
            return;
        }
        int length = optJSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject optJSONObject = optJSONArray.optJSONObject(i);
            if (optJSONObject != null) {
                String optString = optJSONObject.optString("key");
                String optString2 = optJSONObject.optString("value");
                if (!StringUtils.isEmpty(optString)) {
                    auctionBaseBean.extraParams.put(optString, optString2);
                }
            }
        }
    }

    private static void n(AuctionBaseBean auctionBaseBean, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ccda6a2", new Object[]{auctionBaseBean, jSONObject});
            return;
        }
        JSONObject optJSONObject = jSONObject.optJSONObject(PRICE_BLOCK);
        if (optJSONObject != null) {
            auctionBaseBean.pricePrefix = optJSONObject.optString(PRICE_PREFIX);
            auctionBaseBean.priceUnit = optJSONObject.optString(PRICE_UNIT);
            auctionBaseBean.price = optJSONObject.optString("price");
            auctionBaseBean.priceSuffix = optJSONObject.optString(PRICE_SUFFIX);
        }
        auctionBaseBean.localPrice = jSONObject.optString("localPrice");
        JSONObject optJSONObject2 = jSONObject.optJSONObject("priceShowWithIcon");
        if (optJSONObject2 == null) {
            return;
        }
        auctionBaseBean.priceIconUrl = optJSONObject2.optString("iconUrl");
        auctionBaseBean.priceIconWidth = optJSONObject2.optInt("iconWidth");
        auctionBaseBean.priceIconHeight = optJSONObject2.optInt("iconHeight");
        auctionBaseBean.priceColor = optJSONObject2.optString("priceColor");
        auctionBaseBean.priceIconSuffixText = optJSONObject2.optString(PRICE_SUFFIX);
        auctionBaseBean.priceIconSuffixColor = optJSONObject2.optString("suffixColor");
        auctionBaseBean.originPrice = optJSONObject2.optString("originPrice");
        auctionBaseBean.hidePriceUndline = optJSONObject2.optBoolean("hiddenPriceUnderline");
    }

    private static void o(AuctionBaseBean auctionBaseBean, JSONObject jSONObject) {
        JSONObject optJSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d46fca3", new Object[]{auctionBaseBean, jSONObject});
        } else if (auctionBaseBean != null && jSONObject != null && (optJSONObject = jSONObject.optJSONObject("selfOperationInfo")) != null) {
            SelfOperationBean selfOperationBean = new SelfOperationBean();
            selfOperationBean.commentColorLeft = optJSONObject.optString("commentColorLeft");
            selfOperationBean.commentColorRight = optJSONObject.optString("commentColorRight");
            selfOperationBean.recentComments = optJSONObject.optString("recentComments");
            JSONArray optJSONArray = optJSONObject.optJSONArray("recentCommentUsers");
            if (optJSONArray != null) {
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < optJSONArray.length(); i++) {
                    arrayList.add(optJSONArray.optString(i));
                }
                selfOperationBean.recentCommentUsers = arrayList;
            }
            auctionBaseBean.selfOperationInfo = selfOperationBean;
        }
    }

    private static void p(AuctionBaseBean auctionBaseBean, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fdc052a4", new Object[]{auctionBaseBean, jSONObject});
            return;
        }
        JSONObject optJSONObject = jSONObject.optJSONObject("shopInfo");
        if (optJSONObject == null) {
            return;
        }
        auctionBaseBean.shopIcon = optJSONObject.optString("icon");
        JSONArray optJSONArray = optJSONObject.optJSONArray("shopInfoList");
        if (optJSONArray != null) {
            auctionBaseBean.shopInfoList = new ArrayList();
            for (int i = 0; i < optJSONArray.length(); i++) {
                auctionBaseBean.shopInfoList.add(optJSONArray.optString(i));
            }
        }
        JSONArray optJSONArray2 = optJSONObject.optJSONArray("highlightShopInfoList");
        if (optJSONArray2 != null) {
            auctionBaseBean.highlightShopInfoList = new ArrayList();
            for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                auctionBaseBean.highlightShopInfoList.add(optJSONArray2.optString(i2));
            }
        }
        auctionBaseBean.shopInfoTail = optJSONObject.optString("tail");
        auctionBaseBean.shopUrl = optJSONObject.optString("url");
        auctionBaseBean.isShowShopInfoLine = optJSONObject.optBoolean("pbshowshopinfo");
        auctionBaseBean.shopInfoColor = optJSONObject.optString("shopInfoColor");
    }

    private static void q(AuctionBaseBean auctionBaseBean, JSONObject jSONObject) {
        JSONArray optJSONArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de39a8a5", new Object[]{auctionBaseBean, jSONObject});
            return;
        }
        JSONObject optJSONObject = jSONObject.optJSONObject("structuredShopInfo");
        if (optJSONObject == null || (optJSONArray = optJSONObject.optJSONArray("infoList")) == null || optJSONArray.length() <= 0) {
            return;
        }
        auctionBaseBean.isShowShopInfoLine = optJSONObject.optBoolean("pbshowshopinfo", auctionBaseBean.isShowShopInfoLine);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < optJSONArray.length(); i++) {
            JSONObject optJSONObject2 = optJSONArray.optJSONObject(i);
            if (optJSONObject2 != null) {
                Iterator<String> keys = optJSONObject2.keys();
                HashMap hashMap = new HashMap();
                while (keys.hasNext()) {
                    String next = keys.next();
                    String optString = optJSONObject2.optString(next);
                    if (!StringUtils.isEmpty(next) && !StringUtils.isEmpty(optString)) {
                        hashMap.put(next, optString);
                    }
                }
                arrayList.add(new c(hashMap));
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        com.taobao.search.mmd.datasource.bean.e eVar = new com.taobao.search.mmd.datasource.bean.e();
        eVar.f19164a = optJSONObject.optString("url");
        eVar.c = optJSONObject.optString("guideColor");
        eVar.b = arrayList;
        auctionBaseBean.structuredShopInfo = eVar;
    }
}
