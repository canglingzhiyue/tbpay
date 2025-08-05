package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.open.d;
import com.taobao.android.detail.core.request.MtopRequestListener;
import com.taobao.android.detail.core.utils.i;
import mtopsdk.mtop.domain.MtopResponse;

/* loaded from: classes5.dex */
public class fej implements MtopRequestListener<String> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private d f27859a;

    static {
        kge.a(-694355658);
        kge.a(854370102);
    }

    @Override // com.taobao.android.detail.core.request.c
    public /* synthetic */ void b(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f056ab85", new Object[]{this, obj});
        } else {
            a((String) obj);
        }
    }

    public fej(d dVar) {
        this.f27859a = dVar;
        emu.a("com.taobao.android.detail.wrapper.ext.request.TaoRequestListener");
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            this.f27859a.a(str, null);
        }
    }

    @Override // com.taobao.android.detail.core.request.c
    public void a(MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab3bce2d", new Object[]{this, mtopResponse});
            return;
        }
        if (mtopResponse != null && mtopResponse.getMtopStat() != null && mtopResponse.getMtopStat().getNetworkStats() != null) {
            String networkStats = mtopResponse.getMtopStat().getNetworkStats().toString();
            String mtopStatistics = mtopResponse.getMtopStat().toString();
            i.d("TaoRequestListener", "network_detail" + mtopStatistics);
            i.d("TaoRequestListener", "mtop_detail" + networkStats);
        }
        this.f27859a.a(mtopResponse.getResponseCode(), mtopResponse.getRetCode(), mtopResponse.getRetMsg(), mtopResponse.getMtopStat());
    }
}
