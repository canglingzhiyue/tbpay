package com.taobao.android.live.plugin.atype.flexalocal.good.showcase;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.good.AlgoGoodsCardConfigData;
import com.taobao.taolive.sdk.model.common.LiveItem;
import java.util.List;
import tb.hiq;
import tb.kge;

/* loaded from: classes5.dex */
public class n implements r {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final boolean f13810a;
    private final boolean b;
    private k c;
    private k d;
    private final long e;

    static {
        kge.a(-1007202728);
        kge.a(-1830032104);
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.good.showcase.r
    public AlgoGoodsCardConfigData c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AlgoGoodsCardConfigData) ipChange.ipc$dispatch("3e6fdbe2", new Object[]{this});
        }
        return null;
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.good.showcase.r
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        }
    }

    public n(List<LiveItem> list, long j, boolean z, boolean z2) {
        this.f13810a = z;
        this.b = z2;
        this.e = j;
        a(list);
    }

    private void a(List<LiveItem> list) {
        LiveItem liveItem;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
        } else if (list == null || list.isEmpty() || !this.b || (liveItem = list.get(0)) == null) {
        } else {
            if (hiq.h(liveItem)) {
                this.c = new k(liveItem);
            } else {
                this.d = new k(liveItem);
            }
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.good.showcase.r
    public void a(LiveItem liveItem, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33429ab1", new Object[]{this, liveItem, new Boolean(z)});
            return;
        }
        if (!z) {
            this.d = null;
        }
        if (!hiq.h(liveItem)) {
            return;
        }
        this.c = new k(liveItem);
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.good.showcase.r
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            this.c = null;
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.good.showcase.r
    public void a(LiveItem liveItem) {
        k kVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1232883", new Object[]{this, liveItem});
        } else if (liveItem == null || (kVar = this.c) == null || kVar.f13803a != liveItem.itemId) {
        } else {
            this.c = null;
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.good.showcase.r
    public k b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (k) ipChange.ipc$dispatch("b77f090b", new Object[]{this});
        }
        if (!this.f13810a) {
            return null;
        }
        k kVar = this.c;
        if (kVar != null) {
            long j = -1;
            if (kVar.c != null && this.c.c.extendVal != null) {
                j = com.taobao.taolive.sdk.utils.l.b(this.c.c.extendVal.timepoint);
            }
            if (j > 0 && hiq.a() - j > this.e * 1000) {
                this.c = null;
            }
        }
        k kVar2 = this.c;
        return kVar2 == null ? this.d : kVar2;
    }
}
