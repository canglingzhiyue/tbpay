package android.support.v7.app;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.d;
import android.support.v7.app.f;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.ActionMode;
import android.view.View;
import android.view.Window;
import tb.acn;
import tb.acr;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class f extends AppCompatDelegateImplV9 {
    private int t;
    private boolean u;
    private boolean v;
    private b w;

    /* loaded from: classes.dex */
    class a extends d.b {
        /* JADX INFO: Access modifiers changed from: package-private */
        public a(Window.Callback callback) {
            super(callback);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public final ActionMode a(ActionMode.Callback callback) {
            acr.a aVar = new acr.a(f.this.f1331a, callback);
            acn a2 = f.this.a(aVar);
            if (a2 != null) {
                return aVar.b(a2);
            }
            return null;
        }

        @Override // tb.acu, android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            return f.this.p() ? a(callback) : super.onWindowStartingActionMode(callback);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public final class b {
        private m b;
        private boolean c;
        private BroadcastReceiver d;
        private IntentFilter e;

        b(m mVar) {
            this.b = mVar;
            this.c = mVar.a();
        }

        final int a() {
            this.c = this.b.a();
            return this.c ? 2 : 1;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public final void b() {
            boolean a2 = this.b.a();
            if (a2 != this.c) {
                this.c = a2;
                f.this.j();
            }
        }

        final void c() {
            d();
            if (this.d == null) {
                this.d = new BroadcastReceiver() { // from class: android.support.v7.app.AppCompatDelegateImplV14$AutoNightModeManager$1
                    {
                        f.b.this = this;
                    }

                    @Override // android.content.BroadcastReceiver
                    public void onReceive(Context context, Intent intent) {
                        f.b.this.b();
                    }
                };
            }
            if (this.e == null) {
                this.e = new IntentFilter();
                this.e.addAction("android.intent.action.TIME_SET");
                this.e.addAction("android.intent.action.TIMEZONE_CHANGED");
                this.e.addAction("android.intent.action.TIME_TICK");
            }
            f.this.f1331a.registerReceiver(this.d, this.e);
        }

        final void d() {
            if (this.d != null) {
                f.this.f1331a.unregisterReceiver(this.d);
                this.d = null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public f(Context context, Window window, c cVar) {
        super(context, window, cVar);
        this.t = -100;
        this.v = true;
    }

    private boolean i(int i) {
        Resources resources = this.f1331a.getResources();
        Configuration configuration = resources.getConfiguration();
        int i2 = configuration.uiMode & 48;
        int i3 = i == 2 ? 32 : 16;
        if (i2 != i3) {
            if (z()) {
                ((Activity) this.f1331a).recreate();
                return true;
            }
            Configuration configuration2 = new Configuration(configuration);
            DisplayMetrics displayMetrics = resources.getDisplayMetrics();
            configuration2.uiMode = i3 | (configuration2.uiMode & (-49));
            resources.updateConfiguration(configuration2, displayMetrics);
            if (Build.VERSION.SDK_INT >= 26) {
                return true;
            }
            j.a(resources);
            return true;
        }
        return false;
    }

    private int x() {
        int i = this.t;
        return i != -100 ? i : k();
    }

    private void y() {
        if (this.w == null) {
            this.w = new b(m.a(this.f1331a));
        }
    }

    private boolean z() {
        if (!this.u || !(this.f1331a instanceof Activity)) {
            return false;
        }
        try {
            return (this.f1331a.getPackageManager().getActivityInfo(new ComponentName(this.f1331a, this.f1331a.getClass()), 0).configChanges & 512) == 0;
        } catch (PackageManager.NameNotFoundException unused) {
            return true;
        }
    }

    @Override // android.support.v7.app.AppCompatDelegateImplV9
    View a(View view, String str, Context context, AttributeSet attributeSet) {
        return null;
    }

    @Override // android.support.v7.app.d
    Window.Callback a(Window.Callback callback) {
        return new a(callback);
    }

    @Override // android.support.v7.app.AppCompatDelegateImplV9, android.support.v7.app.AppCompatDelegate
    public void a(Bundle bundle) {
        super.a(bundle);
        if (bundle == null || this.t != -100) {
            return;
        }
        this.t = bundle.getInt("appcompat:local_night_mode", -100);
    }

    @Override // android.support.v7.app.d, android.support.v7.app.AppCompatDelegate
    public void c() {
        super.c();
        j();
    }

    @Override // android.support.v7.app.d, android.support.v7.app.AppCompatDelegate
    public void c(Bundle bundle) {
        super.c(bundle);
        int i = this.t;
        if (i != -100) {
            bundle.putInt("appcompat:local_night_mode", i);
        }
    }

    @Override // android.support.v7.app.AppCompatDelegateImplV9, android.support.v7.app.d, android.support.v7.app.AppCompatDelegate
    public void d() {
        super.d();
        b bVar = this.w;
        if (bVar != null) {
            bVar.d();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int e(int i) {
        if (i != -100) {
            if (i != 0) {
                return i;
            }
            y();
            return this.w.a();
        }
        return -1;
    }

    @Override // android.support.v7.app.AppCompatDelegateImplV9, android.support.v7.app.d, android.support.v7.app.AppCompatDelegate
    public void g() {
        super.g();
        b bVar = this.w;
        if (bVar != null) {
            bVar.d();
        }
    }

    @Override // android.support.v7.app.d, android.support.v7.app.AppCompatDelegate
    public boolean j() {
        int x = x();
        int e = e(x);
        boolean i = e != -1 ? i(e) : false;
        if (x == 0) {
            y();
            this.w.c();
        }
        this.u = true;
        return i;
    }

    @Override // android.support.v7.app.d
    public boolean p() {
        return this.v;
    }
}
