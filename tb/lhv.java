package tb;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.infoflow.protocol.subservice.biz.IUserExperienceCheckService;
import com.taobao.uikit.feature.view.TRecyclerView;
import java.util.ArrayList;
import java.util.List;
import tb.lks;
import tb.lkz;

/* loaded from: classes7.dex */
public class lhv extends lku implements lks.c<RecyclerView>, lkz.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final ljs d;
    private ssp f;

    /* renamed from: a  reason: collision with root package name */
    private int f30631a = 1;
    private int b = -1;
    private int c = -1;
    private final lhs e = new lhs();

    static {
        kge.a(-49594077);
        kge.a(439987723);
        kge.a(-357951963);
    }

    public static /* synthetic */ Object ipc$super(lhv lhvVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.lkz.a
    public void a(int i, View view, BaseSectionModel baseSectionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0524b1f", new Object[]{this, new Integer(i), view, baseSectionModel});
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

    @Override // tb.lkz.a
    public void b(int i, View view, BaseSectionModel baseSectionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5fda7a0", new Object[]{this, new Integer(i), view, baseSectionModel});
        }
    }

    public static /* synthetic */ void a(lhv lhvVar, BaseSectionModel baseSectionModel, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f0b375d", new Object[]{lhvVar, baseSectionModel, new Integer(i)});
        } else {
            lhvVar.a((BaseSectionModel<?>) baseSectionModel, i);
        }
    }

    public static /* synthetic */ void a(lhv lhvVar, BaseSectionModel baseSectionModel, int i, RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6136578b", new Object[]{lhvVar, baseSectionModel, new Integer(i), recyclerView});
        } else {
            lhvVar.a(baseSectionModel, i, recyclerView);
        }
    }

    public lhv(ljs ljsVar) {
        this.d = ljsVar;
        this.f = new ssp(ljsVar);
    }

    public void bi_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f89fc57f", new Object[]{this});
            return;
        }
        this.f30631a = 1;
        this.b = -1;
        this.c = -1;
    }

    @Override // tb.lks.c
    public void a(RecyclerView recyclerView, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2febb876", new Object[]{this, recyclerView, new Integer(i), new Integer(i2)});
        } else if (this.f30631a * i2 >= 0) {
        } else {
            this.f30631a = i2;
            a(recyclerView);
        }
    }

    @Override // tb.lks.c
    public void a(RecyclerView recyclerView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85acc02d", new Object[]{this, recyclerView, new Integer(i)});
        } else if (!(recyclerView instanceof TRecyclerView)) {
        } else {
            if (i == 1) {
                a(recyclerView);
            } else if (i != 0) {
            } else {
                a(recyclerView);
                this.f.a(recyclerView);
                a((TRecyclerView) recyclerView);
            }
        }
    }

    @Override // tb.lkz.a
    public void a(boolean z, int i, BaseSectionModel baseSectionModel, View view) {
        JSONObject args;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ac4f93", new Object[]{this, new Boolean(z), new Integer(i), baseSectionModel, view});
        } else if (!z || (args = baseSectionModel.getArgs()) == null) {
        } else {
            args.put("realExposeIndex", (Object) Integer.valueOf(i));
            a(args, i);
        }
    }

    @Override // tb.lku
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            b();
        }
    }

    @Override // tb.lku
    public void b(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90f78e09", new Object[]{this, new Integer(i), new Integer(i2)});
        } else {
            b();
        }
    }

    @Override // tb.lku
    public void c(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5ddc94a", new Object[]{this, new Integer(i), new Integer(i2)});
        } else {
            b();
        }
    }

    private void a(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46606596", new Object[]{this, recyclerView});
            return;
        }
        StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) recyclerView.getLayoutManager();
        if (staggeredGridLayoutManager == null) {
            return;
        }
        int a2 = a((View) recyclerView);
        int[] findFirstVisibleItemPositions = staggeredGridLayoutManager.findFirstVisibleItemPositions(null);
        int i = findFirstVisibleItemPositions[0];
        View findViewByPosition = staggeredGridLayoutManager.findViewByPosition(findFirstVisibleItemPositions[0]);
        int i2 = -1;
        if (findViewByPosition != null && findViewByPosition.getMeasuredHeight() > 0) {
            if (a2 <= findViewByPosition.getMeasuredHeight() / 2) {
                this.b = -1;
                this.c = -1;
                return;
            }
            if (findViewByPosition.getBottom() <= findViewByPosition.getMeasuredHeight() / 2) {
                i = staggeredGridLayoutManager.findFirstCompletelyVisibleItemPositions(null)[0];
            }
            int i3 = this.b;
            if (i < i3 || i3 == -1) {
                this.b = i;
            }
        }
        if (a2 < recyclerView.getHeight()) {
            int i4 = this.b;
            while (i4 >= 0 && i4 < recyclerView.getAdapter().getItemCount()) {
                i4++;
                View findViewByPosition2 = staggeredGridLayoutManager.findViewByPosition(i4);
                if (findViewByPosition2 == null || findViewByPosition2.getTop() > a2 || a2 - findViewByPosition2.getTop() <= findViewByPosition2.getMeasuredHeight() / 2) {
                    break;
                }
                i2 = i4;
            }
        } else {
            i2 = a(recyclerView, staggeredGridLayoutManager, a2);
        }
        if (i2 <= this.c) {
            return;
        }
        this.c = i2;
    }

    private int a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9501e35d", new Object[]{this, view})).intValue();
        }
        int b = gbg.b(view.getContext());
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        if (rect.right <= 0 || rect.left >= b) {
            ldf.d(RPCDataItems.SWITCH_TAG_LOG, "容器在屏幕上不可见");
            return 0;
        }
        return rect.height();
    }

    private int b(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e101280a", new Object[]{this, recyclerView})).intValue();
        }
        if (recyclerView == null) {
            return -1;
        }
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (!(layoutManager instanceof StaggeredGridLayoutManager)) {
            return -1;
        }
        int[] findLastCompletelyVisibleItemPositions = ((StaggeredGridLayoutManager) layoutManager).findLastCompletelyVisibleItemPositions(null);
        int i = -1;
        for (int i2 = 0; i2 < findLastCompletelyVisibleItemPositions.length; i2++) {
            if (findLastCompletelyVisibleItemPositions[i2] >= 0 && (i == -1 || i < findLastCompletelyVisibleItemPositions[i2])) {
                i = findLastCompletelyVisibleItemPositions[i2];
            }
        }
        return i;
    }

    private int a(RecyclerView recyclerView, StaggeredGridLayoutManager staggeredGridLayoutManager, int i) {
        View findViewByPosition;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("50b107f", new Object[]{this, recyclerView, staggeredGridLayoutManager, new Integer(i)})).intValue();
        }
        int[] findLastVisibleItemPositions = staggeredGridLayoutManager.findLastVisibleItemPositions(null);
        if (findLastVisibleItemPositions == null) {
            return -1;
        }
        int i2 = -1;
        int i3 = -1;
        for (int i4 : findLastVisibleItemPositions) {
            if (i4 != -1 && (findViewByPosition = staggeredGridLayoutManager.findViewByPosition(i4)) != null && findViewByPosition.getMeasuredHeight() > 0) {
                if (findViewByPosition.getTop() > i || i - findViewByPosition.getTop() <= findViewByPosition.getMeasuredHeight() / 2) {
                    i2 = b(recyclerView);
                } else if (i4 > i3) {
                    i3 = i4;
                }
            }
        }
        return Math.max(i2, i3);
    }

    private void a(TRecyclerView tRecyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e81b4112", new Object[]{this, tRecyclerView});
            return;
        }
        lia liaVar = (lia) tRecyclerView.getAdapter();
        if (liaVar == null) {
            return;
        }
        if (this.b == -1 && this.c == -1) {
            return;
        }
        int headerViewsCount = tRecyclerView.getHeaderViewsCount();
        int i = this.b - headerViewsCount;
        int min = Math.min((this.c - headerViewsCount) + 1, liaVar.getItemCount() - 1);
        int min2 = Math.min(i, min);
        int max = Math.max(i, min);
        List<BaseSectionModel> a2 = liaVar.a(min2, max);
        a(min2, max, a2 != null ? new ArrayList(a2) : new ArrayList(), tRecyclerView);
        this.b = -1;
        this.c = -1;
    }

    private void a(final int i, final int i2, final List<BaseSectionModel> list, final RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c493e3e7", new Object[]{this, new Integer(i), new Integer(i2), list, recyclerView});
        } else if (list == null || list.isEmpty()) {
            ldf.d("InfoFlowRecyclerViewExposure", "exposeList is null");
        } else {
            ljd.a().d(new Runnable() { // from class: tb.lhv.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    ldf.d("InfoFlowRecyclerViewExposure", "exposeList fromIndex :" + i + ", toIndex : " + i2);
                    int size = list.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        BaseSectionModel baseSectionModel = (BaseSectionModel) list.get(i3);
                        lhv.a(lhv.this, baseSectionModel, i + i3, recyclerView);
                        lhv.a(lhv.this, baseSectionModel, i + i3);
                    }
                }
            });
        }
    }

    private void a(BaseSectionModel<?> baseSectionModel, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d67d7b53", new Object[]{this, baseSectionModel, new Integer(i)});
        } else if (baseSectionModel == null || baseSectionModel.getBooleanValue("isUIThreadTrack") || baseSectionModel.getExt().getBooleanValue("hidden")) {
        } else {
            if (StringUtils.isEmpty(baseSectionModel.getString("adNamespace"))) {
                baseSectionModel.put("adNamespace", (Object) "tb_recmd_homePage");
            }
            baseSectionModel.put("isUIThreadTrack", (Object) true);
            a(baseSectionModel);
            ljh.a(baseSectionModel, (JSONObject) null);
        }
    }

    private void a(JSONObject jSONObject, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a78e87b", new Object[]{this, jSONObject, new Integer(i)});
            return;
        }
        int a2 = this.e.a(i);
        if (a2 == -1) {
            return;
        }
        jSONObject.put("recIndex", (Object) Integer.valueOf(a2));
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            this.e.a(this.d);
        }
    }

    private void a(BaseSectionModel<?> baseSectionModel, int i, RecyclerView recyclerView) {
        StaggeredGridLayoutManager staggeredGridLayoutManager;
        View findViewByPosition;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cbd2ed81", new Object[]{this, baseSectionModel, new Integer(i), recyclerView});
        } else if (recyclerView == null || (staggeredGridLayoutManager = (StaggeredGridLayoutManager) recyclerView.getLayoutManager()) == null || (findViewByPosition = staggeredGridLayoutManager.findViewByPosition(i)) == null) {
        } else {
            stn.a(baseSectionModel, findViewByPosition);
        }
    }

    private void a(BaseSectionModel<?> baseSectionModel) {
        ljs ljsVar;
        IUserExperienceCheckService iUserExperienceCheckService;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc98adb0", new Object[]{this, baseSectionModel});
        } else if (baseSectionModel.getBooleanValue("isTracked") || (ljsVar = this.d) == null || (iUserExperienceCheckService = (IUserExperienceCheckService) ljsVar.a(IUserExperienceCheckService.class)) == null) {
        } else {
            iUserExperienceCheckService.startExperienceCheckTask(baseSectionModel, IUserExperienceCheckService.CheckOccasion.EXPOSE);
        }
    }
}
