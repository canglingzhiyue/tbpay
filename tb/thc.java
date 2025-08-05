package tb;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.alibaba.fastjson.JSONArray;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx.widget.ak;
import com.taobao.infoflow.core.subservice.base.item.dxservice.impl.dinamic3.view.HMultiSelectView;

/* loaded from: classes7.dex */
public class thc extends DXWidgetNode {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DXHMULTISELECTVIEW_BUTTONBGCOLOR = 7511386434915578449L;
    public static final long DXHMULTISELECTVIEW_BUTTONCORNERRADIUS = -8374544159672715905L;
    public static final long DXHMULTISELECTVIEW_BUTTONTEXTCOLOR = 5826826034621344591L;
    public static final long DXHMULTISELECTVIEW_DATALIST = 2034718913754788926L;
    public static final long DXHMULTISELECTVIEW_HMULTISELECTVIEW = -4864241882041751458L;
    public static final long DXHMULTISELECTVIEW_ISBOLD = 9423384817756195L;
    public static final long DXHMULTISELECTVIEW_ITEMHEIGHT = -889779179579457774L;
    public static final long DXHMULTISELECTVIEW_MULTITEXTSIZE = 1411120853688810616L;
    public static final long DXHMULTISELECTVIEW_SELECTBACKGROUNDCOLOR = 1389287809736320660L;
    public static final long DXHMULTISELECTVIEW_SELECTTEXTCOLOR = 2053814541299040819L;
    public static final long DXHMULTISELECTVIEW_UNSELECTBACKGROUNDCOLOR = 8262882441673184089L;
    public static final long DXHMULTISELECTVIEW_UNSELECTTEXTCOLOR = 3489470302554096888L;

    /* renamed from: a  reason: collision with root package name */
    private JSONArray f34092a;
    private double b;
    private String c;
    private double d;
    private String e;
    private String f;
    private String g;
    private String h;
    private double i;

    static {
        kge.a(-491848989);
    }

    public static /* synthetic */ Object ipc$super(thc thcVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1775895211:
                super.onBindEvent((Context) objArr[0], (View) objArr[1], ((Number) objArr[2]).longValue());
                return null;
            case -879570230:
                super.onSetListAttribute(((Number) objArr[0]).longValue(), (JSONArray) objArr[1]);
                return null;
            case -638169079:
                super.onSetDoubleAttribute(((Number) objArr[0]).longValue(), ((Number) objArr[1]).doubleValue());
                return null;
            case -303753557:
                super.onRenderView((Context) objArr[0], (View) objArr[1]);
                return null;
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

    /* loaded from: classes7.dex */
    public static class a implements ak {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-1368768838);
            kge.a(349752956);
        }

        @Override // com.taobao.android.dinamicx.widget.ak
        public DXWidgetNode build(Object obj) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj}) : new thc();
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode, com.taobao.android.dinamicx.widget.ak
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj}) : new thc();
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onClone(DXWidgetNode dXWidgetNode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e58628a", new Object[]{this, dXWidgetNode, new Boolean(z)});
        } else if (dXWidgetNode == null || !(dXWidgetNode instanceof thc)) {
        } else {
            super.onClone(dXWidgetNode, z);
            thc thcVar = (thc) dXWidgetNode;
            this.f34092a = thcVar.f34092a;
            this.c = thcVar.c;
            this.d = thcVar.d;
            this.f = thcVar.f;
            this.h = thcVar.h;
            this.e = thcVar.e;
            this.g = thcVar.g;
            this.b = thcVar.b;
            this.i = thcVar.i;
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public View onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context});
        }
        HMultiSelectView hMultiSelectView = new HMultiSelectView(context);
        a(hMultiSelectView);
        return hMultiSelectView;
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onRenderView(Context context, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede516ab", new Object[]{this, context, view});
            return;
        }
        super.onRenderView(context, view);
        HMultiSelectView hMultiSelectView = (HMultiSelectView) view;
        DXRuntimeContext dXRuntimeContext = getDXRuntimeContext();
        if (dXRuntimeContext == null) {
            return;
        }
        hMultiSelectView.setItemList(this.f34092a, lfq.b(dXRuntimeContext), dXRuntimeContext.s());
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
    public void onSetListAttribute(long j, JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb92d2ca", new Object[]{this, new Long(j), jSONArray});
        } else if (j == DXHMULTISELECTVIEW_DATALIST) {
            this.f34092a = jSONArray;
        } else {
            super.onSetListAttribute(j, jSONArray);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetStringAttribute(long j, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42764d9f", new Object[]{this, new Long(j), str});
        } else if (j == 9423384817756195L) {
            this.c = str;
        } else if (j == DXHMULTISELECTVIEW_SELECTBACKGROUNDCOLOR) {
            this.e = str;
        } else if (j == 2053814541299040819L) {
            this.f = str;
        } else if (j == DXHMULTISELECTVIEW_UNSELECTBACKGROUNDCOLOR) {
            this.g = str;
        } else if (j == DXHMULTISELECTVIEW_UNSELECTTEXTCOLOR) {
            this.h = str;
        } else {
            super.onSetStringAttribute(j, str);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetDoubleAttribute(long j, double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9f65009", new Object[]{this, new Long(j), new Double(d)});
        } else if (j == DXHMULTISELECTVIEW_BUTTONCORNERRADIUS) {
            this.b = d;
        } else if (j == -889779179579457774L) {
            this.i = d;
        } else if (j == DXHMULTISELECTVIEW_MULTITEXTSIZE) {
            this.d = d;
        } else {
            super.onSetDoubleAttribute(j, d);
        }
    }

    private void a(HMultiSelectView hMultiSelectView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fdba6cf", new Object[]{this, hMultiSelectView});
            return;
        }
        hMultiSelectView.setIsBold(TextUtils.equals("true", this.c));
        hMultiSelectView.setMultiTextSize(this.d);
        hMultiSelectView.setUnSelectTextColor(this.h);
        hMultiSelectView.setSelectTextColor(this.f);
        hMultiSelectView.setSelectBackgroundColor(this.e);
        hMultiSelectView.setUnSelectBackgroundColor(this.g);
        hMultiSelectView.setCornerRadius(this.b);
        hMultiSelectView.setItemHeight(this.i);
    }
}
