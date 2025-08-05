package com.taobao.oversea.mytaobao;

import android.content.Context;
import android.support.v4.view.NestedScrollingParent2;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.OverScroller;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.widget.DXRecyclerLayout;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.mytaobao.view.MTPtrRecyclerView;
import com.taobao.tao.log.TLog;
import java.lang.reflect.Field;

/* loaded from: classes7.dex */
public class OvsMTPtrRecyclerView extends MTPtrRecyclerView implements NestedScrollingParent2 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private OverScroller childRVOverScroller;
    private RecyclerView childRecyclerView;
    private Object childScrollerYObject;
    private Field childScrollyYField;
    private Field childVelocityYField;
    private View lastRecyclerView;
    private boolean mScrollEnable;
    private OverScroller parentRVOverScroller;
    private Field parentScrollYField;
    private Object parentScrollerYObject;
    private Field parentVelocityYField;

    public static /* synthetic */ Object ipc$super(OvsMTPtrRecyclerView ovsMTPtrRecyclerView, String str, Object... objArr) {
        if (str.hashCode() == -407533570) {
            return new Boolean(super.onInterceptTouchEvent((MotionEvent) objArr[0]));
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // android.support.v4.view.NestedScrollingParent2
    public void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64bba3db", new Object[]{this, view, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5)});
        }
    }

    @Override // android.support.v4.view.NestedScrollingParent2
    public void onNestedScrollAccepted(View view, View view2, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da61a091", new Object[]{this, view, view2, new Integer(i), new Integer(i2)});
        }
    }

    public OvsMTPtrRecyclerView(Context context) {
        super(context);
        this.mScrollEnable = false;
    }

    public OvsMTPtrRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mScrollEnable = false;
    }

    public void scrollChildRVToTop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f68d40ce", new Object[]{this});
            return;
        }
        RecyclerView recyclerView = this.childRecyclerView;
        if (recyclerView == null) {
            return;
        }
        recyclerView.scrollToPosition(0);
    }

    @Override // android.support.v7.widget.RecyclerView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e7b587fe", new Object[]{this, motionEvent})).booleanValue();
        }
        stopFling();
        if (!this.mScrollEnable) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // android.support.v4.view.NestedScrollingParent2
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("472edc84", new Object[]{this, view, new Integer(i), new Integer(i2), iArr, new Integer(i3)});
        } else if (!(view instanceof RecyclerView) || Math.abs(i2) < Math.abs(i)) {
        } else {
            RecyclerView recyclerView = (RecyclerView) view;
            if (!recyclerView.getLayoutManager().canScrollVertically()) {
                scrollBy(0, i2);
                iArr[0] = iArr[0] + i;
                iArr[1] = iArr[1] + i2;
            }
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) getLayoutManager();
            if (i2 > 0 && this.lastRecyclerView != null && linearLayoutManager.findFirstVisibleItemPosition() < linearLayoutManager.getPosition(this.lastRecyclerView) && recyclerView.canScrollVertically(1) && getBottom() < this.childRecyclerView.getBottom()) {
                int bottom = this.childRecyclerView.getBottom() - getBottom();
                scrollBy(0, Math.min(bottom, i2));
                iArr[1] = iArr[1] + Math.min(bottom, i2);
            }
            if (i2 >= 0 || !canScrollVertically(-1) || recyclerView.canScrollVertically(-1)) {
                return;
            }
            scrollBy(0, i2);
            iArr[1] = iArr[1] + i2;
        }
    }

    @Override // android.support.v7.widget.RecyclerView
    public void onScrollStateChanged(int i) {
        if (i == 0) {
            if (this.childRecyclerView == null) {
                this.childRecyclerView = getChildRecyclerLayout();
            }
            if (this.childRecyclerView == null) {
                return;
            }
            initParentVelocity(this);
            try {
                int round = Math.round(Float.parseFloat(this.parentVelocityYField.get(this.parentScrollerYObject).toString()));
                if (round <= 0 || !this.childRecyclerView.canScrollVertically(1)) {
                    return;
                }
                this.childRecyclerView.fling(0, round);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Override // android.support.v4.view.NestedScrollingParent2
    public boolean onStartNestedScroll(View view, View view2, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3643ce32", new Object[]{this, view, view2, new Integer(i), new Integer(i2)})).booleanValue();
        }
        if ((view2 instanceof RecyclerView) && i == 2 && i2 == 0) {
            this.childRecyclerView = (RecyclerView) view2;
            getChildRecyclerLayout();
            this.mScrollEnable = true;
            if (this.childRVOverScroller == null || this.childVelocityYField == null || this.childScrollyYField == null || this.childScrollerYObject == null) {
                initChildVelocity(this.childRecyclerView);
            }
        }
        return true;
    }

    @Override // android.support.v4.view.NestedScrollingParent2
    public void onStopNestedScroll(View view, int i) {
        this.mScrollEnable = false;
        if (view instanceof RecyclerView) {
            RecyclerView recyclerView = (RecyclerView) view;
            if (recyclerView.getLayoutManager().canScrollHorizontally() || recyclerView.canScrollVertically(-1)) {
                return;
            }
            try {
                int round = Math.round(Float.parseFloat(this.childVelocityYField.get(this.childScrollerYObject).toString()));
                if (round >= 0) {
                    return;
                }
                fling(0, round);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private RecyclerView getChildRecyclerLayout() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView) ipChange.ipc$dispatch("7aafc5ae", new Object[]{this});
        }
        View findViewByPosition = getLayoutManager().findViewByPosition(getLayoutManager().getItemCount() - 1);
        if (findViewByPosition instanceof DXRootView) {
            DXWidgetNode flattenWidgetNode = ((DXRootView) findViewByPosition).getFlattenWidgetNode();
            if (flattenWidgetNode == null) {
                TLog.logw("PAGE_MTB", "OvsMTPtrRecyclerView rootNode is null");
                return null;
            }
            DXWidgetNode queryWidgetNodeByUserId = flattenWidgetNode.queryWidgetNodeByUserId("nestedRecyclerLayout");
            if (queryWidgetNodeByUserId != null && (queryWidgetNodeByUserId instanceof DXRecyclerLayout)) {
                this.lastRecyclerView = findViewByPosition;
                return ((DXRecyclerLayout) queryWidgetNodeByUserId.getReferenceNode()).l();
            }
        }
        TLog.logw("PAGE_MTB", "OvsMTPtrRecyclerView getChildRecyclerLayout result is null");
        return null;
    }

    private void stopFling() {
        OverScroller overScroller = this.parentRVOverScroller;
        if (overScroller == null || this.childRVOverScroller == null) {
            return;
        }
        overScroller.forceFinished(true);
        this.childRVOverScroller.forceFinished(true);
        try {
            this.parentVelocityYField.set(this.parentScrollerYObject, 0);
            this.childVelocityYField.set(this.childScrollerYObject, 0);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void initParentVelocity(Object obj) {
        Field[] declaredFields;
        if (this.parentScrollerYObject == null || this.parentVelocityYField == null) {
            try {
                Field declaredField = RecyclerView.class.getDeclaredField("mViewFlinger");
                declaredField.setAccessible(true);
                Object obj2 = declaredField.get(obj);
                Field field = null;
                for (Field field2 : obj2.getClass().getDeclaredFields()) {
                    if (!"mOverScroller".equals(field2.getName()) && !"mScroller".equals(field2.getName())) {
                    }
                    field = field2;
                    break;
                }
                if (field == null) {
                    return;
                }
                field.setAccessible(true);
                this.parentRVOverScroller = (OverScroller) field.get(obj2);
                this.parentScrollYField = this.parentRVOverScroller.getClass().getDeclaredField("mScrollerY");
                this.parentScrollYField.setAccessible(true);
                this.parentScrollerYObject = this.parentScrollYField.get(this.parentRVOverScroller);
                this.parentVelocityYField = this.parentScrollerYObject.getClass().getDeclaredField("mCurrVelocity");
                this.parentVelocityYField.setAccessible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private void initChildVelocity(Object obj) {
        Field[] declaredFields;
        try {
            Field declaredField = RecyclerView.class.getDeclaredField("mViewFlinger");
            declaredField.setAccessible(true);
            Object obj2 = declaredField.get(obj);
            Field field = null;
            for (Field field2 : obj2.getClass().getDeclaredFields()) {
                if (!"mOverScroller".equals(field2.getName()) && !"mScroller".equals(field2.getName())) {
                }
                field = field2;
                break;
            }
            if (field == null) {
                return;
            }
            field.setAccessible(true);
            this.childRVOverScroller = (OverScroller) field.get(obj2);
            this.childScrollyYField = this.childRVOverScroller.getClass().getDeclaredField("mScrollerY");
            this.childScrollyYField.setAccessible(true);
            this.childScrollerYObject = this.childScrollyYField.get(this.childRVOverScroller);
            this.childVelocityYField = this.childScrollerYObject.getClass().getDeclaredField("mCurrVelocity");
            this.childVelocityYField.setAccessible(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
