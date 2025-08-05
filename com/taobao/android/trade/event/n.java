package com.taobao.android.trade.event;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes6.dex */
public final class n {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private m f15626a;
    private m b;

    static {
        kge.a(581369037);
    }

    public synchronized void a(m mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f7bd47d", new Object[]{this, mVar});
        } else if (mVar == null) {
            throw new NullPointerException("null cannot be enqueued");
        } else {
            if (this.b != null) {
                this.b.d = mVar;
                this.b = mVar;
            } else if (this.f15626a == null) {
                this.b = mVar;
                this.f15626a = mVar;
            } else {
                throw new IllegalStateException("Head present, but no tail");
            }
            notifyAll();
        }
    }

    public synchronized m a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (m) ipChange.ipc$dispatch("1cc17e43", new Object[]{this});
        }
        m mVar = this.f15626a;
        if (this.f15626a != null) {
            this.f15626a = this.f15626a.d;
            if (this.f15626a == null) {
                this.b = null;
            }
        }
        return mVar;
    }

    public synchronized m a(int i) throws InterruptedException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (m) ipChange.ipc$dispatch("68e14970", new Object[]{this, new Integer(i)});
        }
        if (this.f15626a == null) {
            wait(i);
        }
        return a();
    }
}
