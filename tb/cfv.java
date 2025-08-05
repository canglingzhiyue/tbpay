package tb;

import android.content.Context;
import com.alibaba.wireless.aliprivacy.c;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes.dex */
public class cfv {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static volatile boolean d = false;
    private static final Object e = new Object();

    /* renamed from: a  reason: collision with root package name */
    private cfo f26271a;
    private cfn b;
    private cga c;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static cfv f26272a = new cfv();
    }

    public static cfv a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (cfv) ipChange.ipc$dispatch("f03330b", new Object[0]) : a.f26272a;
    }

    public cga b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (cga) ipChange.ipc$dispatch("16b4d9a0", new Object[]{this}) : this.c;
    }

    public void a(cga cgaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e35d413b", new Object[]{this, cgaVar});
        } else {
            this.c = cgaVar;
        }
    }

    public void a(Context context, cft cftVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("756d4cbf", new Object[]{this, context, cftVar});
            return;
        }
        cfw.f26273a = context;
        if (context == null) {
            c.a("SettingPageManager", "sAppContext is null");
        }
        if (cftVar != null) {
            this.f26271a = cftVar.a();
            this.b = cftVar.b();
        }
        d();
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        synchronized (e) {
            if (!d && this.b != null) {
                this.b.a();
                d = true;
            }
        }
    }

    public cfo c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cfo) ipChange.ipc$dispatch("1e667cf0", new Object[]{this});
        }
        if (this.f26271a == null) {
            this.f26271a = new cfm();
        }
        return this.f26271a;
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            cfx.a().a(str);
        }
    }
}
