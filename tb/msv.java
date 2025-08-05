package tb;

import android.app.NotificationChannel;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.taobao.util.k;
import android.util.Pair;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.notification.system.base.ILocalPush;
import com.taobao.msgnotification.mode.MsgNotficationDTO;
import com.taobao.msgnotification.notifications.template.PicText;
import tb.msx;

/* loaded from: classes7.dex */
public class msv extends mss {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private PicText e;

    static {
        kge.a(1480682599);
    }

    public static /* synthetic */ Object ipc$super(msv msvVar, String str, Object... objArr) {
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
            case -269488515:
                return super.getPushContent();
            case -14167635:
                return super.getMessageId();
            case 1161759794:
                return new Boolean(super.onBeforeNotify());
            case 1176236886:
                return new Integer(super.getMergeType());
            case 1386857736:
                super.setContent((String) objArr[0]);
                return null;
            case 1458578370:
                return new Boolean(super.isEnabled());
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    @Override // tb.msr, com.taobao.message.notification.system.base.BasicLocalPush, com.taobao.message.notification.system.base.ILocalPush
    public Bitmap getLargeIcon() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("6c36bd03", new Object[]{this});
        }
        return null;
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

    public msv(Context context, MsgNotficationDTO msgNotficationDTO, Bundle bundle, Intent intent) {
        super(context, msgNotficationDTO, bundle, intent);
        if (this.b == null || this.b.sceneTemplateData == null) {
            k.a("PicTextNotification", " show error,msgData==null");
        } else {
            this.e = (PicText) JSON.parseObject(this.b.sceneTemplateData.toString(), PicText.class);
        }
    }

    @Override // com.taobao.message.notification.system.base.BasicLocalPush, com.taobao.message.notification.system.base.ILocalPush
    public ILocalPush.Content getPushContent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ILocalPush.Content) ipChange.ipc$dispatch("efefee7d", new Object[]{this});
        }
        PicText picText = this.e;
        if (picText == null) {
            return super.getPushContent();
        }
        return new ILocalPush.Content(picText.getTitle(), this.e.getSubTitle());
    }

    @Override // com.taobao.message.notification.system.base.BasicLocalPush
    public boolean onBeforeNotify() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("453f0c32", new Object[]{this})).booleanValue();
        }
        if (this.b == null || this.b.sceneTemplateData == null || this.e == null) {
            k.a("PicTextNotification", " show error,msgData==null");
            return false;
        }
        return super.onBeforeNotify();
    }

    @Override // com.taobao.message.notification.system.base.BasicLocalPush, com.taobao.message.notification.system.base.ILocalPush
    public Pair<String, nia> getLargeIconURL() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("790c3d42", new Object[]{this});
        }
        String str = this.e.bigIcon;
        if (this.e == null || str == null) {
            k.a("PicTextNotification", " show error,picText maybe null");
            return null;
        }
        return Pair.create(str, null);
    }

    @Override // tb.mss, com.taobao.message.notification.system.base.BasicLocalPush
    public boolean isEnabled() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56f023c2", new Object[]{this})).booleanValue();
        }
        msx.a a2 = msx.a();
        return (a2 == null || !"0".equals(a2.b())) && super.isEnabled();
    }
}
