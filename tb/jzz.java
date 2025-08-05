package tb;

import android.util.Pair;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.aranger.constant.Constants;
import com.taobao.aranger.core.entity.Call;
import com.taobao.aranger.exception.IPCException;
import com.taobao.aranger.intf.IServiceProxy;
import com.taobao.aranger.utils.TypeUtils;
import com.taobao.aranger.utils.f;
import com.taobao.aranger.utils.j;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public class jzz extends jzw {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final String b;
    private static final ConcurrentHashMap<String, Object> i;
    private final String c;
    private Object d;
    private String e;
    private Constructor<?> f;
    private Method g;
    private final Class<?> h;

    static {
        kge.a(-2136068918);
        b = jzz.class.getSimpleName();
        i = new ConcurrentHashMap<>();
    }

    public jzz(Call call) throws IPCException {
        super(call);
        this.c = call.getServiceWrapper().getTimeStamp();
        this.h = j.a().a(call.getServiceWrapper());
        this.d = i.get(this.h.getName());
        if (this.d == null) {
            boolean z = true;
            Class<?> cls = null;
            try {
                j a2 = j.a();
                cls = a2.a(this.h.getName() + Constants.PROXY_SUFFIX);
            } catch (IPCException unused) {
                z = false;
            }
            if (z) {
                this.e = TypeUtils.getMethodId(call.getMethodWrapper().getName(), call.getParameterWrappers());
                this.f = TypeUtils.a(cls, new Class[0]);
                return;
            }
            this.g = TypeUtils.a(this.h, call.getMethodWrapper().getName(), j.a().a(call.getParameterWrappers()));
            if (Modifier.isStatic(this.g.getModifiers())) {
                return;
            }
            throw new IPCException(38, "Method " + this.g.getName() + " of class " + this.h.getName() + " is not static. Only the static method can be invoked to get an instance.");
        }
    }

    @Override // tb.jzw
    public Object a(Object[] objArr) throws IPCException {
        try {
            if (this.d == null) {
                if (this.f != null) {
                    this.d = this.f.newInstance(new Object[0]);
                    ((IServiceProxy) this.d).create(this.e, objArr);
                } else {
                    this.d = this.g.invoke(null, objArr);
                }
                i.putIfAbsent(this.h.getName(), this.d);
            }
            f.a().a(this.c, new Pair<>(this.h, this.d));
            return null;
        } catch (Exception e) {
            kak.a(b, "[GetInstanceReplyHandler][invoke]", e, "timeStamp", this.c);
            if (e instanceof IPCException) {
                throw ((IPCException) e);
            }
            throw new IPCException(24, e);
        }
    }
}
