package com.taobao.taolive.sdk.adapter.network;

import android.os.Handler;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.Map;
import tb.kge;

/* loaded from: classes8.dex */
public class NetRequest implements INetDataObject, Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final long serialVersionUID = 4662483339645196288L;
    private String apiName;
    public Map<String, String> dataParams;
    private String dataType;
    private boolean isPost;
    private Handler mRequestNotifyHandler;
    private boolean needEcode;
    private boolean needSession;
    private Object requestContext;
    private Map<String, String> requestHeaders;
    private String sessionOption;
    private long timer;
    private String ttid;
    private String version;
    private String data = "{}";
    private String bizId = "-1";
    private boolean isUseWua = false;

    static {
        kge.a(1691762972);
        kge.a(1028243835);
        kge.a(-540945145);
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

    public String getData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("3f6b2ad9", new Object[]{this}) : this.data;
    }

    public void setData(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("427970bd", new Object[]{this, str});
        } else {
            this.data = str;
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

    public Map<String, String> getDataParams() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("42c19ec2", new Object[]{this}) : this.dataParams;
    }

    public void setDataParams(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f76df0c", new Object[]{this, map});
        } else {
            this.dataParams = map;
        }
    }

    public boolean isUseWua() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("84e1d191", new Object[]{this})).booleanValue() : this.isUseWua;
    }

    public void setUseWua(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dba030af", new Object[]{this, new Boolean(z)});
        } else {
            this.isUseWua = z;
        }
    }

    public String getBizId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d09a5221", new Object[]{this}) : this.bizId;
    }

    public void setBizId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef8887dd", new Object[]{this, str});
        } else {
            this.bizId = str;
        }
    }

    public Map<String, String> getRequestHeaders() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("a1965029", new Object[]{this}) : this.requestHeaders;
    }

    public void setRequestHeaders(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbec0085", new Object[]{this, map});
        } else {
            this.requestHeaders = map;
        }
    }

    public Object getRequestContext() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("340f8235", new Object[]{this}) : this.requestContext;
    }

    public void setRequestContext(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76c47c45", new Object[]{this, obj});
        } else {
            this.requestContext = obj;
        }
    }

    public String getTtid() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("99fd2f88", new Object[]{this}) : this.ttid;
    }

    public void setTtid(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a2801ee", new Object[]{this, str});
        } else {
            this.ttid = str;
        }
    }

    public boolean isPost() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("fdc47475", new Object[]{this})).booleanValue() : this.isPost;
    }

    public void setPost(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d04ebc4b", new Object[]{this, new Boolean(z)});
        } else {
            this.isPost = z;
        }
    }

    public String getDataType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("fa55b3bf", new Object[]{this}) : this.dataType;
    }

    public void setDataType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db3e1e97", new Object[]{this, str});
        } else {
            this.dataType = str;
        }
    }

    public long getTimer() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("287d28a", new Object[]{this})).longValue() : this.timer;
    }

    public void setTimer(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c9744fa", new Object[]{this, new Long(j)});
        } else {
            this.timer = j;
        }
    }

    public String getSessionOption() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("85801f24", new Object[]{this}) : this.sessionOption;
    }

    public void setSessionOption(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f23a73a", new Object[]{this, str});
        } else {
            this.sessionOption = str;
        }
    }

    public Handler getRequestNotifyHandler() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Handler) ipChange.ipc$dispatch("a71573f7", new Object[]{this}) : this.mRequestNotifyHandler;
    }

    public void setRequestNotifyHandler(Handler handler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0731b2b", new Object[]{this, handler});
        } else {
            this.mRequestNotifyHandler = handler;
        }
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "NetRequest{apiName='" + this.apiName + "', version='" + this.version + "', data='" + this.data + "', needEcode=" + this.needEcode + ", needSession=" + this.needSession + ", dataParams=" + this.dataParams + ", requestContext=" + this.requestContext + ", isPost=" + this.isPost + ", timer=" + this.timer + ", sessionOption='" + this.sessionOption + "', dataType='" + this.dataType + "', requestHeaders=" + this.requestHeaders + ", bizId='" + this.bizId + "', ttid='" + this.ttid + "', isUseWua=" + this.isUseWua + '}';
    }
}
