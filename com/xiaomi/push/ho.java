package com.xiaomi.push;

import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes9.dex */
public class ho {

    /* renamed from: a  reason: collision with root package name */
    private static ho f24529a;

    /* renamed from: a  reason: collision with other field name */
    private Map<String, Object> f480a = new ConcurrentHashMap();
    private Map<String, Object> b = new ConcurrentHashMap();

    private ho() {
        m2014a();
    }

    public static synchronized ho a() {
        ho hoVar;
        synchronized (ho.class) {
            if (f24529a == null) {
                f24529a = new ho();
            }
            hoVar = f24529a;
        }
        return hoVar;
    }

    private String a(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append("<");
        sb.append(str);
        sb.append("/>");
        if (str != null) {
            sb.append("<");
            sb.append(str2);
            sb.append("/>");
        }
        return sb.toString();
    }

    /* renamed from: a  reason: collision with other method in class */
    private ClassLoader[] m2012a() {
        ClassLoader[] classLoaderArr = {ho.class.getClassLoader(), Thread.currentThread().getContextClassLoader()};
        ArrayList arrayList = new ArrayList();
        for (ClassLoader classLoader : classLoaderArr) {
            if (classLoader != null) {
                arrayList.add(classLoader);
            }
        }
        return (ClassLoader[]) arrayList.toArray(new ClassLoader[arrayList.size()]);
    }

    /* renamed from: a  reason: collision with other method in class */
    public Object m2013a(String str, String str2) {
        return this.f480a.get(a(str, str2));
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x00f6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: a  reason: collision with other method in class */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void m2014a() {
        /*
            Method dump skipped, instructions count: 266
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.ho.m2014a():void");
    }

    public void a(String str, String str2, Object obj) {
        if ((obj instanceof hn) || (obj instanceof Class)) {
            this.f480a.put(a(str, str2), obj);
            return;
        }
        throw new IllegalArgumentException("Provider must be a PacketExtensionProvider or a Class instance.");
    }
}
