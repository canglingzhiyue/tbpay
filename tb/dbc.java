package tb;

import java.util.concurrent.Callable;

/* loaded from: classes4.dex */
public interface dbc<T> extends Callable<T> {
    T onTimeout();
}
