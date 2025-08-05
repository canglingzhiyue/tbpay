package android.taobao.util;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.statistic.TBS;
import java.lang.ref.WeakReference;
import java.util.Random;
import tb.kge;

/* loaded from: classes.dex */
public class i extends Handler {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static boolean f1543a;
    public static Random b;
    public static int c;
    private boolean d;
    private WeakReference<Activity> e;

    public static /* synthetic */ Object ipc$super(i iVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode != 40891567) {
            if (hashCode != 72182663) {
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }
            super.dispatchMessage((Message) objArr[0]);
            return null;
        }
        return new Boolean(super.sendMessageAtTime((Message) objArr[0], ((Number) objArr[1]).longValue()));
    }

    static {
        kge.a(-1189650575);
        f1543a = false;
        b = new Random(System.currentTimeMillis());
        c = 0;
    }

    public static void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{new Boolean(z)});
        } else {
            f1543a = z;
        }
    }

    @Override // android.os.Handler
    public boolean sendMessageAtTime(Message message, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("26ff4af", new Object[]{this, message, new Long(j)})).booleanValue();
        }
        if (this.d) {
            return super.sendMessageAtTime(message, j);
        }
        return false;
    }

    public i() {
        this.d = true;
    }

    public i(Handler.Callback callback) {
        super(callback);
        this.d = true;
    }

    public i(Activity activity, Handler.Callback callback) {
        this(callback);
        this.e = new WeakReference<>(activity);
    }

    public i(Looper looper, Handler.Callback callback) {
        super(looper, callback);
        this.d = true;
    }

    public i(Looper looper) {
        super(looper);
        this.d = true;
    }

    @Override // android.os.Handler
    public void dispatchMessage(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44d6b87", new Object[]{this, message});
        } else if (!this.d) {
        } else {
            if (f1543a) {
                WeakReference<Activity> weakReference = this.e;
                if (weakReference != null) {
                    if (weakReference.get() != null) {
                        super.dispatchMessage(message);
                    }
                } else {
                    super.dispatchMessage(message);
                }
            } else {
                try {
                    if (this.e != null) {
                        if (this.e.get() != null) {
                            super.dispatchMessage(message);
                        }
                    } else {
                        super.dispatchMessage(message);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    int nextInt = b.nextInt(100);
                    String str = "random:" + nextInt + " threashold:" + c;
                    if (nextInt < c) {
                        TBS.Adv.onCaughException(e);
                    }
                }
            }
            a(message);
        }
    }

    public void a(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a99d9bb", new Object[]{this, message});
            return;
        }
        message.what = 0;
        message.arg1 = 0;
        message.arg2 = 0;
        message.obj = null;
        message.replyTo = null;
        message.setTarget(null);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            this.d = false;
        }
    }
}
