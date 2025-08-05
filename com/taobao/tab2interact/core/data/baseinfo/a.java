package com.taobao.tab2interact.core.data.baseinfo;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tab2interact.core.data.baseinfo.PageBaseInfo;
import com.taobao.tab2interact.core.data.baseinfo.TabBaseInfo;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.q;
import tb.kge;

/* loaded from: classes8.dex */
public final class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private PageBaseInfo f19765a;
    private final Map<String, TabBaseInfo> b = new LinkedHashMap();

    static {
        kge.a(1007544636);
    }

    private final void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else {
            this.f19765a = new PageBaseInfo();
        }
    }

    private final void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
        } else {
            this.b.put(str, new TabBaseInfo(str2));
        }
    }

    public final boolean a(PageBaseInfo.State pageState) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("18b282d0", new Object[]{this, pageState})).booleanValue();
        }
        q.d(pageState, "pageState");
        PageBaseInfo pageBaseInfo = this.f19765a;
        if (pageState == PageBaseInfo.State.CREATE) {
            if ((pageBaseInfo != null ? pageBaseInfo.a() : null) != null) {
                return false;
            }
            e();
        } else if (pageState == PageBaseInfo.State.START) {
            if (pageBaseInfo == null || pageBaseInfo.a() == PageBaseInfo.State.START || pageBaseInfo.a() == PageBaseInfo.State.DESTROY) {
                return false;
            }
        } else if (pageState == PageBaseInfo.State.STOP) {
            if (pageBaseInfo == null || pageBaseInfo.a() == PageBaseInfo.State.CREATE || pageBaseInfo.a() == PageBaseInfo.State.STOP || pageBaseInfo.a() == PageBaseInfo.State.DESTROY) {
                return false;
            }
        } else if (pageState == PageBaseInfo.State.DESTROY && (pageBaseInfo == null || pageBaseInfo.a() == PageBaseInfo.State.DESTROY)) {
            return false;
        }
        PageBaseInfo pageBaseInfo2 = this.f19765a;
        if (pageBaseInfo2 != null) {
            pageBaseInfo2.a(pageState);
        }
        return true;
    }

    public final void a(Map<String, String> pageURLQuery) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, pageURLQuery});
            return;
        }
        q.d(pageURLQuery, "pageURLQuery");
        PageBaseInfo pageBaseInfo = this.f19765a;
        if (pageBaseInfo == null) {
            return;
        }
        pageBaseInfo.a(pageURLQuery);
    }

    public final boolean a(String tabId, String str, TabBaseInfo.State tabState) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7ee91ac0", new Object[]{this, tabId, str, tabState})).booleanValue();
        }
        q.d(tabId, "tabId");
        q.d(tabState, "tabState");
        TabBaseInfo tabBaseInfo = this.b.get(tabId);
        if (tabState == TabBaseInfo.State.CREATE) {
            if (str == null) {
                return false;
            }
            a(tabId, str);
        } else if (tabState == TabBaseInfo.State.START) {
            if (tabBaseInfo == null || tabBaseInfo.a() == TabBaseInfo.State.START || tabBaseInfo.a() == TabBaseInfo.State.DESTROY) {
                return false;
            }
        } else if (tabState == TabBaseInfo.State.STOP) {
            if (tabBaseInfo == null || tabBaseInfo.a() == TabBaseInfo.State.CREATE || tabBaseInfo.a() == TabBaseInfo.State.STOP || tabBaseInfo.a() == TabBaseInfo.State.DESTROY) {
                return false;
            }
        } else if (tabState == TabBaseInfo.State.DESTROY && (tabBaseInfo == null || tabBaseInfo.a() == TabBaseInfo.State.DESTROY)) {
            return false;
        }
        TabBaseInfo tabBaseInfo2 = this.b.get(tabId);
        if (tabBaseInfo2 != null) {
            tabBaseInfo2.a(tabState);
        }
        return true;
    }

    public final PageBaseInfo.State a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PageBaseInfo.State) ipChange.ipc$dispatch("d29dcb0c", new Object[]{this});
        }
        PageBaseInfo pageBaseInfo = this.f19765a;
        if (pageBaseInfo == null) {
            return null;
        }
        return pageBaseInfo.a();
    }

    public final Map<String, String> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("6dbf0a5e", new Object[]{this});
        }
        PageBaseInfo pageBaseInfo = this.f19765a;
        if (pageBaseInfo == null) {
            return null;
        }
        return pageBaseInfo.b();
    }

    public final Set<String> c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Set) ipChange.ipc$dispatch("3b6c35d9", new Object[]{this}) : this.b.keySet();
    }

    public final String a(String tabId) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, tabId});
        }
        q.d(tabId, "tabId");
        TabBaseInfo tabBaseInfo = this.b.get(tabId);
        if (tabBaseInfo == null) {
            return null;
        }
        return tabBaseInfo.c();
    }

    public final TabBaseInfo.State b(String tabId) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TabBaseInfo.State) ipChange.ipc$dispatch("309e8583", new Object[]{this, tabId});
        }
        q.d(tabId, "tabId");
        TabBaseInfo tabBaseInfo = this.b.get(tabId);
        if (tabBaseInfo == null) {
            return null;
        }
        return tabBaseInfo.a();
    }

    public final Map<String, String> c(String tabId) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("e68dc5e9", new Object[]{this, tabId});
        }
        q.d(tabId, "tabId");
        TabBaseInfo tabBaseInfo = this.b.get(tabId);
        if (tabBaseInfo == null) {
            return null;
        }
        return tabBaseInfo.b();
    }

    public final String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("43881515", new Object[]{this});
        }
        for (Map.Entry<String, TabBaseInfo> entry : this.b.entrySet()) {
            String key = entry.getKey();
            if (entry.getValue().a() == TabBaseInfo.State.START) {
                return key;
            }
        }
        return null;
    }
}
