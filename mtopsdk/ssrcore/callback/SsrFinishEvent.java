package mtopsdk.ssrcore.callback;

import com.android.alibaba.ip.runtime.IpChange;
import mtopsdk.mtop.common.MtopEvent;
import mtopsdk.ssrcore.MtopSsrStatistics;
import tb.mtk;

/* loaded from: classes9.dex */
public class SsrFinishEvent extends MtopEvent {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String seqNo;
    private mtk ssrResponse;
    public MtopSsrStatistics statistics;

    public SsrFinishEvent(mtk mtkVar) {
        this.ssrResponse = mtkVar;
    }

    public mtk getSsrResponse() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (mtk) ipChange.ipc$dispatch("5704859e", new Object[]{this}) : this.ssrResponse;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "SsrFinishEvent{ssrResponse=" + this.ssrResponse + ", seqNo='" + this.seqNo + "'}";
    }
}
