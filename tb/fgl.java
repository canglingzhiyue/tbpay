package tb;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.utils.i;
import com.taobao.android.ultron.common.model.b;
import java.util.Map;

/* loaded from: classes5.dex */
public class fgl extends fgj {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ORIGINALITEMID = "originalItemId";
    public static final String TARGETITEMID = "targetItemId";
    public static final String TOKEN = "token";

    /* renamed from: a  reason: collision with root package name */
    private final String f27927a = "openUrl";
    private a b;

    /* loaded from: classes5.dex */
    public interface a {
        Map<String, String> a();
    }

    static {
        kge.a(-937419682);
    }

    public static /* synthetic */ Object ipc$super(fgl fglVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public fgl() {
        a("openUrl");
        emu.a("com.taobao.android.detail.wrapper.ultronengine.listener.OpenUrlAddTokenProcessor");
    }

    @Override // tb.fgj
    public void a(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("396016f7", new Object[]{this, bVar});
            return;
        }
        try {
            JSONObject fields = bVar.getFields();
            if (StringUtils.isEmpty(fields.getString("url"))) {
                return;
            }
            a(fields);
        } catch (Throwable unused) {
            i.a("OpenUrlAddTokenProcessor", "onPreEven 执行失败，请检查");
        }
    }

    private void a(JSONObject jSONObject) {
        Map<String, String> a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
            return;
        }
        a aVar = this.b;
        if (aVar == null || (a2 = aVar.a()) == null || a2.isEmpty()) {
            return;
        }
        i.d("OpenUrlAddTokenProcessor", "添加了自定义参数params  : " + a2.toString());
        JSONObject jSONObject2 = jSONObject.getJSONObject("queryParams");
        if (jSONObject2 == null) {
            jSONObject2 = new JSONObject();
        }
        jSONObject2.putAll(a2);
        jSONObject.put("queryParams", (Object) jSONObject2);
    }

    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca4fac10", new Object[]{this, aVar});
        } else {
            this.b = aVar;
        }
    }
}
