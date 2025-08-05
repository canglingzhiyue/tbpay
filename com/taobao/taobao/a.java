package com.taobao.taobao;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.mobile.auth.gatewayauth.Constant;
import com.taobao.android.nav.Nav;
import com.taobao.tao.alipay.export.CashdeskConstants;
import com.taobao.tao.alipay.export.PayPasswrdValidateBridge;
import com.taobao.taobao.c;
import com.taobao.taobao.internal.PayRequest;
import com.taobao.taobao.internal.PayResultInfo;
import com.taobao.taobao.internal.helper.d;
import com.uc.webview.export.extension.UCCore;
import tb.jqg;

/* loaded from: classes8.dex */
public class a implements c.b, com.taobao.taobao.internal.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ boolean f21205a = !a.class.desiredAssertionStatus();
    private final Context b;
    private final com.taobao.taobao.internal.b c;
    private final PayRequest d;
    private c e;
    private volatile boolean f;

    public static /* synthetic */ PayRequest a(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (PayRequest) ipChange.ipc$dispatch("873a050c", new Object[]{aVar}) : aVar.d;
    }

    public static /* synthetic */ void a(a aVar, String str, PayResultInfo payResultInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a502bf0", new Object[]{aVar, str, payResultInfo});
        } else {
            aVar.d(str, payResultInfo);
        }
    }

    public static /* synthetic */ void b(a aVar, String str, PayResultInfo payResultInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ff16e8f", new Object[]{aVar, str, payResultInfo});
        } else {
            aVar.e(str, payResultInfo);
        }
    }

    public a(Context context, PayRequest payRequest, com.taobao.taobao.internal.b bVar) {
        this.b = context;
        this.d = payRequest;
        this.c = bVar;
        if (com.taobao.taobao.utils.c.a("enableQueryOrderStatus", true) && payRequest.isCallWXSDK()) {
            this.e = new c();
            this.e.a(this);
        }
        com.taobao.taobao.utils.b.b("wxPay", 0);
    }

    private String a(String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b5178ea4", new Object[]{this, str, str2}) : (!"8".equals(str2) && str != null && str.split(",").length == 1) ? String.format("http://tm.m.taobao.com/order/order_detail.htm?bizOrderId=%s&archive=0&payOrderId=%s&downgrade2native=true", str, str) : CashdeskConstants.ORDER_LIST_URL;
    }

    private String b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4204a5c3", new Object[]{this, str, str2});
        }
        if (!TextUtils.isEmpty(str)) {
            if (!f21205a && str == null) {
                throw new AssertionError();
            }
            return str;
        }
        return a(this.d.getOrderIds(), str2);
    }

    @Override // com.taobao.taobao.internal.b
    public void a(String str, PayResultInfo payResultInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa92b52", new Object[]{this, str, payResultInfo});
            return;
        }
        com.taobao.taobao.utils.b.b("payFinish", 3);
        d(str, payResultInfo);
    }

    @Override // com.taobao.taobao.internal.b
    public void b(String str, PayResultInfo payResultInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5868a353", new Object[]{this, str, payResultInfo});
            return;
        }
        com.taobao.taobao.utils.b.b("payFinish", 3);
        e(str, payResultInfo);
    }

    @Override // com.taobao.taobao.internal.b
    public void c(String str, PayResultInfo payResultInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6281b54", new Object[]{this, str, payResultInfo});
            return;
        }
        com.taobao.taobao.utils.b.b("payFinish", 3);
        f(str, payResultInfo);
    }

    @Override // com.taobao.taobao.c.b
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        c();
        com.taobao.taobao.utils.b.b("b2f", 1);
        jqg.b("CashDeskPayFinishExecutor", "B2F");
    }

    @Override // com.taobao.taobao.c.b
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        c();
        com.taobao.taobao.utils.b.b("cancel", 2);
        jqg.b("CashDeskPayFinishExecutor", "onCancelPay");
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        c cVar = this.e;
        if (cVar != null) {
            cVar.b(this);
        }
        new CashDeskPayStatusQuery(this.b).startRequest(this.d.getOrderIds(), new c.a() { // from class: com.taobao.taobao.a.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.taobao.c.a
            public void a(String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f3a64c32", new Object[]{this, str});
                    return;
                }
                a aVar = a.this;
                a.a(aVar, a.a(aVar).getSuccessUrl(), new PayResultInfo("9000", "status:0", str, a.a(a.this)));
            }

            @Override // com.taobao.taobao.c.a
            public void a(String str, String str2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
                    return;
                }
                a aVar = a.this;
                String successUrl = a.a(aVar).getSuccessUrl();
                a.b(aVar, successUrl, new PayResultInfo(Constant.CODE_GET_TOKEN_SUCCESS, "status:" + str, str2, a.a(a.this)));
            }
        });
    }

    private void d(String str, PayResultInfo payResultInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3e79355", new Object[]{this, str, payResultInfo});
            return;
        }
        com.taobao.taobao.utils.b.c(payResultInfo.memo, payResultInfo.alipayResult);
        com.taobao.taobao.internal.b bVar = this.c;
        if (bVar != null) {
            bVar.a(str, payResultInfo);
        }
        a(b(this.d.getSuccessUrl(), (String) null), payResultInfo, true);
    }

    private void e(String str, PayResultInfo payResultInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41a70b56", new Object[]{this, str, payResultInfo});
            return;
        }
        com.taobao.taobao.utils.b.c(payResultInfo.memo, payResultInfo.alipayResult);
        if ("8001".equals(payResultInfo.resultStatus)) {
            jqg.b("CashDeskPayFinishExecutor", "不支持的支付方式，不需要跳转或者前端回调");
            return;
        }
        com.taobao.taobao.internal.b bVar = this.c;
        if (bVar != null) {
            bVar.b(str, payResultInfo);
        }
        a(b(this.d.getUnSuccessUrl(), payResultInfo.memo), payResultInfo, false);
    }

    private void f(String str, PayResultInfo payResultInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f668357", new Object[]{this, str, payResultInfo});
            return;
        }
        com.taobao.taobao.utils.b.c(payResultInfo.memo, payResultInfo.alipayResult);
        com.taobao.taobao.internal.b bVar = this.c;
        if (bVar != null) {
            bVar.c(str, payResultInfo);
        }
        a(b(this.d.getUnSuccessUrl(), (String) null), payResultInfo, false);
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        c cVar = this.e;
        if (cVar == null) {
            return;
        }
        cVar.a();
    }

    private void a(String str, PayResultInfo payResultInfo, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a7cf1c2", new Object[]{this, str, payResultInfo, new Boolean(z)});
        } else if (this.f) {
            jqg.b("CashDeskPayFinishExecutor", "mHasReceiveResult true");
        } else {
            this.f = true;
            d();
            d.a(this.b, null, payResultInfo.alipayResult, z);
            if (PayPasswrdValidateBridge.wvCallBack != null) {
                PayPasswrdValidateBridge.handleAlipayResult(payResultInfo.resultStatus, payResultInfo.memo, payResultInfo.openTime, payResultInfo.resultString, null);
                jqg.b("CashDeskPayFinishExecutor", "前端自定义模式,直接返回");
                return;
            }
            a(str, z);
        }
    }

    private void a(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8123ece2", new Object[]{this, str, new Boolean(z)});
        } else if (z && d(str)) {
            c(str);
            jqg.b("CashDeskPayFinishExecutor", "浮层样式");
        } else {
            Nav from = Nav.from(this.b);
            if (this.d.isSingleTop()) {
                from.withFlags(67108864).withFlags(UCCore.VERIFY_POLICY_PAK_QUICK);
            } else if (this.d.isNeedPop()) {
                from.withFlags(67108864);
            } else if (com.taobao.taobao.utils.c.a("enableClearTop", true)) {
                from.withFlags(67108864);
            }
            from.toUri(e(str));
        }
    }

    private void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
            return;
        }
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        long currentTimeMillis = System.currentTimeMillis();
        String str2 = "PaySuccessPop" + currentTimeMillis;
        buildUpon.appendQueryParameter("paySuccessPopId", str2);
        buildUpon.appendQueryParameter("tradeHybridStartTime", String.valueOf(currentTimeMillis));
        com.taobao.taobao.internal.helper.a.a((Activity) this.b, "CashDeskPaySuccess", str2, buildUpon.toString());
    }

    private boolean d(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d23b17f9", new Object[]{this, str})).booleanValue() : str.contains("isTBBuyFloatMode=true") || str.contains("99tm=true");
    }

    private String e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("666b162a", new Object[]{this, str});
        }
        Uri.Builder appendQueryParameter = Uri.parse(str).buildUpon().appendQueryParameter("tradeHybrid", "true");
        String orderIds = this.d.getOrderIds();
        if (TextUtils.isEmpty(orderIds)) {
            appendQueryParameter.appendQueryParameter("preRequestStorageKey", "paySuccessOrderId_" + orderIds);
        }
        return appendQueryParameter.build().toString();
    }
}
