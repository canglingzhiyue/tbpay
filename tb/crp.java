package tb;

import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class crp {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private volatile String f26476a;
    private volatile Integer[] b;

    static {
        kge.a(1632464034);
    }

    public crp() {
        this(null, null, 3, null);
    }

    public crp(String str, Integer[] numArr) {
        this.f26476a = str;
        this.b = numArr;
    }

    public /* synthetic */ crp(String str, Integer[] numArr, int i, o oVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : numArr);
    }

    public final String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.f26476a;
    }

    public final Integer[] b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Integer[]) ipChange.ipc$dispatch("d9ac5f4f", new Object[]{this}) : this.b;
    }
}
