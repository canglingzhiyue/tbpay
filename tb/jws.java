package tb;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.util.SparseArray;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.util.b;
import com.taobao.android.weex_framework.util.o;
import com.taobao.android.weex_uikit.ui.aa;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes6.dex */
public class jws {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static boolean f29836a;
    private static final Object c;
    private static final Map<Context, SparseArray<jwv>> d;
    private static final WeakHashMap<Context, Boolean> e;
    private static a f;

    static {
        kge.a(-1774264688);
        c = new Object();
        d = new HashMap(4);
        e = new WeakHashMap<>();
    }

    public static Object a(Context context, aa aaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("c2d20974", new Object[]{context, aaVar});
        }
        jwv c2 = c(context, aaVar);
        if (c2 == null) {
            return aaVar.createMountContent(context);
        }
        return c2.a(context, aaVar);
    }

    public static void a(Context context, aa aaVar, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("544745da", new Object[]{context, aaVar, obj});
            return;
        }
        jwv c2 = c(context, aaVar);
        if (c2 == null) {
            return;
        }
        c2.a(obj);
    }

    public static void b(final Context context, final aa aaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f74f53f", new Object[]{context, aaVar});
            return;
        }
        final jwv c2 = c(context, aaVar);
        if (c2 == null) {
            return;
        }
        AsyncTask.THREAD_POOL_EXECUTOR.execute(new o() { // from class: tb.jws.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.weex_framework.util.o
            public void a() throws Exception {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                } else {
                    jwv.this.b(context, aaVar);
                }
            }
        });
    }

    private static jwv c(Context context, aa aaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jwv) ipChange.ipc$dispatch("9462c1dd", new Object[]{context, aaVar});
        }
        if (aaVar.poolSize() == 0) {
            return null;
        }
        synchronized (c) {
            SparseArray<jwv> sparseArray = d.get(context);
            if (sparseArray == null) {
                if (e.containsKey(b.a(context))) {
                    return null;
                }
                c(context);
                sparseArray = new SparseArray<>();
                d.put(context, sparseArray);
            }
            jwv jwvVar = sparseArray.get(aaVar.getTypeId());
            if (jwvVar == null) {
                jwvVar = aaVar.onCreateMountContentPool();
                sparseArray.put(aaVar.getTypeId(), jwvVar);
            }
            return jwvVar;
        }
    }

    private static void c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f76bb9e", new Object[]{context});
        } else if (f != null || f29836a) {
        } else {
            if (Build.VERSION.SDK_INT < 14) {
                throw new RuntimeException("Activity callbacks must be invoked manually below ICS (API level 14)");
            }
            f = new a();
            ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(f);
        }
    }

    /* loaded from: classes6.dex */
    public static class a implements Application.ActivityLifecycleCallbacks {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(571620151);
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

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5e01616c", new Object[]{this, activity});
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dc236bb8", new Object[]{this, activity});
            }
        }

        private a() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cce650e1", new Object[]{this, activity, bundle});
            } else {
                jws.a(activity);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4148cc84", new Object[]{this, activity});
            } else {
                jws.b(activity);
            }
        }
    }

    public static void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{context});
            return;
        }
        synchronized (c) {
            if (d.containsKey(context)) {
                throw new IllegalStateException("The MountContentPools has a reference to an activity that has just been created");
            }
        }
    }

    public static void b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9eca0fff", new Object[]{context});
            return;
        }
        synchronized (c) {
            SparseArray<jwv> remove = d.remove(context);
            if (remove != null) {
                remove.clear();
            }
            Iterator<Map.Entry<Context, SparseArray<jwv>>> it = d.entrySet().iterator();
            while (it.hasNext()) {
                if (a(it.next().getKey(), context)) {
                    it.remove();
                }
            }
            e.put(b.a(context), true);
        }
    }

    private static boolean a(Context context, Context context2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a528d36c", new Object[]{context, context2})).booleanValue();
        }
        while (context instanceof ContextWrapper) {
            context = ((ContextWrapper) context).getBaseContext();
            if (context == context2) {
                return true;
            }
        }
        return false;
    }
}
