package tb;

import android.os.Build;
import android.os.Looper;
import android.view.Choreographer;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx_v4.animation.util.c;
import com.taobao.android.dinamicx_v4.responsive.impl.b;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import tb.gbp;
import tb.ggz;

/* loaded from: classes5.dex */
public class gbn implements Runnable, gbp.a, gbp.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private WeakReference<DXWidgetNode> f28289a;
    private final int b;
    private final int c;
    private gfq d;
    private final Class<?> e;
    private gbp f;
    private Choreographer g;
    private a h;
    private byte i = -1;

    static {
        kge.a(-1852856684);
        kge.a(-1390502639);
        kge.a(1133097877);
        kge.a(520241597);
    }

    public gbn(byte b, int i, int i2) {
        this.b = i;
        this.c = i2;
        if (b == 0 || b == 1) {
            this.e = Float.class;
        } else {
            this.e = Object.class;
        }
    }

    public void a(DXWidgetNode dXWidgetNode, gfq gfqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22e78a85", new Object[]{this, dXWidgetNode, gfqVar});
            return;
        }
        this.f28289a = new WeakReference<>(dXWidgetNode);
        this.d = gfqVar;
    }

    public void a(final byte b) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8217954", new Object[]{this, new Byte(b)});
        } else if (this.i >= 0) {
        } else {
            if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
                fxe.c(new Runnable() { // from class: tb.gbn.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            gbn.this.a(b);
                        }
                    }
                });
                return;
            }
            if (this.f == null) {
                b = 0;
            }
            this.i = b;
            if (Build.VERSION.SDK_INT < 16) {
                fxe.a(this);
                return;
            }
            if (this.g == null) {
                this.g = Choreographer.getInstance();
            }
            if (this.h == null) {
                this.h = new a();
            }
            this.g.postFrameCallback(this.h);
        }
    }

    public DXWidgetNode a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("d7f6b987", new Object[]{this});
        }
        WeakReference<DXWidgetNode> weakReference = this.f28289a;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public List<gbm> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("4a17df3e", new Object[]{this});
        }
        gfq gfqVar = this.d;
        ArrayList arrayList = null;
        if (gfqVar == null) {
            return null;
        }
        List<b> c = gfqVar.c();
        if (c != null && !c.isEmpty()) {
            arrayList = new ArrayList();
            for (b bVar : c) {
                WeakReference<DXWidgetNode> a2 = bVar.a();
                Collection<String> b = bVar.b();
                if (a2 != null && b != null && !b.isEmpty()) {
                    arrayList.add(new gbm(a2, new ArrayList(b)));
                }
            }
        }
        return arrayList;
    }

    public gbp a(gbq gbqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (gbp) ipChange.ipc$dispatch("9cb4a7cf", new Object[]{this, gbqVar});
        }
        gbp a2 = gbqVar.a();
        a2.a((gbp.a) this);
        a2.a((gbp.b) this);
        return a2;
    }

    public void a(Object obj, gbq gbqVar) {
        List<gbm> b;
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9047dfe", new Object[]{this, obj, gbqVar});
            return;
        }
        if (obj != null && !obj.equals(this.f.b())) {
            z = true;
        }
        if (gbqVar != null && !gbqVar.equals(this.f.c())) {
            this.f = a(gbqVar);
            z = true;
        }
        if (!z || (b = b()) == null || b.isEmpty()) {
            return;
        }
        if (obj != null) {
            this.f.a((gbp) obj);
        }
        this.f.a(b);
        this.f.d();
    }

    @Override // java.lang.Runnable
    public void run() {
        DXWidgetNode a2;
        Object J;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
        } else if (this.i < 0 || (a2 = a()) == null) {
        } else {
            byte b = this.i;
            gbq gbqVar = null;
            if (b == 1 || b == 0) {
                ggz.a a3 = ggv.a(a2, this.b);
                if (a3 == null || !a3.f28327a) {
                    return;
                }
                if (this.e == Float.class) {
                    J = Float.valueOf(a3.c.C());
                } else {
                    J = a3.c.J();
                }
            } else {
                J = null;
            }
            byte b2 = this.i;
            if (b2 == 2 || b2 == 0) {
                int i = this.c;
                if (i < 0) {
                    gbqVar = com.taobao.android.dinamicx_v4.animation.util.b.a(null, this.e);
                } else {
                    ggz.a a4 = ggv.a(a2, i);
                    if (a4 == null || !a4.f28327a || !a4.c.p()) {
                        return;
                    }
                    gbqVar = com.taobao.android.dinamicx_v4.animation.util.b.a(a4.c.r(), this.e);
                }
            }
            if (this.f == null) {
                if (J == null || gbqVar == null) {
                    return;
                }
                this.f = a(gbqVar);
            }
            a(J, gbqVar);
            this.i = (byte) -1;
        }
    }

    @Override // tb.gbp.a
    public void a(gbl gblVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9ef2e47", new Object[]{this, gblVar});
        } else {
            c.a(gblVar, false);
        }
    }

    @Override // tb.gbp.a
    public void a(gbl gblVar, boolean z) {
        gbp gbpVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53f74d6d", new Object[]{this, gblVar, new Boolean(z)});
        } else if (z) {
        } else {
            c.a(gblVar, true);
            gfq gfqVar = this.d;
            if (gfqVar == null || (gbpVar = this.f) == null) {
                return;
            }
            gfqVar.a(gbpVar.b());
        }
    }

    @Override // tb.gbp.b
    public Object a(String str, View view, Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("3fddd376", new Object[]{this, str, view, obj}) : c.a(str, view, obj);
    }

    /* loaded from: classes5.dex */
    public class a implements Choreographer.FrameCallback {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-1280209246);
            kge.a(-569788179);
        }

        public a() {
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f46aacbb", new Object[]{this, new Long(j)});
            } else {
                gbn.this.run();
            }
        }
    }
}
