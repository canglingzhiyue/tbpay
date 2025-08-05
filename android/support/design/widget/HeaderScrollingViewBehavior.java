package android.support.design.widget;

import android.content.Context;
import android.graphics.Rect;
import android.support.design.widget.CoordinatorLayout;
import android.support.v4.math.MathUtils;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.WindowInsetsCompat;
import android.util.AttributeSet;
import android.view.View;
import java.util.List;

/* loaded from: classes2.dex */
abstract class HeaderScrollingViewBehavior extends ViewOffsetBehavior<View> {

    /* renamed from: a  reason: collision with root package name */
    final Rect f1182a;
    final Rect b;
    private int c;
    private int d;

    public HeaderScrollingViewBehavior() {
        this.f1182a = new Rect();
        this.b = new Rect();
        this.c = 0;
    }

    public HeaderScrollingViewBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1182a = new Rect();
        this.b = new Rect();
        this.c = 0;
    }

    private static int c(int i) {
        if (i == 0) {
            return 8388659;
        }
        return i;
    }

    float a(View view) {
        return 1.0f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int a() {
        return this.c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.design.widget.ViewOffsetBehavior
    public void a(CoordinatorLayout coordinatorLayout, View view, int i) {
        int i2;
        View b = b(coordinatorLayout.getDependencies(view));
        if (b != null) {
            CoordinatorLayout.b bVar = (CoordinatorLayout.b) view.getLayoutParams();
            Rect rect = this.f1182a;
            rect.set(coordinatorLayout.getPaddingLeft() + bVar.leftMargin, b.getBottom() + bVar.topMargin, (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - bVar.rightMargin, ((coordinatorLayout.getHeight() + b.getBottom()) - coordinatorLayout.getPaddingBottom()) - bVar.bottomMargin);
            WindowInsetsCompat lastWindowInsets = coordinatorLayout.getLastWindowInsets();
            if (lastWindowInsets != null && ViewCompat.getFitsSystemWindows(coordinatorLayout) && !ViewCompat.getFitsSystemWindows(view)) {
                rect.left += lastWindowInsets.getSystemWindowInsetLeft();
                rect.right -= lastWindowInsets.getSystemWindowInsetRight();
            }
            Rect rect2 = this.b;
            GravityCompat.apply(c(bVar.c), view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect2, i);
            int c = c(b);
            view.layout(rect2.left, rect2.top - c, rect2.right, rect2.bottom - c);
            i2 = rect2.top - b.getBottom();
        } else {
            super.a(coordinatorLayout, view, i);
            i2 = 0;
        }
        this.c = i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int b(View view) {
        return view.getMeasuredHeight();
    }

    abstract View b(List<View> list);

    public final void b(int i) {
        this.d = i;
    }

    public final int c() {
        return this.d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int c(View view) {
        if (this.d == 0) {
            return 0;
        }
        float a2 = a(view);
        int i = this.d;
        return MathUtils.clamp((int) (a2 * i), 0, i);
    }

    @Override // android.support.design.widget.CoordinatorLayout.Behavior
    public boolean onMeasureChild(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int i4) {
        View b;
        int i5 = view.getLayoutParams().height;
        if ((i5 == -1 || i5 == -2) && (b = b(coordinatorLayout.getDependencies(view))) != null) {
            if (ViewCompat.getFitsSystemWindows(b) && !ViewCompat.getFitsSystemWindows(view)) {
                ViewCompat.setFitsSystemWindows(view, true);
                if (ViewCompat.getFitsSystemWindows(view)) {
                    view.requestLayout();
                    return true;
                }
            }
            int size = View.MeasureSpec.getSize(i3);
            if (size == 0) {
                size = coordinatorLayout.getHeight();
            }
            coordinatorLayout.onMeasureChild(view, i, i2, View.MeasureSpec.makeMeasureSpec((size - b.getMeasuredHeight()) + b(b), i5 == -1 ? 1073741824 : Integer.MIN_VALUE), i4);
            return true;
        }
        return false;
    }
}
