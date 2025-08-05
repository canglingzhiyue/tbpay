package tb;

import android.os.SystemClock;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.trtc.api.a;
import com.taobao.trtc.api.e;
import com.taobao.trtc.impl.h;
import com.taobao.trtc.utils.TrtcLog;
import com.taobao.video_remoteso.VideoRemoteSo;
import com.taobao.video_remoteso.api.LoadCallback;
import com.taobao.video_remoteso.api.LoadResult;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.webrtc.NativeLibrary;
import org.webrtc.NativeLibraryLoader;

/* loaded from: classes9.dex */
public class qvb implements NativeLibraryLoader {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a */
    private static qvb f33068a;
    private static final AtomicBoolean b;
    private static final AtomicBoolean c;
    private static final AtomicBoolean d;
    private static List<a> e;
    private static final AtomicBoolean f;
    private static final AtomicBoolean g;
    private static final AtomicBoolean h;
    private static final AtomicBoolean i;

    public static /* synthetic */ void lambda$GCLlsM0fBhqOpcH_HBkrPY2bNqQ(qvb qvbVar, long j, String str, LoadResult loadResult) {
        qvbVar.a(j, str, loadResult);
    }

    public static /* synthetic */ void lambda$rFn8kuTSxZMighd1mAjHL14_DHg(qvb qvbVar, long j, String str, ihz ihzVar) {
        qvbVar.a(j, str, ihzVar);
    }

    static {
        kge.a(1027334470);
        kge.a(1900762432);
        b = new AtomicBoolean(false);
        c = new AtomicBoolean(false);
        d = new AtomicBoolean(false);
        f = new AtomicBoolean(true);
        g = new AtomicBoolean(false);
        h = new AtomicBoolean(false);
        i = new AtomicBoolean(false);
    }

    public static synchronized qvb a() {
        synchronized (qvb.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (qvb) ipChange.ipc$dispatch("f09c9e1", new Object[0]);
            }
            if (f33068a == null) {
                qvc.a();
                e = new LinkedList();
                qvb qvbVar = new qvb();
                f33068a = qvbVar;
                qvbVar.load("artc_engine");
            }
            return f33068a;
        }
    }

    public synchronized boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        f33068a.load("artc_engine");
        return d.get();
    }

    public synchronized void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("108d077c", new Object[]{this, aVar});
            return;
        }
        if (aVar != null) {
            if (d.get()) {
                aVar.a();
            }
            e.add(aVar);
            f33068a.load("artc_engine");
        }
    }

    private static synchronized void a(int i2, String str) {
        synchronized (qvb.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("20f12ca5", new Object[]{new Integer(i2), str});
                return;
            }
            for (a aVar : e) {
                if (i2 == 0) {
                    aVar.a();
                } else {
                    aVar.a(i2, str);
                }
            }
        }
    }

    private boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue();
        }
        try {
            System.loadLibrary(str);
            return true;
        } catch (Throwable th) {
            TrtcLog.a("TrtcNativeLoader", "Failed to load native library: " + str + ", error: " + th.getMessage());
            return false;
        }
    }

    private void a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821975c", new Object[]{this, new Long(j)});
            return;
        }
        e.f23056a = (int) (SystemClock.elapsedRealtime() - j);
        TrtcLog.d("TrtcNativeLoader", "ARTC load success, elpased: " + e.f23056a);
        d.set(true);
        a(0, "");
        NativeLibrary.onLoadResult(true);
    }

    @Override // org.webrtc.NativeLibraryLoader
    public synchronized boolean load(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6772aefb", new Object[]{this, str})).booleanValue();
        } else if (c.get()) {
            TrtcLog.d("TrtcNativeLoader", "artc so load over, result: " + d.get());
            return d.get();
        } else if (b.get()) {
            TrtcLog.d("TrtcNativeLoader", "artc so loadding, result: " + d.get());
            return d.get();
        } else if (f.get() && !c()) {
            TrtcLog.d("TrtcNativeLoader", "avcodec so load fail or loadding");
            return false;
        } else {
            b.compareAndSet(false, true);
            final long elapsedRealtime = SystemClock.elapsedRealtime();
            if (qvc.a(h.TRTC_ORANGE_DEF_BOOL_ENABLE_VIDEO_REMOTE_SO, true)) {
                VideoRemoteSo.loadAsync(str, new LoadCallback() { // from class: tb.-$$Lambda$qvb$GCLlsM0fBhqOpcH_HBkrPY2bNqQ
                    @Override // com.taobao.video_remoteso.api.LoadCallback
                    public final void onLoadFinished(LoadResult loadResult) {
                        qvb.lambda$GCLlsM0fBhqOpcH_HBkrPY2bNqQ(qvb.this, elapsedRealtime, str, loadResult);
                    }
                });
            } else {
                ihq.a().a(str, new ihy() { // from class: tb.-$$Lambda$qvb$rFn8kuTSxZMighd1mAjHL14_DHg
                    @Override // tb.ihy
                    public final void onLoadFinished(ihz ihzVar) {
                        qvb.lambda$rFn8kuTSxZMighd1mAjHL14_DHg(qvb.this, elapsedRealtime, str, ihzVar);
                    }
                });
            }
            return d.get();
        }
    }

    public /* synthetic */ void a(long j, String str, LoadResult loadResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29c2c687", new Object[]{this, new Long(j), str, loadResult});
            return;
        }
        c.set(true);
        b.set(false);
        if (loadResult.isLoadSuccess()) {
            TrtcLog.d("TrtcNativeLoader", "VideoRemoteSo load success, " + loadResult.toString());
            a(j);
            return;
        }
        TrtcLog.d("TrtcNativeLoader", "VideoRemoteSo load fail, " + loadResult.toString());
        if (a(str)) {
            a(j);
        } else if (loadResult.getException() != null) {
            a(loadResult.getException().getErrorCode(), loadResult.getException().getErrorMsg());
        } else {
            a(-1, "unkown");
        }
    }

    public /* synthetic */ void a(long j, String str, ihz ihzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1616e17b", new Object[]{this, new Long(j), str, ihzVar});
            return;
        }
        c.set(true);
        b.set(false);
        if (ihzVar.g()) {
            TrtcLog.d("TrtcNativeLoader", "RemoteSo load success, " + ihzVar.toString());
            a(j);
            return;
        }
        TrtcLog.d("TrtcNativeLoader", "RemoteSo load fail, " + ihzVar.toString());
        if (a(str)) {
            a(j);
        } else if (ihzVar.f() != null) {
            a(ihzVar.f().getErrorCode(), ihzVar.f().getErrorMsg());
        } else {
            a(-1, "unkown");
        }
    }

    public static synchronized void a(boolean z) {
        synchronized (qvb.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821d36c", new Object[]{new Boolean(z)});
            } else {
                f.set(z);
            }
        }
    }

    private boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue();
        }
        if (h.get() || g.get()) {
            return i.get();
        }
        g.compareAndSet(false, true);
        if (qvc.a(h.TRTC_ORANGE_DEF_BOOL_ENABLE_VIDEO_REMOTE_SO, true)) {
            VideoRemoteSo.loadAsync("avcodec", $$Lambda$qvb$yJ4RP5GZ1mdMViC5ZA_2oFBGKB4.INSTANCE);
        } else {
            ihq.a().a("avcodec", $$Lambda$qvb$194zCBaXlhpCMMEeXAxgZG33s7Q.INSTANCE);
        }
        return i.get();
    }

    public static /* synthetic */ void a(LoadResult loadResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c071e49", new Object[]{loadResult});
            return;
        }
        h.set(true);
        g.set(false);
        if (loadResult.isLoadSuccess()) {
            TrtcLog.d("TrtcNativeLoader", "RemoteSo load success(avcodec), " + loadResult.toString());
            i.set(true);
            return;
        }
        TrtcLog.d("TrtcNativeLoader", "RemoteSo load fail(avcodec), " + loadResult.toString());
    }

    public static /* synthetic */ void a(ihz ihzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edb3c9bd", new Object[]{ihzVar});
            return;
        }
        h.set(true);
        g.set(false);
        if (ihzVar.g()) {
            TrtcLog.d("TrtcNativeLoader", "RemoteSo load success(avcodec), " + ihzVar.toString());
            i.set(true);
            return;
        }
        TrtcLog.d("TrtcNativeLoader", "RemoteSo load fail(avcodec), " + ihzVar.toString());
    }
}
