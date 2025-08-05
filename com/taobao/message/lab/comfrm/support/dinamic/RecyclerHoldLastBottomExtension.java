package com.taobao.message.lab.comfrm.support.dinamic;

import android.app.Activity;
import android.os.Build;
import android.support.v7.widget.LinearSmoothScroller;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.View;
import android.view.ViewTreeObserver;
import com.alibaba.fastjson.JSONArray;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.widget.DXRecyclerLayout;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import tb.kge;

/* loaded from: classes7.dex */
public class RecyclerHoldLastBottomExtension {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Activity mActivity;
    private DXRootView mDxRootView;
    private ViewTreeObserver.OnGlobalLayoutListener mOnGlobalLayoutListener;

    static {
        kge.a(1986571118);
    }

    public static /* synthetic */ DXRootView access$000(RecyclerHoldLastBottomExtension recyclerHoldLastBottomExtension) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXRootView) ipChange.ipc$dispatch("3ff51cdb", new Object[]{recyclerHoldLastBottomExtension}) : recyclerHoldLastBottomExtension.mDxRootView;
    }

    public void tryInit(Activity activity, DXRootView dXRootView, final JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0caf8ed", new Object[]{this, activity, dXRootView, jSONArray});
        } else if (this.mOnGlobalLayoutListener != null) {
        } else {
            this.mActivity = activity;
            this.mDxRootView = dXRootView;
            ViewTreeObserver viewTreeObserver = activity.getWindow().getDecorView().getViewTreeObserver();
            this.mOnGlobalLayoutListener = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.taobao.message.lab.comfrm.support.dinamic.RecyclerHoldLastBottomExtension.1
                public static volatile transient /* synthetic */ IpChange $ipChange;
                private int[] heightArray;
                private View[] viewArray;

                {
                    this.viewArray = new View[jSONArray.size()];
                    this.heightArray = new int[jSONArray.size()];
                }

                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public void onGlobalLayout() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("df7e7eb3", new Object[]{this});
                    } else if (RecyclerHoldLastBottomExtension.access$000(RecyclerHoldLastBottomExtension.this).getFlattenWidgetNode() != null) {
                        for (int i = 0; i < jSONArray.size(); i++) {
                            String string = jSONArray.getString(i);
                            DXWidgetNode queryWTByUserId = RecyclerHoldLastBottomExtension.access$000(RecyclerHoldLastBottomExtension.this).getFlattenWidgetNode().queryWTByUserId(string);
                            if (!(queryWTByUserId instanceof DXRecyclerLayout)) {
                                return;
                            }
                            RecyclerView l = ((DXRecyclerLayout) queryWTByUserId).l();
                            if (l == null) {
                                queryWTByUserId = RecyclerHoldLastBottomExtension.access$000(RecyclerHoldLastBottomExtension.this).getExpandWidgetNode().queryWTByUserId(string);
                                if (!(queryWTByUserId instanceof DXRecyclerLayout)) {
                                    return;
                                }
                                l = ((DXRecyclerLayout) queryWTByUserId).l();
                            }
                            if (l == null) {
                                return;
                            }
                            StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) l.getLayoutManager();
                            int[] findLastVisibleItemPositions = staggeredGridLayoutManager.findLastVisibleItemPositions(null);
                            if (findLastVisibleItemPositions != null && findLastVisibleItemPositions.length > 0) {
                                DXRecyclerLayout dXRecyclerLayout = (DXRecyclerLayout) queryWTByUserId;
                                if (dXRecyclerLayout.c() != null && findLastVisibleItemPositions[0] == dXRecyclerLayout.c().size() - 1) {
                                    View findViewByPosition = staggeredGridLayoutManager.findViewByPosition(findLastVisibleItemPositions[0]);
                                    int height = findViewByPosition != null ? findViewByPosition.getHeight() : 0;
                                    int bottom = findViewByPosition != null ? findViewByPosition.getBottom() : 0;
                                    int height2 = l.getHeight();
                                    if (this.viewArray[i] == findViewByPosition && this.heightArray[i] != height && bottom + height > height2) {
                                        LinearSmoothScroller linearSmoothScroller = new LinearSmoothScroller(l.getContext()) { // from class: com.taobao.message.lab.comfrm.support.dinamic.RecyclerHoldLastBottomExtension.1.1
                                            public static volatile transient /* synthetic */ IpChange $ipChange;

                                            public static /* synthetic */ Object ipc$super(C07101 c07101, String str, Object... objArr) {
                                                int hashCode = str.hashCode();
                                                if (hashCode != -1299653488) {
                                                    if (hashCode != 963576506) {
                                                        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
                                                    }
                                                    return new Integer(super.calculateTimeForDeceleration(((Number) objArr[0]).intValue()));
                                                }
                                                return new Integer(super.calculateTimeForScrolling(((Number) objArr[0]).intValue()));
                                            }

                                            @Override // android.support.v7.widget.LinearSmoothScroller
                                            public int getVerticalSnapPreference() {
                                                IpChange ipChange3 = $ipChange;
                                                if (ipChange3 instanceof IpChange) {
                                                    return ((Number) ipChange3.ipc$dispatch("ecfe2c4b", new Object[]{this})).intValue();
                                                }
                                                return 1;
                                            }

                                            @Override // android.support.v7.widget.LinearSmoothScroller
                                            public int calculateTimeForDeceleration(int i2) {
                                                IpChange ipChange3 = $ipChange;
                                                return ipChange3 instanceof IpChange ? ((Number) ipChange3.ipc$dispatch("396f02ba", new Object[]{this, new Integer(i2)})).intValue() : (int) (super.calculateTimeForDeceleration(i2) * 1.5d);
                                            }

                                            @Override // android.support.v7.widget.LinearSmoothScroller
                                            public int calculateTimeForScrolling(int i2) {
                                                IpChange ipChange3 = $ipChange;
                                                return ipChange3 instanceof IpChange ? ((Number) ipChange3.ipc$dispatch("b288dc90", new Object[]{this, new Integer(i2)})).intValue() : super.calculateTimeForScrolling(i2) << 1;
                                            }
                                        };
                                        linearSmoothScroller.setTargetPosition(findLastVisibleItemPositions[0]);
                                        l.getLayoutManager().startSmoothScroll(linearSmoothScroller);
                                    }
                                    this.viewArray[i] = findViewByPosition;
                                    this.heightArray[i] = height;
                                }
                            }
                            this.viewArray[i] = null;
                            this.heightArray[i] = 0;
                        }
                    }
                }
            };
            viewTreeObserver.addOnGlobalLayoutListener(this.mOnGlobalLayoutListener);
        }
    }

    public void destory() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0306f9b", new Object[]{this});
        } else if (this.mOnGlobalLayoutListener == null) {
        } else {
            ViewTreeObserver viewTreeObserver = this.mActivity.getWindow().getDecorView().getViewTreeObserver();
            if (Build.VERSION.SDK_INT >= 16) {
                viewTreeObserver.removeOnGlobalLayoutListener(this.mOnGlobalLayoutListener);
            } else {
                viewTreeObserver.removeGlobalOnLayoutListener(this.mOnGlobalLayoutListener);
            }
            this.mOnGlobalLayoutListener = null;
        }
    }
}
