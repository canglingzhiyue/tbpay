package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.messagekit.base.d;
import com.taobao.tao.messagekit.base.monitor.a;
import com.taobao.tao.messagekit.core.utils.MsgLog;

/* loaded from: classes8.dex */
public abstract class oma {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String NORMAL_REQ = "NORMAL";
    public static final String SHUTDOWN_REQ = "SHUTDOWN";

    /* renamed from: a  reason: collision with root package name */
    public String f32172a;
    private String b = "MonitorTask";

    static {
        kge.a(1469377696);
    }

    public oma() {
        this.f32172a = "NORMAL";
        this.f32172a = "NORMAL";
    }

    public a a(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("e5af5b3c", new Object[]{this, new Integer(i)}) : d.a().h().b(i);
    }

    public abstract void a();

    public String aP_() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("4f0276c9", new Object[]{this}) : this.f32172a;
    }

    public abstract int b();

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        try {
            a();
        } catch (Exception e) {
            MsgLog.c(this.b, "MonitorTask run error");
            e.printStackTrace();
        }
    }
}
