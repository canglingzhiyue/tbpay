package tb;

import android.content.Context;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.model.f;
import com.taobao.taolive.sdk.utils.l;
import com.taobao.tbliveinteractive.jsbridge.c;
import com.taobao.tbliveinteractive.jsbridge.e;
import com.taobao.tbliveinteractive.view.DWPenetrateFrameLayout;
import java.util.Map;

/* loaded from: classes8.dex */
public abstract class qmr implements com.taobao.taolive.sdk.model.a, sem {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final String n;

    /* renamed from: a  reason: collision with root package name */
    public ViewGroup f32942a;
    public View b;
    public FrameLayout c;
    public a d;
    public b e;
    public Context f;
    public String h;
    public boolean i;
    public String k;
    public boolean l;
    public Map<String, String> m;
    private String o;
    private e p;
    private com.taobao.alilive.aliliveframework.frame.a q;
    public f j = new f(this);
    public long g = qne.m() * 1000;

    /* loaded from: classes8.dex */
    public interface a {
        void a(View view);

        void a(String str, String str2);
    }

    /* loaded from: classes8.dex */
    public interface b {
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        }
    }

    public abstract void b(String str);

    public abstract void d();

    public boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public abstract void f();

    public abstract void g();

    public void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
        }
    }

    public void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6076ef3", new Object[]{this});
        }
    }

    static {
        kge.a(-1928789513);
        kge.a(-1905361424);
        kge.a(-1972053169);
        n = qmr.class.getSimpleName();
    }

    public void a(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7475d9", new Object[]{this, cVar});
            return;
        }
        e eVar = this.p;
        if (eVar != null) {
            eVar.a(cVar);
        }
        if (e.c() == null) {
            return;
        }
        e.c().a(cVar);
    }

    public void a(com.taobao.tbliveinteractive.jsbridge.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c738d1b", new Object[]{this, aVar});
            return;
        }
        e eVar = this.p;
        if (eVar != null) {
            eVar.a(aVar);
        }
        if (e.c() == null) {
            return;
        }
        e.c().a(aVar);
    }

    @Override // tb.sem
    public e a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (e) ipChange.ipc$dispatch("a55c7557", new Object[]{this}) : this.p;
    }

    public void a(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c755e97", new Object[]{this, eVar});
        } else {
            this.p = eVar;
        }
    }

    public qmr(Context context, ViewGroup viewGroup, Map<String, String> map, String str, boolean z) {
        this.f = context;
        this.f32942a = viewGroup;
        this.k = str;
        this.l = z;
        this.m = map;
        d();
    }

    public void a(View view) {
        int i;
        int i2;
        int i3;
        boolean z;
        int i4;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        IpChange ipChange = $ipChange;
        int i5 = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9501e36a", new Object[]{this, view});
            return;
        }
        this.b = view;
        if (this.b == null || this.f32942a == null) {
            return;
        }
        Map<String, String> map = this.m;
        if (map != null) {
            i5 = com.taobao.taolive.sdk.utils.b.a((int) l.c(map.get("x")));
            i = com.taobao.taolive.sdk.utils.b.a((int) l.c(this.m.get("y")));
            i2 = com.taobao.taolive.sdk.utils.b.a((int) l.c(this.m.get("width")));
            i3 = com.taobao.taolive.sdk.utils.b.a((int) l.c(this.m.get("height")));
            z = l.d(this.m.get("modal"));
            i4 = l.a(this.m.get("gravity"));
            if (i2 <= 0) {
                i2 = -1;
            }
            if (i3 <= 0) {
                i3 = -1;
            }
        } else {
            i = 0;
            i2 = -1;
            i3 = -1;
            z = false;
            i4 = 80;
        }
        if (e() || z) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i2, i3);
            if (!qne.C()) {
                layoutParams.leftMargin = i5;
                layoutParams.topMargin = i;
            }
            layoutParams.gravity = 80;
            if (i4 != -1) {
                layoutParams.gravity = i4;
            }
            if (e()) {
                this.c = new DWPenetrateFrameLayout(this.f);
                ((DWPenetrateFrameLayout) this.c).updateDrawingCache(true);
            } else {
                this.c = new FrameLayout(this.f);
            }
            if (z) {
                this.c.setOnClickListener(new View.OnClickListener() { // from class: tb.qmr.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.view.View.OnClickListener
                    public void onClick(View view2) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view2});
                        } else {
                            qmr.this.m();
                        }
                    }
                });
            }
            this.c.addView(this.b, layoutParams);
            this.f32942a.addView(this.c, new ViewGroup.LayoutParams(-1, -1));
            return;
        }
        if (this.f32942a instanceof FrameLayout) {
            marginLayoutParams = new FrameLayout.LayoutParams(i2, i3);
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) marginLayoutParams;
            layoutParams2.gravity = 80;
            if (i4 != -1) {
                layoutParams2.gravity = i4;
            }
            if (!qne.C()) {
                marginLayoutParams.leftMargin = i5;
                marginLayoutParams.topMargin = i;
            }
        } else {
            marginLayoutParams = new ViewGroup.MarginLayoutParams(i2, i3);
            marginLayoutParams.leftMargin = i5;
            marginLayoutParams.topMargin = i;
        }
        this.f32942a.addView(this.b, marginLayoutParams);
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            this.o = str;
        }
    }

    public void a(String str, com.taobao.tbliveinteractive.e eVar, com.taobao.alilive.aliliveframework.frame.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2faf2cf", new Object[]{this, str, eVar, aVar});
        } else {
            this.q = aVar;
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        this.i = true;
        this.j.removeMessages(1000);
        f();
    }

    public String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : this.h;
    }

    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        FrameLayout frameLayout = this.c;
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
        }
        View view = this.b;
        if (view != null) {
            view.setVisibility(8);
        }
        a(false);
    }

    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
            return;
        }
        FrameLayout frameLayout = this.c;
        if (frameLayout != null) {
            frameLayout.setVisibility(0);
        }
        View view = this.b;
        if (view != null) {
            view.setVisibility(0);
        }
        a(true);
    }

    public View j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("b51e1df3", new Object[]{this});
        }
        FrameLayout frameLayout = this.c;
        return frameLayout != null ? frameLayout : this.b;
    }

    public final void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
            return;
        }
        this.h = str;
        b(str);
        this.i = false;
        this.j.removeMessages(1000);
        this.j.sendEmptyMessageDelayed(1000, this.g);
    }

    @Override // com.taobao.taolive.sdk.model.a
    public void handleMessage(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
        } else if (message.what != 1000 || this.i) {
        } else {
            g();
        }
    }

    public void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6158674", new Object[]{this});
            return;
        }
        f fVar = this.j;
        if (fVar != null) {
            fVar.removeCallbacksAndMessages(null);
        }
        ViewGroup viewGroup = this.f32942a;
        if (viewGroup != null) {
            FrameLayout frameLayout = this.c;
            if (frameLayout != null) {
                viewGroup.removeView(frameLayout);
            }
            View view = this.b;
            if (view != null) {
                this.f32942a.removeView(view);
            }
        }
        this.b = null;
        this.f32942a = null;
        this.c = null;
        this.f = null;
        this.d = null;
        this.e = null;
        this.h = null;
    }

    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("889f10e5", new Object[]{this, aVar});
        } else {
            this.d = aVar;
        }
    }
}
