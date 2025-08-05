package tb;

import android.app.Notification;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.support.v4.app.NotificationCompat;
import android.taobao.util.k;
import android.text.TextUtils;
import android.util.Log;
import android.widget.RemoteViews;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.taobao.android.base.Versions;
import com.taobao.message.notification.util.DensityUtil;
import com.taobao.msgnotification.mode.MsgNotficationDTO;
import com.taobao.phenix.intf.event.FailPhenixEvent;
import com.taobao.phenix.intf.event.SuccPhenixEvent;
import com.taobao.tao.image.ImageStrategyConfig;
import com.taobao.tao.log.TLog;
import com.taobao.tao.util.ImageStrategyDecider;

/* loaded from: classes7.dex */
public final class msz {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static ImageStrategyConfig f31233a;

    /* loaded from: classes7.dex */
    public interface a {
        void onFailed(NotificationCompat.Builder builder);

        void onSucceed(Bitmap bitmap, NotificationCompat.Builder builder, String str);
    }

    /* loaded from: classes7.dex */
    public interface b {
        void a();

        void b();
    }

    static {
        kge.a(1257823191);
        f31233a = ImageStrategyConfig.a(RemoteMessageConst.NOTIFICATION, 7201).a();
    }

    public static void a(Context context, MsgNotficationDTO msgNotficationDTO, int i, final NotificationCompat.Builder builder, final String str, final a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68c3e163", new Object[]{context, msgNotficationDTO, new Integer(i), builder, str, aVar});
        } else if (aVar == null) {
            k.a("ImageTools", "getBitmapByUrl listener is null");
        } else if (TextUtils.isEmpty(msgNotficationDTO.personalImgUrl) || i <= 0) {
            aVar.onFailed(builder);
        } else {
            float f = i;
            final String decideUrl = ImageStrategyDecider.decideUrl(msgNotficationDTO.personalImgUrl, Integer.valueOf(DensityUtil.dip2px(context, f)), Integer.valueOf(DensityUtil.dip2px(context, f)), f31233a);
            String str2 = "getBitmapByUrl decideUrl=" + decideUrl;
            com.taobao.phenix.intf.b.h().a(context).a(decideUrl).succListener(new com.taobao.phenix.intf.event.a<SuccPhenixEvent>() { // from class: tb.msz.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.phenix.intf.event.a
                public /* synthetic */ boolean onHappen(SuccPhenixEvent succPhenixEvent) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("d1090e38", new Object[]{this, succPhenixEvent})).booleanValue() : a(succPhenixEvent);
                }

                public boolean a(SuccPhenixEvent succPhenixEvent) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("3b4dd374", new Object[]{this, succPhenixEvent})).booleanValue();
                    }
                    if (succPhenixEvent.getDrawable() != null && succPhenixEvent.getDrawable().getBitmap() != null) {
                        try {
                            Bitmap bitmap = succPhenixEvent.getDrawable().getBitmap();
                            if (bitmap != null) {
                                a.this.onSucceed(bitmap, builder, str);
                                if (Versions.isDebug()) {
                                    String str3 = "getBitmapByUrl decideUrl= " + decideUrl + " | bitmap size= " + (bitmap.getByteCount() / 1024) + " kb";
                                }
                            } else {
                                a.this.onFailed(builder);
                            }
                        } catch (Throwable th) {
                            k.a("ImageTools", "getBitmapByUrl error,e=" + th.toString());
                        }
                    }
                    return true;
                }
            }).failListener(new com.taobao.phenix.intf.event.a<FailPhenixEvent>() { // from class: tb.msz.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.phenix.intf.event.a
                public /* synthetic */ boolean onHappen(FailPhenixEvent failPhenixEvent) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("d1090e38", new Object[]{this, failPhenixEvent})).booleanValue() : a(failPhenixEvent);
                }

                public boolean a(FailPhenixEvent failPhenixEvent) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("64c1ef50", new Object[]{this, failPhenixEvent})).booleanValue();
                    }
                    a.this.onFailed(builder);
                    return false;
                }
            }).fetch();
        }
    }

    public static void a(Context context, String str, int i, int i2, final NotificationCompat.Builder builder, final String str2, final a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d088305d", new Object[]{context, str, new Integer(i), new Integer(i2), builder, str2, aVar});
        } else if (aVar == null) {
            k.a("ImageTools", "getBitmapByUrl listener is null");
        } else if (TextUtils.isEmpty(str) || i <= 0 || i2 <= 0) {
            aVar.onFailed(builder);
        } else {
            final String decideUrl = ImageStrategyDecider.decideUrl(str, Integer.valueOf(i), Integer.valueOf(i2), f31233a);
            String str3 = "getBitmapByUrl decideUrl=" + decideUrl;
            com.taobao.phenix.intf.b.h().a(context).a(decideUrl).succListener(new com.taobao.phenix.intf.event.a<SuccPhenixEvent>() { // from class: tb.msz.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.phenix.intf.event.a
                public /* synthetic */ boolean onHappen(SuccPhenixEvent succPhenixEvent) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("d1090e38", new Object[]{this, succPhenixEvent})).booleanValue() : a(succPhenixEvent);
                }

                public boolean a(SuccPhenixEvent succPhenixEvent) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("3b4dd374", new Object[]{this, succPhenixEvent})).booleanValue();
                    }
                    if (succPhenixEvent.getDrawable() != null && succPhenixEvent.getDrawable().getBitmap() != null) {
                        try {
                            Bitmap bitmap = succPhenixEvent.getDrawable().getBitmap();
                            if (bitmap != null) {
                                a.this.onSucceed(bitmap, builder, str2);
                                if (Versions.isDebug()) {
                                    String str4 = "getBitmapByUrl decideUrl= " + decideUrl + " | bitmap size= " + (bitmap.getByteCount() / 1024) + " kb";
                                }
                            } else {
                                a.this.onFailed(builder);
                            }
                        } catch (Throwable th) {
                            k.a("ImageTools", "getBitmapByUrl error,e=" + th.toString());
                        }
                    }
                    return true;
                }
            }).failListener(new com.taobao.phenix.intf.event.a<FailPhenixEvent>() { // from class: tb.msz.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.phenix.intf.event.a
                public /* synthetic */ boolean onHappen(FailPhenixEvent failPhenixEvent) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("d1090e38", new Object[]{this, failPhenixEvent})).booleanValue() : a(failPhenixEvent);
                }

                public boolean a(FailPhenixEvent failPhenixEvent) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("64c1ef50", new Object[]{this, failPhenixEvent})).booleanValue();
                    }
                    a.this.onFailed(builder);
                    return false;
                }
            }).fetch();
        }
    }

    public static void a(Context context, String str, final int i, final int i2, int i3, int i4, final Notification notification, final b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4fdcc0be", new Object[]{context, str, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), notification, bVar});
        } else if (TextUtils.isEmpty(str)) {
            RemoteViews remoteViews = notification.contentView;
            remoteViews.setImageViewResource(i, i2);
            notification.contentView = remoteViews;
            if (bVar == null) {
                return;
            }
            bVar.b();
        } else {
            String decideUrl = ImageStrategyDecider.decideUrl(str, Integer.valueOf(i3), Integer.valueOf(i4), f31233a);
            String str2 = "updateNotifyIconByUrl decideUrl=" + decideUrl;
            com.taobao.phenix.intf.b.h().a(context).a(decideUrl).succListener(new com.taobao.phenix.intf.event.a<SuccPhenixEvent>() { // from class: tb.msz.6
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.phenix.intf.event.a
                public /* synthetic */ boolean onHappen(SuccPhenixEvent succPhenixEvent) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("d1090e38", new Object[]{this, succPhenixEvent})).booleanValue() : a(succPhenixEvent);
                }

                public boolean a(SuccPhenixEvent succPhenixEvent) {
                    RemoteViews remoteViews2;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("3b4dd374", new Object[]{this, succPhenixEvent})).booleanValue();
                    }
                    if (succPhenixEvent.getDrawable() != null && succPhenixEvent.getDrawable().getBitmap() != null) {
                        try {
                            Bitmap bitmap = succPhenixEvent.getDrawable().getBitmap();
                            if (bitmap != null) {
                                remoteViews2 = notification.contentView;
                                remoteViews2.setImageViewBitmap(i, bitmap);
                                if (Build.VERSION.SDK_INT >= 16) {
                                    if (notification.bigContentView != null) {
                                        notification.largeIcon = null;
                                    }
                                    notification.bigContentView.setImageViewBitmap(i, bitmap);
                                }
                                remoteViews2.setViewVisibility(i, 0);
                            } else {
                                remoteViews2 = notification.contentView;
                                remoteViews2.setImageViewResource(i, i2);
                            }
                            notification.contentView = remoteViews2;
                            if (bVar != null) {
                                bVar.a();
                            }
                        } catch (Throwable th) {
                            k.a("ImageTools", "updateNotifyIconByUrl error,e=" + th.toString());
                            TLog.loge("ImageTools", Log.getStackTraceString(th));
                        }
                    }
                    return true;
                }
            }).failListener(new com.taobao.phenix.intf.event.a<FailPhenixEvent>() { // from class: tb.msz.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.phenix.intf.event.a
                public /* synthetic */ boolean onHappen(FailPhenixEvent failPhenixEvent) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("d1090e38", new Object[]{this, failPhenixEvent})).booleanValue() : a(failPhenixEvent);
                }

                public boolean a(FailPhenixEvent failPhenixEvent) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("64c1ef50", new Object[]{this, failPhenixEvent})).booleanValue();
                    }
                    try {
                        RemoteViews remoteViews2 = notification.contentView;
                        remoteViews2.setImageViewResource(i, i2);
                        notification.contentView = remoteViews2;
                        if (bVar != null) {
                            bVar.b();
                        }
                    } catch (Exception e) {
                        k.a("ImageTools", "updateNotifyIconByUrl error,e=" + e.toString());
                        TLog.loge("ImageTools", Log.getStackTraceString(e));
                    }
                    return false;
                }
            }).fetch();
        }
    }
}
