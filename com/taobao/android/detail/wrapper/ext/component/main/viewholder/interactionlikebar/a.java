package com.taobao.android.detail.wrapper.ext.component.main.viewholder.interactionlikebar;

import android.content.Context;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.utils.i;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx.widget.ak;
import tb.emu;
import tb.fpn;
import tb.kge;

/* loaded from: classes5.dex */
public class a extends DXWidgetNode {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DXXKAPVIEW = -1524480722280775209L;
    public static final long DXXKAPVIEW_highlightTextColor = -5755705385332798354L;
    public static final long DXXKAPVIEW_highlightmenuColor = -2074606439113941634L;
    public static final long DXXKAPVIEW_normalMenuColor = 2345577713074754348L;
    public static final long DXXKAPVIEW_normalTextColor = 1291960931130884668L;
    public static final long DXXKAPVIEW_xkapCellsData = -8273143578920899026L;

    /* renamed from: a  reason: collision with root package name */
    public JSONObject f11269a;
    private int b = -6710887;
    private int c = -45056;
    private int d = KAPContainerView.DEFAULT_MENU_COLOR;
    private int e = -45056;
    private KAPContainerView f;
    private KAPContainerView g;

    static {
        kge.a(612027651);
    }

    public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1456812170:
                super.onSetMapAttribute(((Number) objArr[0]).longValue(), (JSONObject) objArr[1]);
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

    public a() {
        if (this.f == null) {
            this.f = new KAPContainerView(DinamicXEngine.i());
        }
        emu.a("com.taobao.android.detail.wrapper.ext.component.main.viewholder.interactionlikebar.KAPContainerWidgetNode");
    }

    public a(Context context) {
        if (this.f == null) {
            this.f = new KAPContainerView(DinamicXEngine.i());
        }
        emu.a("com.taobao.android.detail.wrapper.ext.component.main.viewholder.interactionlikebar.KAPContainerWidgetNode");
    }

    /* renamed from: com.taobao.android.detail.wrapper.ext.component.main.viewholder.interactionlikebar.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static class C0439a implements ak {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-1596854054);
            kge.a(349752956);
        }

        @Override // com.taobao.android.dinamicx.widget.ak
        public DXWidgetNode build(Object obj) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj}) : new a();
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode, com.taobao.android.dinamicx.widget.ak
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj}) : new a();
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public View onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context});
        }
        this.g = new KAPContainerView(context);
        return this.g;
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onRenderView(Context context, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede516ab", new Object[]{this, context, view});
            return;
        }
        super.onRenderView(context, view);
        if (view == null || !(view instanceof KAPContainerView)) {
            return;
        }
        a((KAPContainerView) view);
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onClone(DXWidgetNode dXWidgetNode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e58628a", new Object[]{this, dXWidgetNode, new Boolean(z)});
            return;
        }
        super.onClone(dXWidgetNode, z);
        if (!(dXWidgetNode instanceof a)) {
            return;
        }
        a aVar = (a) dXWidgetNode;
        this.b = aVar.b;
        this.c = aVar.c;
        this.d = aVar.d;
        this.e = aVar.e;
        if (z) {
            JSONObject jSONObject = aVar.f11269a;
            if (jSONObject == null) {
                return;
            }
            this.f11269a = (JSONObject) jSONObject.clone();
            return;
        }
        this.f11269a = aVar.f11269a;
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        a(this.f);
        this.f.measure(i, i2);
        setMeasuredDimension(this.f.getMeasuredWidthAndState(), this.f.getMeasuredHeightAndState());
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetIntAttribute(long j, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3e0d496", new Object[]{this, new Long(j), new Integer(i)});
            return;
        }
        super.onSetIntAttribute(j, i);
        if (-5755705385332798354L == j) {
            this.c = i;
        }
        if (1291960931130884668L == j) {
            this.b = i;
        }
        if (DXXKAPVIEW_normalMenuColor == j) {
            this.d = i;
        }
        if (DXXKAPVIEW_highlightmenuColor != j) {
            return;
        }
        this.e = i;
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetDoubleAttribute(long j, double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9f65009", new Object[]{this, new Long(j), new Double(d)});
        } else {
            super.onSetDoubleAttribute(j, d);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetMapAttribute(long j, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a92acf76", new Object[]{this, new Long(j), jSONObject});
            return;
        }
        super.onSetMapAttribute(j, jSONObject);
        if (DXXKAPVIEW_xkapCellsData != j) {
            return;
        }
        this.f11269a = jSONObject;
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetStringAttribute(long j, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42764d9f", new Object[]{this, new Long(j), str});
            return;
        }
        super.onSetStringAttribute(j, str);
        if (-5755705385332798354L == j) {
            try {
                this.c = fpn.a(str, -45056);
            } catch (Exception e) {
                i.a("KAP", "设置String类型属性错误", e);
                return;
            }
        }
        if (1291960931130884668L == j) {
            this.b = fpn.a(str, -6710887);
        }
        if (DXXKAPVIEW_normalMenuColor == j) {
            this.d = fpn.a(str, (int) KAPContainerView.DEFAULT_MENU_COLOR);
        }
        if (DXXKAPVIEW_highlightmenuColor != j) {
            return;
        }
        this.e = fpn.a(str, -45056);
    }

    private void a(KAPContainerView kAPContainerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e858197", new Object[]{this, kAPContainerView});
        } else if (kAPContainerView == null) {
        } else {
            kAPContainerView.setHighlightMenuColor(this.e);
            kAPContainerView.setNormalMenuColor(this.d);
            kAPContainerView.setHighlightTextColor(this.c);
            kAPContainerView.setNormalTextColor(this.b);
            kAPContainerView.bindData(this.f11269a);
        }
    }
}
