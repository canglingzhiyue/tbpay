package com.taobao.android.diagnose.model;

import android.app.Activity;
import android.support.v4.app.Fragment;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.diagnose.common.CircularList;
import com.taobao.android.diagnose.v;
import com.taobao.tinct.impl.collect.ChangeRecord;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.kge;

/* loaded from: classes.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public long f11713a;
    public Boolean b = true;
    public PageInfo c = null;
    public Map<String, PageInfo> d = new ConcurrentHashMap();
    public CircularList<PageInfo> e = new CircularList<>(10);
    public ChangeRecord g = null;
    public Map<String, String> h = new ConcurrentHashMap();
    public b i = null;
    public NetInfo f = new NetInfo();
    public AppInfo j = new AppInfo();

    static {
        kge.a(1388067344);
    }

    public void a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821975c", new Object[]{this, new Long(j)});
        } else {
            this.f11713a = j;
        }
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        this.b = Boolean.valueOf(z);
        com.taobao.android.diagnose.scene.a.a("fact_background", Boolean.valueOf(z));
    }

    public void a(PageInfo pageInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26acd096", new Object[]{this, pageInfo});
            return;
        }
        pageInfo.lastAppearTime = System.currentTimeMillis();
        this.c = pageInfo;
        PageInfo pageInfo2 = this.c;
        String str = "";
        com.taobao.android.diagnose.scene.a.a("fact_current_page", pageInfo2 != null ? pageInfo2.getPageName() : str);
        PageInfo pageInfo3 = this.c;
        if (pageInfo3 != null) {
            str = pageInfo3.getPageUrl();
        }
        com.taobao.android.diagnose.scene.a.a("fact_current_page_url", str);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        PageInfo pageInfo = this.c;
        if (pageInfo == null) {
            return;
        }
        pageInfo.lastDisappearTime = System.currentTimeMillis();
    }

    public void a(Fragment fragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f0514a", new Object[]{this, fragment});
            return;
        }
        PageInfo pageInfo = this.c;
        if (pageInfo == null) {
            return;
        }
        pageInfo.setPageFragment(fragment.getClass().getName());
    }

    public PageInfo a(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PageInfo) ipChange.ipc$dispatch("8bb0984a", new Object[]{this, activity});
        }
        PageInfo pageInfo = new PageInfo(activity);
        this.d.put(pageInfo.getPageID(), pageInfo);
        if (this.d.size() + this.e.size() > 10 && this.e.size() > 0) {
            this.e.removeFirst();
        }
        v.a("DiagnoseInfo", String.format("Add new page: %s(%s),  page list size: %d, history size: %d", pageInfo.getPageName(), pageInfo.getPageID(), Integer.valueOf(this.d.size()), Integer.valueOf(this.e.size())));
        a(pageInfo);
        return pageInfo;
    }

    public void b(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fdb367b", new Object[]{this, activity});
            return;
        }
        String pageID = PageInfo.getPageID(activity);
        PageInfo remove = this.d.remove(pageID);
        if (remove != null) {
            remove.destroyTime = System.currentTimeMillis();
            if (this.d.size() < 10) {
                this.e.add(remove);
            }
            v.a("DiagnoseInfo", String.format("Remove page: %s(%s),  page list size: %d，history size: %d", remove.getPageName(), pageID, Integer.valueOf(this.d.size()), Integer.valueOf(this.e.size())));
        }
        if (this.d.size() != 0) {
            return;
        }
        this.c = null;
    }

    public void a(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b13a069b", new Object[]{this, bVar});
        } else {
            this.i = bVar;
        }
    }

    public void a(NetInfo netInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88cdb2d2", new Object[]{this, netInfo});
            return;
        }
        this.f = netInfo;
        com.taobao.android.diagnose.scene.a.a("fact_net_type", Integer.valueOf(netInfo.getType()));
        com.taobao.android.diagnose.scene.a.a("fact_net_status", Integer.valueOf(netInfo.getStatus()));
    }

    public void a(ChangeRecord changeRecord) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba0e097a", new Object[]{this, changeRecord});
        } else {
            this.g = changeRecord;
        }
    }

    public PageInfo c(Activity activity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (PageInfo) ipChange.ipc$dispatch("fd715988", new Object[]{this, activity}) : this.d.get(PageInfo.getPageID(activity));
    }

    public Boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Boolean) ipChange.ipc$dispatch("a5abcd26", new Object[]{this}) : this.b;
    }

    public String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this});
        }
        PageInfo pageInfo = this.c;
        if (pageInfo == null) {
            return null;
        }
        return pageInfo.getPageID();
    }

    public PageInfo d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (PageInfo) ipChange.ipc$dispatch("a26e1679", new Object[]{this}) : this.c;
    }

    public NetInfo e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (NetInfo) ipChange.ipc$dispatch("7a7d0616", new Object[]{this}) : this.f;
    }

    public b f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("a2ecf3e0", new Object[]{this}) : this.i;
    }

    public ChangeRecord g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ChangeRecord) ipChange.ipc$dispatch("33301dfa", new Object[]{this}) : this.g;
    }

    public Map<String, String> h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("3fbd54e4", new Object[]{this}) : this.h;
    }

    public AppInfo i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AppInfo) ipChange.ipc$dispatch("49078116", new Object[]{this}) : this.j;
    }

    public List<PageInfo> j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("87269236", new Object[]{this});
        }
        ArrayList arrayList = new ArrayList(this.d.values());
        if (arrayList.size() < 10 && this.e.size() > 0) {
            arrayList.addAll(this.e);
        }
        Collections.sort(arrayList, $$Lambda$a$5qCejls5ACsYV0A6WTs_d7M22uU.INSTANCE);
        return arrayList.size() <= 10 ? arrayList : arrayList.subList(0, 10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int a(PageInfo pageInfo, PageInfo pageInfo2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fcca27b7", new Object[]{pageInfo, pageInfo2})).intValue();
        }
        if (pageInfo.lastAppearTime > pageInfo2.lastAppearTime) {
            return -1;
        }
        return pageInfo.lastAppearTime < pageInfo2.lastAppearTime ? 1 : 0;
    }
}
