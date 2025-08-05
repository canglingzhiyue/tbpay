package tb;

import com.alibaba.android.nextrpc.request.AttachedResponse;
import com.alibaba.android.nextrpc.stream.internal.response.StreamRemoteMainResponse;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.Map;
import mtopsdk.mtop.domain.MtopResponse;

/* loaded from: classes6.dex */
public abstract class jnv implements joc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1682671590);
        kge.a(1921286467);
    }

    public void a(int i, MtopResponse mtopResponse, Object obj, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b3ee389", new Object[]{this, new Integer(i), mtopResponse, obj, map});
        }
    }

    public void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
        }
    }

    public void a(List<JSONObject> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
        }
    }

    public void a(jny jnyVar, StreamRemoteMainResponse streamRemoteMainResponse, List<AttachedResponse> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("caa2cc62", new Object[]{this, jnyVar, streamRemoteMainResponse, list});
        }
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public boolean a(int i, MtopResponse mtopResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1f4c7080", new Object[]{this, new Integer(i), mtopResponse, obj})).booleanValue();
        }
        return false;
    }

    public void b(int i, MtopResponse mtopResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac39879b", new Object[]{this, new Integer(i), mtopResponse, obj});
        }
    }

    public boolean a(String str, List<AttachedResponse> list) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c1aa3527", new Object[]{this, str, list})).booleanValue() : list != null && !list.isEmpty() && list.get(0).getReqId().equals(str);
    }
}
