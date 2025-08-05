package com.taobao.android.pissarro.adaptive.network;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.Map;
import tb.kge;

/* loaded from: classes6.dex */
public class Request implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String apiName;
    private boolean needEcode;
    private boolean needSession;
    private boolean needWua;
    private Map<String, Serializable> parameters;
    private RequestType type = RequestType.GET;
    private String version;

    /* loaded from: classes6.dex */
    public enum RequestType {
        GET,
        POST
    }

    static {
        kge.a(-1992238390);
        kge.a(1028243835);
    }

    public Request(String str, String str2) {
        this.apiName = str;
        this.version = str2;
    }

    public String getApiName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8523c6ca", new Object[]{this}) : this.apiName;
    }

    public void setApiName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26589b54", new Object[]{this, str});
        } else {
            this.apiName = str;
        }
    }

    public boolean isNeedEcode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f430765d", new Object[]{this})).booleanValue() : this.needEcode;
    }

    public void setNeedEcode(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1c1b4d3", new Object[]{this, new Boolean(z)});
        } else {
            this.needEcode = z;
        }
    }

    public boolean isNeedSession() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("64a44321", new Object[]{this})).booleanValue() : this.needSession;
    }

    public void setNeedSession(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1d1128f", new Object[]{this, new Boolean(z)});
        } else {
            this.needSession = z;
        }
    }

    public Map<String, Serializable> getParameters() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("367605c", new Object[]{this}) : this.parameters;
    }

    public void setParameters(Map<String, Serializable> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c38950b2", new Object[]{this, map});
        } else {
            this.parameters = map;
        }
    }

    public String getVersion() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("2a8fef97", new Object[]{this}) : this.version;
    }

    public void setVersion(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e718c27", new Object[]{this, str});
        } else {
            this.version = str;
        }
    }

    public boolean isNeedWua() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e179ef4e", new Object[]{this})).booleanValue() : this.needWua;
    }

    public void setNeedWua(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12614802", new Object[]{this, new Boolean(z)});
        } else {
            this.needWua = z;
        }
    }

    public RequestType getType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RequestType) ipChange.ipc$dispatch("abc7bc1f", new Object[]{this}) : this.type;
    }

    public void setType(RequestType requestType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("639713a3", new Object[]{this, requestType});
        } else {
            this.type = requestType;
        }
    }
}
