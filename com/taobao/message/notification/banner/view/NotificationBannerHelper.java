package com.taobao.message.notification.banner.view;

import android.view.View;
import android.widget.PopupWindow;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.notification.util.EnvUtil;
import com.taobao.message.notification.util.TimeUtil;
import com.taobao.tao.log.TLog;
import tb.kge;

/* loaded from: classes7.dex */
public class NotificationBannerHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "NotificationBannerHelper";
    private INotificationBanner mOnlineBanner;
    private INotificationBanner mPushBanner;

    static {
        kge.a(1152890613);
    }

    public static /* synthetic */ INotificationBanner access$200(NotificationBannerHelper notificationBannerHelper) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (INotificationBanner) ipChange.ipc$dispatch("e1a829f4", new Object[]{notificationBannerHelper}) : notificationBannerHelper.mPushBanner;
    }

    /* loaded from: classes7.dex */
    public static class SingletonHolder {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private static NotificationBannerHelper instance;

        private SingletonHolder() {
        }

        public static /* synthetic */ NotificationBannerHelper access$100() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (NotificationBannerHelper) ipChange.ipc$dispatch("776dd1f8", new Object[0]) : instance;
        }

        static {
            kge.a(-1481321016);
            instance = new NotificationBannerHelper();
        }
    }

    public static NotificationBannerHelper instance() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (NotificationBannerHelper) ipChange.ipc$dispatch("d21c3c94", new Object[0]) : SingletonHolder.access$100();
    }

    private NotificationBannerHelper() {
        this.mPushBanner = null;
        this.mOnlineBanner = null;
    }

    public int getDuration() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ed837a84", new Object[]{this})).intValue();
        }
        INotificationBanner iNotificationBanner = this.mPushBanner;
        if (iNotificationBanner == null) {
            return 6000;
        }
        return iNotificationBanner.getDuration();
    }

    public boolean showNotification(View view, final View.OnClickListener onClickListener, PopupWindow.OnDismissListener onDismissListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7f7daafd", new Object[]{this, view, onClickListener, onDismissListener})).booleanValue();
        }
        if (EnvUtil.isAppBackGround(TAG)) {
            TLog.loge(TAG, "NotificationBannerHelper.showNotification isAppBackground=true");
            return false;
        }
        INotificationBanner iNotificationBanner = this.mPushBanner;
        if (iNotificationBanner != null) {
            iNotificationBanner.dismiss();
            this.mPushBanner = null;
            TLog.loge(ActivityBannerContainer.NOTIFYDISMISS, "NotificationBannerHelper.showNotification mPushBanner != null >> mPushBanner.dismiss(); called ");
        }
        this.mPushBanner = NotificationBannerContainerFactory.instance().createInnerPushContainer(view.getContext());
        INotificationBanner iNotificationBanner2 = this.mPushBanner;
        if (iNotificationBanner2 != null) {
            iNotificationBanner2.initBanner(view, new View.OnClickListener() { // from class: com.taobao.message.notification.banner.view.NotificationBannerHelper.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view2});
                    } else if (TimeUtil.isFastDoubleClick()) {
                        TLog.loge(ActivityBannerContainer.NOTIFYDISMISS, "mPushBanner.onClick return >> UiUtils.isFastDoubleClick() return");
                    } else {
                        View.OnClickListener onClickListener2 = onClickListener;
                        if (onClickListener2 != null) {
                            onClickListener2.onClick(view2);
                            TLog.loge(ActivityBannerContainer.NOTIFYDISMISS, "mPushBanner.onClick called ");
                        }
                        if (NotificationBannerHelper.access$200(NotificationBannerHelper.this) == null) {
                            TLog.loge(ActivityBannerContainer.NOTIFYDISMISS, "mPushBanner.onClick  mPushBanner.dismiss() not called >> mPushBanner == null");
                            return;
                        }
                        NotificationBannerHelper.access$200(NotificationBannerHelper.this).dismiss();
                        TLog.loge(ActivityBannerContainer.NOTIFYDISMISS, "mPushBanner.onClick  mPushBanner.dismiss()  called");
                    }
                }
            }, onDismissListener);
            this.mPushBanner.show();
            return true;
        }
        TLog.loge(TAG, "NotificationBannerHelper.showNotification mPushBanner is null");
        return false;
    }

    public void dismissOnline() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a4e4384", new Object[]{this});
            return;
        }
        INotificationBanner iNotificationBanner = this.mOnlineBanner;
        if (iNotificationBanner == null) {
            return;
        }
        iNotificationBanner.dismiss();
    }

    public void dismissPushBar() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fdba31b6", new Object[]{this});
        } else if (this.mPushBanner == null) {
        } else {
            TLog.loge(ActivityBannerContainer.NOTIFYDISMISS, "mPushBanner.onClick  mPushBanner.dismiss()  called");
            this.mPushBanner.dismiss();
        }
    }

    public void disposePushBanner() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d464d06c", new Object[]{this});
        } else {
            this.mPushBanner = null;
        }
    }

    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            return;
        }
        INotificationBanner iNotificationBanner = this.mPushBanner;
        if (iNotificationBanner == null) {
            return;
        }
        iNotificationBanner.dismiss();
    }

    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
            return;
        }
        INotificationBanner iNotificationBanner = this.mPushBanner;
        if (iNotificationBanner == null) {
            return;
        }
        iNotificationBanner.dismiss();
    }
}
