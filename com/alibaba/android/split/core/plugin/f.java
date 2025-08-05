package com.alibaba.android.split.core.plugin;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import com.alibaba.android.split.core.internal.FlexaClassLoader;
import com.alibaba.android.split.core.internal.InternalHacker;
import com.alibaba.android.split.core.internal.ObjectInvoker;
import com.alibaba.android.split.core.splitcompat.j;
import com.alibaba.android.split.q;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.alibaba.ip.server.InstantPatcher;
import dalvik.system.DelegateLastClassLoader;
import dalvik.system.PathClassLoader;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.HashSet;
import java.util.Set;
import java.util.zip.ZipFile;
import tb.bgu;
import tb.bgx;
import tb.bgy;
import tb.bhb;
import tb.bib;
import tb.kge;

/* loaded from: classes.dex */
public class f extends a<e> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final bgu f = (bgu) com.alibaba.android.split.a.b(bgu.class, "PluginManager");

    static {
        kge.a(2122795224);
    }

    public static /* synthetic */ Object ipc$super(f fVar, String str, Object... objArr) {
        if (str.hashCode() == -508341884) {
            super.a((bgy) objArr[0]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.alibaba.android.split.core.plugin.a, com.alibaba.android.split.manager.b
    public void a(bgy bgyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1b35184", new Object[]{this, bgyVar});
            return;
        }
        super.a(bgyVar);
        if (bgyVar instanceof bgx) {
            this.b = new com.alibaba.android.split.core.splitcompat.c(bgyVar);
        } else {
            this.b = new com.alibaba.android.split.core.splitcompat.g(bgyVar);
        }
    }

    @Override // com.alibaba.android.split.manager.b
    public void c(q qVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd81bb5c", new Object[]{this, qVar});
        } else {
            this.f2438a.put(qVar.b(), new e(qVar.b(), qVar.a(), this.d));
        }
    }

    @Override // com.alibaba.android.split.manager.b
    public boolean d(q qVar) throws Exception {
        ClassLoader flexaClassLoader;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("aa17f7f", new Object[]{this, qVar})).booleanValue();
        }
        bhb.f25893a.get("FlexaApplication").a("dex2oat");
        if (Build.VERSION.SDK_INT > 29 && j.h().e().getApplicationInfo().targetSdkVersion < 29) {
            flexaClassLoader = new DelegateLastClassLoader(qVar.a().getAbsolutePath(), this.d.d(qVar.b()).getPath(), this.c);
        } else if (Build.VERSION.SDK_INT > 26) {
            this.f.d("injectClassLoader:%s", "injectClassLoader to:FlexaClassLoader");
            flexaClassLoader = new FlexaClassLoader(this.c, ":", null, this.d.d(qVar.b()).getPath(), this.c.getParent());
            if (!b(flexaClassLoader, qVar, false, true)) {
                return false;
            }
        } else {
            flexaClassLoader = new FlexaClassLoader(this.c, qVar.a().getAbsolutePath(), this.d.a(qVar.b()).getAbsolutePath(), this.d.d(qVar.b()).getPath(), this.c.getParent());
        }
        boolean a2 = a(j.h().e(), flexaClassLoader);
        bhb.f25893a.get("FlexaApplication").a();
        if (!a2) {
            return false;
        }
        this.c = flexaClassLoader;
        return true;
    }

    @Override // com.alibaba.android.split.manager.b
    public boolean a(Set<q> set) throws Exception {
        ClassLoader flexaClassLoader;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("64b9555b", new Object[]{this, set})).booleanValue();
        }
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (q qVar : set) {
            hashSet.add(qVar.a().getAbsolutePath());
            hashSet2.add(this.d.d(qVar.b()).getPath());
        }
        hashSet2.add(j.h().e().getApplicationInfo().nativeLibraryDir);
        String a2 = a(":", hashSet);
        String a3 = a(":", hashSet2);
        if (Build.VERSION.SDK_INT > 29 && j.h().e().getApplicationInfo().targetSdkVersion < 29) {
            flexaClassLoader = new DelegateLastClassLoader(a2, a3, this.c);
        } else if (Build.VERSION.SDK_INT > 26) {
            Log.e("injectClassLoader", "injectClassLoader to:FlexaClassLoader");
            flexaClassLoader = new FlexaClassLoader(this.c, ":", null, a3, this.c.getParent());
            for (q qVar2 : set) {
                if (!b(flexaClassLoader, qVar2, false, true)) {
                    return false;
                }
            }
        } else {
            flexaClassLoader = new FlexaClassLoader(this.c, a2, this.d.a(set.iterator().next().b()).getAbsolutePath(), a3, this.c.getParent());
        }
        if (!a(j.h().e(), flexaClassLoader)) {
            return false;
        }
        Thread.currentThread().setContextClassLoader(flexaClassLoader);
        this.c = flexaClassLoader;
        return true;
    }

    private static String a(CharSequence charSequence, Iterable<? extends CharSequence> iterable) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("3dc7e92b", new Object[]{charSequence, iterable}) : TextUtils.join(charSequence, iterable);
    }

    @Override // com.alibaba.android.split.manager.b
    public boolean a(Context context, ClassLoader classLoader) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("558eae0e", new Object[]{this, context, classLoader})).booleanValue();
        }
        Object loadedApk = InternalHacker.getLoadedApk(InternalHacker.getActivityThread(context), context.getPackageName());
        if (loadedApk == null) {
            return false;
        }
        ObjectInvoker.create(loadedApk, "mClassLoader", ClassLoader.class).setObject(classLoader);
        Thread.currentThread().setContextClassLoader(classLoader);
        return true;
    }

    private boolean b(ClassLoader classLoader, q qVar, boolean z, boolean z2) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9a07c709", new Object[]{this, classLoader, qVar, new Boolean(z), new Boolean(z2)})).booleanValue();
        }
        String valueOf = String.valueOf(qVar.a());
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 24);
        if (!e(qVar) || this.e.loadDex(classLoader, this.d.a(qVar.b()), qVar, z, z2)) {
            bgu bguVar = this.f;
            sb.append("split dexopt done ");
            sb.append(valueOf);
            bguVar.d("appendSelfClassLoader:%s", sb.toString());
            return true;
        }
        bgu bguVar2 = this.f;
        sb.append("split dexopt failed ");
        sb.append(valueOf);
        bguVar2.d("appendSelfClassLoader:%s", sb.toString());
        return false;
    }

    @Override // com.alibaba.android.split.manager.b
    public boolean a(ClassLoader classLoader, q qVar, boolean z, boolean z2) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8951fa48", new Object[]{this, classLoader, qVar, new Boolean(z), new Boolean(z2)})).booleanValue();
        }
        String valueOf = String.valueOf(qVar.a());
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 24);
        ClassLoader a2 = a(classLoader);
        if (!e(qVar) || this.e.loadDex(a2, this.d.a(qVar.b()), qVar, z, z2)) {
            bgu bguVar = this.f;
            sb.append("split dexopt done ");
            sb.append(valueOf);
            bguVar.d("appendPathClassLoader:%s:%s:%s", sb.toString(), Boolean.valueOf(z), Boolean.valueOf(z2));
            return true;
        }
        bgu bguVar2 = this.f;
        sb.append("split dexopt failed ");
        sb.append(valueOf);
        bguVar2.d("appendPathClassLoader:%s:%s:%s", sb.toString(), Boolean.valueOf(z), Boolean.valueOf(z2));
        return false;
    }

    private boolean e(q qVar) throws IOException {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("47c1439e", new Object[]{this, qVar})).booleanValue();
        }
        ZipFile zipFile = null;
        try {
            ZipFile zipFile2 = new ZipFile(qVar.a());
            try {
                if (zipFile2.getEntry(InstantPatcher.CLASSES_DEX) == null) {
                    z = false;
                }
                zipFile2.close();
                return z;
            } catch (IOException e) {
                e = e;
                zipFile = zipFile2;
                if (zipFile != null) {
                    try {
                        zipFile.close();
                    } catch (IOException unused) {
                    }
                }
                throw e;
            }
        } catch (IOException e2) {
            e = e2;
        }
    }

    private ClassLoader a(ClassLoader classLoader) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ClassLoader) ipChange.ipc$dispatch("ab33ecdc", new Object[]{this, classLoader});
        }
        Class<?> cls = null;
        try {
            cls = Class.forName("java.lang.BootClassLoader");
        } catch (Exception e) {
            e.printStackTrace();
        }
        Class<?> cls2 = cls;
        ClassLoader classLoader2 = classLoader;
        while (classLoader2 != null && classLoader2.getClass() != PathClassLoader.class && classLoader2.getClass() != cls2) {
            classLoader2 = classLoader2.getParent();
        }
        if (classLoader2.getClass() == cls2) {
            classLoader2 = b(classLoader);
            while (classLoader2 != null && classLoader2.getClass() != cls2 && classLoader2.getClass() != PathClassLoader.class) {
                classLoader2 = b(classLoader2);
            }
        }
        return classLoader2;
    }

    private ClassLoader b(ClassLoader classLoader) {
        if (classLoader != null) {
            try {
                Field declaredField = classLoader.getClass().getDeclaredField("delegate");
                declaredField.setAccessible(true);
                return (ClassLoader) declaredField.get(classLoader);
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        }
        return null;
    }

    @Override // com.alibaba.android.split.manager.b
    public boolean a(ClassLoader classLoader, boolean z, boolean z2, boolean z3, q qVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("333a3b8", new Object[]{this, classLoader, new Boolean(z), new Boolean(z2), new Boolean(z3), qVar})).booleanValue();
        }
        try {
            ClassLoader a2 = a(classLoader);
            if (z) {
                this.b.a();
                Set<File> a3 = this.b.a(qVar);
                if (z2 && a3.size() > 0) {
                    this.e.loadNativeLib(a2, a3, z3);
                }
            } else if (!z3) {
                Set<File> b = this.b.b(qVar);
                if (b == null) {
                    this.f.d("load NativeLibs.Exception:failed", new Object[0]);
                    return false;
                } else if (b.size() > 0) {
                    this.e.loadNativeLib(a2, b, false);
                }
            }
            return true;
        } catch (Exception e) {
            this.f.a(e, "installNativeLibs.Exception:%s", e.getMessage());
            Log.e("PluginManager", "installNativeLibs Exception:" + qVar.b() + " md5:" + bib.a(qVar.a()));
            e.printStackTrace();
            return false;
        }
    }

    @Override // com.alibaba.android.split.manager.b
    public boolean a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("61b6362e", new Object[]{this, context, str})).booleanValue();
        }
        if (!this.f2438a.containsKey(str)) {
            return false;
        }
        return ((e) this.f2438a.get(str)).a(context);
    }
}
