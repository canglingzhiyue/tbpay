package tb;

import android.app.Application;
import android.taobao.windvane.jsbridge.e;
import android.taobao.windvane.jsbridge.q;
import com.alibaba.poplayer.utils.c;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavir.util.UtUtils;
import com.taobao.tbpoplayer.mock.WVPopLayerMock;
import com.taobao.tbpoplayer.util.TBPositionMgr;
import com.taobao.tbpoplayer.util.d;
import com.taobao.tbpoplayer.view.jsbridge.PopLayerGlobalWVPlugin;
import com.taobao.tbpoplayer.watermask.a;
import com.ut.mini.UTAnalytics;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class qnr {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final AtomicBoolean f32965a;
    private static final AtomicBoolean b;

    static {
        kge.a(-1504967129);
        f32965a = new AtomicBoolean(false);
        b = new AtomicBoolean(false);
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : b.get();
    }

    public static void a(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f47168dc", new Object[]{application, hashMap});
            return;
        }
        c.c("sdkLifeCycle", "", "TBPopInitTask.init.new.init");
        if (f32965a.getAndSet(true)) {
            return;
        }
        c();
        try {
            q.a("PopLayerWindvaneModule", (Class<? extends e>) PopLayerGlobalWVPlugin.class, true);
            q.a("WVPopLayerManager", (Class<? extends e>) WVPopLayerMock.class, true);
        } catch (Throwable th) {
            c.a("TBPopLayer.setup.registerPlugin.fail", th);
        }
        TBPositionMgr.a().a(application);
        d.a();
        bzs.a().f();
        if (bzs.a().h()) {
            bzs.a().a(true, bzs.a().b(), true, bzs.a().j(), bzs.a().d(), bzs.a().g());
        }
        b();
        a.a().c();
        b.set(true);
        c.c("sdkLifeCycle", "", "TBPopInitTask.init.new.done");
    }

    private static void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[0]);
            return;
        }
        try {
            HashMap hashMap = new HashMap();
            com.taobao.application.common.d a2 = com.taobao.application.common.c.a();
            String valueOf = a2 != null ? String.valueOf(a2.a("launchType", mpa.HOT)) : "";
            hashMap.put("launchType", valueOf);
            hashMap.put("enableOpt", "true");
            UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder("PopLayerPerf", UtUtils.CHANGED_UPP_EVENT_ID, "Perf", "PopInitStart", String.valueOf(System.currentTimeMillis()), hashMap).build());
            com.alibaba.poplayer.utils.a.a().a(valueOf);
            com.alibaba.poplayer.utils.a.a().a(1);
        } catch (Throwable th) {
            c.a("trackInitStart error.", th);
        }
    }

    private static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[0]);
            return;
        }
        try {
            com.alibaba.poplayer.utils.a.a().b(1);
        } catch (Throwable th) {
            c.a("trackInitStart error.", th);
        }
    }
}
