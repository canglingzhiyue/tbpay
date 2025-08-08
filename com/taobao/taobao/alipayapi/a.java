package com.taobao.taobao.alipayapi;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.support.v4.content.LocalBroadcastManager;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.constants.MspGlobalDefine;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.login4android.api.Login;
import com.taobao.tao.alipay.export.CashdeskConstants;
import com.taobao.tao.alipay.export.PayPasswrdValidateBridge;
import com.taobao.taobao.internal.PayRequest;
import com.taobao.taobao.internal.PayResultInfo;
import com.taobao.taobao.internal.b;
import com.taobao.taobao.internal.helper.d;
import com.taobao.taobao.utils.CashDeskLog;
import java.util.HashMap;
import java.util.Map;
import tb.tdx;

/* loaded from: classes8.dex */
public class a implements com.taobao.taobao.internal.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private PayRequest f21208a;
    private b b;
    private HashMap<String, String> c;
    private final Activity d;
    private tdx e;

    public static /* synthetic */ void a(a aVar, PayResultInfo payResultInfo, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7be5720", new Object[]{aVar, payResultInfo, map});
        } else {
            aVar.a(payResultInfo, map);
        }
    }

    public static /* synthetic */ void a(a aVar, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75c958f9", new Object[]{aVar, str, str2});
        } else {
            aVar.a(str, str2);
        }
    }

    public a(Activity activity) {
        this.d = activity;
    }

    public com.taobao.taobao.internal.a a(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.taobao.internal.a) ipChange.ipc$dispatch("cac5002f", new Object[]{this, bVar});
        }
        this.b = bVar;
        return this;
    }

    @Override // com.taobao.taobao.internal.a
    public void a(PayRequest payRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d94aa2e", new Object[]{this, payRequest});
            return;
        }
        this.f21208a = payRequest;
        if (this.c == null) {
            return;
        }
        this.e = new tdx(this.d, PayRequest.CALL_ALIPAY_SDK);
        this.e.a(this.c);
        b(this.c);
    }

    private void b(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41e3e87c", new Object[]{this, map});
        } else if (c(map)) {
            d(map);
        } else if (i(map)) {
            e(map);
        } else if (k(map)) {
            h(map);
        } else {
            a(this.b, "4000", "", "无效的支付方式");
        }
    }

    public void a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
            return;
        }
        if (n(map)) {
            this.d.setResult(-1);
        }
        this.d.finish();
    }

    private boolean c(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("2985bedf", new Object[]{this, map})).booleanValue() : "true".equals(map.get(CashdeskConstants.VALIDATE_ARGS));
    }

    private void d(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1127953a", new Object[]{this, map});
            return;
        }
        Intent f = f(map);
        f.setPackage(this.d.getPackageName());
        f.setAction(CashdeskConstants.ALIPAY_ACTION);
        String a2 = a(this.d.getIntent().getData(), j(map));
        if (!StringUtils.isEmpty(a2)) {
            f.putExtra(CashdeskConstants.ALIPAY_SIGN_STR, a2);
        }
        a(f, map);
    }

    private void e(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8c96b99", new Object[]{this, map});
            return;
        }
        Intent f = f(map);
        String str = map.get("signStr");
        if (str == null) {
            str = "";
        }
        f.putExtra(CashdeskConstants.ALIPAY_SIGN_STR, str);
        f.putExtra("create_live_connection", true);
        f.putExtra("msp_pre_load", true);
        f.putExtra("callback_url", "http://tm.m.taobao.com/list.htm?OrderListType=total_orders");
        a(f, map);
    }

    private Intent f(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Intent) ipChange.ipc$dispatch("b1bac41b", new Object[]{this, map});
        }
        Intent intent = new Intent();
        intent.setPackage(this.d.getPackageName());
        intent.setAction(CashdeskConstants.ALIPAY_ACTION);
        intent.putExtra("extend_params", g(map).toJSONString());
        a(intent);
        return intent;
    }

    private JSONObject g(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("4a3ca777", new Object[]{this, map});
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("user_token_type", (Object) "tbsid");
        String str = map.get("agednessVersion");
        if (!StringUtils.isEmpty(str)) {
            jSONObject.put("agednessVersion", (Object) str);
        }
        String sid = Login.getSid();
        if (!StringUtils.isEmpty(sid)) {
            jSONObject.put("user_token", (Object) sid);
        }
        return jSONObject;
    }

    private String a(Uri uri, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7a99306b", new Object[]{this, uri, new Boolean(z)});
        }
        if (uri == null) {
            return "";
        }
        if (z) {
            if (uri.getQuery() != null) {
                return uri.getQuery().replaceAll("&taobaoCheckPayPasswordAction=true", "").replaceAll("&encodeParams=true", "");
            }
        } else if (uri.getEncodedQuery() != null) {
            return uri.getEncodedQuery().replaceAll("&taobaoCheckPayPasswordAction=true", "");
        }
        return "";
    }

    private void a(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8033c25", new Object[]{this, intent});
            return;
        }
        String a2 = com.taobao.taobao.internal.helper.b.a((Context) this.d, true);
        if (StringUtils.isEmpty(a2)) {
            return;
        }
        JSONObject a3 = a(intent.getStringExtra("extend_params"), new JSONObject());
        a3.put(MspGlobalDefine.EXT_LOCAL_ONLY_THIRD_PAY, (Object) a2);
        intent.putExtra("extend_params", a3.toJSONString());
    }

    private JSONObject a(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("9490f01e", new Object[]{this, str, jSONObject});
        }
        if (StringUtils.isEmpty(str)) {
            return jSONObject;
        }
        try {
            return JSONObject.parseObject(str);
        } catch (Throwable th) {
            CashDeskLog.a("", "appendExtParams exception,reason " + th.getMessage());
            return jSONObject;
        }
    }

    private void h(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("afaeeeb6", new Object[]{this, map});
            return;
        }
        if (m(map)) {
            a((String) null, (String) null);
        } else {
            Nav.from(this.d).toUri(map.get("alipayURL"));
        }
        a(map);
    }

    private boolean i(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9750c519", new Object[]{this, map})).booleanValue();
        }
        String str = map.get("simplepay");
        return "1".equals(str) || "true".equals(str);
    }

    private boolean j(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("7ef29b78", new Object[]{this, map})).booleanValue() : "true".equals(map.get(CashdeskConstants.ENCODE_PARAMS));
    }

    private boolean k(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("669471d7", new Object[]{this, map})).booleanValue() : !StringUtils.isEmpty(map.get("alipayURL"));
    }

    private void a(Intent intent, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c40430c0", new Object[]{this, intent, map});
            return;
        }
        this.e.a();
        l(map);
        this.d.startActivity(intent);
    }

    private void l(final Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e364832", new Object[]{this, map});
            return;
        }
        final LocalBroadcastManager localBroadcastManager = LocalBroadcastManager.getInstance(this.d);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.alipay.android.app.pay.ACTION_PAY_SUCCESS");
        intentFilter.addAction("com.alipay.android.app.pay.ACTION_PAY_FAILED");
        localBroadcastManager.registerReceiver(new BroadcastReceiver() { // from class: com.taobao.taobao.alipayapi.Alipay$1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                    return;
                }
                localBroadcastManager.unregisterReceiver(this);
                a.this.a(map);
                PayResultInfo payResultInfo = new PayResultInfo(intent);
                a aVar = a.this;
                d.a(a.$ipChange, intent.getAction(), payResultInfo.alipayResult);
                a aVar2 = a.this;
                Map map2 = map;
                if (a.$ipChange) {
                    a.a(a.this, intent.getAction(), payResultInfo.alipayResult);
                    return;
                }
                com.taobao.taobao.utils.b.b(payResultInfo.resultStatus, payResultInfo.alipayResult);
                if (PayPasswrdValidateBridge.wvCallBack != null) {
                    PayPasswrdValidateBridge.handleAlipayResult(payResultInfo.resultStatus, payResultInfo.memo, payResultInfo.openTime, payResultInfo.resultString, payResultInfo.extendInfoStr);
                } else {
                    a.a(a.this, payResultInfo, map);
                }
            }
        }, intentFilter);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0058, code lost:
        if (r4.equals("9000") == false) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void a(com.taobao.taobao.internal.PayResultInfo r10, java.util.Map<java.lang.String, java.lang.String> r11) {
        /*
            r9 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.taobao.alipayapi.a.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L18
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r2] = r9
            r1[r3] = r10
            r10 = 2
            r1[r10] = r11
            java.lang.String r10 = "7567227d"
            r0.ipc$dispatch(r10, r1)
            return
        L18:
            java.lang.String r0 = "from"
            java.lang.Object r0 = r11.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            r10.from = r0
            java.lang.String r0 = "orderids"
            r11.get(r0)
            java.lang.String r0 = "backURL"
            java.lang.Object r0 = r11.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r1 = "unSuccessUrl"
            r11.get(r1)
            java.lang.String r1 = "alipayBlock"
            java.lang.Object r1 = r11.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r4 = r10.resultStatus
            r5 = -1
            int r6 = r4.hashCode()
            r7 = 1656379(0x19463b, float:2.321081E-39)
            java.lang.String r8 = "6001"
            if (r6 == r7) goto L5b
            r7 = 1745751(0x1aa357, float:2.446318E-39)
            if (r6 == r7) goto L52
            goto L63
        L52:
            java.lang.String r6 = "9000"
            boolean r4 = r4.equals(r6)
            if (r4 == 0) goto L63
            goto L64
        L5b:
            boolean r2 = r4.equals(r8)
            if (r2 == 0) goto L63
            r2 = 1
            goto L64
        L63:
            r2 = -1
        L64:
            if (r2 == 0) goto L78
            if (r2 == r3) goto Lf3
            java.lang.String r10 = r10.resultStatus
            boolean r10 = r8.equals(r10)
            if (r10 != 0) goto Lf3
            java.lang.String r10 = "signStr"
            r11.get(r10)
            goto Lf3
        L78:
            java.lang.String r11 = r10.resultString
            com.alibaba.fastjson.JSONObject r11 = com.alibaba.fastjson.JSONObject.parseObject(r11)
            java.lang.String r2 = "isJumpUrl"
            boolean r3 = r11.containsKey(r2)
            if (r3 == 0) goto L94
            java.lang.Object r11 = r11.get(r2)
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 != 0) goto L94
            return
        L94:
            boolean r11 = r10.isShareMsmType()
            if (r11 == 0) goto Lf3
            android.net.Uri r11 = android.net.Uri.parse(r0)
            android.net.Uri$Builder r0 = r11.buildUpon()
            java.lang.String r11 = r11.getPath()
            java.lang.String r2 = ""
            if (r11 == 0) goto Lb0
            int r11 = r11.length()
            if (r11 != 0) goto Lb3
        Lb0:
            r0.appendPath(r2)
        Lb3:
            com.taobao.taobao.internal.PayResultInfo$SharePayData r11 = r10.sharePayData
            java.lang.String r11 = r11.payurl
            java.lang.String r11 = android.net.Uri.encode(r11)
            java.lang.String r3 = "payurl"
            r0.appendQueryParameter(r3, r11)
            com.taobao.taobao.internal.PayResultInfo$SharePayData r11 = r10.sharePayData
            java.lang.String r11 = r11.amount
            boolean r11 = android.text.StringUtils.isEmpty(r11)
            if (r11 != 0) goto Ld8
            com.taobao.taobao.internal.PayResultInfo$SharePayData r11 = r10.sharePayData
            java.lang.String r11 = r11.amount
            java.lang.String r11 = android.net.Uri.encode(r11)
            java.lang.String r3 = "amount"
            r0.appendQueryParameter(r3, r11)
        Ld8:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            com.taobao.taobao.internal.PayResultInfo$ExtendInfo r10 = r10.extendInfo
            java.lang.Long r10 = r10.payerUserId
            r11.append(r10)
            r11.append(r2)
            java.lang.String r10 = r11.toString()
            java.lang.String r11 = "daifuUserId"
            r0.appendQueryParameter(r11, r10)
            r0.toString()
        Lf3:
            android.text.StringUtils.isEmpty(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.taobao.alipayapi.a.a(com.taobao.taobao.internal.PayResultInfo, java.util.Map):void");
    }

    private void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
            return;
        }
        LocalBroadcastManager localBroadcastManager = LocalBroadcastManager.getInstance(this.d);
        Intent intent = new Intent(CashdeskConstants.CASHDESK_BROADCAST_RESULT_ACTION);
        if (!StringUtils.isEmpty(str)) {
            intent.putExtra("action", str);
        }
        if (!StringUtils.isEmpty(str2)) {
            intent.putExtra("result", str2);
        }
        localBroadcastManager.sendBroadcast(intent);
    }

    private boolean m(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("35d81e95", new Object[]{this, map})).booleanValue();
        }
        String str = map.get("broadcast");
        return "1".equals(str) || "true".equals(str);
    }

    private boolean n(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1d79f4f4", new Object[]{this, map})).booleanValue();
        }
        String str = map.get("result");
        return "1".equals(str) || "true".equals(str);
    }

    public void a(b bVar, String str, String str2, String str3) {
        PayRequest payRequest;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3d27ff7", new Object[]{this, bVar, str, str2, str3});
        } else if (bVar == null || (payRequest = this.f21208a) == null) {
        } else {
            bVar.b(payRequest.getUnSuccessUrl(), new PayResultInfo(str2, str3, this.f21208a));
        }
    }
}
