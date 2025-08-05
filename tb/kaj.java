package tb;

import android.app.ActivityThread;
import android.content.ContentResolver;
import android.content.IContentProvider;
import android.content.Intent;
import android.net.Uri;
import android.os.IBinder;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.aranger.constant.Constants;
import com.taobao.aranger.core.entity.Call;
import com.taobao.aranger.core.entity.Reply;
import com.taobao.aranger.exception.IPCException;
import com.taobao.aranger.intf.IRemoteService;
import com.taobao.aranger.utils.CallbackManager;
import com.taobao.aranger.utils.b;
import com.taobao.aranger.utils.c;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes6.dex */
public class kaj extends kae {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final Set<String> f29908a;
    private final Uri d;
    private final String e;
    private IRemoteService f;
    private final ActivityThread c = ActivityThread.currentActivityThread();
    private final ContentResolver b = jzv.a().getContentResolver();

    public static /* synthetic */ Object ipc$super(kaj kajVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ Set a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Set) ipChange.ipc$dispatch("a0177257", new Object[0]) : f29908a;
    }

    static {
        kge.a(403511475);
        f29908a = new CopyOnWriteArraySet();
    }

    /* loaded from: classes6.dex */
    public static class a implements IBinder.DeathRecipient {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final IBinder f29909a;
        private final String b;

        static {
            kge.a(137769739);
            kge.a(1219188865);
        }

        public static /* synthetic */ String a(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ec5adfd9", new Object[]{aVar}) : aVar.b;
        }

        public a(IBinder iBinder, String str) {
            this.f29909a = iBinder;
            this.b = str;
        }

        @Override // android.os.IBinder.DeathRecipient
        public void binderDied() {
            IpChange ipChange = $ipChange;
            boolean z = true;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("25f12e35", new Object[]{this});
                return;
            }
            kak.b("QuickRemoteChannel", "binderDied", new Object[0]);
            try {
                this.f29909a.unlinkToDeath(this, 0);
                synchronized (kaj.class) {
                    if (TextUtils.isEmpty(this.b) || !kaj.a().contains(this.b)) {
                        z = false;
                    } else {
                        Intent intent = new Intent();
                        intent.setAction(Constants.ACTION_DISCONNECT);
                        intent.putExtra("processName", this.b);
                        intent.setPackage(jzv.a().getPackageName());
                        jzv.a().sendBroadcast(intent);
                        kaj.a().remove(this.b);
                    }
                }
                if (!z) {
                    return;
                }
                b.a(false, false, new Runnable() { // from class: tb.kaj.a.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            CallbackManager.a().c(a.a(a.this));
                        }
                    }
                });
            } catch (Exception e) {
                kak.a("QuickRemoteChannel", "[QuickBinderDeathRecipient][binderDied]", e, new Object[0]);
            }
        }
    }

    public kaj(Uri uri) {
        this.d = uri;
        this.e = c.a(uri);
    }

    @Override // tb.kae
    public Reply b(Call call) throws IPCException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Reply) ipChange.ipc$dispatch("634e04d1", new Object[]{this, call});
        }
        try {
            return a(this.d).sendCall(call);
        } catch (Exception e) {
            if (e instanceof IPCException) {
                throw ((IPCException) e);
            }
            if (e instanceof RemoteException) {
                throw new IPCException(1, e);
            }
            throw new IPCException(9, e);
        }
    }

    @Override // tb.kah
    public void b(List<String> list) throws IPCException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d39e1eda", new Object[]{this, list});
            return;
        }
        try {
            a(this.d).recycle(list);
        } catch (Exception e) {
            if (e instanceof IPCException) {
                throw ((IPCException) e);
            }
            if (e instanceof RemoteException) {
                throw new IPCException(1, e);
            }
            throw new IPCException(9, e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01a0 A[Catch: Exception -> 0x00d0, TRY_LEAVE, TryCatch #0 {Exception -> 0x00d0, blocks: (B:47:0x0146, B:52:0x018a, B:58:0x0199, B:60:0x01a0, B:72:0x01df, B:73:0x01e6, B:45:0x013f, B:40:0x010b, B:31:0x00d4, B:42:0x0112, B:37:0x00e9, B:49:0x016a), top: B:76:0x00d4, inners: #2, #3, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01df A[Catch: Exception -> 0x00d0, TRY_ENTER, TryCatch #0 {Exception -> 0x00d0, blocks: (B:47:0x0146, B:52:0x018a, B:58:0x0199, B:60:0x01a0, B:72:0x01df, B:73:0x01e6, B:45:0x013f, B:40:0x010b, B:31:0x00d4, B:42:0x0112, B:37:0x00e9, B:49:0x016a), top: B:76:0x00d4, inners: #2, #3, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0112 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.taobao.aranger.intf.IRemoteService a(android.net.Uri r14) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 493
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.kaj.a(android.net.Uri):com.taobao.aranger.intf.IRemoteService");
    }

    private IContentProvider a(Uri uri, int i) throws InvocationTargetException, IllegalAccessException {
        int i2 = i - 1;
        if (i <= 0) {
            kak.b("QuickRemoteChannel", "retryGetProvider limit", new Object[0]);
            kal.a(kal.POINT_ACQUIRE_PROVIDER, false, "limit");
            return null;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        IContentProvider iContentProvider = (IContentProvider) c.b().invoke(this.b, uri);
        if (iContentProvider != null) {
            kak.b("QuickRemoteChannel", "retryGetProvider success", "retry", Integer.valueOf(i2), "uri", uri);
            kal.a(kal.POINT_ACQUIRE_PROVIDER, true, String.valueOf(i2));
            return iContentProvider;
        }
        long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
        if (elapsedRealtime2 >= 10000) {
            kak.b("QuickRemoteChannel", "retryGetProvider timeout", "dur", Long.valueOf(elapsedRealtime2), "retry", Integer.valueOf(i2), "uri", uri);
            kal.a(kal.POINT_ACQUIRE_PROVIDER, false, "timeout_" + i2);
            return a(uri, i2);
        }
        kak.b("QuickRemoteChannel", "retryGetProvider < 10s", "dur", Long.valueOf(elapsedRealtime2), "retry", Integer.valueOf(i2), "uri", uri);
        kal.a(kal.POINT_ACQUIRE_PROVIDER, false, "dur<10s");
        return null;
    }
}
