package com.taobao.monitor.performance.cpu;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import tb.eoe;

/* loaded from: classes7.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int DEVICEINFO_UNKNOWN = -1;

    /* renamed from: a  reason: collision with root package name */
    private static transient Integer f18211a;
    private static final FileFilter b = new FileFilter() { // from class: com.taobao.monitor.performance.cpu.a.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // java.io.FileFilter
        public boolean accept(File file) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("50e018ca", new Object[]{this, file})).booleanValue();
            }
            String name = file.getName();
            if (!name.startsWith(eoe.TYPE_CPU)) {
                return false;
            }
            for (int i = 3; i < name.length(); i++) {
                if (!Character.isDigit(name.charAt(i))) {
                    return false;
                }
            }
            return true;
        }
    };

    public static int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[0])).intValue();
        }
        Integer num = f18211a;
        if (num != null) {
            return num.intValue();
        }
        int i = -1;
        try {
            int a2 = a("/sys/devices/system/cpu/possible");
            if (a2 == -1) {
                a2 = a("/sys/devices/system/cpu/present");
            }
            i = a2 == -1 ? b() : a2;
        } catch (NullPointerException | SecurityException unused) {
        }
        f18211a = Integer.valueOf(i);
        return i;
    }

    private static int a(String str) {
        FileInputStream fileInputStream;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f3a64c25", new Object[]{str})).intValue();
        }
        FileInputStream fileInputStream2 = null;
        try {
            fileInputStream = new FileInputStream(str);
        } catch (IOException unused) {
        } catch (Throwable th) {
            th = th;
            fileInputStream = null;
        }
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
            String readLine = bufferedReader.readLine();
            bufferedReader.close();
            int b2 = b(readLine);
            try {
                fileInputStream.close();
            } catch (IOException unused2) {
            }
            return b2;
        } catch (IOException unused3) {
            fileInputStream2 = fileInputStream;
            if (fileInputStream2 != null) {
                try {
                    fileInputStream2.close();
                } catch (IOException unused4) {
                }
            }
            return -1;
        } catch (Throwable th2) {
            th = th2;
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (IOException unused5) {
                }
            }
            throw th;
        }
    }

    private static int b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3dd7e566", new Object[]{str})).intValue();
        }
        if (str != null && str.matches("0-[\\d]+$")) {
            return Integer.valueOf(str.substring(2)).intValue() + 1;
        }
        return -1;
    }

    private static int b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dc", new Object[0])).intValue() : new File("/sys/devices/system/cpu/").listFiles(b).length;
    }
}
