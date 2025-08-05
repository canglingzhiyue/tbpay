package com.alibaba.security.realidentity;

import android.content.Context;
import com.alibaba.security.common.http.model.HttpRequest;
import com.alibaba.security.realidentity.biz.bucket.BucketParams;
import com.alibaba.security.realidentity.biz.config.RPBizConfig;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;

/* loaded from: classes3.dex */
public class a2 extends BucketParams {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public List<c2> e;
    public int f;

    public a2(Context context, RPBizConfig rPBizConfig) {
        super(context, rPBizConfig);
    }

    @Override // com.alibaba.security.realidentity.biz.bucket.BucketParams
    public HttpRequest a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HttpRequest) ipChange.ipc$dispatch("1def818d", new Object[]{this});
        }
        return null;
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else {
            this.f = i;
        }
    }

    @Override // com.alibaba.security.realidentity.biz.bucket.BucketParams
    public boolean b(h1 h1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("87f3572e", new Object[]{this, h1Var})).booleanValue();
        }
        return true;
    }

    @Override // com.alibaba.security.realidentity.biz.bucket.BucketParams
    public BucketParams.ErrorCode c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BucketParams.ErrorCode) ipChange.ipc$dispatch("838b0e76", new Object[]{this});
        }
        if (this.f == 0) {
            BucketParams.ErrorCode createAuditPassCode = BucketParams.ErrorCode.createAuditPassCode();
            createAuditPassCode.globalErrorCode = 0;
            createAuditPassCode.errorCode = String.valueOf(0);
            createAuditPassCode.errorMsg = "success";
            return createAuditPassCode;
        }
        BucketParams.ErrorCode createAuditNotCode = BucketParams.ErrorCode.createAuditNotCode();
        createAuditNotCode.globalErrorCode = e2.B;
        createAuditNotCode.errorCode = String.valueOf((int) e2.B);
        createAuditNotCode.errorMsg = "uploadFile onError";
        return createAuditNotCode;
    }
}
