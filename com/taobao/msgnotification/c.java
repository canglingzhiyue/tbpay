package com.taobao.msgnotification;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.NotificationCompat;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.notification.util.BrandUtil;
import com.taobao.msgnotification.mode.MsgNotficationDTO;
import com.taobao.taobao.R;
import tb.kge;
import tb.msp;
import tb.mta;

/* loaded from: classes7.dex */
public class c extends msp {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1297835205);
    }

    public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.msp
    public int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue();
        }
        return 200;
    }

    public c(Context context, MsgNotficationDTO msgNotficationDTO, Bundle bundle, Intent intent) {
        super(context, msgNotficationDTO, bundle, intent);
    }

    @Override // tb.msp
    public NotificationCompat.Builder a(MsgNotficationDTO msgNotficationDTO, NotificationCompat.Builder builder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (NotificationCompat.Builder) ipChange.ipc$dispatch("6e35bef5", new Object[]{this, msgNotficationDTO, builder});
        }
        if (builder != null) {
            builder.setContentTitle(msgNotficationDTO.title).setContentText(msgNotficationDTO.text).setTicker(msgNotficationDTO.ticker).setWhen(System.currentTimeMillis()).setDefaults(-1).setAutoCancel(true);
            if (Build.VERSION.SDK_INT < 21) {
                builder.setSmallIcon(R.drawable.notify_small_icon);
            } else {
                builder.setSmallIcon(R.drawable.tao_mag_icon_white);
            }
        }
        return builder;
    }

    private Notification a(MsgNotficationDTO msgNotficationDTO, NotificationCompat.Builder builder, Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Notification) ipChange.ipc$dispatch("e50cd685", new Object[]{this, msgNotficationDTO, builder, bitmap});
        }
        NotificationCompat.BigPictureStyle bigPictureStyle = new NotificationCompat.BigPictureStyle();
        bigPictureStyle.bigLargeIcon(bitmap).bigPicture(bitmap).setBigContentTitle(msgNotficationDTO.title).setSummaryText(msgNotficationDTO.text);
        builder.setStyle(bigPictureStyle);
        return builder.build();
    }

    @Override // tb.msp
    public void a(Bitmap bitmap, NotificationCompat.Builder builder, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45510922", new Object[]{this, bitmap, builder, str});
            return;
        }
        builder.setLargeIcon(bitmap);
        Notification a2 = a(this.mMsgData, builder, bitmap);
        if (bitmap == null) {
            return;
        }
        if (BrandUtil.getInstance().shouldNotify()) {
            mta.a(d.TAG, "onGetImageSucceed");
            g.a().a(getMessageId(), this.f31225a, a2);
        }
        reportNotify();
    }

    @Override // tb.msp
    public void a(NotificationCompat.Builder builder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ceef1c76", new Object[]{this, builder});
        } else {
            reportNotify();
        }
    }
}
