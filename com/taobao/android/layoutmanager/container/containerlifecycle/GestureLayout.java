package com.taobao.android.layoutmanager.container.containerlifecycle;

import android.content.Context;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.layoutmanager.container.SlidingLayout;
import com.taobao.tao.flexbox.layoutmanager.container.f;
import com.taobao.tao.flexbox.layoutmanager.view.PullDownCloseLayout;
import tb.kge;
import tb.oga;
import tb.ogg;

/* loaded from: classes5.dex */
public class GestureLayout extends FrameLayout implements com.taobao.tao.flexbox.layoutmanager.animation.shareelement.a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int GESTURE_TYPE_NONE = 0;
    public static final int GESTURE_TYPE_PULL_DOWN = 2;
    public static final int GESTURE_TYPE_PULL_RIGHT = 1;
    public static final int GESTURE_TYPE_PULL_SCALE = 4;
    public static final int GESTURE_TYPE_SECOND_PAGE = 8;
    private int gestureType;
    private ViewGroup gestureView;
    public oga<?> mSecPageWrapper;

    static {
        kge.a(328805402);
        kge.a(307677673);
    }

    public GestureLayout(Context context) {
        super(context);
    }

    public GestureLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public GestureLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void setGestureSupportType(final f fVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9758471a", new Object[]{this, fVar, new Integer(i)});
        } else if (this.gestureView == null) {
            this.gestureType = i;
            if ((i & 1) != 0) {
                SlidingLayout slidingLayout = new SlidingLayout(getContext());
                slidingLayout.bindPage(fVar);
                slidingLayout.bindNavigationBarColorChangeListener(fVar);
                addView(slidingLayout);
                if ((i & 8) != 0) {
                    this.mSecPageWrapper = new com.taobao.android.layoutmanager.container.secondpage.biz.b();
                    this.mSecPageWrapper.a(fVar, -1);
                    slidingLayout.addView(this.mSecPageWrapper.j());
                }
                this.gestureView = slidingLayout;
            } else if (i == 2) {
                PullDownCloseLayout pullDownCloseLayout = new PullDownCloseLayout(getContext());
                pullDownCloseLayout.setOnSwipeFinishListener(new PullDownCloseLayout.a() { // from class: com.taobao.android.layoutmanager.container.containerlifecycle.GestureLayout.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.tao.flexbox.layoutmanager.view.PullDownCloseLayout.a
                    public void onSwipeFinish() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("b1a3ba95", new Object[]{this});
                        } else {
                            fVar.finish(false);
                        }
                    }
                });
                pullDownCloseLayout.setForbidGesture(false);
                addView(pullDownCloseLayout);
                this.gestureView = pullDownCloseLayout;
            } else if ((i & 4) == 0) {
            } else {
                DragLayout dragLayout = new DragLayout(getContext());
                dragLayout.bindPage(fVar);
                dragLayout.bindNavigationBarColorChangeListener(fVar);
                addView(dragLayout);
                if ((i & 8) != 0) {
                    this.mSecPageWrapper = new com.taobao.android.layoutmanager.container.secondpage.biz.b();
                    this.mSecPageWrapper.a(fVar, -1);
                    dragLayout.addView(this.mSecPageWrapper.j());
                }
                this.gestureView = dragLayout;
            }
        } else {
            ogg.b("gesture Type 只能设置一次, 当前" + this.gestureType + "  设置为" + i);
        }
    }

    public void setContentView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6459ac6f", new Object[]{this, view});
            return;
        }
        ViewGroup viewGroup = this.gestureView;
        if (viewGroup != null) {
            if (this.mSecPageWrapper != null) {
                return;
            }
            viewGroup.addView(view);
            return;
        }
        addView(view);
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.animation.shareelement.a
    public RectF getContainerBounds() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RectF) ipChange.ipc$dispatch("7bac14a0", new Object[]{this});
        }
        ViewGroup viewGroup = this.gestureView;
        if (!(viewGroup instanceof com.taobao.tao.flexbox.layoutmanager.animation.shareelement.a)) {
            return null;
        }
        return ((com.taobao.tao.flexbox.layoutmanager.animation.shareelement.a) viewGroup).getContainerBounds();
    }

    public boolean performCloseAnimation() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7dd3f038", new Object[]{this})).booleanValue();
        }
        ViewGroup viewGroup = this.gestureView;
        if (!(viewGroup instanceof DragLayout)) {
            return false;
        }
        return ((DragLayout) viewGroup).performCloseAnimation();
    }

    public void setGestureLayoutBackground(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e22d8e1d", new Object[]{this, new Integer(i)});
            return;
        }
        ViewGroup viewGroup = this.gestureView;
        if (viewGroup instanceof DragLayout) {
            ((DragLayout) viewGroup).setShadowViewBackgroundColor(i);
        } else if (!(viewGroup instanceof SlidingLayout)) {
        } else {
            ((SlidingLayout) viewGroup).setShadowViewBackgroundColor(i);
        }
    }

    public void setBackInterceptListener(com.taobao.android.layoutmanager.container.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("517e4b0f", new Object[]{this, aVar});
            return;
        }
        ViewGroup viewGroup = this.gestureView;
        if (viewGroup instanceof DragLayout) {
            ((DragLayout) viewGroup).setBackInterceptListener(aVar);
        } else if (!(viewGroup instanceof SlidingLayout)) {
        } else {
            ((SlidingLayout) viewGroup).setBackInterceptListener(aVar);
        }
    }

    public void setDragLayoutBackground(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49bc1b4e", new Object[]{this, new Integer(i)});
            return;
        }
        ViewGroup viewGroup = this.gestureView;
        if (!(viewGroup instanceof DragLayout)) {
            return;
        }
        ((DragLayout) viewGroup).setShadowViewBackgroundColor(i);
    }
}
