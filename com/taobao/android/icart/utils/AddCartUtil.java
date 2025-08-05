package com.taobao.android.icart.utils;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.support.v4.content.LocalBroadcastManager;
import android.text.TextUtils;
import android.util.Base64;
import com.alibaba.ability.localization.b;
import com.alibaba.android.umbrella.link.export.UmTypeKey;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.android.alibaba.ip.runtime.IpChange;
import com.mobile.auth.gatewayauth.ResultCode;
import com.taobao.android.ultron.common.utils.UnifyLog;
import com.taobao.tao.Globals;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.MtopBusiness;
import com.taobao.taobao.R;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import tb.bbz;
import tb.bdx;
import tb.bed;
import tb.beg;
import tb.bex;
import tb.bpp;
import tb.gny;
import tb.gnz;
import tb.goa;
import tb.kge;

/* loaded from: classes5.dex */
public class AddCartUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ADD_ON_MODULE = "addon";
    public static final String API_ADD_CART = "mtop.trade.addBag";
    public static final String CART_CHANNEL = "cart";
    public static final String DETAIL_CHANNEL = "detail";
    public static final String FEED_FLOW_MODULE = "feedflow";
    public static final String SEARCH_FLOW_MODULE = "searchFlow";
    public static final String SKU_CHANNEL = "sku";
    public static final String SKU_EDITABLE_TAG = "1";
    public static final String STRINGIFY_ADD_CART_RESULT = "stringifyAddCartResult";
    public static final String VERSION_ADD_CART = "3.1";

    /* loaded from: classes5.dex */
    public @interface Channel {
    }

    /* loaded from: classes5.dex */
    public @interface Module {
    }

    static {
        kge.a(-1810998068);
    }

    public static /* synthetic */ void a(Context context, MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dae8c825", new Object[]{context, mtopResponse});
        } else {
            b(context, mtopResponse);
        }
    }

    public static void a(String str, String str2, int i, final IRemoteBaseListener iRemoteBaseListener, String str3, final bbz bbzVar, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1087b96", new Object[]{str, str2, new Integer(i), iRemoteBaseListener, str3, bbzVar, map});
            return;
        }
        bbzVar.l().a(4);
        MtopRequest mtopRequest = new MtopRequest();
        mtopRequest.setApiName("mtop.trade.addBag");
        mtopRequest.setVersion("3.1");
        mtopRequest.setNeedSession(true);
        mtopRequest.setNeedEcode(true);
        final JSONObject jSONObject = new JSONObject();
        jSONObject.put("itemId", (Object) str);
        jSONObject.put("skuId", (Object) str2);
        jSONObject.put("quantity", (Object) Integer.valueOf(i));
        jSONObject.put("cartFrom", (Object) str3);
        HashMap hashMap = new HashMap();
        hashMap.put("serviceId", "");
        hashMap.put("divisionId", "");
        if (map != null) {
            hashMap.putAll(map);
        }
        jSONObject.put("exParams", (Object) JSON.toJSONString(hashMap));
        mtopRequest.setData(jSONObject.toJSONString());
        MtopBusiness build = MtopBusiness.build(mtopRequest);
        build.mo1305reqMethod(MethodEnum.POST);
        build.mo1328setUnitStrategy("UNIT_TRADE");
        build.registerListener((IRemoteListener) new IRemoteBaseListener() { // from class: com.taobao.android.icart.utils.AddCartUtil.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
            public void onSystemError(int i2, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i2), mtopResponse, obj});
                    return;
                }
                bbz.this.l().b(4);
                AddCartUtil.a(bbz.this.m(), mtopResponse);
                String s = bbz.this.s();
                String[] strArr = new String[1];
                strArr[0] = mtopResponse != null ? mtopResponse.getRetMsg() : "";
                UnifyLog.a(s, "AddCartUtil", "onSystemError ", strArr);
                bdx.a("AddCartUtil", "netRequest", mtopResponse.getRetCode(), mtopResponse.getRetMsg(), jSONObject);
                IRemoteBaseListener iRemoteBaseListener2 = iRemoteBaseListener;
                if (iRemoteBaseListener2 != null) {
                    iRemoteBaseListener2.onSystemError(i2, mtopResponse, obj);
                }
                bed.a(bed.b.a("mtop.trade.addBag", false).b(mtopResponse.getRetMsg()).a(1.0f));
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onSuccess(int i2, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i2), mtopResponse, baseOutDo, obj});
                    return;
                }
                bbz.this.l().b(4);
                String s = bbz.this.s();
                String[] strArr = new String[1];
                strArr[0] = mtopResponse != null ? mtopResponse.getRetMsg() : "";
                UnifyLog.a(s, "AddCartUtil", "onSuccess ", strArr);
                bdx.a("AddCartUtil", "netRequest", jSONObject);
                IRemoteBaseListener iRemoteBaseListener2 = iRemoteBaseListener;
                if (iRemoteBaseListener2 != null) {
                    iRemoteBaseListener2.onSuccess(i2, mtopResponse, baseOutDo, obj);
                }
                bed.a(bed.b.a("mtop.trade.addBag", true).b(mtopResponse == null ? ResultCode.MSG_SUCCESS : mtopResponse.getRetMsg()).a(0.001f));
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onError(int i2, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i2), mtopResponse, obj});
                    return;
                }
                bbz.this.l().b(4);
                AddCartUtil.a(bbz.this.m(), mtopResponse);
                String s = bbz.this.s();
                String[] strArr = new String[1];
                strArr[0] = mtopResponse != null ? mtopResponse.getRetMsg() : "";
                UnifyLog.a(s, "AddCartUtil", "onError ", strArr);
                bdx.a("AddCartUtil", "netRequest", mtopResponse.getRetCode(), mtopResponse.getRetMsg(), jSONObject);
                IRemoteBaseListener iRemoteBaseListener2 = iRemoteBaseListener;
                if (iRemoteBaseListener2 != null) {
                    iRemoteBaseListener2.onError(i2, mtopResponse, obj);
                }
                bed.a(bed.b.a("mtop.trade.addBag", false).b(mtopResponse.getRetMsg()).a(1.0f));
            }
        }).startRequest();
    }

    private static void b(Context context, MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5949cc04", new Object[]{context, mtopResponse});
        } else if (mtopResponse == null) {
        } else {
            String retMsg = mtopResponse.getRetMsg();
            if (TextUtils.isEmpty(retMsg)) {
                retMsg = b.a(R.string.app_busy_system_tired);
                if (mtopResponse != null && mtopResponse.isApiLockedResult()) {
                    retMsg = b.a(R.string.taobao_app_1028_1_21641);
                }
            }
            com.alibaba.android.icart.core.widget.d.a(context, retMsg);
            bed.a("sxcAddBagError", "省心凑加购失败");
        }
    }

    public static void a(bbz bbzVar, JSONObject jSONObject, String str, final boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56afbeb8", new Object[]{bbzVar, jSONObject, str, new Boolean(z)});
        } else if (jSONObject != null && bbzVar != null) {
            final Application application = Globals.getApplication();
            if (!com.alibaba.android.ultron.trade.utils.e.a(application)) {
                com.alibaba.android.icart.core.widget.d.a(application, b.a(R.string.app_network_error));
                bpp.a().commitFeedback("iCart", b.a(R.string.app_network_error), UmTypeKey.TOAST, "biz", "network not available");
            }
            String string = jSONObject.getString("itemId");
            String str2 = "sku";
            boolean equals = TextUtils.equals("1", jSONObject.getString(str2));
            String string2 = jSONObject.getString("scm");
            if (!equals) {
                str2 = "cart";
            }
            Map<String, String> a2 = a(bbzVar.m(), str2, str, jSONObject.getString("customParam"));
            String str3 = "";
            if (equals) {
                gnz a3 = gnz.a(string, str3, str3, str3);
                if (a2 != null) {
                    a3.g = new JSONObject(new HashMap(a2));
                    a3.i.add("addBagExParamFromCartFeedFlow");
                }
                goa.a(a3).a("1", new gny() { // from class: com.taobao.android.icart.utils.AddCartUtil.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // tb.gny
                    public void a(int i, String str4) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("20f12ca5", new Object[]{this, new Integer(i), str4});
                        }
                    }

                    @Override // tb.gny
                    public void a(gnz gnzVar) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("ea9ea585", new Object[]{this, gnzVar});
                        }
                    }
                }, false);
            } else {
                if (jSONObject.containsKey("skuId")) {
                    str3 = jSONObject.getString("skuId");
                }
                String str4 = str3;
                JSONObject jSONObject2 = jSONObject.getJSONObject("addBagExParams");
                if (jSONObject2 != null) {
                    for (String str5 : jSONObject2.keySet()) {
                        a2.put(str5, String.valueOf(jSONObject2.get(str5)));
                    }
                }
                a(string, str4, 1, new IRemoteBaseListener() { // from class: com.taobao.android.icart.utils.AddCartUtil.3
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.tao.remotebusiness.IRemoteListener
                    public void onError(int i, MtopResponse mtopResponse, Object obj) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                        }
                    }

                    @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
                    public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                        }
                    }

                    @Override // com.taobao.tao.remotebusiness.IRemoteListener
                    public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                            return;
                        }
                        Context context = application;
                        com.alibaba.android.icart.core.widget.d.a(context, context.getString(R.string.ack_msg_add_bag_success));
                        bpp.a().commitFeedback("iCart", application.getString(R.string.ack_msg_add_bag_success), UmTypeKey.TOAST, "biz", "normal");
                        if (!z) {
                            return;
                        }
                        org.json.JSONObject dataJsonObject = mtopResponse.getDataJsonObject();
                        Intent intent = new Intent(beg.f25832a);
                        intent.putExtra("stringifyAddCartResult", dataJsonObject.toString());
                        LocalBroadcastManager.getInstance(Globals.getApplication()).sendBroadcastSync(intent);
                    }
                }, bbzVar.v().a(), bbzVar, a2);
            }
            try {
                a(bbzVar, jSONObject, string, string2);
            } catch (Throwable unused) {
            }
        }
    }

    private static void a(bbz bbzVar, JSONObject jSONObject, String str, String str2) {
        String string;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d69ae266", new Object[]{bbzVar, jSONObject, str, str2});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("itemId", str);
        hashMap.put("scm", str2);
        JSONObject jSONObject2 = jSONObject.getJSONObject("utArgs");
        if (jSONObject2 != null && !jSONObject2.isEmpty()) {
            for (String str3 : jSONObject2.keySet()) {
                if (str3 != null && (string = jSONObject2.getString(str3)) != null) {
                    hashMap.put(str3, string);
                }
            }
        }
        bex.a(bbzVar, "Page_ShoppingCart_Button-AddRecomm", hashMap);
    }

    public static Map<String, String> a(Activity activity, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("4a91204d", new Object[]{activity, str, str2, str3}) : a(activity, "addBagExParamFromCartFeedFlow", str, str2, str3);
    }

    public static Map<String, String> a(Activity activity, String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("db4e0a97", new Object[]{activity, str, str2, str3, str4}) : a(String.valueOf(activity.hashCode()), str, str2, str3, str4);
    }

    public static Map<String, String> a(String str, String str2, String str3, String str4, String str5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("c749c70f", new Object[]{str, str2, str3, str4, str5});
        }
        JSONObject jSONObject = new JSONObject(4);
        jSONObject.put("cartInstanceId", (Object) str);
        jSONObject.put("channel", (Object) str3);
        jSONObject.put("module", (Object) str4);
        if (str5 != null) {
            jSONObject.put("customParam", (Object) str5);
        }
        return Collections.singletonMap(str2, Base64.encodeToString(JSON.toJSONBytes(jSONObject, new SerializerFeature[0]), 0));
    }
}
