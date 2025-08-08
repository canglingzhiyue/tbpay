package com.taobao.aranger.utils;

import android.content.ComponentName;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.aranger.annotation.type.ServiceName;
import com.taobao.aranger.core.ipc.provider.ARangerProvider;
import com.taobao.aranger.core.wrapper.ParameterWrapper;
import com.taobao.aranger.exception.IPCException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import tb.jzv;
import tb.kge;

/* loaded from: classes.dex */
public final class TypeUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1673816173);
    }

    private TypeUtils() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    public static String a(Class<?> cls) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("fe97b16b", new Object[]{cls}) : cls.getName();
    }

    public static String getMethodId(String str, ParameterWrapper[] parameterWrapperArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("868e13c9", new Object[]{str, parameterWrapperArr});
        }
        return str + '(' + a(parameterWrapperArr) + ')';
    }

    private static String b(Class cls, Class[] clsArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("63497964", new Object[]{cls, clsArr});
        }
        return cls.getSimpleName() + '(' + a(clsArr) + ')';
    }

    private static String a(ParameterWrapper[] parameterWrapperArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("eb64d94e", new Object[]{parameterWrapperArr});
        }
        StringBuilder sb = new StringBuilder();
        int length = parameterWrapperArr.length;
        if (length == 0) {
            return sb.toString();
        }
        sb.append(a(parameterWrapperArr[0].getName()));
        for (int i = 1; i < length; i++) {
            sb.append(",");
            sb.append(a(parameterWrapperArr[i].getName()));
        }
        return sb.toString();
    }

    private static String a(Class<?>[] clsArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("983e2af0", new Object[]{clsArr});
        }
        StringBuilder sb = new StringBuilder();
        int length = clsArr.length;
        if (length == 0) {
            return sb.toString();
        }
        sb.append(a(a(clsArr[0])));
        for (int i = 1; i < length; i++) {
            sb.append(",");
            sb.append(a(a(clsArr[i])));
        }
        return sb.toString();
    }

    public static Method a(Class<?> cls, String str, Class<?>[] clsArr, Class<?> cls2) throws IPCException {
        Method[] declaredMethods;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Method) ipChange.ipc$dispatch("c2569f08", new Object[]{cls, str, clsArr, cls2});
        }
        Method method = null;
        for (Method method2 : cls.getDeclaredMethods()) {
            if (method2.getName().equals(str) && a(method2.getParameterTypes(), clsArr)) {
                if (method == null) {
                    method2.setAccessible(true);
                    method = method2;
                } else {
                    throw new IPCException(14, "there are more than one method named " + str + " of the class " + cls.getName() + " matching the parameters!");
                }
            }
        }
        if (method == null) {
            return null;
        }
        if (method.getReturnType() == cls2) {
            return method;
        }
        throw new IPCException(17, "the method named " + str + " of the class " + cls.getName() + " matches the parameter types but not the return type. The return type is " + method.getReturnType().getName() + " but the required type is " + cls2.getName() + ". The method in the local interface must exactly match the method in the remote class.");
    }

    public static Constructor<?> a(Class<?> cls, Class<?>[] clsArr) throws IPCException {
        Constructor[] constructors;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Constructor) ipChange.ipc$dispatch("dddee01a", new Object[]{cls, clsArr});
        }
        String b = b(cls, clsArr);
        Constructor b2 = j.a().b(b);
        if (b2 != null) {
            return b2;
        }
        for (Constructor constructor : cls.getConstructors()) {
            if (a(constructor.getParameterTypes(), clsArr)) {
                if (b2 != null) {
                    throw new IPCException(15, cls.getName() + " has too many constructors whose  parameter types match the required types.");
                }
                j.a().a(b, constructor);
                b2 = constructor;
            }
        }
        if (b2 != null) {
            return b2;
        }
        throw new IPCException(16, "The class " + cls.getName() + " do not have a constructor whose  parameter types match the required types.");
    }

    public static String a(String str, Class<?> cls) throws IPCException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("14a11eb5", new Object[]{str, cls});
        }
        if (!cls.isInterface()) {
            throw new IPCException(20, "only interfaces can be passed as the parameters.");
        }
        if (!StringUtils.isEmpty(str)) {
            return str;
        }
        ServiceName serviceName = (ServiceName) cls.getAnnotation(ServiceName.class);
        if (serviceName == null || StringUtils.isEmpty(serviceName.value())) {
            throw new IPCException(20, "the interfaces must have ServiceName annotation.");
        }
        return serviceName.value();
    }

    public static void a(ComponentName componentName) throws IPCException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26bfdd07", new Object[]{componentName});
        } else if (StringUtils.isEmpty(componentName.getClassName()) || StringUtils.isEmpty(componentName.getPackageName())) {
            throw new IPCException(28, "the package name or provider class name in component is null!");
        } else {
            if (!jzv.a().getPackageName().equals(componentName.getPackageName())) {
                return;
            }
            try {
                if (!ARangerProvider.class.isAssignableFrom(Class.forName(componentName.getClassName()))) {
                    throw new IPCException(20, "Only class extends ARangerProvider can be passed as the parameters.");
                }
            } catch (ClassNotFoundException unused) {
                throw new IPCException(20, "The " + componentName.getClassName() + " class not found, please check the provider class name.");
            }
        }
    }

    public static boolean a(Annotation[] annotationArr, Class<? extends Annotation> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("351aace8", new Object[]{annotationArr, cls})).booleanValue();
        }
        if (annotationArr != null && cls != null) {
            for (Annotation annotation : annotationArr) {
                if (cls.isInstance(annotation)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean a(Class<?> cls, Class<?> cls2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6f9b140c", new Object[]{cls, cls2})).booleanValue() : cls == cls2 || b(cls, cls2) || b(cls2, cls);
    }

    private static boolean b(Class cls, Class cls2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("389c0b4d", new Object[]{cls, cls2})).booleanValue() : (cls == Boolean.class && cls2 == Boolean.TYPE) || (cls == Byte.class && cls2 == Byte.TYPE) || ((cls == Character.class && cls2 == Character.TYPE) || ((cls == Short.class && cls2 == Short.TYPE) || ((cls == Integer.class && cls2 == Integer.TYPE) || ((cls == Long.class && cls2 == Long.TYPE) || ((cls == Float.class && cls2 == Float.TYPE) || ((cls == Double.class && cls2 == Double.TYPE) || (cls == Void.class && cls2 == Void.TYPE)))))));
    }

    private static boolean a(Class<?>[] clsArr, Class<?>[] clsArr2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6b6a90fc", new Object[]{clsArr, clsArr2})).booleanValue();
        }
        if (clsArr.length != clsArr2.length) {
            return false;
        }
        int length = clsArr2.length;
        for (int i = 0; i < length; i++) {
            if (clsArr2[i] != null && !a(clsArr[i], clsArr2[i]) && !clsArr[i].isAssignableFrom(clsArr2[i])) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0045, code lost:
        if (r7.equals("[C") != false) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void a(java.lang.String r7, java.lang.Object r8, java.lang.Object r9) {
        /*
            Method dump skipped, instructions count: 266
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.aranger.utils.TypeUtils.a(java.lang.String, java.lang.Object, java.lang.Object):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0053, code lost:
        if (r6.equals("[B") != false) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int a(java.lang.String r6, java.lang.Object r7) {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.aranger.utils.TypeUtils.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 1
            r3 = 0
            r4 = 2
            if (r1 == 0) goto L1c
            java.lang.Object[] r1 = new java.lang.Object[r4]
            r1[r3] = r6
            r1[r2] = r7
            java.lang.String r6 = "8bb65381"
            java.lang.Object r6 = r0.ipc$dispatch(r6, r1)
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            return r6
        L1c:
            r0 = -1
            int r1 = r6.hashCode()
            r5 = 2891(0xb4b, float:4.051E-42)
            if (r1 == r5) goto L7e
            r5 = 2904(0xb58, float:4.07E-42)
            if (r1 == r5) goto L74
            r5 = 2911(0xb5f, float:4.079E-42)
            if (r1 == r5) goto L6a
            r3 = 2894(0xb4e, float:4.055E-42)
            if (r1 == r3) goto L60
            r3 = 2895(0xb4f, float:4.057E-42)
            if (r1 == r3) goto L56
            switch(r1) {
                case 2887: goto L4d;
                case 2888: goto L43;
                case 2889: goto L39;
                default: goto L38;
            }
        L38:
            goto L88
        L39:
            java.lang.String r1 = "[D"
            boolean r6 = r6.equals(r1)
            if (r6 == 0) goto L88
            r2 = 7
            goto L89
        L43:
            java.lang.String r1 = "[C"
            boolean r6 = r6.equals(r1)
            if (r6 == 0) goto L88
            r2 = 2
            goto L89
        L4d:
            java.lang.String r1 = "[B"
            boolean r6 = r6.equals(r1)
            if (r6 == 0) goto L88
            goto L89
        L56:
            java.lang.String r1 = "[J"
            boolean r6 = r6.equals(r1)
            if (r6 == 0) goto L88
            r2 = 5
            goto L89
        L60:
            java.lang.String r1 = "[I"
            boolean r6 = r6.equals(r1)
            if (r6 == 0) goto L88
            r2 = 4
            goto L89
        L6a:
            java.lang.String r1 = "[Z"
            boolean r6 = r6.equals(r1)
            if (r6 == 0) goto L88
            r2 = 0
            goto L89
        L74:
            java.lang.String r1 = "[S"
            boolean r6 = r6.equals(r1)
            if (r6 == 0) goto L88
            r2 = 3
            goto L89
        L7e:
            java.lang.String r1 = "[F"
            boolean r6 = r6.equals(r1)
            if (r6 == 0) goto L88
            r2 = 6
            goto L89
        L88:
            r2 = -1
        L89:
            switch(r2) {
                case 0: goto Lac;
                case 1: goto La8;
                case 2: goto La4;
                case 3: goto La0;
                case 4: goto L9c;
                case 5: goto L98;
                case 6: goto L94;
                case 7: goto L90;
                default: goto L8c;
            }
        L8c:
            java.lang.Object[] r7 = (java.lang.Object[]) r7
            int r6 = r7.length
            return r6
        L90:
            double[] r7 = (double[]) r7
            int r6 = r7.length
            return r6
        L94:
            float[] r7 = (float[]) r7
            int r6 = r7.length
            return r6
        L98:
            long[] r7 = (long[]) r7
            int r6 = r7.length
            return r6
        L9c:
            int[] r7 = (int[]) r7
            int r6 = r7.length
            return r6
        La0:
            short[] r7 = (short[]) r7
            int r6 = r7.length
            return r6
        La4:
            char[] r7 = (char[]) r7
            int r6 = r7.length
            return r6
        La8:
            byte[] r7 = (byte[]) r7
            int r6 = r7.length
            return r6
        Lac:
            boolean[] r7 = (boolean[]) r7
            int r6 = r7.length
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.aranger.utils.TypeUtils.a(java.lang.String, java.lang.Object):int");
    }

    public static boolean b(Class<?> cls) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a7800278", new Object[]{cls})).booleanValue() : cls == Void.TYPE || cls.equals(Void.TYPE) || com.taobao.android.weex_framework.util.a.ATOM_void.equals(cls.getName());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0072, code lost:
        if (r4.equals("java.lang.Integer") != false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String a(java.lang.String r4) {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.aranger.utils.TypeUtils.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L15
            java.lang.Object[] r1 = new java.lang.Object[r3]
            r1[r2] = r4
            java.lang.String r4 = "9f352ae"
            java.lang.Object r4 = r0.ipc$dispatch(r4, r1)
            java.lang.String r4 = (java.lang.String) r4
            return r4
        L15:
            r0 = -1
            int r1 = r4.hashCode()
            switch(r1) {
                case -2056817302: goto L6b;
                case -527879800: goto L60;
                case -515992664: goto L55;
                case 155276373: goto L4a;
                case 344809556: goto L3f;
                case 398507100: goto L34;
                case 398795216: goto L29;
                case 761287205: goto L1e;
                default: goto L1d;
            }
        L1d:
            goto L75
        L1e:
            java.lang.String r1 = "java.lang.Double"
            boolean r1 = r4.equals(r1)
            if (r1 == 0) goto L75
            r2 = 3
            goto L76
        L29:
            java.lang.String r1 = "java.lang.Long"
            boolean r1 = r4.equals(r1)
            if (r1 == 0) goto L75
            r2 = 2
            goto L76
        L34:
            java.lang.String r1 = "java.lang.Byte"
            boolean r1 = r4.equals(r1)
            if (r1 == 0) goto L75
            r2 = 6
            goto L76
        L3f:
            java.lang.String r1 = "java.lang.Boolean"
            boolean r1 = r4.equals(r1)
            if (r1 == 0) goto L75
            r2 = 1
            goto L76
        L4a:
            java.lang.String r1 = "java.lang.Character"
            boolean r1 = r4.equals(r1)
            if (r1 == 0) goto L75
            r2 = 7
            goto L76
        L55:
            java.lang.String r1 = "java.lang.Short"
            boolean r1 = r4.equals(r1)
            if (r1 == 0) goto L75
            r2 = 4
            goto L76
        L60:
            java.lang.String r1 = "java.lang.Float"
            boolean r1 = r4.equals(r1)
            if (r1 == 0) goto L75
            r2 = 5
            goto L76
        L6b:
            java.lang.String r1 = "java.lang.Integer"
            boolean r1 = r4.equals(r1)
            if (r1 == 0) goto L75
            goto L76
        L75:
            r2 = -1
        L76:
            switch(r2) {
                case 0: goto L92;
                case 1: goto L8f;
                case 2: goto L8b;
                case 3: goto L88;
                case 4: goto L84;
                case 5: goto L80;
                case 6: goto L7d;
                case 7: goto L7a;
                default: goto L79;
            }
        L79:
            return r4
        L7a:
            java.lang.String r4 = "char"
            return r4
        L7d:
            java.lang.String r4 = "byte"
            return r4
        L80:
            java.lang.String r4 = "float"
            return r4
        L84:
            java.lang.String r4 = "short"
            return r4
        L88:
            java.lang.String r4 = "double"
            return r4
        L8b:
            java.lang.String r4 = "long"
            return r4
        L8f:
            java.lang.String r4 = "boolean"
            return r4
        L92:
            java.lang.String r4 = "int"
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.aranger.utils.TypeUtils.a(java.lang.String):java.lang.String");
    }

    public static Method a(Class<?> cls, String str, Class<?>[] clsArr) throws IPCException {
        Method[] declaredMethods;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Method) ipChange.ipc$dispatch("35d22677", new Object[]{cls, str, clsArr});
        }
        Method method = null;
        for (Method method2 : cls.getDeclaredMethods()) {
            String name = method2.getName();
            if (((str.equals("") && name.equals("getInstance")) || (!str.equals("") && name.equals(str))) && a(method2.getParameterTypes(), clsArr)) {
                if (method == null) {
                    method2.setAccessible(true);
                    method = method2;
                } else {
                    throw new IPCException(35, "when getting instance, there are more than one method named " + str + " of the class " + cls.getName() + " matching the parameters!");
                }
            }
        }
        if (method != null) {
            if (method.getReturnType() == cls) {
                return method;
            }
            throw new IPCException(36, "when getting instance, the method named " + str + " of the class " + cls.getName() + " matches the parameter types but not the return type. The return type is " + method.getReturnType().getName() + " but the required type is " + cls.getName() + ".");
        }
        throw new IPCException(37, "when getting instance, the method named " + str + " of the class " + cls.getName() + " is not found. The class must have a method for getting instance.");
    }
}
