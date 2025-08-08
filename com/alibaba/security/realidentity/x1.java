package com.alibaba.security.realidentity;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import com.alibaba.security.common.http.model.HttpRequest;
import com.alibaba.security.common.http.model.HttpResponse;
import com.alibaba.security.realidentity.biz.bucket.BucketParams;
import com.alibaba.security.realidentity.biz.config.RPBizConfig;
import com.alibaba.security.realidentity.biz.submit.SubmitHttpRequest;
import com.alibaba.security.realidentity.biz.submit.SubmitHttpResponse;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class x1 extends o1 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int h = 0;
    public static final int i = 2;
    public SubmitHttpResponse g;

    public x1(Context context, RPBizConfig rPBizConfig) {
        super(context, rPBizConfig);
    }

    @Override // com.alibaba.security.realidentity.biz.bucket.BucketParams
    public HttpRequest a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HttpRequest) ipChange.ipc$dispatch("1def818d", new Object[]{this});
        }
        SubmitHttpRequest submitHttpRequest = new SubmitHttpRequest(this.b, "");
        a(submitHttpRequest);
        return submitHttpRequest;
    }

    @Override // com.alibaba.security.realidentity.biz.bucket.BucketParams
    public boolean b(h1 h1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("87f3572e", new Object[]{this, h1Var})).booleanValue();
        }
        return false;
    }

    @Override // com.alibaba.security.realidentity.biz.bucket.BucketParams
    public BucketParams.ErrorCode c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BucketParams.ErrorCode) ipChange.ipc$dispatch("838b0e76", new Object[]{this});
        }
        SubmitHttpResponse submitHttpResponse = this.g;
        if (submitHttpResponse == null) {
            return new BucketParams.ErrorCode(RPResult.AUDIT_NOT, String.valueOf((int) e2.A), "submit fail by response is null", e2.A);
        }
        if (submitHttpResponse.isSuccessful()) {
            return new BucketParams.ErrorCode(RPResult.AUDIT_PASS, String.valueOf(0), "submit result success", 0);
        }
        int status = this.g.getStatus();
        if (status == 0) {
            return new BucketParams.ErrorCode(RPResult.AUDIT_IN_AUDIT, String.valueOf(status), b.a(this.g), e2.C);
        }
        if (status == 2) {
            try {
                return new BucketParams.ErrorCode(RPResult.AUDIT_FAIL, String.valueOf(status), this.g.getDisplayMsg(), Integer.parseInt(this.g.result.rpAuditResult.auditStatus.subCode));
            } catch (Exception unused) {
                return new BucketParams.ErrorCode(RPResult.AUDIT_FAIL, String.valueOf(status), this.g.getDisplayMsg(), status);
            }
        } else if (!StringUtils.isEmpty(this.g.retCode)) {
            return new BucketParams.ErrorCode(RPResult.AUDIT_NOT, String.valueOf((int) e2.C), this.g.retMsg, e2.C);
        } else {
            return new BucketParams.ErrorCode(RPResult.AUDIT_NOT, String.valueOf((int) e2.C), b.a(this.g), e2.C);
        }
    }

    @Override // com.alibaba.security.realidentity.o1
    public o1 a(HttpResponse httpResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (o1) ipChange.ipc$dispatch("97ba3285", new Object[]{this, httpResponse});
        }
        if (httpResponse instanceof SubmitHttpResponse) {
            this.g = (SubmitHttpResponse) httpResponse;
        }
        return this;
    }
}
