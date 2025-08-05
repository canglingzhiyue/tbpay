package com.ali.user.mobile.base.helper;

import com.ali.user.mobile.common.api.AliUserLogin;
import com.ali.user.mobile.service.ABService;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes2.dex */
public class StrategyHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1423064076);
    }

    public static int getStrategy(String str) {
        if (AliUserLogin.getAppreanceExtentions() == null || AliUserLogin.getAppreanceExtentions().getABHelper() == null) {
            return -1;
        }
        try {
            ABService aBService = (ABService) AliUserLogin.getAppreanceExtentions().getABHelper().newInstance();
            if (aBService == null) {
                return -1;
            }
            return aBService.getStrategyValue(str);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
            return -1;
        } catch (Exception e2) {
            e2.printStackTrace();
            return -1;
        }
    }

    public static String getUtArg1(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7c59ba0a", new Object[]{new Integer(i), str});
        }
        if (i == -1) {
            return str + "serviceNull";
        } else if (i == -404) {
            return str + "configNull";
        } else if (i == 0) {
            return str + "bucketEmpty";
        } else if (i == 1) {
            return str + "bucketB";
        } else {
            return str + "bucketA";
        }
    }
}
