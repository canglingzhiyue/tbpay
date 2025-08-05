package tb;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.infoflow.protocol.engine.invoke.biz.b;
import com.taobao.infoflow.protocol.subservice.biz.IFirstScreenDataService;
import com.taobao.infoflow.protocol.subservice.framework.IMainFeedsViewService;

/* loaded from: classes.dex */
public class lgu implements b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final IMainFeedsViewService<?> f30586a;
    private final IFirstScreenDataService b;
    private final ljs c;

    static {
        kge.a(-1286372715);
        kge.a(-492171771);
    }

    public static /* synthetic */ IMainFeedsViewService a(lgu lguVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IMainFeedsViewService) ipChange.ipc$dispatch("44252266", new Object[]{lguVar}) : lguVar.f30586a;
    }

    public lgu(ljs ljsVar) {
        this.c = ljsVar;
        this.f30586a = (IMainFeedsViewService) ljsVar.a(IMainFeedsViewService.class);
        this.b = (IFirstScreenDataService) ljsVar.a(IFirstScreenDataService.class);
    }

    @Override // com.taobao.infoflow.protocol.engine.invoke.biz.b
    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        IMainFeedsViewService<?> iMainFeedsViewService = this.f30586a;
        if (iMainFeedsViewService != null) {
            return iMainFeedsViewService.isReachTopEdge();
        }
        return true;
    }

    @Override // com.taobao.infoflow.protocol.engine.invoke.biz.b
    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        IMainFeedsViewService<?> iMainFeedsViewService = this.f30586a;
        if (iMainFeedsViewService != null) {
            return iMainFeedsViewService.isInterceptTouch();
        }
        return false;
    }

    @Override // com.taobao.infoflow.protocol.engine.invoke.biz.b
    public int c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5889b5d", new Object[]{this})).intValue();
        }
        IMainFeedsViewService<?> iMainFeedsViewService = this.f30586a;
        if (iMainFeedsViewService != null) {
            return iMainFeedsViewService.getVerticalScrollOffset();
        }
        return 0;
    }

    @Override // com.taobao.infoflow.protocol.engine.invoke.biz.b
    public boolean a(final int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a821939f", new Object[]{this, new Integer(i)})).booleanValue();
        }
        final int a2 = liy.a(this.c);
        if (a2 >= 0) {
            ljd.a().b(new Runnable() { // from class: tb.lgu.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        lgu.a(lgu.this).smoothScrollToPositionWithOffset(a2 + i, -1);
                    }
                }
            });
            return true;
        }
        ldf.d("ContainerInvokerImpl", "startPosition: " + a2);
        return false;
    }

    @Override // com.taobao.infoflow.protocol.engine.invoke.biz.b
    public boolean a(final int i, final int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5c1152cc", new Object[]{this, new Integer(i), new Integer(i2)})).booleanValue();
        }
        if (this.f30586a == null) {
            ldf.d("ContainerInvokerImpl", "scrollToPositionWithOffset mMainFeedsViewService == null");
            return false;
        }
        ljd.a().b(new Runnable() { // from class: tb.lgu.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    lgu.a(lgu.this).scrollToPositionWithOffset(i, i2);
                }
            }
        });
        return true;
    }

    @Override // com.taobao.infoflow.protocol.engine.invoke.biz.b
    public llg d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (llg) ipChange.ipc$dispatch("261c4f34", new Object[]{this}) : new lhe(e());
    }

    private llf e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (llf) ipChange.ipc$dispatch("2dcdf474", new Object[]{this});
        }
        IMainFeedsViewService<?> iMainFeedsViewService = this.f30586a;
        if (iMainFeedsViewService == null) {
            ldf.d("ContainerInvokerImpl", "getInfoFlowParams mMainFeedsViewService == null");
            return null;
        }
        int[] visiblePositionRange = iMainFeedsViewService.getVisiblePositionRange();
        if (visiblePositionRange == null || visiblePositionRange.length <= 0) {
            ldf.d("ContainerInvokerImpl", "visiblePositionRange == null || visiblePositionRange.length <= 0");
            return null;
        }
        int i = visiblePositionRange[0];
        if (i < 0) {
            ldf.d("ContainerInvokerImpl", "firstVisibleCardPosition <= 0");
            return null;
        }
        View findItemViewByPosition = this.f30586a.findItemViewByPosition(i);
        if (findItemViewByPosition == null) {
            return null;
        }
        int top = findItemViewByPosition.getTop();
        ldf.d("ContainerInvokerImpl", "firstVisibleCardOffset:" + i + "firstVisibleItemViewOffset" + top);
        return new lhf(i, top);
    }

    @Override // com.taobao.infoflow.protocol.engine.invoke.biz.b
    public View a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("b8543ebe", new Object[]{this, str, str2});
        }
        int positionBySectionBizCode = this.f30586a.getPositionBySectionBizCode(str);
        if (positionBySectionBizCode < 0) {
            ldf.d("ContainerInvokerImpl", "position < 0");
            return null;
        }
        View findItemViewByPosition = this.f30586a.findItemViewByPosition(positionBySectionBizCode);
        if (findItemViewByPosition == null) {
            ldf.d("ContainerInvokerImpl", "cardView is null");
            return null;
        } else if (TextUtils.isEmpty(str2)) {
            return findItemViewByPosition;
        } else {
            DXRootView a2 = a(findItemViewByPosition);
            if (a2 == null) {
                ldf.d("ContainerInvokerImpl", "dxRootView is null");
                return null;
            }
            DXWidgetNode expandWidgetNode = a2.getExpandWidgetNode();
            if (expandWidgetNode == null) {
                ldf.d("ContainerInvokerImpl", "dxWidgetNode is null");
                return null;
            }
            DXWidgetNode queryWidgetNodeByUserId = expandWidgetNode.queryWidgetNodeByUserId(str2);
            if (queryWidgetNodeByUserId == null) {
                ldf.d("ContainerInvokerImpl", "childWidgetNode is null");
                return null;
            }
            DXRuntimeContext dXRuntimeContext = queryWidgetNodeByUserId.getDXRuntimeContext();
            if (dXRuntimeContext == null) {
                ldf.d("ContainerInvokerImpl", "runtimeContext is null");
                return null;
            }
            return dXRuntimeContext.v();
        }
    }

    private static DXRootView a(View view) {
        ViewGroup viewGroup;
        int childCount;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRootView) ipChange.ipc$dispatch("fd04df2d", new Object[]{view});
        }
        if (view instanceof DXRootView) {
            return (DXRootView) view;
        }
        if (!(view instanceof ViewGroup) || (childCount = (viewGroup = (ViewGroup) view).getChildCount()) == 0) {
            return null;
        }
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof DXRootView) {
                return (DXRootView) childAt;
            }
        }
        return null;
    }
}
