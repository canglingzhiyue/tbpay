package com.taobao.tao.flexbox.layoutmanager.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Scroller;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.module.element.ScrollChangeListener;
import com.taobao.taobao.R;
import tb.kge;
import tb.oec;

/* loaded from: classes8.dex */
public class TNodeNestScrollView extends AbsTNodeScrollView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private View pendingFlingView;
    private boolean scrollable;
    private Scroller scroller;

    static {
        kge.a(-1597146753);
    }

    public static /* synthetic */ Object ipc$super(TNodeNestScrollView tNodeNestScrollView, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1577577649:
                super.scrollTo(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
                return null;
            case -1533054272:
                return new Boolean(super.onNestedPreFling((View) objArr[0], ((Number) objArr[1]).floatValue(), ((Number) objArr[2]).floatValue()));
            case -894236565:
                super.computeScroll();
                return null;
            case 177070687:
                super.onNestedPreScroll((View) objArr[0], ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), (int[]) objArr[3]);
                return null;
            case 2107577209:
                return new Boolean(super.onStartNestedScroll((View) objArr[0], (View) objArr[1], ((Number) objArr[2]).intValue()));
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public static /* synthetic */ Scroller access$000(TNodeNestScrollView tNodeNestScrollView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Scroller) ipChange.ipc$dispatch("ef1c3777", new Object[]{tNodeNestScrollView}) : tNodeNestScrollView.scroller;
    }

    public static /* synthetic */ void access$100(TNodeNestScrollView tNodeNestScrollView, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6b8d628", new Object[]{tNodeNestScrollView, view});
        } else {
            tNodeNestScrollView.removeScrollChangeListenerForRecyclerView(view);
        }
    }

    public TNodeNestScrollView(Context context) {
        this(context, null);
    }

    public TNodeNestScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TNodeNestScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.scrollable = true;
    }

    public void setScrollable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f9c4d24", new Object[]{this, new Boolean(z)});
        } else {
            this.scrollable = z;
        }
    }

    @Override // android.support.v4.widget.NestedScrollView, android.view.ViewGroup, android.view.ViewParent, android.support.v4.view.NestedScrollingParent
    public boolean onStartNestedScroll(View view, View view2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7d9f1379", new Object[]{this, view, view2, new Integer(i)})).booleanValue();
        }
        removeScrollChangeListenerForRecyclerView(view2);
        return super.onStartNestedScroll(view, view2, i);
    }

    @Override // android.support.v4.widget.NestedScrollView, android.view.ViewGroup, android.view.ViewParent, android.support.v4.view.NestedScrollingParent
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8de25f", new Object[]{this, view, new Integer(i), new Integer(i2), iArr});
            return;
        }
        super.onNestedPreScroll(view, i, i2, iArr);
        if (!this.scrollable) {
            return;
        }
        removeScrollChangeListenerForRecyclerView(view);
        int maxScrollOffset = getMaxScrollOffset();
        if (getScrollY() >= maxScrollOffset || i2 <= 0) {
            return;
        }
        iArr[1] = Math.min(maxScrollOffset - getScrollY(), i2);
        scrollBy(0, iArr[1]);
    }

    @Override // android.support.v4.widget.NestedScrollView, android.view.View
    public void scrollTo(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1f8134f", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        int maxScrollOffset = getMaxScrollOffset();
        if (i2 > maxScrollOffset) {
            i2 = maxScrollOffset;
        }
        if (!this.scrollable && i2 < maxScrollOffset) {
            i2 = maxScrollOffset;
        }
        super.scrollTo(i, i2);
    }

    @Override // android.support.v4.widget.NestedScrollView, android.view.ViewGroup, android.view.ViewParent, android.support.v4.view.NestedScrollingParent
    public boolean onNestedPreFling(final View view, float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a49f72c0", new Object[]{this, view, new Float(f), new Float(f2)})).booleanValue();
        }
        if (!this.scrollable) {
            return super.onNestedPreFling(view, f, f2);
        }
        removeScrollChangeListenerForRecyclerView(view);
        int maxScrollOffset = getMaxScrollOffset();
        this.pendingFlingView = null;
        if (f2 > 0.0f) {
            if (getScrollY() < maxScrollOffset) {
                int i = (int) f2;
                fling(i);
                this.scroller = new Scroller(getContext());
                this.scroller.fling(0, 0, 0, i, 0, 0, 0, Integer.MAX_VALUE);
                this.pendingFlingView = view;
                return true;
            }
        } else if (getScrollY() < maxScrollOffset) {
            fling((int) f2);
        } else if ((view instanceof TNodeRecyclerView) && view.getTag(R.id.layout_manager_recyclerview_scroll_listener) == null) {
            this.scroller = new Scroller(getContext());
            this.scroller.fling(0, 0, 0, (int) f2, 0, 0, 0, Integer.MAX_VALUE);
            addScrollChangeListenerForRecyclerView(view, new ScrollChangeListener() { // from class: com.taobao.tao.flexbox.layoutmanager.view.TNodeNestScrollView.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.tao.flexbox.layoutmanager.module.element.ScrollChangeListener
                public void onNestScroll(int i2, int i3, int i4, int i5) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("10a7e84b", new Object[]{this, new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5)});
                    }
                }

                @Override // com.taobao.tao.flexbox.layoutmanager.module.element.ScrollChangeListener
                public void onScroll(int i2, int i3, int i4, int i5) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("e9628353", new Object[]{this, new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5)});
                    }
                }

                @Override // com.taobao.tao.flexbox.layoutmanager.module.element.ScrollChangeListener
                public void onScrollStateChanged(int i2, int i3) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("faf93876", new Object[]{this, new Integer(i2), new Integer(i3)});
                    } else if (i2 != 0) {
                    } else {
                        if (!((TNodeRecyclerView) view).canScrollVertically(-1)) {
                            TNodeNestScrollView.access$000(TNodeNestScrollView.this).computeScrollOffset();
                            TNodeNestScrollView tNodeNestScrollView = TNodeNestScrollView.this;
                            tNodeNestScrollView.fling((int) (-TNodeNestScrollView.access$000(tNodeNestScrollView).getCurrVelocity()));
                        }
                        oec.a(new Runnable() { // from class: com.taobao.tao.flexbox.layoutmanager.view.TNodeNestScrollView.1.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // java.lang.Runnable
                            public void run() {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                } else {
                                    TNodeNestScrollView.access$100(TNodeNestScrollView.this, view);
                                }
                            }
                        });
                    }
                }
            });
        }
        return super.onNestedPreFling(view, f, f2);
    }

    private void removeScrollChangeListenerForRecyclerView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8774f13", new Object[]{this, view});
        } else if (!(view instanceof TNodeRecyclerView)) {
        } else {
            TNodeRecyclerView tNodeRecyclerView = (TNodeRecyclerView) view;
            Object tag = tNodeRecyclerView.getTag(R.id.layout_manager_recyclerview_scroll_listener);
            if (tag instanceof ScrollChangeListener) {
                tNodeRecyclerView.removeScrollChangeListener((ScrollChangeListener) tag);
            }
            tNodeRecyclerView.setTag(R.id.layout_manager_recyclerview_scroll_listener, null);
        }
    }

    private void addScrollChangeListenerForRecyclerView(View view, ScrollChangeListener scrollChangeListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cca2b541", new Object[]{this, view, scrollChangeListener});
        } else if (!(view instanceof TNodeRecyclerView)) {
        } else {
            ((TNodeRecyclerView) view).addScrollChangeListener(scrollChangeListener);
            view.setTag(R.id.layout_manager_recyclerview_scroll_listener, scrollChangeListener);
        }
    }

    @Override // android.support.v4.widget.NestedScrollView, android.view.View
    public void computeScroll() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cab3086b", new Object[]{this});
            return;
        }
        try {
            super.computeScroll();
            if (getScrollY() < getMaxScrollOffset() || this.pendingFlingView == null || !(this.pendingFlingView instanceof TNodeRecyclerView)) {
                return;
            }
            if (this.scroller != null && this.scroller.computeScrollOffset()) {
                ((TNodeRecyclerView) this.pendingFlingView).fling(0, (int) this.scroller.getCurrVelocity());
            }
            this.pendingFlingView = null;
        } catch (Exception unused) {
        }
    }
}
