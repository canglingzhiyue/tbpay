package com.taobao.android.tcrash;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes6.dex */
public class TCrashSDK {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private UncaughtCrashManager mManager;

    /* loaded from: classes6.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static final TCrashSDK f15505a = new TCrashSDK();

        public static /* synthetic */ TCrashSDK a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (TCrashSDK) ipChange.ipc$dispatch("d050f05b", new Object[0]) : f15505a;
        }
    }

    public static TCrashSDK instance() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TCrashSDK) ipChange.ipc$dispatch("cccc408f", new Object[0]) : a.a();
    }

    private TCrashSDK() {
        this.mManager = new b();
    }

    public UncaughtCrashManager getManager() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (UncaughtCrashManager) ipChange.ipc$dispatch("313bd483", new Object[]{this}) : this.mManager;
    }

    public TCrashSDK setUncaughtCrashManager(UncaughtCrashManager uncaughtCrashManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TCrashSDK) ipChange.ipc$dispatch("de335de2", new Object[]{this, uncaughtCrashManager});
        }
        if (uncaughtCrashManager == null) {
            return this;
        }
        this.mManager = uncaughtCrashManager;
        return this;
    }

    public TCrashSDK addJvmUncaughtCrashListener(JvmUncaughtCrashListener jvmUncaughtCrashListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TCrashSDK) ipChange.ipc$dispatch("f408f461", new Object[]{this, jvmUncaughtCrashListener});
        }
        if (jvmUncaughtCrashListener == null) {
            return this;
        }
        this.mManager.addJvmUncaughtCrashListener(jvmUncaughtCrashListener);
        return this;
    }

    public TCrashSDK removeJvmUncaughtCrashListener(JvmUncaughtCrashListener jvmUncaughtCrashListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TCrashSDK) ipChange.ipc$dispatch("f6d7c0c4", new Object[]{this, jvmUncaughtCrashListener});
        }
        if (jvmUncaughtCrashListener == null) {
            return this;
        }
        this.mManager.removeJvmUncaughtCrashListener(jvmUncaughtCrashListener);
        return this;
    }

    public TCrashSDK addAnrUncaughtListener(AnrUncaughtListener anrUncaughtListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TCrashSDK) ipChange.ipc$dispatch("52b982bb", new Object[]{this, anrUncaughtListener});
        }
        if (anrUncaughtListener == null) {
            return this;
        }
        this.mManager.addAnrUncaughtListener(anrUncaughtListener);
        return this;
    }

    public TCrashSDK removeAnrUncaughtListener(AnrUncaughtListener anrUncaughtListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TCrashSDK) ipChange.ipc$dispatch("1646dede", new Object[]{this, anrUncaughtListener});
        }
        if (anrUncaughtListener == null) {
            return this;
        }
        this.mManager.removeAnrUncaughtListener(anrUncaughtListener);
        return this;
    }

    public TCrashSDK addOnFileCreatedListener(UncaughtCrashType uncaughtCrashType, OnFileCreatedListener onFileCreatedListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TCrashSDK) ipChange.ipc$dispatch("24594c65", new Object[]{this, uncaughtCrashType, onFileCreatedListener});
        }
        if (onFileCreatedListener == null) {
            return this;
        }
        this.mManager.addOnFileCreatedListener(uncaughtCrashType, onFileCreatedListener);
        return this;
    }

    public TCrashSDK removeOnFileCreatedListener(UncaughtCrashType uncaughtCrashType, OnFileCreatedListener onFileCreatedListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TCrashSDK) ipChange.ipc$dispatch("425126a2", new Object[]{this, uncaughtCrashType, onFileCreatedListener});
        }
        if (onFileCreatedListener == null) {
            return this;
        }
        this.mManager.removeOnFileCreatedListener(uncaughtCrashType, onFileCreatedListener);
        return this;
    }

    public UncaughtCrashHeader getCrashCaughtHeader() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (UncaughtCrashHeader) ipChange.ipc$dispatch("b77f8adc", new Object[]{this}) : this.mManager.getUncaughtCrashHeader();
    }

    public UncaughtCrashHeader getCrashCaughtHeaderByType(UncaughtCrashType uncaughtCrashType) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (UncaughtCrashHeader) ipChange.ipc$dispatch("4e4d0667", new Object[]{this, uncaughtCrashType}) : this.mManager.getUncaughtCrashHeaderByType(uncaughtCrashType);
    }
}
