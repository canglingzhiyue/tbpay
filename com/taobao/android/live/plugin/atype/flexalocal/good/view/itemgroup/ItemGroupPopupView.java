package com.taobao.android.live.plugin.atype.flexalocal.good.view.itemgroup;

import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.good.BasePopupView;
import com.taobao.android.live.plugin.atype.flexalocal.good.goodviewnew.f;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.c;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.itemgroup.ItemGroupView;
import com.taobao.taolive.sdk.goodlist.d;
import java.util.HashMap;
import tb.ddv;
import tb.ddw;
import tb.hin;
import tb.kge;

/* loaded from: classes6.dex */
public class ItemGroupPopupView extends BasePopupView implements ddv {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private ItemGroupView mItemGroupView;

    static {
        kge.a(-1800937108);
        kge.a(191318335);
    }

    public static /* synthetic */ Object ipc$super(ItemGroupPopupView itemGroupPopupView, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1775111991) {
            super.hide();
            return null;
        } else if (hashCode != -340027132) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.show();
            return null;
        }
    }

    @Override // tb.ddv
    public String bizCode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("36951559", new Object[]{this}) : "ItemGroupPopupView";
    }

    public static /* synthetic */ ItemGroupView access$000(ItemGroupPopupView itemGroupPopupView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ItemGroupView) ipChange.ipc$dispatch("580436e1", new Object[]{itemGroupPopupView}) : itemGroupPopupView.mItemGroupView;
    }

    public static /* synthetic */ ViewGroup access$100(ItemGroupPopupView itemGroupPopupView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ViewGroup) ipChange.ipc$dispatch("cf66443a", new Object[]{itemGroupPopupView}) : itemGroupPopupView.mViewGroup;
    }

    public ItemGroupPopupView(c cVar, ViewGroup viewGroup) {
        super(cVar, viewGroup);
        if (d.f()) {
            ddw.a().a(this);
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.good.BasePopupView
    public void show() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebbb9904", new Object[]{this});
            return;
        }
        super.show();
        this.mItemGroupView.show();
        this.mItemGroupView.startAnimation(createTranslationInAnimation());
        ItemGroupPageInfo pageInfo = this.mItemGroupView.getPageInfo();
        if (pageInfo == null) {
            return;
        }
        HashMap<String, String> hashMap = new HashMap<>();
        if (!TextUtils.isEmpty(pageInfo.id)) {
            hashMap.put("aggregation_id", pageInfo.id);
        }
        if (!TextUtils.isEmpty(pageInfo.type)) {
            hashMap.put("aggregation_type", pageInfo.type);
        }
        if (!TextUtils.isEmpty(pageInfo.source)) {
            hashMap.put("aggregation_source", pageInfo.source);
        }
        com.taobao.android.live.plugin.atype.flexalocal.good.a.a().j().b("LiveDiscountItemList", hashMap);
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.good.BasePopupView
    public void hide() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9631f0c9", new Object[]{this});
        } else {
            super.hide();
        }
    }

    public void setPageInfo(f fVar, ItemGroupPageInfo itemGroupPageInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b2a339", new Object[]{this, fVar, itemGroupPageInfo});
        } else {
            this.mItemGroupView.setPageInfo(fVar, itemGroupPageInfo);
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.good.BasePopupView
    public View onCreateContentView(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("a25b4d4b", new Object[]{this, viewGroup});
        }
        this.mItemGroupView = new ItemGroupView(this.mGoodLiveContext, false);
        this.mItemGroupView.setCloseHandler(new ItemGroupView.a() { // from class: com.taobao.android.live.plugin.atype.flexalocal.good.view.itemgroup.ItemGroupPopupView.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.live.plugin.atype.flexalocal.good.view.itemgroup.ItemGroupView.a
            public void a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                } else {
                    ItemGroupPopupView.this.destroyWithAnimation();
                }
            }
        });
        viewGroup.addView(this.mItemGroupView, new FrameLayout.LayoutParams(-1, -1));
        return this.mItemGroupView;
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.good.BasePopupView
    public FrameLayout.LayoutParams onCreateLayoutParams(View view, DisplayMetrics displayMetrics) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout.LayoutParams) ipChange.ipc$dispatch("46bd761c", new Object[]{this, view, displayMetrics});
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new FrameLayout.LayoutParams(-1, -1);
        }
        layoutParams.gravity = 85;
        layoutParams.width = this.mGoodLiveContext.c.s;
        layoutParams.height = (int) (hin.a(this.mGoodLiveContext.r()) * 0.725f);
        if (layoutParams.height <= 0 || hin.e(this.mGoodLiveContext.f())) {
            layoutParams.height = (int) (hin.b() * 0.76f);
        }
        return layoutParams;
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.good.BasePopupView, com.taobao.android.live.plugin.atype.flexalocal.good.basemvplib.impl.GoodsBaseTempView
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        this.mItemGroupView.destroy();
        this.mViewGroup.removeView(this.mItemGroupView);
        if (!d.f()) {
            return;
        }
        ddw.a().b(this);
    }

    public void destroyWithAnimation() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2628020b", new Object[]{this});
            return;
        }
        Animation createTranslationOutAnimation = createTranslationOutAnimation();
        createTranslationOutAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.taobao.android.live.plugin.atype.flexalocal.good.view.itemgroup.ItemGroupPopupView.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8f2883e7", new Object[]{this, animation});
                }
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f2d146c4", new Object[]{this, animation});
                }
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("724c33d", new Object[]{this, animation});
                    return;
                }
                ItemGroupPopupView.access$000(ItemGroupPopupView.this).destroy();
                ItemGroupPopupView.access$100(ItemGroupPopupView.this).removeView(ItemGroupPopupView.access$000(ItemGroupPopupView.this));
            }
        });
        this.mItemGroupView.startAnimation(createTranslationOutAnimation);
    }

    @Override // tb.ddv
    public void onEvent(String str, Object obj) {
        ItemGroupView itemGroupView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3897928", new Object[]{this, str, obj});
            return;
        }
        char c = 65535;
        if (str.hashCode() == -1681729808 && str.equals("com.taobao.taolive.live.search.refresh.list.inner")) {
            c = 0;
        }
        if (c != 0 || (itemGroupView = this.mItemGroupView) == null || itemGroupView.getAdapter() == null) {
            return;
        }
        this.mItemGroupView.getAdapter().notifyDataSetChanged();
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
