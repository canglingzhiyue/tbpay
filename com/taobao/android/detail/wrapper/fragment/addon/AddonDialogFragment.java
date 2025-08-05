package com.taobao.android.detail.wrapper.fragment.addon;

import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentManager;
import android.text.Html;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.TranslateAnimation;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.kit.utils.f;
import com.taobao.android.detail.datasdk.protocol.image.DetailImageView;
import com.taobao.android.detail.sdk.utils.b;
import com.taobao.android.detail.wrapper.ext.request.addon.AddonModel;
import com.taobao.taobao.R;
import java.util.Iterator;
import tb.dzh;
import tb.emu;
import tb.epo;
import tb.epq;
import tb.kge;

/* loaded from: classes5.dex */
public class AddonDialogFragment extends DialogFragment implements View.OnClickListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean isTemporaryHide = false;
    private AddonModel mAddonModel;
    private DetailImageView mIvItemFirst;
    private DetailImageView mIvItemMore;
    private DetailImageView mIvItemSecond;
    private DetailImageView mIvMoreSpot;
    private View mMaskItem1;
    private View mMaskItem2;
    private View mMaskMore;
    private View mRootContainer;
    private DetailImageView mTvClose;
    private TextView mTvItemMore;
    private TextView mTvPromotion;
    private TextView mTvThreshold;

    static {
        kge.a(1295567281);
        kge.a(-1201612728);
    }

    public static /* synthetic */ Object ipc$super(AddonDialogFragment addonDialogFragment, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -641568046) {
            super.onCreate((Bundle) objArr[0]);
            return null;
        } else if (hashCode == 1639966335) {
            super.show((FragmentManager) objArr[0], (String) objArr[1]);
            return null;
        } else if (hashCode != 2133689546) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onStart();
            return null;
        }
    }

    @Override // android.support.v4.app.DialogFragment, android.support.v4.app.Fragment
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        setHasOptionsMenu(true);
        setStyle(0, 16973840);
        emu.a("com.taobao.android.detail.wrapper.fragment.addon.AddonDialogFragment");
    }

    @Override // android.support.v4.app.DialogFragment, android.support.v4.app.Fragment
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            return;
        }
        super.onStart();
        if (getDialog() == null) {
            return;
        }
        Window window = getDialog().getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.flags = 8;
        attributes.gravity = 80;
        attributes.width = -1;
        attributes.height = epo.b(60);
        attributes.y = epo.b(48);
        window.setAttributes(attributes);
        window.setBackgroundDrawable(new ColorDrawable(0));
    }

    @Override // android.support.v4.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("bcd5231c", new Object[]{this, layoutInflater, viewGroup, bundle});
        }
        this.mRootContainer = layoutInflater.inflate(R.layout.x_detail_addon_popu, viewGroup, false);
        this.mTvThreshold = (TextView) this.mRootContainer.findViewById(R.id.tv_threshold);
        this.mTvPromotion = (TextView) this.mRootContainer.findViewById(R.id.tv_promotion);
        this.mMaskItem1 = this.mRootContainer.findViewById(R.id.mask_item1);
        this.mIvItemFirst = (DetailImageView) this.mRootContainer.findViewById(R.id.iv_image_first);
        this.mIvItemSecond = (DetailImageView) this.mRootContainer.findViewById(R.id.iv_image_second);
        this.mMaskItem2 = this.mRootContainer.findViewById(R.id.mask_item2);
        this.mIvItemMore = (DetailImageView) this.mRootContainer.findViewById(R.id.iv_image_more);
        this.mIvMoreSpot = (DetailImageView) this.mRootContainer.findViewById(R.id.iv_more_spot);
        this.mTvItemMore = (TextView) this.mRootContainer.findViewById(R.id.tv_more);
        this.mMaskMore = this.mRootContainer.findViewById(R.id.mask_more);
        this.mRootContainer.findViewById(R.id.ll_info).setOnClickListener(this);
        this.mRootContainer.findViewById(R.id.rl_image_first).setOnClickListener(this);
        this.mRootContainer.findViewById(R.id.rl_image_second).setOnClickListener(this);
        this.mRootContainer.findViewById(R.id.rl_image_more).setOnClickListener(this);
        this.mTvClose = (DetailImageView) this.mRootContainer.findViewById(R.id.tv_close);
        this.mRootContainer.findViewById(R.id.rl_close).setOnClickListener(this);
        updateData(this.mAddonModel);
        slideToUp(this.mRootContainer);
        exposureTrackEvent();
        return this.mRootContainer;
    }

    public void setData(AddonModel addonModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0d3af35", new Object[]{this, addonModel});
        } else {
            this.mAddonModel = addonModel;
        }
    }

    public void updateData(AddonModel addonModel) {
        AddonModel addonModel2;
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba801c9c", new Object[]{this, addonModel});
        } else if (addonModel == null) {
        } else {
            this.mAddonModel = addonModel;
            if (getActivity() == null || (addonModel2 = this.mAddonModel) == null) {
                return;
            }
            if (!TextUtils.isEmpty(addonModel2.thresholdText)) {
                this.mTvThreshold.setText(Html.fromHtml(this.mAddonModel.thresholdText));
            }
            if (!TextUtils.isEmpty(this.mAddonModel.promotionText)) {
                this.mTvPromotion.setText(Html.fromHtml(this.mAddonModel.promotionText));
            }
            if (!TextUtils.isEmpty(this.mAddonModel.logo)) {
                f.a(getContext()).a(this.mTvClose, this.mAddonModel.logo);
            }
            if (this.mAddonModel.items == null) {
                return;
            }
            Iterator<AddonModel.Item> it = this.mAddonModel.items.iterator();
            while (it.hasNext()) {
                AddonModel.Item next = it.next();
                if (i == 0) {
                    if (next.pic != null) {
                        f.a(getContext()).a(this.mIvItemFirst, next.pic);
                    }
                    if (next.maskColor != null) {
                        this.mMaskItem1.setBackgroundColor(b.a(next.maskColor));
                    }
                } else if (i == 1) {
                    if (next.pic != null) {
                        f.a(getContext()).a(this.mIvItemSecond, next.pic);
                    }
                    if (next.maskColor != null) {
                        this.mMaskItem2.setBackgroundColor(b.a(next.maskColor));
                    }
                } else if (i == 2) {
                    if (next.pic != null) {
                        f.a(getContext()).a(this.mIvItemMore, next.pic);
                    }
                    if (next.maskColor != null) {
                        this.mMaskMore.setBackgroundColor(b.a(next.maskColor));
                    }
                    if (!TextUtils.isEmpty(next.text)) {
                        this.mTvItemMore.setText(next.text);
                    }
                    if (!TextUtils.isEmpty(next.subImage)) {
                        f.a(getContext()).a(this.mIvMoreSpot, next.subImage);
                    }
                }
                i++;
            }
        }
    }

    @Override // android.support.v4.app.DialogFragment
    public void show(FragmentManager fragmentManager, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61bfe67f", new Object[]{this, fragmentManager, str});
        } else {
            super.show(fragmentManager, str);
        }
    }

    public void onTemporaryPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f98f9c6b", new Object[]{this});
        } else if (!isVisible()) {
        } else {
            this.isTemporaryHide = true;
            dismiss();
        }
    }

    public void onTemporaryResume(FragmentManager fragmentManager, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("936b9601", new Object[]{this, fragmentManager, str});
        } else if (!this.isTemporaryHide || isAdded()) {
        } else {
            show(fragmentManager, str);
            this.isTemporaryHide = false;
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
        } else if (view.getId() == R.id.rl_close) {
            dismiss();
        } else if (this.mAddonModel == null) {
        } else {
            clickTraceEvent();
            Bundle bundle = new Bundle();
            bundle.putString("ttid", epo.f());
            epq.a(epo.a(), this.mAddonModel.tipLink, bundle);
        }
    }

    private void exposureTrackEvent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5a5fdfd", new Object[]{this});
        } else {
            dzh.i(getContext(), this.mAddonModel.itemId, this.mAddonModel.sellId);
        }
    }

    private void clickTraceEvent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2522a04", new Object[]{this});
        } else {
            dzh.j(getContext(), this.mAddonModel.itemId, this.mAddonModel.sellId);
        }
    }

    public void slideToUp(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45581944", new Object[]{this, view});
            return;
        }
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.setDuration(400L);
        TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 1.0f, 1, 0.0f);
        translateAnimation.setDuration(400L);
        animationSet.addAnimation(translateAnimation);
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(400L);
        animationSet.addAnimation(alphaAnimation);
        animationSet.setFillAfter(true);
        animationSet.setFillEnabled(true);
        view.startAnimation(animationSet);
    }
}
