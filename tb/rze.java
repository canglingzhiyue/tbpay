package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import mtopsdk.common.util.HeaderHandlerUtil;
import mtopsdk.common.util.HttpHeaderConstant;
import mtopsdk.framework.domain.FilterResult;
import mtopsdk.mtop.common.MtopListener;
import mtopsdk.ssrcore.MtopSsrStatistics;
import mtopsdk.ssrcore.c;
import mtopsdk.ssrcore.callback.SsrCallbackListener;
import mtopsdk.ssrcore.callback.SsrFinishEvent;
import mtopsdk.ssrcore.d;

/* loaded from: classes.dex */
public class rze implements rzj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // tb.rxo
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : "ssr.SsrExecuteCallbackAfterFilter";
    }

    @Override // tb.rzj
    public String b(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c1c540d0", new Object[]{this, cVar});
        }
        MtopSsrStatistics mtopSsrStatistics = cVar.d;
        mtk mtkVar = cVar.f;
        d.d(mtopSsrStatistics);
        String str = cVar.b;
        SsrFinishEvent ssrFinishEvent = new SsrFinishEvent(mtkVar);
        ssrFinishEvent.seqNo = str;
        ssrFinishEvent.statistics = mtopSsrStatistics;
        mtopSsrStatistics.K = HeaderHandlerUtil.getSingleHeaderFieldByKey(mtkVar.d, HttpHeaderConstant.SERVER_TRACE_ID);
        mtopSsrStatistics.L = HeaderHandlerUtil.getSingleHeaderFieldByKey(mtkVar.d, "eagleeye-traceid");
        if (TextUtils.isEmpty(mtkVar.b)) {
            String singleHeaderFieldByKey = HeaderHandlerUtil.getSingleHeaderFieldByKey(mtkVar.d, "x-sec-reason");
            if (!TextUtils.isEmpty(singleHeaderFieldByKey)) {
                mtopSsrStatistics.r = singleHeaderFieldByKey;
            }
        } else {
            mtopSsrStatistics.r = mtkVar.b;
        }
        mtopSsrStatistics.q = mtkVar.f31246a;
        mtopSsrStatistics.b();
        MtopListener mtopListener = cVar.k;
        if (!(mtopListener instanceof SsrCallbackListener)) {
            return FilterResult.CONTINUE;
        }
        ((SsrCallbackListener) mtopListener).onFinish(ssrFinishEvent);
        return FilterResult.CONTINUE;
    }
}
