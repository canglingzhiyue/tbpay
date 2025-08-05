package tb;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel;
import com.taobao.infoflow.protocol.subservice.biz.IMainFeedsLoopStartStopService;
import com.taobao.infoflow.protocol.subservice.biz.IPullSecondFloorService;
import com.taobao.infoflow.protocol.subservice.biz.IVideoPlayControllerService;
import com.taobao.infoflow.protocol.subservice.framework.IContainerDataService;
import com.taobao.infoflow.protocol.subservice.framework.IMainFeedsViewService;
import com.taobao.infoflow.taobao.subservice.biz.videoplaycontrollerservice.impl.model.a;
import java.util.ArrayList;
import java.util.List;
import tb.lks;
import tb.lkx;
import tb.lkz;

/* loaded from: classes.dex */
public abstract class lsx implements IPullSecondFloorService.a, IVideoPlayControllerService.a, IContainerDataService.a, lks.b, lks.c<ViewGroup>, lks.d, lkx.a, lkz.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final IMainFeedsViewService<?> b;
    private final IVideoPlayControllerService.c e;
    private final IMainFeedsLoopStartStopService f;

    /* renamed from: a  reason: collision with root package name */
    private int f30905a = -1;
    private boolean d = false;
    private final Runnable c = new Runnable() { // from class: tb.lsx.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            ldf.d("AbstractVideoPlayController", "executePlayRunnable");
            lsx lsxVar = lsx.this;
            lsx.a(lsxVar, lsx.a(lsxVar));
            lsx.b(lsx.this).a();
        }
    };

    static {
        kge.a(1231561546);
        kge.a(-1666352238);
        kge.a(439987723);
        kge.a(-1141294597);
        kge.a(-357951963);
        kge.a(348066581);
        kge.a(2125927784);
        kge.a(1169903879);
        kge.a(-72451274);
    }

    @Override // tb.lkz.a
    public void a(int i, View view, BaseSectionModel baseSectionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0524b1f", new Object[]{this, new Integer(i), view, baseSectionModel});
        }
    }

    @Override // tb.lkx.a
    public void a(RecyclerView.ViewHolder viewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6090f25", new Object[]{this, viewHolder});
        }
    }

    public abstract void a(View view);

    public abstract void a(IContainerDataModel<?> iContainerDataModel);

    public abstract void a(String str, int i);

    public abstract void a(List<View> list, a aVar);

    @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.a
    public void a(lli lliVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f302f74f", new Object[]{this, lliVar});
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.a
    public void a(lli lliVar, IContainerDataModel<?> iContainerDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce5cd68c", new Object[]{this, lliVar, iContainerDataModel});
        }
    }

    @Override // tb.lkz.a
    public void a(boolean z, int i, BaseSectionModel baseSectionModel, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ac4f93", new Object[]{this, new Boolean(z), new Integer(i), baseSectionModel, view});
        }
    }

    @Override // tb.lks.c
    public void a(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c194ce8", new Object[]{this, new Boolean(z), new Boolean(z2)});
        }
    }

    @Override // tb.lkz.a
    public void a_(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b34bf30d", new Object[]{this, view});
        }
    }

    public abstract void c();

    @Override // tb.lkx.a
    public void c(RecyclerView.ViewHolder viewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d875b4e3", new Object[]{this, viewHolder});
        }
    }

    public abstract boolean d();

    @Override // tb.lks.b
    public void dM_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32a48a9d", new Object[]{this});
        }
    }

    public abstract void e();

    public static /* synthetic */ IMainFeedsViewService a(lsx lsxVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IMainFeedsViewService) ipChange.ipc$dispatch("1418988f", new Object[]{lsxVar}) : lsxVar.b;
    }

    public static /* synthetic */ void a(lsx lsxVar, IMainFeedsViewService iMainFeedsViewService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7e59771", new Object[]{lsxVar, iMainFeedsViewService});
        } else {
            lsxVar.a(iMainFeedsViewService);
        }
    }

    public static /* synthetic */ IVideoPlayControllerService.c b(lsx lsxVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IVideoPlayControllerService.c) ipChange.ipc$dispatch("1d0c51e6", new Object[]{lsxVar}) : lsxVar.e;
    }

    public lsx(ljs ljsVar, IVideoPlayControllerService.c cVar) {
        this.b = (IMainFeedsViewService) ljsVar.a(IMainFeedsViewService.class);
        this.f = (IMainFeedsLoopStartStopService) ljsVar.a(IMainFeedsLoopStartStopService.class);
        this.e = cVar;
    }

    public void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
        } else {
            this.d = z;
        }
    }

    @Override // tb.lks.c
    public void a(ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8f4273c", new Object[]{this, viewGroup, new Integer(i)});
        } else if (i == this.f30905a) {
        } else {
            this.f30905a = i;
            if (i != 0) {
                return;
            }
            ldf.d("AbstractVideoPlayController", "滚动停止触发播控");
            f();
        }
    }

    @Override // tb.lks.c
    public void a(ViewGroup viewGroup, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75913347", new Object[]{this, viewGroup, new Integer(i), new Integer(i2)});
        } else if (this.f30905a != 0) {
        } else {
            ldf.d("AbstractVideoPlayController", "scrollTo 的场景（如置顶），触发播控");
            f();
        }
    }

    @Override // tb.lks.d
    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else if (z) {
            ldf.d("AbstractVideoPlayController", "可见触发播控");
            f();
        } else {
            e();
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IPullSecondFloorService.a
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (!ldj.a("isFixPlayVideoInSecondFloor", true)) {
        } else {
            ldf.d("AbstractVideoPlayController", "进入二楼，停止播放");
            e();
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IPullSecondFloorService.a
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (!ldj.a("isFixPlayVideoInSecondFloor", true)) {
        } else {
            ldf.d("AbstractVideoPlayController", "离开二楼，停止播放");
            f();
        }
    }

    @Override // tb.lkz.a
    public void b(int i, View view, BaseSectionModel baseSectionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5fda7a0", new Object[]{this, new Integer(i), view, baseSectionModel});
        } else {
            a(view);
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.a
    public void b(lli lliVar, IContainerDataModel<?> iContainerDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30b7ed6b", new Object[]{this, lliVar, iContainerDataModel});
        } else {
            a(iContainerDataModel);
        }
    }

    @Override // tb.lks.b
    public void dT_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e9676f6", new Object[]{this});
            return;
        }
        ldf.d("AbstractVideoPlayController", "DataChangeLayoutFinish 触发播控");
        f();
    }

    @Override // tb.lkx.a
    public void b(RecyclerView.ViewHolder viewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d73f6204", new Object[]{this, viewHolder});
            return;
        }
        ldf.d("AbstractVideoPlayController", "onItemRemoveFinished");
        f();
    }

    @Override // tb.lkx.a
    public void d(RecyclerView.ViewHolder viewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9ac07c2", new Object[]{this, viewHolder});
            return;
        }
        ldf.d("AbstractVideoPlayController", "onItemAddFinished");
        f();
    }

    public void f() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        if (!this.f.isAllowStart() && ldj.a("isFixPlayVideoInSecondFloor", true)) {
            z = true;
        }
        if (z) {
            ldf.d("AbstractVideoPlayController", "当前启停服务不允许播放");
        } else if (this.d) {
            ldf.d("AbstractVideoPlayController", "force intercept video play");
        } else {
            ljd.a().c(this.c);
            ljd.a().a(this.c, 0L);
        }
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [android.view.View, android.view.ViewGroup] */
    private void a(IMainFeedsViewService<?> iMainFeedsViewService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f5d7190", new Object[]{this, iMainFeedsViewService});
        } else if (iMainFeedsViewService == null || !d()) {
            ldf.d("AbstractVideoPlayController", "不允许执行播控 mainFeedsViewService :" + iMainFeedsViewService);
        } else {
            ?? mo1085getOriginalView = iMainFeedsViewService.mo1085getOriginalView();
            if (mo1085getOriginalView == 0) {
                ldf.d("AbstractVideoPlayController", "feeds 容器为空");
                return;
            }
            a aVar = new a(ltj.a(mo1085getOriginalView));
            List<View> b = b(iMainFeedsViewService);
            if (b == null || b.isEmpty()) {
                ldf.d("AbstractVideoPlayController", "没有在屏上的feeds子视图");
            } else {
                a(b, aVar);
            }
        }
    }

    private List<View> b(IMainFeedsViewService<?> iMainFeedsViewService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("96306b38", new Object[]{this, iMainFeedsViewService});
        }
        int[] visiblePositionRange = iMainFeedsViewService.getVisiblePositionRange();
        if (visiblePositionRange == null || visiblePositionRange.length != 2) {
            ldf.d("AbstractVideoPlayController", "findOnScreenViews visiblePositionRange error");
            return null;
        }
        int i = visiblePositionRange[1];
        ArrayList arrayList = new ArrayList();
        for (int i2 = visiblePositionRange[0]; i2 <= i; i2++) {
            View findItemViewByPosition = iMainFeedsViewService.findItemViewByPosition(i2);
            if (findItemViewByPosition != null && findItemViewByPosition.getVisibility() == 0) {
                arrayList.add(findItemViewByPosition);
            }
        }
        return arrayList;
    }
}
