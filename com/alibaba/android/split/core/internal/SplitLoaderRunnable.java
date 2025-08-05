package com.alibaba.android.split.core.internal;

import android.content.Intent;
import com.alibaba.android.split.a;
import com.alibaba.android.split.core.splitinstall.c;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashSet;
import java.util.List;
import tb.bgu;
import tb.kge;

/* loaded from: classes2.dex */
public final class SplitLoaderRunnable implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final c excuteResultSenderProxy;
    private final List<Intent> intents;
    private bgu mLogger = (bgu) a.b(bgu.class, "SplitLoaderRunnable");
    private final SplitLoaderInternal splitLoaderInternal;

    static {
        kge.a(897857394);
        kge.a(-1390502639);
    }

    public List<Intent> getIntents() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("92f4f81f", new Object[]{this}) : this.intents;
    }

    public SplitLoaderRunnable(SplitLoaderInternal splitLoaderInternal, List<Intent> list, c cVar) {
        this.splitLoaderInternal = splitLoaderInternal;
        this.intents = list;
        this.excuteResultSenderProxy = cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        try {
            this.mLogger.d("begain verified files.", new Object[0]);
            boolean verifySplitApksFromIntent = this.splitLoaderInternal.getSplitApkChecker().verifySplitApksFromIntent(this.intents);
            this.mLogger.d("after verified files--->:%s", Boolean.valueOf(verifySplitApksFromIntent));
            if (verifySplitApksFromIntent) {
                HashSet hashSet = new HashSet();
                for (Intent intent : this.intents) {
                    hashSet.add(intent.getStringExtra("split_id"));
                }
                this.splitLoaderInternal.emulate(this.excuteResultSenderProxy);
                return;
            }
            this.excuteResultSenderProxy.d();
            this.splitLoaderInternal.copyAndVerify(this.intents, this.excuteResultSenderProxy);
        } catch (Exception e) {
            this.mLogger.a(e, "Error checking verified files.", new Object[0]);
            this.excuteResultSenderProxy.a(10, -11, "Error checking verified files");
        }
    }
}
