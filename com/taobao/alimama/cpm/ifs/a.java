package com.taobao.alimama.cpm.ifs;

import android.app.Activity;
import android.app.Application;
import android.os.Build;
import android.os.Bundle;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alimama.io.SharedPreferencesUtils;
import com.taobao.alimama.utils.c;
import com.taobao.alimama.utils.e;
import com.taobao.alimama.utils.i;
import com.taobao.orange.OrangeConfig;
import com.taobao.orange.d;
import com.taobao.utils.Global;
import java.util.HashSet;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import tb.kge;

/* loaded from: classes4.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String LAST_SUCCEED_URLS = "mama_ad_succeed_exposure_urls";

    /* renamed from: a  reason: collision with root package name */
    private static Queue<String> f8430a;
    private static boolean b;
    private static int c;
    private static final Set<String> e;
    private volatile boolean d;
    private Application.ActivityLifecycleCallbacks f;

    /* renamed from: com.taobao.alimama.cpm.ifs.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static class C0330a {

        /* renamed from: a  reason: collision with root package name */
        public static volatile a f8433a;

        static {
            kge.a(-561503605);
            f8433a = new a();
        }
    }

    public static /* synthetic */ boolean a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a821d370", new Object[]{new Boolean(z)})).booleanValue();
        }
        b = z;
        return z;
    }

    public static /* synthetic */ boolean e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[0])).booleanValue() : b;
    }

    public static /* synthetic */ Queue f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Queue) ipChange.ipc$dispatch("3472df8d", new Object[0]) : f8430a;
    }

    private a() {
    }

    public static a a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("6f35a1c0", new Object[0]) : C0330a.f8433a;
    }

    static {
        kge.a(-204722662);
        f8430a = new ConcurrentLinkedQueue();
        b = false;
        c = 50;
        e = new HashSet();
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        Application application = Global.getApplication();
        if (application == null || this.f != null || Build.VERSION.SDK_INT < 14) {
            return;
        }
        this.f = new Application.ActivityLifecycleCallbacks() { // from class: com.taobao.alimama.cpm.ifs.a.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityCreated(Activity activity, Bundle bundle) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("cce650e1", new Object[]{this, activity, bundle});
                }
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityDestroyed(Activity activity) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("4148cc84", new Object[]{this, activity});
                }
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPaused(Activity activity) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("a4658a75", new Object[]{this, activity});
                }
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityResumed(Activity activity) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3e8abf42", new Object[]{this, activity});
                }
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("2c9c12a", new Object[]{this, activity, bundle});
                }
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityStarted(Activity activity) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5e01616c", new Object[]{this, activity});
                }
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityStopped(Activity activity) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("dc236bb8", new Object[]{this, activity});
                    return;
                }
                try {
                    if (!a.e()) {
                        return;
                    }
                    SharedPreferencesUtils.putStringSet(a.LAST_SUCCEED_URLS, new HashSet(a.f()));
                    a.a(false);
                } catch (Exception e2) {
                    e.a("ifs_disk_thr", e2.getMessage());
                }
            }
        };
        application.registerActivityLifecycleCallbacks(this.f);
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        try {
            if (this.d || !c.r()) {
                return;
            }
            this.d = true;
            Set<String> stringSet = SharedPreferencesUtils.getStringSet(LAST_SUCCEED_URLS);
            if (stringSet != null) {
                f8430a.addAll(stringSet);
            }
            c = SharedPreferencesUtils.getInt("disk_max_filter", 50);
            Set<String> stringSet2 = SharedPreferencesUtils.getStringSet("disk_filter_namespace");
            if (stringSet2 != null) {
                e.addAll(stringSet2);
            }
            OrangeConfig.getInstance().registerListener(new String[]{"alimama_ad"}, new d() { // from class: com.taobao.alimama.cpm.ifs.a.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.orange.d
                public void onConfigUpdate(String str, Map<String, String> map) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("4f2fc4ea", new Object[]{this, str, map});
                        return;
                    }
                    try {
                        int a2 = i.a("disk_max_filter", 50);
                        Set<String> a3 = i.a("disk_filter_namespace");
                        SharedPreferencesUtils.putInt("disk_max_filter", a2);
                        if (a3.isEmpty()) {
                            SharedPreferencesUtils.removeKey("disk_filter_namespace");
                        } else {
                            SharedPreferencesUtils.putStringSet("disk_filter_namespace", a3);
                        }
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                }
            }, false);
            c();
        } catch (Exception e2) {
            e2.printStackTrace();
            e.a("ifs_disk_thr", e2.getMessage());
        }
    }

    public boolean a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d9378d80", new Object[]{this, str, str2})).booleanValue();
        }
        try {
            if (!c.r() || StringUtils.isEmpty(str2)) {
                return false;
            }
            b();
            if (a(str) && f8430a != null) {
                if (f8430a.contains(str2)) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            th.printStackTrace();
            e.a("ifs_disk_thr", th.getMessage());
            return false;
        }
    }

    public int d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("596b2de", new Object[]{this})).intValue();
        }
        Queue<String> queue = f8430a;
        if (queue != null) {
            return queue.size();
        }
        return 0;
    }

    public void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65d7b87d", new Object[]{this, str, str2});
            return;
        }
        try {
            if (!c.r() || !a(str) || StringUtils.isEmpty(str2)) {
                return;
            }
            if (f8430a.size() > c) {
                e.a("IfsDiskCacheManager", "succeedUrlExceed");
                f8430a.poll();
            }
            f8430a.add(str2);
            b = true;
        } catch (Exception e2) {
            e2.printStackTrace();
            e.a("ifs_disk_thr", e2.getMessage());
        }
    }

    private boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue();
        }
        if (e.contains("all")) {
            return true;
        }
        return !StringUtils.isEmpty(str) && e.contains(str);
    }
}
