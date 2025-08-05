package tb;

import com.android.alibaba.ip.runtime.IpChange;
import mtopsdk.framework.domain.FilterResult;
import mtopsdk.framework.domain.a;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.util.ErrorConstant;

/* loaded from: classes.dex */
public class rxq implements rxm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-240856664);
        kge.a(-2079716300);
    }

    @Override // tb.rxo
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : "mtopsdk.BusinessErrorAfterFilter";
    }

    @Override // tb.rxm
    public String a(a aVar) {
        MtopResponse mtopResponse;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2b93eb6d", new Object[]{this, aVar});
        }
        MtopResponse mtopResponse2 = aVar.c;
        if (304 == mtopResponse2.getResponseCode() && aVar.j != null && (mtopResponse = aVar.j.cacheResponse) != null) {
            aVar.c = mtopResponse;
            ryl.a(aVar);
            return "STOP";
        } else if (mtopResponse2.getBytedata() == null) {
            mtopResponse2.setRetCode(ErrorConstant.ERRCODE_JSONDATA_BLANK);
            mtopResponse2.setRetMsg(ErrorConstant.ERRMSG_JSONDATA_BLANK);
            ryl.a(aVar);
            return "STOP";
        } else {
            ryl.a(mtopResponse2);
            return FilterResult.CONTINUE;
        }
    }
}
