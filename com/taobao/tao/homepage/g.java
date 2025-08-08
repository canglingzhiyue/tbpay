package com.taobao.tao.homepage;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.runtimepermission.f;
import com.taobao.taobao.R;
import java.util.List;
import tb.kge;

/* loaded from: classes8.dex */
public class g implements com.taobao.runtimepermission.i {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-2114168628);
        kge.a(1533434112);
    }

    @Override // com.taobao.runtimepermission.i
    public void a(Context context, List<String> list, List<String> list2, com.taobao.runtimepermission.d dVar) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        boolean z2 = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ffc5a768", new Object[]{this, context, list, list2, dVar});
        } else if (context != null && StringUtils.equals(context.getPackageName(), "com.taobao.taobao")) {
            if (list == null || dVar == null) {
                String[] strArr = new String[1];
                StringBuilder sb = new StringBuilder();
                sb.append("HomepageRuntimePermissionListener sysReqPermissions check：");
                sb.append(list == null);
                sb.append(",permissionResult check: ");
                if (dVar != null) {
                    z2 = false;
                }
                sb.append(z2);
                strArr[0] = sb.toString();
                com.taobao.android.home.component.utils.e.e(a.KEY, strArr);
                return;
            }
            for (String str : list) {
                if (StringUtils.equals(str, a.ACCESS_FINE_LOCATION)) {
                    z = a.a(dVar);
                }
            }
            if (!z) {
                return;
            }
            com.taobao.android.home.component.utils.e.e(a.KEY, "HomepageRuntimePermissionListener needReqBasicLBSPermission basicLBSTask.execute");
            f.a a2 = com.taobao.runtimepermission.f.a(context, new String[]{a.ACCESS_FINE_LOCATION});
            a2.a(com.alibaba.ability.localization.b.a(R.string.taobao_app_1000_1_16157) + com.alibaba.ability.localization.b.a(R.string.taobao_app_1000_1_16161) + com.alibaba.ability.localization.b.a(R.string.taobao_app_1000_1_16149));
            a2.a(true);
            a2.b(true);
            a2.b("TB_SHOPPING_PROCESS");
            a2.a();
        }
    }
}
