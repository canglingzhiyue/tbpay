package com.taobao.aranger.utils;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.aranger.core.wrapper.MethodWrapper;
import com.taobao.aranger.core.wrapper.ParameterWrapper;
import com.taobao.aranger.exception.IPCException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.concurrent.ConcurrentHashMap;
import tb.kge;

/* loaded from: classes.dex */
public class j {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static volatile j f16378a;
    private final ConcurrentHashMap<String, Class<?>> b = new ConcurrentHashMap<>();
    private final ConcurrentHashMap<String, ConcurrentHashMap<String, Method>> c = new ConcurrentHashMap<>();
    private final ConcurrentHashMap<String, Constructor<?>> d = new ConcurrentHashMap<>();

    static {
        kge.a(-180327399);
        f16378a = null;
    }

    private j() {
    }

    public static j a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (j) ipChange.ipc$dispatch("59a45bbd", new Object[0]);
        }
        if (f16378a == null) {
            synchronized (j.class) {
                if (f16378a == null) {
                    f16378a = new j();
                }
            }
        }
        return f16378a;
    }

    public Method a(Class<?> cls, MethodWrapper methodWrapper, ParameterWrapper[] parameterWrapperArr) throws IPCException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Method) ipChange.ipc$dispatch("a304cdfe", new Object[]{this, cls, methodWrapper, parameterWrapperArr});
        }
        String methodId = TypeUtils.getMethodId(methodWrapper.getName(), parameterWrapperArr);
        ConcurrentHashMap<String, Method> concurrentHashMap = this.c.get(cls.getName());
        if (concurrentHashMap == null) {
            concurrentHashMap = new ConcurrentHashMap<>();
        }
        Method method = concurrentHashMap.get(methodId);
        if (method != null) {
            return method;
        }
        Method a2 = TypeUtils.a(cls, methodId.substring(0, methodId.indexOf(40)), a(parameterWrapperArr), a(methodWrapper.isVoid() ? com.taobao.android.weex_framework.util.a.ATOM_void : methodWrapper.getReturnType()));
        if (a2 == null) {
            throw new IPCException(12, "Method not found: " + methodId + " in class " + cls.getName());
        }
        concurrentHashMap.putIfAbsent(methodId, a2);
        this.c.putIfAbsent(cls.getName(), concurrentHashMap);
        return a2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0073, code lost:
        if (r6.equals("byte") != false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Class<?> a(java.lang.String r6) throws com.taobao.aranger.exception.IPCException {
        /*
            r5 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.aranger.utils.j.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 1
            r3 = 0
            r4 = 2
            if (r1 == 0) goto L18
            java.lang.Object[] r1 = new java.lang.Object[r4]
            r1[r3] = r5
            r1[r2] = r6
            java.lang.String r6 = "582938df"
            java.lang.Object r6 = r0.ipc$dispatch(r6, r1)
            java.lang.Class r6 = (java.lang.Class) r6
            return r6
        L18:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Class<?>> r0 = r5.b
            java.lang.Object r0 = r0.get(r6)
            java.lang.Class r0 = (java.lang.Class) r0
            if (r0 == 0) goto L23
            return r0
        L23:
            r0 = -1
            int r1 = r6.hashCode()
            switch(r1) {
                case -1325958191: goto L81;
                case 104431: goto L76;
                case 3039496: goto L6d;
                case 3052374: goto L63;
                case 3327612: goto L58;
                case 3625364: goto L4c;
                case 64711720: goto L42;
                case 97526364: goto L37;
                case 109413500: goto L2c;
                default: goto L2b;
            }
        L2b:
            goto L8b
        L2c:
            java.lang.String r1 = "short"
            boolean r1 = r6.equals(r1)
            if (r1 == 0) goto L8b
            r2 = 3
            goto L8c
        L37:
            java.lang.String r1 = "float"
            boolean r1 = r6.equals(r1)
            if (r1 == 0) goto L8b
            r2 = 6
            goto L8c
        L42:
            java.lang.String r1 = "boolean"
            boolean r1 = r6.equals(r1)
            if (r1 == 0) goto L8b
            r2 = 0
            goto L8c
        L4c:
            java.lang.String r1 = "void"
            boolean r1 = r6.equals(r1)
            if (r1 == 0) goto L8b
            r2 = 8
            goto L8c
        L58:
            java.lang.String r1 = "long"
            boolean r1 = r6.equals(r1)
            if (r1 == 0) goto L8b
            r2 = 5
            goto L8c
        L63:
            java.lang.String r1 = "char"
            boolean r1 = r6.equals(r1)
            if (r1 == 0) goto L8b
            r2 = 2
            goto L8c
        L6d:
            java.lang.String r1 = "byte"
            boolean r1 = r6.equals(r1)
            if (r1 == 0) goto L8b
            goto L8c
        L76:
            java.lang.String r1 = "int"
            boolean r1 = r6.equals(r1)
            if (r1 == 0) goto L8b
            r2 = 4
            goto L8c
        L81:
            java.lang.String r1 = "double"
            boolean r1 = r6.equals(r1)
            if (r1 == 0) goto L8b
            r2 = 7
            goto L8c
        L8b:
            r2 = -1
        L8c:
            switch(r2) {
                case 0: goto Lac;
                case 1: goto La9;
                case 2: goto La6;
                case 3: goto La3;
                case 4: goto La0;
                case 5: goto L9d;
                case 6: goto L9a;
                case 7: goto L97;
                case 8: goto L94;
                default: goto L8f;
            }
        L8f:
            java.lang.Class r0 = java.lang.Class.forName(r6)     // Catch: java.lang.ClassNotFoundException -> Lb4
            goto Lae
        L94:
            java.lang.Class r0 = java.lang.Void.TYPE
            goto Lae
        L97:
            java.lang.Class r0 = java.lang.Double.TYPE
            goto Lae
        L9a:
            java.lang.Class r0 = java.lang.Float.TYPE
            goto Lae
        L9d:
            java.lang.Class r0 = java.lang.Long.TYPE
            goto Lae
        La0:
            java.lang.Class r0 = java.lang.Integer.TYPE
            goto Lae
        La3:
            java.lang.Class r0 = java.lang.Short.TYPE
            goto Lae
        La6:
            java.lang.Class r0 = java.lang.Character.TYPE
            goto Lae
        La9:
            java.lang.Class r0 = java.lang.Byte.TYPE
            goto Lae
        Lac:
            java.lang.Class r0 = java.lang.Boolean.TYPE
        Lae:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Class<?>> r1 = r5.b
            r1.putIfAbsent(r6, r0)
            return r0
        Lb4:
            r6 = move-exception
            com.taobao.aranger.exception.IPCException r0 = new com.taobao.aranger.exception.IPCException
            r1 = 21
            r0.<init>(r1, r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.aranger.utils.j.a(java.lang.String):java.lang.Class");
    }

    public Class<?> a(com.taobao.aranger.core.wrapper.a aVar) throws IPCException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("1ea00f05", new Object[]{this, aVar});
        }
        String name = aVar.getName();
        if (!TextUtils.isEmpty(name)) {
            return a(name);
        }
        return null;
    }

    public Class<?>[] a(ParameterWrapper[] parameterWrapperArr) throws IPCException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class[]) ipChange.ipc$dispatch("d382744c", new Object[]{this, parameterWrapperArr});
        }
        if (parameterWrapperArr == null) {
            return new Class[0];
        }
        Class<?>[] clsArr = new Class[parameterWrapperArr.length];
        for (int i = 0; i < parameterWrapperArr.length; i++) {
            clsArr[i] = a(parameterWrapperArr[i]);
        }
        return clsArr;
    }

    public void a(String str, Constructor constructor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("367f65db", new Object[]{this, str, constructor});
        } else {
            this.d.putIfAbsent(str, constructor);
        }
    }

    public Constructor b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Constructor) ipChange.ipc$dispatch("21f50130", new Object[]{this, str});
        }
        if (!this.d.containsKey(str)) {
            return null;
        }
        return this.d.get(str);
    }
}
