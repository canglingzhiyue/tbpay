package com.taobao.android.icart.widget.swipe;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes5.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private View.OnLongClickListener f12910a;
    private boolean b;
    private long e;
    private View g;
    private float c = -1.0f;
    private float d = -1.0f;
    private final Handler f = new Handler(Looper.getMainLooper());
    private final a h = new a();

    static {
        kge.a(600299539);
    }

    public static /* synthetic */ float a(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("3904dc4e", new Object[]{bVar})).floatValue() : bVar.c;
    }

    public static /* synthetic */ boolean a(b bVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e797623a", new Object[]{bVar, new Boolean(z)})).booleanValue();
        }
        bVar.b = z;
        return z;
    }

    public static /* synthetic */ float b(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("f27c69ed", new Object[]{bVar})).floatValue() : bVar.d;
    }

    public static /* synthetic */ View.OnLongClickListener c(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View.OnLongClickListener) ipChange.ipc$dispatch("fb008aa1", new Object[]{bVar}) : bVar.f12910a;
    }

    public static /* synthetic */ View d(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("943764bd", new Object[]{bVar}) : bVar.g;
    }

    public static /* synthetic */ void e(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ee312da", new Object[]{bVar});
        } else {
            bVar.a();
        }
    }

    /* loaded from: classes5.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-1284291014);
            kge.a(-1390502639);
        }

        private a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            if (b.a(b.this) != -1.0f && b.b(b.this) != -1.0f) {
                b.a(b.this, true);
                if (b.c(b.this) != null) {
                    b.c(b.this).onLongClick(b.d(b.this));
                }
            }
            b.e(b.this);
        }
    }

    public b(View view) {
        this.g = view;
    }

    public boolean a(MotionEvent motionEvent) {
        View.OnLongClickListener onLongClickListener;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5f37b481", new Object[]{this, motionEvent})).booleanValue();
        }
        if (motionEvent.getPointerCount() > 0 && motionEvent.getPointerId(0) != 0) {
            return false;
        }
        if (motionEvent.getAction() == 0 && this.c == -1.0f && this.d == -1.0f) {
            this.b = false;
            this.c = motionEvent.getX();
            this.d = motionEvent.getY();
            this.e = SystemClock.uptimeMillis();
            this.f.postDelayed(this.h, ViewConfiguration.getLongPressTimeout());
        } else if (motionEvent.getAction() == 3 || motionEvent.getAction() == 4) {
            a();
            if (this.b) {
                this.b = false;
                return true;
            }
        } else if (motionEvent.getAction() == 1) {
            this.b = false;
            if (SystemClock.uptimeMillis() - this.e >= ViewConfiguration.getLongPressTimeout()) {
                if (this.c != -1.0f && this.d != -1.0f && (onLongClickListener = this.f12910a) != null) {
                    onLongClickListener.onLongClick(this.g);
                }
                a();
                return true;
            }
            a();
        } else if (b(motionEvent)) {
            a();
        }
        return false;
    }

    private boolean b(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("74207cc2", new Object[]{this, motionEvent})).booleanValue() : Math.abs(this.c - motionEvent.getX()) > ((float) ViewConfiguration.get(this.g.getContext()).getScaledTouchSlop()) || Math.abs(this.d - motionEvent.getY()) > ((float) ViewConfiguration.get(this.g.getContext()).getScaledTouchSlop());
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        this.c = -1.0f;
        this.d = -1.0f;
        this.f.removeCallbacks(this.h);
    }

    public void a(View.OnLongClickListener onLongClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7f1d2ed", new Object[]{this, onLongClickListener});
        } else {
            this.f12910a = onLongClickListener;
        }
    }
}
