package com.taobao.message.notification.banner.view;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.MotionEvent;
import android.view.View;
import android.widget.PopupWindow;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.notification.banner.InnerPushNotification;
import com.taobao.message.notification.util.DensityUtil;
import com.taobao.orange.OrangeConfig;
import com.taobao.tao.log.TLog;
import tb.kge;

/* loaded from: classes7.dex */
public abstract class BaseBannerContainer implements INotificationBanner {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ACTIVE = "active";
    public static final int ANIMATION_DURATION = 300;
    public static final int INNER_PUSH_DISPLAY_DURATION_DEFAULT = 6000;
    public static final int MIN_PULL_UP_DISTANCE = 10;
    private static final String TAG = "BaseBannerContainer";
    public static int mDuration;
    public View mBannerView;
    public Context mContext;
    public View.OnClickListener mOnClickListener = null;
    public PopupWindow.OnDismissListener mOnDismissListener = null;
    public Handler mHandler = new Handler(Looper.getMainLooper()) { // from class: com.taobao.message.notification.banner.view.BaseBannerContainer.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(AnonymousClass1 anonymousClass1, String str, Object... objArr) {
            if (str.hashCode() == 673877017) {
                super.handleMessage((Message) objArr[0]);
                return null;
            }
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
                return;
            }
            int i = message.what;
            if (i != 4412244) {
                if (i == 5526356) {
                    BaseBannerContainer.this.removeBanner();
                    BaseBannerContainer.this.disposePushBanner();
                    return;
                } else if (BaseBannerContainer.this.handleMessage(message)) {
                    return;
                } else {
                    super.handleMessage(message);
                    return;
                }
            }
            BaseBannerContainer.this.removeBanner();
            BaseBannerContainer.this.disposePushBanner();
            if ((BaseBannerContainer.this.mOnDismissListener instanceof InnerPushNotification.OnDismissListenerWithType) && message.getData() != null && message.getData().getBoolean("active")) {
                ((InnerPushNotification.OnDismissListenerWithType) BaseBannerContainer.this.mOnDismissListener).onDismissActive();
            } else if (BaseBannerContainer.this.mOnDismissListener == null) {
            } else {
                BaseBannerContainer.this.mOnDismissListener.onDismiss();
            }
        }
    };
    public View.OnTouchListener mTouchListener = new View.OnTouchListener() { // from class: com.taobao.message.notification.banner.view.BaseBannerContainer.2
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private float mStartY;

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("d4aa3aa4", new Object[]{this, view, motionEvent})).booleanValue();
            }
            int action = motionEvent.getAction();
            if (action == 0) {
                this.mStartY = motionEvent.getY();
            } else if (action == 1) {
                if (this.mStartY - motionEvent.getY() > DensityUtil.dip2px(view.getContext(), 10.0f)) {
                    BaseBannerContainer.this.mHandler.removeMessages(Messages.REMOVE_BANNER_ACTIVIE);
                    Message message = new Message();
                    message.what = Messages.REMOVE_BANNER_ACTIVIE;
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("active", true);
                    message.setData(bundle);
                    BaseBannerContainer.this.mHandler.sendMessage(message);
                    return true;
                } else if (motionEvent.getY() - this.mStartY > DensityUtil.dip2px(view.getContext(), 10.0f)) {
                    if (BaseBannerContainer.this.mOnClickListener != null) {
                        BaseBannerContainer.this.mOnClickListener.onClick(null);
                    }
                    return true;
                }
            }
            return false;
        }
    };

    /* loaded from: classes7.dex */
    public interface Messages {
        public static final int REMOVE_BANNER = 5526356;
        public static final int REMOVE_BANNER_ACTIVIE = 4412244;
    }

    public abstract boolean handleMessage(Message message);

    @Override // com.taobao.message.notification.banner.view.INotificationBanner
    public void initBanner(View view, View.OnClickListener onClickListener, PopupWindow.OnDismissListener onDismissListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16b46cd", new Object[]{this, view, onClickListener, onDismissListener});
        }
    }

    @Override // com.taobao.message.notification.banner.view.INotificationBanner
    public void initBanner(String str, String str2, View.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e453a62", new Object[]{this, str, str2, onClickListener});
        }
    }

    public abstract void removeBanner();

    static {
        kge.a(508646708);
        kge.a(2054434256);
        mDuration = 6000;
    }

    public BaseBannerContainer(Context context) {
        if (context == null) {
            throw new IllegalArgumentException("BaseBannerContainercontext is null");
        }
        this.mContext = context.getApplicationContext();
    }

    public void init(View view, View.OnClickListener onClickListener, PopupWindow.OnDismissListener onDismissListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("647b8381", new Object[]{this, view, onClickListener, onDismissListener});
        } else if (view == null) {
        } else {
            this.mBannerView = view;
            this.mOnClickListener = onClickListener;
            this.mOnDismissListener = onDismissListener;
            this.mBannerView.setOnClickListener(this.mOnClickListener);
            this.mBannerView.setOnTouchListener(this.mTouchListener);
        }
    }

    @Override // com.taobao.message.notification.banner.view.INotificationBanner
    public void setDuration(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55c2b106", new Object[]{this, new Integer(i)});
        } else {
            mDuration = i;
        }
    }

    @Override // com.taobao.message.notification.banner.view.INotificationBanner
    public int getDuration() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ed837a84", new Object[]{this})).intValue() : mDuration;
    }

    @Override // com.taobao.message.notification.banner.view.INotificationBanner
    public void dismiss() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae28e211", new Object[]{this});
            return;
        }
        this.mHandler.removeCallbacksAndMessages(null);
        this.mHandler.sendEmptyMessage(Messages.REMOVE_BANNER);
        TLog.loge(ActivityBannerContainer.NOTIFYDISMISS, "BaseBannerContainer sendEmptyMessage REMOVE_BANNER ");
    }

    public void disposePushBanner() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d464d06c", new Object[]{this});
        } else if (!"1".equals(OrangeConfig.getInstance().getConfig("mpm_business_switch", "disposePushBannerOnDismiss", "1"))) {
        } else {
            NotificationBannerHelper.instance().disposePushBanner();
        }
    }
}
