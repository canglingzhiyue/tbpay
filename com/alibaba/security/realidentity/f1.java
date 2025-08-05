package com.alibaba.security.realidentity;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.alibaba.security.realidentity.biz.base.chain.BusinessHeadParams;
import com.alibaba.security.realidentity.biz.base.chain.BusinessType;
import com.alibaba.security.realidentity.biz.biometrics.BiometricsBucketParams;
import com.alibaba.security.realidentity.biz.bucket.BucketParams;
import com.alibaba.security.realidentity.biz.config.RPBizConfig;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public class f1 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String d = "f1";

    /* renamed from: a  reason: collision with root package name */
    public k1 f3396a;
    public Context b;
    public final RPBizConfig c;

    /* loaded from: classes3.dex */
    public class a implements s1 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final RPEventListener f3397a;
        public final k1 b;
        public final ThreadPoolExecutor c;
        public final b d = new b();

        /* renamed from: com.alibaba.security.realidentity.f1$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public class ThreadFactoryC0120a implements ThreadFactory {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ f1 f3398a;

            public ThreadFactoryC0120a(f1 f1Var) {
                this.f3398a = f1Var;
            }

            @Override // java.util.concurrent.ThreadFactory
            public Thread newThread(Runnable runnable) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (Thread) ipChange.ipc$dispatch("d8079a58", new Object[]{this, runnable}) : new Thread(runnable, "rpsdk-bitmapProcess_0");
            }
        }

        /* loaded from: classes3.dex */
        public class b implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ h1 f3399a;
            public final /* synthetic */ String b;
            public final /* synthetic */ String c;
            public final /* synthetic */ String d;
            public final /* synthetic */ RPResult e;

            /* renamed from: com.alibaba.security.realidentity.f1$a$b$a  reason: collision with other inner class name */
            /* loaded from: classes3.dex */
            public class RunnableC0121a implements Runnable {
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* renamed from: a  reason: collision with root package name */
                public final /* synthetic */ RPDetail f3400a;

                public RunnableC0121a(RPDetail rPDetail) {
                    this.f3400a = rPDetail;
                }

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        a.b(a.this).onFinish(b.this.e, this.f3400a);
                    }
                }
            }

            public b(h1 h1Var, String str, String str2, String str3, RPResult rPResult) {
                this.f3399a = h1Var;
                this.b = str;
                this.c = str2;
                this.d = str3;
                this.e = rPResult;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                Bitmap a2 = a.a(a.this, this.f3399a);
                f1.a(f1.this).getBasicsConfig().faceBitmap = a2;
                RPDetail rPDetail = new RPDetail(this.b, this.c, this.d, a2);
                if (a.a(a.this) == null) {
                    return;
                }
                a.a(a.this).post(new RunnableC0121a(rPDetail));
            }
        }

        public a(RPEventListener rPEventListener, k1 k1Var) {
            this.f3397a = rPEventListener;
            this.b = k1Var;
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC0120a(f1.this));
            this.c = threadPoolExecutor;
            threadPoolExecutor.allowCoreThreadTimeOut(true);
        }

        public static /* synthetic */ Bitmap a(a aVar, h1 h1Var) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Bitmap) ipChange.ipc$dispatch("ee99b429", new Object[]{aVar, h1Var}) : aVar.b(h1Var);
        }

        public static /* synthetic */ RPEventListener b(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (RPEventListener) ipChange.ipc$dispatch("51a83191", new Object[]{aVar}) : aVar.f3397a;
        }

        public static /* synthetic */ b a(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("7ec8010d", new Object[]{aVar}) : aVar.d;
        }

        private Bitmap b(h1 h1Var) {
            BiometricsBucketParams biometricsBucketParams;
            BiometricsBucketParams.ALBiometricsCallBackBean aLBiometricsCallBackBean;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Bitmap) ipChange.ipc$dispatch("dff74808", new Object[]{this, h1Var});
            }
            if (h1Var != null && (biometricsBucketParams = h1Var.d) != null && (aLBiometricsCallBackBean = biometricsBucketParams.j) != null) {
                return d.a(aLBiometricsCallBackBean.faceImage, aLBiometricsCallBackBean.faceImageWidth, aLBiometricsCallBackBean.faceImageHeight);
            }
            return null;
        }

        @Override // com.alibaba.security.realidentity.s1
        public void a(h1 h1Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a2b1e869", new Object[]{this, h1Var});
                return;
            }
            a(RPResult.AUDIT_PASS, String.valueOf(0), String.valueOf(0), h1Var, "");
            k1 k1Var = this.b;
            if (k1Var == null) {
                return;
            }
            k1Var.b();
        }

        @Override // com.alibaba.security.realidentity.s1
        public void a(BusinessType businessType, h1 h1Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dc4662f5", new Object[]{this, businessType, h1Var});
                return;
            }
            BucketParams.ErrorCode b2 = h1Var.b(businessType);
            a(b2.audit, b2.errorCode, String.valueOf(b2.globalErrorCode), h1Var, b2.errorMsg);
            k1 k1Var = this.b;
            if (k1Var == null) {
                return;
            }
            k1Var.b();
        }

        @Override // com.alibaba.security.realidentity.s1
        public void a(BusinessType businessType, h1 h1Var, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2706997f", new Object[]{this, businessType, h1Var, str});
                return;
            }
            RPResult rPResult = RPResult.AUDIT_EXCEPTION;
            String valueOf = String.valueOf((int) e2.A);
            String valueOf2 = String.valueOf((int) e2.A);
            a(rPResult, valueOf, valueOf2, h1Var, "Network Failure: " + str);
            k1 k1Var = this.b;
            if (k1Var == null) {
                return;
            }
            k1Var.b();
        }

        private void a(RPResult rPResult, String str, String str2, h1 h1Var, String str3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b06f4696", new Object[]{this, rPResult, str, str2, h1Var, str3});
            } else if (this.f3397a == null) {
            } else {
                this.c.execute(new b(h1Var, str, str2, str3, rPResult));
            }
        }
    }

    /* loaded from: classes3.dex */
    public static class b extends Handler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
            super(Looper.getMainLooper());
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            if (str.hashCode() == 673877017) {
                super.handleMessage((Message) objArr[0]);
                return null;
            }
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
            } else {
                super.handleMessage(message);
            }
        }
    }

    public f1(Context context, RPBizConfig rPBizConfig, u4 u4Var, RPEventListener rPEventListener, boolean z) {
        this.b = context;
        this.c = rPBizConfig;
        try {
            k1 k1Var = new k1();
            this.f3396a = k1Var;
            if (z) {
                k1Var.a(new m1(context, rPBizConfig, u4Var, rPEventListener), new a(rPEventListener, this.f3396a)).a(new b2(context, rPBizConfig, u4Var)).a(new d2(context, rPBizConfig, u4Var));
            } else {
                k1Var.a(new u1(context, rPBizConfig, u4Var), new a(rPEventListener, this.f3396a)).a(new m1(context, rPBizConfig, u4Var, rPEventListener)).a(new b2(context, rPBizConfig, u4Var)).a(new d2(context, rPBizConfig, u4Var)).a(new w1(context, rPBizConfig, u4Var));
            }
        } catch (IllegalAccessException e) {
            com.alibaba.security.realidentity.a.a(d, e);
        }
    }

    public static /* synthetic */ RPBizConfig a(f1 f1Var) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RPBizConfig) ipChange.ipc$dispatch("c22c5ab3", new Object[]{f1Var}) : f1Var.c;
    }

    public void a(BusinessHeadParams businessHeadParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2dc8aba8", new Object[]{this, businessHeadParams});
            return;
        }
        k1 k1Var = this.f3396a;
        if (k1Var == null) {
            return;
        }
        k1Var.a(this.b, this.c, businessHeadParams);
    }
}
