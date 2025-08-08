package tb;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.triver.triver_shop.container.shopLoft.b;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.android.ultron.common.utils.UnifyLog;
import com.taobao.android.ultron.datamodel.imp.f;
import java.util.Map;

/* loaded from: classes2.dex */
public class bnx extends jpk {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    @JSONField(serialize = false)

    /* renamed from: a  reason: collision with root package name */
    private String f26010a;
    @JSONField(serialize = false)
    private IDMComponent b;
    @JSONField(serialize = false)
    private Map<String, bmb> c;
    @JSONField(serialize = false)
    private bny d;

    static {
        kge.a(-366446914);
    }

    public static /* synthetic */ Object ipc$super(bnx bnxVar, String str, Object... objArr) {
        if (str.hashCode() == -1507519932) {
            super.a(objArr[0]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public bnx(String str, jpl jplVar, String str2, IDMComponent iDMComponent, Map<String, bmb> map, bny bnyVar) {
        super(str, jplVar);
        this.f26010a = str2 == null ? "default" : str2;
        this.b = iDMComponent;
        this.c = map;
        this.d = bnyVar;
    }

    @Override // tb.jpk
    public void a(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6251244", new Object[]{this, obj});
            return;
        }
        try {
            a(this.b, obj);
            super.a(obj);
        } catch (Throwable th) {
            UnifyLog.a(this.f26010a, "UltronMessageChannel", b.c.EVENT_ON_MESSAGE, th.getMessage());
        }
    }

    private void a(IDMComponent iDMComponent, Object obj) {
        bmb bmbVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52cfb4c8", new Object[]{this, iDMComponent, obj});
        } else if (obj instanceof JSONObject) {
            a(iDMComponent, (JSONObject) obj);
        } else if (!(obj instanceof Map)) {
        } else {
            try {
                Map map = (Map) obj;
                JSONObject a2 = bph.a(iDMComponent);
                if (a2 == null) {
                    return;
                }
                IDMComponent iDMComponent2 = (IDMComponent) map.get("postModel");
                JSONObject jSONObject = a2.getJSONObject(iDMComponent2.getKey());
                if (jSONObject == null) {
                    return;
                }
                String string = jSONObject.getString("type");
                if (StringUtils.isEmpty(string) || (bmbVar = this.c.get(string)) == null) {
                    return;
                }
                bmbVar.a(iDMComponent, iDMComponent2, jSONObject.getJSONObject("fields"));
            } catch (Throwable th) {
                UnifyLog.a(this.f26010a, "UltronMessageChannel", th.toString(), new String[0]);
            }
        }
    }

    private void a(IDMComponent iDMComponent, JSONObject jSONObject) {
        JSONObject data;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca1a8084", new Object[]{this, iDMComponent, jSONObject});
        } else if (!StringUtils.equals(jSONObject.getString("type"), "updateItem")) {
        } else {
            String b = f.b(iDMComponent);
            if (!StringUtils.equals(b, "stickyTop") && !StringUtils.equals(b, "stickyBottom")) {
                return;
            }
            JSONObject jSONObject2 = jSONObject.getJSONObject("message");
            if (jSONObject2 != null && (data = iDMComponent.getData()) != null) {
                data.putAll(jSONObject2);
                iDMComponent.writeBackData(data, false);
            }
            if (StringUtils.equals(b, "stickyTop")) {
                this.d.b(8);
            } else if (!StringUtils.equals(b, "stickyBottom")) {
            } else {
                this.d.b(16);
            }
        }
    }
}
