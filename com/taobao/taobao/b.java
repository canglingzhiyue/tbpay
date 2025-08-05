package com.taobao.taobao;

import android.app.Activity;
import android.os.SystemClock;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.internal.PayRequest;
import com.taobao.taobao.internal.helper.d;
import java.util.Map;
import tb.jqg;

/* loaded from: classes8.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private boolean f21209a = true;
    private long b;

    public void a(Activity activity, Map<String, String> map, com.taobao.taobao.internal.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb83b9bc", new Object[]{this, activity, map, bVar});
            return;
        }
        PayRequest payRequest = new PayRequest();
        payRequest.setExtAttrMap(map);
        payRequest.setActionParams(map.get("signStr"));
        payRequest.setOrderIds(a(map));
        payRequest.setSuccessUrl(map.get("backURL"));
        payRequest.setUnSuccessUrl(map.get("unSuccessUrl"));
        payRequest.setNextAction(PayRequest.CALL_WEIXIN_SDK);
        a(activity, payRequest, bVar);
    }

    private String a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1a4c023", new Object[]{this, map});
        }
        String str = map.get("orderids");
        return TextUtils.isEmpty(str) ? map.get("orderIds") : str;
    }

    public void a(Activity activity, PayRequest payRequest, com.taobao.taobao.internal.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14c0340d", new Object[]{this, activity, payRequest, bVar});
        } else if (a()) {
        } else {
            com.taobao.taobao.utils.b.a("enterCashDesk", 0);
            d.a(activity);
            if (payRequest.isCallWXSDK()) {
                c(activity, payRequest, bVar);
            } else {
                b(activity, payRequest, bVar);
            }
        }
    }

    private boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        if (!this.f21209a) {
            return false;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime - this.b < 2000) {
            jqg.b("CashDeskPayTask", "操作太频繁，限制操作2000ms, 上次执行时间：" + this.b + " 当前执行时间：" + elapsedRealtime);
            return true;
        }
        jqg.b("CashDeskPayTask", "操作间隔大于2000ms, 上次执行时间：" + this.b + " 当前执行时间：" + elapsedRealtime);
        this.b = elapsedRealtime;
        return false;
    }

    public void b(Activity activity, PayRequest payRequest, com.taobao.taobao.internal.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f541fbec", new Object[]{this, activity, payRequest, bVar});
            return;
        }
        jqg.b("CashDeskPayTask", "doAliPay");
        new com.taobao.taobao.alipayapi.a(activity).a(new a(activity, payRequest, bVar)).a(payRequest);
    }

    public void c(Activity activity, PayRequest payRequest, com.taobao.taobao.internal.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5c3c3cb", new Object[]{this, activity, payRequest, bVar});
            return;
        }
        jqg.b("CashDeskPayTask", "doWxPay");
        com.taobao.taobao.utils.b.a("wxPay", 4);
        com.taobao.taobao.wxapi.b.a(activity);
        com.taobao.taobao.wxapi.b.a().a(new a(activity, payRequest, bVar)).a(payRequest);
    }
}
