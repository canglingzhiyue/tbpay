package tb;

import android.app.Application;
import com.alibaba.poplayer.trigger.InternalTriggerController;
import com.alibaba.poplayer.utils.a;
import com.alibaba.poplayer.utils.c;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tbpoplayer.AccsPopLayerService;
import com.taobao.tbpoplayer.adapter.h;
import com.taobao.tbpoplayer.adapter.j;
import com.taobao.tbpoplayer.adapter.l;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class qns {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final AtomicBoolean f32966a;

    static {
        kge.a(1964312966);
        f32966a = new AtomicBoolean(false);
    }

    public static void a(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f47168dc", new Object[]{application, hashMap});
            return;
        }
        try {
            c.a("TBPopInitTask.pre.init.", new Object[0]);
            if (f32966a.getAndSet(true)) {
                return;
            }
            com.taobao.tbpoplayer.c cVar = new com.taobao.tbpoplayer.c();
            c.a(new h());
            bzl a2 = bzl.a();
            a2.a(com.taobao.tbpoplayer.adapter.c.a());
            a2.a(new l());
            a.a().a(com.taobao.tbpoplayer.adapter.a.c());
            cac.a().a(new qny());
            bzy.a().a(new qnx());
            if (hashMap == null || !(hashMap.get("isDebuggable") instanceof Boolean)) {
                cVar.setupNew(application, false);
            } else {
                cVar.setupNew(application, ((Boolean) hashMap.get("isDebuggable")).booleanValue());
            }
            cVar.registerPopLayerViewAdapter(j.a());
            if (a.a().b()) {
                AccsPopLayerService.a(cVar.getApp());
                c.a("TBPopInitTask.pre.init.AccsPopLayerService", new Object[0]);
            }
            if (a.a().c()) {
                c.c("sdkLifeCycle", "", "UCPFirstPageSwitchTrack.from=TBPopPreInitTask.init.");
                caa.a(InternalTriggerController.d());
                c.a("TBPopInitTask.pre.init.UCPTracker", new Object[0]);
            }
            c.c("sdkLifeCycle", "", "TBPopInitTask.pre.init.done");
        } catch (Throwable th) {
            c.a("TBPopLayer.setup.error.", th);
        }
    }
}
