package com.taobao.message.lab.comfrm.util;

import anetwork.channel.download.DownloadManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.downloader.b;
import com.taobao.message.kit.util.UIHandler;
import com.taobao.message.uikit.util.ApplicationUtil;
import com.taobao.orange.util.c;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import tb.kge;
import tb.kml;
import tb.kmm;
import tb.kmo;
import tb.kmq;

/* loaded from: classes7.dex */
public class DownloadUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "DownloadUtil";
    private static Map<String, Long> timeRetryMap;
    private static Map<String, Long> timeStartMap;

    /* loaded from: classes7.dex */
    public interface DownloadCallback {
        void onFinish(String str, String str2);
    }

    public static /* synthetic */ Map access$000() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("c8ee3d6c", new Object[0]) : timeStartMap;
    }

    public static /* synthetic */ String access$100(String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("80990a54", new Object[]{str, str2}) : getLocalDir(str, str2);
    }

    public static /* synthetic */ Map access$200() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("e220286e", new Object[0]) : timeRetryMap;
    }

    static {
        kge.a(-1295554203);
        timeStartMap = new HashMap();
        timeRetryMap = new HashMap();
    }

    private static String URLtoFileName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b57b84be", new Object[]{str});
        }
        String a2 = c.a(str);
        if (!"ogg".equals(getUrlExtension(str))) {
            return a2;
        }
        return a2 + ".ogg";
    }

    private static String getUrlExtension(String str) {
        int lastIndexOf;
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bf083d69", new Object[]{str}) : (str != null && (lastIndexOf = str.lastIndexOf(46)) > 0 && lastIndexOf < str.length() - 1) ? str.substring(lastIndexOf + 1) : "";
    }

    private static String getLocalDir(String str, String str2) {
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2c39984d", new Object[]{str, str2});
        }
        String diskCacheDir = com.taobao.message.kit.util.FileUtil.getDiskCacheDir(ApplicationUtil.getApplication(), "dojo_patch");
        if (str2 == null) {
            str3 = diskCacheDir + File.separator + "common" + File.separator + c.a(str).substring(0, 6);
        } else {
            str3 = diskCacheDir + File.separator + str2 + File.separator + c.a(str).substring(0, 6);
        }
        File file = new File(str3);
        if (!file.exists() && !file.mkdirs() && ApplicationUtil.isDebug()) {
            Logger.d(TAG, "mkdirs failed.");
        }
        return str3;
    }

    public static synchronized void download(String str, DownloadCallback downloadCallback) {
        synchronized (DownloadUtil.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6cc2bddc", new Object[]{str, downloadCallback});
                return;
            }
            String URLtoFileName = URLtoFileName(str);
            timeStartMap.put(str, Long.valueOf(System.currentTimeMillis()));
            DownloadManager.getInstance().enqueue(str, URLtoFileName, new AnonymousClass1(str, downloadCallback, URLtoFileName));
        }
    }

    /* renamed from: com.taobao.message.lab.comfrm.util.DownloadUtil$1  reason: invalid class name */
    /* loaded from: classes7.dex */
    public static class AnonymousClass1 implements DownloadManager.DownloadListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ DownloadCallback val$callback;
        public final /* synthetic */ String val$fileName;
        public final /* synthetic */ String val$url;

        public AnonymousClass1(String str, DownloadCallback downloadCallback, String str2) {
            this.val$url = str;
            this.val$callback = downloadCallback;
            this.val$fileName = str2;
        }

        @Override // anetwork.channel.download.DownloadManager.DownloadListener
        public void onSuccess(int i, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("631dc082", new Object[]{this, new Integer(i), str});
                return;
            }
            synchronized (this) {
                Logger.e(DownloadUtil.TAG, this.val$url + "DownloadManager success cost" + (System.currentTimeMillis() - ((Long) DownloadUtil.access$000().get(this.val$url)).longValue()));
                if (this.val$callback != null) {
                    this.val$callback.onFinish(this.val$url, str);
                }
            }
        }

        @Override // anetwork.channel.download.DownloadManager.DownloadListener
        public void onFail(int i, int i2, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a94ab7ce", new Object[]{this, new Integer(i), new Integer(i2), str});
                return;
            }
            Logger.e(DownloadUtil.TAG, this.val$url + "DownloadManager fail cost" + (System.currentTimeMillis() - ((Long) DownloadUtil.access$000().get(this.val$url)).longValue()));
            DownloadCallback downloadCallback = this.val$callback;
            if (downloadCallback != null) {
                downloadCallback.onFinish(this.val$url, null);
            }
            kmm kmmVar = new kmm();
            kmmVar.b.h = DownloadUtil.access$100("common", "other");
            kmmVar.b.f30169a = "taobao_message";
            kmo kmoVar = new kmo();
            kmoVar.f30167a = this.val$url;
            kmoVar.d = this.val$fileName + ".tmp";
            kmmVar.f30166a.add(kmoVar);
            DownloadUtil.access$200().put(this.val$url, Long.valueOf(System.currentTimeMillis()));
            b.a().a(kmmVar, new kml() { // from class: com.taobao.message.lab.comfrm.util.DownloadUtil.1.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.kml
                public void onDownloadProgress(int i3) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("49af8908", new Object[]{this, new Integer(i3)});
                    }
                }

                @Override // tb.kml
                public void onDownloadStateChange(String str2, boolean z) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("98fdb789", new Object[]{this, str2, new Boolean(z)});
                    }
                }

                @Override // tb.kml
                public void onFinish(boolean z) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("6a109f1b", new Object[]{this, new Boolean(z)});
                    }
                }

                @Override // tb.kml
                public void onNetworkLimit(int i3, kmq kmqVar, kml.a aVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("6919023a", new Object[]{this, new Integer(i3), kmqVar, aVar});
                    }
                }

                @Override // tb.kml
                public void onDownloadError(String str2, int i3, String str3) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("cc722e3b", new Object[]{this, str2, new Integer(i3), str3});
                        return;
                    }
                    Logger.e(DownloadUtil.TAG, AnonymousClass1.this.val$url + "Downloader fail cost" + (System.currentTimeMillis() - ((Long) DownloadUtil.access$200().get(AnonymousClass1.this.val$url)).longValue()));
                    if (AnonymousClass1.this.val$callback == null) {
                        return;
                    }
                    UIHandler.post(new Runnable() { // from class: com.taobao.message.lab.comfrm.util.DownloadUtil.1.1.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                            } else {
                                AnonymousClass1.this.val$callback.onFinish(AnonymousClass1.this.val$url, null);
                            }
                        }
                    });
                }

                @Override // tb.kml
                public void onDownloadFinish(String str2, String str3) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("43d7a315", new Object[]{this, str2, str3});
                    } else if (AnonymousClass1.this.val$callback == null) {
                    } else {
                        AnonymousClass1.this.val$callback.onFinish(str2, str3);
                    }
                }
            });
        }

        @Override // anetwork.channel.download.DownloadManager.DownloadListener
        public void onProgress(int i, long j, long j2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d0712230", new Object[]{this, new Integer(i), new Long(j), new Long(j2)});
            } else if (!ApplicationUtil.isDebug()) {
            } else {
                Logger.d(DownloadUtil.TAG, "pos: " + j + "total: " + j2);
            }
        }
    }
}
