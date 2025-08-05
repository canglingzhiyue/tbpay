package com.taobao.android.live.plugin.atype.flexalocal.banner;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.alilive.adapter.uikit.AliUrlImageView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.alilive.aliliveframework.frame.a;
import com.taobao.taobao.R;
import com.taobao.taolive.room.utils.s;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import tb.kge;
import tb.phg;
import tb.plz;

/* loaded from: classes5.dex */
public class TaoLiveBannerFrame extends BaseFrame {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private AliUrlImageView imageView;

    static {
        kge.a(1422232010);
    }

    public static /* synthetic */ Object ipc$super(TaoLiveBannerFrame taoLiveBannerFrame, String str, Object... objArr) {
        if (str.hashCode() == 91531079) {
            super.onViewCreated((View) objArr[0]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public TaoLiveBannerFrame(Context context, a aVar) {
        super(context, aVar);
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public int getLayoutResId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("f1151e95", new Object[]{this})).intValue() : R.layout.taolive_taolive_banner_layout_flexalocal;
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onViewCreated(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("574a747", new Object[]{this, view});
            return;
        }
        super.onViewCreated(view);
        this.imageView = (AliUrlImageView) view.findViewById(R.id.taolive_banner);
        this.imageView.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.live.plugin.atype.flexalocal.banner.TaoLiveBannerFrame.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view2});
                    return;
                }
                VideoInfo videoInfo = TaoLiveBannerFrame.this.mLiveDataModel.mVideoInfo;
                if (videoInfo == null || videoInfo.taoLiveAtmosphereInfo == null || TextUtils.isEmpty(videoInfo.taoLiveAtmosphereInfo.taoLiveIconJumpUrl)) {
                    return;
                }
                s.a(TaoLiveBannerFrame.this.mContext, videoInfo.taoLiveAtmosphereInfo.taoLiveIconJumpUrl);
                if (phg.a() == null) {
                    return;
                }
                phg.a().a(TaoLiveBannerFrame.this.mFrameContext, "taolive_top", new String[0]);
            }
        });
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public void onDataReceived(TBLiveDataModel tBLiveDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b420d76a", new Object[]{this, tBLiveDataModel});
            return;
        }
        String bannerUrl = getBannerUrl(tBLiveDataModel);
        if (!TextUtils.isEmpty(bannerUrl)) {
            this.imageView.setVisibility(0);
            this.imageView.setImageUrl(bannerUrl);
            ViewGroup.LayoutParams layoutParams = this.imageView.getLayoutParams();
            layoutParams.height = plz.a(this.mContext);
            this.imageView.setLayoutParams(layoutParams);
            return;
        }
        this.imageView.setVisibility(8);
    }

    private String getBannerUrl(TBLiveDataModel tBLiveDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3be67ad3", new Object[]{this, tBLiveDataModel});
        }
        VideoInfo videoInfo = tBLiveDataModel.mVideoInfo;
        if (plz.a(videoInfo) && videoInfo.taoLiveAtmosphereInfo != null) {
            if (!TextUtils.isEmpty(videoInfo.taoLiveAtmosphereInfo.taoLiveIcon)) {
                return videoInfo.taoLiveAtmosphereInfo.taoLiveIcon;
            }
            if (!TextUtils.isEmpty(videoInfo.taoLiveAtmosphereInfo.taoLiveHideMenuPic)) {
                return videoInfo.taoLiveAtmosphereInfo.taoLiveHideMenuPic;
            }
        }
        return null;
    }
}
