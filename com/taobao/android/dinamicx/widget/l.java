package com.taobao.android.dinamicx.widget;

import android.content.Context;
import android.view.View;
import com.alibaba.fastjson.JSONArray;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.bx;
import com.taobao.android.dinamicx.view.DXNativeGridLayout;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx.widget.m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import tb.fqi;
import tb.gbg;
import tb.kge;

/* loaded from: classes.dex */
public class l extends j {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DXGRIDLAYOUT_MAXCOLCOUNT = -7092152831124183944L;
    public static final long DXGRIDLAYOUT_MAXROWCOUNT = -8743048525866445678L;
    public static final long DXGRIDLAYOUT_MINCOLCOUNT = -787266499800216458L;
    public static final long DXGRIDLAYOUT_MINROWCOUNT = -2438162194542478192L;
    public static final long DXGRIDLAYOUT_ORIENTATION = -7199229155167727177L;
    public static final int DXGRIDLAYOUT_ORIENTATION_HORIZONTAL = 0;
    public static final int DXGRIDLAYOUT_ORIENTATION_VERTICAL = 1;
    public static final long DX_GRID_LAYOUT = 7789579202915247118L;
    public static final long DX_GRID_LAYOUT_COLUMN_COUNT = 4480460401770252962L;
    public static final long DX_GRID_LAYOUT_COLUMN_SPACING = -7076735627431451296L;
    public static final long DX_GRID_LAYOUT_ITEM_HEIGHT = -889779179579457774L;
    public static final long DX_GRID_LAYOUT_ITEM_WIDTH = -5480582194049152328L;
    public static final long DX_GRID_LAYOUT_LINE_COLOR = -1442755333969665872L;
    public static final long DX_GRID_LAYOUT_LINE_WIDTH = -1442710627541559887L;
    public static final long DX_GRID_LAYOUT_NEED_SEPARATOR = -7975214338005072550L;
    public static final long DX_GRID_LAYOUT_ROW_COUNT = 6173497815537313897L;
    public static final long DX_GRID_LAYOUT_ROW_SPACING = -5965488911581852121L;
    private int b;
    private int c;
    private int d;
    private int k;
    private float[] l;

    /* renamed from: a  reason: collision with root package name */
    private int f12108a = 0;
    private int e = -8421505;
    private int f = gbg.a(getEngine(), DinamicXEngine.i(), "0.5np", 0);
    private boolean g = false;
    private int h = 0;
    private int i = 0;
    private int j = 0;
    private int m = 0;
    private int n = -1;
    private int o = -1;
    private int p = -1;
    private int q = -1;

    static {
        kge.a(-1197825918);
    }

    public static /* synthetic */ Object ipc$super(l lVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1133248269:
                return new Integer(super.getDefaultValueForIntAttr(((Number) objArr[0]).longValue()));
            case -740240234:
                super.onSetIntAttribute(((Number) objArr[0]).longValue(), ((Number) objArr[1]).intValue());
                return null;
            case -634587146:
                return new Boolean(super.checkLayoutFlat());
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

    @Override // com.taobao.android.dinamicx.widget.j, com.taobao.android.dinamicx.widget.DXWidgetNode
    public int reusePoolMaxSize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("184462af", new Object[]{this})).intValue();
        }
        return 3;
    }

    /* loaded from: classes.dex */
    public static class a implements ak {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-1688087207);
            kge.a(349752956);
        }

        @Override // com.taobao.android.dinamicx.widget.ak
        public DXWidgetNode build(Object obj) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj}) : new l();
        }
    }

    @Override // com.taobao.android.dinamicx.widget.j, com.taobao.android.dinamicx.widget.DXWidgetNode, com.taobao.android.dinamicx.widget.ak
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj}) : new l();
    }

    @Override // com.taobao.android.dinamicx.widget.j, com.taobao.android.dinamicx.widget.DXWidgetNode
    public View onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context}) : new DXNativeGridLayout(context);
    }

    @Override // com.taobao.android.dinamicx.widget.m
    public boolean checkLayoutFlat() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("da2cf7f6", new Object[]{this})).booleanValue() : this.g || super.checkLayoutFlat();
    }

    @Override // com.taobao.android.dinamicx.widget.m, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onClone(DXWidgetNode dXWidgetNode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e58628a", new Object[]{this, dXWidgetNode, new Boolean(z)});
        } else if (dXWidgetNode == null || !(dXWidgetNode instanceof l)) {
        } else {
            super.onClone(dXWidgetNode, z);
            l lVar = (l) dXWidgetNode;
            this.f12108a = lVar.f12108a;
            this.b = lVar.b;
            this.c = lVar.c;
            this.d = lVar.d;
            this.e = lVar.e;
            this.f = lVar.f;
            this.g = lVar.g;
            this.h = lVar.h;
            this.k = lVar.k;
            this.l = lVar.l;
            this.i = lVar.i;
            this.m = lVar.m;
            this.n = lVar.n;
            this.p = lVar.p;
            this.o = lVar.o;
            this.q = lVar.q;
        }
    }

    @Override // com.taobao.android.dinamicx.widget.j, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
        } else if (this.m == 1) {
            a(i, i2);
        } else {
            b(i, i2);
        }
    }

    public void a(int i, int i2) {
        int b;
        int b2;
        int paddingLeft;
        int paddingRight;
        int i3;
        int i4;
        IpChange ipChange = $ipChange;
        int i5 = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c1152c8", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        int virtualChildCount = getVirtualChildCount();
        int a2 = DXWidgetNode.DXMeasureSpec.a(this.d, 1073741824);
        DXWidgetNode.DXMeasureSpec.a(this.c, 1073741824);
        for (int i6 = 0; i6 < virtualChildCount; i6++) {
            DXWidgetNode childAt = getChildAt(i6);
            int b3 = b(childAt);
            measureChildWithMargins(childAt, a2, 0, DXWidgetNode.DXMeasureSpec.a((this.c * b3) + ((b3 - 1) * this.k), 1073741824), 0);
        }
        int a3 = DXWidgetNode.DXMeasureSpec.a(i);
        int a4 = DXWidgetNode.DXMeasureSpec.a(i2);
        boolean z = a3 != 1073741824;
        boolean z2 = a4 != 1073741824;
        if (this.h > 0 && (i5 = this.f12108a) <= 0) {
            int c = c();
            int i7 = this.h;
            if (c % i7 == 0) {
                i5 = c / i7;
            } else {
                i5 = (c / i7) + 1;
            }
            int i8 = this.n;
            if ((i8 > 0 && i8 > this.p && i5 > i8) || ((i3 = this.p) > 0 && (((i4 = this.n) < 0 || i4 > i3) && i5 < (i8 = this.p)))) {
                i5 = i8;
            }
        }
        this.j = i5;
        if (z || z2) {
            if (z) {
                if (i5 > 0) {
                    int i9 = this.d * i5;
                    int i10 = this.b * (i5 - 1);
                    paddingRight = getPaddingLeft() + getPaddingRight();
                    paddingLeft = i9 + i10;
                } else {
                    paddingLeft = getPaddingLeft();
                    paddingRight = getPaddingRight();
                }
                b = paddingLeft + paddingRight;
            } else {
                b = DXWidgetNode.DXMeasureSpec.b(i);
            }
            if (z2) {
                int i11 = this.h;
                if (i11 > 0) {
                    b2 = getPaddingTop() + getPaddingBottom() + (this.c * i11) + (this.k * (i11 - 1));
                } else {
                    b2 = getPaddingTop() + getPaddingBottom();
                }
            } else {
                b2 = DXWidgetNode.DXMeasureSpec.b(i2);
            }
        } else {
            b = DXWidgetNode.DXMeasureSpec.b(i);
            b2 = DXWidgetNode.DXMeasureSpec.b(i2);
        }
        setMeasuredDimension(resolveSize(b, i), resolveSize(b2, i2));
    }

    public void b(int i, int i2) {
        int b;
        int b2;
        int paddingTop;
        int paddingBottom;
        int i3;
        int i4;
        IpChange ipChange = $ipChange;
        int i5 = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90f78e09", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        int virtualChildCount = getVirtualChildCount();
        DXWidgetNode.DXMeasureSpec.a(this.d, 1073741824);
        int a2 = DXWidgetNode.DXMeasureSpec.a(this.c, 1073741824);
        for (int i6 = 0; i6 < virtualChildCount; i6++) {
            DXWidgetNode childAt = getChildAt(i6);
            int a3 = a(childAt);
            measureChildWithMargins(childAt, DXWidgetNode.DXMeasureSpec.a((this.d * a3) + ((a3 - 1) * this.b), 1073741824), 0, a2, 0);
        }
        int a4 = DXWidgetNode.DXMeasureSpec.a(i);
        int a5 = DXWidgetNode.DXMeasureSpec.a(i2);
        boolean z = a4 != 1073741824;
        boolean z2 = a5 != 1073741824;
        if (this.f12108a > 0 && (i5 = this.h) <= 0) {
            int b3 = b();
            int i7 = this.f12108a;
            if (b3 % i7 == 0) {
                i5 = b3 / i7;
            } else {
                i5 = (b3 / i7) + 1;
            }
            int i8 = this.o;
            if ((i8 > 0 && i8 > i8 && i5 > i8) || ((i3 = this.q) > 0 && (((i4 = this.o) < 0 || i4 > i3) && i5 < (i8 = this.q)))) {
                i5 = i8;
            }
        }
        this.i = i5;
        if (z || z2) {
            if (z) {
                int i9 = this.f12108a;
                if (i9 > 0) {
                    b = (this.d * i9) + (this.b * (i9 - 1)) + getPaddingLeft() + getPaddingRight();
                } else {
                    b = getPaddingLeft() + getPaddingRight();
                }
            } else {
                b = DXWidgetNode.DXMeasureSpec.b(i);
            }
            if (z2) {
                if (i5 > 0) {
                    int i10 = this.c * i5;
                    int i11 = this.k * (i5 - 1);
                    paddingBottom = getPaddingTop() + getPaddingBottom();
                    paddingTop = i10 + i11;
                } else {
                    paddingTop = getPaddingTop();
                    paddingBottom = getPaddingBottom();
                }
                b2 = paddingTop + paddingBottom;
            } else {
                b2 = DXWidgetNode.DXMeasureSpec.b(i2);
            }
        } else {
            b = DXWidgetNode.DXMeasureSpec.b(i);
            b2 = DXWidgetNode.DXMeasureSpec.b(i2);
        }
        setMeasuredDimension(resolveSize(b, i), resolveSize(b2, i2));
    }

    @Override // com.taobao.android.dinamicx.widget.m
    public void measureChildWithMargins(DXWidgetNode dXWidgetNode, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16c425c7", new Object[]{this, dXWidgetNode, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        } else {
            dXWidgetNode.measure(getChildMeasureSpec(i, dXWidgetNode.getMarginLeft() + dXWidgetNode.getMarginRight() + i2, dXWidgetNode.layoutWidth), getChildMeasureSpec(i3, dXWidgetNode.getMarginTop() + dXWidgetNode.getMarginBottom() + i4, dXWidgetNode.layoutHeight));
        }
    }

    @Override // com.taobao.android.dinamicx.widget.j, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f167cda4", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        if (this.m == 1) {
            b(z, i, i2, i3, i4);
        } else {
            a(z, i, i2, i3, i4);
        }
        a();
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x0137  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void a(boolean r19, int r20, int r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 348
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.dinamicx.widget.l.a(boolean, int, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x012f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void b(boolean r19, int r20, int r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 340
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.dinamicx.widget.l.b(boolean, int, int, int, int):void");
    }

    public void a() {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        if (this.g) {
            int i2 = (this.f12108a - 1) + (this.i - 1);
            if (this.m == 1) {
                i2 = (this.h - 1) + (this.j - 1);
            }
            float[] fArr = new float[i2 << 2];
            int i3 = this.i - 1;
            if (this.m == 1) {
                i3 = this.h - 1;
            }
            int i4 = 0;
            int i5 = 0;
            while (i4 < i3) {
                int i6 = i5 + 1;
                fArr[i5] = paddingLeft;
                int i7 = i6 + 1;
                int i8 = i4 + 1;
                int i9 = this.k;
                fArr[i6] = (this.c * i8) + (i4 * i9) + (i9 / 2) + paddingTop;
                int i10 = i7 + 1;
                fArr[i7] = getMeasuredWidth() - paddingRight;
                i5 = i10 + 1;
                int i11 = this.k;
                fArr[i10] = (this.c * i8) + (i4 * i11) + (i11 / 2) + paddingTop;
                i4 = i8;
            }
            int i12 = this.f12108a - 1;
            if (this.m == 1) {
                i12 = this.j - 1;
            }
            while (i < i12) {
                int i13 = i5 + 1;
                int i14 = i + 1;
                int i15 = this.d;
                int i16 = this.b;
                fArr[i5] = (i14 * i15) + (i * i16) + (i16 / 2) + paddingLeft;
                int i17 = i13 + 1;
                fArr[i13] = paddingTop;
                int i18 = i17 + 1;
                fArr[i17] = (i15 * i14) + (i * i16) + (i16 / 2) + paddingLeft;
                i5 = i18 + 1;
                fArr[i18] = getMeasuredHeight() - paddingBottom;
                i = i14;
            }
            this.l = fArr;
            int min = Math.min(this.b, this.k);
            if (this.f > min) {
                this.f = min;
            }
            setDisableFlatten(true);
            return;
        }
        this.l = null;
    }

    @Override // com.taobao.android.dinamicx.widget.j, com.taobao.android.dinamicx.widget.m, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetIntAttribute(long j, int i) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3e0d496", new Object[]{this, new Long(j), new Integer(i)});
        } else if (j == 4480460401770252962L) {
            this.f12108a = i;
        } else if (j == DX_GRID_LAYOUT_COLUMN_SPACING) {
            this.b = i;
        } else if (j == -889779179579457774L) {
            this.c = i;
        } else if (j == -5480582194049152328L) {
            this.d = i;
        } else if (j == DX_GRID_LAYOUT_LINE_COLOR) {
            this.e = i;
        } else if (j == DX_GRID_LAYOUT_LINE_WIDTH) {
            this.f = i;
        } else if (j == DX_GRID_LAYOUT_NEED_SEPARATOR) {
            if (i == 0) {
                z = false;
            }
            this.g = z;
        } else if (j == DX_GRID_LAYOUT_ROW_COUNT) {
            this.h = i;
        } else if (j == DX_GRID_LAYOUT_ROW_SPACING) {
            this.k = i;
        } else if (j == -7199229155167727177L) {
            this.m = i;
        } else if (j == DXGRIDLAYOUT_MAXCOLCOUNT) {
            this.n = i;
        } else if (j == DXGRIDLAYOUT_MAXROWCOUNT) {
            this.o = i;
        } else if (j == DXGRIDLAYOUT_MINCOLCOUNT) {
            this.p = i;
        } else if (j == DXGRIDLAYOUT_MINROWCOUNT) {
            this.q = i;
        } else {
            super.onSetIntAttribute(j, i);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public int getDefaultValueForIntAttr(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bc7400f3", new Object[]{this, new Long(j)})).intValue();
        }
        if (j == 4480460401770252962L) {
            return 0;
        }
        if (j == DX_GRID_LAYOUT_LINE_COLOR) {
            return -8421505;
        }
        if (j == DX_GRID_LAYOUT_NEED_SEPARATOR || j == DX_GRID_LAYOUT_ROW_COUNT) {
            return 0;
        }
        if (j != DXGRIDLAYOUT_MAXCOLCOUNT && j != DXGRIDLAYOUT_MAXROWCOUNT && j != DXGRIDLAYOUT_MINCOLCOUNT && j != DXGRIDLAYOUT_MINROWCOUNT) {
            return super.getDefaultValueForIntAttr(j);
        }
        return -1;
    }

    @Override // com.taobao.android.dinamicx.widget.m, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onRenderView(Context context, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede516ab", new Object[]{this, context, view});
            return;
        }
        super.onRenderView(context, view);
        ((DXNativeGridLayout) view).setLines(this.g, this.e, this.f, this.l);
    }

    @Override // com.taobao.android.dinamicx.widget.m, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onBeforeBindChildDataWithButter() {
        DXWidgetNode originNode;
        List<DXWidgetNode> children;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("355dbe58", new Object[]{this});
        } else if (isHandleListData() && (originNode = getOriginNode()) != null && (children = originNode.getChildren()) != null) {
            if (this.recycledPool == null) {
                this.recycledPool = new m.a();
                this.templateSize = originNode.getChildrenCount();
            }
            int childrenCount = getChildrenCount();
            JSONArray listData = getListData();
            if (listData == null || listData.isEmpty()) {
                for (int i = childrenCount - 1; i >= 0; i--) {
                    recycleView(i);
                }
                return;
            }
            int size = listData.size();
            int i2 = this.h * this.f12108a;
            if (i2 > 0) {
                size = Math.min(i2, size);
            }
            int i3 = this.templateSize * size;
            if (childrenCount > i3) {
                for (int i4 = childrenCount - 1; i4 >= i3; i4--) {
                    recycleView(i4);
                }
            }
            for (int i5 = 0; i5 < size; i5++) {
                Object obj = listData.get(i5);
                for (int i6 = 0; i6 < this.templateSize; i6++) {
                    int i7 = (this.templateSize * i5) + i6;
                    bg bgVar = null;
                    if (i7 < getChildrenCount()) {
                        DXWidgetNode childAt = getChildAt(i7);
                        if (getDxv3VariableInfo() != null) {
                            bgVar = getDxv3VariableInfo().b();
                        }
                        if (childAt.getVisibility() == 2) {
                            childAt.setVisibility(0);
                        }
                        bindContextWithButter(childAt, obj, i5, bgVar);
                    } else {
                        DXWidgetNode cacheView = getCacheView(i6);
                        if (cacheView == null) {
                            DXWidgetNode dXWidgetNode = children.get(i6);
                            DXRuntimeContext a2 = dXWidgetNode.getDXRuntimeContext().a(dXWidgetNode);
                            a2.a(obj);
                            a2.b(i5);
                            if (getDxv3VariableInfo() != null) {
                                a2.a(getDxv3VariableInfo().b());
                            }
                            cacheView = dXWidgetNode.shallowButterClone(a2);
                        } else {
                            if (getDxv3VariableInfo() != null) {
                                bgVar = getDxv3VariableInfo().b();
                            }
                            if (cacheView.getVisibility() == 2) {
                                cacheView.setVisibility(0);
                            }
                            bindContextWithButter(cacheView, obj, i5, bgVar);
                        }
                        addChild(cacheView, false);
                    }
                }
            }
        }
    }

    @Override // com.taobao.android.dinamicx.widget.m, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onBeforeBindChildData() {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92a35092", new Object[]{this});
        } else if ((this.propertyInitFlag & 2) != 0) {
            if (bx.o()) {
                d();
                return;
            }
            if (getChildren() != null && this.originItems == null) {
                this.originItems = new ArrayList();
                for (DXWidgetNode dXWidgetNode : getChildren()) {
                    this.originItems.add(dXWidgetNode.deepClone(getDXRuntimeContext()));
                }
            }
            JSONArray listData = getListData();
            if (listData == null || listData.isEmpty() || getChildren() == null) {
                removeAllChild();
                return;
            }
            if (this.originItems != null && getChildrenCount() != this.originItems.size() && !com.taobao.android.dinamicx.model.f.e()) {
                removeAllChild();
                for (DXWidgetNode dXWidgetNode2 : this.originItems) {
                    addChild(dXWidgetNode2.deepClone(getDXRuntimeContext()));
                }
                z = false;
            }
            if (fqi.G()) {
                if (getDXRuntimeContext().G() && z) {
                    removeAllChild();
                    for (DXWidgetNode dXWidgetNode3 : this.originItems) {
                        addChild(dXWidgetNode3.deepClone(getDXRuntimeContext()));
                    }
                }
            } else if (z) {
                removeAllChild();
                for (DXWidgetNode dXWidgetNode4 : this.originItems) {
                    addChild(dXWidgetNode4.deepClone(getDXRuntimeContext()));
                }
            }
            ArrayList arrayList = (ArrayList) getChildren();
            ArrayList arrayList2 = new ArrayList();
            int size = listData.size();
            int i = this.h * this.f12108a;
            if (i > 0) {
                size = Math.min(i, size);
            }
            for (int i2 = 0; i2 < size; i2++) {
                bg bgVar = null;
                if (getDxv3VariableInfo() != null) {
                    bgVar = getDxv3VariableInfo().b();
                }
                Object obj = listData.get(i2);
                if (i2 == 0) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        bindContext((DXWidgetNode) it.next(), obj, i2, bgVar);
                    }
                } else {
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        DXWidgetNode dXWidgetNode5 = (DXWidgetNode) it2.next();
                        DXRuntimeContext a2 = dXWidgetNode5.getDXRuntimeContext().a(dXWidgetNode5);
                        a2.a(obj);
                        a2.b(i2);
                        if (getDxv3VariableInfo() != null) {
                            a2.a(bgVar);
                        }
                        arrayList2.add(n.a(dXWidgetNode5, a2));
                    }
                }
            }
            for (int i3 = 0; i3 < arrayList2.size(); i3++) {
                addChild((DXWidgetNode) arrayList2.get(i3), false);
            }
        }
    }

    private void d() {
        ArrayList<DXWidgetNode> generateWidgetNodeByDataNew;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        JSONArray listData = getListData();
        if (this.listData == null || this.listData.isEmpty() || getOriginNode() == null || getOriginNode().getChildren() == null) {
            removeAllChild();
            return;
        }
        List<DXWidgetNode> children = getOriginNode().getChildren();
        new ArrayList();
        int size = listData.size();
        int i = this.h * this.f12108a;
        if (i > 0) {
            int min = Math.min(i, size);
            if (min != size) {
                JSONArray jSONArray = new JSONArray();
                for (int i2 = 0; i2 < min; i2++) {
                    jSONArray.add(listData.get(i2));
                }
                generateWidgetNodeByDataNew = generateWidgetNodeByDataNew(0, jSONArray, children);
            } else {
                generateWidgetNodeByDataNew = generateWidgetNodeByDataNew(0, listData, children);
            }
        } else {
            generateWidgetNodeByDataNew = generateWidgetNodeByDataNew(0, listData, children);
        }
        if (generateWidgetNodeByDataNew == null) {
            return;
        }
        removeAllChild();
        for (int i3 = 0; i3 < generateWidgetNodeByDataNew.size(); i3++) {
            addChild(generateWidgetNodeByDataNew.get(i3), false);
        }
    }

    private int a(DXWidgetNode dXWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("613bf3ba", new Object[]{this, dXWidgetNode})).intValue();
        }
        if (!(dXWidgetNode instanceof k)) {
            return 1;
        }
        return ((k) dXWidgetNode).a();
    }

    private int b(DXWidgetNode dXWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7b577259", new Object[]{this, dXWidgetNode})).intValue();
        }
        if (!(dXWidgetNode instanceof k)) {
            return 1;
        }
        return ((k) dXWidgetNode).b();
    }

    private int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue();
        }
        int i = 0;
        for (int i2 = 0; i2 < getVirtualChildCount(); i2++) {
            i += a(getVirtualChildAt(i2));
        }
        return i;
    }

    private int c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5889b5d", new Object[]{this})).intValue();
        }
        int i = 0;
        for (int i2 = 0; i2 < getVirtualChildCount(); i2++) {
            i += b(getVirtualChildAt(i2));
        }
        return i;
    }

    @Override // com.taobao.android.dinamicx.widget.j, com.taobao.android.dinamicx.widget.DXWidgetNode
    public boolean supportReuse() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("562c49f0", new Object[]{this})).booleanValue() : getClass() == l.class;
    }
}
