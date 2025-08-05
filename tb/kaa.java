package tb;

import android.util.Pair;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.aranger.core.entity.Call;
import com.taobao.aranger.exception.IPCException;
import com.taobao.aranger.intf.IServiceProxy;
import com.taobao.aranger.utils.TypeUtils;
import com.taobao.aranger.utils.f;
import com.taobao.aranger.utils.j;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public class kaa extends jzw {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final String b;
    private final String c;
    private final Object d;
    private String e;
    private Method f;

    static {
        kge.a(668033562);
        b = kaa.class.getSimpleName();
    }

    public kaa(Call call) throws IPCException {
        super(call);
        this.c = call.getServiceWrapper().getTimeStamp();
        Pair<Class, Object> a2 = f.a().a(this.c);
        if (a2 == null) {
            kak.b(b, "[MethodInvokeReplyHandler][invoke] proxy is null", "timeStamp", this.c);
            throw new IPCException(22, "can't find ipc object proxy");
        }
        Class<?> cls = (Class) a2.first;
        this.d = a2.second;
        if (this.d instanceof IServiceProxy) {
            this.e = TypeUtils.getMethodId(call.getMethodWrapper().getName(), call.getParameterWrappers());
        } else {
            this.f = j.a().a(cls, call.getMethodWrapper(), call.getParameterWrappers());
        }
    }

    @Override // tb.jzw
    public Object a(Object[] objArr) throws IPCException {
        try {
            return this.d instanceof IServiceProxy ? ((IServiceProxy) this.d).invoke(this.e, objArr) : this.f.invoke(this.d, objArr);
        } catch (Exception e) {
            kak.a(b, "[MethodInvokeReplyHandler][invoke]", e, "timeStamp", this.c);
            if (e instanceof IPCException) {
                throw ((IPCException) e);
            }
            throw new IPCException(3, e);
        }
    }
}
