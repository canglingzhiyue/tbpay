package tao.reactivex.d.h;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import tb.jgn;

/* loaded from: classes9.dex */
public enum b implements Callable<List<Object>>, jgn<Object, List<Object>> {
    INSTANCE;

    public static <T> Callable<List<T>> a() {
        return INSTANCE;
    }

    @Override // tb.jgn
    /* renamed from: a */
    public List<Object> apply(Object obj) {
        return new ArrayList();
    }

    @Override // java.util.concurrent.Callable
    /* renamed from: b */
    public List<Object> call() {
        return new ArrayList();
    }
}
