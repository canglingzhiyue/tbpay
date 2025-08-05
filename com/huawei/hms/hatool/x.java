package com.huawei.hms.hatool;

import java.io.File;
import java.io.IOException;
import tb.cyd;
import tb.cyh;
import tb.cyi;

/* loaded from: classes4.dex */
public class x {

    /* renamed from: a  reason: collision with root package name */
    private String f7492a = q0.i().getFilesDir().getPath();

    private String a(String str) {
        return this.f7492a + "/hms/component/".replace("component", str);
    }

    private void a(String str, String str2) {
        File file = new File(a(str));
        String a2 = a(str);
        File file2 = new File(a2, "hianalytics_" + str);
        if (!file.exists() && file.mkdirs()) {
            v.c("hmsSdk", "file directory is mkdirs");
        }
        if (a(file2)) {
            k1.a(file2, str2);
        } else {
            v.f("hmsSdk", "refreshComponent():file is not found,and file is create failed");
        }
    }

    private boolean a(File file) {
        if (file.exists()) {
            return true;
        }
        try {
            return file.createNewFile();
        } catch (IOException unused) {
            v.f("hmsSdk", "create new file error!");
            return false;
        }
    }

    private char[] a(String str, String str2, String str3, String str4) {
        byte[] a2 = cyi.a(str);
        byte[] a3 = cyi.a(str2);
        byte[] a4 = cyi.a(str3);
        byte[] a5 = cyi.a(str4);
        int length = a2.length;
        if (length > a3.length) {
            length = a3.length;
        }
        if (length > a4.length) {
            length = a4.length;
        }
        if (length > a5.length) {
            length = a5.length;
        }
        char[] cArr = new char[length];
        for (int i = 0; i < length; i++) {
            cArr[i] = (char) (((a2[i] ^ a3[i]) ^ a4[i]) ^ a5[i]);
        }
        return cArr;
    }

    private String b(String str) {
        String a2 = a(str);
        File file = new File(a2, "hianalytics_" + str);
        if (a(file)) {
            return k1.a(file);
        }
        String b = cyh.b(128);
        k1.a(file, b);
        return b;
    }

    private boolean b() {
        long a2 = d.a(q0.i(), "Privacy_MY", "assemblyFlash", -1L);
        if (-1 != a2) {
            return System.currentTimeMillis() - a2 > 31536000000L;
        }
        v.c("hmsSdk", "First init components");
        return true;
    }

    private static boolean b(File file) {
        File[] listFiles;
        if (file == null || !file.exists() || !file.isDirectory() || (listFiles = file.listFiles()) == null || listFiles.length == 0) {
            return false;
        }
        for (File file2 : listFiles) {
            if (file2.isFile()) {
                if (!file2.delete()) {
                    v.c("hmsSdk", "delete file failed : " + file2.getName());
                }
            } else if (file2.isDirectory()) {
                b(file2);
            }
        }
        return file.delete();
    }

    public static boolean c() {
        return b(new File(q0.i().getFilesDir().getPath() + "/hms"));
    }

    private String d() {
        return "f6040d0e807aaec325ecf44823765544e92905158169f694b282bf17388632cf95a83bae7d2d235c1f039b0df1dcca5fda619b6f7f459f2ff8d70ddb7b601592fe29fcae58c028f319b3b12495e67aa5390942a997a8cb572c8030b2df5c2b622608bea02b0c3e5d4dff3f72c9e3204049a45c0760cd3604af8d57f0e0c693cc";
    }

    public String a() {
        String b;
        String b2;
        String b3;
        String b4;
        String d = d();
        if (b()) {
            v.c("hmsSdk", "refresh components");
            b = cyh.b(128);
            a("aprpap", b);
            b2 = cyh.b(128);
            a("febdoc", b2);
            b3 = cyh.b(128);
            a("marfil", b3);
            b4 = cyh.b(128);
            a("maywnj", b4);
            d.b(q0.i(), "Privacy_MY", "assemblyFlash", System.currentTimeMillis());
        } else {
            b = b("aprpap");
            b2 = b("febdoc");
            b3 = b("marfil");
            b4 = b("maywnj");
        }
        return cyi.a(cyd.a(a(b, b2, b3, d), cyi.a(b4), 10000, 16));
    }
}
