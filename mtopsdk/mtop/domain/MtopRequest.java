package mtopsdk.mtop.domain;

import java.io.Serializable;
import java.util.Map;
import mtopsdk.common.util.StringUtils;
import tb.kge;
import tb.riy;

/* loaded from: classes.dex */
public class MtopRequest implements Serializable, IMTOPDataObject {
    private static final long serialVersionUID = -439476282014493612L;
    private String apiName;
    public Map<String, String> dataParams;
    private boolean needEcode;
    private boolean needSession;
    private String version;
    private String data = "{}";
    private String requestLog = "";

    static {
        kge.a(-790217530);
        kge.a(1028243835);
        kge.a(-350052935);
    }

    public String getApiName() {
        return this.apiName;
    }

    public void setApiName(String str) {
        this.apiName = str;
    }

    public String getVersion() {
        return this.version;
    }

    public void setVersion(String str) {
        this.version = str;
    }

    public String getData() {
        return this.data;
    }

    public void setData(String str) {
        this.data = str;
    }

    public boolean isNeedEcode() {
        return this.needEcode;
    }

    public void setNeedEcode(boolean z) {
        this.needEcode = z;
    }

    public boolean isNeedSession() {
        return this.needSession;
    }

    public void setNeedSession(boolean z) {
        this.needSession = z;
    }

    public boolean isLegalRequest() {
        return StringUtils.isNotBlank(this.apiName) && StringUtils.isNotBlank(this.version) && StringUtils.isNotBlank(this.data);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(64);
        sb.append("MtopRequest [apiName=");
        sb.append(this.apiName);
        sb.append(", version=");
        sb.append(this.version);
        sb.append(", data=");
        sb.append(this.data);
        sb.append(", needEcode=");
        sb.append(this.needEcode);
        sb.append(", needSession=");
        sb.append(this.needSession);
        sb.append(riy.ARRAY_END_STR);
        return sb.toString();
    }

    public String getRequestLog() {
        if (StringUtils.isBlank(this.requestLog)) {
            StringBuilder sb = new StringBuilder(64);
            sb.append("MtopRequest [apiName=");
            sb.append(this.apiName);
            sb.append(", version=");
            sb.append(this.version);
            sb.append(", needEcode=");
            sb.append(this.needEcode);
            sb.append(", needSession=");
            sb.append(this.needSession);
            sb.append(riy.ARRAY_END_STR);
            this.requestLog = sb.toString();
        }
        return this.requestLog;
    }

    public String getKey() {
        if (StringUtils.isBlank(this.apiName) || StringUtils.isBlank(this.version)) {
            return null;
        }
        return StringUtils.concatStr2LowerCase(this.apiName, this.version);
    }
}
