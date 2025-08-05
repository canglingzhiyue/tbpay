package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tab2interact.core.data.baseinfo.a;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.q;

/* loaded from: classes8.dex */
public abstract class pbu<TabInfo> extends suv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, TabInfo> f32561a;
    private final sus b;
    private final a c;

    static {
        kge.a(1825767557);
    }

    public static /* synthetic */ Object ipc$super(pbu pbuVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -2012643660) {
            super.c((String) objArr[0]);
            return null;
        } else if (hashCode != -227024002) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.c((String) objArr[0], (String) objArr[1]);
            return null;
        }
    }

    public abstract boolean a(String str);

    public abstract TabInfo d();

    public final sus f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (sus) ipChange.ipc$dispatch("3582ebc8", new Object[]{this}) : this.b;
    }

    public final a g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("66ee2488", new Object[]{this}) : this.c;
    }

    public pbu(sus messageCenter, a baseInfoManager) {
        q.d(messageCenter, "messageCenter");
        q.d(baseInfoManager, "baseInfoManager");
        this.b = messageCenter;
        this.c = baseInfoManager;
        this.f32561a = new LinkedHashMap();
    }

    @Override // tb.suv
    public void c(String tabId, String tabType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f277e37e", new Object[]{this, tabId, tabType});
            return;
        }
        q.d(tabId, "tabId");
        q.d(tabType, "tabType");
        super.c(tabId, tabType);
        if (!a(tabId)) {
            return;
        }
        this.f32561a.put(tabId, d());
    }

    @Override // tb.suv
    public void c(String tabId) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, tabId});
            return;
        }
        q.d(tabId, "tabId");
        super.c(tabId);
        if (!a(tabId)) {
            return;
        }
        this.f32561a.remove(tabId);
    }

    public final TabInfo f(String tabId) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TabInfo) ipChange.ipc$dispatch("cac6299b", new Object[]{this, tabId});
        }
        q.d(tabId, "tabId");
        return this.f32561a.get(tabId);
    }

    public final TabInfo e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TabInfo) ipChange.ipc$dispatch("d74af246", new Object[]{this});
        }
        String d = this.c.d();
        if (d != null) {
            return this.f32561a.get(d);
        }
        return null;
    }
}
