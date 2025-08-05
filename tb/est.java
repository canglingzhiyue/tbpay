package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tab2liveroom.liveroom.a;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.q;

/* loaded from: classes8.dex */
public final class est {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, sux> f27549a = new LinkedHashMap();
    private final Map<String, a> b = new LinkedHashMap();
    private final Map<String, a.InterfaceC0586a> c = new LinkedHashMap();

    static {
        kge.a(-165946);
    }

    public final void a(String tabId, String tabFluidInstanceId) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, tabId, tabFluidInstanceId});
            return;
        }
        q.d(tabId, "tabId");
        q.d(tabFluidInstanceId, "tabFluidInstanceId");
        this.f27549a.put(tabId, new sux(tabFluidInstanceId));
    }

    public final void a(String tabId) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, tabId});
            return;
        }
        q.d(tabId, "tabId");
        this.f27549a.remove(tabId);
        this.b.remove(tabId);
        this.c.remove(tabId);
    }

    public final void a(String tabId, spx spxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f1e8907", new Object[]{this, tabId, spxVar});
            return;
        }
        q.d(tabId, "tabId");
        sux suxVar = this.f27549a.get(tabId);
        if (suxVar == null) {
            return;
        }
        suxVar.a(spxVar);
    }

    public final String b(String tabId) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6111438d", new Object[]{this, tabId});
        }
        q.d(tabId, "tabId");
        sux suxVar = this.f27549a.get(tabId);
        if (suxVar == null) {
            return null;
        }
        return suxVar.b();
    }

    public final spx c(String tabId) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (spx) ipChange.ipc$dispatch("7dce9ef7", new Object[]{this, tabId});
        }
        q.d(tabId, "tabId");
        sux suxVar = this.f27549a.get(tabId);
        if (suxVar == null) {
            return null;
        }
        return suxVar.a();
    }

    public final void a(String tabId, a liveRoomComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edb086f0", new Object[]{this, tabId, liveRoomComponent});
            return;
        }
        q.d(tabId, "tabId");
        q.d(liveRoomComponent, "liveRoomComponent");
        this.b.put(tabId, liveRoomComponent);
    }

    public final void a(String tabId, a.InterfaceC0586a interactiveMsgHandler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("427f8313", new Object[]{this, tabId, interactiveMsgHandler});
            return;
        }
        q.d(tabId, "tabId");
        q.d(interactiveMsgHandler, "interactiveMsgHandler");
        this.c.put(tabId, interactiveMsgHandler);
    }

    public final a d(String tabId) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("9355b0bf", new Object[]{this, tabId});
        }
        q.d(tabId, "tabId");
        return this.b.get(tabId);
    }

    public final a.InterfaceC0586a e(String tabId) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a.InterfaceC0586a) ipChange.ipc$dispatch("b11a2f01", new Object[]{this, tabId});
        }
        q.d(tabId, "tabId");
        return this.c.get(tabId);
    }
}
