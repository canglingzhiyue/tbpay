package tb;

import android.animation.ValueAnimator;
import mtopsdk.common.util.StringUtils;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.h;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.infoflow.core.subservice.base.item.dxservice.impl.dinamic3.view.HMultiSelectView;
import com.taobao.infoflow.protocol.subservice.framework.IMainFeedsViewService;

/* loaded from: classes7.dex */
public class tgy extends h {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_EVENT_CHANGEVISIBLEITEM = -279868442483546412L;

    static {
        kge.a(71727364);
    }

    public static /* synthetic */ Object ipc$super(tgy tgyVar, String str, Object... objArr) {
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
        DXWidgetNode expandWidgetNode;
        DXWidgetNode queryWidgetNodeByUserId;
        int layoutHeight;
        DXRootView s;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9db7b67", new Object[]{this, dXEvent, objArr, dXRuntimeContext});
        } else if (objArr.length < 5) {
        } else {
            String str = (String) objArr[2];
            String str2 = (String) objArr[3];
            String str3 = (String) objArr[4];
            if (dXRuntimeContext == null || dXRuntimeContext.s() == null || (expandWidgetNode = dXRuntimeContext.s().getExpandWidgetNode()) == null || (queryWidgetNodeByUserId = expandWidgetNode.queryWidgetNodeByUserId(str)) == null || (layoutHeight = queryWidgetNodeByUserId.getLayoutHeight()) <= 0) {
                return;
            }
            ljs a2 = lfq.a(dXRuntimeContext);
            if (a2 == null) {
                ldf.d("DXChangeVisibleItemEventHandler", "infoFlowContext is null");
            } else if (((IMainFeedsViewService) a2.a(IMainFeedsViewService.class)) == null || (s = dXRuntimeContext.s()) == null) {
            } else {
                a(s, layoutHeight, StringUtils.equals(str2, "0"), str3);
            }
        }
    }

    private void a(final DXRootView dXRootView, final int i, boolean z, final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aaff8b24", new Object[]{this, dXRootView, new Integer(i), new Boolean(z), str});
        } else if (dXRootView == null || i < 0) {
        } else {
            if (!z) {
                ViewGroup.LayoutParams layoutParams = dXRootView.getLayoutParams();
                layoutParams.height = i;
                dXRootView.setLayoutParams(layoutParams);
                return;
            }
            ValueAnimator ofInt = ValueAnimator.ofInt(dXRootView.getHeight(), i);
            ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: tb.tgy.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                        return;
                    }
                    int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                    ViewGroup.LayoutParams layoutParams2 = dXRootView.getLayoutParams();
                    layoutParams2.height = intValue;
                    dXRootView.setLayoutParams(layoutParams2);
                    if (intValue != i || !StringUtils.equals("true", str)) {
                        return;
                    }
                    thb.a(HMultiSelectView.FEEDBACK_ROOT_USER_ID, dXRootView);
                }
            });
            ofInt.setDuration(150L);
            ofInt.start();
        }
    }
}
