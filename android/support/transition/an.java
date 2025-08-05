package android.support.transition;

import android.os.Build;
import android.view.ViewGroup;

/* loaded from: classes2.dex */
class an {

    /* renamed from: a  reason: collision with root package name */
    private static final aq f1281a;

    static {
        f1281a = Build.VERSION.SDK_INT >= 18 ? new ap() : new ao();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static am a(ViewGroup viewGroup) {
        return f1281a.a(viewGroup);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(ViewGroup viewGroup, boolean z) {
        f1281a.a(viewGroup, z);
    }
}
