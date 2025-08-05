package com.taobao.android.icart.widget;

import android.content.Context;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.view.DXNativeFrameLayout;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx.widget.m;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import tb.kge;

/* loaded from: classes5.dex */
public class a extends m {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DXALIFLOWLAYOUT_ALIFLOWLAYOUT = -1154450094495690322L;
    public static final long DXCARTFLOWLAYOUT_LINESPACE = -1442719518478951523L;
    public static final long DXCARTFLOWLAYOUT_MAXLINES = 4685059187929305417L;
    private int b;

    /* renamed from: a  reason: collision with root package name */
    private boolean f12870a = false;
    private int c = Integer.MAX_VALUE;
    private final Map<Integer, List<DXWidgetNode>> d = new HashMap();

    static {
        kge.a(-1794396828);
    }

    private boolean a(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a821939f", new Object[]{this, new Integer(i)})).booleanValue() : i >= 6 && i <= 8;
    }

    public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -740240234) {
            super.onSetIntAttribute(((Number) objArr[0]).longValue(), ((Number) objArr[1]).intValue());
            return null;
        } else if (hashCode != 2119721610) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onClone((DXWidgetNode) objArr[0], ((Boolean) objArr[1]).booleanValue());
            return null;
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode, com.taobao.android.dinamicx.widget.ak
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj}) : new a();
    }

    @Override // com.taobao.android.dinamicx.widget.m, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onClone(DXWidgetNode dXWidgetNode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e58628a", new Object[]{this, dXWidgetNode, new Boolean(z)});
        } else if (dXWidgetNode == null || !(dXWidgetNode instanceof a)) {
        } else {
            super.onClone(dXWidgetNode, z);
            a aVar = (a) dXWidgetNode;
            this.f12870a = aVar.f12870a;
            this.b = aVar.b;
            this.c = aVar.c;
        }
    }

    @Override // com.taobao.android.dinamicx.widget.m, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetIntAttribute(long j, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3e0d496", new Object[]{this, new Long(j), new Integer(i)});
        } else if (j == -1442719518478951523L) {
            this.b = i;
        } else if (j == 4685059187929305417L) {
            this.c = i;
        } else {
            super.onSetIntAttribute(j, i);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        DXWidgetNode dXWidgetNode;
        int i6;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        this.d.clear();
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int childrenCount = getChildrenCount();
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 1;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            if (i9 >= childrenCount) {
                i3 = i7;
                i4 = i8;
                i5 = i11;
                break;
            }
            DXWidgetNode childAt = getChildAt(i9);
            if (childAt.getVisibility() != 0 || (a(childAt) && this.d.get(Integer.valueOf(i10)) == null)) {
                i7 = i7;
                i8 = i8;
            } else {
                int i13 = i7;
                int i14 = i8;
                measureChildWithMargins(childAt, i, 0, i2, 0);
                int measuredWidth = childAt.getMeasuredWidth() + childAt.getMarginLeft() + childAt.getMarginRight();
                int measuredHeight = childAt.getMeasuredHeight() + childAt.getMarginTop() + childAt.getMarginBottom();
                int layoutGravity = childAt.getLayoutGravity();
                i8 = i14 + measuredWidth;
                if (i8 > size) {
                    i6 = i10 + 1;
                    if (i6 > this.c) {
                        dXWidgetNode = childAt;
                        dXWidgetNode.setVisibility(2);
                    } else {
                        dXWidgetNode = childAt;
                    }
                    i11 = Math.max(i14, measuredWidth);
                    if (i6 > this.c) {
                        i4 = measuredWidth;
                        i5 = i11;
                        i3 = i13;
                        break;
                    }
                    if (a(layoutGravity)) {
                        measuredWidth = size;
                    }
                    i12 += i13;
                    i8 = measuredWidth;
                } else {
                    dXWidgetNode = childAt;
                    if (a(layoutGravity)) {
                        i8 = i14 + (size - i14);
                    }
                    measuredHeight = Math.max(i13, measuredHeight);
                    i6 = i10;
                }
                a(dXWidgetNode, i6);
                i7 = measuredHeight;
                i10 = i6;
            }
            i9++;
        }
        int max = Math.max(i5, i4);
        int i15 = i12 + i3;
        for (Integer num : this.d.keySet()) {
            if (num.intValue() < this.d.keySet().size()) {
                i15 += this.b;
            }
        }
        if (mode == 1073741824) {
            max = size;
        }
        if (mode2 != 1073741824) {
            size2 = i15;
        }
        setMeasuredDimension(max, size2);
    }

    private void a(DXWidgetNode dXWidgetNode, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c642f81c", new Object[]{this, dXWidgetNode, new Integer(i)});
        } else if (dXWidgetNode == null || dXWidgetNode.getVisibility() != 0 || i > this.c) {
        } else {
            List<DXWidgetNode> list = this.d.get(Integer.valueOf(i));
            if (list == null) {
                list = new ArrayList<>();
                this.d.put(Integer.valueOf(i), list);
            }
            list.add(dXWidgetNode);
            this.d.put(Integer.valueOf(i), list);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int intValue;
        int i5;
        IpChange ipChange = $ipChange;
        int i6 = 1;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f167cda4", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        int i7 = i2;
        int i8 = this.isEnableButter ? i : 0;
        if (!this.isEnableButter) {
            i7 = 0;
        }
        Iterator<Integer> it = this.d.keySet().iterator();
        while (it.hasNext() && (intValue = it.next().intValue()) <= this.c) {
            List<DXWidgetNode> list = this.d.get(Integer.valueOf(intValue));
            int i9 = i8;
            int i10 = 0;
            int i11 = 0;
            while (i10 < list.size()) {
                DXWidgetNode dXWidgetNode = list.get(i10);
                int layoutGravity = dXWidgetNode.getLayoutGravity();
                if (dXWidgetNode.getVisibility() == 0) {
                    if (a(dXWidgetNode) && (i10 == 0 || i10 == list.size() - i6)) {
                        dXWidgetNode.setVisibility(2);
                    } else {
                        int marginLeft = dXWidgetNode.getMarginLeft();
                        int marginRight = dXWidgetNode.getMarginRight();
                        int measuredWidth = dXWidgetNode.getMeasuredWidth();
                        int measuredHeight = dXWidgetNode.getMeasuredHeight();
                        if (i10 == 0) {
                            i9 = this.isEnableButter ? i : 0;
                        }
                        i11 = Math.max(measuredHeight, i11);
                        if (a(layoutGravity)) {
                            i9 = getMeasuredWidth() - ((marginLeft + measuredWidth) + marginRight);
                            if (this.isEnableButter) {
                                i9 = i + i9;
                            }
                            if (layoutGravity == 7) {
                                i5 = (i11 - measuredHeight) / 2;
                            } else if (layoutGravity == 8) {
                                i5 = i11 - measuredHeight;
                            }
                            int i12 = i5 + i7;
                            dXWidgetNode.layout(i9, i12, i9 + marginLeft + measuredWidth + marginRight, measuredHeight + i12);
                            i9 += marginLeft + measuredWidth + marginRight;
                        }
                        i5 = 0;
                        int i122 = i5 + i7;
                        dXWidgetNode.layout(i9, i122, i9 + marginLeft + measuredWidth + marginRight, measuredHeight + i122);
                        i9 += marginLeft + measuredWidth + marginRight;
                    }
                }
                i10++;
                i6 = 1;
            }
            i7 = i7 + i11 + this.b;
            i8 = i9;
            i6 = 1;
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public View onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context}) : new DXNativeFrameLayout(context);
    }

    private boolean a(DXWidgetNode dXWidgetNode) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("613bf3cb", new Object[]{this, dXWidgetNode})).booleanValue() : dXWidgetNode instanceof j;
    }
}
