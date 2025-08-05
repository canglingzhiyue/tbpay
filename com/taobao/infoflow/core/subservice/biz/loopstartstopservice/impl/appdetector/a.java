package com.taobao.infoflow.core.subservice.biz.loopstartstopservice.impl.appdetector;

import android.app.Application;
import android.content.IntentFilter;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.subservice.biz.IMainFeedsLoopStartStopService;
import tb.kge;
import tb.lcz;
import tb.ldf;
import tb.lgn;

/* loaded from: classes.dex */
public class a implements lgn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private ScreenOnOffReceiver f17385a;
    private final IMainFeedsLoopStartStopService.a b;

    static {
        kge.a(-230675516);
        kge.a(1227300292);
    }

    public a(IMainFeedsLoopStartStopService.a aVar) {
        this.b = aVar;
    }

    @Override // tb.lgn
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            d();
        }
    }

    @Override // tb.lgn
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            e();
        }
    }

    @Override // tb.lgn
    public boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue();
        }
        ScreenOnOffReceiver screenOnOffReceiver = this.f17385a;
        if (screenOnOffReceiver != null) {
            return screenOnOffReceiver.a();
        }
        return true;
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        Application a2 = lcz.a();
        if (a2 == null) {
            return;
        }
        this.f17385a = new ScreenOnOffReceiver(this.b);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        a2.registerReceiver(this.f17385a, intentFilter);
    }

    private void e() {
        ScreenOnOffReceiver screenOnOffReceiver;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        Application a2 = lcz.a();
        if (a2 == null || (screenOnOffReceiver = this.f17385a) == null) {
            return;
        }
        try {
            a2.unregisterReceiver(screenOnOffReceiver);
        } catch (Throwable th) {
            ldf.a("AppLevelStartStopDetectorImpl", "unRegisterScreenReceiver error: ", th);
        }
    }
}
