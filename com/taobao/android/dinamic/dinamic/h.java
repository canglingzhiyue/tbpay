package com.taobao.android.dinamic.dinamic;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import mtopsdk.common.util.StringUtils;
import android.util.AttributeSet;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamic.l;
import com.taobao.android.dinamicx.DXDarkModeCenter;
import com.taobao.android.dinamicx.DXRuntimeContext;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import tb.fpa;
import tb.fpd;
import tb.fpn;
import tb.fpo;
import tb.fpq;
import tb.fpr;
import tb.kge;

/* loaded from: classes.dex */
public class h {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "DinamicViewAdvancedConstructor";
    private boolean isInitialize = false;
    private boolean isNeedReflect;
    private boolean isRunSuperMethod;
    private List<a> methodInfos;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public Method f11743a;
        public String[] b;
        public Class[] c;

        static {
            kge.a(-504394084);
        }

        public a(Method method, String[] strArr, Class[] clsArr) {
            this.f11743a = method;
            this.b = strArr;
            this.c = clsArr;
        }
    }

    static {
        kge.a(-1238892169);
    }

    @Deprecated
    public void applyDefaultProperty(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8a0aa03", new Object[]{this, view});
        }
    }

    public static /* synthetic */ void access$000(h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea200511", new Object[]{hVar});
        } else {
            hVar.initialize();
        }
    }

    public h() {
        g.a(new Runnable() { // from class: com.taobao.android.dinamic.dinamic.h.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    h.access$000(h.this);
                }
            }
        });
    }

    public View initializeView(String str, Context context, AttributeSet attributeSet) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("6a3fe4ae", new Object[]{this, str, context, attributeSet}) : new View(context, attributeSet);
    }

    public View initializeViewWithModule(String str, Context context, AttributeSet attributeSet, fpd fpdVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("dd539236", new Object[]{this, str, context, attributeSet, fpdVar}) : initializeView(str, context, attributeSet);
    }

    private void initialize() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b110817", new Object[]{this});
            return;
        }
        if (findSetAttributesMethod() == null) {
            z = true;
        }
        this.isNeedReflect = z;
        scanAllDinamicAttrMethods();
        this.isInitialize = true;
    }

    private Method findSetAttributesMethod() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Method) ipChange.ipc$dispatch("27b83c56", new Object[]{this});
        }
        try {
            return getClassLoader().loadClass(getClass().getName()).getDeclaredMethod("setAttributes", View.class, Map.class, ArrayList.class, fpd.class);
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            return null;
        }
    }

    public void bindDataImpl(View view, Map<String, Object> map, ArrayList<String> arrayList, fpd fpdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50c8e45f", new Object[]{this, view, map, arrayList, fpdVar});
        } else if (!needBindData(view, map, fpdVar)) {
        } else {
            setAttributes(view, map, arrayList, fpdVar);
        }
    }

    public void setAttributes(View view, Map<String, Object> map, ArrayList<String> arrayList, fpd fpdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13e5f00d", new Object[]{this, view, map, arrayList, fpdVar});
            return;
        }
        if (arrayList.contains("dBackgroundColor") || arrayList.contains("dCornerRadius") || arrayList.contains("dBorderColor") || arrayList.contains("dBorderWidth")) {
            setBackground(view, (String) map.get("dCornerRadius"), (String) map.get("dBorderColor"), (String) map.get("dBorderWidth"), (String) map.get("dBackgroundColor"));
        }
        if (arrayList.contains("dAlpha")) {
            setAlpha(view, (String) map.get("dAlpha"));
        }
        if (arrayList.contains("dAccessibilityText")) {
            setAccessibilityText(view, (String) map.get("dAccessibilityText"));
        }
        if (arrayList.contains("dAccessibilityTextHidden")) {
            String str = (String) map.get("dAccessibilityTextHidden");
            if (!StringUtils.isEmpty(str)) {
                setAccessibilityHidden(view, Boolean.valueOf(str).booleanValue());
            } else {
                setAccessibilityHidden(view, true);
            }
        }
        if (arrayList.contains("dDisableDarkMode")) {
            setForceDark(view, Boolean.valueOf((String) map.get("dDisableDarkMode")).booleanValue());
        }
        if (!this.isInitialize) {
            initialize();
        }
        if (!this.isNeedReflect) {
            return;
        }
        HashMap hashMap = new HashMap();
        Iterator<String> it = arrayList.iterator();
        while (it.hasNext()) {
            String next = it.next();
            hashMap.put(next, map.get(next));
        }
        setSpecificAttributes(view, hashMap, fpdVar);
    }

    public void setForceDark(View view, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a4f3508", new Object[]{this, view, new Boolean(z)});
        } else if (!z) {
        } else {
            DXDarkModeCenter.a((DXRuntimeContext) null, view);
        }
    }

    public void setAccessibilityHidden(View view, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d17a21f", new Object[]{this, view, new Boolean(z)});
        } else if (Build.VERSION.SDK_INT < 16) {
            view.setContentDescription("");
        } else if (z) {
            view.setImportantForAccessibility(2);
        } else {
            view.setImportantForAccessibility(1);
        }
    }

    public final fpq handleAttributeSet(AttributeSet attributeSet) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fpq) ipChange.ipc$dispatch("8b0a7566", new Object[]{this, attributeSet});
        }
        fpq fpqVar = new fpq();
        int attributeCount = attributeSet.getAttributeCount();
        if (attributeCount <= 0) {
            return fpqVar;
        }
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        for (int i = 0; i < attributeCount; i++) {
            String attributeName = attributeSet.getAttributeName(i);
            String attributeValue = attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", attributeName);
            if (attributeValue != null) {
                if (attributeName.startsWith("on")) {
                    hashMap3.put(attributeName, attributeValue);
                } else if (attributeValue.startsWith("$") || attributeValue.startsWith("@")) {
                    hashMap2.put(attributeName, attributeValue);
                } else {
                    hashMap.put(attributeName, attributeValue);
                }
            }
        }
        fpqVar.b = hashMap;
        fpqVar.c = Collections.unmodifiableMap(hashMap2);
        fpqVar.d = Collections.unmodifiableMap(hashMap3);
        return fpqVar;
    }

    public void applyDefaultProperty(View view, Map<String, Object> map, fpd fpdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f07c078", new Object[]{this, view, map, fpdVar});
            return;
        }
        if (!map.containsKey("dBackgroundColor")) {
            view.setBackgroundColor(0);
        }
        if (!map.containsKey("dAlpha")) {
            view.setAlpha(1.0f);
        }
        applyDefaultProperty(view);
    }

    public void setAlpha(View view, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70c4359", new Object[]{this, view, str});
        } else if (!StringUtils.isEmpty(str)) {
            try {
                view.setAlpha(Float.valueOf(str).floatValue());
            } catch (NumberFormatException unused) {
                view.setAlpha(1.0f);
            }
        } else {
            view.setAlpha(1.0f);
        }
    }

    public void setVisibility(View view, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca5e8361", new Object[]{this, view, str});
        } else if (StringUtils.equals("visible", str)) {
            view.setVisibility(0);
        } else if (StringUtils.equals("invisible", str)) {
            view.setVisibility(4);
        } else if (StringUtils.equals("gone", str)) {
            view.setVisibility(8);
        } else {
            view.setVisibility(0);
        }
    }

    public void setAccessibilityText(View view, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43d046bc", new Object[]{this, view, str});
        } else {
            view.setContentDescription(str);
        }
    }

    public void setBackground(View view, String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c88fce3", new Object[]{this, view, str, str2, str3, str4});
            return;
        }
        Drawable background = view.getBackground();
        if (background != null && (background instanceof GradientDrawable)) {
            GradientDrawable gradientDrawable = (GradientDrawable) background;
            int a2 = fpn.a(str4, 0);
            if (!StringUtils.isEmpty(str4)) {
                gradientDrawable.setColor(a2);
            }
            if (!StringUtils.isEmpty(str)) {
                gradientDrawable.setCornerRadius(fpr.a(view.getContext(), str, 0));
            }
            if (StringUtils.isEmpty(str2) && StringUtils.isEmpty(str3)) {
                return;
            }
            gradientDrawable.setStroke(fpr.a(view.getContext(), str3, 0), fpn.a(str2, a2));
        } else if (!StringUtils.isEmpty(str) || !StringUtils.isEmpty(str2) || !StringUtils.isEmpty(str3)) {
            int a3 = fpn.a(str4, 0);
            GradientDrawable gradientDrawable2 = new GradientDrawable();
            int a4 = fpr.a(view.getContext(), str, 0);
            int a5 = fpn.a(str2, a3);
            int a6 = fpr.a(view.getContext(), str3, 0);
            gradientDrawable2.setCornerRadius(a4);
            gradientDrawable2.setShape(0);
            gradientDrawable2.setColor(a3);
            if (a6 > 0) {
                gradientDrawable2.setStroke(a6, a5);
            }
            if (Build.VERSION.SDK_INT >= 16) {
                view.setBackground(gradientDrawable2);
            } else {
                view.setBackgroundDrawable(gradientDrawable2);
            }
        } else {
            view.setBackgroundColor(fpn.a(str4, 0));
        }
    }

    public ClassLoader getClassLoader() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ClassLoader) ipChange.ipc$dispatch("8d8cecd6", new Object[]{this}) : getClass().getClassLoader();
    }

    public Class getDebugClass() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("25a5028f", new Object[]{this});
        }
        try {
            return getClassLoader().loadClass(getClass().getName());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

    private void scanAllDinamicAttrMethods() {
        Method[] methods;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("960ad53d", new Object[]{this});
            return;
        }
        try {
            this.methodInfos = new ArrayList();
            for (Method method : getClassLoader().loadClass(getClass().getName()).getMethods()) {
                if (method.isAnnotationPresent(DinamicAttr.class)) {
                    String[] attrSet = ((DinamicAttr) method.getAnnotation(DinamicAttr.class)).attrSet();
                    Class<?>[] parameterTypes = method.getParameterTypes();
                    if (attrSet.length > 0 && parameterTypes.length > 0 && parameterTypes.length - attrSet.length == 1) {
                        this.methodInfos.add(new a(method, attrSet, parameterTypes));
                    } else if (com.taobao.android.dinamic.e.a()) {
                        fpa.a(com.taobao.android.dinamic.e.TAG, "Senioronstructor scanAllDinamicAttrMethods function info error");
                    }
                }
            }
        } catch (Throwable th) {
            if (!com.taobao.android.dinamic.e.a()) {
                return;
            }
            fpa.a(com.taobao.android.dinamic.e.TAG, th, "Senioronstructor scanAllDinamicAttrMethods exception");
        }
    }

    private a findMethodForAttr(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("2f203722", new Object[]{this, str});
        }
        for (a aVar : this.methodInfos) {
            for (String str2 : aVar.b) {
                if (StringUtils.equals(str, str2)) {
                    return aVar;
                }
            }
        }
        return null;
    }

    public boolean needBindData(View view, Map<String, Object> map, fpd fpdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e5369a11", new Object[]{this, view, map, fpdVar})).booleanValue();
        }
        if (map.containsKey("dVisibility")) {
            Object obj = map.get("dVisibility");
            if (obj instanceof String) {
                setVisibility(view, (String) obj);
            }
        }
        return view.getVisibility() != 8;
    }

    private void setSpecificAttributes(View view, Map<String, Object> map, fpd fpdVar) {
        boolean z;
        a findMethodForAttr;
        Object obj;
        Class[] clsArr;
        View view2 = view;
        List<a> list = this.methodInfos;
        if (list == null || list.size() == 0) {
            return;
        }
        fpq a2 = l.a(view);
        Map<String, Object> map2 = a2.b;
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            Iterator it = arrayList.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (StringUtils.equals((String) it.next(), entry.getKey())) {
                        z = true;
                        break;
                    }
                } else {
                    z = false;
                    break;
                }
            }
            if (!z && (findMethodForAttr = findMethodForAttr(entry.getKey())) != null) {
                Method method = findMethodForAttr.f11743a;
                String[] strArr = findMethodForAttr.b;
                Class[] clsArr2 = findMethodForAttr.c;
                if (strArr.length > 1) {
                    arrayList.addAll(Arrays.asList(strArr));
                }
                Object[] objArr = new Object[clsArr2.length];
                if (!clsArr2[0].isInstance(view2)) {
                    fpdVar.c().b().a(com.taobao.android.dinamic.view.a.ERROR_CODE_VIEW_EXCEPTION, a2.f28098a);
                    if (com.taobao.android.dinamic.e.a()) {
                        fpa.b(com.taobao.android.dinamic.e.TAG, "Senioronstructor first param class not match");
                    }
                } else {
                    objArr[0] = view2;
                    int i = 0;
                    while (i < strArr.length) {
                        if ("module".equals(strArr[i])) {
                            obj = fpdVar.b();
                        } else if ("dinamicContext".equals(strArr[i])) {
                            obj = fpdVar.d();
                        } else if ("dinamicParams".equals(strArr[i])) {
                            obj = fpdVar;
                        } else if (map.containsKey(strArr[i])) {
                            obj = map.get(strArr[i]);
                        } else {
                            obj = map2.get(strArr[i]);
                        }
                        int i2 = i + 1;
                        if (clsArr2[i2].isInstance(obj)) {
                            objArr[i2] = obj;
                            clsArr = clsArr2;
                        } else {
                            if (obj != null) {
                                fpdVar.c().b().a(com.taobao.android.dinamic.view.a.ERROR_CODE_VIEW_EXCEPTION, a2.f28098a);
                            }
                            if (com.taobao.android.dinamic.e.a()) {
                                clsArr = clsArr2;
                                fpa.b(com.taobao.android.dinamic.e.TAG, String.format("AdvancedConstructor %s value is null or not exist", strArr[i]));
                            } else {
                                clsArr = clsArr2;
                            }
                            objArr[i2] = null;
                        }
                        i = i2;
                        clsArr2 = clsArr;
                    }
                    try {
                        method.invoke(this, objArr);
                    } catch (Exception e) {
                        fpdVar.c().b().a(com.taobao.android.dinamic.view.a.ERROR_CODE_VIEW_EXCEPTION, a2.f28098a);
                        if (com.taobao.android.dinamic.e.a()) {
                            fpa.a(com.taobao.android.dinamic.e.TAG, e, "AdvancedConstructor method invoke exception");
                        }
                    }
                }
            }
            view2 = view;
        }
    }

    public void setEvents(View view, fpd fpdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6a6a1c6", new Object[]{this, view, fpdVar});
        } else {
            new fpo().a(view, fpdVar);
        }
    }
}
