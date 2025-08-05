package com.taobao.android.dinamicx.widget;

import android.content.Context;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.expression.event.DXPageChangeEvent;
import com.taobao.android.dinamicx.view.DXNativeBouncePageIndicator;
import com.taobao.android.dinamicx.view.DXNativePageIndicator;
import com.taobao.android.dinamicx.view.DXNativeProgressIndicator;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import tb.gbg;
import tb.kge;

/* loaded from: classes5.dex */
public class u extends DXWidgetNode {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int DEFAULT_OFF_COLOR = 14606046;
    public static final int DEFAULT_ON_COLOR = 16742144;
    public static final long DXPAGEINDICATOR_DISPLAYTYPE = 8838583655093142947L;
    public static final int DXPAGEINDICATOR_DISPLAYTYPE_CIRCLE = 0;
    public static final int DXPAGEINDICATOR_DISPLAYTYPE_LINE = 1;
    public static final int DXPAGEINDICATOR_DISPLAYTYPE_PROGRESS = 2;
    public static final long DXPAGEINDICATOR_ITEMMARGIN = -884050990290307049L;
    public static final long DXPAGEINDICATOR_ITEMROUNDDIAMETER = -8559743205145630989L;
    public static final long DXPAGEINDICATOR_ITEMSELECTEDBORDERCOLOR = 956057309702335052L;
    public static final long DXPAGEINDICATOR_ITEMSELECTEDBORDERWIDTH = 1687099697943502157L;
    public static final long DXPAGEINDICATOR_ITEMUNSELECTEDBORDERCOLOR = -2071489811568019695L;
    public static final long DXPAGEINDICATOR_ITEMUNSELECTEDBORDERWIDTH = 852679479955548690L;
    public static final long DXPAGEINDICATOR_MAXDISPLAYCOUNT = -3284462966979738828L;
    public static final long DX_PAGE_INDICATOR = -4649639459667590873L;
    public static final long DX_PAGE_INDICATOR_HIDES_FOR_SINGLE_PAGE = 5486881853309576485L;
    public static final long DX_PAGE_INDICATOR_OFF_COLOR = 5279668588453924930L;
    public static final long DX_PAGE_INDICATOR_ON_COLOR = 5176469557014791523L;
    public static final long DX_PAGE_INDICATOR_PAGE_COUNT = 7816476278377541039L;
    private int d;
    private int e;
    private boolean f;
    private int i;
    private int k;
    private int l;
    private int m;
    private int n;

    /* renamed from: a  reason: collision with root package name */
    private int f12184a = 0;
    private int b = DEFAULT_ON_COLOR;
    private int c = DEFAULT_OFF_COLOR;
    private int j = 3000;
    private int g = gbg.a(DinamicXEngine.i(), "8ap", 16);
    private int h = gbg.a(DinamicXEngine.i(), "3ap", 9);

    static {
        kge.a(-757938732);
    }

    public static /* synthetic */ Object ipc$super(u uVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1133248269:
                return new Integer(super.getDefaultValueForIntAttr(((Number) objArr[0]).longValue()));
            case -740240234:
                super.onSetIntAttribute(((Number) objArr[0]).longValue(), ((Number) objArr[1]).intValue());
                return null;
            case -303753557:
                super.onRenderView((Context) objArr[0], (View) objArr[1]);
                return null;
            case 1327675976:
                return new Boolean(super.onEvent((DXEvent) objArr[0]));
            case 2119721610:
                super.onClone((DXWidgetNode) objArr[0], ((Boolean) objArr[1]).booleanValue());
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    /* loaded from: classes.dex */
    public static class a implements ak {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(1603307691);
            kge.a(349752956);
        }

        @Override // com.taobao.android.dinamicx.widget.ak
        public DXWidgetNode build(Object obj) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj}) : new u();
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode, com.taobao.android.dinamicx.widget.ak
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj}) : new u();
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public View onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context});
        }
        if (!a() && getDefaultValueForIntAttr(DXPAGEINDICATOR_MAXDISPLAYCOUNT) == 1 && this.i != 0) {
            return new DXNativeBouncePageIndicator(context);
        }
        if (this.f12184a == 2) {
            return new DXNativeProgressIndicator(context);
        }
        return new DXNativePageIndicator(context);
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onClone(DXWidgetNode dXWidgetNode, boolean z) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e58628a", new Object[]{this, dXWidgetNode, new Boolean(z)});
            return;
        }
        super.onClone(dXWidgetNode, z);
        if (!(dXWidgetNode instanceof u)) {
            return;
        }
        u uVar = (u) dXWidgetNode;
        this.f12184a = uVar.f12184a;
        this.f = uVar.f;
        this.e = uVar.e;
        this.d = uVar.d;
        this.c = uVar.c;
        this.b = uVar.b;
        this.h = uVar.h;
        this.g = uVar.g;
        this.k = uVar.k;
        this.l = uVar.l;
        this.m = uVar.m;
        this.n = uVar.n;
        this.j = uVar.j;
        if (getDefaultValueForIntAttr(DXPAGEINDICATOR_MAXDISPLAYCOUNT) != 1 || (i = uVar.i) == 0) {
            return;
        }
        this.i = i;
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else {
            this.j = i;
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onRenderView(Context context, View view) {
        int i;
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede516ab", new Object[]{this, context, view});
            return;
        }
        super.onRenderView(context, view);
        u uVar = (u) getDXRuntimeContext().d();
        if (!a() && getDefaultValueForIntAttr(DXPAGEINDICATOR_MAXDISPLAYCOUNT) == 1 && this.i != 0) {
            DXNativeBouncePageIndicator dXNativeBouncePageIndicator = (DXNativeBouncePageIndicator) view;
            dXNativeBouncePageIndicator.setItemRoundDiameter(uVar.g);
            dXNativeBouncePageIndicator.setItemMargin(uVar.h);
            dXNativeBouncePageIndicator.setItemSelectedBorderWidth(uVar.l);
            dXNativeBouncePageIndicator.setItemSelectedBorderColor(uVar.k);
            dXNativeBouncePageIndicator.setItemUnSelectedBorderWidth(uVar.n);
            dXNativeBouncePageIndicator.setItemUnSelectedBorderColor(uVar.m);
            int tryFetchDarkModeColor = tryFetchDarkModeColor("onColor", 1, uVar.b);
            int tryFetchDarkModeColor2 = tryFetchDarkModeColor("offColor", 1, uVar.c);
            dXNativeBouncePageIndicator.setSelectedDrawable(tryFetchDarkModeColor);
            dXNativeBouncePageIndicator.setUnselectedDrawable(tryFetchDarkModeColor2);
            dXNativeBouncePageIndicator.setMaxDisplayCount(uVar.i);
            if ((uVar.f && uVar.e == 1) || (i2 = uVar.e) <= 0) {
                dXNativeBouncePageIndicator.addChildViews(0, 0);
                return;
            }
            this.d = uVar.d;
            dXNativeBouncePageIndicator.addChildViews(i2, uVar.d);
        } else if (view instanceof DXNativeProgressIndicator) {
            this.d = uVar.d;
            DXNativeProgressIndicator dXNativeProgressIndicator = (DXNativeProgressIndicator) view;
            dXNativeProgressIndicator.setSectionDuration(this.j);
            dXNativeProgressIndicator.setSectionCount(uVar.e);
            int tryFetchDarkModeColor3 = tryFetchDarkModeColor("onColor", 1, uVar.b);
            int tryFetchDarkModeColor4 = tryFetchDarkModeColor("offColor", 1, uVar.c);
            dXNativeProgressIndicator.setIndicatorColor(tryFetchDarkModeColor3);
            dXNativeProgressIndicator.setItemMargin(this.h);
            dXNativeProgressIndicator.setBackgroundColor(tryFetchDarkModeColor4);
            dXNativeProgressIndicator.prepare();
            dXNativeProgressIndicator.initIndex(this.d);
        } else {
            DXNativePageIndicator dXNativePageIndicator = (DXNativePageIndicator) view;
            dXNativePageIndicator.setItemRoundDiameter(uVar.g);
            dXNativePageIndicator.setItemMargin(uVar.h);
            dXNativePageIndicator.setItemSelectedBorderWidth(uVar.l);
            dXNativePageIndicator.setItemSelectedBorderColor(uVar.k);
            dXNativePageIndicator.setItemUnSelectedBorderWidth(uVar.n);
            dXNativePageIndicator.setItemUnSelectedBorderColor(uVar.m);
            dXNativePageIndicator.setLineDisplayType(a());
            dXNativePageIndicator.setItemLineDisplayTypeSize(uVar.e, uVar.getMeasuredWidth(), uVar.getMeasuredHeight());
            int tryFetchDarkModeColor5 = tryFetchDarkModeColor("onColor", 1, uVar.b);
            int tryFetchDarkModeColor6 = tryFetchDarkModeColor("offColor", 1, uVar.c);
            dXNativePageIndicator.setSelectedDrawable(tryFetchDarkModeColor5);
            dXNativePageIndicator.setUnselectedDrawable(tryFetchDarkModeColor6);
            if ((uVar.f && uVar.e == 1) || (i = uVar.e) <= 0) {
                dXNativePageIndicator.addChildViews(0, 0);
                return;
            }
            this.d = uVar.d;
            dXNativePageIndicator.addChildViews(i, uVar.d);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onMeasure(int i, int i2) {
        int b;
        int i3;
        int i4;
        int i5;
        IpChange ipChange = $ipChange;
        int i6 = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        int a2 = DXWidgetNode.DXMeasureSpec.a(i);
        int a3 = DXWidgetNode.DXMeasureSpec.a(i2);
        boolean z = a2 != 1073741824;
        boolean z2 = a3 != 1073741824;
        if (z || z2) {
            if (a()) {
                b = 0;
            } else {
                if (z) {
                    if (getDefaultValueForIntAttr(DXPAGEINDICATOR_MAXDISPLAYCOUNT) == 1 && (i5 = this.i) != 0) {
                        i3 = Math.min(i5, this.e);
                    } else {
                        i3 = this.e;
                    }
                    if (i3 > 0) {
                        i4 = 0;
                        while (i6 < i3) {
                            i4 += this.g;
                            if (i6 != i3 - 1) {
                                i4 += this.h;
                            }
                            i6++;
                        }
                    } else {
                        i4 = 0;
                    }
                    i6 = i4;
                } else {
                    i6 = DXWidgetNode.DXMeasureSpec.b(i);
                }
                if (z2) {
                    b = this.g;
                } else {
                    b = DXWidgetNode.DXMeasureSpec.b(i2);
                }
            }
        } else {
            i6 = DXWidgetNode.DXMeasureSpec.b(i);
            b = DXWidgetNode.DXMeasureSpec.b(i2);
        }
        setMeasuredDimension(resolveSize(i6, i), resolveSize(b, i2));
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public boolean onEvent(DXEvent dXEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4f22ba48", new Object[]{this, dXEvent})).booleanValue();
        }
        if (super.onEvent(dXEvent)) {
            return true;
        }
        if (dXEvent.getEventId() != DXSliderLayout.DX_SLIDER_LAYOUT_ON_PAGE_CHANGE) {
            return false;
        }
        if (this.e <= 0) {
            return true;
        }
        DXPageChangeEvent dXPageChangeEvent = (DXPageChangeEvent) dXEvent;
        if (getDefaultValueForIntAttr(DXPAGEINDICATOR_MAXDISPLAYCOUNT) == 1 && this.i != 0) {
            DXNativeBouncePageIndicator dXNativeBouncePageIndicator = (DXNativeBouncePageIndicator) getDXRuntimeContext().v();
            if (dXNativeBouncePageIndicator != null) {
                dXNativeBouncePageIndicator.setSelectedView(dXPageChangeEvent.pageIndex);
            }
        } else if (getDXRuntimeContext().v() instanceof DXNativeProgressIndicator) {
            DXNativeProgressIndicator dXNativeProgressIndicator = (DXNativeProgressIndicator) getDXRuntimeContext().v();
            if (dXPageChangeEvent.isTouched) {
                dXNativeProgressIndicator.setIndex(dXPageChangeEvent.pageIndex + 1);
            } else {
                dXNativeProgressIndicator.setIndexWithAnimation(dXPageChangeEvent.pageIndex);
            }
        } else {
            DXNativePageIndicator dXNativePageIndicator = (DXNativePageIndicator) getDXRuntimeContext().v();
            if (dXNativePageIndicator != null) {
                dXNativePageIndicator.setSelectedView(dXPageChangeEvent.pageIndex);
            }
        }
        this.d = dXPageChangeEvent.pageIndex;
        return true;
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public int getDefaultValueForIntAttr(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bc7400f3", new Object[]{this, new Long(j)})).intValue();
        }
        if (j == DXPAGEINDICATOR_DISPLAYTYPE) {
            return 0;
        }
        if (j == DX_PAGE_INDICATOR_ON_COLOR) {
            return DEFAULT_ON_COLOR;
        }
        if (j == DX_PAGE_INDICATOR_OFF_COLOR) {
            return DEFAULT_OFF_COLOR;
        }
        if (j == DXPAGEINDICATOR_ITEMUNSELECTEDBORDERWIDTH || DXPAGEINDICATOR_ITEMSELECTEDBORDERCOLOR == j || DXPAGEINDICATOR_ITEMSELECTEDBORDERWIDTH == j || DXPAGEINDICATOR_ITEMUNSELECTEDBORDERCOLOR == j) {
            return 0;
        }
        if (j == DXPAGEINDICATOR_ITEMMARGIN) {
            return gbg.a(getEngine(), DinamicXEngine.i(), "3ap", 9);
        }
        if (j == DXPAGEINDICATOR_ITEMROUNDDIAMETER) {
            return gbg.a(getEngine(), DinamicXEngine.i(), "8ap", 16);
        }
        if (j != DXPAGEINDICATOR_MAXDISPLAYCOUNT) {
            return super.getDefaultValueForIntAttr(j);
        }
        return 1;
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetIntAttribute(long j, int i) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3e0d496", new Object[]{this, new Long(j), new Integer(i)});
        } else if (j == DXPAGEINDICATOR_DISPLAYTYPE) {
            this.f12184a = i;
        } else if (j == DX_PAGE_INDICATOR_ON_COLOR) {
            this.b = i;
        } else if (j == DX_PAGE_INDICATOR_OFF_COLOR) {
            this.c = i;
        } else if (j == DX_PAGE_INDICATOR_PAGE_COUNT) {
            this.e = i;
        } else if (j == DX_PAGE_INDICATOR_HIDES_FOR_SINGLE_PAGE) {
            if (i == 0) {
                z = false;
            }
            this.f = z;
        } else if (j == DXPAGEINDICATOR_ITEMMARGIN) {
            this.h = i;
        } else if (j == DXPAGEINDICATOR_ITEMROUNDDIAMETER) {
            this.g = i;
        } else if (j == DXPAGEINDICATOR_ITEMSELECTEDBORDERCOLOR) {
            this.k = i;
        } else if (j == DXPAGEINDICATOR_ITEMSELECTEDBORDERWIDTH) {
            this.l = i;
        } else if (j == DXPAGEINDICATOR_ITEMUNSELECTEDBORDERCOLOR) {
            this.m = i;
        } else if (j == DXPAGEINDICATOR_ITEMUNSELECTEDBORDERWIDTH) {
            this.n = i;
        } else if (j == DXPAGEINDICATOR_MAXDISPLAYCOUNT) {
            this.i = i;
        } else {
            super.onSetIntAttribute(j, i);
        }
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : this.f12184a == 1;
    }
}
