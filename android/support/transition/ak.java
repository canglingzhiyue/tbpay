package android.support.transition;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class ak extends ViewOverlayApi14 implements am {
    /* JADX INFO: Access modifiers changed from: package-private */
    public ak(Context context, ViewGroup viewGroup, View view) {
        super(context, viewGroup, view);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ak a(ViewGroup viewGroup) {
        return (ak) ViewOverlayApi14.d(viewGroup);
    }

    @Override // android.support.transition.am
    public void a(View view) {
        this.f1265a.add(view);
    }

    @Override // android.support.transition.am
    public void b(View view) {
        this.f1265a.remove(view);
    }
}
