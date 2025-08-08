package com.taobao.themis.kernel.ability.register;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.ability.base.annotation.APIMethod;
import com.taobao.themis.kernel.ability.base.annotation.AutoCallback;
import com.taobao.themis.kernel.ability.base.annotation.ParamRequired;
import com.taobao.themis.kernel.basic.TMSLogger;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.kge;
import tb.qpo;

/* loaded from: classes9.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "TMSAbilityRegister";

    /* renamed from: a  reason: collision with root package name */
    public static Map<String, b> f22499a;
    public static Map<String, a> b;

    static {
        kge.a(2084413406);
        f22499a = new ConcurrentHashMap();
        b = new ConcurrentHashMap();
    }

    public static void a(Class<? extends com.taobao.themis.kernel.ability.base.a> cls, AbilityType abilityType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96d94d73", new Object[]{cls, abilityType});
            return;
        }
        Map<String, b> b2 = b(cls, abilityType);
        if (b2.isEmpty()) {
            TMSLogger.c(TAG, "registerAbility failed cause apiMetaList is empty");
        } else {
            f22499a.putAll(b2);
        }
    }

    public static void a(String str, List<String> list, AbilityType abilityType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46900065", new Object[]{str, list, abilityType});
        } else if (list.isEmpty()) {
            TMSLogger.c(TAG, "registerAbility failed cause apiMethods list is empty");
        } else {
            a aVar = new a();
            aVar.b = str;
            aVar.c = abilityType;
            for (String str2 : list) {
                if (!StringUtils.isEmpty(str2)) {
                    b.put(str2, aVar);
                }
            }
        }
    }

    private static Map<String, b> b(Class<? extends com.taobao.themis.kernel.ability.base.a> cls, AbilityType abilityType) {
        Method[] methods;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("bf7be329", new Object[]{cls, abilityType});
        }
        HashMap hashMap = new HashMap();
        a aVar = new a();
        aVar.f22497a = cls;
        aVar.c = abilityType;
        for (Method method : cls.getMethods()) {
            try {
                APIMethod aPIMethod = (APIMethod) method.getAnnotation(APIMethod.class);
                if (aPIMethod != null) {
                    String value = aPIMethod.value();
                    if (StringUtils.isEmpty(value)) {
                        value = method.getName();
                    }
                    b bVar = new b();
                    bVar.c = method;
                    bVar.d = method.getAnnotation(ParamRequired.class) != null;
                    bVar.e = method.getAnnotation(AutoCallback.class) != null;
                    bVar.f22498a = value;
                    bVar.f = method.getParameterTypes();
                    bVar.g = method.getParameterAnnotations();
                    bVar.b = aVar;
                    hashMap.put(bVar.f22498a, bVar);
                }
            } catch (Throwable th) {
                TMSLogger.b(TAG, "initApiMeta failed", th);
            }
        }
        return hashMap;
    }

    public static b a(String str, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("c7eefe30", new Object[]{str, context});
        }
        a(context);
        b bVar = f22499a.get(str);
        if (bVar != null) {
            return bVar;
        }
        a remove = b.remove(str);
        if (remove == null) {
            return null;
        }
        try {
            Class<?> cls = Class.forName(remove.b);
            if (!com.taobao.themis.kernel.ability.base.a.class.isAssignableFrom(cls)) {
                TMSLogger.d(TAG, remove.b + " doesn't inherit from ThemisAbility");
                return null;
            }
            a((Class<? extends com.taobao.themis.kernel.ability.base.a>) cls, remove.c);
            return f22499a.get(str);
        } catch (Throwable th) {
            TMSLogger.b(TAG, "lazy Init Ability failed", th);
            return null;
        }
    }

    private static void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{context});
        } else if (qpo.b.get()) {
        } else {
            qpo.c(context);
        }
    }
}
