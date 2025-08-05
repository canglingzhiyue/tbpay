package com.taobao.android.sku.dinamicx.widget;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.view.DXNativeFrameLayout;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx.widget.m;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import tb.fxa;
import tb.kge;

/* loaded from: classes6.dex */
public class d extends m {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final long DX_WIDGET_ID;

    /* renamed from: a  reason: collision with root package name */
    private Map<Integer, List<DXWidgetNode>> f15172a = new LinkedHashMap();
    private Map<Integer, Integer> b = new LinkedHashMap();

    public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1775895211) {
            super.onBindEvent((Context) objArr[0], (View) objArr[1], ((Number) objArr[2]).longValue());
            return null;
        } else if (hashCode != -303753557) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onRenderView((Context) objArr[0], (View) objArr[1]);
            return null;
        }
    }

    static {
        kge.a(2072508690);
        DX_WIDGET_ID = fxa.a("WaterfallLayout");
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode, com.taobao.android.dinamicx.widget.ak
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj}) : new d();
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

    @Override // com.taobao.android.dinamicx.widget.m, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onRenderView(Context context, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede516ab", new Object[]{this, context, view});
        } else {
            super.onRenderView(context, view);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onBindEvent(Context context, View view, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9625fd55", new Object[]{this, context, view, new Long(j)});
        } else {
            super.onBindEvent(context, view, j);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
        } else {
            a(i, i2);
        }
    }

    public void a(int i, int i2) {
        int i3;
        int i4;
        int i5;
        IpChange ipChange = $ipChange;
        int i6 = 2;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c1152c8", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        this.f15172a.clear();
        this.b.clear();
        int virtualChildCount = getVirtualChildCount();
        ArrayList arrayList = new ArrayList();
        this.b.put(0, 0);
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i9 < virtualChildCount) {
            DXWidgetNode childAt = getChildAt(i9);
            if (childAt == null || childAt.getVisibility() == i6) {
                i3 = virtualChildCount;
                i7 = i7;
                i8 = i8;
            } else {
                int i13 = i7;
                i3 = virtualChildCount;
                int i14 = i8;
                measureChildWithMargins(childAt, i, 0, i2, 0);
                int measuredWidth = childAt.getMeasuredWidth() + childAt.getMarginLeft() + childAt.getMarginRight();
                int measuredHeight = childAt.getMeasuredHeight() + childAt.getMarginTop() + childAt.getMarginBottom();
                if (measuredWidth > size) {
                    i4 = measuredWidth;
                    measureChildWithMargins(childAt, View.MeasureSpec.makeMeasureSpec(size, mode), 0, i2, 0);
                    i5 = measuredHeight;
                } else {
                    i4 = measuredWidth;
                    i5 = measuredHeight;
                }
                int max = Math.max(i5, i13);
                i8 = i14 + i4;
                if (i8 > size) {
                    int i15 = i11 + 1;
                    this.f15172a.put(Integer.valueOf(i11), new ArrayList(arrayList));
                    this.b.put(Integer.valueOf(i15), Integer.valueOf(max));
                    arrayList.clear();
                    arrayList.add(childAt);
                    i12 += max;
                    i7 = max;
                    i11 = i15;
                    i10 = size;
                    i8 = i4;
                } else {
                    arrayList.add(childAt);
                    i7 = max;
                }
            }
            i9++;
            virtualChildCount = i3;
            i6 = 2;
        }
        int i16 = i7;
        int i17 = i8;
        if (i10 == 0) {
            i10 = Math.min(i17, size);
        }
        if (!arrayList.isEmpty()) {
            this.f15172a.put(Integer.valueOf(i11), new ArrayList(arrayList));
            this.b.put(Integer.valueOf(i11 + 1), Integer.valueOf(i16));
            arrayList.clear();
            i12 += i16;
        }
        setMeasuredDimension(resolveSize(Math.max(i10 + getPaddingLeftWithDirection() + getPaddingRightWithDirection(), getSuggestedMinimumWidth()), i), resolveSize(Math.max(i12 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i2));
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f167cda4", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        } else {
            a(i, i2, i3, i4);
        }
    }

    public void a(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        int i5 = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d162128", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        for (Map.Entry<Integer, List<DXWidgetNode>> entry : this.f15172a.entrySet()) {
            if (entry == null) {
                Log.e("WaterfallLayout", "null rowChildren entry");
            } else {
                List<DXWidgetNode> value = entry.getValue();
                if (value == null || value.isEmpty()) {
                    Log.e("WaterfallLayout", "null or empty rowChildren value");
                } else {
                    Integer num = this.b.get(entry.getKey());
                    if (num != null) {
                        i5 += num.intValue();
                    }
                    int paddingLeftWithDirection = getPaddingLeftWithDirection();
                    int paddingTop = getPaddingTop();
                    for (DXWidgetNode dXWidgetNode : value) {
                        if (dXWidgetNode.getVisibility() != 2) {
                            int measuredWidth = dXWidgetNode.getMeasuredWidth();
                            int measuredHeight = dXWidgetNode.getMeasuredHeight();
                            int leftMarginWithDirection = paddingLeftWithDirection + dXWidgetNode.getLeftMarginWithDirection();
                            int marginTop = paddingTop + i5 + dXWidgetNode.getMarginTop();
                            dXWidgetNode.layout(leftMarginWithDirection, marginTop, leftMarginWithDirection + measuredWidth, measuredHeight + marginTop);
                            paddingLeftWithDirection = leftMarginWithDirection + measuredWidth + dXWidgetNode.getRightMarginWithDirection();
                        }
                    }
                }
            }
        }
    }
}
