package com.taobao.message.notification.banner.view;

import android.app.Activity;
import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.notification.base.EnvService;
import com.taobao.message.notification.util.EnvUtil;
import com.taobao.orange.OrangeConfig;
import com.taobao.tao.log.TLog;
import tb.kge;

/* loaded from: classes7.dex */
public class NotificationBannerContainerFactory {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "NotificationBannerContainerFactory";

    static {
        kge.a(982717392);
    }

    /* loaded from: classes7.dex */
    public static class SingletonHolder {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private static NotificationBannerContainerFactory instance;

        private SingletonHolder() {
        }

        public static /* synthetic */ NotificationBannerContainerFactory access$000() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (NotificationBannerContainerFactory) ipChange.ipc$dispatch("2ca4df5e", new Object[0]) : instance;
        }

        static {
            kge.a(-1800856413);
            instance = new NotificationBannerContainerFactory();
        }
    }

    public static NotificationBannerContainerFactory instance() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (NotificationBannerContainerFactory) ipChange.ipc$dispatch("38d4f999", new Object[0]) : SingletonHolder.access$000();
    }

    public INotificationBanner createInnerPushContainer(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (INotificationBanner) ipChange.ipc$dispatch("61458eb5", new Object[]{this, context});
        }
        if (!EnvService.instance().isWindowManagerAvaliable(context)) {
            if (EnvUtil.getTopActivity() == null) {
                return null;
            }
            Activity topActivity = EnvUtil.getTopActivity();
            if (topActivity == null) {
                TLog.loge(TAG, "Activity is null, cannot create dialog for add tao friend.");
                return null;
            }
            ActivityBannerContainer activityBannerContainer = new ActivityBannerContainer(topActivity);
            activityBannerContainer.setDuration(getDisplayDuration());
            return activityBannerContainer;
        }
        ApplicationBannerContainer applicationBannerContainer = new ApplicationBannerContainer(context);
        applicationBannerContainer.setDuration(getDisplayDuration());
        return applicationBannerContainer;
    }

    private int getDisplayDuration() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a981eba", new Object[]{this})).intValue();
        }
        String config = OrangeConfig.getInstance().getConfig("mpm_business_switch", "innerPushDisplayDuration", String.valueOf(6000));
        TLog.logd(TAG, "getDisplayDuration = " + config);
        try {
            return Integer.valueOf(config).intValue();
        } catch (Exception e) {
            e.printStackTrace();
            return 6000;
        }
    }
}
