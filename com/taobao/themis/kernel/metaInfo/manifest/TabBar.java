package com.taobao.themis.kernel.metaInfo.manifest;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.q;
import tb.kge;

/* loaded from: classes9.dex */
public final class TabBar implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean invisible;
    private List<TabBarItem> items;
    private String mode;

    static {
        kge.a(-1984235970);
        kge.a(1028243835);
    }

    public final List<TabBarItem> getItems() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("46e3e096", new Object[]{this}) : this.items;
    }

    public final void setItems(List<TabBarItem> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba1ea0f6", new Object[]{this, list});
        } else {
            this.items = list;
        }
    }

    public final boolean getInvisible() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e7286202", new Object[]{this})).booleanValue() : this.invisible;
    }

    public final void setInvisible(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5daf8a2", new Object[]{this, new Boolean(z)});
        } else {
            this.invisible = z;
        }
    }

    public final String getMode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("24310680", new Object[]{this}) : this.mode;
    }

    public final void setMode(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f66f09f6", new Object[]{this, str});
        } else {
            this.mode = str;
        }
    }

    public final boolean isBulge() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("88e23418", new Object[]{this})).booleanValue();
        }
        List<TabBarItem> list = this.items;
        return (list != null ? list.size() : 0) % 2 == 1 && q.a((Object) this.mode, (Object) "bulge");
    }

    public final boolean isAct() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9815ab93", new Object[]{this})).booleanValue() : q.a((Object) this.mode, (Object) "act");
    }
}
