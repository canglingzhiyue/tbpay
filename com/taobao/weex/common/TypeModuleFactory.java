package com.taobao.weex.common;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.annotation.JSMethod;
import com.taobao.weex.bridge.Invoker;
import com.taobao.weex.bridge.MethodInvoker;
import com.taobao.weex.bridge.ModuleFactory;
import com.taobao.weex.common.WXModule;
import com.taobao.weex.utils.WXLogUtils;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import tb.kge;

/* loaded from: classes.dex */
public class TypeModuleFactory<T extends WXModule> implements ModuleFactory<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "TypeModuleFactory";
    public Class<T> mClazz;
    public Map<String, Invoker> mMethodMap;
    private Map<String, Boolean> methodCheckMap = new ConcurrentHashMap();
    private boolean mHasRebuild = false;

    static {
        kge.a(806411675);
        kge.a(-51843245);
    }

    public TypeModuleFactory(Class<T> cls) {
        this.mClazz = cls;
    }

    public String className() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a83416b6", new Object[]{this});
        }
        Class<T> cls = this.mClazz;
        return cls == null ? "" : cls.getName();
    }

    public boolean hasRebuild() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5533f02c", new Object[]{this})).booleanValue() : this.mHasRebuild;
    }

    public void reBuildMethodMap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c2de387", new Object[]{this});
        } else if (this.mHasRebuild) {
        } else {
            this.mHasRebuild = true;
            generateMethodMap();
        }
    }

    public boolean hasMethodInClass(String str) {
        boolean z;
        Method[] methods;
        Annotation[] declaredAnnotations;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6ea75b4d", new Object[]{this, str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Boolean bool = this.methodCheckMap.get(str);
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            z = false;
            for (Method method : this.mClazz.getMethods()) {
                try {
                    if (method != null && TextUtils.equals(str, method.getName())) {
                        boolean z2 = z;
                        for (Annotation annotation : method.getDeclaredAnnotations()) {
                            try {
                                z2 = (annotation instanceof JSMethod) || (annotation instanceof WXModuleAnno);
                            } catch (Throwable unused) {
                                z = z2;
                            }
                        }
                        z = z2;
                    }
                } catch (Throwable unused2) {
                }
            }
        } catch (Throwable unused3) {
            z = false;
        }
        this.methodCheckMap.put(str, Boolean.valueOf(z));
        return z;
    }

    private void generateMethodMap() {
        Method[] methods;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("879cb44d", new Object[]{this});
            return;
        }
        HashMap hashMap = new HashMap();
        try {
            for (Method method : this.mClazz.getMethods()) {
                Annotation[] declaredAnnotations = method.getDeclaredAnnotations();
                int length = declaredAnnotations.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    Annotation annotation = declaredAnnotations[i];
                    if (annotation != null) {
                        if (annotation instanceof JSMethod) {
                            JSMethod jSMethod = (JSMethod) annotation;
                            hashMap.put("_".equals(jSMethod.alias()) ? method.getName() : jSMethod.alias(), new MethodInvoker(method, jSMethod.uiThread()));
                        } else if (annotation instanceof WXModuleAnno) {
                            hashMap.put(method.getName(), new MethodInvoker(method, ((WXModuleAnno) annotation).runOnUIThread()));
                            break;
                        }
                    }
                    i++;
                }
            }
        } catch (Throwable th) {
            WXLogUtils.e("[WXModuleManager] extractMethodNames:", th);
        }
        this.mMethodMap = hashMap;
    }

    @Override // com.taobao.weex.bridge.ModuleFactory
    public T buildInstance() throws IllegalAccessException, InstantiationException {
        return this.mClazz.newInstance();
    }

    @Override // com.taobao.weex.bridge.JavascriptInvokable
    public String[] getMethods() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("427e6712", new Object[]{this});
        }
        if (this.mMethodMap == null) {
            generateMethodMap();
        }
        Set<String> keySet = this.mMethodMap.keySet();
        return (String[]) keySet.toArray(new String[keySet.size()]);
    }

    @Override // com.taobao.weex.bridge.JavascriptInvokable
    public Invoker getMethodInvoker(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Invoker) ipChange.ipc$dispatch("2dffba62", new Object[]{this, str});
        }
        if (this.mMethodMap == null) {
            generateMethodMap();
        }
        return this.mMethodMap.get(str);
    }
}
