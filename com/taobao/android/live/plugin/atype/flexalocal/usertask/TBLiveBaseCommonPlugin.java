package com.taobao.android.live.plugin.atype.flexalocal.usertask;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.proxy.usertask.i;
import com.taobao.taolive.sdk.utils.w;
import tb.ddw;
import tb.kge;
import tb.pmd;
import tb.pnj;
import tb.pqj;

/* loaded from: classes6.dex */
public class TBLiveBaseCommonPlugin extends android.taobao.windvane.jsbridge.e implements i {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1619980796);
        kge.a(1527051735);
    }

    @Override // android.taobao.windvane.jsbridge.e
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        char c = 65535;
        if (str.hashCode() == -1013581804 && str.equals("baseCommonFunction")) {
            c = 0;
        }
        if (c != 0) {
            return false;
        }
        w.a(this.mContext, "平台任务收到前端调用");
        JSONObject b = pqj.b(str2);
        if (b != null) {
            if (pmd.a().m() != null) {
                pnj m = pmd.a().m();
                m.a("TBLiveBaseCommonPlugin", "baseCommonFunction " + b.toJSONString());
            }
            String string = b.getString("bizType");
            String string2 = b.getString("action");
            b.getJSONObject("params");
            if ("PlatformTask".equals(string) && "PermissionSuccess".equals(string2)) {
                ddw.a().a("com.taobao.live.usertask.permissionSuccess", b);
            }
        }
        return true;
    }
}
