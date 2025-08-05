package com.taobao.metrickit.context;

import android.app.Activity;
import android.app.Application;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Handler;
import android.os.Process;
import android.os.SystemClock;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.metrickit.event.EventCenter;
import java.io.File;
import java.io.Serializable;
import tb.mqe;

/* loaded from: classes.dex */
public class MetricContext implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final String launchSession = String.valueOf(SystemClock.uptimeMillis());
    private static long processStartTime = -1;
    private Application application;
    private String currPageName;
    private String currPageSchemaUrl;
    private Handler defaultInnerThreadHandler;
    private EventCenter eventCenter;
    private long launcherStartTime;
    private b outerCallbackDispatcher;

    public static /* synthetic */ Application access$100(MetricContext metricContext) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Application) ipChange.ipc$dispatch("6929d533", new Object[]{metricContext}) : metricContext.application;
    }

    public static /* synthetic */ Application access$102(MetricContext metricContext, Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Application) ipChange.ipc$dispatch("77ca8d08", new Object[]{metricContext, application});
        }
        metricContext.application = application;
        return application;
    }

    public static /* synthetic */ b access$200(MetricContext metricContext) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("f04e633a", new Object[]{metricContext}) : metricContext.outerCallbackDispatcher;
    }

    public static /* synthetic */ b access$202(MetricContext metricContext, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("9a76e02f", new Object[]{metricContext, bVar});
        }
        metricContext.outerCallbackDispatcher = bVar;
        return bVar;
    }

    public static /* synthetic */ Handler access$300(MetricContext metricContext) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Handler) ipChange.ipc$dispatch("5b609020", new Object[]{metricContext}) : metricContext.defaultInnerThreadHandler;
    }

    public static /* synthetic */ Handler access$302(MetricContext metricContext, Handler handler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("c5ebefae", new Object[]{metricContext, handler});
        }
        metricContext.defaultInnerThreadHandler = handler;
        return handler;
    }

    public static /* synthetic */ EventCenter access$400(MetricContext metricContext) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (EventCenter) ipChange.ipc$dispatch("12fa1400", new Object[]{metricContext}) : metricContext.eventCenter;
    }

    public static /* synthetic */ EventCenter access$402(MetricContext metricContext, EventCenter eventCenter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (EventCenter) ipChange.ipc$dispatch("2519ad6d", new Object[]{metricContext, eventCenter});
        }
        metricContext.eventCenter = eventCenter;
        return eventCenter;
    }

    public static /* synthetic */ long access$502(MetricContext metricContext, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a8ad5b8e", new Object[]{metricContext, new Long(j)})).longValue();
        }
        metricContext.launcherStartTime = j;
        return j;
    }

    private MetricContext() {
    }

    public static String getLaunchSession() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6d23796c", new Object[0]) : launchSession;
    }

    public long getProcessStartTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("95784991", new Object[]{this})).longValue();
        }
        long j = processStartTime;
        if (j > 0) {
            return j;
        }
        if (Build.VERSION.SDK_INT >= 24) {
            long startUptimeMillis = Process.getStartUptimeMillis();
            processStartTime = startUptimeMillis;
            return startUptimeMillis;
        }
        File file = new File("/proc/" + Process.myPid() + "/comm");
        if (!file.exists()) {
            return -1L;
        }
        long lastModified = file.lastModified();
        processStartTime = lastModified;
        return lastModified;
    }

    public boolean isCharging() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1f0538c6", new Object[]{this})).booleanValue();
        }
        try {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.BATTERY_CHANGED");
            int intExtra = getApplication().registerReceiver(null, intentFilter).getIntExtra("plugged", -1);
            return (intExtra == 1) || (intExtra == 2) || (Build.VERSION.SDK_INT >= 17 && intExtra == 4);
        } catch (Exception unused) {
            return false;
        }
    }

    public Application getApplication() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Application) ipChange.ipc$dispatch("5749e470", new Object[]{this}) : this.application;
    }

    public b getOuterCallbackScheduler() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("3ea6ae47", new Object[]{this}) : this.outerCallbackDispatcher;
    }

    public Handler getDefaultInnerHandler() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Handler) ipChange.ipc$dispatch("88478e40", new Object[]{this}) : this.defaultInnerThreadHandler;
    }

    public EventCenter getEventCenter() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (EventCenter) ipChange.ipc$dispatch("9c50d627", new Object[]{this}) : this.eventCenter;
    }

    public void updateCurrPage(Activity activity) {
        String dataString;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d533be3", new Object[]{this, activity});
            return;
        }
        this.currPageName = activity == null ? null : activity.getClass().getName();
        if (activity == null) {
            dataString = null;
        } else {
            try {
                dataString = activity.getIntent().getDataString();
            } catch (Exception unused) {
                this.currPageSchemaUrl = null;
                return;
            }
        }
        this.currPageSchemaUrl = dataString;
    }

    public String getCurrActivityName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ea92bb37", new Object[]{this}) : com.taobao.application.common.c.a().a("currActivityName", (String) null);
    }

    public String getCurrActivitySimpleName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ee8902e5", new Object[]{this}) : com.taobao.application.common.c.a().a("currActivitySimpleName", (String) null);
    }

    public String getSchemaUrl() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("883e5ca1", new Object[]{this}) : com.taobao.application.common.c.a().a("currActivitySchemaUrl", (String) null);
    }

    public String getCurrFragmentName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("33c4c716", new Object[]{this}) : com.taobao.application.common.c.a().a("currFragmentName", (String) null);
    }

    public long getLauncherStartTime() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("2ea9a5d4", new Object[]{this})).longValue() : this.launcherStartTime;
    }

    public boolean isInBackground() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e44ec488", new Object[]{this})).booleanValue() : com.taobao.application.common.c.a().a("isInBackground", false);
    }

    /* loaded from: classes.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public MetricContext f18070a = new MetricContext();

        public a a(Application application) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("c2fe574e", new Object[]{this, application});
            }
            MetricContext.access$102(this.f18070a, application);
            return this;
        }

        public a a(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("7057b6f4", new Object[]{this, bVar});
            }
            MetricContext.access$202(this.f18070a, bVar);
            return this;
        }

        public a a(Handler handler) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("afc970cd", new Object[]{this, handler});
            }
            MetricContext.access$302(this.f18070a, handler);
            return this;
        }

        public a a(EventCenter eventCenter) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("bc8fe56c", new Object[]{this, eventCenter});
            }
            MetricContext.access$402(this.f18070a, eventCenter);
            return this;
        }

        public a a(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("4d5a5da1", new Object[]{this, obj});
            }
            MetricContext.access$502(this.f18070a, mqe.a(obj, System.currentTimeMillis()) - (System.currentTimeMillis() - SystemClock.uptimeMillis()));
            return this;
        }

        public MetricContext a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (MetricContext) ipChange.ipc$dispatch("1be3c6da", new Object[]{this});
            }
            b(MetricContext.access$100(this.f18070a));
            b(MetricContext.access$200(this.f18070a));
            b(MetricContext.access$300(this.f18070a));
            b(MetricContext.access$400(this.f18070a));
            return this.f18070a;
        }

        private void b(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f056ab85", new Object[]{this, obj});
            } else if (obj == null) {
                throw new RuntimeException("The required parameters are null.");
            }
        }
    }
}
