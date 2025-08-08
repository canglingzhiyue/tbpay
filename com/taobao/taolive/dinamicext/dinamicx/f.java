package com.taobao.taolive.dinamicext.dinamicx;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx.widget.ak;
import com.taobao.taolive.uikit.favor.TaoliveFavorComponent;
import tb.fpr;
import tb.gbg;
import tb.kge;
import tb.prq;

/* loaded from: classes8.dex */
public class f extends DXWidgetNode {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DXTBLFAVORVIEW_TBCURRENTLIVESTATE = -5287008133921364644L;
    public static final long DXTBLFAVORVIEW_TBDISABLELEVEL = 8759178021899091344L;
    public static final long DXTBLFAVORVIEW_TBFAVORANIMATIONCOUNT = -8492291471854263150L;
    public static final long DXTBLFAVORVIEW_TBFAVORANIMATIONHEIGHT = -4364506365366730781L;
    public static final long DXTBLFAVORVIEW_TBFAVORANIMATIONINTERVAL = -2920205802351598127L;
    public static final long DXTBLFAVORVIEW_TBFAVORIMG = 6929601810429249275L;
    public static final long DXTBLFAVORVIEW_TBFAVORNUM = 6929601810769863950L;
    public static final long DXTBLFAVORVIEW_TBID = 38174466807L;
    public static final long DXTBLFAVORVIEW_TBLFAVORVIEW = -8385406434993395833L;
    public static final long DXTBLFAVORVIEW_TBVISIBLESTATE = 5637158515563704755L;

    /* renamed from: a  reason: collision with root package name */
    private String f21414a;
    private String b;
    private int c = gbg.b(DinamicXEngine.i(), 8.0f);
    private double d = gbg.b(DinamicXEngine.i(), 200.0f);
    private double e = 3.0d;
    private String f;
    private int g;
    private Object h;
    private String i;

    static {
        kge.a(1821115228);
    }

    public static /* synthetic */ Object ipc$super(f fVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1806543962:
                return new Double(super.getDefaultValueForDoubleAttr(((Number) objArr[0]).longValue()));
            case -1775895211:
                super.onBindEvent((Context) objArr[0], (View) objArr[1], ((Number) objArr[2]).longValue());
                return null;
            case -1133248269:
                return new Integer(super.getDefaultValueForIntAttr(((Number) objArr[0]).longValue()));
            case -740240234:
                super.onSetIntAttribute(((Number) objArr[0]).longValue(), ((Number) objArr[1]).intValue());
                return null;
            case -638169079:
                super.onSetDoubleAttribute(((Number) objArr[0]).longValue(), ((Number) objArr[1]).doubleValue());
                return null;
            case -303753557:
                super.onRenderView((Context) objArr[0], (View) objArr[1]);
                return null;
            case 1115049375:
                super.onSetStringAttribute(((Number) objArr[0]).longValue(), (String) objArr[1]);
                return null;
            case 1694530481:
                super.onSetObjAttribute(((Number) objArr[0]).longValue(), objArr[1]);
                return null;
            case 2119721610:
                super.onClone((DXWidgetNode) objArr[0], ((Boolean) objArr[1]).booleanValue());
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    /* loaded from: classes8.dex */
    public static class a implements ak {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(1125629491);
            kge.a(349752956);
        }

        @Override // com.taobao.android.dinamicx.widget.ak
        public DXWidgetNode build(Object obj) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj}) : new f();
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode, com.taobao.android.dinamicx.widget.ak
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj}) : new f();
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onClone(DXWidgetNode dXWidgetNode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e58628a", new Object[]{this, dXWidgetNode, new Boolean(z)});
        } else if (!(dXWidgetNode instanceof f)) {
        } else {
            super.onClone(dXWidgetNode, z);
            f fVar = (f) dXWidgetNode;
            this.f21414a = fVar.f21414a;
            this.b = fVar.b;
            this.c = fVar.c;
            this.d = fVar.d;
            this.e = fVar.e;
            this.f = fVar.f;
            this.g = fVar.g;
            this.h = fVar.h;
            this.i = fVar.i;
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public View onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context}) : new TaoliveFavorComponent(context);
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onRenderView(Context context, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede516ab", new Object[]{this, context, view});
            return;
        }
        super.onRenderView(context, view);
        if (!(view instanceof TaoliveFavorComponent)) {
            return;
        }
        TaoliveFavorComponent taoliveFavorComponent = (TaoliveFavorComponent) view;
        if (!StringUtils.isEmpty(this.f)) {
            taoliveFavorComponent.setFavorImg(this.f);
        }
        taoliveFavorComponent.setFavorNum(this.g);
        b(taoliveFavorComponent);
        a(taoliveFavorComponent);
        Object obj = this.h;
        if (obj == null) {
            return;
        }
        taoliveFavorComponent.setTag(obj);
    }

    private void a(TaoliveFavorComponent taoliveFavorComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8cae17c", new Object[]{this, taoliveFavorComponent});
        } else if (StringUtils.isEmpty(this.i) || StringUtils.isEmpty(this.f21414a)) {
        } else {
            if (this.i.equals(this.f21414a)) {
                taoliveFavorComponent.setVisibility(0);
            } else {
                taoliveFavorComponent.setVisibility(8);
            }
        }
    }

    private void b(TaoliveFavorComponent taoliveFavorComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("980ae3d", new Object[]{this, taoliveFavorComponent});
        } else if (!StringUtils.isEmpty(this.b)) {
            if ("low".equals(this.b)) {
                taoliveFavorComponent.setMaxDeviceLevel(3);
            } else if ("middle".equals(this.b)) {
                taoliveFavorComponent.setMaxDeviceLevel(2);
            } else if ("high".equals(this.b)) {
                taoliveFavorComponent.setMaxDeviceLevel(1);
            } else {
                taoliveFavorComponent.setMaxDeviceLevel(100);
            }
        } else {
            taoliveFavorComponent.setMaxDeviceLevel(100);
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
            setMeasuredDimension(fpr.a(prq.c(), "52ap", 52), fpr.a(prq.c(), "103ap", 103));
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetObjAttribute(long j, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65007bb1", new Object[]{this, new Long(j), obj});
        } else if (j == 38174466807L) {
            this.h = obj;
        } else {
            super.onSetObjAttribute(j, obj);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetStringAttribute(long j, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42764d9f", new Object[]{this, new Long(j), str});
        } else if (j == -5287008133921364644L) {
            this.f21414a = str;
        } else if (j == DXTBLFAVORVIEW_TBDISABLELEVEL) {
            this.b = str;
        } else if (j == DXTBLFAVORVIEW_TBFAVORIMG) {
            this.f = str;
        } else if (j == 5637158515563704755L) {
            this.i = str;
        } else {
            super.onSetStringAttribute(j, str);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetDoubleAttribute(long j, double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9f65009", new Object[]{this, new Long(j), new Double(d)});
        } else if (j == DXTBLFAVORVIEW_TBFAVORANIMATIONHEIGHT) {
            this.d = d;
        } else if (j == DXTBLFAVORVIEW_TBFAVORANIMATIONINTERVAL) {
            this.e = d;
        } else {
            super.onSetDoubleAttribute(j, d);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetIntAttribute(long j, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3e0d496", new Object[]{this, new Long(j), new Integer(i)});
        } else if (j == DXTBLFAVORVIEW_TBFAVORANIMATIONCOUNT) {
            this.c = i;
        } else if (j == DXTBLFAVORVIEW_TBFAVORNUM) {
            this.g = i;
        } else {
            super.onSetIntAttribute(j, i);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public double getDefaultValueForDoubleAttr(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("945253a6", new Object[]{this, new Long(j)})).doubleValue();
        }
        if (j == DXTBLFAVORVIEW_TBFAVORANIMATIONHEIGHT) {
            return gbg.b(DinamicXEngine.i(), 200.0f);
        }
        if (j != DXTBLFAVORVIEW_TBFAVORANIMATIONINTERVAL) {
            return super.getDefaultValueForDoubleAttr(j);
        }
        return 3.0d;
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public int getDefaultValueForIntAttr(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bc7400f3", new Object[]{this, new Long(j)})).intValue();
        }
        if (j == DXTBLFAVORVIEW_TBFAVORANIMATIONCOUNT) {
            return gbg.b(DinamicXEngine.i(), 8.0f);
        }
        return super.getDefaultValueForIntAttr(j);
    }
}
