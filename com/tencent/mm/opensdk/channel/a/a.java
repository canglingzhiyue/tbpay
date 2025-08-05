package com.tencent.mm.opensdk.channel.a;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.mm.opensdk.constants.Build;
import com.tencent.mm.opensdk.constants.ConstantsAPI;
import com.tencent.mm.opensdk.utils.Log;
import com.tencent.mm.opensdk.utils.b;
import java.security.MessageDigest;
import tb.kge;

/* loaded from: classes9.dex */
public class a {

    /* renamed from: com.tencent.mm.opensdk.channel.a.a$a  reason: collision with other inner class name */
    /* loaded from: classes9.dex */
    public static class C1024a {

        /* renamed from: a  reason: collision with root package name */
        public String f23662a;
        public String b;
        public String c;
        public long d;
        public Bundle e;

        static {
            kge.a(455211822);
        }
    }

    static {
        kge.a(2002706097);
    }

    public static int a(Bundle bundle, String str, int i) {
        if (bundle == null) {
            return i;
        }
        try {
            return bundle.getInt(str, i);
        } catch (Exception e) {
            Log.e("MicroMsg.IntentUtil", "getIntExtra exception:" + e.getMessage());
            return i;
        }
    }

    public static Object a(int i, String str) {
        try {
            switch (i) {
                case 1:
                    return Integer.valueOf(str);
                case 2:
                    return Long.valueOf(str);
                case 3:
                    return str;
                case 4:
                    return Boolean.valueOf(str);
                case 5:
                    return Float.valueOf(str);
                case 6:
                    return Double.valueOf(str);
                default:
                    Log.e("MicroMsg.SDK.PluginProvider.Resolver", "unknown type");
                    return null;
            }
        } catch (Exception e) {
            Log.e("MicroMsg.SDK.PluginProvider.Resolver", "resolveObj exception:" + e.getMessage());
            return null;
        }
    }

    public static String a(Bundle bundle, String str) {
        if (bundle == null) {
            return null;
        }
        try {
            return bundle.getString(str);
        } catch (Exception e) {
            Log.e("MicroMsg.IntentUtil", "getStringExtra exception:" + e.getMessage());
            return null;
        }
    }

    public static boolean a(Context context, C1024a c1024a) {
        String str;
        if (context == null || c1024a == null) {
            str = "send fail, invalid argument";
        } else if (!b.b(c1024a.b)) {
            String str2 = null;
            if (!b.b(c1024a.f23662a)) {
                str2 = c1024a.f23662a + ".permission.MM_MESSAGE";
            }
            Intent intent = new Intent(c1024a.b);
            Bundle bundle = c1024a.e;
            if (bundle != null) {
                intent.putExtras(bundle);
            }
            String packageName = context.getPackageName();
            intent.putExtra(ConstantsAPI.SDK_VERSION, Build.SDK_INT);
            intent.putExtra(ConstantsAPI.APP_PACKAGE, packageName);
            intent.putExtra(ConstantsAPI.CONTENT, c1024a.c);
            intent.putExtra(ConstantsAPI.APP_SUPORT_CONTENT_TYPE, c1024a.d);
            intent.putExtra(ConstantsAPI.CHECK_SUM, a(c1024a.c, (int) Build.SDK_INT, packageName));
            context.sendBroadcast(intent, str2);
            Log.d("MicroMsg.SDK.MMessage", "send mm message, intent=" + intent + ", perm=" + str2);
            return true;
        } else {
            str = "send fail, action is null";
        }
        Log.e("MicroMsg.SDK.MMessage", str);
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 4, insn: 0x029c: MOVE  (r1 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]), block:B:142:0x029c */
    /* JADX WARN: Removed duplicated region for block: B:163:0x015f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0262 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:176:0x01ef A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:178:0x017c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:182:0x027f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0245 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:188:0x020c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:190:0x01d2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0199 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v36 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r8v79 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static byte[] a(java.lang.String r8, int r9) {
        /*
            Method dump skipped, instructions count: 763
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.opensdk.channel.a.a.a(java.lang.String, int):byte[]");
    }

    public static byte[] a(String str, int i, String str2) {
        String str3;
        StringBuffer stringBuffer = new StringBuffer();
        if (str != null) {
            stringBuffer.append(str);
        }
        stringBuffer.append(i);
        stringBuffer.append(str2);
        stringBuffer.append("mMcShCsTr");
        byte[] bytes = stringBuffer.toString().substring(1, 9).getBytes();
        char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(bytes);
            byte[] digest = messageDigest.digest();
            char[] cArr2 = new char[digest.length << 1];
            int i2 = 0;
            for (byte b : digest) {
                int i3 = i2 + 1;
                cArr2[i2] = cArr[(b >>> 4) & 15];
                i2 = i3 + 1;
                cArr2[i3] = cArr[b & 15];
            }
            str3 = new String(cArr2);
        } catch (Exception unused) {
            str3 = null;
        }
        return str3.getBytes();
    }
}
