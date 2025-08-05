package com.taobao.android.icart.widget;

import android.content.Context;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.view.DXNativeFrameLayout;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx.widget.m;
import com.taobao.tao.Globals;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import tb.bbz;
import tb.bdn;
import tb.bmq;
import tb.gbg;
import tb.jqg;
import tb.kge;

/* loaded from: classes5.dex */
public class d extends m {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DXCARTPRICEFLOWLAYOUT_CARTPRICEFLOWLAYOUT = -4522183021858442330L;
    public static final long DXCARTPRICEFLOWLAYOUT_FONTSIZESET = 4704851875127321993L;
    public static final long DXCARTPRICEFLOWLAYOUT_LINESPACE = -1442719518478951523L;
    public static final long DXCARTPRICEFLOWLAYOUT_MAXLINES = 4685059187929305417L;
    private static final JSONObject b;
    private int c;
    private int d = Integer.MAX_VALUE;
    private final Map<Integer, List<DXWidgetNode>> e = new HashMap();

    /* renamed from: a  reason: collision with root package name */
    private JSONObject f12874a = b;

    public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
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

    static {
        kge.a(1972287041);
        b = new JSONObject();
        JSONObject jSONObject = new JSONObject();
        b.put("sizeLevel_".concat("1"), (Object) a(jSONObject, 20.0f, 0.72f, 0.72f, 15.0f, 0.688f, 0.688f, 11.0f));
        b.put("sizeLevel_".concat("2"), (Object) a(new JSONObject(), 14.0f, 0.714f, 0.714f, 14.0f, 0.714f, 0.714f, 10.0f));
        b.put("sizeLevel_".concat("3"), (Object) a(new JSONObject(), 13.0f, 0.769f, 0.769f, 11.0f, 0.909f, 0.909f, 10.0f));
        b.put("sizeLevel_".concat("4"), (Object) jSONObject);
    }

    private static JSONObject a(JSONObject jSONObject, float f, float f2, float f3, float f4, float f5, float f6, float f7) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("ba4cc658", new Object[]{jSONObject, new Float(f), new Float(f2), new Float(f3), new Float(f4), new Float(f5), new Float(f6), new Float(f7)});
        }
        jSONObject.put("mainPriceSize", (Object) Float.valueOf(f));
        jSONObject.put("mainPriceSymbolScale", (Object) Float.valueOf(f2));
        jSONObject.put("mainPriceDecimalScale", (Object) Float.valueOf(f3));
        jSONObject.put("couponDiscountedPriceSize", (Object) Float.valueOf(f4));
        jSONObject.put("couponDiscountedPriceSymbolScale", (Object) Float.valueOf(f5));
        jSONObject.put("couponDiscountedPriceDecimalScale", (Object) Float.valueOf(f6));
        jSONObject.put("couponDiscountedTitlePrefixSize", (Object) Float.valueOf(f7));
        return jSONObject;
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode, com.taobao.android.dinamicx.widget.ak
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj}) : new d();
    }

    @Override // com.taobao.android.dinamicx.widget.m, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onClone(DXWidgetNode dXWidgetNode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e58628a", new Object[]{this, dXWidgetNode, new Boolean(z)});
        } else if (!(dXWidgetNode instanceof d)) {
        } else {
            super.onClone(dXWidgetNode, z);
            d dVar = (d) dXWidgetNode;
            this.f12874a = dVar.f12874a;
            this.c = dVar.c;
            this.d = dVar.d;
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        this.e.clear();
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        if (a()) {
            int i3 = 0;
            while (i3 < this.f12874a.size()) {
                int i4 = i3 + 1;
                a(this.f12874a.get("sizeLevel_".concat(String.valueOf(i4))));
                if (a(i, i2, mode, mode2, size, size2, i3 == this.f12874a.size() - 1)) {
                    return;
                }
                i3 = i4;
            }
            requestLayout();
        }
        a(i, i2, mode, mode2, size, size2, true);
    }

    private boolean a(int i, int i2, int i3, int i4, int i5, int i6, boolean z) {
        int i7;
        int i8;
        int i9;
        DXWidgetNode dXWidgetNode;
        int i10;
        int i11 = i5;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("53facc50", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i11), new Integer(i6), new Boolean(z)})).booleanValue();
        }
        this.e.clear();
        int childrenCount = getChildrenCount();
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 1;
        int i16 = 0;
        int i17 = 0;
        while (true) {
            if (i14 >= childrenCount) {
                i7 = i12;
                break;
            }
            DXWidgetNode childAt = getChildAt(i14);
            if (childAt.getVisibility() == 0) {
                i7 = i12;
                int i18 = i13;
                i8 = i14;
                i9 = childrenCount;
                measureChildWithMargins(childAt, i, 0, i2, 0);
                i13 = childAt.getMeasuredWidth() + childAt.getMarginLeft() + childAt.getMarginRight();
                int measuredHeight = childAt.getMeasuredHeight() + childAt.getMarginTop() + childAt.getMarginBottom();
                int i19 = i18 + i13;
                if (i19 <= i11) {
                    dXWidgetNode = childAt;
                    measuredHeight = Math.max(i7, measuredHeight);
                    i13 = i19;
                    i10 = i15;
                } else if (!z) {
                    return false;
                } else {
                    i10 = i15 + 1;
                    if (i10 > this.d) {
                        dXWidgetNode = childAt;
                        dXWidgetNode.setVisibility(2);
                    } else {
                        dXWidgetNode = childAt;
                    }
                    i16 = Math.max(i18, i13);
                    if (i10 > this.d) {
                        break;
                    }
                    i17 += i7;
                }
                a(dXWidgetNode, i10);
                i15 = i10;
                i12 = measuredHeight;
            } else {
                i8 = i14;
                i9 = childrenCount;
            }
            i14 = i8 + 1;
            childrenCount = i9;
        }
        int max = Math.max(i16, i13);
        int i20 = i17 + i7;
        for (Integer num : this.e.keySet()) {
            if (num.intValue() < this.e.keySet().size()) {
                i20 += this.c;
            }
        }
        if (i3 != 1073741824) {
            i11 = max;
        }
        setMeasuredDimension(i11, i4 == 1073741824 ? i6 : i20);
        return true;
    }

    private void a(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6251244", new Object[]{this, obj});
        } else if (!(obj instanceof JSONObject)) {
        } else {
            JSONObject jSONObject = (JSONObject) obj;
            bmq bmqVar = (bmq) queryWidgetNodeByUserId("mainPrice");
            if (a((DXWidgetNode) bmqVar)) {
                bmqVar.setTextSize(b(jSONObject, "mainPriceSize", bmqVar.getTextSize()));
                bmqVar.a(a(jSONObject, "mainPriceSymbolScale", bmqVar.a()));
                bmqVar.b(a(jSONObject, "mainPriceDecimalScale", bmqVar.b()));
            }
            com.taobao.android.dinamicx.widget.i iVar = (com.taobao.android.dinamicx.widget.i) queryWidgetNodeByUserId("couponDiscountedTitlePrefix");
            if (a((DXWidgetNode) iVar)) {
                iVar.setTextSize(b(jSONObject, "couponDiscountedTitlePrefixSize", iVar.getTextSize()));
            }
            bmq bmqVar2 = (bmq) queryWidgetNodeByUserId("couponDiscountedPrice");
            if (!a((DXWidgetNode) bmqVar2)) {
                return;
            }
            bmqVar2.setTextSize(b(jSONObject, "couponDiscountedPriceSize", bmqVar2.getTextSize()));
            bmqVar2.a(a(jSONObject, "couponDiscountedPriceSymbolScale", bmqVar2.a()));
            bmqVar2.b(a(jSONObject, "couponDiscountedPriceDecimalScale", bmqVar2.b()));
        }
    }

    private boolean a(DXWidgetNode dXWidgetNode) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("613bf3cb", new Object[]{this, dXWidgetNode})).booleanValue() : (dXWidgetNode == null || dXWidgetNode.getVisibility() == 2 || dXWidgetNode.getVisibility() == 1) ? false : true;
    }

    private float a(JSONObject jSONObject, String str, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b8e37e9e", new Object[]{this, jSONObject, str, new Float(f)})).floatValue();
        }
        if (!jSONObject.containsKey(str)) {
            return f;
        }
        try {
            return jSONObject.getFloat(str).floatValue();
        } catch (Exception unused) {
            return f;
        }
    }

    private float b(JSONObject jSONObject, String str, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("de77879f", new Object[]{this, jSONObject, str, new Float(f)})).floatValue();
        }
        float a2 = a(jSONObject, str, 0.0f);
        bbz b2 = b();
        return b2 != null ? a2 == 0.0f ? f : b2.x().a(a2) : a2 == 0.0f ? f : gbg.b(Globals.getApplication(), a2);
    }

    private boolean a() {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        DXWidgetNode queryWidgetNodeByUserId = queryWidgetNodeByUserId("nowTitlePrepend");
        return ((queryWidgetNodeByUserId != null && queryWidgetNodeByUserId.getVisibility() != 2) || (jSONObject = this.f12874a) == null || jSONObject.size() == 0) ? false : true;
    }

    private void a(DXWidgetNode dXWidgetNode, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c642f81c", new Object[]{this, dXWidgetNode, new Integer(i)});
        } else if (dXWidgetNode == null || dXWidgetNode.getVisibility() != 0 || i > this.d) {
        } else {
            List<DXWidgetNode> list = this.e.get(Integer.valueOf(i));
            if (list == null) {
                list = new ArrayList<>();
                this.e.put(Integer.valueOf(i), list);
            }
            list.add(dXWidgetNode);
            this.e.put(Integer.valueOf(i), list);
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
        Iterator<Integer> it = this.e.keySet().iterator();
        while (it.hasNext() && (intValue = it.next().intValue()) <= this.d) {
            List<DXWidgetNode> list = this.e.get(Integer.valueOf(intValue));
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
            i2 = i2 + i7 + this.c;
            i5 = i6;
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetMapAttribute(long j, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a92acf76", new Object[]{this, new Long(j), jSONObject});
        } else if (j == DXCARTPRICEFLOWLAYOUT_FONTSIZESET) {
            this.f12874a = jSONObject;
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
            this.c = i;
        } else if (j == 4685059187929305417L) {
            this.d = i;
        } else {
            super.onSetIntAttribute(j, i);
        }
    }

    private bbz b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bbz) ipChange.ipc$dispatch("16b45583", new Object[]{this});
        }
        bbz a2 = bdn.a(getDXRuntimeContext());
        if (a2 != null) {
            return a2;
        }
        jqg.a("iCart", "CartPriceFlowLayout", "cartPresenter is null");
        return null;
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public View onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context}) : new DXNativeFrameLayout(context);
    }
}
