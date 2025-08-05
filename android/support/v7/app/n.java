package android.support.v7.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.ViewPropertyAnimatorCompat;
import android.support.v4.view.ViewPropertyAnimatorListener;
import android.support.v4.view.ViewPropertyAnimatorListenerAdapter;
import android.support.v4.view.ViewPropertyAnimatorUpdateListener;
import android.support.v7.app.ActionBar;
import android.support.v7.view.menu.e;
import android.support.v7.widget.ActionBarContainer;
import android.support.v7.widget.ActionBarContextView;
import android.support.v7.widget.ActionBarOverlayLayout;
import android.support.v7.widget.DecorToolbar;
import android.support.v7.widget.ScrollingTabContainerView;
import android.support.v7.widget.Toolbar;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import com.taobao.taobao.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import tb.acm;
import tb.acn;
import tb.acs;
import tb.act;

/* loaded from: classes2.dex */
public class n extends ActionBar implements ActionBarOverlayLayout.ActionBarVisibilityCallback {
    static final /* synthetic */ boolean s = !n.class.desiredAssertionStatus();
    private static final Interpolator t = new AccelerateInterpolator();
    private static final Interpolator u = new DecelerateInterpolator();
    private boolean A;
    private boolean B;
    private boolean D;
    private boolean F;
    private boolean H;

    /* renamed from: a  reason: collision with root package name */
    Context f1348a;
    ActionBarOverlayLayout b;
    ActionBarContainer c;
    DecorToolbar d;
    ActionBarContextView e;
    View f;
    ScrollingTabContainerView g;
    a h;
    acn i;
    acn.a j;
    boolean l;
    boolean m;
    act n;
    boolean o;
    private Context v;
    private Activity w;
    private Dialog x;
    private ArrayList<Object> y = new ArrayList<>();
    private int z = -1;
    private ArrayList<Object> C = new ArrayList<>();
    private int E = 0;
    boolean k = true;
    private boolean G = true;
    final ViewPropertyAnimatorListener p = new ViewPropertyAnimatorListenerAdapter() { // from class: android.support.v7.app.n.1
        @Override // android.support.v4.view.ViewPropertyAnimatorListenerAdapter, android.support.v4.view.ViewPropertyAnimatorListener
        public void onAnimationEnd(View view) {
            if (n.this.k && n.this.f != null) {
                n.this.f.setTranslationY(0.0f);
                n.this.c.setTranslationY(0.0f);
            }
            n.this.c.setVisibility(8);
            n.this.c.setTransitioning(false);
            n nVar = n.this;
            nVar.n = null;
            nVar.n();
            if (n.this.b != null) {
                ViewCompat.requestApplyInsets(n.this.b);
            }
        }
    };
    final ViewPropertyAnimatorListener q = new ViewPropertyAnimatorListenerAdapter() { // from class: android.support.v7.app.n.2
        @Override // android.support.v4.view.ViewPropertyAnimatorListenerAdapter, android.support.v4.view.ViewPropertyAnimatorListener
        public void onAnimationEnd(View view) {
            n nVar = n.this;
            nVar.n = null;
            nVar.c.requestLayout();
        }
    };
    final ViewPropertyAnimatorUpdateListener r = new ViewPropertyAnimatorUpdateListener() { // from class: android.support.v7.app.n.3
        @Override // android.support.v4.view.ViewPropertyAnimatorUpdateListener
        public void onAnimationUpdate(View view) {
            ((View) n.this.c.getParent()).invalidate();
        }
    };

    /* loaded from: classes2.dex */
    public class a extends acn implements e.a {
        private final Context b;
        private final android.support.v7.view.menu.e c;
        private acn.a d;
        private WeakReference<View> e;

        public a(Context context, acn.a aVar) {
            this.b = context;
            this.d = aVar;
            this.c = new android.support.v7.view.menu.e(context).a(1);
            this.c.a(this);
        }

        @Override // tb.acn
        public MenuInflater a() {
            return new acs(this.b);
        }

        @Override // tb.acn
        public void a(int i) {
            b(n.this.f1348a.getResources().getString(i));
        }

        @Override // android.support.v7.view.menu.e.a
        public void a(android.support.v7.view.menu.e eVar) {
            if (this.d == null) {
                return;
            }
            d();
            n.this.e.showOverflowMenu();
        }

        @Override // tb.acn
        public void a(View view) {
            n.this.e.setCustomView(view);
            this.e = new WeakReference<>(view);
        }

        @Override // tb.acn
        public void a(CharSequence charSequence) {
            n.this.e.setSubtitle(charSequence);
        }

        @Override // tb.acn
        public void a(boolean z) {
            super.a(z);
            n.this.e.setTitleOptional(z);
        }

        @Override // android.support.v7.view.menu.e.a
        public boolean a(android.support.v7.view.menu.e eVar, MenuItem menuItem) {
            acn.a aVar = this.d;
            if (aVar != null) {
                return aVar.a(this, menuItem);
            }
            return false;
        }

        @Override // tb.acn
        public Menu b() {
            return this.c;
        }

        @Override // tb.acn
        public void b(int i) {
            a((CharSequence) n.this.f1348a.getResources().getString(i));
        }

        @Override // tb.acn
        public void b(CharSequence charSequence) {
            n.this.e.setTitle(charSequence);
        }

        @Override // tb.acn
        public void c() {
            if (n.this.h != this) {
                return;
            }
            if (!n.a(n.this.l, n.this.m, false)) {
                n nVar = n.this;
                nVar.i = this;
                nVar.j = this.d;
            } else {
                this.d.a(this);
            }
            this.d = null;
            n.this.m(false);
            n.this.e.closeMode();
            n.this.d.getViewGroup().sendAccessibilityEvent(32);
            n.this.b.setHideOnContentScrollEnabled(n.this.o);
            n.this.h = null;
        }

        @Override // tb.acn
        public void d() {
            if (n.this.h != this) {
                return;
            }
            this.c.g();
            try {
                this.d.b(this, this.c);
            } finally {
                this.c.h();
            }
        }

        public boolean e() {
            this.c.g();
            try {
                return this.d.a(this, this.c);
            } finally {
                this.c.h();
            }
        }

        @Override // tb.acn
        public CharSequence f() {
            return n.this.e.getTitle();
        }

        @Override // tb.acn
        public CharSequence g() {
            return n.this.e.getSubtitle();
        }

        @Override // tb.acn
        public boolean h() {
            return n.this.e.isTitleOptional();
        }

        @Override // tb.acn
        public View i() {
            WeakReference<View> weakReference = this.e;
            if (weakReference != null) {
                return weakReference.get();
            }
            return null;
        }
    }

    public n(Activity activity, boolean z) {
        this.w = activity;
        View decorView = activity.getWindow().getDecorView();
        b(decorView);
        if (!z) {
            this.f = decorView.findViewById(16908290);
        }
    }

    public n(Dialog dialog) {
        this.x = dialog;
        b(dialog.getWindow().getDecorView());
    }

    static boolean a(boolean z, boolean z2, boolean z3) {
        if (z3) {
            return true;
        }
        return !z && !z2;
    }

    private void b(View view) {
        this.b = (ActionBarOverlayLayout) view.findViewById(R.id.decor_content_parent);
        ActionBarOverlayLayout actionBarOverlayLayout = this.b;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        this.d = c(view.findViewById(R.id.action_bar));
        this.e = (ActionBarContextView) view.findViewById(R.id.action_context_bar);
        this.c = (ActionBarContainer) view.findViewById(R.id.action_bar_container);
        DecorToolbar decorToolbar = this.d;
        if (decorToolbar == null || this.e == null || this.c == null) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with a compatible window decor layout");
        }
        this.f1348a = decorToolbar.getContext();
        boolean z = (this.d.getDisplayOptions() & 4) != 0;
        if (z) {
            this.A = true;
        }
        acm a2 = acm.a(this.f1348a);
        f(a2.f() || z);
        n(a2.d());
        TypedArray obtainStyledAttributes = this.f1348a.obtainStyledAttributes(null, R.styleable.ActionBar, R.attr.actionBarStyle, 0);
        if (obtainStyledAttributes.getBoolean(R.styleable.ActionBar_hideOnContentScroll, false)) {
            g(true);
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(R.styleable.ActionBar_elevation, 0);
        if (dimensionPixelSize != 0) {
            a(dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
    }

    private DecorToolbar c(View view) {
        if (view instanceof DecorToolbar) {
            return (DecorToolbar) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Can't make a decor toolbar out of ");
        sb.append(view);
        throw new IllegalStateException(sb.toString() != null ? view.getClass().getSimpleName() : "null");
    }

    private void n(boolean z) {
        this.D = z;
        if (!this.D) {
            this.d.setEmbeddedTabView(null);
            this.c.setTabContainer(this.g);
        } else {
            this.c.setTabContainer(null);
            this.d.setEmbeddedTabView(this.g);
        }
        boolean z2 = true;
        boolean z3 = o() == 2;
        ScrollingTabContainerView scrollingTabContainerView = this.g;
        if (scrollingTabContainerView != null) {
            if (z3) {
                scrollingTabContainerView.setVisibility(0);
                ActionBarOverlayLayout actionBarOverlayLayout = this.b;
                if (actionBarOverlayLayout != null) {
                    ViewCompat.requestApplyInsets(actionBarOverlayLayout);
                }
            } else {
                scrollingTabContainerView.setVisibility(8);
            }
        }
        this.d.setCollapsible(!this.D && z3);
        ActionBarOverlayLayout actionBarOverlayLayout2 = this.b;
        if (this.D || !z3) {
            z2 = false;
        }
        actionBarOverlayLayout2.setHasNonEmbeddedTabs(z2);
    }

    private void o(boolean z) {
        if (a(this.l, this.m, this.F)) {
            if (this.G) {
                return;
            }
            this.G = true;
            k(z);
        } else if (!this.G) {
        } else {
            this.G = false;
            l(z);
        }
    }

    private void p() {
        if (!this.F) {
            this.F = true;
            ActionBarOverlayLayout actionBarOverlayLayout = this.b;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.setShowingForActionMode(true);
            }
            o(false);
        }
    }

    private void q() {
        if (this.F) {
            this.F = false;
            ActionBarOverlayLayout actionBarOverlayLayout = this.b;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.setShowingForActionMode(false);
            }
            o(false);
        }
    }

    private boolean r() {
        return ViewCompat.isLaidOut(this.c);
    }

    @Override // android.support.v7.app.ActionBar
    public CharSequence a() {
        return this.d.getTitle();
    }

    @Override // android.support.v7.app.ActionBar
    public acn a(acn.a aVar) {
        a aVar2 = this.h;
        if (aVar2 != null) {
            aVar2.c();
        }
        this.b.setHideOnContentScrollEnabled(false);
        this.e.killMode();
        a aVar3 = new a(this.e.getContext(), aVar);
        if (aVar3.e()) {
            this.h = aVar3;
            aVar3.d();
            this.e.initForMode(aVar3);
            m(true);
            this.e.sendAccessibilityEvent(32);
            return aVar3;
        }
        return null;
    }

    @Override // android.support.v7.app.ActionBar
    public void a(float f) {
        ViewCompat.setElevation(this.c, f);
    }

    @Override // android.support.v7.app.ActionBar
    public void a(int i) {
        a(LayoutInflater.from(g()).inflate(i, this.d.getViewGroup(), false));
    }

    public void a(int i, int i2) {
        int displayOptions = this.d.getDisplayOptions();
        if ((i2 & 4) != 0) {
            this.A = true;
        }
        this.d.setDisplayOptions((i & i2) | ((~i2) & displayOptions));
    }

    @Override // android.support.v7.app.ActionBar
    public void a(Configuration configuration) {
        n(acm.a(this.f1348a).d());
    }

    @Override // android.support.v7.app.ActionBar
    public void a(Drawable drawable) {
        this.d.setIcon(drawable);
    }

    @Override // android.support.v7.app.ActionBar
    public void a(View view) {
        this.d.setCustomView(view);
    }

    @Override // android.support.v7.app.ActionBar
    public void a(View view, ActionBar.LayoutParams layoutParams) {
        view.setLayoutParams(layoutParams);
        this.d.setCustomView(view);
    }

    @Override // android.support.v7.app.ActionBar
    public void a(CharSequence charSequence) {
        this.d.setTitle(charSequence);
    }

    @Override // android.support.v7.app.ActionBar
    public void a(boolean z) {
        a(z ? 1 : 0, 1);
    }

    @Override // android.support.v7.app.ActionBar
    public boolean a(int i, KeyEvent keyEvent) {
        Menu b;
        a aVar = this.h;
        if (aVar == null || (b = aVar.b()) == null) {
            return false;
        }
        boolean z = true;
        if (KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() == 1) {
            z = false;
        }
        b.setQwertyMode(z);
        return b.performShortcut(i, keyEvent, 0);
    }

    @Override // android.support.v7.app.ActionBar
    public int b() {
        return this.d.getDisplayOptions();
    }

    @Override // android.support.v7.app.ActionBar
    public void b(int i) {
        a(this.f1348a.getString(i));
    }

    @Override // android.support.v7.app.ActionBar
    public void b(Drawable drawable) {
        this.c.setPrimaryBackground(drawable);
    }

    @Override // android.support.v7.app.ActionBar
    public void b(CharSequence charSequence) {
        this.d.setSubtitle(charSequence);
    }

    @Override // android.support.v7.app.ActionBar
    public void b(boolean z) {
        a(z ? 2 : 0, 2);
    }

    @Override // android.support.v7.app.ActionBar
    public int c() {
        return this.c.getHeight();
    }

    @Override // android.support.v7.app.ActionBar
    public void c(int i) {
        if ((i & 4) != 0) {
            this.A = true;
        }
        this.d.setDisplayOptions(i);
    }

    @Override // android.support.v7.app.ActionBar
    public void c(Drawable drawable) {
        this.d.setNavigationIcon(drawable);
    }

    @Override // android.support.v7.app.ActionBar
    public void c(CharSequence charSequence) {
        this.d.setWindowTitle(charSequence);
    }

    @Override // android.support.v7.app.ActionBar
    public void c(boolean z) {
        a(z ? 4 : 0, 4);
    }

    @Override // android.support.v7.app.ActionBar
    public void d() {
        if (this.l) {
            this.l = false;
            o(false);
        }
    }

    @Override // android.support.v7.app.ActionBar
    public void d(int i) {
        this.d.setNavigationContentDescription(i);
    }

    @Override // android.support.v7.app.ActionBar
    public void d(boolean z) {
        a(z ? 8 : 0, 8);
    }

    @Override // android.support.v7.app.ActionBar
    public void e() {
        if (!this.l) {
            this.l = true;
            o(false);
        }
    }

    @Override // android.support.v7.app.ActionBar
    public void e(boolean z) {
        a(z ? 16 : 0, 16);
    }

    @Override // android.support.v7.widget.ActionBarOverlayLayout.ActionBarVisibilityCallback
    public void enableContentAnimations(boolean z) {
        this.k = z;
    }

    @Override // android.support.v7.app.ActionBar
    public void f(boolean z) {
        this.d.setHomeButtonEnabled(z);
    }

    @Override // android.support.v7.app.ActionBar
    public boolean f() {
        int c = c();
        if (this.G) {
            return c == 0 || h() < c;
        }
        return false;
    }

    @Override // android.support.v7.app.ActionBar
    public Context g() {
        if (this.v == null) {
            TypedValue typedValue = new TypedValue();
            this.f1348a.getTheme().resolveAttribute(R.attr.actionBarWidgetTheme, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                this.v = new ContextThemeWrapper(this.f1348a, i);
            } else {
                this.v = this.f1348a;
            }
        }
        return this.v;
    }

    @Override // android.support.v7.app.ActionBar
    public void g(boolean z) {
        if (!z || this.b.isInOverlayMode()) {
            this.o = z;
            this.b.setHideOnContentScrollEnabled(z);
            return;
        }
        throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
    }

    @Override // android.support.v7.app.ActionBar
    public int h() {
        return this.b.getActionBarHideOffset();
    }

    @Override // android.support.v7.app.ActionBar
    public void h(boolean z) {
        if (!this.A) {
            c(z);
        }
    }

    @Override // android.support.v7.widget.ActionBarOverlayLayout.ActionBarVisibilityCallback
    public void hideForSystem() {
        if (!this.m) {
            this.m = true;
            o(true);
        }
    }

    @Override // android.support.v7.app.ActionBar
    public void i(boolean z) {
        act actVar;
        this.H = z;
        if (z || (actVar = this.n) == null) {
            return;
        }
        actVar.c();
    }

    @Override // android.support.v7.app.ActionBar
    public void j(boolean z) {
        if (z == this.B) {
            return;
        }
        this.B = z;
        int size = this.C.size();
        for (int i = 0; i < size; i++) {
            this.C.get(i);
        }
    }

    public void k(boolean z) {
        View view;
        View view2;
        int[] iArr;
        act actVar = this.n;
        if (actVar != null) {
            actVar.c();
        }
        this.c.setVisibility(0);
        if (this.E != 0 || (!this.H && !z)) {
            this.c.setAlpha(1.0f);
            this.c.setTranslationY(0.0f);
            if (this.k && (view = this.f) != null) {
                view.setTranslationY(0.0f);
            }
            this.q.onAnimationEnd(null);
        } else {
            this.c.setTranslationY(0.0f);
            float f = -this.c.getHeight();
            if (z) {
                this.c.getLocationInWindow(new int[]{0, 0});
                f -= iArr[1];
            }
            this.c.setTranslationY(f);
            act actVar2 = new act();
            ViewPropertyAnimatorCompat translationY = ViewCompat.animate(this.c).translationY(0.0f);
            translationY.setUpdateListener(this.r);
            actVar2.a(translationY);
            if (this.k && (view2 = this.f) != null) {
                view2.setTranslationY(f);
                actVar2.a(ViewCompat.animate(this.f).translationY(0.0f));
            }
            actVar2.a(u);
            actVar2.a(250L);
            actVar2.a(this.q);
            this.n = actVar2;
            actVar2.a();
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.b;
        if (actionBarOverlayLayout != null) {
            ViewCompat.requestApplyInsets(actionBarOverlayLayout);
        }
    }

    public void l(boolean z) {
        View view;
        int[] iArr;
        act actVar = this.n;
        if (actVar != null) {
            actVar.c();
        }
        if (this.E != 0 || (!this.H && !z)) {
            this.p.onAnimationEnd(null);
            return;
        }
        this.c.setAlpha(1.0f);
        this.c.setTransitioning(true);
        act actVar2 = new act();
        float f = -this.c.getHeight();
        if (z) {
            this.c.getLocationInWindow(new int[]{0, 0});
            f -= iArr[1];
        }
        ViewPropertyAnimatorCompat translationY = ViewCompat.animate(this.c).translationY(f);
        translationY.setUpdateListener(this.r);
        actVar2.a(translationY);
        if (this.k && (view = this.f) != null) {
            actVar2.a(ViewCompat.animate(view).translationY(f));
        }
        actVar2.a(t);
        actVar2.a(250L);
        actVar2.a(this.p);
        this.n = actVar2;
        actVar2.a();
    }

    @Override // android.support.v7.app.ActionBar
    public boolean l() {
        DecorToolbar decorToolbar = this.d;
        if (decorToolbar == null || !decorToolbar.hasExpandedActionView()) {
            return false;
        }
        this.d.collapseActionView();
        return true;
    }

    public void m(boolean z) {
        ViewPropertyAnimatorCompat viewPropertyAnimatorCompat;
        ViewPropertyAnimatorCompat viewPropertyAnimatorCompat2;
        if (z) {
            p();
        } else {
            q();
        }
        if (!r()) {
            if (z) {
                this.d.setVisibility(4);
                this.e.setVisibility(0);
                return;
            }
            this.d.setVisibility(0);
            this.e.setVisibility(8);
            return;
        }
        if (z) {
            viewPropertyAnimatorCompat2 = this.d.setupAnimatorToVisibility(4, 100L);
            viewPropertyAnimatorCompat = this.e.setupAnimatorToVisibility(0, 200L);
        } else {
            viewPropertyAnimatorCompat = this.d.setupAnimatorToVisibility(0, 200L);
            viewPropertyAnimatorCompat2 = this.e.setupAnimatorToVisibility(8, 100L);
        }
        act actVar = new act();
        actVar.a(viewPropertyAnimatorCompat2, viewPropertyAnimatorCompat);
        actVar.a();
    }

    void n() {
        acn.a aVar = this.j;
        if (aVar != null) {
            aVar.a(this.i);
            this.i = null;
            this.j = null;
        }
    }

    public int o() {
        return this.d.getNavigationMode();
    }

    @Override // android.support.v7.widget.ActionBarOverlayLayout.ActionBarVisibilityCallback
    public void onContentScrollStarted() {
        act actVar = this.n;
        if (actVar != null) {
            actVar.c();
            this.n = null;
        }
    }

    @Override // android.support.v7.widget.ActionBarOverlayLayout.ActionBarVisibilityCallback
    public void onContentScrollStopped() {
    }

    @Override // android.support.v7.widget.ActionBarOverlayLayout.ActionBarVisibilityCallback
    public void onWindowVisibilityChanged(int i) {
        this.E = i;
    }

    @Override // android.support.v7.widget.ActionBarOverlayLayout.ActionBarVisibilityCallback
    public void showForSystem() {
        if (this.m) {
            this.m = false;
            o(true);
        }
    }
}
