package com.taobao.unit.center.mdc.dinamicx.dataParse;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.message.launcher.server_time.AmpTimeStampManager;
import com.taobao.message.uikit.util.DisplayUtil;
import com.taobao.tao.log.TLog;
import com.taobao.taobao.R;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;
import tb.fut;
import tb.kge;

/* loaded from: classes9.dex */
public class DataParseInteractFormatTime implements fut {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_MPFORMATTIME = 1008841344536034785L;

    static {
        kge.a(-275552612);
        kge.a(1343895002);
    }

    @Override // tb.fut
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (objArr != null && objArr.length != 0) {
            StringBuilder sb = new StringBuilder();
            String str = "";
            sb.append(str);
            sb.append(objArr[0]);
            String sb2 = sb.toString();
            if (objArr.length > 1) {
                str = String.valueOf(objArr[1]);
            }
            long j = -1;
            try {
                if (sb2 instanceof String) {
                    j = Long.parseLong(sb2);
                } else if (sb2 instanceof Long) {
                    j = ((Long) sb2).longValue();
                }
            } catch (Throwable th) {
                TLog.loge("DataParserMpFormatTime", th.toString());
            }
            if (j > 0) {
                return formatTime(j, StringUtils.equals(str, "newFormatRule"));
            }
        }
        return null;
    }

    private String formatTime(long j, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("85671e45", new Object[]{this, new Long(j), new Boolean(z)});
        }
        if (j == 0) {
            return null;
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("YY.MM.dd", Locale.getDefault());
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("MM.dd", Locale.getDefault());
        SimpleDateFormat simpleDateFormat3 = new SimpleDateFormat("HH:mm", Locale.getDefault());
        long currentTimeStamp = AmpTimeStampManager.instance().getCurrentTimeStamp() + 3000;
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        if (currentTimeStamp - j < 0) {
            return simpleDateFormat.format(calendar.getTime());
        }
        long offset = currentTimeStamp - ((TimeZone.getDefault().getOffset(currentTimeStamp) + currentTimeStamp) % 86400000);
        long offset2 = currentTimeStamp - ((TimeZone.getDefault().getOffset(currentTimeStamp) + currentTimeStamp) % 31536000000L);
        if (!z) {
            if (j - offset >= 0) {
                return simpleDateFormat3.format(calendar.getTime());
            }
            if (offset - j < 86400000) {
                return DisplayUtil.localizedString(R.string.mp_yesterday) + " " + simpleDateFormat3.format(calendar.getTime());
            }
        } else if (j - offset >= 0) {
            return simpleDateFormat3.format(calendar.getTime());
        } else {
            if (offset - j < 86400000) {
                return DisplayUtil.localizedString(R.string.mp_yesterday) + " " + simpleDateFormat3.format(calendar.getTime());
            } else if (offset2 - j < 31536000000L) {
                return simpleDateFormat2.format(calendar.getTime());
            }
        }
        return simpleDateFormat.format(calendar.getTime());
    }
}
