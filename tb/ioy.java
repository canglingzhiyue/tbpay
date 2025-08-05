package tb;

import anetwork.channel.Request;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.net.e;
import com.taobao.tao.remotebusiness.MtopBusiness;
import java.util.Map;

/* loaded from: classes6.dex */
public abstract class ioy implements iox {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-134615181);
        kge.a(-612899504);
        kge.a(1973400441);
    }

    public abstract void a();

    public abstract void a(long j, Map<String, String> map);

    public abstract void a(e eVar, Map<String, String> map);

    public abstract void a(Object obj, String str);

    public abstract void a(String str);

    public abstract void a(String str, Object obj);

    public abstract void a(String str, Map<String, Object> map);

    public abstract void a(boolean z);

    public abstract void b(Request request);

    public abstract void b(MtopBusiness mtopBusiness, Map<String, String> map);

    public abstract void b(String str, Map<String, Object> map);

    public abstract void b(boolean z);

    public abstract void c(Map<String, String> map);

    public abstract void d();

    public abstract void d(Map<String, String> map);

    public abstract void e(Map<String, String> map);

    public abstract void f(Map<String, String> map);

    public abstract void g(Map<String, String> map);

    public abstract void h(Map<String, String> map);

    public abstract void i(Map<String, String> map);

    @Override // tb.iox
    public void a(MtopBusiness mtopBusiness, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c732297f", new Object[]{this, mtopBusiness, map});
        } else {
            b(mtopBusiness, map);
        }
    }

    @Override // tb.iox
    public void a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
        } else {
            c(map);
        }
    }

    @Override // tb.iox
    public void b(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41e3e87c", new Object[]{this, map});
        } else {
            e(map);
        }
    }

    @Override // tb.iox
    public void a(Request request) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eba284b6", new Object[]{this, request});
        } else {
            b(request);
        }
    }
}
