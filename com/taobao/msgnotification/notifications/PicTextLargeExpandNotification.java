package com.taobao.msgnotification.notifications;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.NotificationCompat;
import android.taobao.util.k;
import android.util.Log;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.notification.util.BrandUtil;
import com.taobao.message.notification.util.DensityUtil;
import com.taobao.msgnotification.g;
import com.taobao.msgnotification.h;
import com.taobao.msgnotification.mode.MsgNotficationDTO;
import com.taobao.msgnotification.notifications.template.PicText;
import com.taobao.tao.log.TLog;
import com.taobao.taobao.R;
import java.util.concurrent.atomic.AtomicInteger;
import tb.kge;
import tb.msq;
import tb.msx;
import tb.msz;

/* loaded from: classes7.dex */
public class PicTextLargeExpandNotification extends msq {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "PicTextNotification";
    private NotificationCompat.BigPictureStyle bigPictureStyle;
    private AtomicInteger finishCount;
    public int notifyId;
    private PicText picText;

    static {
        kge.a(-1921090682);
    }

    public static /* synthetic */ Object ipc$super(PicTextLargeExpandNotification picTextLargeExpandNotification, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ NotificationCompat.BigPictureStyle access$000(PicTextLargeExpandNotification picTextLargeExpandNotification) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (NotificationCompat.BigPictureStyle) ipChange.ipc$dispatch("9abef75a", new Object[]{picTextLargeExpandNotification}) : picTextLargeExpandNotification.bigPictureStyle;
    }

    public static /* synthetic */ void access$100(PicTextLargeExpandNotification picTextLargeExpandNotification) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43f6a5c3", new Object[]{picTextLargeExpandNotification});
        } else {
            picTextLargeExpandNotification.checkNotify();
        }
    }

    public PicTextLargeExpandNotification(Context context, MsgNotficationDTO msgNotficationDTO, Bundle bundle, Intent intent) {
        super(context, msgNotficationDTO, bundle, intent);
        this.finishCount = new AtomicInteger(0);
    }

    @Override // com.taobao.message.notification.system.base.IOldAgooNotification
    public void performNotify() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b98d0d91", new Object[]{this});
        } else if (this.mMsgData == null || this.mMsgData.sceneTemplateData == null) {
            k.a(TAG, " show error,msgData==null");
        } else {
            try {
                int nextInt = notificationRandom.nextInt();
                this.picText = (PicText) JSON.parseObject(this.mMsgData.sceneTemplateData.toString(), PicText.class);
                this.bigPictureStyle = new NotificationCompat.BigPictureStyle();
                this.bigPictureStyle.setBigContentTitle(this.picText.getTitle()).setSummaryText(this.picText.getSubTitle());
                this.mBuilder = buildDefaultNotifyBuilder(this.mBuilder);
                this.mBuilder.setStyle(this.bigPictureStyle);
                setVibrateSound(this.mBuilder, this.mParam);
                if (this.mParam != null) {
                    nextInt = this.mParam.getIntExtra("notifyContentIntentRequestCode", nextInt);
                }
                h.a(this.mBuilder, mContext, this.mExtras, nextInt, this.mParam);
                String packageName = mContext.getPackageName();
                this.notifyId = nextInt;
                if (this.mParam != null) {
                    this.notifyId = this.mParam.getIntExtra("notifyId", nextInt);
                }
                String str = this.picText.bigIcon;
                if (this.picText != null && str != null) {
                    msz.a(mContext, str, DensityUtil.dip2px(mContext, 53.0f), DensityUtil.dip2px(mContext, 53.0f), this.mBuilder, packageName, new msz.a() { // from class: com.taobao.msgnotification.notifications.PicTextLargeExpandNotification.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // tb.msz.a
                        public void onSucceed(Bitmap bitmap, NotificationCompat.Builder builder, String str2) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("818f7a4", new Object[]{this, bitmap, builder, str2});
                                return;
                            }
                            PicTextLargeExpandNotification.access$000(PicTextLargeExpandNotification.this).bigLargeIcon(bitmap);
                            builder.setLargeIcon(bitmap);
                            PicTextLargeExpandNotification.access$100(PicTextLargeExpandNotification.this);
                        }

                        @Override // tb.msz.a
                        public void onFailed(NotificationCompat.Builder builder) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("86389f7b", new Object[]{this, builder});
                                return;
                            }
                            PicTextLargeExpandNotification.access$000(PicTextLargeExpandNotification.this).bigLargeIcon(null);
                            PicTextLargeExpandNotification.access$100(PicTextLargeExpandNotification.this);
                        }
                    });
                    msz.a(mContext, this.picText.widePic, DensityUtil.dip2px(mContext, 351.0f), DensityUtil.dip2px(mContext, 256.0f), this.mBuilder, packageName, new msz.a() { // from class: com.taobao.msgnotification.notifications.PicTextLargeExpandNotification.2
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // tb.msz.a
                        public void onSucceed(Bitmap bitmap, NotificationCompat.Builder builder, String str2) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("818f7a4", new Object[]{this, bitmap, builder, str2});
                                return;
                            }
                            PicTextLargeExpandNotification.access$000(PicTextLargeExpandNotification.this).bigPicture(bitmap);
                            PicTextLargeExpandNotification.access$100(PicTextLargeExpandNotification.this);
                        }

                        @Override // tb.msz.a
                        public void onFailed(NotificationCompat.Builder builder) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("86389f7b", new Object[]{this, builder});
                                return;
                            }
                            PicTextLargeExpandNotification.access$000(PicTextLargeExpandNotification.this).bigPicture(null);
                            PicTextLargeExpandNotification.access$100(PicTextLargeExpandNotification.this);
                        }
                    });
                    return;
                }
                k.a(TAG, " show error,picText maybe null");
            } catch (Throwable th) {
                k.a(TAG, "throw error,e=" + th.toString());
                TLog.loge(TAG, Log.getStackTraceString(th));
            }
        }
    }

    public NotificationCompat.Builder buildDefaultNotifyBuilder(NotificationCompat.Builder builder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (NotificationCompat.Builder) ipChange.ipc$dispatch("6e4ada86", new Object[]{this, builder});
        }
        if (builder != null) {
            builder.setContentTitle(this.picText.getTitle()).setContentText(this.picText.getSubTitle()).setWhen(System.currentTimeMillis()).setDefaults(-1).setPriority(0).setAutoCancel(true);
            if (Build.VERSION.SDK_INT < 21) {
                builder.setSmallIcon(R.drawable.notify_small_icon);
            } else {
                builder.setSmallIcon(R.drawable.tao_mag_icon_white);
            }
        }
        return builder;
    }

    private void checkNotify() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23f6678", new Object[]{this});
            return;
        }
        try {
            this.finishCount.addAndGet(1);
            if (this.finishCount.get() != 2) {
                return;
            }
            Notification build = this.mBuilder.build();
            msx.a a2 = msx.a();
            if (BrandUtil.getInstance().shouldNotify() && (a2 == null || !"0".equals(a2.b()))) {
                g.a().a(getMessageId(), this.notifyId, build);
                reportNotify();
            }
            TLog.loge(TAG, "should not notify");
            reportNotify();
        } catch (Exception e) {
            k.a(TAG, e.toString());
        }
    }
}
