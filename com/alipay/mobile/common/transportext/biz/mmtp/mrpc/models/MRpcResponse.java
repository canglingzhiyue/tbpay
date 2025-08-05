package com.alipay.mobile.common.transportext.biz.mmtp.mrpc.models;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import tb.riy;

/* loaded from: classes3.dex */
public class MRpcResponse {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public int airTime;
    public int amnetAllTime;
    public int amnetEncodeTime;
    public int amnetHungTime;
    public int amnetStalledTime;
    public int amnetWaitTiming;
    public byte[] body;
    public long cid;
    public int ctjOutTime;
    public int dnsTiming;
    public Map<String, String> extMap;
    public Map<String, String> headers;
    public int ipcP2m;
    public boolean isOnShort;
    public int jtcTiming;
    public String mtag;
    public int ntIOTime;
    public String queneStorage;
    public int queueOutTime;
    public int readTiming;
    public int reqSize;
    public int respSize;
    public int resultCode;
    public String resultMsg;
    public boolean retried;
    public int saTime;
    public int sslNtv;
    public int sslTiming;
    public int streamId;
    public String targetHostShort;
    public int tcpNtv;
    public int tcpTiming;
    public boolean useShort;
    public String targetHost = "";
    public int qoeCur = -1;
    public boolean isFlexible = false;
    public String clientIp = "";
    public int reqZipType = -1;
    public int rspZipType = -1;
    public boolean isUseBifrost = false;
    public boolean isUseHttp2 = false;
    public int ipStack = -1;

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder();
        sb.append("MRpcResponse [headers=");
        Map<String, String> map = this.headers;
        if (map == null) {
            map = "is null";
        }
        sb.append(map);
        sb.append(", body=");
        byte[] bArr = this.body;
        sb.append(bArr != null ? new String(bArr) : "is null");
        sb.append(", resultCode=");
        sb.append(this.resultCode);
        sb.append(", resultMsg=");
        String str = this.resultMsg;
        if (str == null) {
            str = "is null";
        }
        sb.append(str);
        sb.append(", extMap=");
        Map<String, String> map2 = this.extMap;
        if (map2 == null) {
            map2 = "is null";
        }
        sb.append(map2);
        sb.append(riy.ARRAY_END_STR);
        return sb.toString();
    }

    public void addExtInfo(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34d2dea9", new Object[]{this, str, str2});
        } else {
            getExtMap().put(str, str2);
        }
    }

    public Map<String, String> getExtMap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("93e6caad", new Object[]{this});
        }
        if (this.extMap == null) {
            this.extMap = new HashMap(3);
        }
        return this.extMap;
    }

    public Map<String, String> getHeaders() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("cf4415cc", new Object[]{this}) : this.headers;
    }
}
