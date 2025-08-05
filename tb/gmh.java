package tb;

import android.support.v4.util.LongSparseArray;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.bn;
import com.taobao.android.dinamicx.widget.ak;

/* loaded from: classes5.dex */
public class gmh implements gmi {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(671032030);
        kge.a(-131813709);
    }

    @Override // tb.gmi
    public LongSparseArray<ak> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LongSparseArray) ipChange.ipc$dispatch("211a79d8", new Object[]{this});
        }
        return null;
    }

    @Override // tb.gmi
    public LongSparseArray<fut> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LongSparseArray) ipChange.ipc$dispatch("bbbb3c59", new Object[]{this});
        }
        return null;
    }

    @Override // tb.gmi
    public LongSparseArray<bn> c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LongSparseArray) ipChange.ipc$dispatch("565bfeda", new Object[]{this});
        }
        return null;
    }

    @Override // tb.gmi
    public LongSparseArray<dln> d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LongSparseArray) ipChange.ipc$dispatch("f0fcc15b", new Object[]{this});
        }
        return null;
    }

    public gmh(String str) {
    }
}
