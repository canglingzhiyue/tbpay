package com.alibaba.android.aura.taobao.adapter.extension.linkage.service.utils;

import com.ta.utdid2.android.utils.Base64;
import tb.arc;
import tb.ard;
import tb.kge;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.zip.GZIPOutputStream;

public class a {
    public static volatile transient /* synthetic */ com.android.alibaba.ip.runtime.IpChange $ipChange;

    static {
        int v0 = 0x20b5858;
        kge.a(v0);
    }

    public static String a(String p0) {
        String str = "compress";
        String str2 = "StringUtils";
        com.android.alibaba.ip.runtime.IpChange ipChange = $ipChange;
        if (ipChange instanceof com.android.alibaba.ip.runtime.IpChange) {
            Object[] objArr = new Object[1];
            objArr[0] = p0;
            return (String) ipChange.ipc$dispatch("9f352ae", objArr);
        }

        String str3 = "";
        if (p0 == null || p0.isEmpty()) {
            return str3;
        }

        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(p0.length());
        GZIPOutputStream gZIPOutputStream = null;
        boolean z = true;
        try {
            gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(p0.getBytes("utf-8"));
            gZIPOutputStream.close();
        } catch (IOException e) {
            if (gZIPOutputStream != null) {
                try {
                    gZIPOutputStream.close();
                } catch (IOException e2) {
                    // ignored
                }
            }
            z = false;
        } catch (Throwable th) {
            if (gZIPOutputStream != null) {
                try {
                    gZIPOutputStream.close();
                } catch (IOException e3) {
                    // ignored
                }
            }
            throw th;
        }

        if (!z) {
            try {
                byteArrayOutputStream.close();
            } catch (IOException e4) {
                ard a2 = arc.a();
                a2.c(str2, str, e4.getMessage());
            }
            return str3;
        }

        byte[] byteArray = byteArrayOutputStream.toByteArray();
        try {
            byteArrayOutputStream.close();
        } catch (IOException e5) {
            ard a3 = arc.a();
            a3.c(str2, str, e5.getMessage());
        }

        return Base64.encodeToString(byteArray, 0);
    }
}