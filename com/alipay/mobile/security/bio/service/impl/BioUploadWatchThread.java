package com.alipay.mobile.security.bio.service.impl;

import android.os.Handler;
import android.os.Looper;
import com.alipay.mobile.security.bio.exception.BioIllegalArgumentException;
import com.alipay.mobile.security.bio.service.BioServiceManager;
import com.alipay.mobile.security.bio.service.BioUploadCallBack;
import com.alipay.mobile.security.bio.service.BioUploadItem;
import com.alipay.mobile.security.bio.service.BioUploadResult;
import com.alipay.mobile.security.bio.thread.WatchThread;
import com.alipay.mobile.security.bio.utils.BioLog;
import com.alipay.mobile.security.bio.workspace.Env;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public class BioUploadWatchThread extends WatchThread {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private BlockingQueue<BioUploadItem> f5815a;
    private BioUploadGW b;
    private List<BioUploadCallBack> c;
    private AtomicBoolean d;
    private AtomicBoolean e;
    public Handler mMainHandle;

    public static /* synthetic */ Object ipc$super(BioUploadWatchThread bioUploadWatchThread, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ void a(BioUploadWatchThread bioUploadWatchThread, BioUploadResult bioUploadResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("adee8995", new Object[]{bioUploadWatchThread, bioUploadResult});
        } else {
            bioUploadWatchThread.a(bioUploadResult);
        }
    }

    public synchronized void addBioUploadCallBack(BioUploadCallBack bioUploadCallBack) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d3698cf", new Object[]{this, bioUploadCallBack});
            return;
        }
        BioLog.d("BioUploadWatchThread.addBioUploadCallBack(): callBack=" + bioUploadCallBack);
        if (!this.c.contains(bioUploadCallBack)) {
            this.c.add(bioUploadCallBack);
        }
    }

    public BioUploadWatchThread(String str, BioServiceManager bioServiceManager) {
        super(str);
        this.f5815a = new LinkedBlockingQueue(5);
        this.c = new ArrayList();
        this.e = new AtomicBoolean(false);
        if (bioServiceManager == null) {
            throw new BioIllegalArgumentException("BioServiceManager can't be null.");
        }
        try {
            Constructor<?> constructor = Class.forName(Env.getProtocolFormat(bioServiceManager.getBioApplicationContext()) != 2 ? "com.alipay.mobile.security.bio.service.impl.BioUploadJsonGWImpl" : "com.alipay.mobile.security.bio.service.impl.BioUploadPBGWImpl").getConstructor(BioServiceManager.class);
            constructor.setAccessible(true);
            this.b = (BioUploadGW) constructor.newInstance(bioServiceManager);
        } catch (Throwable th) {
            BioLog.e(th);
        }
        this.mMainHandle = new Handler(Looper.getMainLooper());
    }

    @Override // com.alipay.mobile.security.bio.thread.WatchThread
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        try {
            if (c()) {
                BioLog.e("BioUploadWatchThread.task, already uploaded and quit");
                return;
            }
            BioUploadItem poll = this.f5815a.poll(50L, TimeUnit.SECONDS);
            BioLog.e("BioUploadWatchThread.task(1), mClearUpFlag=" + this.d + ", request=" + poll);
            if (poll == null) {
                return;
            }
            this.d.set(false);
            final BioUploadResult upload = this.b.upload(poll);
            BioLog.e("BioUploadWatchThread.task(2), mClearUpFlag=" + this.d);
            if (this.d.getAndSet(false)) {
                BioLog.e("BioUploadWatchThread.task(2.5), mClearUpFlag=" + this.d + ", return.");
            } else if (this.c.isEmpty() || upload == null || this.mMainHandle == null || !poll.isNeedSendResponse) {
            } else {
                BioLog.e("BioUploadWatchThread.task(3)");
                this.mMainHandle.post(new Runnable() { // from class: com.alipay.mobile.security.bio.service.impl.BioUploadWatchThread.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        BioLog.e("BioUploadWatchThread.doCallback()");
                        BioUploadWatchThread.a(BioUploadWatchThread.this, upload);
                    }
                });
            }
        } catch (Exception e) {
            BioLog.e(e);
        }
    }

    public boolean isFulled() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("7004e1c3", new Object[]{this})).booleanValue() : this.f5815a.size() >= 5;
    }

    public void addBioUploadItem(BioUploadItem bioUploadItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea65d68f", new Object[]{this, bioUploadItem});
            return;
        }
        try {
            boolean add = this.f5815a.add(bioUploadItem);
            BioLog.e("BioUploadWatchThread.addBioUploadItem(), isAddSuc=" + add + ", item=" + bioUploadItem);
            if (add) {
                return;
            }
            this.mMainHandle.post(new Runnable() { // from class: com.alipay.mobile.security.bio.service.impl.BioUploadWatchThread.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    BioUploadResult bioUploadResult = new BioUploadResult();
                    bioUploadResult.productRetCode = 4001;
                    BioUploadWatchThread.a(BioUploadWatchThread.this, bioUploadResult);
                }
            });
        } catch (IllegalStateException e) {
            BioLog.e(e);
        }
    }

    private synchronized void a(BioUploadResult bioUploadResult) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33d9396b", new Object[]{this, bioUploadResult});
            return;
        }
        Iterator<BioUploadCallBack> it = this.c.iterator();
        while (it.hasNext() && !z) {
            z = it.next().onResponse(bioUploadResult);
        }
    }

    public void release() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca5510e", new Object[]{this});
            return;
        }
        this.c.clear();
        BioLog.d("BioUploadWatchThread.release() => clearBioUploadCallBacks()");
        this.f5815a.clear();
        this.b = null;
        kill();
    }

    public boolean isEmpty() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f187dd4e", new Object[]{this})).booleanValue();
        }
        BlockingQueue<BioUploadItem> blockingQueue = this.f5815a;
        return blockingQueue == null || blockingQueue.isEmpty();
    }

    public synchronized void clearBioUploadCallBacks() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c4cfa39", new Object[]{this});
            return;
        }
        if (this.d == null) {
            this.d = new AtomicBoolean(false);
        } else {
            this.d.set(true);
        }
        BioLog.w("BioUploadWatchThread.clearBioUploadCallBacks(), mClearUpFlag=" + this.d);
        this.c.clear();
    }

    public void clearUploadItems() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54aacd39", new Object[]{this});
            return;
        }
        BioLog.w("BioUploadWatchThread.clearUploadItems()");
        this.f5815a.clear();
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            this.e.set(true);
        }
    }

    private boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue();
        }
        if (!this.f5815a.isEmpty() || !this.e.get()) {
            return false;
        }
        release();
        this.e.set(false);
        return true;
    }
}
