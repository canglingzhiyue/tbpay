package tb;

import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public class crl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Object f26473a;
    private String b;
    private Integer c;
    private boolean d;

    static {
        kge.a(-1418628257);
    }

    public crl() {
        this(null, null, 3, null);
    }

    public crl(String str, Integer num) {
        this.b = str;
        this.c = num;
    }

    public final String e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this}) : this.b;
    }

    public /* synthetic */ crl(String str, Integer num, int i, o oVar) {
        this((i & 1) != 0 ? "Unknown" : str, (i & 2) != 0 ? 1 : num);
    }

    public final void a(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6251244", new Object[]{this, obj});
        } else {
            this.f26473a = obj;
        }
    }

    public final Object c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("ca3f7d08", new Object[]{this}) : this.f26473a;
    }

    public final void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.d = z;
        }
    }

    public final boolean f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[]{this})).booleanValue() : this.d;
    }

    public final boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue();
        }
        Integer num = this.c;
        return num != null && num.intValue() == 1;
    }
}
