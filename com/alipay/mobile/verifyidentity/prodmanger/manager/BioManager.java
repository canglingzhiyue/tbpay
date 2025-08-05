package com.alipay.mobile.verifyidentity.prodmanger.manager;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.constants.MspFlybirdDefine;
import com.alipay.mobile.verifyidentity.common.Constants;
import com.alipay.mobile.verifyidentity.data.ProdManagerResult;
import com.alipay.mobile.verifyidentity.engine.MicroModuleContext;
import com.alipay.mobile.verifyidentity.log.VerifyLogCat;
import com.alipay.mobile.verifyidentity.log.behavior.VerifyLogger;
import com.alipay.mobile.verifyidentity.prod.manager.module.BaseProdManager;
import com.alipay.mobile.verifyidentity.prodmanger.biopen.data.BioInfoFull;
import com.alipay.mobile.verifyidentity.prodmanger.biopen.data.PageSliderFull;
import com.alipay.mobile.verifyidentity.prodmanger.biopen.ui.BioDetailActivity;
import com.alipay.mobile.verifyidentity.prodmanger.biopen.ui.BioOpenActivity;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.infoflow.multitab.e;
import com.taobao.taolive.room.utils.aw;
import java.util.HashMap;
import java.util.Map;
import tb.rrv;

/* loaded from: classes3.dex */
public class BioManager extends BaseProdManager {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    private static final String f6045a = "BioManager";
    private String b;
    private String c;
    private String d;

    public static /* synthetic */ Object ipc$super(BioManager bioManager, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.alipay.mobile.verifyidentity.prod.manager.module.BaseProdManager
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        }
    }

    @Override // com.alipay.mobile.verifyidentity.prod.manager.module.BaseProdManager
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
        }
    }

    @Override // com.alipay.mobile.verifyidentity.prod.manager.module.BaseProdManager
    public void onCreate(String str, String str2, String str3, String str4, String str5, Bundle bundle) {
        String str6;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a80d4820", new Object[]{this, str, str2, str3, str4, str5, bundle});
            return;
        }
        if (bundle != null) {
            this.c = bundle.getString("sceneId");
            if ("true".equalsIgnoreCase(bundle.getString("forbidUI"))) {
                VerifyLogCat.i(f6045a, "不需要引导开通，直接进入开通流程");
                Bundle a2 = a(str4);
                if (bundle != null) {
                    this.b = bundle.getString(rrv.PRODUCT_ID);
                }
                if ("not_exist_bic_feature".equalsIgnoreCase(str3)) {
                    str6 = "action";
                    a("UC-MobileIC-20180315-3", "", "", "false", str3, this.c, this.b);
                } else {
                    str6 = "action";
                    a("UC-MobileIC-20180315-3", "", "", "true", "", this.c, this.b);
                }
                if (a2 == null) {
                    a2 = new Bundle();
                }
                Bundle bundle2 = a2;
                bundle2.putString("token", str);
                bundle2.putString(str6, str2);
                bundle2.putString("module", this.mName);
                bundle2.putString("code", str3);
                bundle2.putString(Constants.VI_ENGINE_FAST_MODULENAME, str5);
                bundle2.putBundle("extParams", bundle);
                a(bundle2);
                return;
            }
        }
        String str7 = f6045a;
        VerifyLogCat.i(str7, "解析渲染页面数据:" + str3);
        Bundle b = b(str4);
        String str8 = this.d;
        String str9 = this.c;
        String str10 = this.b;
        HashMap hashMap = new HashMap();
        hashMap.put("success", "true");
        hashMap.put(MspFlybirdDefine.FLYBIRD_VIDATA_FINISH_CODE, "1000");
        hashMap.put("productStatus", str8);
        hashMap.put("sceneId", str9);
        hashMap.put(rrv.PRODUCT_ID, str10);
        VerifyLogger.getInstance().eventBehavior("UC-MobileIC-20180315-2", "", "", "", hashMap);
        b.putBundle("InitParams", bundle);
        b.putString("action", str2);
        b.putString("module", this.mName);
        b.putString("token", str);
        b.putString("code", str3);
        Intent intent = new Intent(MicroModuleContext.getInstance().getContext(), BioDetailActivity.class);
        intent.putExtras(b);
        MicroModuleContext.getInstance().startProdActivityByContext(intent);
    }

    @Override // com.alipay.mobile.verifyidentity.prod.manager.module.BaseProdManager
    public void onCreate(String str, String str2, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed47363e", new Object[]{this, str, str2, bundle});
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putString("token", str);
        bundle2.putString(Constants.VI_ENGINE_FAST_MODULENAME, str2);
        bundle2.putBundle("extParams", bundle);
        a(bundle2);
    }

    private Bundle a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bundle) ipChange.ipc$dispatch("b734c076", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Bundle bundle = new Bundle();
        try {
            JSONObject jSONObject = JSON.parseObject(str).getJSONObject("pageModel");
            if (jSONObject != null) {
                String string = jSONObject.getString(aw.PARAM_PRODUCT_TYPE);
                String string2 = jSONObject.getString("registerCommand");
                String string3 = jSONObject.getString("downloadurl");
                String string4 = jSONObject.getString("alertText");
                bundle.putString(aw.PARAM_PRODUCT_TYPE, string);
                bundle.putString("registerCommand", string2);
                bundle.putString("downloadurl", string3);
                bundle.putString("alertText", string4);
                return bundle;
            }
        } catch (Exception unused) {
            VerifyLogCat.e(f6045a, "json fail");
            callback(new ProdManagerResult("1005"), null);
        }
        return null;
    }

    private Bundle b(String str) {
        JSONObject jSONObject;
        String str2;
        String str3;
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bundle) ipChange.ipc$dispatch("43d4eb77", new Object[]{this, str});
        }
        Bundle bundle = new Bundle();
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject parseObject = JSON.parseObject(str);
            if (parseObject != null) {
                this.b = parseObject.getString(rrv.PRODUCT_ID);
                JSONObject jSONObject2 = parseObject.getJSONObject("pageModel");
                String string = parseObject.getString("introduceText");
                str3 = parseObject.getString("introduceUrl");
                str2 = string;
                jSONObject = jSONObject2;
            } else {
                jSONObject = null;
                str2 = null;
                str3 = null;
            }
            String str4 = str2;
            bundle.putString(rrv.PRODUCT_ID, this.b);
            if (jSONObject != null) {
                String jSONString = jSONObject.toJSONString();
                boolean contains = !TextUtils.isEmpty(jSONString) ? jSONString.contains("intelligentEnable") : false;
                BioInfoFull bioInfoFull = (BioInfoFull) JSON.parseObject(jSONString, BioInfoFull.class);
                this.d = bioInfoFull.productStatus;
                if (bioInfoFull != null) {
                    Map<String, String> map = bioInfoFull.pageInfo;
                    Map<String, String> map2 = bioInfoFull.protocol;
                    if (map != null) {
                        z = contains;
                        bundle.putString("pageGuide", map.get("pageGuide"));
                        bundle.putString(rrv.PAGE_CONTENT, map.get(rrv.PAGE_CONTENT));
                        bundle.putString(e.KEY_BG_IMG, map.get(e.KEY_BG_IMG));
                        bundle.putString("returnType", map.get("returnType"));
                        bundle.putString("bottomContent", map.get("bottomContent"));
                        bundle.putString("protocol_url", map.get("protocol_url"));
                        bundle.putString("protocol_prefix", map.get("protocol_prefix"));
                        bundle.putString("protocol_context", map.get("protocol_context"));
                        bundle.putString("btnNormalColor", map.get("btnNormalColor"));
                        bundle.putString("btnPressedColor", map.get("btnPressedColor"));
                        bundle.putString("btnText", map.get("btnText"));
                        TextUtils.isEmpty(map.get("pageSlider"));
                        PageSliderFull pageSliderFull = (PageSliderFull) JSON.parseObject(map.get("pageSlider"), PageSliderFull.class);
                        if (pageSliderFull != null) {
                            bundle.putBoolean("sliderVisible", true);
                            bundle.putString("icon", pageSliderFull.icon);
                            bundle.putString("text", pageSliderFull.text);
                            bundle.putString("highlight", pageSliderFull.highlight);
                            bundle.putString("status", pageSliderFull.status);
                            bundle.putString("url", pageSliderFull.url);
                        } else {
                            bundle.putBoolean("sliderVisible", false);
                        }
                    } else {
                        z = contains;
                    }
                    if (map2 != null) {
                        bundle.putString("gnUrl", map2.get("generalUrl"));
                        bundle.putString("gnPrefix", map2.get("generalPrefix"));
                        bundle.putString("gnProl", map2.get("generalProtocol"));
                    }
                    bundle.putString("biolink", str4);
                    bundle.putString("biolinkurl", str3);
                    bundle.putString("productName", bioInfoFull.productName);
                    bundle.putString("productStatus", bioInfoFull.productStatus);
                    bundle.putString(aw.PARAM_PRODUCT_TYPE, bioInfoFull.productType);
                    bundle.putString("errorCode", bioInfoFull.errorCode);
                    bundle.putBoolean("isViewable", bioInfoFull.isViewable);
                    bundle.putString("pageTitle", bioInfoFull.pageTitle);
                    bundle.putString("pageType", bioInfoFull.pageType);
                    bundle.putString("tplId", bioInfoFull.tplId);
                    bundle.putString("downloadurl", bioInfoFull.downloadurl);
                    bundle.putString("alertText", bioInfoFull.alertText);
                    if (z) {
                        bundle.putBoolean("intgeable", bioInfoFull.intelligentEnable);
                    }
                    bundle.putString("intgetitle", bioInfoFull.intelligentTitle);
                    bundle.putString("intgedesc", bioInfoFull.intelligentDesc);
                    return bundle;
                }
            }
            return null;
        } catch (Exception unused) {
            VerifyLogCat.e(f6045a, "json fail");
            callback(new ProdManagerResult("1005"), null);
            return null;
        }
    }

    private static void a(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54b86a6e", new Object[]{str, str2, str3, str4, str5, str6, str7});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("success", str4);
        hashMap.put(MspFlybirdDefine.FLYBIRD_VIDATA_FINISH_CODE, str3);
        hashMap.put("code", str5);
        hashMap.put("productStatus", str2);
        hashMap.put("sceneId", str6);
        hashMap.put(rrv.PRODUCT_ID, str7);
        VerifyLogger.getInstance().eventBehavior(str, "", "", "", hashMap);
    }

    private static void a(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b668f6c", new Object[]{bundle});
            return;
        }
        Intent intent = new Intent(MicroModuleContext.getInstance().getContext(), BioOpenActivity.class);
        intent.putExtras(bundle);
        MicroModuleContext.getInstance().startProdActivityByContext(intent);
    }
}
