package tao.reactivex.h;

import com.android.alibaba.ip.runtime.IpChange;
import tao.reactivex.e;
import tao.reactivex.j;
import tb.kge;

/* loaded from: classes9.dex */
public abstract class c<T> extends e<T> implements j<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1964951391);
        kge.a(-605775859);
    }

    public final c<T> d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("7588415d", new Object[]{this}) : this instanceof b ? this : new b(this);
    }
}
