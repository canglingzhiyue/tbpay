package com.taobao.android.live.plugin.atype.flexalocal.clean;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.RelativeLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.taobao.R;
import com.taobao.taolive.room.openarchitecture.entity.ATaoLiveOpenEntity;
import com.taobao.taolive.room.utils.d;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.utils.q;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.HashMap;
import java.util.Map;
import tb.ddv;
import tb.ddw;
import tb.jzn;
import tb.kge;
import tb.phg;
import tb.pkf;
import tb.ply;
import tb.tfu;
import tb.xkw;

/* loaded from: classes5.dex */
public class BlankFrame2 extends BaseFrame implements ViewPager.OnPageChangeListener, ddv {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private View mBottomContainer;
    private boolean mIsSwipeClearScreen;
    private TUrlImageView mIvGoods;

    static {
        kge.a(185695431);
        kge.a(1848919473);
        kge.a(191318335);
    }

    public static /* synthetic */ Object ipc$super(BlankFrame2 blankFrame2, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1272916118) {
            super.onDataReceived((TBLiveDataModel) objArr[0]);
            return null;
        } else if (hashCode == -340027132) {
            super.show();
            return null;
        } else if (hashCode != -309961236) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onCleanUp();
            return null;
        }
    }

    @Override // tb.ddv
    public String bizCode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("36951559", new Object[]{this}) : "BlankFrame2";
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public boolean lazyInflate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f4de9efe", new Object[]{this})).booleanValue();
        }
        return true;
    }

    @Override // android.support.v4.view.ViewPager.OnPageChangeListener
    public void onPageScrollStateChanged(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6581cc1e", new Object[]{this, new Integer(i)});
        }
    }

    @Override // android.support.v4.view.ViewPager.OnPageChangeListener
    public void onPageScrolled(int i, float f, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4c13b05", new Object[]{this, new Integer(i), new Float(f), new Integer(i2)});
        }
    }

    public static /* synthetic */ void access$000(BlankFrame2 blankFrame2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edad1c83", new Object[]{blankFrame2});
        } else {
            blankFrame2.exitClearScreen();
        }
    }

    public static /* synthetic */ boolean access$100(BlankFrame2 blankFrame2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("81e15a6", new Object[]{blankFrame2})).booleanValue() : blankFrame2.mIsSwipeClearScreen;
    }

    public BlankFrame2(Context context, com.taobao.alilive.aliliveframework.frame.a aVar) {
        super(context, aVar);
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public int getLayoutResId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("f1151e95", new Object[]{this})).intValue() : R.layout.taolive_room_blank_frame2_flexalocal;
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onViewCreated(View view) {
        ATaoLiveOpenEntity o;
        Float i;
        IpChange ipChange = $ipChange;
        int i2 = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("574a747", new Object[]{this, view});
            return;
        }
        q.b("BlankFrame2", "onViewCreated");
        this.mBottomContainer = view.findViewById(R.id.blank_container);
        View findViewById = findViewById(R.id.taolive_clear_screen_exit);
        findViewById.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.live.plugin.atype.flexalocal.clean.BlankFrame2.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view2});
                } else {
                    BlankFrame2.access$000(BlankFrame2.this);
                }
            }
        });
        ((TUrlImageView) findViewById(R.id.taolive_clear_screen_exit_icon)).setImageUrl("https://img.alicdn.com/imgextra/i1/O1CN01wRRQfg1WnYv2lpzyZ_!!6000000002833-2-tps-48-48.png");
        if (ply.J()) {
            i2 = 8;
        }
        findViewById.setVisibility(i2);
        this.mIvGoods = (TUrlImageView) findViewById(R.id.taolive_clear_screen_goods);
        this.mIvGoods.setImageUrl("https://img.alicdn.com/imgextra/i2/O1CN0195JhVE1W58UwuNDbG_!!6000000002736-2-tps-108-108.png");
        if (!phg.d().a() && this.mFrameContext != null && (o = this.mFrameContext.o()) != null && o.uiCompontent != null && o.uiCompontent.a() != null) {
            pkf a2 = o.uiCompontent.a();
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.mIvGoods.getLayoutParams();
            if (a2 != null && (i = a2.i()) != null && i.floatValue() > 0.0f && i.floatValue() <= 500.0f) {
                layoutParams.bottomMargin = ((int) i.floatValue()) - 24;
            }
        }
        this.mIvGoods.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.live.plugin.atype.flexalocal.clean.BlankFrame2.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view2});
                    return;
                }
                HashMap hashMap = new HashMap();
                hashMap.put("interact_type", BlankFrame2.access$100(BlankFrame2.this) ? "slide" : "click");
                phg.a().a(BlankFrame2.this.mFrameContext, "ClearScreen_Goodslist", (Map<String, String>) hashMap);
                jzn.a(BlankFrame2.this.mFrameContext, tfu.GOODS_IN, 0L);
                if (!ply.K()) {
                    BlankFrame2.access$000(BlankFrame2.this);
                }
                HashMap hashMap2 = new HashMap();
                hashMap2.put("glopenfrom", BlankFrame2.access$100(BlankFrame2.this) ? "clearscreen_type_slide" : "clearscreen_type_click");
                BlankFrame2.this.mFrameContext.e().a(xkw.EVENT_SHOW_GOODSPACKAGE, hashMap2, BlankFrame2.this.mFrameContext == null ? null : BlankFrame2.this.mFrameContext.G());
            }
        });
        ((RelativeLayout.LayoutParams) findViewById.getLayoutParams()).addRule(9);
        ((RelativeLayout.LayoutParams) findViewById.getLayoutParams()).removeRule(11);
        ((RelativeLayout.LayoutParams) findViewById.getLayoutParams()).leftMargin = d.a(this.mContext, 12.0f);
        ((RelativeLayout.LayoutParams) this.mIvGoods.getLayoutParams()).addRule(11);
        ((RelativeLayout.LayoutParams) this.mIvGoods.getLayoutParams()).removeRule(9);
        ((RelativeLayout.LayoutParams) this.mIvGoods.getLayoutParams()).rightMargin = d.a(this.mContext, 12.0f);
    }

    public void setSwipeClearScreen(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("976ba5cc", new Object[]{this, new Boolean(z)});
        } else {
            this.mIsSwipeClearScreen = z;
        }
    }

    private void exitClearScreen() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1214e422", new Object[]{this});
        } else {
            this.mFrameContext.e().a(xkw.EVENT_CLEAR_SCREEN_NEW, false, this.mFrameContext == null ? null : this.mFrameContext.G());
        }
    }

    @Override // android.support.v4.view.ViewPager.OnPageChangeListener
    public void onPageSelected(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("184d6f33", new Object[]{this, new Integer(i)});
        } else if (i == 0) {
            this.mBottomContainer.setVisibility(0);
            handleGoodsIcon();
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.mBottomContainer, "alpha", 0.0f, 1.0f);
            ofFloat.setDuration(250L);
            ofFloat.start();
        } else {
            this.mBottomContainer.setVisibility(8);
        }
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public void onDataReceived(TBLiveDataModel tBLiveDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b420d76a", new Object[]{this, tBLiveDataModel});
            return;
        }
        super.onDataReceived(tBLiveDataModel);
        ddw.a().a(this);
    }

    private void handleGoodsIcon() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be4924ae", new Object[]{this});
            return;
        }
        this.mIvGoods.setVisibility(0);
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("interact_type", this.mIsSwipeClearScreen ? "slide" : "click");
        phg.a().a(this.mFrameContext, "ClearScreen_Goodslist", hashMap);
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponent
    public void hide() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9631f0c9", new Object[]{this});
        } else if (this.mContainer == null) {
        } else {
            this.mContainer.setVisibility(8);
        }
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public void onCleanUp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed865dec", new Object[]{this});
            return;
        }
        super.onCleanUp();
        ddw.a().b(this);
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponent
    public void show() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebbb9904", new Object[]{this});
            return;
        }
        super.show();
        inflateViewOnNeed();
        this.mBottomContainer.setVisibility(0);
        handleGoodsIcon();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.mBottomContainer, "alpha", 0.0f, 1.0f);
        ofFloat.setDuration(250L);
        ofFloat.start();
    }

    @Override // tb.ddv
    public void onEvent(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3897928", new Object[]{this, str, obj});
        } else if (!"com.taobao.taolive.room.goods_list_showing".equals(str) || !(obj instanceof Boolean) || ((Boolean) obj).booleanValue()) {
        } else {
            exitClearScreen();
        }
    }

    @Override // tb.ddv
    public String[] observeEvents() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String[]) ipChange.ipc$dispatch("37b2602b", new Object[]{this}) : new String[]{"com.taobao.taolive.room.goods_list_showing"};
    }

    @Override // tb.ddv
    public String observeUniqueIdentification() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4914bdfe", new Object[]{this});
        }
        if (this.mFrameContext != null) {
            return this.mFrameContext.G();
        }
        return null;
    }
}
