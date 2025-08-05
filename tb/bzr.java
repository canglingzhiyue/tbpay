package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.poplayer.config.fetch.a;
import com.alibaba.poplayer.config.manager.c;
import com.alibaba.poplayer.config.model.trigger.UriModel;
import com.alibaba.poplayer.norm.INewConfigAdapter;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
public class bzr implements INewConfigAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String MOCK_CONFIG_VERSION = "mock";

    /* renamed from: a  reason: collision with root package name */
    public final INewConfigAdapter f26210a;
    private JSONObject b;
    private final Map<String, Set<String>> c = new HashMap();
    private final Set<String> d = new HashSet();

    static {
        kge.a(1935511962);
        kge.a(1326248657);
    }

    @Override // com.alibaba.poplayer.norm.INewConfigAdapter
    public String getCurConfigVersion() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9a14762d", new Object[]{this}) : "mock";
    }

    @Override // com.alibaba.poplayer.norm.INewConfigAdapter
    public void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
        }
    }

    public bzr(INewConfigAdapter iNewConfigAdapter, JSONObject jSONObject) {
        this.f26210a = iNewConfigAdapter;
        a(jSONObject);
    }

    public void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
            return;
        }
        this.b = jSONObject;
        this.c.clear();
        this.d.clear();
        a();
    }

    private void a() {
        String[] split;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        for (String str : this.b.getString("poplayer_config").split(",")) {
            if (!TextUtils.isEmpty(str)) {
                this.d.add(str);
                for (UriModel uriModel : c.a(this.b.getString(str), str, "mock").triggerConfigs.pages) {
                    for (String str2 : uriModel.uris) {
                        a(str2, str);
                    }
                }
            }
        }
    }

    private void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
            return;
        }
        Set<String> set = this.c.get(str);
        if (set == null) {
            set = new HashSet<>();
            this.c.put(str, set);
        }
        set.add(str2);
    }

    @Override // com.alibaba.poplayer.norm.INewConfigAdapter
    public void startFetchConfig(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9abbe5d3", new Object[]{this, aVar});
        } else {
            aVar.onConfigFetched(true, "mock", JSON.toJSONString(this.c), this.d);
        }
    }

    @Override // com.alibaba.poplayer.norm.INewConfigAdapter
    public String getConfigItemById(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("22f8c3b2", new Object[]{this, str});
        }
        try {
            return this.b.getString(str);
        } catch (Throwable th) {
            com.alibaba.poplayer.utils.c.a("ConfigFetcherNew.getConfigItemById.error", th);
            return null;
        }
    }

    @Override // com.alibaba.poplayer.norm.INewConfigAdapter
    public Set<String> getConfigsIdSet() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Set) ipChange.ipc$dispatch("74182602", new Object[]{this}) : this.d;
    }

    @Override // com.alibaba.poplayer.norm.INewConfigAdapter
    public Map<String, Set<String>> getUriConfigsMap() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("5b40cd3d", new Object[]{this}) : this.c;
    }
}
