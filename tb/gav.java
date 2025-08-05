package tb;

import android.animation.ValueAnimator;
import android.graphics.PointF;
import android.support.v4.view.NestedScrollingChild;
import android.support.v4.view.NestedScrollingParent;
import android.support.v4.view.ViewPager;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.widget.recycler.view.DXRecyclerView;
import com.taobao.android.dinamicx.widget.refresh.layout.DXRefreshLayout;
import java.util.LinkedList;

/* loaded from: classes5.dex */
public class gav implements ValueAnimator.AnimatorUpdateListener, gam {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public View f28252a;
    public View b;
    public View c;
    public int d = 0;
    public boolean e = true;
    public boolean f = true;
    public gat g = new gat();

    static {
        kge.a(-437364756);
        kge.a(2128513152);
        kge.a(1499308443);
    }

    public gav(View view) {
        this.c = view;
        this.b = view;
        this.f28252a = view;
    }

    public void a(View view, DXRefreshLayout.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68d1ac40", new Object[]{this, view, cVar});
            return;
        }
        View view2 = null;
        this.f28252a.isInEditMode();
        while (true) {
            if (view2 != null && (!(view2 instanceof NestedScrollingParent) || (view2 instanceof NestedScrollingChild))) {
                break;
            }
            view = a(view, view2 == null);
            if (view == view2) {
                break;
            }
            view2 = view;
        }
        if (view2 == null) {
            return;
        }
        this.c = view2;
    }

    public View a(View view, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("fd07be6c", new Object[]{this, view, new Boolean(z)});
        }
        View view2 = null;
        LinkedList linkedList = new LinkedList();
        LinkedList linkedList2 = linkedList;
        linkedList2.add(view);
        while (linkedList2.size() > 0 && view2 == null) {
            View view3 = (View) linkedList.poll();
            if (view3 != null) {
                if ((z || view3 != view) && gau.b(view3)) {
                    view2 = view3;
                } else if (view3 instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view3;
                    for (int i = 0; i < viewGroup.getChildCount(); i++) {
                        linkedList2.add(viewGroup.getChildAt(i));
                    }
                }
            }
        }
        return view2 == null ? view : view2;
    }

    public View a(View view, PointF pointF, View view2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("5e084997", new Object[]{this, view, pointF, view2});
        }
        if ((view instanceof ViewGroup) && pointF != null) {
            ViewGroup viewGroup = (ViewGroup) view;
            PointF pointF2 = new PointF();
            for (int childCount = viewGroup.getChildCount(); childCount > 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount - 1);
                if (gau.a(viewGroup, childAt, pointF.x, pointF.y, pointF2)) {
                    if (!(childAt instanceof ViewPager) && gau.b(childAt)) {
                        return childAt;
                    }
                    pointF.offset(pointF2.x, pointF2.y);
                    View a2 = a(childAt, pointF, view2);
                    pointF.offset(-pointF2.x, -pointF2.y);
                    return a2;
                }
            }
        }
        return view2;
    }

    @Override // tb.gam
    public View a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("195fbaaa", new Object[]{this}) : this.f28252a;
    }

    @Override // tb.gam
    public View b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("639153eb", new Object[]{this}) : this.c;
    }

    @Override // tb.gam
    public void a(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2619793b", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
        } else {
            this.b.setTranslationY(i);
        }
    }

    @Override // tb.gam
    public boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue() : this.e && this.g.a(this.f28252a);
    }

    @Override // tb.gam
    public boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue() : this.f && this.g.b(this.f28252a);
    }

    @Override // tb.gam
    public void a(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f37b47d", new Object[]{this, motionEvent});
            return;
        }
        PointF pointF = new PointF(motionEvent.getX(), motionEvent.getY());
        pointF.offset(-this.f28252a.getLeft(), -this.f28252a.getTop());
        View view = this.c;
        View view2 = this.f28252a;
        if (view != view2) {
            this.c = a(view2, pointF, view);
        }
        if (this.c == this.f28252a) {
            this.g.c = null;
        } else {
            this.g.c = pointF;
        }
    }

    @Override // tb.gam
    public void a(DXRefreshLayout.c cVar, View view, View view2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aba34b42", new Object[]{this, cVar, view, view2});
        } else {
            a(this.f28252a, cVar);
        }
    }

    @Override // tb.gam
    public void a(gao gaoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9e273e3", new Object[]{this, gaoVar});
        } else if (gaoVar instanceof gat) {
            this.g = (gat) gaoVar;
        } else {
            this.g.d = gaoVar;
        }
    }

    @Override // tb.gam
    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.g.e = z;
        }
    }

    @Override // tb.gam
    public ValueAnimator.AnimatorUpdateListener a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ValueAnimator.AnimatorUpdateListener) ipChange.ipc$dispatch("ba708f4f", new Object[]{this, new Integer(i)});
        }
        View view = this.c;
        if (view == null || i == 0) {
            return null;
        }
        if ((i >= 0 || !view.canScrollVertically(1)) && (i <= 0 || !this.c.canScrollVertically(-1))) {
            return null;
        }
        this.d = i;
        return this;
    }

    @Override // tb.gam
    public void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
            return;
        }
        View view = this.c;
        if (view == null || i == 0 || !(view instanceof DXRecyclerView)) {
            return;
        }
        ((DXRecyclerView) view).scrollByAfterLayout(0, -i);
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
            return;
        }
        int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        try {
            float scaleY = (intValue - this.d) * this.c.getScaleY();
            if (this.c instanceof AbsListView) {
                gau.a((AbsListView) this.c, (int) scaleY);
            } else {
                this.c.scrollBy(0, (int) scaleY);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        this.d = intValue;
    }
}
