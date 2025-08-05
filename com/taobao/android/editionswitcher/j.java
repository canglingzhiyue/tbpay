package com.taobao.android.editionswitcher;

import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.location.common.LocationErrorCode;
import com.taobao.location.common.TBLocationDTO;
import com.taobao.tao.log.TLog;
import mtopsdk.mtop.domain.MtopResponse;
import tb.kge;

/* loaded from: classes5.dex */
public class j {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1366419802);
    }

    public static void a(MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab3bce2d", new Object[]{mtopResponse});
            return;
        }
        TLog.loge("EditionSwitcher", "reqeust fail " + mtopResponse.getRetMsg());
        AppMonitor.Alarm.commitFail("Page_EditionSwitcher", "RequestFailed", mtopResponse.getRetCode(), mtopResponse.getRetMsg());
    }

    public static void a(TBLocationDTO tBLocationDTO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56d6c9b8", new Object[]{tBLocationDTO});
            return;
        }
        if (tBLocationDTO.getErrorCode() == null) {
            tBLocationDTO.setErrorCode(Integer.valueOf(LocationErrorCode.FAIL.getCode()));
        }
        TLog.loge("EditionSwitcher", "locateFailed " + a(tBLocationDTO.getErrorCode().intValue()));
        AppMonitor.Alarm.commitFail("Page_EditionSwitcher", "LocateFailed", String.valueOf(tBLocationDTO.getErrorCode()), a(tBLocationDTO.getErrorCode().intValue()));
    }

    private static String a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9064aa65", new Object[]{new Integer(i)});
        }
        if (LocationErrorCode.FAIL.getCode() == i) {
            return LocationErrorCode.FAIL.getDesc();
        }
        if (LocationErrorCode.FAIL_ALL.getCode() == i) {
            return LocationErrorCode.FAIL_ALL.getDesc();
        }
        if (LocationErrorCode.FAIL_LOCATION_TIMEOUT.getCode() == i) {
            return LocationErrorCode.FAIL_LOCATION_TIMEOUT.getDesc();
        }
        if (LocationErrorCode.FAIL_INVALID_OPTION.getCode() == i) {
            return LocationErrorCode.FAIL_INVALID_OPTION.getDesc();
        }
        if (LocationErrorCode.FAIL_INVALID_LOOPER.getCode() == i) {
            return LocationErrorCode.FAIL_INVALID_LOOPER.getDesc();
        }
        return LocationErrorCode.FAIL_UNAVALIABLE_SERVICE.getCode() == i ? LocationErrorCode.FAIL_UNAVALIABLE_SERVICE.getDesc() : "";
    }
}
