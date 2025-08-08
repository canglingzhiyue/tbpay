package com.taobao.tao.flexbox.layoutmanager.filter;

import android.net.Uri;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.parser.JSONLexer;
import com.alipay.android.msp.framework.statisticsv2.value.ErrorCode;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import tb.kge;
import tb.oec;
import tb.ogg;
import tb.ohe;
import tb.ohk;

/* loaded from: classes8.dex */
public class StringUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1810265074);
    }

    @FilterHandler(name = "isLetter")
    public static boolean isLetter(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("faab3c85", new Object[]{str})).booleanValue();
        }
        if (StringUtils.isEmpty(str)) {
            return false;
        }
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (!Character.isLetter(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    @FilterHandler(name = "isString")
    public static boolean isString(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("98c7ac42", new Object[]{obj})).booleanValue() : obj instanceof String;
    }

    @FilterHandler(name = com.taobao.android.weex_framework.util.a.ATOM_EXT_charAt)
    public static char charAt(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Character) ipChange.ipc$dispatch("598e0943", new Object[]{str, obj})).charValue();
        }
        int a2 = oec.a(obj, 0);
        if (!StringUtils.isEmpty(str) && a2 >= 0 && a2 < str.length()) {
            return str.charAt(a2);
        }
        return (char) 0;
    }

    @FilterHandler(name = "concat")
    public static String concat(String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("69280351", new Object[]{str, str2}) : (str == null || str2 == null) ? str : str.concat(str2);
    }

    @FilterHandler(name = com.taobao.android.weex_framework.util.a.ATOM_EXT_indexOf)
    public static int indexOf(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("85c9cb57", new Object[]{str, str2})).intValue();
        }
        if (StringUtils.isEmpty(str)) {
            return -1;
        }
        return str.indexOf(str2);
    }

    @FilterHandler(name = com.taobao.android.weex_framework.util.a.ATOM_EXT_lastIndexOf)
    public static int lastIndexOf(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e11f09e1", new Object[]{str, str2})).intValue();
        }
        if (StringUtils.isEmpty(str)) {
            return -1;
        }
        return str.lastIndexOf(str2);
    }

    @FilterHandler(name = com.taobao.android.weex_framework.util.a.ATOM_EXT_match)
    public static boolean match(String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("216932e4", new Object[]{str, str2})).booleanValue() : !StringUtils.isEmpty(str) && str.matches(str2);
    }

    @FilterHandler(name = "replace")
    public static String replace(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("91d0bce7", new Object[]{str, str2, str3}) : !StringUtils.isEmpty(str) ? str.replaceAll(str2, str3) : str;
    }

    @FilterHandler(name = "search")
    public static int search(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d294dfb6", new Object[]{str, str2})).intValue();
        }
        if (StringUtils.isEmpty(str)) {
            return -1;
        }
        return Pattern.compile(str2).matcher(str).start();
    }

    @FilterHandler(name = com.taobao.android.weex_framework.util.a.ATOM_EXT_toLocaleLowerCase)
    public static String toLocaleLowerCase(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("95d8a13", new Object[]{str}) : !StringUtils.isEmpty(str) ? str.toLowerCase() : "";
    }

    @FilterHandler(name = com.taobao.android.weex_framework.util.a.ATOM_EXT_toLocaleUpperCase)
    public static String toLocaleUpperCase(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("74b281d2", new Object[]{str}) : !StringUtils.isEmpty(str) ? str.toUpperCase() : "";
    }

    @FilterHandler(name = com.taobao.android.weex_framework.util.a.ATOM_EXT_toLowerCase)
    public static String toLowerCase(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("cac5b3d9", new Object[]{str}) : !StringUtils.isEmpty(str) ? str.toLowerCase() : "";
    }

    @FilterHandler(name = com.taobao.android.weex_framework.util.a.ATOM_EXT_toUpperCase)
    public static String toUpperCase(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("361aab98", new Object[]{str}) : !StringUtils.isEmpty(str) ? str.toUpperCase() : "";
    }

    @FilterHandler(name = com.taobao.android.weex_framework.util.a.ATOM_length)
    public static int length(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5bb1a4ea", new Object[]{str})).intValue();
        }
        if (StringUtils.isEmpty(str)) {
            return 0;
        }
        return str.length();
    }

    @FilterHandler(name = com.taobao.android.weex_framework.util.a.ATOM_EXT_reverse)
    public static String reverse(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c1e3210d", new Object[]{str});
        }
        if (StringUtils.isEmpty(str)) {
            return "";
        }
        ohe.a a2 = ohe.a();
        for (int length = str.length() - 1; length >= 0; length--) {
            a2.a(Character.valueOf(str.charAt(length)));
        }
        return a2.toString();
    }

    @FilterHandler(name = "trim")
    public static String trim(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f9c417cd", new Object[]{str}) : !StringUtils.isEmpty(str) ? str.trim() : "";
    }

    @FilterHandler(name = "trimAll")
    public static String trimAll(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("72177730", new Object[]{str}) : str != null ? str.replaceAll("\\s*|\t|\r|\n", "") : "";
    }

    @FilterHandler(name = "isEmpty")
    public static boolean isEmpty(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fcaeceaa", new Object[]{obj})).booleanValue();
        }
        if (obj instanceof List) {
            return ((List) obj).isEmpty();
        }
        if (obj instanceof Map) {
            return ((Map) obj).isEmpty();
        }
        if (obj instanceof String) {
            return StringUtils.isEmpty(String.valueOf(obj));
        }
        return obj == null;
    }

    @FilterHandler(name = "isNotEmpty")
    public static boolean isNotEmpty(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a57a32b", new Object[]{obj})).booleanValue() : !isEmpty(obj);
    }

    @FilterHandler(name = "toURL")
    public static String toURL(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("1ee5bebb", new Object[]{str}) : Uri.parse(str).toString();
    }

    @FilterHandler(name = "urlEncode")
    public static String urlEncode(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9986362a", new Object[]{str}) : !StringUtils.isEmpty(str) ? Uri.encode(str) : "";
    }

    @FilterHandler(name = ErrorCode.DATA_URL_DECODE_EXCEPTION)
    public static String urlDecode(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("2495bf52", new Object[]{str}) : !StringUtils.isEmpty(str) ? Uri.decode(str) : "";
    }

    @FilterHandler(name = "appendString")
    public static String appendString(String str, String str2) {
        String[] split;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("841e227a", new Object[]{str, str2});
        }
        if (StringUtils.isEmpty(str2) || StringUtils.isEmpty(str)) {
            return str;
        }
        String[] split2 = str2.split("&");
        HashMap hashMap = new HashMap();
        for (int i = 0; i < split2.length; i++) {
            if (!StringUtils.isEmpty(split2[i]) && (split = split2[i].split("=")) != null && split.length == 2 && !StringUtils.isEmpty(split[0]) && !StringUtils.isEmpty(split[1])) {
                hashMap.put(split[0], split[1]);
            }
        }
        return ohk.a(str, hashMap);
    }

    @FilterHandler(name = "appendData")
    public static String appendData(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bfc3ceaf", new Object[]{str, obj});
        }
        if (obj == null || StringUtils.isEmpty(str)) {
            return str;
        }
        if (obj instanceof String) {
            return appendString(str, obj.toString());
        }
        return obj instanceof Map ? ohk.a(str, (Map) obj) : str;
    }

    @FilterHandler(name = "unescapeHTML")
    public static String unescapeHTML(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d736a78a", new Object[]{str}) : !StringUtils.isEmpty(str) ? a(str) : "";
    }

    private static String a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str}) : str != null ? str.replace("&amp;", "&").replace("&lt;", "<").replace("&gt;", ">").replace("&apos;", "'").replace("&quot;", "\"") : str;
    }

    @FilterHandler(name = "escapeXMLCharactor")
    public static String escapeXMLCharactor(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("89582ce6", new Object[]{str}) : !StringUtils.isEmpty(str) ? b(str) : "";
    }

    private static String b(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6111438d", new Object[]{str}) : str != null ? str.replace("&", "&amp;").replace("<", "&lt;").replace(">", "&gt;").replace("'", "&apos;").replace("\"", "&quot;") : str;
    }

    @FilterHandler(name = com.taobao.android.weex_framework.util.a.ATOM_EXT_substring)
    public static CharSequence subString(CharSequence charSequence, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CharSequence) ipChange.ipc$dispatch("74fa97be", new Object[]{charSequence, new Integer(i), new Integer(i2)});
        }
        if (charSequence == null) {
            return null;
        }
        return charSequence.subSequence(i, Math.min(charSequence.length(), i2));
    }

    @FilterHandler(name = "split")
    public static List<String> split(String str, String str2) {
        String[] split;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("844da672", new Object[]{str, str2});
        }
        if (str != null && (split = str.split(str2)) != null) {
            return Arrays.asList(split);
        }
        return null;
    }

    public static Object a(String str, List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("f1cf6c6f", new Object[]{str, list});
        }
        char c = 65535;
        try {
            switch (str.hashCode()) {
                case -2139875868:
                    if (str.equals("appendData")) {
                        c = 23;
                        break;
                    }
                    break;
                case -1464939364:
                    if (str.equals(com.taobao.android.weex_framework.util.a.ATOM_EXT_toLocaleLowerCase)) {
                        c = '\t';
                        break;
                    }
                    break;
                case -1361633751:
                    if (str.equals(com.taobao.android.weex_framework.util.a.ATOM_EXT_charAt)) {
                        c = 2;
                        break;
                    }
                    break;
                case -1354795244:
                    if (str.equals("concat")) {
                        c = 3;
                        break;
                    }
                    break;
                case -1137582698:
                    if (str.equals(com.taobao.android.weex_framework.util.a.ATOM_EXT_toLowerCase)) {
                        c = 11;
                        break;
                    }
                    break;
                case -1106363674:
                    if (str.equals(com.taobao.android.weex_framework.util.a.ATOM_length)) {
                        c = '\r';
                        break;
                    }
                    break;
                case -1059749345:
                    if (str.equals("trimAll")) {
                        c = 16;
                        break;
                    }
                    break;
                case -998714071:
                    if (str.equals("escapeXMLCharactor")) {
                        c = 25;
                        break;
                    }
                    break;
                case -906336856:
                    if (str.equals("search")) {
                        c = '\b';
                        break;
                    }
                    break;
                case -797625283:
                    if (str.equals(ErrorCode.DATA_URL_DECODE_EXCEPTION)) {
                        c = 21;
                        break;
                    }
                    break;
                case -760684443:
                    if (str.equals("urlEncode")) {
                        c = 20;
                        break;
                    }
                    break;
                case -726908483:
                    if (str.equals(com.taobao.android.weex_framework.util.a.ATOM_EXT_toLocaleUpperCase)) {
                        c = '\n';
                        break;
                    }
                    break;
                case -467511597:
                    if (str.equals(com.taobao.android.weex_framework.util.a.ATOM_EXT_lastIndexOf)) {
                        c = 5;
                        break;
                    }
                    break;
                case -432138768:
                    if (str.equals("isLetter")) {
                        c = 0;
                        break;
                    }
                    break;
                case -399551817:
                    if (str.equals(com.taobao.android.weex_framework.util.a.ATOM_EXT_toUpperCase)) {
                        c = '\f';
                        break;
                    }
                    break;
                case -217951781:
                    if (str.equals("isString")) {
                        c = 1;
                        break;
                    }
                    break;
                case 3568674:
                    if (str.equals("trim")) {
                        c = 15;
                        break;
                    }
                    break;
                case 103668165:
                    if (str.equals(com.taobao.android.weex_framework.util.a.ATOM_EXT_match)) {
                        c = 6;
                        break;
                    }
                    break;
                case 109648666:
                    if (str.equals("split")) {
                        c = 27;
                        break;
                    }
                    break;
                case 110519540:
                    if (str.equals("toURL")) {
                        c = 19;
                        break;
                    }
                    break;
                case 530542161:
                    if (str.equals(com.taobao.android.weex_framework.util.a.ATOM_EXT_substring)) {
                        c = JSONLexer.EOI;
                        break;
                    }
                    break;
                case 759061892:
                    if (str.equals("isNotEmpty")) {
                        c = 18;
                        break;
                    }
                    break;
                case 1094496948:
                    if (str.equals("replace")) {
                        c = 7;
                        break;
                    }
                    break;
                case 1099846370:
                    if (str.equals(com.taobao.android.weex_framework.util.a.ATOM_EXT_reverse)) {
                        c = 14;
                        break;
                    }
                    break;
                case 1315561419:
                    if (str.equals("appendString")) {
                        c = 22;
                        break;
                    }
                    break;
                case 1943291465:
                    if (str.equals(com.taobao.android.weex_framework.util.a.ATOM_EXT_indexOf)) {
                        c = 4;
                        break;
                    }
                    break;
                case 1984805637:
                    if (str.equals("unescapeHTML")) {
                        c = 24;
                        break;
                    }
                    break;
                case 2058039875:
                    if (str.equals("isEmpty")) {
                        c = 17;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    return Boolean.valueOf(isLetter((String) list.get(0)));
                case 1:
                    return Boolean.valueOf(isString(list.get(0)));
                case 2:
                    return Character.valueOf(charAt((String) list.get(0), list.get(1)));
                case 3:
                    return concat(String.valueOf(list.get(0)), String.valueOf(list.get(1)));
                case 4:
                    return Integer.valueOf(indexOf((String) list.get(0), (String) list.get(1)));
                case 5:
                    return Integer.valueOf(lastIndexOf((String) list.get(0), (String) list.get(1)));
                case 6:
                    return Boolean.valueOf(match((String) list.get(0), (String) list.get(1)));
                case 7:
                    return replace((String) list.get(0), (String) list.get(1), (String) list.get(2));
                case '\b':
                    return Integer.valueOf(search((String) list.get(0), (String) list.get(1)));
                case '\t':
                    return toLocaleLowerCase((String) list.get(0));
                case '\n':
                    return toLocaleUpperCase((String) list.get(0));
                case 11:
                    return toLowerCase((String) list.get(0));
                case '\f':
                    return toUpperCase((String) list.get(0));
                case '\r':
                    return Integer.valueOf(length((String) list.get(0)));
                case 14:
                    return reverse((String) list.get(0));
                case 15:
                    return trim((String) list.get(0));
                case 16:
                    return trimAll((String) list.get(0));
                case 17:
                    return Boolean.valueOf(isEmpty(list.get(0)));
                case 18:
                    return Boolean.valueOf(isNotEmpty(list.get(0)));
                case 19:
                    return toURL((String) list.get(0));
                case 20:
                    return urlEncode((String) list.get(0));
                case 21:
                    return urlDecode((String) list.get(0));
                case 22:
                    return appendString((String) list.get(0), (String) list.get(1));
                case 23:
                    return appendData((String) list.get(0), list.get(1));
                case 24:
                    return unescapeHTML((String) list.get(0));
                case 25:
                    return escapeXMLCharactor((String) list.get(0));
                case 26:
                    return subString((CharSequence) list.get(0), ((Integer) list.get(1)).intValue(), ((Integer) list.get(2)).intValue());
                case 27:
                    return split((String) list.get(0), (String) list.get(1));
                default:
                    return "";
            }
        } catch (Throwable th) {
            ogg.a("string.filter", "error:" + str + th.getMessage());
            return "";
        }
    }
}
