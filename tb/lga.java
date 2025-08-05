package tb;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.alibaba.fastjson.JSONArray;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.expression.event.DXScrollEvent;
import com.taobao.android.dinamicx.widget.DXSliderLayout;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx.widget.ak;
import com.taobao.android.dinamicx.widget.w;
import com.taobao.infoflow.core.subservice.base.item.dxservice.impl.dinamic3.bindingx.ScrollIconsVariableHighMsg;
import com.taobao.infoflow.core.subservice.base.item.dxservice.impl.dinamic3.view.HIconScrollerIndicator;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.infoflow.protocol.subservice.biz.IIconService;
import tb.mto;

/* loaded from: classes7.dex */
public class lga extends DXWidgetNode {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DXICONSCROLLERINDICATOR_ICONSCROLLERCHILDVIEWWIDTH = 3400716862757543816L;
    public static final long DXICONSCROLLERINDICATOR_ICONSCROLLERINDICATOR = -6001544878300519551L;
    public static final long DXICONSCROLLERINDICATOR_INDICATORCOLOR = -5151416374116397110L;

    /* renamed from: a  reason: collision with root package name */
    private int f30552a = 16739626;
    private int[] b = new int[2];
    private ScrollIconsVariableHighMsg c = new ScrollIconsVariableHighMsg();

    static {
        kge.a(-366545577);
    }

    public static /* synthetic */ Object ipc$super(lga lgaVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1133248269:
                return new Integer(super.getDefaultValueForIntAttr(((Number) objArr[0]).longValue()));
            case -879570230:
                super.onSetListAttribute(((Number) objArr[0]).longValue(), (JSONArray) objArr[1]);
                return null;
            case -740240234:
                super.onSetIntAttribute(((Number) objArr[0]).longValue(), ((Number) objArr[1]).intValue());
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

    /* loaded from: classes7.dex */
    public static class a implements ak {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(1380615470);
            kge.a(349752956);
        }

        @Override // com.taobao.android.dinamicx.widget.ak
        public DXWidgetNode build(Object obj) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj}) : new lga();
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode, com.taobao.android.dinamicx.widget.ak
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj}) : new lga();
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onClone(DXWidgetNode dXWidgetNode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e58628a", new Object[]{this, dXWidgetNode, new Boolean(z)});
        } else if (!(dXWidgetNode instanceof lga)) {
        } else {
            super.onClone(dXWidgetNode, z);
            lga lgaVar = (lga) dXWidgetNode;
            this.b = lgaVar.b;
            this.f30552a = lgaVar.f30552a;
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public View onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context}) : new HIconScrollerIndicator(context);
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onRenderView(Context context, View view) {
        int i;
        IIconService iIconService;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede516ab", new Object[]{this, context, view});
            return;
        }
        lga lgaVar = (lga) getDXRuntimeContext().d();
        HIconScrollerIndicator hIconScrollerIndicator = (HIconScrollerIndicator) view;
        hIconScrollerIndicator.setScrollBarThumbColor(tryFetchDarkModeColor(tea.INDICATOR_COLOR, 2, lgaVar.f30552a));
        hIconScrollerIndicator.setRadius((float) (getMeasuredHeight() * 0.5d));
        hIconScrollerIndicator.initIndicatorView(lgaVar.getMeasuredWidth(), lgaVar.getMeasuredHeight());
        ljs a2 = lfq.a(getDXRuntimeContext());
        if (a2 == null || (iIconService = (IIconService) a2.a(IIconService.class)) == null) {
            i = 0;
        } else {
            BaseSectionModel<?> b = lfq.b(getDXRuntimeContext());
            if (b != null) {
                iIconService.setSectionBizCode(b.getSectionBizCode());
            }
            i = iIconService.getInitPageIndex();
        }
        if (i != 1) {
            return;
        }
        hIconScrollerIndicator.refreshScrollIndicator(1.0d);
        this.c.postMessage(getEngine(), getDXRuntimeContext().s(), gbg.b(getDXRuntimeContext().m(), this.b[0]), ((View) getDXRuntimeContext().s().getParent()).getLayoutParams().height);
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetListAttribute(long j, JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb92d2ca", new Object[]{this, new Long(j), jSONArray});
        } else if (j == DXICONSCROLLERINDICATOR_ICONSCROLLERCHILDVIEWWIDTH) {
            a(jSONArray);
        } else {
            super.onSetListAttribute(j, jSONArray);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetIntAttribute(long j, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3e0d496", new Object[]{this, new Long(j), new Integer(i)});
        } else if (j == -5151416374116397110L) {
            this.f30552a = i;
        } else {
            super.onSetIntAttribute(j, i);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public int getDefaultValueForIntAttr(long j) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("bc7400f3", new Object[]{this, new Long(j)})).intValue() : j == -2819959685970048978L ? w.DEFAULT_INDICATOR_BG_COLOR : super.getDefaultValueForIntAttr(j);
    }

    private void a(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad9ea590", new Object[]{this, jSONArray});
        } else if (jSONArray != null && !jSONArray.isEmpty()) {
            for (int i = 0; i < jSONArray.size(); i++) {
                try {
                    this.b[i] = Integer.parseInt(String.valueOf(jSONArray.get(i)));
                } catch (Exception e) {
                    ldf.d("DXIconScrollerIndicatorWidgetNode", "解析子视图宽度信息出现异常：" + e);
                    return;
                }
            }
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public boolean onEvent(DXEvent dXEvent) {
        HIconScrollerIndicator hIconScrollerIndicator;
        DXScrollEvent dXScrollEvent;
        RecyclerView recyclerView;
        ljs a2;
        IIconService iIconService;
        DXWidgetNode queryWidgetNodeByUserId;
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4f22ba48", new Object[]{this, dXEvent})).booleanValue();
        }
        if (super.onEvent(dXEvent)) {
            return true;
        }
        if (dXEvent.getEventId() != 5288751146867425108L || (hIconScrollerIndicator = (HIconScrollerIndicator) getDXRuntimeContext().v()) == null || (recyclerView = (dXScrollEvent = (DXScrollEvent) dXEvent).getRecyclerView()) == null || ((LinearLayoutManager) recyclerView.getLayoutManager()).getOrientation() == 1) {
            return false;
        }
        int i2 = dXScrollEvent.getContentSize().f11827a - dXScrollEvent.getScrollerSize().f11827a;
        int offsetX = dXScrollEvent.getOffsetX();
        int b = gbg.b(recyclerView.getContext(), this.b[0]);
        int b2 = gbg.b(recyclerView.getContext(), this.b[1]);
        if (a()) {
            offsetX = Math.max(offsetX - (b2 - b), 0);
        }
        double d = i2 > 0 ? offsetX / i2 : 0.0d;
        int i3 = (d > mto.a.GEO_NOT_SUPPORT ? 1 : (d == mto.a.GEO_NOT_SUPPORT ? 0 : -1));
        if ((i3 == 0 || d == 1.0d) && (a2 = lfq.a(getDXRuntimeContext())) != null && (iIconService = (IIconService) a2.a(IIconService.class)) != null && (queryWidgetNodeByUserId = getDXRuntimeContext().d().queryWidgetNodeByUserId("icon_slider")) != null && (queryWidgetNodeByUserId instanceof DXSliderLayout)) {
            if (i3 != 0) {
                i = 1;
            }
            iIconService.setPageIndex(i);
        }
        hIconScrollerIndicator.refreshScrollIndicator(d);
        return true;
    }

    private boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        int[] iArr = this.b;
        return iArr[0] != iArr[1];
    }
}
