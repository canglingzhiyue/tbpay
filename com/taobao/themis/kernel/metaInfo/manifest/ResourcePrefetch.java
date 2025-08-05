package com.taobao.themis.kernel.metaInfo.manifest;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.List;
import tb.kge;

/* loaded from: classes9.dex */
public final class ResourcePrefetch implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private JSONObject headers;
    private String mimeType;
    private String pageId;
    private List<String> queryParams;
    private String src;

    static {
        kge.a(-708734427);
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

    public final String getMimeType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6adace75", new Object[]{this}) : this.mimeType;
    }

    public final void setMimeType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b5c5aa1", new Object[]{this, str});
        } else {
            this.mimeType = str;
        }
    }

    public final JSONObject getHeaders() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("1ff596f7", new Object[]{this}) : this.headers;
    }

    public final void setHeaders(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf8e9505", new Object[]{this, jSONObject});
        } else {
            this.headers = jSONObject;
        }
    }

    public final List<String> getQueryParams() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("2e28c4a8", new Object[]{this}) : this.queryParams;
    }

    public final void setQueryParams(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f271824", new Object[]{this, list});
        } else {
            this.queryParams = list;
        }
    }
}
