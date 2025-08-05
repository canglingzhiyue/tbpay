package com.taobao.android.detail.core.detail.kit.utils;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import java.io.BufferedReader;
import java.io.FileReader;
import tb.emu;
import tb.epj;
import tb.epo;
import tb.kge;

/* loaded from: classes4.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final int DETAIL_CELL_HEIGHT;
    public static final int DETAIL_HMARGIN;

    static {
        kge.a(-1395109328);
        DETAIL_HMARGIN = epo.i;
        DETAIL_CELL_HEIGHT = (int) (epo.f27511a * 44.0f);
        emu.a("com.taobao.android.detail.core.detail.kit.utils.DetailUtils");
    }

    public static int b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9eca0ff2", new Object[]{context})).intValue();
        }
        Resources resources = epo.a().getResources();
        try {
            return resources.getDimensionPixelSize(resources.getIdentifier("status_bar_height", "dimen", "android"));
        } catch (Exception unused) {
            return (int) (epo.f27511a * 25.0f);
        }
    }

    public static int a(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("9e1d6453", new Object[]{context})).intValue() : a(context, 16843499);
    }

    private static int a(Context context, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("258f9a96", new Object[]{context, new Integer(i)})).intValue();
        }
        TypedArray typedArray = null;
        try {
            typedArray = context.getTheme().obtainStyledAttributes(new int[]{i});
            return typedArray.getDimensionPixelSize(0, 0);
        } finally {
            if (typedArray != null) {
                typedArray.recycle();
            }
        }
    }

    public static long a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("56c6c5c", new Object[0])).longValue();
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j = 0;
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("/proc/meminfo"), 8192);
            String readLine = bufferedReader.readLine();
            if (!TextUtils.isEmpty(readLine)) {
                j = Integer.valueOf(readLine.split("\\s+")[1]).intValue();
            }
            bufferedReader.close();
        } catch (Throwable unused) {
        }
        long currentTimeMillis2 = System.currentTimeMillis();
        com.taobao.android.detail.core.utils.i.d("DetailUtils", "getTotalMemory cost " + (currentTimeMillis2 - currentTimeMillis));
        return j;
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue();
        }
        try {
        } catch (Throwable unused) {
            com.taobao.android.detail.core.utils.i.a("DetailUtils", "isTmallApp exception");
        }
        return com.taobao.linkmanager.flowout.c.TMALL.equalsIgnoreCase(epj.a().getApplication().getString(R.string.config_app_type));
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[0])).booleanValue();
        }
        try {
        } catch (Throwable unused) {
            com.taobao.android.detail.core.utils.i.a("DetailUtils", "isTaobaoApp exception");
        }
        return "taobao".equalsIgnoreCase(epj.a().getApplication().getString(R.string.config_app_type));
    }
}
