package com.taobao.android.weex_uikit.ui;

import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_uikit.ui.UINode;
import com.taobao.weex.ui.view.gesture.WXGestureType;
import java.util.HashSet;
import java.util.Set;
import tb.kge;

/* loaded from: classes6.dex */
public class n<T extends UINode> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final Handler o;

    /* renamed from: a  reason: collision with root package name */
    public T f16141a;
    private View.OnClickListener i;
    private View.OnLongClickListener j;
    private int b = 0;
    private int c = 2;
    private int d = 4;
    private int e = 8;
    private int f = 16;
    private int g = 32;
    private Set<View.OnClickListener> h = new HashSet();
    private boolean k = false;
    private boolean l = false;
    private boolean m = false;
    private boolean n = false;
    private boolean q = false;
    private Runnable r = new Runnable() { // from class: com.taobao.android.weex_uikit.ui.n.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            n.a(n.this);
            n.a(n.this, true);
        }
    };
    private final Rect p = new Rect();

    public static /* synthetic */ void a(n nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6093be0c", new Object[]{nVar});
        } else {
            nVar.f();
        }
    }

    public static /* synthetic */ boolean a(n nVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b1e4b64c", new Object[]{nVar, new Boolean(z)})).booleanValue();
        }
        nVar.n = z;
        return z;
    }

    static {
        kge.a(1859089096);
        kge.a(939607522);
        o = new Handler(Looper.getMainLooper());
    }

    public n(T t) {
        this.f16141a = t;
    }

    public boolean a(MotionEvent motionEvent, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1de83139", new Object[]{this, motionEvent, view})).booleanValue();
        }
        if (!c() && !d() && !e() && !i()) {
            return false;
        }
        if (this.f16141a.getNodeType() == UINodeType.VIEW) {
            return c(motionEvent);
        }
        if (this.f16141a.getMountContent() instanceof j) {
            if (motionEvent.getAction() == 0) {
                this.q = ((j) this.f16141a.getMountContent()).a(motionEvent);
            }
            if (this.q) {
                if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    this.q = false;
                }
                if (((j) this.f16141a.getMountContent()).a(motionEvent)) {
                    return c(motionEvent, view);
                }
                this.q = false;
                return false;
            } else if (!c() && !d()) {
                return false;
            } else {
                return a(motionEvent);
            }
        } else if (this.f16141a.getMountContent() == null && this.f16141a.getNodeType() != UINodeType.LAYOUT) {
            a();
            return false;
        } else {
            return a(motionEvent);
        }
    }

    private boolean a(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5f37b481", new Object[]{this, motionEvent})).booleanValue();
        }
        if (motionEvent.getAction() != 0 && !h()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.n = false;
            a(true);
            g(true);
            if (d()) {
                o.removeCallbacks(this.r);
                o.postDelayed(this.r, ViewConfiguration.getLongPressTimeout());
            }
            if (this.k && this.f16141a.hasEvent("touchstart")) {
                this.f16141a.fireEvent("touchstart", b(motionEvent));
            }
            return true;
        } else if (action == 1) {
            if (c() && !this.n) {
                g();
            }
            a();
            if (d()) {
                o.removeCallbacks(this.r);
            }
            if (this.m && this.f16141a.hasEvent("touchend")) {
                this.f16141a.fireEvent("touchend", b(motionEvent));
            }
            return true;
        } else if (action != 2) {
            if (action != 3) {
                return false;
            }
            a();
            if (d()) {
                o.removeCallbacks(this.r);
            }
            if (this.m && this.f16141a.hasEvent("touchend")) {
                this.f16141a.fireEvent("touchend", b(motionEvent));
            }
            return true;
        } else {
            this.p.set(0, 0, this.f16141a.getNodeInfo().y(), this.f16141a.getNodeInfo().z());
            boolean contains = this.p.contains((int) motionEvent.getX(), (int) motionEvent.getY());
            if (!contains) {
                a();
                if (d()) {
                    o.removeCallbacks(this.r);
                }
            }
            if (this.l && this.f16141a.hasEvent("touchmove")) {
                this.f16141a.fireEvent("touchmove", b(motionEvent));
            }
            if (!i()) {
                return contains;
            }
            return true;
        }
    }

    private JSONObject b(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("d18cafde", new Object[]{this, motionEvent});
        }
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        jSONObject.put(WXGestureType.GestureInfo.TOUCHES, (Object) jSONArray);
        JSONObject jSONObject2 = new JSONObject();
        float a2 = com.taobao.android.weex_framework.util.i.a(com.taobao.android.weex_framework.m.b(), motionEvent.getRawX());
        float a3 = com.taobao.android.weex_framework.util.i.a(com.taobao.android.weex_framework.m.b(), motionEvent.getRawY());
        float a4 = com.taobao.android.weex_framework.util.i.a(com.taobao.android.weex_framework.m.b(), motionEvent.getX());
        float a5 = com.taobao.android.weex_framework.util.i.a(com.taobao.android.weex_framework.m.b(), motionEvent.getY());
        jSONObject2.put("clientX", (Object) Float.valueOf(a2));
        jSONObject2.put("clientY", (Object) Float.valueOf(a3));
        jSONObject2.put("relativeX", (Object) Float.valueOf(a4));
        jSONObject2.put("relativeY", (Object) Float.valueOf(a5));
        jSONObject2.put(WXGestureType.GestureInfo.PAGE_X, (Object) Float.valueOf(a2));
        jSONObject2.put(WXGestureType.GestureInfo.PAGE_Y, (Object) Float.valueOf(a3));
        jSONArray.add(jSONObject2);
        return jSONObject;
    }

    public boolean b(MotionEvent motionEvent, View view) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f91d758", new Object[]{this, motionEvent, view})).booleanValue() : a(motionEvent, view);
    }

    public void a(View.OnLongClickListener onLongClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7f1d2ed", new Object[]{this, onLongClickListener});
        } else {
            this.j = onLongClickListener;
        }
    }

    public void a(View.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7931bad1", new Object[]{this, onClickListener});
        } else {
            this.h.add(onClickListener);
        }
    }

    public void b(View.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d04fabb0", new Object[]{this, onClickListener});
        } else {
            this.h.remove(onClickListener);
        }
    }

    public void c(View.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("276d9c8f", new Object[]{this, onClickListener});
        } else {
            this.i = onClickListener;
        }
    }

    private void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        View.OnLongClickListener onLongClickListener = this.j;
        if (onLongClickListener == null) {
            return;
        }
        onLongClickListener.onLongClick(null);
    }

    private void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        View.OnClickListener onClickListener = this.i;
        if (onClickListener != null) {
            onClickListener.onClick(null);
        }
        for (View.OnClickListener onClickListener2 : this.h) {
            onClickListener2.onClick(null);
        }
    }

    private boolean c(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("89094503", new Object[]{this, motionEvent})).booleanValue();
        }
        if (this.f16141a.getMountContent() == null) {
            return false;
        }
        try {
            return ((View) this.f16141a.getMountContent()).dispatchTouchEvent(motionEvent);
        } catch (Exception e) {
            com.taobao.android.weex_framework.util.g.a(e);
            return false;
        }
    }

    private boolean c(MotionEvent motionEvent, View view) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("13b7d77", new Object[]{this, motionEvent, view})).booleanValue() : ((j) this.f16141a.getMountContent()).a(motionEvent, view);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        a(false);
        this.n = false;
        g(false);
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.b = z ? this.b | this.f : this.b & (~this.f);
        }
    }

    private boolean h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5cf10f3", new Object[]{this})).booleanValue() : (this.b & this.f) != 0;
    }

    private void g(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b25ee726", new Object[]{this, new Boolean(z)});
        } else if (b() == z) {
        } else {
            this.b = z ? this.b | this.g : this.b & (~this.g);
        }
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : (this.b & this.g) != 0;
    }

    public void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
        } else {
            this.b = z ? this.b | this.c : this.b & (~this.c);
        }
    }

    public void c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b84aa", new Object[]{this, new Boolean(z)});
        } else {
            this.b = z ? this.b | this.d : this.b & (~this.d);
        }
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue() : (this.b & this.c) != 0 || !this.h.isEmpty();
    }

    public boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue() : (this.b & this.d) != 0;
    }

    public void d(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad405d49", new Object[]{this, new Boolean(z)});
        } else {
            this.k = z;
        }
    }

    public void e(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aef535e8", new Object[]{this, new Boolean(z)});
        } else {
            this.l = z;
        }
    }

    public void f(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0aa0e87", new Object[]{this, new Boolean(z)});
        } else {
            this.m = z;
        }
    }

    private boolean i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5dd2874", new Object[]{this})).booleanValue() : this.k || this.l || this.m;
    }

    public boolean e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue() : (this.f16141a.getMountContent() instanceof j) || (this.f16141a.getMountContent() instanceof View);
    }
}
