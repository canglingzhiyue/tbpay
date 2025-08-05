package mtopsdk.mtop.common;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;
import tb.riy;

@Deprecated
/* loaded from: classes9.dex */
public class MtopProgressEvent extends MtopEvent {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String desc;
    public String seqNo;
    public int size;
    public int total;

    static {
        kge.a(1661309643);
    }

    public MtopProgressEvent(String str, int i, int i2) {
        this.desc = str;
        this.size = i;
        this.total = i2;
    }

    public String getDesc() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f24b4252", new Object[]{this}) : this.desc;
    }

    public int getSize() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ae43b971", new Object[]{this})).intValue() : this.size;
    }

    public int getTotal() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("dcf28f08", new Object[]{this})).intValue() : this.total;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("MtopProgressEvent [seqNo=");
        sb.append(this.seqNo);
        sb.append(", desc=");
        sb.append(this.desc);
        sb.append(", size=");
        sb.append(this.size);
        sb.append(", total=");
        sb.append(this.total);
        sb.append(riy.ARRAY_END_STR);
        return sb.toString();
    }
}
