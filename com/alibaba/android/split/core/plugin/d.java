package com.alibaba.android.split.core.plugin;

import android.content.Context;
import android.os.Build;
import com.alibaba.android.split.core.internal.FlexaClassLoader;
import com.alibaba.android.split.core.splitcompat.Reflector;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import dalvik.system.DelegateLastClassLoader;
import java.io.IOException;
import java.net.URL;
import java.util.Enumeration;
import tb.kge;

/* loaded from: classes2.dex */
public class d extends ClassLoader {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int FIND_CLASS_IN_BASE = 0;
    public static final int FIND_CLASS_IN_FEATURE = 1;

    /* renamed from: a  reason: collision with root package name */
    private final boolean f2441a;
    private final Reflector b;
    private final Reflector c;
    private final Reflector d;
    private final a e;
    private ClassLoader f;
    private ClassLoader g;
    private Reflector h;
    private Context i;

    /* loaded from: classes2.dex */
    public interface a {
        int whereFindClass(String str);
    }

    static {
        kge.a(-1460840455);
    }

    public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
        if (str.hashCode() == 2052165949) {
            return super.findClass((String) objArr[0]);
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public d(Context context, ClassLoader classLoader, boolean z, a aVar) throws Exception {
        super(classLoader);
        this.i = context;
        this.f2441a = z;
        this.h = Reflector.a((Class<?>) ClassLoader.class).a("findClass", String.class);
        this.b = Reflector.a((Class<?>) ClassLoader.class).a("findResource", String.class);
        this.c = Reflector.a((Class<?>) ClassLoader.class).a("findResources", String.class);
        this.d = Reflector.a((Class<?>) ClassLoader.class).a("getPackage", String.class);
        this.e = aVar;
    }

    @Override // java.lang.ClassLoader
    public Class<?> findClass(String str) throws ClassNotFoundException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("7a51913d", new Object[]{this, str});
        }
        if (this.f2441a && this.e.whereFindClass(str) == 1) {
            this.g = this.i.getClassLoader();
            ClassLoader classLoader = this.g;
            if (classLoader instanceof FlexaClassLoader) {
                return ((FlexaClassLoader) classLoader).findSelf(str);
            }
            if (Build.VERSION.SDK_INT < 27) {
                return null;
            }
            ClassLoader classLoader2 = this.g;
            if (classLoader2 instanceof DelegateLastClassLoader) {
                return a(classLoader2, str);
            }
            return super.findClass(str);
        }
        return super.findClass(str);
    }

    private Class<?> a(ClassLoader classLoader, String str) throws ClassNotFoundException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("a95742f9", new Object[]{this, classLoader, str});
        }
        try {
            return (Class) this.h.a((Object) classLoader, str);
        } catch (Exception unused) {
            throw new ClassNotFoundException(str);
        }
    }

    @Override // java.lang.ClassLoader
    public URL getResource(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (URL) ipChange.ipc$dispatch("bd9c820", new Object[]{this, str}) : this.f.getResource(str);
    }

    @Override // java.lang.ClassLoader
    public Enumeration<URL> getResources(String str) throws IOException {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Enumeration) ipChange.ipc$dispatch("c60ea16a", new Object[]{this, str}) : this.f.getResources(str);
    }

    @Override // java.lang.ClassLoader
    public URL findResource(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (URL) ipChange.ipc$dispatch("8e5461dd", new Object[]{this, str});
        }
        try {
            return (URL) this.b.a((Object) this.f, str);
        } catch (Reflector.ReflectedException unused) {
            return null;
        }
    }

    @Override // java.lang.ClassLoader
    public Enumeration<URL> findResources(String str) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Enumeration) ipChange.ipc$dispatch("93b5f2e7", new Object[]{this, str});
        }
        try {
            return (Enumeration) this.c.a((Object) this.f, str);
        } catch (Reflector.ReflectedException unused) {
            return null;
        }
    }

    @Override // java.lang.ClassLoader
    public Package getPackage(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Package) ipChange.ipc$dispatch("7e0f8580", new Object[]{this, str});
        }
        try {
            return (Package) this.d.a((Object) this.f, str);
        } catch (Reflector.ReflectedException unused) {
            return null;
        }
    }
}
