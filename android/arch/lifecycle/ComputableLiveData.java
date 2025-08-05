package android.arch.lifecycle;

import java.util.concurrent.atomic.AtomicBoolean;
import tb.aaw;

/* loaded from: classes2.dex */
public abstract class ComputableLiveData<T> {
    private AtomicBoolean mInvalid = new AtomicBoolean(true);
    private AtomicBoolean mComputing = new AtomicBoolean(false);
    final Runnable mRefreshRunnable = new Runnable() { // from class: android.arch.lifecycle.ComputableLiveData.2
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            boolean z;
            do {
                if (ComputableLiveData.this.mComputing.compareAndSet(false, true)) {
                    Object obj = null;
                    z = false;
                    while (ComputableLiveData.this.mInvalid.compareAndSet(true, false)) {
                        try {
                            obj = ComputableLiveData.this.compute();
                            z = true;
                        } finally {
                            ComputableLiveData.this.mComputing.set(false);
                        }
                    }
                    if (z) {
                        ComputableLiveData.this.mLiveData.postValue(obj);
                    }
                } else {
                    z = false;
                }
                if (!z) {
                    return;
                }
            } while (ComputableLiveData.this.mInvalid.get());
        }
    };
    final Runnable mInvalidationRunnable = new Runnable() { // from class: android.arch.lifecycle.ComputableLiveData.3
        @Override // java.lang.Runnable
        public void run() {
            boolean hasActiveObservers = ComputableLiveData.this.mLiveData.hasActiveObservers();
            if (!ComputableLiveData.this.mInvalid.compareAndSet(false, true) || !hasActiveObservers) {
                return;
            }
            aaw.a().a(ComputableLiveData.this.mRefreshRunnable);
        }
    };
    private final LiveData<T> mLiveData = new LiveData<T>() { // from class: android.arch.lifecycle.ComputableLiveData.1
        @Override // android.arch.lifecycle.LiveData
        protected void onActive() {
            aaw.a().a(ComputableLiveData.this.mRefreshRunnable);
        }
    };

    protected abstract T compute();

    public LiveData<T> getLiveData() {
        return this.mLiveData;
    }

    public void invalidate() {
        aaw.a().c(this.mInvalidationRunnable);
    }
}
