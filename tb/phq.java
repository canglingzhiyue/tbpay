package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.room.business.trivial.a;
import com.taobao.taolive.sdk.core.h;
import com.taobao.taolive.sdk.model.BaseRecModel;
import com.taobao.tbliveinteractive.e;
import java.lang.ref.WeakReference;

/* loaded from: classes8.dex */
public class phq extends h {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public e o;
    public BaseRecModel p;
    public WeakReference<phr> q;
    public a r;
    private pht s;
    private sef t = new sef();
    private boolean v;

    static {
        kge.a(-1378314451);
    }

    public e p() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (e) ipChange.ipc$dispatch("2ea9adc3", new Object[]{this}) : this.o;
    }

    public void a(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3e27dec", new Object[]{this, eVar});
        } else {
            this.o = eVar;
        }
    }

    public void a(pht phtVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9a2fbdc", new Object[]{this, phtVar});
        } else {
            this.s = phtVar;
        }
    }

    public sef C() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (sef) ipChange.ipc$dispatch("28391228", new Object[]{this}) : this.t;
    }

    public pht q() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (pht) ipChange.ipc$dispatch("8a237912", new Object[]{this}) : this.s;
    }

    public BaseRecModel r() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BaseRecModel) ipChange.ipc$dispatch("77924a51", new Object[]{this}) : this.p;
    }

    public phr s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (phr) ipChange.ipc$dispatch("9986c392", new Object[]{this});
        }
        WeakReference<phr> weakReference = this.q;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    public void a(phr phrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9a2131e", new Object[]{this, phrVar});
        } else {
            this.q = new WeakReference<>(phrVar);
        }
    }

    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43ab80eb", new Object[]{this, aVar});
        } else {
            this.r = aVar;
        }
    }

    public void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
        } else {
            this.v = z;
        }
    }

    public boolean F() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3eff1d1", new Object[]{this})).booleanValue() : this.v;
    }
}
