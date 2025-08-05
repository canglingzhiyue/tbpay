package tb;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v4.app.NotificationCompat;
import android.taobao.util.k;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.msgnotification.h;
import com.taobao.msgnotification.mode.MsgNotficationDTO;
import com.taobao.tao.log.TLog;
import tb.msz;

/* loaded from: classes7.dex */
public abstract class msp extends msq implements msz.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public int f31225a;

    static {
        kge.a(1381071315);
        kge.a(1635356932);
    }

    public abstract int a();

    public abstract NotificationCompat.Builder a(MsgNotficationDTO msgNotficationDTO, NotificationCompat.Builder builder);

    public abstract void a(Bitmap bitmap, NotificationCompat.Builder builder, String str);

    public abstract void a(NotificationCompat.Builder builder);

    public msp(Context context, MsgNotficationDTO msgNotficationDTO, Bundle bundle, Intent intent) {
        super(context, msgNotficationDTO, bundle, intent);
    }

    @Override // com.taobao.message.notification.system.base.IOldAgooNotification
    public void performNotify() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b98d0d91", new Object[]{this});
        } else if (this.mMsgData == null) {
            k.a("AgExpandNotification", "showPersonalMsg is error,msgData==null");
        } else {
            try {
                int nextInt = notificationRandom.nextInt();
                this.mBuilder = a(this.mMsgData, this.mBuilder);
                setVibrateSound(this.mBuilder, this.mParam);
                if (this.mParam != null) {
                    nextInt = this.mParam.getIntExtra("notifyContentIntentRequestCode", nextInt);
                }
                h.a(this.mBuilder, mContext, this.mExtras, nextInt, this.mParam);
                String packageName = mContext.getPackageName();
                this.f31225a = nextInt;
                if (this.mParam != null) {
                    this.f31225a = this.mParam.getIntExtra("notifyId", nextInt);
                }
                msz.a(mContext, this.mMsgData, a(), this.mBuilder, packageName, this);
            } catch (Throwable th) {
                k.a("AgExpandNotification", "showCustomViewNotification error,e=" + th.toString());
                TLog.loge("AgExpandNotification", Log.getStackTraceString(th));
            }
        }
    }

    @Override // tb.msz.a
    public void onSucceed(Bitmap bitmap, NotificationCompat.Builder builder, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("818f7a4", new Object[]{this, bitmap, builder, str});
            return;
        }
        try {
            a(bitmap, builder, str);
        } catch (Exception e) {
            k.a("AgExpandNotification", e.toString());
        }
    }

    @Override // tb.msz.a
    public void onFailed(NotificationCompat.Builder builder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86389f7b", new Object[]{this, builder});
            return;
        }
        try {
            a(builder);
        } catch (Exception e) {
            k.a("AgExpandNotification", e.toString());
        }
    }
}
