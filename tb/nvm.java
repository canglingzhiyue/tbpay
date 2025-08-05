package tb;

import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.widget.DXSliderLayout;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.infoflow.protocol.subservice.biz.multiclasstab.IMulticlassTabService;
import com.taobao.infoflow.protocol.subservice.framework.IContainerDataService;
import com.taobao.infoflow.protocol.subservice.framework.IHostService;
import com.taobao.infoflow.protocol.subservice.framework.IMainFeedsViewService;
import com.taobao.infoflow.protocol.subservice.framework.IMainLifecycleService;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.card.SectionModel;
import com.taobao.weex.ui.component.WXBasicComponentType;
import tb.mto;

/* loaded from: classes7.dex */
public class nvm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private ljs f31789a;

    static {
        kge.a(-586793365);
    }

    public int e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5a4ca5f", new Object[]{this})).intValue();
        }
        return 0;
    }

    public nvm(ljs ljsVar) {
        this.f31789a = ljsVar;
    }

    public View a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("195fbaaa", new Object[]{this});
        }
        ViewGroup viewGroup = (ViewGroup) b();
        if (viewGroup == null) {
            ldf.d("SliderViewHelper", "findSliderView -> itemView == null");
            return null;
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof DXRootView) {
                return childAt;
            }
        }
        return null;
    }

    public View b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("639153eb", new Object[]{this});
        }
        IContainerDataService iContainerDataService = (IContainerDataService) this.f31789a.a(IContainerDataService.class);
        if (iContainerDataService == null) {
            return null;
        }
        int a2 = bxs.a(iContainerDataService.getContainerData().getTotalData());
        if (a2 == -1) {
            ldf.d("SliderViewHelper", "findSliderItemView->   sliderDataPosition == RecyclerView.NO_POSITION");
            return null;
        }
        IMainFeedsViewService iMainFeedsViewService = (IMainFeedsViewService) this.f31789a.a(IMainFeedsViewService.class);
        if (iMainFeedsViewService != null) {
            return iMainFeedsViewService.findItemViewByPosition(a2);
        }
        return null;
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        DXSliderLayout g = g();
        if (g == null) {
            ldf.d("SliderViewHelper", "resetSlider -> sliderLayout == null");
            return;
        }
        try {
            g.stopTimer();
            g.scrollToPageIndex(0);
            g.startTimer();
        } catch (Throwable th) {
            ldf.a("SliderViewHelper", "resetSlider:", th);
        }
    }

    private DXSliderLayout g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXSliderLayout) ipChange.ipc$dispatch("c5872c28", new Object[]{this});
        }
        View a2 = a();
        if (!(a2 instanceof DXRootView)) {
            ldf.d("SliderViewHelper", "findSliderLayout -> !(sliderView instanceof DXRootView)");
            return null;
        }
        DXWidgetNode expandWidgetNode = ((DXRootView) a2).getExpandWidgetNode();
        if (expandWidgetNode == null) {
            ldf.d("SliderViewHelper", "findSliderLayout -> getExpandWidgetNode() == null");
            return null;
        }
        DXWidgetNode queryWidgetNodeByUserId = expandWidgetNode.queryWidgetNodeByUserId(WXBasicComponentType.SLIDER);
        if (!(queryWidgetNodeByUserId instanceof DXSliderLayout)) {
            ldf.d("SliderViewHelper", "findSliderLayout -> !(slider instanceof DXSliderLayout)");
            return null;
        }
        return (DXSliderLayout) queryWidgetNodeByUserId;
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        DXSliderLayout g = g();
        if (g == null) {
            ldf.d("SliderViewHelper", "scrollSliderToFirst -> sliderLayout == null");
            return;
        }
        try {
            g.stopTimer();
            g.scrollToPageIndex(0);
        } catch (Throwable th) {
            ldf.a("SliderViewHelper", "scrollSliderToFirst:", th);
        }
    }

    public double a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a8219389", new Object[]{this, new Integer(i)})).doubleValue();
        }
        IMainFeedsViewService iMainFeedsViewService = (IMainFeedsViewService) this.f31789a.a(IMainFeedsViewService.class);
        return iMainFeedsViewService == null ? mto.a.GEO_NOT_SUPPORT : iMainFeedsViewService.getViewExposureRatio(i);
    }

    public void a(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c1152c8", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        IMainFeedsViewService iMainFeedsViewService = (IMainFeedsViewService) this.f31789a.a(IMainFeedsViewService.class);
        if (iMainFeedsViewService == null) {
            return;
        }
        iMainFeedsViewService.scrollToPosition(i);
    }

    public void a(SectionModel sectionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ba04285", new Object[]{this, sectionModel});
            return;
        }
        IMainFeedsViewService iMainFeedsViewService = (IMainFeedsViewService) this.f31789a.a(IMainFeedsViewService.class);
        if (iMainFeedsViewService == null) {
            return;
        }
        iMainFeedsViewService.updateItem(sectionModel);
    }

    public boolean f() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[]{this})).booleanValue();
        }
        if (!h()) {
            ldf.d("SliderViewHelper", "当前栈顶不是信息流所在宿主页面");
            return false;
        }
        IMainLifecycleService iMainLifecycleService = (IMainLifecycleService) this.f31789a.a(IMainLifecycleService.class);
        if (iMainLifecycleService != null && iMainLifecycleService.isSelect()) {
            z = true;
        }
        IMulticlassTabService iMulticlassTabService = (IMulticlassTabService) this.f31789a.a(IMulticlassTabService.class);
        return iMulticlassTabService != null ? z & (!iMulticlassTabService.isShowTabContent()) : z;
    }

    private boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5cf10f3", new Object[]{this})).booleanValue();
        }
        IHostService iHostService = (IHostService) this.f31789a.a(IHostService.class);
        if (iHostService == null) {
            ldf.d("SliderViewHelper", "hostService is null");
            return false;
        }
        lkc i = iHostService.getInvokeCallback().i();
        if (i == null) {
            ldf.d("SliderViewHelper", "pageCallback is null");
            return false;
        }
        return i.a();
    }
}
