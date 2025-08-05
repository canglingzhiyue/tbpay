package com.taobao.infoflow.core.subservice.biz.loopstartstopservice.impl.appdetector;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.subservice.biz.IMainFeedsLoopStartStopService;
import java.lang.ref.WeakReference;
import tb.kge;

/* loaded from: classes.dex */
public class ScreenOnOffReceiver extends BroadcastReceiver {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final WeakReference<IMainFeedsLoopStartStopService.a> f17384a;
    private boolean b = true;

    static {
        kge.a(1428599184);
    }

    public ScreenOnOffReceiver(IMainFeedsLoopStartStopService.a aVar) {
        this.f17384a = new WeakReference<>(aVar);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            return;
        }
        IMainFeedsLoopStartStopService.a aVar = this.f17384a.get();
        if (aVar == null) {
            return;
        }
        String action = intent.getAction();
        if ("android.intent.action.SCREEN_OFF".equals(action)) {
            this.b = false;
            aVar.b(IMainFeedsLoopStartStopService.a.APP_SWITCH);
        } else if (!"android.intent.action.USER_PRESENT".equals(action)) {
        } else {
            this.b = true;
            aVar.a(IMainFeedsLoopStartStopService.a.APP_SWITCH);
        }
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : this.b;
    }
}
