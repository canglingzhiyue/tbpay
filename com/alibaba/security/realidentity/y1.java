package com.alibaba.security.realidentity;

import android.content.Context;
import android.os.AsyncTask;
import com.alibaba.security.realidentity.biz.config.RPBizConfig;
import com.alibaba.security.realidentity.biz.start.UploadToken;
import com.alibaba.security.realidentity.service.upload.UploadFileModel;
import com.alipay.zoloz.toyger.blob.BlobManager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;

/* loaded from: classes3.dex */
public abstract class y1 extends AsyncTask<UploadToken, Void, String> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final String p = c2.class.getSimpleName();

    /* renamed from: a  reason: collision with root package name */
    public String f3604a;
    public String b;
    public byte[] c;
    public AtomicInteger d;
    public AtomicIntegerArray e;
    public int f;
    public int g;
    public b h;
    public String i;
    public j4 j;
    public String k;
    public String l;
    public Context m;
    public RPBizConfig n;
    public u4 o;

    /* loaded from: classes3.dex */
    public class a implements l4 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f3605a;
        public final /* synthetic */ CountDownLatch b;

        public a(String str, CountDownLatch countDownLatch) {
            this.f3605a = str;
            this.b = countDownLatch;
        }

        @Override // com.alibaba.security.realidentity.l4
        public void onCancel() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("379d4540", new Object[]{this});
                return;
            }
            f.b(this.f3605a);
            this.b.countDown();
        }

        @Override // com.alibaba.security.realidentity.l4
        public void onError(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ac367d3a", new Object[]{this, str});
                return;
            }
            f.b(this.f3605a);
            this.b.countDown();
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
            y1.this.k = str;
            f.b(this.f3605a);
            this.b.countDown();
        }
    }

    /* loaded from: classes3.dex */
    public interface b {
        void a();

        void onError();
    }

    public y1(Context context, String str, RPBizConfig rPBizConfig, u4 u4Var, String str2, String str3, String str4, byte[] bArr) {
        this.c = bArr;
        this.m = context;
        a(context, str, rPBizConfig, u4Var, str2, str3, str4);
    }

    private void a(Context context, String str, RPBizConfig rPBizConfig, u4 u4Var, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("892964d7", new Object[]{this, context, str, rPBizConfig, u4Var, str2, str3, str4});
            return;
        }
        this.f3604a = str2;
        this.l = str;
        this.o = u4Var;
        this.n = rPBizConfig;
        if (str4 != null && !str4.endsWith("/")) {
            str4 = str4 + "/";
        }
        this.i = str4;
        this.b = str3;
        this.j = i4.a(this.m, str, u4Var);
    }

    private boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue();
        }
        for (int i = 0; i < this.g; i++) {
            if (this.e.get(i) == 0) {
                return false;
            }
        }
        return true;
    }

    private void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
        } else {
            this.e.addAndGet(this.f, 0);
        }
    }

    private void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
        } else {
            this.e.addAndGet(this.f, 1);
        }
    }

    public static /* synthetic */ Object ipc$super(y1 y1Var, String str, Object... objArr) {
        if (str.hashCode() == -1325021319) {
            super.onPostExecute(objArr[0]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public abstract String a();

    public String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : this.f3604a;
    }

    public String c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this}) : this.k;
    }

    public byte[] d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (byte[]) ipChange.ipc$dispatch("ad3fab52", new Object[]{this}) : this.c;
    }

    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, java.lang.String] */
    @Override // android.os.AsyncTask
    public /* synthetic */ String doInBackground(UploadToken[] uploadTokenArr) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("e83e4786", new Object[]{this, uploadTokenArr}) : a(uploadTokenArr);
    }

    public long h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5cf10e3", new Object[]{this})).longValue() : this.n.getDegradeConfig().getUploadTimeOut();
    }

    @Override // android.os.AsyncTask
    public /* synthetic */ void onPostExecute(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b105c779", new Object[]{this, str});
        } else {
            a(str);
        }
    }

    public void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
        } else {
            this.g = i;
        }
    }

    public y1(Context context, String str, RPBizConfig rPBizConfig, u4 u4Var, String str2, String str3, String str4) {
        a(context, str, rPBizConfig, u4Var, str2, str3, str4);
    }

    public void a(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ff8cdfc", new Object[]{this, bVar});
        } else {
            this.h = bVar;
        }
    }

    public void a(AtomicIntegerArray atomicIntegerArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c54e7e5", new Object[]{this, atomicIntegerArray});
        } else {
            this.e = atomicIntegerArray;
        }
    }

    public void a(AtomicInteger atomicInteger) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff14a312", new Object[]{this, atomicInteger});
        } else {
            this.d = atomicInteger;
        }
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else {
            this.f = i;
        }
    }

    public String a(UploadToken... uploadTokenArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("32be7016", new Object[]{this, uploadTokenArr});
        }
        String str = f.a(this.m) + "/images/" + this.l;
        String str2 = this.b;
        String str3 = str + File.separator + str2;
        byte[] d = d();
        if (d == null) {
            this.k = null;
            return null;
        } else if (!f.a(str, d, str2)) {
            this.k = "";
            return "";
        } else {
            UploadFileModel uploadFileModel = new UploadFileModel();
            uploadFileModel.mFileType = BlobManager.UPLOAD_IMAGE_TYPE_JPEG;
            uploadFileModel.mLocalFilePath = str3;
            uploadFileModel.mRemoteFileName = a();
            CountDownLatch countDownLatch = new CountDownLatch(1);
            Object a2 = this.j.a("image/jpeg", this.n.getOssConfig(), uploadFileModel, new a(str3, countDownLatch));
            try {
                countDownLatch.await(h(), TimeUnit.SECONDS);
            } catch (InterruptedException unused) {
                this.j.a(a2);
            }
            return this.k;
        }
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        super.onPostExecute(str);
        if (this.k == null) {
            f();
        } else {
            g();
        }
        if (this.d.decrementAndGet() != 0 || this.h == null) {
            return;
        }
        if (e()) {
            this.h.a();
        } else {
            this.h.onError();
        }
    }
}
