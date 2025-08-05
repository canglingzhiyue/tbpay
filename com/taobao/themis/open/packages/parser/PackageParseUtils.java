package com.taobao.themis.open.packages.parser;

import android.taobao.windvane.jsbridge.api.WVFile;
import android.text.TextUtils;
import com.alibaba.ariver.kernel.RVConstants;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.open.resource.b;
import com.taobao.themis.open.resource.c;
import com.taobao.themis.utils.g;
import com.taobao.themis.utils.io.i;
import com.taobao.themis.utils.io.j;
import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;
import tb.kge;
import tb.tod;
import tb.toe;
import tb.tog;

/* loaded from: classes9.dex */
public class PackageParseUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String LEGACY_TAR_PUBLIC_KEY = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQC2y61svV7Q0gmvxprTt6YX76rps8R+q+C+Qtkkk2+njIABsf10sHnl/5aQBh2s+kdo6YGlJrnKdxVso2JRzy+QbRBUgTdJmKfm5uGPdcqYuO0ur4b/QCyHTMoKJjBT8iI3hYIGhn0hACDao4xIsgzJ39grRKUa6120WbInlOLWSQIDAQAB";
    private static final String NEW_SIGN_PUBLIC_KEY = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAl96KRuzoQDgt3q3478MYKwTGDV0Fz5w+sKOfz+Ar+/XkwqLjVW7bAk+/nOD9Z4mnwM+BsgU/G5KGQ9WMjcXAow/eRBSf93iqcBX5+DdlkbneNyQP7Mvcy8EwOAa3y7AetEpTeYrv5cppFUjq4TVu9w+DwV1qegfvJEAA+6gFJEcJPxD9fxJggCF02tL3k9/WDnaNYVN3dCq8fN4jWZLr6KWlAX5UW5ZVtXP9IWObFnvRNjgXQhW/LzJLdbcDlQ5U6ImFyIFf//vn3vEhzlpU6EkxdGr+FWwsRiMTY9aZ1fJiFlgAZQpInV6cbDM8LgNGPtDsYUibIi3rVFtYtHAxQwIDAQAB";
    public static final String TAG = ":PackageParseUtils";

    static {
        kge.a(2082668423);
    }

    public static Map<String, c> getPreParsedPackage(ParseContext parseContext) throws ParseFailedException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("58cb0eae", new Object[]{parseContext});
        }
        return null;
    }

    public static Map<String, c> parsePackage(ParseContext parseContext) throws ParseFailedException {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("b9eae2c3", new Object[]{parseContext}) : parsePackage(parseContext, false);
    }

    public static Map<String, c> parsePackage(ParseContext parseContext, boolean z) throws ParseFailedException {
        String str;
        Map<String, c> preParsedPackage;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("b228833b", new Object[]{parseContext, new Boolean(z)});
        }
        if (parseContext.packagePath == null) {
            throw new ParseFailedException(2, "PACKAGE_PATH_NULL");
        }
        if (!z && (preParsedPackage = getPreParsedPackage(parseContext)) != null) {
            parseContext.fromCache = true;
            return preParsedPackage;
        }
        System.currentTimeMillis();
        String str2 = parseContext.packagePath;
        if (str2 == null) {
            throw new ParseFailedException(1, "INVALID_PARAM packagePath is null, appId" + parseContext.appId);
        }
        File file = new File(str2);
        File[] listFiles = file.listFiles();
        if (listFiles == null || listFiles.length == 0) {
            throw new ParseFailedException(2, "OFFLINE_PATH_NOT_EXIST");
        }
        try {
            long currentTimeMillis = System.currentTimeMillis();
            file.lastModified();
            file.setLastModified(currentTimeMillis);
        } catch (Throwable unused) {
        }
        if (parseContext.mainFileName == null) {
            str = parseContext.appId + ".tar";
        } else {
            str = parseContext.mainFileName;
        }
        String a2 = g.a(parseContext.packagePath, str);
        HashMap hashMap = new HashMap();
        try {
            fastReadTarIntoMemory(hashMap, a2, parseContext);
            return hashMap;
        } finally {
        }
    }

    private static boolean inBlackList(ParseContext parseContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c2205eb7", new Object[]{parseContext, str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        if (parseContext.ignorePatterns != null) {
            for (Pattern pattern : parseContext.ignorePatterns) {
                if (pattern.matcher(str).matches()) {
                    return true;
                }
            }
        }
        return TextUtils.equals(str, "CERT.json") || TextUtils.equals(str, "SIGN.json") || str.startsWith(RVConstants.PKG_EXT_PREFIX) || str.startsWith(RVConstants.SUB_PACKAGE_DIR_PREFIX) || str.contains("ios") || str.contains("hpmfile.json");
    }

    public static void fastReadTarIntoMemory(Map<String, c> map, String str, ParseContext parseContext) throws IOException {
        toe toeVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7321e194", new Object[]{map, str, parseContext});
            return;
        }
        long a2 = g.a(str);
        tog togVar = null;
        if (i.b() && a2 <= WVFile.FILE_MAX_SIZE && a2 >= 65536) {
            byte[] a3 = i.a(2048);
            try {
                toeVar = new toe(str);
                while (true) {
                    try {
                        tod a4 = toeVar.a();
                        if (a4 != null) {
                            String a5 = a4.a();
                            if (!a4.c() && !TextUtils.isEmpty(a5) && !inBlackList(parseContext, a5)) {
                                j jVar = new j();
                                while (true) {
                                    int a6 = toeVar.a(a3);
                                    if (a6 == -1) {
                                        break;
                                    }
                                    jVar.write(a3, 0, a6);
                                }
                                byte[] byteArray = jVar.toByteArray();
                                i.a(jVar);
                                if (byteArray != null) {
                                    putData(map, parseContext, a5, byteArray);
                                }
                            }
                        } else {
                            i.a(a3);
                            i.a(toeVar);
                            return;
                        }
                    } catch (Throwable th) {
                        th = th;
                        i.a(a3);
                        i.a(toeVar);
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                toeVar = null;
            }
        } else {
            try {
                tog togVar2 = new tog(new BufferedInputStream(new FileInputStream(str)));
                try {
                    readTarStreamIntoMemory(map, togVar2, parseContext);
                    i.a((Closeable) togVar2);
                } catch (Throwable th3) {
                    th = th3;
                    togVar = togVar2;
                    i.a((Closeable) togVar);
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
            }
        }
    }

    public static void readTarStreamIntoMemory(Map<String, c> map, tog togVar, ParseContext parseContext) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22bc76d6", new Object[]{map, togVar, parseContext});
            return;
        }
        byte[] a2 = i.a(2048);
        while (true) {
            try {
                tod a3 = togVar.a();
                if (a3 == null) {
                    return;
                }
                String a4 = a3.a();
                if (!a3.c() && !TextUtils.isEmpty(a4) && !inBlackList(parseContext, a4)) {
                    j jVar = new j();
                    while (true) {
                        int read = togVar.read(a2);
                        if (read == -1) {
                            break;
                        }
                        jVar.write(a2, 0, read);
                    }
                    byte[] byteArray = jVar.toByteArray();
                    i.a(jVar);
                    if (byteArray != null) {
                        putData(map, parseContext, a4, byteArray);
                    }
                }
            } finally {
                i.a(a2);
                i.a((Closeable) togVar);
            }
        }
    }

    private static void putData(Map<String, c> map, ParseContext parseContext, String str, byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21472374", new Object[]{map, parseContext, str, bArr});
        } else {
            map.put(str, new b(str, bArr));
        }
    }
}
