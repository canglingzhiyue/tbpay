package com.alipay.sdk.app;

import android.app.Activity;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import com.alipay.android.msp.constants.MspGlobalDefine;
import com.alipay.android.msp.framework.statisticsv2.StatisticInfo;
import com.alipay.android.msp.framework.taskscheduler.TaskHelper;
import com.alipay.android.msp.model.H5PayUtil;
import com.alipay.android.msp.utils.EventLogUtil;
import com.alipay.sdk.app.statistic.StatisticManager;
import com.alipay.sdk.app.statistic.StatisticRecord;
import com.alipay.sdk.cons.GlobalConstants;
import com.alipay.sdk.sys.BizContext;
import com.alipay.sdk.util.H5PayResultModel;
import com.alipay.sdk.util.LogUtils;
import com.alipay.sdk.util.PayHelper;
import com.alipay.sdk.util.ResultUtil;
import com.alipay.sdk.util.Utils;
import com.alipay.sdk.widget.JumpLoading;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.alipay.callservice.AlipayCallServiceActivity;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;
import org.json.JSONObject;
import tb.riy;

/* loaded from: classes3.dex */
public class PayTaskCompat {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static long h = -1;

    /* renamed from: a  reason: collision with root package name */
    private Activity f6135a;
    private StatisticInfo b;
    private final String c;
    private final String d;
    private final String e;
    private JumpLoading f;
    private final String g;
    private Map<String, TaobaoModel> i;

    public String getVersion() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("2a8fef97", new Object[]{this}) : GlobalConstants.MSP_VERSION;
    }

    public static /* synthetic */ Activity a(PayTaskCompat payTaskCompat) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Activity) ipChange.ipc$dispatch("4606be86", new Object[]{payTaskCompat}) : payTaskCompat.f6135a;
    }

    public static /* synthetic */ StatisticInfo b(PayTaskCompat payTaskCompat) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (StatisticInfo) ipChange.ipc$dispatch("89e35d99", new Object[]{payTaskCompat}) : payTaskCompat.b;
    }

    public PayTaskCompat(Activity activity) {
        this(activity, null);
    }

    public PayTaskCompat(Activity activity, StatisticInfo statisticInfo) {
        this.c = H5PayUtil.oldWap;
        this.d = H5PayUtil.oldWapTwo;
        this.e = H5PayUtil.newWap;
        this.g = "mclient.alipay.com/cashier/mobilepay.htm";
        this.i = new HashMap();
        this.f6135a = activity;
        this.b = statisticInfo;
        this.f = new JumpLoading(activity, JumpLoading.LOADING_GO_PAY);
    }

    public synchronized String pay(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("20b2c545", new Object[]{this, str, new Boolean(z)});
        }
        return a(new BizContext(this.f6135a, str, "pay", this.b), str, z);
    }

    public synchronized Map<String, String> payV2(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("b1837c94", new Object[]{this, str, new Boolean(z)});
        }
        BizContext bizContext = new BizContext(this.f6135a, str, "payV2", this.b);
        return ResultUtil.format(bizContext, a(bizContext, str, z));
    }

    public synchronized boolean payInterceptorWithUrl(String str, final boolean z, final H5PayCallback h5PayCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e19a3b04", new Object[]{this, str, new Boolean(z), h5PayCallback})).booleanValue();
        }
        final String fetchOrderInfoFromH5PayUrl = fetchOrderInfoFromH5PayUrl(str);
        if (!TextUtils.isEmpty(fetchOrderInfoFromH5PayUrl)) {
            LogUtils.i("mspl", "intercepted: ".concat(String.valueOf(fetchOrderInfoFromH5PayUrl)));
            TaskHelper.execute(new Runnable() { // from class: com.alipay.sdk.app.PayTaskCompat.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    H5PayResultModel h5Pay = PayTaskCompat.this.h5Pay(new BizContext(PayTaskCompat.a(PayTaskCompat.this), fetchOrderInfoFromH5PayUrl, "payInterceptorWithUrl", PayTaskCompat.b(PayTaskCompat.this)), fetchOrderInfoFromH5PayUrl, z);
                    LogUtils.i("mspl", "inc finished: " + h5Pay.getResultCode());
                    h5PayCallback.onPayResult(h5Pay);
                }
            });
        }
        return !TextUtils.isEmpty(fetchOrderInfoFromH5PayUrl);
    }

    public synchronized String fetchOrderInfoFromH5PayUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7891d8ef", new Object[]{this, str});
        }
        if (!TextUtils.isEmpty(str)) {
            String trim = str.trim();
            if (trim.startsWith("https://wappaygw.alipay.com/service/rest.htm") || trim.startsWith("http://wappaygw.alipay.com/service/rest.htm")) {
                String trim2 = trim.replaceFirst("(http|https)://wappaygw.alipay.com/service/rest.htm\\?", "").trim();
                if (!TextUtils.isEmpty(trim2)) {
                    String subString = Utils.subString("<request_token>", "</request_token>", Utils.convertArgs(trim2).get("req_data"));
                    BizContext bizContext = new BizContext(this.f6135a, "", "");
                    return "_input_charset=\"utf-8\"&ordertoken=\"" + subString + "\"&pay_channel_id=\"alipay_sdk\"&bizcontext=\"" + bizContext.buildSimpleBizContext("sc", MspGlobalDefine.H5_TO_NATIVE) + "\"";
                }
            }
            if (trim.startsWith("https://mclient.alipay.com/service/rest.htm") || trim.startsWith("http://mclient.alipay.com/service/rest.htm")) {
                String trim3 = trim.replaceFirst("(http|https)://mclient.alipay.com/service/rest.htm\\?", "").trim();
                if (!TextUtils.isEmpty(trim3)) {
                    String subString2 = Utils.subString("<request_token>", "</request_token>", Utils.convertArgs(trim3).get("req_data"));
                    BizContext bizContext2 = new BizContext(this.f6135a, "", "");
                    return "_input_charset=\"utf-8\"&ordertoken=\"" + subString2 + "\"&pay_channel_id=\"alipay_sdk\"&bizcontext=\"" + bizContext2.buildSimpleBizContext("sc", MspGlobalDefine.H5_TO_NATIVE) + "\"";
                }
            }
            if ((trim.startsWith("https://mclient.alipay.com/home/exterfaceAssign.htm") || trim.startsWith("http://mclient.alipay.com/home/exterfaceAssign.htm")) && ((trim.contains("alipay.wap.create.direct.pay.by.user") || trim.contains("create_forex_trade_wap")) && !TextUtils.isEmpty(trim.replaceFirst("(http|https)://mclient.alipay.com/home/exterfaceAssign.htm\\?", "").trim()))) {
                BizContext bizContext3 = new BizContext(this.f6135a, "", "");
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("url", str);
                jSONObject.put("bizcontext", bizContext3.buildSimpleBizContext("sc", MspGlobalDefine.H5_TO_NATIVE));
                return "new_external_info==" + jSONObject.toString();
            }
            if (Pattern.compile("^(http|https)://(maliprod\\.alipay\\.com/w/trade_pay\\.do.?|mali\\.alipay\\.com/w/trade_pay\\.do.?|mclient\\.alipay\\.com/w/trade_pay\\.do.?)").matcher(str).find()) {
                String subString3 = Utils.subString("?", "", str);
                if (!TextUtils.isEmpty(subString3)) {
                    Map<String, String> convertArgs = Utils.convertArgs(subString3);
                    StringBuilder sb = new StringBuilder();
                    if (a(false, true, "trade_no", sb, convertArgs, "trade_no", "alipay_trade_no")) {
                        a(true, false, "pay_phase_id", sb, convertArgs, "payPhaseId", "pay_phase_id", "out_relation_id");
                        sb.append("&biz_sub_type=\"TRADE\"");
                        sb.append("&biz_type=\"trade\"");
                        String str2 = convertArgs.get("app_name");
                        if (TextUtils.isEmpty(str2) && !TextUtils.isEmpty(convertArgs.get("cid"))) {
                            str2 = "ali1688";
                        } else if (TextUtils.isEmpty(str2) && (!TextUtils.isEmpty(convertArgs.get("sid")) || !TextUtils.isEmpty(convertArgs.get("s_id")))) {
                            str2 = "tb";
                        }
                        sb.append("&app_name=\"" + str2 + "\"");
                        if (!a(true, true, AlipayCallServiceActivity.ALIPAY_EXTERN_TOKEN, sb, convertArgs, AlipayCallServiceActivity.ALIPAY_EXTERN_TOKEN, "cid", "sid", "s_id")) {
                            return "";
                        }
                        a(true, false, "appenv", sb, convertArgs, "appenv");
                        sb.append("&pay_channel_id=\"alipay_sdk\"");
                        TaobaoModel taobaoModel = new TaobaoModel();
                        taobaoModel.setReturnUrl(convertArgs.get("return_url"));
                        taobaoModel.setShowUrl(convertArgs.get("show_url"));
                        taobaoModel.setPayOrderId(convertArgs.get("pay_order_id"));
                        BizContext bizContext4 = new BizContext(this.f6135a, "", "");
                        String str3 = sb.toString() + "&bizcontext=\"" + bizContext4.buildSimpleBizContext("sc", MspGlobalDefine.H5_TO_NATIVE) + "\"";
                        this.i.put(str3, taobaoModel);
                        return str3;
                    }
                }
            }
            if (!trim.startsWith("https://mclient.alipay.com/cashier/mobilepay.htm") && !trim.startsWith("http://mclient.alipay.com/cashier/mobilepay.htm")) {
                if (Pattern.compile("^https?://(maliprod\\.alipay\\.com|mali\\.alipay\\.com)/batch_payment\\.do\\?").matcher(trim).find()) {
                    Uri parse = Uri.parse(trim);
                    String queryParameter = parse.getQueryParameter("return_url");
                    String queryParameter2 = parse.getQueryParameter("show_url");
                    String queryParameter3 = parse.getQueryParameter("pay_order_id");
                    String a2 = a(parse.getQueryParameter("trade_nos"), parse.getQueryParameter("alipay_trade_no"));
                    String a3 = a(parse.getQueryParameter("payPhaseId"), parse.getQueryParameter("pay_phase_id"), parse.getQueryParameter("out_relation_id"));
                    String[] strArr = new String[4];
                    strArr[0] = parse.getQueryParameter("app_name");
                    strArr[1] = !TextUtils.isEmpty(parse.getQueryParameter("cid")) ? "ali1688" : "";
                    strArr[2] = !TextUtils.isEmpty(parse.getQueryParameter("sid")) ? "tb" : "";
                    strArr[3] = !TextUtils.isEmpty(parse.getQueryParameter("s_id")) ? "tb" : "";
                    String a4 = a(strArr);
                    String a5 = a(parse.getQueryParameter(AlipayCallServiceActivity.ALIPAY_EXTERN_TOKEN), parse.getQueryParameter("cid"), parse.getQueryParameter("sid"), parse.getQueryParameter("s_id"));
                    String a6 = a(parse.getQueryParameter("appenv"));
                    if (!TextUtils.isEmpty(a2) && !TextUtils.isEmpty(a4) && !TextUtils.isEmpty(a5)) {
                        String format = String.format("trade_no=\"%s\"&pay_phase_id=\"%s\"&biz_type=\"trade\"&biz_sub_type=\"TRADE\"&app_name=\"%s\"&extern_token=\"%s\"&appenv=\"%s\"&pay_channel_id=\"alipay_sdk\"&bizcontext=\"%s\"", a2, a3, a4, a5, a6, new BizContext(this.f6135a, "", "").buildSimpleBizContext("sc", MspGlobalDefine.H5_TO_NATIVE));
                        TaobaoModel taobaoModel2 = new TaobaoModel();
                        taobaoModel2.setReturnUrl(queryParameter);
                        taobaoModel2.setShowUrl(queryParameter2);
                        taobaoModel2.setPayOrderId(queryParameter3);
                        taobaoModel2.setTradeNo(a2);
                        this.i.put(format, taobaoModel2);
                        return format;
                    }
                }
            }
            String buildSimpleBizContext = new BizContext(this.f6135a, "", "").buildSimpleBizContext("sc", MspGlobalDefine.H5_TO_NATIVE);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("url", trim);
            jSONObject2.put("bizcontext", buildSimpleBizContext);
            return String.format("new_external_info==%s", jSONObject2.toString());
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
            if (!TextUtils.isEmpty(str)) {
                return str;
            }
        }
        return "";
    }

    /* loaded from: classes3.dex */
    public static class TaobaoModel {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private String f6138a;
        private String b;
        private String c;
        private String d;

        private TaobaoModel() {
            this.c = "";
            this.f6138a = "";
            this.b = "";
            this.d = "";
        }

        public String getReturnUrl() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("78c16730", new Object[]{this}) : this.c;
        }

        public void setReturnUrl(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("21a93aae", new Object[]{this, str});
            } else {
                this.c = str;
            }
        }

        public String getPayOrderId() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9f9ca022", new Object[]{this}) : this.b;
        }

        public void setPayOrderId(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cae0eb94", new Object[]{this, str});
            } else {
                this.b = str;
            }
        }

        public String getShowUrl() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("30af737d", new Object[]{this}) : this.f6138a;
        }

        public void setShowUrl(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ec428501", new Object[]{this, str});
            } else {
                this.f6138a = str;
            }
        }

        public String getTradeNo() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("59e3704a", new Object[]{this}) : this.d;
        }

        public void setTradeNo(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e98e21d4", new Object[]{this, str});
            } else {
                this.d = str;
            }
        }
    }

    private static boolean a(boolean z, boolean z2, String str, StringBuilder sb, Map<String, String> map, String... strArr) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4d4312f7", new Object[]{new Boolean(z), new Boolean(z2), str, sb, map, strArr})).booleanValue();
        }
        int length = strArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                str2 = "";
                break;
            }
            String str3 = strArr[i];
            if (!TextUtils.isEmpty(map.get(str3))) {
                str2 = map.get(str3);
                break;
            }
            i++;
        }
        if (TextUtils.isEmpty(str2)) {
            if (z2) {
                return false;
            }
        } else if (z) {
            sb.append("&");
            sb.append(str);
            sb.append("=\"");
            sb.append(str2);
            sb.append("\"");
        } else {
            sb.append(str);
            sb.append("=\"");
            sb.append(str2);
            sb.append("\"");
        }
        return true;
    }

    public synchronized H5PayResultModel h5Pay(BizContext bizContext, String str, boolean z) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (H5PayResultModel) ipChange.ipc$dispatch("1a35ede", new Object[]{this, bizContext, str, new Boolean(z)});
        }
        H5PayResultModel h5PayResultModel = new H5PayResultModel();
        String[] split = a(bizContext, str, z).split(";");
        HashMap hashMap = new HashMap();
        for (String str3 : split) {
            int indexOf = str3.indexOf("={");
            if (indexOf >= 0) {
                String substring = str3.substring(0, indexOf);
                String str4 = substring + "={";
                hashMap.put(substring, str3.substring(str3.indexOf(str4) + str4.length(), str3.lastIndexOf(riy.BLOCK_END_STR)));
            }
        }
        if (hashMap.containsKey("resultStatus")) {
            h5PayResultModel.setResultCode((String) hashMap.get("resultStatus"));
        }
        boolean equals = "9000".equals(hashMap.get("resultStatus"));
        String str5 = (String) hashMap.get("result");
        TaobaoModel remove = this.i.remove(str);
        String[] strArr = new String[2];
        strArr[0] = remove != null ? remove.getPayOrderId() : "";
        strArr[1] = remove != null ? remove.getTradeNo() : "";
        a(strArr);
        if (hashMap.containsKey("callBackUrl")) {
            str2 = (String) hashMap.get("callBackUrl");
        } else {
            if (str5.length() > 15) {
                String a2 = a(Utils.subString("&callBackUrl=\"", "\"", str5), Utils.subString("&call_back_url=\"", "\"", str5), Utils.subString("&return_url=\"", "\"", str5), URLDecoder.decode(Utils.subString("&return_url=", "&", str5), "utf-8"), URLDecoder.decode(Utils.subString("&callBackUrl=", "&", str5), "utf-8"), Utils.subString("call_back_url=\"", "\"", str5));
                if (!TextUtils.isEmpty(a2)) {
                    str2 = a2;
                }
            }
            if (remove != null) {
                str2 = equals ? remove.getReturnUrl() : remove.getShowUrl();
                if (!TextUtils.isEmpty(str2)) {
                }
            }
            str2 = remove != null ? H5PayUtil.TAOBAO_BACK_URL : "";
        }
        h5PayResultModel.setReturnUrl(str2);
        if (TextUtils.isEmpty(h5PayResultModel.getReturnUrl())) {
            LogUtils.i("mspl", "biz", StatisticRecord.EC_ACQUIRE_CALLBACK_URL_EMPTY);
        }
        return h5PayResultModel;
    }

    public void showLoading() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73936486", new Object[]{this});
            return;
        }
        JumpLoading jumpLoading = this.f;
        if (jumpLoading == null) {
            return;
        }
        jumpLoading.showProgress();
    }

    public void dismissLoading() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c142d9", new Object[]{this});
            return;
        }
        JumpLoading jumpLoading = this.f;
        if (jumpLoading == null) {
            return;
        }
        jumpLoading.dismiss();
        this.f = null;
    }

    private static void a(String str, String str2, String str3, String str4) {
        String[] split;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee2b490", new Object[]{str, str2, str3, str4});
            return;
        }
        String str5 = "";
        String str6 = str5;
        for (String str7 : str.split("&")) {
            if (!TextUtils.isEmpty(str7)) {
                if (str7.startsWith("biz_type=")) {
                    str5 = str7.substring(9);
                } else if (str7.startsWith("trade_no=")) {
                    str6 = str7.substring(9);
                }
            }
        }
        EventLogUtil.logPayEvent("10101277", "result_code", str2, "biz_type", str5, "trade_no", str6, "flow_type", str3, "result_reason", str4);
    }

    private synchronized String a(BizContext bizContext, String str, boolean z) {
        boolean z2;
        String notInstalled;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("383b4765", new Object[]{this, bizContext, str, new Boolean(z)});
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime - h >= 3000) {
            h = elapsedRealtime;
            z2 = false;
        } else {
            z2 = true;
        }
        if (z2) {
            LogUtils.i("mspl", "biz", "RepPay");
            return Result.getDoubleRequest();
        }
        if (z) {
            showLoading();
        }
        if (str.contains("payment_inst=")) {
            String substring = str.substring(str.indexOf("payment_inst=") + 13);
            int indexOf = substring.indexOf(38);
            if (indexOf > 0) {
                substring = substring.substring(0, indexOf);
            }
            RegionUtils.setRegionStr(substring.replaceAll("\"", "").toLowerCase(Locale.getDefault()).replaceAll("alipay", ""));
        } else {
            RegionUtils.setRegionStr("");
        }
        if (str.contains(GlobalConstants.FROM_12306_FLAG)) {
            GlobalConstants.isFrom12306 = true;
        }
        if (GlobalConstants.isFrom12306) {
            if (str.startsWith(GlobalConstants.ONLINE_ORDER_FLAG_1)) {
                str = str.substring(str.indexOf(GlobalConstants.ONLINE_ORDER_FLAG_1) + 53);
            } else if (str.startsWith(GlobalConstants.ONLINE_ORDER_FLAG_2)) {
                str = str.substring(str.indexOf(GlobalConstants.ONLINE_ORDER_FLAG_2) + 52);
            }
        }
        LogUtils.i("mspl", "pay prepared: ".concat(String.valueOf(str)));
        String format = bizContext.format(str);
        if (Utils.isExistAnyExpectedPackage(bizContext, this.f6135a, RegionUtils.defaultItems)) {
            PayHelper payHelper = new PayHelper(this.f6135a, bizContext, new PayHelper.IAlipayBindListener() { // from class: com.alipay.sdk.app.PayTaskCompat.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.alipay.sdk.util.PayHelper.IAlipayBindListener
                public void onBinded() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("19eccb62", new Object[]{this});
                    }
                }

                @Override // com.alipay.sdk.util.PayHelper.IAlipayBindListener
                public void onStartActivity() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("1fcfb979", new Object[]{this});
                    } else {
                        PayTaskCompat.this.dismissLoading();
                    }
                }
            });
            LogUtils.i("mspl", "pay inner started: ".concat(String.valueOf(format)));
            String pay4Client = payHelper.pay4Client(format);
            LogUtils.i("mspl", "pay inner raw result: ".concat(String.valueOf(pay4Client)));
            payHelper.clearContext();
            if (!TextUtils.equals(pay4Client, "failed") && !TextUtils.equals(pay4Client, PayHelper.SCHEME_FAILED)) {
                if (!TextUtils.isEmpty(pay4Client)) {
                    Map<String, String> format2 = ResultUtil.format(bizContext, pay4Client);
                    String str3 = "";
                    if (format2 != null && format2.get("resultStatus") != null) {
                        str3 = format2.get("resultStatus");
                    }
                    a(format, str3, "1", "");
                    str2 = pay4Client;
                    LogUtils.i("mspl", "pay raw result: ".concat(String.valueOf(str2)));
                    StringBuilder sb = new StringBuilder();
                    sb.append(SystemClock.elapsedRealtime());
                    StatisticManager.putAction(bizContext, "biz", StatisticRecord.EC_PROGRESS_RETURNING, sb.toString());
                    StatisticManager.putAction(bizContext, "biz", StatisticRecord.EC_PROGRESS_RETURNING_VALUE, ResultUtil.getAttributeVal(str2, "resultStatus") + "|" + ResultUtil.getAttributeVal(str2, "memo"));
                    dismissLoading();
                    LogUtils.i("mspl", "pay returning: ".concat(String.valueOf(str2)));
                    return str2;
                }
                notInstalled = Result.getCancel();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(ResultStatus.CANCELED.getStatus());
                a(format, sb2.toString(), "1", "");
            }
            notInstalled = Result.getNotInstalled();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(ResultStatus.ALIPAY_NOT_INSTALLED.getStatus());
            a(format, sb3.toString(), "0", pay4Client);
        } else {
            StatisticManager.putAction(bizContext, "biz", StatisticRecord.EC_CHECK_LAUNCH_APP_EXIST_FALSE);
            notInstalled = Result.getNotInstalled();
            StringBuilder sb4 = new StringBuilder();
            sb4.append(ResultStatus.ALIPAY_NOT_INSTALLED.getStatus());
            a(format, sb4.toString(), "0", "not_installed");
        }
        str2 = notInstalled;
        LogUtils.i("mspl", "pay raw result: ".concat(String.valueOf(str2)));
        StringBuilder sb5 = new StringBuilder();
        sb5.append(SystemClock.elapsedRealtime());
        StatisticManager.putAction(bizContext, "biz", StatisticRecord.EC_PROGRESS_RETURNING, sb5.toString());
        StatisticManager.putAction(bizContext, "biz", StatisticRecord.EC_PROGRESS_RETURNING_VALUE, ResultUtil.getAttributeVal(str2, "resultStatus") + "|" + ResultUtil.getAttributeVal(str2, "memo"));
        dismissLoading();
        LogUtils.i("mspl", "pay returning: ".concat(String.valueOf(str2)));
        return str2;
    }
}
