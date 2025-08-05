package mtopsdk.mtop.common;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.Map;
import tb.kge;
import tb.riy;

/* loaded from: classes9.dex */
public class MtopHeaderEvent extends MtopEvent {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private int code;
    private Map<String, List<String>> headers;
    public String seqNo;

    static {
        kge.a(-872981);
    }

    public MtopHeaderEvent(int i, Map<String, List<String>> map) {
        this.code = i;
        this.headers = map;
    }

    public int getCode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("480bb15d", new Object[]{this})).intValue() : this.code;
    }

    public Map<String, List<String>> getHeader() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("65ea693f", new Object[]{this}) : this.headers;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder(128);
        sb.append("MtopHeaderEvent [seqNo=");
        sb.append(this.seqNo);
        sb.append(", code=");
        sb.append(this.code);
        sb.append(", headers=");
        sb.append(this.headers);
        sb.append(riy.ARRAY_END_STR);
        return sb.toString();
    }
}
