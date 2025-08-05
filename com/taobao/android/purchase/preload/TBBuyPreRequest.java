package com.taobao.android.purchase.preload;

import android.content.Context;
import android.content.Intent;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.buy.toggle.AliBuyPerfSwitcher;
import com.taobao.android.lightbuy.performance.LightBuyStage;
import com.taobao.android.purchase.aura.helper.c;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;
import java.util.Map;
import tb.arc;
import tb.ase;
import tb.ask;
import tb.duk;
import tb.duq;
import tb.kge;
import tb.sqz;

/* loaded from: classes6.dex */
public class TBBuyPreRequest {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static boolean f14760a;

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes6.dex */
    public @interface PreRequestState {
        public static final int BUSY = 2;
        public static final int IDLE = 1;
    }

    static {
        kge.a(138583427);
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
        } else {
            f14760a = false;
        }
    }

    public static void a(Context context, Intent intent, boolean z) {
        IpChange ipChange = $ipChange;
        boolean z2 = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f706a57", new Object[]{context, intent, new Boolean(z)});
        } else if (f14760a) {
            arc.a().a("预请求已经发送，不用重复", arc.a.a().a("AURA/performance").b());
        } else {
            arc.a().a("开始预请求", arc.a.a().a("AURA/performance").a("time", System.currentTimeMillis()).b());
            f14760a = true;
            sqz.a();
            Map<String, String> f = c.f(context);
            com.taobao.android.lightbuy.performance.a.a().a(LightBuyStage.MTOP_REQ_START);
            boolean z3 = z && (AliBuyPerfSwitcher.enableStreamResponse() || AliBuyPerfSwitcher.enablePopupWindowStreamResponse());
            if (!AliBuyPerfSwitcher.enableThreadPerf() && !z3) {
                z2 = false;
            }
            AliBuyPerfSwitcher.updatePerfSwitch("enablePopupWindowStreamResponse", z3);
            AliBuyPerfSwitcher.updatePerfSwitch("enableThreadPerf", z2);
            new duq.a(context, intent).a(f).a(z2).b(z3).a(new ask.c(new ase.a[0]) { // from class: com.taobao.android.purchase.preload.TBBuyPreRequest.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.ask.c, tb.ase.a
                public <T extends com.alibaba.android.aura.datamodel.nextrpc.a> void a(T t, List<com.alibaba.android.aura.datamodel.nextrpc.a> list) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7c1e0bbf", new Object[]{this, t, list});
                    } else {
                        sqz.a(true);
                    }
                }
            }).a().a(duk.KEY_SERVICE_NAME);
        }
    }

    public static void a(Context context, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c9cc1d", new Object[]{context, intent});
            return;
        }
        arc.a().a("开始预请求V2", arc.a.a().a("AURA/performance").a("time", System.currentTimeMillis()).b());
        new duq.a(context, intent).a(c.f(context)).a().b(duk.KEY_SERVICE_NAME);
    }
}
