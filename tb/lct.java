package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.subservice.ISubService;

/* loaded from: classes.dex */
public class lct implements ljs {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final ljs f30480a;
    private final Class<?> b;

    static {
        kge.a(-2081181040);
        kge.a(778708513);
    }

    public lct(ljs ljsVar, Class<?> cls) {
        this.f30480a = ljsVar;
        this.b = cls;
    }

    @Override // tb.ljs
    public ljr a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ljr) ipChange.ipc$dispatch("f0758ea", new Object[]{this}) : this.f30480a.a();
    }

    @Override // tb.ljs
    public <T extends ISubService> T a(Class<T> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("1eb717ab", new Object[]{this, cls});
        }
        T t = (T) this.f30480a.a(cls);
        if (t != null && lcz.b()) {
            ldf.e("InfoFlowContextWrapper", "服务：" + this.b.getSimpleName() + " 查找服务 ： " + t.getClass().getSimpleName());
        }
        return t;
    }
}
