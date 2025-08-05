package android.support.design.widget;

import android.content.Context;
import android.support.design.widget.CoordinatorLayout;
import android.util.AttributeSet;
import android.view.View;

/* loaded from: classes2.dex */
class ViewOffsetBehavior<V extends View> extends CoordinatorLayout.Behavior<V> {

    /* renamed from: a  reason: collision with root package name */
    private p f1202a;
    private int b;
    private int c;

    public ViewOffsetBehavior() {
        this.b = 0;
        this.c = 0;
    }

    public ViewOffsetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = 0;
        this.c = 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(CoordinatorLayout coordinatorLayout, V v, int i) {
        coordinatorLayout.onLayoutChild(v, i);
    }

    public boolean a(int i) {
        p pVar = this.f1202a;
        if (pVar != null) {
            return pVar.a(i);
        }
        this.b = i;
        return false;
    }

    public int b() {
        p pVar = this.f1202a;
        if (pVar != null) {
            return pVar.b();
        }
        return 0;
    }

    @Override // android.support.design.widget.CoordinatorLayout.Behavior
    public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, V v, int i) {
        a(coordinatorLayout, v, i);
        if (this.f1202a == null) {
            this.f1202a = new p(v);
        }
        this.f1202a.a();
        int i2 = this.b;
        if (i2 != 0) {
            this.f1202a.a(i2);
            this.b = 0;
        }
        int i3 = this.c;
        if (i3 != 0) {
            this.f1202a.b(i3);
            this.c = 0;
            return true;
        }
        return true;
    }
}
