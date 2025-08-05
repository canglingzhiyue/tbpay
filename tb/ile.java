package tb;

import android.util.SparseArray;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.resourceguardian.data.model.a;
import com.taobao.android.resourceguardian.data.model.b;
import tb.ilj;

/* loaded from: classes6.dex */
public class ile implements ilj.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final SparseArray<a> f29132a = new SparseArray<>();
    private final ili b;

    static {
        kge.a(1209664317);
        kge.a(1853984502);
    }

    private int a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a821938e", new Object[]{this, new Integer(i)})).intValue();
        }
        if (i == 101) {
            return 6;
        }
        if (i == 201) {
            return 3;
        }
        if (i == 202) {
            return 9;
        }
        if (i == 401) {
            return 2;
        }
        if (i == 402) {
            return 5;
        }
        return i;
    }

    public ile(iln ilnVar, ili iliVar) {
        ilnVar.a(4, this);
        ilnVar.a(1, this);
        ilnVar.a(2, this);
        this.b = iliVar;
    }

    @Override // tb.ilj.a
    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("733f7c64", new Object[]{this, aVar});
        } else {
            this.f29132a.put(aVar.b, aVar);
        }
    }

    public b a(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("edd1cd96", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
        }
        a aVar = this.f29132a.get(a(i2));
        if (aVar == null) {
            ilt.a("PerformanceStorageController", "getPerformanceInfo failed, type:" + i2 + " not found");
            return null;
        } else if (aVar.f14877a == i) {
            return this.b.b(aVar);
        } else {
            ilt.a("PerformanceStorageController", "getPerformanceInfo failed, type:" + i2 + " category:" + i + " not match");
            return null;
        }
    }
}
