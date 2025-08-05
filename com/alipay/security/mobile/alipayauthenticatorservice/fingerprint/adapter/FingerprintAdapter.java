package com.alipay.security.mobile.alipayauthenticatorservice.fingerprint.adapter;

import android.content.Context;
import android.os.Bundle;
import com.alipay.security.mobile.alipayauthenticatorservice.fingerprint.task.FingerprintTask;
import com.alipay.security.mobile.alipayauthenticatorservice.fingerprint.util.FingerprintDataUtil;
import com.alipay.security.mobile.alipayauthenticatorservice.message.MessageCenter;
import com.alipay.security.mobile.auth.AuthenticatorLOG;
import com.alipay.security.mobile.auth.message.AuthenticatorMessage;
import com.alipay.security.mobile.util.BioBehaviorUtils;
import com.alipay.security.mobile.util.TrackEvent;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadFactory;

/* loaded from: classes3.dex */
public class FingerprintAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static FingerprintAdapter sInstance;
    private static Object sInstanceLock = new Object();
    private Context mContext;
    private ExecutorService mExecutor;
    private Future<?> mRunningThread;

    private FingerprintAdapter(Context context) {
        this.mContext = context;
    }

    public static FingerprintAdapter getInstance(Context context) {
        FingerprintAdapter fingerprintAdapter;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FingerprintAdapter) ipChange.ipc$dispatch("3c8e004b", new Object[]{context});
        }
        synchronized (sInstanceLock) {
            if (sInstance == null) {
                sInstance = new FingerprintAdapter(context);
            }
            fingerprintAdapter = sInstance;
        }
        return fingerprintAdapter;
    }

    public synchronized void handleAsyncMessage(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1d80b5a", new Object[]{this, bundle});
            return;
        }
        try {
            closeThread();
            this.mExecutor = null;
            this.mRunningThread = null;
            this.mExecutor = Executors.newSingleThreadExecutor(new ThreadFactory() { // from class: com.alipay.security.mobile.alipayauthenticatorservice.fingerprint.adapter.FingerprintAdapter.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.util.concurrent.ThreadFactory
                public Thread newThread(Runnable runnable) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? (Thread) ipChange2.ipc$dispatch("d8079a58", new Object[]{this, runnable}) : new Thread(runnable, "FingerprintThread");
                }
            });
            this.mRunningThread = this.mExecutor.submit(new FingerprintTask(this.mContext, bundle));
            if (bundle != null) {
                bundle.getInt(AuthenticatorMessage.KEY_OPERATIONT_TYPE);
            }
        } catch (Exception e) {
            AuthenticatorLOG.error(e);
            finishAuth(FingerprintDataUtil.constructResultBundle(6, 101), bundle);
        }
    }

    public synchronized void finishAuth(Bundle bundle, Bundle bundle2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a71909e2", new Object[]{this, bundle, bundle2});
            return;
        }
        if (bundle != null) {
            MessageCenter.sendResponseMessage(this.mContext, bundle);
            int i = bundle.getInt(AuthenticatorMessage.KEY_RESULT);
            int i2 = bundle.getInt(AuthenticatorMessage.KEY_OPERATIONT_TYPE);
            BioBehaviorUtils bioBehaviorUtils = BioBehaviorUtils.getInstance();
            bioBehaviorUtils.add(bundle2, "leave bioSDK with result:" + i);
            BioBehaviorUtils.getInstance().commit(bundle2);
            if ((i2 != 3 && i2 != 9) || i != 102) {
                TrackEvent ins = TrackEvent.getIns();
                ins.event(bundle2, "leave bioSDK with result:" + i);
            }
        }
        closeThread();
    }

    private synchronized void closeThread() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d76121a9", new Object[]{this});
            return;
        }
        try {
            if (this.mRunningThread != null && !this.mRunningThread.isDone()) {
                this.mRunningThread.cancel(true);
            }
        } catch (Exception unused) {
        }
        try {
            if (this.mExecutor != null) {
                this.mExecutor.shutdownNow();
            }
        } catch (Exception unused2) {
        }
        try {
            if (this.mRunningThread != null && this.mRunningThread.isDone()) {
                this.mRunningThread = null;
            }
        } catch (Exception unused3) {
        }
        try {
            if (this.mExecutor != null && this.mExecutor.isTerminated()) {
                this.mExecutor = null;
            }
        } catch (Exception unused4) {
        }
    }
}
