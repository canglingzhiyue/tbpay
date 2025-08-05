package com.taobao.update;

import android.text.TextUtils;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.application.common.a;
import com.taobao.tao.Globals;
import com.taobao.tao.TaoPackageInfo;
import com.taobao.update.framework.UpdateRuntime;
import com.taobao.update.monitor.UpdateMonitorImpl;
import java.util.HashMap;
import java.util.Map;
import tb.kge;
import tb.rgh;
import tb.rgi;
import tb.rgq;

/* loaded from: classes9.dex */
public class f {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private g f23410a;
    private boolean b;

    /* loaded from: classes9.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static f f23412a;

        static {
            kge.a(1727127391);
            f23412a = new f();
        }

        public static /* synthetic */ f a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (f) ipChange.ipc$dispatch("df406c26", new Object[0]) : f23412a;
        }
    }

    static {
        kge.a(-1086505359);
    }

    public static f getInstance() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (f) ipChange.ipc$dispatch("e3215fd0", new Object[0]) : a.a();
    }

    public void init(String str, HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3e11072", new Object[]{this, str, hashMap});
            return;
        }
        if (this.b) {
            Log.e("UpdateManager", "UpdateManager has inited");
        }
        long currentTimeMillis = System.currentTimeMillis();
        UpdateRuntime.processName = str;
        rgq.sCurrentProcessName = str;
        if (new d().initSafemode()) {
            return;
        }
        b a2 = a(hashMap);
        UpdateRuntime.init(Globals.getApplication(), a2.ttid, a2.appName, a2.group);
        Log.e("UpdateManager", String.format("initUpdateRuntime cost:%d", Long.valueOf(System.currentTimeMillis() - currentTimeMillis)));
        e enableMonitor = new e(a2).enableApkUpdate().enableMonitor(new UpdateMonitorImpl());
        if (a2.autoStart) {
            enableMonitor = enableMonitor.enableCheckUpdateOnStartup();
        }
        this.f23410a = new g(enableMonitor);
        this.f23410a.init(enableMonitor);
        this.b = true;
        com.taobao.application.common.c.a(new a.b() { // from class: com.taobao.update.f.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.application.common.IApmEventListener
            public void onEvent(int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("fef3fc41", new Object[]{this, new Integer(i)});
                } else if (i == 1) {
                    f.this.onBackground();
                } else if (i == 2) {
                    f.this.onForeground();
                } else if (i != 50) {
                } else {
                    f.this.onExit();
                }
            }
        });
        Log.e("UpdateManager", String.format("initUpdate cost:%d", Long.valueOf(System.currentTimeMillis() - currentTimeMillis)));
    }

    public void init(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60dc73a1", new Object[]{this, str});
        } else {
            init(str, new HashMap<>());
        }
    }

    private b a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("f5f724df", new Object[]{this, map});
        }
        String appDispName = com.taobao.update.a.getAppDispName();
        b bVar = new b(Globals.getApplication());
        bVar.ttid = TaoPackageInfo.getTTID();
        bVar.group = com.taobao.update.a.getGroup(bVar.ttid);
        bVar.appName = appDispName;
        bVar.enableNavProcessor = true;
        bVar.logoResourceId = Globals.getApplication().getApplicationInfo().icon;
        bVar.popDialogBeforeInstall = true;
        bVar.threadExecutorImpl = new rgh();
        bVar.logImpl = new rgi();
        bVar.autoStart = !TextUtils.equals(map.get("bootstrapMode"), "1");
        return bVar;
    }

    public void onExit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2681a1a4", new Object[]{this});
            return;
        }
        g gVar = this.f23410a;
        if (gVar == null) {
            return;
        }
        gVar.onExit();
    }

    public void onBackground() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83d13a74", new Object[]{this});
            return;
        }
        g gVar = this.f23410a;
        if (gVar == null) {
            return;
        }
        gVar.onBackground();
    }

    public void onForeground() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7f3c09", new Object[]{this});
            return;
        }
        g gVar = this.f23410a;
        if (gVar == null) {
            return;
        }
        gVar.onForeground();
    }
}
