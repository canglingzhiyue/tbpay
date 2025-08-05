package tb;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.taobao.taobao.R;
import com.taobao.update.framework.UpdateRuntime;
import com.taobao.update.provider.UpdateProvider;
import java.io.File;

/* loaded from: classes9.dex */
public class rfb implements res {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private a f33100a;

    static {
        kge.a(-284213562);
        kge.a(2100940464);
    }

    @Override // tb.res
    public void notifyDownloadError(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edfd84e8", new Object[]{this, str});
            return;
        }
        a();
        new a(UpdateRuntime.getContext()).error(str);
    }

    @Override // tb.res
    public void notifyDownloadFinish(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("909a6275", new Object[]{this, str});
            return;
        }
        a();
        new a(UpdateRuntime.getContext()).finish(str);
    }

    @Override // tb.res
    public void notifyDownloadProgress(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2646e5de", new Object[]{this, new Integer(i)});
            return;
        }
        if (this.f33100a == null) {
            this.f33100a = new a(UpdateRuntime.getContext());
        }
        this.f33100a.updateProgress(i);
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            this.f33100a = null;
        }
    }

    /* loaded from: classes9.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private int f33101a = 34858;
        private String b = "update_channel_" + this.f33101a;
        private NotificationManager c;
        private Context d;
        private Notification.Builder e;

        static {
            kge.a(-588023022);
        }

        public a(Context context) {
            this.d = context;
            this.c = (NotificationManager) this.d.getSystemService(RemoteMessageConst.NOTIFICATION);
            if (Build.VERSION.SDK_INT >= 26) {
                this.c.createNotificationChannel(new NotificationChannel(this.b, "更新部署", 2));
            }
            this.e = new Notification.Builder(UpdateRuntime.getContext());
        }

        public void updateProgress(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("28975706", new Object[]{this, new Integer(i)});
                return;
            }
            try {
                if (!rgq.isNotificationPermissioned()) {
                    return;
                }
                Notification.Builder contentTitle = this.e.setContentTitle("更新包下载中...");
                contentTitle.setContentText(rgq.getAppNameString(R.string.update_notification_downloading, UpdateRuntime.sAppName) + i + riy.MOD).setSmallIcon(UpdateRuntime.sLogoResourceId);
                if (Build.VERSION.SDK_INT >= 26) {
                    this.e.setChannelId(this.b);
                }
                this.e.setProgress(100, i, false);
                this.c.notify(this.f33101a, this.e.build());
                if (i != 100) {
                    return;
                }
                this.c.cancel(this.f33101a);
                this.e.setContentTitle("更新包校验中...").setContentText(rgq.getAppNameString(R.string.update_notification_finish, UpdateRuntime.sAppName)).setSmallIcon(UpdateRuntime.sLogoResourceId);
                if (Build.VERSION.SDK_INT >= 26) {
                    this.e.setChannelId(this.b);
                }
                this.e.setProgress(0, 0, false);
                this.c.notify(this.f33101a, this.e.build());
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }

        public void finish(String str) {
            PendingIntent a2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a86ec6e4", new Object[]{this, str});
            } else if (rgq.isNotificationPermissioned()) {
                this.e.setContentTitle("点击安装").setContentText(rgq.getAppNameString(R.string.update_notification_finish, UpdateRuntime.sAppName)).setSmallIcon(UpdateRuntime.sLogoResourceId);
                this.e.setProgress(0, 0, false);
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setFlags(268435456);
                if (Build.VERSION.SDK_INT >= 24) {
                    try {
                        Uri uriForFile = UpdateProvider.getUriForFile(this.d, new File(str));
                        intent.addFlags(1);
                        for (ResolveInfo resolveInfo : this.d.getPackageManager().queryIntentActivities(intent, 65536)) {
                            this.d.grantUriPermission(resolveInfo.activityInfo.packageName, uriForFile, 1);
                        }
                        intent.setDataAndType(uriForFile, "application/vnd.android.package-archive");
                    } catch (Throwable th) {
                        th.printStackTrace();
                        return;
                    }
                } else {
                    intent.setDataAndType(Uri.fromFile(new File(str)), "application/vnd.android.package-archive");
                }
                if (Build.VERSION.SDK_INT > 22) {
                    a2 = com.android.taobao.aop.a.a(this.d, 0, intent, 201326592);
                } else {
                    a2 = com.android.taobao.aop.a.a(this.d, 0, intent, 134217728);
                }
                this.e.setContentIntent(a2);
                if (Build.VERSION.SDK_INT >= 26) {
                    this.e.setChannelId(this.b);
                }
                this.c.notify(this.f33101a, this.e.build());
            }
        }

        public void error(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("72e35699", new Object[]{this, str});
            } else if (!rgq.isNotificationPermissioned()) {
            } else {
                this.e.setContentText(rgq.getAppNameString(R.string.update_notification_fail, UpdateRuntime.sAppName)).setProgress(0, 0, false).setSmallIcon(UpdateRuntime.sLogoResourceId);
                if (Build.VERSION.SDK_INT >= 26) {
                    this.e.setChannelId(this.b);
                }
                this.c.notify(this.f33101a, this.e.build());
            }
        }
    }
}
