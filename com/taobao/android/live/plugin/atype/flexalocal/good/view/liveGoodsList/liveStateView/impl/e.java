package com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateView.impl;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.ItemCategory;
import com.taobao.taolive.sdk.model.message.GoodMsgNew;
import java.util.List;
import tb.hjm;
import tb.kge;

/* loaded from: classes6.dex */
public class e extends a implements com.taobao.android.live.plugin.atype.flexalocal.good.showcase.c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(560488286);
        kge.a(496465222);
    }

    public static /* synthetic */ Object ipc$super(e eVar, String str, Object... objArr) {
        if (str.hashCode() == 90991720) {
            super.a();
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public e(com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.c cVar, ItemCategory itemCategory) {
        super(cVar, itemCategory);
        if (cVar != null && cVar.x() != null) {
            cVar.x().a((com.taobao.android.live.plugin.atype.flexalocal.good.showcase.c) this);
        }
        this.k = false;
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.good.showcase.c
    public void e(GoodMsgNew goodMsgNew) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b7ab2e2", new Object[]{this, goodMsgNew});
        } else if (goodMsgNew == null || goodMsgNew.liveItemDO == null) {
        } else {
            if ("add".equalsIgnoreCase(goodMsgNew.action)) {
                this.l.a(goodMsgNew.categoryItemSortInfo != null ? goodMsgNew.categoryItemSortInfo.get(this.f) : null, null, true, false);
                hjm.a(this.d.a(Long.toString(goodMsgNew.liveItemDO.itemId)), goodMsgNew.liveItemDO);
                a(goodMsgNew.liveItemDO, false, true, false);
            } else if (!"remove".equalsIgnoreCase(goodMsgNew.action)) {
            } else {
                a(Long.toString(goodMsgNew.liveItemDO.itemId));
                List a2 = ((com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateView.f) this.f13751a).getAdapter().a();
                if (a2 != null && !a2.isEmpty()) {
                    return;
                }
                ((com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateView.f) this.f13751a).showEmptyView(new com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.d(this.e, 0));
            }
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateView.impl.b, com.taobao.android.live.plugin.atype.flexalocal.good.basemvplib.impl.b, tb.hgv
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        super.a();
        if (this.d == null || this.d.x() == null) {
            return;
        }
        this.d.x().b((com.taobao.android.live.plugin.atype.flexalocal.good.showcase.c) this);
    }
}
