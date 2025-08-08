package com.taobao.infoflow.taobao.render.dinamicx.dx3.view.video.videoimpl;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.avplayer.n;
import com.taobao.tao.Globals;
import com.taobao.taobaoavsdk.cache.library.StorageUtils;
import java.io.File;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import tb.kge;
import tb.ksz;
import tb.ldc;
import tb.ldf;

/* loaded from: classes.dex */
public class i {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static String f17434a;

    static {
        kge.a(595580361);
        f17434a = "VideoUtil";
    }

    public static String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[0]);
        }
        return StorageUtils.getIndividualCacheDirectory(Globals.getApplication()).getAbsolutePath() + File.separator;
    }

    public static String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str});
        }
        if (StringUtils.isEmpty(str)) {
            return null;
        }
        String str2 = a() + b(str);
        if (StringUtils.isEmpty(str2)) {
            ldf.d(f17434a, "getVideoFilePath empty");
        }
        return str2;
    }

    public static boolean a(Context context) {
        com.taobao.global.setting.c a2;
        ksz b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e1d6464", new Object[]{context})).booleanValue();
        }
        if (b() && (a2 = com.taobao.global.setting.c.a(context, "homepage")) != null && (b = a2.b()) != null) {
            return b.a(context);
        }
        return false;
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue() : !StringUtils.equals("l", ldc.a());
    }

    public static String b(String str) {
        byte[] digest;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6111438d", new Object[]{str});
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(str.getBytes());
            StringBuilder sb = new StringBuilder();
            for (byte b : messageDigest.digest()) {
                sb.append(Integer.toHexString((b >> 4) & 15));
                sb.append(Integer.toHexString(b & 15));
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static boolean a(n nVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3a932e35", new Object[]{nVar})).booleanValue() : nVar != null && nVar.i() == 1;
    }

    public static boolean b(n nVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("2b643594", new Object[]{nVar})).booleanValue() : nVar != null && nVar.i() == 2;
    }
}
