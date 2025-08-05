package com.taobao.android.detail.core.detail.kit.utils;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import tb.emu;
import tb.epj;
import tb.epm;
import tb.kge;

/* loaded from: classes4.dex */
public class g {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String FILTERED_SUFFIX = "END_IMAGE_URL";

    /* renamed from: a  reason: collision with root package name */
    public static int f9550a;

    static {
        kge.a(-456800538);
        f9550a = 160;
        emu.a("com.taobao.android.detail.core.detail.kit.utils.ImageUrlUtil");
    }

    public static String a(Context context, String str, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6e4c47a7", new Object[]{context, str, new Integer(i)}) : epj.b().a(str, new epm(i, i));
    }

    public static String b(Context context, String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d87bcfc6", new Object[]{context, str, new Integer(i)});
        }
        String a2 = epj.b().a(str, new epm(i, i));
        com.taobao.android.detail.core.utils.i.d("ImageUrlUtil", "ImageUrlUtil : Detail_Image_DecideLowNetUrl " + str + "|" + i + "|" + a2);
        return a2;
    }

    public static String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str});
        }
        int indexOf = str.indexOf(".jpg");
        if (indexOf < 0) {
            return str;
        }
        return str.substring(0, indexOf) + ".jpg";
    }
}
