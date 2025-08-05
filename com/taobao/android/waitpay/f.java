package com.taobao.android.waitpay;

import com.alibaba.android.aura.AURAAliBuyCorePluginCenter;
import com.alibaba.android.aura.AURATaobaoPurchasePluginCenter;
import com.alibaba.android.aura.AURATaobaoWaitPayDetailPluginCenter;
import com.alibaba.android.aura.IAURAPluginCenter;
import com.alibaba.android.aura.datamodel.nextrpc.AURANextRPCEndpoint;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes6.dex */
public class f {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final e f15830a;

    static {
        kge.a(-93592229);
    }

    public f(e eVar) {
        this.f15830a = eVar;
    }

    public AURANextRPCEndpoint a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AURANextRPCEndpoint) ipChange.ipc$dispatch("3f200d1", new Object[]{this}) : new AURANextRPCEndpoint.a().a("mtop.taobao.order.waitpaydetail.build").b("1.0").c(true).b(true).a(true).b(this.f15830a.a()).e("UNIT_TRADE").a();
    }

    public AURANextRPCEndpoint b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AURANextRPCEndpoint) ipChange.ipc$dispatch("a05ffd30", new Object[]{this}) : new AURANextRPCEndpoint.a().a("mtop.taobao.order.waitpaydetail.adjust").b("1.0").c(true).b(true).a(true).b(this.f15830a.b()).e("UNIT_TRADE").a();
    }

    public AURANextRPCEndpoint c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AURANextRPCEndpoint) ipChange.ipc$dispatch("3ccdf98f", new Object[]{this}) : new AURANextRPCEndpoint.a().a("mtop.taobao.order.waitpaydetail.modify").b("1.0").c(true).b(true).a(true).b(this.f15830a.c()).e("UNIT_TRADE").a();
    }

    public IAURAPluginCenter[] d() {
        try {
            return new IAURAPluginCenter[]{new AURAAliBuyCorePluginCenter(), new AURATaobaoWaitPayDetailPluginCenter(), new AURATaobaoPurchasePluginCenter(), (IAURAPluginCenter) Class.forName("com.alibaba.android.aura.AURAAdamAndroidPluginCenter").newInstance()};
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }
}
