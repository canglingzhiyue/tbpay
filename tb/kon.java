package tb;

import android.os.Handler;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.flowcustoms.afc.request.mtop.b;
import com.taobao.flowcustoms.afc.utils.c;
import com.taobao.flowcustoms.afc.utils.d;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class kon extends koo {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-2018714215);
    }

    public void a(String str, String str2, boolean z, Map<String, String> map, final knz knzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3e04246", new Object[]{this, str, str2, new Boolean(z), map, knzVar});
            return;
        }
        kog.a().c("link", "request");
        b.a().a(str, str2, map, false, new koe() { // from class: tb.kon.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.koe
            public void a(JSONObject jSONObject) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("32861656", new Object[]{this, jSONObject});
                    return;
                }
                c.a("linkx", "AfcLinkInfoRequest === onSuccess: " + jSONObject);
                kog.a().d("link", "request");
                knzVar.a(jSONObject);
            }

            @Override // tb.koe
            public void a(JSONObject jSONObject, String str3) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("1b6e96a0", new Object[]{this, jSONObject, str3});
                    return;
                }
                c.b("linkx", "AfcLinkInfoRequest === onError: " + str3);
                kog.a().d("link", "request");
                knzVar.b(jSONObject);
            }
        }, z ? new Handler(d.b.f17188a.getLooper()) : null, 5000);
    }
}
