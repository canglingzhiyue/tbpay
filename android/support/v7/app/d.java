package android.support.v7.app;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.a;
import android.support.v7.widget.TintTypedArray;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.Window;
import java.lang.Thread;
import tb.acn;
import tb.acs;
import tb.acu;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class d extends AppCompatDelegate {
    private static boolean m;
    private static final boolean n;
    private static final int[] o;

    /* renamed from: a  reason: collision with root package name */
    final Context f1331a;
    final Window b;
    final Window.Callback c;
    final Window.Callback d;
    final c e;
    ActionBar f;
    MenuInflater g;
    boolean h;
    boolean i;
    boolean j;
    boolean k;
    boolean l;
    private CharSequence p;
    private boolean q;
    private boolean r;

    /* loaded from: classes2.dex */
    private class a implements a.InterfaceC0011a {
        a() {
        }

        @Override // android.support.v7.app.a.InterfaceC0011a
        public void a(int i) {
            ActionBar a2 = d.this.a();
            if (a2 != null) {
                a2.d(i);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b extends acu {
        /* JADX INFO: Access modifiers changed from: package-private */
        public b(Window.Callback callback) {
            super(callback);
        }

        @Override // tb.acu, android.view.Window.Callback
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return d.this.a(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // tb.acu, android.view.Window.Callback
        public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
            return super.dispatchKeyShortcutEvent(keyEvent) || d.this.a(keyEvent.getKeyCode(), keyEvent);
        }

        @Override // tb.acu, android.view.Window.Callback
        public void onContentChanged() {
        }

        @Override // tb.acu, android.view.Window.Callback
        public boolean onCreatePanelMenu(int i, Menu menu) {
            if (i != 0 || (menu instanceof android.support.v7.view.menu.e)) {
                return super.onCreatePanelMenu(i, menu);
            }
            return false;
        }

        @Override // tb.acu, android.view.Window.Callback
        public boolean onMenuOpened(int i, Menu menu) {
            super.onMenuOpened(i, menu);
            d.this.b(i, menu);
            return true;
        }

        @Override // tb.acu, android.view.Window.Callback
        public void onPanelClosed(int i, Menu menu) {
            super.onPanelClosed(i, menu);
            d.this.a(i, menu);
        }

        @Override // tb.acu, android.view.Window.Callback
        public boolean onPreparePanel(int i, View view, Menu menu) {
            android.support.v7.view.menu.e eVar = menu instanceof android.support.v7.view.menu.e ? (android.support.v7.view.menu.e) menu : null;
            if (i == 0 && eVar == null) {
                return false;
            }
            if (eVar != null) {
                eVar.c(true);
            }
            boolean onPreparePanel = super.onPreparePanel(i, view, menu);
            if (eVar != null) {
                eVar.c(false);
            }
            return onPreparePanel;
        }
    }

    static {
        boolean z = Build.VERSION.SDK_INT < 21;
        n = z;
        if (z && !m) {
            final Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
            Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: android.support.v7.app.d.1
                private boolean a(Throwable th) {
                    String message;
                    return (th instanceof Resources.NotFoundException) && (message = th.getMessage()) != null && (message.contains(com.taobao.share.ui.engine.friend.a.CONTACTS_INFO_NOT_EMPTY_STATUS) || message.contains("Drawable"));
                }

                @Override // java.lang.Thread.UncaughtExceptionHandler
                public void uncaughtException(Thread thread, Throwable th) {
                    if (!a(th)) {
                        defaultUncaughtExceptionHandler.uncaughtException(thread, th);
                        return;
                    }
                    Resources.NotFoundException notFoundException = new Resources.NotFoundException(th.getMessage() + ". If the resource you are trying to use is a vector resource, you may be referencing it in an unsupported way. See AppCompatDelegate.setCompatVectorFromResourcesEnabled() for more info.");
                    notFoundException.initCause(th.getCause());
                    notFoundException.setStackTrace(th.getStackTrace());
                    defaultUncaughtExceptionHandler.uncaughtException(thread, notFoundException);
                }
            });
            m = true;
        }
        o = new int[]{16842836};
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(Context context, Window window, c cVar) {
        this.f1331a = context;
        this.b = window;
        this.e = cVar;
        this.c = this.b.getCallback();
        Window.Callback callback = this.c;
        if (!(callback instanceof b)) {
            this.d = a(callback);
            this.b.setCallback(this.d);
            TintTypedArray obtainStyledAttributes = TintTypedArray.obtainStyledAttributes(context, (AttributeSet) null, o);
            Drawable drawableIfKnown = obtainStyledAttributes.getDrawableIfKnown(0);
            if (drawableIfKnown != null) {
                this.b.setBackgroundDrawable(drawableIfKnown);
            }
            obtainStyledAttributes.recycle();
            return;
        }
        throw new IllegalStateException("AppCompat has already installed itself into the Window");
    }

    @Override // android.support.v7.app.AppCompatDelegate
    public ActionBar a() {
        m();
        return this.f;
    }

    Window.Callback a(Window.Callback callback) {
        return new b(callback);
    }

    abstract void a(int i, Menu menu);

    @Override // android.support.v7.app.AppCompatDelegate
    public final void a(CharSequence charSequence) {
        this.p = charSequence;
        b(charSequence);
    }

    abstract boolean a(int i, KeyEvent keyEvent);

    abstract boolean a(KeyEvent keyEvent);

    @Override // android.support.v7.app.AppCompatDelegate
    public MenuInflater b() {
        if (this.g == null) {
            m();
            ActionBar actionBar = this.f;
            this.g = new acs(actionBar != null ? actionBar.g() : this.f1331a);
        }
        return this.g;
    }

    abstract acn b(acn.a aVar);

    abstract void b(CharSequence charSequence);

    abstract boolean b(int i, Menu menu);

    @Override // android.support.v7.app.AppCompatDelegate
    public void c() {
        this.q = true;
    }

    @Override // android.support.v7.app.AppCompatDelegate
    public void c(Bundle bundle) {
    }

    @Override // android.support.v7.app.AppCompatDelegate
    public void d() {
        this.q = false;
    }

    @Override // android.support.v7.app.AppCompatDelegate
    public void g() {
        this.r = true;
    }

    @Override // android.support.v7.app.AppCompatDelegate
    public final a.InterfaceC0011a h() {
        return new a();
    }

    @Override // android.support.v7.app.AppCompatDelegate
    public boolean j() {
        return false;
    }

    abstract void m();

    /* JADX INFO: Access modifiers changed from: package-private */
    public final ActionBar n() {
        return this.f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Context o() {
        ActionBar a2 = a();
        Context g = a2 != null ? a2.g() : null;
        return g == null ? this.f1331a : g;
    }

    public boolean p() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean q() {
        return this.r;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Window.Callback r() {
        return this.b.getCallback();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final CharSequence s() {
        Window.Callback callback = this.c;
        return callback instanceof Activity ? ((Activity) callback).getTitle() : this.p;
    }
}
