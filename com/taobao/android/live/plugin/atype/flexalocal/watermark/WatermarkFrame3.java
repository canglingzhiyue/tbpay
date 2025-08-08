package com.taobao.android.live.plugin.atype.flexalocal.watermark;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.alilive.aliliveframework.frame.a;
import com.taobao.taobao.R;
import com.taobao.taolive.room.openarchitecture.entity.ATaoLiveOpenEntity;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import com.taobao.taolive.sdk.utils.b;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import tb.kge;
import tb.kqq;
import tb.phg;
import tb.plz;

/* loaded from: classes6.dex */
public class WatermarkFrame3 extends BaseFrame {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private TextView numberText;
    private TUrlImageView watermarkIcon;

    static {
        kge.a(-1629244685);
    }

    public static /* synthetic */ Object ipc$super(WatermarkFrame3 watermarkFrame3, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1272916118) {
            super.onDataReceived((TBLiveDataModel) objArr[0]);
            return null;
        } else if (hashCode != 91531079) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onViewCreated((View) objArr[0]);
            return null;
        }
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponent
    public String getComponentName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bb5fe8c7", new Object[]{this}) : "tl-watermark";
    }

    public WatermarkFrame3(Context context, a aVar) {
        super(context, aVar);
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public int getLayoutResId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("f1151e95", new Object[]{this})).intValue() : R.layout.taolive_room_watermark_layout2_flexalocal;
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onViewCreated(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("574a747", new Object[]{this, view});
            return;
        }
        super.onViewCreated(view);
        this.numberText = (TextView) view.findViewById(R.id.taolive_room_watermark_text);
        this.watermarkIcon = (TUrlImageView) view.findViewById(R.id.taolive_room_icon_watermark);
        this.watermarkIcon.setImageUrl("https://img.alicdn.com/imgextra/i1/O1CN01RrmPTP1p8JxK7Xd3V_!!6000000005315-2-tps-78-30.png");
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public void onDataReceived(TBLiveDataModel tBLiveDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b420d76a", new Object[]{this, tBLiveDataModel});
            return;
        }
        super.onDataReceived(tBLiveDataModel);
        adjustLayoutParams(tBLiveDataModel, this.mContainer);
        if (tBLiveDataModel.mVideoInfo == null) {
            return;
        }
        TextView textView = this.numberText;
        textView.setText(" ID:" + tBLiveDataModel.mVideoInfo.roomNum);
    }

    private void adjustLayoutParams(TBLiveDataModel tBLiveDataModel, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ee732f3", new Object[]{this, tBLiveDataModel, view});
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        if (isOfficialLive(tBLiveDataModel) && !this.mLandscape) {
            marginLayoutParams.topMargin = b.a(this.mContext, 3.0f);
        } else {
            marginLayoutParams.topMargin = getTopMargin();
        }
        view.setLayoutParams(marginLayoutParams);
    }

    private int getTopMargin() {
        ATaoLiveOpenEntity o;
        kqq kqqVar;
        int d;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3710f6a7", new Object[]{this})).intValue();
        }
        int a2 = b.a(this.mContext, 32.0f);
        if (this.mLandscape) {
            a2 = b.a(this.mContext, 30.0f);
        } else if (phg.d().a()) {
            a2 = b.a(this.mContext, 26.0f);
        }
        return (this.mFrameContext == null || (o = this.mFrameContext.o()) == null || o.uiCompontent == null || !(o.uiCompontent.a() instanceof kqq) || (kqqVar = (kqq) o.uiCompontent.a()) == null || (d = kqqVar.d()) < 0) ? a2 : d;
    }

    private boolean isShowTaoLiveBanner(TBLiveDataModel tBLiveDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a46e0c77", new Object[]{this, tBLiveDataModel})).booleanValue();
        }
        if (tBLiveDataModel != null && tBLiveDataModel.mVideoInfo != null) {
            VideoInfo videoInfo = tBLiveDataModel.mVideoInfo;
            if (plz.a(videoInfo) && videoInfo.taoLiveAtmosphereInfo != null && !StringUtils.isEmpty(videoInfo.taoLiveAtmosphereInfo.taoLiveIcon)) {
                return true;
            }
        }
        return false;
    }

    private boolean isOfficialLive(TBLiveDataModel tBLiveDataModel) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f2e1e945", new Object[]{this, tBLiveDataModel})).booleanValue() : isShowTaoLiveBanner(tBLiveDataModel) || isShowDiantaoOfficialBanner(tBLiveDataModel.mVideoInfo);
    }

    public static boolean isShowDiantaoOfficialBanner(VideoInfo videoInfo) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9b5ac76a", new Object[]{videoInfo})).booleanValue() : isDiantaoOfficial(videoInfo) && videoInfo.displayInfo.diantaoOfficialAtmosphereInfo != null && !StringUtils.isEmpty(videoInfo.displayInfo.diantaoOfficialAtmosphereInfo.taoLiveIcon);
    }

    public static boolean isDiantaoOfficial(VideoInfo videoInfo) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d03d1859", new Object[]{videoInfo})).booleanValue() : (videoInfo == null || videoInfo.displayInfo == null || videoInfo.displayInfo.diantaoRoomType != 1) ? false : true;
    }
}
