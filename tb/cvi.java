package tb;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Build;
import mtopsdk.common.util.StringUtils;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.taobao.taobao.R;

/* loaded from: classes4.dex */
public class cvi {
    public static final String DEFAULT_NOTIFICATION_CHANNEL_ID = "Heytap PUSH";

    static {
        kge.a(105521716);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(Context context, String str, String str2, int i) {
        NotificationManager notificationManager;
        if (context == null || (notificationManager = (NotificationManager) context.getSystemService(RemoteMessageConst.NOTIFICATION)) == null) {
            return false;
        }
        notificationManager.createNotificationChannel(new NotificationChannel(str, str2, i));
        return true;
    }

    public void a(final Context context) {
        if (Build.VERSION.SDK_INT < 26) {
            return;
        }
        cwb.a(new Runnable() { // from class: tb.cvi.1
            @Override // java.lang.Runnable
            public void run() {
                if (cvz.c().a()) {
                    return;
                }
                String string = context.getString(R.string.system_default_channel);
                if (StringUtils.isEmpty(string)) {
                    string = "System Default Channel";
                }
                cvz.c().a(cvi.this.a(context, cvi.DEFAULT_NOTIFICATION_CHANNEL_ID, string, 3));
            }
        });
    }
}
