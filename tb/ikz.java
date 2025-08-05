package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.resourceguardian.data.model.b;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes6.dex */
public class ikz {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final ikz f29130a;
    private static final AtomicBoolean d;
    private final ilf b;
    private final ile c;

    static {
        kge.a(-291791908);
        f29130a = new ikz();
        d = new AtomicBoolean(false);
    }

    public static ikz a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ikz) ipChange.ipc$dispatch("f060086", new Object[0]) : f29130a;
    }

    private ikz() {
        iln ilnVar = new iln();
        ili iliVar = new ili();
        this.b = new ilf(ilnVar, iliVar);
        this.c = new ile(ilnVar, iliVar);
    }

    public void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
        } else if (!d.compareAndSet(false, true)) {
        } else {
            this.b.a(context);
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            this.b.a();
        }
    }

    public boolean a(ilb ilbVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ede13edd", new Object[]{this, ilbVar})).booleanValue() : this.b.a(ilbVar);
    }

    public boolean b(ilb ilbVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("dc64455e", new Object[]{this, ilbVar})).booleanValue() : this.b.b(ilbVar);
    }

    public Map<String, String> a(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("35efba90", new Object[]{this, new Integer(i)}) : this.b.a(i);
    }

    public b a(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("edd1cd96", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)}) : this.c.a(i, i2, i3);
    }
}
