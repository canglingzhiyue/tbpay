package com.alibaba.security.realidentity.biz.uploadresult;

import android.text.TextUtils;
import com.alibaba.security.common.http.model.HttpResponse;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;

/* loaded from: classes3.dex */
public class UploadResultHttpResponse extends HttpResponse {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public Result result;

    /* loaded from: classes3.dex */
    public static class Result implements Serializable {
        public String uploadId;
        public UploadStatus uploadStatus;
    }

    /* loaded from: classes3.dex */
    public static class UploadStatus implements Serializable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public String code;
        public String name;

        public boolean isSuccess() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6049a784", new Object[]{this})).booleanValue() : TextUtils.equals("UPLOAD_STATUS_SUCCESS", this.name);
        }
    }

    @Override // com.alibaba.security.common.http.model.HttpResponse
    public boolean isSuccessful() {
        UploadStatus uploadStatus;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("349bd9ef", new Object[]{this})).booleanValue();
        }
        Result result = this.result;
        return (result == null || (uploadStatus = result.uploadStatus) == null || !uploadStatus.isSuccess()) ? false : true;
    }
}
