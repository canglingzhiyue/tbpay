package com.taobao.android.detail.core.detail.kit.utils;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import mtopsdk.mtop.global.SDKUtils;
import tb.emu;
import tb.kge;

/* loaded from: classes4.dex */
public class n {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(662755636);
        emu.a("com.taobao.android.detail.core.detail.kit.utils.TimeUtils");
    }

    public static String a(long j, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2e9fa33a", new Object[]{new Long(j), str});
        }
        if (j < 0 || TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return new SimpleDateFormat(str, Locale.getDefault()).format((Date) new Timestamp(j));
        } catch (Exception unused) {
            return null;
        }
    }

    public static long a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5c", new Object[0])).longValue() : (SDKUtils.getTimeOffset() * 1000) + System.currentTimeMillis();
    }
}
