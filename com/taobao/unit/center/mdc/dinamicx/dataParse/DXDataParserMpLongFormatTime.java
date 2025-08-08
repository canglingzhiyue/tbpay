package com.taobao.unit.center.mdc.dinamicx.dataParse;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.message.kit.util.TimeUtil;
import com.taobao.message.uikit.util.DisplayUtil;
import com.taobao.tao.log.TLog;
import com.taobao.taobao.R;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import tb.fuf;
import tb.kge;

/* loaded from: classes9.dex */
public class DXDataParserMpLongFormatTime extends fuf {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_MPLONGFORMATTIME = -2296656905112788107L;

    static {
        kge.a(-1535552153);
    }

    public static /* synthetic */ Object ipc$super(DXDataParserMpLongFormatTime dXDataParserMpLongFormatTime, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.fuf, tb.fut
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        String formatDateTime;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (objArr == null || objArr.length == 0) {
            return null;
        }
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
        if (DisplayUtil.isSimplifiedChinese()) {
            formatDateTime = new SimpleDateFormat(DisplayUtil.localizedString(R.string.mp_yyyy_year_mm_month_dd)).format(new Date(j));
        } else {
            formatDateTime = DisplayUtil.formatDateTime(j);
        }
        try {
            int isToday = TimeUtil.isToday(j);
            if (isToday == -2) {
                if (DisplayUtil.isSimplifiedChinese()) {
                    return TimeUtil.getWeekOfTime(j) + formatDateTime.substring(11);
                }
                mergeDateTimeString(TimeUtil.getWeekOfTime(j), formatDateTime);
                return mergeDateTimeString(TimeUtil.getWeekOfTime(j), formatDateTime);
            } else if (isToday == -1) {
                if (DisplayUtil.isSimplifiedChinese()) {
                    return DisplayUtil.localizedString(R.string.mp_yesterday) + " " + formatDateTime.substring(11);
                }
                return mergeDateTimeString(DisplayUtil.localizedString(R.string.mp_yesterday), formatDateTime);
            } else if (isToday != 0) {
                return formatDateTime;
            } else {
                if (DisplayUtil.isSimplifiedChinese()) {
                    return "" + formatDateTime.substring(11);
                }
                return mergeDateTimeString("", formatDateTime);
            }
        } catch (ParseException unused) {
            return formatDateTime;
        }
    }

    private String mergeDateTimeString(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("346fba81", new Object[]{this, str, str2});
        }
        if (StringUtils.isEmpty(str2)) {
            return str;
        }
        int indexOf = str2.indexOf(" ");
        for (int i = 1; i <= 2; i++) {
            if (indexOf >= 0) {
                indexOf = str2.indexOf(" ", indexOf + 1);
            }
        }
        return str + " " + str2.substring(indexOf + 1);
    }
}
