package com.alipay.mobile.common.logging.util.perf;

import android.content.Context;
import android.content.Intent;
import android.support.v4.content.LocalBroadcastManager;
import mtopsdk.common.util.StringUtils;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

@MpaasClassInfo(BundleName = "android-phone-mobilesdk-logging", ExportJarName = "unknown", Level = "lib", Product = ":android-phone-mobilesdk-logging")
/* loaded from: classes3.dex */
public class EventTrigger {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static EventTrigger f5474a;
    private Context b;
    private final Map<String, String> c = new HashMap();
    private final AtomicInteger d = new AtomicInteger(0);
    private final List<EventListener> e = new ArrayList();

    @MpaasClassInfo(BundleName = "android-phone-mobilesdk-logging", ExportJarName = "unknown", Level = "lib", Product = ":android-phone-mobilesdk-logging")
    /* loaded from: classes3.dex */
    public interface EventListener {
        void onEvent(String str, Map<String, String> map);
    }

    public static EventTrigger getInstance(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (EventTrigger) ipChange.ipc$dispatch("51e5cf92", new Object[]{context});
        }
        if (f5474a == null) {
            synchronized (EventTrigger.class) {
                if (f5474a == null) {
                    f5474a = new EventTrigger(context);
                }
            }
        }
        return f5474a;
    }

    private EventTrigger(Context context) {
        this.b = null;
        this.b = context.getApplicationContext();
        if (this.b == null) {
            this.b = context;
        }
    }

    public static void event(Context context, String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edb6b094", new Object[]{context, str, map});
        } else {
            getInstance(context).event(str, map);
        }
    }

    public void event(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d365127a", new Object[]{this, str, map});
        } else if (StringUtils.isEmpty(str)) {
        } else {
            if (map == null) {
                map = new HashMap<>();
            }
            Map<String, String> judgement = Judge.getInstance(this.b).getJudgement();
            if (judgement != null) {
                map.putAll(judgement);
            }
            if ("clientLaunch".equals(str)) {
                a("clientLaunch", map);
                IdleChecker.getInstance(this.b).triggerTimeout(false);
            } else if (Constants.EVENT_CLIENT_LAUNCH_FINISH.equals(str)) {
                a("clientLaunch", map);
                a(Constants.EVENT_CLIENT_LAUNCH_FINISH, map);
                IdleChecker.getInstance(this.b).triggerTimeout(true);
            } else if (Constants.EVENT_ENTER_IDLE.equals(str)) {
                a("clientLaunch", map);
                a(Constants.EVENT_CLIENT_LAUNCH_FINISH, map);
                a(Constants.EVENT_ENTER_IDLE, map);
            } else if ("background".equals(str)) {
                a("background", map);
            } else if (Constants.EVENT_ENTER_IMP_ZONE.equals(str)) {
                this.d.incrementAndGet();
            } else if (!Constants.EVENT_LEAVE_IMP_ZONE.equals(str)) {
            } else {
                this.d.decrementAndGet();
            }
        }
    }

    private void a(String str, Map<String, String> map) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20476513", new Object[]{this, str, map});
        } else if (!StringUtils.isEmpty(str)) {
            synchronized (this.c) {
                z = !Constants.VAL_YES.equals(this.c.get(str));
                this.c.put(str, Constants.VAL_YES);
                if ("background".equals(str)) {
                    this.c.remove(str);
                }
            }
            if (!z) {
                return;
            }
            ArrayList<EventListener> arrayList = new ArrayList();
            synchronized (this.e) {
                arrayList.addAll(this.e);
            }
            for (EventListener eventListener : arrayList) {
                try {
                    eventListener.onEvent(str, map);
                } catch (Throwable unused) {
                }
            }
            if (!Constants.EVENT_ENTER_IDLE.equals(str)) {
                return;
            }
            try {
                Intent intent = new Intent();
                intent.setAction(Constants.BROADCAST_ACTION);
                intent.setPackage(this.b.getPackageName());
                intent.putExtra("event", str);
                String str2 = "3";
                if (map != null && map.containsKey(Constants.PARAM_PERF_LEVEL)) {
                    str2 = map.get(Constants.PARAM_PERF_LEVEL);
                }
                intent.putExtra(Constants.PARAM_PERF_LEVEL, str2);
                LocalBroadcastManager.getInstance(this.b).sendBroadcast(intent);
            } catch (Throwable unused2) {
            }
            try {
                Intent intent2 = new Intent();
                intent2.setAction("mpaas.perf.judge.event.".concat(String.valueOf(str)));
                intent2.setPackage(this.b.getPackageName());
                String str3 = "3";
                if (map != null && map.containsKey(Constants.PARAM_PERF_LEVEL)) {
                    str3 = map.get(Constants.PARAM_PERF_LEVEL);
                }
                intent2.putExtra(Constants.PARAM_PERF_LEVEL, str3);
                LocalBroadcastManager.getInstance(this.b).sendBroadcast(intent2);
            } catch (Throwable unused3) {
            }
        }
    }

    public boolean isInImpZone() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("30161ab4", new Object[]{this})).booleanValue() : this.d.get() > 0;
    }

    public void registerEventListener(EventListener eventListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c48f0b0", new Object[]{this, eventListener});
        } else if (eventListener == null) {
        } else {
            synchronized (this.e) {
                if (!this.e.contains(eventListener)) {
                    this.e.add(eventListener);
                }
            }
        }
    }

    public void unregisterEventListener(EventListener eventListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b59f1349", new Object[]{this, eventListener});
        } else if (eventListener == null) {
        } else {
            synchronized (this.e) {
                if (this.e.contains(eventListener)) {
                    this.e.remove(eventListener);
                }
            }
        }
    }
}
