package mtopsdk.mtop.common;

import com.android.alibaba.ip.runtime.IpChange;
import mtopsdk.mtop.domain.MtopResponse;
import tb.kge;
import tb.riy;

/* loaded from: classes.dex */
public class MtopFinishEvent extends MtopEvent {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public MtopResponse mtopResponse;
    public String seqNo;

    static {
        kge.a(162879397);
    }

    public MtopFinishEvent(MtopResponse mtopResponse) {
        this.mtopResponse = mtopResponse;
    }

    public MtopResponse getMtopResponse() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MtopResponse) ipChange.ipc$dispatch("5c6f0275", new Object[]{this}) : this.mtopResponse;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder(128);
        sb.append("MtopFinishEvent [seqNo=");
        sb.append(this.seqNo);
        sb.append(", mtopResponse");
        sb.append(this.mtopResponse);
        sb.append(riy.ARRAY_END_STR);
        return sb.toString();
    }
}
