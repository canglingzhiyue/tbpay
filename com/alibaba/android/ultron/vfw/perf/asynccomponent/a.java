package com.alibaba.android.ultron.vfw.perf.asynccomponent;

import android.support.v7.widget.RecyclerView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.task.Coordinator;
import com.taobao.android.ultron.common.utils.UnifyLog;
import tb.kge;

/* loaded from: classes2.dex */
public class a extends RecyclerView.OnScrollListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Coordinator.TaggedRunnable f2720a;
    private boolean b;
    private boolean c;

    static {
        kge.a(1993122269);
    }

    public a(Coordinator.TaggedRunnable taggedRunnable, boolean z) {
        this.c = false;
        this.f2720a = taggedRunnable;
        this.b = z;
        this.c = false;
    }

    @Override // android.support.v7.widget.RecyclerView.OnScrollListener
    public void onScrollStateChanged(RecyclerView recyclerView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7fb6f2bf", new Object[]{this, recyclerView, new Integer(i)});
        } else if (this.f2720a == null) {
            UnifyLog.b(PreloadAsyncComponent.TAG, "onScrollStateChanged mLoadAllRunnable is null");
        } else if (this.c) {
        } else {
            if (!(i != 1)) {
                return;
            }
            this.c = true;
            UnifyLog.b(PreloadAsyncComponent.TAG, "onScrollStateChanged triger mLoadAllRunnable run when userFingerOffTheScreen mAsyncSendCreateEvent=" + this.b);
            if (this.b) {
                Coordinator.postTask(this.f2720a);
            } else {
                this.f2720a.run();
            }
        }
    }
}
