package com.taobao.msgnotification.notifications;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.taobao.util.k;
import mtopsdk.common.util.StringUtils;
import android.util.Log;
import android.widget.RemoteViews;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.util.a;
import com.taobao.message.notification.util.BrandUtil;
import com.taobao.message.notification.util.DensityUtil;
import com.taobao.msgnotification.g;
import com.taobao.msgnotification.h;
import com.taobao.msgnotification.mode.MsgNotficationDTO;
import com.taobao.msgnotification.notifications.template.PicPrice;
import com.taobao.tao.log.TLog;
import com.taobao.taobao.R;
import tb.kge;
import tb.msq;
import tb.msx;
import tb.msz;

/* loaded from: classes7.dex */
public class PicPriceNotification extends msq {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "PicPriceNotification";
    private Notification mNotification;
    private int nNotifyId;

    static {
        kge.a(-505576249);
    }

    public static /* synthetic */ Object ipc$super(PicPriceNotification picPriceNotification, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ int access$000(PicPriceNotification picPriceNotification) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("c4935576", new Object[]{picPriceNotification})).intValue() : picPriceNotification.nNotifyId;
    }

    public static /* synthetic */ Notification access$100(PicPriceNotification picPriceNotification) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Notification) ipChange.ipc$dispatch("51aee66a", new Object[]{picPriceNotification}) : picPriceNotification.mNotification;
    }

    public PicPriceNotification(Context context, MsgNotficationDTO msgNotficationDTO, Bundle bundle, Intent intent) {
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
        PicPrice picPrice = (PicPrice) JSON.parseObject(this.mMsgData.sceneTemplateData.toString(), PicPrice.class);
        RemoteViews remoteViews = new RemoteViews(packageName, R.layout.personal_pic_price);
        msx.a a2 = msx.a();
        if (a2 != null && !StringUtils.isEmpty(a2.a())) {
            String a3 = a2.a();
            if (a.ATOM_EXT_white.equals(a3)) {
                remoteViews.setViewVisibility(R.id.notificationWhiteBackground, 0);
            } else if (a.ATOM_EXT_black.equals(a3)) {
                remoteViews.setViewVisibility(R.id.notificationBlackBackground, 0);
            } else {
                remoteViews.setViewVisibility(R.id.notificationBlackBackground, 8);
                remoteViews.setViewVisibility(R.id.notificationWhiteBackground, 8);
            }
        } else {
            remoteViews.setViewVisibility(R.id.notificationBlackBackground, 8);
            remoteViews.setViewVisibility(R.id.notificationWhiteBackground, 8);
        }
        if (a2 != null && !StringUtils.isEmpty(a2.c())) {
            remoteViews.setTextColor(R.id.NotificationTextLeft, Color.parseColor(a2.c()));
            remoteViews.setTextColor(R.id.NotificationTextCenter, Color.parseColor(a2.c()));
            remoteViews.setTextColor(R.id.NotificationTextRight, Color.parseColor(a2.c()));
        }
        remoteViews.setTextViewText(R.id.NotificationTextCenter, picPrice.desc);
        remoteViews.setTextViewText(R.id.NotificationPrice, picPrice.price);
        this.mNotification = this.mBuilder.build();
        this.mNotification.contentView = remoteViews;
        if (Build.VERSION.SDK_INT >= 16) {
            this.mNotification.bigContentView = remoteViews;
        }
        this.nNotifyId = i;
        if (this.mParam != null) {
            this.nNotifyId = this.mParam.getIntExtra("notifyId", i);
        }
        msz.a(mContext, picPrice.pic, R.id.notificationImage, R.drawable.tao_mag_icon, DensityUtil.dip2px(mContext, 53.0f), DensityUtil.dip2px(mContext, 53.0f), this.mNotification, new msz.b() { // from class: com.taobao.msgnotification.notifications.PicPriceNotification.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.msz.b
            public void a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    return;
                }
                msx.a a4 = msx.a();
                if (!BrandUtil.getInstance().shouldNotify() || (a4 != null && "0".equals(a4.b()))) {
                    TLog.loge(PicPriceNotification.TAG, "should not notify");
                } else {
                    g.a().a(PicPriceNotification.this.getMessageId(), PicPriceNotification.access$000(PicPriceNotification.this), PicPriceNotification.access$100(PicPriceNotification.this));
                }
                PicPriceNotification.this.reportNotify();
            }

            @Override // tb.msz.b
            public void b() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("57a83e9", new Object[]{this});
                } else {
                    PicPriceNotification.this.reportNotify();
                }
            }
        });
    }
}
