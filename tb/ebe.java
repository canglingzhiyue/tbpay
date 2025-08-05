package tb;

import android.content.Context;
import android.view.View;
import com.alibaba.fastjson.JSONArray;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.kit.view.holder.main.dinamic3.view.XCommentTagViewV3;
import com.taobao.android.detail.core.utils.i;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx.widget.ak;

/* loaded from: classes4.dex */
public class ebe extends DXWidgetNode {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DXXWAPTAGVIEW_highlightTagColor = 466344286902537956L;
    public static final long DXXWAPTAGVIEW_highlightTextColor = -5755705385332798354L;
    public static final long DXXWAPTAGVIEW_normalTagColor = -8622769215101912654L;
    public static final long DXXWAPTAGVIEW_normalTextColor = 1291960931130884668L;
    public static final long DXXWAPTAGVIEW_xlineNume = 7936880370079461464L;
    public static final long DXXWAPTAGVIEW_xtagsData = -8413353630333490262L;

    /* renamed from: a  reason: collision with root package name */
    public static long f27161a;
    public JSONArray b = null;
    public int c = 1;
    public int d = 0;
    public int e = 0;
    public int f = 0;
    public int g = 0;
    private XCommentTagViewV3 h;
    private XCommentTagViewV3 i;

    public static /* synthetic */ Object ipc$super(ebe ebeVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -879570230:
                super.onSetListAttribute(((Number) objArr[0]).longValue(), (JSONArray) objArr[1]);
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
            case 1184746505:
                return super.getDefaultValueForAttr(((Number) objArr[0]).longValue());
            case 2119721610:
                super.onClone((DXWidgetNode) objArr[0], ((Boolean) objArr[1]).booleanValue());
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    static {
        kge.a(1885652947);
        f27161a = -5902464699005952527L;
    }

    public ebe() {
        if (this.h == null) {
            this.h = new XCommentTagViewV3(DinamicXEngine.i());
        }
        emu.a("com.taobao.android.detail.core.detail.kit.view.holder.main.dinamic3.widget.XCommentTagViewWidgetNode");
    }

    public ebe(Context context) {
        if (this.h == null) {
            this.h = new XCommentTagViewV3(DinamicXEngine.i());
        }
        emu.a("com.taobao.android.detail.core.detail.kit.view.holder.main.dinamic3.widget.XCommentTagViewWidgetNode");
    }

    /* loaded from: classes4.dex */
    public static class a implements ak {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(1069292458);
            kge.a(349752956);
        }

        @Override // com.taobao.android.dinamicx.widget.ak
        public DXWidgetNode build(Object obj) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj}) : new ebe();
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode, com.taobao.android.dinamicx.widget.ak
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj}) : new ebe();
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public View onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context});
        }
        this.i = new XCommentTagViewV3(context);
        return this.i;
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onRenderView(Context context, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede516ab", new Object[]{this, context, view});
            return;
        }
        super.onRenderView(context, view);
        if (view == null || !(view instanceof XCommentTagViewV3)) {
            return;
        }
        a((XCommentTagViewV3) view);
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onClone(DXWidgetNode dXWidgetNode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e58628a", new Object[]{this, dXWidgetNode, new Boolean(z)});
            return;
        }
        super.onClone(dXWidgetNode, z);
        if (!(dXWidgetNode instanceof ebe)) {
            return;
        }
        ebe ebeVar = (ebe) dXWidgetNode;
        this.d = ebeVar.d;
        this.e = ebeVar.e;
        this.g = ebeVar.g;
        this.f = ebeVar.f;
        if (z) {
            JSONArray jSONArray = ebeVar.b;
            if (jSONArray == null) {
                return;
            }
            this.b = (JSONArray) jSONArray.clone();
            return;
        }
        this.b = ebeVar.b;
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        a(this.h);
        this.h.measure(i, i2);
        setMeasuredDimension(this.h.getMeasuredWidthAndState(), this.h.getMeasuredHeightAndState());
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public Object getDefaultValueForAttr(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("469dcc09", new Object[]{this, new Long(j)});
        }
        if (j == DXXWAPTAGVIEW_xlineNume) {
            this.c = 1;
            return Integer.valueOf(this.c);
        }
        return super.getDefaultValueForAttr(j);
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetIntAttribute(long j, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3e0d496", new Object[]{this, new Long(j), new Integer(i)});
            return;
        }
        super.onSetIntAttribute(j, i);
        if (DXXWAPTAGVIEW_xlineNume == j) {
            this.c = i;
        }
        if (DXXWAPTAGVIEW_normalTagColor == j) {
            this.e = i;
        }
        if (1291960931130884668L == j) {
            this.d = i;
        }
        if (DXXWAPTAGVIEW_highlightTagColor == j) {
            this.g = i;
        }
        if (-5755705385332798354L != j) {
            return;
        }
        this.f = i;
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
    public void onSetListAttribute(long j, JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb92d2ca", new Object[]{this, new Long(j), jSONArray});
            return;
        }
        super.onSetListAttribute(j, jSONArray);
        if (DXXWAPTAGVIEW_xtagsData != j) {
            return;
        }
        this.b = jSONArray;
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetStringAttribute(long j, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42764d9f", new Object[]{this, new Long(j), str});
            return;
        }
        super.onSetStringAttribute(j, str);
        if (DXXWAPTAGVIEW_xlineNume == j) {
            try {
                this.c = Integer.parseInt(str);
            } catch (Exception e) {
                i.a("XCommentTagViewWidgetNo", "设置String类型属性错误", e);
                return;
            }
        }
        if (DXXWAPTAGVIEW_normalTagColor == j) {
            this.e = Integer.parseInt(str);
        }
        if (1291960931130884668L == j) {
            this.d = Integer.parseInt(str);
        }
        if (DXXWAPTAGVIEW_highlightTagColor == j) {
            this.g = Integer.parseInt(str);
        }
        if (-5755705385332798354L != j) {
            return;
        }
        this.f = Integer.parseInt(str);
    }

    private void a(XCommentTagViewV3 xCommentTagViewV3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f26e03ac", new Object[]{this, xCommentTagViewV3});
        } else if (xCommentTagViewV3 == null) {
        } else {
            xCommentTagViewV3.setLineNum(this.c);
            xCommentTagViewV3.setNormalTextColor(this.d);
            xCommentTagViewV3.setNormalTagColor(this.e);
            xCommentTagViewV3.setTagList(this.b);
        }
    }
}
