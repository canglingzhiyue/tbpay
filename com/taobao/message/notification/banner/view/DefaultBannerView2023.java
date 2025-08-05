package com.taobao.message.notification.banner.view;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.TextView;
import com.alibaba.ability.localization.b;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.notification.banner.util.StickPublish;
import com.taobao.message.notification.banner.view.DefaultBannerView;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.lang.ref.WeakReference;
import tb.kge;

/* loaded from: classes7.dex */
public class DefaultBannerView2023 extends DefaultBannerView {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "DefaultBannerView2023";
    private ImageView mOnlineView;

    static {
        kge.a(1936311969);
    }

    public static /* synthetic */ Object ipc$super(DefaultBannerView2023 defaultBannerView2023, String str, Object... objArr) {
        if (str.hashCode() == 1107888385) {
            return super.mo1144init((DefaultBannerView.ViewDataModel) objArr[0]);
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ void access$000(DefaultBannerView2023 defaultBannerView2023, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5502f38b", new Object[]{defaultBannerView2023, new Boolean(z)});
        } else {
            defaultBannerView2023.refreshOnlineIcon(z);
        }
    }

    @Override // com.taobao.message.notification.banner.view.DefaultBannerView
    /* renamed from: init */
    public DefaultBannerView2023 mo1144init(DefaultBannerView.ViewDataModel viewDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DefaultBannerView2023) ipChange.ipc$dispatch("940260e2", new Object[]{this, viewDataModel});
        }
        super.mo1144init(viewDataModel);
        if (!TextUtils.isEmpty(viewDataModel.mGoodsUrl)) {
            TUrlImageView tUrlImageView = (TUrlImageView) this.mView.findViewById(R.id.notification_icon_goods);
            tUrlImageView.setImageUrl(viewDataModel.mGoodsUrl);
            tUrlImageView.setVisibility(0);
            this.mReplyView.setVisibility(8);
        }
        this.mOnlineView = (ImageView) this.mView.findViewById(R.id.notification_icon_online);
        if (viewDataModel.mInOnline != null) {
            refreshOnlineIcon(true);
            viewDataModel.mInOnline.subscribe(new OnlineConsumer(this));
        }
        TextView textView = (TextView) this.mView.findViewById(R.id.notification_reply_text);
        if (textView != null) {
            textView.setText(b.a(R.string.mp_notification_reply));
        }
        return this;
    }

    @Override // com.taobao.message.notification.banner.view.DefaultBannerView
    public int getLayout() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("28b929a", new Object[]{this})).intValue() : R.layout.msgcenter_push_banner_v2023;
    }

    @Override // com.taobao.message.notification.banner.view.DefaultBannerView
    public void hideReplyView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("818c3f94", new Object[]{this});
        } else if (this.mReplyView.getVisibility() != 0) {
        } else {
            ((TextView) this.mReplyView.findViewById(R.id.notification_reply_text)).setText(b.a(R.string.mp_notification_check));
        }
    }

    private void refreshOnlineIcon(final boolean z) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3980f0e6", new Object[]{this, new Boolean(z)});
        } else if (Looper.getMainLooper() == Looper.myLooper()) {
            ImageView imageView = this.mOnlineView;
            if (!z) {
                i = 8;
            }
            imageView.setVisibility(i);
        } else {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.taobao.message.notification.banner.view.-$$Lambda$DefaultBannerView2023$Iy7dw-Y18ZajdXqL_9ZjZJyRY54
                {
                    DefaultBannerView2023.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    DefaultBannerView2023.this.lambda$refreshOnlineIcon$1$DefaultBannerView2023(z);
                }
            });
        }
    }

    public /* synthetic */ void lambda$refreshOnlineIcon$1$DefaultBannerView2023(boolean z) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6171b076", new Object[]{this, new Boolean(z)});
            return;
        }
        ImageView imageView = this.mOnlineView;
        if (!z) {
            i = 8;
        }
        imageView.setVisibility(i);
    }

    /* loaded from: classes7.dex */
    public static class OnlineConsumer implements StickPublish.Consumer<Boolean> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private WeakReference<DefaultBannerView2023> mWeakReference;

        static {
            kge.a(1471634412);
            kge.a(749710312);
        }

        public OnlineConsumer(DefaultBannerView2023 defaultBannerView2023) {
            this.mWeakReference = new WeakReference<>(defaultBannerView2023);
        }

        @Override // com.taobao.message.notification.banner.util.StickPublish.Consumer
        public void accept(Boolean bool) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f0d4f95e", new Object[]{this, bool});
                return;
            }
            DefaultBannerView2023 defaultBannerView2023 = this.mWeakReference.get();
            if (defaultBannerView2023 == null) {
                return;
            }
            DefaultBannerView2023.access$000(defaultBannerView2023, bool.booleanValue());
        }
    }
}
