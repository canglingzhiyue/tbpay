package com.taobao.monitor.impl.data.battery;

import android.content.Context;
import com.alipay.security.mobile.module.http.constant.RpcConfigureConstant;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.monitor.impl.common.d;
import com.taobao.monitor.impl.common.e;
import com.taobao.monitor.impl.trace.ApplicationBackgroundChangedDispatcher;
import com.taobao.monitor.impl.trace.f;
import com.taobao.monitor.impl.trace.m;
import tb.mnd;

/* loaded from: classes7.dex */
public class a implements ApplicationBackgroundChangedDispatcher.a, Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    private static boolean f18159a = false;
    private static BatteryInfoReceiver b;
    private final c c = new c(false, "BgFgRecord");
    private final c d = new c(false, "BgTickRecord");
    private int e = RpcConfigureConstant.STATIC_DATA_UPDATE_TIMEOUT;

    public static void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{context});
        } else if (f18159a || context == null || !d.V || mnd.c) {
        } else {
            f18159a = true;
            BatteryInfoReceiver batteryInfoReceiver = new BatteryInfoReceiver(context);
            b = batteryInfoReceiver;
            batteryInfoReceiver.a();
            m a2 = f.a(com.taobao.monitor.impl.common.a.APPLICATION_BACKGROUND_CHANGED_DISPATCHER);
            if (!(a2 instanceof ApplicationBackgroundChangedDispatcher)) {
                return;
            }
            ((ApplicationBackgroundChangedDispatcher) a2).a((ApplicationBackgroundChangedDispatcher) new a());
        }
    }

    @Override // com.taobao.monitor.impl.trace.ApplicationBackgroundChangedDispatcher.a
    public void a(int i, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c115689", new Object[]{this, new Integer(i), new Long(j)});
            return;
        }
        if (d.V) {
            this.c.a(i == 0 ? "bg" : "fg");
        }
        if (d.V && i == 1) {
            this.d.a();
            a();
            return;
        }
        e.a().d().removeCallbacks(this);
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        this.d.a("bg");
        a();
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            e.a().d().postDelayed(this, this.e);
        }
    }
}
