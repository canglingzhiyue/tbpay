package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.io.InputStream;
import java.util.regex.Pattern;

/* loaded from: classes8.dex */
public class prg {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1968696149);
    }

    public static String a(int i) {
        byte[] bArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9064aa65", new Object[]{new Integer(i)});
        }
        String str = "";
        InputStream inputStream = null;
        try {
            inputStream = new ProcessBuilder("/system/bin/cat", String.format("/sys/devices/system/cpu/cpu%d/cpufreq/cpuinfo_max_freq", Integer.valueOf(i))).start().getInputStream();
            if (inputStream != null) {
                while (inputStream.read(new byte[24]) != -1) {
                    str = str + new String(bArr);
                }
                inputStream.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e2) {
                    e2.printStackTrace();
                }
            }
            str = "N/A";
        }
        return str.trim();
    }

    /* loaded from: classes8.dex */
    public class a implements FileFilter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(1580738472);
            kge.a(-1123682416);
        }

        @Override // java.io.FileFilter
        public boolean accept(File file) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("50e018ca", new Object[]{this, file})).booleanValue() : Pattern.matches("cpu[0-9]", file.getName());
        }
    }

    public static int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[0])).intValue();
        }
        try {
            File[] listFiles = new File("/sys/devices/system/cpu/").listFiles(new a());
            if (listFiles == null) {
                return 2;
            }
            return listFiles.length;
        } catch (Exception e) {
            e.printStackTrace();
            return 1;
        }
    }
}
