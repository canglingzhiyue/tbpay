package com.alibaba.android.ultron.vfw.weex2.highPerformance.management;

import mtopsdk.common.util.StringUtils;
import com.alibaba.android.ultron.vfw.weex2.highPerformance.model.UltronTradeHybridStage;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.utils.UnifyLog;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.abm;
import tb.iro;
import tb.jqg;
import tb.kge;

/* loaded from: classes2.dex */
public class e implements k {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private abm b;

    /* renamed from: a  reason: collision with root package name */
    private com.alibaba.android.ultron.vfw.weex2.highPerformance.storage.a f2777a = new com.alibaba.android.ultron.vfw.weex2.highPerformance.storage.a();
    private Map<String, String> c = new ConcurrentHashMap();

    static {
        kge.a(-1875642893);
        kge.a(718836347);
        kge.a(1900527407);
    }

    public e(abm abmVar) {
        this.b = abmVar;
    }

    @Override // com.alibaba.android.ultron.vfw.weex2.highPerformance.management.k
    public void a(String str, String str2, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2bf4cf4", new Object[]{this, str, str2, jSONObject});
            return;
        }
        char c = 65535;
        int hashCode = str.hashCode();
        if (hashCode != -2015797284) {
            if (hashCode == 105941182 && str.equals(UltronTradeHybridStage.ON_MEMORY_WARNING)) {
                c = 1;
            }
        } else if (str.equals(UltronTradeHybridStage.ON_CONTAINER_DESTROY)) {
            c = 0;
        }
        if (c == 0) {
            c(str2);
        } else if (c == 1) {
            c(str2);
        } else {
            jqg.a("UltronTradeHybridStorageManager", "onStage", "unknown stage");
        }
    }

    public boolean a(String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d9378d80", new Object[]{this, str, str2})).booleanValue() : iro.d(str);
    }

    public JSONObject a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("73d7af52", new Object[]{this, str}) : this.f2777a.a(str);
    }

    public void a(String str, JSONObject jSONObject, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60825986", new Object[]{this, str, jSONObject, new Long(j)});
        } else {
            this.f2777a.a(str, jSONObject, j);
        }
    }

    public void a(String str, com.alibaba.android.ultron.vfw.weex2.highPerformance.model.d dVar, String str2, JSONObject jSONObject, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2684ca2", new Object[]{this, str, dVar, str2, jSONObject, new Long(j)});
            return;
        }
        Map<String, String> map = this.c;
        map.put(str + "_" + dVar.f2791a, str2);
        a(str2, jSONObject, j);
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else {
            this.f2777a.b(str);
        }
    }

    public void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
        } else if (!a(str, null)) {
            jqg.b("UltronTradeHybridStorageManager.deleteStorageByPreRequest", String.format("%s switcher is off", str));
        } else {
            abm abmVar = this.b;
            if (abmVar == null) {
                UnifyLog.d("UltronTradeHybridStorageManager.deleteStorageByPreRequest", "mConfig is null");
                return;
            }
            com.alibaba.android.ultron.vfw.weex2.highPerformance.model.e b = abmVar.b(str);
            if (b == null || b.c == null) {
                UnifyLog.d("UltronTradeHybridStorageManager.deleteStorageByPreRequest", "sceneModel or sceneModel.preRequestModels is null");
                return;
            }
            for (com.alibaba.android.ultron.vfw.weex2.highPerformance.model.d dVar : b.c) {
                if (dVar != null && dVar.f == null) {
                    if (!StringUtils.equals(dVar.c.c, "destroy")) {
                        UnifyLog.b("UltronTradeHybridStorageManager.deleteStorageByPreRequest", "need't to destroy");
                    } else {
                        String str2 = str + "_" + dVar.f2791a;
                        b(this.c.get(str2));
                        this.c.remove(str2);
                    }
                }
            }
        }
    }
}
