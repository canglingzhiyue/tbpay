package com.alibaba.security.realidentity;

import android.content.Context;
import android.media.MediaCodec;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import tb.keu;

/* loaded from: classes3.dex */
public abstract class j3 implements p2 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String i = "CameraVideoRecorder";
    public static final int j = 1;
    public static final int k = 30;
    public static final int l = 1;
    public static final String m = "video/avc";
    public static final int n = 10000;

    /* renamed from: a  reason: collision with root package name */
    public final Context f3448a;
    public int b;
    public int c;
    public String e;
    public BufferedOutputStream f;
    public int h;
    public boolean d = false;
    public final d g = new d(this);

    /* loaded from: classes3.dex */
    public class b implements q2 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final q2 f3449a;

        public b(q2 q2Var) {
            this.f3449a = q2Var;
        }

        @Override // com.alibaba.security.realidentity.q2
        public void a(String str, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8123ad11", new Object[]{this, str, new Integer(i)});
                return;
            }
            e eVar = new e();
            eVar.f3452a = this.f3449a;
            eVar.b = str;
            eVar.c = i;
            j3.a(j3.this).obtainMessage(1, eVar).sendToTarget();
        }
    }

    /* loaded from: classes3.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public int f3450a;
        public ByteBuffer b;
        public MediaCodec.BufferInfo c;

        public c(int i, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
            this.f3450a = i;
            this.b = byteBuffer;
            this.c = bufferInfo;
        }
    }

    /* loaded from: classes3.dex */
    public static class d extends Handler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final j3 f3451a;

        public d(j3 j3Var) {
            super(Looper.getMainLooper());
            this.f3451a = j3Var;
        }

        public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
            if (str.hashCode() == 72182663) {
                super.dispatchMessage((Message) objArr[0]);
                return null;
            }
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        @Override // android.os.Handler
        public void dispatchMessage(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("44d6b87", new Object[]{this, message});
                return;
            }
            super.dispatchMessage(message);
            j3.a(this.f3451a, message);
        }
    }

    /* loaded from: classes3.dex */
    public class e {

        /* renamed from: a  reason: collision with root package name */
        public q2 f3452a;
        public String b;
        public int c;

        public e() {
        }
    }

    public j3(Context context) {
        this.f3448a = context.getApplicationContext();
    }

    public static /* synthetic */ d a(j3 j3Var) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (d) ipChange.ipc$dispatch("9db1ece", new Object[]{j3Var}) : j3Var.g;
    }

    @Override // com.alibaba.security.realidentity.p2
    public void a(r2 r2Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a33f47d2", new Object[]{this, r2Var});
        }
    }

    public abstract void a(boolean z);

    public abstract boolean a();

    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this});
        }
        String str = null;
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(i.a("video_" + System.currentTimeMillis() + (Math.random() * 10000.0d)));
            sb.append(keu.SUFFIX_MP4);
            String sb2 = sb.toString();
            if (this.f3448a.getExternalCacheDir() != null) {
                str = this.f3448a.getExternalCacheDir().toString() + File.separator + sb2;
            } else {
                str = this.f3448a.getCacheDir().getAbsolutePath() + File.separator + sb2;
            }
            com.alibaba.security.realidentity.a.a(i, "RP video saved path: " + str);
        } catch (Throwable unused) {
        }
        return str;
    }

    public abstract void b(byte[] bArr, int i2, int i3);

    public abstract boolean b(int i2, int i3, int i4, int i5, String str);

    public static /* synthetic */ void a(j3 j3Var, Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d74602fc", new Object[]{j3Var, message});
        } else {
            j3Var.a(message);
        }
    }

    @Override // com.alibaba.security.realidentity.p2
    public void a(int i2, int i3, int i4, int i5, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f9450f2", new Object[]{this, new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), str});
        } else if (this.d) {
        } else {
            this.h = i5;
            this.e = b();
            if (a()) {
                try {
                    if (!f.d(this.e)) {
                        f.a(this.e);
                    }
                    this.f = new BufferedOutputStream(new FileOutputStream(this.e));
                } catch (Exception unused) {
                }
            }
            this.b = i2;
            this.c = i3;
            this.d = b(i2, i3, i4, i5, str);
        }
    }

    @Override // com.alibaba.security.realidentity.p2
    public void a(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c19672f", new Object[]{this, bArr});
        } else if (!this.d) {
            com.alibaba.security.realidentity.a.e(i, "record video fail because init fail");
        } else {
            b(bArr, this.b, this.c);
        }
    }

    @Override // com.alibaba.security.realidentity.p2
    public void a(q2 q2Var, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2f58ca3", new Object[]{this, q2Var, new Boolean(z)});
            return;
        }
        a(z);
        this.d = false;
        new b(q2Var).a(this.e, this.h);
        BufferedOutputStream bufferedOutputStream = this.f;
        if (bufferedOutputStream != null) {
            try {
                bufferedOutputStream.flush();
                this.f.close();
            } catch (Exception unused) {
            }
        }
        if (!z) {
            return;
        }
        f.b(this.e);
    }

    public void a(byte[] bArr, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2713f1b4", new Object[]{this, bArr, new Integer(i2)});
            return;
        }
        BufferedOutputStream bufferedOutputStream = this.f;
        if (bufferedOutputStream == null) {
            return;
        }
        try {
            bufferedOutputStream.write(bArr, 0, i2);
        } catch (IOException unused) {
        }
    }

    public byte[] a(byte[] bArr, int i2, int i3) {
        int i4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("b1ec42ee", new Object[]{this, bArr, new Integer(i2), new Integer(i3)});
        }
        int i5 = i2 * i3;
        byte[] bArr2 = new byte[(i5 * 3) / 2];
        System.arraycopy(bArr, 0, bArr2, 0, i5);
        for (int i6 = 0; i6 < i5; i6++) {
            bArr2[i6] = bArr[i6];
        }
        int i7 = 0;
        while (true) {
            i4 = i5 / 2;
            if (i7 >= i4) {
                break;
            }
            int i8 = i5 + i7;
            bArr2[i8 - 1] = bArr[i8];
            i7 += 2;
        }
        for (int i9 = 0; i9 < i4; i9 += 2) {
            int i10 = i5 + i9;
            bArr2[i10] = bArr[i10 - 1];
        }
        return bArr2;
    }

    private void a(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a99d9bb", new Object[]{this, message});
        } else if (message.what != 1) {
        } else {
            a((e) message.obj);
        }
    }

    private void a(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29e66388", new Object[]{this, eVar});
            return;
        }
        q2 q2Var = eVar.f3452a;
        if (q2Var == null) {
            return;
        }
        q2Var.a(eVar.b, eVar.c);
    }
}
