package android.support.transition;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewOverlay;

/* loaded from: classes2.dex */
class ar implements as {

    /* renamed from: a  reason: collision with root package name */
    private final ViewOverlay f1285a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ar(View view) {
        this.f1285a = view.getOverlay();
    }

    @Override // android.support.transition.as
    public void a(Drawable drawable) {
        this.f1285a.add(drawable);
    }

    @Override // android.support.transition.as
    public void b(Drawable drawable) {
        this.f1285a.remove(drawable);
    }
}
