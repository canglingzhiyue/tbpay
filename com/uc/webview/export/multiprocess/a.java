package com.uc.webview.export.multiprocess;

import android.os.ParcelFileDescriptor;
import dalvik.system.BaseDexClassLoader;
import dalvik.system.DexFile;
import java.io.File;
import java.lang.reflect.Field;

/* loaded from: classes9.dex */
final class a extends BaseDexClassLoader {

    /* renamed from: a  reason: collision with root package name */
    private DexFile f23845a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(String str, String str2, String str3, ClassLoader classLoader, ParcelFileDescriptor parcelFileDescriptor, String str4, DexFile dexFile) throws Throwable {
        super(parcelFileDescriptor != null ? str4 : str, parcelFileDescriptor == null ? new File(str2) : null, str3, classLoader);
        if (parcelFileDescriptor != null) {
            dexFile = dexFile == null ? new DexFile(str4) : dexFile;
            Object loadDexByFd = DexLoader.loadDexByFd(parcelFileDescriptor.detachFd());
            if (loadDexByFd == null) {
                throw new Exception("cannot load DexFile!");
            }
            Field declaredField = dexFile.getClass().getDeclaredField("mCookie");
            declaredField.setAccessible(true);
            declaredField.set(dexFile, loadDexByFd);
            this.f23845a = dexFile;
        }
    }

    @Override // dalvik.system.BaseDexClassLoader, java.lang.ClassLoader
    protected final Class<?> findClass(String str) throws ClassNotFoundException {
        DexFile dexFile = this.f23845a;
        Class<?> loadClass = dexFile != null ? dexFile.loadClass(str, this) : null;
        try {
            loadClass = super.findClass(str);
        } catch (ClassNotFoundException unused) {
        }
        if (loadClass == null) {
            loadClass = findLoadedClass(str);
        }
        return loadClass == null ? getParent().loadClass(str) : loadClass;
    }

    @Override // dalvik.system.BaseDexClassLoader, java.lang.ClassLoader
    public final String findLibrary(String str) {
        String findLibrary = super.findLibrary(str);
        return (findLibrary != null || !(getParent() instanceof BaseDexClassLoader)) ? findLibrary : ((BaseDexClassLoader) getParent()).findLibrary(str);
    }

    @Override // java.lang.ClassLoader
    protected final Class<?> loadClass(String str, boolean z) throws ClassNotFoundException {
        if (str.startsWith("com.uc.") || str.startsWith("org.chromium.")) {
            Class<?> findLoadedClass = findLoadedClass(str);
            return findLoadedClass == null ? findClass(str) : findLoadedClass;
        }
        return super.loadClass(str, z);
    }
}
