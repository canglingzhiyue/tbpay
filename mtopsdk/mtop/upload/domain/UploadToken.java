package mtopsdk.mtop.upload.domain;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import mtopsdk.common.util.StringUtils;
import tb.kge;
import tb.riy;

/* loaded from: classes9.dex */
public class UploadToken {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String bizCode;
    public String domain;
    public FileBaseInfo fileBaseInfo;
    public long retryCount;
    public long segmentSize;
    public String token;
    public Map<String, String> tokenParams;
    public AtomicLong uploadedLength = new AtomicLong();
    public boolean useHttps;

    static {
        kge.a(1254778129);
    }

    public boolean isValid() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3fef87d", new Object[]{this})).booleanValue();
        }
        FileBaseInfo fileBaseInfo = this.fileBaseInfo;
        return fileBaseInfo != null && fileBaseInfo.fileSize > 0 && this.segmentSize > 0 && !StringUtils.isBlank(this.token) && !StringUtils.isBlank(this.domain);
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder(64);
        sb.append("UploadToken [token=");
        sb.append(this.token);
        sb.append(", domain=");
        sb.append(this.domain);
        sb.append(", tokenParams=");
        sb.append(this.tokenParams);
        sb.append(", retryCount=");
        sb.append(this.retryCount);
        sb.append(", patchSize=");
        sb.append(this.segmentSize);
        sb.append(", fileBaseInfo=");
        sb.append(this.fileBaseInfo);
        sb.append(riy.ARRAY_END_STR);
        return sb.toString();
    }
}
