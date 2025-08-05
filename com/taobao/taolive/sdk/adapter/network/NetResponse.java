package com.taobao.taolive.sdk.adapter.network;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
import tb.kge;

/* loaded from: classes8.dex */
public class NetResponse implements INetDataObject, Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final long serialVersionUID = 8582228520750197871L;
    private String api;
    private byte[] bytedata;
    private JSONObject dataJsonObject;
    private Map<String, List<String>> headerFields;
    private String responseCode;
    private String retCode;
    private String retMsg;
    private String v;

    static {
        kge.a(957978452);
        kge.a(1028243835);
        kge.a(-540945145);
    }

    public String getRetCode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9f243c01", new Object[]{this}) : this.retCode;
    }

    public void setRetCode(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c66ccfd", new Object[]{this, str});
        } else {
            this.retCode = str;
        }
    }

    public String getRetMsg() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("a526aea3", new Object[]{this}) : this.retMsg;
    }

    public void setRetMsg(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f591333", new Object[]{this, str});
        } else {
            this.retMsg = str;
        }
    }

    public String getApi() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("67b7a95", new Object[]{this}) : this.api;
    }

    public void setApi(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b780bae9", new Object[]{this, str});
        } else {
            this.api = str;
        }
    }

    public String getV() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("22bdab39", new Object[]{this}) : this.v;
    }

    public void setV(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("efe82bc5", new Object[]{this, str});
        } else {
            this.v = str;
        }
    }

    public JSONObject getDataJsonObject() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("7e24c17c", new Object[]{this}) : this.dataJsonObject;
    }

    public void setDataJsonObject(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18777064", new Object[]{this, jSONObject});
        } else {
            this.dataJsonObject = jSONObject;
        }
    }

    public boolean isApiSuccess() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d4a34c5e", new Object[]{this})).booleanValue() : "SUCCESS".equals(getRetCode()) && getBytedata() != null;
    }

    public Map<String, List<String>> getHeaderFields() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("d9dad198", new Object[]{this}) : this.headerFields;
    }

    public void setHeaderFields(Map<String, List<String>> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36be39f6", new Object[]{this, map});
        } else {
            this.headerFields = map;
        }
    }

    public byte[] getBytedata() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (byte[]) ipChange.ipc$dispatch("6e9b5c0e", new Object[]{this}) : this.bytedata;
    }

    public void setBytedata(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2cdce7c2", new Object[]{this, bArr});
        } else {
            this.bytedata = bArr;
        }
    }

    public String getResponseCode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("45f50135", new Object[]{this}) : this.responseCode;
    }

    public void setResponseCode(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94999e1", new Object[]{this, str});
        } else {
            this.responseCode = str;
        }
    }
}
