package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.activity.DetailCoreActivity;
import com.taobao.android.detail.core.event.a;
import com.taobao.android.detail.datasdk.model.datamodel.sku.SkuPageModel;
import com.taobao.android.trade.event.Event;
import com.taobao.android.trade.event.ThreadMode;
import com.taobao.android.trade.event.f;
import com.taobao.android.trade.event.i;

/* loaded from: classes4.dex */
public class efg extends eei<eof> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public DetailCoreActivity f27269a;

    static {
        kge.a(1669024093);
    }

    @Override // tb.eei
    public String getFullClassName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7324d71b", new Object[]{this}) : "com.taobao.android.detail.core.event.subscriber.sku.QuerySkuChoiceSubScriber";
    }

    @Override // tb.eei, com.taobao.android.trade.event.j
    public /* synthetic */ i handleEvent(Event event) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (i) ipChange.ipc$dispatch("caa7474e", new Object[]{this, event}) : a((eof) event);
    }

    public efg(DetailCoreActivity detailCoreActivity) {
        this.f27269a = detailCoreActivity;
    }

    public i a(eof eofVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (i) ipChange.ipc$dispatch("6b47c453", new Object[]{this, eofVar});
        }
        DetailCoreActivity detailCoreActivity = this.f27269a;
        if (detailCoreActivity == null || detailCoreActivity.y() == null) {
            return a.FAILURE;
        }
        SkuPageModel h = this.f27269a.y().h();
        if (h == null) {
            return a.FAILURE;
        }
        f.a(this.f27269a, new eog(h.getSkuChoiceVO()));
        return a.SUCCESS;
    }

    @Override // com.taobao.android.trade.event.j
    public ThreadMode getThreadMode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ThreadMode) ipChange.ipc$dispatch("6de50c9b", new Object[]{this}) : ThreadMode.CurrentThread;
    }
}
