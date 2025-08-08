package tb;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.messagekit.core.model.a;
import com.taobao.tao.messagekit.core.utils.MsgLog;
import com.taobao.tao.powermsg.d;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes8.dex */
public class ong {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int FLAG_PUSH = 1;
    public static final int FLAG_RESET = 0;

    /* renamed from: a  reason: collision with root package name */
    public int f32202a;
    public String b;
    public String c;
    public int e;
    public long f;
    public jdz n;
    public a o;
    public int d = 1;
    public Long g = -1L;
    public int h = 0;
    public int i = 0;
    public AtomicInteger j = new AtomicInteger(0);
    public AtomicInteger k = new AtomicInteger(0);
    public AtomicInteger l = new AtomicInteger(0);
    public AtomicInteger m = new AtomicInteger(0);

    static {
        kge.a(-1347809955);
    }

    public ong(int i, String str, String str2, int i2, int i3) {
        this.b = "";
        this.c = "";
        this.f32202a = i;
        this.b = str;
        this.c = StringUtils.isEmpty(str2) ? "" : str2;
        a(i2, i3);
        this.o = new oni(this);
    }

    public static String a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5178ea4", new Object[]{str, str2});
        }
        return str + "b:" + d.a(str2);
    }

    public int a(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5c1152bb", new Object[]{this, new Integer(i), new Integer(i2)})).intValue();
        }
        this.d = i;
        this.e = i2;
        return this.d;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        this.j.set(0);
        MsgLog.a("PullManager", "stopPullMsgInterval >", this.b, this.c, "type", Integer.valueOf(this.d));
        this.k.set(0);
        this.l.set(1);
        this.m.set(0);
        this.o = null;
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : this.l.get() == 1;
    }
}
