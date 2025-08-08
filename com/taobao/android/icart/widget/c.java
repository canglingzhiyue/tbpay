package com.taobao.android.icart.widget;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
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
public class c extends m {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DXCARTNEWTAGFLOWLAYOUT_CARTNEWTAGFLOWLAYOUT = -2807594229855887366L;
    public static final long DXCARTNEWTAGFLOWLAYOUT_LIMITLINES = 4980744156394974500L;
    public static final long DXCARTNEWTAGFLOWLAYOUT_LINESPACE = -1442719518478951523L;
    public static final long DXCARTNEWTAGFLOWLAYOUT_MAXLINES = 4685059187929305417L;

    /* renamed from: a  reason: collision with root package name */
    private JSONObject f12873a;
    private int b;
    private int c = Integer.MAX_VALUE;
    private final Map<Integer, List<DXWidgetNode>> d = new HashMap();
    private final Map<String, Integer> e = new HashMap();

    static {
        kge.a(441574878);
    }

    public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1456812170) {
            super.onSetMapAttribute(((Number) objArr[0]).longValue(), (JSONObject) objArr[1]);
            return null;
        } else if (hashCode == -740240234) {
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
        return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj}) : new c();
    }

    @Override // com.taobao.android.dinamicx.widget.m, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onClone(DXWidgetNode dXWidgetNode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e58628a", new Object[]{this, dXWidgetNode, new Boolean(z)});
        } else if (dXWidgetNode == null || !(dXWidgetNode instanceof c)) {
        } else {
            super.onClone(dXWidgetNode, z);
            c cVar = (c) dXWidgetNode;
            this.f12873a = cVar.f12873a;
            this.b = cVar.b;
            this.c = cVar.c;
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        String str;
        DXWidgetNode dXWidgetNode;
        int i7;
        IpChange ipChange = $ipChange;
        int i8 = 2;
        int i9 = 1;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        this.d.clear();
        this.e.clear();
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int childrenCount = getChildrenCount();
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 1;
        int i14 = 0;
        int i15 = 0;
        while (true) {
            if (i12 >= childrenCount) {
                i3 = i10;
                break;
            }
            DXWidgetNode childAt = getChildAt(i12);
            String userId = childAt.getUserId();
            if (!a(userId)) {
                childAt.setVisibility(i8);
            }
            if (childAt.getVisibility() == 0) {
                int i16 = i10;
                i5 = i11;
                i6 = i12;
                measureChildWithMargins(childAt, i, 0, i2, 0);
                i11 = childAt.getMeasuredWidth() + childAt.getMarginLeft() + childAt.getMarginRight();
                int measuredHeight = childAt.getMeasuredHeight() + childAt.getMarginTop() + childAt.getMarginBottom();
                int i17 = i5 + i11;
                if (i17 > size) {
                    if (!StringUtils.isEmpty(userId)) {
                        Map<String, Integer> map = this.e;
                        str = userId;
                        map.put(str, Integer.valueOf(map.containsKey(str) ? this.e.get(str).intValue() + i9 : 1));
                    } else {
                        str = userId;
                    }
                    if (!a(str)) {
                        childAt.setVisibility(2);
                        i4 = i16;
                    } else {
                        dXWidgetNode = childAt;
                        i7 = i13 + 1;
                        if (i7 > this.c) {
                            dXWidgetNode.setVisibility(2);
                        }
                        i14 = Math.max(i5, i11);
                        if (i7 > this.c) {
                            i3 = i16;
                            break;
                        }
                        i15 += i16;
                    }
                } else {
                    str = userId;
                    dXWidgetNode = childAt;
                    measuredHeight = Math.max(i16, measuredHeight);
                    i11 = i17;
                    i7 = i13;
                }
                Map<String, Integer> map2 = this.e;
                map2.put(str, Integer.valueOf(map2.containsKey(str) ? this.e.get(str).intValue() : 1));
                a(dXWidgetNode, i7);
                i10 = measuredHeight;
                i13 = i7;
                i12 = i6 + 1;
                i8 = 2;
                i9 = 1;
            } else {
                i4 = i10;
                i5 = i11;
                i6 = i12;
            }
            i11 = i5;
            i10 = i4;
            i12 = i6 + 1;
            i8 = 2;
            i9 = 1;
        }
        int max = Math.max(i14, i11);
        int i18 = i15 + i3;
        for (Integer num : this.d.keySet()) {
            if (num.intValue() < this.d.keySet().size()) {
                i18 += this.b;
            }
        }
        if (mode != 1073741824) {
            size = max;
        }
        if (mode2 != 1073741824) {
            size2 = i18;
        }
        setMeasuredDimension(size, size2);
    }

    private boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue();
        }
        if (StringUtils.isEmpty(str)) {
            return true;
        }
        return !this.f12873a.containsKey(str) || (this.e.containsKey(str) ? this.e.get(str).intValue() : 0) <= this.f12873a.getInteger(str).intValue();
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
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f167cda4", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        int i5 = this.isEnableButter ? i : 0;
        if (!this.isEnableButter) {
            i2 = 0;
        }
        Iterator<Integer> it = this.d.keySet().iterator();
        while (it.hasNext() && (intValue = it.next().intValue()) <= this.c) {
            List<DXWidgetNode> list = this.d.get(Integer.valueOf(intValue));
            int i6 = i5;
            int i7 = 0;
            for (int i8 = 0; i8 < list.size(); i8++) {
                DXWidgetNode dXWidgetNode = list.get(i8);
                if (dXWidgetNode.getVisibility() == 0) {
                    int marginLeft = dXWidgetNode.getMarginLeft();
                    int marginRight = dXWidgetNode.getMarginRight();
                    int measuredWidth = dXWidgetNode.getMeasuredWidth();
                    int measuredHeight = dXWidgetNode.getMeasuredHeight();
                    if (i8 == 0) {
                        i6 = this.isEnableButter ? i : 0;
                    }
                    dXWidgetNode.layout(i6, i2, i6 + marginLeft + measuredWidth + marginRight, i2 + measuredHeight);
                    i6 += marginLeft + measuredWidth + marginRight;
                    i7 = Math.max(measuredHeight, i7);
                }
            }
            i2 = i2 + i7 + this.b;
            i5 = i6;
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetMapAttribute(long j, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a92acf76", new Object[]{this, new Long(j), jSONObject});
        } else if (j == DXCARTNEWTAGFLOWLAYOUT_LIMITLINES) {
            this.f12873a = jSONObject;
        } else {
            super.onSetMapAttribute(j, jSONObject);
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
    public View onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context}) : new DXNativeFrameLayout(context);
    }
}
