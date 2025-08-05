package com.taobao.tao.recommend3.gateway.prefetch.notify.paysuccess;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.framework.hostcontainer.pageinterface.page.FullPage;
import tb.kge;
import tb.lap;
import tb.opr;

/* loaded from: classes8.dex */
public class OrderFinishedBroadcastReceiver extends BroadcastReceiver {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ACTION_ORDER_DID_FINISHED = "tb_info_flow_preload";

    /* renamed from: a  reason: collision with root package name */
    private a f20906a;

    static {
        kge.a(154470483);
    }

    public static /* synthetic */ Object ipc$super(OrderFinishedBroadcastReceiver orderFinishedBroadcastReceiver, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            return;
        }
        if (this.f20906a == null) {
            this.f20906a = new a();
        }
        String a2 = a(intent);
        opr.b("order");
        this.f20906a.a(a2);
        lap.a("recmdPrefetch", "OrderFinishedBroadcastReceiver", "收到通知了");
    }

    private String a(Intent intent) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b1abe71b", new Object[]{this, intent});
        }
        try {
            jSONObject = JSONObject.parseObject(intent.getStringExtra("params"));
        } catch (Exception e) {
            lap.a("recmdPrefetch", "OrderFinishedBroadcastReceiver", "解析上行参数出现异常: " + e);
            jSONObject = null;
        }
        if (jSONObject == null) {
            lap.a("recmdPrefetch", "OrderFinishedBroadcastReceiver", "jsonObject == null");
            return null;
        }
        return jSONObject.getString(FullPage.PARAM_BACK2Tab2URL);
    }
}
