package com.alipay.mobile.security.bio.runtime.download.impl;

import android.content.Context;
import com.alipay.mobile.security.bio.runtime.download.BioDownloadItem;
import com.alipay.mobile.security.bio.runtime.download.BioResDownloader;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.downloader.b;
import java.io.File;
import java.util.concurrent.atomic.AtomicInteger;
import tb.kml;
import tb.kmm;
import tb.kmo;
import tb.kmq;
import tb.riy;

/* loaded from: classes3.dex */
public class BioResDownloaderTaobaoImpl implements BioResDownloader {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final BioResDownloader.Callback f5797a = new BioResDownloader.Callback() { // from class: com.alipay.mobile.security.bio.runtime.download.impl.BioResDownloaderTaobaoImpl.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.alipay.mobile.security.bio.runtime.download.BioResDownloader.Callback
        public void onComplete(BioResDownloader.BioDownloadTask bioDownloadTask) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("21de980", new Object[]{this, bioDownloadTask});
            }
        }

        @Override // com.alipay.mobile.security.bio.runtime.download.BioResDownloader.Callback
        public void onError(BioResDownloader.BioDownloadTask bioDownloadTask, int i, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("22cee87c", new Object[]{this, bioDownloadTask, new Integer(i), str});
            }
        }

        @Override // com.alipay.mobile.security.bio.runtime.download.BioResDownloader.Callback
        public void onProgress(BioResDownloader.BioDownloadTask bioDownloadTask, long j, long j2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("df9fb6f4", new Object[]{this, bioDownloadTask, new Long(j), new Long(j2)});
            }
        }

        @Override // com.alipay.mobile.security.bio.runtime.download.BioResDownloader.Callback
        public void onStart(BioResDownloader.BioDownloadTask bioDownloadTask) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("594bcccb", new Object[]{this, bioDownloadTask});
            }
        }
    };

    @Override // com.alipay.mobile.security.bio.runtime.download.BioResDownloader
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        }
    }

    public static /* synthetic */ BioResDownloader.Callback a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BioResDownloader.Callback) ipChange.ipc$dispatch("f6deb08d", new Object[0]) : f5797a;
    }

    @Override // com.alipay.mobile.security.bio.runtime.download.BioResDownloader
    public void init(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{this, context});
        } else {
            b.a(context);
        }
    }

    @Override // com.alipay.mobile.security.bio.runtime.download.BioResDownloader
    public BioResDownloader.BioDownloadTask startDownload(Context context, BioDownloadItem bioDownloadItem, BioResDownloader.Callback callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BioResDownloader.BioDownloadTask) ipChange.ipc$dispatch("1afd819", new Object[]{this, context, bioDownloadItem, callback});
        }
        if (!a(bioDownloadItem)) {
            return null;
        }
        kmm kmmVar = new kmm();
        kmmVar.b.f30169a = "BioResDownloader";
        kmmVar.b.d = 7;
        kmmVar.b.h = bioDownloadItem.getSavePath();
        kmmVar.b.g = false;
        kmo kmoVar = new kmo();
        kmoVar.c = bioDownloadItem.getMd5();
        kmoVar.f30167a = bioDownloadItem.getUrl();
        kmoVar.d = bioDownloadItem.getFileName();
        kmmVar.f30166a.add(kmoVar);
        DownloadTaskImpl a2 = a(bioDownloadItem, callback);
        a2.setTaobaoDownloaderTaskId(b.a().a(kmmVar, a2));
        return a2;
    }

    private static boolean a(BioDownloadItem bioDownloadItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e1ec39ea", new Object[]{bioDownloadItem})).booleanValue();
        }
        File file = new File(bioDownloadItem.getSavePath());
        return file.isDirectory() || file.mkdirs();
    }

    private DownloadTaskImpl a(BioDownloadItem bioDownloadItem, BioResDownloader.Callback callback) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DownloadTaskImpl) ipChange.ipc$dispatch("def72d5f", new Object[]{this, bioDownloadItem, callback}) : new DownloadTaskImpl(bioDownloadItem, callback);
    }

    /* loaded from: classes3.dex */
    public static class DownloadTaskImpl implements BioResDownloader.BioDownloadTask, kml {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private BioDownloadItem f5798a;
        private BioResDownloader.Callback b;
        private int c;
        private AtomicInteger d = new AtomicInteger(0);

        @Override // tb.kml
        public void onNetworkLimit(int i, kmq kmqVar, kml.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6919023a", new Object[]{this, new Integer(i), kmqVar, aVar});
            }
        }

        public DownloadTaskImpl(BioDownloadItem bioDownloadItem, BioResDownloader.Callback callback) {
            this.f5798a = bioDownloadItem;
            this.b = callback == null ? BioResDownloaderTaobaoImpl.a() : callback;
        }

        @Override // com.alipay.mobile.security.bio.runtime.download.BioResDownloader.BioDownloadTask
        public BioDownloadItem getDownloadItem() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (BioDownloadItem) ipChange.ipc$dispatch("32d21f36", new Object[]{this}) : this.f5798a;
        }

        @Override // com.alipay.mobile.security.bio.runtime.download.BioResDownloader.BioDownloadTask
        public int getStatus() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("fcf6c362", new Object[]{this})).intValue() : this.d.get();
        }

        @Override // com.alipay.mobile.security.bio.runtime.download.BioResDownloader.BioDownloadTask
        public void cancel() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("707fe601", new Object[]{this});
            } else {
                b.a().a(this.c);
            }
        }

        public void setTaobaoDownloaderTaskId(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("24dda517", new Object[]{this, new Integer(i)});
            } else {
                this.c = i;
            }
        }

        @Override // tb.kml
        public void onDownloadProgress(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("49af8908", new Object[]{this, new Integer(i)});
                return;
            }
            String str = "onDownloadProgress() called with: process = [" + i + riy.ARRAY_END_STR;
            this.b.onProgress(this, 100L, i);
        }

        @Override // tb.kml
        public void onDownloadError(String str, int i, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cc722e3b", new Object[]{this, str, new Integer(i), str2});
                return;
            }
            String str3 = "onDownloadError() called with: url = [" + str + "], errorCode = [" + i + "], msg = [" + str2 + riy.ARRAY_END_STR;
            this.d.set(-1);
            this.b.onError(this, i, str2);
        }

        @Override // tb.kml
        public void onDownloadFinish(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("43d7a315", new Object[]{this, str, str2});
                return;
            }
            String str3 = "onDownloadFinish() called with: url = [" + str + "], s1 = [" + str2 + riy.ARRAY_END_STR;
        }

        @Override // tb.kml
        public void onDownloadStateChange(String str, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("98fdb789", new Object[]{this, str, new Boolean(z)});
                return;
            }
            String str2 = "onDownloadStateChange() called with: url = [" + str + "], downloading = [" + z + riy.ARRAY_END_STR;
            if (!z) {
                return;
            }
            this.d.set(1);
            this.b.onStart(this);
        }

        @Override // tb.kml
        public void onFinish(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6a109f1b", new Object[]{this, new Boolean(z)});
                return;
            }
            String str = "onFinish() called with: allSuccess = [" + z + riy.ARRAY_END_STR;
            if (z) {
                this.d.set(2);
                this.b.onComplete(this);
                return;
            }
            int i = this.d.get();
            if (i != 3) {
                this.d.set(-1);
            } else if (i == -1) {
            } else {
                this.b.onError(this, 10000, "unknown error");
            }
        }
    }
}
