package com.taobao.tao.alipay.cashdesk;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.content.LocalBroadcastManager;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.r;
import android.text.TextUtils;
import com.alibaba.android.split.core.splitcompat.j;
import com.alibaba.android.ultron.ext.event.util.a;
import com.alibaba.android.ultron.vfw.weex2.highPerformance.model.UltronTradeHybridStage;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.biz.substitute.SubstituteConstants;
import com.alipay.android.msp.constants.MspGlobalDefine;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.login4android.api.Login;
import com.taobao.tao.alipay.export.CashdeskConstants;
import com.taobao.tao.alipay.export.PayPasswrdValidateBridge;
import com.taobao.taobao.internal.PayRequest;
import com.taobao.taobao.utils.c;
import com.taobao.taobao.utils.d;
import com.taobao.tlog.adapter.AdapterForTLog;
import com.uc.webview.export.extension.UCCore;
import java.util.HashMap;
import java.util.Map;
import tb.quz;
import tb.qva;
import tb.tdx;

/* loaded from: classes8.dex */
public class CashDeskActivity extends Activity {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String RESULT_INTENT_KEY = "cashDeskResult";

    /* renamed from: a  reason: collision with root package name */
    private HashMap<String, String> f19832a;
    private tdx b;
    private Activity c;

    public static /* synthetic */ Object ipc$super(CashDeskActivity cashDeskActivity, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1504501726:
                super.onDestroy();
                return null;
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case 514894248:
                super.attachBaseContext((Context) objArr[0]);
                return null;
            case 1150324634:
                super.finish();
                return null;
            case 1264052993:
                super.onNewIntent((Intent) objArr[0]);
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1eb0a9a8", new Object[]{this, context});
            return;
        }
        super.attachBaseContext(context);
        j.b(context);
    }

    public static /* synthetic */ boolean a(CashDeskActivity cashDeskActivity, Intent intent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a2f49a61", new Object[]{cashDeskActivity, intent})).booleanValue() : cashDeskActivity.c(intent);
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        this.f19832a = d.a(getIntent());
        if (this.f19832a == null) {
            finish();
            return;
        }
        com.taobao.taobao.utils.b.a();
        this.c = this;
        this.b = new tdx(this, PayRequest.CALL_ALIPAY_SDK);
        this.b.a(this.f19832a);
        a();
        e(UltronTradeHybridStage.ON_CONTAINER_CREATE);
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b57eb01", new Object[]{this, intent});
            return;
        }
        super.onNewIntent(intent);
        this.f19832a = d.a(intent);
        if (this.f19832a != null) {
            return;
        }
        finish();
    }

    @Override // android.app.Activity
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        this.f19832a = null;
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        com.taobao.taobao.utils.b.a("enterCashDesk", 0);
        if (f()) {
            b();
            com.taobao.taobao.utils.b.a("aliPayValidate", 1);
        } else if (e()) {
            c();
            com.taobao.taobao.utils.b.a("simplePay", 2);
        } else if (h()) {
            d();
            com.taobao.taobao.utils.b.a("wap", 3);
        } else {
            finish();
        }
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        Intent intent = new Intent();
        intent.setPackage(getPackageName());
        intent.setAction(CashdeskConstants.ALIPAY_ACTION);
        String a2 = a(getIntent().getData());
        if (!TextUtils.isEmpty(a2)) {
            intent.putExtra(CashdeskConstants.ALIPAY_SIGN_STR, a2);
        }
        if (n()) {
            d(intent);
        } else {
            String sid = Login.getSid();
            if (!TextUtils.isEmpty(sid)) {
                intent.putExtra("extend_params", String.format("{\"user_token\": \"%s\",\"user_token_type\": \"tbsid\"}", sid));
            }
        }
        if (c.a("enableCheckSupportedThirdPay", true)) {
            a(intent);
        }
        b(intent);
    }

    private String a(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d56608a1", new Object[]{this, uri});
        }
        if (uri == null) {
            return "";
        }
        String str = this.f19832a.get("signStr");
        return !TextUtils.isEmpty(str) ? str : g() ? uri.getQuery() != null ? uri.getQuery().replaceAll("&taobaoCheckPayPasswordAction=true", "").replaceAll("&encodeParams=true", "") : str : uri.getEncodedQuery() != null ? uri.getEncodedQuery().replaceAll("&taobaoCheckPayPasswordAction=true", "") : str;
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        String str = this.f19832a.get("signStr");
        Intent intent = new Intent();
        intent.setPackage(getPackageName());
        intent.setAction(CashdeskConstants.ALIPAY_ACTION);
        intent.putExtra(CashdeskConstants.ALIPAY_SIGN_STR, str == null ? "" : str);
        if (n()) {
            d(intent);
        } else {
            String sid = Login.getSid();
            if (!TextUtils.isEmpty(sid)) {
                intent.putExtra("extend_params", String.format("{\"user_token\": \"%s\",\"user_token_type\": \"tbsid\"}", sid));
            }
        }
        if (c.a("enableCheckSupportedThirdPay", true)) {
            a(intent);
        }
        intent.putExtra("create_live_connection", true);
        intent.putExtra("msp_pre_load", true);
        intent.putExtra("callback_url", "http://tm.m.taobao.com/list.htm?OrderListType=total_orders");
        b(intent);
        quz.c(str);
    }

    private void a(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8033c25", new Object[]{this, intent});
            return;
        }
        String a2 = com.taobao.taobao.internal.helper.b.a((Context) this, true);
        if (TextUtils.isEmpty(a2)) {
            return;
        }
        String stringExtra = intent.getStringExtra("extend_params");
        try {
            JSONObject jSONObject = TextUtils.isEmpty(stringExtra) ? new JSONObject() : JSONObject.parseObject(stringExtra);
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            jSONObject.put(MspGlobalDefine.EXT_LOCAL_ONLY_THIRD_PAY, (Object) a2);
            intent.putExtra("extend_params", jSONObject.toJSONString());
        } catch (Throwable th) {
            AdapterForTLog.logd(quz.PAGE_NAME, "appendExtParams exception,reason " + th.getMessage());
        }
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else if (j()) {
            a((String) null, (String) null);
            finish();
        } else {
            String str = this.f19832a.get("alipayURL");
            Nav.from(this).toUri(str);
            finish();
            quz.b(str);
        }
    }

    private boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue();
        }
        String str = this.f19832a.get("simplepay");
        return "1".equals(str) || "true".equals(str);
    }

    private boolean f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[]{this})).booleanValue() : "true".equals(this.f19832a.get(CashdeskConstants.VALIDATE_ARGS));
    }

    private boolean g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[]{this})).booleanValue() : "true".equals(this.f19832a.get(CashdeskConstants.ENCODE_PARAMS));
    }

    private boolean h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5cf10f3", new Object[]{this})).booleanValue() : !TextUtils.isEmpty(this.f19832a.get("alipayURL"));
    }

    private void b(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15320a6", new Object[]{this, intent});
            return;
        }
        this.b.a();
        i();
        startActivity(intent);
    }

    private void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
            return;
        }
        final LocalBroadcastManager localBroadcastManager = LocalBroadcastManager.getInstance(this);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.alipay.android.app.pay.ACTION_PAY_SUCCESS");
        intentFilter.addAction("com.alipay.android.app.pay.ACTION_PAY_FAILED");
        localBroadcastManager.registerReceiver(new BroadcastReceiver() { // from class: com.taobao.tao.alipay.cashdesk.CashDeskActivity.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                    return;
                }
                localBroadcastManager.unregisterReceiver(this);
                CashDeskActivity.this.finish();
                CashDeskActivity.a(CashDeskActivity.this, intent);
            }
        }, intentFilter);
    }

    private boolean c(Intent intent) {
        String action;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2aa3052b", new Object[]{this, intent})).booleanValue();
        }
        if (intent == null || (action = intent.getAction()) == null || this.f19832a == null) {
            return false;
        }
        b bVar = new b(intent);
        bVar.f = this.f19832a.get("from");
        this.b.a(bVar.d, bVar.h, bVar.f19834a);
        com.taobao.taobao.internal.helper.d.a(this, action, bVar.e);
        if (j()) {
            a(action, bVar.e);
            return true;
        }
        String str = this.f19832a.get("orderids");
        String str2 = this.f19832a.get("backURL");
        String str3 = this.f19832a.get("unSuccessUrl");
        String str4 = this.f19832a.get(a.KEY_ALIPAY_BLOCK);
        com.taobao.taobao.utils.b.b(bVar.f19834a, bVar.e);
        if (PayPasswrdValidateBridge.wvCallBack != null) {
            a(PayPasswrdValidateBridge.wvCallBack, bVar.f19834a, bVar.b, bVar.d, bVar.c, bVar.g);
            quz.d(bVar.e);
            return true;
        } else if (TextUtils.equals(action, "com.alipay.android.app.pay.ACTION_PAY_SUCCESS")) {
            quz.a();
            if ("9000".equals(bVar.f19834a) && bVar.c != null) {
                try {
                    JSONObject parseObject = JSONObject.parseObject(bVar.c);
                    if (parseObject.containsKey("isJumpUrl") && !((Boolean) parseObject.get("isJumpUrl")).booleanValue()) {
                        return true;
                    }
                    JSONObject parseObject2 = JSON.parseObject(bVar.c);
                    if (parseObject2.containsKey("biz_type") && TextUtils.equals(parseObject2.getString("biz_type"), "share_pp") && !TextUtils.isEmpty(bVar.g)) {
                        JSONObject parseObject3 = JSON.parseObject(bVar.g);
                        if (parseObject3.containsKey("sharepayData")) {
                            JSONObject parseObject4 = JSON.parseObject(parseObject3.getString("sharepayData"));
                            String string = parseObject4.getString(SubstituteConstants.KEY_SUBSTITUTE_PAY_PAYURL);
                            String string2 = parseObject4.getString("amount");
                            if (!TextUtils.isEmpty(string)) {
                                Uri parse = Uri.parse(str2);
                                Uri.Builder buildUpon = parse.buildUpon();
                                String path = parse.getPath();
                                if (path == null || path.length() == 0) {
                                    buildUpon.appendPath("");
                                }
                                buildUpon.appendQueryParameter(SubstituteConstants.KEY_SUBSTITUTE_PAY_PAYURL, Uri.encode(string));
                                if (!TextUtils.isEmpty(string2)) {
                                    buildUpon.appendQueryParameter("amount", Uri.encode(string2));
                                }
                                if (parseObject3.containsKey("payerUserId")) {
                                    buildUpon.appendQueryParameter("daifuUserId", Uri.encode(parseObject3.getString("payerUserId")));
                                }
                                str2 = buildUpon.toString();
                            }
                        }
                    }
                } catch (Exception unused) {
                }
            }
            if (TextUtils.isEmpty(str4)) {
                a(str, str2, null, true);
            }
            return true;
        } else {
            if (TextUtils.equals(action, "com.alipay.android.app.pay.ACTION_PAY_FAILED")) {
                quz.b(bVar);
                quz.a(bVar);
                if (TextUtils.isEmpty(str4)) {
                    a(str, str3, bVar, false);
                }
                if (!"6001".equals(bVar.f19834a)) {
                    quz.a(bVar, this.f19832a.get("signStr"), str3, m());
                }
            }
            quz.a(bVar.e);
            return true;
        }
    }

    public void a(WVCallBackContext wVCallBackContext, String str, String str2, String str3, String str4, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93bef969", new Object[]{this, wVCallBackContext, str, str2, str3, str4, obj});
            return;
        }
        if (wVCallBackContext != null) {
            r rVar = new r();
            rVar.a("result", str4);
            rVar.a("memo", str2);
            rVar.a(MspGlobalDefine.OPEN_TIME, str3);
            rVar.a("ResultStatus", str);
            rVar.a(MspGlobalDefine.EXTENDINFO, obj);
            wVCallBackContext.success(rVar);
        }
        if (!c.a("clearCallBack", true)) {
            return;
        }
        PayPasswrdValidateBridge.wvCallBack = null;
    }

    private String a(String str, String str2, b bVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("dca6a2b3", new Object[]{this, str, str2, bVar, new Boolean(z)});
        }
        if (!TextUtils.isEmpty(str2)) {
            Uri parse = Uri.parse(str2);
            if (bVar != null) {
                Uri.Builder buildUpon = parse.buildUpon();
                String path = parse.getPath();
                if (path == null || path.length() == 0) {
                    buildUpon.appendPath("");
                }
                buildUpon.appendQueryParameter("alipayResult", Uri.encode(bVar.e));
                str2 = buildUpon.toString();
            }
            a(str2, z);
            return str2;
        }
        String b = b(str);
        a(b, z);
        return b;
    }

    private void a(String str, boolean z) {
        IpChange ipChange = $ipChange;
        boolean z2 = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8123ece2", new Object[]{this, str, new Boolean(z)});
            return;
        }
        String d = d(str);
        if (!z || !f(d)) {
            z2 = false;
        }
        if (z2) {
            a(d);
            return;
        }
        Nav from = Nav.from(this);
        if (l()) {
            from.withFlags(67108864).withFlags(UCCore.VERIFY_POLICY_PAK_QUICK);
        } else if (m()) {
            from.withFlags(67108864);
        }
        from.toUri(c(d));
    }

    private boolean f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("669e4a7b", new Object[]{this, str})).booleanValue();
        }
        if (!c.a("enableNewFloatMode", true)) {
            return qva.a(this.f19832a);
        }
        return str.contains("isTBBuyFloatMode=true") || str.contains("99tm=true");
    }

    private void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        Map<String, String> b = qva.b(this.f19832a);
        if (b != null) {
            for (Map.Entry<String, String> entry : b.entrySet()) {
                buildUpon.appendQueryParameter(entry.getKey(), entry.getValue());
            }
        }
        String str2 = "PaySuccessPop" + System.currentTimeMillis();
        buildUpon.appendQueryParameter("paySuccessPopId", str2);
        com.taobao.taobao.internal.helper.a.a(this, "CashDeskPaySuccess", str2, buildUpon.toString());
    }

    private String b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6111438d", new Object[]{this, str});
        }
        if (str == null || str.contains(",")) {
            return CashdeskConstants.ORDER_LIST_URL;
        }
        return String.format(CashdeskConstants.ORDER_URL, str, str) + "&downgrade2native=true";
    }

    private void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
            return;
        }
        LocalBroadcastManager localBroadcastManager = LocalBroadcastManager.getInstance(this);
        Intent intent = new Intent(CashdeskConstants.CASHDESK_BROADCAST_RESULT_ACTION);
        if (!TextUtils.isEmpty(str)) {
            intent.putExtra("action", str);
        }
        if (!TextUtils.isEmpty(str2)) {
            intent.putExtra("result", str2);
        }
        localBroadcastManager.sendBroadcast(intent);
    }

    private boolean j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5eb3ff5", new Object[]{this})).booleanValue();
        }
        String str = this.f19832a.get("broadcast");
        return "1".equals(str) || "true".equals(str);
    }

    private boolean k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5f95776", new Object[]{this})).booleanValue();
        }
        HashMap<String, String> hashMap = this.f19832a;
        if (hashMap == null) {
            return false;
        }
        String str = hashMap.get("result");
        return "1".equals(str) || "true".equals(str);
    }

    private boolean l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6076ef7", new Object[]{this})).booleanValue();
        }
        String str = this.f19832a.get(CashdeskConstants.KEY_SINGLE_TOP);
        return "1".equals(str) || "true".equals(str);
    }

    private boolean m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6158678", new Object[]{this})).booleanValue();
        }
        String str = this.f19832a.get(CashdeskConstants.KEY_NEED_POP);
        return "1".equals(str) || "true".equals(str);
    }

    @Override // android.app.Activity
    public void finish() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44908f9a", new Object[]{this});
            return;
        }
        if (k()) {
            setResult(-1);
        }
        super.finish();
    }

    private boolean n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6239df9", new Object[]{this})).booleanValue();
        }
        HashMap<String, String> hashMap = this.f19832a;
        return hashMap != null && !TextUtils.isEmpty(hashMap.get("agednessVersion"));
    }

    private void d(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53f2e9a8", new Object[]{this, intent});
        } else if (intent == null || this.f19832a == null) {
        } else {
            String sid = Login.getSid();
            String str = this.f19832a.get("agednessVersion");
            if (TextUtils.isEmpty(sid)) {
                intent.putExtra("extend_params", String.format("{\"agednessVersion\":\"%s\"}", str));
            } else {
                intent.putExtra("extend_params", String.format("{\"user_token\":\"%s\",\"user_token_type\":\"tbsid\",\"agednessVersion\":\"%s\"}", sid, str));
            }
        }
    }

    private String c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b82f346c", new Object[]{this, str});
        }
        Uri.Builder appendQueryParameter = Uri.parse(str).buildUpon().appendQueryParameter("tradeHybrid", "true");
        HashMap<String, String> hashMap = this.f19832a;
        if (hashMap != null && !TextUtils.isEmpty(hashMap.get("orderids"))) {
            appendQueryParameter.appendQueryParameter("preRequestStorageKey", "paySuccessOrderId_" + this.f19832a.get("orderids"));
        }
        return appendQueryParameter.build().toString();
    }

    private String d(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f4d254b", new Object[]{this, str}) : Uri.parse(str).buildUpon().appendQueryParameter("tradeHybridStartTime", String.valueOf(System.currentTimeMillis())).build().toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00cf A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0113  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void e(java.lang.String r14) {
        /*
            Method dump skipped, instructions count: 300
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.tao.alipay.cashdesk.CashDeskActivity.e(java.lang.String):void");
    }
}
