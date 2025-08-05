package com.alipay.mobile.common.logging.event;

import com.alipay.mobile.common.logging.api.LogContext;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

@MpaasClassInfo(BundleName = "android-phone-mobilesdk-logging", ExportJarName = "unknown", Level = "lib", Product = ":android-phone-mobilesdk-logging")
/* loaded from: classes3.dex */
public class ClientEventManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static ClientEventManager b;

    /* renamed from: a  reason: collision with root package name */
    public HashMap<String, ClientEvent> f5431a = new HashMap<>();
    private HashMap<Object, EventFilter> c = new HashMap<>();

    public static synchronized ClientEventManager a() {
        synchronized (ClientEventManager.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ClientEventManager) ipChange.ipc$dispatch("fe123828", new Object[0]);
            }
            if (b == null) {
                b = new ClientEventManager();
            }
            return b;
        }
    }

    public ClientEventManager() {
        this.f5431a.put(LogContext.ENVENT_GOTOFOREGROUND, new GotoForegroundEvent());
        this.f5431a.put(LogContext.ENVENT_GOTOBACKGROUND, new GotoBackgroundEvent());
        this.f5431a.put(LogContext.CLIENT_ENVENT_PAGELAUNCH, new ClientPageLaunchEvent());
        this.f5431a.put(LogContext.CLIENT_ENVENT_CLIENTLAUNCH, new ClientClientLaunchEvent());
        this.f5431a.put(LogContext.CLIENT_ENVENT_CLIENTQUIT, new ClientQuitEvent());
        this.f5431a.put(LogContext.CLIENT_ENVENT_GOTOFOREGROUND, new ClientGotoForegroundEvent());
        this.f5431a.put(LogContext.CLIENT_ENVENT_PERIODCHECK, new PeriodCheckEvent());
        this.f5431a.put(LogContext.CLIENT_ENVENT_SWITCHPAGE, new SwitchPageEvent());
        this.f5431a.put(LogContext.ENVENT_USERLOGIN, new UserLoginEvent());
        this.f5431a.put(LogContext.ENVENT_BUGREPORT, new BugReportEvent());
        this.f5431a.put(LogContext.ENVENT_DUMPLOGTOSD, new DumpLogToSDEvent());
        this.f5431a.put(LogContext.ENVENT_VIEWSWITCH, new ViewSwitchEvent());
        this.f5431a.put(LogContext.ENVENT_SUBAPPSTART, new SubAppStartEvent());
        this.f5431a.put(LogContext.ENVENT_SUBAPPRESUME, new SubAppResumeEvent());
    }

    public final void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        for (Map.Entry<Object, EventFilter> entry : this.c.entrySet()) {
            EventFilter value = entry.getValue();
            if (value != null && value.a(str)) {
                entry.getKey();
            }
        }
    }
}
