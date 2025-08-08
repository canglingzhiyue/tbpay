package com.alibaba.security.realidentity;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import mtopsdk.common.util.StringUtils;
import com.alibaba.security.realidentity.algo.wrapper.entity.result.ALBiometricsResult;
import com.alibaba.security.realidentity.biz.base.chain.BusinessType;
import com.alibaba.security.realidentity.biz.biometrics.BiometricsBucketParams;
import com.alibaba.security.realidentity.biz.bucket.BucketParams;
import com.alibaba.security.realidentity.biz.config.RPBizConfig;
import com.alibaba.security.realidentity.g4;
import com.alibaba.security.realidentity.i1;
import com.alibaba.security.realidentity.service.track.model.TrackLog;
import com.alibaba.security.realidentity.service.upload.UploadFileModel;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public class m1 extends i1 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String k = "4";
    public static final String l = "BiometricFail";
    public static final String m = "INITIATIVE_QUIT";
    public final j4 g;
    public final n1 h;
    public BiometricsBucketParams i;
    public final RPEventListener j;

    /* loaded from: classes3.dex */
    public class a implements l4 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f3464a;
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;
        public final /* synthetic */ String d;
        public final /* synthetic */ String e;

        public a(String str, String str2, String str3, String str4, String str5) {
            this.f3464a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
            this.e = str5;
        }

        @Override // com.alibaba.security.realidentity.l4
        public void onCancel() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("379d4540", new Object[]{this});
            } else {
                f.b(this.e);
            }
        }

        @Override // com.alibaba.security.realidentity.l4
        public void onError(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ac367d3a", new Object[]{this, str});
            } else {
                f.b(this.e);
            }
        }

        @Override // com.alibaba.security.realidentity.l4
        public void onProgress(long j, long j2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7a56ab73", new Object[]{this, new Long(j), new Long(j2)});
            }
        }

        @Override // com.alibaba.security.realidentity.l4
        public void onSuccess(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("37d948b5", new Object[]{this, str});
                return;
            }
            m1.b(m1.this).a(str, this.f3464a, this.b, m1.a(m1.this).getBiometricsConfig().isSessionless, this.c, this.d);
            f.b(this.e);
        }
    }

    /* loaded from: classes3.dex */
    public class b implements n4 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final i1.b f3465a;
        public byte[] b;
        public int c;
        public int d;
        public final ThreadPoolExecutor e;

        /* loaded from: classes3.dex */
        public class a implements ThreadFactory {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ m1 f3466a;

            public a(m1 m1Var) {
                this.f3466a = m1Var;
            }

            @Override // java.util.concurrent.ThreadFactory
            public Thread newThread(Runnable runnable) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (Thread) ipChange.ipc$dispatch("d8079a58", new Object[]{this, runnable}) : new Thread(runnable, "rpsdk-bitmapProcess_1");
            }
        }

        /* renamed from: com.alibaba.security.realidentity.m1$b$b  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public class RunnableC0122b implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public RunnableC0122b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else if (m1.g(m1.this) == null) {
                } else {
                    Bitmap a2 = d.a(b.a(b.this), b.b(b.this), b.c(b.this));
                    m1.c(m1.this).getBasicsConfig().faceBitmap = a2;
                    m1.g(m1.this).onFinish(RPResult.AUDIT_PASS, new RPDetail(String.valueOf(0), String.valueOf(0), "", a2));
                }
            }
        }

        public b(i1.b bVar) {
            this.f3465a = bVar;
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new a(m1.this));
            this.e = threadPoolExecutor;
            threadPoolExecutor.allowCoreThreadTimeOut(true);
        }

        public static /* synthetic */ byte[] a(b bVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (byte[]) ipChange.ipc$dispatch("e092d7ed", new Object[]{bVar}) : bVar.b;
        }

        public static /* synthetic */ int b(b bVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5fcec964", new Object[]{bVar})).intValue() : bVar.c;
        }

        public static /* synthetic */ int c(b bVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("fa6f8be5", new Object[]{bVar})).intValue() : bVar.d;
        }

        @Override // com.alibaba.security.realidentity.u4
        public String d() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("43881515", new Object[]{this}) : m1.f(m1.this).d();
        }

        @Override // com.alibaba.security.realidentity.n4
        public void e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            } else if (m1.g(m1.this) == null) {
            } else {
                m1.g(m1.this).onBiometricsStart();
            }
        }

        @Override // com.alibaba.security.realidentity.u4
        public RPEventListener h() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (RPEventListener) ipChange.ipc$dispatch("6c891b35", new Object[]{this}) : m1.e(m1.this).h();
        }

        @Override // com.alibaba.security.realidentity.n4
        public void j() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
            } else {
                this.e.execute(new RunnableC0122b());
            }
        }

        @Override // com.alibaba.security.realidentity.n4
        public void a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            } else if (m1.g(m1.this) == null) {
            } else {
                m1.g(m1.this).onBiometricsFinish(i);
            }
        }

        @Override // com.alibaba.security.realidentity.n4
        public void b(int i, Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4ba80a5a", new Object[]{this, new Integer(i), bundle});
            } else if (bundle == null || !bundle.containsKey(u.f3525a)) {
            } else {
                ALBiometricsResult aLBiometricsResult = (ALBiometricsResult) bundle.getSerializable(u.f3525a);
                m1.a(m1.this, a(aLBiometricsResult, false), false, "4", null);
                if (this.f3465a == null) {
                    return;
                }
                BiometricsBucketParams.ALBiometricsCallBackBean aLBiometricsCallBackBean = new BiometricsBucketParams.ALBiometricsCallBackBean();
                aLBiometricsCallBackBean.errorCode = i;
                aLBiometricsCallBackBean.errorMsg = "onError";
                aLBiometricsCallBackBean.faceImage = this.b;
                aLBiometricsCallBackBean.faceImageWidth = this.c;
                aLBiometricsCallBackBean.faceImageHeight = this.d;
                m1.h(m1.this).a(aLBiometricsCallBackBean);
                m1.h(m1.this).a(aLBiometricsResult);
                this.f3465a.a(m1.h(m1.this), true);
            }
        }

        private String a(ALBiometricsResult aLBiometricsResult, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("deb03da9", new Object[]{this, aLBiometricsResult, new Boolean(z)});
            }
            if (aLBiometricsResult == null) {
                return null;
            }
            return z ? aLBiometricsResult.successfulVideoPath : aLBiometricsResult.failedVideoPath;
        }

        @Override // com.alibaba.security.realidentity.n4
        public void a(ALBiometricsResult aLBiometricsResult) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cce5069d", new Object[]{this, aLBiometricsResult});
                return;
            }
            BiometricsBucketParams.ALBiometricsCallBackBean aLBiometricsCallBackBean = new BiometricsBucketParams.ALBiometricsCallBackBean();
            aLBiometricsCallBackBean.errorMsg = "";
            aLBiometricsCallBackBean.errorCode = 0;
            aLBiometricsCallBackBean.faceImage = this.b;
            aLBiometricsCallBackBean.faceImageWidth = this.c;
            aLBiometricsCallBackBean.faceImageHeight = this.d;
            m1.h(m1.this).a(aLBiometricsCallBackBean);
            if (aLBiometricsResult == null) {
                aLBiometricsCallBackBean.errorCode = -10000;
                aLBiometricsCallBackBean.errorMsg = "biometricsResult is null";
                this.f3465a.a(m1.h(m1.this), true);
                return;
            }
            m1.h(m1.this).a(aLBiometricsResult);
            if (aLBiometricsResult.qualityImage == null) {
                aLBiometricsCallBackBean.errorCode = -10000;
                aLBiometricsCallBackBean.errorMsg = "biometricsResult qi result is null";
                this.f3465a.a(m1.h(m1.this), true);
                return;
            }
            m1.a(m1.this, a(aLBiometricsResult, true), true, "4", null);
            this.f3465a.b(m1.h(m1.this), true);
        }

        @Override // com.alibaba.security.realidentity.n4
        public void a(k0 k0Var, String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a4d96d21", new Object[]{this, k0Var, str, str2});
            } else if (m1.h(m1.this) == null) {
                k0Var.a(0);
            } else {
                m1.h(m1.this).b(m1.i(m1.this), k0Var, str, str2, m1.l, "1");
            }
        }

        @Override // com.alibaba.security.realidentity.n4
        public void a(int i, String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8114572f", new Object[]{this, new Integer(i), str, str2});
                return;
            }
            m1.h(m1.this).b(m1.j(m1.this), null, str, str2, m1.m, "6");
            BiometricsBucketParams.ALBiometricsCallBackBean aLBiometricsCallBackBean = new BiometricsBucketParams.ALBiometricsCallBackBean();
            aLBiometricsCallBackBean.errorCode = i;
            aLBiometricsCallBackBean.errorMsg = "onCancel";
            aLBiometricsCallBackBean.faceImage = this.b;
            aLBiometricsCallBackBean.faceImageWidth = this.c;
            aLBiometricsCallBackBean.faceImageHeight = this.d;
            m1.h(m1.this).a(aLBiometricsCallBackBean);
            i1.b bVar = this.f3465a;
            if (bVar == null) {
                return;
            }
            bVar.a(m1.h(m1.this), true);
        }

        @Override // com.alibaba.security.realidentity.n4
        public void a(byte[] bArr, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bb6ab7cf", new Object[]{this, bArr, new Integer(i), new Integer(i2)});
            } else if (bArr == null || i <= 0 || i2 <= 0) {
            } else {
                this.b = bArr;
                this.c = i;
                this.d = i2;
            }
        }

        @Override // com.alibaba.security.realidentity.c4
        public void a(String str, TrackLog trackLog) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2970415f", new Object[]{this, str, trackLog});
            } else {
                m1.d(m1.this).a(str, trackLog);
            }
        }
    }

    public m1(Context context, RPBizConfig rPBizConfig, u4 u4Var, RPEventListener rPEventListener) {
        super(context, rPBizConfig, u4Var);
        this.j = rPEventListener;
        this.g = i4.a(this.f3439a, this.b, u4Var);
        this.h = new n1(context);
    }

    public static /* synthetic */ RPBizConfig a(m1 m1Var) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RPBizConfig) ipChange.ipc$dispatch("cfe1680c", new Object[]{m1Var}) : m1Var.d;
    }

    public static /* synthetic */ n1 b(m1 m1Var) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (n1) ipChange.ipc$dispatch("5e7e024e", new Object[]{m1Var}) : m1Var.h;
    }

    public static /* synthetic */ RPBizConfig c(m1 m1Var) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RPBizConfig) ipChange.ipc$dispatch("40fae8ca", new Object[]{m1Var}) : m1Var.d;
    }

    public static /* synthetic */ u4 d(m1 m1Var) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (u4) ipChange.ipc$dispatch("1a64e8b0", new Object[]{m1Var}) : m1Var.e;
    }

    public static /* synthetic */ u4 e(m1 m1Var) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (u4) ipChange.ipc$dispatch("f8584e8f", new Object[]{m1Var}) : m1Var.e;
    }

    public static /* synthetic */ u4 f(m1 m1Var) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (u4) ipChange.ipc$dispatch("d64bb46e", new Object[]{m1Var}) : m1Var.e;
    }

    public static /* synthetic */ RPEventListener g(m1 m1Var) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RPEventListener) ipChange.ipc$dispatch("83de357a", new Object[]{m1Var}) : m1Var.j;
    }

    public static /* synthetic */ BiometricsBucketParams h(m1 m1Var) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BiometricsBucketParams) ipChange.ipc$dispatch("e525e1c8", new Object[]{m1Var}) : m1Var.i;
    }

    public static /* synthetic */ Context i(m1 m1Var) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("69f130ee", new Object[]{m1Var}) : m1Var.f3439a;
    }

    public static /* synthetic */ Object ipc$super(m1 m1Var, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ Context j(m1 m1Var) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("45b2acaf", new Object[]{m1Var}) : m1Var.f3439a;
    }

    @Override // com.alibaba.security.realidentity.i1
    public String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : "detect";
    }

    @Override // com.alibaba.security.realidentity.i1
    public String c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this}) : "";
    }

    @Override // com.alibaba.security.realidentity.i1
    public String d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("43881515", new Object[]{this}) : "";
    }

    @Override // com.alibaba.security.realidentity.i1
    public String e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this}) : "";
    }

    @Override // com.alibaba.security.realidentity.i1
    public String f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("50938a53", new Object[]{this}) : g4.c.d;
    }

    @Override // com.alibaba.security.realidentity.i1
    public String g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d71944f2", new Object[]{this}) : "detect";
    }

    public static /* synthetic */ void a(m1 m1Var, String str, boolean z, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5b228b0", new Object[]{m1Var, str, new Boolean(z), str2, str3});
        } else {
            m1Var.a(str, z, str2, str3);
        }
    }

    @Override // com.alibaba.security.realidentity.i1
    public void b(h1 h1Var, i1 i1Var, BucketParams bucketParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29afaae1", new Object[]{this, h1Var, i1Var, bucketParams});
        } else {
            b(h1Var, bucketParams);
        }
    }

    private void b(h1 h1Var, BucketParams bucketParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b006c623", new Object[]{this, h1Var, bucketParams});
        } else if (this.i.i) {
            v4.a(this.f3439a, (Bundle) null);
        } else {
            v4.a(this.f3439a);
        }
    }

    @Override // com.alibaba.security.realidentity.i1
    public void a(h1 h1Var, i1 i1Var, BucketParams bucketParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d72f582", new Object[]{this, h1Var, i1Var, bucketParams});
        } else {
            a(h1Var, bucketParams);
        }
    }

    @Override // com.alibaba.security.realidentity.i1
    public void a(h1 h1Var, i1 i1Var, BucketParams bucketParams, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7ca82cc", new Object[]{this, h1Var, i1Var, bucketParams, str});
        } else {
            a(h1Var, bucketParams);
        }
    }

    private void a(h1 h1Var, BucketParams bucketParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7a8a184", new Object[]{this, h1Var, bucketParams});
            return;
        }
        int i = bucketParams.b().globalErrorCode;
        String str = bucketParams.b().errorMsg;
        if (this.i.i) {
            Bundle bundle = new Bundle();
            bundle.putInt(f2.m, i);
            bundle.putString(f2.n, str);
            v4.a(this.f3439a, bundle);
            h1Var.b();
            return;
        }
        v4.a(this.f3439a);
    }

    @Override // com.alibaba.security.realidentity.i1
    public void a(h1 h1Var, i1.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("474ec0ed", new Object[]{this, h1Var, bVar});
            return;
        }
        BiometricsBucketParams biometricsBucketParams = h1Var.d;
        this.i = biometricsBucketParams;
        v1 v1Var = h1Var.c;
        if (v1Var != null) {
            biometricsBucketParams.i = v1Var.m;
        }
        a(TrackLog.createBioMonitorStartLog());
        o4.b().a(new b(bVar));
        v4.a(this.f3439a, h1Var.h);
    }

    private void a(String str, boolean z, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d29d8f6", new Object[]{this, str, new Boolean(z), str2, str3});
        } else if (StringUtils.isEmpty(str)) {
        } else {
            UploadFileModel uploadFileModel = new UploadFileModel();
            String str4 = this.b;
            String format = new SimpleDateFormat("yyyyMMdd").format(Long.valueOf(System.currentTimeMillis()));
            String str5 = z ? "success" : "failure";
            uploadFileModel.mDestDir = "biometric/video/" + format + "/" + str4 + "/" + str5;
            uploadFileModel.mFileType = "h264";
            uploadFileModel.mLocalFilePath = str;
            uploadFileModel.mRemoteFileName = new File(str).getName();
            this.g.a("video/mp4", this.d.getOssConfig(), uploadFileModel, new a(str4, str5, str2, str3, str));
        }
    }

    @Override // com.alibaba.security.realidentity.i1
    public BusinessType a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BusinessType) ipChange.ipc$dispatch("a3686234", new Object[]{this}) : BusinessType.ALBIOMETERICS;
    }
}
