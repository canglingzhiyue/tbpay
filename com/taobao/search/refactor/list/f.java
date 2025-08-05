package com.taobao.search.refactor.list;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.meta.structure.list.h;
import kotlin.d;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.t;
import kotlin.reflect.k;
import tb.kge;
import tb.nuf;
import tb.nvv;
import tb.nvw;
import tb.nws;

/* loaded from: classes7.dex */
public final class f extends b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ k[] f19321a;
    private final d b;

    static {
        kge.a(1667550404);
        f19321a = new k[]{t.a(new PropertyReference1Impl(t.b(f.class), "inShopSearchLongPressLayerWidget", "getInShopSearchLongPressLayerWidget()Lcom/taobao/search/sf/widgets/list/layer/longpress/InshopSearchLongPressLayerWidget;"))};
    }

    public static /* synthetic */ Object ipc$super(f fVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    private final nvv l() {
        IpChange ipChange = $ipChange;
        return (nvv) (ipChange instanceof IpChange ? ipChange.ipc$dispatch("63aa8a45", new Object[]{this}) : this.b.getValue());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(h widget) {
        super(widget);
        q.c(widget, "widget");
        this.b = kotlin.e.a(new InshopListPlugin$inShopSearchLongPressLayerWidget$2(widget));
    }

    @Override // com.taobao.search.refactor.list.b
    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else if (!z) {
        } else {
            i().subscribeScopeEvent(this, "childPageWidget");
            i().subscribeEvent(this);
        }
    }

    public final void onEventMainThread(nuf.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ff0bd39", new Object[]{this, aVar});
        } else {
            i().D();
        }
    }

    public final void onEventMainThread(nws.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1fec33ce", new Object[]{this, aVar});
            return;
        }
        com.taobao.android.meta.structure.list.b bVar = (com.taobao.android.meta.structure.list.b) i().J();
        q.a((Object) bVar, "widget.iView");
        bVar.l().setBackgroundColor(0);
    }

    public final void onEventMainThread(nvw.a event) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1d95b09", new Object[]{this, event});
            return;
        }
        q.c(event, "event");
        l().a(event.f31801a, event.b);
    }
}
