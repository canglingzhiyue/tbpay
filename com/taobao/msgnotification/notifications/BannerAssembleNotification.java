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
import com.taobao.msgnotification.notifications.template.AssembleBanner;
import com.taobao.tao.log.TLog;
import com.taobao.taobao.R;
import java.util.concurrent.atomic.AtomicInteger;
import tb.kge;
import tb.msq;
import tb.msx;
import tb.msz;

/* loaded from: classes7.dex */
public class BannerAssembleNotification extends msq {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "BannerAssembleNotification";
    private AtomicInteger finishCount;
    private Notification mNotification;
    private int mNotifyId;

    static {
        kge.a(908518342);
    }

    public static /* synthetic */ Object ipc$super(BannerAssembleNotification bannerAssembleNotification, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ void access$000(BannerAssembleNotification bannerAssembleNotification) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c71970a4", new Object[]{bannerAssembleNotification});
        } else {
            bannerAssembleNotification.checkNotify();
        }
    }

    public BannerAssembleNotification(Context context, MsgNotficationDTO msgNotficationDTO, Bundle bundle, Intent intent) {
        super(context, msgNotficationDTO, bundle, intent);
        this.finishCount = new AtomicInteger(0);
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
        AssembleBanner assembleBanner = (AssembleBanner) JSON.parseObject(this.mMsgData.sceneTemplateData.toString(), AssembleBanner.class);
        this.mNotifyId = i;
        if (this.mParam != null) {
            this.mNotifyId = this.mParam.getIntExtra("notifyId", i);
        }
        RemoteViews remoteViews = new RemoteViews(packageName, R.layout.personal_assemble_banner);
        remoteViews.setTextViewText(R.id.notificationTitle, assembleBanner.getTitle());
        remoteViews.setTextViewText(R.id.notificationText, assembleBanner.subTitle);
        this.mNotification = this.mBuilder.build();
        this.mNotification.contentView = remoteViews;
        if (Build.VERSION.SDK_INT >= 16) {
            this.mNotification.bigContentView = remoteViews;
        }
        msz.a(mContext, assembleBanner.pic, R.id.notificationImage, R.drawable.tao_mag_icon, DensityUtil.dip2px(mContext, 53.0f), DensityUtil.dip2px(mContext, 53.0f), this.mNotification, new msz.b() { // from class: com.taobao.msgnotification.notifications.BannerAssembleNotification.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.msz.b
            public void a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                } else {
                    BannerAssembleNotification.access$000(BannerAssembleNotification.this);
                }
            }

            @Override // tb.msz.b
            public void b() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("57a83e9", new Object[]{this});
                } else {
                    BannerAssembleNotification.access$000(BannerAssembleNotification.this);
                }
            }
        });
        msz.a(mContext, assembleBanner.bgPic, R.id.notificationBackground, R.drawable.tao_mag_icon, DensityUtil.dip2px(mContext, 351.0f), DensityUtil.dip2px(mContext, 64.0f), this.mNotification, new msz.b() { // from class: com.taobao.msgnotification.notifications.BannerAssembleNotification.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.msz.b
            public void a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                } else {
                    BannerAssembleNotification.access$000(BannerAssembleNotification.this);
                }
            }

            @Override // tb.msz.b
            public void b() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("57a83e9", new Object[]{this});
                } else {
                    BannerAssembleNotification.access$000(BannerAssembleNotification.this);
                }
            }
        });
    }

    private void checkNotify() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23f6678", new Object[]{this});
            return;
        }
        this.finishCount.addAndGet(1);
        if (this.finishCount.get() != 2) {
            return;
        }
        msx.a a2 = msx.a();
        if (!BrandUtil.getInstance().shouldNotify() || (a2 != null && "0".equals(a2.b()))) {
            TLog.loge(TAG, "should not notify");
        } else {
            g.a().a(getMessageId(), this.mNotifyId, this.mNotification);
        }
        reportNotify();
    }
}
