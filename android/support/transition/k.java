package android.support.transition;

import android.graphics.Matrix;
import android.os.Build;
import android.support.transition.GhostViewApi14;
import android.support.transition.i;
import android.support.transition.j;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes2.dex */
class k {

    /* renamed from: a  reason: collision with root package name */
    private static final j.a f1298a;

    static {
        f1298a = Build.VERSION.SDK_INT >= 21 ? new i.a() : new GhostViewApi14.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static j a(View view, ViewGroup viewGroup, Matrix matrix) {
        return f1298a.a(view, viewGroup, matrix);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(View view) {
        f1298a.a(view);
    }
}
