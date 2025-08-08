package tb;

import android.app.NotificationChannel;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import mtopsdk.common.util.StringUtils;
import android.widget.RemoteViews;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.notification.system.base.BasicLocalPush;
import com.taobao.message.notification.system.base.ILocalPush;
import com.taobao.message.notification.util.BrandUtil;
import com.taobao.msgnotification.mode.MsgNotficationDTO;
import com.taobao.phenix.intf.b;
import com.taobao.phenix.intf.event.FailPhenixEvent;
import com.taobao.phenix.intf.event.SuccPhenixEvent;
import com.taobao.phenix.intf.event.a;
import com.taobao.tao.log.TLog;
import com.taobao.taobao.R;
import java.text.SimpleDateFormat;

/* loaded from: classes7.dex */
public class mst extends mss {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1590970356);
    }

    public static /* synthetic */ Object ipc$super(mst mstVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1669199577:
                super.setTitle((String) objArr[0]);
                return null;
            case -1432119014:
                return new Integer(super.genPushRequestId());
            case -1304581520:
                return super.getNotificationChannel();
            case -893005340:
                return new Integer(super.getImportance());
            case -505501570:
                super.setUrl((String) objArr[0]);
                return null;
            case -423164667:
                return super.getCategory();
            case -14167635:
                return super.getMessageId();
            case 1161759794:
                return new Boolean(super.onBeforeNotify());
            case 1176236886:
                return new Integer(super.getMergeType());
            case 1386857736:
                super.setContent((String) objArr[0]);
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    @Override // tb.mss, com.taobao.message.notification.system.base.BasicLocalPush
    public /* bridge */ /* synthetic */ int genPushRequestId() {
        return super.genPushRequestId();
    }

    @Override // tb.mss, com.taobao.message.notification.system.base.BasicLocalPush, com.taobao.message.notification.system.base.ILocalPush
    public /* bridge */ /* synthetic */ String getCategory() {
        return super.getCategory();
    }

    @Override // tb.mss, com.taobao.message.notification.system.base.BasicLocalPush, com.taobao.message.notification.system.base.ILocalPush
    public /* bridge */ /* synthetic */ int getImportance() {
        return super.getImportance();
    }

    @Override // tb.mss, com.taobao.message.notification.system.base.IOldAgooNotification
    public /* bridge */ /* synthetic */ int getMergeType() {
        return super.getMergeType();
    }

    @Override // tb.mss, com.taobao.message.notification.system.base.IOldAgooNotification
    public /* bridge */ /* synthetic */ String getMessageId() {
        return super.getMessageId();
    }

    @Override // tb.mss, tb.msr, com.taobao.message.notification.system.base.BasicLocalPush, com.taobao.message.notification.system.base.ILocalPush
    public /* bridge */ /* synthetic */ NotificationChannel getNotificationChannel() {
        return super.getNotificationChannel();
    }

    @Override // tb.mss, com.taobao.message.notification.system.base.IOldAgooNotification
    public /* bridge */ /* synthetic */ void setContent(String str) {
        super.setContent(str);
    }

    @Override // tb.mss, com.taobao.message.notification.system.base.IOldAgooNotification
    public /* bridge */ /* synthetic */ void setTitle(String str) {
        super.setTitle(str);
    }

    @Override // tb.mss, com.taobao.message.notification.system.base.IOldAgooNotification
    public /* bridge */ /* synthetic */ void setUrl(String str) {
        super.setUrl(str);
    }

    public mst(Context context, MsgNotficationDTO msgNotficationDTO, Bundle bundle, Intent intent) {
        super(context, msgNotficationDTO, bundle, intent);
    }

    @Override // com.taobao.message.notification.system.base.BasicLocalPush
    public boolean onBeforeNotify() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("453f0c32", new Object[]{this})).booleanValue();
        }
        super.onBeforeNotify();
        return this.b != null;
    }

    private static String a(long j) {
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

    @Override // com.taobao.message.notification.system.base.BasicLocalPush, com.taobao.message.notification.system.base.ILocalPush
    public ILocalPush.RemoteViewsHolder getCustomView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ILocalPush.RemoteViewsHolder) ipChange.ipc$dispatch("f880f0ff", new Object[]{this});
        }
        if (this.b.view_type != 1) {
            return null;
        }
        final RemoteViews a2 = a(this.b, this.f31226a.getPackageName());
        return new ILocalPush.RemoteViewsHolder() { // from class: tb.mst.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.message.notification.system.base.ILocalPush.RemoteViewsHolder
            public void fetch(final ILocalPush.RemoteViewListener remoteViewListener) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f0bc53e0", new Object[]{this, remoteViewListener});
                } else if (mst.this.b.isMultiContent) {
                } else {
                    b.h().a(mst.this.b.personalImgUrl).succListener(new a<SuccPhenixEvent>() { // from class: tb.mst.1.2
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // com.taobao.phenix.intf.event.a
                        public /* synthetic */ boolean onHappen(SuccPhenixEvent succPhenixEvent) {
                            IpChange ipChange3 = $ipChange;
                            return ipChange3 instanceof IpChange ? ((Boolean) ipChange3.ipc$dispatch("d1090e38", new Object[]{this, succPhenixEvent})).booleanValue() : a(succPhenixEvent);
                        }

                        public boolean a(SuccPhenixEvent succPhenixEvent) {
                            Bitmap bitmap;
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                return ((Boolean) ipChange3.ipc$dispatch("3b4dd374", new Object[]{this, succPhenixEvent})).booleanValue();
                            }
                            if (succPhenixEvent.getDrawable() != null && !succPhenixEvent.isIntermediate() && (bitmap = succPhenixEvent.getDrawable().getBitmap()) != null) {
                                a2.setImageViewBitmap(R.id.notificationImage, bitmap);
                            }
                            remoteViewListener.on(a2);
                            return true;
                        }
                    }).failListener(new a<FailPhenixEvent>() { // from class: tb.mst.1.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // com.taobao.phenix.intf.event.a
                        public /* synthetic */ boolean onHappen(FailPhenixEvent failPhenixEvent) {
                            IpChange ipChange3 = $ipChange;
                            return ipChange3 instanceof IpChange ? ((Boolean) ipChange3.ipc$dispatch("d1090e38", new Object[]{this, failPhenixEvent})).booleanValue() : a(failPhenixEvent);
                        }

                        public boolean a(FailPhenixEvent failPhenixEvent) {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                return ((Boolean) ipChange3.ipc$dispatch("64c1ef50", new Object[]{this, failPhenixEvent})).booleanValue();
                            }
                            TLog.loge(BasicLocalPush.TAG, "头像加载失败:" + failPhenixEvent.getResultCode());
                            a2.setImageViewResource(R.id.notificationImage, R.drawable.tao_mag_icon);
                            remoteViewListener.on(a2);
                            return false;
                        }
                    }).fetch();
                }
            }
        };
    }

    private static RemoteViews a(MsgNotficationDTO msgNotficationDTO, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RemoteViews) ipChange.ipc$dispatch("dac08767", new Object[]{msgNotficationDTO, str});
        }
        RemoteViews remoteViews = null;
        if (msgNotficationDTO.isMultiContent) {
            remoteViews = new RemoteViews(str, R.layout.personal_msg_multi);
            String[] split = msgNotficationDTO.text.split("\\n");
            if (split != null && split.length > 1) {
                remoteViews.setViewVisibility(R.id.multi_content, 0);
                remoteViews.setTextViewText(R.id.multiText1, split[0]);
                if (split.length >= 2) {
                    remoteViews.setTextViewText(R.id.multiText2, split[1]);
                }
                if (split.length >= 3) {
                    remoteViews.setTextViewText(R.id.multiText3, split[2]);
                }
            }
        }
        if (remoteViews == null) {
            remoteViews = new RemoteViews(str, R.layout.personal_msg_default);
        }
        String str2 = "contentView end...getPackageName()=" + str;
        String bgColor = BrandUtil.getInstance().getBgColor();
        if (!StringUtils.isEmpty(bgColor) && !msgNotficationDTO.isMultiContent) {
            if (com.taobao.android.weex_framework.util.a.ATOM_EXT_white.equals(bgColor)) {
                remoteViews.setViewVisibility(R.id.notificationWhiteBackground, 0);
            } else if (com.taobao.android.weex_framework.util.a.ATOM_EXT_black.equals(bgColor)) {
                remoteViews.setViewVisibility(R.id.notificationBlackBackground, 0);
            } else {
                remoteViews.setViewVisibility(R.id.notificationBlackBackground, 8);
                remoteViews.setViewVisibility(R.id.notificationWhiteBackground, 8);
            }
        } else if (!msgNotficationDTO.isMultiContent) {
            remoteViews.setViewVisibility(R.id.notificationBlackBackground, 8);
            remoteViews.setViewVisibility(R.id.notificationWhiteBackground, 8);
        }
        remoteViews.setTextViewText(R.id.notificationTitle, msgNotficationDTO.title);
        if (!StringUtils.isEmpty(BrandUtil.getInstance().getTitleColor())) {
            remoteViews.setTextColor(R.id.notificationTitle, Color.parseColor(BrandUtil.getInstance().getTitleColor()));
        }
        remoteViews.setTextViewText(R.id.notificationText, msgNotficationDTO.text);
        if (!StringUtils.isEmpty(BrandUtil.getInstance().getContentColor())) {
            remoteViews.setTextColor(R.id.notificationText, Color.parseColor(BrandUtil.getInstance().getContentColor()));
        }
        String a2 = a(System.currentTimeMillis());
        if (!StringUtils.isEmpty(a2)) {
            remoteViews.setTextViewText(R.id.custom_time, a2.split("-")[3]);
            if (!StringUtils.isEmpty(BrandUtil.getInstance().getTitleColor())) {
                remoteViews.setTextColor(R.id.custom_time, Color.parseColor(BrandUtil.getInstance().getTitleColor()));
            }
        }
        return remoteViews;
    }

    @Override // com.taobao.message.notification.system.base.BasicLocalPush, com.taobao.message.notification.system.base.ILocalPush
    public ILocalPush.Content getPushContent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ILocalPush.Content) ipChange.ipc$dispatch("efefee7d", new Object[]{this});
        }
        return new ILocalPush.Content("", "", this.b == null ? "" : this.b.ticker);
    }
}
