package android.taobao.windvane.jsbridge;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes2.dex */
public class i implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public WVCallBackContext f1665a;
    public String b;
    public String c;

    static {
        kge.a(-642368592);
        kge.a(-1390502639);
    }

    public i(WVCallBackContext wVCallBackContext, String str) {
        this.f1665a = wVCallBackContext;
        this.b = str;
    }

    public i(WVCallBackContext wVCallBackContext, String str, String str2) {
        this.f1665a = wVCallBackContext;
        this.b = str;
        this.c = str2;
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        r rVar = new r();
        rVar.a("msg", this.b);
        if (!StringUtils.isEmpty(this.c)) {
            rVar.a("state", this.c);
        }
        this.f1665a.error(rVar);
    }
}
