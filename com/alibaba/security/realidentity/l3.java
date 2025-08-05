package com.alibaba.security.realidentity;

import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.text.TextUtils;
import android.view.Surface;
import com.alibaba.security.realidentity.service.track.RPTrack;
import com.alibaba.security.realidentity.service.track.model.TrackLog;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;

/* loaded from: classes3.dex */
public class l3 extends j3 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public int A;
    public byte[] B;
    public String C;
    public MediaCodec o;
    public long p;
    public volatile boolean q;
    public final MediaCodec.BufferInfo r;
    public n3 s;
    public final LinkedBlockingQueue<byte[]> t;
    public Thread u;
    public boolean v;
    public final m3 w;
    public long x;
    public long y;
    public long z;

    /* loaded from: classes3.dex */
    public class a extends Thread {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(String str) {
            super(str);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            while (l3.a(l3.this) && !Thread.interrupted()) {
                try {
                    l3.a(l3.this, (byte[]) l3.b(l3.this).take());
                } catch (InterruptedException unused) {
                    return;
                }
            }
        }
    }

    public l3(Context context) {
        super(context);
        this.A = -1;
        this.w = new m3(context);
        this.r = new MediaCodec.BufferInfo();
        this.t = new LinkedBlockingQueue<>();
    }

    private boolean a(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a821939f", new Object[]{this, new Integer(i)})).booleanValue() : i == 19 || i == 21;
    }

    public static /* synthetic */ boolean a(l3 l3Var) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a2eb2f2f", new Object[]{l3Var})).booleanValue() : l3Var.v;
    }

    public static /* synthetic */ LinkedBlockingQueue b(l3 l3Var) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (LinkedBlockingQueue) ipChange.ipc$dispatch("be4623ee", new Object[]{l3Var}) : l3Var.t;
    }

    private void c(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5e5ddb1", new Object[]{this, bArr});
            return;
        }
        try {
            if (this.t == null || bArr == null) {
                return;
            }
            this.t.put(bArr);
        } catch (Exception unused) {
        }
    }

    public static /* synthetic */ Object ipc$super(l3 l3Var, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.alibaba.security.realidentity.j3
    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public static /* synthetic */ void a(l3 l3Var, byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94f28532", new Object[]{l3Var, bArr});
        } else {
            l3Var.b(bArr);
        }
    }

    @Override // com.alibaba.security.realidentity.j3
    public boolean b(int i, int i2, int i3, int i4, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("98e561b7", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), str})).booleanValue();
        }
        this.C = str;
        return c(i, i2, i3, i4, str);
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        LinkedBlockingQueue<byte[]> linkedBlockingQueue = this.t;
        if (linkedBlockingQueue == null || linkedBlockingQueue.isEmpty()) {
            return;
        }
        com.alibaba.security.realidentity.a.b(j3.i, "video record exception,mVideoQueue is not empty when stop recording");
        TrackLog recordException = TrackLog.recordException(this.t.isEmpty(), this.t.size());
        recordException.setVerifyToken(this.C);
        recordException.addTag9(g2.f3421a + "/" + g2.b);
        recordException.addTag10("Android");
        RPTrack.a(recordException);
    }

    @Override // com.alibaba.security.realidentity.j3
    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        try {
            c();
            this.q = true;
            this.v = false;
            if (this.o != null) {
                this.o.stop();
                this.o.release();
            }
            if (this.s == null) {
                return;
            }
            this.s.c();
            this.s.a();
        } catch (Exception unused) {
        }
    }

    @Override // com.alibaba.security.realidentity.j3
    public void b(byte[] bArr, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4faf26d0", new Object[]{this, bArr, new Integer(i), new Integer(i2)});
        } else if (this.o == null) {
        } else {
            c(bArr);
        }
    }

    private void b(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90ffa270", new Object[]{this, bArr});
            return;
        }
        try {
            if (this.A == 21) {
                s.a().b(bArr, this.B, this.b, this.c);
            } else if (this.A == 19) {
                s.a().a(bArr, this.B, this.b, this.c);
            } else if (this.A == 39) {
                System.arraycopy(bArr, 0, this.B, 0, ((this.b * this.c) * 3) / 2);
            } else if (this.A == 20) {
                s.a().c(bArr, this.B, this.b, this.c);
            }
            ByteBuffer[] inputBuffers = this.o.getInputBuffers();
            int dequeueInputBuffer = this.o.dequeueInputBuffer(10000L);
            if (dequeueInputBuffer != -1) {
                ByteBuffer byteBuffer = inputBuffers[dequeueInputBuffer];
                byteBuffer.clear();
                byteBuffer.put(this.B);
                long currentTimeMillis = (System.currentTimeMillis() * 1000) - this.p;
                if (this.q) {
                    this.o.queueInputBuffer(dequeueInputBuffer, 0, this.B.length, currentTimeMillis, 4);
                } else {
                    this.o.queueInputBuffer(dequeueInputBuffer, 0, this.B.length, currentTimeMillis, 0);
                }
            }
            ByteBuffer[] outputBuffers = this.o.getOutputBuffers();
            int dequeueOutputBuffer = this.o.dequeueOutputBuffer(this.r, 10000L);
            if (dequeueOutputBuffer == -3) {
                outputBuffers = this.o.getOutputBuffers();
            } else if (dequeueOutputBuffer == -2) {
                MediaFormat outputFormat = this.o.getOutputFormat();
                if (this.s != null && !this.q) {
                    this.s.a(0, outputFormat);
                }
            }
            while (dequeueOutputBuffer >= 0) {
                ByteBuffer byteBuffer2 = outputBuffers[dequeueOutputBuffer];
                if (byteBuffer2 == null) {
                    return;
                }
                if ((this.r.flags & 2) != 0) {
                    this.r.size = 0;
                }
                if (this.r.size != 0 && this.s != null && !this.q) {
                    if (this.y > 0 && this.r.presentationTimeUs < this.y) {
                        this.r.presentationTimeUs = this.y + 10000;
                    }
                    a(this.r);
                    byteBuffer2.position(this.r.offset);
                    byteBuffer2.limit(this.r.offset + this.r.size);
                    this.s.a(0, byteBuffer2, this.r);
                }
                this.o.releaseOutputBuffer(dequeueOutputBuffer, false);
                dequeueOutputBuffer = this.o.dequeueOutputBuffer(this.r, 0L);
                if ((this.r.flags & 4) != 0) {
                    this.u.interrupt();
                    this.v = false;
                    return;
                }
            }
        } catch (Throwable unused) {
        }
    }

    private boolean c(int i, int i2, int i3, int i4, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d2367278", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), str})).booleanValue();
        }
        try {
            String b = this.w.b();
            this.A = this.w.a();
            if (TextUtils.isEmpty(b) || this.A == -1) {
                MediaCodecInfo a2 = a(j3.m);
                if (a2 == null) {
                    return false;
                }
                String name = a2.getName();
                this.w.a(name);
                List<Integer> a3 = a(a2, j3.m);
                int i5 = 0;
                while (true) {
                    if (i5 >= a3.size()) {
                        break;
                    } else if (a(a3.get(i5).intValue())) {
                        this.A = a3.get(i5).intValue();
                        break;
                    } else {
                        i5++;
                    }
                }
                if (this.A == -1) {
                    return false;
                }
                this.w.a(this.A);
                b = name;
            }
            MediaFormat createVideoFormat = MediaFormat.createVideoFormat(j3.m, i, i2);
            createVideoFormat.setInteger("bitrate-mode", 2);
            createVideoFormat.setInteger("bitrate", i * i2 * 3);
            createVideoFormat.setInteger("frame-rate", i3);
            createVideoFormat.setInteger("color-format", this.A);
            createVideoFormat.setInteger("i-frame-interval", 1);
            createVideoFormat.setInteger("rotation-degrees", i4);
            MediaCodec createByCodecName = MediaCodec.createByCodecName(b);
            this.o = createByCodecName;
            createByCodecName.configure(createVideoFormat, (Surface) null, (MediaCrypto) null, 1);
            this.o.start();
            this.q = false;
            this.p = System.currentTimeMillis() * 1000;
            this.B = new byte[((this.b * this.c) * 3) / 2];
            n3 n3Var = new n3();
            this.s = n3Var;
            n3Var.a(this.e, i4, str);
            a aVar = new a("video_record_thread");
            this.u = aVar;
            this.v = true;
            aVar.start();
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    private List<Integer> a(MediaCodecInfo mediaCodecInfo, String str) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("4ef81971", new Object[]{this, mediaCodecInfo, str});
        }
        MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(str);
        ArrayList arrayList = new ArrayList();
        while (true) {
            int[] iArr = capabilitiesForType.colorFormats;
            if (i >= iArr.length) {
                return arrayList;
            }
            arrayList.add(Integer.valueOf(iArr[i]));
            i++;
        }
    }

    private MediaCodecInfo a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MediaCodecInfo) ipChange.ipc$dispatch("319f9ac8", new Object[]{this, str});
        }
        int codecCount = MediaCodecList.getCodecCount();
        for (int i = 0; i < codecCount; i++) {
            MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i);
            if (codecInfoAt.isEncoder()) {
                for (String str2 : codecInfoAt.getSupportedTypes()) {
                    if (str2.equalsIgnoreCase(str)) {
                        return codecInfoAt;
                    }
                }
                continue;
            }
        }
        return null;
    }

    private void a(MediaCodec.BufferInfo bufferInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa598e4", new Object[]{this, bufferInfo});
            return;
        }
        long j = bufferInfo.presentationTimeUs;
        this.y = j;
        long j2 = this.x;
        if (j2 == 0) {
            this.x = j;
        } else {
            this.z = j - j2;
        }
    }
}
