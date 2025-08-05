package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.open.o;
import com.taobao.android.detail.core.request.d;
import java.util.Map;
import mtopsdk.mtop.domain.MtopResponse;

/* loaded from: classes5.dex */
public class czx extends fej implements d<String> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private o f26629a;

    static {
        kge.a(30310309);
        kge.a(186585509);
    }

    public czx(o oVar) {
        super(oVar);
        this.f26629a = oVar;
        emu.a("com.taobao.android.detail.wrapper.ext.request.TaoRequestWrapperListener");
    }

    @Override // com.taobao.android.detail.core.request.d
    public void a(String str, MtopResponse mtopResponse, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66008a59", new Object[]{this, str, mtopResponse, jSONObject});
        } else {
            this.f26629a.a(mtopResponse, jSONObject, str, (Map<String, String>) null);
        }
    }
}
