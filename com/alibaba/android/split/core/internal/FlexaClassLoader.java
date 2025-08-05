package com.alibaba.android.split.core.internal;

import android.text.TextUtils;
import android.util.Log;
import com.alibaba.android.split.core.splitcompat.Reflector;
import com.alibaba.android.split.core.splitcompat.j;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.WXEnvironment;
import dalvik.system.DexClassLoader;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import tb.kge;

/* loaded from: classes2.dex */
public class FlexaClassLoader extends DexClassLoader {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static Reflector findClass_Method;
    private static Reflector findLibrary_Method;
    private static Reflector findResource_Method;
    private static Reflector nativeLoad_Method;
    private ClassLoader delegate;

    public static /* synthetic */ Object ipc$super(FlexaClassLoader flexaClassLoader, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1907072547:
                return super.findResource((String) objArr[0]);
            case -1538227411:
                return super.findLibrary((String) objArr[0]);
            case 2052165949:
                return super.findClass((String) objArr[0]);
            case 2114946432:
                return super.getPackage((String) objArr[0]);
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    static {
        kge.a(-1691122021);
        findClass_Method = null;
        findResource_Method = null;
        nativeLoad_Method = null;
        findLibrary_Method = null;
        try {
            findClass_Method = Reflector.a((Class<?>) ClassLoader.class).a("findClass", String.class);
            findResource_Method = Reflector.a((Class<?>) ClassLoader.class).a("findResource", String.class);
            nativeLoad_Method = Reflector.a((Class<?>) Runtime.class).a("nativeLoad", String.class, ClassLoader.class);
            findLibrary_Method = Reflector.a((Class<?>) ClassLoader.class).a("findLibrary", String.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public FlexaClassLoader(ClassLoader classLoader, String str, String str2, String str3, ClassLoader classLoader2) {
        super(str, str2, str3, classLoader2);
        this.delegate = classLoader;
    }

    @Override // dalvik.system.BaseDexClassLoader, java.lang.ClassLoader
    public Class<?> findClass(String str) throws ClassNotFoundException {
        Class<?> invokeFindClass;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("7a51913d", new Object[]{this, str});
        }
        try {
            return findSelf(str);
        } finally {
            if (invokeFindClass != null) {
            }
        }
    }

    public Class<?> findSelf(String str) throws ClassNotFoundException {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Class) ipChange.ipc$dispatch("87879a23", new Object[]{this, str}) : super.findClass(str);
    }

    @Override // dalvik.system.BaseDexClassLoader, java.lang.ClassLoader
    public URL findResource(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (URL) ipChange.ipc$dispatch("8e5461dd", new Object[]{this, str});
        }
        URL findResource = super.findResource(str);
        if (findResource == null && this.delegate != null) {
            try {
                return invokeFindResource(str);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (NoSuchMethodException e2) {
                e2.printStackTrace();
            } catch (InvocationTargetException e3) {
                e3.printStackTrace();
            }
        }
        return findResource;
    }

    private URL invokeFindResource(String str) throws InvocationTargetException, IllegalAccessException, NoSuchMethodException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (URL) ipChange.ipc$dispatch("558b645", new Object[]{this, str});
        }
        try {
            return (URL) findResource_Method.a((Object) this.delegate, str);
        } catch (Reflector.ReflectedException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override // dalvik.system.BaseDexClassLoader, java.lang.ClassLoader
    public String findLibrary(String str) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a450832d", new Object[]{this, str});
        }
        String findLibrary = super.findLibrary(str);
        if (str.equals(WXEnvironment.CORE_JSC_SO_NAME)) {
            return findLibrary;
        }
        if (j.h().e().getApplicationInfo().targetSdkVersion <= 28 || !str.equals(WXEnvironment.CORE_JSB_SO_NAME)) {
            z = false;
        }
        if ((z || TextUtils.isEmpty(findLibrary)) && this.delegate != null) {
            try {
                return invokeFindLibrary(str);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (NoSuchMethodException e2) {
                e2.printStackTrace();
            } catch (InvocationTargetException e3) {
                e3.printStackTrace();
            }
        }
        return findLibrary;
    }

    private void tryLoad(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38e20912", new Object[]{this, str});
            return;
        }
        try {
            Log.e("FlexaClassLoader", (String) nativeLoad_Method.a((Object) null, str, this));
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private String invokeFindLibrary(String str) throws InvocationTargetException, IllegalAccessException, NoSuchMethodException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c52af5c5", new Object[]{this, str});
        }
        try {
            return (String) findLibrary_Method.a((Object) this.delegate, str);
        } catch (Reflector.ReflectedException e) {
            e.printStackTrace();
            return null;
        }
    }

    private Class<?> invokeFindClass(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("f155e5a5", new Object[]{this, str});
        }
        try {
            return (Class) findClass_Method.a((Object) this.delegate, str);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // dalvik.system.BaseDexClassLoader, java.lang.ClassLoader
    public Package getPackage(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Package) ipChange.ipc$dispatch("7e0f8580", new Object[]{this, str});
        }
        Package r0 = super.getPackage(str);
        return r0 == null ? definePackage(str, "Unknown", "0.0", "Unknown", "Unknown", "0.0", "Unknown", null) : r0;
    }
}
