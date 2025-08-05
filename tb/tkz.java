package tb;

import com.taobao.android.live.plugin.atype.flexalocal.input.InputFrame3;
import com.taobao.ugc.fragment.request.GetOrderRateInfoResponse;
import kotlin.Metadata;
import mtopsdk.mtop.domain.MtopResponse;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J&\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0007H&J\u0012\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u000bH&¨\u0006\f"}, d2 = {"Lcom/taobao/ugc/fragment/request/OrderRequestListener;", "", "onError", "", InputFrame3.TYPE_RESPONSE, "Lmtopsdk/mtop/domain/MtopResponse;", "errorCode", "", "errorMsg", "onSuccess", "data", "Lcom/taobao/ugc/fragment/request/GetOrderRateInfoResponse;", "taobao_rate_sdk_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes9.dex */
public interface tkz {
    void a(GetOrderRateInfoResponse getOrderRateInfoResponse);

    void a(MtopResponse mtopResponse, String str, String str2);
}
