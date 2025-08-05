package com.taobao.android.diagnose.common;

import android.support.media.ExifInterface;
import com.ali.user.mobile.app.constant.UTConstant;
import com.alibaba.analytics.core.sync.q;
import com.alibaba.ariver.kernel.RVStartParams;
import com.alibaba.security.realidentity.o;
import com.alipay.android.msp.framework.dynfun.TplMsg;
import com.alipay.mobile.common.transportext.amnet.AmnetConstant;
import com.android.alibaba.ip.runtime.IpChange;
import com.loc.at;
import com.taobao.calendar.sdk.db.schedule.Repeat;
import com.taobao.search.sf.util.tlog.TLogTracker;
import java.util.UUID;
import tb.kge;

/* loaded from: classes.dex */
public class g {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static String[] f11704a;

    static {
        kge.a(1060240208);
        f11704a = new String[]{"a", TplMsg.VALUE_T_NATIVE_RETURN, com.taobao.android.msoa.c.TAG, Repeat.D, "e", "f", at.f, "h", q.MSGTYPE_INTERVAL, at.j, at.k, "l", "m", "n", o.b, "p", "q", "r", "s", "t", RVStartParams.KEY_URL_SHORT, "v", "w", "x", "y", AmnetConstant.VAL_SUPPORT_ZSTD, "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", TLogTracker.LEVEL_DEBUG, "E", UTConstant.Args.UT_SUCCESS_F, "G", "H", TLogTracker.LEVEL_INFO, "J", "K", "L", "M", "N", "O", "P", "Q", "R", ExifInterface.LATITUDE_SOUTH, "T", "U", "V", "W", "X", "Y", "Z"};
    }

    public static String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[0]);
        }
        StringBuffer stringBuffer = new StringBuffer();
        String replace = UUID.randomUUID().toString().replace("-", "");
        for (int i = 0; i < 8; i++) {
            int i2 = i << 2;
            stringBuffer.append(f11704a[Integer.parseInt(replace.substring(i2, i2 + 4), 16) % 62]);
        }
        return stringBuffer.toString();
    }
}
