package com.taobao.taopai2.material.exception;

import com.android.alibaba.ip.runtime.IpChange;
import mtopsdk.mtop.domain.MtopResponse;
import tb.kge;

/* loaded from: classes8.dex */
public class ResponseDataException extends MaterialException {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private MtopResponse response;

    static {
        kge.a(-1969768990);
    }

    public ResponseDataException(MtopResponse mtopResponse, String str) {
        super(str);
        this.response = mtopResponse;
    }

    @Override // com.taobao.taopai2.material.exception.MaterialException
    public String getErrorCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f72feefa", new Object[]{this});
        }
        MtopResponse mtopResponse = this.response;
        if (mtopResponse != null) {
            return mtopResponse.getRetCode();
        }
        return this.errorCode;
    }

    @Override // com.taobao.taopai2.material.exception.MaterialException
    public String getErrorInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e9ecaad9", new Object[]{this});
        }
        MtopResponse mtopResponse = this.response;
        if (mtopResponse != null) {
            if (mtopResponse.getMtopStat() != null) {
                return this.response.getMtopStat().toString();
            }
            return this.response.getRetCode() + "|" + this.response.getMappingCode();
        }
        return getMessage();
    }
}
