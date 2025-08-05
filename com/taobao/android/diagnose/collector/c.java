package com.taobao.android.diagnose.collector;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.diagnose.collector.c;
import com.taobao.android.diagnose.model.PageInfo;
import com.taobao.android.diagnose.v;
import com.taobao.tao.log.logger.EventLogger;
import com.taobao.tao.log.logger.PageLogger;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import tb.kge;

/* loaded from: classes.dex */
public class c implements Application.ActivityLifecycleCallbacks {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final com.taobao.android.diagnose.model.a b;
    private final Executor c;
    private final g d;

    /* renamed from: a */
    private int f11691a = 0;
    private boolean e = false;
    private long f = 0;

    static {
        kge.a(-764132129);
        kge.a(-1894394539);
    }

    /* renamed from: lambda$9rNHobq-Q7RMHacbCjHwtFE3W6s */
    public static /* synthetic */ void m907lambda$9rNHobqQ7RMHacbCjHwtFE3W6s(c cVar, PageInfo pageInfo) {
        cVar.a(pageInfo);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c9c12a", new Object[]{this, activity, bundle});
        }
    }

    public static /* synthetic */ com.taobao.android.diagnose.model.a a(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.diagnose.model.a) ipChange.ipc$dispatch("c464d9ea", new Object[]{cVar}) : cVar.b;
    }

    public static /* synthetic */ Executor b(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Executor) ipChange.ipc$dispatch("80dd8a7b", new Object[]{cVar}) : cVar.c;
    }

    public static /* synthetic */ Map c(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("b72f1309", new Object[]{cVar}) : cVar.a();
    }

    public c(com.taobao.android.diagnose.model.a aVar, Executor executor, g gVar) {
        this.b = aVar;
        this.c = executor;
        this.d = gVar;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cce650e1", new Object[]{this, activity, bundle});
        } else if (bundle != null) {
        } else {
            try {
                this.b.a(activity);
                if (!(activity instanceof FragmentActivity)) {
                    return;
                }
                ((FragmentActivity) activity).getSupportFragmentManager().registerFragmentLifecycleCallbacks(new a(activity), true);
            } catch (Exception e) {
                v.a("AppLifecycleObserver", "onActivityCreated", e);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e01616c", new Object[]{this, activity});
            return;
        }
        try {
            int i = this.f11691a + 1;
            this.f11691a = i;
            if (i != 1 || this.e) {
                return;
            }
            this.b.a(false);
            EventLogger.builder(2).setPageID(PageInfo.getPageID(activity)).log(this.c);
        } catch (Exception e) {
            v.a("AppLifecycleObserver", "onActivityStarted", e);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e8abf42", new Object[]{this, activity});
            return;
        }
        try {
            final PageInfo c = this.b.c(activity);
            if (c == null) {
                c = this.b.a(activity);
            } else {
                this.b.a(c);
            }
            Intent intent = activity.getIntent();
            if (intent != null) {
                c.setPageUrl(intent.getDataString());
            }
            this.c.execute(new Runnable() { // from class: com.taobao.android.diagnose.collector.-$$Lambda$c$9rNHobq-Q7RMHacbCjHwtFE3W6s
                @Override // java.lang.Runnable
                public final void run() {
                    c.m907lambda$9rNHobqQ7RMHacbCjHwtFE3W6s(c.this, c);
                }
            });
        } catch (Exception e) {
            v.a("AppLifecycleObserver", "onActivityResumed", e);
        }
    }

    public /* synthetic */ void a(PageInfo pageInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26acd096", new Object[]{this, pageInfo});
            return;
        }
        PageLogger data = PageLogger.builder(2, pageInfo.getPageID()).setPageType(1).setPageName(pageInfo.getPageName()).setData(a());
        if (pageInfo.isUrlChanged()) {
            data.setPageUrl(pageInfo.getPageUrl());
            pageInfo.setUrlChanged(false);
        }
        data.log();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4658a75", new Object[]{this, activity});
            return;
        }
        try {
            this.b.a();
            PageLogger.builder(3, PageInfo.getPageID(activity)).setPageType(1).setPageName(activity.getClass().getName()).log(this.c);
        } catch (Exception e) {
            v.a("AppLifecycleObserver", "onActivityPaused", e);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc236bb8", new Object[]{this, activity});
            return;
        }
        try {
            this.e = activity.isChangingConfigurations();
            int i = this.f11691a - 1;
            this.f11691a = i;
            if (i != 0 || this.e) {
                return;
            }
            this.b.a(true);
            EventLogger.builder(3).setPageID(PageInfo.getPageID(activity)).log(this.c);
        } catch (Exception e) {
            v.a("AppLifecycleObserver", "onActivityStopped", e);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4148cc84", new Object[]{this, activity});
            return;
        }
        try {
            this.b.b(activity);
        } catch (Exception e) {
            v.a("AppLifecycleObserver", "onActivityDestroyed", e);
        }
    }

    /* loaded from: classes5.dex */
    public class a extends FragmentManager.FragmentLifecycleCallbacks {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final Activity b;

        static {
            kge.a(-1057343915);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            int hashCode = str.hashCode();
            if (hashCode == -1547495758) {
                super.onFragmentResumed((FragmentManager) objArr[0], (Fragment) objArr[1]);
                return null;
            } else if (hashCode == -1501849859) {
                super.onFragmentPaused((FragmentManager) objArr[0], (Fragment) objArr[1]);
                return null;
            } else if (hashCode != -473528248) {
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            } else {
                super.onFragmentStarted((FragmentManager) objArr[0], (Fragment) objArr[1]);
                return null;
            }
        }

        /* renamed from: lambda$P9KfW4x4gfKBw3BF-Dk2ehX-F4g */
        public static /* synthetic */ void m908lambda$P9KfW4x4gfKBw3BFDk2ehXF4g(a aVar, Fragment fragment) {
            aVar.a(fragment);
        }

        public a(Activity activity) {
            c.this = r1;
            this.b = activity;
        }

        @Override // android.support.v4.app.FragmentManager.FragmentLifecycleCallbacks
        public void onFragmentStarted(FragmentManager fragmentManager, Fragment fragment) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e3c68848", new Object[]{this, fragmentManager, fragment});
                return;
            }
            super.onFragmentStarted(fragmentManager, fragment);
            c.a(c.this).a(fragment);
        }

        @Override // android.support.v4.app.FragmentManager.FragmentLifecycleCallbacks
        public void onFragmentResumed(FragmentManager fragmentManager, final Fragment fragment) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a3c316b2", new Object[]{this, fragmentManager, fragment});
                return;
            }
            super.onFragmentResumed(fragmentManager, fragment);
            c.b(c.this).execute(new Runnable() { // from class: com.taobao.android.diagnose.collector.-$$Lambda$c$a$P9KfW4x4gfKBw3BF-Dk2ehX-F4g
                @Override // java.lang.Runnable
                public final void run() {
                    c.a.m908lambda$P9KfW4x4gfKBw3BFDk2ehXF4g(c.a.this, fragment);
                }
            });
        }

        public /* synthetic */ void a(Fragment fragment) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2f0514a", new Object[]{this, fragment});
            } else {
                PageLogger.builder(2, PageInfo.getPageID(this.b)).setPageName(fragment.getClass().getName()).setPageType(2).setData(c.c(c.this)).log();
            }
        }

        @Override // android.support.v4.app.FragmentManager.FragmentLifecycleCallbacks
        public void onFragmentPaused(FragmentManager fragmentManager, Fragment fragment) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a67b96fd", new Object[]{this, fragmentManager, fragment});
            } else {
                super.onFragmentPaused(fragmentManager, fragment);
            }
        }
    }

    private Map<String, String> a() {
        com.taobao.android.diagnose.model.b c;
        String a2;
        String a3;
        String a4;
        String a5;
        String a6;
        String a7;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("a014a89d", new Object[]{this});
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.f < com.taobao.android.diagnose.config.a.n.checkInterval) {
            return null;
        }
        this.f = currentTimeMillis;
        try {
            c = this.d.c();
            a2 = c.a(com.taobao.android.diagnose.model.b.DALVIK_USED);
            a3 = c.a(com.taobao.android.diagnose.model.b.DALVIK_USED_RATIO);
            a4 = c.a(com.taobao.android.diagnose.model.b.NATIVE_HEAP_USED);
            a5 = c.a(com.taobao.android.diagnose.model.b.GC_ALLOC_SIZE);
            a6 = c.a(com.taobao.android.diagnose.model.b.GC_FREE_SIZE);
            a7 = c.a(com.taobao.android.diagnose.model.b.GC_COUNT);
        } catch (Exception e) {
            e = e;
        }
        try {
            String a8 = c.a(com.taobao.android.diagnose.model.b.GC_TIME);
            String a9 = c.a(com.taobao.android.diagnose.model.b.GC_BLOCK_COUNT);
            String a10 = c.a(com.taobao.android.diagnose.model.b.GC_BLOCK_TIME);
            String a11 = c.a(com.taobao.android.diagnose.model.b.GL_DEV_MEM);
            String a12 = c.a(com.taobao.android.diagnose.model.b.GL_MEM);
            String a13 = c.a(com.taobao.android.diagnose.model.b.GRAPHICS_MEM);
            HashMap hashMap = new HashMap();
            hashMap.put(com.taobao.android.diagnose.model.b.DALVIK_USED, a2);
            hashMap.put(com.taobao.android.diagnose.model.b.DALVIK_USED_RATIO, a3);
            hashMap.put(com.taobao.android.diagnose.model.b.GC_ALLOC_SIZE, a5);
            hashMap.put(com.taobao.android.diagnose.model.b.GC_FREE_SIZE, a6);
            hashMap.put(com.taobao.android.diagnose.model.b.GC_COUNT, a7);
            hashMap.put(com.taobao.android.diagnose.model.b.GC_TIME, a8);
            hashMap.put(com.taobao.android.diagnose.model.b.GC_BLOCK_COUNT, a9);
            hashMap.put(com.taobao.android.diagnose.model.b.GC_BLOCK_TIME, a10);
            hashMap.put(com.taobao.android.diagnose.model.b.GL_DEV_MEM, a11);
            hashMap.put(com.taobao.android.diagnose.model.b.GL_MEM, a12);
            hashMap.put(com.taobao.android.diagnose.model.b.GRAPHICS_MEM, a13);
            hashMap.put(com.taobao.android.diagnose.model.b.NATIVE_HEAP_USED, a4);
            PageInfo d = this.b.d();
            if (d != null) {
                d.addPageFlags(hashMap);
            }
            return hashMap;
        } catch (Exception e2) {
            e = e2;
            v.a("AppLifecycleObserver", "getRuntimeInfo", e);
            return null;
        }
    }
}
