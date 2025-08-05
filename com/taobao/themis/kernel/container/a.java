package com.taobao.themis.kernel.container;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.metaInfo.manifest.AppManifest;
import com.taobao.themis.kernel.metaInfo.manifest.TabBar;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import tb.kge;
import tb.riy;

/* loaded from: classes9.dex */
public final class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final TabBar f22506a;
    private final List<b> b;
    private final AppManifest.Performance c;
    private final Window d;
    private final transient List<b> e;
    private final JSONObject f;

    static {
        kge.a(1739970130);
    }

    public a() {
        this(null, null, null, null, 15, null);
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this != obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (!q.a(this.b, aVar.b) || !q.a(this.c, aVar.c) || !q.a(this.d, aVar.d) || !q.a(this.f22506a, aVar.f22506a)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        List<b> list = this.b;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        AppManifest.Performance performance = this.c;
        int hashCode2 = (hashCode + (performance != null ? performance.hashCode() : 0)) * 31;
        Window window = this.d;
        int hashCode3 = (hashCode2 + (window != null ? window.hashCode() : 0)) * 31;
        TabBar tabBar = this.f22506a;
        if (tabBar != null) {
            i = tabBar.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "ContainerModel(pages=" + this.b + ", performance=" + this.c + ", window=" + this.d + ", tabBar=" + this.f22506a + riy.BRACKET_END_STR;
    }

    public a(List<b> list, AppManifest.Performance performance, Window window, TabBar tabBar) {
        this.b = list;
        this.c = performance;
        this.d = window;
        this.f22506a = tabBar;
        this.e = new CopyOnWriteArrayList();
        this.f = new JSONObject();
    }

    public /* synthetic */ a(List list, AppManifest.Performance performance, Window window, TabBar tabBar, int i, o oVar) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : performance, (i & 4) != 0 ? null : window, (i & 8) != 0 ? null : tabBar);
    }

    public final List<b> a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("627608df", new Object[]{this}) : this.b;
    }

    public final AppManifest.Performance c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AppManifest.Performance) ipChange.ipc$dispatch("b7eced7f", new Object[]{this}) : this.c;
    }

    public final Window b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Window) ipChange.ipc$dispatch("9bd8cb80", new Object[]{this}) : this.d;
    }

    public final TabBar d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TabBar) ipChange.ipc$dispatch("f9af2a5e", new Object[]{this}) : this.f22506a;
    }

    public final List<b> e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("fd625b", new Object[]{this}) : this.e;
    }

    public final JSONObject f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("d2e6990d", new Object[]{this}) : this.f;
    }
}
