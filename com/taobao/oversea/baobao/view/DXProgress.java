package com.taobao.oversea.baobao.view;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.oversea.baobao.BaobaoManager;
import com.taobao.oversea.baobao.d;
import java.util.HashMap;

/* loaded from: classes7.dex */
public class DXProgress extends DXWidgetNode {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DXTMGBAOBAOPROGRESS_AMOUNT = 8838732586388250L;
    public static final long DXTMGBAOBAOPROGRESS_CURRENCY = 1763146857930398067L;
    public static final long DXTMGBAOBAOPROGRESS_FREEPIC = 4842540351073124421L;
    public static final long DXTMGBAOBAOPROGRESS_FREESHIPFORMAT = -974521516353376851L;
    public static final long DXTMGBAOBAOPROGRESS_FULLPIC = 4842978192655567062L;
    public static final long DXTMGBAOBAOPROGRESS_FULLPICGIF = -709999441544334865L;
    public static final long DXTMGBAOBAOPROGRESS_ISGREY = 9423390347262905L;
    public static final long DXTMGBAOBAOPROGRESS_MUCHMOREFORMAT = -1474529656738663497L;
    public static final long DXTMGBAOBAOPROGRESS_PROCESSBASECOLOR = 1348056772455562121L;
    public static final long DXTMGBAOBAOPROGRESS_PROCESSCOLOR = -4240141076472673270L;
    public static final long DXTMGBAOBAOPROGRESS_TARGETURL = 3372745712653098179L;
    public static final long DXTMGBAOBAOPROGRESS_TMGBAOBAOPROGRESS = 6675887151038685842L;
    public static final long DXTMGBAOBAOPROGRESS_TOTALPRICE = 397465271067463969L;
    public static final long DXTMGBAOBAOPROGRESS_TOTALQUANTITY = -8693813827769898864L;
    private static final int ID = 555;

    /* renamed from: a  reason: collision with root package name */
    private double f18638a;
    private String b;
    private String c;
    private String d;
    private String e;
    private String f;
    private String g = "false";
    private String h;
    private String i;
    private String j;
    private String k;
    private double l;
    private int m;

    public static /* synthetic */ Object ipc$super(DXProgress dXProgress, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1775895211:
                super.onBindEvent((Context) objArr[0], (View) objArr[1], ((Number) objArr[2]).longValue());
                return null;
            case -740240234:
                super.onSetIntAttribute(((Number) objArr[0]).longValue(), ((Number) objArr[1]).intValue());
                return null;
            case -638169079:
                super.onSetDoubleAttribute(((Number) objArr[0]).longValue(), ((Number) objArr[1]).doubleValue());
                return null;
            case -303753557:
                super.onRenderView((Context) objArr[0], (View) objArr[1]);
                return null;
            case 253729832:
                return super.getDefaultValueForStringAttr(((Number) objArr[0]).longValue());
            case 650865254:
                super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
                return null;
            case 1115049375:
                super.onSetStringAttribute(((Number) objArr[0]).longValue(), (String) objArr[1]);
                return null;
            case 2119721610:
                super.onClone((DXWidgetNode) objArr[0], ((Boolean) objArr[1]).booleanValue());
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode, com.taobao.android.dinamicx.widget.ak
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj}) : new DXProgress();
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onClone(DXWidgetNode dXWidgetNode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e58628a", new Object[]{this, dXWidgetNode, new Boolean(z)});
        } else if (dXWidgetNode == null || !(dXWidgetNode instanceof DXProgress)) {
        } else {
            super.onClone(dXWidgetNode, z);
            DXProgress dXProgress = (DXProgress) dXWidgetNode;
            this.f18638a = dXProgress.f18638a;
            this.b = dXProgress.b;
            this.c = dXProgress.c;
            this.d = dXProgress.d;
            this.e = dXProgress.e;
            this.f = dXProgress.f;
            this.g = dXProgress.g;
            this.h = dXProgress.h;
            this.i = dXProgress.i;
            this.j = dXProgress.j;
            this.k = dXProgress.k;
            this.l = dXProgress.l;
            this.m = dXProgress.m;
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public View onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context});
        }
        FrameLayout frameLayout = new FrameLayout(context);
        BaobaoProgress build = BaobaoProgress.build(context);
        d.a().a(DXProgress.class.getName(), build);
        build.setId(ID);
        frameLayout.addView(build, 0, new FrameLayout.LayoutParams(-1, -1));
        return frameLayout;
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onRenderView(Context context, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede516ab", new Object[]{this, context, view});
            return;
        }
        super.onRenderView(context, view);
        if (!(view instanceof FrameLayout)) {
            return;
        }
        BaobaoProgress baobaoProgress = (BaobaoProgress) view.findViewById(ID);
        baobaoProgress.initView(context);
        HashMap hashMap = new HashMap();
        HashMap<String, Object> i = BaobaoManager.a().i();
        hashMap.put("totalQuantity", String.valueOf(i.get("totalQuantity")));
        hashMap.put("totalPrice", String.valueOf(i.get("totalPrice")));
        hashMap.put("amount", String.valueOf(this.f18638a));
        hashMap.put("freePic", String.valueOf(this.c));
        hashMap.put("processBaseColor", String.valueOf(this.i));
        hashMap.put("processColor", String.valueOf(this.j));
        hashMap.put("targetUrl", String.valueOf(this.k));
        hashMap.put("currency", String.valueOf(this.b));
        hashMap.put("freeShipFormat", String.valueOf(this.d));
        hashMap.put("muchMoreFormat", String.valueOf(this.h));
        hashMap.put("fullPic", String.valueOf(this.e));
        hashMap.put("fullPicGif", String.valueOf(this.f));
        hashMap.put("isGrey", this.g);
        baobaoProgress.init(hashMap);
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
            super.onMeasure(i, i2);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetStringAttribute(long j, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42764d9f", new Object[]{this, new Long(j), str});
        } else if (j == DXTMGBAOBAOPROGRESS_CURRENCY) {
            this.b = str;
        } else if (j == DXTMGBAOBAOPROGRESS_FREEPIC) {
            this.c = str;
        } else if (j == DXTMGBAOBAOPROGRESS_FREESHIPFORMAT) {
            this.d = str;
        } else if (j == DXTMGBAOBAOPROGRESS_FULLPIC) {
            this.e = str;
        } else if (j == DXTMGBAOBAOPROGRESS_FULLPICGIF) {
            this.f = str;
        } else if (j == DXTMGBAOBAOPROGRESS_ISGREY) {
            this.g = str;
        } else if (j == DXTMGBAOBAOPROGRESS_MUCHMOREFORMAT) {
            this.h = str;
        } else if (j == DXTMGBAOBAOPROGRESS_PROCESSBASECOLOR) {
            this.i = str;
        } else if (j == DXTMGBAOBAOPROGRESS_PROCESSCOLOR) {
            this.j = str;
        } else if (j == DXTMGBAOBAOPROGRESS_TARGETURL) {
            this.k = str;
        } else {
            super.onSetStringAttribute(j, str);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetDoubleAttribute(long j, double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9f65009", new Object[]{this, new Long(j), new Double(d)});
        } else if (j == DXTMGBAOBAOPROGRESS_AMOUNT) {
            this.f18638a = d;
        } else if (j == DXTMGBAOBAOPROGRESS_TOTALPRICE) {
            this.l = d;
        } else {
            super.onSetDoubleAttribute(j, d);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetIntAttribute(long j, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3e0d496", new Object[]{this, new Long(j), new Integer(i)});
        } else if (j == DXTMGBAOBAOPROGRESS_TOTALQUANTITY) {
            this.m = i;
        } else {
            super.onSetIntAttribute(j, i);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public String getDefaultValueForStringAttr(long j) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f1f9c28", new Object[]{this, new Long(j)}) : j == DXTMGBAOBAOPROGRESS_ISGREY ? "false" : super.getDefaultValueForStringAttr(j);
    }
}
