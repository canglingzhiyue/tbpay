package com.taobao.android.detail.ttdetail.utils;

import mtopsdk.common.util.StringUtils;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.component.module.DataEntry;
import com.taobao.android.detail.ttdetail.handler.event.RuntimeAbilityParam;
import java.util.List;
import java.util.Map;
import tb.eyy;
import tb.ezc;
import tb.kge;

/* loaded from: classes5.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1659963515);
    }

    public static com.taobao.android.detail.ttdetail.component.module.d b(int i, List<? extends com.taobao.android.detail.ttdetail.component.module.d> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.detail.ttdetail.component.module.d) ipChange.ipc$dispatch("e51ae3b6", new Object[]{new Integer(i), list});
        }
        if (list == null || i < 0 || i >= list.size()) {
            return null;
        }
        return list.get(i);
    }

    public static void a(int i, int i2, List<? extends com.taobao.android.detail.ttdetail.component.module.d> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32d14fb9", new Object[]{new Integer(i), new Integer(i2), list});
            return;
        }
        com.taobao.android.detail.ttdetail.component.module.d b = b(i, list);
        if (b != null) {
            b.didAppear();
        }
        com.taobao.android.detail.ttdetail.component.module.d b2 = b(i2, list);
        if (b2 == null) {
            return;
        }
        b2.willDisAppear();
        b2.disAppear();
    }

    public static void c(int i, List<? extends com.taobao.android.detail.ttdetail.component.module.d> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f6effca", new Object[]{new Integer(i), list});
            return;
        }
        com.taobao.android.detail.ttdetail.component.module.d b = b(i, list);
        if (b == null) {
            return;
        }
        b.didAppear();
    }

    public static void d(int i, List<? extends com.taobao.android.detail.ttdetail.component.module.d> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5f4ba69", new Object[]{new Integer(i), list});
            return;
        }
        com.taobao.android.detail.ttdetail.component.module.d b = b(i, list);
        if (b == null) {
            return;
        }
        b.willDisAppear();
        b.disAppear();
    }

    private static boolean a(int i, int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2621a7ed", new Object[]{new Integer(i), iArr})).booleanValue();
        }
        if (iArr == null) {
            return false;
        }
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    public static void a(int[] iArr, List<? extends com.taobao.android.detail.ttdetail.component.module.d> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c326267", new Object[]{iArr, list});
        } else if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                com.taobao.android.detail.ttdetail.component.module.d b = b(i, list);
                if (b != null) {
                    if (a(i, iArr)) {
                        b.willDisAppear();
                        b.disAppear();
                    }
                    b.destroy();
                }
            }
        }
    }

    public static void a(int i, List<? extends com.taobao.android.detail.ttdetail.component.module.d> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52638a8c", new Object[]{new Integer(i), list});
        } else if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                com.taobao.android.detail.ttdetail.component.module.d b = b(i2, list);
                if (b != null) {
                    if (i2 == i) {
                        b.willDisAppear();
                        b.disAppear();
                    }
                    b.destroy();
                }
            }
        }
    }

    public static boolean a(ezc ezcVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e7d399ce", new Object[]{ezcVar})).booleanValue() : ezcVar.h().c().equals("native$headervideo");
    }

    public static boolean b(ezc ezcVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d656a04f", new Object[]{ezcVar})).booleanValue() : ezcVar.h().c().equals("native$headerbgimage");
    }

    public static String a(com.taobao.android.detail.ttdetail.component.module.h hVar) {
        ezc ezcVar;
        eyy h;
        JSONObject d;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bdf04ed1", new Object[]{hVar});
        }
        if (hVar != null && (ezcVar = (ezc) hVar.getComponentData()) != null && (h = ezcVar.h()) != null && (d = h.d()) != null) {
            return d.getString(com.taobao.android.detail.core.aura.observer.a.KEY_PROP_PATH);
        }
        return null;
    }

    public static boolean a(DataEntry... dataEntryArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ff67ccee", new Object[]{dataEntryArr})).booleanValue();
        }
        if (dataEntryArr != null && dataEntryArr.length != 0) {
            DataEntry dataEntry = new DataEntry(com.taobao.android.detail.ttdetail.constant.a.KEY_IS_LIGHT_OFF, "true");
            for (DataEntry dataEntry2 : dataEntryArr) {
                if (dataEntry.equals(dataEntry2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static JSONObject e(eyy eyyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("63f2ab97", new Object[]{eyyVar});
        }
        Map<String, List<com.taobao.android.detail.ttdetail.handler.event.a>> f = eyyVar.f();
        if (f != null && !f.isEmpty()) {
            for (Map.Entry<String, List<com.taobao.android.detail.ttdetail.handler.event.a>> entry : f.entrySet()) {
                for (com.taobao.android.detail.ttdetail.handler.event.a aVar : entry.getValue()) {
                    if ("request".equalsIgnoreCase(aVar.a())) {
                        return aVar.b();
                    }
                }
            }
        }
        return null;
    }

    public static boolean a(eyy eyyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e7cf8277", new Object[]{eyyVar})).booleanValue();
        }
        JSONObject d = eyyVar.d();
        return (d == null || d.getString("asyncStatus") == null || c(eyyVar) == null) ? false : true;
    }

    public static JSONObject c(eyy eyyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("2eb12695", new Object[]{eyyVar});
        }
        List<com.taobao.android.detail.ttdetail.handler.event.a> a2 = eyyVar.a(com.taobao.android.detail.ttdetail.async.b.EVENT_LIST_NAME);
        if (a2 == null) {
            return null;
        }
        for (com.taobao.android.detail.ttdetail.handler.event.a aVar : a2) {
            if (com.taobao.android.detail.ttdetail.async.b.sEventTypes.contains(aVar.a())) {
                return aVar.b();
            }
        }
        return null;
    }

    public static boolean b(eyy eyyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d65288f8", new Object[]{eyyVar})).booleanValue();
        }
        JSONObject d = eyyVar.d();
        if (d == null) {
            return false;
        }
        return StringUtils.equals("success", d.getString("asyncStatus"));
    }

    public static boolean d(eyy eyyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b35895fa", new Object[]{eyyVar})).booleanValue();
        }
        if (!a(eyyVar)) {
            return true;
        }
        return b(eyyVar);
    }

    public static com.taobao.android.detail.ttdetail.component.module.d a(RuntimeAbilityParam... runtimeAbilityParamArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.detail.ttdetail.component.module.d) ipChange.ipc$dispatch("521b7439", new Object[]{runtimeAbilityParamArr});
        }
        if (runtimeAbilityParamArr == null) {
            return null;
        }
        for (RuntimeAbilityParam runtimeAbilityParam : runtimeAbilityParamArr) {
            if ("ttTriggerComponent".equals(runtimeAbilityParam.getKey())) {
                Object value = runtimeAbilityParam.getValue();
                if (value instanceof com.taobao.android.detail.ttdetail.component.module.d) {
                    return (com.taobao.android.detail.ttdetail.component.module.d) value;
                }
            }
        }
        return null;
    }

    public static View b(RuntimeAbilityParam... runtimeAbilityParamArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("44bb524f", new Object[]{runtimeAbilityParamArr});
        }
        if (runtimeAbilityParamArr == null) {
            return null;
        }
        for (RuntimeAbilityParam runtimeAbilityParam : runtimeAbilityParamArr) {
            if ("ttTriggerView".equals(runtimeAbilityParam.getKey())) {
                Object value = runtimeAbilityParam.getValue();
                if (value instanceof View) {
                    return (View) value;
                }
            }
        }
        return null;
    }

    public static View c(RuntimeAbilityParam... runtimeAbilityParamArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("147b85ee", new Object[]{runtimeAbilityParamArr});
        }
        if (runtimeAbilityParamArr == null) {
            return null;
        }
        for (RuntimeAbilityParam runtimeAbilityParam : runtimeAbilityParamArr) {
            if ("ttTriggerRootView".equals(runtimeAbilityParam.getKey())) {
                Object value = runtimeAbilityParam.getValue();
                if (value instanceof View) {
                    return (View) value;
                }
            }
        }
        return null;
    }
}
