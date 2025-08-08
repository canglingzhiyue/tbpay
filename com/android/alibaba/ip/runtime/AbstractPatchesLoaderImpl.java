package com.android.alibaba.ip.runtime;

import mtopsdk.common.util.StringUtils;
import android.util.Log;
import com.alibaba.android.split.p;
import com.android.alibaba.ip.common.PatchClassHolder;
import com.android.alibaba.ip.runtime.PatchesLoader;
import com.android.alibaba.ip.server.Logging;
import java.lang.reflect.Field;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Level;
import mtopsdk.common.util.SymbolExpUtil;
import tb.bhm;
import tb.bho;
import tb.kge;

/* loaded from: classes3.dex */
public abstract class AbstractPatchesLoaderImpl implements PatchesLoader {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String BASE_FEATURE = "BASE_FEATURE";
    private static final String IPCHANGE = "$ipChange";
    private static final String IPREPLACE = "$ipReplace";
    private static volatile Map<Class, Boolean> obsoletedMap;
    private PatchesLoader.ClassLoaderListener classLoaderListener;

    public abstract List<PatchClassHolder> getPatchedClasses();

    public static /* synthetic */ boolean access$000(AbstractPatchesLoaderImpl abstractPatchesLoaderImpl, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("791ed06b", new Object[]{abstractPatchesLoaderImpl, str})).booleanValue() : abstractPatchesLoaderImpl.fixBaseFeatureClazz(str);
    }

    static {
        kge.a(1180138537);
        kge.a(-2056790677);
        obsoletedMap = new ConcurrentHashMap();
    }

    @Override // com.android.alibaba.ip.runtime.PatchesLoader
    public boolean load() {
        boolean fixDynamicFeatureClazz;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6def6671", new Object[]{this})).booleanValue();
        }
        for (PatchClassHolder patchClassHolder : getPatchedClasses()) {
            if (isBaseFeatureClazz(patchClassHolder.featureName)) {
                fixDynamicFeatureClazz = fixBaseFeatureClazz(patchClassHolder.className);
                continue;
            } else {
                fixDynamicFeatureClazz = fixDynamicFeatureClazz(patchClassHolder.className, patchClassHolder.featureName);
                continue;
            }
            if (!fixDynamicFeatureClazz) {
                return false;
            }
        }
        return true;
    }

    private boolean isBaseFeatureClazz(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ad7a2e92", new Object[]{this, str})).booleanValue() : StringUtils.isEmpty(str) || str.equals(BASE_FEATURE);
    }

    private boolean fixDynamicFeatureClazz(final String str, final String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("df00eab", new Object[]{this, str, str2})).booleanValue();
        }
        Log.e(Logging.LOG_TAG, String.format("fixDynamicFeatureClazz:%s in feature:%s", str, str2));
        if (p.a() != null && p.a().a() != null && p.a().a().contains(str2)) {
            return fixBaseFeatureClazz(str);
        }
        bhm.a().a(str2, new bho.a() { // from class: com.android.alibaba.ip.runtime.AbstractPatchesLoaderImpl.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.bho.a
            public void a(int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
                    return;
                }
                Log.e(Logging.LOG_TAG, String.format("onFeatureStatusChange:%s:%s", str2, Integer.valueOf(i)));
                if (i != 3) {
                    return;
                }
                Log.e(Logging.LOG_TAG, String.format("start fixDynamicFeatureClazz:%s in feature:%s", str, str2));
                Log.e(Logging.LOG_TAG, AbstractPatchesLoaderImpl.access$000(AbstractPatchesLoaderImpl.this, str) ? String.format("fixDynamicFeatureClazz:%s in feature:%s success", str, str2) : String.format("fixDynamicFeatureClazz:%s in feature:%s failed", str, str2));
                bhm.a().a(this);
            }
        }, null);
        return true;
    }

    private boolean fixBaseFeatureClazz(String str) {
        String str2;
        String[] strArr;
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            if (str.indexOf("|") != -1) {
                str2 = str.split(SymbolExpUtil.SYMBOL_VERTICALBAR)[0];
                strArr = str.split(SymbolExpUtil.SYMBOL_VERTICALBAR);
            } else {
                str2 = str;
                strArr = null;
            }
            if (this.classLoaderListener != null && !this.classLoaderListener.onPrePareLoad(str2)) {
                Log.e(Logging.LOG_TAG, "skip patch clazz:" + str2);
                return true;
            }
            Object newInstance = classLoader.loadClass(str2 + IPREPLACE).newInstance();
            Class<?> loadClass = classLoader.loadClass(str2);
            if (strArr != null) {
                for (int i = 1; i < strArr.length; i++) {
                    if (!StringUtils.isEmpty(strArr[i])) {
                        replaceField(loadClass, "$ipChange$" + strArr[i].hashCode(), newInstance);
                    }
                }
            } else {
                replaceField(loadClass, IPCHANGE, newInstance);
            }
            if (com.android.alibaba.ip.common.Log.logging != null && com.android.alibaba.ip.common.Log.logging.isLoggable(Level.FINE)) {
                com.android.alibaba.ip.common.Log.logging.log(Level.FINE, String.format("patched %s", str2));
            }
            if (this.classLoaderListener != null) {
                this.classLoaderListener.onLoadResult(str, true, null);
            }
            return true;
        } catch (Exception e) {
            if (com.android.alibaba.ip.common.Log.logging != null) {
                com.android.alibaba.ip.common.Log.logging.log(Level.SEVERE, String.format("Exception while patching %s", "foo.bar"), e);
            }
            PatchesLoader.ClassLoaderListener classLoaderListener = this.classLoaderListener;
            if (classLoaderListener != null) {
                classLoaderListener.onLoadResult(str, false, e);
            }
            return false;
        }
    }

    @Override // com.android.alibaba.ip.runtime.PatchesLoader
    public void addClassLoadListener(PatchesLoader.ClassLoaderListener classLoaderListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd61ab41", new Object[]{this, classLoaderListener});
        } else {
            this.classLoaderListener = classLoaderListener;
        }
    }

    private void obsoleted(Object obj) throws Exception {
        Field declaredField;
        if (obj != null) {
            if ((obsoletedMap.containsKey(obj.getClass()) && obsoletedMap.get(obj.getClass()).booleanValue()) || (declaredField = obj.getClass().getDeclaredField("$ipObsolete")) == null) {
                return;
            }
            declaredField.set(null, true);
            obsoletedMap.put(obj.getClass(), true);
        }
    }

    private void replaceField(Class cls, String str, Object obj) throws Exception {
        Field declaredField = cls.getDeclaredField(str);
        declaredField.setAccessible(true);
        obsoleted(declaredField.get(null));
        declaredField.set(null, obj);
    }
}
