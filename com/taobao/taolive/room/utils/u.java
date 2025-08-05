package com.taobao.taolive.room.utils;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.sp.framework.model.SimpleProfile;
import com.taobao.taolive.room.afccoldlunch.PreSimpleRequestParams;
import com.taobao.taolive.room.pre.LiveDetailPreRequestParams;
import java.util.HashMap;
import java.util.Set;
import tb.kge;
import tb.pqj;

/* loaded from: classes8.dex */
public class u {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1259799929);
    }

    public static LiveDetailPreRequestParams a(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LiveDetailPreRequestParams) ipChange.ipc$dispatch("b3063ee5", new Object[]{intent});
        }
        if (intent != null && intent.getData() != null) {
            return a(intent.getData());
        }
        return null;
    }

    public static LiveDetailPreRequestParams a(Uri uri) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (LiveDetailPreRequestParams) ipChange.ipc$dispatch("91a10beb", new Object[]{uri}) : a(new LiveDetailPreRequestParams(), uri);
    }

    public static PreSimpleRequestParams b(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PreSimpleRequestParams) ipChange.ipc$dispatch("5b4e1208", new Object[]{uri});
        }
        PreSimpleRequestParams preSimpleRequestParams = new PreSimpleRequestParams();
        a(preSimpleRequestParams, uri);
        preSimpleRequestParams.entryLiveSource = uri.getQueryParameter("livesource");
        JSONObject jSONObject = new JSONObject();
        if (!TextUtils.isEmpty(preSimpleRequestParams.transParams)) {
            jSONObject = pqj.b(preSimpleRequestParams.transParams);
        }
        for (String str : uri.getQueryParameterNames()) {
            jSONObject.put(str, (Object) uri.getQueryParameter(str));
        }
        preSimpleRequestParams.transParams = jSONObject.toJSONString();
        return preSimpleRequestParams;
    }

    private static LiveDetailPreRequestParams a(LiveDetailPreRequestParams liveDetailPreRequestParams, Uri uri) {
        String queryParameter;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LiveDetailPreRequestParams) ipChange.ipc$dispatch("839ccd7f", new Object[]{liveDetailPreRequestParams, uri});
        }
        Set<String> queryParameterNames = uri.getQueryParameterNames();
        if (liveDetailPreRequestParams.extJson == null) {
            liveDetailPreRequestParams.extJson = new JSONObject();
        }
        liveDetailPreRequestParams.extJson.put("adLive", (Object) (TextUtils.isEmpty(liveDetailPreRequestParams.adImpId) ? "false" : "true"));
        if ("/app/mtb/content/pages/live".equals(uri.getPath())) {
            queryParameter = uri.getQueryParameter("bizFrom");
        } else {
            queryParameter = uri.getQueryParameter("livesource");
        }
        liveDetailPreRequestParams.extJson.put("entryLiveSource", (Object) queryParameter);
        if (queryParameterNames.contains("id")) {
            liveDetailPreRequestParams.feedId = uri.getQueryParameter("id");
        }
        if (queryParameterNames.contains("userId")) {
            liveDetailPreRequestParams.userId = uri.getQueryParameter("userId");
        }
        if (queryParameterNames.contains("itemid")) {
            liveDetailPreRequestParams.itemid = uri.getQueryParameter("itemid");
        }
        if (queryParameterNames.contains(aw.PARAM_TIMEMOVING_ITEM_ID)) {
            liveDetailPreRequestParams.timeMovingItemId = uri.getQueryParameter(aw.PARAM_TIMEMOVING_ITEM_ID);
        }
        if (queryParameterNames.contains(aw.PARAM_SJSD_ITEM_ID)) {
            liveDetailPreRequestParams.sjsdItemId = uri.getQueryParameter(aw.PARAM_SJSD_ITEM_ID);
        }
        liveDetailPreRequestParams.liveSource = queryParameter;
        if (queryParameterNames.contains(aw.PARAM_RCMD)) {
            liveDetailPreRequestParams.rcmd = uri.getQueryParameter(aw.PARAM_RCMD);
        }
        if (queryParameterNames.contains(aw.PARAM_ITEM_IDS)) {
            liveDetailPreRequestParams.itemIds = uri.getQueryParameter(aw.PARAM_ITEM_IDS);
        }
        if (queryParameterNames.contains(aw.PARAM_ITEM_HOLD_TYPE)) {
            liveDetailPreRequestParams.holdType = uri.getQueryParameter(aw.PARAM_ITEM_HOLD_TYPE);
        }
        if (queryParameterNames.contains(aw.PARAM_TCP_OUTER_PARAM)) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(aw.PARAM_TCP_OUTER_PARAM, (Object) uri.getQueryParameter(aw.PARAM_TCP_OUTER_PARAM));
            liveDetailPreRequestParams.tcpParams = jSONObject;
        }
        String str = "";
        String queryParameter2 = queryParameterNames.contains(aw.PARAM_SHARER_ID) ? uri.getQueryParameter(aw.PARAM_SHARER_ID) : str;
        JSONObject c = c(uri);
        if (c != null && !TextUtils.isEmpty(queryParameter2)) {
            c.put(aw.PARAM_SHARER_ID, (Object) queryParameter2);
        }
        JSONObject jSONObject2 = new JSONObject();
        if (!TextUtils.isEmpty(liveDetailPreRequestParams.itemId)) {
            jSONObject2.put("itemid", (Object) liveDetailPreRequestParams.itemId);
        }
        jSONObject2.put("version", (Object) "202003");
        if (c != null) {
            jSONObject2.putAll(c);
        }
        if (liveDetailPreRequestParams.extJson != null) {
            liveDetailPreRequestParams.extJson.putAll(jSONObject2);
        } else {
            liveDetailPreRequestParams.extJson = jSONObject2;
        }
        String queryParameter3 = uri.getQueryParameterNames().contains(aw.PARAM_PRODUCT_TYPE) ? uri.getQueryParameter(aw.PARAM_PRODUCT_TYPE) : str;
        if (TextUtils.isEmpty(queryParameter3)) {
            queryParameter3 = "live";
        }
        liveDetailPreRequestParams.productType = queryParameter3;
        if (queryParameterNames.contains(aw.PARAM_NEED_RECOMMEND)) {
            liveDetailPreRequestParams.needRecommend = uri.getQueryParameter(aw.PARAM_NEED_RECOMMEND);
        }
        HashMap hashMap = new HashMap();
        hashMap.put("entryLiveSource", queryParameter);
        liveDetailPreRequestParams.transMap = hashMap;
        liveDetailPreRequestParams.useLiveFandom = "true";
        String queryParameter4 = queryParameterNames.contains("timeMovingPcmIdParam") ? uri.getQueryParameter("timeMovingPcmIdParam") : str;
        if (queryParameterNames.contains(aw.PARAM_TRANSPARENT_PARAMS)) {
            str = com.taobao.taolive.movehighlight.utils.j.a(str, queryParameter4);
        }
        liveDetailPreRequestParams.transParams = str;
        if (queryParameterNames.contains(aw.PARAM_FORCE_FANDOM)) {
            liveDetailPreRequestParams.forceFandom = uri.getQueryParameter(aw.PARAM_FORCE_FANDOM);
        } else {
            liveDetailPreRequestParams.forceFandom = null;
        }
        return liveDetailPreRequestParams;
    }

    private static JSONObject c(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("89b0f23d", new Object[]{uri});
        }
        String queryParameter = uri.getQueryParameter("anchorGuard");
        String queryParameter2 = uri.getQueryParameter("timestamp");
        String queryParameter3 = uri.getQueryParameter(SimpleProfile.KEY_SIGNATURE);
        JSONObject jSONObject = new JSONObject();
        if (!TextUtils.isEmpty(queryParameter)) {
            jSONObject.put("anchorGuard", (Object) queryParameter);
        }
        if (!TextUtils.isEmpty(queryParameter2)) {
            jSONObject.put("timestamp", (Object) queryParameter2);
        }
        if (!TextUtils.isEmpty(queryParameter3)) {
            jSONObject.put(SimpleProfile.KEY_SIGNATURE, (Object) queryParameter3);
        }
        return jSONObject;
    }
}
