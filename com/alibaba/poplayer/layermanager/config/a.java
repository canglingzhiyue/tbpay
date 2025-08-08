package com.alibaba.poplayer.layermanager.config;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.poplayer.PopLayer;
import com.alibaba.poplayer.layermanager.c;
import com.alibaba.poplayer.utils.f;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import tb.kge;

/* loaded from: classes3.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a */
    private static final String f3193a;
    private Map<String, BizConfig> b;
    private c c;
    private volatile boolean e = false;

    public static /* synthetic */ void lambda$LJt2MAhrgUiuPyvpfTV9QvuK4LY(a aVar) {
        aVar.d();
    }

    static {
        kge.a(-1397701075);
        f3193a = a.class.getSimpleName();
    }

    public a(c cVar) {
        this.c = cVar;
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : this.e;
    }

    public BizConfig a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BizConfig) ipChange.ipc$dispatch("52ff1086", new Object[]{this, str});
        }
        Map<String, BizConfig> map = this.b;
        if (map == null || map.isEmpty()) {
            return null;
        }
        for (String str2 : this.b.keySet()) {
            if (!StringUtils.isEmpty(str2) && str2.equals(str)) {
                return this.b.get(str2);
            }
        }
        return this.b.get("default");
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            f.a(new Runnable() { // from class: com.alibaba.poplayer.layermanager.config.-$$Lambda$a$LJt2MAhrgUiuPyvpfTV9QvuK4LY
                {
                    a.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    a.lambda$LJt2MAhrgUiuPyvpfTV9QvuK4LY(a.this);
                }
            });
        }
    }

    public /* synthetic */ void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        try {
            this.e = true;
            a(c());
        } catch (Throwable th) {
            com.alibaba.poplayer.utils.c.a("updateConfig.isLaunchOptEnable.error.", th);
        }
    }

    private b c() {
        String[] split;
        BizConfig bizConfig;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("5a3606c4", new Object[]{this});
        }
        b bVar = new b();
        String a2 = this.c.a("layer_manager_config");
        if (StringUtils.isEmpty(a2)) {
            return bVar;
        }
        for (String str : a2.split(",")) {
            if (!StringUtils.isEmpty(str)) {
                String trim = str.trim();
                String a3 = this.c.a(trim);
                try {
                    bizConfig = new BizConfig();
                    JSONObject parseObject = JSONObject.parseObject(a3);
                    if (parseObject != null) {
                        for (String str2 : parseObject.keySet()) {
                            bizConfig.mConfigs.put(str2, (ConfigItem) parseObject.getObject(str2, ConfigItem.class));
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                }
                if (!bizConfig.mConfigs.isEmpty()) {
                    b.a(bVar).put(trim, bizConfig);
                    Object[] objArr = new Object[3];
                    objArr[0] = f3193a;
                    try {
                        objArr[1] = "layer_manager_config";
                        objArr[2] = trim;
                        com.alibaba.poplayer.utils.c.a("%s. --> complete bizId:{%s}. update", objArr);
                    } catch (Throwable th2) {
                        th = th2;
                        com.alibaba.poplayer.utils.c.a("" + f3193a + ".update key:" + trim + ",error.", th);
                    }
                }
            }
        }
        try {
            String a4 = this.c.a("directlyBlackList");
            if (!StringUtils.isEmpty(a4)) {
                for (String str3 : JSON.parseArray(a4, String.class)) {
                    if (!StringUtils.isEmpty(str3)) {
                        b.b(bVar).add(str3);
                    }
                }
            }
        } catch (Throwable th3) {
            com.alibaba.poplayer.utils.c.a("" + f3193a + ".parse directlyBlackString.error.", th3);
        }
        return bVar;
    }

    private void a(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("932f080", new Object[]{this, bVar});
            return;
        }
        this.b = b.a(bVar);
        PopLayer.getReference().getConfigMgr().setDirectlyBlackList(b.b(bVar));
        this.e = false;
        com.alibaba.poplayer.utils.c.c("sdkLifeCycle", "", "LayerManager.ConfigMgr.onConfigChanged");
        com.alibaba.poplayer.layermanager.f.a().d();
    }

    /* loaded from: classes3.dex */
    public final class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private Map<String, BizConfig> b = new ConcurrentHashMap();
        private List<String> c = new CopyOnWriteArrayList();

        static {
            kge.a(-216975866);
        }

        public static /* synthetic */ Map a(b bVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("20b622b5", new Object[]{bVar}) : bVar.b;
        }

        public static /* synthetic */ List b(b bVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("603359e6", new Object[]{bVar}) : bVar.c;
        }

        public b() {
            a.this = r1;
        }
    }
}
