package com.taobao.android.diagnose.func;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.fastjson.parser.Feature;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.diagnose.c;
import com.taobao.android.diagnose.common.d;
import com.taobao.android.diagnose.v;
import java.io.File;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.fmy;
import tb.kge;

/* loaded from: classes.dex */
public class ToolConfigManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static Map<String, ToolConfigInfo> f11709a;

    static {
        kge.a(2127990502);
        f11709a = new ConcurrentHashMap();
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
        } else {
            c();
        }
    }

    public static void a(String str, long j, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa210a1c", new Object[]{str, new Long(j), str2});
            return;
        }
        try {
            if (StringUtils.isEmpty(str)) {
                return;
            }
            v.a("ToolConfigManager", String.format("addToolConfig: %s_%d", str, Long.valueOf(j)));
            List<ToolConfigData> list = (List) JSON.parseObject(str2, new TypeReference<List<ToolConfigData>>() { // from class: com.taobao.android.diagnose.func.ToolConfigManager.1
            }, new Feature[0]);
            if (list == null) {
                v.c("ToolConfigManager", "Failed to parse configData");
                return;
            }
            ToolConfigInfo toolConfigInfo = new ToolConfigInfo();
            toolConfigInfo.id = str;
            toolConfigInfo.ver = j;
            toolConfigInfo.configData = list;
            a(true, toolConfigInfo);
            a(toolConfigInfo);
        } catch (Exception e) {
            v.a("ToolConfigManager", "Failed to add tool config.", e);
        }
    }

    public static void a(String str, String str2, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4dba98c8", new Object[]{str, str2, new Long(j)});
        } else if (!"scene_change_config".equals(str) || !com.taobao.android.diagnose.scene.a.a("scene_change_config")) {
        } else {
            a(str2, j);
        }
    }

    public static void a(fmy fmyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8db4106", new Object[]{fmyVar});
        } else if (fmyVar == null) {
        } else {
            a(fmyVar.c(), fmyVar.a(), fmyVar.b());
        }
    }

    private static void a(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8123b0d2", new Object[]{str, new Long(j)});
            return;
        }
        ToolConfigInfo b = b(str, j);
        if (b == null) {
            v.c("ToolConfigManager", String.format("Can't find the config info of %s_%d", str, Long.valueOf(j)));
            return;
        }
        v.a("ToolConfigManager", "removeToolConfig: " + b.getVersion());
        a(false, b);
    }

    private static void a(boolean z, ToolConfigInfo toolConfigInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a463046f", new Object[]{new Boolean(z), toolConfigInfo});
            return;
        }
        try {
            for (ToolConfigData toolConfigData : toolConfigInfo.configData) {
                a(z, toolConfigData, toolConfigInfo.getVersion());
            }
        } catch (Exception e) {
            v.a("ToolConfigManager", "Failed to handleToolConfig.", e);
        }
    }

    private static void a(boolean z, ToolConfigData toolConfigData, String str) {
        Method declaredMethod;
        try {
            if (StringUtils.isEmpty(toolConfigData.className)) {
                v.a("ToolConfigManager", "The class name is null");
                return;
            }
            Class<?> cls = Class.forName(toolConfigData.className);
            if (cls == null || (declaredMethod = cls.getDeclaredMethod("onDiagnoseConfigUpdate", String.class, String.class, Map.class)) == null) {
                return;
            }
            if (z) {
                declaredMethod.invoke(null, toolConfigData.name, str, toolConfigData.getConfigMap());
            } else {
                declaredMethod.invoke(null, toolConfigData.name, str, null);
            }
            v.a("ToolConfigManager", "Notify the class: " + toolConfigData.className);
        } catch (Exception e) {
            v.a("ToolConfigManager", "Failed to notify tool config.", e);
        }
    }

    /* loaded from: classes5.dex */
    public static class ToolConfigData {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public String className;
        @JSONField(serialize = false)
        public String config;
        public String name;

        static {
            kge.a(-975805598);
        }

        @JSONField(serialize = false)
        public Map<String, String> getConfigMap() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("7d126180", new Object[]{this});
            }
            try {
                return (Map) JSON.parseObject(this.config, new TypeReference<Map<String, String>>() { // from class: com.taobao.android.diagnose.func.ToolConfigManager.ToolConfigData.1
                }, new Feature[0]);
            } catch (Exception e) {
                v.a("ToolConfigManager", "getConfigMap error", e);
                return null;
            }
        }
    }

    /* loaded from: classes5.dex */
    public static class ToolConfigInfo {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public List<ToolConfigData> configData;
        public String id;
        public long ver;

        static {
            kge.a(-975644570);
        }

        @JSONField(serialize = false)
        public String getVersion() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("2a8fef97", new Object[]{this}) : String.format("%s_%s", this.id, Long.valueOf(this.ver));
        }
    }

    private static void a(ToolConfigInfo toolConfigInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64f5d9f3", new Object[]{toolConfigInfo});
            return;
        }
        ToolConfigInfo toolConfigInfo2 = f11709a.get(toolConfigInfo.id);
        if (toolConfigInfo2 != null && toolConfigInfo2.ver == toolConfigInfo.ver) {
            return;
        }
        f11709a.put(toolConfigInfo.id, toolConfigInfo);
        b();
    }

    private static ToolConfigInfo b(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ToolConfigInfo) ipChange.ipc$dispatch("dd36e7c", new Object[]{str, new Long(j)});
        }
        ToolConfigInfo toolConfigInfo = f11709a.get(str);
        if (toolConfigInfo == null || toolConfigInfo.ver != j) {
            return null;
        }
        f11709a.remove(str);
        b();
        return toolConfigInfo;
    }

    private static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[0]);
            return;
        }
        try {
            d.a(new File(c.a().g(), "tool.config"), JSON.toJSONString(f11709a));
            v.a("ToolConfigManager", "Save to tool config!");
        } catch (Exception e) {
            v.a("ToolConfigManager", "Failed to save config info", e);
        }
    }

    private static void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[0]);
            return;
        }
        try {
            String a2 = d.a(new File(c.a().g(), "tool.config"));
            if (StringUtils.isEmpty(a2)) {
                return;
            }
            f11709a = (Map) JSON.parseObject(a2, new TypeReference<ConcurrentHashMap<String, ToolConfigInfo>>() { // from class: com.taobao.android.diagnose.func.ToolConfigManager.2
            }, new Feature[0]);
        } catch (Exception e) {
            v.a("ToolConfigManager", "Failed to save config info", e);
        }
    }
}
