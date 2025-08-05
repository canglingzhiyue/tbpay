package android.support.design.widget;

import android.graphics.Outline;

/* loaded from: classes2.dex */
class d extends c {
    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        copyBounds(this.b);
        outline.setOval(this.b);
    }
}
