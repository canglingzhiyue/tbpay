package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex.WeexInstance;
import com.taobao.android.weex.WeexInstanceImpl;
import com.taobao.android.weex.WeexValue;
import com.taobao.android.weex.b;
import com.taobao.android.weex.util.c;
import com.taobao.android.weex_framework.bridge.MUSThreadStrategy;
import java.lang.reflect.Method;
import java.lang.reflect.Type;

/* loaded from: classes6.dex */
public class juu<T> implements jus<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Method f29794a;
    private final MUSThreadStrategy b;
    private final Type[] c;
    private final Object d = null;

    static {
        kge.a(606952349);
        kge.a(-2112717634);
    }

    public juu(Method method, MUSThreadStrategy mUSThreadStrategy) {
        this.f29794a = method;
        this.c = method.getGenericParameterTypes();
        this.b = mUSThreadStrategy;
        a(this.c);
    }

    private void a(Type[] typeArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f955f29c", new Object[]{this, typeArr});
        } else if (typeArr != null) {
            for (Type type : typeArr) {
                if (!c.a(type)) {
                    throw new IllegalArgumentException("[WeexMethodInvokable] method " + this.f29794a.getName() + "() arg type: '" + type + "' is not supported");
                }
            }
        }
    }

    @Override // tb.jus
    public Object a(WeexInstance weexInstance, T t, WeexValue[] weexValueArr) throws Exception {
        int length = weexValueArr == null ? 0 : weexValueArr.length;
        Type[] typeArr = this.c;
        int length2 = typeArr.length;
        if (length == 0 && length2 == 0) {
            return this.f29794a.invoke(t, new Object[0]);
        }
        Object[] objArr = new Object[length2];
        for (int i = 0; i < length2; i++) {
            Type type = typeArr[i];
            if (i >= length) {
                if (!type.getClass().isPrimitive()) {
                    objArr[i] = null;
                } else {
                    throw new IllegalArgumentException("[prepareArguments] method argument list not match.");
                }
            } else {
                WeexValue weexValue = weexValueArr[i];
                if (weexValue != null && weexValue.getType() == WeexValue.Type.FUNCTION) {
                    if (type == b.class || type == Object.class) {
                        objArr[i] = new jur(weexInstance, ((Long) weexValue.getValue()).longValue());
                    } else if (type == WeexValue.class) {
                        objArr[i] = weexValue;
                    } else {
                        throw new IllegalArgumentException("[prepareArguments] WeexCallback can't assign to " + type);
                    }
                } else {
                    objArr[i] = c.a(type, weexValue);
                }
            }
        }
        while (length2 < length) {
            WeexValue weexValue2 = weexValueArr[length2];
            if (weexValue2 != null && weexValue2.getType() == WeexValue.Type.FUNCTION) {
                ((WeexInstanceImpl) weexInstance).removeCallback(weexValue2.getFunctionID());
            }
            length2++;
        }
        return this.f29794a.invoke(t, objArr);
    }

    @Override // tb.jus
    public MUSThreadStrategy a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MUSThreadStrategy) ipChange.ipc$dispatch("11e63bff", new Object[]{this}) : this.b;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this}) : this.f29794a.getName();
    }
}
