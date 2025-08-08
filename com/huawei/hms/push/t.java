package com.huawei.hms.push;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import com.huawei.hms.aaid.constant.ErrorEnum;
import com.huawei.hms.aaid.init.AutoInitHelper;
import com.huawei.hms.aaid.utils.BaseUtils;
import com.huawei.hms.support.log.HMSLog;

/* loaded from: classes4.dex */
public class t {
    public static ErrorEnum a(Context context) {
        if (StringUtils.isEmpty(BaseUtils.getLocalToken(context, null))) {
            if (!AutoInitHelper.isAutoInitEnabled(context)) {
                HMSLog.e("TokenUtil", "Token not exist");
                return ErrorEnum.ERROR_NO_TOKEN;
            }
            HMSLog.e("TokenUtil", "Token not exist, try auto init");
            AutoInitHelper.doAutoInit(context);
            return ErrorEnum.ERROR_AUTO_INITIALIZING;
        }
        return ErrorEnum.SUCCESS;
    }
}
