package tb;

import mtopsdk.common.util.StringUtils;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

@AURAExtensionImpl(code = "alibuy.impl.linkage.adjust.streamResponse")
/* loaded from: classes4.dex */
public final class tdb extends ayt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private tcy f34040a;

    static {
        kge.a(-1386316643);
    }

    public static /* synthetic */ Object ipc$super(tdb tdbVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.ayt
    public void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
            return;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("linkage");
        if (jSONObject2 == null) {
            arc.a().a("stream", "linkage is null !!");
            return;
        }
        JSONObject jSONObject3 = jSONObject2.getJSONObject("common");
        if (jSONObject3 == null) {
            jSONObject3 = new JSONObject();
        }
        if (e()) {
            arc.a().a("stream", "neeUploadQueryParams = true");
            b(jSONObject3);
            return;
        }
        arc.a().a("stream", "neeUploadQueryParams = false");
        c(jSONObject3);
    }

    private void b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63b99827", new Object[]{this, jSONObject});
        } else if (!StringUtils.isEmpty(jSONObject.getString("queryParams"))) {
            arc.a().a("stream", "queryParams is not null");
        } else {
            tcy d = d();
            if (d == null) {
                arc.a().a("stream", "streamExceptionProcessor is null !!");
                return;
            }
            String a2 = d.a();
            if (StringUtils.isEmpty(a2)) {
                arc.a().a("stream", "queryParams is null !!");
            } else {
                jSONObject.put("queryParams", (Object) a2);
            }
        }
    }

    private void c(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c50c34c6", new Object[]{this, jSONObject});
            return;
        }
        Object remove = jSONObject.remove("queryParams");
        if (!(remove instanceof String)) {
            return;
        }
        tcy d = d();
        if (d == null) {
            arc.a().a("stream", "streamExceptionProcessor is null !!");
        } else {
            d.a((String) remove);
        }
    }

    private tcy d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tcy) ipChange.ipc$dispatch("261fd291", new Object[]{this});
        }
        if (this.f34040a == null) {
            this.f34040a = (tcy) c().get("aliBuyGlobalDataStreamResponseProcessor", tcy.class);
        }
        return this.f34040a;
    }

    private boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue();
        }
        tcy d = d();
        if (d == null) {
            arc.a().a("stream", "streamExceptionProcessor is null !!");
            return true;
        }
        jcp d2 = d.d();
        if (d2 == null) {
            arc.a().a("stream", "uploadModel is null !!");
            return true;
        }
        return d2.d();
    }
}
