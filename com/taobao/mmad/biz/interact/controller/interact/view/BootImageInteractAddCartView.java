package com.taobao.mmad.biz.interact.controller.interact.view;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import mtopsdk.common.util.StringUtils;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.bootimage.BootImageDataMgr;
import com.taobao.bootimage.data.BootImageInfo;
import com.taobao.bootimage.interact.presenter.a;
import com.taobao.bootimage.interact.view.BootImageInteractBaseView;
import com.taobao.phenix.intf.b;
import com.taobao.taobao.R;
import tb.kej;
import tb.kge;
import tb.mxf;

/* loaded from: classes7.dex */
public class BootImageInteractAddCartView extends BootImageInteractNaitveSlideView {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String CLASS_TAG = "BootImageInteractAddCartView";
    private a mAddCartPresenter;
    private ImageView mImageIcon;
    private TextView mInteractAdvName;
    private TextView mInteractContent;
    private TextView mInteractTitle;
    private BootImageWaveAnimView mWaveAnimView;

    static {
        kge.a(443593447);
    }

    public static /* synthetic */ Object ipc$super(BootImageInteractAddCartView bootImageInteractAddCartView, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1383171873:
                super.stopInteract();
                return null;
            case -828457319:
                super.onSlide();
                return null;
            case -483678593:
                super.close();
                return null;
            case -165291571:
                super.onAdClick();
                return null;
            case 725636827:
                return super.getSlideActionText();
            case 2144052543:
                super.startInteract();
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public BootImageInteractAddCartView(Context context, BootImageInfo bootImageInfo) {
        super(context, bootImageInfo);
        this.mAddCartPresenter = new a(context, bootImageInfo, this);
    }

    @Override // com.taobao.mmad.biz.interact.controller.interact.view.BootImageInteractNaitveSlideView
    public int getInteractCartLayoutId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("25944aeb", new Object[]{this})).intValue() : R.layout.bootimage_interact_card_add_cart;
    }

    @Override // com.taobao.mmad.biz.interact.controller.interact.view.BootImageInteractNaitveSlideView, com.taobao.mmad.biz.interact.controller.interact.view.BootImageInteractSlideView
    public void renderDefaultCard() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a83db882", new Object[]{this});
            return;
        }
        try {
            this.mImageIcon = (ImageView) findViewById(R.id.interact_icon);
            this.mInteractTitle = (TextView) findViewById(R.id.interact_title);
            this.mInteractContent = (TextView) findViewById(R.id.interact_content);
            this.mInteractAdvName = (TextView) findViewById(R.id.interact_adv_name);
            this.mWaveAnimView = (BootImageWaveAnimView) findViewById(R.id.interact_card_anim_view);
            if (this.mBootImageInfo == null) {
                return;
            }
            if (this.mInteractTitle != null && !StringUtils.isEmpty(this.mBootImageInfo.cardTitle)) {
                this.mInteractTitle.setText(this.mBootImageInfo.cardTitle);
            }
            if (this.mInteractContent != null && !StringUtils.isEmpty(this.mBootImageInfo.cardDesc)) {
                this.mInteractContent.setText(this.mBootImageInfo.cardDesc);
            }
            if (this.mInteractAdvName != null && !StringUtils.isEmpty(this.mBootImageInfo.advName) && !StringUtils.isEmpty(this.mBootImageInfo.advColor)) {
                this.mInteractAdvName.setVisibility(0);
                this.mInteractAdvName.setText(this.mBootImageInfo.advName);
                try {
                    Drawable background = this.mInteractAdvName.getBackground();
                    if (background instanceof GradientDrawable) {
                        ((GradientDrawable) background).setColor(Color.parseColor(this.mBootImageInfo.advColor));
                    }
                } catch (Exception e) {
                    kej.a(CLASS_TAG, "setAdvColor:" + e.getMessage());
                    this.mInteractAdvName.setVisibility(8);
                }
            } else if (this.mInteractAdvName != null) {
                this.mInteractAdvName.setVisibility(8);
            }
            String str = StringUtils.isEmpty(this.mBootImageInfo.cardImageUrl) ? BootImageInteractBaseView.BOOTIMAGE_INTERACT_ITEM_DEFAULT_IMAGE : this.mBootImageInfo.cardImageUrl;
            if (StringUtils.isEmpty(str)) {
                return;
            }
            b.h().a(BootImageDataMgr.IMAGE_MODULE_NAME, str).into(this.mImageIcon);
        } catch (Throwable th) {
            kej.a(CLASS_TAG, mxf.initView, th);
        }
    }

    @Override // com.taobao.mmad.biz.interact.controller.interact.view.BootImageInteractNaitveSlideView
    public String getSlideActionText() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2b4056db", new Object[]{this});
        }
        try {
            String slideActionText = super.getSlideActionText();
            return StringUtils.isEmpty(slideActionText) ? this.mContext.getResources().getString(R.string.bootimage_slide_cart_text) : slideActionText;
        } catch (Throwable unused) {
            return "";
        }
    }

    @Override // com.taobao.mmad.biz.interact.controller.interact.view.BootImageInteractNaitveSlideView, com.taobao.mmad.biz.interact.controller.interact.view.BootImageInteractSlideView, com.taobao.bootimage.interact.view.BootImageInteractBaseView
    public void startInteract() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7fcba53f", new Object[]{this});
            return;
        }
        super.startInteract();
        BootImageWaveAnimView bootImageWaveAnimView = this.mWaveAnimView;
        if (bootImageWaveAnimView == null) {
            return;
        }
        bootImageWaveAnimView.setVisibility(0);
        this.mWaveAnimView.startAnim();
    }

    @Override // com.taobao.mmad.biz.interact.controller.interact.view.BootImageInteractNaitveSlideView, com.taobao.mmad.biz.interact.controller.interact.view.BootImageInteractSlideView, com.taobao.bootimage.interact.view.BootImageInteractBaseView
    public void stopInteract() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad8e78df", new Object[]{this});
            return;
        }
        super.stopInteract();
        BootImageWaveAnimView bootImageWaveAnimView = this.mWaveAnimView;
        if (bootImageWaveAnimView == null) {
            return;
        }
        bootImageWaveAnimView.stopAnim();
        this.mWaveAnimView.setVisibility(8);
    }

    @Override // com.taobao.mmad.biz.interact.controller.interact.view.BootImageInteractNaitveSlideView, com.taobao.mmad.biz.interact.controller.interact.view.BootImageInteractSlideView
    public void onSlide() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce9ebe99", new Object[]{this});
            return;
        }
        super.onSlide();
        a aVar = this.mAddCartPresenter;
        if (aVar == null) {
            return;
        }
        aVar.b();
    }

    @Override // com.taobao.mmad.biz.interact.controller.interact.view.BootImageInteractNaitveSlideView, com.taobao.mmad.biz.interact.controller.interact.view.BootImageInteractSlideView
    public void onAdClick() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f625d9cd", new Object[]{this});
            return;
        }
        super.onAdClick();
        a aVar = this.mAddCartPresenter;
        if (aVar == null) {
            return;
        }
        aVar.b();
    }

    @Override // com.taobao.mmad.biz.interact.controller.interact.view.BootImageInteractNaitveSlideView, com.taobao.bootimage.interact.view.BootImageInteractBaseView
    public void close() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e32ba67f", new Object[]{this});
            return;
        }
        super.close();
        a aVar = this.mAddCartPresenter;
        if (aVar == null) {
            return;
        }
        aVar.d();
    }
}
