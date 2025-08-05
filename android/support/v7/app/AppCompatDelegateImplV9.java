package android.support.v7.app;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.app.NavUtils;
import android.support.v4.view.LayoutInflaterCompat;
import android.support.v4.view.OnApplyWindowInsetsListener;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.ViewPropertyAnimatorCompat;
import android.support.v4.view.ViewPropertyAnimatorListenerAdapter;
import android.support.v4.view.WindowInsetsCompat;
import android.support.v7.view.menu.ListMenuPresenter;
import android.support.v7.view.menu.e;
import android.support.v7.view.menu.j;
import android.support.v7.widget.ActionBarContextView;
import android.support.v7.widget.AppCompatDrawableManager;
import android.support.v7.widget.ContentFrameLayout;
import android.support.v7.widget.DecorContentParent;
import android.support.v7.widget.FitWindowsViewGroup;
import android.support.v7.widget.Toolbar;
import android.support.v7.widget.VectorEnabledTintResources;
import android.support.v7.widget.ViewUtils;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.taobao.taobao.R;
import org.xmlpull.v1.XmlPullParser;
import tb.ace;
import tb.acn;
import tb.acp;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class AppCompatDelegateImplV9 extends d implements e.a, LayoutInflater.Factory2 {
    private static final boolean t;
    private View A;
    private boolean B;
    private boolean C;
    private boolean D;
    private PanelFeatureState[] E;
    private PanelFeatureState F;
    private boolean G;
    private final Runnable H;
    private boolean I;
    private Rect J;
    private Rect K;
    private i L;
    acn m;
    ActionBarContextView n;
    PopupWindow o;
    Runnable p;
    ViewPropertyAnimatorCompat q;
    boolean r;
    int s;
    private DecorContentParent u;
    private a v;
    private c w;
    private boolean x;
    private ViewGroup y;
    private TextView z;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public class ListMenuDecorView extends ContentFrameLayout {
        public ListMenuDecorView(Context context) {
            super(context);
        }

        private boolean isOutOfBounds(int i, int i2) {
            return i < -5 || i2 < -5 || i > getWidth() + 5 || i2 > getHeight() + 5;
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return AppCompatDelegateImplV9.this.a(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() != 0 || !isOutOfBounds((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return super.onInterceptTouchEvent(motionEvent);
            }
            AppCompatDelegateImplV9.this.f(0);
            return true;
        }

        @Override // android.view.View
        public void setBackgroundResource(int i) {
            setBackgroundDrawable(ace.b(getContext(), i));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes.dex */
    public static final class PanelFeatureState {

        /* renamed from: a  reason: collision with root package name */
        int f1323a;
        int b;
        int c;
        int d;
        int e;
        int f;
        ViewGroup g;
        View h;
        View i;
        android.support.v7.view.menu.e j;
        ListMenuPresenter k;
        Context l;
        boolean m;
        boolean n;
        boolean o;
        public boolean p;
        boolean q = false;
        boolean r;
        Bundle s;

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes2.dex */
        public static class SavedState implements Parcelable {
            public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: android.support.v7.app.AppCompatDelegateImplV9.PanelFeatureState.SavedState.1
                @Override // android.os.Parcelable.Creator
                /* renamed from: a */
                public SavedState createFromParcel(Parcel parcel) {
                    return SavedState.readFromParcel(parcel, null);
                }

                @Override // android.os.Parcelable.ClassLoaderCreator
                /* renamed from: a */
                public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                    return SavedState.readFromParcel(parcel, classLoader);
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: a */
                public SavedState[] newArray(int i) {
                    return new SavedState[i];
                }
            };
            int featureId;
            boolean isOpen;
            Bundle menuState;

            SavedState() {
            }

            static SavedState readFromParcel(Parcel parcel, ClassLoader classLoader) {
                SavedState savedState = new SavedState();
                savedState.featureId = parcel.readInt();
                boolean z = true;
                if (parcel.readInt() != 1) {
                    z = false;
                }
                savedState.isOpen = z;
                if (savedState.isOpen) {
                    savedState.menuState = parcel.readBundle(classLoader);
                }
                return savedState;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(this.featureId);
                parcel.writeInt(this.isOpen ? 1 : 0);
                if (this.isOpen) {
                    parcel.writeBundle(this.menuState);
                }
            }
        }

        PanelFeatureState(int i) {
            this.f1323a = i;
        }

        android.support.v7.view.menu.k a(j.a aVar) {
            if (this.j == null) {
                return null;
            }
            if (this.k == null) {
                this.k = new ListMenuPresenter(this.l, R.layout.abc_list_menu_item_layout);
                this.k.setCallback(aVar);
                this.j.a(this.k);
            }
            return this.k.getMenuView(this.g);
        }

        void a(Context context) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme newTheme = context.getResources().newTheme();
            newTheme.setTo(context.getTheme());
            newTheme.resolveAttribute(R.attr.actionBarPopupTheme, typedValue, true);
            if (typedValue.resourceId != 0) {
                newTheme.applyStyle(typedValue.resourceId, true);
            }
            newTheme.resolveAttribute(R.attr.panelMenuListTheme, typedValue, true);
            newTheme.applyStyle(typedValue.resourceId != 0 ? typedValue.resourceId : R.style.Theme_AppCompat_CompactMenu, true);
            acp acpVar = new acp(context, 0);
            acpVar.getTheme().setTo(newTheme);
            this.l = acpVar;
            TypedArray obtainStyledAttributes = acpVar.obtainStyledAttributes(R.styleable.AppCompatTheme);
            this.b = obtainStyledAttributes.getResourceId(R.styleable.AppCompatTheme_panelBackground, 0);
            this.f = obtainStyledAttributes.getResourceId(R.styleable.AppCompatTheme_android_windowAnimationStyle, 0);
            obtainStyledAttributes.recycle();
        }

        void a(android.support.v7.view.menu.e eVar) {
            ListMenuPresenter listMenuPresenter;
            android.support.v7.view.menu.e eVar2 = this.j;
            if (eVar == eVar2) {
                return;
            }
            if (eVar2 != null) {
                eVar2.b(this.k);
            }
            this.j = eVar;
            if (eVar == null || (listMenuPresenter = this.k) == null) {
                return;
            }
            eVar.a(listMenuPresenter);
        }

        public boolean a() {
            if (this.h == null) {
                return false;
            }
            return this.i != null || this.k.getAdapter().getCount() > 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public final class a implements j.a {
        a() {
        }

        @Override // android.support.v7.view.menu.j.a
        public void a(android.support.v7.view.menu.e eVar, boolean z) {
            AppCompatDelegateImplV9.this.b(eVar);
        }

        @Override // android.support.v7.view.menu.j.a
        public boolean a(android.support.v7.view.menu.e eVar) {
            Window.Callback r = AppCompatDelegateImplV9.this.r();
            if (r != null) {
                r.onMenuOpened(108, eVar);
                return true;
            }
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class b implements acn.a {
        private acn.a b;

        public b(acn.a aVar) {
            this.b = aVar;
        }

        @Override // tb.acn.a
        public void a(acn acnVar) {
            this.b.a(acnVar);
            if (AppCompatDelegateImplV9.this.o != null) {
                AppCompatDelegateImplV9.this.b.getDecorView().removeCallbacks(AppCompatDelegateImplV9.this.p);
            }
            if (AppCompatDelegateImplV9.this.n != null) {
                AppCompatDelegateImplV9.this.u();
                AppCompatDelegateImplV9 appCompatDelegateImplV9 = AppCompatDelegateImplV9.this;
                appCompatDelegateImplV9.q = ViewCompat.animate(appCompatDelegateImplV9.n).alpha(0.0f);
                AppCompatDelegateImplV9.this.q.setListener(new ViewPropertyAnimatorListenerAdapter() { // from class: android.support.v7.app.AppCompatDelegateImplV9.b.1
                    @Override // android.support.v4.view.ViewPropertyAnimatorListenerAdapter, android.support.v4.view.ViewPropertyAnimatorListener
                    public void onAnimationEnd(View view) {
                        AppCompatDelegateImplV9.this.n.setVisibility(8);
                        if (AppCompatDelegateImplV9.this.o != null) {
                            AppCompatDelegateImplV9.this.o.dismiss();
                        } else if (AppCompatDelegateImplV9.this.n.getParent() instanceof View) {
                            ViewCompat.requestApplyInsets((View) AppCompatDelegateImplV9.this.n.getParent());
                        }
                        AppCompatDelegateImplV9.this.n.removeAllViews();
                        AppCompatDelegateImplV9.this.q.setListener(null);
                        AppCompatDelegateImplV9.this.q = null;
                    }
                });
            }
            if (AppCompatDelegateImplV9.this.e != null) {
                AppCompatDelegateImplV9.this.e.onSupportActionModeFinished(AppCompatDelegateImplV9.this.m);
            }
            AppCompatDelegateImplV9.this.m = null;
        }

        @Override // tb.acn.a
        public boolean a(acn acnVar, Menu menu) {
            return this.b.a(acnVar, menu);
        }

        @Override // tb.acn.a
        public boolean a(acn acnVar, MenuItem menuItem) {
            return this.b.a(acnVar, menuItem);
        }

        @Override // tb.acn.a
        public boolean b(acn acnVar, Menu menu) {
            return this.b.b(acnVar, menu);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public final class c implements j.a {
        c() {
        }

        @Override // android.support.v7.view.menu.j.a
        public void a(android.support.v7.view.menu.e eVar, boolean z) {
            android.support.v7.view.menu.e p = eVar.p();
            boolean z2 = p != eVar;
            AppCompatDelegateImplV9 appCompatDelegateImplV9 = AppCompatDelegateImplV9.this;
            if (z2) {
                eVar = p;
            }
            PanelFeatureState a2 = appCompatDelegateImplV9.a((Menu) eVar);
            if (a2 != null) {
                if (!z2) {
                    AppCompatDelegateImplV9.this.a(a2, z);
                    return;
                }
                AppCompatDelegateImplV9.this.a(a2.f1323a, a2, p);
                AppCompatDelegateImplV9.this.a(a2, true);
            }
        }

        @Override // android.support.v7.view.menu.j.a
        public boolean a(android.support.v7.view.menu.e eVar) {
            Window.Callback r;
            if (eVar != null || !AppCompatDelegateImplV9.this.h || (r = AppCompatDelegateImplV9.this.r()) == null || AppCompatDelegateImplV9.this.q()) {
                return true;
            }
            r.onMenuOpened(108, eVar);
            return true;
        }
    }

    static {
        t = Build.VERSION.SDK_INT < 21;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AppCompatDelegateImplV9(Context context, Window window, android.support.v7.app.c cVar) {
        super(context, window, cVar);
        this.q = null;
        this.H = new Runnable() { // from class: android.support.v7.app.AppCompatDelegateImplV9.1
            @Override // java.lang.Runnable
            public void run() {
                if ((AppCompatDelegateImplV9.this.s & 1) != 0) {
                    AppCompatDelegateImplV9.this.g(0);
                }
                if ((AppCompatDelegateImplV9.this.s & 4096) != 0) {
                    AppCompatDelegateImplV9.this.g(108);
                }
                AppCompatDelegateImplV9 appCompatDelegateImplV9 = AppCompatDelegateImplV9.this;
                appCompatDelegateImplV9.r = false;
                appCompatDelegateImplV9.s = 0;
            }
        };
    }

    private void A() {
        if (!this.x) {
            return;
        }
        throw new AndroidRuntimeException("Window feature must be requested before adding content");
    }

    private void a(PanelFeatureState panelFeatureState, KeyEvent keyEvent) {
        int i;
        ViewGroup.LayoutParams layoutParams;
        if (panelFeatureState.o || q()) {
            return;
        }
        if (panelFeatureState.f1323a == 0) {
            if ((this.f1331a.getResources().getConfiguration().screenLayout & 15) == 4) {
                return;
            }
        }
        Window.Callback r = r();
        if (r != null && !r.onMenuOpened(panelFeatureState.f1323a, panelFeatureState.j)) {
            a(panelFeatureState, true);
            return;
        }
        WindowManager windowManager = (WindowManager) this.f1331a.getSystemService(com.taobao.android.weex_framework.util.a.ATOM_EXT_window);
        if (windowManager == null || !b(panelFeatureState, keyEvent)) {
            return;
        }
        if (panelFeatureState.g == null || panelFeatureState.q) {
            if (panelFeatureState.g == null) {
                if (!a(panelFeatureState) || panelFeatureState.g == null) {
                    return;
                }
            } else if (panelFeatureState.q && panelFeatureState.g.getChildCount() > 0) {
                panelFeatureState.g.removeAllViews();
            }
            if (!c(panelFeatureState) || !panelFeatureState.a()) {
                return;
            }
            ViewGroup.LayoutParams layoutParams2 = panelFeatureState.h.getLayoutParams();
            if (layoutParams2 == null) {
                layoutParams2 = new ViewGroup.LayoutParams(-2, -2);
            }
            panelFeatureState.g.setBackgroundResource(panelFeatureState.b);
            ViewParent parent = panelFeatureState.h.getParent();
            if (parent != null && (parent instanceof ViewGroup)) {
                ((ViewGroup) parent).removeView(panelFeatureState.h);
            }
            panelFeatureState.g.addView(panelFeatureState.h, layoutParams2);
            if (!panelFeatureState.h.hasFocus()) {
                panelFeatureState.h.requestFocus();
            }
        } else if (panelFeatureState.i != null && (layoutParams = panelFeatureState.i.getLayoutParams()) != null && layoutParams.width == -1) {
            i = -1;
            panelFeatureState.n = false;
            WindowManager.LayoutParams layoutParams3 = new WindowManager.LayoutParams(i, -2, panelFeatureState.d, panelFeatureState.e, 1002, 8519680, -3);
            layoutParams3.gravity = panelFeatureState.c;
            layoutParams3.windowAnimations = panelFeatureState.f;
            windowManager.addView(panelFeatureState.g, layoutParams3);
            panelFeatureState.o = true;
        }
        i = -2;
        panelFeatureState.n = false;
        WindowManager.LayoutParams layoutParams32 = new WindowManager.LayoutParams(i, -2, panelFeatureState.d, panelFeatureState.e, 1002, 8519680, -3);
        layoutParams32.gravity = panelFeatureState.c;
        layoutParams32.windowAnimations = panelFeatureState.f;
        windowManager.addView(panelFeatureState.g, layoutParams32);
        panelFeatureState.o = true;
    }

    private void a(android.support.v7.view.menu.e eVar, boolean z) {
        DecorContentParent decorContentParent = this.u;
        if (decorContentParent == null || !decorContentParent.canShowOverflowMenu() || (ViewConfiguration.get(this.f1331a).hasPermanentMenuKey() && !this.u.isOverflowMenuShowPending())) {
            PanelFeatureState a2 = a(0, true);
            a2.q = true;
            a(a2, false);
            a(a2, (KeyEvent) null);
            return;
        }
        Window.Callback r = r();
        if (this.u.isOverflowMenuShowing() && z) {
            this.u.hideOverflowMenu();
            if (q()) {
                return;
            }
            r.onPanelClosed(108, a(0, true).j);
        } else if (r == null || q()) {
        } else {
            if (this.r && (this.s & 1) != 0) {
                this.b.getDecorView().removeCallbacks(this.H);
                this.H.run();
            }
            PanelFeatureState a3 = a(0, true);
            if (a3.j == null || a3.r || !r.onPreparePanel(0, a3.i, a3.j)) {
                return;
            }
            r.onMenuOpened(108, a3.j);
            this.u.showOverflowMenu();
        }
    }

    private boolean a(PanelFeatureState panelFeatureState) {
        panelFeatureState.a(o());
        panelFeatureState.g = new ListMenuDecorView(panelFeatureState.l);
        panelFeatureState.c = 81;
        return true;
    }

    private boolean a(PanelFeatureState panelFeatureState, int i, KeyEvent keyEvent, int i2) {
        boolean z = false;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((panelFeatureState.m || b(panelFeatureState, keyEvent)) && panelFeatureState.j != null) {
            z = panelFeatureState.j.performShortcut(i, keyEvent, i2);
        }
        if (z && (i2 & 1) == 0 && this.u == null) {
            a(panelFeatureState, true);
        }
        return z;
    }

    private boolean a(ViewParent viewParent) {
        if (viewParent == null) {
            return false;
        }
        View decorView = this.b.getDecorView();
        while (viewParent != null) {
            if (viewParent == decorView || !(viewParent instanceof View) || ViewCompat.isAttachedToWindow((View) viewParent)) {
                return false;
            }
            viewParent = viewParent.getParent();
        }
        return true;
    }

    private boolean b(PanelFeatureState panelFeatureState) {
        Context context = this.f1331a;
        if ((panelFeatureState.f1323a == 0 || panelFeatureState.f1323a == 108) && this.u != null) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme theme = context.getTheme();
            theme.resolveAttribute(R.attr.actionBarTheme, typedValue, true);
            Resources.Theme theme2 = null;
            if (typedValue.resourceId != 0) {
                theme2 = context.getResources().newTheme();
                theme2.setTo(theme);
                theme2.applyStyle(typedValue.resourceId, true);
                theme2.resolveAttribute(R.attr.actionBarWidgetTheme, typedValue, true);
            } else {
                theme.resolveAttribute(R.attr.actionBarWidgetTheme, typedValue, true);
            }
            if (typedValue.resourceId != 0) {
                if (theme2 == null) {
                    theme2 = context.getResources().newTheme();
                    theme2.setTo(theme);
                }
                theme2.applyStyle(typedValue.resourceId, true);
            }
            if (theme2 != null) {
                acp acpVar = new acp(context, 0);
                acpVar.getTheme().setTo(theme2);
                context = acpVar;
            }
        }
        android.support.v7.view.menu.e eVar = new android.support.v7.view.menu.e(context);
        eVar.a(this);
        panelFeatureState.a(eVar);
        return true;
    }

    private boolean b(PanelFeatureState panelFeatureState, KeyEvent keyEvent) {
        DecorContentParent decorContentParent;
        DecorContentParent decorContentParent2;
        DecorContentParent decorContentParent3;
        if (q()) {
            return false;
        }
        if (panelFeatureState.m) {
            return true;
        }
        PanelFeatureState panelFeatureState2 = this.F;
        if (panelFeatureState2 != null && panelFeatureState2 != panelFeatureState) {
            a(panelFeatureState2, false);
        }
        Window.Callback r = r();
        if (r != null) {
            panelFeatureState.i = r.onCreatePanelView(panelFeatureState.f1323a);
        }
        boolean z = panelFeatureState.f1323a == 0 || panelFeatureState.f1323a == 108;
        if (z && (decorContentParent3 = this.u) != null) {
            decorContentParent3.setMenuPrepared();
        }
        if (panelFeatureState.i == null && (!z || !(n() instanceof k))) {
            if (panelFeatureState.j == null || panelFeatureState.r) {
                if (panelFeatureState.j == null && (!b(panelFeatureState) || panelFeatureState.j == null)) {
                    return false;
                }
                if (z && this.u != null) {
                    if (this.v == null) {
                        this.v = new a();
                    }
                    this.u.setMenu(panelFeatureState.j, this.v);
                }
                panelFeatureState.j.g();
                if (!r.onCreatePanelMenu(panelFeatureState.f1323a, panelFeatureState.j)) {
                    panelFeatureState.a((android.support.v7.view.menu.e) null);
                    if (z && (decorContentParent = this.u) != null) {
                        decorContentParent.setMenu(null, this.v);
                    }
                    return false;
                }
                panelFeatureState.r = false;
            }
            panelFeatureState.j.g();
            if (panelFeatureState.s != null) {
                panelFeatureState.j.d(panelFeatureState.s);
                panelFeatureState.s = null;
            }
            if (!r.onPreparePanel(0, panelFeatureState.i, panelFeatureState.j)) {
                if (z && (decorContentParent2 = this.u) != null) {
                    decorContentParent2.setMenu(null, this.v);
                }
                panelFeatureState.j.h();
                return false;
            }
            panelFeatureState.p = KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1;
            panelFeatureState.j.setQwertyMode(panelFeatureState.p);
            panelFeatureState.j.h();
        }
        panelFeatureState.m = true;
        panelFeatureState.n = false;
        this.F = panelFeatureState;
        return true;
    }

    private boolean c(PanelFeatureState panelFeatureState) {
        if (panelFeatureState.i != null) {
            panelFeatureState.h = panelFeatureState.i;
            return true;
        } else if (panelFeatureState.j == null) {
            return false;
        } else {
            if (this.w == null) {
                this.w = new c();
            }
            panelFeatureState.h = (View) panelFeatureState.a(this.w);
            return panelFeatureState.h != null;
        }
    }

    private boolean d(int i, KeyEvent keyEvent) {
        if (keyEvent.getRepeatCount() == 0) {
            PanelFeatureState a2 = a(i, true);
            if (a2.o) {
                return false;
            }
            return b(a2, keyEvent);
        }
        return false;
    }

    private void e(int i) {
        this.s = (1 << i) | this.s;
        if (!this.r) {
            ViewCompat.postOnAnimation(this.b.getDecorView(), this.H);
            this.r = true;
        }
    }

    private boolean e(int i, KeyEvent keyEvent) {
        boolean z;
        boolean z2;
        AudioManager audioManager;
        DecorContentParent decorContentParent;
        if (this.m != null) {
            return false;
        }
        PanelFeatureState a2 = a(i, true);
        if (i != 0 || (decorContentParent = this.u) == null || !decorContentParent.canShowOverflowMenu() || ViewConfiguration.get(this.f1331a).hasPermanentMenuKey()) {
            if (a2.o || a2.n) {
                z = a2.o;
                a(a2, true);
            } else {
                if (a2.m) {
                    if (a2.r) {
                        a2.m = false;
                        z2 = b(a2, keyEvent);
                    } else {
                        z2 = true;
                    }
                    if (z2) {
                        a(a2, keyEvent);
                        z = true;
                    }
                }
                z = false;
            }
        } else if (!this.u.isOverflowMenuShowing()) {
            if (!q() && b(a2, keyEvent)) {
                z = this.u.showOverflowMenu();
            }
            z = false;
        } else {
            z = this.u.hideOverflowMenu();
        }
        if (z && (audioManager = (AudioManager) this.f1331a.getSystemService("audio")) != null) {
            audioManager.playSoundEffect(0);
        }
        return z;
    }

    private int i(int i) {
        if (i == 8) {
            return 108;
        }
        if (i != 9) {
            return i;
        }
        return 109;
    }

    private void x() {
        if (!this.x) {
            this.y = y();
            CharSequence s = s();
            if (!TextUtils.isEmpty(s)) {
                b(s);
            }
            z();
            this.x = true;
            PanelFeatureState a2 = a(0, false);
            if (q()) {
                return;
            }
            if (a2 != null && a2.j != null) {
                return;
            }
            e(108);
        }
    }

    private ViewGroup y() {
        ViewGroup viewGroup;
        TypedArray obtainStyledAttributes = this.f1331a.obtainStyledAttributes(R.styleable.AppCompatTheme);
        if (!obtainStyledAttributes.hasValue(R.styleable.AppCompatTheme_windowActionBar)) {
            obtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
        if (obtainStyledAttributes.getBoolean(R.styleable.AppCompatTheme_windowNoTitle, false)) {
            c(1);
        } else if (obtainStyledAttributes.getBoolean(R.styleable.AppCompatTheme_windowActionBar, false)) {
            c(108);
        }
        if (obtainStyledAttributes.getBoolean(R.styleable.AppCompatTheme_windowActionBarOverlay, false)) {
            c(109);
        }
        if (obtainStyledAttributes.getBoolean(R.styleable.AppCompatTheme_windowActionModeOverlay, false)) {
            c(10);
        }
        this.k = obtainStyledAttributes.getBoolean(R.styleable.AppCompatTheme_android_windowIsFloating, false);
        obtainStyledAttributes.recycle();
        this.b.getDecorView();
        LayoutInflater from = LayoutInflater.from(this.f1331a);
        if (this.l) {
            viewGroup = (ViewGroup) from.inflate(this.j ? R.layout.abc_screen_simple_overlay_action_mode : R.layout.abc_screen_simple, (ViewGroup) null);
            if (Build.VERSION.SDK_INT >= 21) {
                ViewCompat.setOnApplyWindowInsetsListener(viewGroup, new OnApplyWindowInsetsListener() { // from class: android.support.v7.app.AppCompatDelegateImplV9.2
                    @Override // android.support.v4.view.OnApplyWindowInsetsListener
                    public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                        int systemWindowInsetTop = windowInsetsCompat.getSystemWindowInsetTop();
                        int h = AppCompatDelegateImplV9.this.h(systemWindowInsetTop);
                        if (systemWindowInsetTop != h) {
                            windowInsetsCompat = windowInsetsCompat.replaceSystemWindowInsets(windowInsetsCompat.getSystemWindowInsetLeft(), h, windowInsetsCompat.getSystemWindowInsetRight(), windowInsetsCompat.getSystemWindowInsetBottom());
                        }
                        return ViewCompat.onApplyWindowInsets(view, windowInsetsCompat);
                    }
                });
            } else {
                ((FitWindowsViewGroup) viewGroup).setOnFitSystemWindowsListener(new FitWindowsViewGroup.OnFitSystemWindowsListener() { // from class: android.support.v7.app.AppCompatDelegateImplV9.3
                    @Override // android.support.v7.widget.FitWindowsViewGroup.OnFitSystemWindowsListener
                    public void onFitSystemWindows(Rect rect) {
                        rect.top = AppCompatDelegateImplV9.this.h(rect.top);
                    }
                });
            }
        } else if (this.k) {
            viewGroup = (ViewGroup) from.inflate(R.layout.abc_dialog_title_material, (ViewGroup) null);
            this.i = false;
            this.h = false;
        } else if (this.h) {
            TypedValue typedValue = new TypedValue();
            this.f1331a.getTheme().resolveAttribute(R.attr.actionBarTheme, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new acp(this.f1331a, typedValue.resourceId) : this.f1331a).inflate(R.layout.abc_screen_toolbar, (ViewGroup) null);
            this.u = (DecorContentParent) viewGroup.findViewById(R.id.decor_content_parent);
            this.u.setWindowCallback(r());
            if (this.i) {
                this.u.initFeature(109);
            }
            if (this.B) {
                this.u.initFeature(2);
            }
            if (this.C) {
                this.u.initFeature(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.h + ", windowActionBarOverlay: " + this.i + ", android:windowIsFloating: " + this.k + ", windowActionModeOverlay: " + this.j + ", windowNoTitle: " + this.l + " }");
        }
        if (this.u == null) {
            this.z = (TextView) viewGroup.findViewById(R.id.title);
        }
        ViewUtils.makeOptionalFitsSystemWindows(viewGroup);
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(R.id.action_bar_activity_content);
        ViewGroup viewGroup2 = (ViewGroup) this.b.findViewById(16908290);
        if (viewGroup2 != null) {
            while (viewGroup2.getChildCount() > 0) {
                View childAt = viewGroup2.getChildAt(0);
                viewGroup2.removeViewAt(0);
                contentFrameLayout.addView(childAt);
            }
            viewGroup2.setId(-1);
            contentFrameLayout.setId(16908290);
            if (viewGroup2 instanceof FrameLayout) {
                ((FrameLayout) viewGroup2).setForeground(null);
            }
        }
        this.b.setContentView(viewGroup);
        contentFrameLayout.setAttachListener(new ContentFrameLayout.OnAttachListener() { // from class: android.support.v7.app.AppCompatDelegateImplV9.4
            @Override // android.support.v7.widget.ContentFrameLayout.OnAttachListener
            public void onAttachedFromWindow() {
            }

            @Override // android.support.v7.widget.ContentFrameLayout.OnAttachListener
            public void onDetachedFromWindow() {
                AppCompatDelegateImplV9.this.w();
            }
        });
        return viewGroup;
    }

    private void z() {
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) this.y.findViewById(16908290);
        View decorView = this.b.getDecorView();
        contentFrameLayout.setDecorPadding(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        TypedArray obtainStyledAttributes = this.f1331a.obtainStyledAttributes(R.styleable.AppCompatTheme);
        obtainStyledAttributes.getValue(R.styleable.AppCompatTheme_windowMinWidthMajor, contentFrameLayout.getMinWidthMajor());
        obtainStyledAttributes.getValue(R.styleable.AppCompatTheme_windowMinWidthMinor, contentFrameLayout.getMinWidthMinor());
        if (obtainStyledAttributes.hasValue(R.styleable.AppCompatTheme_windowFixedWidthMajor)) {
            obtainStyledAttributes.getValue(R.styleable.AppCompatTheme_windowFixedWidthMajor, contentFrameLayout.getFixedWidthMajor());
        }
        if (obtainStyledAttributes.hasValue(R.styleable.AppCompatTheme_windowFixedWidthMinor)) {
            obtainStyledAttributes.getValue(R.styleable.AppCompatTheme_windowFixedWidthMinor, contentFrameLayout.getFixedWidthMinor());
        }
        if (obtainStyledAttributes.hasValue(R.styleable.AppCompatTheme_windowFixedHeightMajor)) {
            obtainStyledAttributes.getValue(R.styleable.AppCompatTheme_windowFixedHeightMajor, contentFrameLayout.getFixedHeightMajor());
        }
        if (obtainStyledAttributes.hasValue(R.styleable.AppCompatTheme_windowFixedHeightMinor)) {
            obtainStyledAttributes.getValue(R.styleable.AppCompatTheme_windowFixedHeightMinor, contentFrameLayout.getFixedHeightMinor());
        }
        obtainStyledAttributes.recycle();
        contentFrameLayout.requestLayout();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public PanelFeatureState a(int i, boolean z) {
        PanelFeatureState[] panelFeatureStateArr = this.E;
        if (panelFeatureStateArr == null || panelFeatureStateArr.length <= i) {
            PanelFeatureState[] panelFeatureStateArr2 = new PanelFeatureState[i + 1];
            if (panelFeatureStateArr != null) {
                System.arraycopy(panelFeatureStateArr, 0, panelFeatureStateArr2, 0, panelFeatureStateArr.length);
            }
            this.E = panelFeatureStateArr2;
            panelFeatureStateArr = panelFeatureStateArr2;
        }
        PanelFeatureState panelFeatureState = panelFeatureStateArr[i];
        if (panelFeatureState == null) {
            PanelFeatureState panelFeatureState2 = new PanelFeatureState(i);
            panelFeatureStateArr[i] = panelFeatureState2;
            return panelFeatureState2;
        }
        return panelFeatureState;
    }

    PanelFeatureState a(Menu menu) {
        PanelFeatureState[] panelFeatureStateArr = this.E;
        int length = panelFeatureStateArr != null ? panelFeatureStateArr.length : 0;
        for (int i = 0; i < length; i++) {
            PanelFeatureState panelFeatureState = panelFeatureStateArr[i];
            if (panelFeatureState != null && panelFeatureState.j == menu) {
                return panelFeatureState;
            }
        }
        return null;
    }

    @Override // android.support.v7.app.AppCompatDelegate
    public <T extends View> T a(int i) {
        x();
        return (T) this.b.findViewById(i);
    }

    View a(View view, String str, Context context, AttributeSet attributeSet) {
        View onCreateView;
        if (!(this.c instanceof LayoutInflater.Factory) || (onCreateView = ((LayoutInflater.Factory) this.c).onCreateView(str, context, attributeSet)) == null) {
            return null;
        }
        return onCreateView;
    }

    @Override // android.support.v7.app.AppCompatDelegate
    public acn a(acn.a aVar) {
        if (aVar != null) {
            acn acnVar = this.m;
            if (acnVar != null) {
                acnVar.c();
            }
            b bVar = new b(aVar);
            ActionBar a2 = a();
            if (a2 != null) {
                this.m = a2.a(bVar);
                if (this.m != null && this.e != null) {
                    this.e.onSupportActionModeStarted(this.m);
                }
            }
            if (this.m == null) {
                this.m = b(bVar);
            }
            return this.m;
        }
        throw new IllegalArgumentException("ActionMode callback can not be null.");
    }

    void a(int i, PanelFeatureState panelFeatureState, Menu menu) {
        if (menu == null) {
            if (panelFeatureState == null && i >= 0) {
                PanelFeatureState[] panelFeatureStateArr = this.E;
                if (i < panelFeatureStateArr.length) {
                    panelFeatureState = panelFeatureStateArr[i];
                }
            }
            if (panelFeatureState != null) {
                menu = panelFeatureState.j;
            }
        }
        if ((panelFeatureState == null || panelFeatureState.o) && !q()) {
            this.c.onPanelClosed(i, menu);
        }
    }

    @Override // android.support.v7.app.d
    void a(int i, Menu menu) {
        if (i == 108) {
            ActionBar a2 = a();
            if (a2 == null) {
                return;
            }
            a2.j(false);
        } else if (i != 0) {
        } else {
            PanelFeatureState a3 = a(i, true);
            if (!a3.o) {
                return;
            }
            a(a3, false);
        }
    }

    @Override // android.support.v7.app.AppCompatDelegate
    public void a(Configuration configuration) {
        ActionBar a2;
        if (this.h && this.x && (a2 = a()) != null) {
            a2.a(configuration);
        }
        AppCompatDrawableManager.get().onConfigurationChanged(this.f1331a);
        j();
    }

    @Override // android.support.v7.app.AppCompatDelegate
    public void a(Bundle bundle) {
        if (!(this.c instanceof Activity) || NavUtils.getParentActivityName((Activity) this.c) == null) {
            return;
        }
        ActionBar n = n();
        if (n == null) {
            this.I = true;
        } else {
            n.h(true);
        }
    }

    void a(PanelFeatureState panelFeatureState, boolean z) {
        DecorContentParent decorContentParent;
        if (z && panelFeatureState.f1323a == 0 && (decorContentParent = this.u) != null && decorContentParent.isOverflowMenuShowing()) {
            b(panelFeatureState.j);
            return;
        }
        WindowManager windowManager = (WindowManager) this.f1331a.getSystemService(com.taobao.android.weex_framework.util.a.ATOM_EXT_window);
        if (windowManager != null && panelFeatureState.o && panelFeatureState.g != null) {
            windowManager.removeView(panelFeatureState.g);
            if (z) {
                a(panelFeatureState.f1323a, panelFeatureState, (Menu) null);
            }
        }
        panelFeatureState.m = false;
        panelFeatureState.n = false;
        panelFeatureState.o = false;
        panelFeatureState.h = null;
        panelFeatureState.q = true;
        if (this.F != panelFeatureState) {
            return;
        }
        this.F = null;
    }

    @Override // android.support.v7.view.menu.e.a
    public void a(android.support.v7.view.menu.e eVar) {
        a(eVar, true);
    }

    @Override // android.support.v7.app.AppCompatDelegate
    public void a(Toolbar toolbar) {
        Window window;
        Window.Callback callback;
        if (!(this.c instanceof Activity)) {
            return;
        }
        ActionBar a2 = a();
        if (a2 instanceof n) {
            throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
        }
        this.g = null;
        if (a2 != null) {
            a2.m();
        }
        if (toolbar != null) {
            k kVar = new k(toolbar, ((Activity) this.c).getTitle(), this.d);
            this.f = kVar;
            window = this.b;
            callback = kVar.n();
        } else {
            this.f = null;
            window = this.b;
            callback = this.d;
        }
        window.setCallback(callback);
        f();
    }

    @Override // android.support.v7.app.AppCompatDelegate
    public void a(View view) {
        x();
        ViewGroup viewGroup = (ViewGroup) this.y.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.c.onContentChanged();
    }

    @Override // android.support.v7.app.AppCompatDelegate
    public void a(View view, ViewGroup.LayoutParams layoutParams) {
        x();
        ViewGroup viewGroup = (ViewGroup) this.y.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.c.onContentChanged();
    }

    @Override // android.support.v7.app.d
    boolean a(int i, KeyEvent keyEvent) {
        ActionBar a2 = a();
        if (a2 == null || !a2.a(i, keyEvent)) {
            PanelFeatureState panelFeatureState = this.F;
            if (panelFeatureState != null && a(panelFeatureState, keyEvent.getKeyCode(), keyEvent, 1)) {
                PanelFeatureState panelFeatureState2 = this.F;
                if (panelFeatureState2 != null) {
                    panelFeatureState2.n = true;
                }
                return true;
            }
            if (this.F == null) {
                PanelFeatureState a3 = a(0, true);
                b(a3, keyEvent);
                boolean a4 = a(a3, keyEvent.getKeyCode(), keyEvent, 1);
                a3.m = false;
                if (a4) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.support.v7.view.menu.e.a
    public boolean a(android.support.v7.view.menu.e eVar, MenuItem menuItem) {
        PanelFeatureState a2;
        Window.Callback r = r();
        if (r == null || q() || (a2 = a((Menu) eVar.p())) == null) {
            return false;
        }
        return r.onMenuItemSelected(a2.f1323a, menuItem);
    }

    @Override // android.support.v7.app.d
    boolean a(KeyEvent keyEvent) {
        boolean z = true;
        if (keyEvent.getKeyCode() != 82 || !this.c.dispatchKeyEvent(keyEvent)) {
            int keyCode = keyEvent.getKeyCode();
            if (keyEvent.getAction() != 0) {
                z = false;
            }
            return z ? c(keyCode, keyEvent) : b(keyCode, keyEvent);
        }
        return true;
    }

    public View b(View view, String str, Context context, AttributeSet attributeSet) {
        boolean z;
        i iVar;
        boolean z2 = false;
        if (this.L == null) {
            String string = this.f1331a.obtainStyledAttributes(R.styleable.AppCompatTheme).getString(R.styleable.AppCompatTheme_viewInflaterClass);
            if (string == null || i.class.getName().equals(string)) {
                iVar = new i();
            } else {
                try {
                    this.L = (i) Class.forName(string).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (Throwable unused) {
                    String str2 = "Failed to instantiate custom view inflater " + string + ". Falling back to default.";
                    iVar = new i();
                }
            }
            this.L = iVar;
        }
        if (t) {
            if (!(attributeSet instanceof XmlPullParser)) {
                z2 = a((ViewParent) view);
            } else if (((XmlPullParser) attributeSet).getDepth() > 1) {
                z2 = true;
            }
            z = z2;
        } else {
            z = false;
        }
        return this.L.a(view, str, context, attributeSet, z, t, true, VectorEnabledTintResources.shouldBeUsed());
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x002d  */
    @Override // android.support.v7.app.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    tb.acn b(tb.acn.a r8) {
        /*
            Method dump skipped, instructions count: 380
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.app.AppCompatDelegateImplV9.b(tb.acn$a):tb.acn");
    }

    @Override // android.support.v7.app.AppCompatDelegate
    public void b(int i) {
        x();
        ViewGroup viewGroup = (ViewGroup) this.y.findViewById(16908290);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f1331a).inflate(i, viewGroup);
        this.c.onContentChanged();
    }

    @Override // android.support.v7.app.AppCompatDelegate
    public void b(Bundle bundle) {
        x();
    }

    void b(android.support.v7.view.menu.e eVar) {
        if (this.D) {
            return;
        }
        this.D = true;
        this.u.dismissPopups();
        Window.Callback r = r();
        if (r != null && !q()) {
            r.onPanelClosed(108, eVar);
        }
        this.D = false;
    }

    @Override // android.support.v7.app.AppCompatDelegate
    public void b(View view, ViewGroup.LayoutParams layoutParams) {
        x();
        ((ViewGroup) this.y.findViewById(16908290)).addView(view, layoutParams);
        this.c.onContentChanged();
    }

    @Override // android.support.v7.app.d
    void b(CharSequence charSequence) {
        DecorContentParent decorContentParent = this.u;
        if (decorContentParent != null) {
            decorContentParent.setWindowTitle(charSequence);
        } else if (n() != null) {
            n().c(charSequence);
        } else {
            TextView textView = this.z;
            if (textView == null) {
                return;
            }
            textView.setText(charSequence);
        }
    }

    boolean b(int i, KeyEvent keyEvent) {
        if (i == 4) {
            boolean z = this.G;
            this.G = false;
            PanelFeatureState a2 = a(0, false);
            if (a2 != null && a2.o) {
                if (!z) {
                    a(a2, true);
                }
                return true;
            } else if (v()) {
                return true;
            }
        } else if (i == 82) {
            e(0, keyEvent);
            return true;
        }
        return false;
    }

    @Override // android.support.v7.app.d
    boolean b(int i, Menu menu) {
        if (i == 108) {
            ActionBar a2 = a();
            if (a2 != null) {
                a2.j(true);
            }
            return true;
        }
        return false;
    }

    @Override // android.support.v7.app.AppCompatDelegate
    public boolean c(int i) {
        int i2 = i(i);
        if (!this.l || i2 != 108) {
            if (this.h && i2 == 1) {
                this.h = false;
            }
            if (i2 == 1) {
                A();
                this.l = true;
                return true;
            } else if (i2 == 2) {
                A();
                this.B = true;
                return true;
            } else if (i2 == 5) {
                A();
                this.C = true;
                return true;
            } else if (i2 == 10) {
                A();
                this.j = true;
                return true;
            } else if (i2 == 108) {
                A();
                this.h = true;
                return true;
            } else if (i2 != 109) {
                return this.b.requestFeature(i2);
            } else {
                A();
                this.i = true;
                return true;
            }
        }
        return false;
    }

    boolean c(int i, KeyEvent keyEvent) {
        boolean z = true;
        if (i == 4) {
            if ((keyEvent.getFlags() & 128) == 0) {
                z = false;
            }
            this.G = z;
        } else if (i == 82) {
            d(0, keyEvent);
            return true;
        }
        return false;
    }

    @Override // android.support.v7.app.d, android.support.v7.app.AppCompatDelegate
    public void d() {
        ActionBar a2 = a();
        if (a2 != null) {
            a2.i(false);
        }
    }

    @Override // android.support.v7.app.AppCompatDelegate
    public void e() {
        ActionBar a2 = a();
        if (a2 != null) {
            a2.i(true);
        }
    }

    @Override // android.support.v7.app.AppCompatDelegate
    public void f() {
        ActionBar a2 = a();
        if (a2 == null || !a2.k()) {
            e(0);
        }
    }

    void f(int i) {
        a(a(i, true), true);
    }

    @Override // android.support.v7.app.d, android.support.v7.app.AppCompatDelegate
    public void g() {
        if (this.r) {
            this.b.getDecorView().removeCallbacks(this.H);
        }
        super.g();
        if (this.f != null) {
            this.f.m();
        }
    }

    void g(int i) {
        PanelFeatureState a2;
        PanelFeatureState a3 = a(i, true);
        if (a3.j != null) {
            Bundle bundle = new Bundle();
            a3.j.c(bundle);
            if (bundle.size() > 0) {
                a3.s = bundle;
            }
            a3.j.g();
            a3.j.clear();
        }
        a3.r = true;
        a3.q = true;
        if ((i != 108 && i != 0) || this.u == null || (a2 = a(0, false)) == null) {
            return;
        }
        a2.m = false;
        b(a2, (KeyEvent) null);
    }

    int h(int i) {
        boolean z;
        boolean z2;
        ActionBarContextView actionBarContextView = this.n;
        int i2 = 0;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.n.getLayoutParams();
            z = true;
            if (this.n.isShown()) {
                if (this.J == null) {
                    this.J = new Rect();
                    this.K = new Rect();
                }
                Rect rect = this.J;
                Rect rect2 = this.K;
                rect.set(0, i, 0, 0);
                ViewUtils.computeFitSystemWindows(this.y, rect, rect2);
                if (marginLayoutParams.topMargin != (rect2.top == 0 ? i : 0)) {
                    marginLayoutParams.topMargin = i;
                    View view = this.A;
                    if (view == null) {
                        this.A = new View(this.f1331a);
                        this.A.setBackgroundColor(this.f1331a.getResources().getColor(R.color.abc_input_method_navigation_guard));
                        this.y.addView(this.A, -1, new ViewGroup.LayoutParams(-1, i));
                    } else {
                        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                        if (layoutParams.height != i) {
                            layoutParams.height = i;
                            this.A.setLayoutParams(layoutParams);
                        }
                    }
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (this.A == null) {
                    z = false;
                }
                if (!this.j && z) {
                    i = 0;
                }
            } else {
                if (marginLayoutParams.topMargin != 0) {
                    marginLayoutParams.topMargin = 0;
                    z2 = true;
                } else {
                    z2 = false;
                }
                z = false;
            }
            if (z2) {
                this.n.setLayoutParams(marginLayoutParams);
            }
        }
        View view2 = this.A;
        if (view2 != null) {
            if (!z) {
                i2 = 8;
            }
            view2.setVisibility(i2);
        }
        return i;
    }

    @Override // android.support.v7.app.AppCompatDelegate
    public void i() {
        LayoutInflater from = LayoutInflater.from(this.f1331a);
        if (from.getFactory() == null) {
            LayoutInflaterCompat.setFactory2(from, this);
        } else {
            from.getFactory2();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    @Override // android.support.v7.app.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m() {
        /*
            r3 = this;
            r3.x()
            boolean r0 = r3.h
            if (r0 == 0) goto L3b
            android.support.v7.app.ActionBar r0 = r3.f
            if (r0 == 0) goto Lc
            goto L3b
        Lc:
            android.view.Window$Callback r0 = r3.c
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L20
            android.support.v7.app.n r0 = new android.support.v7.app.n
            android.view.Window$Callback r1 = r3.c
            android.app.Activity r1 = (android.app.Activity) r1
            boolean r2 = r3.i
            r0.<init>(r1, r2)
        L1d:
            r3.f = r0
            goto L30
        L20:
            android.view.Window$Callback r0 = r3.c
            boolean r0 = r0 instanceof android.app.Dialog
            if (r0 == 0) goto L30
            android.support.v7.app.n r0 = new android.support.v7.app.n
            android.view.Window$Callback r1 = r3.c
            android.app.Dialog r1 = (android.app.Dialog) r1
            r0.<init>(r1)
            goto L1d
        L30:
            android.support.v7.app.ActionBar r0 = r3.f
            if (r0 == 0) goto L3b
            android.support.v7.app.ActionBar r0 = r3.f
            boolean r1 = r3.I
            r0.h(r1)
        L3b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.app.AppCompatDelegateImplV9.m():void");
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View a2 = a(view, str, context, attributeSet);
        return a2 != null ? a2 : b(view, str, context, attributeSet);
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    final boolean t() {
        ViewGroup viewGroup;
        return this.x && (viewGroup = this.y) != null && ViewCompat.isLaidOut(viewGroup);
    }

    void u() {
        ViewPropertyAnimatorCompat viewPropertyAnimatorCompat = this.q;
        if (viewPropertyAnimatorCompat != null) {
            viewPropertyAnimatorCompat.cancel();
        }
    }

    boolean v() {
        acn acnVar = this.m;
        if (acnVar != null) {
            acnVar.c();
            return true;
        }
        ActionBar a2 = a();
        return a2 != null && a2.l();
    }

    void w() {
        DecorContentParent decorContentParent = this.u;
        if (decorContentParent != null) {
            decorContentParent.dismissPopups();
        }
        if (this.o != null) {
            this.b.getDecorView().removeCallbacks(this.p);
            if (this.o.isShowing()) {
                try {
                    this.o.dismiss();
                } catch (IllegalArgumentException unused) {
                }
            }
            this.o = null;
        }
        u();
        PanelFeatureState a2 = a(0, false);
        if (a2 == null || a2.j == null) {
            return;
        }
        a2.j.close();
    }
}
