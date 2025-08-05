package com.alipay.mobile.security.bio.runtime;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.alibaba.security.realidentity.ui.view.ALBiometricsActivityParentView;
import com.alipay.bis.core.protocol.BioRuntimeDependency;
import com.alipay.mobile.security.bio.runtime.download.BioCpuArchChecker;
import com.alipay.mobile.security.bio.runtime.download.BioDownloadItem;
import com.alipay.mobile.security.bio.runtime.download.BioResChecker;
import com.alipay.mobile.security.bio.runtime.download.BioResDownloader;
import com.alipay.mobile.security.bio.runtime.download.BioResPostProcessor;
import com.alipay.mobile.security.bio.runtime.download.impl.BioCpuArchCheckerImpl;
import com.alipay.mobile.security.bio.runtime.download.impl.BioResCheckerImpl;
import com.alipay.mobile.security.bio.runtime.download.impl.BioResDownloaderTaobaoImpl;
import com.alipay.mobile.security.bio.runtime.download.impl.BioResPostProcessorImpl;
import com.alipay.mobile.security.bio.utils.BioLog;
import com.alipay.mobile.security.bio.utils.FileUtil;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes3.dex */
public class BioResManager {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int ERROR_CODE_CHECKSUM_ERROR = 3;
    public static final int ERROR_CODE_DOWNLOAD_ERROR = 2;
    public static final int ERROR_CODE_FAILED_TO_LOAD_LIBRARY = 5;
    public static final int ERROR_CODE_FILE_FAILED_TO_EXTRACT = 4;
    public static final int ERROR_CODE_IO_ERROR = 1;
    public static final int STATUS_DOWNLOADING = 2;
    public static final int STATUS_DOWNLOAD_COMPLETE = 3;
    public static final int STATUS_ERROR = -1;
    public static final int STATUS_INIT = 0;
    public static final int STATUS_LOADING = 4;
    public static final int STATUS_NEED_DOWNLOAD = 1;
    public static final int STATUS_PREPARED = 5;
    private static BioResManager b;
    private static volatile BioRuntimeDependency m;
    private Context c;
    private Handler e;
    private BioResChecker g;
    private int p;

    /* renamed from: a  reason: collision with root package name */
    private BioCpuArchChecker f5790a = new BioCpuArchCheckerImpl();
    private Lock f = new ReentrantLock();
    private List<BioDownloadItem> h = new ArrayList();
    private List<BioDownloadItem> i = new ArrayList();
    private List<BioDownloadItem> j = new ArrayList();
    private BioResDownloader k = new BioResDownloaderTaobaoImpl();
    private List<BioResDownloader.BioDownloadTask> l = new ArrayList();
    private BioResDownloader.Callback n = new BioResDownloader.Callback() { // from class: com.alipay.mobile.security.bio.runtime.BioResManager.2
        public static volatile transient /* synthetic */ IpChange $ipChange;

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
            } else {
                BioResManager.a(BioResManager.this).obtainMessage(1, bioDownloadTask.getDownloadItem().getFileName()).sendToTarget();
            }
        }

        @Override // com.alipay.mobile.security.bio.runtime.download.BioResDownloader.Callback
        public void onComplete(BioResDownloader.BioDownloadTask bioDownloadTask) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("21de980", new Object[]{this, bioDownloadTask});
                return;
            }
            synchronized (BioResManager.b(BioResManager.this)) {
                BioResManager.c(BioResManager.this).remove(bioDownloadTask);
                BioResManager.a(BioResManager.this).obtainMessage(2, bioDownloadTask.getDownloadItem().getFileName()).sendToTarget();
                BioResManager.d(BioResManager.this).remove(bioDownloadTask.getDownloadItem());
                BioResManager.e(BioResManager.this).add(bioDownloadTask.getDownloadItem());
                if (BioResManager.c(BioResManager.this).size() == 0) {
                    if (BioResManager.f(BioResManager.this).isEmpty()) {
                        BioResManager.a(BioResManager.this, 3);
                    } else {
                        BioResManager.a(BioResManager.this, -1);
                    }
                    BioResManager.a(BioResManager.this).obtainMessage(3).sendToTarget();
                }
            }
        }

        @Override // com.alipay.mobile.security.bio.runtime.download.BioResDownloader.Callback
        public void onError(BioResDownloader.BioDownloadTask bioDownloadTask, int i, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("22cee87c", new Object[]{this, bioDownloadTask, new Integer(i), str});
                return;
            }
            synchronized (BioResManager.b(BioResManager.this)) {
                BioResManager.c(BioResManager.this).remove(bioDownloadTask);
                BioResManager.d(BioResManager.this).remove(bioDownloadTask.getDownloadItem());
                BioResManager.f(BioResManager.this).add(bioDownloadTask.getDownloadItem());
                BioResManager.a(BioResManager.this).obtainMessage(4, 2, i, str).sendToTarget();
                if (BioResManager.c(BioResManager.this).size() == 0) {
                    BioResManager.a(BioResManager.this, -1);
                    BioResManager.a(BioResManager.this).obtainMessage(3).sendToTarget();
                }
            }
        }
    };
    private BioResPostProcessor o = new BioResPostProcessorImpl();
    private CopyOnWriteArrayList<Callback> q = new CopyOnWriteArrayList<>();
    private HandlerThread d = new HandlerThread("BioResManager");

    /* loaded from: classes3.dex */
    public interface Callback {
        void onAllDownloadComplete();

        void onDownloadComplete(String str);

        void onDownloadStart(String str);

        void onError(int i, int i2, String str);

        void onInitComplete();
    }

    /* loaded from: classes3.dex */
    public static class ResManangerHandler extends Handler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private WeakReference<BioResManager> f5793a;

        public ResManangerHandler(BioResManager bioResManager, Looper looper) {
            super(looper);
            this.f5793a = new WeakReference<>(bioResManager);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
                return;
            }
            BioResManager bioResManager = this.f5793a.get();
            if (bioResManager == null) {
                return;
            }
            BioResManager.a(bioResManager, message);
        }
    }

    public static /* synthetic */ int a(BioResManager bioResManager, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("23707efd", new Object[]{bioResManager, new Integer(i)})).intValue();
        }
        bioResManager.p = i;
        return i;
    }

    public static /* synthetic */ Handler a(BioResManager bioResManager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Handler) ipChange.ipc$dispatch("c881670d", new Object[]{bioResManager}) : bioResManager.e;
    }

    public static /* synthetic */ void a(BioResManager bioResManager, Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f8101ec", new Object[]{bioResManager, message});
        } else {
            bioResManager.a(message);
        }
    }

    public static /* synthetic */ Lock b(BioResManager bioResManager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Lock) ipChange.ipc$dispatch("49a4f1e1", new Object[]{bioResManager}) : bioResManager.f;
    }

    public static /* synthetic */ List c(BioResManager bioResManager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("92d2b84c", new Object[]{bioResManager}) : bioResManager.l;
    }

    public static /* synthetic */ List d(BioResManager bioResManager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("ad43b16b", new Object[]{bioResManager}) : bioResManager.h;
    }

    public static /* synthetic */ List e(BioResManager bioResManager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("c7b4aa8a", new Object[]{bioResManager}) : bioResManager.j;
    }

    public static /* synthetic */ List f(BioResManager bioResManager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("e225a3a9", new Object[]{bioResManager}) : bioResManager.i;
    }

    public static BioResManager getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BioResManager) ipChange.ipc$dispatch("1b94d9f5", new Object[0]);
        }
        if (b == null) {
            synchronized (BioResManager.class) {
                if (b == null) {
                    b = new BioResManager();
                }
            }
        }
        return b;
    }

    public static BioRuntimeDependency getCacheBioRuntimeDependency(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BioRuntimeDependency) ipChange.ipc$dispatch("6c2a280f", new Object[]{context});
        }
        if (m == null) {
            m = getBioRuntimeDependency(context);
        }
        return m;
    }

    public static BioRuntimeDependency getBioRuntimeDependency(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BioRuntimeDependency) ipChange.ipc$dispatch("5c3c0245", new Object[]{context});
        }
        byte[] assetsData = FileUtil.getAssetsData(context, "bio_res.json");
        if (assetsData == null) {
            return null;
        }
        return BioRuntimeDependency.createFromJson(new String(assetsData));
    }

    public BioResDownloader setResDownloader(BioResDownloader bioResDownloader) {
        BioResDownloader bioResDownloader2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BioResDownloader) ipChange.ipc$dispatch("b4edb11c", new Object[]{this, bioResDownloader});
        }
        synchronized (BioResManager.class) {
            if (this.p == 2) {
                throw new IllegalStateException("cannot change downloader while downloading");
            }
            bioResDownloader2 = this.k;
            this.k = bioResDownloader;
        }
        return bioResDownloader2;
    }

    public void registerCallback(Callback callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("442a4367", new Object[]{this, callback});
            return;
        }
        synchronized (this.f) {
            if (!this.q.contains(callback)) {
                this.q.add(callback);
            }
        }
    }

    public void unregisterCallback(Callback callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42f2dc2e", new Object[]{this, callback});
            return;
        }
        synchronized (this.f) {
            this.q.remove(callback);
        }
    }

    public BioCpuArchChecker getCpuArchChecker() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BioCpuArchChecker) ipChange.ipc$dispatch("c3f2aeb6", new Object[]{this}) : this.f5790a;
    }

    public String getResFileFolder(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b66ad4b3", new Object[]{this, context}) : new File(context.getFilesDir(), ALBiometricsActivityParentView.p).getAbsolutePath();
    }

    public void initAsync(final Context context, final BioRuntimeDependency bioRuntimeDependency, Callback callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("def55a66", new Object[]{this, context, bioRuntimeDependency, callback});
            return;
        }
        if (callback != null) {
            registerCallback(callback);
        }
        this.e.post(new Runnable() { // from class: com.alipay.mobile.security.bio.runtime.BioResManager.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    BioResManager.this.init(context, bioRuntimeDependency, null);
                }
            }
        });
    }

    public int init(Context context, BioRuntimeDependency bioRuntimeDependency, Callback callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c75bcc15", new Object[]{this, context, bioRuntimeDependency, callback})).intValue();
        }
        if (callback != null) {
            registerCallback(callback);
        }
        if (context != null) {
            this.c = context.getApplicationContext();
        }
        this.g.init(context, getResFileFolder(context));
        this.k.init(context);
        this.f.lock();
        try {
            if (bioRuntimeDependency == null) {
                return this.p;
            }
            if (this.p != 0) {
                BioLog.d("BioResManager", "init called after inited");
                return this.p;
            }
            this.h.clear();
            this.i.clear();
            if (this.g.isStaticBuild()) {
                this.p = 5;
            } else {
                int checkRes = this.g.checkRes(context, bioRuntimeDependency, this.h, this.j);
                if (checkRes > 0) {
                    this.p = 1;
                } else if (checkRes == 0) {
                    this.p = 3;
                } else if (checkRes == -2) {
                    BioLog.e("BioResManager", "failed to stat file when check res");
                    this.e.obtainMessage(4, 1, checkRes, "failed to stat file when check res").sendToTarget();
                }
            }
            this.f.unlock();
            this.e.obtainMessage(0).sendToTarget();
            return this.p;
        } finally {
            this.f.unlock();
        }
    }

    public int getStatus() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fcf6c362", new Object[]{this})).intValue();
        }
        this.f.lock();
        try {
            return this.p;
        } finally {
            this.f.unlock();
        }
    }

    public void startDownload() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72815e91", new Object[]{this});
            return;
        }
        BioLog.d("BioResManager", "startDownload() called");
        this.f.lock();
        try {
            if (this.p == 1) {
                for (BioDownloadItem bioDownloadItem : this.h) {
                    BioResDownloader.BioDownloadTask startDownload = this.k.startDownload(this.c, bioDownloadItem, this.n);
                    if (startDownload == null) {
                        BioLog.e("BioResManager", "start download failed for file " + bioDownloadItem);
                        this.i.add(bioDownloadItem);
                    } else {
                        BioLog.e("BioResManager", "start download requested for file " + bioDownloadItem);
                        this.l.add(startDownload);
                    }
                }
            } else {
                BioLog.e("BioResManager", "startDownload called in status " + this.p);
            }
        } finally {
            this.f.unlock();
        }
    }

    public void cancelDownload() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48ea64a9", new Object[]{this});
            return;
        }
        ArrayList arrayList = new ArrayList();
        this.f.lock();
        try {
            if (this.p != 2) {
                return;
            }
            arrayList.addAll(this.l);
            this.l.clear();
            this.p = 0;
            this.f.unlock();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((BioResDownloader.BioDownloadTask) it.next()).cancel();
            }
        } finally {
            this.f.unlock();
        }
    }

    public boolean startLoading() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9591a05", new Object[]{this})).booleanValue();
        }
        BioLog.d("BioResManager", "startLoading() called");
        ArrayList arrayList = new ArrayList();
        this.f.lock();
        try {
            if (this.p != 5) {
                if (this.p == 3) {
                    this.p = 4;
                    arrayList.addAll(this.j);
                    Iterator it = arrayList.iterator();
                    boolean z = true;
                    while (it.hasNext()) {
                        BioDownloadItem bioDownloadItem = (BioDownloadItem) it.next();
                        if (this.o.canProcess(bioDownloadItem) && !this.o.process(bioDownloadItem)) {
                            z = false;
                        }
                    }
                    if (z) {
                        this.p = 5;
                        if (this.p == 4) {
                            this.p = -1;
                        }
                    } else {
                        this.p = -1;
                        if (this.p == 4) {
                            this.p = -1;
                        }
                    }
                }
                return false;
            }
            return true;
        } finally {
            this.f.unlock();
        }
    }

    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        cancelDownload();
        this.k.destroy();
    }

    private BioResManager() {
        this.d.start();
        this.e = new ResManangerHandler(this, this.d.getLooper());
        this.g = new BioResCheckerImpl();
        if (this.g.isStaticBuild()) {
            this.p = 5;
        } else {
            this.p = 0;
        }
    }

    private void a(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a99d9bb", new Object[]{this, message});
            return;
        }
        int i = message.what;
        if (i == 0) {
            Iterator<Callback> it = this.q.iterator();
            while (it.hasNext()) {
                it.next().onInitComplete();
            }
            return;
        }
        String str = null;
        if (i == 1) {
            if (message.obj instanceof String) {
                str = (String) message.obj;
            }
            if (str == null) {
                return;
            }
            Iterator<Callback> it2 = this.q.iterator();
            while (it2.hasNext()) {
                it2.next().onDownloadStart(str);
            }
        } else if (i == 2) {
            if (message.obj instanceof String) {
                str = (String) message.obj;
            }
            if (str == null) {
                return;
            }
            Iterator<Callback> it3 = this.q.iterator();
            while (it3.hasNext()) {
                it3.next().onDownloadComplete(str);
            }
        } else if (i == 3) {
            Iterator<Callback> it4 = this.q.iterator();
            while (it4.hasNext()) {
                it4.next().onAllDownloadComplete();
            }
        } else if (i != 4) {
        } else {
            if (message.obj instanceof String) {
                str = (String) message.obj;
            }
            Iterator<Callback> it5 = this.q.iterator();
            while (it5.hasNext()) {
                it5.next().onError(message.arg1, message.arg2, str);
            }
        }
    }
}
