package tb;

import com.nirvana.tools.requestqueue.strategy.ThreadStrategy;
import tb.dbb;

/* loaded from: classes4.dex */
public abstract class dax<T extends dbb> {
    protected long mExpiredTime = 0;
    protected ThreadStrategy mThreadStrategy;
    protected long mThreshold;

    public dax(ThreadStrategy threadStrategy, long j) {
        this.mThreadStrategy = null;
        this.mThreshold = 0L;
        this.mThreadStrategy = threadStrategy;
        this.mThreshold = j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public long getExpiredTime() {
        return this.mExpiredTime;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ThreadStrategy getThreadStrategy() {
        return this.mThreadStrategy;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public long getThreshold() {
        return this.mThreshold;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void onResult(T t);

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setExpiredTime(long j) {
        this.mExpiredTime = j;
    }
}
