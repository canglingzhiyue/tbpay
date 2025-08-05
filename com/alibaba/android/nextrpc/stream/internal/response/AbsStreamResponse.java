package com.alibaba.android.nextrpc.stream.internal.response;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import mtopsdk.mtop.domain.MtopResponse;

/* loaded from: classes2.dex */
public abstract class AbsStreamResponse implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int FIRST_MAIN_NUM = 1;
    private static final long serialVersionUID = 1;
    public String api;
    public JSONObject data;
    public String finishType;
    private final Map<String, List<String>> headers;
    private int mainNum;
    public final Object mtopRequestContext;
    public final int mtopRequestType;
    public MtopResponse mtopResponse;
    public String retCode;
    public String retMsg;
    public String version;

    public MtopResponse createMtopResponse() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopResponse) ipChange.ipc$dispatch("6994c98f", new Object[]{this});
        }
        return null;
    }

    public AbsStreamResponse(Map<String, List<String>> map, int i, Object obj) {
        this.headers = map;
        this.mtopRequestType = i;
        this.mtopRequestContext = obj;
    }

    public String getApi() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("67b7a95", new Object[]{this}) : this.api;
    }

    public String getVersion() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("2a8fef97", new Object[]{this}) : this.version;
    }

    public int getMainNum() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("2dbfa3d1", new Object[]{this})).intValue() : this.mainNum;
    }

    public void setMainNum(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c07e45f1", new Object[]{this, new Integer(i)});
        } else {
            this.mainNum = i;
        }
    }

    public Map<String, List<String>> getHeaders() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("cf4415cc", new Object[]{this}) : this.headers;
    }

    public MtopResponse getMtopResponse() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopResponse) ipChange.ipc$dispatch("5c6f0275", new Object[]{this});
        }
        if (this.mtopResponse == null) {
            this.mtopResponse = createMtopResponse();
        }
        return this.mtopResponse;
    }

    public int getMtopRequestType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("dbd03c45", new Object[]{this})).intValue() : this.mtopRequestType;
    }

    public Object getMtopRequestContext() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("7c97b24d", new Object[]{this}) : this.mtopRequestContext;
    }

    public JSONObject getData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("b8351bc7", new Object[]{this}) : this.data;
    }

    public void setData(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d09acf9d", new Object[]{this, jSONObject});
        } else {
            this.data = jSONObject;
        }
    }

    public String getRetCode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9f243c01", new Object[]{this}) : this.retCode;
    }

    public String getRetMsg() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("a526aea3", new Object[]{this}) : this.retMsg;
    }

    public void setRetCode(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c66ccfd", new Object[]{this, str});
        } else {
            this.retCode = str;
        }
    }

    public void setRetMsg(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f591333", new Object[]{this, str});
        } else {
            this.retMsg = str;
        }
    }

    public String getFinishType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b4565476", new Object[]{this}) : this.finishType;
    }

    public void setFinishType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d5dc1c0", new Object[]{this, str});
        } else {
            this.finishType = str;
        }
    }
}
