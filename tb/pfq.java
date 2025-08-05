package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;

/* loaded from: classes8.dex */
public final class pfq {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion;

    /* renamed from: a  reason: collision with root package name */
    private final List<pbu<?>> f32604a;
    private final sus b;
    private final est c;

    static {
        kge.a(1510190897);
        Companion = new a(null);
    }

    public pfq(sus messageCenter, est multiTabBaseInfoManager) {
        q.d(messageCenter, "messageCenter");
        q.d(multiTabBaseInfoManager, "multiTabBaseInfoManager");
        this.b = messageCenter;
        this.c = multiTabBaseInfoManager;
        this.f32604a = new ArrayList();
    }

    /* loaded from: classes8.dex */
    public static final class a {
        static {
            kge.a(1170936121);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }
    }

    private final void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        for (pbu<?> pbuVar : this.f32604a) {
            this.b.a(pbuVar);
        }
    }

    private final void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        for (pbu<?> pbuVar : this.f32604a) {
            this.b.b(pbuVar);
        }
    }

    public final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        com.taobao.tab2interact.core.utils.a.b(this, "InteractTabAdapterManager", "页面创建的时机");
        c();
    }

    public final void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        com.taobao.tab2interact.core.utils.a.b(this, "InteractTabAdapterManager", "页面销毁的时机");
        d();
    }

    public final void a(String tabId, String tabFluidInstanceId) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, tabId, tabFluidInstanceId});
            return;
        }
        q.d(tabId, "tabId");
        q.d(tabFluidInstanceId, "tabFluidInstanceId");
        com.taobao.tab2interact.core.utils.a.b(this, "InteractTabAdapterManager", "视频Tab创建的时机，tabId=" + tabId + "，tabFluidInstanceId=" + tabFluidInstanceId);
        this.c.a(tabId, tabFluidInstanceId);
    }

    public final void a(String tabId, com.taobao.android.tab2liveroom.liveroom.a liveRoomComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edb086f0", new Object[]{this, tabId, liveRoomComponent});
            return;
        }
        q.d(tabId, "tabId");
        q.d(liveRoomComponent, "liveRoomComponent");
        com.taobao.tab2interact.core.utils.a.b(this, "InteractTabAdapterManager", "直播Tab创建的时机，tabId=" + tabId + "，liveRoomComponent=" + liveRoomComponent);
        this.c.a(tabId, liveRoomComponent);
    }

    public final void a(String tabId) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, tabId});
            return;
        }
        q.d(tabId, "tabId");
        com.taobao.tab2interact.core.utils.a.b(this, "InteractTabAdapterManager", "Tab销毁的时机，tabId=" + tabId);
        this.c.a(tabId);
    }

    public final void a(pbu<?> interactTabAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f94ee335", new Object[]{this, interactTabAdapter});
            return;
        }
        q.d(interactTabAdapter, "interactTabAdapter");
        this.f32604a.add(interactTabAdapter);
    }
}
