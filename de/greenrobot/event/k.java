package de.greenrobot.event;

import com.alipay.android.msp.constants.MspFlybirdDefine;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes9.dex */
public class k {

    /* renamed from: a  reason: collision with root package name */
    private static final Map<String, List<j>> f24779a = new HashMap();
    private final Map<Class<?>, Class<?>> b = new ConcurrentHashMap();

    /* JADX INFO: Access modifiers changed from: package-private */
    public k(List<Class<?>> list) {
        if (list != null) {
            for (Class<?> cls : list) {
                this.b.put(cls, cls);
            }
        }
    }

    private ThreadMode a(Class<?> cls, Method method, String str) {
        String substring = str.substring(7);
        if (substring.length() == 0) {
            return ThreadMode.PostThread;
        }
        if (substring.equals("MainThread")) {
            return ThreadMode.MainThread;
        }
        if (substring.equals("BackgroundThread")) {
            return ThreadMode.BackgroundThread;
        }
        if (substring.equals("Async")) {
            return ThreadMode.Async;
        }
        if (this.b.containsKey(cls)) {
            return null;
        }
        throw new EventBusException("Illegal onEvent method, check for typos: " + method);
    }

    private void a(List<j> list, HashMap<String, Class> hashMap, StringBuilder sb, Method[] methodArr) {
        ThreadMode a2;
        for (Method method : methodArr) {
            String name = method.getName();
            if (name.startsWith(MspFlybirdDefine.FLYBIRD_FRAME_EVENT_TYPE.ON_EVENT)) {
                int modifiers = method.getModifiers();
                Class<?> declaringClass = method.getDeclaringClass();
                if ((modifiers & 1) != 0 && (modifiers & 5192) == 0) {
                    Class<?>[] parameterTypes = method.getParameterTypes();
                    if (parameterTypes.length == 1 && (a2 = a(declaringClass, method, name)) != null) {
                        Class<?> cls = parameterTypes[0];
                        sb.setLength(0);
                        sb.append(name);
                        sb.append('>');
                        sb.append(cls.getName());
                        String sb2 = sb.toString();
                        Class put = hashMap.put(sb2, declaringClass);
                        if (put == null || put.isAssignableFrom(declaringClass)) {
                            list.add(new j(method, a2, cls));
                        } else {
                            hashMap.put(sb2, put);
                        }
                    }
                } else if (!this.b.containsKey(declaringClass)) {
                    String str = c.f24768a;
                    String str2 = "Skipping method (not public, static or abstract): " + declaringClass + "." + name;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List<j> a(Class<?> cls) {
        List<j> list;
        String name = cls.getName();
        synchronized (f24779a) {
            list = f24779a.get(name);
        }
        if (list != null) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        HashMap<String, Class> hashMap = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        for (Class<?> cls2 = cls; cls2 != null; cls2 = cls2.getSuperclass()) {
            String name2 = cls2.getName();
            if (name2.startsWith("java.") || name2.startsWith("javax.") || name2.startsWith("android.")) {
                break;
            }
            try {
                a(arrayList, hashMap, sb, cls2.getDeclaredMethods());
            } catch (Throwable th) {
                th.printStackTrace();
                Method[] methods = cls.getMethods();
                arrayList.clear();
                hashMap.clear();
                a(arrayList, hashMap, sb, methods);
            }
        }
        if (!arrayList.isEmpty()) {
            synchronized (f24779a) {
                f24779a.put(name, arrayList);
            }
            return arrayList;
        }
        throw new EventBusException("Subscriber " + cls + " has no public methods called " + MspFlybirdDefine.FLYBIRD_FRAME_EVENT_TYPE.ON_EVENT);
    }
}
