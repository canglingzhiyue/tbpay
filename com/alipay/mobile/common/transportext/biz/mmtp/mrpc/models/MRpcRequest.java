package com.alipay.mobile.common.transportext.biz.mmtp.mrpc.models;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.LinkedHashMap;
import java.util.Map;
import tb.riy;

/* loaded from: classes3.dex */
public class MRpcRequest {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private String f5691a;
    private byte[] c;
    public int connTimeout;
    public Map<String, String> extParams;
    public int readTimeout;
    public int sslTimeout;
    public int taskTimeout;
    private Map<String, String> b = new LinkedHashMap(13);
    public int reqSeqId = -1;
    public boolean important = false;
    public boolean isUrgent = false;
    public boolean localAmnet = false;
    public boolean isCustGwUrl = false;
    public boolean isMultiLink = false;

    public MRpcRequest(String str) {
        this.f5691a = str;
    }

    public void setDatas(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9034915", new Object[]{this, bArr});
        } else {
            this.c = bArr;
        }
    }

    public byte[] getDatas() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (byte[]) ipChange.ipc$dispatch("6cfc1cc3", new Object[]{this}) : this.c;
    }

    public String getUrl() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("de8f0660", new Object[]{this}) : this.f5691a;
    }

    public void addHeader(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8f9a6a9", new Object[]{this, str, str2});
        } else {
            this.b.put(str, str2);
        }
    }

    public Map<String, String> getHeaders() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("cf4415cc", new Object[]{this}) : this.b;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "MRpcRequest [url=" + this.f5691a + ", isCustGwUrl=" + this.isCustGwUrl + ",isMultiLink=" + this.isMultiLink + ", localAmnet=" + this.localAmnet + ", headers=" + this.b + ", datas=" + new String(this.c) + ", readTimeout=" + this.readTimeout + ",taskTimeout=" + this.taskTimeout + riy.ARRAY_END_STR;
    }
}
