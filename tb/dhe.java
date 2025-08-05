package tb;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alimama.utils.UserTrackLogs;

/* loaded from: classes.dex */
public class dhe implements dhd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private b f26747a;
    private dhd b;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static dhe f26749a;

        static {
            kge.a(2121313305);
            f26749a = new dhe();
        }
    }

    static {
        kge.a(-1478526388);
        kge.a(-1685161709);
    }

    public static /* synthetic */ dhd a(dhe dheVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (dhd) ipChange.ipc$dispatch("49bcb6f", new Object[]{dheVar}) : dheVar.b;
    }

    private dhe() {
        this.f26747a = new b(Looper.getMainLooper());
    }

    public void a(dhd dhdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5218e78", new Object[]{this, dhdVar});
        } else {
            this.b = dhdVar;
        }
    }

    @Override // tb.dhd
    public void a(final String str, final String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d04957ad", new Object[]{this, str, strArr});
        } else if (this.b == null) {
        } else {
            this.f26747a.a(new Runnable() { // from class: tb.dhe.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (dhe.a(dhe.this) == null) {
                    } else {
                        dhe.a(dhe.this).a(str, strArr);
                    }
                }
            });
        }
    }

    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
        } else {
            AppMonitor.Alarm.commitSuccess(UserTrackLogs.UT_PAGE_NAME, str, str2);
        }
    }

    public void a(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee2b490", new Object[]{this, str, str2, str3, str4});
        } else {
            AppMonitor.Alarm.commitFail(UserTrackLogs.UT_PAGE_NAME, str, str2, str3, str4);
        }
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : this.b != null;
    }

    public static dhe b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (dhe) ipChange.ipc$dispatch("16b5523c", new Object[0]) : a.f26749a;
    }

    /* loaded from: classes.dex */
    public static class b extends Handler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(1619737096);
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            if (str.hashCode() == 673877017) {
                super.handleMessage((Message) objArr[0]);
                return null;
            }
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        public b(Looper looper) {
            super(looper);
        }

        public void a(Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("39112e6", new Object[]{this, runnable});
                return;
            }
            apr.c();
            if (runnable == null) {
                return;
            }
            try {
                Message obtain = Message.obtain();
                obtain.what = 1;
                obtain.obj = runnable;
                sendMessage(obtain);
            } catch (Exception e) {
                apr.b("MonitorHandler", e, new Object[0]);
            }
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
                return;
            }
            try {
                if (message.obj instanceof Runnable) {
                    ((Runnable) message.obj).run();
                }
            } catch (Throwable th) {
                apr.b("MonitorHandler", th, new Object[0]);
            }
            super.handleMessage(message);
        }
    }
}
