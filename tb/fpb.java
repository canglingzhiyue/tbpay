package tb;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes.dex */
public class fpb extends HandlerThread {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static a f28086a;
    private static HandlerThread b;
    private static boolean c;

    static {
        kge.a(1438142589);
        c = false;
    }

    private fpb(String str) {
        super(str);
    }

    public static synchronized void a(String str) {
        synchronized (fpb.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
                return;
            }
            if (!c) {
                b = new fpb(str);
                Looper looper = null;
                try {
                    b.start();
                } catch (Throwable unused) {
                }
                try {
                    looper = b.getLooper();
                } catch (Throwable unused2) {
                }
                f28086a = new a(looper);
                c = true;
            }
        }
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : c;
    }

    /* loaded from: classes.dex */
    public static class a extends Handler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-246885052);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            if (str.hashCode() == 673877017) {
                super.handleMessage((Message) objArr[0]);
                return null;
            }
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        public a(Looper looper) {
            super(looper);
        }

        public void a(Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("39112e6", new Object[]{this, runnable});
            } else if (runnable == null) {
            } else {
                try {
                    Message obtain = Message.obtain();
                    obtain.what = 1;
                    obtain.obj = runnable;
                    sendMessage(obtain);
                } catch (Throwable unused) {
                }
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
                if (message.obj != null && (message.obj instanceof Runnable)) {
                    ((Runnable) message.obj).run();
                }
            } catch (Throwable unused) {
            }
            super.handleMessage(message);
        }
    }
}
