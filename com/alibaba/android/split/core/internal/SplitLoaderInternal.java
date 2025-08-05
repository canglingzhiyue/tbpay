package com.alibaba.android.split.core.internal;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetFileDescriptor;
import android.text.TextUtils;
import android.util.ArrayMap;
import android.util.Log;
import com.alibaba.android.split.a;
import com.alibaba.android.split.ab;
import com.alibaba.android.split.core.install.model.a;
import com.alibaba.android.split.core.splitinstall.SplitInstallException;
import com.alibaba.android.split.core.splitinstall.c;
import com.alibaba.android.split.core.splitinstall.d;
import com.alibaba.android.split.core.splitinstall.p;
import com.alibaba.android.split.j;
import com.alibaba.android.split.k;
import com.alibaba.android.split.scene.f;
import com.alibaba.android.split.scene.l;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.lang.ref.WeakReference;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import tb.bgu;
import tb.bgy;
import tb.bhm;
import tb.kge;
import tb.lsk;

/* loaded from: classes.dex */
public final class SplitLoaderInternal implements ab.a, ab.b, p {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final Context context;
    private String mCurrentActivity;
    private String mCurrentTab;
    private final Executor mExecutor;
    private final SplitApkChecker splitApkChecker;
    private final d splitCompatLoader;
    private final bgy splitFileLogic;
    private LinkedBlockingQueue<SplitLoaderRunnable> mIdleInstallQueue = new LinkedBlockingQueue<>();
    private final ArrayMap<Set<String>, WeakReference<SplitLoaderRunnable>> mFeatureInstallMap = new ArrayMap<>();
    private j monitor = (j) a.a((Class<? extends Object>) j.class, new Object[0]);
    private bgu mLogger = (bgu) a.b(bgu.class, "SplitLoaderInternal");
    private f iScene = l.a();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public interface CopyAndVerifyCallback {
        void onFailure(a.C0084a c0084a);

        void onSuccess();
    }

    static {
        kge.a(638855954);
        kge.a(2018989241);
        kge.a(-1621337058);
        kge.a(1582880670);
    }

    @Override // com.alibaba.android.split.ab.a
    public void onExit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2681a1a4", new Object[]{this});
        }
    }

    @Override // com.alibaba.android.split.ab.a
    public void onForeground() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7f3c09", new Object[]{this});
        }
    }

    public static /* synthetic */ bgy access$000(SplitLoaderInternal splitLoaderInternal) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (bgy) ipChange.ipc$dispatch("d330995a", new Object[]{splitLoaderInternal}) : splitLoaderInternal.splitFileLogic;
    }

    public static /* synthetic */ j access$100(SplitLoaderInternal splitLoaderInternal) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (j) ipChange.ipc$dispatch("66ed9594", new Object[]{splitLoaderInternal}) : splitLoaderInternal.monitor;
    }

    public static /* synthetic */ Context access$200(SplitLoaderInternal splitLoaderInternal) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("74694d8e", new Object[]{splitLoaderInternal}) : splitLoaderInternal.context;
    }

    public static /* synthetic */ LinkedBlockingQueue access$300(SplitLoaderInternal splitLoaderInternal) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (LinkedBlockingQueue) ipChange.ipc$dispatch("1ff4b305", new Object[]{splitLoaderInternal}) : splitLoaderInternal.mIdleInstallQueue;
    }

    public SplitApkChecker getSplitApkChecker() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SplitApkChecker) ipChange.ipc$dispatch("6f0b47fa", new Object[]{this}) : this.splitApkChecker;
    }

    public SplitLoaderInternal(Context context, Executor executor, SplitApkChecker splitApkChecker, bgy bgyVar, d dVar) {
        this.context = context;
        this.splitFileLogic = bgyVar;
        this.splitApkChecker = splitApkChecker;
        this.mExecutor = executor;
        this.splitCompatLoader = dVar;
    }

    @Override // com.alibaba.android.split.core.splitinstall.p
    public final void load(List<Intent> list, c cVar) {
        f fVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("707f8c14", new Object[]{this, list, cVar});
        } else if (!this.splitCompatLoader.a()) {
            throw new IllegalStateException("Ingestion should only be called in SplitCompat mode.");
        } else {
            SplitLoaderRunnable splitLoaderRunnable = new SplitLoaderRunnable(this, list, cVar);
            Set<String> features = getFeatures(list);
            if (TextUtils.isEmpty(this.mCurrentActivity) || (fVar = this.iScene) == null || !fVar.b()) {
                Log.e("SplitLoaderInternal", features + "mCurrentActivity = null :execute directlly");
                this.mExecutor.execute(splitLoaderRunnable);
                return;
            }
            f fVar2 = this.iScene;
            if (fVar2 != null && fVar2.a(this.mCurrentActivity, this.mCurrentTab, (String[]) features.toArray(new String[0]))) {
                Log.e("SplitLoaderInternal", String.format("%s in deps %s tab %s  execute directlly", features, this.mCurrentActivity, this.mCurrentTab));
                this.mExecutor.execute(splitLoaderRunnable);
                return;
            }
            Log.e("SplitLoaderInternal", String.format("%s in not deps  %s  tab %s add idleQueue", features, this.mCurrentActivity, this.mCurrentTab));
            this.mIdleInstallQueue.offer(splitLoaderRunnable);
            this.mFeatureInstallMap.put(features, new WeakReference<>(splitLoaderRunnable));
        }
    }

    public final void load(final String str, AssetFileDescriptor assetFileDescriptor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e28ec814", new Object[]{this, str, assetFileDescriptor});
        } else if (!this.splitCompatLoader.a()) {
            throw new IllegalStateException("Ingestion should only be called in SplitCompat mode.");
        } else {
            try {
                if (this.splitApkChecker.verifySplitApksFromFile(str)) {
                    k.a().a(this.context, false, str);
                    return;
                }
                final long currentTimeMillis = System.currentTimeMillis();
                Log.e(bgu.MODULE, "copyAndVerify:");
                copyAndVerify(str, assetFileDescriptor, new CopyAndVerifyCallback() { // from class: com.alibaba.android.split.core.internal.SplitLoaderInternal.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.alibaba.android.split.core.internal.SplitLoaderInternal.CopyAndVerifyCallback
                    public void onSuccess() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("d0e393ab", new Object[]{this});
                            return;
                        }
                        SplitLoaderInternal.access$100(SplitLoaderInternal.this).a(str, true, "verify", System.currentTimeMillis() - currentTimeMillis, 0, "", SplitLoaderInternal.access$000(SplitLoaderInternal.this).a());
                        try {
                            if (k.a().a(SplitLoaderInternal.access$200(SplitLoaderInternal.this), true, str)) {
                                return;
                            }
                            SplitLoaderInternal.access$100(SplitLoaderInternal.this).a(str, false, "install", 0L, -1, "local install failed", SplitLoaderInternal.access$000(SplitLoaderInternal.this).a());
                        } catch (Exception e) {
                            e.printStackTrace();
                            if (!(e instanceof SplitInstallException)) {
                                return;
                            }
                            SplitLoaderInternal.access$100(SplitLoaderInternal.this).a(str, false, "install", 0L, -1, e.getCause().getMessage(), SplitLoaderInternal.access$000(SplitLoaderInternal.this).a());
                        }
                    }

                    @Override // com.alibaba.android.split.core.internal.SplitLoaderInternal.CopyAndVerifyCallback
                    public void onFailure(a.C0084a c0084a) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("3ff9b9f7", new Object[]{this, c0084a});
                        } else {
                            SplitLoaderInternal.access$100(SplitLoaderInternal.this).a(str, false, "verify", System.currentTimeMillis() - currentTimeMillis, c0084a.f2432a, c0084a.b.toString(), 0L);
                        }
                    }
                });
            } catch (IOException e) {
                e.printStackTrace();
            } catch (Exception e2) {
                throw new RuntimeException(e2);
            }
        }
    }

    public final void copyAndVerify(List<Intent> list, c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d23c279f", new Object[]{this, list, cVar});
            return;
        }
        a.C0084a c0084a = new a.C0084a();
        copySplitApkLock(list, c0084a);
        if (c0084a.f2432a == 0) {
            cVar.e();
        } else {
            cVar.a(10, c0084a.f2432a, c0084a.b.toString());
        }
    }

    public final void copyAndVerify(String str, AssetFileDescriptor assetFileDescriptor, CopyAndVerifyCallback copyAndVerifyCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f44906d4", new Object[]{this, str, assetFileDescriptor, copyAndVerifyCallback});
            return;
        }
        a.C0084a c0084a = new a.C0084a();
        if (copySplitApkLock(str, assetFileDescriptor, c0084a).intValue() == 0 && c0084a.f2432a == 0) {
            if (copyAndVerifyCallback == null) {
                return;
            }
            copyAndVerifyCallback.onSuccess();
        } else if (copyAndVerifyCallback == null) {
        } else {
            copyAndVerifyCallback.onFailure(c0084a);
        }
    }

    private final synchronized Integer copySplitApkLock(String str, AssetFileDescriptor assetFileDescriptor, a.C0084a c0084a) {
        FileChannel channel;
        FileLock fileLock;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("211d8924", new Object[]{this, str, assetFileDescriptor, c0084a});
        }
        Integer num = -13;
        this.mLogger.d("copySplitApkLock:", new Object[0]);
        try {
            channel = new RandomAccessFile(this.splitFileLogic.k(), "rw").getChannel();
            fileLock = null;
        } catch (Exception e) {
            this.mLogger.a(e, "Error locking files.", new Object[0]);
            c0084a.f2432a = -13;
            c0084a.b.append("Error locking files");
        }
        try {
            try {
                fileLock = channel.tryLock();
            } catch (OverlappingFileLockException unused) {
            }
            if (fileLock != null) {
                copySplitApk(str, assetFileDescriptor);
                num = Integer.valueOf(verifyApkFiles(c0084a, Arrays.asList(str)));
            }
            return num;
        } finally {
            if (fileLock != null) {
                fileLock.release();
            }
            if (channel != null) {
                close(channel);
            }
        }
    }

    /* JADX WARN: Not initialized variable reg: 4, insn: 0x005a: MOVE  (r1 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]), block:B:22:0x005a */
    /* JADX WARN: Not initialized variable reg: 4, insn: 0x005d: MOVE  (r1 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]), block:B:24:0x005d */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0094  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Integer copySplitApkLock(java.util.List<android.content.Intent> r8, com.alibaba.android.split.core.install.model.a.C0084a r9) {
        /*
            r7 = this;
            java.lang.String r0 = "Error locking files."
            com.android.alibaba.ip.runtime.IpChange r1 = com.alibaba.android.split.core.internal.SplitLoaderInternal.$ipChange
            boolean r2 = r1 instanceof com.android.alibaba.ip.runtime.IpChange
            r3 = 0
            if (r2 == 0) goto L1d
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r0[r3] = r7
            r2 = 1
            r0[r2] = r8
            r8 = 2
            r0[r8] = r9
            java.lang.String r8 = "84ee9726"
            java.lang.Object r8 = r1.ipc$dispatch(r8, r0)
            java.lang.Integer r8 = (java.lang.Integer) r8
            return r8
        L1d:
            r1 = -13
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            r9.f2432a = r1
            r1 = 0
            java.io.RandomAccessFile r4 = new java.io.RandomAccessFile     // Catch: java.lang.Throwable -> L6a java.lang.Exception -> L6c
            tb.bgy r5 = r7.splitFileLogic     // Catch: java.lang.Throwable -> L6a java.lang.Exception -> L6c
            java.io.File r5 = r5.k()     // Catch: java.lang.Throwable -> L6a java.lang.Exception -> L6c
            java.lang.String r6 = "rw"
            r4.<init>(r5, r6)     // Catch: java.lang.Throwable -> L6a java.lang.Exception -> L6c
            java.nio.channels.FileChannel r4 = r4.getChannel()     // Catch: java.lang.Throwable -> L6a java.lang.Exception -> L6c
            java.nio.channels.FileLock r1 = r4.tryLock()     // Catch: java.lang.Throwable -> L3d java.lang.Throwable -> L3f java.nio.channels.OverlappingFileLockException -> L41
            goto L41
        L3d:
            r8 = move-exception
            goto L53
        L3f:
            r8 = move-exception
            goto L52
        L41:
            if (r1 == 0) goto L5f
            int r8 = r7.copySplitApk(r8, r9)     // Catch: java.lang.Throwable -> L3f
            java.lang.Integer r2 = java.lang.Integer.valueOf(r8)     // Catch: java.lang.Throwable -> L3f
            int r8 = r2.intValue()     // Catch: java.lang.Throwable -> L3f
            r9.f2432a = r8     // Catch: java.lang.Throwable -> L3f
            goto L5f
        L52:
            throw r8     // Catch: java.lang.Throwable -> L3d
        L53:
            if (r1 == 0) goto L58
            r1.release()     // Catch: java.lang.Throwable -> L59 java.lang.Exception -> L5c
        L58:
            throw r8     // Catch: java.lang.Throwable -> L59 java.lang.Exception -> L5c
        L59:
            r8 = move-exception
            r1 = r4
            goto L92
        L5c:
            r8 = move-exception
            r1 = r4
            goto L6d
        L5f:
            if (r1 == 0) goto L64
            r1.release()     // Catch: java.lang.Throwable -> L59 java.lang.Exception -> L5c
        L64:
            if (r4 == 0) goto L91
            close(r4)
            goto L91
        L6a:
            r8 = move-exception
            goto L92
        L6c:
            r8 = move-exception
        L6d:
            java.lang.StringBuilder r9 = r9.b     // Catch: java.lang.Throwable -> L6a
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6a
            r4.<init>()     // Catch: java.lang.Throwable -> L6a
            r4.append(r0)     // Catch: java.lang.Throwable -> L6a
            java.lang.String r5 = r8.getMessage()     // Catch: java.lang.Throwable -> L6a
            r4.append(r5)     // Catch: java.lang.Throwable -> L6a
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L6a
            r9.append(r4)     // Catch: java.lang.Throwable -> L6a
            tb.bgu r9 = r7.mLogger     // Catch: java.lang.Throwable -> L6a
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L6a
            r9.a(r8, r0, r3)     // Catch: java.lang.Throwable -> L6a
            if (r1 == 0) goto L91
            close(r1)
        L91:
            return r2
        L92:
            if (r1 == 0) goto L97
            close(r1)
        L97:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.android.split.core.internal.SplitLoaderInternal.copySplitApkLock(java.util.List, com.alibaba.android.split.core.install.model.a$a):java.lang.Integer");
    }

    public final int copySplitApk(List<Intent> list, a.C0084a c0084a) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("be972027", new Object[]{this, list, c0084a})).intValue();
        }
        ArrayList arrayList = new ArrayList();
        try {
            this.mLogger.d("Copying splits.", new Object[0]);
            for (Intent intent : list) {
                String stringExtra = intent.getStringExtra("split_id");
                if (bhm.a().a(stringExtra) <= 1 || !this.splitFileLogic.c(stringExtra).exists()) {
                    if (intent.getData() == null && this.splitFileLogic.b(stringExtra).exists() && bhm.a().a(stringExtra) == 1) {
                        arrayList.add(stringExtra);
                    } else if (intent.getData() != null) {
                        copySplitApk(stringExtra, this.context.getContentResolver().openAssetFileDescriptor(intent.getData(), "r"));
                        arrayList.add(stringExtra);
                    }
                }
            }
            return verifyApkFiles(c0084a, arrayList);
        } catch (Exception e) {
            this.mLogger.a(e, "Error copying splits.", new Object[0]);
            StringBuilder sb = c0084a.b;
            sb.append("Error copying splits:" + e.getMessage());
            return -13;
        }
    }

    public int verifyApkFiles(a.C0084a c0084a, List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5bec0c4", new Object[]{this, c0084a, list})).intValue();
        }
        try {
            if (!this.splitApkChecker.verifySplitFiles(c0084a, list)) {
                this.mLogger.d("Split verification failed.", new Object[0]);
                c0084a.b.append("Split verification failed.");
                c0084a.f2432a = -11;
                return -11;
            }
            this.mLogger.d("Splits verified.", new Object[0]);
            return 0;
        } catch (Exception e) {
            StringBuilder sb = c0084a.b;
            sb.append("Error verifying splits." + e.getMessage());
            c0084a.f2432a = -11;
            this.mLogger.a(e, "Error verifying splits.", new Object[0]);
            return -11;
        }
    }

    public final void copySplitApk(String str, AssetFileDescriptor assetFileDescriptor) throws IOException {
        BufferedInputStream bufferedInputStream;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4da4dfa3", new Object[]{this, str, assetFileDescriptor});
            return;
        }
        File b = this.splitFileLogic.b(str);
        BufferedInputStream bufferedInputStream2 = null;
        try {
            if ((!b.exists() || b.length() == assetFileDescriptor.getLength()) && (b.exists() || this.splitFileLogic.c(str).exists())) {
                bufferedInputStream = null;
            } else {
                bufferedInputStream = new BufferedInputStream(assetFileDescriptor.createInputStream());
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(b);
                    byte[] bArr = new byte[4096];
                    while (true) {
                        int read = bufferedInputStream.read(bArr);
                        if (read <= 0) {
                            break;
                        }
                        fileOutputStream.write(bArr, 0, read);
                    }
                    close(fileOutputStream);
                } catch (Throwable th) {
                    bufferedInputStream2 = bufferedInputStream;
                    th = th;
                    try {
                        throw th;
                    } finally {
                        assetFileDescriptor.close();
                        close(bufferedInputStream2);
                    }
                }
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final boolean emulate(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6aea29fc", new Object[]{this, cVar})).booleanValue();
        }
        try {
            if (!this.splitCompatLoader.a(this.context, (String[]) cVar.a().g().toArray(new String[0]))) {
                this.mLogger.d("Emulating splits failed.", new Object[0]);
                if (cVar != null) {
                    cVar.a(4, -12, "Emulating splits failed");
                }
                return false;
            }
            this.mLogger.d("Splits installed.", new Object[0]);
            if (cVar != null) {
                cVar.b();
            }
            return true;
        } catch (Exception e) {
            this.mLogger.a(e, "Error emulating splits.", new Object[0]);
            for (Iterator<String> it = cVar.a().g().iterator(); it.hasNext(); it = it) {
                this.monitor.a(it.next(), false, "install", 0L, -1, e.getMessage(), com.alibaba.android.split.core.splitcompat.j.h().i());
            }
            if (cVar != null) {
                cVar.a(4, -12, "Error emulating splits " + e.getMessage());
            }
            return false;
        }
    }

    private static void close(FileChannel fileChannel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f3fa932", new Object[]{fileChannel});
        } else if (fileChannel == null) {
        } else {
            try {
                fileChannel.close();
            } catch (Throwable unused) {
            }
        }
    }

    private static void close(OutputStream outputStream) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72a12b31", new Object[]{outputStream});
        } else if (outputStream == null) {
        } else {
            try {
                outputStream.close();
            } catch (Throwable unused) {
            }
        }
    }

    private static void close(InputStream inputStream) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7157974", new Object[]{inputStream});
        } else if (inputStream == null) {
        } else {
            try {
                inputStream.close();
            } catch (Throwable unused) {
            }
        }
    }

    @Override // com.alibaba.android.split.ab.a
    public void onActivityCreate(String str) {
        SplitLoaderRunnable splitLoaderRunnable;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18625fbb", new Object[]{this, str});
            return;
        }
        Log.e("SplitLoaderInternal", "onActivityCreate:" + str);
        if (this.iScene == null) {
            return;
        }
        this.mCurrentActivity = str;
        this.mCurrentTab = "default";
        if (!TextUtils.isEmpty(this.mCurrentActivity) && this.mCurrentActivity.startsWith("com.taobao.tao.welcome")) {
            this.mCurrentActivity = lsk.BIZ_NAME;
        }
        if (TextUtils.isEmpty(this.mCurrentActivity)) {
            return;
        }
        if (this.mCurrentActivity.equals(lsk.BIZ_NAME)) {
            this.mCurrentTab = "首页";
        }
        List<String> a2 = this.iScene.a(this.mCurrentActivity);
        if (a2 == null || a2.size() == 0) {
            triggerIdleFeatureInstall();
            return;
        }
        for (String str2 : a2) {
            for (int size = this.mFeatureInstallMap.size() - 1; size >= 0; size--) {
                if (this.mFeatureInstallMap.keyAt(size).contains(str2) && (splitLoaderRunnable = this.mFeatureInstallMap.remove(Integer.valueOf(size)).get()) != null) {
                    this.mIdleInstallQueue.remove(splitLoaderRunnable);
                    this.mExecutor.execute(splitLoaderRunnable);
                }
            }
        }
    }

    @Override // com.alibaba.android.split.ab.a
    public void onBackground() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83d13a74", new Object[]{this});
            return;
        }
        Log.e("SplitLoaderInternal", "onBackground triggerIdleFeatureInstall:" + this.mIdleInstallQueue.toString());
        if (this.iScene == null) {
            return;
        }
        this.mCurrentActivity = null;
        triggerIdleFeatureInstall();
    }

    private Set<String> getFeatures(List<Intent> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("5c32825a", new Object[]{this, list});
        }
        HashSet hashSet = new HashSet();
        for (Intent intent : list) {
            hashSet.add(intent.getStringExtra("split_id"));
        }
        return hashSet;
    }

    private void triggerIdleFeatureInstall() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ffdd298", new Object[]{this});
            return;
        }
        Log.e("SplitLoaderInternal", "triggerIdleFeatureInstall:" + this.mIdleInstallQueue.toString());
        this.mExecutor.execute(new Runnable() { // from class: com.alibaba.android.split.core.internal.SplitLoaderInternal.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                while (true) {
                    try {
                        SplitLoaderRunnable splitLoaderRunnable = (SplitLoaderRunnable) SplitLoaderInternal.access$300(SplitLoaderInternal.this).poll();
                        if (splitLoaderRunnable == null) {
                            return;
                        }
                        splitLoaderRunnable.run();
                    } catch (Exception unused) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                }
            }
        });
    }

    @Override // com.alibaba.android.split.ab.b
    public void onTabChanged(int i, String str) {
        WeakReference<SplitLoaderRunnable> removeAt;
        SplitLoaderRunnable splitLoaderRunnable;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91f35fc8", new Object[]{this, new Integer(i), str});
            return;
        }
        this.mCurrentTab = str;
        if (this.iScene == null) {
            return;
        }
        Log.e("SplitLoaderInternal", String.format("onTabChanged:%s:%s", Integer.valueOf(i), str));
        List<String> a2 = l.a().a(this.mCurrentActivity, this.mCurrentTab);
        if (a2 != null && a2.size() > 0) {
            for (String str2 : a2) {
                for (int size = this.mFeatureInstallMap.size() - 1; size >= 0; size--) {
                    if (this.mFeatureInstallMap.keyAt(size).contains(str2) && (removeAt = this.mFeatureInstallMap.removeAt(size)) != null && (splitLoaderRunnable = removeAt.get()) != null) {
                        this.mIdleInstallQueue.remove(splitLoaderRunnable);
                        this.mExecutor.execute(splitLoaderRunnable);
                    }
                }
            }
            return;
        }
        triggerIdleFeatureInstall();
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "SplitLoaderInternal{mCurrentActivity='" + this.mCurrentActivity + "', mCurrentTab='" + this.mCurrentTab + "', mIdleInstallQueue ='" + this.mIdleInstallQueue + "'}";
    }
}
