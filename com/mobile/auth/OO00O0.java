package com.mobile.auth;

import android.text.TextUtils;
import com.mobile.auth.gatewayauth.ExceptionProcessor;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.ConcurrentHashMap;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSession;

/* loaded from: classes4.dex */
public class OO00O0 {
    private static ConcurrentHashMap<String, HostnameVerifier> O000000o = new ConcurrentHashMap<>();

    /* JADX WARN: Can't wrap try/catch for region: R(18:2|3|4|(1:6)|7|8|(14:(25:124|125|11|12|13|14|15|(1:17)|18|19|20|(1:22)(1:102)|23|24|26|27|29|30|(2:31|(1:33)(1:34))|35|(1:37)|38|(1:40)|(1:42)|43)|23|24|26|27|29|30|(3:31|(0)(0)|33)|35|(0)|38|(0)|(0)|43)|10|11|12|13|14|15|(0)|18|19|20|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x01aa, code lost:
        r10 = null;
        r11 = null;
        r1 = 0;
        r2 = null;
        r6 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x01d7, code lost:
        r9 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0149, code lost:
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x014a, code lost:
        r2 = r9;
        r9 = r10;
        r10 = 0;
        r11 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0151, code lost:
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0152, code lost:
        r2 = r9;
        r9 = r10;
        r10 = null;
        r11 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0158, code lost:
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0159, code lost:
        r2 = r9;
        r9 = r10;
        r10 = null;
        r11 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0160, code lost:
        r9 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0161, code lost:
        r10 = 0;
        r11 = 0;
        r1 = 0;
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0167, code lost:
        r9 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0168, code lost:
        r10 = null;
        r11 = null;
        r1 = 0;
        r2 = null;
        r6 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x016d, code lost:
        r9 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x016e, code lost:
        r10 = null;
        r11 = null;
        r1 = 0;
        r2 = null;
        r6 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0173, code lost:
        r9 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0174, code lost:
        r10 = 0;
        r11 = 0;
        r1 = 0;
        r2 = null;
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x017b, code lost:
        r9 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x017c, code lost:
        r10 = null;
        r11 = null;
        r1 = 0;
        r2 = null;
        r6 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01a9, code lost:
        r9 = e;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01b8 A[Catch: Throwable -> 0x01bc, TRY_ENTER, TryCatch #25 {Throwable -> 0x01f9, blocks: (B:3:0x0001, B:6:0x000d, B:7:0x0011, B:10:0x0017, B:132:0x01f8, B:13:0x0033, B:15:0x0038, B:119:0x01da, B:123:0x01e2, B:125:0x01e7, B:127:0x01ec, B:129:0x01f1, B:85:0x018a, B:89:0x0192, B:91:0x0197, B:93:0x019c, B:95:0x01a1, B:103:0x01b8, B:107:0x01c0, B:109:0x01c5, B:111:0x01ca, B:113:0x01cf, B:35:0x00fb, B:38:0x0101, B:40:0x0109, B:42:0x010e), top: B:139:0x0001, inners: #23 }] */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01c0 A[Catch: Throwable -> 0x01bc, TryCatch #25 {Throwable -> 0x01f9, blocks: (B:3:0x0001, B:6:0x000d, B:7:0x0011, B:10:0x0017, B:132:0x01f8, B:13:0x0033, B:15:0x0038, B:119:0x01da, B:123:0x01e2, B:125:0x01e7, B:127:0x01ec, B:129:0x01f1, B:85:0x018a, B:89:0x0192, B:91:0x0197, B:93:0x019c, B:95:0x01a1, B:103:0x01b8, B:107:0x01c0, B:109:0x01c5, B:111:0x01ca, B:113:0x01cf, B:35:0x00fb, B:38:0x0101, B:40:0x0109, B:42:0x010e), top: B:139:0x0001, inners: #23 }] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01c5 A[Catch: Throwable -> 0x01bc, TryCatch #25 {Throwable -> 0x01f9, blocks: (B:3:0x0001, B:6:0x000d, B:7:0x0011, B:10:0x0017, B:132:0x01f8, B:13:0x0033, B:15:0x0038, B:119:0x01da, B:123:0x01e2, B:125:0x01e7, B:127:0x01ec, B:129:0x01f1, B:85:0x018a, B:89:0x0192, B:91:0x0197, B:93:0x019c, B:95:0x01a1, B:103:0x01b8, B:107:0x01c0, B:109:0x01c5, B:111:0x01ca, B:113:0x01cf, B:35:0x00fb, B:38:0x0101, B:40:0x0109, B:42:0x010e), top: B:139:0x0001, inners: #23 }] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01ca A[Catch: Throwable -> 0x01bc, TryCatch #25 {Throwable -> 0x01f9, blocks: (B:3:0x0001, B:6:0x000d, B:7:0x0011, B:10:0x0017, B:132:0x01f8, B:13:0x0033, B:15:0x0038, B:119:0x01da, B:123:0x01e2, B:125:0x01e7, B:127:0x01ec, B:129:0x01f1, B:85:0x018a, B:89:0x0192, B:91:0x0197, B:93:0x019c, B:95:0x01a1, B:103:0x01b8, B:107:0x01c0, B:109:0x01c5, B:111:0x01ca, B:113:0x01cf, B:35:0x00fb, B:38:0x0101, B:40:0x0109, B:42:0x010e), top: B:139:0x0001, inners: #23 }] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01cf A[Catch: Throwable -> 0x01bc, TRY_LEAVE, TryCatch #25 {Throwable -> 0x01f9, blocks: (B:3:0x0001, B:6:0x000d, B:7:0x0011, B:10:0x0017, B:132:0x01f8, B:13:0x0033, B:15:0x0038, B:119:0x01da, B:123:0x01e2, B:125:0x01e7, B:127:0x01ec, B:129:0x01f1, B:85:0x018a, B:89:0x0192, B:91:0x0197, B:93:0x019c, B:95:0x01a1, B:103:0x01b8, B:107:0x01c0, B:109:0x01c5, B:111:0x01ca, B:113:0x01cf, B:35:0x00fb, B:38:0x0101, B:40:0x0109, B:42:0x010e), top: B:139:0x0001, inners: #23 }] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01da A[Catch: Throwable -> 0x01de, TRY_ENTER, TryCatch #25 {Throwable -> 0x01f9, blocks: (B:3:0x0001, B:6:0x000d, B:7:0x0011, B:10:0x0017, B:132:0x01f8, B:13:0x0033, B:15:0x0038, B:119:0x01da, B:123:0x01e2, B:125:0x01e7, B:127:0x01ec, B:129:0x01f1, B:85:0x018a, B:89:0x0192, B:91:0x0197, B:93:0x019c, B:95:0x01a1, B:103:0x01b8, B:107:0x01c0, B:109:0x01c5, B:111:0x01ca, B:113:0x01cf, B:35:0x00fb, B:38:0x0101, B:40:0x0109, B:42:0x010e), top: B:139:0x0001, inners: #23 }] */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01e2 A[Catch: Throwable -> 0x01de, TryCatch #25 {Throwable -> 0x01f9, blocks: (B:3:0x0001, B:6:0x000d, B:7:0x0011, B:10:0x0017, B:132:0x01f8, B:13:0x0033, B:15:0x0038, B:119:0x01da, B:123:0x01e2, B:125:0x01e7, B:127:0x01ec, B:129:0x01f1, B:85:0x018a, B:89:0x0192, B:91:0x0197, B:93:0x019c, B:95:0x01a1, B:103:0x01b8, B:107:0x01c0, B:109:0x01c5, B:111:0x01ca, B:113:0x01cf, B:35:0x00fb, B:38:0x0101, B:40:0x0109, B:42:0x010e), top: B:139:0x0001, inners: #23 }] */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01e7 A[Catch: Throwable -> 0x01de, TryCatch #25 {Throwable -> 0x01f9, blocks: (B:3:0x0001, B:6:0x000d, B:7:0x0011, B:10:0x0017, B:132:0x01f8, B:13:0x0033, B:15:0x0038, B:119:0x01da, B:123:0x01e2, B:125:0x01e7, B:127:0x01ec, B:129:0x01f1, B:85:0x018a, B:89:0x0192, B:91:0x0197, B:93:0x019c, B:95:0x01a1, B:103:0x01b8, B:107:0x01c0, B:109:0x01c5, B:111:0x01ca, B:113:0x01cf, B:35:0x00fb, B:38:0x0101, B:40:0x0109, B:42:0x010e), top: B:139:0x0001, inners: #23 }] */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01ec A[Catch: Throwable -> 0x01de, TryCatch #25 {Throwable -> 0x01f9, blocks: (B:3:0x0001, B:6:0x000d, B:7:0x0011, B:10:0x0017, B:132:0x01f8, B:13:0x0033, B:15:0x0038, B:119:0x01da, B:123:0x01e2, B:125:0x01e7, B:127:0x01ec, B:129:0x01f1, B:85:0x018a, B:89:0x0192, B:91:0x0197, B:93:0x019c, B:95:0x01a1, B:103:0x01b8, B:107:0x01c0, B:109:0x01c5, B:111:0x01ca, B:113:0x01cf, B:35:0x00fb, B:38:0x0101, B:40:0x0109, B:42:0x010e), top: B:139:0x0001, inners: #23 }] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01f1 A[Catch: Throwable -> 0x01de, TRY_LEAVE, TryCatch #25 {Throwable -> 0x01f9, blocks: (B:3:0x0001, B:6:0x000d, B:7:0x0011, B:10:0x0017, B:132:0x01f8, B:13:0x0033, B:15:0x0038, B:119:0x01da, B:123:0x01e2, B:125:0x01e7, B:127:0x01ec, B:129:0x01f1, B:85:0x018a, B:89:0x0192, B:91:0x0197, B:93:0x019c, B:95:0x01a1, B:103:0x01b8, B:107:0x01c0, B:109:0x01c5, B:111:0x01ca, B:113:0x01cf, B:35:0x00fb, B:38:0x0101, B:40:0x0109, B:42:0x010e), top: B:139:0x0001, inners: #23 }] */
    /* JADX WARN: Removed duplicated region for block: B:155:0x00f4 A[EDGE_INSN: B:155:0x00f4->B:33:0x00f4 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00bd A[Catch: all -> 0x0160, IOException -> 0x0167, SocketTimeoutException -> 0x016d, TryCatch #17 {SocketTimeoutException -> 0x016d, IOException -> 0x0167, all -> 0x0160, blocks: (B:19:0x004c, B:21:0x00bd, B:22:0x00c0), top: B:147:0x004c }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00d2 A[Catch: all -> 0x0149, IOException -> 0x0151, SocketTimeoutException -> 0x0158, TryCatch #19 {SocketTimeoutException -> 0x0158, IOException -> 0x0151, all -> 0x0149, blocks: (B:23:0x00c7, B:25:0x00d2, B:26:0x00d7), top: B:144:0x00c7 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00d7 A[Catch: all -> 0x0149, IOException -> 0x0151, SocketTimeoutException -> 0x0158, TRY_LEAVE, TryCatch #19 {SocketTimeoutException -> 0x0158, IOException -> 0x0151, all -> 0x0149, blocks: (B:23:0x00c7, B:25:0x00d2, B:26:0x00d7), top: B:144:0x00c7 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00f0 A[Catch: all -> 0x0116, IOException -> 0x011c, SocketTimeoutException -> 0x0122, LOOP:0: B:30:0x00ea->B:32:0x00f0, LOOP_END, TryCatch #15 {SocketTimeoutException -> 0x0122, IOException -> 0x011c, all -> 0x0116, blocks: (B:29:0x00e5, B:30:0x00ea, B:32:0x00f0, B:33:0x00f4), top: B:151:0x00e5 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00fb A[Catch: Throwable -> 0x00ff, TRY_ENTER, TryCatch #25 {Throwable -> 0x01f9, blocks: (B:3:0x0001, B:6:0x000d, B:7:0x0011, B:10:0x0017, B:132:0x01f8, B:13:0x0033, B:15:0x0038, B:119:0x01da, B:123:0x01e2, B:125:0x01e7, B:127:0x01ec, B:129:0x01f1, B:85:0x018a, B:89:0x0192, B:91:0x0197, B:93:0x019c, B:95:0x01a1, B:103:0x01b8, B:107:0x01c0, B:109:0x01c5, B:111:0x01ca, B:113:0x01cf, B:35:0x00fb, B:38:0x0101, B:40:0x0109, B:42:0x010e), top: B:139:0x0001, inners: #23 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0109 A[Catch: Throwable -> 0x00ff, TryCatch #25 {Throwable -> 0x01f9, blocks: (B:3:0x0001, B:6:0x000d, B:7:0x0011, B:10:0x0017, B:132:0x01f8, B:13:0x0033, B:15:0x0038, B:119:0x01da, B:123:0x01e2, B:125:0x01e7, B:127:0x01ec, B:129:0x01f1, B:85:0x018a, B:89:0x0192, B:91:0x0197, B:93:0x019c, B:95:0x01a1, B:103:0x01b8, B:107:0x01c0, B:109:0x01c5, B:111:0x01ca, B:113:0x01cf, B:35:0x00fb, B:38:0x0101, B:40:0x0109, B:42:0x010e), top: B:139:0x0001, inners: #23 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x010e A[Catch: Throwable -> 0x00ff, TRY_LEAVE, TryCatch #25 {Throwable -> 0x01f9, blocks: (B:3:0x0001, B:6:0x000d, B:7:0x0011, B:10:0x0017, B:132:0x01f8, B:13:0x0033, B:15:0x0038, B:119:0x01da, B:123:0x01e2, B:125:0x01e7, B:127:0x01ec, B:129:0x01f1, B:85:0x018a, B:89:0x0192, B:91:0x0197, B:93:0x019c, B:95:0x01a1, B:103:0x01b8, B:107:0x01c0, B:109:0x01c5, B:111:0x01ca, B:113:0x01cf, B:35:0x00fb, B:38:0x0101, B:40:0x0109, B:42:0x010e), top: B:139:0x0001, inners: #23 }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x018a A[Catch: Throwable -> 0x018e, TRY_ENTER, TryCatch #25 {Throwable -> 0x01f9, blocks: (B:3:0x0001, B:6:0x000d, B:7:0x0011, B:10:0x0017, B:132:0x01f8, B:13:0x0033, B:15:0x0038, B:119:0x01da, B:123:0x01e2, B:125:0x01e7, B:127:0x01ec, B:129:0x01f1, B:85:0x018a, B:89:0x0192, B:91:0x0197, B:93:0x019c, B:95:0x01a1, B:103:0x01b8, B:107:0x01c0, B:109:0x01c5, B:111:0x01ca, B:113:0x01cf, B:35:0x00fb, B:38:0x0101, B:40:0x0109, B:42:0x010e), top: B:139:0x0001, inners: #23 }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0192 A[Catch: Throwable -> 0x018e, TryCatch #25 {Throwable -> 0x01f9, blocks: (B:3:0x0001, B:6:0x000d, B:7:0x0011, B:10:0x0017, B:132:0x01f8, B:13:0x0033, B:15:0x0038, B:119:0x01da, B:123:0x01e2, B:125:0x01e7, B:127:0x01ec, B:129:0x01f1, B:85:0x018a, B:89:0x0192, B:91:0x0197, B:93:0x019c, B:95:0x01a1, B:103:0x01b8, B:107:0x01c0, B:109:0x01c5, B:111:0x01ca, B:113:0x01cf, B:35:0x00fb, B:38:0x0101, B:40:0x0109, B:42:0x010e), top: B:139:0x0001, inners: #23 }] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0197 A[Catch: Throwable -> 0x018e, TryCatch #25 {Throwable -> 0x01f9, blocks: (B:3:0x0001, B:6:0x000d, B:7:0x0011, B:10:0x0017, B:132:0x01f8, B:13:0x0033, B:15:0x0038, B:119:0x01da, B:123:0x01e2, B:125:0x01e7, B:127:0x01ec, B:129:0x01f1, B:85:0x018a, B:89:0x0192, B:91:0x0197, B:93:0x019c, B:95:0x01a1, B:103:0x01b8, B:107:0x01c0, B:109:0x01c5, B:111:0x01ca, B:113:0x01cf, B:35:0x00fb, B:38:0x0101, B:40:0x0109, B:42:0x010e), top: B:139:0x0001, inners: #23 }] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x019c A[Catch: Throwable -> 0x018e, TryCatch #25 {Throwable -> 0x01f9, blocks: (B:3:0x0001, B:6:0x000d, B:7:0x0011, B:10:0x0017, B:132:0x01f8, B:13:0x0033, B:15:0x0038, B:119:0x01da, B:123:0x01e2, B:125:0x01e7, B:127:0x01ec, B:129:0x01f1, B:85:0x018a, B:89:0x0192, B:91:0x0197, B:93:0x019c, B:95:0x01a1, B:103:0x01b8, B:107:0x01c0, B:109:0x01c5, B:111:0x01ca, B:113:0x01cf, B:35:0x00fb, B:38:0x0101, B:40:0x0109, B:42:0x010e), top: B:139:0x0001, inners: #23 }] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01a1 A[Catch: Throwable -> 0x018e, TRY_LEAVE, TryCatch #25 {Throwable -> 0x01f9, blocks: (B:3:0x0001, B:6:0x000d, B:7:0x0011, B:10:0x0017, B:132:0x01f8, B:13:0x0033, B:15:0x0038, B:119:0x01da, B:123:0x01e2, B:125:0x01e7, B:127:0x01ec, B:129:0x01f1, B:85:0x018a, B:89:0x0192, B:91:0x0197, B:93:0x019c, B:95:0x01a1, B:103:0x01b8, B:107:0x01c0, B:109:0x01c5, B:111:0x01ca, B:113:0x01cf, B:35:0x00fb, B:38:0x0101, B:40:0x0109, B:42:0x010e), top: B:139:0x0001, inners: #23 }] */
    /* JADX WARN: Type inference failed for: r10v0, types: [int] */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v21 */
    /* JADX WARN: Type inference failed for: r10v26 */
    /* JADX WARN: Type inference failed for: r10v31, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r10v33 */
    /* JADX WARN: Type inference failed for: r10v34 */
    /* JADX WARN: Type inference failed for: r10v4, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r10v43 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r11v0, types: [int] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v20 */
    /* JADX WARN: Type inference failed for: r11v25, types: [java.io.Reader, java.io.InputStreamReader] */
    /* JADX WARN: Type inference failed for: r11v4, types: [java.io.InputStreamReader] */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.io.BufferedReader] */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.io.BufferedReader] */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.io.BufferedReader] */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.security.NoSuchAlgorithmException] */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v27, types: [java.io.BufferedReader] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.security.KeyManagementException] */
    /* JADX WARN: Type inference failed for: r1v32 */
    /* JADX WARN: Type inference failed for: r1v33 */
    /* JADX WARN: Type inference failed for: r1v34 */
    /* JADX WARN: Type inference failed for: r1v35 */
    /* JADX WARN: Type inference failed for: r1v5, types: [javax.net.ssl.SSLContext] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r6v12, types: [javax.net.ssl.HttpsURLConnection] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.security.SecureRandom] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v7, types: [javax.net.ssl.HttpsURLConnection] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String O000000o(com.mobile.auth.OO00O r9, int r10, int r11) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 515
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mobile.auth.OO00O0.O000000o(com.mobile.auth.OO00O, int, int):java.lang.String");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0138 A[Catch: Throwable -> 0x013c, TRY_ENTER, TryCatch #10 {Throwable -> 0x0157, blocks: (B:3:0x0001, B:6:0x0016, B:117:0x0156, B:88:0x0116, B:92:0x011e, B:94:0x0123, B:96:0x0128, B:98:0x012d, B:104:0x0138, B:108:0x0140, B:110:0x0145, B:112:0x014a, B:114:0x014f, B:19:0x0085, B:22:0x008b, B:24:0x0093, B:26:0x0098, B:70:0x00eb, B:74:0x00f3, B:76:0x00f8, B:78:0x00fd, B:80:0x0102), top: B:138:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0140 A[Catch: Throwable -> 0x013c, TryCatch #10 {Throwable -> 0x0157, blocks: (B:3:0x0001, B:6:0x0016, B:117:0x0156, B:88:0x0116, B:92:0x011e, B:94:0x0123, B:96:0x0128, B:98:0x012d, B:104:0x0138, B:108:0x0140, B:110:0x0145, B:112:0x014a, B:114:0x014f, B:19:0x0085, B:22:0x008b, B:24:0x0093, B:26:0x0098, B:70:0x00eb, B:74:0x00f3, B:76:0x00f8, B:78:0x00fd, B:80:0x0102), top: B:138:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0145 A[Catch: Throwable -> 0x013c, TryCatch #10 {Throwable -> 0x0157, blocks: (B:3:0x0001, B:6:0x0016, B:117:0x0156, B:88:0x0116, B:92:0x011e, B:94:0x0123, B:96:0x0128, B:98:0x012d, B:104:0x0138, B:108:0x0140, B:110:0x0145, B:112:0x014a, B:114:0x014f, B:19:0x0085, B:22:0x008b, B:24:0x0093, B:26:0x0098, B:70:0x00eb, B:74:0x00f3, B:76:0x00f8, B:78:0x00fd, B:80:0x0102), top: B:138:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x014a A[Catch: Throwable -> 0x013c, TryCatch #10 {Throwable -> 0x0157, blocks: (B:3:0x0001, B:6:0x0016, B:117:0x0156, B:88:0x0116, B:92:0x011e, B:94:0x0123, B:96:0x0128, B:98:0x012d, B:104:0x0138, B:108:0x0140, B:110:0x0145, B:112:0x014a, B:114:0x014f, B:19:0x0085, B:22:0x008b, B:24:0x0093, B:26:0x0098, B:70:0x00eb, B:74:0x00f3, B:76:0x00f8, B:78:0x00fd, B:80:0x0102), top: B:138:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:114:0x014f A[Catch: Throwable -> 0x013c, TRY_LEAVE, TryCatch #10 {Throwable -> 0x0157, blocks: (B:3:0x0001, B:6:0x0016, B:117:0x0156, B:88:0x0116, B:92:0x011e, B:94:0x0123, B:96:0x0128, B:98:0x012d, B:104:0x0138, B:108:0x0140, B:110:0x0145, B:112:0x014a, B:114:0x014f, B:19:0x0085, B:22:0x008b, B:24:0x0093, B:26:0x0098, B:70:0x00eb, B:74:0x00f3, B:76:0x00f8, B:78:0x00fd, B:80:0x0102), top: B:138:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00eb A[Catch: Throwable -> 0x00ef, TRY_ENTER, TryCatch #10 {Throwable -> 0x0157, blocks: (B:3:0x0001, B:6:0x0016, B:117:0x0156, B:88:0x0116, B:92:0x011e, B:94:0x0123, B:96:0x0128, B:98:0x012d, B:104:0x0138, B:108:0x0140, B:110:0x0145, B:112:0x014a, B:114:0x014f, B:19:0x0085, B:22:0x008b, B:24:0x0093, B:26:0x0098, B:70:0x00eb, B:74:0x00f3, B:76:0x00f8, B:78:0x00fd, B:80:0x0102), top: B:138:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00f3 A[Catch: Throwable -> 0x00ef, TryCatch #10 {Throwable -> 0x0157, blocks: (B:3:0x0001, B:6:0x0016, B:117:0x0156, B:88:0x0116, B:92:0x011e, B:94:0x0123, B:96:0x0128, B:98:0x012d, B:104:0x0138, B:108:0x0140, B:110:0x0145, B:112:0x014a, B:114:0x014f, B:19:0x0085, B:22:0x008b, B:24:0x0093, B:26:0x0098, B:70:0x00eb, B:74:0x00f3, B:76:0x00f8, B:78:0x00fd, B:80:0x0102), top: B:138:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00f8 A[Catch: Throwable -> 0x00ef, TryCatch #10 {Throwable -> 0x0157, blocks: (B:3:0x0001, B:6:0x0016, B:117:0x0156, B:88:0x0116, B:92:0x011e, B:94:0x0123, B:96:0x0128, B:98:0x012d, B:104:0x0138, B:108:0x0140, B:110:0x0145, B:112:0x014a, B:114:0x014f, B:19:0x0085, B:22:0x008b, B:24:0x0093, B:26:0x0098, B:70:0x00eb, B:74:0x00f3, B:76:0x00f8, B:78:0x00fd, B:80:0x0102), top: B:138:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00fd A[Catch: Throwable -> 0x00ef, TryCatch #10 {Throwable -> 0x0157, blocks: (B:3:0x0001, B:6:0x0016, B:117:0x0156, B:88:0x0116, B:92:0x011e, B:94:0x0123, B:96:0x0128, B:98:0x012d, B:104:0x0138, B:108:0x0140, B:110:0x0145, B:112:0x014a, B:114:0x014f, B:19:0x0085, B:22:0x008b, B:24:0x0093, B:26:0x0098, B:70:0x00eb, B:74:0x00f3, B:76:0x00f8, B:78:0x00fd, B:80:0x0102), top: B:138:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0102 A[Catch: Throwable -> 0x00ef, TRY_LEAVE, TryCatch #10 {Throwable -> 0x0157, blocks: (B:3:0x0001, B:6:0x0016, B:117:0x0156, B:88:0x0116, B:92:0x011e, B:94:0x0123, B:96:0x0128, B:98:0x012d, B:104:0x0138, B:108:0x0140, B:110:0x0145, B:112:0x014a, B:114:0x014f, B:19:0x0085, B:22:0x008b, B:24:0x0093, B:26:0x0098, B:70:0x00eb, B:74:0x00f3, B:76:0x00f8, B:78:0x00fd, B:80:0x0102), top: B:138:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0116 A[Catch: Throwable -> 0x011a, TRY_ENTER, TryCatch #10 {Throwable -> 0x0157, blocks: (B:3:0x0001, B:6:0x0016, B:117:0x0156, B:88:0x0116, B:92:0x011e, B:94:0x0123, B:96:0x0128, B:98:0x012d, B:104:0x0138, B:108:0x0140, B:110:0x0145, B:112:0x014a, B:114:0x014f, B:19:0x0085, B:22:0x008b, B:24:0x0093, B:26:0x0098, B:70:0x00eb, B:74:0x00f3, B:76:0x00f8, B:78:0x00fd, B:80:0x0102), top: B:138:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x011e A[Catch: Throwable -> 0x011a, TryCatch #10 {Throwable -> 0x0157, blocks: (B:3:0x0001, B:6:0x0016, B:117:0x0156, B:88:0x0116, B:92:0x011e, B:94:0x0123, B:96:0x0128, B:98:0x012d, B:104:0x0138, B:108:0x0140, B:110:0x0145, B:112:0x014a, B:114:0x014f, B:19:0x0085, B:22:0x008b, B:24:0x0093, B:26:0x0098, B:70:0x00eb, B:74:0x00f3, B:76:0x00f8, B:78:0x00fd, B:80:0x0102), top: B:138:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0123 A[Catch: Throwable -> 0x011a, TryCatch #10 {Throwable -> 0x0157, blocks: (B:3:0x0001, B:6:0x0016, B:117:0x0156, B:88:0x0116, B:92:0x011e, B:94:0x0123, B:96:0x0128, B:98:0x012d, B:104:0x0138, B:108:0x0140, B:110:0x0145, B:112:0x014a, B:114:0x014f, B:19:0x0085, B:22:0x008b, B:24:0x0093, B:26:0x0098, B:70:0x00eb, B:74:0x00f3, B:76:0x00f8, B:78:0x00fd, B:80:0x0102), top: B:138:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0128 A[Catch: Throwable -> 0x011a, TryCatch #10 {Throwable -> 0x0157, blocks: (B:3:0x0001, B:6:0x0016, B:117:0x0156, B:88:0x0116, B:92:0x011e, B:94:0x0123, B:96:0x0128, B:98:0x012d, B:104:0x0138, B:108:0x0140, B:110:0x0145, B:112:0x014a, B:114:0x014f, B:19:0x0085, B:22:0x008b, B:24:0x0093, B:26:0x0098, B:70:0x00eb, B:74:0x00f3, B:76:0x00f8, B:78:0x00fd, B:80:0x0102), top: B:138:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x012d A[Catch: Throwable -> 0x011a, TRY_LEAVE, TryCatch #10 {Throwable -> 0x0157, blocks: (B:3:0x0001, B:6:0x0016, B:117:0x0156, B:88:0x0116, B:92:0x011e, B:94:0x0123, B:96:0x0128, B:98:0x012d, B:104:0x0138, B:108:0x0140, B:110:0x0145, B:112:0x014a, B:114:0x014f, B:19:0x0085, B:22:0x008b, B:24:0x0093, B:26:0x0098, B:70:0x00eb, B:74:0x00f3, B:76:0x00f8, B:78:0x00fd, B:80:0x0102), top: B:138:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String O000000o(com.mobile.auth.OO00O r6, int r7, int r8, int r9) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 353
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mobile.auth.OO00O0.O000000o(com.mobile.auth.OO00O, int, int, int):java.lang.String");
    }

    public static String O000000o(String str) {
        try {
            try {
                return new URL(str).getHost();
            } catch (MalformedURLException e) {
                e.printStackTrace();
                return null;
            }
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
                return null;
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
                return null;
            }
        }
    }

    private static HostnameVerifier O00000Oo(String str) {
        try {
            String O000000o2 = O000000o(str);
            if (O000000o != null && !TextUtils.isEmpty(O000000o2) && O000000o.containsKey(O000000o2)) {
                return O000000o.get(O000000o2);
            }
            HostnameVerifier hostnameVerifier = new HostnameVerifier() { // from class: com.mobile.auth.OO00O0.1
                @Override // javax.net.ssl.HostnameVerifier
                public boolean verify(String str2, SSLSession sSLSession) {
                    try {
                        return HttpsURLConnection.getDefaultHostnameVerifier().verify(str2, sSLSession);
                    } catch (Throwable th) {
                        try {
                            ExceptionProcessor.processException(th);
                            return false;
                        } catch (Throwable th2) {
                            ExceptionProcessor.processException(th2);
                            return false;
                        }
                    }
                }
            };
            if (O000000o == null) {
                O000000o = new ConcurrentHashMap<>();
            }
            O000000o.put(O000000o2, hostnameVerifier);
            return hostnameVerifier;
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
                return null;
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
                return null;
            }
        }
    }
}
