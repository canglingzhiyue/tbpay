package tb;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.SystemClock;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tcrash.JvmUncaughtCrashListener;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes6.dex */
public class jep implements JvmUncaughtCrashListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final jdy f29505a;
    private final List<WeakReference<? extends Activity>> b = new ArrayList();
    private int c = 0;
    private final long d = SystemClock.uptimeMillis();
    private long e = 0;
    private long f = 0;
    private int g = 0;

    public static /* synthetic */ int a(jep jepVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ef39d016", new Object[]{jepVar})).intValue();
        }
        int i = jepVar.c;
        jepVar.c = i + 1;
        return i;
    }

    public static /* synthetic */ long a(jep jepVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f800aaf5", new Object[]{jepVar, new Long(j)})).longValue();
        }
        jepVar.f = j;
        return j;
    }

    public static /* synthetic */ int b(jep jepVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ddbcd697", new Object[]{jepVar})).intValue();
        }
        int i = jepVar.g;
        jepVar.g = i + 1;
        return i;
    }

    public static /* synthetic */ long b(jep jepVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d9de7494", new Object[]{jepVar, new Long(j)})).longValue();
        }
        jepVar.e = j;
        return j;
    }

    public static /* synthetic */ int c(jep jepVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("cc3fdd18", new Object[]{jepVar})).intValue() : jepVar.g;
    }

    public static /* synthetic */ int d(jep jepVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bac2e399", new Object[]{jepVar})).intValue();
        }
        int i = jepVar.g;
        jepVar.g = i - 1;
        return i;
    }

    public static /* synthetic */ long e(jep jepVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a945ea1b", new Object[]{jepVar})).longValue() : jepVar.e;
    }

    public static /* synthetic */ long f(jep jepVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("97c8f09c", new Object[]{jepVar})).longValue() : jepVar.f;
    }

    public static /* synthetic */ List g(jep jepVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("d84983fe", new Object[]{jepVar}) : jepVar.b;
    }

    public static /* synthetic */ int h(jep jepVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("74cefd9d", new Object[]{jepVar})).intValue();
        }
        int i = jepVar.c;
        jepVar.c = i - 1;
        return i;
    }

    public jep(jdy jdyVar) {
        this.f29505a = jdyVar;
        a();
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            this.f29505a.a().registerActivityLifecycleCallbacks(new Application.ActivityLifecycleCallbacks() { // from class: tb.jep.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

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
                public void onActivityCreated(Activity activity, Bundle bundle) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("cce650e1", new Object[]{this, activity, bundle});
                    } else {
                        jep.a(jep.this);
                    }
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityStarted(Activity activity) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5e01616c", new Object[]{this, activity});
                        return;
                    }
                    jep.b(jep.this);
                    if (jep.c(jep.this) != 1) {
                        return;
                    }
                    jep.a(jep.this, SystemClock.uptimeMillis());
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityStopped(Activity activity) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("dc236bb8", new Object[]{this, activity});
                        return;
                    }
                    if (jep.c(jep.this) > 0) {
                        jep.d(jep.this);
                    }
                    if (jep.c(jep.this) != 0) {
                        return;
                    }
                    jep jepVar = jep.this;
                    jep.b(jepVar, jep.e(jepVar) + (SystemClock.uptimeMillis() - jep.f(jep.this)));
                    jep.a(jep.this, 0L);
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityDestroyed(Activity activity) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("4148cc84", new Object[]{this, activity});
                        return;
                    }
                    jep.g(jep.this).add(new WeakReference(activity));
                    jep.h(jep.this);
                }
            });
        }
    }

    @Override // com.taobao.android.tcrash.JvmUncaughtCrashListener
    public Map<String, Object> onJvmUncaughtCrash(Thread thread, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("d9b5b942", new Object[]{this, thread, th});
        }
        HashMap hashMap = new HashMap();
        for (WeakReference<? extends Activity> weakReference : this.b) {
            Activity activity = weakReference.get();
            if (activity != null) {
                String simpleName = activity.getClass().getSimpleName();
                Integer num = (Integer) hashMap.get(simpleName);
                if (num == null) {
                    hashMap.put(simpleName, 1);
                } else {
                    try {
                        hashMap.put(simpleName, Integer.valueOf(num.intValue() + 1));
                    } catch (Exception e) {
                        jfj.b(e);
                    }
                }
            }
        }
        ArrayList arrayList = new ArrayList(hashMap.entrySet());
        Collections.sort(arrayList, $$Lambda$jep$qqlLy0gFoe3LShl28LmAssXZuPs.INSTANCE);
        String obj = arrayList.toString();
        HashMap hashMap2 = new HashMap();
        hashMap2.put("leaked activities", obj);
        hashMap2.put("launch duration", Long.valueOf(SystemClock.uptimeMillis() - this.d));
        if (this.f != 0) {
            hashMap2.put("visible duration", Long.valueOf(this.e + (SystemClock.uptimeMillis() - this.f)));
        } else {
            hashMap2.put("visible duration", Long.valueOf(this.e));
        }
        hashMap2.put("visit activity count", Integer.valueOf(this.b.size()));
        hashMap2.put("activity stack depth", Integer.valueOf(this.c));
        return hashMap2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int a(Map.Entry entry, Map.Entry entry2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("f17356bb", new Object[]{entry, entry2})).intValue() : ((Integer) entry2.getValue()).compareTo((Integer) entry.getValue());
    }
}
