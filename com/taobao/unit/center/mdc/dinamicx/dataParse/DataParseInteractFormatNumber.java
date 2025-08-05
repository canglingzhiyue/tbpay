package com.taobao.unit.center.mdc.dinamicx.dataParse;

import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.message.uikit.util.DisplayUtil;
import com.taobao.tao.log.TLog;
import com.taobao.taobao.R;
import tb.fut;
import tb.kge;

/* loaded from: classes9.dex */
public class DataParseInteractFormatNumber implements fut {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "DataParseInteractFormatNumber";

    static {
        kge.a(1321219928);
        kge.a(1343895002);
    }

    @Override // tb.fut
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        long j;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (objArr == null || objArr.length != 1) {
            return null;
        }
        try {
            j = Long.valueOf("" + objArr[0]).longValue();
        } catch (Exception e) {
            TLog.loge(TAG, Log.getStackTraceString(e));
            j = 0;
        }
        if (j <= 0) {
            return objArr[0];
        }
        if (j >= 10000 && j < 100000000) {
            return (((float) (j / 1000)) / 10.0f) + DisplayUtil.localizedString(R.string.mp_ten_thousand);
        } else if (j >= 100000000) {
            return (((float) (j / 10000000)) / 10.0f) + DisplayUtil.localizedString(R.string.mp_million);
        } else {
            return String.valueOf(j);
        }
    }
}
