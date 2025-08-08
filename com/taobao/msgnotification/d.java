package com.taobao.msgnotification;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.NotificationCompat;
import mtopsdk.common.util.StringUtils;
import android.widget.RemoteViews;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.notification.util.BrandUtil;
import com.taobao.msgnotification.mode.MsgNotficationDTO;
import com.taobao.taobao.R;
import java.text.SimpleDateFormat;
import tb.kge;
import tb.msp;
import tb.mta;

/* loaded from: classes7.dex */
public class d extends msp {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "AgCustomNotification";
    private int b;

    static {
        kge.a(-683007528);
    }

    public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public d(int i, Context context, MsgNotficationDTO msgNotficationDTO, Bundle bundle, Intent intent) {
        super(context, msgNotficationDTO, bundle, intent);
        this.b = 1;
        this.b = i;
    }

    @Override // tb.msp
    public int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue();
        }
        int i = this.b;
        return (i == 1 || i != 2) ? 100 : 200;
    }

    @Override // tb.msp
    public NotificationCompat.Builder a(MsgNotficationDTO msgNotficationDTO, NotificationCompat.Builder builder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (NotificationCompat.Builder) ipChange.ipc$dispatch("6e35bef5", new Object[]{this, msgNotficationDTO, builder});
        }
        if (builder != null) {
            builder.setContentTitle(msgNotficationDTO.title).setContentText(msgNotficationDTO.text).setTicker(msgNotficationDTO.ticker).setWhen(System.currentTimeMillis()).setAutoCancel(true);
            if (Build.VERSION.SDK_INT < 21) {
                builder.setSmallIcon(R.drawable.notify_small_icon, 0);
            } else {
                builder.setSmallIcon(R.drawable.tao_mag_icon_white, 0);
            }
        }
        return builder;
    }

    private Notification a(MsgNotficationDTO msgNotficationDTO, NotificationCompat.Builder builder, String str) {
        RemoteViews remoteViews;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Notification) ipChange.ipc$dispatch("ec7f8efb", new Object[]{this, msgNotficationDTO, builder, str});
        }
        int i = this.b;
        if (i == 1) {
            remoteViews = new RemoteViews(str, R.layout.personal_msg_custom);
            remoteViews.setTextViewText(R.id.title, msgNotficationDTO.title);
            if (!StringUtils.isEmpty(BrandUtil.getInstance().getTitleColor())) {
                remoteViews.setTextColor(R.id.title, Color.parseColor(BrandUtil.getInstance().getTitleColor()));
            }
            remoteViews.setTextViewText(R.id.content, msgNotficationDTO.text);
            if (!StringUtils.isEmpty(BrandUtil.getInstance().getContentColor())) {
                remoteViews.setTextColor(R.id.content, Color.parseColor(BrandUtil.getInstance().getContentColor()));
            }
        } else if (i == 2) {
            remoteViews = new RemoteViews(str, R.layout.personal_msg_custom_pic);
        } else {
            remoteViews = new RemoteViews(str, R.layout.personal_msg_custom);
            remoteViews.setTextViewText(R.id.title, msgNotficationDTO.title);
            if (!StringUtils.isEmpty(BrandUtil.getInstance().getTitleColor())) {
                remoteViews.setTextColor(R.id.title, Color.parseColor(BrandUtil.getInstance().getTitleColor()));
            }
            remoteViews.setTextViewText(R.id.content, msgNotficationDTO.text);
            if (!StringUtils.isEmpty(BrandUtil.getInstance().getContentColor())) {
                remoteViews.setTextColor(R.id.content, Color.parseColor(BrandUtil.getInstance().getContentColor()));
            }
        }
        RemoteViews remoteViews2 = new RemoteViews(str, R.layout.personal_msg_normal);
        remoteViews2.setTextViewText(R.id.normalTitle, msgNotficationDTO.title);
        if (!StringUtils.isEmpty(BrandUtil.getInstance().getTitleColor())) {
            remoteViews2.setTextColor(R.id.normalTitle, Color.parseColor(BrandUtil.getInstance().getTitleColor()));
        }
        remoteViews2.setTextViewText(R.id.normalContent, msgNotficationDTO.text);
        if (!StringUtils.isEmpty(BrandUtil.getInstance().getContentColor())) {
            remoteViews2.setTextColor(R.id.normalContent, Color.parseColor(BrandUtil.getInstance().getContentColor()));
        }
        remoteViews2.setImageViewResource(R.id.normalSmallImageIcon, R.drawable.notify_small_icon);
        String a2 = a(System.currentTimeMillis());
        if (!StringUtils.isEmpty(a2)) {
            remoteViews2.setTextViewText(R.id.normalTime, a2.split("-")[3]);
            if (!StringUtils.isEmpty(BrandUtil.getInstance().getTitleColor())) {
                remoteViews2.setTextColor(R.id.normalTime, Color.parseColor(BrandUtil.getInstance().getTitleColor()));
            }
        }
        Notification build = builder.build();
        build.contentView = remoteViews2;
        if (Build.VERSION.SDK_INT >= 16) {
            build.bigContentView = remoteViews;
        }
        return build;
    }

    @Override // tb.msp
    public void a(Bitmap bitmap, NotificationCompat.Builder builder, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45510922", new Object[]{this, bitmap, builder, str});
            return;
        }
        builder.setLargeIcon(bitmap);
        Notification a2 = a(this.mMsgData, builder, str);
        if (a2 == null) {
            return;
        }
        a2.contentView.setImageViewBitmap(R.id.normalBigImageIcon, bitmap);
        if (Build.VERSION.SDK_INT >= 16) {
            a2.bigContentView.setImageViewBitmap(R.id.notificationImage, bitmap);
        }
        if (BrandUtil.getInstance().shouldNotify()) {
            mta.a("AgBigPictureNotification", "onGetImageSucceed");
            g.a().a(getMessageId(), this.f31225a, a2);
        }
        reportNotify();
    }

    @Override // tb.msp
    public void a(NotificationCompat.Builder builder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ceef1c76", new Object[]{this, builder});
            return;
        }
        Notification build = builder.build();
        build.contentView.setViewVisibility(R.id.normalSmallImageIcon, 8);
        if (BrandUtil.getInstance().shouldNotify()) {
            mta.a(TAG, "onGetImageFailed");
            g.a().a(getMessageId(), this.f31225a, build);
        }
        reportNotify();
    }

    private static final String a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("780680c4", new Object[]{new Long(j)});
        }
        try {
            return new SimpleDateFormat("yyyy-MM-dd-HH:mm").format(Long.valueOf(j));
        } catch (Throwable unused) {
            return "";
        }
    }
}
