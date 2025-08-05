package com.taobao.android.weex_framework.ui;

import android.view.MotionEvent;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import tb.kge;

/* loaded from: classes6.dex */
public class b implements View.OnTouchListener, c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private WeakReference<View> f16076a;
    private c b;
    private boolean c;
    private boolean d = true;
    private boolean e = false;
    private boolean f = false;
    private boolean g = false;
    private ArrayList<MotionEvent> h = new ArrayList<>();
    private MUSTouchInterceptWrapperView i;

    static {
        kge.a(1521435330);
        kge.a(-468432129);
        kge.a(-1665817317);
    }

    public static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[0]);
        }
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d4aa3aa4", new Object[]{this, view, motionEvent})).booleanValue();
        }
        if (this.f16076a == null) {
            return false;
        }
        if (motionEvent.getAction() == 0) {
            this.f = false;
            this.g = false;
        }
        if (!this.f) {
            this.h.add(MotionEvent.obtain(motionEvent));
        } else if (!this.c) {
            if (!this.d) {
                this.d = true;
                MotionEvent obtain = MotionEvent.obtain(motionEvent);
                obtain.setAction(3);
                this.e = true;
                view.dispatchTouchEvent(obtain);
            }
            if (this.e && motionEvent.getAction() == 3) {
                this.e = false;
                this.g = true;
                return false;
            }
            try {
                this.i.setTouchDisabled(true);
                a(MotionEvent.obtain(motionEvent));
            } finally {
                this.i.setTouchDisabled(false);
            }
        }
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            this.d = true;
        }
        return this.g;
    }

    private boolean a(MotionEvent motionEvent) {
        View view;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5f37b481", new Object[]{this, motionEvent})).booleanValue();
        }
        WeakReference<View> weakReference = this.f16076a;
        if (weakReference != null && (view = weakReference.get()) != null) {
            return view.dispatchTouchEvent(motionEvent);
        }
        return false;
    }

    public void a(WeakReference<View> weakReference) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bb9cf36", new Object[]{this, weakReference});
            return;
        }
        this.f16076a = weakReference;
        a();
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        this.h.clear();
        this.d = true;
        this.e = false;
        this.f = false;
    }

    public void a(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ec96a33", new Object[]{this, cVar});
        } else {
            this.b = cVar;
        }
    }

    @Override // com.taobao.android.weex_framework.ui.c
    public void a(boolean z) {
        View view;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        c cVar = this.b;
        if (cVar != null) {
            cVar.a(z);
        }
        if (this.f16076a == null) {
            return;
        }
        this.f = true;
        try {
            this.i.setTouchDisabled(true);
            if (!z) {
                if (this.f16076a != null && (view = this.f16076a.get()) != null) {
                    Iterator<MotionEvent> it = this.h.iterator();
                    while (it.hasNext()) {
                        view.dispatchTouchEvent(it.next());
                    }
                }
                this.d = false;
            } else if (this.h.size() > 0) {
                MotionEvent motionEvent = this.h.get(0);
                motionEvent.setAction(3);
                a(motionEvent);
            }
            this.i.setTouchDisabled(false);
            this.h.clear();
            this.c = z;
        } catch (Throwable th) {
            this.i.setTouchDisabled(false);
            throw th;
        }
    }
}
