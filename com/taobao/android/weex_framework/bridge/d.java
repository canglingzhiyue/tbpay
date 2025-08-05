package com.taobao.android.weex_framework.bridge;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.MUSValue;
import com.taobao.android.weex_framework.p;
import com.taobao.android.weex_framework.ui.MUSNodeProp;
import com.taobao.android.weex_framework.util.k;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import tb.jva;
import tb.jvb;
import tb.kge;

/* loaded from: classes6.dex */
public class d<T> implements c<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Method f15982a;
    private final MUSThreadStrategy b;
    private final Type[] c;
    private final Object d;

    static {
        kge.a(1252893541);
        kge.a(-2127152506);
    }

    public d(Method method, MUSThreadStrategy mUSThreadStrategy) {
        this.f15982a = method;
        this.c = method.getGenericParameterTypes();
        this.b = mUSThreadStrategy;
        this.d = null;
        a(this.c);
    }

    public d(Method method, MUSThreadStrategy mUSThreadStrategy, MUSNodeProp mUSNodeProp) {
        this.f15982a = method;
        this.c = method.getGenericParameterTypes();
        this.b = mUSThreadStrategy;
        Type[] typeArr = this.c;
        if (typeArr.length == 1) {
            if (typeArr[0] == Integer.TYPE) {
                this.d = Integer.valueOf(mUSNodeProp.defaultInt());
            } else if (this.c[0] == Float.TYPE) {
                this.d = Float.valueOf(mUSNodeProp.defaultFloat());
            } else if (this.c[0] == Boolean.TYPE) {
                this.d = Boolean.valueOf(mUSNodeProp.defaultBoolean());
            } else {
                this.d = null;
            }
        } else {
            this.d = null;
        }
        a(this.c);
    }

    public Object b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("43b9c269", new Object[]{this}) : this.d;
    }

    private void a(Type[] typeArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f955f29c", new Object[]{this, typeArr});
        } else if (typeArr != null) {
            for (Type type : typeArr) {
                if (!k.a(type)) {
                    throw new IllegalArgumentException("[MUSMethodInvokable] method " + this.f15982a.getName() + "() arg type: '" + type + "' is not supported");
                }
            }
        }
    }

    @Override // com.taobao.android.weex_framework.bridge.c
    public Object a(MUSDKInstance mUSDKInstance, Object obj, T t, MUSValue[] mUSValueArr) throws Exception {
        int length = mUSValueArr == null ? 0 : mUSValueArr.length;
        Type[] typeArr = this.c;
        int length2 = typeArr.length;
        if (length == 0 && length2 == 0) {
            return this.f15982a.invoke(t, new Object[0]);
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
                MUSValue mUSValue = mUSValueArr[i];
                if (mUSValue != null && mUSValue.isFunction()) {
                    if (type == b.class || type == Object.class) {
                        objArr[i] = new jva((jvb) mUSDKInstance, mUSValue.getFunctionId(), obj);
                    } else if (type == MUSValue.class) {
                        objArr[i] = mUSValue;
                    } else {
                        throw new IllegalArgumentException("[prepareArguments] MUSCallback can't assign to " + type);
                    }
                } else {
                    objArr[i] = k.a(type, mUSValue);
                }
            }
        }
        return this.f15982a.invoke(t, objArr);
    }

    @Override // com.taobao.android.weex_framework.bridge.c
    public Object a(MUSDKInstance mUSDKInstance, T t, MUSValue mUSValue) throws Exception {
        Object obj;
        Type[] typeArr = this.c;
        if (typeArr.length != 1) {
            throw new IllegalArgumentException("[prepareArguments] method argument list not match.");
        }
        Type type = typeArr[0];
        if (MUSValue.isNill(mUSValue) && b() != null) {
            return this.f15982a.invoke(t, b());
        }
        if (mUSValue != null && mUSValue.isFunction()) {
            if (type == b.class || type == Object.class) {
                obj = new jva((jvb) mUSDKInstance, mUSValue.getFunctionId(), null);
            } else {
                obj = mUSValue;
                if (type != MUSValue.class) {
                    throw new IllegalArgumentException("[prepareArguments] MUSCallback can't assign to " + type);
                }
            }
        } else {
            obj = k.a(type, mUSValue);
        }
        return this.f15982a.invoke(t, obj);
    }

    @Override // com.taobao.android.weex_framework.bridge.c
    public Object a(MUSDKInstance mUSDKInstance, T t, Object obj) throws Exception {
        if (this.c.length == 1) {
            return (obj != null || b() == null) ? this.f15982a.invoke(t, obj) : this.f15982a.invoke(t, b());
        }
        throw new IllegalArgumentException("[prepareArguments] method argument list not match.");
    }

    @Override // com.taobao.android.weex_framework.bridge.c
    public MUSThreadStrategy a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MUSThreadStrategy) ipChange.ipc$dispatch("11e63bff", new Object[]{this}) : this.b;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this}) : this.f15982a.getName();
    }

    @Override // com.taobao.android.weex_framework.bridge.c
    public Object a(p pVar, Object obj, T t, MUSValue[] mUSValueArr) throws Exception {
        int length = mUSValueArr == null ? 0 : mUSValueArr.length;
        Type[] typeArr = this.c;
        int length2 = typeArr.length;
        if (length == 0 && length2 == 0) {
            return this.f15982a.invoke(t, new Object[0]);
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
                MUSValue mUSValue = mUSValueArr[i];
                if (mUSValue != null && mUSValue.isFunction()) {
                    if (type == b.class || type == Object.class) {
                        objArr[i] = new jva((jvb) pVar, mUSValue.getFunctionId(), obj);
                    } else if (type == MUSValue.class) {
                        objArr[i] = mUSValue;
                    } else {
                        throw new IllegalArgumentException("[prepareArguments] MUSCallback can't assign to " + type);
                    }
                } else {
                    objArr[i] = k.a(type, mUSValue);
                }
            }
        }
        while (length2 < length) {
            MUSValue mUSValue2 = mUSValueArr[length2];
            if (mUSValue2 != null && mUSValue2.isFunction()) {
                new jva((jvb) pVar, mUSValue2.getFunctionId(), obj).a();
            }
            length2++;
        }
        return this.f15982a.invoke(t, objArr);
    }
}
