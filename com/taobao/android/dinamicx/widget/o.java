package com.taobao.android.dinamicx.widget;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.view.DXNativeLinearLayout;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import tb.kge;
import tb.mto;

/* loaded from: classes.dex */
public class o extends m implements Cloneable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int HORIZONTAL = 0;
    public static final int VERTICAL = 1;
    private int mOrientation;
    public int mTotalLength;

    static {
        kge.a(1717877601);
        kge.a(-723128125);
    }

    public static /* synthetic */ Object ipc$super(o oVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -857616453:
                super.setBackground((View) objArr[0]);
                return null;
            case -740240234:
                super.onSetIntAttribute(((Number) objArr[0]).longValue(), ((Number) objArr[1]).intValue());
                return null;
            case -303753557:
                super.onRenderView((Context) objArr[0], (View) objArr[1]);
                return null;
            case 2119721610:
                super.onClone((DXWidgetNode) objArr[0], ((Boolean) objArr[1]).booleanValue());
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public int getChildrenSkipCount(DXWidgetNode dXWidgetNode, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e5d9c309", new Object[]{this, dXWidgetNode, new Integer(i)})).intValue();
        }
        return 0;
    }

    public int getLocationOffset(DXWidgetNode dXWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("40eb5e9d", new Object[]{this, dXWidgetNode})).intValue();
        }
        return 0;
    }

    public int measureNullChild(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("66deb598", new Object[]{this, new Integer(i)})).intValue();
        }
        return 0;
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
            kge.a(-99704520);
            kge.a(349752956);
        }

        @Override // com.taobao.android.dinamicx.widget.ak
        public DXWidgetNode build(Object obj) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj}) : new o();
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode, com.taobao.android.dinamicx.widget.ak
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj}) : new o();
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
        } else if (this.mOrientation == 1) {
            measureVertical(i, i2);
        } else {
            measureHorizontal(i, i2);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.m, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onClone(DXWidgetNode dXWidgetNode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e58628a", new Object[]{this, dXWidgetNode, new Boolean(z)});
            return;
        }
        super.onClone(dXWidgetNode, z);
        if (!(dXWidgetNode instanceof o)) {
            return;
        }
        this.mOrientation = ((o) dXWidgetNode).mOrientation;
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0209  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void measureVertical(int r37, int r38) {
        /*
            Method dump skipped, instructions count: 618
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.dinamicx.widget.o.measureVertical(int, int):void");
    }

    public void forceUniformWidth(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a781864", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        int a2 = DXWidgetNode.DXMeasureSpec.a(getMeasuredWidth(), 1073741824);
        for (int i3 = 0; i3 < i; i3++) {
            DXWidgetNode virtualChildAt = getVirtualChildAt(i3);
            if (virtualChildAt != null && virtualChildAt.getVisibility() != 2 && virtualChildAt.layoutWidth == -1) {
                int i4 = virtualChildAt.layoutHeight;
                virtualChildAt.layoutHeight = virtualChildAt.getMeasuredHeight();
                measureChildWithMargins(virtualChildAt, a2, 0, i2, 0);
                virtualChildAt.layoutHeight = i4;
            }
        }
    }

    public void measureHorizontal(int i, int i2) {
        o oVar;
        int i3;
        o oVar2;
        DXWidgetNode dXWidgetNode;
        float f;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        boolean z;
        int i9;
        int i10;
        o oVar3 = this;
        IpChange ipChange = $ipChange;
        int i11 = 2;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b92dc9", new Object[]{oVar3, new Integer(i), new Integer(i2)});
            return;
        }
        oVar3.mTotalLength = 0;
        int virtualChildCount = getVirtualChildCount();
        int a2 = DXWidgetNode.DXMeasureSpec.a(i);
        int a3 = DXWidgetNode.DXMeasureSpec.a(i2);
        int i12 = 1073741824;
        boolean z2 = a2 == 1073741824;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        float f2 = 0.0f;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        boolean z3 = false;
        boolean z4 = true;
        boolean z5 = false;
        while (i16 < virtualChildCount) {
            DXWidgetNode virtualChildAt = oVar3.getVirtualChildAt(i16);
            if (virtualChildAt == null) {
                oVar3.mTotalLength += oVar3.measureNullChild(i16);
            } else if (virtualChildAt.getVisibility() == i11) {
                i16 += oVar3.getChildrenSkipCount(virtualChildAt, i16);
            } else {
                float weight = (float) (f2 + virtualChildAt.getWeight());
                if (virtualChildAt.getWeight() > mto.a.GEO_NOT_SUPPORT) {
                    virtualChildAt.layoutWidth = 0;
                }
                boolean z6 = virtualChildAt.layoutWidth == 0 && virtualChildAt.getWeight() > mto.a.GEO_NOT_SUPPORT;
                if (a2 == i12 && z6) {
                    if (z2) {
                        oVar3.mTotalLength += virtualChildAt.getMarginLeft() + virtualChildAt.getMarginRight();
                    } else {
                        int i18 = oVar3.mTotalLength;
                        oVar3.mTotalLength = Math.max(i18, i18 + virtualChildAt.getMarginLeft() + virtualChildAt.getMarginRight());
                    }
                    if (oVar3.isEnableButter) {
                        virtualChildAt.setMeasuredDimension(0, 0);
                    }
                    f = weight;
                    i4 = i13;
                    i5 = i14;
                    i6 = i15;
                    i7 = i16;
                    i8 = 1073741824;
                    z3 = true;
                } else {
                    if (z6) {
                        virtualChildAt.layoutWidth = -2;
                    }
                    f = weight;
                    i4 = i13;
                    i5 = i14;
                    i6 = i15;
                    i7 = i16;
                    i8 = 1073741824;
                    measureChildBeforeLayout(virtualChildAt, i16, i, weight == 0.0f ? oVar3.mTotalLength : 0, i2, 0);
                    int measuredWidth = virtualChildAt.getMeasuredWidth();
                    if (z6) {
                        virtualChildAt.layoutWidth = 0;
                        i17 += measuredWidth;
                    }
                    if (z2) {
                        oVar3.mTotalLength += measuredWidth + virtualChildAt.getMarginLeft() + virtualChildAt.getMarginRight() + oVar3.getNextLocationOffset(virtualChildAt);
                    } else {
                        int i19 = oVar3.mTotalLength;
                        oVar3.mTotalLength = Math.max(i19, measuredWidth + i19 + virtualChildAt.getMarginLeft() + virtualChildAt.getMarginRight() + oVar3.getNextLocationOffset(virtualChildAt));
                    }
                }
                if (a3 == i8 || virtualChildAt.layoutHeight != -1) {
                    z = false;
                } else {
                    z = true;
                    z5 = true;
                }
                int marginTop = virtualChildAt.getMarginTop() + virtualChildAt.getMarginBottom();
                int measuredHeight = virtualChildAt.getMeasuredHeight() + marginTop;
                int max = Math.max(i4, measuredHeight);
                boolean z7 = z4 && virtualChildAt.layoutHeight == -1;
                if (virtualChildAt.layoutWidth > 0) {
                    if (!z) {
                        marginTop = measuredHeight;
                    }
                    i9 = Math.max(i5, marginTop);
                } else {
                    i9 = i5;
                    if (z) {
                        measuredHeight = marginTop;
                    }
                    i6 = Math.max(i6, measuredHeight);
                }
                int i20 = i7;
                i13 = max;
                z4 = z7;
                i14 = i9;
                i15 = i6;
                i10 = 1;
                i16 = i20 + oVar3.getChildrenSkipCount(virtualChildAt, i20);
                f2 = f;
                i16 += i10;
                i12 = 1073741824;
                i11 = 2;
            }
            i10 = 1;
            i16 += i10;
            i12 = 1073741824;
            i11 = 2;
        }
        int i21 = i14;
        int i22 = i15;
        int i23 = i13;
        int i24 = paddingLeft + paddingRight;
        oVar3.mTotalLength += i24;
        int resolveSizeAndState = resolveSizeAndState(Math.max(oVar3.mTotalLength, getSuggestedMinimumWidth()), i, 0);
        int i25 = ((16777215 & resolveSizeAndState) - oVar3.mTotalLength) + i17;
        if (z3 || (i25 != 0 && f2 > 0.0f)) {
            oVar3.mTotalLength = 0;
            float f3 = f2;
            int i26 = 0;
            i23 = -1;
            while (i26 < virtualChildCount) {
                DXWidgetNode virtualChildAt2 = oVar3.getVirtualChildAt(i26);
                if (virtualChildAt2 == null || virtualChildAt2.getVisibility() == 2) {
                    oVar2 = oVar3;
                } else {
                    double weight2 = virtualChildAt2.getWeight();
                    if (weight2 > mto.a.GEO_NOT_SUPPORT) {
                        double d = f3;
                        int i27 = (int) ((i25 * weight2) / d);
                        i25 -= i27;
                        float f4 = (float) (d - weight2);
                        dXWidgetNode = virtualChildAt2;
                        dXWidgetNode.measure(DXWidgetNode.DXMeasureSpec.a(Math.max(0, i27), 1073741824), getChildMeasureSpec(i2, paddingTop + paddingBottom + virtualChildAt2.getMarginTop() + virtualChildAt2.getMarginBottom(), dXWidgetNode.layoutHeight));
                        f3 = f4;
                    } else {
                        dXWidgetNode = virtualChildAt2;
                    }
                    if (z2) {
                        oVar2 = this;
                        oVar2.mTotalLength += dXWidgetNode.getMeasuredWidth() + dXWidgetNode.getMarginLeft() + dXWidgetNode.getMarginRight() + oVar2.getNextLocationOffset(dXWidgetNode);
                    } else {
                        oVar2 = this;
                        int i28 = oVar2.mTotalLength;
                        oVar2.mTotalLength = Math.max(i28, dXWidgetNode.getMeasuredWidth() + i28 + dXWidgetNode.getMarginLeft() + dXWidgetNode.getMarginRight() + oVar2.getNextLocationOffset(dXWidgetNode));
                    }
                    boolean z8 = a3 != 1073741824 && dXWidgetNode.layoutHeight == -1;
                    int marginTop2 = dXWidgetNode.getMarginTop() + dXWidgetNode.getMarginBottom();
                    int measuredHeight2 = dXWidgetNode.getMeasuredHeight() + marginTop2;
                    i23 = Math.max(i23, measuredHeight2);
                    if (z8) {
                        measuredHeight2 = marginTop2;
                    }
                    i22 = Math.max(i22, measuredHeight2);
                    if (z4 && dXWidgetNode.layoutHeight == -1) {
                        z4 = true;
                    }
                    z4 = false;
                }
                i26++;
                oVar3 = oVar2;
            }
            oVar = oVar3;
            oVar.mTotalLength += i24;
            i3 = i22;
        } else {
            i3 = Math.max(i22, i21);
            oVar = oVar3;
        }
        if (z4 || a3 == 1073741824) {
            i3 = i23;
        }
        oVar.setMeasuredDimension(resolveSizeAndState | 0, resolveSizeAndState(Math.max(i3 + paddingTop + paddingBottom, getSuggestedMinimumHeight()), i2, 0));
        if (!z5) {
            return;
        }
        oVar.forceUniformHeight(virtualChildCount, i);
    }

    public void forceUniformHeight(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cae5bdf7", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        int a2 = DXWidgetNode.DXMeasureSpec.a(getMeasuredHeight(), 1073741824);
        for (int i3 = 0; i3 < i; i3++) {
            DXWidgetNode virtualChildAt = getVirtualChildAt(i3);
            if (virtualChildAt != null && virtualChildAt.getVisibility() != 2 && virtualChildAt.layoutHeight == -1) {
                int i4 = virtualChildAt.layoutWidth;
                virtualChildAt.layoutWidth = virtualChildAt.getMeasuredWidth();
                measureChildWithMargins(virtualChildAt, i2, 0, a2, 0);
                virtualChildAt.layoutWidth = i4;
            }
        }
    }

    public void measureChildBeforeLayout(DXWidgetNode dXWidgetNode, int i, int i2, int i3, int i4, int i5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("169c8402", new Object[]{this, dXWidgetNode, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5)});
        } else {
            measureChildWithMargins(dXWidgetNode, i2, i3, i4, i5);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f167cda4", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        } else if (this.mOrientation == 1) {
            layoutVertical(i, i2, i3, i4);
        } else {
            layoutHorizontal(i, i2, i3, i4);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void layoutVertical(int r19, int r20, int r21, int r22) {
        /*
            Method dump skipped, instructions count: 290
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.dinamicx.widget.o.layoutVertical(int, int, int, int):void");
    }

    private void setChildFrame(DXWidgetNode dXWidgetNode, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba4d0df5", new Object[]{this, dXWidgetNode, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        } else {
            dXWidgetNode.layout(i, i2, i3 + i, i4 + i2);
        }
    }

    public void layoutHorizontal(int i, int i2, int i3, int i4) {
        int paddingLeftWithDirection;
        int i5;
        int i6;
        int marginTop;
        int marginTop2;
        int marginBottom;
        IpChange ipChange = $ipChange;
        int i7 = 0;
        int i8 = 2;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("781b3ab5", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        boolean isLayoutRtl = isLayoutRtl();
        int paddingTop = getPaddingTop();
        int i9 = i4 - i2;
        int paddingBottom = i9 - getPaddingBottom();
        int paddingBottom2 = (i9 - paddingTop) - getPaddingBottom();
        int virtualChildCount = getVirtualChildCount();
        switch (getAbsoluteGravity(getChildGravity(), getDirection())) {
            case 3:
            case 4:
            case 5:
                paddingLeftWithDirection = getPaddingLeftWithDirection() + (((i3 - i) - this.mTotalLength) / 2);
                break;
            case 6:
            case 7:
            case 8:
                paddingLeftWithDirection = ((getPaddingLeftWithDirection() + i3) - i) - this.mTotalLength;
                break;
            default:
                paddingLeftWithDirection = getPaddingLeftWithDirection();
                break;
        }
        if (this.isEnableButter) {
            paddingLeftWithDirection += i;
        }
        if (isLayoutRtl) {
            i5 = virtualChildCount - 1;
            i6 = -1;
        } else {
            i5 = 0;
            i6 = 1;
        }
        while (i7 < virtualChildCount) {
            int i10 = i5 + (i6 * i7);
            DXWidgetNode virtualChildAt = getVirtualChildAt(i10);
            if (virtualChildAt == null) {
                paddingLeftWithDirection += measureNullChild(i10);
            } else if (virtualChildAt.getVisibility() != i8) {
                int measuredWidth = virtualChildAt.getMeasuredWidth();
                int measuredHeight = virtualChildAt.getMeasuredHeight();
                int layoutGravity = virtualChildAt.getLayoutGravity();
                if ((virtualChildAt.propertyInitFlag & 1) == 0 && layoutGravity == 0) {
                    layoutGravity = getChildGravity();
                }
                switch (layoutGravity) {
                    case 0:
                    case 3:
                    case 6:
                        marginTop = virtualChildAt.getMarginTop() + paddingTop;
                        break;
                    case 1:
                    case 4:
                    case 7:
                        marginTop2 = ((paddingBottom2 - measuredHeight) / i8) + paddingTop + virtualChildAt.getMarginTop();
                        marginBottom = virtualChildAt.getMarginBottom();
                        marginTop = marginTop2 - marginBottom;
                        break;
                    case 2:
                    case 5:
                    case 8:
                        marginTop2 = paddingBottom - measuredHeight;
                        marginBottom = virtualChildAt.getMarginBottom();
                        marginTop = marginTop2 - marginBottom;
                        break;
                    default:
                        marginTop = paddingTop;
                        break;
                }
                if (this.isEnableButter) {
                    marginTop += i2;
                }
                int leftMarginWithDirection = paddingLeftWithDirection + virtualChildAt.getLeftMarginWithDirection();
                setChildFrame(virtualChildAt, leftMarginWithDirection + getLocationOffset(virtualChildAt), marginTop, measuredWidth, measuredHeight);
                i7 += getChildrenSkipCount(virtualChildAt, i10);
                paddingLeftWithDirection = leftMarginWithDirection + measuredWidth + virtualChildAt.getRightMarginWithDirection() + getNextLocationOffset(virtualChildAt);
            }
            i7++;
            i8 = 2;
        }
    }

    @Override // com.taobao.android.dinamicx.widget.m, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetIntAttribute(long j, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3e0d496", new Object[]{this, new Long(j), new Integer(i)});
        } else if (-7199229155167727177L == j) {
            this.mOrientation = i;
        } else {
            super.onSetIntAttribute(j, i);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.m
    public ViewGroup.LayoutParams generateLayoutParams(com.taobao.android.dinamicx.model.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup.LayoutParams) ipChange.ipc$dispatch("be7b699a", new Object[]{this, aVar});
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(aVar.f11888a, aVar.b);
        layoutParams.gravity = aVar.d;
        return layoutParams;
    }

    @Override // com.taobao.android.dinamicx.widget.m
    public ViewGroup.LayoutParams generateLayoutParams(com.taobao.android.dinamicx.model.a aVar, ViewGroup.LayoutParams layoutParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup.LayoutParams) ipChange.ipc$dispatch("a8eee9bd", new Object[]{this, aVar, layoutParams});
        }
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            ((LinearLayout.LayoutParams) layoutParams).gravity = aVar.d;
        }
        layoutParams.width = aVar.f11888a;
        layoutParams.height = aVar.b;
        return layoutParams;
    }

    @Override // com.taobao.android.dinamicx.widget.m, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onRenderView(Context context, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede516ab", new Object[]{this, context, view});
            return;
        }
        if (view != null && (view instanceof LinearLayout)) {
            ((LinearLayout) view).setOrientation(this.mOrientation);
        }
        super.onRenderView(context, view);
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public View onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context}) : new DXNativeLinearLayout(context);
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void setBackground(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cce1cfbb", new Object[]{this, view});
            return;
        }
        if (view instanceof DXNativeLinearLayout) {
            if (hasCornerRadius()) {
                DXNativeLinearLayout dXNativeLinearLayout = (DXNativeLinearLayout) view;
                com.taobao.android.dinamicx.view.a aVar = new com.taobao.android.dinamicx.view.a();
                int cornerRadius = getCornerRadius();
                if (cornerRadius > 0) {
                    aVar.a(view, cornerRadius);
                } else {
                    aVar.a(view, getCornerRadiusLeftTop(), getCornerRadiusRightTop(), getCornerRadiusLeftBottom(), getCornerRadiusRightBottom());
                }
                dXNativeLinearLayout.setClipRadiusHandler(aVar);
            } else {
                com.taobao.android.dinamicx.view.a cLipRadiusHandler = ((DXNativeLinearLayout) view).getCLipRadiusHandler();
                if (cLipRadiusHandler != null) {
                    cLipRadiusHandler.a(view, 0.0f);
                }
            }
        }
        super.setBackground(view);
    }

    public int getOrientation() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ad9ae414", new Object[]{this})).intValue() : this.mOrientation;
    }

    public void setOrientation(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9bea80e", new Object[]{this, new Integer(i)});
        } else {
            this.mOrientation = i;
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public boolean supportReuse() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("562c49f0", new Object[]{this})).booleanValue() : getClass() == o.class;
    }
}
