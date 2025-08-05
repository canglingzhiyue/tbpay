package tb;

import android.content.Context;
import android.os.Looper;
import com.alibaba.wireless.aliprivacyext.track.model.TrackLog;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public class cgk implements cgi {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Context f26290a;
    private final ThreadPoolExecutor b;
    private final com.alibaba.wireless.aliprivacyext.track.model.a c;

    /* loaded from: classes3.dex */
    public class a implements ThreadFactory {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Thread) ipChange.ipc$dispatch("d8079a58", new Object[]{this, runnable}) : new Thread(runnable, "aliprivacy-easy-track");
        }
    }

    /* loaded from: classes3.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ List f26292a;

        public b(List list) {
            this.f26292a = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                cgk.a(cgk.this, this.f26292a);
            }
        }
    }

    /* loaded from: classes3.dex */
    public class c implements com.alibaba.wireless.aliprivacyext.http.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // com.alibaba.wireless.aliprivacyext.http.a
        public void a(com.alibaba.wireless.aliprivacyext.http.model.response.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cd69ac9f", new Object[]{this, aVar});
            }
        }

        @Override // com.alibaba.wireless.aliprivacyext.http.a
        public void b(com.alibaba.wireless.aliprivacyext.http.model.response.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c0f930e0", new Object[]{this, aVar});
            }
        }
    }

    public cgk(Context context) {
        this.f26290a = context;
        this.c = a(context);
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new a());
        this.b = threadPoolExecutor;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
    }

    public static /* synthetic */ void a(cgk cgkVar, List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f92257e2", new Object[]{cgkVar, list});
        } else {
            cgkVar.b(list);
        }
    }

    private void b(List<TrackLog> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d39e1eda", new Object[]{this, list});
            return;
        }
        com.alibaba.wireless.aliprivacyext.track.model.b bVar = new com.alibaba.wireless.aliprivacyext.track.model.b();
        bVar.clientInfo = this.c;
        bVar.wirelessLogs = list;
        com.alibaba.wireless.aliprivacyext.http.b.a(this.f26290a, bVar, new c());
    }

    private com.alibaba.wireless.aliprivacyext.track.model.a a(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.alibaba.wireless.aliprivacyext.track.model.a) ipChange.ipc$dispatch("132156f6", new Object[]{this, context}) : new com.alibaba.wireless.aliprivacyext.track.model.a(context);
    }

    @Override // tb.cgi
    public void a(List<TrackLog> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
        } else if (Looper.getMainLooper() == Looper.myLooper()) {
            this.b.execute(new b(list));
        } else {
            b(list);
        }
    }
}
