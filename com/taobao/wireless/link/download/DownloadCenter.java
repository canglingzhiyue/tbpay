package com.taobao.wireless.link.download;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.support.v4.content.FileProvider;
import android.taobao.windvane.jsbridge.e;
import android.taobao.windvane.jsbridge.q;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.util.concurrent.ConcurrentHashMap;
import tb.bgy;
import tb.kge;
import tb.kml;
import tb.kmm;
import tb.kmo;
import tb.kmq;
import tb.riy;
import tb.rkf;
import tb.rkg;
import tb.rkh;
import tb.rki;
import tb.rkk;

/* loaded from: classes.dex */
public class DownloadCenter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public c f23590a;
    private ConcurrentHashMap<String, LinkDownloadItem> b;
    private String c;
    private Context d;

    /* loaded from: classes.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static DownloadCenter f23596a;

        static {
            kge.a(1991312832);
            f23596a = new DownloadCenter();
        }

        public static /* synthetic */ DownloadCenter a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (DownloadCenter) ipChange.ipc$dispatch("938c1a50", new Object[0]) : f23596a;
        }
    }

    static {
        kge.a(-750594323);
    }

    public static /* synthetic */ String a(DownloadCenter downloadCenter) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("81578a96", new Object[]{downloadCenter}) : downloadCenter.c;
    }

    public static /* synthetic */ void a(DownloadCenter downloadCenter, File file, LinkDownloadItem linkDownloadItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e511270b", new Object[]{downloadCenter, file, linkDownloadItem});
        } else {
            downloadCenter.a(file, linkDownloadItem);
        }
    }

    public static DownloadCenter a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DownloadCenter) ipChange.ipc$dispatch("938c1a50", new Object[0]) : b.a();
    }

    private DownloadCenter() {
        this.b = new ConcurrentHashMap<>();
    }

    public void a(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75c56f77", new Object[]{this, application});
        } else if (application == null) {
            rkg.a("link_tag", "DownloadCenter === init === application为空，无法初始化下载组件");
        } else {
            this.d = application;
            this.c = a((Context) application) + "/linkapkdownload/";
            q.a(DownLoadJsBridge.CLASSNAME_ACTION_DOWNLOAD, (Class<? extends e>) DownLoadJsBridge.class);
            q.a(CheckAppStatusJsBridge.CLASSNAME_CHECK_APP_STATUS, (Class<? extends e>) CheckAppStatusJsBridge.class);
            q.a(LinkAppJsBridge.CLASSNAME_APP, (Class<? extends e>) LinkAppJsBridge.class);
            this.f23590a = new c(this.d);
            rkg.a("link_tag", "DownloadCenter === init === 初始化下载组件完成");
            rkh.a();
            rkf.f33202a.a(new Runnable() { // from class: com.taobao.wireless.link.download.DownloadCenter.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        DownloadCenter.this.b();
                    } catch (Throwable th) {
                        rkg.a("DownloadCenter", th.getMessage(), th);
                    }
                }
            });
        }
    }

    public int a(String str, String str2, String str3, String str4, String str5, String str6, boolean z, String str7, com.taobao.wireless.link.download.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("79a61fc9", new Object[]{this, str, str2, str3, str4, str5, str6, new Boolean(z), str7, aVar})).intValue();
        }
        a aVar2 = null;
        rki.a(rki.ARG1_START_APK_DOWNLOAD, str, str4, null);
        if (StringUtils.isEmpty(str4)) {
            rkg.a("link_tag", "DownloadCenter === startDownload === 下载URL为空，不下载");
            return -1;
        }
        rkg.a("link_tag", "DownloadCenter === startDownload === 开始下载URL=" + str4);
        LinkDownloadItem linkDownloadItem = new LinkDownloadItem();
        linkDownloadItem.businessId = str;
        linkDownloadItem.title = str2;
        linkDownloadItem.packageName = str3;
        linkDownloadItem.downloadUrl = str4;
        linkDownloadItem.fileName = str3 + bgy.APK_EXTENSION;
        linkDownloadItem.fileMd5 = str6;
        linkDownloadItem.visibilityNotification = z;
        linkDownloadItem.notificationUrl = str7;
        a(linkDownloadItem);
        if (aVar != null) {
            aVar2 = new a(aVar, linkDownloadItem);
        }
        return a(linkDownloadItem, aVar2);
    }

    private int a(LinkDownloadItem linkDownloadItem, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a056ce2a", new Object[]{this, linkDownloadItem, aVar})).intValue();
        }
        kmm kmmVar = new kmm();
        kmmVar.b.f30169a = "1111";
        kmmVar.b.h = this.c;
        kmmVar.b.m = true;
        rkg.a("link_tag", "DownloadCenter === startDownload === 下载参数：" + kmmVar.b);
        kmo kmoVar = new kmo();
        kmoVar.f30167a = linkDownloadItem.downloadUrl;
        kmoVar.d = linkDownloadItem.fileName;
        kmmVar.f30166a.add(kmoVar);
        int a2 = com.taobao.downloader.b.a().a(kmmVar, aVar);
        rkg.a("link_tag", "DownloadCenter === startDownload === 开始下载mTaskId=" + a2);
        return a2;
    }

    /* loaded from: classes9.dex */
    public class a implements kml {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private com.taobao.wireless.link.download.a b;
        private LinkDownloadItem c;

        static {
            kge.a(581845696);
            kge.a(1882102659);
        }

        public a(com.taobao.wireless.link.download.a aVar, LinkDownloadItem linkDownloadItem) {
            this.b = aVar;
            this.c = linkDownloadItem;
        }

        @Override // tb.kml
        public void onDownloadProgress(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("49af8908", new Object[]{this, new Integer(i)});
                return;
            }
            rkg.a("link_tag", "DownloadCenter === onDownloadProgress === 下载进度：" + i + riy.MOD);
            com.taobao.wireless.link.download.a aVar = this.b;
            if (aVar != null) {
                aVar.a(i);
            }
            if (!this.c.visibilityNotification) {
                return;
            }
            DownloadCenter.this.f23590a.a(this.c, i);
        }

        @Override // tb.kml
        public void onDownloadError(String str, int i, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cc722e3b", new Object[]{this, str, new Integer(i), str2});
                return;
            }
            rkg.a("link_tag", "DownloadCenter === onDownloadError === 下载失败errorCode=" + i + " msg=" + str2);
            com.taobao.wireless.link.download.a aVar = this.b;
            if (aVar != null) {
                aVar.a(str, i, str2);
            }
            DownloadCenter.this.f23590a.a(this.c.packageName);
        }

        @Override // tb.kml
        public void onDownloadFinish(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("43d7a315", new Object[]{this, str, str2});
                return;
            }
            rkg.a("link_tag", "DownloadCenter === onDownloadFinish === url：" + str + "  filePath=" + str2);
            com.taobao.wireless.link.download.a aVar = this.b;
            if (aVar != null) {
                aVar.a();
            }
            rki.a(rki.ARG1_FINISH_APK_DOWNLOAD, this.c);
            DownloadCenter.a(DownloadCenter.this, new File(str2), this.c);
            DownloadCenter.this.f23590a.a(this.c.packageName);
            if (!this.c.visibilityNotification) {
                return;
            }
            this.c.filePath = str2;
            DownloadCenter.this.f23590a.a(this.c);
        }

        @Override // tb.kml
        public void onDownloadStateChange(String str, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("98fdb789", new Object[]{this, str, new Boolean(z)});
                return;
            }
            rkg.a("link_tag", "DownloadCenter === onDownloadStateChange === 是否正在下载：" + z);
        }

        @Override // tb.kml
        public void onFinish(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6a109f1b", new Object[]{this, new Boolean(z)});
                return;
            }
            rkg.a("link_tag", "DownloadCenter === onFinish === 所有的下载请求都完成=" + z);
        }

        @Override // tb.kml
        public void onNetworkLimit(int i, kmq kmqVar, kml.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6919023a", new Object[]{this, new Integer(i), kmqVar, aVar});
                return;
            }
            rkg.a("link_tag", "DownloadCenter === onNetworkLimit === 网络受限：" + kmqVar);
        }
    }

    public void a(int i, final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20f12ca5", new Object[]{this, new Integer(i), str});
            return;
        }
        rkg.a("link_tag", "DownloadCenter === cancelDownLoad === 取消下载：" + i);
        com.taobao.downloader.b.a().a(i);
        if (StringUtils.isEmpty(str)) {
            return;
        }
        LinkDownloadItem b2 = b(str);
        if (b2 != null) {
            rki.a(rki.ARG1_CANCEL_APK_DOWNLOAD, b2);
        }
        com.taobao.wireless.link.controller.a.a().b().postDelayed(new Runnable() { // from class: com.taobao.wireless.link.download.DownloadCenter.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    DownloadCenter.this.f23590a.a(str);
                }
            }
        }, 1000L);
    }

    public void b(int i, final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1cf2bb84", new Object[]{this, new Integer(i), str});
            return;
        }
        rkg.a("link_tag", "DownloadCenter === pauseDownLoad === 暂停下载：" + i);
        com.taobao.downloader.b.a().b(i);
        if (StringUtils.isEmpty(str)) {
            return;
        }
        LinkDownloadItem b2 = b(str);
        if (b2 != null) {
            rki.a(rki.ARG1_PAUSE_APK_DOWNLOAD, b2);
        }
        com.taobao.wireless.link.controller.a.a().b().postDelayed(new Runnable() { // from class: com.taobao.wireless.link.download.DownloadCenter.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    DownloadCenter.this.f23590a.a(str);
                }
            }
        }, 1000L);
    }

    public void c(int i, String str) {
        LinkDownloadItem b2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18f44a63", new Object[]{this, new Integer(i), str});
            return;
        }
        rkg.a("link_tag", "DownloadCenter === resumeDownLoad === 恢复下载：" + i);
        com.taobao.downloader.b.a().c(i);
        if (StringUtils.isEmpty(str) || (b2 = b(str)) == null) {
            return;
        }
        rki.a(rki.ARG1_RESUME_APK_DOWNLOAD, b2);
    }

    private void a(File file, LinkDownloadItem linkDownloadItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36142ca9", new Object[]{this, file, linkDownloadItem});
        } else if (file == null || !file.getPath().endsWith(bgy.APK_EXTENSION)) {
            rkg.a("link_tag", "DownloadCenter === installApp === 安装APP异常，找不到");
        } else {
            Intent intent = new Intent("android.intent.action.VIEW");
            if (Build.VERSION.SDK_INT >= 24) {
                rkg.a("link_tag", "DownloadCenter === installApp === 安装APP，7.0以上");
                Uri uriForFile = FileProvider.getUriForFile(this.d, "com.taobao.taobao.update.provider", file);
                intent.addFlags(1);
                intent.addFlags(268435456);
                intent.setDataAndType(uriForFile, "application/vnd.android.package-archive");
            } else {
                rkg.a("link_tag", "DownloadCenter === installApp === 安装APP，7.0以下");
                intent.addFlags(268435456);
                intent.setDataAndType(Uri.fromFile(file), "application/vnd.android.package-archive");
            }
            this.d.startActivity(intent);
            rki.a(rki.ARG1_INSTALL_APK_DOWNLOAD, linkDownloadItem);
        }
    }

    public void a(final Context context, final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61b6362a", new Object[]{this, context, str});
        } else {
            rkf.f33202a.a(new Runnable() { // from class: com.taobao.wireless.link.download.DownloadCenter.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (context != null) {
                        LinkDownloadItem b2 = DownloadCenter.this.b(str);
                        if (b2 == null || b2.downloadUrl == null) {
                            rkg.a("link_tag", "DownloadCenter === deleteApk === 存储的下载信息为空，无法删除apk");
                            return;
                        }
                        DownloadCenter.this.f23590a.a(str);
                        File[] listFiles = new File(DownloadCenter.a(DownloadCenter.this)).listFiles();
                        if (listFiles == null || listFiles.length == 0) {
                            rkg.a("link_tag", "DownloadCenter === deleteApk === 下载目录无文件，无需删除apk");
                            return;
                        }
                        for (File file : listFiles) {
                            if (StringUtils.equals(file.getName(), b2.fileName)) {
                                file.delete();
                                rkg.a("link_tag", "DownloadCenter === deleteApk === 删除文件：" + file.getName());
                                rki.a(rki.ARG1_DELETE_APK_DOWNLOAD, b2);
                                return;
                            }
                        }
                    }
                }
            });
        }
    }

    public void a(LinkDownloadItem linkDownloadItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c3f6b2", new Object[]{this, linkDownloadItem});
            return;
        }
        ConcurrentHashMap<String, LinkDownloadItem> concurrentHashMap = this.b;
        if (concurrentHashMap != null) {
            concurrentHashMap.put(linkDownloadItem.packageName, linkDownloadItem);
        }
        rkk a2 = rkk.a(this.d);
        a2.a("download_" + linkDownloadItem.packageName, linkDownloadItem);
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        ConcurrentHashMap<String, LinkDownloadItem> concurrentHashMap = this.b;
        if (concurrentHashMap != null) {
            concurrentHashMap.remove(str);
        }
        rkk a2 = rkk.a(this.d);
        a2.b("download_" + str);
    }

    public LinkDownloadItem b(String str) {
        LinkDownloadItem linkDownloadItem;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LinkDownloadItem) ipChange.ipc$dispatch("8c3b40d", new Object[]{this, str});
        }
        if (StringUtils.isEmpty(str)) {
            return null;
        }
        LinkDownloadItem linkDownloadItem2 = this.b.get(str);
        if (linkDownloadItem2 == null) {
            rkk a2 = rkk.a(this.d);
            linkDownloadItem = (LinkDownloadItem) a2.b("download_" + str, new LinkDownloadItem());
        } else {
            linkDownloadItem = linkDownloadItem2;
        }
        if (linkDownloadItem != null && StringUtils.isEmpty(linkDownloadItem.packageName)) {
            return null;
        }
        return linkDownloadItem;
    }

    public static String a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bbc5dc40", new Object[]{context});
        }
        File externalCacheDir = context.getExternalCacheDir();
        if (externalCacheDir == null) {
            externalCacheDir = context.getCacheDir();
        }
        return externalCacheDir.getAbsolutePath();
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        File file = new File(this.c);
        File[] listFiles = file.listFiles();
        if (listFiles == null || listFiles.length == 0) {
            rkg.a("DownloadCenter", "No files in the link download path.");
            return;
        }
        long j = 86400000;
        String a2 = com.taobao.wireless.link.common.b.a(this.d, "downloadApkFileExpirationTime", (String) null);
        if (!StringUtils.isEmpty(a2)) {
            try {
                long parseLong = Long.parseLong(a2);
                if (parseLong > 0) {
                    j = parseLong;
                }
            } catch (Exception unused) {
            }
        }
        long currentTimeMillis = System.currentTimeMillis();
        for (File file2 : listFiles) {
            try {
                String name = file2.getName();
                if (name.endsWith(bgy.APK_EXTENSION)) {
                    if (currentTimeMillis - file2.lastModified() > j) {
                        file2.delete();
                        rkg.a("link_tag", "DownloadCenter === checkAndDelete === 超过最大存在时间(" + j + ")，删除文件：" + file2.getName());
                        String substring = name.substring(0, name.length() + (-4));
                        StringBuilder sb = new StringBuilder();
                        sb.append("packageName === ");
                        sb.append(substring);
                        rkg.a("DownloadCenter", sb.toString());
                        a(substring);
                    }
                    rkg.a("link_tag", "DownloadCenter === checkAndDelete === 删除本地下载记录");
                }
            } catch (Exception unused2) {
                rkg.b("DownloadCenter", "Failed to delete expired file(" + file2.toString() + ").");
            }
        }
        rkg.a("link_tag", "DownloadCenter === checkAndDelete === 完成apk过期文件删除检查");
        File[] listFiles2 = file.listFiles();
        if (listFiles2 == null || listFiles2.length <= 0) {
            return;
        }
        long j2 = 0;
        for (File file3 : listFiles2) {
            j2 += file3.length();
        }
        rkh.a(j2, listFiles2.length);
    }
}
