package tb;

import com.alibaba.android.nextrpc.request.AttachedResponse;
import com.alibaba.android.nextrpc.stream.internal.response.StreamRemoteMainResponse;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.Map;
import mtopsdk.mtop.domain.MtopResponse;

/* loaded from: classes2.dex */
public class bct extends jnv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private jnv f25812a;

    static {
        kge.a(484450273);
    }

    public static /* synthetic */ Object ipc$super(bct bctVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1045809881:
                return new Boolean(super.a((String) objArr[0], (List) objArr[1]));
            case -895300510:
                super.a((jny) objArr[0], (StreamRemoteMainResponse) objArr[1], (List) objArr[2]);
                return null;
            case 40303496:
                super.a((JSONObject) objArr[0]);
                return null;
            case 90991724:
                return new Boolean(super.a());
            case 525103232:
                return new Boolean(super.a(((Number) objArr[0]).intValue(), (MtopResponse) objArr[1], objArr[2]));
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public bct(jnv jnvVar) {
        this.f25812a = jnvVar;
    }

    @Override // tb.jnv
    public void a(jny jnyVar, StreamRemoteMainResponse streamRemoteMainResponse, List<AttachedResponse> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("caa2cc62", new Object[]{this, jnyVar, streamRemoteMainResponse, list});
            return;
        }
        super.a(jnyVar, streamRemoteMainResponse, list);
        jnv jnvVar = this.f25812a;
        if (jnvVar == null) {
            return;
        }
        jnvVar.a(jnyVar, streamRemoteMainResponse, list);
    }

    @Override // tb.jnv
    public boolean a(int i, MtopResponse mtopResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1f4c7080", new Object[]{this, new Integer(i), mtopResponse, obj})).booleanValue();
        }
        jnv jnvVar = this.f25812a;
        if (jnvVar != null) {
            return jnvVar.a(i, mtopResponse, obj);
        }
        return super.a(i, mtopResponse, obj);
    }

    @Override // tb.jnv
    public void a(List<JSONObject> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
            return;
        }
        jnv jnvVar = this.f25812a;
        if (jnvVar == null) {
            return;
        }
        jnvVar.a(list);
    }

    @Override // tb.jnv
    public boolean a(String str, List<AttachedResponse> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c1aa3527", new Object[]{this, str, list})).booleanValue();
        }
        jnv jnvVar = this.f25812a;
        if (jnvVar != null) {
            return jnvVar.a(str, list);
        }
        return super.a(str, list);
    }

    @Override // tb.jnv
    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        jnv jnvVar = this.f25812a;
        if (jnvVar != null) {
            return jnvVar.a();
        }
        return super.a();
    }

    @Override // tb.jnv
    public void b(int i, MtopResponse mtopResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac39879b", new Object[]{this, new Integer(i), mtopResponse, obj});
            return;
        }
        jnv jnvVar = this.f25812a;
        if (jnvVar == null) {
            return;
        }
        jnvVar.b(i, mtopResponse, obj);
    }

    @Override // tb.jnv
    public void a(int i, MtopResponse mtopResponse, Object obj, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b3ee389", new Object[]{this, new Integer(i), mtopResponse, obj, map});
            return;
        }
        jnv jnvVar = this.f25812a;
        if (jnvVar == null) {
            return;
        }
        jnvVar.a(i, mtopResponse, obj, map);
    }

    @Override // tb.joc
    public void a(int i, MtopResponse mtopResponse, Object obj, boolean z, Map<String, ?> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc169ead", new Object[]{this, new Integer(i), mtopResponse, obj, new Boolean(z), map});
            return;
        }
        jnv jnvVar = this.f25812a;
        if (jnvVar == null) {
            return;
        }
        jnvVar.a(i, mtopResponse, obj, z, (Map<String, ? extends Object>) map);
    }

    @Override // tb.joc
    public void a(int i, MtopResponse mtopResponse, Object obj, jny jnyVar, Map<String, ?> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b57ff8e", new Object[]{this, new Integer(i), mtopResponse, obj, jnyVar, map});
            return;
        }
        jnv jnvVar = this.f25812a;
        if (jnvVar == null) {
            return;
        }
        jnvVar.a(i, mtopResponse, obj, jnyVar, (Map<String, ? extends Object>) map);
    }

    @Override // tb.jnv
    public void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
            return;
        }
        super.a(jSONObject);
        jnv jnvVar = this.f25812a;
        if (jnvVar == null) {
            return;
        }
        jnvVar.a(jSONObject);
    }
}
