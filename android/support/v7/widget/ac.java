package android.support.v7.widget;

import android.support.v4.view.ViewCompat;
import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityManager;

/* loaded from: classes2.dex */
class ac implements View.OnAttachStateChangeListener, View.OnHoverListener, View.OnLongClickListener {
    private static ac i;
    private static ac j;

    /* renamed from: a  reason: collision with root package name */
    private final View f1472a;
    private final CharSequence b;
    private final Runnable c = new Runnable() { // from class: android.support.v7.widget.ac.1
        @Override // java.lang.Runnable
        public void run() {
            ac.this.a(false);
        }
    };
    private final Runnable d = new Runnable() { // from class: android.support.v7.widget.ac.2
        @Override // java.lang.Runnable
        public void run() {
            ac.this.a();
        }
    };
    private int e;
    private int f;
    private ad g;
    private boolean h;

    private ac(View view, CharSequence charSequence) {
        this.f1472a = view;
        this.b = charSequence;
        this.f1472a.setOnLongClickListener(this);
        this.f1472a.setOnHoverListener(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        if (j == this) {
            j = null;
            ad adVar = this.g;
            if (adVar != null) {
                adVar.a();
                this.g = null;
                this.f1472a.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (i == this) {
            b(null);
        }
        this.f1472a.removeCallbacks(this.d);
    }

    public static void a(View view, CharSequence charSequence) {
        ac acVar = i;
        if (acVar != null && acVar.f1472a == view) {
            b(null);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            new ac(view, charSequence);
            return;
        }
        ac acVar2 = j;
        if (acVar2 != null && acVar2.f1472a == view) {
            acVar2.a();
        }
        view.setOnLongClickListener(null);
        view.setLongClickable(false);
        view.setOnHoverListener(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z) {
        long longPressTimeout;
        if (!ViewCompat.isAttachedToWindow(this.f1472a)) {
            return;
        }
        b(null);
        ac acVar = j;
        if (acVar != null) {
            acVar.a();
        }
        j = this;
        this.h = z;
        this.g = new ad(this.f1472a.getContext());
        this.g.a(this.f1472a, this.e, this.f, this.h, this.b);
        this.f1472a.addOnAttachStateChangeListener(this);
        if (this.h) {
            longPressTimeout = 2500;
        } else {
            longPressTimeout = ((ViewCompat.getWindowSystemUiVisibility(this.f1472a) & 1) == 1 ? 3000L : 15000L) - ViewConfiguration.getLongPressTimeout();
        }
        this.f1472a.removeCallbacks(this.d);
        this.f1472a.postDelayed(this.d, longPressTimeout);
    }

    private void b() {
        this.f1472a.postDelayed(this.c, ViewConfiguration.getLongPressTimeout());
    }

    private static void b(ac acVar) {
        ac acVar2 = i;
        if (acVar2 != null) {
            acVar2.c();
        }
        i = acVar;
        if (acVar != null) {
            i.b();
        }
    }

    private void c() {
        this.f1472a.removeCallbacks(this.c);
    }

    @Override // android.view.View.OnHoverListener
    public boolean onHover(View view, MotionEvent motionEvent) {
        if (this.g == null || !this.h) {
            AccessibilityManager accessibilityManager = (AccessibilityManager) this.f1472a.getContext().getSystemService("accessibility");
            if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
                return false;
            }
            int action = motionEvent.getAction();
            if (action != 7) {
                if (action == 10) {
                    a();
                }
            } else if (this.f1472a.isEnabled() && this.g == null) {
                this.e = (int) motionEvent.getX();
                this.f = (int) motionEvent.getY();
                b(this);
            }
            return false;
        }
        return false;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View view) {
        this.e = view.getWidth() / 2;
        this.f = view.getHeight() / 2;
        a(true);
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        a();
    }
}
