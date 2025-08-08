package android.taobao.windvane.jsbridge;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import org.json.JSONArray;
import tb.kge;

/* loaded from: classes2.dex */
public class o implements d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public WVCallBackContext f1670a;
    public String b;
    public String c;

    static {
        kge.a(-692467033);
        kge.a(-1345717441);
    }

    public o(WVCallBackContext wVCallBackContext, String str, String str2) {
        this.f1670a = wVCallBackContext;
        this.b = str;
        this.c = str2;
    }

    @Override // android.taobao.windvane.jsbridge.d
    public void a(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
        } else if (list != null && list.size() > 0) {
            r rVar = new r();
            JSONArray jSONArray = new JSONArray();
            for (String str : list) {
                jSONArray.put(str);
            }
            if (!StringUtils.isEmpty(this.c)) {
                rVar.a("state", this.c);
            }
            rVar.a("msg", this.b);
            rVar.a("deniedPermissions", jSONArray);
            this.f1670a.error(rVar);
        } else {
            r rVar2 = new r();
            if (!StringUtils.isEmpty(this.c)) {
                rVar2.a("state", this.c);
            }
            rVar2.a("msg", this.b);
            this.f1670a.error(rVar2);
        }
    }
}
