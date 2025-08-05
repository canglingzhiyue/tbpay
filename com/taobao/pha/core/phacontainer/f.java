package com.taobao.pha.core.phacontainer;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.pha.core.model.PageModel;
import com.taobao.pha.core.phacontainer.pullrefresh.IPullRefreshLayout;
import java.util.HashSet;
import java.util.Set;
import tb.kge;

/* loaded from: classes7.dex */
public class f {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final Set<String> f18776a;
    private final c b;
    private boolean c = true;
    private boolean d = true;

    private boolean a(IPullRefreshLayout iPullRefreshLayout) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("2178a26d", new Object[]{this, iPullRefreshLayout})).booleanValue() : iPullRefreshLayout != null;
    }

    static {
        kge.a(118094971);
        HashSet hashSet = new HashSet();
        f18776a = hashSet;
        hashSet.add("live_video");
        f18776a.add("short_video");
    }

    public f(c cVar) {
        this.b = cVar;
    }

    public void a(PageModel pageModel) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("737dfcbc", new Object[]{this, pageModel});
        } else if (pageModel == null) {
        } else {
            this.d = pageModel.isEnableHardPullRefresh();
            if ((f18776a.contains(pageModel._type) || !pageModel.isEnableHardPullRefresh()) && !pageModel.isEnableSoftPullRefresh()) {
                z = false;
            }
            this.c = z;
        }
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : this.d;
    }

    private IPullRefreshLayout f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IPullRefreshLayout) ipChange.ipc$dispatch("a31bc2e", new Object[]{this});
        }
        c cVar = this.b;
        if (!(cVar instanceof d)) {
            return null;
        }
        return ((d) cVar).getPullRefreshLayout();
    }

    public boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue();
        }
        if (!this.c) {
            return true;
        }
        IPullRefreshLayout f = f();
        if (!a(f)) {
            return false;
        }
        if ("light".equals(str)) {
            f.setColorScheme(IPullRefreshLayout.ColorScheme.LIGHT);
        } else if ("dark".equals(str)) {
            f.setColorScheme(IPullRefreshLayout.ColorScheme.DARK);
        } else {
            f.setColorScheme(IPullRefreshLayout.ColorScheme.NORMAL);
        }
        return true;
    }

    public boolean a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a821939f", new Object[]{this, new Integer(i)})).booleanValue();
        }
        if (!this.c) {
            return true;
        }
        IPullRefreshLayout f = f();
        if (!a(f)) {
            return false;
        }
        f.setBackgroundColor(i);
        return true;
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        if (!this.c) {
            return true;
        }
        IPullRefreshLayout f = f();
        if (!a(f)) {
            return false;
        }
        f.setRefreshing(true);
        return true;
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue();
        }
        if (!this.c) {
            return true;
        }
        IPullRefreshLayout f = f();
        if (!a(f)) {
            return false;
        }
        f.setRefreshing(false);
        return true;
    }

    public boolean a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a821d370", new Object[]{this, new Boolean(z)})).booleanValue();
        }
        IPullRefreshLayout f = f();
        if (f == null) {
            return false;
        }
        f.setEnabled(true);
        this.c = true;
        this.d = z;
        return true;
    }

    public boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue();
        }
        IPullRefreshLayout f = f();
        if (f == null) {
            return false;
        }
        f.setRefreshing(false);
        f.setEnabled(false);
        this.c = false;
        return true;
    }

    public boolean e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue() : this.c;
    }
}
