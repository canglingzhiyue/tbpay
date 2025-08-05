package android.support.transition;

import android.view.View;
import android.view.WindowId;

/* loaded from: classes2.dex */
class bc implements bd {

    /* renamed from: a  reason: collision with root package name */
    private final WindowId f1293a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public bc(View view) {
        this.f1293a = view.getWindowId();
    }

    public boolean equals(Object obj) {
        return (obj instanceof bc) && ((bc) obj).f1293a.equals(this.f1293a);
    }

    public int hashCode() {
        return this.f1293a.hashCode();
    }
}
