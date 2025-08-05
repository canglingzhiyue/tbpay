package com.taobao.taolive.room.utils;

import android.app.Activity;
import android.content.Context;
import android.os.AsyncTask;
import android.os.SystemClock;
import android.view.View;
import com.alibaba.analytics.AnalyticsMgr;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import java.util.HashSet;
import java.util.Set;
import tb.kge;

/* loaded from: classes8.dex */
public abstract class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final String f21752a;
    private static boolean b;
    private static Set<Integer> c;
    public static boolean d;

    public static /* synthetic */ String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[0]) : f21752a;
    }

    static {
        kge.a(-1745238383);
        f21752a = a.class.getSimpleName();
        b = true;
        c = new HashSet();
        d = false;
    }

    public static void a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9501e36a", new Object[]{view});
        } else if (view == null) {
        } else {
            view.setTag(com.taobao.monitor.procedure.v.APM_VIEW_TOKEN, com.taobao.monitor.procedure.v.APM_VIEW_INVALID);
            c.add(Integer.valueOf(view.getId()));
        }
    }

    public static void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{context});
        } else if (!aa.cU() || d || !(context instanceof Activity)) {
        } else {
            Activity activity = (Activity) context;
            if (!activity.getLocalClassName().contains("TaoLiveVideoActivity")) {
                return;
            }
            com.taobao.monitor.procedure.o.f18229a.a(activity).g().a("videoFirstFrameTime", SystemClock.uptimeMillis());
            d = true;
            ap.a(context);
        }
    }

    public static void a(Context context, com.taobao.alilive.aliliveframework.frame.a aVar) {
        View findViewById;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2df1065", new Object[]{context, aVar});
            return;
        }
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            View findViewById2 = activity.findViewById(R.id.taolive_root_view);
            if (findViewById2 != null) {
                findViewById2.setTag(com.taobao.monitor.procedure.v.APM_VIEW_TOKEN, com.taobao.monitor.procedure.v.APM_VIEW_VALID);
            }
            for (Integer num : c) {
                if (num != null && num.intValue() != 0 && (findViewById = activity.findViewById(num.intValue())) != null) {
                    findViewById.setTag(com.taobao.monitor.procedure.v.APM_VIEW_TOKEN, com.taobao.monitor.procedure.v.APM_VIEW_VALID);
                }
            }
            c.clear();
        }
        com.taobao.monitor.procedure.s.f18233a.d().a("taolive_firstframe_time", Long.valueOf(SystemClock.uptimeMillis()));
        com.taobao.monitor.procedure.s.f18233a.d().a("taolive_firstframe_isAfcColdContext", Boolean.valueOf(m.b()));
        m.a(context, false);
        if (!b) {
            return;
        }
        b = false;
        AsyncTask.THREAD_POOL_EXECUTOR.execute(new Runnable() { // from class: com.taobao.taolive.room.utils.a.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                try {
                    m.b(a.a() + "_refreshUTIfNeeded");
                    com.ut.mini.internal.f.getInstance().saveCacheDataToLocal();
                    Thread.sleep(500L);
                    com.ut.mini.internal.f.getInstance().dispatchLocalHits();
                } catch (Throwable th) {
                    m.b(a.a() + "_refreshUTIfNeeded " + th.getMessage());
                }
            }
        });
    }

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
            return;
        }
        m.b(f21752a + "_notifyWaitLockedAnalyticsMgr");
        AnalyticsMgr.b();
    }

    public static void a(Activity activity, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8bb1504", new Object[]{activity, str});
        } else {
            com.taobao.monitor.procedure.s.f18233a.b(activity).a(str, Long.valueOf(SystemClock.uptimeMillis()));
        }
    }
}
