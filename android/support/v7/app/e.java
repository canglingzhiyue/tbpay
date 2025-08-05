package android.support.v7.app;

import android.content.Context;
import android.support.v7.app.AppCompatDelegateImplV9;
import android.support.v7.app.g;
import android.view.KeyboardShortcutGroup;
import android.view.Menu;
import android.view.Window;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class e extends g {

    /* loaded from: classes.dex */
    class a extends g.a {
        a(Window.Callback callback) {
            super(callback);
        }

        @Override // tb.acu, android.view.Window.Callback
        public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i) {
            AppCompatDelegateImplV9.PanelFeatureState a2 = e.this.a(0, true);
            if (a2 == null || a2.j == null) {
                super.onProvideKeyboardShortcuts(list, menu, i);
            } else {
                super.onProvideKeyboardShortcuts(list, a2.j, i);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(Context context, Window window, c cVar) {
        super(context, window, cVar);
    }

    @Override // android.support.v7.app.g, android.support.v7.app.f, android.support.v7.app.d
    Window.Callback a(Window.Callback callback) {
        return new a(callback);
    }
}
