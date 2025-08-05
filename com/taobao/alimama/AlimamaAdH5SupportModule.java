package com.taobao.alimama;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.e;
import android.taobao.windvane.jsbridge.r;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.o2o.ad.O2OAdH5Support;
import com.taobao.utils.Global;
import java.util.Map;
import tb.kge;

/* loaded from: classes4.dex */
public class AlimamaAdH5SupportModule extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String CLICK_ID = "clickid";
    public static final String JS_BRIDGE_NAME = "MunionWebViewJs";
    private static final String MESSAGE = "message";
    private O2OAdH5Support mO2OAdH5Support = new O2OAdH5Support();

    static {
        kge.a(1666797569);
    }

    public static /* synthetic */ Object ipc$super(AlimamaAdH5SupportModule alimamaAdH5SupportModule, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:87|88|89|(2:90|91)|(3:92|93|94)|95|96|(1:98)(1:115)|99|100|101|102|(1:104)(2:109|(1:111))) */
    /* JADX WARN: Can't wrap try/catch for region: R(14:87|88|89|90|91|(3:92|93|94)|95|96|(1:98)(1:115)|99|100|101|102|(1:104)(2:109|(1:111))) */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0168, code lost:
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0169, code lost:
        r21 = r3;
        r22 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:142:0x02ca A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02cb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00e4 A[Catch: Exception -> 0x00f1, TRY_LEAVE, TryCatch #11 {Exception -> 0x00f1, blocks: (B:48:0x00dc, B:51:0x00e4), top: B:175:0x00dc }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0158 A[Catch: Exception -> 0x0168, TRY_LEAVE, TryCatch #17 {Exception -> 0x0168, blocks: (B:76:0x0150, B:79:0x0158), top: B:187:0x0150 }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0187  */
    @Override // android.taobao.windvane.jsbridge.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean execute(java.lang.String r24, java.lang.String r25, android.taobao.windvane.jsbridge.WVCallBackContext r26) {
        /*
            Method dump skipped, instructions count: 716
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.alimama.AlimamaAdH5SupportModule.execute(java.lang.String, java.lang.String, android.taobao.windvane.jsbridge.WVCallBackContext):boolean");
    }

    private void notifyError(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f48320cd", new Object[]{this, str, wVCallBackContext});
        } else if (wVCallBackContext == null) {
        } else {
            r rVar = new r("HY_FAILED");
            rVar.a("message", str);
            wVCallBackContext.error(rVar);
        }
    }

    public void commitIfsEvent(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10e91ef3", new Object[]{this, str, str2, wVCallBackContext});
            return;
        }
        AlimamaAdvertising.instance().buildIfsExposure(Global.getApplication(), str).withArgNamespace(str2).commit();
        if (wVCallBackContext == null) {
            return;
        }
        wVCallBackContext.success(r.RET_SUCCESS);
    }

    public void genClickIdBy(String str, boolean z, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8ab80d6", new Object[]{this, str, new Boolean(z), wVCallBackContext});
            return;
        }
        String handleAdUrlForClickid = AlimamaAdvertising.instance().handleAdUrlForClickid(str, z);
        if (wVCallBackContext == null) {
            return;
        }
        r rVar = new r();
        rVar.b();
        if (handleAdUrlForClickid == null) {
            handleAdUrlForClickid = "";
        }
        rVar.a("clickid", handleAdUrlForClickid);
        wVCallBackContext.success(rVar);
    }

    public void commitTaokeInfo(String str, String str2, String str3, boolean z, Map<String, String> map, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d86f3426", new Object[]{this, str, str2, str3, new Boolean(z), map, wVCallBackContext});
            return;
        }
        AlimamaAdvertising.instance().commitTaokeInfo(str, str2, str3, z, map);
        if (wVCallBackContext == null) {
            return;
        }
        wVCallBackContext.success(r.RET_SUCCESS);
    }
}
