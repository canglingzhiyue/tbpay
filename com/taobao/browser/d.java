package com.taobao.browser;

import android.app.Activity;
import android.taobao.windvane.util.m;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.linkmanager.AfcLifeCycleCenter;
import com.taobao.orange.OrangeConfig;
import com.taobao.tao.BaseActivity;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import tb.kge;

/* loaded from: classes6.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static volatile d f16772a;
    private static int b;
    private static List<WeakReference<Activity>> c;

    static {
        kge.a(544616774);
        f16772a = null;
        b = 5;
        c = new ArrayList();
    }

    private d() {
    }

    public static d a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("10c16973", new Object[0]);
        }
        if (f16772a == null) {
            synchronized (d.class) {
                if (f16772a == null) {
                    d dVar = new d();
                    f16772a = dVar;
                    return dVar;
                }
            }
        }
        return f16772a;
    }

    public synchronized void a(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68a25ba", new Object[]{this, activity});
            return;
        }
        boolean booleanValue = Boolean.valueOf(com.taobao.browser.utils.f.a("group_common_browser", "open_container_limit", "true")).booleanValue();
        if (activity != null && booleanValue) {
            c.add(new WeakReference<>(activity));
            m.b("ContainerManager", "current activity size is " + c.size());
        }
    }

    public synchronized void b(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fdb367b", new Object[]{this, activity});
            return;
        }
        boolean booleanValue = Boolean.valueOf(com.taobao.browser.utils.f.a("group_common_browser", "open_container_limit", "true")).booleanValue();
        if (activity != null && booleanValue) {
            Iterator<WeakReference<Activity>> it = c.iterator();
            while (it != null && it.hasNext()) {
                WeakReference<Activity> next = it.next();
                if (next.get() == null || next.get() == activity) {
                    it.remove();
                }
            }
        }
    }

    public synchronized void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        boolean booleanValue = Boolean.valueOf(com.taobao.browser.utils.f.a("group_common_browser", "open_container_limit", "true")).booleanValue();
        int intValue = Integer.valueOf(com.taobao.browser.utils.f.a("group_common_browser", "container_limit_num", "5")).intValue();
        if (intValue != 0) {
            b = intValue;
        }
        while (c.size() > b && booleanValue) {
            WeakReference<Activity> remove = c.remove(0);
            if (remove.get() != null) {
                m.b("ContainerManager", "finish last activity, current size is " + c.size());
                if (c()) {
                    ((BaseActivity) remove.get()).finish(!AfcLifeCycleCenter.isLauncherStart);
                } else {
                    remove.get().finish();
                }
            }
        }
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue() : "true".equals(OrangeConfig.getInstance().getConfig("WindVane", com.taobao.browser.utils.i.KEY_ORANGE_CONFIG_FIX_FIVE_TIME_FINISH_BNG, "true"));
    }
}
