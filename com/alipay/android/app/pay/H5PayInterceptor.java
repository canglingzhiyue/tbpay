package com.alipay.android.app.pay;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import mtopsdk.common.util.StringUtils;
import com.alipay.android.app.pay.PayTask;
import com.alipay.android.msp.constants.MspGlobalDefine;
import com.alipay.android.msp.model.BizContext;
import com.alipay.android.msp.model.H5PayCallback;
import com.alipay.android.msp.model.H5PayResultModel;
import com.alipay.android.msp.model.H5PayUtil;
import com.alipay.android.msp.model.TaobaoModel;
import com.alipay.android.msp.utils.LogUtil;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.alipay.callservice.AlipayCallServiceActivity;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class H5PayInterceptor {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    private static final String f4346a = "H5PayInterceptor";
    private PayTask b;
    private Activity c;
    private H5PayCallback d;
    private TaobaoModel e = null;
    private PayTask.OnPayListener f = new PayTask.OnPayListener() { // from class: com.alipay.android.app.pay.H5PayInterceptor.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.alipay.android.app.pay.PayTask.OnPayListener
        public void onPaySuccess(Context context, String str, String str2, String str3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9a71bc85", new Object[]{this, context, str, str2, str3});
            } else {
                H5PayInterceptor.a(H5PayInterceptor.this, str, str2, str3);
            }
        }

        @Override // com.alipay.android.app.pay.PayTask.OnPayListener
        public void onPayFailed(Context context, String str, String str2, String str3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("50907699", new Object[]{this, context, str, str2, str3});
            } else {
                H5PayInterceptor.a(H5PayInterceptor.this, str, str2, str3);
            }
        }
    };

    public H5PayInterceptor(Activity activity) {
        this.c = activity;
        this.b = new PayTask(activity, this.f);
    }

    public synchronized boolean payInterceptorWithUrl(String str, H5PayCallback h5PayCallback, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e2add0fb", new Object[]{this, str, h5PayCallback, map})).booleanValue();
        }
        this.d = h5PayCallback;
        String fetchOrderInfoFromH5PayUrl = fetchOrderInfoFromH5PayUrl(str);
        if (!StringUtils.isEmpty(fetchOrderInfoFromH5PayUrl)) {
            String format = new BizContext(this.c).format(fetchOrderInfoFromH5PayUrl);
            JSONObject jSONObject = new JSONObject();
            if (map != null && map.size() > 0) {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    jSONObject.put(entry.getKey(), entry.getValue());
                }
            }
            try {
                jSONObject.put(MspGlobalDefine.INVOKE_FROM_SOURCE_KEY, MspGlobalDefine.H5_PAGE);
                jSONObject.put(MspGlobalDefine.INVOKE_FROM_API_KEY, MspGlobalDefine.H5_TO_NATIVE);
            } catch (Exception e) {
                LogUtil.printExceptionStackTrace(e);
            }
            this.b.pay(format, jSONObject.toString(), "");
        }
        return !StringUtils.isEmpty(fetchOrderInfoFromH5PayUrl);
    }

    public synchronized String fetchOrderInfoFromH5PayUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7891d8ef", new Object[]{this, str});
        }
        if (!StringUtils.isEmpty(str)) {
            String trim = str.trim();
            if (trim.startsWith("https://wappaygw.alipay.com/service/rest.htm") || trim.startsWith("http://wappaygw.alipay.com/service/rest.htm")) {
                String trim2 = trim.replaceFirst("(http|https)://wappaygw.alipay.com/service/rest.htm\\?", "").trim();
                if (!StringUtils.isEmpty(trim2)) {
                    return "_input_charset=\"utf-8\"&ordertoken=\"" + H5PayUtil.subString("<request_token>", "</request_token>", H5PayUtil.convertArgs(trim2).get("req_data")) + "\"&pay_channel_id=\"alipay_sdk\"&bizcontext=\"" + H5PayUtil.buildSimpleBizContext("sc", MspGlobalDefine.H5_TO_NATIVE) + "\"";
                }
            }
            if (trim.startsWith("https://mclient.alipay.com/service/rest.htm") || trim.startsWith("http://mclient.alipay.com/service/rest.htm")) {
                String trim3 = trim.replaceFirst("(http|https)://mclient.alipay.com/service/rest.htm\\?", "").trim();
                if (!StringUtils.isEmpty(trim3)) {
                    return "_input_charset=\"utf-8\"&ordertoken=\"" + H5PayUtil.subString("<request_token>", "</request_token>", H5PayUtil.convertArgs(trim3).get("req_data")) + "\"&pay_channel_id=\"alipay_sdk\"&bizcontext=\"" + H5PayUtil.buildSimpleBizContext("sc", MspGlobalDefine.H5_TO_NATIVE) + "\"";
                }
            }
            if ((trim.startsWith("https://mclient.alipay.com/home/exterfaceAssign.htm") || trim.startsWith("http://mclient.alipay.com/home/exterfaceAssign.htm")) && ((trim.contains("alipay.wap.create.direct.pay.by.user") || trim.contains("create_forex_trade_wap")) && !StringUtils.isEmpty(trim.replaceFirst("(http|https)://mclient.alipay.com/home/exterfaceAssign.htm\\?", "").trim()))) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("url", str);
                    jSONObject.put("bizcontext", H5PayUtil.buildSimpleBizContext("sc", MspGlobalDefine.H5_TO_NATIVE));
                    return "new_external_info==" + jSONObject.toString();
                } catch (Throwable th) {
                    LogUtil.printExceptionStackTrace(th);
                }
            }
            if (Pattern.compile("^(http|https)://(maliprod\\.alipay\\.com/w/trade_pay\\.do.?|mali\\.alipay\\.com/w/trade_pay\\.do.?|mclient\\.alipay\\.com/w/trade_pay\\.do.?)").matcher(str).find()) {
                String subString = H5PayUtil.subString("?", "", str);
                if (!StringUtils.isEmpty(subString)) {
                    Map<String, String> convertArgs = H5PayUtil.convertArgs(subString);
                    StringBuilder sb = new StringBuilder();
                    if (H5PayUtil.appendVarialbeValue(false, true, "trade_no", sb, convertArgs, "trade_no", "alipay_trade_no")) {
                        H5PayUtil.appendVarialbeValue(true, false, "pay_phase_id", sb, convertArgs, "payPhaseId", "pay_phase_id", "out_relation_id");
                        sb.append("&biz_sub_type=\"TRADE\"");
                        sb.append("&biz_type=\"trade\"");
                        String str2 = convertArgs.get("app_name");
                        if (StringUtils.isEmpty(str2) && !StringUtils.isEmpty(convertArgs.get("cid"))) {
                            str2 = "ali1688";
                        } else if (StringUtils.isEmpty(str2) && (!StringUtils.isEmpty(convertArgs.get("sid")) || !StringUtils.isEmpty(convertArgs.get("s_id")))) {
                            str2 = "tb";
                        }
                        sb.append("&app_name=\"");
                        sb.append(str2);
                        sb.append("\"");
                        if (!H5PayUtil.appendVarialbeValue(true, true, AlipayCallServiceActivity.ALIPAY_EXTERN_TOKEN, sb, convertArgs, AlipayCallServiceActivity.ALIPAY_EXTERN_TOKEN, "cid", "sid", "s_id")) {
                            return "";
                        }
                        H5PayUtil.appendVarialbeValue(true, false, "appenv", sb, convertArgs, "appenv");
                        sb.append("&pay_channel_id=\"alipay_sdk\"");
                        TaobaoModel taobaoModel = new TaobaoModel();
                        taobaoModel.setReturnUrl(convertArgs.get("return_url"));
                        taobaoModel.setShowUrl(convertArgs.get("show_url"));
                        taobaoModel.setPayOrderId(convertArgs.get("pay_order_id"));
                        String str3 = sb.toString() + "&bizcontext=\"" + H5PayUtil.buildSimpleBizContext("sc", MspGlobalDefine.H5_TO_NATIVE) + "\"";
                        this.e = taobaoModel;
                        return str3;
                    }
                }
            }
            if (trim.contains("mclient.alipay.com/cashier/mobilepay.htm")) {
                String buildSimpleBizContext = H5PayUtil.buildSimpleBizContext("sc", MspGlobalDefine.H5_TO_NATIVE);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("url", trim);
                jSONObject2.put("bizcontext", buildSimpleBizContext);
                return String.format("new_external_info==%s", jSONObject2.toString());
            } else if (Pattern.compile("^https?://(maliprod\\.alipay\\.com|mali\\.alipay\\.com)/batch_payment\\.do\\?").matcher(trim).find()) {
                Uri parse = Uri.parse(trim);
                String queryParameter = parse.getQueryParameter("return_url");
                String queryParameter2 = parse.getQueryParameter("show_url");
                String queryParameter3 = parse.getQueryParameter("pay_order_id");
                String a2 = a(parse.getQueryParameter("trade_nos"), parse.getQueryParameter("alipay_trade_no"));
                String a3 = a(parse.getQueryParameter("payPhaseId"), parse.getQueryParameter("pay_phase_id"), parse.getQueryParameter("out_relation_id"));
                String[] strArr = new String[4];
                strArr[0] = parse.getQueryParameter("app_name");
                strArr[1] = !StringUtils.isEmpty(parse.getQueryParameter("cid")) ? "ali1688" : "";
                strArr[2] = !StringUtils.isEmpty(parse.getQueryParameter("sid")) ? "tb" : "";
                strArr[3] = !StringUtils.isEmpty(parse.getQueryParameter("s_id")) ? "tb" : "";
                String a4 = a(strArr);
                String a5 = a(parse.getQueryParameter(AlipayCallServiceActivity.ALIPAY_EXTERN_TOKEN), parse.getQueryParameter("cid"), parse.getQueryParameter("sid"), parse.getQueryParameter("s_id"));
                String a6 = a(parse.getQueryParameter("appenv"));
                if (!StringUtils.isEmpty(a2) && !StringUtils.isEmpty(a4) && !StringUtils.isEmpty(a5)) {
                    String format = String.format("trade_no=\"%s\"&pay_phase_id=\"%s\"&biz_type=\"trade\"&biz_sub_type=\"TRADE\"&app_name=\"%s\"&extern_token=\"%s\"&appenv=\"%s\"&pay_channel_id=\"alipay_sdk\"&bizcontext=\"%s\"", a2, a3, a4, a5, a6, new BizContext(this.c).buildSimpleBizContext("sc", MspGlobalDefine.H5_TO_NATIVE));
                    TaobaoModel taobaoModel2 = new TaobaoModel();
                    taobaoModel2.setReturnUrl(queryParameter);
                    taobaoModel2.setShowUrl(queryParameter2);
                    taobaoModel2.setPayOrderId(queryParameter3);
                    taobaoModel2.setTradeNo(a2);
                    this.e = taobaoModel2;
                    return format;
                }
            }
        }
        return "";
    }

    private static final String a(String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a51c09c9", new Object[]{strArr});
        }
        if (strArr == null) {
            return "";
        }
        for (String str : strArr) {
            if (!StringUtils.isEmpty(str)) {
                return str;
            }
        }
        return "";
    }

    public static /* synthetic */ void a(H5PayInterceptor h5PayInterceptor, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15747c21", new Object[]{h5PayInterceptor, str, str2, str3});
            return;
        }
        LogUtil.record(1, f4346a, "h5Pay : " + str + " " + str2 + " " + str3);
        H5PayResultModel h5PayResultModel = new H5PayResultModel();
        try {
            String[] split = str3.split(";");
            HashMap hashMap = new HashMap();
            hashMap.put("resultStatus", str);
            hashMap.put("result", str3);
            hashMap.put("memo", str2);
            for (String str4 : split) {
                int indexOf = str4.indexOf("={");
                if (indexOf >= 0) {
                    String substring = str4.substring(0, indexOf);
                    hashMap.put(substring, H5PayUtil.getValue(str4, substring));
                }
            }
            if (hashMap.containsKey("resultStatus")) {
                h5PayResultModel.setResultCode((String) hashMap.get("resultStatus"));
            }
            boolean equals = "9000".equals(hashMap.get("resultStatus"));
            String str5 = (String) hashMap.get("result");
            TaobaoModel taobaoModel = h5PayInterceptor.e;
            String[] strArr = new String[2];
            String str6 = "";
            strArr[0] = taobaoModel != null ? taobaoModel.getPayOrderId() : str6;
            strArr[1] = taobaoModel != null ? taobaoModel.getTradeNo() : str6;
            a(strArr);
            if (hashMap.containsKey("callBackUrl")) {
                str6 = (String) hashMap.get("callBackUrl");
            } else {
                if (str5.length() > 15) {
                    String a2 = a(H5PayUtil.subString("&callBackUrl=\"", "\"", str5), H5PayUtil.subString("&call_back_url=\"", "\"", str5), H5PayUtil.subString("&return_url=\"", "\"", str5), URLDecoder.decode(H5PayUtil.subString("&return_url=", "&", str5), "utf-8"), URLDecoder.decode(H5PayUtil.subString("&callBackUrl=", "&", str5), "utf-8"), H5PayUtil.subString("call_back_url=\"", "\"", str5));
                    if (!StringUtils.isEmpty(a2)) {
                        str6 = a2;
                    }
                }
                if (taobaoModel != null) {
                    String returnUrl = equals ? taobaoModel.getReturnUrl() : taobaoModel.getShowUrl();
                    if (!StringUtils.isEmpty(returnUrl)) {
                        str6 = returnUrl;
                    }
                }
                if (taobaoModel != null) {
                    str6 = H5PayUtil.TAOBAO_BACK_URL;
                }
            }
            h5PayResultModel.setReturnUrl(str6);
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
        }
        h5PayInterceptor.d.onPayResult(h5PayResultModel);
    }
}
