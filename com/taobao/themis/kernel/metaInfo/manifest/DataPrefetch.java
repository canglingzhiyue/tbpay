package com.taobao.themis.kernel.metaInfo.manifest;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import tb.kge;

/* loaded from: classes9.dex */
public final class DataPrefetch implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String api;
    private JSONObject data;
    private JSONObject extHeaders;
    private String needLogin;
    private String pageId;
    private String src;
    private String type;
    private String v;

    static {
        kge.a(1433952705);
        kge.a(1028243835);
    }

    public final String getPageId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("551c67f9", new Object[]{this}) : this.pageId;
    }

    public final void setPageId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee1a849d", new Object[]{this, str});
        } else {
            this.pageId = str;
        }
    }

    public final String getSrc() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("2bd8590b", new Object[]{this}) : this.src;
    }

    public final void setSrc(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dbfab33", new Object[]{this, str});
        } else {
            this.src = str;
        }
    }

    public final String getType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("13e5e549", new Object[]{this}) : this.type;
    }

    public final void setType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd56044d", new Object[]{this, str});
        } else {
            this.type = str;
        }
    }

    public final String getApi() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("67b7a95", new Object[]{this}) : this.api;
    }

    public final void setApi(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b780bae9", new Object[]{this, str});
        } else {
            this.api = str;
        }
    }

    public final String getNeedLogin() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f2c4415c", new Object[]{this}) : this.needLogin;
    }

    public final void setNeedLogin(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e801a602", new Object[]{this, str});
        } else {
            this.needLogin = str;
        }
    }

    public final String getV() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("22bdab39", new Object[]{this}) : this.v;
    }

    public final void setV(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("efe82bc5", new Object[]{this, str});
        } else {
            this.v = str;
        }
    }

    public final JSONObject getData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("b8351bc7", new Object[]{this}) : this.data;
    }

    public final void setData(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d09acf9d", new Object[]{this, jSONObject});
        } else {
            this.data = jSONObject;
        }
    }

    public final JSONObject getExtHeaders() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("d0ab6042", new Object[]{this}) : this.extHeaders;
    }

    public final void setExtHeaders(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7cbf382", new Object[]{this, jSONObject});
        } else {
            this.extHeaders = jSONObject;
        }
    }
}
