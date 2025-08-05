package com.taobao.android.launcher.bootstrap.tao.biz.nav;

import android.content.Intent;
import android.os.Looper;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.launcher.bootstrap.tao.ScheduleComposer;
import com.taobao.android.launcher.bootstrap.tao.h;
import com.taobao.android.nav.d;
import com.taobao.android.nav.e;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes5.dex */
public class a implements e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final AtomicBoolean f13077a = new AtomicBoolean(false);
    private static ScheduleComposer b = null;

    @Override // com.taobao.android.nav.e
    public String name() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aa84494e", new Object[]{this}) : "ColdStartNavigation";
    }

    public static void a(ScheduleComposer scheduleComposer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e9ebc16", new Object[]{scheduleComposer});
        } else {
            b = scheduleComposer;
        }
    }

    @Override // com.taobao.android.nav.e
    public boolean process(Intent intent, d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("873c91c1", new Object[]{this, intent, dVar})).booleanValue();
        }
        if (b == null) {
            h.b("ColdStartNavigation", "something went wrong, the schedule composer is null");
            return true;
        } else if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
            h.b("ColdStartNavigation", "something went wrong, the navigation is scheduled on wrong thread, it should be main");
            return true;
        } else if (intent.getBooleanExtra("fullyNewInstall", false)) {
            h.b("ColdStartNavigation", "fullyNewInstall is true, skip cold start navigation");
            return true;
        } else {
            if (f13077a.compareAndSet(false, true)) {
                b.a("ColdStartNavigation");
            }
            return true;
        }
    }

    @Override // com.taobao.android.nav.e
    public boolean skip() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("7fce928a", new Object[]{this})).booleanValue() : f13077a.get();
    }
}
