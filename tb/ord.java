package tb;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.application.common.a;
import com.taobao.application.common.c;
import com.taobao.tao.TBMainHost;
import com.taobao.tao.log.TLog;
import com.taobao.tao.navigation.e;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public class ord {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static WeakReference<Activity> f32317a;

    static {
        kge.a(562099008);
    }

    public static /* synthetic */ WeakReference a(WeakReference weakReference) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeakReference) ipChange.ipc$dispatch("ad2eef04", new Object[]{weakReference});
        }
        f32317a = weakReference;
        return weakReference;
    }

    public static Activity a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("2162bf40", new Object[0]);
        }
        WeakReference<Activity> weakReference = f32317a;
        Activity activity = weakReference == null ? null : weakReference.get();
        a(activity);
        return activity;
    }

    public static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[0]);
            return;
        }
        c();
        d();
    }

    private static void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[0]);
        } else {
            c.a(new a.InterfaceC0630a() { // from class: tb.ord.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

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
                    }
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityCreated(Activity activity, Bundle bundle) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("cce650e1", new Object[]{this, activity, bundle});
                        return;
                    }
                    ord.a(new WeakReference(activity));
                    TLog.loge("home", "GlobalTrace", "setCurrentActivity:" + activity.getComponentName().getClassName());
                }
            }, false);
        }
    }

    private static void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[0]);
        } else {
            e.a(new FragmentManager.FragmentLifecycleCallbacks() { // from class: tb.ord.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.support.v4.app.FragmentManager.FragmentLifecycleCallbacks
                public void onFragmentActivityCreated(FragmentManager fragmentManager, Fragment fragment, Bundle bundle) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8d29eae4", new Object[]{this, fragmentManager, fragment, bundle});
                    }
                }

                @Override // android.support.v4.app.FragmentManager.FragmentLifecycleCallbacks
                public void onFragmentAttached(FragmentManager fragmentManager, Fragment fragment, Context context) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("c6cd07a1", new Object[]{this, fragmentManager, fragment, context});
                    }
                }

                @Override // android.support.v4.app.FragmentManager.FragmentLifecycleCallbacks
                public void onFragmentCreated(FragmentManager fragmentManager, Fragment fragment, Bundle bundle) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("25b551f3", new Object[]{this, fragmentManager, fragment, bundle});
                    }
                }

                @Override // android.support.v4.app.FragmentManager.FragmentLifecycleCallbacks
                public void onFragmentDestroyed(FragmentManager fragmentManager, Fragment fragment) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("849789f0", new Object[]{this, fragmentManager, fragment});
                    }
                }

                @Override // android.support.v4.app.FragmentManager.FragmentLifecycleCallbacks
                public void onFragmentDetached(FragmentManager fragmentManager, Fragment fragment) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("9620caf9", new Object[]{this, fragmentManager, fragment});
                    }
                }

                @Override // android.support.v4.app.FragmentManager.FragmentLifecycleCallbacks
                public void onFragmentPaused(FragmentManager fragmentManager, Fragment fragment) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("a67b96fd", new Object[]{this, fragmentManager, fragment});
                    }
                }

                @Override // android.support.v4.app.FragmentManager.FragmentLifecycleCallbacks
                public void onFragmentPreAttached(FragmentManager fragmentManager, Fragment fragment, Context context) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("9df7866", new Object[]{this, fragmentManager, fragment, context});
                    }
                }

                @Override // android.support.v4.app.FragmentManager.FragmentLifecycleCallbacks
                public void onFragmentPreCreated(FragmentManager fragmentManager, Fragment fragment, Bundle bundle) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7b3804ce", new Object[]{this, fragmentManager, fragment, bundle});
                    }
                }

                @Override // android.support.v4.app.FragmentManager.FragmentLifecycleCallbacks
                public void onFragmentResumed(FragmentManager fragmentManager, Fragment fragment) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("a3c316b2", new Object[]{this, fragmentManager, fragment});
                    }
                }

                @Override // android.support.v4.app.FragmentManager.FragmentLifecycleCallbacks
                public void onFragmentSaveInstanceState(FragmentManager fragmentManager, Fragment fragment, Bundle bundle) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("e7a5ac4a", new Object[]{this, fragmentManager, fragment, bundle});
                    }
                }

                @Override // android.support.v4.app.FragmentManager.FragmentLifecycleCallbacks
                public void onFragmentStarted(FragmentManager fragmentManager, Fragment fragment) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("e3c68848", new Object[]{this, fragmentManager, fragment});
                    }
                }

                @Override // android.support.v4.app.FragmentManager.FragmentLifecycleCallbacks
                public void onFragmentStopped(FragmentManager fragmentManager, Fragment fragment) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("38ba127c", new Object[]{this, fragmentManager, fragment});
                    }
                }

                @Override // android.support.v4.app.FragmentManager.FragmentLifecycleCallbacks
                public void onFragmentViewCreated(FragmentManager fragmentManager, Fragment fragment, View view, Bundle bundle) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("b21da648", new Object[]{this, fragmentManager, fragment, view, bundle});
                    }
                }

                @Override // android.support.v4.app.FragmentManager.FragmentLifecycleCallbacks
                public void onFragmentViewDestroyed(FragmentManager fragmentManager, Fragment fragment) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("88b15f75", new Object[]{this, fragmentManager, fragment});
                    }
                }
            });
        }
    }

    private static void a(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68a25ba", new Object[]{activity});
            return;
        }
        try {
            if (activity == null) {
                TLog.loge("home", "GlobalTrace", "getCurrentActivity error, activity is null");
            } else if (TBMainHost.a(activity) != null) {
            } else {
                TLog.loge("home", "GlobalTrace", "getCurrentActivity:" + activity.getLocalClassName());
            }
        } catch (Throwable th) {
            TLog.loge("home", "GlobalTrace", "getCurrentActivity error", th);
        }
    }
}
