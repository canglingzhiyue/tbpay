package com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateView.impl;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.ItemCategory;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateMutitabView.impl.GoodsLiveStateMutitabView;
import java.util.ArrayList;
import java.util.List;
import tb.ddv;
import tb.ddw;
import tb.hiq;
import tb.hir;
import tb.his;
import tb.jwg;
import tb.kcg;
import tb.kge;

/* loaded from: classes6.dex */
public class NonPreheatTabView extends SingleTabBaseView<com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateView.e> implements com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateView.f, ddv {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "NonPreheatTabView";

    static {
        kge.a(737863349);
        kge.a(-1033686463);
        kge.a(191318335);
    }

    public static /* synthetic */ Object ipc$super(NonPreheatTabView nonPreheatTabView, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1983604863) {
            super.destroy();
            return null;
        } else if (hashCode == -558272972) {
            super.resume();
            return null;
        } else if (hashCode != 986833476) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.showPackage(((Boolean) objArr[0]).booleanValue());
            return null;
        }
    }

    @Override // tb.ddv
    public String bizCode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("36951559", new Object[]{this}) : TAG;
    }

    public NonPreheatTabView(com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.c cVar, ItemCategory itemCategory, GoodsLiveStateMutitabView.a aVar, boolean z) {
        super(cVar, itemCategory, aVar, z);
        ddw.a().a(this);
    }

    public void recoverFromData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c52b4c7f", new Object[]{this});
        } else {
            ((com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateView.e) this.mPresenter).al_();
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateView.impl.SingleTabBaseView
    public void showPackage(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ad1e244", new Object[]{this, new Boolean(z)});
            return;
        }
        super.showPackage(z);
        ((com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateView.e) this.mPresenter).b();
        ((com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateView.e) this.mPresenter).d();
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.good.basemvplib.impl.GoodsBaseTempView
    public void resume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("deb96e34", new Object[]{this});
            return;
        }
        super.resume();
        if (hir.w()) {
            ((com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateView.e) this.mPresenter).b();
        }
        if (!hir.C()) {
            return;
        }
        ((com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateView.e) this.mPresenter).a(this.mListView.getCurrentShowItemList());
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.good.basemvplib.impl.GoodsBaseView
    /* renamed from: initInjector */
    public com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateView.e mo967initInjector() {
        com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateView.e aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateView.e) ipChange.ipc$dispatch("e06b67e7", new Object[]{this});
        }
        his.a(TAG, "initInjector | tabName=" + this.tabName + " categoryId=" + this.categoryId);
        if (hiq.a(this.tabName, this.categoryId)) {
            aVar = new d(this.mGoodLiveContext, this.mItemCategory);
        } else if (this.mItemCategory.isPreheatTab()) {
            aVar = new e(this.mGoodLiveContext, this.mItemCategory);
        } else {
            aVar = new a(this.mGoodLiveContext, this.mItemCategory);
        }
        aVar.a(this.tabName, this.categoryId, this.categoryType);
        return aVar;
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateView.impl.SingleTabBaseView
    public boolean checkNeedCompensate(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b664598b", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)})).booleanValue() : ((com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateView.e) this.mPresenter).a(i, i2, i3);
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateView.impl.SingleTabBaseView, com.taobao.android.live.plugin.atype.flexalocal.good.basemvplib.impl.GoodsBaseView, com.taobao.android.live.plugin.atype.flexalocal.good.basemvplib.impl.GoodsBaseTempView
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        super.destroy();
        ddw.a().b(this);
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateView.impl.SingleTabBaseView
    public jwg constructAdapter() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (jwg) ipChange.ipc$dispatch("3d6df42d", new Object[]{this}) : new kcg(this.mGoodLiveContext, this.mItemCategory, new ArrayList(), this.mListView);
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateView.f
    public void moveToTargetItem(String str) {
        int i;
        IpChange ipChange = $ipChange;
        int i2 = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88480a21", new Object[]{this, str});
            return;
        }
        List<com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.e> a2 = this.mGoodsLiveStateListAdapter.a();
        if (StringUtils.isEmpty(str) || a2 == null || a2.isEmpty()) {
            return;
        }
        for (com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.e eVar : a2) {
            if (eVar != null && StringUtils.equals(str, eVar.f)) {
                if (i2 > 2) {
                    int i3 = i2 + 1;
                    if (a2.size() <= i3) {
                        i3 = i2;
                    }
                    i = a2.size() > i2 + 2 ? i3 + 1 : i3;
                } else {
                    i = i2;
                }
                his.a(TAG, "moveToTargetItem | itemId=" + str + "   pos=" + i2);
                this.mListView.scrollToPosition(i);
                return;
            }
            i2++;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003b, code lost:
        if (r7.equals("com.taobao.taolive.hide.member.identification.inner") != false) goto L11;
     */
    @Override // tb.ddv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onEvent(java.lang.String r7, java.lang.Object r8) {
        /*
            Method dump skipped, instructions count: 354
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateView.impl.NonPreheatTabView.onEvent(java.lang.String, java.lang.Object):void");
    }

    @Override // tb.ddv
    public String[] observeEvents() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String[]) ipChange.ipc$dispatch("37b2602b", new Object[]{this}) : new String[]{"com.taobao.taolive.room.goodlist.timepoint.asked.inner", "com.taobao.taolive.hide.member.identification.inner", "com.taobao.taolive.room.goodlist.all.refresh.item.inner", "com.taobao.taolive.live.state.refresh.current.tab.inner", "com.taobao.taolive.goods.add.top.interact.banner", "com.taobao.taolive.room.gl.refresh.topright", "com.taobao.taolive.room.gl.refresh.showinglist"};
    }

    @Override // tb.ddv
    public String observeUniqueIdentification() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("4914bdfe", new Object[]{this}) : com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.c.a(this.mGoodLiveContext);
    }
}
