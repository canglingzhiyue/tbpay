package com.alibaba.security.realidentity.biz.bucket;

import android.content.Context;
import com.alibaba.security.common.http.model.HttpRequest;
import com.alibaba.security.realidentity.RPResult;
import com.alibaba.security.realidentity.biz.config.RPBizConfig;
import com.alibaba.security.realidentity.h1;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;

/* loaded from: classes3.dex */
public abstract class BucketParams {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public ErrorCode f3370a;
    public String b;
    public Context c;
    public RPBizConfig d;

    /* loaded from: classes3.dex */
    public static class ErrorCode implements Serializable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public RPResult audit;
        public String errorCode;
        public String errorMsg;
        public int globalErrorCode;

        public ErrorCode() {
        }

        public static ErrorCode createAuditNotCode() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ErrorCode) ipChange.ipc$dispatch("66d10634", new Object[0]);
            }
            ErrorCode errorCode = new ErrorCode();
            errorCode.audit = RPResult.AUDIT_NOT;
            return errorCode;
        }

        public static ErrorCode createAuditPassCode() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ErrorCode) ipChange.ipc$dispatch("f83c1710", new Object[0]);
            }
            ErrorCode errorCode = new ErrorCode();
            errorCode.audit = RPResult.AUDIT_PASS;
            return errorCode;
        }

        public ErrorCode(RPResult rPResult, String str, String str2, int i) {
            this.audit = rPResult;
            this.errorCode = str;
            this.errorMsg = str2;
            this.globalErrorCode = i;
        }
    }

    public BucketParams(Context context, RPBizConfig rPBizConfig) {
        this.c = context;
        this.d = rPBizConfig;
        this.b = rPBizConfig.getBasicsConfig().verifyToken;
        ErrorCode errorCode = new ErrorCode();
        this.f3370a = errorCode;
        errorCode.globalErrorCode = -10000;
        errorCode.errorCode = String.valueOf(-10000);
    }

    public abstract HttpRequest a();

    public boolean a(h1 h1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a2b1e86d", new Object[]{this, h1Var})).booleanValue();
        }
        b(h1Var);
        return true;
    }

    public ErrorCode b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ErrorCode) ipChange.ipc$dispatch("bc7f2775", new Object[]{this}) : this.f3370a;
    }

    public abstract boolean b(h1 h1Var);

    public abstract ErrorCode c();

    public void a(ErrorCode errorCode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d251bf4", new Object[]{this, errorCode});
        } else {
            this.f3370a = errorCode;
        }
    }
}
