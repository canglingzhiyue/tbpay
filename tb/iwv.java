package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.shake.api.c;

/* loaded from: classes6.dex */
public class iwv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Context f29390a;
    private final c.b b;
    private final c.a c;

    static {
        kge.a(1541820921);
    }

    public iwv(Context context, c.b bVar, c.a aVar) {
        this.f29390a = context;
        this.b = bVar;
        this.c = aVar;
    }

    public Context a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("75941360", new Object[]{this}) : this.f29390a;
    }

    public c.b b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c.b) ipChange.ipc$dispatch("83c2914c", new Object[]{this}) : this.b;
    }

    public c.a c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c.a) ipChange.ipc$dispatch("e5152dcc", new Object[]{this}) : this.c;
    }
}
