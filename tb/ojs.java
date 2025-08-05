package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.request.params.ReportErrorParams;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import mtopsdk.mtop.domain.MethodEnum;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0014J\b\u0010\u0007\u001a\u00020\u0006H\u0014J\b\u0010\b\u001a\u00020\tH\u0014¨\u0006\n"}, d2 = {"Lcom/taobao/android/detail/ttdetail/request/client/ReportErrorClient;", "Lcom/taobao/android/detail/ttdetail/request/client/MtopRequestClient;", "Lcom/taobao/android/detail/ttdetail/request/params/ReportErrorParams;", "params", "(Lcom/taobao/android/detail/ttdetail/request/params/ReportErrorParams;)V", "getApiName", "", "getApiVersion", "getMethod", "Lmtopsdk/mtop/domain/MethodEnum;", "tt-detail_release"}, k = 1, mv = {1, 1, 16})
/* loaded from: classes5.dex */
public final class ojs extends snb<ReportErrorParams> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1266113458);
    }

    @Override // tb.snb
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : "mtop.taobao.detail.event.report";
    }

    @Override // tb.snb
    public String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : "1.0";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ojs(ReportErrorParams params) {
        super(params);
        q.c(params, "params");
    }

    @Override // tb.snb
    public MethodEnum d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MethodEnum) ipChange.ipc$dispatch("27517117", new Object[]{this}) : MethodEnum.POST;
    }
}
