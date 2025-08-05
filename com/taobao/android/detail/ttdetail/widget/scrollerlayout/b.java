package com.taobao.android.detail.ttdetail.widget.scrollerlayout;

import android.graphics.Rect;
import android.os.Build;
import android.support.v4.view.ScrollingView;
import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.component.module.v;
import com.taobao.android.detail.ttdetail.component.module.x;
import com.taobao.android.detail.ttdetail.widget.scrollerlayout.TTDetailScrollerLayout;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import tb.kge;

/* loaded from: classes5.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static Method f11049a;
    public static Method b;
    public static Method c;
    private static final Rect d;

    public static int a(View view) {
        View g = g(view);
        if (g instanceof ScrollingView) {
            return ((ScrollingView) g).computeVerticalScrollOffset();
        }
        try {
            if (f11049a == null) {
                Method declaredMethod = View.class.getDeclaredMethod("computeVerticalScrollOffset", new Class[0]);
                f11049a = declaredMethod;
                declaredMethod.setAccessible(true);
            }
            Object invoke = f11049a.invoke(g, new Object[0]);
            if (invoke != null) {
                return ((Integer) invoke).intValue();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return g.getScrollY();
    }

    public static int b(View view) {
        View g = g(view);
        if (g instanceof ScrollingView) {
            return ((ScrollingView) g).computeVerticalScrollRange();
        }
        try {
            if (b == null) {
                Method declaredMethod = View.class.getDeclaredMethod("computeVerticalScrollRange", new Class[0]);
                b = declaredMethod;
                declaredMethod.setAccessible(true);
            }
            Object invoke = b.invoke(g, new Object[0]);
            if (invoke != null) {
                return ((Integer) invoke).intValue();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return g.getHeight();
    }

    public static int c(View view) {
        View g = g(view);
        if (g instanceof ScrollingView) {
            return ((ScrollingView) g).computeVerticalScrollExtent();
        }
        try {
            if (c == null) {
                Method declaredMethod = View.class.getDeclaredMethod("computeVerticalScrollExtent", new Class[0]);
                c = declaredMethod;
                declaredMethod.setAccessible(true);
            }
            Object invoke = c.invoke(g, new Object[0]);
            if (invoke != null) {
                return ((Integer) invoke).intValue();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return g.getHeight();
    }

    public static int d(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("89068ffa", new Object[]{view})).intValue();
        }
        boolean l = l(view);
        if (a(view, -1) && !l) {
            return Math.min(-a(view), -1);
        }
        return 0;
    }

    public static int e(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("85081ed9", new Object[]{view})).intValue();
        }
        boolean a2 = a(view, 1);
        boolean l = l(view);
        if (a2 && !l) {
            return Math.max((b(view) - a(view)) - c(view), 1);
        }
        return 0;
    }

    private static boolean l(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("69130703", new Object[]{view})).booleanValue();
        }
        x j = j(view);
        return j != null && j.e;
    }

    public static boolean f(View view) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("8109adc9", new Object[]{view})).booleanValue() : a(view, 1) || a(view, -1);
    }

    static {
        kge.a(323819793);
        d = new Rect();
    }

    public static boolean a(View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b3afcdd", new Object[]{view, new Integer(i)})).booleanValue();
        }
        View g = g(view);
        if (g == null || g.getVisibility() == 8) {
            return false;
        }
        if (g instanceof AbsListView) {
            AbsListView absListView = (AbsListView) g;
            if (Build.VERSION.SDK_INT < 19) {
                return true;
            }
            return absListView.canScrollList(i);
        } else if (g instanceof RecyclerView) {
            RecyclerView recyclerView = (RecyclerView) g;
            if ((recyclerView.canScrollHorizontally(1) || recyclerView.canScrollHorizontally(-1)) && !recyclerView.canScrollVertically(i)) {
                return false;
            }
            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            RecyclerView.Adapter adapter = recyclerView.getAdapter();
            if (layoutManager != null && adapter != null && adapter.getItemCount() > 0) {
                if (layoutManager.findViewByPosition(i > 0 ? adapter.getItemCount() - 1 : 0) == null) {
                    return true;
                }
                int childCount = recyclerView.getChildCount();
                if (i > 0) {
                    for (int i2 = childCount - 1; i2 >= 0; i2--) {
                        recyclerView.getDecoratedBoundsWithMargins(recyclerView.getChildAt(i2), d);
                        if (d.bottom > recyclerView.getHeight() - recyclerView.getPaddingBottom()) {
                            return true;
                        }
                    }
                    return false;
                }
                for (int i3 = 0; i3 < childCount; i3++) {
                    recyclerView.getDecoratedBoundsWithMargins(recyclerView.getChildAt(i3), d);
                    if (d.top < recyclerView.getPaddingTop()) {
                        return true;
                    }
                }
            }
            return false;
        } else {
            return g.canScrollVertically(i);
        }
    }

    public static List<View> a(View view, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("59a6c3bd", new Object[]{view, new Integer(i), new Integer(i2)});
        }
        ArrayList arrayList = new ArrayList();
        a(arrayList, view, i, i2);
        return arrayList;
    }

    private static void a(List<View> list, View view, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e27e84f9", new Object[]{list, view, new Integer(i), new Integer(i2)});
        } else if (b(view, i, i2)) {
            list.add(view);
            if (!(view instanceof ViewGroup)) {
                return;
            }
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                a(list, viewGroup.getChildAt(i3), i, i2);
            }
        }
    }

    public static boolean b(View view, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5dfe646d", new Object[]{view, new Integer(i), new Integer(i2)})).booleanValue();
        }
        if (view == null) {
            return false;
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i3 = iArr[0];
        int i4 = iArr[1];
        return i >= i3 && i <= view.getMeasuredWidth() + i3 && i2 >= i4 && i2 <= view.getMeasuredHeight() + i4;
    }

    public static int a(View view, MotionEvent motionEvent, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ef1985d7", new Object[]{view, motionEvent, new Integer(i)})).intValue();
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return (int) (iArr[0] + motionEvent.getX(i));
    }

    public static int b(View view, MotionEvent motionEvent, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("32a4a398", new Object[]{view, motionEvent, new Integer(i)})).intValue();
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return (int) (iArr[1] + motionEvent.getY(i));
    }

    public static View g(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("c8d973e6", new Object[]{view});
        }
        View h = h(view);
        while (h instanceof a) {
            View a2 = ((a) h).a();
            if (h == a2) {
                return a2;
            }
            h = a2;
        }
        return h;
    }

    public static View h(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("d03ea905", new Object[]{view});
        }
        v i = i(view);
        return i != null ? i.b() : view;
    }

    public static v i(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (v) ipChange.ipc$dispatch("9f9c8bdb", new Object[]{view});
        }
        if (view == null) {
            return null;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof TTDetailScrollerLayout.LayoutParams)) {
            return null;
        }
        return ((TTDetailScrollerLayout.LayoutParams) layoutParams).f11048a;
    }

    public static x j(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (x) ipChange.ipc$dispatch("b89dddb8", new Object[]{view});
        }
        v i = i(view);
        if (!(i instanceof x)) {
            return null;
        }
        return (x) i;
    }

    public static boolean k(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6d117824", new Object[]{view})).booleanValue();
        }
        while ((view.getParent() instanceof ViewGroup) && !(view.getParent() instanceof TTDetailScrollerLayout)) {
            view = (View) view.getParent();
        }
        return view.getParent() instanceof TTDetailScrollerLayout;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean c(android.view.View r4, int r5, int r6) {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.android.detail.ttdetail.widget.scrollerlayout.b.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L29
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r2] = r4
            java.lang.Integer r4 = new java.lang.Integer
            r4.<init>(r5)
            r1[r3] = r4
            r4 = 2
            java.lang.Integer r5 = new java.lang.Integer
            r5.<init>(r6)
            r1[r4] = r5
            java.lang.String r4 = "5fd7b78c"
            java.lang.Object r4 = r0.ipc$dispatch(r4, r1)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            return r4
        L29:
            java.util.List r4 = a(r4, r5, r6)
            java.util.Iterator r4 = r4.iterator()
        L31:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L4b
            java.lang.Object r5 = r4.next()
            android.view.View r5 = (android.view.View) r5
            boolean r6 = r5.canScrollHorizontally(r3)
            if (r6 != 0) goto L4a
            r6 = -1
            boolean r5 = r5.canScrollHorizontally(r6)
            if (r5 == 0) goto L31
        L4a:
            return r3
        L4b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.detail.ttdetail.widget.scrollerlayout.b.c(android.view.View, int, int):boolean");
    }
}
