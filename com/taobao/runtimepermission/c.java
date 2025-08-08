package com.taobao.runtimepermission;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import com.alibaba.wireless.aliprivacy.AuthStatus;
import com.alibaba.wireless.aliprivacy.PrivacyAuthGetParam;
import com.alibaba.wireless.aliprivacy.PrivacyAuthResult;
import com.alibaba.wireless.aliprivacy.PrivacyAuthSetParam;
import com.alibaba.wireless.aliprivacy.PrivacyCode;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.runtimepermission.config.RPConfig;
import com.taobao.runtimepermission.config.a;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.tfr;

/* loaded from: classes7.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static boolean a(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d18de978", new Object[]{context, str, str2})).booleanValue();
        }
        boolean[] a2 = a(context, str, new String[]{str2});
        if (a2.length > 0) {
            return a2[0];
        }
        return true;
    }

    private static boolean[] a(Context context, String str, String[] strArr) {
        List<PrivacyAuthResult> a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (boolean[]) ipChange.ipc$dispatch("7510dce0", new Object[]{context, str, strArr});
        }
        if (StringUtils.isEmpty(str) || strArr.length <= 0) {
            tfr.b("BizPermissionWrapper", "checkSelfBizPermissions: permission request with empty scene, permission length: " + strArr.length + " bizName:" + str);
            return new boolean[0];
        }
        boolean[] zArr = new boolean[strArr.length];
        Arrays.fill(zArr, true);
        RPConfig b = a.a().b();
        for (String str2 : strArr) {
            if (!b.bizPermissionWhiteList.contains(str2)) {
                tfr.b("BizPermissionWrapper", String.format("checkBizPermissions: the permission %s does not enable bizPermission, exit", str2));
                return zArr;
            }
        }
        try {
            PrivacyAuthGetParam.b bVar = new PrivacyAuthGetParam.b();
            bVar.a(str, strArr);
            a2 = com.alibaba.wireless.aliprivacyext.c.a(context, bVar.a());
        } catch (Throwable th) {
            tfr.b("BizPermissionWrapper", "checkSelfBizPermissions: get biz permission with exception " + th);
        }
        if (a2 == null) {
            tfr.b("BizPermissionWrapper", "checkBizPermission: biz permission result is empty, return false.");
            return zArr;
        }
        for (int i = 0; i < a2.size(); i++) {
            Map<String, AuthStatus> permissions = a2.get(i).getPermissions();
            if (permissions != null && permissions.containsKey(strArr[i])) {
                zArr[i] = permissions.get(strArr[i]) == AuthStatus.GRANTED;
            }
        }
        return zArr;
    }

    public static void a(Context context, String str, String str2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("602fb80f", new Object[]{context, str, str2, new Integer(i)});
        } else {
            a(context, str, new String[]{str2}, new int[]{i});
        }
    }

    public static void a(Context context, String str, String[] strArr, int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d213083", new Object[]{context, str, strArr, iArr});
        } else if (StringUtils.isEmpty(str) || strArr.length <= 0 || iArr.length <= 0) {
            tfr.b("BizPermissionWrapper", "checkSelfBizPermissions: permission request with empty scene, permission length: " + strArr.length + " bizName:" + str);
        } else {
            try {
                HashMap hashMap = new HashMap();
                RPConfig b = a.a().b();
                for (int i = 0; i < strArr.length; i++) {
                    if (b.bizPermissionWhiteList.contains(strArr[i])) {
                        hashMap.put(strArr[i], Boolean.valueOf(iArr[i] == 0));
                    }
                }
                if (hashMap.isEmpty()) {
                    tfr.b("BizPermissionWrapper", "setBizPermissionsStatus: empty permissions to set, exit.");
                    return;
                }
                PrivacyAuthSetParam.a aVar = new PrivacyAuthSetParam.a();
                aVar.a(str, hashMap);
                PrivacyCode a2 = com.alibaba.wireless.aliprivacyext.c.a(context, aVar.a());
                if (a2 == PrivacyCode.SUCCESS) {
                    return;
                }
                tfr.b("BizPermissionWrapper", "setBizPermissions: set ali privacy failed, with error code " + a2);
            } catch (Throwable th) {
                tfr.b("BizPermissionWrapper", "checkSelfBizPermissions: set biz permission result with exception " + th);
            }
        }
    }
}
