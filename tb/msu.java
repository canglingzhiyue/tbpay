package tb;

import android.app.NotificationChannel;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.agoo.TaobaoConstants;
import com.taobao.message.notification.system.base.BasicLocalPush;
import com.taobao.message.notification.system.base.ILocalPush;
import com.taobao.message.notification.util.ChannelUtil;
import com.taobao.msgnotification.g;
import com.taobao.msgnotification.mode.MsgNotficationDTO;

/* loaded from: classes7.dex */
public class msu extends mss {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static PowerManager.WakeLock e;

    public static /* synthetic */ Object ipc$super(msu msuVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1865040893:
                super.onShow();
                return null;
            case -1432119014:
                return new Integer(super.genPushRequestId());
            case -1304581520:
                return super.getNotificationChannel();
            case -893005340:
                return new Integer(super.getImportance());
            case -423164667:
                return super.getCategory();
            case -269488515:
                return super.getPushContent();
            case -14167635:
                return super.getMessageId();
            case 1161759794:
                return new Boolean(super.onBeforeNotify());
            case 1176236886:
                return new Integer(super.getMergeType());
            case 1800760461:
                return new Boolean(super.isForegroundSupport());
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public static /* synthetic */ void a(msu msuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f51fe8e9", new Object[]{msuVar});
        } else {
            msuVar.a();
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

    static {
        kge.a(-1381445189);
        e = null;
    }

    public msu(Context context, MsgNotficationDTO msgNotficationDTO, Bundle bundle, Intent intent) {
        super(context, msgNotficationDTO, bundle, intent);
    }

    @Override // com.taobao.message.notification.system.base.BasicLocalPush
    public boolean onBeforeNotify() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("453f0c32", new Object[]{this})).booleanValue() : super.onBeforeNotify();
    }

    @Override // tb.mss, com.taobao.message.notification.system.base.BasicLocalPush
    public void onShow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90d5bc03", new Object[]{this});
            return;
        }
        super.onShow();
        if (this.b.popup != 1) {
            return;
        }
        a(5000L);
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: tb.msu.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    msu.a(msu.this);
                }
            }
        }, 10000L);
    }

    private void a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821975c", new Object[]{this, new Long(j)});
        } else if (e != null) {
        } else {
            PowerManager.WakeLock newWakeLock = g.a().c().newWakeLock(805306394, BasicLocalPush.TAG);
            e = newWakeLock;
            newWakeLock.acquire(j);
        }
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        PowerManager.WakeLock wakeLock = e;
        if (wakeLock == null || !wakeLock.isHeld()) {
            return;
        }
        e.release();
        e = null;
    }

    @Override // tb.mss, com.taobao.message.notification.system.base.IOldAgooNotification
    public void setTitle(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c820927", new Object[]{this, str});
        } else if (this.b == null) {
        } else {
            this.b.title = str;
        }
    }

    @Override // tb.mss, com.taobao.message.notification.system.base.IOldAgooNotification
    public void setContent(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52a9c508", new Object[]{this, str});
        } else if (this.b == null) {
        } else {
            this.b.text = str;
        }
    }

    @Override // com.taobao.message.notification.system.base.BasicLocalPush, com.taobao.message.notification.system.base.ILocalPush
    public ILocalPush.Content getPushContent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ILocalPush.Content) ipChange.ipc$dispatch("efefee7d", new Object[]{this});
        }
        if (this.b == null) {
            return super.getPushContent();
        }
        return new ILocalPush.Content(this.b.title, this.b.text, this.b.ticker);
    }

    @Override // tb.mss, com.taobao.message.notification.system.base.IOldAgooNotification
    public void setUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1dea87e", new Object[]{this, str});
        } else {
            this.c.putString(TaobaoConstants.MESSAGE_URL, str);
        }
    }

    @Override // com.taobao.message.notification.system.base.BasicLocalPush
    public boolean isForegroundSupport() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6b556c8d", new Object[]{this})).booleanValue();
        }
        if (this.b == null) {
            return super.isForegroundSupport();
        }
        return !"imba".equals(ChannelUtil.convertChannelType(this.b.bizType));
    }
}
