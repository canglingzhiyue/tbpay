package tb;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.poplayer.config.fetch.a;
import com.alibaba.poplayer.norm.IConfigAdapter;
import com.alibaba.poplayer.utils.c;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class bzq implements IConfigAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final IConfigAdapter f26209a;
    public JSONObject b;

    static {
        kge.a(1679500838);
        kge.a(-703589047);
    }

    @Override // com.alibaba.poplayer.norm.IConfigAdapter
    public void init(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30e36a5d", new Object[]{this, aVar});
        }
    }

    @Override // com.alibaba.poplayer.norm.IConfigAdapter
    public void startFetchConfig() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bcb53c61", new Object[]{this});
        }
    }

    public bzq(IConfigAdapter iConfigAdapter, JSONObject jSONObject) {
        this.f26209a = iConfigAdapter;
        this.b = jSONObject;
    }

    @Override // com.alibaba.poplayer.norm.IConfigAdapter
    public String getConfigsIdSetString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d0ac231c", new Object[]{this});
        }
        try {
            return this.b.getString("poplayer_config");
        } catch (Throwable th) {
            c.a("FakeIConfigAdapter.getConfigItemByKey.error.", th);
            return "";
        }
    }

    @Override // com.alibaba.poplayer.norm.IConfigAdapter
    public String getConfigItemById(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("22f8c3b2", new Object[]{this, str});
        }
        try {
            return this.b.getString(str);
        } catch (Throwable th) {
            c.a("FakeIConfigAdapter.getConfigItemByKey.error.", th);
            return "";
        }
    }
}
