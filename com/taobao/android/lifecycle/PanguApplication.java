package com.taobao.android.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.compat.ApplicationCompat;
import com.taobao.android.task.Global;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import tb.jqm;
import tb.kge;

/* loaded from: classes.dex */
public class PanguApplication extends ApplicationCompat {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final Handler mAppHandler;
    public WeakReference<Activity> mWeakActivity;
    public final List<CrossActivityLifecycleCallback> mCrossActivityLifecycleCallbacks = new CopyOnWriteArrayList();
    public final AtomicInteger mCreationCount = new AtomicInteger();
    public final AtomicInteger mStartCount = new AtomicInteger();

    /* loaded from: classes.dex */
    public interface CrossActivityLifecycleCallback {
        void onCreated(Activity activity);

        void onDestroyed(Activity activity);

        void onStarted(Activity activity);

        void onStopped(Activity activity);
    }

    public static /* synthetic */ Object ipc$super(PanguApplication panguApplication, String str, Object... objArr) {
        if (str.hashCode() == 413640386) {
            super.onCreate();
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public void resetState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dd02409", new Object[]{this});
            return;
        }
        this.mCreationCount.decrementAndGet();
        this.mStartCount.decrementAndGet();
    }

    public void registerCrossActivityLifecycleCallback(CrossActivityLifecycleCallback crossActivityLifecycleCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f0cdfb2", new Object[]{this, crossActivityLifecycleCallback});
        } else if (crossActivityLifecycleCallback == null) {
            new RuntimeException("registerCrossActivityLifecycleCallback must not be null").fillInStackTrace();
            String str = "Called: " + this;
        } else {
            this.mCrossActivityLifecycleCallbacks.add(crossActivityLifecycleCallback);
            if (this.mCreationCount.get() > 0) {
                mAppHandler.post(new b(crossActivityLifecycleCallback, "onCreated"));
            }
            if (this.mStartCount.get() <= 0) {
                return;
            }
            mAppHandler.post(new b(crossActivityLifecycleCallback, "onStarted"));
        }
    }

    public void unregisterCrossActivityLifecycleCallback(CrossActivityLifecycleCallback crossActivityLifecycleCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("317b074b", new Object[]{this, crossActivityLifecycleCallback});
        } else {
            this.mCrossActivityLifecycleCallbacks.remove(crossActivityLifecycleCallback);
        }
    }

    public static void runOnUiThread(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec6b7f2d", new Object[]{runnable});
        } else {
            mAppHandler.post(runnable);
        }
    }

    @Override // android.app.Application
    public void onCreate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18a7a6c2", new Object[]{this});
            return;
        }
        super.onCreate();
        jqm.a(this);
        registerActivityLifecycleCallbacks(new a());
        try {
            Global.setContext(getApplicationContext());
        } catch (Throwable unused) {
        }
    }

    static {
        kge.a(-382907587);
        mAppHandler = new Handler(Looper.getMainLooper());
    }

    /* loaded from: classes5.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private CrossActivityLifecycleCallback b;
        private String c;

        static {
            kge.a(-1757237836);
            kge.a(-1390502639);
        }

        public b(CrossActivityLifecycleCallback crossActivityLifecycleCallback, String str) {
            this.b = crossActivityLifecycleCallback;
            this.c = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            Activity activity;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            if (PanguApplication.this.mWeakActivity != null && (activity = PanguApplication.this.mWeakActivity.get()) != null && this.b != null) {
                if ("onCreated".equals(this.c)) {
                    this.b.onCreated(activity);
                } else if ("onStarted".equals(this.c)) {
                    this.b.onStarted(activity);
                }
            }
            this.b = null;
            this.c = null;
        }
    }

    /* loaded from: classes.dex */
    public class a implements Application.ActivityLifecycleCallbacks {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-1273106228);
            kge.a(-1894394539);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a4658a75", new Object[]{this, activity});
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3e8abf42", new Object[]{this, activity});
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2c9c12a", new Object[]{this, activity, bundle});
            }
        }

        public a() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cce650e1", new Object[]{this, activity, bundle});
                return;
            }
            String str = "CrossActivityLifecycleCallbacks internal:" + PanguApplication.this.mCrossActivityLifecycleCallbacks.size() + " " + PanguApplication.this.mCrossActivityLifecycleCallbacks.toString();
            PanguApplication.this.mWeakActivity = new WeakReference<>(activity);
            if (PanguApplication.this.mCreationCount.getAndIncrement() != 0 || PanguApplication.this.mCrossActivityLifecycleCallbacks.isEmpty()) {
                return;
            }
            for (CrossActivityLifecycleCallback crossActivityLifecycleCallback : PanguApplication.this.mCrossActivityLifecycleCallbacks) {
                try {
                    crossActivityLifecycleCallback.onCreated(activity);
                } catch (Exception unused) {
                }
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5e01616c", new Object[]{this, activity});
            } else if (PanguApplication.this.mStartCount.getAndIncrement() == 0 && !PanguApplication.this.mCrossActivityLifecycleCallbacks.isEmpty()) {
                for (CrossActivityLifecycleCallback crossActivityLifecycleCallback : PanguApplication.this.mCrossActivityLifecycleCallbacks) {
                    try {
                        crossActivityLifecycleCallback.onStarted(activity);
                    } catch (Exception unused) {
                    }
                }
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dc236bb8", new Object[]{this, activity});
            } else if (PanguApplication.this.mStartCount.decrementAndGet() == 0 && !PanguApplication.this.mCrossActivityLifecycleCallbacks.isEmpty()) {
                for (CrossActivityLifecycleCallback crossActivityLifecycleCallback : PanguApplication.this.mCrossActivityLifecycleCallbacks) {
                    try {
                        crossActivityLifecycleCallback.onStopped(activity);
                    } catch (Exception unused) {
                    }
                }
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4148cc84", new Object[]{this, activity});
            } else if (PanguApplication.this.mCreationCount.decrementAndGet() == 0 && !PanguApplication.this.mCrossActivityLifecycleCallbacks.isEmpty()) {
                for (CrossActivityLifecycleCallback crossActivityLifecycleCallback : PanguApplication.this.mCrossActivityLifecycleCallbacks) {
                    try {
                        crossActivityLifecycleCallback.onDestroyed(activity);
                    } catch (Exception unused) {
                    }
                }
            }
        }
    }
}
