package com.alibaba.android.aura.service.render.widget.roundcornerlayout;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.alibaba.android.aura.service.render.widget.roundcornerlayout.roundcard.UMFCardView;
import com.alibaba.android.aura.service.render.widget.roundcornerlayout.roundcard.UMFNoneCornerCardView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import tb.bqd;
import tb.bqe;
import tb.kge;

/* loaded from: classes2.dex */
public class UMFRoundCornerLayout extends FrameLayout implements b {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final String TAG;
    private UMFCardView mCardView;
    private View mCornerCoverView;
    private a mGestureHandler;
    private UMFNoneCornerCardView mNoneCornerCardView;
    private com.alibaba.android.aura.service.render.widget.roundcornerlayout.roundcard.a mRoundCornerInnerLayout;

    /* loaded from: classes2.dex */
    public interface a {
        boolean a(MotionEvent motionEvent, View view);

        boolean b(MotionEvent motionEvent, View view);
    }

    static {
        kge.a(-1535297512);
        kge.a(-732782454);
    }

    public static /* synthetic */ Object ipc$super(UMFRoundCornerLayout uMFRoundCornerLayout, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -436676516) {
            super.onFinishInflate();
            return null;
        } else if (hashCode == -407533570) {
            return new Boolean(super.onInterceptTouchEvent((MotionEvent) objArr[0]));
        } else {
            if (hashCode != 1992612095) {
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }
            super.addView((View) objArr[0], ((Number) objArr[1]).intValue(), (ViewGroup.LayoutParams) objArr[2]);
            return null;
        }
    }

    public UMFRoundCornerLayout(Context context) {
        this(context, null);
    }

    public UMFRoundCornerLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public UMFRoundCornerLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.TAG = "UMFRoundCornerLayout";
        initViews(context);
    }

    private void initViews(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8cbdea3", new Object[]{this, context});
            return;
        }
        this.mCardView = new UMFCardView(context);
        this.mCardView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addCornerCoverView(context);
        addRoundCornerInnerLayout();
    }

    private void addRoundCornerInnerLayout() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b859a325", new Object[]{this});
            return;
        }
        View view = (View) getRoundCornerInnerLayout();
        if (view.getParent() != null) {
            return;
        }
        addView(view);
    }

    private UMFNoneCornerCardView safeGetNoneCornerCardView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UMFNoneCornerCardView) ipChange.ipc$dispatch("ba10dc89", new Object[]{this, context});
        }
        if (this.mNoneCornerCardView == null) {
            this.mNoneCornerCardView = new UMFNoneCornerCardView(context);
            this.mNoneCornerCardView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        }
        return this.mNoneCornerCardView;
    }

    private com.alibaba.android.aura.service.render.widget.roundcornerlayout.roundcard.a getRoundCornerInnerLayout() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.alibaba.android.aura.service.render.widget.roundcornerlayout.roundcard.a) ipChange.ipc$dispatch("d431c414", new Object[]{this});
        }
        com.alibaba.android.aura.service.render.widget.roundcornerlayout.roundcard.a aVar = this.mRoundCornerInnerLayout;
        return aVar == null ? safeGetNoneCornerCardView(getContext()) : aVar;
    }

    private void addCornerCoverView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf67d59b", new Object[]{this, context});
            return;
        }
        this.mCornerCoverView = new FrameLayout(context);
        this.mCornerCoverView.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        addView(this.mCornerCoverView);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76c4d8ff", new Object[]{this, view, new Integer(i), layoutParams});
        } else if (view == this.mCardView || view == this.mNoneCornerCardView || view == this.mCornerCoverView) {
            if (view.getParent() == null) {
                super.addView(view, i, layoutParams);
            }
            fixChildViewsPosition();
        } else {
            getRoundCornerInnerLayout().addView(view, i, layoutParams);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5f8d85c", new Object[]{this});
            return;
        }
        super.onFinishInflate();
        fixChildViewsPosition();
    }

    private void fixChildViewsPosition() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0af0b77", new Object[]{this});
            return;
        }
        fixViewPosition(this.mCornerCoverView, 0);
        fixViewPosition((View) getRoundCornerInnerLayout(), 1);
    }

    private void fixViewPosition(View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("201e021b", new Object[]{this, view, new Integer(i)});
        } else if (view == null) {
        } else {
            int childCount = getChildCount();
            if (i > childCount) {
                i = childCount;
            }
            int indexOfChild = indexOfChild(view);
            if (-1 == indexOfChild) {
                addView(view, i);
            } else if (indexOfChild == i) {
            } else {
                removeViewInLayout(view);
                addView(view, i);
            }
        }
    }

    @Override // com.alibaba.android.aura.service.render.widget.roundcornerlayout.b
    public void setRadius(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c80fcd05", new Object[]{this, new Float(f)});
        } else {
            setRadius(0, f);
        }
    }

    public void setRadius(int i, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39eb9878", new Object[]{this, new Integer(i), new Float(f)});
            return;
        }
        updateRoundCornerInnerLayout(f);
        if (f != getRoundCornerInnerLayout().getRadius()) {
            getRoundCornerInnerLayout().setRadius(f);
        }
        if (i == 1) {
            updateCornerCoverLayoutParams(48, (int) f);
        } else {
            updateCornerCoverLayoutParams(80, (int) f);
        }
    }

    private void translateViews(ViewGroup viewGroup, ViewGroup viewGroup2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a97d7fc5", new Object[]{this, viewGroup, viewGroup2});
            return;
        }
        int childCount = viewGroup.getChildCount();
        ArrayList<View> arrayList = new ArrayList();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt == null) {
                bqd a2 = bqe.a();
                a2.c("UMFRoundCornerLayout", "translateViews#get null childView,index=" + i);
            }
            arrayList.add(childAt);
        }
        if (childCount > 0) {
            viewGroup.removeViewsInLayout(0, childCount);
        }
        for (View view : arrayList) {
            if (view != null) {
                viewGroup2.addView(view);
            }
        }
        fixChildViewsPosition();
    }

    private void updateRoundCornerInnerLayout(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c4d9013", new Object[]{this, new Float(f)});
            return;
        }
        UMFNoneCornerCardView safeGetNoneCornerCardView = safeGetNoneCornerCardView(getContext());
        if (0.0f == f) {
            if (this.mRoundCornerInnerLayout == safeGetNoneCornerCardView) {
                return;
            }
            translateViews(this.mCardView, safeGetNoneCornerCardView);
            removeViewInLayout(this.mCardView);
            this.mRoundCornerInnerLayout = safeGetNoneCornerCardView;
            addView(safeGetNoneCornerCardView);
            return;
        }
        com.alibaba.android.aura.service.render.widget.roundcornerlayout.roundcard.a aVar = this.mRoundCornerInnerLayout;
        UMFCardView uMFCardView = this.mCardView;
        if (aVar == uMFCardView) {
            return;
        }
        translateViews(safeGetNoneCornerCardView, uMFCardView);
        removeViewInLayout(safeGetNoneCornerCardView);
        UMFCardView uMFCardView2 = this.mCardView;
        this.mRoundCornerInnerLayout = uMFCardView2;
        addView(uMFCardView2);
    }

    private void updateCornerCoverLayoutParams(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9681ba30", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        View view = this.mCornerCoverView;
        if (view == null) {
            return;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        if (layoutParams.gravity == i && layoutParams.height == i2) {
            return;
        }
        layoutParams.gravity = i;
        layoutParams.height = i2;
        this.mCornerCoverView.setLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c047129", new Object[]{this, new Integer(i)});
            return;
        }
        getRoundCornerInnerLayout().setCardBackgroundColor(i);
        View view = this.mCornerCoverView;
        if (view == null) {
            return;
        }
        view.setBackgroundColor(i);
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d9196be", new Object[]{this, new Integer(i)});
        } else {
            try {
                throw new IllegalAccessException("不支持此方法，请使用setBackgroundColor(int color)");
            } catch (IllegalAccessException unused) {
            }
        }
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2da19b5b", new Object[]{this, drawable});
        } else {
            try {
                throw new IllegalAccessException("不支持此方法，请使用setBackgroundColor(int color)");
            } catch (IllegalAccessException unused) {
            }
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e7b587fe", new Object[]{this, motionEvent})).booleanValue();
        }
        a aVar = this.mGestureHandler;
        if (aVar != null) {
            return aVar.a(motionEvent, this);
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9b14c3a", new Object[]{this, motionEvent})).booleanValue();
        }
        a aVar = this.mGestureHandler;
        if (aVar != null) {
            aVar.b(motionEvent, this);
        }
        return true;
    }

    public void setGestureHandler(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd399f42", new Object[]{this, aVar});
        } else {
            this.mGestureHandler = aVar;
        }
    }
}
