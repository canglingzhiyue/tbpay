package com.taobao.android.dxv4common.logic.dex.bridge;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.exception.a;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.expression.expr_v2.f;
import com.taobao.android.dinamicx.monitor.DXMonitorConstant;
import com.taobao.android.dinamicx.monitor.b;
import com.taobao.android.dinamicx.s;
import dalvik.system.DexClassLoader;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import tb.fuw;
import tb.fux;
import tb.kge;

/* loaded from: classes5.dex */
public class DXNativeLogicEngine {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG_DXRUNTINECONTEXT = "dx_runtimeContext";
    private static final String TAG_STATE_ID = "state_id";
    private AtomicLong atomicLong = new AtomicLong();
    private String bridgeClassName;
    private Class classDXEvent;
    private Class classDXRuntimeContext;
    private List<DXNativeLogicLoader> loaderList;
    private Class mainClass;
    private DXNativeLogicLoader mainClassLoader;

    static {
        kge.a(898963415);
    }

    public DXNativeLogicEngine(String str, String str2, String str3, String str4, String str5, List<DXNativeLogicLoader> list) throws Exception {
        this.loaderList = list;
        if (list == null || list.size() == 0) {
            this.mainClassLoader = new DXNativeLogicLoader(str, false);
        } else {
            DXNativeLogicLoader dXNativeLogicLoader = list.get(list.size() - 1);
            this.mainClassLoader = new DXNativeLogicLoader(str, false, null, null, dXNativeLogicLoader, dXNativeLogicLoader.getName(), dXNativeLogicLoader.getVersion(), "null", "null", "default", "default");
        }
        this.mainClassLoader.setNeedFind(true);
        this.mainClass = this.mainClassLoader.loadClass(str2);
        this.classDXEvent = this.mainClassLoader.loadClass(str3);
        this.classDXRuntimeContext = this.mainClassLoader.loadClass(str4);
        this.bridgeClassName = str5;
        init();
    }

    public void callNativeLogicFunc(DexClassLoader dexClassLoader, DXRuntimeContext dXRuntimeContext, String str, String str2, List<Object> list) {
        try {
            Class loadClass = dexClassLoader.loadClass(str);
            Method method = loadClass.getMethod(str2, String.class);
            new HashMap().put(TAG_DXRUNTINECONTEXT, dXRuntimeContext);
            method.invoke(loadClass.newInstance(), list.toArray());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void callNativeLogicFunc(DXRuntimeContext dXRuntimeContext, DXEvent dXEvent, String str, Map<String, Object> map) {
        try {
            Class classDXEvent = getClassDXEvent();
            Class classDXRuntimeContext = getClassDXRuntimeContext();
            Method method = this.mainClass.getMethod(str, classDXEvent, Map.class, classDXRuntimeContext);
            Object newInstance = classDXRuntimeContext.newInstance();
            Object obj = "" + this.atomicLong.incrementAndGet();
            setField(newInstance, "identifier", obj);
            setField(newInstance, "data", dXRuntimeContext.e());
            setField(newInstance, "subData", dXRuntimeContext.f());
            Object newInstance2 = classDXEvent.newInstance();
            setField(newInstance2, "identifier", obj);
            JSONObject jSONObject = null;
            try {
                if (dXEvent.getArgs() != null && !dXEvent.getArgs().isEmpty()) {
                    jSONObject = new JSONObject();
                    for (Map.Entry<String, f> entry : dXEvent.getArgs().entrySet()) {
                        if (entry.getKey() != null && entry.getValue() != null) {
                            jSONObject.put(entry.getKey(), entry.getValue().D());
                        }
                    }
                }
                setField(newInstance2, "data", jSONObject);
            } catch (Throwable unused) {
            }
            map.put(TAG_STATE_ID, obj);
            method.invoke(this.mainClass.newInstance(), newInstance2, map, newInstance);
        } catch (Throwable th) {
            s sVar = new s(dXRuntimeContext.A());
            sVar.b = dXRuntimeContext.c();
            s.a aVar = new s.a(DXMonitorConstant.DX_MONITOR_V4_LOGIC, DXMonitorConstant.DX_MONITOR_V4_LOGIC_ERROR, s.DX_V4_LOGIC_4100002);
            aVar.e = a.a(th);
            sVar.c.add(aVar);
            b.a(sVar);
            a.d(th);
            fux.b(a.a(th));
        }
    }

    public void setField(Object obj, String str, Object obj2) {
        try {
            Field declaredField = obj.getClass().getDeclaredField(str);
            declaredField.setAccessible(true);
            declaredField.set(obj, obj2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void init() throws Exception {
        Field declaredField = this.mainClassLoader.loadClass(this.bridgeClassName).getDeclaredField("Companion");
        declaredField.setAccessible(true);
        Object obj = declaredField.get(null);
        this.mainClassLoader.loadClass(this.bridgeClassName + "$Companion").getMethod("setupMegaBridge", new Class[0]).invoke(obj, new Object[0]);
        fuw.b(" 已经完成 setupMegaBridgeMethod ");
    }

    public Class getClassDXEvent() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Class) ipChange.ipc$dispatch("ff6a9598", new Object[]{this}) : this.classDXEvent;
    }

    public Class getClassDXRuntimeContext() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Class) ipChange.ipc$dispatch("1bd516e1", new Object[]{this}) : this.classDXRuntimeContext;
    }
}
