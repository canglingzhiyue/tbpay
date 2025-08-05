package android.support.v7.widget;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;

/* loaded from: classes2.dex */
class a extends Drawable {

    /* renamed from: a  reason: collision with root package name */
    final ActionBarContainer f1469a;

    public a(ActionBarContainer actionBarContainer) {
        this.f1469a = actionBarContainer;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.f1469a.mIsSplit) {
            if (this.f1469a.mSplitBackground == null) {
                return;
            }
            this.f1469a.mSplitBackground.draw(canvas);
            return;
        }
        if (this.f1469a.mBackground != null) {
            this.f1469a.mBackground.draw(canvas);
        }
        if (this.f1469a.mStackedBackground == null || !this.f1469a.mIsStacked) {
            return;
        }
        this.f1469a.mStackedBackground.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }
}
