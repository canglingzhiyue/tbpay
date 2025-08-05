package com.taobao.munion.taosdk;

import android.app.Application;
import com.alipay.android.msp.framework.db.MspDBHelper;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alimama.utils.UserTrackLogs;
import com.taobao.muniontaobaosdk.util.TaoLog;
import java.util.HashMap;
import tb.kge;

/* loaded from: classes7.dex */
public class MunionCommitterFactory {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(619215199);
    }

    public static MunionEventCommitter createCommitter(Application application, Class<?> cls) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MunionEventCommitter) ipChange.ipc$dispatch("555e0cb5", new Object[]{application, cls}) : createCommitter(application, cls, true);
    }

    public static MunionEventCommitter createCommitter(Application application, Class<?> cls, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MunionEventCommitter) ipChange.ipc$dispatch("2127c683", new Object[]{application, cls, new Boolean(z)});
        }
        if (application == null) {
            TaoLog.Loge(UserTrackLogs.UT_PAGE_NAME, "application is null!");
            throw new IllegalArgumentException("application is null!");
        } else if (CpcEventCommitter.class.equals(cls)) {
            return new CpcEventCommitter(application, z);
        } else {
            if (CpmEventCommitter.class.equals(cls)) {
                return new CpmEventCommitter(application, z);
            }
            TaoLog.Loge(UserTrackLogs.UT_PAGE_NAME, "class not supported!");
            throw new IllegalArgumentException("class not supported!");
        }
    }

    @Deprecated
    public static CpmIfsCommitter createIfsCommitter(Application application, Class<?> cls) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (CpmIfsCommitter) ipChange.ipc$dispatch("ebd5e839", new Object[]{application, cls}) : createIfsCommitter(application, cls, null);
    }

    @Deprecated
    public static CpmIfsCommitter createIfsCommitter(Application application, Class<?> cls, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CpmIfsCommitter) ipChange.ipc$dispatch("cabd2cef", new Object[]{application, cls, str});
        }
        if (application == null) {
            TaoLog.Loge(UserTrackLogs.UT_PAGE_NAME, "application is null!");
            throw new IllegalArgumentException("application is null!");
        } else if (CpmIfsCommitter.class.equals(cls)) {
            HashMap hashMap = new HashMap();
            if (str == null) {
                str = "";
            }
            hashMap.put(MspDBHelper.BizEntry.COLUMN_NAME_PID, str);
            return new CpmIfsCommitter(application, hashMap);
        } else {
            TaoLog.Loge(UserTrackLogs.UT_PAGE_NAME, "class not supported!");
            throw new IllegalArgumentException("class not supported!");
        }
    }
}
