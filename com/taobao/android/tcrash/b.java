package com.taobao.android.tcrash;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes6.dex */
public class b implements UncaughtCrashManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{str, str2});
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65d7b87d", new Object[]{str, str2});
        }
    }

    @Override // com.taobao.android.tcrash.UncaughtCrashManager
    public void addAnrUncaughtListener(AnrUncaughtListener anrUncaughtListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("755eaec8", new Object[]{this, anrUncaughtListener});
        }
    }

    @Override // com.taobao.android.tcrash.UncaughtCrashManager
    public void addJvmUncaughtCrashListener(JvmUncaughtCrashListener jvmUncaughtCrashListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7610fb6e", new Object[]{this, jvmUncaughtCrashListener});
        }
    }

    @Override // com.taobao.android.tcrash.UncaughtCrashManager
    public void addOnFileCreatedListener(UncaughtCrashType uncaughtCrashType, OnFileCreatedListener onFileCreatedListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e87f0572", new Object[]{this, uncaughtCrashType, onFileCreatedListener});
        }
    }

    @Override // com.taobao.android.tcrash.UncaughtCrashManager
    public void removeAnrUncaughtListener(AnrUncaughtListener anrUncaughtListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7894e06b", new Object[]{this, anrUncaughtListener});
        }
    }

    @Override // com.taobao.android.tcrash.UncaughtCrashManager
    public void removeJvmUncaughtCrashListener(JvmUncaughtCrashListener jvmUncaughtCrashListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19bbd51", new Object[]{this, jvmUncaughtCrashListener});
        }
    }

    @Override // com.taobao.android.tcrash.UncaughtCrashManager
    public void removeOnFileCreatedListener(UncaughtCrashType uncaughtCrashType, OnFileCreatedListener onFileCreatedListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7d9ba2f", new Object[]{this, uncaughtCrashType, onFileCreatedListener});
        }
    }

    @Override // com.taobao.android.tcrash.UncaughtCrashManager
    public UncaughtCrashHeader getUncaughtCrashHeader() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (UncaughtCrashHeader) ipChange.ipc$dispatch("d410a0ab", new Object[]{this}) : $$Lambda$b$GGllTWBFVmSO6HYOPzyUZ_d60E.INSTANCE;
    }

    @Override // com.taobao.android.tcrash.UncaughtCrashManager
    public UncaughtCrashHeader getUncaughtCrashHeaderByType(UncaughtCrashType uncaughtCrashType) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (UncaughtCrashHeader) ipChange.ipc$dispatch("f8eaa438", new Object[]{this, uncaughtCrashType}) : $$Lambda$b$OPtAtn_M07zK7gUGT8tb5oNpuig.INSTANCE;
    }
}
