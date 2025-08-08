package com.huawei.hms.opendevice;

import mtopsdk.common.util.StringUtils;

/* loaded from: classes4.dex */
public class q {
    public static boolean a(String... strArr) {
        for (String str : strArr) {
            if (StringUtils.isEmpty(str)) {
                return false;
            }
        }
        return true;
    }
}
