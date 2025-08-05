package android.support.transition;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;

/* loaded from: classes2.dex */
class al implements am {

    /* renamed from: a  reason: collision with root package name */
    private final ViewGroupOverlay f1280a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public al(ViewGroup viewGroup) {
        this.f1280a = viewGroup.getOverlay();
    }

    @Override // android.support.transition.as
    public void a(Drawable drawable) {
        this.f1280a.add(drawable);
    }

    @Override // android.support.transition.am
    public void a(View view) {
        this.f1280a.add(view);
    }

    @Override // android.support.transition.as
    public void b(Drawable drawable) {
        this.f1280a.remove(drawable);
    }

    @Override // android.support.transition.am
    public void b(View view) {
        this.f1280a.remove(view);
    }
}
