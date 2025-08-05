package tb;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Process;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavix.behavixswitch.a;
import com.taobao.android.behavix.utils.b;
import com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.e;
import java.util.Arrays;
import java.util.HashMap;

/* loaded from: classes.dex */
public class dsc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static HandlerThread f26934a;
    private static Handler b;
    private static int c;

    public static /* synthetic */ int a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a821938e", new Object[]{new Integer(i)})).intValue();
        }
        c = i;
        return i;
    }

    public static /* synthetic */ int b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dc", new Object[0])).intValue() : c;
    }

    static {
        kge.a(802935023);
        HandlerThread handlerThread = new HandlerThread("bhx_action");
        f26934a = handlerThread;
        handlerThread.start();
        b = new Handler(f26934a.getLooper());
    }

    public static int a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[0])).intValue() : c;
    }

    public static void a(final Runnable runnable, final String str, final String str2, final String str3, final String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f83ca5b", new Object[]{runnable, str, str2, str3, strArr});
        } else {
            b.post(new Runnable() { // from class: tb.dsc.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    if (dsc.b() == 0) {
                        dsc.a(Process.myTid());
                    }
                    try {
                        dro.a(Thread.currentThread().getName(), str2);
                        long nanoTime = System.nanoTime();
                        runnable.run();
                        long nanoTime2 = System.nanoTime() - nanoTime;
                        if (!a.b.p()) {
                            return;
                        }
                        String e = dro.e(str);
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("cost", (Object) Long.valueOf(nanoTime2));
                        jSONObject.put("scene", (Object) e);
                        jSONObject.put("actionType", (Object) str2);
                        AppMonitor.Counter.commit("BehaviX", "bx_native_task", jSONObject.toJSONString(), 1.0d);
                    } catch (Throwable th) {
                        dsc.a(th, str, str3, str2, strArr);
                    }
                }
            });
        }
    }

    public static void a(Throwable th, String str, String str2, String str3, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59022894", new Object[]{th, str, str2, str3, strArr});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("actionType", str3);
        hashMap.put("actionName", str2);
        if (strArr != null && strArr.length > 0) {
            hashMap.put(e.BIZ_ARGS, Arrays.toString(strArr));
        }
        dsb.a("exception", str, hashMap, th);
    }

    public static void a(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae9b3e4c", new Object[]{bVar});
        } else {
            b.post(bVar);
        }
    }

    public static void b(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b3b694d", new Object[]{bVar});
        } else {
            b.postAtFrontOfQueue(bVar);
        }
    }

    public static void a(b bVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24cd01f8", new Object[]{bVar, new Long(j)});
        } else {
            b.postDelayed(bVar, j);
        }
    }

    public static Handler c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Handler) ipChange.ipc$dispatch("a819f71c", new Object[0]) : b;
    }
}
