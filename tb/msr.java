package tb;

import android.app.NotificationChannel;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.Build;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.notification.system.base.BasicLocalPush;
import com.taobao.message.notification.util.EnvUtil;
import com.taobao.msgnotification.g;
import com.taobao.taobao.R;

/* loaded from: classes7.dex */
public abstract class msr extends BasicLocalPush {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String NOTIFICATION_CHANNEL_OTHER_ID = "taobao_agoo_channel_other_id";

    static {
        kge.a(822624149);
    }

    public static /* synthetic */ Object ipc$super(msr msrVar, String str, Object... objArr) {
        if (str.hashCode() == -1304581520) {
            return super.getNotificationChannel();
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.message.notification.system.base.ILocalPush
    public Uri getNotificationSound() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Uri) ipChange.ipc$dispatch("cdea2eec", new Object[]{this});
        }
        return Uri.parse("android.resource://" + EnvUtil.getApplication().getPackageName() + "/" + R.raw.sound_push);
    }

    @Override // com.taobao.message.notification.system.base.ILocalPush
    public int getSmallIcon() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("72d9ae4", new Object[]{this})).intValue();
        }
        if (Build.VERSION.SDK_INT < 21) {
            return R.drawable.tao_mag_icon;
        }
        return R.drawable.tao_mag_icon_white;
    }

    @Override // com.taobao.message.notification.system.base.BasicLocalPush, com.taobao.message.notification.system.base.ILocalPush
    public Bitmap getLargeIcon() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Bitmap) ipChange.ipc$dispatch("6c36bd03", new Object[]{this}) : ((BitmapDrawable) EnvUtil.getApplication().getResources().getDrawable(R.drawable.icon)).getBitmap();
    }

    @Override // com.taobao.message.notification.system.base.BasicLocalPush, com.taobao.message.notification.system.base.ILocalPush
    public NotificationChannel getNotificationChannel() {
        NotificationChannel notificationChannel;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (NotificationChannel) ipChange.ipc$dispatch("b23daa70", new Object[]{this});
        }
        if (EnvUtil.isAppBackGround(BasicLocalPush.TAG)) {
            notificationChannel = g.a().b().getNotificationChannel("taobao_agoo_channel_id");
        } else {
            notificationChannel = g.a().b().getNotificationChannel("taobao_agoo_channel_other_id");
        }
        return notificationChannel == null ? super.getNotificationChannel() : notificationChannel;
    }
}
