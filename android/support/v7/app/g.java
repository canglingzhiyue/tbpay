package android.support.v7.app;

import android.app.Application;
import android.app.UiModeManager;
import android.content.Context;
import android.support.v7.app.f;
import android.view.ActionMode;
import android.view.Window;
import com.taobao.android.ab.api.ABGlobal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class g extends f {
    private final UiModeManager t;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends f.a {
        /* JADX INFO: Access modifiers changed from: package-private */
        public a(Window.Callback callback) {
            super(callback);
        }

        @Override // android.support.v7.app.f.a, tb.acu, android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            return null;
        }

        @Override // tb.acu, android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
            return (!g.this.p() || i != 0) ? super.onWindowStartingActionMode(callback, i) : a(callback);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public g(Context context, Window window, c cVar) {
        super(context, window, cVar);
        Object systemService;
        if (ABGlobal.isFeatureOpened(context, "uiModeManagerDegrade")) {
            systemService = context.getSystemService("uimode");
        } else {
            systemService = ((Application) (!(context instanceof Application) ? context.getApplicationContext() : context)).getSystemService("uimode");
        }
        this.t = (UiModeManager) systemService;
    }

    @Override // android.support.v7.app.f, android.support.v7.app.d
    Window.Callback a(Window.Callback callback) {
        return new a(callback);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // android.support.v7.app.f
    public int e(int i) {
        if (i == 0 && this.t.getNightMode() == 0) {
            return -1;
        }
        return super.e(i);
    }
}
