package com.taobao.family.globalbubble;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.taobao.util.i;
import android.taobao.util.k;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.widget.PopupWindow;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.l;
import com.taobao.statistic.CT;
import com.taobao.statistic.TBS;
import com.taobao.tao.Globals;
import com.taobao.weex.WXSDKInstance;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import tb.knk;
import tb.ljl;
import tb.xmw;

/* loaded from: classes7.dex */
public abstract class h implements Handler.Callback, e, com.taobao.weex.d {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static int e = 0;
    public static int f = 0;
    private static int o = 0;
    private static boolean p = false;
    public View b;
    public boolean d;
    public final xmw g;
    private Context h;
    private WeakReference<View> j;
    private WeakReference<Activity> k;
    private int l;
    public String c = "com.taobao.tao.homepage.MainActivity3";
    private boolean m = false;
    private boolean n = false;
    private ViewTreeObserver.OnGlobalLayoutListener q = null;

    /* renamed from: a  reason: collision with root package name */
    public i f17142a = new i(Looper.getMainLooper(), this);
    private d i = new DegradeWindow();

    public void a(String str, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20476513", new Object[]{this, str, map});
        }
    }

    public abstract String b();

    public abstract String c();

    public abstract String k();

    public void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6076ef3", new Object[]{this});
        }
    }

    public static /* synthetic */ boolean a(h hVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("86d9395b", new Object[]{hVar})).booleanValue() : hVar.n;
    }

    public static /* synthetic */ boolean a(h hVar, float f2, float f3) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("357d379b", new Object[]{hVar, new Float(f2), new Float(f3)})).booleanValue() : hVar.a(f2, f3);
    }

    public static /* synthetic */ boolean a(h hVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("544ea461", new Object[]{hVar, new Boolean(z)})).booleanValue();
        }
        hVar.n = z;
        return z;
    }

    public static /* synthetic */ WeakReference b(h hVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WeakReference) ipChange.ipc$dispatch("17794966", new Object[]{hVar}) : hVar.k;
    }

    public static /* synthetic */ boolean c(h hVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("18db27dd", new Object[]{hVar})).booleanValue() : hVar.m;
    }

    public static /* synthetic */ int d(h hVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("e1dc1f0d", new Object[]{hVar})).intValue() : hVar.r();
    }

    public static /* synthetic */ boolean d(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ad405d4d", new Object[]{new Boolean(z)})).booleanValue();
        }
        p = z;
        return z;
    }

    public static /* synthetic */ d e(h hVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (d) ipChange.ipc$dispatch("7835f18e", new Object[]{hVar}) : hVar.i;
    }

    public static /* synthetic */ boolean m() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6158678", new Object[0])).booleanValue() : p;
    }

    public static /* synthetic */ int n() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6239de8", new Object[0])).intValue() : o;
    }

    public h(Context context, boolean z, int i) {
        this.d = false;
        this.h = context;
        this.l = i;
        Display defaultDisplay = ((WindowManager) context.getSystemService(com.taobao.android.weex_framework.util.a.ATOM_EXT_window)).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        if (Build.VERSION.SDK_INT >= 17) {
            defaultDisplay.getRealMetrics(displayMetrics);
        } else {
            defaultDisplay.getMetrics(displayMetrics);
        }
        e = displayMetrics.widthPixels;
        o = displayMetrics.heightPixels;
        p = knk.a(Globals.getApplication());
        f = o - knk.b();
        this.g = new xmw(context, this);
        p();
        this.d = z;
        q();
    }

    private void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("631b576", new Object[]{this});
        } else {
            ((PopupWindow) this.i).setTouchInterceptor(new View.OnTouchListener() { // from class: com.taobao.family.globalbubble.h.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* JADX WARN: Code restructure failed: missing block: B:9:0x0027, code lost:
                    if (r14 != 2) goto L10;
                 */
                @Override // android.view.View.OnTouchListener
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public boolean onTouch(android.view.View r14, android.view.MotionEvent r15) {
                    /*
                        r13 = this;
                        com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.family.globalbubble.h.AnonymousClass1.$ipChange
                        boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
                        r2 = 2
                        r3 = 1
                        r4 = 0
                        if (r1 == 0) goto L1f
                        r1 = 3
                        java.lang.Object[] r1 = new java.lang.Object[r1]
                        r1[r4] = r13
                        r1[r3] = r14
                        r1[r2] = r15
                        java.lang.String r14 = "d4aa3aa4"
                        java.lang.Object r14 = r0.ipc$dispatch(r14, r1)
                        java.lang.Boolean r14 = (java.lang.Boolean) r14
                        boolean r14 = r14.booleanValue()
                        return r14
                    L1f:
                        int r14 = r15.getAction()
                        if (r14 == 0) goto L2a
                        if (r14 == r3) goto L3b
                        if (r14 == r2) goto L3b
                        goto L85
                    L2a:
                        com.taobao.family.globalbubble.h r14 = com.taobao.family.globalbubble.h.this
                        float r0 = r15.getX()
                        float r1 = r15.getY()
                        boolean r0 = com.taobao.family.globalbubble.h.a(r14, r0, r1)
                        com.taobao.family.globalbubble.h.a(r14, r0)
                    L3b:
                        com.taobao.family.globalbubble.h r14 = com.taobao.family.globalbubble.h.this
                        boolean r14 = com.taobao.family.globalbubble.h.a(r14)
                        if (r14 == 0) goto L44
                        return r4
                    L44:
                        long r5 = r15.getDownTime()
                        long r7 = r15.getEventTime()
                        int r9 = r15.getAction()
                        float r10 = r15.getRawX()
                        float r11 = r15.getRawY()
                        int r12 = r15.getMetaState()
                        android.view.MotionEvent r14 = android.view.MotionEvent.obtain(r5, r7, r9, r10, r11, r12)
                        com.taobao.family.globalbubble.h r15 = com.taobao.family.globalbubble.h.this
                        java.lang.ref.WeakReference r15 = com.taobao.family.globalbubble.h.b(r15)
                        if (r15 == 0) goto L85
                        com.taobao.family.globalbubble.h r15 = com.taobao.family.globalbubble.h.this
                        java.lang.ref.WeakReference r15 = com.taobao.family.globalbubble.h.b(r15)
                        java.lang.Object r15 = r15.get()
                        if (r15 == 0) goto L85
                        com.taobao.family.globalbubble.h r15 = com.taobao.family.globalbubble.h.this
                        java.lang.ref.WeakReference r15 = com.taobao.family.globalbubble.h.b(r15)
                        java.lang.Object r15 = r15.get()
                        android.app.Activity r15 = (android.app.Activity) r15
                        boolean r14 = r15.dispatchTouchEvent(r14)
                        return r14
                    L85:
                        return r4
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.taobao.family.globalbubble.h.AnonymousClass1.onTouch(android.view.View, android.view.MotionEvent):boolean");
                }
            });
        }
    }

    private void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63fccf7", new Object[]{this});
        } else {
            this.q = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.taobao.family.globalbubble.h.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public void onGlobalLayout() {
                    boolean a2;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("df7e7eb3", new Object[]{this});
                    } else if (!h.c(h.this) || h.m() == (a2 = knk.a(Globals.getApplication()))) {
                    } else {
                        h.f = a2 ? h.n() - knk.b() : h.n();
                        h.d(a2);
                        ((PopupWindow) h.e(h.this)).update(h.e, h.d(h.this));
                    }
                }
            };
        }
    }

    private boolean a(float f2, float f3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5c0fea6c", new Object[]{this, new Float(f2), new Float(f3)})).booleanValue();
        }
        if (c.a().b != null && c.a().b.size() > 0) {
            for (RectBean rectBean : c.a().b) {
                if (rectBean != null && f2 >= rectBean.left && f2 <= rectBean.left + rectBean.width && f3 >= rectBean.top && f3 <= rectBean.top + rectBean.height) {
                    return true;
                }
            }
        }
        return false;
    }

    private void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64de478", new Object[]{this});
            return;
        }
        WeakReference<Activity> b = c.a().b();
        if (b == null || b.get() == null) {
            return;
        }
        this.k = b;
        this.c = b.get().getClass().getName();
        this.j = new WeakReference<>(b.get().getWindow().getDecorView());
    }

    @Override // com.taobao.family.globalbubble.e
    public int d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("596b2de", new Object[]{this})).intValue() : this.l;
    }

    public d a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (d) ipChange.ipc$dispatch("b2065121", new Object[]{this}) : this.i;
    }

    @Override // com.taobao.family.globalbubble.e
    public synchronized void a(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68a25ba", new Object[]{this, activity});
            return;
        }
        if (activity != null) {
            this.k = new WeakReference<>(activity);
            this.j = new WeakReference<>(activity.getWindow().getDecorView());
            this.c = activity.getClass().getName();
            if (this.j != null && this.j.get() != null && this.j.get().getViewTreeObserver() != null) {
                this.j.get().getViewTreeObserver().addOnGlobalLayoutListener(this.q);
            }
        }
    }

    @Override // com.taobao.family.globalbubble.e
    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.d = z;
        }
    }

    @Override // com.taobao.family.globalbubble.e
    public boolean e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue() : this.m;
    }

    public boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[]{this})).booleanValue();
        }
        if (Build.VERSION.SDK_INT < 19) {
            return false;
        }
        return l.d(this.h);
    }

    public synchronized void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        if (!e() && !f() && this.d) {
            if (this.j != null && this.j.get() != null) {
                if (this.b == null) {
                    this.b = this.g.a();
                    a(this.b);
                    return;
                }
                this.m = true;
                this.i.init(this.j.get());
                String k = k();
                CT ct = CT.Image;
                TBS.Adv.ctrlClickedOnPage(k, ct, k() + "_show", this.c);
            }
        }
    }

    public synchronized void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
        } else if (!e()) {
        } else {
            this.m = false;
            if (this.i != null) {
                this.i.dismiss();
            }
        }
    }

    public synchronized void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
            return;
        }
        try {
            c.a().d = null;
            if (this.b != null) {
                ViewParent parent = this.b.getParent();
                if (parent != null) {
                    ((ViewGroup) parent).removeView(this.b);
                }
                this.b = null;
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.taobao.family.globalbubble.e
    public synchronized void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
            return;
        }
        c();
        this.d = true;
        this.f17142a.sendEmptyMessage(1);
    }

    @Override // com.taobao.family.globalbubble.e
    public synchronized void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
            return;
        }
        c();
        if (this.j != null && this.j.get() != null && this.j.get().getViewTreeObserver() != null) {
            this.j.get().getViewTreeObserver().removeOnGlobalLayoutListener(this.q);
        }
        this.d = false;
        if (z) {
            this.f17142a.sendEmptyMessage(3);
        } else {
            this.f17142a.sendEmptyMessage(2);
        }
    }

    @Override // com.taobao.family.globalbubble.e
    public void c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b84aa", new Object[]{this, new Boolean(z)});
            return;
        }
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("status", z ? "show" : "hidden");
        hashMap.put("url", this.c);
        hashMap.put("activity", this.c);
        hashMap.put("change", "true");
        a("gbPageChanged", hashMap);
    }

    @Override // com.taobao.family.globalbubble.e
    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("status", str);
        a("gbAppStatusChanged", hashMap);
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("282a8c1d", new Object[]{this, message})).booleanValue();
        }
        if (message.what == 1) {
            g();
        } else if (message.what == 2) {
            h();
        } else if (message.what == 3) {
            h();
            i();
        }
        return false;
    }

    public void a(String str, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3202a441", new Object[]{this, str, hashMap});
        } else {
            if (TextUtils.isEmpty(str)) {
            }
        }
    }

    @Override // com.taobao.weex.d
    public void onViewCreated(WXSDKInstance wXSDKInstance, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9eab5f0f", new Object[]{this, wXSDKInstance, view});
            return;
        }
        k.a(c(), "onViewCreated");
        this.b = view;
        String k = k();
        CT ct = CT.Image;
        TBS.Adv.ctrlClickedOnPage(k, ct, k() + "_on_view_create", this.c);
        b(this.b);
    }

    @Override // com.taobao.weex.d
    public void onRenderSuccess(WXSDKInstance wXSDKInstance, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c414a5f9", new Object[]{this, wXSDKInstance, new Integer(i), new Integer(i2)});
            return;
        }
        k.a(c(), ljl.RENDER_SUCCESS_TIME);
        String k = k();
        CT ct = CT.Image;
        TBS.Adv.ctrlClickedOnPage(k, ct, k() + "_on_render_success", this.c);
        l();
    }

    @Override // com.taobao.weex.d
    public void onRefreshSuccess(WXSDKInstance wXSDKInstance, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d57f8320", new Object[]{this, wXSDKInstance, new Integer(i), new Integer(i2)});
            return;
        }
        k.a(c(), "onRefreshSuccess");
        String k = k();
        CT ct = CT.Image;
        TBS.Adv.ctrlClickedOnPage(k, ct, k() + "_on_refresh_success", this.c);
    }

    @Override // com.taobao.weex.d
    public void onException(WXSDKInstance wXSDKInstance, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88f82eeb", new Object[]{this, wXSDKInstance, str, str2});
            return;
        }
        String c = c();
        k.a(c, "onException:" + str + "----" + str2);
        String k = k();
        CT ct = CT.Image;
        TBS.Adv.ctrlClickedOnPage(k, ct, k() + "_on_exception", this.c);
    }

    private void a(View view) {
        WeakReference<View> weakReference;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9501e36a", new Object[]{this, view});
            return;
        }
        String c = c();
        k.a(c, "addNativeView:" + this.c);
        if (view == null || (weakReference = this.j) == null || weakReference.get() == null) {
            return;
        }
        this.i.setView(view);
        this.i.setSize(e, r());
        this.i.setGravity(0, 0, 0);
        if (e() || f() || !this.d) {
            return;
        }
        this.m = true;
        this.i.init(this.j.get());
        String k = k();
        CT ct = CT.Image;
        String k2 = k();
        TBS.Adv.ctrlClickedOnPage(k, ct, k2, k() + "_show", this.c);
    }

    private int r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("65bfbec", new Object[]{this})).intValue();
        }
        WeakReference<View> weakReference = this.j;
        if (weakReference == null) {
            return f;
        }
        View view = weakReference.get();
        if (view == null) {
            return f;
        }
        int max = Math.max(view.getMeasuredHeight(), f);
        f = max;
        return max;
    }

    private void b(View view) {
        WeakReference<View> weakReference;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91037249", new Object[]{this, view});
            return;
        }
        String c = c();
        k.a(c, "addView:" + this.c);
        if (view == null || (weakReference = this.j) == null || weakReference.get() == null) {
            return;
        }
        o();
        view.setOnTouchListener(new View.OnTouchListener() { // from class: com.taobao.family.globalbubble.h.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view2, MotionEvent motionEvent) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("d4aa3aa4", new Object[]{this, view2, motionEvent})).booleanValue();
                }
                int action = motionEvent.getAction();
                if (action == 0 || action == 1 || action == 2) {
                    MotionEvent obtain = MotionEvent.obtain(motionEvent.getDownTime(), motionEvent.getEventTime(), motionEvent.getAction(), motionEvent.getRawX(), motionEvent.getRawY(), motionEvent.getMetaState());
                    if (h.b(h.this) != null && h.b(h.this).get() != null) {
                        return ((Activity) h.b(h.this).get()).dispatchTouchEvent(obtain);
                    }
                }
                return false;
            }
        });
        this.i.setView(view);
        this.i.setSize(e, r());
        this.i.setGravity(0, 0, 0);
        if (e() || f() || !this.d) {
            return;
        }
        this.m = true;
        this.i.init(this.j.get());
        String k = k();
        CT ct = CT.Image;
        String k2 = k();
        TBS.Adv.ctrlClickedOnPage(k, ct, k2, k() + "_show", this.c);
    }
}
