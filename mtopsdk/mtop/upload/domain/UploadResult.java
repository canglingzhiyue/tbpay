package mtopsdk.mtop.upload.domain;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;
import tb.riy;

/* loaded from: classes9.dex */
public class UploadResult {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public boolean isFinish;
    public String location;
    public String serverRT;

    static {
        kge.a(177176581);
    }

    public UploadResult(boolean z, String str) {
        this.isFinish = false;
        this.isFinish = z;
        this.location = str;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("UploadResult [isFinish=");
        sb.append(this.isFinish);
        sb.append("location=");
        sb.append("location");
        sb.append("serverRT=");
        sb.append("serverRT");
        sb.append(riy.ARRAY_END_STR);
        return sb.toString();
    }
}
