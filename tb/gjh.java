package tb;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.r;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes5.dex */
public class gjh implements gjg {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private WVCallBackContext f28354a;

    static {
        kge.a(1380025600);
        kge.a(1387563485);
    }

    public gjh(WVCallBackContext wVCallBackContext) {
        this.f28354a = wVCallBackContext;
    }

    @Override // tb.gjg
    public void a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("929ad046", new Object[]{this, str, str2, str3});
        } else if (this.f28354a == null) {
        } else {
            r rVar = new r();
            rVar.a("data", str);
            rVar.a("code", "WV_FAILED");
            rVar.a("errorMsg", str3);
            rVar.a("errorCode", str2);
            this.f28354a.error(rVar);
        }
    }

    @Override // tb.gjg
    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else if (this.f28354a == null) {
        } else {
            r rVar = new r();
            rVar.a("data", str);
            rVar.a("code", "WV_SUCCESS");
            this.f28354a.success(rVar);
        }
    }
}
