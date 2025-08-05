package com.taobao.infoflow.core.subservice.framework.container.mainfeeds;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.core.subservice.framework.container.containerservice.a;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.infoflow.protocol.subservice.framework.IMainFeedsViewService;
import java.util.List;
import tb.kge;
import tb.ldf;
import tb.lhn;
import tb.lho;
import tb.lhq;
import tb.lht;
import tb.lhu;
import tb.lhx;
import tb.lip;
import tb.ljs;
import tb.lkq;
import tb.lkr;
import tb.lks;
import tb.lln;
import tb.tbs;

/* loaded from: classes.dex */
public class MainFeedsViewServiceImpl implements IMainFeedsViewService<RecyclerView> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "MainRecycleViewServiceImpl";
    private lhq mBxUserTrackHandler;
    private ljs mInfoFlowContext;
    private lhn mNextPageHandler;
    private lho mReachEdgeHandler;
    private lht mRecycleViewExposureHandler;
    private lhu mRecycleViewScrollHandler;
    private RecyclerView mRecyclerView;
    private final lkr<RecyclerView> mLifeCycleCenter = new lip();
    private final a mContainerRegister = new a();
    private final lhx mRecycleViewWidget = new lhx();

    static {
        kge.a(592445968);
        kge.a(1842242857);
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onCreateService(ljs ljsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ceabc49c", new Object[]{this, ljsVar});
            return;
        }
        this.mInfoFlowContext = ljsVar;
        this.mRecycleViewWidget.a(ljsVar, this.mLifeCycleCenter);
        initRecyclerViewHandler(this.mInfoFlowContext, this.mLifeCycleCenter);
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onDestroyService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("770ac0a1", new Object[]{this});
            return;
        }
        destroyContainer();
        destroyRecyclerViewHandler();
        this.mLifeCycleCenter.d();
        this.mContainerRegister.a();
    }

    @Override // com.taobao.infoflow.protocol.subservice.framework.IMainFeedsViewService
    public void setInitConfig(lln llnVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b93886bd", new Object[]{this, llnVar});
        } else {
            this.mRecycleViewWidget.a(llnVar);
        }
    }

    @Override // tb.lkq
    /* renamed from: createContainer */
    public RecyclerView mo1092createContainer(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView) ipChange.ipc$dispatch("92ea4ce8", new Object[]{this, context});
        }
        ldf.d(TAG, "createContainer");
        if (this.mRecyclerView != null) {
            ldf.d(TAG, "重复调用createContainer，请先销毁再创建！！！！");
        }
        this.mContainerRegister.a(context);
        this.mRecyclerView = this.mRecycleViewWidget.a(context);
        this.mContainerRegister.c();
        return this.mRecyclerView;
    }

    @Override // tb.lkq
    public void destroyContainer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49a77eae", new Object[]{this});
            return;
        }
        ldf.d(TAG, "destroyContainer");
        this.mRecycleViewWidget.a();
        this.mRecyclerView = null;
    }

    @Override // com.taobao.infoflow.protocol.subservice.framework.IMainFeedsViewService
    public void uiRefresh(List<BaseSectionModel> list, com.taobao.infoflow.protocol.model.datamodel.action.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("875b30d", new Object[]{this, list, aVar});
            return;
        }
        this.mRecycleViewWidget.a(list, aVar);
        this.mRecycleViewWidget.e();
    }

    @Override // tb.lkq
    public void addOnContainerListener(lkq.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f3597dd", new Object[]{this, aVar});
        } else {
            this.mContainerRegister.a(aVar);
        }
    }

    @Override // tb.lkq
    public void removeOnContainerListener(lkq.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8982e05a", new Object[]{this, aVar});
        } else {
            this.mContainerRegister.b(aVar);
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.framework.IMainFeedsViewService
    /* renamed from: getLifeCycleRegister */
    public lkr<RecyclerView> mo1084getLifeCycleRegister() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (lkr) ipChange.ipc$dispatch("d1c45ff5", new Object[]{this}) : this.mLifeCycleCenter;
    }

    @Override // com.taobao.infoflow.protocol.subservice.framework.IMainFeedsViewService
    public void forceExposure() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f89fc99", new Object[]{this});
            return;
        }
        lht lhtVar = this.mRecycleViewExposureHandler;
        if (lhtVar == null) {
            return;
        }
        lhtVar.a(this.mRecyclerView);
    }

    @Override // com.taobao.infoflow.protocol.subservice.framework.IMainFeedsViewService
    public boolean isReachTopEdge() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("862a0214", new Object[]{this})).booleanValue() : this.mRecycleViewWidget.b();
    }

    @Override // com.taobao.infoflow.protocol.subservice.framework.IMainFeedsViewService
    public void scrollToTop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2787c14", new Object[]{this});
        } else {
            this.mRecycleViewWidget.c();
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.framework.IMainFeedsViewService
    public void scrollToPosition(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("161fb68b", new Object[]{this, new Integer(i)});
        } else {
            this.mRecycleViewWidget.a(i);
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.framework.IMainFeedsViewService
    public boolean isRecyclerViewCreated() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("214d20c5", new Object[]{this})).booleanValue() : this.mRecyclerView != null;
    }

    @Override // com.taobao.infoflow.protocol.subservice.framework.IMainFeedsViewService
    public void stopScroll() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ec88676", new Object[]{this});
        } else {
            this.mRecycleViewWidget.d();
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.framework.IMainFeedsViewService
    public void smoothScrollToPositionWithOffset(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7153a0bf", new Object[]{this, new Integer(i), new Integer(i2)});
        } else {
            this.mRecycleViewWidget.a(i, i2);
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.framework.IMainFeedsViewService
    public void scrollToPositionWithOffset(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f5c5ef1", new Object[]{this, new Integer(i), new Integer(i2)});
        } else {
            this.mRecycleViewWidget.b(i, i2);
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.framework.IMainFeedsViewService
    public void resetErrorView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be36fdc5", new Object[]{this});
        } else {
            this.mRecycleViewWidget.f();
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.framework.IMainFeedsViewService
    public int getItemCount() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("970ddc80", new Object[]{this})).intValue() : this.mRecycleViewWidget.g();
    }

    @Override // com.taobao.infoflow.protocol.subservice.framework.IMainFeedsViewService
    public int[] getItemViewHeights() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (int[]) ipChange.ipc$dispatch("1828e97f", new Object[]{this}) : this.mRecycleViewWidget.h();
    }

    @Override // com.taobao.infoflow.protocol.subservice.framework.IMainFeedsViewService
    public void dispatchWindowVisibility(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9fad3120", new Object[]{this, new Integer(i)});
            return;
        }
        if (4 == i) {
            forceExposure();
        }
        this.mRecycleViewWidget.b(i);
    }

    @Override // com.taobao.infoflow.protocol.subservice.framework.IMainFeedsViewService
    public int[] getVisiblePositionRange() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (int[]) ipChange.ipc$dispatch("67b2b985", new Object[]{this}) : this.mRecycleViewWidget.i();
    }

    @Override // com.taobao.infoflow.protocol.subservice.framework.IMainFeedsViewService
    public int findBottomPosition(int i, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("42fc47b8", new Object[]{this, new Integer(i), new Boolean(z)})).intValue() : this.mRecycleViewWidget.a(i, z);
    }

    @Override // com.taobao.infoflow.protocol.subservice.framework.IMainFeedsViewService
    public int findTopPosition(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("d5c5e04a", new Object[]{this, new Integer(i)})).intValue() : this.mRecycleViewWidget.c(i);
    }

    @Override // com.taobao.infoflow.protocol.subservice.framework.IMainFeedsViewService
    public double getViewExposureRatio(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("99ec6901", new Object[]{this, new Integer(i)})).doubleValue() : this.mRecycleViewWidget.d(i);
    }

    @Override // com.taobao.infoflow.protocol.subservice.framework.IMainFeedsViewService
    public void reloadUi() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21284014", new Object[]{this});
        } else {
            this.mRecycleViewWidget.j();
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.framework.IMainFeedsViewService
    public void updateItem(BaseSectionModel baseSectionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f0ea5cb", new Object[]{this, baseSectionModel});
        } else {
            this.mRecycleViewWidget.a(baseSectionModel);
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.taobao.infoflow.protocol.subservice.framework.IMainFeedsViewService
    /* renamed from: getOriginalView */
    public RecyclerView mo1085getOriginalView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RecyclerView) ipChange.ipc$dispatch("d474a051", new Object[]{this}) : this.mRecyclerView;
    }

    @Override // com.taobao.infoflow.protocol.subservice.framework.IMainFeedsViewService
    public int getPositionBySectionBizCode(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("3a1e8bb5", new Object[]{this, str})).intValue() : this.mRecycleViewWidget.a(str);
    }

    @Override // com.taobao.infoflow.protocol.subservice.framework.IMainFeedsViewService
    public void setScrollEnabled(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39f267fb", new Object[]{this, new Boolean(z)});
        } else {
            this.mRecycleViewWidget.a(z);
        }
    }

    @Override // tb.llo
    public boolean isInterceptTouch() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("214f872", new Object[]{this})).booleanValue() : this.mRecycleViewWidget.k();
    }

    @Override // tb.llo
    public int getVerticalScrollOffset() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("89715f46", new Object[]{this})).intValue() : this.mRecycleViewWidget.l();
    }

    @Override // com.taobao.infoflow.protocol.subservice.framework.IMainFeedsViewService
    public View findItemViewByPosition(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("a245f2cd", new Object[]{this, new Integer(i)}) : this.mRecycleViewWidget.e(i);
    }

    @Override // com.taobao.infoflow.protocol.subservice.framework.IMainFeedsViewService
    public BaseSectionModel<?> findItemDataByPosition(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BaseSectionModel) ipChange.ipc$dispatch("a400b778", new Object[]{this, new Integer(i)}) : this.mRecycleViewWidget.f(i);
    }

    @Override // com.taobao.infoflow.protocol.subservice.framework.IMainFeedsViewService
    public void setInfoFlowColumn(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72ba4d68", new Object[]{this, new Integer(i)});
        } else {
            this.mRecycleViewWidget.g(i);
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.framework.IMainFeedsViewService
    public int getInfoFlowColumn() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("19f342e2", new Object[]{this})).intValue() : this.mRecycleViewWidget.s();
    }

    @Override // com.taobao.infoflow.protocol.subservice.framework.IMainFeedsViewService
    public void setGestureDetectorCallback(tbs tbsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5685ede4", new Object[]{this, tbsVar});
        } else {
            this.mRecycleViewWidget.a(tbsVar);
        }
    }

    private void initRecyclerViewHandler(ljs ljsVar, lks<RecyclerView> lksVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63376f34", new Object[]{this, ljsVar, lksVar});
            return;
        }
        this.mRecycleViewExposureHandler = new lht(ljsVar, lksVar);
        this.mBxUserTrackHandler = new lhq(ljsVar, lksVar);
        this.mNextPageHandler = new lhn(ljsVar, lksVar);
        this.mReachEdgeHandler = new lho(ljsVar, lksVar);
        this.mRecycleViewScrollHandler = new lhu(ljsVar, lksVar);
    }

    private void destroyRecyclerViewHandler() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("230f3b53", new Object[]{this});
            return;
        }
        lht lhtVar = this.mRecycleViewExposureHandler;
        if (lhtVar != null) {
            lhtVar.a();
        }
        lhq lhqVar = this.mBxUserTrackHandler;
        if (lhqVar != null) {
            lhqVar.a();
        }
        lhn lhnVar = this.mNextPageHandler;
        if (lhnVar != null) {
            lhnVar.a();
        }
        lho lhoVar = this.mReachEdgeHandler;
        if (lhoVar != null) {
            lhoVar.a();
        }
        lhu lhuVar = this.mRecycleViewScrollHandler;
        if (lhuVar == null) {
            return;
        }
        lhuVar.a();
    }
}
