package com.ut.share.utils;

import android.util.Log;
import com.alibaba.ability.localization.b;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.statistic.TBS;
import com.taobao.taobao.R;
import java.lang.reflect.Method;
import java.net.URLEncoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Properties;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import tb.kge;

/* loaded from: classes9.dex */
public class ShareLinkWrapper {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String SEP = ".";
    private static final String SHARE_KEY = "ut_sk";
    private static final String SHORT_URL_SERVICE_ADDR = "http://adash.m.taobao.com/rest/shorturl";
    private static final String SHORT_URL_SERVICE_PWD = "clark_123ok";
    private static final Pattern URL_PATTERN;
    private static final int VERSION = 1;
    private static Method encodeShortUrlMtd;
    private static Method getItemUrlMtd;
    public static char[] hexChar;

    static {
        kge.a(892227754);
        URL_PATTERN = Pattern.compile("[.]*(http[s]{0,1}://[\\p{Alnum}|.]+[:\\d]?[\\p{Graph}]*)[.]*");
        hexChar = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        try {
            Class<?> cls = Class.forName("com.taobao.wireless.tbShortUrl.util.ShortUrlUtil");
            if (cls != null) {
                encodeShortUrlMtd = cls.getMethod("encodeShortUrlByTimeOut", String.class, Long.class, Integer.class);
            }
            Class<?> cls2 = Class.forName("com.taobao.wireless.tbShortUrl.entity.CodeResult");
            if (cls2 == null) {
                return;
            }
            getItemUrlMtd = cls2.getMethod("getItemUrl", new Class[0]);
        } catch (Exception e) {
            Log.e("[shortUrl]get encode method reflect error", e.getMessage(), e);
        }
    }

    public static String wrapShareLink(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f938f96c", new Object[]{str, str2, str3});
        }
        try {
            String utsid = TBS.Adv.getUtsid();
            StringBuilder sb = new StringBuilder(str3);
            String str4 = "";
            int indexOf = str3.indexOf(63);
            int indexOf2 = str3.indexOf(35);
            if (indexOf >= 0 && !str3.endsWith("?")) {
                str4 = "&";
            }
            if (indexOf < 0) {
                str4 = "?";
            }
            String genShare = genShare(str4, str, str2, utsid);
            if (indexOf2 >= 0 && indexOf < indexOf2) {
                sb.insert(indexOf2, genShare);
            } else {
                sb.append(genShare);
            }
            return sb.toString();
        } catch (Exception unused) {
            return str3;
        }
    }

    private static String genShare(String str, String str2, String str3, String str4) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ccf522c2", new Object[]{str, str2, str3, str4});
        }
        return str + SHARE_KEY + '=' + URLEncoder.encode("1." + str4 + "." + str3 + "." + str2, "UTF-8");
    }

    public static String wrapShareTextWithLink(String str, String str2, String str3, boolean z) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("638665b3", new Object[]{str, str2, str3, new Boolean(z)});
        }
        try {
            StringBuilder sb = new StringBuilder();
            Matcher matcher = URL_PATTERN.matcher(str3);
            while (matcher != null && matcher.find()) {
                sb.append(str3.substring(i, matcher.start()));
                String wrapShareLink = wrapShareLink(str, str2, matcher.group());
                if (z) {
                    wrapShareLink = shortenURL(wrapShareLink);
                }
                sb.append(wrapShareLink);
                i = matcher.end();
            }
            sb.append(str3.substring(i));
            return sb.toString();
        } catch (Exception unused) {
            return str3;
        }
    }

    public static int weiboStringLen(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ebdb61c0", new Object[]{str})).intValue();
        }
        if (str != null) {
            try {
                if (str.length() != 0) {
                    int i = 0;
                    for (int i2 = 0; i2 < str.length(); i2++) {
                        i = isChineseCh(str.charAt(i2)) ? i + 2 : i + 1;
                    }
                    return i;
                }
            } catch (Exception unused) {
                return str.length();
            }
        }
        return 0;
    }

    public static String cutWeiboString(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8cb590c5", new Object[]{str, new Integer(i)});
        }
        if (str == null) {
            return str;
        }
        try {
            if (str.length() == 0) {
                return str;
            }
            StringBuilder sb = new StringBuilder();
            int i2 = 0;
            for (int i3 = 0; i3 < str.length(); i3++) {
                char charAt = str.charAt(i3);
                i2 = isChineseCh(charAt) ? i2 + 2 : i2 + 1;
                if (i2 <= i) {
                    sb.append(charAt);
                } else {
                    return sb.toString();
                }
            }
            return sb.toString();
        } catch (Exception unused) {
            return str;
        }
    }

    public static boolean isChineseCh(char c) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("8aafe5b2", new Object[]{new Character(c)})).booleanValue() : String.valueOf(c).getBytes("UTF-8").length > 1;
    }

    public static String getMd5(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c653e78a", new Object[]{bArr});
        }
        if (bArr == null) {
            return null;
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(bArr);
            byte[] digest = messageDigest.digest();
            StringBuilder sb = new StringBuilder(digest.length << 1);
            for (byte b : digest) {
                sb.append(hexChar[(b & 240) >>> 4]);
                sb.append(hexChar[b & 15]);
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }

    public static String shortenURL(String str) {
        String str2;
        if (str != null && !str.equalsIgnoreCase("")) {
            try {
                Log.e("[shorturl]", "run shortutl action");
                Properties properties = new Properties();
                properties.put("url", str);
                TBS.Ext.commitEvent("TB_WIRELESS_SHORT_URL", properties);
                if (encodeShortUrlMtd != null) {
                    Object invoke = encodeShortUrlMtd.invoke(null, str, 2L, 0);
                    return (invoke == null || (str2 = (String) getItemUrlMtd.invoke(invoke, new Object[0])) == null || str2.equalsIgnoreCase("")) ? str : str2;
                }
                Log.e("[shorturl]", "encodeShortUrlMtd is null! return input param!");
                return str;
            } catch (Exception unused) {
                Log.e("create short url exception", b.a(R.string.taobao_app_1010_1_18104));
            }
        }
        return str;
    }

    public static String shortenURLOLd(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c4a4dab2", new Object[]{str});
        }
        try {
            String valueOf = String.valueOf(System.currentTimeMillis());
            String md5 = getMd5((SHORT_URL_SERVICE_PWD + valueOf).getBytes("UTF-8"));
            String httpPost = httpPost(SHORT_URL_SERVICE_ADDR, "s=" + md5 + "&t=" + valueOf + "&requrl=" + URLEncoder.encode(str, "UTF-8"));
            if (!httpPost.equals("E0001") && !httpPost.equals("E0101")) {
                if (!httpPost.equals("E0102")) {
                    return httpPost;
                }
            }
        } catch (Exception unused) {
        }
        return str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00aa A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.io.DataOutputStream] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.io.DataOutputStream] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.io.InputStream] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String httpPost(java.lang.String r7, java.lang.String r8) {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = com.ut.share.utils.ShareLinkWrapper.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L18
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r3] = r7
            r1[r2] = r8
            java.lang.String r7 = "9ed9db9d"
            java.lang.Object r7 = r0.ipc$dispatch(r7, r1)
            java.lang.String r7 = (java.lang.String) r7
            return r7
        L18:
            r0 = 0
            java.net.URL r1 = new java.net.URL     // Catch: java.lang.Throwable -> L90 java.lang.Exception -> L93
            r1.<init>(r7)     // Catch: java.lang.Throwable -> L90 java.lang.Exception -> L93
            java.net.URLConnection r7 = r1.openConnection()     // Catch: java.lang.Throwable -> L90 java.lang.Exception -> L93
            java.net.HttpURLConnection r7 = (java.net.HttpURLConnection) r7     // Catch: java.lang.Throwable -> L90 java.lang.Exception -> L93
            r7.setDoOutput(r2)     // Catch: java.lang.Throwable -> L90 java.lang.Exception -> L93
            r7.setDoInput(r2)     // Catch: java.lang.Throwable -> L90 java.lang.Exception -> L93
            java.lang.String r1 = "POST"
            r7.setRequestMethod(r1)     // Catch: java.lang.Throwable -> L90 java.lang.Exception -> L93
            r7.setUseCaches(r3)     // Catch: java.lang.Throwable -> L90 java.lang.Exception -> L93
            r1 = 1000(0x3e8, float:1.401E-42)
            r7.setConnectTimeout(r1)     // Catch: java.lang.Throwable -> L90 java.lang.Exception -> L93
            r7.setReadTimeout(r1)     // Catch: java.lang.Throwable -> L90 java.lang.Exception -> L93
            java.lang.String r1 = "Content-Type"
            java.lang.String r2 = "application/x-www-form-urlencoded"
            r7.setRequestProperty(r1, r2)     // Catch: java.lang.Throwable -> L90 java.lang.Exception -> L93
            r7.connect()     // Catch: java.lang.Throwable -> L90 java.lang.Exception -> L93
            java.io.DataOutputStream r1 = new java.io.DataOutputStream     // Catch: java.lang.Throwable -> L90 java.lang.Exception -> L93
            java.io.OutputStream r2 = r7.getOutputStream()     // Catch: java.lang.Throwable -> L90 java.lang.Exception -> L93
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L90 java.lang.Exception -> L93
            java.lang.String r2 = "UTF-8"
            byte[] r8 = r8.getBytes(r2)     // Catch: java.lang.Throwable -> L8a java.lang.Exception -> L8d
            r1.write(r8)     // Catch: java.lang.Throwable -> L8a java.lang.Exception -> L8d
            r1.flush()     // Catch: java.lang.Throwable -> L8a java.lang.Exception -> L8d
            java.io.InputStream r8 = r7.getInputStream()     // Catch: java.lang.Throwable -> L8a java.lang.Exception -> L8d
            java.io.ByteArrayOutputStream r2 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Exception -> L88 java.lang.Throwable -> La6
            r2.<init>()     // Catch: java.lang.Exception -> L88 java.lang.Throwable -> La6
            r4 = 2048(0x800, float:2.87E-42)
            byte[] r4 = new byte[r4]     // Catch: java.lang.Exception -> L88 java.lang.Throwable -> La6
        L66:
            int r5 = r8.read(r4)     // Catch: java.lang.Exception -> L88 java.lang.Throwable -> La6
            r6 = -1
            if (r5 == r6) goto L71
            r2.write(r4, r3, r5)     // Catch: java.lang.Exception -> L88 java.lang.Throwable -> La6
            goto L66
        L71:
            if (r7 == 0) goto L76
            r7.disconnect()     // Catch: java.lang.Exception -> L88 java.lang.Throwable -> La6
        L76:
            java.lang.String r7 = new java.lang.String     // Catch: java.lang.Exception -> L88 java.lang.Throwable -> La6
            byte[] r2 = r2.toByteArray()     // Catch: java.lang.Exception -> L88 java.lang.Throwable -> La6
            r7.<init>(r2)     // Catch: java.lang.Exception -> L88 java.lang.Throwable -> La6
            r1.close()     // Catch: java.lang.Exception -> L82
        L82:
            if (r8 == 0) goto L87
            r8.close()     // Catch: java.lang.Exception -> L87
        L87:
            return r7
        L88:
            r7 = move-exception
            goto L96
        L8a:
            r7 = move-exception
            r8 = r0
            goto La7
        L8d:
            r7 = move-exception
            r8 = r0
            goto L96
        L90:
            r7 = move-exception
            r8 = r0
            goto La8
        L93:
            r7 = move-exception
            r8 = r0
            r1 = r8
        L96:
            r7.printStackTrace()     // Catch: java.lang.Throwable -> La6
            if (r1 == 0) goto La0
            r1.close()     // Catch: java.lang.Exception -> L9f
            goto La0
        L9f:
        La0:
            if (r8 == 0) goto La5
            r8.close()     // Catch: java.lang.Exception -> La5
        La5:
            return r0
        La6:
            r7 = move-exception
        La7:
            r0 = r1
        La8:
            if (r0 == 0) goto Laf
            r0.close()     // Catch: java.lang.Exception -> Lae
            goto Laf
        Lae:
        Laf:
            if (r8 == 0) goto Lb4
            r8.close()     // Catch: java.lang.Exception -> Lb4
        Lb4:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ut.share.utils.ShareLinkWrapper.httpPost(java.lang.String, java.lang.String):java.lang.String");
    }
}
