package android.arch.lifecycle;

import tb.aaz;

/* loaded from: classes2.dex */
public class Transformations {
    private Transformations() {
    }

    public static <X, Y> LiveData<Y> map(LiveData<X> liveData, final aaz<X, Y> aazVar) {
        final MediatorLiveData mediatorLiveData = new MediatorLiveData();
        mediatorLiveData.addSource(liveData, new Observer<X>() { // from class: android.arch.lifecycle.Transformations.1
            @Override // android.arch.lifecycle.Observer
            public void onChanged(X x) {
                MediatorLiveData.this.setValue(aazVar.a(x));
            }
        });
        return mediatorLiveData;
    }

    public static <X, Y> LiveData<Y> switchMap(LiveData<X> liveData, final aaz<X, LiveData<Y>> aazVar) {
        final MediatorLiveData mediatorLiveData = new MediatorLiveData();
        mediatorLiveData.addSource(liveData, new Observer<X>() { // from class: android.arch.lifecycle.Transformations.2
            LiveData<Y> mSource;

            @Override // android.arch.lifecycle.Observer
            public void onChanged(X x) {
                LiveData<Y> liveData2 = (LiveData) aaz.this.a(x);
                Object obj = this.mSource;
                if (obj == liveData2) {
                    return;
                }
                if (obj != null) {
                    mediatorLiveData.removeSource(obj);
                }
                this.mSource = liveData2;
                Object obj2 = this.mSource;
                if (obj2 == null) {
                    return;
                }
                mediatorLiveData.addSource(obj2, new Observer<Y>() { // from class: android.arch.lifecycle.Transformations.2.1
                    @Override // android.arch.lifecycle.Observer
                    public void onChanged(Y y) {
                        mediatorLiveData.setValue(y);
                    }
                });
            }
        });
        return mediatorLiveData;
    }
}
