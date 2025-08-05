package com.taobao.unit.center.mdc.dinamicx.dataParse;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.message.kit.util.TimeUtil;
import com.taobao.tao.log.TLog;
import tb.fut;
import tb.kge;

/* loaded from: classes9.dex */
public class DataParserMpFormatTime implements fut {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_MPFORMATTIME = 1008841344536034785L;

    static {
        kge.a(-1071913609);
        kge.a(1343895002);
    }

    @Override // tb.fut
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (objArr != null && objArr.length == 1) {
            String str = "" + objArr[0];
            long j = -1;
            try {
                if (str instanceof String) {
                    j = Long.parseLong(str);
                } else if (str instanceof Long) {
                    j = ((Long) str).longValue();
                }
            } catch (Throwable th) {
                TLog.loge("DataParserMpFormatTime", th.toString());
            }
            if (j > 0) {
                return TimeUtil.formatTimeForMsgCenterCategory(j);
            }
        }
        return null;
    }
}
