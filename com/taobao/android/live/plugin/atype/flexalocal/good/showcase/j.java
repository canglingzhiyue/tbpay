package com.taobao.android.live.plugin.atype.flexalocal.good.showcase;

import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.good.business.EnterGoodsData;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.model.common.LiveItem;
import tb.hir;
import tb.his;
import tb.kge;
import tb.pox;
import tb.tpn;

/* loaded from: classes5.dex */
public class j implements d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private d f13801a;
    private com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.c b;
    private pox<EnterGoodsData> c;

    static {
        kge.a(-1622522482);
        kge.a(1132986070);
    }

    public static /* synthetic */ void a(j jVar, FrameLayout frameLayout, com.taobao.taolive.sdk.core.b bVar, TBLiveDataModel tBLiveDataModel, com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.c cVar, EnterGoodsData enterGoodsData, LiveItem liveItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27ab0cb1", new Object[]{jVar, frameLayout, bVar, tBLiveDataModel, cVar, enterGoodsData, liveItem});
        } else {
            jVar.a(frameLayout, bVar, tBLiveDataModel, cVar, enterGoodsData, liveItem);
        }
    }

    public j(final FrameLayout frameLayout, final com.taobao.taolive.sdk.core.b bVar, final TBLiveDataModel tBLiveDataModel, final com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.c cVar, final LiveItem liveItem) {
        this.b = cVar;
        his.a("ShowcaseControllerWrapper", "ShowcaseControllerWrapper() | use remote rec.");
        if (cVar != null && cVar.x() != null) {
            this.c = new pox<EnterGoodsData>() { // from class: com.taobao.android.live.plugin.atype.flexalocal.good.showcase.j.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.pox
                public /* synthetic */ void onResult(EnterGoodsData enterGoodsData) {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("8251d27f", new Object[]{this, enterGoodsData});
                    } else {
                        a(enterGoodsData);
                    }
                }

                public void a(EnterGoodsData enterGoodsData) {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("f0997166", new Object[]{this, enterGoodsData});
                    } else {
                        j.a(j.this, frameLayout, bVar, tBLiveDataModel, cVar, enterGoodsData, liveItem);
                    }
                }

                @Override // tb.pox
                public void onError(String str, String str2) {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("97d08c84", new Object[]{this, str, str2});
                    } else {
                        j.a(j.this, frameLayout, bVar, tBLiveDataModel, cVar, new EnterGoodsData(), liveItem);
                    }
                }
            };
            cVar.x().a(this.c);
            return;
        }
        his.b("ShowcaseControllerWrapper", "ShowcaseControllerWrapper() | datacenter empty.");
        a(frameLayout, bVar, tBLiveDataModel, cVar, new EnterGoodsData(), liveItem);
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.good.showcase.d
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        d dVar = this.f13801a;
        if (dVar == null) {
            return;
        }
        dVar.a();
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.good.showcase.d
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        d dVar = this.f13801a;
        if (dVar != null) {
            dVar.b();
        }
        com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.c cVar = this.b;
        if (cVar == null || cVar.x() == null || this.c == null) {
            return;
        }
        this.b.x().b(this.c);
    }

    private void a(FrameLayout frameLayout, com.taobao.taolive.sdk.core.b bVar, TBLiveDataModel tBLiveDataModel, com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.c cVar, EnterGoodsData enterGoodsData, LiveItem liveItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25adba54", new Object[]{this, frameLayout, bVar, tBLiveDataModel, cVar, enterGoodsData, liveItem});
        } else if (!hir.X()) {
            this.f13801a = new i(frameLayout, bVar, tBLiveDataModel.mVideoInfo, cVar, enterGoodsData, liveItem);
        } else {
            this.f13801a = new tpn(frameLayout, bVar, tBLiveDataModel.mVideoInfo, cVar, enterGoodsData, liveItem);
        }
    }
}
