package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tab2interact.core.data.baseinfo.a;
import kotlin.jvm.internal.q;

/* loaded from: classes8.dex */
public abstract class pgm<TabInfo> extends pbu<TabInfo> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final est f32635a;

    static {
        kge.a(-1287917748);
    }

    public final est h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (est) ipChange.ipc$dispatch("44dfd1f1", new Object[]{this}) : this.f32635a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pgm(sus messageCenter, a baseInfoManager, est tabBaseInfoManager) {
        super(messageCenter, baseInfoManager);
        q.d(messageCenter, "messageCenter");
        q.d(baseInfoManager, "baseInfoManager");
        q.d(tabBaseInfoManager, "tabBaseInfoManager");
        this.f32635a = tabBaseInfoManager;
    }

    @Override // tb.pbu
    public boolean a(String tabId) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, tabId})).booleanValue();
        }
        q.d(tabId, "tabId");
        return q.a((Object) g().a(tabId), (Object) "video");
    }
}
