package com.taobao.android.dinamicx.widget;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.widget.ImageView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.widget.DXImageWidgetNode;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import java.util.HashMap;
import tb.fux;
import tb.kge;
import tb.mto;

/* loaded from: classes.dex */
public class e extends DXWidgetNode {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DXANIMATEDVIEW_MAXLOOPCOUNT = 1982976705946089973L;
    public static final long DXANIMATEDVIEW_ONLOOPED = 5288720132388024904L;
    public static final long DX_WIDGET_ANIMATEDVIEW = -2149351516928899638L;
    private String b;
    private int c;

    /* renamed from: a  reason: collision with root package name */
    private double f12094a = 1.0d;
    private int d = -1;

    static {
        kge.a(1176506458);
    }

    public static /* synthetic */ Object ipc$super(e eVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1806543962:
                return new Double(super.getDefaultValueForDoubleAttr(((Number) objArr[0]).longValue()));
            case -740240234:
                super.onSetIntAttribute(((Number) objArr[0]).longValue(), ((Number) objArr[1]).intValue());
                return null;
            case -638169079:
                super.onSetDoubleAttribute(((Number) objArr[0]).longValue(), ((Number) objArr[1]).doubleValue());
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

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
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
            kge.a(-1715081935);
            kge.a(349752956);
        }

        @Override // com.taobao.android.dinamicx.widget.ak
        public DXWidgetNode build(Object obj) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj}) : new e();
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode, com.taobao.android.dinamicx.widget.ak
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj}) : new e();
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onClone(DXWidgetNode dXWidgetNode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e58628a", new Object[]{this, dXWidgetNode, new Boolean(z)});
            return;
        }
        super.onClone(dXWidgetNode, z);
        if (!(dXWidgetNode instanceof e)) {
            return;
        }
        e eVar = (e) dXWidgetNode;
        this.f12094a = eVar.f12094a;
        this.b = eVar.b;
        this.c = eVar.c;
        this.d = eVar.d;
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public View onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context});
        }
        an a2 = com.taobao.android.dinamicx.u.a(getDXRuntimeContext());
        if (a2 == null) {
            return new ImageView(context);
        }
        return a2.a(context);
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onMeasure(int i, int i2) {
        int i3;
        int max;
        int i4;
        IpChange ipChange = $ipChange;
        boolean z = true;
        int i5 = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        int a2 = DXWidgetNode.DXMeasureSpec.a(i);
        int a3 = DXWidgetNode.DXMeasureSpec.a(i2);
        boolean z2 = a2 != 1073741824;
        if (a3 == 1073741824) {
            z = false;
        }
        if (z2 || z) {
            double d = this.f12094a;
            if (d <= mto.a.GEO_NOT_SUPPORT) {
                if (DinamicXEngine.j()) {
                    new IllegalArgumentException("非定高顶宽场景下需要设置aspectRatio");
                }
                fux.b("DXAnimatedViewWidgetNode" + com.taobao.android.dinamicx.exception.a.a(new IllegalArgumentException("aspectRatio 非定高顶宽场景下需要设置aspectRatio")));
            }
            if (!z2 || z) {
                if (!z2 && z) {
                    int size = View.MeasureSpec.getSize(i);
                    if (d > mto.a.GEO_NOT_SUPPORT) {
                        i5 = size;
                        i3 = (int) (size / d);
                    } else {
                        i5 = size;
                    }
                }
                i3 = 0;
            } else {
                i3 = View.MeasureSpec.getSize(i2);
                if (d > mto.a.GEO_NOT_SUPPORT) {
                    i5 = (int) (i3 * d);
                }
            }
            int max2 = Math.max(i5, getSuggestedMinimumWidth());
            max = Math.max(i3, getSuggestedMinimumHeight());
            i4 = max2;
        } else {
            i4 = DXWidgetNode.DXMeasureSpec.b(i);
            max = DXWidgetNode.DXMeasureSpec.b(i2);
        }
        setMeasuredDimension(resolveSize(i4, i), resolveSize(max, i2));
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onRenderView(Context context, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede516ab", new Object[]{this, context, view});
            return;
        }
        ImageView imageView = (ImageView) view;
        DXImageWidgetNode.d dVar = new DXImageWidgetNode.d();
        dVar.l = true;
        dVar.m = true;
        dVar.n = this.d;
        if (getEventHandlersExprNode() != null && getEventHandlersExprNode().get(DXANIMATEDVIEW_ONLOOPED) != null) {
            dVar.a(new DXImageWidgetNode.a() { // from class: com.taobao.android.dinamicx.widget.e.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.dinamicx.widget.DXImageWidgetNode.a
                public void a(int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
                    } else if (i <= 0) {
                    } else {
                        DXEvent dXEvent = new DXEvent(e.DXANIMATEDVIEW_ONLOOPED);
                        HashMap hashMap = new HashMap();
                        hashMap.put("loopedCount", com.taobao.android.dinamicx.expression.expr_v2.f.a(i));
                        dXEvent.setArgs(hashMap);
                        e.this.postEvent(dXEvent);
                    }
                }
            });
        } else if (isV4Node() && getDxv4Properties().a() != null && getDxv4Properties().a().get(DXANIMATEDVIEW_ONLOOPED) != null) {
            dVar.a(new DXImageWidgetNode.a() { // from class: com.taobao.android.dinamicx.widget.e.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.dinamicx.widget.DXImageWidgetNode.a
                public void a(int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
                    } else if (i <= 0) {
                    } else {
                        DXEvent dXEvent = new DXEvent(e.DXANIMATEDVIEW_ONLOOPED);
                        HashMap hashMap = new HashMap();
                        hashMap.put("loopedCount", com.taobao.android.dinamicx.expression.expr_v2.f.a(i));
                        dXEvent.setArgs(hashMap);
                        e.this.postEvent(dXEvent);
                    }
                }
            });
        } else {
            dVar.a((DXImageWidgetNode.a) null);
        }
        a(imageView, this.c);
        if (StringUtils.isEmpty(this.b)) {
            imageView.setImageDrawable(null);
        }
        an a2 = com.taobao.android.dinamicx.u.a(getDXRuntimeContext());
        if (a2 == null) {
            return;
        }
        a2.a(imageView, this.b, dVar);
    }

    public void a(ImageView imageView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb017121", new Object[]{this, imageView, new Integer(i)});
        } else if (i == 1) {
            imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        } else if (i == 2) {
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        } else {
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetStringAttribute(long j, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42764d9f", new Object[]{this, new Long(j), str});
        } else if (j == 9274838684923695L) {
            this.b = str;
        } else {
            super.onSetStringAttribute(j, str);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetDoubleAttribute(long j, double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9f65009", new Object[]{this, new Long(j), new Double(d)});
        } else if (j == 7594222789952419722L) {
            this.f12094a = d;
        } else {
            super.onSetDoubleAttribute(j, d);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetIntAttribute(long j, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3e0d496", new Object[]{this, new Long(j), new Integer(i)});
            return;
        }
        if (j == 1015096712691932083L) {
            this.c = i;
        }
        if (j == DXANIMATEDVIEW_MAXLOOPCOUNT) {
            this.d = i;
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
        if (j != 7594222789952419722L) {
            return super.getDefaultValueForDoubleAttr(j);
        }
        return 1.0d;
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public boolean supportReuse() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("562c49f0", new Object[]{this})).booleanValue() : getClass() == e.class;
    }
}
