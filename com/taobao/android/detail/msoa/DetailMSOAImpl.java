package com.taobao.android.detail.msoa;

import android.app.Application;
import android.net.Uri;
import android.os.Bundle;
import android.taobao.windvane.export.adapter.ILocalizationService;
import android.text.TextUtils;
import com.alibaba.android.umbrella.link.UMLinkLogInterface;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.AliLoginInterface;
import com.taobao.android.detail.sdk.event.params.a;
import com.taobao.android.detail.wrapper.activity.DetailFloatActivity;
import com.taobao.android.detail.wrapper.msoa.NewDetailMSOAImpl;
import com.taobao.android.icart.event.h;
import com.taobao.android.msoa.c;
import com.taobao.android.nav.Nav;
import com.taobao.android.sku.pad.b;
import com.taobao.android.sku.utils.o;
import com.taobao.android.trade.event.ThreadMode;
import com.taobao.android.trade.event.f;
import com.taobao.android.trade.event.i;
import com.taobao.android.trade.event.j;
import com.taobao.tao.Globals;
import com.taobao.tao.detail.activity.DetailActivity;
import com.ut.mini.UTAnalytics;
import com.ut.mini.UTHitBuilders;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import tb.bpp;
import tb.dwc;
import tb.evk;
import tb.evr;
import tb.evs;
import tb.kge;

/* loaded from: classes4.dex */
public class DetailMSOAImpl implements DetailMSOAInterface, Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String _SKU_ACTSTACK_ = "_sku_actStack_";
    private static final String _SKU_CODESTACK_ = "_sku_codeStack_";
    private static final String _SKU_UNIQUE_MARKER_ = "_sku_unique_marker_";
    private static final String _SKU_WEBVIEWURL_ = "_sku_webviewUrl_";
    private static final String _SKU_WEEXURL_ = "_sku_weexUrl_";
    public final String TAG = DetailMSOAImpl.class.getSimpleName();

    static {
        kge.a(1807965941);
        kge.a(-1246155388);
        kge.a(1028243835);
    }

    public static /* synthetic */ String access$000(JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bb0f31d", new Object[]{jSONObject, str}) : getMapValueWithNullDefault(jSONObject, str);
    }

    @Override // com.taobao.android.detail.msoa.DetailMSOAInterface
    public void showSku(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1349005", new Object[]{this, str, str2, str3});
        } else {
            showSkuProcess(str, str2, str3, null, false);
        }
    }

    @Override // com.taobao.android.detail.msoa.DetailMSOAInterface
    public void showSku(String str, String str2, String str3, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3ea7f8b", new Object[]{this, str, str2, str3, jSONObject});
        } else {
            showSkuProcess(str, str2, str3, jSONObject, false);
        }
    }

    @Override // com.taobao.android.detail.msoa.DetailMSOAInterface
    public void showSku3(String str, String str2, String str3, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("657e6538", new Object[]{this, str, str2, str3, jSONObject});
        } else {
            showSkuProcess(str, str2, str3, jSONObject, false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0106  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void showSkuProcess(java.lang.String r16, java.lang.String r17, java.lang.String r18, com.alibaba.fastjson.JSONObject r19, boolean r20) {
        /*
            Method dump skipped, instructions count: 297
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.detail.msoa.DetailMSOAImpl.showSkuProcess(java.lang.String, java.lang.String, java.lang.String, com.alibaba.fastjson.JSONObject, boolean):void");
    }

    private static String getTimeStamp(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("af39a6b7", new Object[]{jSONObject});
        }
        JSONObject jSONObject2 = new JSONObject();
        long longValue = jSONObject.getLongValue("JSBRIDGE_START_UPTIME");
        long longValue2 = jSONObject.getLongValue("MSOA_START_UPTIME");
        if (longValue != 0) {
            jSONObject2.put("JSBRIDGE_START_UPTIME", (Object) Long.valueOf(longValue));
        }
        if (longValue2 != 0) {
            jSONObject2.put("MSOA_START_UPTIME", (Object) Long.valueOf(longValue2));
        }
        jSONObject2.put("MSOA_END_UPTIME", (Object) Long.valueOf(System.currentTimeMillis()));
        return jSONObject2.toJSONString();
    }

    private static String depressTBCartShowH5Sku(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4755789a", new Object[]{jSONObject});
        }
        if (jSONObject == null) {
            return "";
        }
        String str = "&sku_forbidH5=" + jSONObject.getString("sku_forbidH5");
        String string = jSONObject.getString("sku_forbidH5_toast");
        if (TextUtils.isEmpty(string)) {
            return str;
        }
        return str + "&sku_forbidH5_toast=" + string;
    }

    private static String depressTBCartShowRedirectSku(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d766e2b", new Object[]{jSONObject});
        }
        if (jSONObject == null) {
            return "";
        }
        String str = "&sku_forbid_redirect=" + jSONObject.getString("sku_forbid_redirect");
        String string = jSONObject.getString("sku_forbid_redirect_toast");
        if (TextUtils.isEmpty(string)) {
            return str;
        }
        return str + "&sku_forbid_redirect_toast=" + string;
    }

    private static boolean depressTBCartRefresh(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c7fd0b02", new Object[]{jSONObject})).booleanValue();
        }
        if (jSONObject == null) {
            return false;
        }
        return Boolean.parseBoolean(jSONObject.getString("depressTBCartRefresh"));
    }

    private static void recordMSOAShowSku(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8556dc8", new Object[]{str, jSONObject});
            return;
        }
        if (TextUtils.isEmpty(str)) {
            str = "null";
        }
        HashMap hashMap = new HashMap();
        if (jSONObject != null) {
            for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
                if (entry != null && !TextUtils.isEmpty(entry.getKey()) && entry.getValue() != null) {
                    hashMap.put(entry.getKey(), entry.getValue().toString());
                }
            }
        }
        try {
            UTHitBuilders.UTControlHitBuilder uTControlHitBuilder = new UTHitBuilders.UTControlHitBuilder("Page_Detail", "Page_Detail_Button-MSOA_ShowSKU");
            uTControlHitBuilder.setProperty("bizName", str);
            uTControlHitBuilder.setProperties(hashMap);
            UTAnalytics.getInstance().getDefaultTracker().send(uTControlHitBuilder.build());
        } catch (Throwable unused) {
        }
        umbrellaMSOAsku(str, jSONObject);
    }

    private static String getMapValueWithNullDefault(JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4284ead6", new Object[]{jSONObject, str});
        }
        if (jSONObject == null || TextUtils.isEmpty(str)) {
            return "NULL";
        }
        String string = jSONObject.getString(str);
        return TextUtils.isEmpty(string) ? "NULL" : string;
    }

    private static void umbrellaMSOAsku(final String str, final JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e74c6fe", new Object[]{str, jSONObject});
            return;
        }
        UMLinkLogInterface a2 = bpp.a();
        if (a2 == null) {
            return;
        }
        a2.commitFailure("Main", str, "", "New_Sku", o.DEFAULT_BIZ_NAME, new HashMap<String, String>() { // from class: com.taobao.android.detail.msoa.DetailMSOAImpl.1
            {
                put("errorMsg", str);
                put("actStack", DetailMSOAImpl.access$000(jSONObject, DetailMSOAImpl._SKU_ACTSTACK_));
                put("codeStack", DetailMSOAImpl.access$000(jSONObject, DetailMSOAImpl._SKU_CODESTACK_));
                put("webviewUrl", DetailMSOAImpl.access$000(jSONObject, DetailMSOAImpl._SKU_WEBVIEWURL_));
                put("weexUrl", DetailMSOAImpl.access$000(jSONObject, DetailMSOAImpl._SKU_WEEXURL_));
                put("uniqueMarker", DetailMSOAImpl.access$000(jSONObject, DetailMSOAImpl._SKU_UNIQUE_MARKER_));
            }
        }, "UME_SKU_MSOA", str);
    }

    private static String getHideComponent(String str, int i, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f076d53d", new Object[]{str, new Integer(i), jSONObject});
        }
        JSONObject jSONObject2 = new JSONObject();
        if (i == 1) {
            jSONObject2.put("id_biz_bottom", (Object) new JSONObject() { // from class: com.taobao.android.detail.msoa.DetailMSOAImpl.2
                {
                    put("addCartText", "确认");
                }
            });
        } else if (i == 2) {
            jSONObject2.put("id_biz_bottom", (Object) new JSONObject() { // from class: com.taobao.android.detail.msoa.DetailMSOAImpl.3
                {
                    put("buyNowText", "确认");
                }
            });
        } else if (i == 11 && jSONObject != null) {
            JSONObject jSONObject3 = jSONObject.getJSONObject("leftButton");
            final String str2 = ILocalizationService.CONFIRM;
            if (jSONObject3 != null) {
                String string = jSONObject3.getString("title");
                if (!TextUtils.isEmpty(string)) {
                    str2 = string;
                }
            }
            jSONObject2.put("id_biz_bottom", (Object) new JSONObject() { // from class: com.taobao.android.detail.msoa.DetailMSOAImpl.4
                {
                    put("comfirText", (Object) str2);
                }
            });
        }
        if ("cart".equals(str)) {
            jSONObject2.put("id_biz_size_chart", (Object) new JSONObject() { // from class: com.taobao.android.detail.msoa.DetailMSOAImpl.5
                {
                    put("gone", (Object) true);
                }
            });
            jSONObject2.put("id_biz_relatedAuctions", (Object) new JSONObject() { // from class: com.taobao.android.detail.msoa.DetailMSOAImpl.6
                {
                    put("gone", (Object) true);
                }
            });
            jSONObject2.put("id_biz_area", (Object) new JSONObject() { // from class: com.taobao.android.detail.msoa.DetailMSOAImpl.7
                {
                    put("gone", (Object) true);
                }
            });
            jSONObject2.put("id_biz_quantity", (Object) new JSONObject() { // from class: com.taobao.android.detail.msoa.DetailMSOAImpl.8
                {
                    put("gone", (Object) true);
                }
            });
            jSONObject2.put("id_biz_component", (Object) new JSONObject() { // from class: com.taobao.android.detail.msoa.DetailMSOAImpl.9
                {
                    put("gone", (Object) true);
                }
            });
            jSONObject2.put("id_biz_maochao_cpu", (Object) new JSONObject() { // from class: com.taobao.android.detail.msoa.DetailMSOAImpl.10
                {
                    put("gone", (Object) true);
                }
            });
            if (jSONObject != null && jSONObject.getJSONObject("extInput") != null) {
                JSONObject jSONObject4 = jSONObject.getJSONObject("extInput");
                JSONObject jSONObject5 = jSONObject4.getJSONObject("id_biz_installment");
                if (jSONObject5 != null && !jSONObject5.isEmpty()) {
                    jSONObject2.put("id_biz_installment", (Object) jSONObject5);
                }
                JSONObject jSONObject6 = jSONObject4.getJSONObject(h.KEY_BUY_METHOD_IN_EVENT);
                if (jSONObject6 != null && !jSONObject6.isEmpty()) {
                    jSONObject2.put(h.KEY_BUY_METHOD_IN_EVENT, (Object) jSONObject6);
                }
                JSONObject jSONObject7 = jSONObject4.getJSONObject("id_biz_service");
                if (jSONObject7 != null && !jSONObject7.isEmpty()) {
                    jSONObject2.put("id_biz_service", (Object) jSONObject7);
                }
                JSONObject jSONObject8 = jSONObject4.getJSONObject("fliggy_sku_ext_params");
                if (jSONObject8 != null && !jSONObject8.isEmpty()) {
                    jSONObject2.put("fliggy_sku_ext_params", (Object) jSONObject8);
                }
            }
        }
        return "&extInput=" + jSONObject2.toJSONString();
    }

    private static String getBottomMode(int i, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("46239528", new Object[]{new Integer(i), jSONObject});
        }
        if (i == 1) {
            return "ADDCART";
        }
        if (i == 2) {
            return "BUYNOW";
        }
        if (i == 3) {
            return "CONFIRM";
        }
        if (i == 5) {
            return "ADDCART";
        }
        if (i == 6) {
            return "BUYNOW";
        }
        if (i == 11) {
            try {
                JSONObject jSONObject2 = jSONObject.getJSONObject("leftButton");
                JSONObject jSONObject3 = jSONObject.getJSONObject("rightButton");
                if (jSONObject2 != null && jSONObject3 == null) {
                    return "CONFIRM";
                }
                if ((jSONObject2 == null || jSONObject3 == null) && jSONObject2 == null && jSONObject3 == null) {
                    return "CONFIRM";
                }
            } catch (Throwable unused) {
            }
        }
        return "ADDCART_AND_BUYNOW";
    }

    private static void showNewSku2(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z, final String str9, boolean z2, String str10, String str11, String str12) {
        String str13;
        String str14;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8314323", new Object[]{str, str2, str3, str4, str5, str6, str7, str8, new Boolean(z), str9, new Boolean(z2), str10, str11, str12});
            return;
        }
        AliLoginInterface a2 = com.taobao.android.o.a();
        if (a2 != null && !a2.b()) {
            a2.a(true);
            return;
        }
        String str15 = "";
        if (!TextUtils.isEmpty(str9)) {
            String jSONString = new JSONObject() { // from class: com.taobao.android.detail.msoa.DetailMSOAImpl.11
                {
                    put("bizName", (Object) str9);
                }
            }.toJSONString();
            str14 = "&skuUT=" + URLEncoder.encode(jSONString);
            str13 = "&skuInnerBizName=" + str9;
        } else {
            str13 = str15;
            str14 = str13;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("https://sku.taobao.com/index.htm?itemId=");
        sb.append(str2);
        sb.append("&uniqueId=");
        sb.append(URLEncoder.encode(str));
        sb.append("&skuId=");
        sb.append(str3);
        sb.append("&isFromMsoa=true");
        sb.append("&bottomMode=");
        sb.append(str4);
        sb.append("&isSourceType11=");
        sb.append(z ? "true" : "false");
        sb.append(!TextUtils.isEmpty(str5) ? str5 : str15);
        if (!TextUtils.isEmpty(str6)) {
            str15 = str6;
        }
        sb.append(str15);
        sb.append("&ignore_toast=true");
        sb.append("&downgradeStr=");
        sb.append(URLEncoder.encode(str7));
        sb.append(str8);
        sb.append(str14);
        sb.append(str13);
        sb.append("&depressTBCartRefresh=");
        sb.append(z2);
        sb.append(str10);
        sb.append(str11);
        sb.append("&perfStamp=");
        sb.append(str12);
        String sb2 = sb.toString();
        Application application = Globals.getApplication();
        if (b.INSTANCE.a(application)) {
            Bundle bundle = new Bundle();
            bundle.putBoolean("stdPopPanEnable", false);
            bundle.putBoolean("stdPopModal", true);
            bundle.putBoolean("stdPopHandleBack", false);
            Nav.from(application).withExtras(bundle).toUri(sb2 + "&largescreenmask=true");
            return;
        }
        Nav.from(application).toUri(sb2);
    }

    private static Bundle generateParamsForSourceType11(Bundle bundle, String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bundle) ipChange.ipc$dispatch("e91233c0", new Object[]{bundle, str, jSONObject});
        }
        if (bundle == null) {
            bundle = new Bundle();
        }
        if (jSONObject == null) {
            bundle.putString("bottom_bar_style", "bottombar_style_buyaddcart");
            return bundle;
        }
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject("leftButton");
            JSONObject jSONObject3 = jSONObject.getJSONObject("rightButton");
            if (jSONObject2 != null && jSONObject3 == null) {
                bundle.putString("bottom_bar_style", "bottombar_style_buyonly");
                String string = jSONObject2.getString("title");
                if (TextUtils.isEmpty(string)) {
                    string = ILocalizationService.CONFIRM;
                }
                bundle.putString("buyText", string);
            } else if (jSONObject2 != null && jSONObject3 != null) {
                bundle.putString("bottom_bar_style", "bottombar_style_buyaddcart");
                String string2 = jSONObject2.getString("title");
                String string3 = jSONObject3.getString("title");
                if (!TextUtils.isEmpty(string2)) {
                    bundle.putString("buyText", string2);
                }
                if (!TextUtils.isEmpty(string3)) {
                    bundle.putString("cartText", string3);
                }
            } else if (jSONObject2 == null && jSONObject3 == null) {
                bundle.putString("bottom_bar_style", "bottombar_style_buyonly");
                bundle.putString("buyText", ILocalizationService.CONFIRM);
            }
            bundle.putString("sourceType", str);
            return bundle;
        } catch (Throwable th) {
            try {
                th.printStackTrace();
                bundle.putString("bottom_bar_style", "bottombar_style_buyaddcart");
            } catch (Throwable unused) {
            }
            return bundle;
        }
    }

    @Override // com.taobao.android.detail.msoa.DetailMSOAInterface
    public void addSMCart(final String str, final String str2, String str3, String str4) {
        String str5;
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2b985aa", new Object[]{this, str, str2, str3, str4});
        } else if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            c.a().a(str, "msoa_error_invalid_param", "invalid parameter", null);
        } else {
            try {
                str3 = URLDecoder.decode(str3, "utf-8");
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
            DetailActivity a2 = dwc.a(str3);
            if (a2 == null) {
                new NewDetailMSOAImpl().addSMCart(str, str2, str3, str4);
            } else if (a2.a() == null) {
                c.a().a(str, "msoa_error_business_fail", "provider business fail", null);
            } else {
                JSONObject parseObject = JSON.parseObject(str4);
                HashMap hashMap = new HashMap();
                if (parseObject != null) {
                    i = parseObject.getIntValue("quantity");
                    JSONObject jSONObject = parseObject.getJSONObject("exParams");
                    if (jSONObject != null) {
                        for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
                            hashMap.put(entry.getKey(), (String) entry.getValue());
                        }
                    }
                    str5 = parseObject.getString("skuId");
                } else {
                    str5 = null;
                    i = 0;
                }
                if (i <= 0) {
                    i = 1;
                }
                f.a(a2, new evk(new com.taobao.android.detail.sdk.event.params.c(new a.C0393a().a(i).b(str2).a(str5).a(hashMap).a(), false)), new com.taobao.android.trade.event.c<i>() { // from class: com.taobao.android.detail.msoa.DetailMSOAImpl.12
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.android.trade.event.c
                    public void a(i iVar, j jVar) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("e2d27b9", new Object[]{this, iVar, jVar});
                        } else if (!i.FAILURE.equals(iVar)) {
                        } else {
                            c.a().a(str, "msoa_error_business_fail", "provider business fail", null);
                        }
                    }

                    @Override // com.taobao.android.trade.event.c
                    public void onEventException(j jVar) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("9f9dab53", new Object[]{this, jVar});
                        } else {
                            c.a().a(str, "msoa_error_business_fail", "provider business fail", null);
                        }
                    }
                });
                j<evs> jVar = new j<evs>() { // from class: com.taobao.android.detail.msoa.DetailMSOAImpl.13
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.android.trade.event.j
                    public /* synthetic */ i handleEvent(evs evsVar) {
                        IpChange ipChange2 = $ipChange;
                        return ipChange2 instanceof IpChange ? (i) ipChange2.ipc$dispatch("caa7474e", new Object[]{this, evsVar}) : a(evsVar);
                    }

                    public i a(evs evsVar) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            return (i) ipChange2.ipc$dispatch("140fca39", new Object[]{this, evsVar});
                        }
                        if (evsVar != null && evsVar.f27605a != null && str2.equals(evsVar.f27605a.itemId)) {
                            HashMap hashMap2 = new HashMap();
                            hashMap2.put("resultCode", "1");
                            c.a().a(str, hashMap2);
                        }
                        return i.SUCCESS;
                    }

                    @Override // com.taobao.android.trade.event.j
                    public ThreadMode getThreadMode() {
                        IpChange ipChange2 = $ipChange;
                        return ipChange2 instanceof IpChange ? (ThreadMode) ipChange2.ipc$dispatch("6de50c9b", new Object[]{this}) : ThreadMode.MainThread;
                    }
                };
                j<evr> jVar2 = new j<evr>() { // from class: com.taobao.android.detail.msoa.DetailMSOAImpl.14
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.android.trade.event.j
                    public /* synthetic */ i handleEvent(evr evrVar) {
                        IpChange ipChange2 = $ipChange;
                        return ipChange2 instanceof IpChange ? (i) ipChange2.ipc$dispatch("caa7474e", new Object[]{this, evrVar}) : a(evrVar);
                    }

                    public i a(evr evrVar) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            return (i) ipChange2.ipc$dispatch("67f6b8", new Object[]{this, evrVar});
                        }
                        if (evrVar != null && evrVar.f27604a != null && str2.equals(evrVar.f27604a.itemId)) {
                            HashMap hashMap2 = new HashMap();
                            hashMap2.put("resultCode", "0");
                            c.a().a(str, hashMap2);
                        }
                        return i.SUCCESS;
                    }

                    @Override // com.taobao.android.trade.event.j
                    public ThreadMode getThreadMode() {
                        IpChange ipChange2 = $ipChange;
                        return ipChange2 instanceof IpChange ? (ThreadMode) ipChange2.ipc$dispatch("6de50c9b", new Object[]{this}) : ThreadMode.MainThread;
                    }
                };
                f.a(a2).a(20011, jVar);
                f.a(a2).a(20012, jVar2);
            }
        }
    }

    @Override // com.taobao.android.detail.msoa.DetailMSOAInterface
    public void showFloatPage(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95188a33", new Object[]{this, str, str2, str3});
        } else {
            exeShowFloatPage(str, str2, str3);
        }
    }

    private void exeShowFloatPage(String str, String str2, String str3) {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53420fc1", new Object[]{this, str, str2, str3});
        } else if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            com.taobao.android.detail.sdk.utils.f.a(this.TAG, "requestId or type is null");
            c.a().b(str, "0", DetailFloatActivity.ERROR_MSG, null);
        } else {
            Uri.Builder buildUpon = Uri.parse(DetailFloatActivity.URI).buildUpon();
            buildUpon.appendQueryParameter(com.taobao.android.detail.wrapper.ext.uikit.b.b, str2);
            buildUpon.appendQueryParameter(com.taobao.android.detail.wrapper.ext.uikit.b.f11376a, str);
            if (!TextUtils.isEmpty(str3)) {
                try {
                    JSONObject parseObject = JSON.parseObject(str3);
                    if (parseObject != null) {
                        for (String str4 : parseObject.keySet()) {
                            if (!TextUtils.isEmpty(str4) && (obj = parseObject.get(str4)) != null && (obj instanceof String)) {
                                buildUpon.appendQueryParameter(str4, (String) obj);
                            }
                        }
                    }
                } catch (Exception unused) {
                    com.taobao.android.detail.sdk.utils.f.a(this.TAG, "parse json bizData fail");
                    c.a().b(str, "0", DetailFloatActivity.ERROR_MSG, null);
                }
            }
            Nav.from(Globals.getApplication()).toUri(buildUpon.toString());
        }
    }
}
