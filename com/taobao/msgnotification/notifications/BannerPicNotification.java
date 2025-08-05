package com.taobao.msgnotification.notifications;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.taobao.util.k;
import android.util.Log;
import android.widget.RemoteViews;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.notification.util.BrandUtil;
import com.taobao.message.notification.util.DensityUtil;
import com.taobao.msgnotification.g;
import com.taobao.msgnotification.h;
import com.taobao.msgnotification.mode.MsgNotficationDTO;
import com.taobao.msgnotification.notifications.template.Banner;
import com.taobao.tao.log.TLog;
import com.taobao.taobao.R;
import tb.kge;
import tb.msq;
import tb.msx;
import tb.msz;

/* loaded from: classes7.dex */
public class BannerPicNotification extends msq {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "BannerPicNotification";
    private Notification mNotification;
    private int nNotifyId;

    static {
        kge.a(-335802868);
    }

    public static /* synthetic */ Object ipc$super(BannerPicNotification bannerPicNotification, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ int access$000(BannerPicNotification bannerPicNotification) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("9c33a48d", new Object[]{bannerPicNotification})).intValue() : bannerPicNotification.nNotifyId;
    }

    public static /* synthetic */ Notification access$100(BannerPicNotification bannerPicNotification) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Notification) ipChange.ipc$dispatch("417776d1", new Object[]{bannerPicNotification}) : bannerPicNotification.mNotification;
    }

    public BannerPicNotification(Context context, MsgNotficationDTO msgNotficationDTO, Bundle bundle, Intent intent) {
        super(context, msgNotficationDTO, bundle, intent);
    }

    @Override // com.taobao.message.notification.system.base.IOldAgooNotification
    public void performNotify() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b98d0d91", new Object[]{this});
        } else if (this.mMsgData == null || this.mMsgData.sceneTemplateData == null) {
            k.a(TAG, "show error,msgData not correct");
        } else {
            try {
                int nextInt = notificationRandom.nextInt();
                this.mBuilder.setTicker(this.mMsgData.ticker);
                this.mBuilder.setContentTitle("");
                this.mBuilder.setContentText("");
                if (Build.VERSION.SDK_INT < 21) {
                    this.mBuilder.setSmallIcon(R.drawable.notify_small_icon);
                } else {
                    this.mBuilder.setSmallIcon(R.drawable.tao_mag_icon_white);
                }
                this.mBuilder.setWhen(System.currentTimeMillis());
                k.a(TAG, "onNotification clickIntent=message_readed");
                setVibrateSound(this.mBuilder, this.mParam);
                if (this.mParam != null) {
                    nextInt = this.mParam.getIntExtra("notifyContentIntentRequestCode", nextInt);
                }
                h.a(this.mBuilder, mContext, this.mExtras, nextInt, this.mParam);
                this.mBuilder.setAutoCancel(true);
                buildNotification(nextInt);
            } catch (Throwable th) {
                k.a(TAG, "throw error,e=" + th.toString());
                TLog.loge(TAG, Log.getStackTraceString(th));
            }
        }
    }

    private void buildNotification(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59953483", new Object[]{this, new Integer(i)});
            return;
        }
        String packageName = mContext.getPackageName();
        Banner banner = (Banner) JSON.parseObject(this.mMsgData.sceneTemplateData.toString(), Banner.class);
        RemoteViews remoteViews = new RemoteViews(packageName, R.layout.personal_banner);
        this.mNotification = this.mBuilder.build();
        this.mNotification.contentView = remoteViews;
        if (Build.VERSION.SDK_INT >= 16) {
            this.mNotification.bigContentView = remoteViews;
        }
        this.nNotifyId = i;
        if (this.mParam != null) {
            this.nNotifyId = this.mParam.getIntExtra("notifyId", i);
        }
        msz.a(mContext, banner.banner, R.id.notificationImage, R.drawable.tao_mag_icon, DensityUtil.dip2px(mContext, 351.0f), DensityUtil.dip2px(mContext, 64.0f), this.mNotification, new msz.b() { // from class: com.taobao.msgnotification.notifications.BannerPicNotification.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.msz.b
            public void a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    return;
                }
                msx.a a2 = msx.a();
                if (!BrandUtil.getInstance().shouldNotify() || (a2 != null && "0".equals(a2.b()))) {
                    TLog.loge(BannerPicNotification.TAG, "should not notify");
                } else {
                    g.a().a(BannerPicNotification.this.getMessageId(), BannerPicNotification.access$000(BannerPicNotification.this), BannerPicNotification.access$100(BannerPicNotification.this));
                }
                BannerPicNotification.this.reportNotify();
            }

            @Override // tb.msz.b
            public void b() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("57a83e9", new Object[]{this});
                } else {
                    BannerPicNotification.this.reportNotify();
                }
            }
        });
    }
}
