package com.taobao.android.launcher.common;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

/* loaded from: classes.dex */
public class h {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final boolean f13111a = new File("/data/local/tmp/", ".dag_top_level_switcher").exists();

    public static boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{str})).booleanValue();
        }
        if (f13111a) {
            return new File("/data/local/tmp/", str).exists();
        }
        return false;
    }

    public static long a(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8123b0c6", new Object[]{str, new Long(j)})).longValue();
        }
        try {
            String a2 = a(str, "");
            return TextUtils.isEmpty(a2) ? j : Long.parseLong(a2);
        } catch (NumberFormatException e) {
            e.printStackTrace();
            return j;
        }
    }

    public static String a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5178ea4", new Object[]{str, str2});
        }
        File file = new File("/data/local/tmp/", str);
        if (!file.exists()) {
            return str2;
        }
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
            String readLine = randomAccessFile.readLine();
            randomAccessFile.close();
            return readLine;
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
            return str2;
        }
    }
}
