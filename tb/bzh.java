package tb;

import java.util.Map;

/* loaded from: classes.dex */
public class bzh {
    static {
        kge.a(1063663744);
    }

    public static String a(Object obj) {
        if (obj != null) {
            if (obj instanceof String) {
                return ((String) obj).toString();
            }
            if (obj instanceof Integer) {
                return "" + ((Integer) obj).intValue();
            } else if (obj instanceof Long) {
                return "" + ((Long) obj).longValue();
            } else if (obj instanceof Double) {
                return "" + ((Double) obj).doubleValue();
            } else if (obj instanceof Float) {
                return "" + ((Float) obj).floatValue();
            } else if (obj instanceof Short) {
                return "" + ((int) ((Short) obj).shortValue());
            } else if (!(obj instanceof Byte)) {
                return obj instanceof Boolean ? ((Boolean) obj).toString() : obj instanceof Character ? ((Character) obj).toString() : obj.toString();
            } else {
                return "" + ((int) ((Byte) obj).byteValue());
            }
        }
        return "";
    }

    public static String a(String str, String str2) {
        return a((CharSequence) str) ? str2 : str;
    }

    public static String a(Map<String, String> map) {
        if (map != null) {
            boolean z = true;
            StringBuffer stringBuffer = new StringBuffer();
            for (String str : map.keySet()) {
                String str2 = map.get(str);
                if (str2 != null && str != null) {
                    if (z) {
                        if (!"--invalid--".equals(str2)) {
                            stringBuffer.append(str + "=" + str2);
                        } else {
                            stringBuffer.append(str);
                        }
                        z = false;
                    } else {
                        if (!"--invalid--".equals(str2)) {
                            stringBuffer.append(",");
                            str = str + "=" + str2;
                        } else {
                            stringBuffer.append(",");
                        }
                        stringBuffer.append(str);
                    }
                }
            }
            return stringBuffer.toString();
        }
        return null;
    }

    public static boolean a(CharSequence charSequence) {
        int length;
        if (charSequence != null && (length = charSequence.length()) != 0) {
            for (int i = 0; i < length; i++) {
                if (!Character.isWhitespace(charSequence.charAt(i))) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean a(String str) {
        return str == null || str.length() <= 0;
    }

    public static boolean b(CharSequence charSequence) {
        return !a(charSequence);
    }
}
