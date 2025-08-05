package com.taobao.message.notification.banner.util;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import tb.kge;

/* loaded from: classes7.dex */
public class MergeCallback {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private AllCompleteCallback allCompleteCallback;
    private int count = 0;
    private boolean finish = false;
    private int maxCount;
    private List<MergeCallbackTask> tasks;

    /* loaded from: classes7.dex */
    public interface AllCompleteCallback {
        void onAllComplete();
    }

    /* loaded from: classes7.dex */
    public interface MergeCallbackTask {
        void run(MergeCallback mergeCallback);
    }

    static {
        kge.a(1741319370);
    }

    public MergeCallback(List<MergeCallbackTask> list, AllCompleteCallback allCompleteCallback) {
        this.tasks = list;
        this.maxCount = list.size();
        this.allCompleteCallback = allCompleteCallback;
    }

    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        for (MergeCallbackTask mergeCallbackTask : this.tasks) {
            mergeCallbackTask.run(this);
        }
    }

    public void complete() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e77d7140", new Object[]{this});
            return;
        }
        this.count++;
        if (this.count < this.maxCount || this.finish) {
            return;
        }
        this.finish = true;
        this.allCompleteCallback.onAllComplete();
    }
}
