package com.taobao.themis.container.app.page;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.metaInfo.manifest.TabBarItem;
import com.taobao.themis.kernel.page.ITMSPage;
import kotlin.Metadata;
import tb.kge;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/taobao/themis/container/app/page/TMSPageTabItem;", "", "()V", "model", "Lcom/taobao/themis/kernel/metaInfo/manifest/TabBarItem;", "getModel", "()Lcom/taobao/themis/kernel/metaInfo/manifest/TabBarItem;", "setModel", "(Lcom/taobao/themis/kernel/metaInfo/manifest/TabBarItem;)V", "page", "Lcom/taobao/themis/kernel/page/ITMSPage;", "getPage", "()Lcom/taobao/themis/kernel/page/ITMSPage;", "setPage", "(Lcom/taobao/themis/kernel/page/ITMSPage;)V", "pageId", "", "getPageId", "()Ljava/lang/String;", "setPageId", "(Ljava/lang/String;)V", "themis_container_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class f {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private String f22369a;
    private ITMSPage b;
    private TabBarItem c;

    static {
        kge.a(-802161651);
    }

    public final String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.f22369a;
    }

    public final void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            this.f22369a = str;
        }
    }

    public final void a(ITMSPage iTMSPage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb549213", new Object[]{this, iTMSPage});
        } else {
            this.b = iTMSPage;
        }
    }

    public final ITMSPage b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ITMSPage) ipChange.ipc$dispatch("f9353878", new Object[]{this}) : this.b;
    }

    public final void a(TabBarItem tabBarItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1210d88", new Object[]{this, tabBarItem});
        } else {
            this.c = tabBarItem;
        }
    }

    public final TabBarItem c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TabBarItem) ipChange.ipc$dispatch("cf7c8b4a", new Object[]{this}) : this.c;
    }
}
