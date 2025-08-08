package com.taobao.wireless.link.download;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.support.v4.app.NotificationCompat;
import android.support.v4.content.FileProvider;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.taobao.android.nav.Nav;
import java.io.File;
import java.util.HashMap;
import tb.kge;
import tb.riy;
import tb.rkg;

/* loaded from: classes.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private HashMap<String, a> f23598a = new HashMap<>();
    private Context b;
    private NotificationManager c;

    /* loaded from: classes9.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public int f23599a;
        public long b;

        static {
            kge.a(1356515301);
        }
    }

    static {
        kge.a(1661136029);
    }

    public c(Context context) {
        this.b = context;
        this.c = (NotificationManager) context.getSystemService(RemoteMessageConst.NOTIFICATION);
        if (Build.VERSION.SDK_INT >= 26) {
            a(this.c);
        }
    }

    public void a(LinkDownloadItem linkDownloadItem, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbb5291", new Object[]{this, linkDownloadItem, new Integer(i)});
            return;
        }
        synchronized (this.f23598a) {
            a aVar = this.f23598a.get(linkDownloadItem.packageName);
            if (aVar == null) {
                aVar = new a();
                aVar.b = System.currentTimeMillis();
                aVar.f23599a = i;
                this.f23598a.put(linkDownloadItem.packageName, aVar);
            } else if (aVar.f23599a == i) {
                return;
            } else {
                aVar.f23599a = i;
            }
            this.c.notify(a(1, linkDownloadItem.packageName), 0, a(linkDownloadItem, aVar).build());
        }
    }

    public void a(LinkDownloadItem linkDownloadItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c3f6b2", new Object[]{this, linkDownloadItem});
        } else {
            this.c.notify(a(2, linkDownloadItem.packageName), 0, b(linkDownloadItem).build());
        }
    }

    private void a(NotificationManager notificationManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10107845", new Object[]{this, notificationManager});
            return;
        }
        NotificationChannel notificationChannel = new NotificationChannel("taobao_linkdownloader_active", com.taobao.wireless.link.common.b.a(this.b, "linkDownloadChannelName", "应用下载通知"), 4);
        notificationChannel.canBypassDnd();
        notificationChannel.enableLights(true);
        notificationChannel.enableVibration(false);
        notificationChannel.shouldShowLights();
        notificationChannel.getAudioAttributes();
        notificationChannel.setLightColor(-65536);
        notificationChannel.setLockscreenVisibility(0);
        notificationChannel.setShowBadge(true);
        notificationChannel.setBypassDnd(true);
        try {
            notificationManager.createNotificationChannel(notificationChannel);
        } catch (Throwable th) {
            rkg.a("LinkDownloadNotification", th.getMessage(), th);
        }
    }

    public NotificationCompat.Builder a(LinkDownloadItem linkDownloadItem, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (NotificationCompat.Builder) ipChange.ipc$dispatch("4181fc0d", new Object[]{this, linkDownloadItem, aVar});
        }
        Intent intent = null;
        if (!StringUtils.isEmpty(linkDownloadItem.notificationUrl)) {
            try {
                intent = Nav.from(this.b).intentForUri(Uri.parse(linkDownloadItem.notificationUrl));
            } catch (Exception e) {
                rkg.a("LinkDownloadNotification", e.getMessage(), e);
            }
        }
        NotificationCompat.Builder ongoing = new NotificationCompat.Builder(this.b.getApplicationContext(), "taobao_linkdownloader_active").setWhen(aVar.b).setOnlyAlertOnce(true).setOngoing(true);
        StringBuilder sb = new StringBuilder();
        sb.append(StringUtils.isEmpty(linkDownloadItem.title) ? "未知应用" : linkDownloadItem.title);
        sb.append(" ");
        sb.append("正在下载...");
        NotificationCompat.Builder autoCancel = ongoing.setContentTitle(sb.toString()).setSmallIcon(17301633).setDefaults(5).setVibrate(new long[]{0}).setPriority(2).setAutoCancel(false);
        NotificationCompat.Builder progress = autoCancel.setContentText(aVar.f23599a + riy.MOD).setProgress(100, aVar.f23599a, false);
        if (intent != null) {
            progress.setContentIntent(com.android.taobao.aop.a.a(this.b, 0, intent, 0));
        }
        return progress;
    }

    public NotificationCompat.Builder b(LinkDownloadItem linkDownloadItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (NotificationCompat.Builder) ipChange.ipc$dispatch("4ee1dd41", new Object[]{this, linkDownloadItem});
        }
        Intent intent = new Intent("android.intent.action.VIEW");
        if (Build.VERSION.SDK_INT >= 24) {
            rkg.a("link_tag", "DownloadCenter === installApp === 安装APP，7.0以上");
            Uri uriForFile = FileProvider.getUriForFile(this.b, "com.taobao.taobao.update.provider", new File(linkDownloadItem.filePath));
            intent.addFlags(1);
            intent.addFlags(268435456);
            intent.setDataAndType(uriForFile, "application/vnd.android.package-archive");
        } else {
            rkg.a("link_tag", "DownloadCenter === installApp === 安装APP，7.0以下");
            intent.addFlags(268435456);
            intent.setDataAndType(Uri.fromFile(new File(linkDownloadItem.filePath)), "application/vnd.android.package-archive");
        }
        NotificationCompat.Builder ongoing = new NotificationCompat.Builder(this.b.getApplicationContext(), "taobao_linkdownloader_active").setWhen(System.currentTimeMillis()).setOnlyAlertOnce(true).setOngoing(false);
        StringBuilder sb = new StringBuilder();
        sb.append(StringUtils.isEmpty(linkDownloadItem.title) ? "未知应用" : linkDownloadItem.title);
        sb.append(" ");
        sb.append("下载完成");
        NotificationCompat.Builder contentText = ongoing.setContentTitle(sb.toString()).setSmallIcon(17301634).setDefaults(5).setVibrate(new long[]{0}).setPriority(2).setAutoCancel(false).setContentText("点击开始安装");
        contentText.setContentIntent(com.android.taobao.aop.a.a(this.b, 0, intent, 0));
        return contentText;
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        rkg.a("LinkDownloadNotification", "cancelNotification. packageName=" + str);
        synchronized (this.f23598a) {
            this.f23598a.remove(str);
        }
        try {
            this.c.cancel(a(1, str), 0);
        } catch (Throwable th) {
            rkg.a("LinkDownloadNotification", th.getMessage(), th);
        }
        try {
            this.c.cancel(a(2, str), 0);
        } catch (Throwable th2) {
            rkg.a("LinkDownloadNotification", th2.getMessage(), th2);
        }
    }

    private static String a(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cd4d069b", new Object[]{new Integer(i), str});
        }
        return i + ":" + str;
    }
}
