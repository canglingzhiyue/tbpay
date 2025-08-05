package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taopai2.material.base.b;
import com.taobao.taopai2.material.request.Response;
import java.util.List;
import tb.qff;

/* loaded from: classes8.dex */
public class qfj<T> implements qff.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private b f32913a;
    private List<qff> b;
    private Class<T> c;
    private int d = -1;

    static {
        kge.a(814066625);
        kge.a(329285937);
    }

    public qfj(b bVar, Class<T> cls, List<qff> list) {
        this.f32913a = bVar;
        this.c = cls;
        this.b = list;
    }

    @Override // tb.qff.a
    public Class<T> b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Class) ipChange.ipc$dispatch("6a1d2296", new Object[]{this}) : this.c;
    }

    @Override // tb.qff.a
    public b a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("139ad3b7", new Object[]{this}) : this.f32913a;
    }

    @Override // tb.qff.a
    public Response a(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Response) ipChange.ipc$dispatch("5ca80171", new Object[]{this, bVar});
        }
        this.d++;
        if (this.d >= this.b.size()) {
            return null;
        }
        return this.b.get(this.d).a(this);
    }
}
