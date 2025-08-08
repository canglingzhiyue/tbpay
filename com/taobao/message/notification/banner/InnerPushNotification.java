package com.taobao.message.notification.banner;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.preference.PreferenceManager;
import android.support.v4.app.Fragment;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.widget.PopupWindow;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.notification.banner.support.MarketingInnerNotificationAdapter;
import com.taobao.message.notification.banner.view.NotificationBannerHelper;
import com.taobao.message.notification.constans.SettingContants;
import com.taobao.message.notification.util.EnvUtil;
import com.taobao.orange.OrangeConfig;
import com.taobao.tao.log.TLog;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import tb.kge;

/* loaded from: classes7.dex */
public class InnerPushNotification {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "InnerPushNotification";
    private static Set<String> defaultExcludeActivities;
    private static List<NotificationPopProcessor> processors;
    private static Set<String> sExcludeActivities;
    private static Set<String> sExcludeFragments;
    private static boolean sInnerPushSwitch;
    public InnerNotificationAdapter mAdapter;

    /* loaded from: classes7.dex */
    public interface NotificationPopProcessor {
        boolean unNeedPop();
    }

    public void dismiss() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae28e211", new Object[]{this});
        }
    }

    static {
        kge.a(-901494367);
        sInnerPushSwitch = true;
        sExcludeActivities = new HashSet();
        sExcludeFragments = new HashSet();
        HashSet hashSet = new HashSet();
        defaultExcludeActivities = hashSet;
        hashSet.add("com.taobao.android.litecreator.modules.record.LCRecordActivity");
        defaultExcludeActivities.add("com.taobao.android.litecreator.modules.record.LCRecordActivityDirect");
        defaultExcludeActivities.add("com.taobao.android.litecreator.modules.record.albumfilm.FilmDetailActivity");
        defaultExcludeActivities.add("com.taobao.android.litecreator.modules.record.ablum.preview.image.LCImageGalleryActivity");
        defaultExcludeActivities.add("com.taobao.android.litecreator.modules.edit.video.LCVideoEditActivity");
        defaultExcludeActivities.add("com.taobao.android.litecreator.modules.edit.image.LCImageEditActivity");
        defaultExcludeActivities.add("com.taobao.android.litecreator.modules.edit.image.crop.activity.LCCropActivity");
        defaultExcludeActivities.add("com.taobao.android.litecreator.modules.edit.video.cutter.LcVideoCutActivity");
        defaultExcludeActivities.add("com.taobao.taopai.business.music.main.MusicSelectActivity");
        defaultExcludeActivities.add("com.taobao.android.litecreator.modules.coverpick.marvel.LCVideoCoverPickActivityNew");
        defaultExcludeActivities.add("com.taobao.android.litecreator.modules.record.ablum.LcAlbumActivity");
        defaultExcludeActivities.add("com.taobao.umipublish.tnode.LiteCreatorPublishActivity");
        defaultExcludeActivities.add("com.taobao.umipublish.extension.preview.video.UmiVideoPreviewActivity");
        defaultExcludeActivities.add("com.taobao.umipublish.extension.preview.image.UmiImagePreviewActivity");
        processors = new CopyOnWriteArrayList();
    }

    /* loaded from: classes7.dex */
    public static abstract class OnDismissListenerWithType implements PopupWindow.OnDismissListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-546637220);
            kge.a(-776969364);
        }

        public abstract void onDismiss(boolean z);

        @Override // android.widget.PopupWindow.OnDismissListener
        public final void onDismiss() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cab76ab2", new Object[]{this});
            } else {
                onDismiss(false);
            }
        }

        public final void onDismissActive() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3a5d4698", new Object[]{this});
            } else {
                onDismiss(true);
            }
        }
    }

    public static void registerNotificationPopProcessor(NotificationPopProcessor notificationPopProcessor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("658463bc", new Object[]{notificationPopProcessor});
        } else {
            processors.add(notificationPopProcessor);
        }
    }

    public static void unregisterNotificationPopProcessor(NotificationPopProcessor notificationPopProcessor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66566983", new Object[]{notificationPopProcessor});
        } else {
            processors.remove(notificationPopProcessor);
        }
    }

    public static void enable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a800938a", new Object[]{new Boolean(z)});
        } else {
            sInnerPushSwitch = z;
        }
    }

    public static void excludeActivityClassNames(Set<String> set) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7b9b21f", new Object[]{set});
        } else if (set == null) {
        } else {
            sExcludeActivities.addAll(set);
        }
    }

    public static void excludeFragmentClassNames(Set<String> set) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf34b67e", new Object[]{set});
        } else if (set == null) {
        } else {
            sExcludeFragments.addAll(set);
        }
    }

    private InnerPushNotification(InnerNotificationAdapter innerNotificationAdapter) {
        this.mAdapter = innerNotificationAdapter;
    }

    public static InnerPushNotification obtain(InnerNotificationAdapter innerNotificationAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (InnerPushNotification) ipChange.ipc$dispatch("e8df35f7", new Object[]{innerNotificationAdapter});
        }
        if (innerNotificationAdapter != null) {
            return new InnerPushNotification(innerNotificationAdapter);
        }
        return null;
    }

    public void show() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebbb9904", new Object[]{this});
        } else if (!sInnerPushSwitch) {
            TLog.loge(TAG, "total switch close");
            this.mAdapter.onError(-3);
        } else if (!this.mAdapter.needShow()) {
            TLog.loge(TAG, "performNotifyBefore return false, abort follow steps!");
            this.mAdapter.onError(0);
        } else {
            if (!processors.isEmpty()) {
                try {
                    for (NotificationPopProcessor notificationPopProcessor : processors) {
                        if (notificationPopProcessor.unNeedPop()) {
                            this.mAdapter.onError(-4);
                            return;
                        }
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            if (!PreferenceManager.getDefaultSharedPreferences(this.mAdapter.getView().getContext().getApplicationContext()).getBoolean(SettingContants.SETTINGS_APP_BANNER, true)) {
                TLog.loge(TAG, "settingTrigger is return ");
                this.mAdapter.onError(-1);
                return;
            }
            if (this.mAdapter.mVO.options != null && this.mAdapter.mVO.options.allPage) {
                z = true;
            }
            Activity topActivity = EnvUtil.getTopActivity();
            if (!z && topActivity != null && sExcludeActivities.contains(topActivity.getClass().getName())) {
                TLog.loge(TAG, "activity exclude is return ");
                this.mAdapter.onError(-2);
                return;
            }
            Fragment topFragment = EnvUtil.getTopFragment();
            if (!z && topFragment != null && sExcludeFragments.contains(topFragment.getClass().getName())) {
                TLog.loge(TAG, "fragment exclude is return ");
                this.mAdapter.onError(-2);
            } else if (!notificationHiddenByOrange(topActivity, topFragment)) {
                Runnable runnable = new Runnable() { // from class: com.taobao.message.notification.banner.-$$Lambda$InnerPushNotification$aOHIvAn8aHMAI1ugUkDwdmCau3M
                    {
                        InnerPushNotification.this = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        InnerPushNotification.this.lambda$show$0$InnerPushNotification();
                    }
                };
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    runnable.run();
                } else {
                    new Handler(Looper.getMainLooper()).post(runnable);
                }
            }
        }
    }

    public /* synthetic */ void lambda$show$0$InnerPushNotification() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1984c94d", new Object[]{this});
        } else if (!NotificationBannerHelper.instance().showNotification(this.mAdapter.getView(), new View.OnClickListener() { // from class: com.taobao.message.notification.banner.InnerPushNotification.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else {
                    InnerPushNotification.this.mAdapter.onClick(view);
                }
            }
        }, new OnDismissListenerWithType() { // from class: com.taobao.message.notification.banner.InnerPushNotification.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.message.notification.banner.InnerPushNotification.OnDismissListenerWithType
            public void onDismiss(boolean z) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8c369e62", new Object[]{this, new Boolean(z)});
                } else {
                    InnerPushNotification.this.dismiss();
                }
            }
        })) {
        } else {
            this.mAdapter.onShow();
        }
    }

    private boolean notificationHiddenByOrange(Activity activity, Fragment fragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("268d8003", new Object[]{this, activity, fragment})).booleanValue();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("ExcludePushActivity");
        String str = "_sync";
        sb.append(this.mAdapter instanceof MarketingInnerNotificationAdapter ? "" : str);
        String sb2 = sb.toString();
        String obj = this.mAdapter instanceof MarketingInnerNotificationAdapter ? defaultExcludeActivities.toString() : "";
        StringBuilder sb3 = new StringBuilder();
        sb3.append("ExcludePushFragment");
        if (this.mAdapter instanceof MarketingInnerNotificationAdapter) {
            str = "";
        }
        sb3.append(str);
        String sb4 = sb3.toString();
        String config = OrangeConfig.getInstance().getConfig("mpm_business_switch", sb2, obj);
        if (!StringUtils.isEmpty(config) && activity != null && config.contains(activity.getClass().getName())) {
            TLog.loge(TAG, sb2 + " orange activity exclude is return ");
            this.mAdapter.onError(-2);
            return true;
        }
        String config2 = OrangeConfig.getInstance().getConfig("mpm_business_switch", sb4, "");
        if (StringUtils.isEmpty(config2) || fragment == null || !config2.contains(fragment.getClass().getName())) {
            return false;
        }
        TLog.loge(TAG, sb4 + " orange fragment exclude is return ");
        this.mAdapter.onError(-2);
        return true;
    }

    public InnerPushVO getVO() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (InnerPushVO) ipChange.ipc$dispatch("67cd4a40", new Object[]{this}) : this.mAdapter.getVO();
    }

    public void updateVO(InnerPushVO innerPushVO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df5bf649", new Object[]{this, innerPushVO});
        } else {
            this.mAdapter.updateVO(innerPushVO);
        }
    }
}
