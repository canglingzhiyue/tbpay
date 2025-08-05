package tb;

import android.app.Activity;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.Window;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavix.e;
import com.taobao.android.behavix.utils.b;
import com.taobao.android.external.d;
import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.Map;
import tb.iwp;

/* loaded from: classes4.dex */
public class dsi extends GestureDetector.SimpleOnGestureListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static String f26941a;
    private static final Map<String, String> b;

    public static /* synthetic */ Object ipc$super(dsi dsiVar, String str, Object... objArr) {
        if (str.hashCode() == 1575121015) {
            return new Boolean(super.onSingleTapUp((MotionEvent) objArr[0]));
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str});
        }
        f26941a = str;
        return str;
    }

    public static /* synthetic */ Map a(dsi dsiVar, float f, float f2, float f3, float f4, String str, float f5, long j, long j2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("7a94b14d", new Object[]{dsiVar, new Float(f), new Float(f2), new Float(f3), new Float(f4), str, new Float(f5), new Long(j), new Long(j2)}) : dsiVar.a(f, f2, f3, f4, str, f5, j, j2);
    }

    public static /* synthetic */ Map c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("3b696c1f", new Object[0]) : b;
    }

    static {
        kge.a(-1613749737);
        f26941a = "unknown";
        b = new HashMap();
    }

    public static String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[0]) : f26941a;
    }

    public static synchronized Map<String, String> b() {
        synchronized (dsi.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("6dbf0a5e", new Object[0]);
            }
            return a((d) null);
        }
    }

    public static synchronized Map<String, String> a(d dVar) {
        synchronized (dsi.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("1d4f893b", new Object[]{dVar});
            }
            HashMap hashMap = new HashMap(b);
            if (dVar != null) {
                hashMap.put("cardX", String.valueOf((int) dVar.a()));
                hashMap.put("cardY", String.valueOf((int) dVar.b()));
                hashMap.put("cardW", String.valueOf((int) dVar.c()));
                hashMap.put("cardH", String.valueOf((int) dVar.d()));
                hashMap.put("cardPosition", a(dVar.f12313a + (dVar.c / 2.0f), dVar.b + (dVar.d / 2.0f), false));
            }
            return hashMap;
        }
    }

    public static void a(Activity activity, GestureDetector gestureDetector, ScaleGestureDetector scaleGestureDetector) {
        Window window;
        Window.Callback callback;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a661432e", new Object[]{activity, gestureDetector, scaleGestureDetector});
            return;
        }
        iwp.a().b();
        if (gestureDetector == null || activity == null || (window = activity.getWindow()) == null || (callback = window.getCallback()) == null) {
            return;
        }
        try {
            window.setCallback((Window.Callback) Proxy.newProxyInstance(activity.getClass().getClassLoader(), new Class[]{Window.Callback.class}, new dsl(callback, gestureDetector, scaleGestureDetector)));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5de27077", new Object[]{this, motionEvent})).booleanValue();
        }
        if (motionEvent == null) {
            return false;
        }
        float rawX = motionEvent.getRawX();
        float rawY = motionEvent.getRawY();
        float a2 = dro.a(rawX);
        float a3 = dro.a(rawY);
        synchronized (dsi.class) {
            b.put("lastTapX", String.valueOf((int) a2));
            b.put("lastTapY", String.valueOf((int) a3));
            b.put("lastTapPosition", a(a2, a3));
        }
        return super.onSingleTapUp(motionEvent);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onFling(final MotionEvent motionEvent, final MotionEvent motionEvent2, float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f2b37f32", new Object[]{this, motionEvent, motionEvent2, new Float(f), new Float(f2)})).booleanValue();
        }
        if (motionEvent != null && motionEvent2 != null) {
            dsc.a(new b("GestureObserve") { // from class: tb.dsi.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* JADX WARN: Code restructure failed: missing block: B:18:0x0062, code lost:
                    r7 = "left";
                 */
                @Override // com.taobao.android.behavix.utils.b
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public void a() {
                    /*
                        Method dump skipped, instructions count: 234
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: tb.dsi.AnonymousClass1.a():void");
                }
            });
        }
        return false;
    }

    private Map<String, String> a(float f, float f2, float f3, float f4, String str, float f5, long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("a59d5483", new Object[]{this, new Float(f), new Float(f2), new Float(f3), new Float(f4), str, new Float(f5), new Long(j), new Long(j2)});
        }
        float a2 = dro.a(f);
        float a3 = dro.a(f2);
        float a4 = dro.a(f3);
        float a5 = dro.a(f4);
        HashMap hashMap = new HashMap();
        iwp.a c = iwp.a().c();
        hashMap.put("pageName", e.a());
        hashMap.put("slideDirection", str);
        hashMap.put("speed", String.valueOf(f5));
        hashMap.put("slideHands", f26941a);
        hashMap.put("x1", String.valueOf((int) a2));
        hashMap.put("y1", String.valueOf((int) a4));
        hashMap.put("x2", String.valueOf((int) a3));
        hashMap.put("y2", String.valueOf((int) a5));
        hashMap.put("startTouchPosition", a(a2, a4));
        hashMap.put("endTouchPosition", a(a3, a5));
        hashMap.put("duration", String.valueOf(j));
        hashMap.put("roll", String.valueOf((int) c.c));
        hashMap.put("yaw", String.valueOf((int) c.f29384a));
        hashMap.put("pitch", String.valueOf((int) c.b));
        hashMap.put("screenW", String.valueOf((int) dro.a(dro.k())));
        hashMap.put("screenH", String.valueOf((int) dro.a(dro.n())));
        hashMap.put("time", String.valueOf(j2));
        return hashMap;
    }

    public static float d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("596b2db", new Object[0])).floatValue() : dro.a(dro.k()) / 4.0f;
    }

    public static float e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5a4ca5c", new Object[0])).floatValue() : dro.a(dro.n()) / 9.0f;
    }

    public static String a(float f, float f2, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e223e4b4", new Object[]{new Float(f), new Float(f2), new Boolean(z)}) : b(dro.a(f), dro.a(f2), z);
    }

    private static String a(float f, float f2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e0ff2738", new Object[]{new Float(f), new Float(f2)}) : b(f, f2, false);
    }

    private static String b(float f, float f2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("665431b5", new Object[]{new Float(f), new Float(f2), new Boolean(z)});
        }
        float a2 = dro.a(dro.k());
        float a3 = dro.a(dro.n());
        float f3 = a2 / 4.0f;
        float f4 = a3 / 9.0f;
        if (f < 0.0f) {
            if (z) {
                return "-3";
            }
            f = 0.0f;
        }
        if (f > a2) {
            if (z) {
                return "-4";
            }
            f = a2;
        }
        if (f2 < 0.0f) {
            if (z) {
                return "-1";
            }
            f2 = 0.0f;
        }
        if (f2 > a3) {
            if (z) {
                return "-2";
            }
            f2 = a3;
        }
        int ceil = (int) Math.ceil(f / f3);
        int ceil2 = (int) Math.ceil(f2 / f4);
        if (ceil <= 0) {
            ceil = 1;
        }
        if (ceil2 <= 0) {
            ceil2 = 1;
        }
        return String.valueOf(((ceil2 - 1) << 2) + ceil);
    }

    public static String a(float f, float f2, float f3, float f4) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f0fee938", new Object[]{new Float(f), new Float(f2), new Float(f3), new Float(f4)}) : Math.abs(f3 - f) > Math.abs(f4 - f2) ? f3 > f ? "right" : "left" : f4 > f2 ? "up" : "down";
    }
}
