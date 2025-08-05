package com.taobao.android.detail.ttdetail.behavior;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import tb.kge;

/* loaded from: classes4.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int COMPONENT_BEHAVIOR_TYPE_APPEAR = 1;
    public static final int COMPONENT_BEHAVIOR_TYPE_DISAPPEAR = 2;
    public static final int FLOAT_BEHAVIOR_TYPE_APPEAR = 1;
    public static final int FLOAT_BEHAVIOR_TYPE_DISAPPEAR = 2;
    public static final String NAME_COMPONENT_BEHAVIOR_TYPE_APPEAR = "appear";
    public static final String NAME_COMPONENT_BEHAVIOR_TYPE_DISAPPEAR = "disappear";
    public static final String NAME_COMPONENT_BEHAVIOR_TYPE_UNKNOWN = "unknown";
    public static final String NAME_FLOAT_BEHAVIOR_TYPE_APPEAR = "appear";
    public static final String NAME_FLOAT_BEHAVIOR_TYPE_DISAPPEAR = "disappear";
    public static final String NAME_FLOAT_BEHAVIOR_TYPE_UNKNOWN = "unknown";

    /* renamed from: a  reason: collision with root package name */
    private static final Set<Integer> f10498a;
    private static final Set<Integer> b;

    public static String c(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("24c7dce7", new Object[]{new Integer(i)}) : i != 1 ? i != 2 ? "unknown" : "hoverHide" : "hoverShow";
    }

    public static String e(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b92b0f69", new Object[]{new Integer(i)}) : i != 1 ? i != 2 ? "unknown" : "disappear" : "appear";
    }

    public static String f(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("35ca8aa", new Object[]{new Integer(i)}) : i != 1 ? i != 2 ? "unknown" : "disappear" : "appear";
    }

    static {
        kge.a(-1070345714);
        f10498a = new HashSet<Integer>() { // from class: com.taobao.android.detail.ttdetail.behavior.BehaviorChainGenerator$1
            {
                add(2);
            }
        };
        b = new HashSet<Integer>() { // from class: com.taobao.android.detail.ttdetail.behavior.BehaviorChainGenerator$2
            {
                add(2);
            }
        };
    }

    public static boolean a(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a821939f", new Object[]{new Integer(i)})).booleanValue() : f10498a.contains(Integer.valueOf(i));
    }

    public static JSONObject b(final int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("5045af5a", new Object[]{new Integer(i)}) : new JSONObject(true) { // from class: com.taobao.android.detail.ttdetail.behavior.BehaviorChainGenerator$3
            {
                put("behavior_type", (Object) a.e(i));
                put("time_stamp", (Object) String.valueOf(System.currentTimeMillis()));
            }
        };
    }

    public static JSONObject a(final String str, final String str2, final Map<String, String> map) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("2b06da9", new Object[]{str, str2, map}) : new JSONObject(true) { // from class: com.taobao.android.detail.ttdetail.behavior.BehaviorChainGenerator$5
            {
                put("component_name", (Object) str);
                put("event_type", (Object) str2);
                put("time_stamp", (Object) String.valueOf(System.currentTimeMillis()));
                Map map2 = map;
                if (map2 == null || map2.isEmpty()) {
                    return;
                }
                put("event_info", (Object) new JSONObject() { // from class: com.taobao.android.detail.ttdetail.behavior.BehaviorChainGenerator$5.1
                    {
                        putAll(map);
                    }
                });
            }
        };
    }
}
