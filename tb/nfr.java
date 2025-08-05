package tb;

import android.app.Activity;
import android.content.ContentResolver;
import android.os.Handler;
import android.os.HandlerThread;
import android.provider.MediaStore;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.view.Window;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes7.dex */
public class nfr {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final String c;

    /* renamed from: a  reason: collision with root package name */
    public nfp f31428a;
    public HandlerThread b;
    private nfq f;
    private nfq g;
    private Handler h;
    private Activity i;
    private final List<nfp> d = new CopyOnWriteArrayList();
    private final AtomicBoolean e = new AtomicBoolean(false);
    private boolean j = true;
    private long k = Long.MAX_VALUE;

    public static /* synthetic */ long a(nfr nfrVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("f61c32d2", new Object[]{nfrVar})).longValue() : nfrVar.k;
    }

    public static /* synthetic */ List b(nfr nfrVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("d98ecf08", new Object[]{nfrVar}) : nfrVar.d;
    }

    static {
        kge.a(-457150230);
        c = nfr.class.getName();
    }

    public nfr(Activity activity) {
        this.i = activity;
    }

    public void a(nfp nfpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f61b4a20", new Object[]{this, nfpVar});
        } else if (nfpVar == null) {
        } else {
            if (!this.e.get()) {
                d();
            }
            this.d.add(nfpVar);
        }
    }

    public boolean a(boolean z) {
        Window window;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a821d370", new Object[]{this, new Boolean(z)})).booleanValue();
        }
        Activity activity = this.i;
        if (activity == null || (window = activity.getWindow()) == null) {
            return false;
        }
        this.j = z;
        if (z) {
            window.clearFlags(8192);
        } else {
            this.i.getWindow().setFlags(8192, 8192);
        }
        return true;
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : this.j;
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        this.d.clear();
        c();
        this.i = null;
    }

    private void c() {
        ContentResolver contentResolver;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else if (this.i == null || !this.e.getAndSet(false) || (contentResolver = this.i.getContentResolver()) == null) {
        } else {
            nfq nfqVar = this.f;
            if (nfqVar != null) {
                contentResolver.unregisterContentObserver(nfqVar);
            }
            nfq nfqVar2 = this.g;
            if (nfqVar2 != null) {
                contentResolver.unregisterContentObserver(nfqVar2);
            }
            HandlerThread handlerThread = this.b;
            if (handlerThread == null) {
                return;
            }
            handlerThread.quitSafely();
        }
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else if (this.i == null || this.e.getAndSet(true)) {
        } else {
            if (!e()) {
                f();
            }
            try {
                this.b = new HandlerThread("pha-screen-capture-thread");
                this.b.start();
                this.h = new Handler(this.b.getLooper());
                ngr.c(c, "pha-screen-capture-thread succeeds to start.");
            } catch (Exception e) {
                String str = c;
                ngr.b(str, "pha-screen-capture-thread fails to start with exception: " + ngn.a(e));
            }
            try {
                this.f = new nfq(this.i, MediaStore.Images.Media.INTERNAL_CONTENT_URI, this.h);
                this.g = new nfq(this.i, MediaStore.Images.Media.EXTERNAL_CONTENT_URI, this.h);
            } catch (Exception e2) {
                String str2 = c;
                ngr.b(str2, "failed to instantiate observers with exception: " + ngn.a(e2));
            }
            this.f31428a = new nfp() { // from class: tb.nfr.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.nfp
                public void a(nfs nfsVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f61ca73d", new Object[]{this, nfsVar});
                    } else if (nfsVar.f >= nfr.a(nfr.this)) {
                        for (nfp nfpVar : nfr.b(nfr.this)) {
                            if (nfpVar != null) {
                                nfpVar.a(nfsVar);
                            }
                        }
                    }
                }
            };
            ContentResolver contentResolver = this.i.getContentResolver();
            if (contentResolver == null) {
                return;
            }
            this.k = System.currentTimeMillis();
            nfq nfqVar = this.f;
            if (nfqVar != null) {
                nfqVar.a(this.f31428a);
                contentResolver.registerContentObserver(MediaStore.Images.Media.INTERNAL_CONTENT_URI, true, this.f);
            }
            nfq nfqVar2 = this.g;
            if (nfqVar2 == null) {
                return;
            }
            nfqVar2.a(this.f31428a);
            contentResolver.registerContentObserver(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, true, this.g);
        }
    }

    private boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue();
        }
        Activity activity = this.i;
        return activity != null && ContextCompat.checkSelfPermission(activity.getApplicationContext(), "android.permission.READ_EXTERNAL_STORAGE") == 0;
    }

    private void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        Activity activity = this.i;
        if (activity == null) {
            return;
        }
        ActivityCompat.requestPermissions(activity, new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 45325);
    }
}
