package tb;

import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.h;
import com.taobao.infoflow.core.subservice.base.item.dxservice.impl.dinamic3.view.rolling.RollingNumberView;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerInnerDataModel;
import com.taobao.infoflow.protocol.subservice.framework.IContainerDataService;

/* loaded from: classes7.dex */
public class xmz extends h {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_EVENT_HSTARTROLLINGNUMBERANIMATION = -5754577398270507918L;

    static {
        kge.a(1923667073);
    }

    public static /* synthetic */ Object ipc$super(xmz xmzVar, String str, Object... objArr) {
        if (str.hashCode() == 1785185506) {
            super.prepareBindEventWithArgs((Object[]) objArr[0], (DXRuntimeContext) objArr[1]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ void lambda$fGhj2iVnrZ0ZeoM2G6pHXwDJM_g(View view, Object obj) {
        a(view, obj);
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
        final View v = dXRuntimeContext.v();
        final Object obj = objArr[0];
        if (!(obj instanceof String)) {
            ldf.d("DXHStartRollingNumberAnimationEventHandler", "当前传入的不是string");
        } else if (!a(dXRuntimeContext)) {
            ldf.d("DXHStartRollingNumberAnimationEventHandler", "不是网络数据");
        } else if (!(v instanceof RollingNumberView)) {
        } else {
            ljd.a().a(new Runnable() { // from class: tb.-$$Lambda$xmz$fGhj2iVnrZ0ZeoM2G6pHXwDJM_g
                @Override // java.lang.Runnable
                public final void run() {
                    xmz.lambda$fGhj2iVnrZ0ZeoM2G6pHXwDJM_g(v, obj);
                }
            }, 0L);
        }
    }

    public static /* synthetic */ void a(View view, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("293f8cc6", new Object[]{view, obj});
            return;
        }
        ((RollingNumberView) view).startAnimation((String) obj);
        ldf.d("DXHStartRollingNumberAnimationEventHandler", "开始数字滚动动画");
    }

    private boolean a(DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("487cd5dd", new Object[]{this, dXRuntimeContext})).booleanValue();
        }
        ljs a2 = lfq.a(dXRuntimeContext);
        if (a2 == null) {
            ldf.d("DXHStartRollingNumberAnimationEventHandler", "infoFlowContext is null");
            return false;
        }
        IContainerDataService iContainerDataService = (IContainerDataService) a2.a(IContainerDataService.class);
        if (iContainerDataService == null) {
            ldf.d("DXHStartRollingNumberAnimationEventHandler", "containerDataService is null");
            return false;
        }
        IContainerDataModel containerData = iContainerDataService.getContainerData();
        if (containerData == null) {
            ldf.d("DXHStartRollingNumberAnimationEventHandler", "containerDataModel is null");
            return false;
        }
        IContainerInnerDataModel base = containerData.getBase();
        if (base == null) {
            ldf.d("DXHStartRollingNumberAnimationEventHandler", "containerInnerDataModel is null");
            return false;
        }
        return base.isRemote();
    }
}
