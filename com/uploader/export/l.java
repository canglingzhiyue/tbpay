package com.uploader.export;

import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Constructor;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes9.dex */
public class l {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final ConcurrentHashMap<Integer, g> f24060a = new ConcurrentHashMap<>();

    public static g a() throws RuntimeException {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (g) ipChange.ipc$dispatch("3ffbd7ba", new Object[0]) : a(0);
    }

    public static g a(int i) {
        f a2;
        f a3;
        f a4;
        g gVar = f24060a.get(Integer.valueOf(i));
        if (gVar != null) {
            if (!gVar.isInitialized() && (a4 = UploaderGlobal.a(Integer.valueOf(i))) != null) {
                gVar.initialize(UploaderGlobal.a(), a4);
            }
            return gVar;
        }
        synchronized (l.class) {
            g gVar2 = f24060a.get(Integer.valueOf(i));
            if (gVar2 != null) {
                if (!gVar2.isInitialized() && (a3 = UploaderGlobal.a(Integer.valueOf(i))) != null) {
                    gVar2.initialize(UploaderGlobal.a(), a3);
                }
                return gVar2;
            }
            Constructor<?> declaredConstructor = Class.forName("com.uploader.implement.UploaderManager").getDeclaredConstructor(Integer.TYPE);
            declaredConstructor.setAccessible(true);
            g gVar3 = (g) declaredConstructor.newInstance(Integer.valueOf(i));
            f24060a.put(Integer.valueOf(i), gVar3);
            if (!gVar3.isInitialized() && (a2 = UploaderGlobal.a(Integer.valueOf(i))) != null) {
                gVar3.initialize(UploaderGlobal.a(), a2);
            }
            return gVar3;
        }
    }
}
