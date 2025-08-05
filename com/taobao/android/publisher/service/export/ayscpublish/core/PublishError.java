package com.taobao.android.publisher.service.export.ayscpublish.core;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import tb.icp;

/* loaded from: classes6.dex */
public class PublishError implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CODE_COPY_ERROR = "copy_error";
    public static final String CODE_DATA_ERROR = "data_parse_error";
    public static final String CODE_EXCEED_RETRY_COUNT = "exceed_retry_count";
    public static final String CODE_KFC_ERROR = "PARAM_ERROR";
    public static final String CODE_PHOTOS_ERROR = "missing_photo_error";
    public static final String CODE_TRANSCODE_ERROR = "transcode_error";
    public static final String CODE_UPLOAD_ERROR = "upload_error";
    public String errorCode;
    public String errorMsg;
    private boolean isFatalError;

    public PublishError(String str, String str2, boolean z) {
        this.errorCode = "";
        this.errorMsg = "";
        this.isFatalError = false;
        if (str != null) {
            this.errorCode = str;
        }
        if (str2 != null) {
            this.errorMsg = str2;
        }
        this.isFatalError = z;
    }

    public void setError(String str, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac047813", new Object[]{this, str, str2, new Boolean(z)});
            return;
        }
        if (str != null) {
            this.errorCode = str;
        }
        if (str2 != null) {
            this.errorMsg = str2;
        }
        this.isFatalError = z;
    }

    public PublishError(String str, String str2) {
        this(str, str2, false);
    }

    public PublishError() {
        this("", "");
    }

    public boolean isFatalError() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("85d5e9b9", new Object[]{this})).booleanValue() : this.isFatalError;
    }

    public boolean isNetworkError() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("8b23294f", new Object[]{this})).booleanValue() : icp.a().b().a(this.errorCode);
    }
}
