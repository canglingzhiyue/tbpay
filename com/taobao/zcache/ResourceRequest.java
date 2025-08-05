package com.taobao.zcache;

import anet.channel.util.HttpConstant;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.remotebusiness.js.MtopJSBridge;
import java.util.Map;
import tb.kge;

/* loaded from: classes9.dex */
public class ResourceRequest {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final Map<String, String> _header;
    private String _md5;
    private String _packName;
    private String _packVersion;
    private final String _referrer;
    private RequestType _requestType;
    private String _traceId;
    private final String _url;

    static {
        kge.a(-891198547);
    }

    public ResourceRequest(String str) {
        this._traceId = null;
        this._requestType = RequestType.Normal;
        this._packName = null;
        this._packVersion = null;
        this._md5 = null;
        this._url = str;
        this._referrer = null;
        this._header = null;
    }

    public ResourceRequest(String str, String str2) {
        this._traceId = null;
        this._requestType = RequestType.Normal;
        this._packName = null;
        this._packVersion = null;
        this._md5 = null;
        this._url = str;
        this._referrer = str2;
        this._header = null;
    }

    public ResourceRequest(String str, Map<String, String> map) {
        this._traceId = null;
        this._requestType = RequestType.Normal;
        this._packName = null;
        this._packVersion = null;
        this._md5 = null;
        this._url = str;
        this._header = map;
        this._referrer = getReferrerFromHeader(map);
    }

    private static String getReferrerFromHeader(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("57ecc48e", new Object[]{map});
        }
        if (map == null) {
            return null;
        }
        if (map.containsKey(HttpConstant.REFERER)) {
            return map.get(HttpConstant.REFERER);
        }
        if (!map.containsKey(MtopJSBridge.MtopJSParam.REFERER)) {
            return null;
        }
        return map.get(MtopJSBridge.MtopJSParam.REFERER);
    }

    public String getUrl() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("de8f0660", new Object[]{this}) : this._url;
    }

    public String getReferrer() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("2335b484", new Object[]{this}) : this._referrer;
    }

    public Map<String, String> getHeader() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("65ea693f", new Object[]{this}) : this._header;
    }

    public String getTraceId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9afc202f", new Object[]{this}) : this._traceId;
    }

    public void setTraceId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb8b6e8f", new Object[]{this, str});
        } else {
            this._traceId = str;
        }
    }

    public RequestType getRequestType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RequestType) ipChange.ipc$dispatch("6222596", new Object[]{this}) : this._requestType;
    }

    public int getRequestTypeValue() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("372e178", new Object[]{this})).intValue() : this._requestType.value;
    }

    public void setRequestType(RequestType requestType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ce2acfe", new Object[]{this, requestType});
        } else {
            this._requestType = requestType;
        }
    }

    public String getPackName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("96538d7f", new Object[]{this}) : this._packName;
    }

    public void setPackName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("befb7cd7", new Object[]{this, str});
        } else {
            this._packName = str;
        }
    }

    public String getPackVersion() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("4b858b50", new Object[]{this}) : this._packVersion;
    }

    public void setPackVersion(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ce30d8e", new Object[]{this, str});
        } else {
            this._packVersion = str;
        }
    }

    public String getMD5() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c2dded91", new Object[]{this}) : this._md5;
    }

    public void setMD5(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("876ca76d", new Object[]{this, str});
        } else {
            this._md5 = str;
        }
    }
}
