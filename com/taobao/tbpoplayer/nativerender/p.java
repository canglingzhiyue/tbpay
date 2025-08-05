package com.taobao.tbpoplayer.nativerender;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import tb.kge;
import tb.riy;

/* loaded from: classes8.dex */
public class p {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String PROP_REGEX = "\\{\\{\\+?store.*?\\}\\}";

    static {
        kge.a(1958913676);
    }

    public static boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{str})).booleanValue();
        }
        try {
            if (!TextUtils.isEmpty(str)) {
                return Pattern.compile(PROP_REGEX).matcher(str).find();
            }
        } catch (Throwable th) {
            com.alibaba.poplayer.utils.c.a("PropAnalise.containsProp.error.", th);
        }
        return false;
    }

    public static String a(e eVar, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("83a1f2b0", new Object[]{eVar, str}) : a(eVar, str, true);
    }

    public static String a(e eVar, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("93da883c", new Object[]{eVar, str, new Boolean(z)});
        }
        try {
            Object c = c(eVar, str, z);
            if (c != null) {
                return String.valueOf(c);
            }
            return null;
        } catch (Throwable th) {
            com.alibaba.poplayer.utils.c.a("PropAnalise.parsePropResultToString.error.", th);
            eVar.a("parsePropResultToStringError.prop=" + str, "");
            return null;
        }
    }

    public static Long b(e eVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Long) ipChange.ipc$dispatch("bf4d6884", new Object[]{eVar, str});
        }
        Number b = b(eVar, str, false);
        if (b == null) {
            return null;
        }
        return (Long) b;
    }

    public static Float c(e eVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Float) ipChange.ipc$dispatch("20c7313b", new Object[]{eVar, str});
        }
        Number b = b(eVar, str, true);
        if (b == null) {
            return null;
        }
        return (Float) b;
    }

    private static Number b(e eVar, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Number) ipChange.ipc$dispatch("93ef5645", new Object[]{eVar, str, new Boolean(z)});
        }
        try {
            Object c = c(eVar, str, true);
            if (c == null) {
                return null;
            }
            if (z) {
                return Float.valueOf(c instanceof String ? Float.parseFloat((String) c) : ((Float) c).floatValue());
            }
            return Long.valueOf(c instanceof String ? Long.parseLong((String) c) : ((Long) c).longValue());
        } catch (Throwable unused) {
            eVar.a("parsePropResultToNumberError.prop=" + str, "");
            return null;
        }
    }

    private static Object c(e eVar, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("af696f50", new Object[]{eVar, str, new Boolean(z)});
        }
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        try {
            Matcher matcher = Pattern.compile(PROP_REGEX).matcher(str);
            StringBuffer stringBuffer = new StringBuffer();
            while (matcher.find()) {
                String replaceAll = matcher.group().replaceAll("[$]", "");
                com.alibaba.poplayer.utils.c.a("PropAnalise.parsePropResult.prop=%s.group=%s", str, replaceAll);
                Object d = d(eVar, replaceAll);
                if (d == null) {
                    if (!z) {
                        com.alibaba.poplayer.utils.c.a("PropAnalise.parsePropResult.resultIsNull.prop=%s.group=%s", str, replaceAll);
                        return null;
                    }
                    eVar.a("PropValueProcessInvalid.group=" + replaceAll, "");
                    return null;
                } else if (str.equals(replaceAll)) {
                    return d;
                } else {
                    matcher.appendReplacement(stringBuffer, String.valueOf(d).replaceAll("\\\\", "\\\\\\\\"));
                }
            }
            matcher.appendTail(stringBuffer);
            String stringBuffer2 = stringBuffer.toString();
            com.alibaba.poplayer.utils.c.a("PropAnalise.parsePropResult.prop=%s.result=%s", str, stringBuffer2);
            return stringBuffer2;
        } catch (Throwable th) {
            com.alibaba.poplayer.utils.c.a("PropAnalise.parsePropResult.eval.", th);
            eVar.a("ParsePropResultFailed", "");
            return str;
        }
    }

    private static Object d(e eVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("dbe30a1f", new Object[]{eVar, str});
        }
        if (TextUtils.isEmpty(str) || str.length() <= 4 || !str.startsWith("{{") || !str.endsWith("}}")) {
            return str;
        }
        String substring = str.substring(2, str.length() - 2);
        boolean startsWith = substring.startsWith(riy.PLUS);
        if (startsWith) {
            substring = substring.substring(1);
        }
        if (!substring.startsWith("store.")) {
            return str;
        }
        String substring2 = substring.substring(6);
        Object c = com.taobao.tbpoplayer.util.c.c(eVar.a().f(), substring2);
        if (c == null) {
            return null;
        }
        if (startsWith) {
            try {
                Float valueOf = Float.valueOf(Float.parseFloat(String.valueOf(c)));
                com.alibaba.poplayer.utils.c.a("PropAnalise.replaceProp.realPath=%s.result=%s.Number.", substring2, valueOf);
                if (a(valueOf)) {
                    return valueOf;
                }
                return null;
            } catch (Throwable th) {
                com.alibaba.poplayer.utils.c.a("PropAnalise.replaceProp.evalError.Long.realPath=" + substring2, th);
            }
        } else {
            try {
                String valueOf2 = String.valueOf(c);
                com.alibaba.poplayer.utils.c.a("PropAnalise.replaceProp.realPath=%s.result=%s.String.", substring2, valueOf2);
                if (a((Object) valueOf2)) {
                    return valueOf2;
                }
                return null;
            } catch (Throwable th2) {
                com.alibaba.poplayer.utils.c.a("PropAnalise.replaceProp.evalError.String.realPath=" + substring2, th2);
            }
        }
        return null;
    }

    private static boolean a(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a6251248", new Object[]{obj})).booleanValue();
        }
        if (obj == null) {
            return false;
        }
        return (obj instanceof String) || (obj instanceof Long) || (obj instanceof Double) || (obj instanceof Float);
    }
}
