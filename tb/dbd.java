package tb;

/* loaded from: classes4.dex */
public abstract class dbd implements dbb {
    private boolean isTimeout;

    public dbd(boolean z) {
        this.isTimeout = false;
        this.isTimeout = z;
    }

    public abstract boolean isResultTimeout();

    @Override // tb.dbb
    public final boolean isTimeout() {
        if (!this.isTimeout) {
            return isResultTimeout();
        }
        return true;
    }

    public void setTimeout(boolean z) {
        this.isTimeout = z;
    }
}
