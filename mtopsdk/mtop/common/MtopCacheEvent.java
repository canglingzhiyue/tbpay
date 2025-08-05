package mtopsdk.mtop.common;

import com.android.alibaba.ip.runtime.IpChange;
import mtopsdk.mtop.domain.MtopResponse;
import tb.kge;
import tb.riy;

/* loaded from: classes9.dex */
public class MtopCacheEvent extends MtopFinishEvent {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-447970662);
    }

    public MtopCacheEvent(MtopResponse mtopResponse) {
        super(mtopResponse);
    }

    @Override // mtopsdk.mtop.common.MtopFinishEvent
    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder(128);
        sb.append("MtopCacheEvent [seqNo=");
        sb.append(this.seqNo);
        sb.append(", mtopResponse=");
        sb.append(this.mtopResponse);
        sb.append(riy.ARRAY_END_STR);
        return sb.toString();
    }
}
