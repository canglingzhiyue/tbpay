package com.taobao.message.notification.banner.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.notification.banner.util.StickPublish;
import com.taobao.message.notification.util.EnvUtil;
import com.taobao.message.notification.util.TimeUtil;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import tb.kge;

/* loaded from: classes7.dex */
public class DefaultBannerView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public View mReplyView;
    public View mView;

    /* loaded from: classes7.dex */
    public static class ViewDataModel {
        public String mContent;
        public Context mContext;
        public String mGoodsUrl;
        public String mIcon;
        public StickPublish<Boolean> mInOnline;
        public String mTargetId;
        public long mTime;
        public String mTitle;

        static {
            kge.a(1112743384);
        }
    }

    static {
        kge.a(-1678740830);
    }

    public static DefaultBannerView build(Context context, String str, String str2, String str3, long j, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DefaultBannerView) ipChange.ipc$dispatch("2ab7d36c", new Object[]{context, str, str2, str3, new Long(j), str4});
        }
        ViewDataModel viewDataModel = new ViewDataModel();
        viewDataModel.mContext = context;
        viewDataModel.mIcon = str;
        viewDataModel.mTitle = str2;
        viewDataModel.mContent = str3;
        viewDataModel.mGoodsUrl = str4;
        viewDataModel.mTime = j;
        return new DefaultBannerView2023().mo1144init(viewDataModel);
    }

    public static DefaultBannerView build(ViewDataModel viewDataModel) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DefaultBannerView) ipChange.ipc$dispatch("bd2fdfe3", new Object[]{viewDataModel}) : new DefaultBannerView2023().mo1144init(viewDataModel);
    }

    /* renamed from: init */
    public DefaultBannerView mo1144init(ViewDataModel viewDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DefaultBannerView) ipChange.ipc$dispatch("42090901", new Object[]{this, viewDataModel});
        }
        this.mView = LayoutInflater.from(viewDataModel.mContext).inflate(getLayout(), (ViewGroup) null);
        this.mReplyView = this.mView.findViewById(R.id.notification_reply);
        TUrlImageView tUrlImageView = (TUrlImageView) this.mView.findViewById(R.id.notification_icon);
        tUrlImageView.setStrategyConfig(EnvUtil.imageStrategyConfig);
        tUrlImageView.setPlaceHoldImageResId(R.drawable.alimp_default_avatar);
        tUrlImageView.setImageUrl(viewDataModel.mIcon);
        ((TextView) this.mView.findViewById(R.id.notification_title)).setText(viewDataModel.mTitle);
        ((TextView) this.mView.findViewById(R.id.notification_content)).setText(viewDataModel.mContent);
        ((TextView) this.mView.findViewById(R.id.notification_time)).setText(TimeUtil.formatTimeForInnerNotification(viewDataModel.mTime));
        return this;
    }

    public int getLayout() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("28b929a", new Object[]{this})).intValue() : R.layout.msgcenter_push_banner;
    }

    public View getView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("576a35e4", new Object[]{this}) : this.mView;
    }

    public void hideReplyView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("818c3f94", new Object[]{this});
        } else {
            this.mReplyView.setVisibility(8);
        }
    }
}
