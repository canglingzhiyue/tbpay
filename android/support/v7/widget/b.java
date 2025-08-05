package android.support.v7.widget;

import android.graphics.Outline;

/* loaded from: classes2.dex */
class b extends a {
    public b(ActionBarContainer actionBarContainer) {
        super(actionBarContainer);
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        if (this.f1469a.mIsSplit) {
            if (this.f1469a.mSplitBackground == null) {
                return;
            }
            this.f1469a.mSplitBackground.getOutline(outline);
        } else if (this.f1469a.mBackground == null) {
        } else {
            this.f1469a.mBackground.getOutline(outline);
        }
    }
}
