package com.taobao.taolive.movehighlight.utils;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.movehighlight.bundle.timeshift.model.LiveTimemovingModel;
import com.taobao.taolive.room.utils.ag;
import com.taobao.taolive.sdk.model.common.LiveItem;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import java.util.HashMap;
import java.util.Map;
import tb.kge;
import tb.pfa;
import tb.pfb;
import tb.poy;

/* loaded from: classes8.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-216590211);
    }

    public static String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str});
        }
        return "https://h5.m.taobao.com/taolive/video.html?id=" + str;
    }

    public static void a(com.taobao.alilive.aliliveframework.frame.a aVar, Activity activity, LiveItem liveItem, String str, HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3476c51f", new Object[]{aVar, activity, liveItem, str, hashMap});
        } else if (pfa.a(aVar).b() == null) {
        } else {
            pfa.a(aVar).b().a(aVar, activity, liveItem, str, hashMap);
        }
    }

    public static void b(com.taobao.alilive.aliliveframework.frame.a aVar, Activity activity, LiveItem liveItem, String str, HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ffbac5e0", new Object[]{aVar, activity, liveItem, str, hashMap});
        } else if (liveItem == null) {
        } else {
            String valueOf = String.valueOf(liveItem.itemId);
            o.a(aVar, "showDetail", "", valueOf, "itemId=" + liveItem.itemId);
            a(aVar, activity, liveItem, str, hashMap);
        }
    }

    private static void a(LiveTimemovingModel liveTimemovingModel, com.taobao.alilive.aliliveframework.frame.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7dbd64e1", new Object[]{liveTimemovingModel, aVar});
            return;
        }
        VideoInfo u = poy.u(aVar);
        if (u == null || liveTimemovingModel == null) {
            return;
        }
        LiveItem liveItem = new LiveItem();
        liveItem.extendVal = liveTimemovingModel.extendVal;
        liveItem.itemH5TaokeUrl = liveTimemovingModel.itemH5TaokeUrl;
        if (TextUtils.isDigitsOnly(liveTimemovingModel.itemId)) {
            liveItem.itemId = com.taobao.taolive.sdk.utils.l.b(liveTimemovingModel.itemId);
        }
        liveItem.itemPic = liveTimemovingModel.itemPic;
        liveItem.itemUrl = liveTimemovingModel.itemUrl;
        liveItem.liveId = u.liveId;
        liveItem.clickSource = "timeshift";
        if (liveItem.extraUTParams == null) {
            liveItem.extraUTParams = new HashMap();
        }
        liveItem.extraUTParams.put("highlight_coupon_type", liveTimemovingModel.rightInfo != null ? "1" : "0");
        String str = null;
        liveItem.extraUTParams.put("highlight_strategy_code", liveTimemovingModel.rightInfo != null ? liveTimemovingModel.rightInfo.strategyCode : null);
        Map<String, String> map = liveItem.extraUTParams;
        if (liveTimemovingModel.rightInfo != null) {
            str = liveTimemovingModel.rightInfo.benefitCode;
        }
        map.put("highlight_coupon_id", str);
        liveItem.extraUTParams.put("highlight_card_clickPos", "timemove_cart");
        if (pfb.a(aVar).l() == null) {
            return;
        }
        pfb.a(aVar).l().h(aVar, liveItem);
    }

    public static void a(LiveTimemovingModel liveTimemovingModel, Context context, com.taobao.alilive.aliliveframework.frame.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e344dd61", new Object[]{liveTimemovingModel, context, aVar});
        } else if (a(liveTimemovingModel) || c.g()) {
            a(liveTimemovingModel, aVar);
        } else {
            b(liveTimemovingModel, context, aVar);
        }
    }

    public static void b(LiveTimemovingModel liveTimemovingModel, Context context, com.taobao.alilive.aliliveframework.frame.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1bb97c40", new Object[]{liveTimemovingModel, context, aVar});
            return;
        }
        VideoInfo u = poy.u(aVar);
        if (u == null || liveTimemovingModel == null) {
            return;
        }
        LiveItem liveItem = new LiveItem();
        liveItem.extendVal = liveTimemovingModel.extendVal;
        liveItem.itemH5TaokeUrl = liveTimemovingModel.itemH5TaokeUrl;
        if (TextUtils.isDigitsOnly(liveTimemovingModel.itemId)) {
            liveItem.itemId = com.taobao.taolive.sdk.utils.l.b(liveTimemovingModel.itemId);
        }
        liveItem.itemPic = liveTimemovingModel.itemPic;
        liveItem.itemUrl = liveTimemovingModel.itemUrl;
        liveItem.liveId = u.liveId;
        liveItem.itemConfigInfo = u.itemConfigInfo;
        HashMap hashMap = new HashMap();
        hashMap.put("channel", "timemoving");
        hashMap.put("highlight_card_clickPos", "timemove_cart");
        String str = "1";
        hashMap.put("highlight_coupon_type", liveTimemovingModel.rightInfo != null ? str : "0");
        String str2 = null;
        hashMap.put("highlight_strategy_code", liveTimemovingModel.rightInfo != null ? liveTimemovingModel.rightInfo.strategyCode : null);
        hashMap.put("highlight_coupon_id", liveTimemovingModel.rightInfo != null ? liveTimemovingModel.rightInfo.benefitCode : null);
        b(aVar, (Activity) context, liveItem, "detail", hashMap);
        String str3 = liveTimemovingModel.rightInfo != null ? liveTimemovingModel.rightInfo.benefitCode : "";
        String[] strArr = new String[5];
        strArr[0] = ag.ARG_ITEM_ID + liveTimemovingModel.itemId;
        StringBuilder sb = new StringBuilder();
        sb.append("coupon_type=");
        if (liveTimemovingModel.rightInfo == null) {
            str = "0";
        }
        sb.append(str);
        strArr[1] = sb.toString();
        strArr[2] = "coupon_id=" + str3;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("strategyCode=");
        if (liveTimemovingModel.rightInfo != null) {
            str2 = liveTimemovingModel.rightInfo.strategyCode;
        }
        sb2.append(str2);
        strArr[3] = sb2.toString();
        strArr[4] = "timemove_item_type=1";
        o.a(aVar, "timeshiftlayer-todetail", strArr);
    }

    public static boolean a(LiveTimemovingModel liveTimemovingModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4a4c8668", new Object[]{liveTimemovingModel})).booleanValue();
        }
        if (liveTimemovingModel == null) {
            return false;
        }
        if (liveTimemovingModel.extendVal != null && "itemShopType".equals(liveTimemovingModel.extendVal.itemShopType)) {
            return true;
        }
        if (c.f() && liveTimemovingModel.itemExtData != null && liveTimemovingModel.itemExtData.containsKey("enableSku")) {
            return com.taobao.taolive.sdk.utils.l.d(liveTimemovingModel.itemExtData.getString("enableSku"));
        }
        if (liveTimemovingModel.extendVal == null) {
            return false;
        }
        return liveTimemovingModel.extendVal.enableSKU;
    }
}
