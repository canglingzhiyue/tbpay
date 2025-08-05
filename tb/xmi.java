package tb;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.os.SystemClock;
import android.view.WindowManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.launcher.bootstrap.tao.ability.dispatch.Dispatchers;
import com.taobao.android.launcher.bootstrap.tao.h;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

/* loaded from: classes5.dex */
public class xmi implements Runnable, xmf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final String f34368a;
    private final Message e;
    private final boolean i;
    private boolean f = false;
    private boolean g = false;
    private long h = 0;
    private final Handler d = d();
    private final Queue<xmh> b = new LinkedBlockingQueue();
    private final Queue<Message> c = new LinkedBlockingQueue();

    public static /* synthetic */ Message a(xmi xmiVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Message) ipChange.ipc$dispatch("91f318e5", new Object[]{xmiVar}) : xmiVar.e;
    }

    public static /* synthetic */ void a(Handler handler, Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ccfc8ceb", new Object[]{handler, message});
        } else {
            b(handler, message);
        }
    }

    public static /* synthetic */ void b(xmi xmiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f60e3cc5", new Object[]{xmiVar});
        } else {
            xmiVar.e();
        }
    }

    public xmi(Message message, String str) {
        this.f34368a = str;
        this.i = guc.a(null, "ngMultiSessionEnabledV2_" + str);
        this.e = Message.obtain(message);
        c();
        Dispatchers.a("Impl", "SubDispatcher");
        Dispatchers.a("Enabled", String.valueOf(this.i));
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else if (!this.i) {
        } else {
            h.b("SubDispatcher", "enqueue(what=" + this.e.what + riy.BRACKET_END_STR);
            this.c.offer(this.e);
        }
    }

    private Handler d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("a41b85fb", new Object[]{this});
        }
        HandlerThread handlerThread = new HandlerThread("NGActivityThread");
        handlerThread.start();
        return new Handler(handlerThread.getLooper());
    }

    @Override // tb.xmf
    public boolean a(xmh xmhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("78ac1e9", new Object[]{this, xmhVar})).booleanValue();
        }
        if (this.i) {
            return this.b.offer(xmhVar);
        }
        return false;
    }

    @Override // tb.xmf
    public boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : this.i;
    }

    @Override // tb.xmf
    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        if (!this.i || this.f) {
            return false;
        }
        this.h = SystemClock.uptimeMillis();
        this.f = true;
        this.d.post(this);
        return true;
    }

    @Override // tb.xmf
    public boolean a(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6a99d9bf", new Object[]{this, message})).booleanValue();
        }
        if (!this.i) {
            return false;
        }
        if (this.g) {
            h.b("SubDispatcher", "handleMessage, dispatched=true");
            return false;
        }
        Message obtain = Message.obtain(message);
        boolean offer = this.c.offer(obtain);
        h.b("SubDispatcher", "enqueue(what=" + obtain.what + riy.BRACKET_END_STR);
        return offer;
    }

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        final Message poll = this.c.poll();
        if (poll == null) {
            h.b("SubDispatcher", "message queue is empty now, dispatched=true");
            this.g = true;
            return;
        }
        h.b("SubDispatcher", "dequeue(what=" + poll.what + riy.BRACKET_END_STR);
        final Handler target = poll.getTarget();
        target.post(new Runnable() { // from class: tb.xmi.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                h.b("SubDispatcher", "handle(what=" + poll.what + riy.BRACKET_END_STR);
                if (poll == xmi.a(xmi.this)) {
                    Dispatchers.a("HeadMsgDispatched", "true");
                }
                xmi.a(target, poll);
                xmi.b(xmi.this);
            }
        });
    }

    private static void b(Handler handler, Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("679d4f6c", new Object[]{handler, message});
            return;
        }
        try {
            handler.handleMessage(message);
        } catch (WindowManager.BadTokenException e) {
            h.a("SubDispatcher", "handle(what=" + message.what + ") failed with bad token ex: ", e);
        } catch (IllegalStateException e2) {
            h.a("SubDispatcher", "handle(what=" + message.what + ") failed with illegal state ex: ", e2);
            String message2 = e2.getMessage();
            if (message2 != null && message2.contains("Activity top position already set to onTop")) {
                return;
            }
            throw e2;
        } catch (Throwable th) {
            h.a("SubDispatcher", "handle(what=" + message.what + ") failed: ", th);
            throw th;
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        xmh poll = this.b.poll();
        if (poll != null) {
            Dispatchers.a("Staging", this.f34368a + riy.BRACKET_START_STR + poll.a() + riy.BRACKET_END_STR);
            StringBuilder sb = new StringBuilder();
            sb.append("run#");
            sb.append(poll.a());
            h.b("SubDispatcher", sb.toString());
            poll.run();
            this.d.post(this);
            return;
        }
        Dispatchers.a("Staging", this.f34368a + riy.BRACKET_START_STR + this.e.what + riy.BRACKET_END_STR);
        long uptimeMillis = SystemClock.uptimeMillis();
        h.b("SubDispatcher", "run#" + this.f34368a + "(what=" + this.e.what + ") started, cost before=" + (uptimeMillis - this.h) + "ms");
        Dispatchers.a("DispatchingTime", String.valueOf(uptimeMillis));
        try {
            e();
            long uptimeMillis2 = SystemClock.uptimeMillis();
            long j = uptimeMillis2 - this.h;
            h.b("SubDispatcher", "run#" + this.f34368a + "(what=" + this.e.what + ") finished, cost total=" + j + "ms");
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f34368a);
            sb2.append(riy.BRACKET_START_STR);
            sb2.append(this.e.what);
            sb2.append(") finished in ");
            sb2.append(j);
            sb2.append("ms");
            Dispatchers.a("Staging", sb2.toString());
            Dispatchers.a("DispatchedTime", String.valueOf(uptimeMillis2));
        } catch (Throwable th) {
            h.a("SubDispatcher", "run#" + this.f34368a + "(what=" + this.e.what + ") failed: ", th);
            throw th;
        }
    }
}
