package tb;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.room.utils.ag;
import com.ut.mini.UTAnalytics;
import com.ut.mini.UTHitBuilders;
import com.ut.mini.module.trackerlistener.b;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes9.dex */
public class rqq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Map<String, rqo> f33326a = new HashMap();

    static {
        kge.a(-757487036);
    }

    public void beginScene(String str, Map<String, String> map, Map<String, String> map2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71cfe214", new Object[]{this, str, map, map2});
            return;
        }
        apr.b("UTSceneTracker", "beginScene", str, "properties", map, "propertiesRule", map2);
        if (StringUtils.isEmpty(str)) {
            return;
        }
        if (this.f33326a.containsKey(str)) {
            apr.c("UTSceneTracker", "repeat beginScene", str);
            return;
        }
        this.f33326a.put(str, new rqo(str, map, map2));
        b.getInstance().beginScene(str, map);
    }

    public void beginScene(String str, Map<String, String> map, Map<String, String> map2, Map<String, String> map3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73e70ef1", new Object[]{this, str, map, map2, map3});
            return;
        }
        apr.b("UTSceneTracker", "beginScene", str, "properties", map, "propertiesRule", map2, "tmpProperties", map3);
        if (StringUtils.isEmpty(str)) {
            return;
        }
        if (this.f33326a.containsKey(str)) {
            apr.c("UTSceneTracker", "repeat beginScene", str);
            return;
        }
        b(map3);
        rqo rqoVar = new rqo(str, map, map2);
        rqoVar.b(map3);
        this.f33326a.put(str, rqoVar);
        b.getInstance().beginScene(str, map);
    }

    public void updateScene(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9272571", new Object[]{this, str, map});
            return;
        }
        apr.b("UTSceneTracker", "updateScene", str, "properties", map);
        if (StringUtils.isEmpty(str)) {
            return;
        }
        if (!this.f33326a.containsKey(str)) {
            apr.c("UTSceneTracker", "need beginScene", str);
            return;
        }
        rqo rqoVar = this.f33326a.get(str);
        if (rqoVar == null) {
            return;
        }
        rqoVar.a(map);
        b.getInstance().updateScene(str, map);
    }

    public void updateTmpScene(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea6f15f6", new Object[]{this, str, map});
            return;
        }
        apr.b("UTSceneTracker", "updateTmpScene", str, "tmpProperties", map);
        if (StringUtils.isEmpty(str)) {
            return;
        }
        if (!this.f33326a.containsKey(str)) {
            apr.c("UTSceneTracker", "need beginScene", str);
            return;
        }
        rqo rqoVar = this.f33326a.get(str);
        if (rqoVar == null) {
            return;
        }
        b(map);
        rqoVar.b(map);
    }

    public Map<String, String> endScene(String str) {
        Map<String, String> a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("c22c46f7", new Object[]{this, str});
        }
        apr.b("UTSceneTracker", "endScene", str);
        HashMap hashMap = null;
        if (StringUtils.isEmpty(str)) {
            return null;
        }
        rqo rqoVar = this.f33326a.get(str);
        if (rqoVar != null && (a2 = rqoVar.a()) != null && a2.size() > 0) {
            hashMap = new HashMap(a2);
        }
        this.f33326a.remove(str);
        b.getInstance().endScene(str, hashMap);
        UTHitBuilders.UTCustomHitBuilder uTCustomHitBuilder = new UTHitBuilders.UTCustomHitBuilder(str);
        uTCustomHitBuilder.setEventPage("UT_Scene");
        uTCustomHitBuilder.setProperties(hashMap);
        UTAnalytics.getInstance().getDefaultTracker().send(uTCustomHitBuilder.build());
        return hashMap;
    }

    public Map<String, String> a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("4fc7ad92", new Object[]{this, map});
        }
        Map<String, rqo> map2 = this.f33326a;
        if (map2 == null || map2.size() <= 0 || map == null || map.size() <= 0) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, rqo> entry : this.f33326a.entrySet()) {
            rqo value = entry.getValue();
            if (value != null) {
                value.c(map);
                Map<String, String> a2 = value.a();
                if (a2 != null) {
                    hashMap.putAll(a2);
                }
            }
        }
        return hashMap;
    }

    private void b(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41e3e87c", new Object[]{this, map});
        } else if (map == null) {
        } else {
            map.remove("spm");
            map.remove("spm-cnt");
            map.remove("spm-url");
            map.remove(bip.KEY_UMBRELLA_SPM_PRE);
            map.remove("utparam-cnt");
            map.remove(ag.KEY_UTPARAM_URL);
            map.remove("utparam-pre");
        }
    }
}
