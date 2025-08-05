package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.request.params.RecommendRequestParams;

/* loaded from: classes5.dex */
public class oiz extends snb<RecommendRequestParams> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(508056335);
    }

    @Override // tb.snb
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : "mtop.taobao.regera.page.render.it";
    }

    @Override // tb.snb
    public String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : "1.0";
    }

    public oiz(RecommendRequestParams recommendRequestParams) {
        super(recommendRequestParams);
    }
}
