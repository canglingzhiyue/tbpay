package tb;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.PopupWindow;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.family.globalbubble.affection.a;
import com.taobao.family.globalbubble.c;
import com.taobao.family.globalbubble.h;
import com.taobao.family.globalbubble2.view.b;
import java.lang.ref.WeakReference;
import java.util.List;

/* loaded from: classes7.dex */
public class xmw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final h f34388a;
    private b b;
    private List<Object> d;
    private xmx f;
    private View c = null;
    private boolean e = false;

    public static /* synthetic */ h a(xmw xmwVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (h) ipChange.ipc$dispatch("771ec44f", new Object[]{xmwVar}) : xmwVar.f34388a;
    }

    public static /* synthetic */ xmx b(xmw xmwVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (xmx) ipChange.ipc$dispatch("2d101cec", new Object[]{xmwVar}) : xmwVar.f;
    }

    public static /* synthetic */ List c(xmw xmwVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("a21a32cf", new Object[]{xmwVar}) : xmwVar.d;
    }

    public static /* synthetic */ b d(xmw xmwVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("d03ec750", new Object[]{xmwVar}) : xmwVar.b;
    }

    public static /* synthetic */ Activity e(xmw xmwVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Activity) ipChange.ipc$dispatch("79b3d6e", new Object[]{xmwVar}) : xmwVar.b();
    }

    public xmw(Context context, h hVar) {
        this.f34388a = hVar;
        if (hVar instanceof a) {
            this.b = new com.taobao.family.globalbubble2.view.a(context);
        }
    }

    public View a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("195fbaaa", new Object[]{this});
        }
        b bVar = this.b;
        if (bVar == null) {
            return null;
        }
        if (this.c == null) {
            this.c = bVar.a();
        }
        c();
        this.b.a(new xmx() { // from class: tb.xmw.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.xmx
            public void a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    return;
                }
                xmw.a(xmw.this).h();
                if (xmw.b(xmw.this) == null) {
                    return;
                }
                xmw.b(xmw.this).a();
            }
        });
        if (this.e) {
            this.c.post(new Runnable() { // from class: tb.xmw.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        xmw.d(xmw.this).a(xmw.c(xmw.this));
                    }
                }
            });
        }
        return this.c;
    }

    public void a(final List<Object> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
        } else if (this.b == null) {
        } else {
            View view = this.c;
            if (view == null) {
                this.e = true;
                this.d = list;
                return;
            }
            this.e = false;
            this.d = null;
            view.post(new Runnable() { // from class: tb.xmw.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        xmw.d(xmw.this).a(list);
                    }
                }
            });
        }
    }

    public void a(xmx xmxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79207d5", new Object[]{this, xmxVar});
        } else {
            this.f = xmxVar;
        }
    }

    private Activity b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("233c125f", new Object[]{this});
        }
        WeakReference<Activity> b = c.a().b();
        if (b == null) {
            return null;
        }
        return b.get();
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else if (!(this.f34388a.a() instanceof PopupWindow)) {
        } else {
            ((PopupWindow) this.f34388a.a()).setTouchInterceptor(new View.OnTouchListener() { // from class: tb.xmw.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnTouchListener
                public boolean onTouch(View view, MotionEvent motionEvent) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("d4aa3aa4", new Object[]{this, view, motionEvent})).booleanValue();
                    }
                    if (xmw.d(xmw.this) == null) {
                        return false;
                    }
                    if (xmw.d(xmw.this).a(view, motionEvent)) {
                        return true;
                    }
                    MotionEvent obtain = MotionEvent.obtain(motionEvent.getDownTime(), motionEvent.getEventTime(), motionEvent.getAction(), motionEvent.getRawX(), motionEvent.getRawY(), motionEvent.getMetaState());
                    Activity e = xmw.e(xmw.this);
                    if (e != null && !e.isFinishing()) {
                        try {
                            return e.dispatchTouchEvent(obtain);
                        } catch (Throwable unused) {
                        }
                    }
                    return false;
                }
            });
        }
    }
}
