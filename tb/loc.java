package tb;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.h;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx.widget.DXWidgetRefreshOption;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;

/* loaded from: classes7.dex */
public class loc extends h {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_EVENT_HREFRESHWIDGETNODE = 7786040754302208819L;

    static {
        kge.a(371606160);
    }

    public static /* synthetic */ Object ipc$super(loc locVar, String str, Object... objArr) {
        if (str.hashCode() == 1785185506) {
            super.prepareBindEventWithArgs((Object[]) objArr[0], (DXRuntimeContext) objArr[1]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.android.dinamicx.h, com.taobao.android.dinamicx.bn
    public void prepareBindEventWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a67c4e2", new Object[]{this, objArr, dXRuntimeContext});
        } else {
            super.prepareBindEventWithArgs(objArr, dXRuntimeContext);
        }
    }

    @Override // com.taobao.android.dinamicx.h, com.taobao.android.dinamicx.bn
    public void handleEvent(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9db7b67", new Object[]{this, dXEvent, objArr, dXRuntimeContext});
            return;
        }
        ldf.c("DXHRefreshWidgetNodeEventHandler", "handleEvent");
        if (objArr == null || objArr.length < 2) {
            ldf.d("DXHRefreshWidgetNodeEventHandler", "illegal args!");
            return;
        }
        BaseSectionModel<?> b = lfq.b(dXRuntimeContext);
        if (b == null || !StringUtils.equals(String.valueOf(objArr[0]), b.getSectionBizCode())) {
            ldf.d("DXHRefreshWidgetNodeEventHandler", "not current widget!");
            return;
        }
        DXRootView s = dXRuntimeContext.s();
        String valueOf = String.valueOf(objArr[1]);
        if (s == null || StringUtils.isEmpty(valueOf)) {
            ldf.d("DXHRefreshWidgetNodeEventHandler", "rootView not found!");
            return;
        }
        DXWidgetNode queryWidgetNodeByUserId = s.getExpandWidgetNode().queryWidgetNodeByUserId(valueOf);
        if (queryWidgetNodeByUserId == null) {
            ldf.d("DXHRefreshWidgetNodeEventHandler", "item not found!");
        } else {
            queryWidgetNodeByUserId.setNeedParse(new DXWidgetRefreshOption.a().a(true).b(true).a());
        }
    }
}
