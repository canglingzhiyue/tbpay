package tb;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import tb.spy;

/* loaded from: classes5.dex */
public class slv extends spy.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final WVCallBackContext f33709a;

    static {
        kge.a(-1908700831);
    }

    public static /* synthetic */ Object ipc$super(slv slvVar, String str, Object... objArr) {
        if (str.hashCode() == -162361891) {
            return new Boolean(super.a((spx) objArr[0], objArr[1]));
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ WVCallBackContext a(slv slvVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WVCallBackContext) ipChange.ipc$dispatch("59c3d9b8", new Object[]{slvVar}) : slvVar.f33709a;
    }

    public slv(WVCallBackContext wVCallBackContext) {
        this.f33709a = wVCallBackContext;
    }

    @Override // tb.spy.a
    public boolean a(spx spxVar, final Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f6528ddd", new Object[]{this, spxVar, obj})).booleanValue();
        }
        boolean a2 = super.a(spxVar, obj);
        if (a2 && this.f33709a != null) {
            if (obj == null) {
                spz.c("H5Callback", "result 不能为null");
                obj = new HashMap();
            }
            if (son.F()) {
                ihi.a(new Runnable() { // from class: tb.slv.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            slv.a(slv.this).success(JSON.toJSONString(obj));
                        }
                    }
                }, "H5Callback");
            } else {
                this.f33709a.success(JSON.toJSONString(obj));
            }
        }
        return a2;
    }
}
