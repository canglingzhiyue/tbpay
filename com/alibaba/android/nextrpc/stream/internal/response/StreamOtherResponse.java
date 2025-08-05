package com.alibaba.android.nextrpc.stream.internal.response;

import com.android.alibaba.ip.runtime.IpChange;
import mtopsdk.mtop.domain.MtopResponse;

/* loaded from: classes2.dex */
public class StreamOtherResponse extends AbsStreamResponse {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private byte[] byteData;
    private String mappingCode;
    private com.taobao.tao.stream.a mtopBaseStreamEvent;
    private int responseCode;
    private String[] ret;

    public StreamOtherResponse(com.taobao.tao.stream.a aVar, String str, String str2, int i, Object obj) {
        super(aVar != null ? aVar.f21112a : null, i, obj);
        this.mtopBaseStreamEvent = aVar;
        this.api = str;
        this.version = str2;
    }

    public void setByteData(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3aec3e2", new Object[]{this, bArr});
        } else {
            this.byteData = bArr;
        }
    }

    public void setRet(String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("923179", new Object[]{this, strArr});
        } else {
            this.ret = strArr;
        }
    }

    public int getResponseCode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("baa782be", new Object[]{this})).intValue() : this.responseCode;
    }

    public void setResponseCode(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75df560c", new Object[]{this, new Integer(i)});
        } else {
            this.responseCode = i;
        }
    }

    public String getMappingCode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8d754d74", new Object[]{this}) : this.mappingCode;
    }

    public void setMappingCode(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38eb8fea", new Object[]{this, str});
        } else {
            this.mappingCode = str;
        }
    }

    public com.taobao.tao.stream.a getMtopBaseStreamEvent() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.tao.stream.a) ipChange.ipc$dispatch("6b670bb1", new Object[]{this}) : this.mtopBaseStreamEvent;
    }

    @Override // com.alibaba.android.nextrpc.stream.internal.response.AbsStreamResponse
    public MtopResponse createMtopResponse() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopResponse) ipChange.ipc$dispatch("6994c98f", new Object[]{this});
        }
        MtopResponse mtopResponse = new MtopResponse();
        mtopResponse.setApi(this.api);
        mtopResponse.setRetCode(this.mtopBaseStreamEvent.b);
        mtopResponse.setRetMsg(this.mtopBaseStreamEvent.c);
        mtopResponse.setV(this.version);
        mtopResponse.setHeaderFields(this.mtopBaseStreamEvent.f21112a);
        mtopResponse.setResponseCode(this.responseCode);
        mtopResponse.mappingCode = this.mappingCode;
        mtopResponse.setRet(this.ret);
        mtopResponse.setBytedata(this.byteData);
        return mtopResponse;
    }
}
