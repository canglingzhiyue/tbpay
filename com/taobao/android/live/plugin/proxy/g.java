package com.taobao.android.live.plugin.proxy;

import android.text.TextUtils;
import com.alibaba.android.split.k;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.proxy.c;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.kge;
import tb.phg;
import tb.riy;

/* loaded from: classes6.dex */
public abstract class g<IProxyType> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int A_TYPE = 1;
    private static final AtomicBoolean A_TYPE_ONCE;
    private static final int B_TYPE = 2;
    private static final AtomicBoolean B_TYPE_ONCE;
    private AtomicBoolean installPluginOnce;
    public IProxyType local;
    public boolean needLocal = true;
    public IProxyType remote;

    public abstract String getIProxyKey();

    public abstract String getLocalClassName();

    public abstract String getOrangeKey();

    public abstract String getTrackName();

    public static /* synthetic */ boolean access$000(g gVar, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b45aae9b", new Object[]{gVar, new Integer(i)})).booleanValue() : gVar.refreshRemote(i);
    }

    static {
        kge.a(1672886295);
        A_TYPE_ONCE = new AtomicBoolean(false);
        B_TYPE_ONCE = new AtomicBoolean(false);
    }

    public IProxyType getReal() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IProxyType) ipChange.ipc$dispatch("bd6363f7", new Object[]{this});
        }
        if (this.needLocal) {
            IProxyType iproxytype = this.local;
            if (iproxytype != null) {
                return iproxytype;
            }
            e.h();
            return this.remote;
        } else if (this.remote != null) {
            e.h();
            return this.remote;
        } else {
            return this.local;
        }
    }

    public void initAType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65ffc712", new Object[]{this});
            return;
        }
        this.installPluginOnce = new AtomicBoolean(false);
        this.local = (IProxyType) createLocal();
        String simpleName = getClass().getSimpleName();
        if (e.b(getOrangeKey())) {
            this.needLocal = true;
            e.c(riy.ARRAY_START_STR + simpleName + "<init>] force local, return");
            return;
        }
        e.c(riy.ARRAY_START_STR + simpleName + "<init>] try to use remote");
        if (this.installPluginOnce.compareAndSet(false, true)) {
            e.c(riy.ARRAY_START_STR + simpleName + "<init>]  Installing");
            loadAType(simpleName);
            IProxyType iproxytype = (IProxyType) c.a().c().get(getIProxyKey());
            if (iproxytype != null) {
                this.needLocal = false;
                this.remote = iproxytype;
                e.c(riy.ARRAY_START_STR + simpleName + "<init>] use remote, remote: " + this.remote);
            } else {
                this.needLocal = true;
                e.c(riy.ARRAY_START_STR + simpleName + "<init>] use local, remote: null");
                if (!refreshRemote(1)) {
                    c.a().a(new c.a() { // from class: com.taobao.android.live.plugin.proxy.g.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // com.taobao.android.live.plugin.proxy.c.a
                        public void a() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                            } else {
                                g.access$000(g.this, 1);
                            }
                        }
                    });
                }
            }
        } else {
            e.c(riy.ARRAY_START_STR + simpleName + "<init>]  Installed");
        }
        e.a(c.a().b(), getTrackName());
    }

    public void initBType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa443613", new Object[]{this});
            return;
        }
        this.installPluginOnce = new AtomicBoolean(false);
        String simpleName = getClass().getSimpleName();
        if (phg.d().a()) {
            e.c(riy.ARRAY_START_STR + simpleName + "<initBType>] createLocal");
            this.local = (IProxyType) createLocal();
        } else if (e.b()) {
            e.c(riy.ARRAY_START_STR + simpleName + "<initBType>] force local, return");
        } else {
            e.c(riy.ARRAY_START_STR + simpleName + "<initBType>] try to use remote");
            if (this.installPluginOnce.compareAndSet(false, true)) {
                e.c(riy.ARRAY_START_STR + simpleName + "<initBType>]  Installing");
                loadBType(simpleName);
                tryToRefreshBTypePlugin();
            } else {
                e.c(riy.ARRAY_START_STR + simpleName + "<initBType>]  Installed");
            }
            e.a(c.a().d(), getTrackName());
        }
    }

    private void tryToRefreshBTypePlugin() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fdea7af1", new Object[]{this});
            return;
        }
        String simpleName = getClass().getSimpleName();
        if (e.b()) {
            e.c(riy.ARRAY_START_STR + simpleName + "<tryToRefreshBTypePlugin>] force local, return");
            return;
        }
        try {
            e.a(c.a().d(), getTrackName());
            IProxyType iproxytype = (IProxyType) c.a().e().get(getIProxyKey());
            if (iproxytype != null) {
                this.remote = iproxytype;
                e.c(riy.ARRAY_START_STR + simpleName + "#tryToRefreshBTypePlugin] use remote, remote: " + this.remote);
                return;
            }
            e.c(riy.ARRAY_START_STR + simpleName + "#tryToRefreshBTypePlugin] use local, remote: null");
            if (refreshRemote(2)) {
                return;
            }
            c.a().a(new c.b() { // from class: com.taobao.android.live.plugin.proxy.g.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.live.plugin.proxy.c.b
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    } else {
                        g.access$000(g.this, 2);
                    }
                }
            });
        } catch (Throwable th) {
            e.c(riy.ARRAY_START_STR + simpleName + "#tryToRefreshPlugin] error: " + th);
        }
    }

    private boolean refreshRemote(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("869f10ff", new Object[]{this, new Integer(i)})).booleanValue();
        }
        IProxyType iproxytype = null;
        if (i == 1) {
            iproxytype = (IProxyType) c.a().c().get(getIProxyKey());
        } else if (i == 2) {
            iproxytype = (IProxyType) c.a().e().get(getIProxyKey());
        }
        if (iproxytype == null) {
            return false;
        }
        this.remote = iproxytype;
        e.c(riy.ARRAY_START_STR + getClass().getSimpleName() + "#refreshBRemote] refresh remote, remote: " + this.remote);
        e.a(true, getTrackName());
        e.a(true, getTrackName());
        return true;
    }

    public <ProxyType extends IProxyType> ProxyType createLocal() {
        if (TextUtils.isEmpty(getLocalClassName())) {
            return null;
        }
        try {
            return (ProxyType) Class.forName(getLocalClassName()).getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void loadAType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6d37ac6", new Object[]{str});
        } else if (!A_TYPE_ONCE.compareAndSet(false, true)) {
        } else {
            if (e.a().d()) {
                try {
                    k.a().a(com.taobao.appbundle.c.Companion.a().a(), false, e.ATYPE, e.TAOLIVE_HOMEPAGE);
                    e.h();
                    e.c(riy.ARRAY_START_STR + str + "<init>] loadAType, app bundle load");
                    return;
                } catch (Throwable th) {
                    e.c(riy.ARRAY_START_STR + str + "<init>] loadAType, app bundle load error: " + th.getMessage());
                    return;
                }
            }
            e.c(riy.ARRAY_START_STR + str + "<init>] loadAType, app bundle load error: enableSyncLoadRemoteModule false");
        }
    }

    public static void loadBType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10248b87", new Object[]{str});
        } else if (!B_TYPE_ONCE.compareAndSet(false, true)) {
        } else {
            if (e.a().d()) {
                try {
                    k.a().a(com.taobao.appbundle.c.Companion.a().a(), false, e.BTYPE, e.TBLIVE_GIFT);
                    e.h();
                    e.c(riy.ARRAY_START_STR + str + "<init>] loadBType, app bundle load");
                    return;
                } catch (Throwable th) {
                    e.c(riy.ARRAY_START_STR + str + "<init>] loadBType, app bundle load error: " + th.getMessage());
                    return;
                }
            }
            e.c(riy.ARRAY_START_STR + str + "<init>] loadBType, app bundle load error: enableSyncLoadRemoteModule false");
        }
    }
}
