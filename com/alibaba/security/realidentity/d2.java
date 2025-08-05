package com.alibaba.security.realidentity;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import com.alibaba.security.common.http.interfaces.OnHttpCallBack;
import com.alibaba.security.common.http.model.HttpRequest;
import com.alibaba.security.realidentity.algo.wrapper.entity.result.ALBiometricsResult;
import com.alibaba.security.realidentity.biz.base.chain.BusinessType;
import com.alibaba.security.realidentity.biz.biometrics.BiometricsBucketParams;
import com.alibaba.security.realidentity.biz.bucket.BucketParams;
import com.alibaba.security.realidentity.biz.config.RPBizConfig;
import com.alibaba.security.realidentity.biz.uploadresult.UploadResultHttpResponse;
import com.alibaba.security.realidentity.biz.uploadresult.UploadResultParams;
import com.alibaba.security.realidentity.g4;
import com.alibaba.security.realidentity.i1;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes3.dex */
public class d2 extends i1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public UploadResultParams g;

    /* loaded from: classes3.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ HttpRequest f3378a;
        public final /* synthetic */ BiometricsBucketParams b;
        public final /* synthetic */ i1.b c;

        public a(HttpRequest httpRequest, BiometricsBucketParams biometricsBucketParams, i1.b bVar) {
            this.f3378a = httpRequest;
            this.b = biometricsBucketParams;
            this.c = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                d2.a(d2.this, this.f3378a, this.b, this.c);
            }
        }
    }

    /* loaded from: classes3.dex */
    public class b implements OnHttpCallBack<UploadResultHttpResponse> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ i1.b f3379a;
        public final /* synthetic */ BiometricsBucketParams b;

        public b(i1.b bVar, BiometricsBucketParams biometricsBucketParams) {
            this.f3379a = bVar;
            this.b = biometricsBucketParams;
        }

        public void a(HttpRequest httpRequest, UploadResultHttpResponse uploadResultHttpResponse) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("25ab083", new Object[]{this, httpRequest, uploadResultHttpResponse});
                return;
            }
            d2.a(d2.this).b(uploadResultHttpResponse);
            if (this.f3379a == null) {
                return;
            }
            if (uploadResultHttpResponse != null && uploadResultHttpResponse.isSuccessful()) {
                this.f3379a.b(d2.a(d2.this), !this.b.i);
            } else {
                this.f3379a.a(d2.a(d2.this), !this.b.i);
            }
        }

        @Override // com.alibaba.security.common.http.interfaces.OnHttpCallBack
        public void onFail(HttpRequest httpRequest, Exception exc) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7806fd23", new Object[]{this, httpRequest, exc});
                return;
            }
            i1.b bVar = this.f3379a;
            if (bVar == null) {
                return;
            }
            bVar.a(d2.a(d2.this), exc, "UploadResultWorker", !this.b.i);
        }

        @Override // com.alibaba.security.common.http.interfaces.OnHttpCallBack
        public /* synthetic */ void onSuccess(HttpRequest httpRequest, UploadResultHttpResponse uploadResultHttpResponse) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("66498457", new Object[]{this, httpRequest, uploadResultHttpResponse});
            } else {
                a(httpRequest, uploadResultHttpResponse);
            }
        }
    }

    public d2(Context context, RPBizConfig rPBizConfig, u4 u4Var) {
        super(context, rPBizConfig, u4Var);
    }

    public static /* synthetic */ void a(d2 d2Var, HttpRequest httpRequest, BiometricsBucketParams biometricsBucketParams, i1.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3d97e24", new Object[]{d2Var, httpRequest, biometricsBucketParams, bVar});
        } else {
            d2Var.a(httpRequest, biometricsBucketParams, bVar);
        }
    }

    public static /* synthetic */ Object ipc$super(d2 d2Var, String str, Object... objArr) {
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
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : g4.b.I;
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
        ALBiometricsResult aLBiometricsResult;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        UploadResultParams uploadResultParams = this.g;
        if (uploadResultParams != null && (aLBiometricsResult = uploadResultParams.h) != null) {
            if (!TextUtils.isEmpty(aLBiometricsResult.collectedData)) {
                arrayList.add("sensorActionLog");
            }
            if (!TextUtils.isEmpty(this.g.h.bh)) {
                arrayList.add("flActionLog");
            }
        }
        hashMap.put("useLiteVM", Integer.valueOf(this.d.getDegradeConfig().isUseLiteVm ? 1 : 0));
        hashMap.put("actionLogKeys", arrayList);
        return com.alibaba.security.realidentity.b.b(hashMap);
    }

    @Override // com.alibaba.security.realidentity.i1
    public String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("43881515", new Object[]{this});
        }
        UploadResultParams uploadResultParams = this.g;
        return uploadResultParams == null ? "" : com.alibaba.security.realidentity.b.a(uploadResultParams.d());
    }

    @Override // com.alibaba.security.realidentity.i1
    public String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this});
        }
        UploadResultParams uploadResultParams = this.g;
        return uploadResultParams == null ? "" : com.alibaba.security.realidentity.b.a(uploadResultParams.e());
    }

    @Override // com.alibaba.security.realidentity.i1
    public String f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("50938a53", new Object[]{this}) : "identity";
    }

    @Override // com.alibaba.security.realidentity.i1
    public String g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d71944f2", new Object[]{this}) : g4.b.H;
    }

    public static /* synthetic */ UploadResultParams a(d2 d2Var) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (UploadResultParams) ipChange.ipc$dispatch("d579d21", new Object[]{d2Var}) : d2Var.g;
    }

    @Override // com.alibaba.security.realidentity.i1
    public void a(h1 h1Var, i1.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("474ec0ed", new Object[]{this, h1Var, bVar});
            return;
        }
        BiometricsBucketParams biometricsBucketParams = h1Var.d;
        this.g = h1Var.f;
        i();
        new Handler().postDelayed(new a(this.g.a(), biometricsBucketParams, bVar), this.d.getDegradeConfig().getWukongCallbackTimeout());
    }

    private void a(HttpRequest httpRequest, BiometricsBucketParams biometricsBucketParams, i1.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5559c700", new Object[]{this, httpRequest, biometricsBucketParams, bVar});
        } else {
            this.c.asyncRequest(httpRequest, new b(bVar, biometricsBucketParams));
        }
    }

    @Override // com.alibaba.security.realidentity.i1
    public BusinessType a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BusinessType) ipChange.ipc$dispatch("a3686234", new Object[]{this}) : BusinessType.UPLOADRESULT;
    }
}
