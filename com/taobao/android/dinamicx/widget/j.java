package com.taobao.android.dinamicx.widget;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.view.DXNativeFrameLayout;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import java.util.ArrayList;
import tb.kge;

/* loaded from: classes.dex */
public class j extends m {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final int DEFAULT_CHILD_GRAVITY = 0;
    private final ArrayList<DXWidgetNode> matchParentChildren = new ArrayList<>(1);
    public boolean measureAllChildren = false;

    static {
        kge.a(-1326277039);
    }

    public static /* synthetic */ Object ipc$super(j jVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -857616453) {
            super.setBackground((View) objArr[0]);
            return null;
        } else if (hashCode != -740240234) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onSetIntAttribute(((Number) objArr[0]).longValue(), ((Number) objArr[1]).intValue());
            return null;
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public int reusePoolMaxSize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("184462af", new Object[]{this})).intValue();
        }
        return 10;
    }

    /* loaded from: classes.dex */
    public static class a implements ak {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-775777240);
            kge.a(349752956);
        }

        @Override // com.taobao.android.dinamicx.widget.ak
        public DXWidgetNode build(Object obj) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj}) : new j();
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode, com.taobao.android.dinamicx.widget.ak
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj}) : new j();
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onMeasure(int i, int i2) {
        int childMeasureSpec;
        int childMeasureSpec2;
        IpChange ipChange = $ipChange;
        int i3 = 2;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        int virtualChildCount = getVirtualChildCount();
        boolean z = (DXWidgetNode.DXMeasureSpec.a(i) == 1073741824 && DXWidgetNode.DXMeasureSpec.a(i2) == 1073741824) ? false : true;
        this.matchParentChildren.clear();
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        while (i7 < virtualChildCount) {
            DXWidgetNode childAt = getChildAt(i7);
            if (this.measureAllChildren || childAt.getVisibility() != i3) {
                measureChildWithMargins(childAt, i, 0, i2, 0);
                int max = Math.max(i6, childAt.getMeasuredWidth() + childAt.getMarginLeft() + childAt.getMarginRight());
                int max2 = Math.max(i5, childAt.getMeasuredHeight() + childAt.getMarginTop() + childAt.getMarginBottom());
                int combineMeasuredStates = combineMeasuredStates(i4, childAt.getMeasuredState());
                if (z && (childAt.layoutWidth == -1 || childAt.layoutHeight == -1)) {
                    this.matchParentChildren.add(childAt);
                }
                i6 = max;
                i5 = max2;
                i4 = combineMeasuredStates;
            }
            i7++;
            i3 = 2;
        }
        int i8 = i4;
        setMeasuredDimension(resolveSizeAndState(Math.max(i6 + getPaddingLeftForMeasure() + getPaddingRightForMeasure(), getSuggestedMinimumWidth()), i, i8), resolveSizeAndState(Math.max(i5 + getPaddingTopForMeasure() + getPaddingBottomForMeasure(), getSuggestedMinimumHeight()), i2, i8 << 16));
        int size = this.matchParentChildren.size();
        if (size <= 1) {
            return;
        }
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        for (int i9 = 0; i9 < size; i9++) {
            DXWidgetNode dXWidgetNode = this.matchParentChildren.get(i9);
            if (dXWidgetNode.layoutWidth == -1) {
                childMeasureSpec = DXWidgetNode.DXMeasureSpec.a(Math.max(0, (((getMeasuredWidth() - paddingLeft) - paddingRight) - dXWidgetNode.getMarginLeft()) - dXWidgetNode.getMarginRight()), 1073741824);
            } else {
                childMeasureSpec = getChildMeasureSpec(i, paddingLeft + paddingRight + dXWidgetNode.getMarginLeft() + dXWidgetNode.getMarginRight(), dXWidgetNode.layoutWidth);
            }
            if (dXWidgetNode.layoutHeight == -1) {
                childMeasureSpec2 = DXWidgetNode.DXMeasureSpec.a(Math.max(0, (((getMeasuredHeight() - paddingTop) - paddingBottom) - dXWidgetNode.getMarginTop()) - dXWidgetNode.getMarginBottom()), 1073741824);
            } else {
                childMeasureSpec2 = getChildMeasureSpec(i2, paddingTop + paddingBottom + dXWidgetNode.getMarginTop() + dXWidgetNode.getMarginBottom(), dXWidgetNode.layoutHeight);
            }
            dXWidgetNode.measure(childMeasureSpec, childMeasureSpec2);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f167cda4", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        } else {
            layoutChildren(i, i2, i3, i4, false);
        }
    }

    public int getPaddingLeftForMeasure() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("745d2571", new Object[]{this})).intValue();
        }
        int paddingLeftWithDirection = getPaddingLeftWithDirection();
        if (paddingLeftWithDirection <= 0) {
            return 0;
        }
        return paddingLeftWithDirection;
    }

    public int getPaddingRightForMeasure() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5a7abfb0", new Object[]{this})).intValue();
        }
        int paddingRightWithDirection = getPaddingRightWithDirection();
        if (paddingRightWithDirection <= 0) {
            return 0;
        }
        return paddingRightWithDirection;
    }

    public int getPaddingTopForMeasure() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a495ec69", new Object[]{this})).intValue();
        }
        if (getPaddingTop() <= 0) {
            return 0;
        }
        return getPaddingTop();
    }

    public int getPaddingBottomForMeasure() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d45dadd5", new Object[]{this})).intValue();
        }
        if (getPaddingBottom() <= 0) {
            return 0;
        }
        return getPaddingBottom();
    }

    @Override // com.taobao.android.dinamicx.widget.m, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetIntAttribute(long j, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3e0d496", new Object[]{this, new Long(j), new Integer(i)});
        } else if (9346582897824575L == j) {
            setLayoutHeight(i);
        } else {
            super.onSetIntAttribute(j, i);
        }
    }

    public void layoutChildren(int i, int i2, int i3, int i4, boolean z) {
        int leftMarginWithDirection;
        int leftMarginWithDirection2;
        int rightMarginWithDirection;
        int marginTop;
        int marginTop2;
        int marginBottom;
        int i5;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("623e88c4", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Boolean(z)});
            return;
        }
        int virtualChildCount = getVirtualChildCount();
        int direction = getDirection();
        int paddingLeftForMeasure = this.isEnableButter ? getPaddingLeftForMeasure() + i : getPaddingLeftForMeasure();
        int paddingRightForMeasure = this.isEnableButter ? i3 - getPaddingRightForMeasure() : (i3 - i) - getPaddingRightForMeasure();
        int paddingTopForMeasure = this.isEnableButter ? getPaddingTopForMeasure() + i2 : getPaddingTopForMeasure();
        int paddingBottomForMeasure = this.isEnableButter ? i4 - getPaddingBottomForMeasure() : (i4 - i2) - getPaddingBottomForMeasure();
        for (int i6 = 0; i6 < virtualChildCount; i6++) {
            DXWidgetNode childAt = getChildAt(i6);
            if (childAt.getVisibility() != 2) {
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int layoutGravity = childAt.getLayoutGravity();
                if (layoutGravity == 0 && (childAt.propertyInitFlag & 1) == 0) {
                    layoutGravity = 0;
                }
                int absoluteGravity = getAbsoluteGravity(layoutGravity, direction);
                switch (absoluteGravity) {
                    case 3:
                    case 4:
                    case 5:
                        leftMarginWithDirection2 = (((paddingRightForMeasure - paddingLeftForMeasure) - measuredWidth) / 2) + paddingLeftForMeasure + childAt.getLeftMarginWithDirection();
                        rightMarginWithDirection = childAt.getRightMarginWithDirection();
                        leftMarginWithDirection = leftMarginWithDirection2 - rightMarginWithDirection;
                        break;
                    case 6:
                    case 7:
                    case 8:
                        if (!z) {
                            leftMarginWithDirection2 = paddingRightForMeasure - measuredWidth;
                            rightMarginWithDirection = childAt.getRightMarginWithDirection();
                            leftMarginWithDirection = leftMarginWithDirection2 - rightMarginWithDirection;
                            break;
                        }
                    default:
                        leftMarginWithDirection = childAt.getLeftMarginWithDirection() + paddingLeftForMeasure;
                        break;
                }
                switch (absoluteGravity) {
                    case 0:
                    case 3:
                    case 6:
                        marginTop = childAt.getMarginTop();
                        i5 = marginTop + paddingTopForMeasure;
                        childAt.layout(leftMarginWithDirection, i5, measuredWidth + leftMarginWithDirection, measuredHeight + i5);
                        break;
                    case 1:
                    case 4:
                    case 7:
                        marginTop2 = (((paddingBottomForMeasure - paddingTopForMeasure) - measuredHeight) / 2) + paddingTopForMeasure + childAt.getMarginTop();
                        marginBottom = childAt.getMarginBottom();
                        i5 = marginTop2 - marginBottom;
                        childAt.layout(leftMarginWithDirection, i5, measuredWidth + leftMarginWithDirection, measuredHeight + i5);
                        break;
                    case 2:
                    case 5:
                    case 8:
                        marginTop2 = paddingBottomForMeasure - measuredHeight;
                        marginBottom = childAt.getMarginBottom();
                        i5 = marginTop2 - marginBottom;
                        childAt.layout(leftMarginWithDirection, i5, measuredWidth + leftMarginWithDirection, measuredHeight + i5);
                        break;
                    default:
                        marginTop = childAt.getMarginTop();
                        i5 = marginTop + paddingTopForMeasure;
                        childAt.layout(leftMarginWithDirection, i5, measuredWidth + leftMarginWithDirection, measuredHeight + i5);
                        break;
                }
            }
        }
    }

    @Override // com.taobao.android.dinamicx.widget.m
    public ViewGroup.LayoutParams generateLayoutParams(com.taobao.android.dinamicx.model.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup.LayoutParams) ipChange.ipc$dispatch("be7b699a", new Object[]{this, aVar});
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(aVar.f11888a, aVar.b);
        layoutParams.gravity = aVar.d;
        return layoutParams;
    }

    @Override // com.taobao.android.dinamicx.widget.m
    public ViewGroup.LayoutParams generateLayoutParams(com.taobao.android.dinamicx.model.a aVar, ViewGroup.LayoutParams layoutParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup.LayoutParams) ipChange.ipc$dispatch("a8eee9bd", new Object[]{this, aVar, layoutParams});
        }
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            ((FrameLayout.LayoutParams) layoutParams).gravity = aVar.d;
        }
        layoutParams.width = aVar.f11888a;
        layoutParams.height = aVar.b;
        return layoutParams;
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public View onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context}) : new DXNativeFrameLayout(context);
    }

    public Object clone() throws CloneNotSupportedException {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("78b3604e", new Object[]{this}) : super.clone();
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void setBackground(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cce1cfbb", new Object[]{this, view});
            return;
        }
        if (hasCornerRadius()) {
            DXNativeFrameLayout dXNativeFrameLayout = (DXNativeFrameLayout) view;
            com.taobao.android.dinamicx.view.a aVar = new com.taobao.android.dinamicx.view.a();
            if (getCornerRadius() > 0) {
                aVar.a(view, getCornerRadius());
            } else {
                aVar.a(view, getCornerRadiusLeftTop(), getCornerRadiusRightTop(), getCornerRadiusLeftBottom(), getCornerRadiusRightBottom());
            }
            dXNativeFrameLayout.setClipRadiusHandler(aVar);
        } else {
            com.taobao.android.dinamicx.view.a cLipRadiusHandler = ((DXNativeFrameLayout) view).getCLipRadiusHandler();
            if (cLipRadiusHandler != null) {
                cLipRadiusHandler.a(view, 0.0f);
            }
        }
        super.setBackground(view);
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public boolean supportReuse() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("562c49f0", new Object[]{this})).booleanValue() : getClass() == j.class;
    }
}
