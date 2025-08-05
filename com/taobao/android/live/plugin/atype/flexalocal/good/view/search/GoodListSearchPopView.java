package com.taobao.android.live.plugin.atype.flexalocal.good.view.search;

import android.os.ResultReceiver;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.good.BasePopupView;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.c;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.search.GoodListSearchView;
import tb.ddv;
import tb.ddw;
import tb.kge;

/* loaded from: classes6.dex */
public class GoodListSearchPopView extends BasePopupView implements ddv {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private GoodListSearchView mGoodListSearchView;

    static {
        kge.a(130204496);
        kge.a(191318335);
    }

    public static /* synthetic */ Object ipc$super(GoodListSearchPopView goodListSearchPopView, String str, Object... objArr) {
        if (str.hashCode() == -1775111991) {
            super.hide();
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.ddv
    public String bizCode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("36951559", new Object[]{this}) : "GoodListSearchPopView";
    }

    public static /* synthetic */ ViewGroup access$000(GoodListSearchPopView goodListSearchPopView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ViewGroup) ipChange.ipc$dispatch("38d5ca7f", new Object[]{goodListSearchPopView}) : goodListSearchPopView.mViewGroup;
    }

    public static /* synthetic */ ViewGroup access$100(GoodListSearchPopView goodListSearchPopView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ViewGroup) ipChange.ipc$dispatch("81ecd11e", new Object[]{goodListSearchPopView}) : goodListSearchPopView.mViewGroup;
    }

    public GoodListSearchPopView(c cVar, ViewGroup viewGroup) {
        super(cVar, viewGroup);
        if (com.taobao.taolive.sdk.goodlist.d.f()) {
            ddw.a().a(this);
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.good.BasePopupView
    public View onCreateContentView(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("a25b4d4b", new Object[]{this, viewGroup});
        }
        this.mGoodListSearchView = new GoodListSearchView(this.mGoodLiveContext);
        viewGroup.addView(this.mGoodListSearchView, new FrameLayout.LayoutParams(-1, -1));
        this.mGoodListSearchView.setCancelClickListener(new GoodListSearchView.a() { // from class: com.taobao.android.live.plugin.atype.flexalocal.good.view.search.GoodListSearchPopView.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.live.plugin.atype.flexalocal.good.view.search.GoodListSearchView.a
            public void a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    return;
                }
                e.a(GoodListSearchPopView.access$000(GoodListSearchPopView.this), (ResultReceiver) null);
                GoodListSearchPopView.access$100(GoodListSearchPopView.this).postDelayed(new Runnable() { // from class: com.taobao.android.live.plugin.atype.flexalocal.good.view.search.GoodListSearchPopView.1.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange3 = $ipChange;
                        if (ipChange3 instanceof IpChange) {
                            ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            GoodListSearchPopView.this.destroy();
                        }
                    }
                }, 300L);
            }
        });
        return this.mGoodListSearchView;
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.good.BasePopupView
    public void hide() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9631f0c9", new Object[]{this});
            return;
        }
        super.hide();
        e.a(this.mContentView, (ResultReceiver) null);
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.good.BasePopupView, com.taobao.android.live.plugin.atype.flexalocal.good.basemvplib.impl.GoodsBaseTempView
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        if (this.mViewGroup != null && this.mContentView != null) {
            this.mViewGroup.removeView(this.mContentView);
        }
        GoodListSearchView goodListSearchView = this.mGoodListSearchView;
        if (goodListSearchView != null) {
            goodListSearchView.destroy();
        }
        if (!com.taobao.taolive.sdk.goodlist.d.f()) {
            return;
        }
        ddw.a().b(this);
    }

    @Override // tb.ddv
    public void onEvent(String str, Object obj) {
        GoodListSearchView goodListSearchView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3897928", new Object[]{this, str, obj});
            return;
        }
        char c = 65535;
        if (str.hashCode() == -1681729808 && str.equals("com.taobao.taolive.live.search.refresh.list.inner")) {
            c = 0;
        }
        if (c != 0 || (goodListSearchView = this.mGoodListSearchView) == null || goodListSearchView.getAdapter() == null) {
            return;
        }
        this.mGoodListSearchView.getAdapter().notifyDataSetChanged();
    }

    @Override // tb.ddv
    public String[] observeEvents() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String[]) ipChange.ipc$dispatch("37b2602b", new Object[]{this}) : new String[]{"com.taobao.taolive.live.search.refresh.list.inner"};
    }

    @Override // tb.ddv
    public String observeUniqueIdentification() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("4914bdfe", new Object[]{this}) : c.a(this.mGoodLiveContext);
    }
}
