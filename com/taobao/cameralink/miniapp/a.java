package com.taobao.cameralink.miniapp;

import android.app.Activity;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.alibaba.ariver.engine.api.embedview.IEmbedCallback;
import com.alibaba.ariver.engine.api.embedview.IEmbedView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.acennr.downloader.TaskCallBack;
import com.taobao.android.tb3dspace.arskindetect.FaceDetect2DGlSurfaceView;
import com.taobao.android.tb3dspace.arskindetect.FaceDetect2DJNI;
import com.taobao.android.tb3dspace.util.FileUtil;
import com.taobao.android.xr_resource.downloader.XRAceDownloader;
import com.taobao.android.xrappos.data.XRImage;
import com.taobao.android.xrappos.threads.SequenceExecutor;
import com.ut.mini.UTAnalytics;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import java.nio.ByteBuffer;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONObject;
import tb.kge;

/* loaded from: classes6.dex */
public class a implements IEmbedCallback {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static volatile HandlerThread t;
    private volatile C0645a[] f;
    private volatile Queue<C0645a> g;
    private final Handler s;
    private Activity u;
    private IEmbedView v;
    private volatile boolean z;
    private final ReentrantLock c = new ReentrantLock();
    private final Condition d = this.c.newCondition();
    private final Condition e = this.c.newCondition();

    /* renamed from: a */
    public int f16887a = 0;
    private boolean h = false;
    private String i = "";
    private String j = "";
    private String k = "";
    private String l = "";
    private volatile FaceDetect2DGlSurfaceView n = null;
    private volatile XRImage o = null;
    private volatile XRImage p = null;
    private volatile XRImage q = null;
    private final Object r = new Object();
    private volatile boolean w = false;
    private volatile byte[] x = null;
    private volatile byte[] y = null;
    public volatile boolean b = false;
    private volatile FaceDetect2DJNI m = null;

    public static /* synthetic */ void a(boolean z, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab1df9d2", new Object[]{new Boolean(z), jSONObject});
        }
    }

    public static /* synthetic */ void lambda$4B2drasicc05rTVJxvx_a_7rVUk(a aVar, FaceDetect2DJNI faceDetect2DJNI) {
        aVar.a(faceDetect2DJNI);
    }

    public static /* synthetic */ void lambda$51xvllyPCSwwKhAjxqkEsr_R2CE(a aVar, byte[] bArr, int i, int i2, boolean z) {
        aVar.b(bArr, i, i2, z);
    }

    /* renamed from: lambda$Axly5Gj-LRPM_pHNeaQCQ-upIWQ */
    public static /* synthetic */ void m1050lambda$Axly5GjLRPM_pHNeaQCQupIWQ(a aVar, com.alibaba.fastjson.JSONObject jSONObject) {
        aVar.a(jSONObject);
    }

    /* renamed from: lambda$Ej88SjL5lb6EI-1PAFSbTpk_sGk */
    public static /* synthetic */ void m1051lambda$Ej88SjL5lb6EI1PAFSbTpk_sGk(a aVar) {
        aVar.l();
    }

    public static /* synthetic */ void lambda$Ihs3vZKBzv6Jrf5PZ6OUE2MfkDk(a aVar) {
        aVar.k();
    }

    public static /* synthetic */ void lambda$VZjrNfl5b8N9PTsHmoH1bOj8qGE(a aVar) {
        aVar.m();
    }

    public static /* synthetic */ void lambda$jDsw5JJTFcLPfiMC9lOW71oYK1w(a aVar) {
        aVar.j();
    }

    public static /* synthetic */ void lambda$sw9_7PN9OV9HDwrL12sIJ8V7WBY(a aVar) {
        aVar.i();
    }

    /* renamed from: lambda$uP2oAlLNkumGPd8FG31abjt-wJE */
    public static /* synthetic */ void m1052lambda$uP2oAlLNkumGPd8FG31abjtwJE(a aVar, byte[] bArr, XRImage xRImage, FaceDetect2DJNI faceDetect2DJNI) {
        aVar.a(bArr, xRImage, faceDetect2DJNI);
    }

    @Override // com.alibaba.ariver.engine.api.embedview.IEmbedCallback
    public void onResponse(com.alibaba.fastjson.JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8435f409", new Object[]{this, jSONObject});
        }
    }

    /* renamed from: com.taobao.cameralink.miniapp.a$a */
    /* loaded from: classes6.dex */
    public static final class C0645a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a */
        private byte[] f16892a;

        static {
            kge.a(1754692138);
        }

        public static /* synthetic */ byte[] a(C0645a c0645a) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (byte[]) ipChange.ipc$dispatch("977a3220", new Object[]{c0645a}) : c0645a.f16892a;
        }

        public static /* synthetic */ byte[] a(C0645a c0645a, byte[] bArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (byte[]) ipChange.ipc$dispatch("a46b1179", new Object[]{c0645a, bArr});
            }
            c0645a.f16892a = bArr;
            return bArr;
        }

        private C0645a() {
            this.f16892a = null;
        }
    }

    public static /* synthetic */ String a(a aVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9e52e51c", new Object[]{aVar, str});
        }
        aVar.l = str;
        return str;
    }

    public static /* synthetic */ String b(a aVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("655ecc1d", new Object[]{aVar, str});
        }
        aVar.k = str;
        return str;
    }

    public static /* synthetic */ String c(a aVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2c6ab31e", new Object[]{aVar, str});
        }
        aVar.j = str;
        return str;
    }

    public static /* synthetic */ String d(a aVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f3769a1f", new Object[]{aVar, str});
        }
        aVar.i = str;
        return str;
    }

    public int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue();
        }
        int i = this.f16887a;
        this.f16887a = i + 1;
        if (this.f16887a >= 5) {
            this.f16887a = 0;
        }
        return i;
    }

    public void a(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c19672f", new Object[]{this, bArr});
        } else if (h() || bArr == null || this.f == null) {
        } else {
            this.c.lock();
            while (this.g.size() >= 5) {
                try {
                    this.d.await();
                } catch (Throwable th) {
                    try {
                        th.printStackTrace();
                        return;
                    } finally {
                        this.e.signalAll();
                        this.c.unlock();
                    }
                }
            }
            int a2 = a();
            C0645a c0645a = this.f[a2];
            if (c0645a == null) {
                c0645a = new C0645a();
                this.f[a2] = c0645a;
            }
            byte[] a3 = C0645a.a(c0645a);
            if (a3 == null || a3.length != bArr.length) {
                C0645a.a(c0645a, new byte[bArr.length]);
                a3 = C0645a.a(c0645a);
            }
            System.arraycopy(bArr, 0, a3, 0, bArr.length);
            this.g.add(c0645a);
        }
    }

    public byte[] b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("a9d5fa14", new Object[]{this});
        }
        if (h()) {
            return null;
        }
        this.c.lock();
        while (this.g.size() == 0) {
            try {
                this.e.await();
            } catch (Throwable th) {
                try {
                    th.printStackTrace();
                    return null;
                } finally {
                    this.d.signalAll();
                    this.c.unlock();
                }
            }
        }
        C0645a poll = this.g.poll();
        if (poll != null) {
            return C0645a.a(poll);
        }
        return null;
    }

    static {
        kge.a(-311743497);
        kge.a(1427173061);
        t = null;
    }

    public a() {
        this.f = null;
        this.g = null;
        this.z = true;
        if (t == null) {
            synchronized (a.class) {
                if (t == null) {
                    HandlerThread handlerThread = new HandlerThread("FaceDetect2DImpl");
                    t = handlerThread;
                    handlerThread.start();
                }
            }
        }
        this.s = new Handler(t.getLooper());
        if (this.f == null) {
            this.f = new C0645a[5];
            for (int i = 0; i < 5; i++) {
                this.f[i] = new C0645a();
            }
        }
        if (this.g == null) {
            this.g = new LinkedList();
        }
        this.z = true;
    }

    public void a(ViewGroup viewGroup, Activity activity, IEmbedView iEmbedView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8129023", new Object[]{this, viewGroup, activity, iEmbedView});
            return;
        }
        try {
            UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder("ARTry", 19999, "FaceDetct2DImpl", "", null, null).build());
        } catch (Throwable unused) {
        }
        if (this.m == null) {
            this.m = new FaceDetect2DJNI();
        }
        this.u = activity;
        this.n = new FaceDetect2DGlSurfaceView(this.u, this.b);
        viewGroup.addView((View) this.n, (ViewGroup.LayoutParams) new FrameLayout.LayoutParams(-1, -1));
        f();
        this.v = iEmbedView;
        this.n.onPreviewDataCallBack(new FaceDetect2DGlSurfaceView.OnPreviewDataCallBack() { // from class: com.taobao.cameralink.miniapp.-$$Lambda$a$51xvllyPCSwwKhAjxqkEsr_R2CE
            {
                a.this = this;
            }

            public final void onPreviewData(byte[] bArr, int i, int i2, boolean z) {
                a.lambda$51xvllyPCSwwKhAjxqkEsr_R2CE(a.this, bArr, i, i2, z);
            }
        });
    }

    public /* synthetic */ void b(byte[] bArr, int i, int i2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6366604", new Object[]{this, bArr, new Integer(i), new Integer(i2), new Boolean(z)});
        } else if (h() || TextUtils.isEmpty(this.i) || TextUtils.isEmpty(this.j) || TextUtils.isEmpty(this.k) || TextUtils.isEmpty(this.l) || this.m == null) {
        } else {
            this.m.updateImagePreviewSize(i2, i);
            int i3 = (i * i2) << 2;
            if (this.x == null || this.x.length != i3) {
                this.x = new byte[i3];
            }
            synchronized (this.r) {
                if (this.y == null || this.y.length != i3) {
                    this.y = new byte[i3];
                }
            }
            try {
                a(bArr, this.x, i, i2, z);
                a(this.s, this.x, this.m, i2, i);
            } catch (Throwable th) {
                String str = "meet uncaught exception:" + th;
            }
        }
    }

    private void a(byte[] bArr, byte[] bArr2, int i, int i2, boolean z) {
        byte[] a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95e09e7e", new Object[]{this, bArr, bArr2, new Integer(i), new Integer(i2), new Boolean(z)});
        } else if (bArr == null || bArr2 == null || (a2 = a(bArr, i, i2, z)) == null) {
        } else {
            System.arraycopy(a2, 0, bArr2, 0, a2.length);
        }
    }

    private byte[] a(byte[] bArr, int i, int i2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("8bb1a898", new Object[]{this, bArr, new Integer(i), new Integer(i2), new Boolean(z)});
        }
        if (this.o == null) {
            if (this.m != null) {
                this.m.initFaceDetect2DMnnPath(this.k, this.i, this.j, this.l);
            }
            this.o = new XRImage(i, i2, XRImage.Config.YUV_NV21);
        }
        if (this.p == null) {
            this.p = new XRImage(i2, i, XRImage.Config.RGBA);
        }
        if (this.q == null) {
            this.q = new XRImage(i2, i, XRImage.Config.RGBA);
        }
        XRImage xRImage = this.o;
        XRImage xRImage2 = this.p;
        if (xRImage == null || xRImage2 == null) {
            return null;
        }
        xRImage.updateImage(bArr);
        XRImage.convertYuvToRGBAAndRotateClockWise90(this.o, this.p, z);
        return xRImage2.getData(this.x);
    }

    private void a(Handler handler, final byte[] bArr, final FaceDetect2DJNI faceDetect2DJNI, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2bea6c32", new Object[]{this, handler, bArr, faceDetect2DJNI, new Integer(i), new Integer(i2)});
        } else if (h() || handler == null || bArr == null || bArr.length == 0 || faceDetect2DJNI == null) {
        } else {
            final XRImage xRImage = this.q;
            handler.post(new Runnable() { // from class: com.taobao.cameralink.miniapp.-$$Lambda$a$uP2oAlLNkumGPd8FG31abjt-wJE
                {
                    a.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    a.m1052lambda$uP2oAlLNkumGPd8FG31abjtwJE(a.this, bArr, xRImage, faceDetect2DJNI);
                }
            });
            SequenceExecutor.getInstance().post(new Runnable() { // from class: com.taobao.cameralink.miniapp.-$$Lambda$a$4B2drasicc05rTVJxvx_a_7rVUk
                {
                    a.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    a.lambda$4B2drasicc05rTVJxvx_a_7rVUk(a.this, faceDetect2DJNI);
                }
            });
        }
    }

    public /* synthetic */ void a(byte[] bArr, XRImage xRImage, FaceDetect2DJNI faceDetect2DJNI) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a3bce12", new Object[]{this, bArr, xRImage, faceDetect2DJNI});
            return;
        }
        synchronized (this.r) {
            byte[] bArr2 = this.y;
            if (bArr2 == null) {
                return;
            }
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            if (this.z && xRImage != null) {
                xRImage.updateImage(bArr2);
                faceDetect2DJNI.process(xRImage);
            }
            a(bArr2);
        }
    }

    public /* synthetic */ void a(FaceDetect2DJNI faceDetect2DJNI) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a5258a9", new Object[]{this, faceDetect2DJNI});
            return;
        }
        byte[] b = b();
        if (b == null || b.length <= 0) {
            return;
        }
        faceDetect2DJNI.updateBufferWithBytes(b);
        e();
    }

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        FaceDetect2DJNI faceDetect2DJNI = this.m;
        if (faceDetect2DJNI == null || this.w) {
            return;
        }
        com.alibaba.fastjson.JSONObject cameraDataJsonConfig = faceDetect2DJNI.getCameraDataJsonConfig();
        if (this.b) {
            try {
                ByteBuffer buffer = faceDetect2DJNI.getBuffer();
                if (buffer != null) {
                    cameraDataJsonConfig.put("capturedImage", (Object) buffer);
                }
            } catch (Throwable th) {
                Log.getStackTraceString(th);
            }
        }
        if (this.v == null) {
            return;
        }
        if (!this.w) {
            this.w = true;
        }
        try {
            this.v.sendEvent("aRFrame", cameraDataJsonConfig, new IEmbedCallback() { // from class: com.taobao.cameralink.miniapp.-$$Lambda$a$Axly5Gj-LRPM_pHNeaQCQ-upIWQ
                @Override // com.alibaba.ariver.engine.api.embedview.IEmbedCallback
                public final void onResponse(com.alibaba.fastjson.JSONObject jSONObject) {
                    a.m1050lambda$Axly5GjLRPM_pHNeaQCQupIWQ(a.this, jSONObject);
                }
            });
        } catch (Throwable th2) {
            Log.getStackTraceString(th2);
        }
    }

    public /* synthetic */ void a(com.alibaba.fastjson.JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
        } else {
            this.w = false;
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        this.n.resumeCameraRenderView(this.h ? 1 : 0, $$Lambda$a$5AYOz98jZAgW5EVgXEmPL3C_7s.INSTANCE);
    }

    private void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        SequenceExecutor.getInstance().post(new Runnable() { // from class: com.taobao.cameralink.miniapp.-$$Lambda$a$VZjrNfl5b8N9PTsHmoH1bOj8qGE
            {
                a.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                a.lambda$VZjrNfl5b8N9PTsHmoH1bOj8qGE(a.this);
            }
        });
        SequenceExecutor.getInstance().post(new Runnable() { // from class: com.taobao.cameralink.miniapp.-$$Lambda$a$Ej88SjL5lb6EI-1PAFSbTpk_sGk
            {
                a.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                a.m1051lambda$Ej88SjL5lb6EI1PAFSbTpk_sGk(a.this);
            }
        });
        SequenceExecutor.getInstance().post(new Runnable() { // from class: com.taobao.cameralink.miniapp.-$$Lambda$a$Ihs3vZKBzv6Jrf5PZ6OUE2MfkDk
            {
                a.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                a.lambda$Ihs3vZKBzv6Jrf5PZ6OUE2MfkDk(a.this);
            }
        });
        SequenceExecutor.getInstance().post(new Runnable() { // from class: com.taobao.cameralink.miniapp.-$$Lambda$a$jDsw5JJTFcLPfiMC9lOW71oYK1w
            {
                a.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                a.lambda$jDsw5JJTFcLPfiMC9lOW71oYK1w(a.this);
            }
        });
    }

    public /* synthetic */ void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6158674", new Object[]{this});
        } else {
            XRAceDownloader.INSTANCE.addTask("https://gw.alicdn.com/bao/uploaded/TB1.24GsRr0gK0jSZFnXXbRRXXa.zip", new TaskCallBack() { // from class: com.taobao.cameralink.miniapp.a.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                {
                    a.this = this;
                }

                public void onSuccess(int i, String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("631dc082", new Object[]{this, new Integer(i), str});
                        return;
                    }
                    String substring = str.substring(0, str.lastIndexOf("."));
                    a.d(a.this, FileUtil.unzipMnnFolderToDest(str, substring + "_detection"));
                }

                public void onFailed(int i, String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("6c2003aa", new Object[]{this, new Integer(i), str});
                        return;
                    }
                    String str2 = "onFailed: i " + i + " s " + str;
                }

                public void onProgress(int i, float f) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7a562810", new Object[]{this, new Integer(i), new Float(f)});
                        return;
                    }
                    String str = "onProgress: i " + i + " s " + f;
                }
            });
        }
    }

    public /* synthetic */ void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6076ef3", new Object[]{this});
        } else {
            XRAceDownloader.INSTANCE.addTask("https://gw.alicdn.com/bao/uploaded/TB17JtDsNv1gK0jSZFFXXb0sXXa.zip", new TaskCallBack() { // from class: com.taobao.cameralink.miniapp.a.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public void onFailed(int i, String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("6c2003aa", new Object[]{this, new Integer(i), str});
                    }
                }

                public void onProgress(int i, float f) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7a562810", new Object[]{this, new Integer(i), new Float(f)});
                    }
                }

                {
                    a.this = this;
                }

                public void onSuccess(int i, String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("631dc082", new Object[]{this, new Integer(i), str});
                        return;
                    }
                    a.c(a.this, FileUtil.unzipMnnFolderToDest(str, str.substring(0, str.lastIndexOf(".")) + "_points"));
                    String str2 = "onSuccess: points_bin_path " + str;
                }
            });
        }
    }

    public /* synthetic */ void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
        } else {
            XRAceDownloader.INSTANCE.addTask("https://dtmall-tel.alicdn.com/edgeComputingConfig/upload_models/1583239399098/model.zip", new TaskCallBack() { // from class: com.taobao.cameralink.miniapp.a.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public void onFailed(int i, String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("6c2003aa", new Object[]{this, new Integer(i), str});
                    }
                }

                public void onProgress(int i, float f) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7a562810", new Object[]{this, new Integer(i), new Float(f)});
                    }
                }

                {
                    a.this = this;
                }

                public void onSuccess(int i, String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("631dc082", new Object[]{this, new Integer(i), str});
                        return;
                    }
                    a.b(a.this, FileUtil.unzipMnnFolderToDest(str, str.substring(0, str.lastIndexOf(".")) + "_face_attribute"));
                    String str2 = "onSuccess: face_attribute_path " + str;
                }
            });
        }
    }

    public /* synthetic */ void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
        } else {
            XRAceDownloader.INSTANCE.addTask("https://dtmall-tel.alicdn.com/edgeComputingConfig/upload_models/1583223320699/model.mnn.zip", new TaskCallBack() { // from class: com.taobao.cameralink.miniapp.a.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public void onFailed(int i, String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("6c2003aa", new Object[]{this, new Integer(i), str});
                    }
                }

                public void onProgress(int i, float f) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7a562810", new Object[]{this, new Integer(i), new Float(f)});
                    }
                }

                {
                    a.this = this;
                }

                public void onSuccess(int i, String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("631dc082", new Object[]{this, new Integer(i), str});
                        return;
                    }
                    a.a(a.this, FileUtil.unzipMnnFolderToDest(str, str.substring(0, str.lastIndexOf(".")) + "_eyeball"));
                    String str2 = "onSuccess: face_attribute_path " + str;
                }
            });
        }
    }

    private void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
        } else if (!this.z) {
        } else {
            synchronized (this.r) {
                if (this.z) {
                    this.z = false;
                }
            }
        }
    }

    private boolean h() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5cf10f3", new Object[]{this})).booleanValue();
        }
        synchronized (this.r) {
            if (!this.z) {
                z = true;
            }
        }
        return z;
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        g();
        if (this.n != null) {
            this.n.getCameraSession().postOnCameraHandler(new Runnable() { // from class: com.taobao.cameralink.miniapp.-$$Lambda$a$sw9_7PN9OV9HDwrL12sIJ8V7WBY
                {
                    a.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    a.lambda$sw9_7PN9OV9HDwrL12sIJ8V7WBY(a.this);
                }
            });
        }
        if (this.m == null) {
            return;
        }
        this.m.destroy();
        this.m = null;
    }

    public /* synthetic */ void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
            return;
        }
        this.n.onPreviewDataCallBack((FaceDetect2DGlSurfaceView.OnPreviewDataCallBack) null);
        if (this.o != null) {
            this.o.destroy();
            this.o = null;
        }
        if (this.p != null) {
            this.p.destroy();
            this.p = null;
        }
        if (this.q != null) {
            this.q.destroy();
            this.q = null;
        }
        this.n.onDestroy();
        if (this.x != null) {
            this.x = null;
        }
        synchronized (this.r) {
            if (this.y != null) {
                this.y = null;
            }
        }
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.h = z;
        }
    }

    public void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
        } else {
            this.b = z;
        }
    }
}
