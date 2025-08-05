package com.taobao.taobao.scancode.huoyan.util;

import android.content.Context;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.scancode.common.mtop.request.CainiaoLdDetailH5AuthGetRequest;
import com.taobao.taobao.scancode.common.mtop.request.PailitaoRecommendRequest;
import com.taobao.taobao.scancode.common.mtop.resp.CainiaoLdDetailH5AuthGetResp;
import com.taobao.taobao.scancode.common.mtop.resp.PailitaoRecommendResp;
import com.taobao.taobao.scancode.huoyan.object.MtopEtaoKakaMailtraceRequest;
import com.taobao.taobao.scancode.huoyan.object.MtopEtaoKakaMailtraceResponse;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import mtopsdk.mtop.common.ApiID;
import tb.kge;
import tb.oys;

/* loaded from: classes8.dex */
public class e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String READ_WHITE_LIST_API = "http://www.etao.com/go/rgn/kaka/whitelist.php";

    static {
        kge.a(1587555202);
    }

    public static ApiID a(Context context, String str, d<MtopEtaoKakaMailtraceResponse> dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ApiID) ipChange.ipc$dispatch("aca8c24", new Object[]{context, str, dVar});
        }
        MtopEtaoKakaMailtraceRequest mtopEtaoKakaMailtraceRequest = new MtopEtaoKakaMailtraceRequest();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("mailNo", (Object) str);
        mtopEtaoKakaMailtraceRequest.bizParam = jSONObject.toString();
        mtopEtaoKakaMailtraceRequest.bizType = "kaka.mailtrace";
        oys.a().a("huoyan_kaka_api_asyncSearchExpress");
        return KakaLibMTopParserHelper.a(context, mtopEtaoKakaMailtraceRequest, MtopEtaoKakaMailtraceResponse.class, dVar);
    }

    public static ApiID a(Context context, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, d<CainiaoLdDetailH5AuthGetResp> dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ApiID) ipChange.ipc$dispatch("f0502874", new Object[]{context, str, str2, str3, str4, str5, str6, str7, str8, str9, dVar});
        }
        CainiaoLdDetailH5AuthGetRequest cainiaoLdDetailH5AuthGetRequest = new CainiaoLdDetailH5AuthGetRequest();
        cainiaoLdDetailH5AuthGetRequest.setMailNo(str);
        cainiaoLdDetailH5AuthGetRequest.setResCode(str2);
        cainiaoLdDetailH5AuthGetRequest.setReceiverMobile(str3);
        cainiaoLdDetailH5AuthGetRequest.setReceiverAddress(str4);
        cainiaoLdDetailH5AuthGetRequest.setSenderMobile(str5);
        cainiaoLdDetailH5AuthGetRequest.setSenderAddress(str6);
        cainiaoLdDetailH5AuthGetRequest.setAppKey(str7);
        cainiaoLdDetailH5AuthGetRequest.setTradeId(str8);
        cainiaoLdDetailH5AuthGetRequest.setExtParams(str9);
        return KakaLibMTopParserHelper.a(context, cainiaoLdDetailH5AuthGetRequest, CainiaoLdDetailH5AuthGetResp.class, dVar);
    }

    public static ApiID a(Context context, long j, String str, d<PailitaoRecommendResp> dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ApiID) ipChange.ipc$dispatch("54c18b28", new Object[]{context, new Long(j), str, dVar});
        }
        PailitaoRecommendRequest pailitaoRecommendRequest = new PailitaoRecommendRequest();
        pailitaoRecommendRequest.setAppId(j);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("barCodeUrl", (Object) str);
        jSONObject.put("scanTime", (Object) a());
        HashMap hashMap = new HashMap(2);
        hashMap.put("contentJson", jSONObject.toJSONString());
        pailitaoRecommendRequest.setParams(JSON.toJSONString(hashMap));
        return KakaLibMTopParserHelper.a(context, pailitaoRecommendRequest, PailitaoRecommendResp.class, dVar);
    }

    private static String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[0]) : new SimpleDateFormat("yyyy-MM-dd hh:mm:ss", Locale.getDefault()).format(new Date());
    }
}
