package com.taobao.zcache;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import tb.kge;

/* loaded from: classes9.dex */
public class ResourceResponse {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final boolean _is404;
    private final boolean _isAllFromCache;
    private final byte[] data;
    private final Error error;
    private final Map<String, String> header;
    private final String md5;

    static {
        kge.a(-1804417309);
    }

    public ResourceResponse(byte[] bArr, String str, Map<String, String> map, Error error, boolean z, boolean z2) {
        this.data = bArr;
        this.md5 = str;
        this.header = map;
        this.error = error;
        this._isAllFromCache = z;
        this._is404 = z2;
    }

    public static ResourceResponse getErrorResponse(Error error) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ResourceResponse) ipChange.ipc$dispatch("84429b6f", new Object[]{error});
        }
        HashMap hashMap = new HashMap();
        hashMap.put("X-ZCache-Info", ",0," + error.getCode());
        return new ResourceResponse(null, null, hashMap, error, false, false);
    }

    public byte[] getData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (byte[]) ipChange.ipc$dispatch("e6eec916", new Object[]{this}) : this.data;
    }

    public String getMD5() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c2dded91", new Object[]{this}) : this.md5;
    }

    public Map<String, String> getHeader() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("65ea693f", new Object[]{this}) : this.header;
    }

    public Error getError() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Error) ipChange.ipc$dispatch("6e37ef76", new Object[]{this}) : this.error;
    }

    public boolean isAllFromCache() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e20e8bac", new Object[]{this})).booleanValue() : this._isAllFromCache;
    }

    public boolean is404() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("8dd7a159", new Object[]{this})).booleanValue() : this._is404;
    }
}
