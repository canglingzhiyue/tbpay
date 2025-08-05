package com.alibaba.security.realidentity;

import android.content.Context;
import com.alibaba.security.common.http.interfaces.OnHttpCallBack;
import com.alibaba.security.common.http.model.HttpRequest;
import com.alibaba.security.realidentity.biz.base.chain.BusinessType;
import com.alibaba.security.realidentity.biz.biometrics.BiometricsBucketParams;
import com.alibaba.security.realidentity.biz.bucket.BucketParams;
import com.alibaba.security.realidentity.biz.config.RPBizConfig;
import com.alibaba.security.realidentity.biz.submit.SubmitHttpResponse;
import com.alibaba.security.realidentity.g4;
import com.alibaba.security.realidentity.i1;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class w1 extends i1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public x1 g;

    /* loaded from: classes3.dex */
    public class a implements OnHttpCallBack<SubmitHttpResponse> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ i1.b f3591a;
        public final /* synthetic */ BiometricsBucketParams b;

        public a(i1.b bVar, BiometricsBucketParams biometricsBucketParams) {
            this.f3591a = bVar;
            this.b = biometricsBucketParams;
        }

        public void a(HttpRequest httpRequest, SubmitHttpResponse submitHttpResponse) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ca7431a3", new Object[]{this, httpRequest, submitHttpResponse});
                return;
            }
            w1.a(w1.this).b(submitHttpResponse);
            if (this.f3591a == null) {
                return;
            }
            if (submitHttpResponse != null && submitHttpResponse.isSuccessful()) {
                this.f3591a.b(w1.a(w1.this), !this.b.i);
            } else {
                this.f3591a.a(w1.a(w1.this), !this.b.i);
            }
        }

        @Override // com.alibaba.security.common.http.interfaces.OnHttpCallBack
        public void onFail(HttpRequest httpRequest, Exception exc) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7806fd23", new Object[]{this, httpRequest, exc});
                return;
            }
            i1.b bVar = this.f3591a;
            if (bVar == null) {
                return;
            }
            bVar.a(w1.a(w1.this), exc, "SubmitBusinessWorker", !this.b.i);
        }

        @Override // com.alibaba.security.common.http.interfaces.OnHttpCallBack
        public /* synthetic */ void onSuccess(HttpRequest httpRequest, SubmitHttpResponse submitHttpResponse) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("66498457", new Object[]{this, httpRequest, submitHttpResponse});
            } else {
                a(httpRequest, submitHttpResponse);
            }
        }
    }

    public w1(Context context, RPBizConfig rPBizConfig, u4 u4Var) {
        super(context, rPBizConfig, u4Var);
    }

    public static /* synthetic */ x1 a(w1 w1Var) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (x1) ipChange.ipc$dispatch("ca7ed52f", new Object[]{w1Var}) : w1Var.g;
    }

    public static /* synthetic */ Object ipc$super(w1 w1Var, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.alibaba.security.realidentity.i1
    public void a(h1 h1Var, i1 i1Var, BucketParams bucketParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d72f582", new Object[]{this, h1Var, i1Var, bucketParams});
        }
    }

    @Override // com.alibaba.security.realidentity.i1
    public void a(h1 h1Var, i1 i1Var, BucketParams bucketParams, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7ca82cc", new Object[]{this, h1Var, i1Var, bucketParams, str});
        }
    }

    @Override // com.alibaba.security.realidentity.i1
    public String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : g4.b.K;
    }

    @Override // com.alibaba.security.realidentity.i1
    public void b(h1 h1Var, i1 i1Var, BucketParams bucketParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29afaae1", new Object[]{this, h1Var, i1Var, bucketParams});
        }
    }

    @Override // com.alibaba.security.realidentity.i1
    public String c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this}) : "";
    }

    @Override // com.alibaba.security.realidentity.i1
    public String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("43881515", new Object[]{this});
        }
        x1 x1Var = this.g;
        return x1Var == null ? "" : b.a(x1Var.d());
    }

    @Override // com.alibaba.security.realidentity.i1
    public String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this});
        }
        x1 x1Var = this.g;
        return x1Var == null ? "" : b.a(x1Var.e());
    }

    @Override // com.alibaba.security.realidentity.i1
    public String f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("50938a53", new Object[]{this}) : "identity";
    }

    @Override // com.alibaba.security.realidentity.i1
    public String g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d71944f2", new Object[]{this}) : g4.b.J;
    }

    @Override // com.alibaba.security.realidentity.i1
    public void a(h1 h1Var, i1.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("474ec0ed", new Object[]{this, h1Var, bVar});
            return;
        }
        BiometricsBucketParams biometricsBucketParams = h1Var.d;
        i();
        x1 x1Var = h1Var.g;
        this.g = x1Var;
        a(x1Var.a(), biometricsBucketParams, bVar);
    }

    private void a(HttpRequest httpRequest, BiometricsBucketParams biometricsBucketParams, i1.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5559c700", new Object[]{this, httpRequest, biometricsBucketParams, bVar});
        } else {
            this.c.asyncRequest(httpRequest, new a(bVar, biometricsBucketParams));
        }
    }

    @Override // com.alibaba.security.realidentity.i1
    public BusinessType a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BusinessType) ipChange.ipc$dispatch("a3686234", new Object[]{this}) : BusinessType.SUBMIT;
    }
}
