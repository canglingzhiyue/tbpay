package com.taobao.android.detail.ttdetail.utils;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import tb.kge;

/* loaded from: classes5.dex */
public class bk {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1251150195);
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
}
