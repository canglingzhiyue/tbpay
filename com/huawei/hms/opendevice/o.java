package com.huawei.hms.opendevice;

import android.content.Context;
import android.os.Build;
import mtopsdk.common.util.StringUtils;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.IOUtils;
import com.taobao.calendar.sdk.db.schedule.Repeat;
import com.taobao.taobao.R;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;
import tb.cyg;
import tb.cyh;
import tb.cyj;
import tb.cyk;

/* loaded from: classes4.dex */
public abstract class o {

    /* renamed from: a  reason: collision with root package name */
    private static final String f7506a = "o";
    private static Map<String, String> b = new HashMap();
    private static final Object c = new Object();

    private static String a() {
        return "2A57086C86EF54970C1E6EB37BFC72B1";
    }

    private static String a(String str) {
        String str2 = b.get(str);
        return StringUtils.isEmpty(str2) ? "" : str2;
    }

    private static void a(String str, Context context) {
        String c2 = d.c(context.getApplicationContext());
        if (!StringUtils.isEmpty(c2)) {
            try {
                a("s", str, c2 + "/files/s");
            } catch (IOException unused) {
                HMSLog.e(f7506a, "save keyS IOException.");
            }
        }
    }

    private static void a(String str, String str2, String str3) throws IOException {
        OutputStreamWriter outputStreamWriter;
        BufferedWriter bufferedWriter;
        HMSLog.i(f7506a, "save local secret key.");
        BufferedWriter bufferedWriter2 = null;
        try {
            File file = new File(str3);
            p.a(file);
            outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), "UTF-8");
            try {
                bufferedWriter = new BufferedWriter(outputStreamWriter);
            } catch (Throwable th) {
                th = th;
            }
        } catch (Throwable th2) {
            th = th2;
            outputStreamWriter = null;
        }
        try {
            bufferedWriter.write(str2);
            bufferedWriter.flush();
            b.put(str, str2);
            IOUtils.closeQuietly((Writer) outputStreamWriter);
            IOUtils.closeQuietly((Writer) bufferedWriter);
        } catch (Throwable th3) {
            th = th3;
            bufferedWriter2 = bufferedWriter;
            IOUtils.closeQuietly((Writer) outputStreamWriter);
            IOUtils.closeQuietly((Writer) bufferedWriter2);
            throw th;
        }
    }

    private static void a(String str, String str2, String str3, String str4, String str5, Context context) {
        String c2 = d.c(context.getApplicationContext());
        if (!StringUtils.isEmpty(c2)) {
            try {
                a("m", str, c2 + "/files/math/m");
                a("p", str2, c2 + "/files/panda/p");
                a(Repeat.D, str3, c2 + "/files/panda/d");
                a("t", str4, c2 + "/files/math/t");
                a("s", str5, c2 + "/files/s");
            } catch (IOException unused) {
                HMSLog.e(f7506a, "save key IOException.");
            }
        }
    }

    public static byte[] a(Context context) {
        byte[] a2 = c.a(context.getString(R.string.push_cat_head));
        byte[] a3 = c.a(context.getString(R.string.push_cat_body));
        return a(a(a(a2, a3), c.a(a())));
    }

    private static byte[] a(String str, String str2, String str3, String str4) {
        return Build.VERSION.SDK_INT >= 26 ? cyg.a(str, str2, str3, str4, 32, true) : cyg.a(str, str2, str3, str4, 32, false);
    }

    private static byte[] a(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return new byte[0];
        }
        for (int i = 0; i < bArr.length; i++) {
            bArr[i] = (byte) (bArr[i] >> 2);
        }
        return bArr;
    }

    private static byte[] a(byte[] bArr, byte[] bArr2) {
        if (bArr == null || bArr2 == null || bArr.length == 0 || bArr2.length == 0) {
            return new byte[0];
        }
        int length = bArr.length;
        if (length != bArr2.length) {
            return new byte[0];
        }
        byte[] bArr3 = new byte[length];
        for (int i = 0; i < length; i++) {
            bArr3[i] = (byte) (bArr[i] ^ bArr2[i]);
        }
        return bArr3;
    }

    public static String b(Context context) {
        if (!i()) {
            HMSLog.i(f7506a, "work key is empty, execute init.");
            c(context);
        }
        String b2 = cyk.b(f(), b());
        return q.a(b2) ? b2 : e(context);
    }

    private static byte[] b() {
        return a(d(), e(), c(), g());
    }

    private static String c() {
        return a(Repeat.D);
    }

    public static void c(Context context) {
        synchronized (c) {
            d(context.getApplicationContext());
            if (i()) {
                HMSLog.i(f7506a, "The local secret is already in separate file mode.");
                return;
            }
            File file = new File(d.c(context.getApplicationContext()) + "/shared_prefs/LocalAvengers.xml");
            if (file.exists()) {
                com.huawei.secure.android.common.util.a.a(file);
                HMSLog.i(f7506a, "destroy C, delete file LocalAvengers.xml.");
            }
            byte[] a2 = cyh.a(32);
            byte[] a3 = cyh.a(32);
            byte[] a4 = cyh.a(32);
            byte[] a5 = cyh.a(32);
            String a6 = c.a(a2);
            String a7 = c.a(a3);
            String a8 = c.a(a4);
            String a9 = c.a(a5);
            a(a6, a7, a8, a9, cyk.a(c.a(cyh.a(32)), a(a6, a7, a8, a9)), context);
            HMSLog.i(f7506a, "generate D.");
        }
    }

    private static String d() {
        return a("m");
    }

    private static void d(Context context) {
        if (i()) {
            HMSLog.i(f7506a, "secretKeyCache not empty.");
            return;
        }
        b.clear();
        String c2 = d.c(context);
        if (StringUtils.isEmpty(c2)) {
            return;
        }
        String a2 = p.a(c2 + "/files/math/m");
        String a3 = p.a(c2 + "/files/panda/p");
        String a4 = p.a(c2 + "/files/panda/d");
        String a5 = p.a(c2 + "/files/math/t");
        String a6 = p.a(c2 + "/files/s");
        if (!q.a(a2, a3, a4, a5, a6)) {
            return;
        }
        b.put("m", a2);
        b.put("p", a3);
        b.put(Repeat.D, a4);
        b.put("t", a5);
        b.put("s", a6);
    }

    private static String e() {
        return a("p");
    }

    private static synchronized String e(Context context) {
        synchronized (o.class) {
            String b2 = cyk.b(f(), b());
            if (q.a(b2)) {
                HMSLog.i(f7506a, "keyS has been upgraded, no require operate again.");
                return b2;
            }
            String a2 = cyk.a(f(), h());
            if (q.a(a2)) {
                HMSLog.i(f7506a, "keyS is encrypt by RootKeyUtil, upgrade encrypt mode.");
                a(cyk.a(a2, b()), context);
                return a2;
            }
            String b3 = cyk.b(f(), cyg.a(d(), e(), c(), g(), 32, false));
            if (!q.a(b3)) {
                HMSLog.e(f7506a, "all mode unable to decrypt root key.");
                return "";
            }
            HMSLog.i(f7506a, "keyS is encrypt by ExportRootKey with sha1, upgrade encrypt mode to sha256.");
            a(cyk.a(b3, b()), context);
            return b3;
        }
    }

    private static String f() {
        return a("s");
    }

    private static String g() {
        return a("t");
    }

    private static cyj h() {
        return cyj.a(d(), e(), c(), g());
    }

    private static boolean i() {
        return !StringUtils.isEmpty(f());
    }
}
