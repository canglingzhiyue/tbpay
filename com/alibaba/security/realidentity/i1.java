package com.alibaba.security.realidentity;

import android.content.Context;
import com.alibaba.security.common.http.MTopManager;
import com.alibaba.security.realidentity.biz.base.chain.BusinessType;
import com.alibaba.security.realidentity.biz.bucket.BucketParams;
import com.alibaba.security.realidentity.biz.config.RPBizConfig;
import com.alibaba.security.realidentity.g4;
import com.alibaba.security.realidentity.service.track.model.TrackLog;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public abstract class i1 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String f = "BusinessWorker";

    /* renamed from: a  reason: collision with root package name */
    public Context f3439a;
    public String b;
    public MTopManager c;
    public RPBizConfig d;
    public u4 e;

    /* loaded from: classes3.dex */
    public interface b {
        void a(BucketParams bucketParams, Exception exc, String str, boolean z);

        void a(BucketParams bucketParams, boolean z);

        void b(BucketParams bucketParams, boolean z);
    }

    public i1(Context context, RPBizConfig rPBizConfig, u4 u4Var) {
        this.f3439a = context;
        this.e = u4Var;
        this.c = new MTopManager(context);
        this.d = rPBizConfig;
        this.b = rPBizConfig.getBasicsConfig().verifyToken;
    }

    public static /* synthetic */ void a(i1 i1Var, BucketParams bucketParams, boolean z, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4bf713", new Object[]{i1Var, bucketParams, new Boolean(z), new Long(j)});
        } else {
            i1Var.a(bucketParams, z, j);
        }
    }

    public abstract BusinessType a();

    public abstract void a(h1 h1Var, b bVar);

    public abstract void a(h1 h1Var, i1 i1Var, BucketParams bucketParams);

    public abstract void a(h1 h1Var, i1 i1Var, BucketParams bucketParams, String str);

    public abstract String b();

    public abstract void b(h1 h1Var, i1 i1Var, BucketParams bucketParams);

    public abstract String c();

    public abstract String d();

    public abstract String e();

    public abstract String f();

    public abstract String g();

    public boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5cf10f3", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
        } else if (!h()) {
        } else {
            TrackLog trackLog = new TrackLog();
            trackLog.setLayer(g4.a.f3423a);
            trackLog.setService(f());
            trackLog.setMethod(g());
            trackLog.setParams(d());
            trackLog.setMsg("");
            trackLog.setResult("");
            a(trackLog);
        }
    }

    public static /* synthetic */ void a(i1 i1Var, Exception exc, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89ec2d68", new Object[]{i1Var, exc, new Long(j)});
        } else {
            i1Var.a(exc, j);
        }
    }

    public void a(h1 h1Var, j1 j1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65178aac", new Object[]{this, h1Var, j1Var});
        } else {
            a(h1Var, new a(System.currentTimeMillis(), j1Var));
        }
    }

    /* loaded from: classes3.dex */
    public class a implements b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ long f3440a;
        public final /* synthetic */ j1 b;

        public a(long j, j1 j1Var) {
            this.f3440a = j;
            this.b = j1Var;
        }

        @Override // com.alibaba.security.realidentity.i1.b
        public void a(BucketParams bucketParams, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f973254f", new Object[]{this, bucketParams, new Boolean(z)});
                return;
            }
            if (bucketParams != null) {
                bucketParams.a(bucketParams.c());
            }
            i1.a(i1.this, bucketParams, false, this.f3440a);
            j1 j1Var = this.b;
            if (j1Var == null) {
                return;
            }
            j1Var.b(i1.this.a(), bucketParams, z);
        }

        @Override // com.alibaba.security.realidentity.i1.b
        public void b(BucketParams bucketParams, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("47329d50", new Object[]{this, bucketParams, new Boolean(z)});
                return;
            }
            if (bucketParams != null) {
                bucketParams.a(bucketParams.c());
            }
            i1.a(i1.this, bucketParams, true, this.f3440a);
            j1 j1Var = this.b;
            if (j1Var == null) {
                return;
            }
            j1Var.a(i1.this.a(), bucketParams, z);
        }

        @Override // com.alibaba.security.realidentity.i1.b
        public void a(BucketParams bucketParams, Exception exc, String str, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4ba95329", new Object[]{this, bucketParams, exc, str, new Boolean(z)});
                return;
            }
            BucketParams.ErrorCode createAuditNotCode = BucketParams.ErrorCode.createAuditNotCode();
            createAuditNotCode.errorMsg = d.a(exc);
            createAuditNotCode.globalErrorCode = e2.A;
            createAuditNotCode.errorCode = String.valueOf((int) e2.A);
            bucketParams.a(createAuditNotCode);
            i1.a(i1.this, exc, this.f3440a);
            j1 j1Var = this.b;
            if (j1Var == null) {
                return;
            }
            j1Var.a(i1.this.a(), bucketParams, d.a(exc), z);
        }
    }

    private void a(Exception exc, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4a90766", new Object[]{this, exc, new Long(j)});
        } else if (!h()) {
        } else {
            TrackLog trackLog = new TrackLog();
            trackLog.setRt(System.currentTimeMillis() - j);
            trackLog.setLayer(g4.a.f3423a);
            trackLog.setService(f());
            trackLog.setMethod(b());
            trackLog.setParams(d());
            trackLog.setMsg("");
            trackLog.setResult("onNetError: " + d.a(exc));
            trackLog.setCode(-1);
            a(trackLog);
        }
    }

    private void a(BucketParams bucketParams, boolean z, long j) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34f1fb55", new Object[]{this, bucketParams, new Boolean(z), new Long(j)});
        } else if (!h()) {
        } else {
            TrackLog trackLog = new TrackLog();
            trackLog.setRt(System.currentTimeMillis() - j);
            trackLog.setLayer(g4.a.f3423a);
            trackLog.setService(f());
            trackLog.setMethod(b());
            trackLog.setParams(d());
            trackLog.setMsg(c());
            trackLog.setResult(e());
            if (!z) {
                i = -2;
            }
            trackLog.setCode(i);
            a(trackLog);
        }
    }

    public void a(TrackLog trackLog) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6099b195", new Object[]{this, trackLog});
        } else {
            this.e.a(this.b, trackLog);
        }
    }
}
