package tb;

import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.view.WindowManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.launcher.bootstrap.tao.ability.dispatch.Dispatchers;
import com.taobao.android.launcher.bootstrap.tao.h;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

/* loaded from: classes5.dex */
public class xmg implements Runnable, xmf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Message f34367a;
    private final String b;
    private final boolean f;
    private boolean d = false;
    private long e = 0;
    private final Queue<xmh> c = new LinkedBlockingQueue(5);

    @Override // tb.xmf
    public boolean a(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6a99d9bf", new Object[]{this, message})).booleanValue();
        }
        return false;
    }

    public xmg(Message message, String str) {
        this.f34367a = Message.obtain(message);
        this.b = str;
        this.f = guc.a(null, "ngMultiSessionEnabledV2_" + str);
        Dispatchers.a("Impl", "MainDispatcher");
        Dispatchers.a("Enabled", String.valueOf(this.f));
    }

    @Override // tb.xmf
    public boolean a(xmh xmhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("78ac1e9", new Object[]{this, xmhVar})).booleanValue();
        }
        if (this.f && !this.d) {
            return this.c.offer(xmhVar);
        }
        return false;
    }

    @Override // tb.xmf
    public boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : this.f;
    }

    @Override // tb.xmf
    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        if (!this.f || this.d) {
            return false;
        }
        this.e = SystemClock.uptimeMillis();
        this.d = true;
        this.f34367a.getTarget().postAtFrontOfQueue(this);
        return true;
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        xmh poll = this.c.poll();
        Handler target = this.f34367a.getTarget();
        if (poll != null) {
            Dispatchers.a("Staging", this.b + riy.BRACKET_START_STR + poll.a() + riy.BRACKET_END_STR);
            StringBuilder sb = new StringBuilder();
            sb.append("run#");
            sb.append(poll.a());
            h.b("MainDispatcher", sb.toString());
            poll.run();
            target.postAtFrontOfQueue(this);
            return;
        }
        Dispatchers.a("Staging", this.b + riy.BRACKET_START_STR + this.f34367a.what + riy.BRACKET_END_STR);
        long uptimeMillis = SystemClock.uptimeMillis();
        h.b("MainDispatcher", "run#" + this.b + "(what=" + this.f34367a.what + ") started, cost before=" + (uptimeMillis - this.e) + "ms");
        Dispatchers.a("DispatchingTime", String.valueOf(uptimeMillis));
        try {
            target.handleMessage(this.f34367a);
            long uptimeMillis2 = SystemClock.uptimeMillis();
            long j = uptimeMillis2 - this.e;
            h.b("MainDispatcher", "run#" + this.b + "(what=" + this.f34367a.what + ") finished, cost total=" + j + "ms");
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.b);
            sb2.append(riy.BRACKET_START_STR);
            sb2.append(this.f34367a.what);
            sb2.append(") finished in ");
            sb2.append(j);
            sb2.append("ms");
            Dispatchers.a("Staging", sb2.toString());
            Dispatchers.a("DispatchedTime", String.valueOf(uptimeMillis2));
        } catch (WindowManager.BadTokenException e) {
            h.a("MainDispatcher", "run#" + this.b + "(what=" + this.f34367a.what + ") failed with bad token ex: ", e);
        } catch (Throwable th) {
            h.a("MainDispatcher", "run#" + this.b + "(what=" + this.f34367a.what + ") failed: ", th);
            throw th;
        }
    }
}
