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

/* loaded from: classes.dex */
public class kab extends jzw {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final String b;
    private final String c;
    private final Class d;
    private String e;
    private Constructor<?> f;
    private Constructor<?> g;

    static {
        kge.a(-1378599404);
        b = kab.class.getSimpleName();
    }

    public kab(Call call) throws IPCException {
        super(call);
        Class<?> cls;
        boolean z;
        this.c = call.getServiceWrapper().getTimeStamp();
        this.d = j.a().a(call.getServiceWrapper());
        try {
            j a2 = j.a();
            cls = a2.a(this.d.getName() + Constants.PROXY_SUFFIX);
            z = true;
        } catch (IPCException unused) {
            cls = null;
            z = false;
        }
        if (z) {
            this.e = TypeUtils.getMethodId(this.d.getSimpleName(), call.getParameterWrappers());
            this.f = TypeUtils.a(cls, new Class[0]);
            return;
        }
        this.g = TypeUtils.a(this.d, j.a().a(call.getParameterWrappers()));
    }

    @Override // tb.jzw
    public Object a(Object[] objArr) throws IPCException {
        Object newInstance;
        try {
            if (this.f != null) {
                newInstance = this.f.newInstance(new Object[0]);
                ((IServiceProxy) newInstance).create(this.e, objArr);
            } else if (objArr.length == 0) {
                newInstance = this.g.newInstance(new Object[0]);
            } else {
                newInstance = this.g.newInstance(objArr);
            }
            f.a().a(this.c, new Pair<>(this.d, newInstance));
            return null;
        } catch (Exception e) {
            kak.a(b, "[NewInstanceReplyHandler][invoke]", e, "timeStamp", this.c);
            if (e instanceof IPCException) {
                throw ((IPCException) e);
            }
            throw new IPCException(23, e);
        }
    }
}
