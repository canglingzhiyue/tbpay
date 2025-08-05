package com.taobao.android.dxv4common.logic.dex.bridge;

import android.os.Build;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.bx;
import com.taobao.android.dinamicx.exception.a;
import dalvik.system.DexClassLoader;
import java.util.List;
import tb.fuw;
import tb.kge;

/* loaded from: classes5.dex */
public class DXNativeLogicLoader extends DexClassLoader {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "DXNativeLogicLoader";
    private String childName;
    private String childVersion;
    private List<DXNativeLogicLoader> dependenciesLoaderList;
    private String dexPath;
    private String name;
    private boolean needFind;
    private String parentLoaderName;
    private String parentLoaderVersion;
    private boolean reversedLoad;
    private String version;

    static {
        kge.a(1100107176);
    }

    public static /* synthetic */ Object ipc$super(DXNativeLogicLoader dXNativeLogicLoader, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode != -1177425936) {
            if (hashCode != 2052165949) {
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }
            return super.findClass((String) objArr[0]);
        }
        return super.loadClass((String) objArr[0]);
    }

    public DXNativeLogicLoader(String str, boolean z) {
        this(str, z, null, null, DXNativeLogicEngine.class.getClassLoader(), "baseMain", "1", "null", "null", "default", "default");
    }

    public DXNativeLogicLoader(String str, boolean z, String str2, String str3, ClassLoader classLoader, String str4, String str5, String str6, String str7, String str8, String str9) {
        super(str, Build.VERSION.SDK_INT <= 26 ? str : null, str3, classLoader);
        this.reversedLoad = false;
        this.needFind = false;
        this.dexPath = str;
        this.reversedLoad = z;
        this.parentLoaderName = str4;
        this.parentLoaderVersion = str5;
        this.childName = str6;
        this.childVersion = str7;
        this.name = str8;
        this.version = str9;
        if (bx.i()) {
            fuw.f("shandian", " load  " + str + " thread " + Thread.currentThread().getName() + "  this " + hashCode());
        }
    }

    @Override // dalvik.system.BaseDexClassLoader, java.lang.ClassLoader
    public Class<?> findClass(String str) throws ClassNotFoundException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("7a51913d", new Object[]{this, str});
        }
        Class<?> findDependenciesClass = findDependenciesClass(str);
        return findDependenciesClass == null ? super.findClass(str) : findDependenciesClass;
    }

    private Class findDependenciesClass(String str) {
        Class<?> findClass;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("6461e9d4", new Object[]{this, str});
        }
        List<DXNativeLogicLoader> list = this.dependenciesLoaderList;
        if (list != null && list.size() != 0) {
            for (DXNativeLogicLoader dXNativeLogicLoader : this.dependenciesLoaderList) {
                try {
                    findClass = dXNativeLogicLoader.findClass(str);
                } catch (ClassNotFoundException e) {
                    a.b(e);
                }
                if (findClass != null) {
                    return findClass;
                }
            }
        }
        return null;
    }

    private Class loadDependenciesClass(String str) {
        Class<?> loadClass;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("2daecc07", new Object[]{this, str});
        }
        List<DXNativeLogicLoader> list = this.dependenciesLoaderList;
        if (list != null && list.size() != 0) {
            for (DXNativeLogicLoader dXNativeLogicLoader : this.dependenciesLoaderList) {
                try {
                    loadClass = dXNativeLogicLoader.loadClass(str);
                } catch (ClassNotFoundException e) {
                    a.b(e);
                }
                if (loadClass != null) {
                    return loadClass;
                }
            }
        }
        return null;
    }

    @Override // java.lang.ClassLoader
    public Class<?> loadClass(String str) throws ClassNotFoundException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("b9d1e7f0", new Object[]{this, str});
        }
        Class<?> loadDependenciesClass = loadDependenciesClass(str);
        return loadDependenciesClass == null ? super.loadClass(str) : loadDependenciesClass;
    }

    public void setDependenciesLoaderList(List<DXNativeLogicLoader> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c478bdd4", new Object[]{this, list});
        } else {
            this.dependenciesLoaderList = list;
        }
    }

    public String getParentLoaderName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("2403fcbb", new Object[]{this}) : this.parentLoaderName;
    }

    public String getParentLoaderVersion() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d2660294", new Object[]{this}) : this.parentLoaderVersion;
    }

    public void setNeedFind(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ec377dc", new Object[]{this, new Boolean(z)});
        } else {
            this.needFind = z;
        }
    }

    public String getName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this}) : this.name;
    }

    public String getVersion() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("2a8fef97", new Object[]{this}) : this.version;
    }

    public String getChildName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9d448c88", new Object[]{this}) : this.childName;
    }

    public String getChildVersion() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("128443a7", new Object[]{this}) : this.childVersion;
    }
}
