package com.taobao.trtc.impl;

import android.os.Handler;
import android.os.HandlerThread;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.trtc.api.ITrtcDataStream;
import com.taobao.trtc.api.ITrtcOutputStream;
import com.taobao.trtc.api.TrtcDefines;
import com.taobao.trtc.utils.TrtcLog;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.kge;

/* loaded from: classes9.dex */
public class i implements ITrtcOutputStream {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private TrtcEngineImpl c;
    private final String d;
    private Handler e;
    private ITrtcOutputStream.a f;
    private ITrtcOutputStream.b g;
    private ITrtcDataStream.a h;
    private Runnable n;

    /* renamed from: a  reason: collision with root package name */
    private final Object f23133a = new Object();
    private final Object b = new Object();
    private int i = 0;
    private long j = 0;
    private final AtomicBoolean k = new AtomicBoolean(false);
    private int l = 0;
    private int m = 0;

    static {
        kge.a(-473278802);
        kge.a(89636083);
    }

    public static /* synthetic */ int a(i iVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("26299a48", new Object[]{iVar, new Integer(i)})).intValue();
        }
        iVar.l = i;
        return i;
    }

    public static /* synthetic */ Object a(i iVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("c1db5a84", new Object[]{iVar}) : iVar.b;
    }

    public static /* synthetic */ int b(i iVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("26d645e7", new Object[]{iVar, new Integer(i)})).intValue();
        }
        iVar.m = i;
        return i;
    }

    public static /* synthetic */ ITrtcOutputStream.a b(i iVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ITrtcOutputStream.a) ipChange.ipc$dispatch("553dcf30", new Object[]{iVar}) : iVar.f;
    }

    public static /* synthetic */ ITrtcDataStream.a c(i iVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ITrtcDataStream.a) ipChange.ipc$dispatch("6757ab28", new Object[]{iVar}) : iVar.h;
    }

    public static /* synthetic */ int d(i iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bf3b53e4", new Object[]{iVar})).intValue();
        }
        int i = iVar.m;
        iVar.m = i + 1;
        return i;
    }

    public static /* synthetic */ int e(i iVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("e88b3865", new Object[]{iVar})).intValue() : iVar.l;
    }

    public static /* synthetic */ int f(i iVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("11db1ce6", new Object[]{iVar})).intValue() : iVar.m;
    }

    public static /* synthetic */ Runnable g(i iVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Runnable) ipChange.ipc$dispatch("688327a0", new Object[]{iVar}) : iVar.n;
    }

    public static /* synthetic */ Handler h(i iVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Handler) ipChange.ipc$dispatch("bcbed2b1", new Object[]{iVar}) : iVar.e;
    }

    public static /* synthetic */ TrtcEngineImpl i(i iVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TrtcEngineImpl) ipChange.ipc$dispatch("80455838", new Object[]{iVar}) : iVar.c;
    }

    public static /* synthetic */ int j(i iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b71aaeea", new Object[]{iVar})).intValue();
        }
        int i = iVar.l;
        iVar.l = i + 1;
        return i;
    }

    public static /* synthetic */ String k(i iVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f349c028", new Object[]{iVar}) : iVar.d;
    }

    public i(TrtcEngineImpl trtcEngineImpl, String str) {
        this.c = trtcEngineImpl;
        this.d = str;
        TrtcLog.d("OutputStream", "new output stream, id:" + str);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        synchronized (this.f23133a) {
            if (this.k.get()) {
                return;
            }
            HandlerThread handlerThread = new HandlerThread("trtc-output-stream");
            handlerThread.start();
            this.e = new Handler(handlerThread.getLooper());
            this.k.set(true);
            TrtcLog.d("OutputStream", "init output stream, id:" + this.d);
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        TrtcLog.d("OutputStream", "dispose output stream, id:" + this.d);
        this.k.set(false);
        synchronized (this.f23133a) {
            if (this.e != null) {
                this.e.getLooper().quit();
                this.e = null;
            }
        }
        this.c = null;
        this.i = 0;
        this.j = 0L;
    }

    public void a(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            com.taobao.artc.utils.a.a(new Runnable() { // from class: com.taobao.trtc.impl.i.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    synchronized (i.a(i.this)) {
                        if (i.b(i.this) != null) {
                            i.b(i.this);
                        }
                    }
                }
            });
        }
    }

    public void a(final byte[] bArr, final int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2713f1b4", new Object[]{this, bArr, new Integer(i)});
        } else {
            com.taobao.artc.utils.a.a(new Runnable() { // from class: com.taobao.trtc.impl.i.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    TrtcDefines.f fVar = new TrtcDefines.f();
                    fVar.f23038a = (byte[]) bArr.clone();
                    fVar.b = i;
                    synchronized (i.a(i.this)) {
                        if (i.c(i.this) == null) {
                            TrtcLog.a("OutputStream", "notify data frame, but no observer");
                            return;
                        }
                        i.c(i.this).a(fVar);
                        i.d(i.this);
                    }
                }
            });
        }
    }

    public void a(TrtcDefines.n nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1acfda08", new Object[]{this, nVar});
            return;
        }
        synchronized (this.b) {
        }
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        synchronized (this.b) {
            if (this.e != null) {
                if (this.n == null) {
                    this.n = new Runnable() { // from class: com.taobao.trtc.impl.i.3
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                return;
                            }
                            TrtcLog.d("OutputStream", "DataChannel send: " + i.e(i.this) + ", recv: " + i.f(i.this));
                            i iVar = i.this;
                            i.a(iVar, i.b(iVar, 0));
                            i.h(i.this).postDelayed(i.g(i.this), 5000L);
                        }
                    };
                }
                this.e.postDelayed(this.n, 5000L);
            }
        }
    }

    @Override // com.taobao.trtc.api.ITrtcOutputStream
    public void setObserver(ITrtcOutputStream.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54e254d2", new Object[]{this, aVar});
            return;
        }
        synchronized (this.f23133a) {
            this.f = aVar;
        }
        TrtcLog.d("OutputStream", "set video observer: " + aVar);
    }

    @Override // com.taobao.trtc.api.ITrtcOutputStream
    public void setStatsObserver(ITrtcOutputStream.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd902716", new Object[]{this, bVar});
            return;
        }
        synchronized (this.b) {
            this.g = bVar;
        }
    }

    @Override // com.taobao.trtc.api.ITrtcOutputStream
    public String streamId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd16091e", new Object[]{this}) : this.d;
    }

    @Override // com.taobao.trtc.api.ITrtcDataStream
    public void setDataStreamObserver(ITrtcDataStream.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("578ad2df", new Object[]{this, aVar});
            return;
        }
        synchronized (this.b) {
            this.h = aVar;
        }
        TrtcLog.d("OutputStream", "set data observer: " + aVar);
    }

    @Override // com.taobao.trtc.api.ITrtcDataStream
    public void sendDataFrame(final TrtcDefines.f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed9e88f6", new Object[]{this, fVar});
        } else if (!this.k.get()) {
        } else {
            com.taobao.artc.utils.a.a(new Runnable() { // from class: com.taobao.trtc.impl.i.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (i.i(i.this) == null) {
                    } else {
                        i.j(i.this);
                        i.i(i.this).a(i.k(i.this), fVar);
                    }
                }
            });
        }
    }
}
