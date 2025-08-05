package tb;

import com.alibaba.android.ultron.event.base.e;
import com.alibaba.android.ultron.event.ext.p;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes6.dex */
public class iao extends p {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String NEXT_TAG_RECEIVER = "onReceive";
    public static final String NEXT_TAG_SUCESS = "success";

    /* renamed from: a  reason: collision with root package name */
    private Set<String> f28878a = new HashSet();

    static {
        kge.a(-301688819);
    }

    public static /* synthetic */ Object ipc$super(iao iaoVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.alibaba.android.ultron.event.ext.p
    public String e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this}) : "-100577986237887704";
    }

    public static /* synthetic */ void a(iao iaoVar, e eVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1a58fc6", new Object[]{iaoVar, eVar, jSONObject});
        } else {
            iaoVar.c(eVar, jSONObject);
        }
    }

    @Override // com.alibaba.android.ultron.event.ext.p
    public void d(final e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c03fdde0", new Object[]{this, eVar});
            return;
        }
        final String string = e(eVar).getString("key");
        eVar.h().h().a(new jpk(string, eVar.h().h()) { // from class: tb.iao.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.jpk
            public void a(Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("a6251244", new Object[]{this, obj});
                } else if (!(obj instanceof JSONObject)) {
                } else {
                    JSONObject jSONObject = (JSONObject) obj;
                    if (!jSONObject.getString("key").equals(string)) {
                        return;
                    }
                    iao.a(iao.this, eVar, jSONObject);
                }
            }
        });
        this.f28878a.add(string);
    }

    private void c(e eVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d340b6cf", new Object[]{this, eVar, jSONObject});
        } else {
            a(eVar, NEXT_TAG_RECEIVER, jSONObject);
        }
    }
}
