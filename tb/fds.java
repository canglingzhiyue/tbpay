package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.datasdk.model.datamodel.node.c;
import com.taobao.android.detail.wrapper.activity.DetailActivity;
import com.taobao.android.detail.wrapper.ext.request.size.TBSizeChartClient;
import com.taobao.android.detail.wrapper.ext.request.size.TBSizeChartModel;
import com.taobao.android.detail.wrapper.ext.request.size.TBSizeChartParams;
import com.taobao.android.detail.wrapper.fragment.size.TBSizeChartFragment;
import com.taobao.android.trade.boost.request.mtop.a;
import com.taobao.android.trade.event.Event;
import com.taobao.android.trade.event.ThreadMode;
import com.taobao.android.trade.event.i;
import mtopsdk.mtop.domain.MtopResponse;

/* loaded from: classes5.dex */
public class fds extends eei<eeh> implements a<TBSizeChartModel> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "TBSizeChartFragment";

    /* renamed from: a  reason: collision with root package name */
    private DetailActivity f27845a;
    private TBSizeChartFragment b;
    private TBSizeChartModel c;

    static {
        kge.a(1811223004);
        kge.a(1595456606);
    }

    public static /* synthetic */ Object ipc$super(fds fdsVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.eei
    public String getFullClassName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7324d71b", new Object[]{this}) : "com.taobao.android.detail.wrapper.ext.event.subscriber.size.OpenTBSizeChartSubscriber";
    }

    @Override // tb.eei, com.taobao.android.trade.event.j
    public /* synthetic */ i handleEvent(Event event) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (i) ipChange.ipc$dispatch("caa7474e", new Object[]{this, event}) : a((eeh) event);
    }

    @Override // com.taobao.android.trade.boost.request.mtop.c
    public /* synthetic */ void onFailure(MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1cc110e", new Object[]{this, mtopResponse});
        } else {
            a(mtopResponse);
        }
    }

    @Override // com.taobao.android.trade.boost.request.mtop.c
    public /* synthetic */ void onSuccess(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea580ec7", new Object[]{this, obj});
        } else {
            a((TBSizeChartModel) obj);
        }
    }

    public fds(DetailActivity detailActivity) {
        this.f27845a = detailActivity;
        emu.a("com.taobao.android.detail.wrapper.ext.event.subscriber.size.OpenTBSizeChartSubscriber");
    }

    public i a(eeh eehVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (i) ipChange.ipc$dispatch("c55d4d1f", new Object[]{this, eehVar});
        }
        DetailActivity detailActivity = this.f27845a;
        if (detailActivity == null || detailActivity.isFinishing()) {
            return com.taobao.android.detail.core.event.a.FAILURE;
        }
        dya y = this.f27845a.y();
        if (y == null) {
            return com.taobao.android.detail.core.event.a.FAILURE;
        }
        if (this.f27845a.s == null) {
            this.b = new TBSizeChartFragment();
            this.b.initNodeBundle(y.t);
            this.f27845a.s = this.b;
        }
        if (!fgy.a(this.f27845a.s)) {
            this.f27845a.s.show(this.f27845a.getSupportFragmentManager(), "TBSizeChartFragment");
        }
        if (this.c == null || eehVar.f27231a) {
            c cVar = this.f27845a.y().t;
            String e = epo.g().e();
            this.b.setUserId(e);
            new TBSizeChartClient().execute(new TBSizeChartParams(e, cVar.i(), cVar.h()), this, epo.f());
            this.f27845a.s.showLoading(true);
        } else {
            this.f27845a.s.fillData(this.c);
        }
        return com.taobao.android.detail.core.event.a.SUCCESS;
    }

    @Override // com.taobao.android.trade.event.j
    public ThreadMode getThreadMode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ThreadMode) ipChange.ipc$dispatch("6de50c9b", new Object[]{this}) : ThreadMode.MainThread;
    }

    public void a(TBSizeChartModel tBSizeChartModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75c2f8a6", new Object[]{this, tBSizeChartModel});
            return;
        }
        DetailActivity detailActivity = this.f27845a;
        if (detailActivity == null || detailActivity.Y()) {
            return;
        }
        TBSizeChartFragment tBSizeChartFragment = this.b;
        if (tBSizeChartFragment != null) {
            tBSizeChartFragment.showLoading(false);
        }
        this.c = tBSizeChartModel;
        if (tBSizeChartModel == null) {
            a();
        } else {
            this.f27845a.s.fillData(this.c);
        }
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            epo.a("天啦噜，暂时没有加载成功");
        }
    }

    public void a(MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab3bce2d", new Object[]{this, mtopResponse});
            return;
        }
        DetailActivity detailActivity = this.f27845a;
        if (detailActivity == null || detailActivity.Y()) {
            return;
        }
        TBSizeChartFragment tBSizeChartFragment = this.b;
        if (tBSizeChartFragment != null) {
            tBSizeChartFragment.showLoading(false);
        }
        a();
    }

    @Override // com.taobao.android.trade.boost.request.mtop.a
    public void onSystemFailure(MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8463ea48", new Object[]{this, mtopResponse});
        } else {
            a(mtopResponse);
        }
    }
}
