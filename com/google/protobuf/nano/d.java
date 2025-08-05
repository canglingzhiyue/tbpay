package com.google.protobuf.nano;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import mtopsdk.network.impl.ResponseProtocolType;

/* loaded from: classes4.dex */
public final class d {
    public static <T extends MessageNano> String a(T t) {
        StringBuilder sb;
        String message;
        if (t == null) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer();
        try {
            a(null, t, new StringBuffer(), stringBuffer);
            return stringBuffer.toString();
        } catch (IllegalAccessException e) {
            sb = new StringBuilder();
            sb.append("Error printing proto: ");
            message = e.getMessage();
            sb.append(message);
            return sb.toString();
        } catch (InvocationTargetException e2) {
            sb = new StringBuilder();
            sb.append("Error printing proto: ");
            message = e2.getMessage();
            sb.append(message);
            return sb.toString();
        }
    }

    private static String a(String str) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (i != 0) {
                if (Character.isUpperCase(charAt)) {
                    stringBuffer.append('_');
                }
                stringBuffer.append(charAt);
            }
            charAt = Character.toLowerCase(charAt);
            stringBuffer.append(charAt);
        }
        return stringBuffer.toString();
    }

    private static void a(String str, Object obj, StringBuffer stringBuffer, StringBuffer stringBuffer2) throws IllegalAccessException, InvocationTargetException {
        Field[] fields;
        if (obj != null) {
            if (!(obj instanceof MessageNano)) {
                if (!(obj instanceof Map)) {
                    String a2 = a(str);
                    stringBuffer2.append(stringBuffer);
                    stringBuffer2.append(a2);
                    stringBuffer2.append(ResponseProtocolType.COMMENT);
                    if (obj instanceof String) {
                        String b = b((String) obj);
                        stringBuffer2.append("\"");
                        stringBuffer2.append(b);
                        stringBuffer2.append("\"");
                    } else if (obj instanceof byte[]) {
                        a((byte[]) obj, stringBuffer2);
                    } else {
                        stringBuffer2.append(obj);
                    }
                    stringBuffer2.append("\n");
                    return;
                }
                String a3 = a(str);
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    stringBuffer2.append(stringBuffer);
                    stringBuffer2.append(a3);
                    stringBuffer2.append(" <\n");
                    int length = stringBuffer.length();
                    stringBuffer.append("  ");
                    a("key", entry.getKey(), stringBuffer, stringBuffer2);
                    a("value", entry.getValue(), stringBuffer, stringBuffer2);
                    stringBuffer.setLength(length);
                    stringBuffer2.append(stringBuffer);
                    stringBuffer2.append(">\n");
                }
                return;
            }
            int length2 = stringBuffer.length();
            if (str != null) {
                stringBuffer2.append(stringBuffer);
                stringBuffer2.append(a(str));
                stringBuffer2.append(" <\n");
                stringBuffer.append("  ");
            }
            Class<?> cls = obj.getClass();
            for (Field field : cls.getFields()) {
                int modifiers = field.getModifiers();
                String name = field.getName();
                if (!"cachedSize".equals(name) && (modifiers & 1) == 1 && (modifiers & 8) != 8 && !name.startsWith("_") && !name.endsWith("_")) {
                    Class<?> type = field.getType();
                    Object obj2 = field.get(obj);
                    if (!type.isArray() || type.getComponentType() == Byte.TYPE) {
                        a(name, obj2, stringBuffer, stringBuffer2);
                    } else {
                        int length3 = obj2 == null ? 0 : Array.getLength(obj2);
                        for (int i = 0; i < length3; i++) {
                            a(name, Array.get(obj2, i), stringBuffer, stringBuffer2);
                        }
                    }
                }
            }
            for (Method method : cls.getMethods()) {
                String name2 = method.getName();
                if (name2.startsWith("set")) {
                    String substring = name2.substring(3);
                    try {
                        if (((Boolean) cls.getMethod(com.taobao.android.weex_framework.util.a.ATOM_has + substring, new Class[0]).invoke(obj, new Object[0])).booleanValue()) {
                            a(substring, cls.getMethod("get" + substring, new Class[0]).invoke(obj, new Object[0]), stringBuffer, stringBuffer2);
                        }
                    } catch (NoSuchMethodException unused) {
                    }
                }
            }
            if (str == null) {
                return;
            }
            stringBuffer.setLength(length2);
            stringBuffer2.append(stringBuffer);
            stringBuffer2.append(">\n");
        }
    }

    private static void a(byte[] bArr, StringBuffer stringBuffer) {
        if (bArr == null) {
            stringBuffer.append("\"\"");
            return;
        }
        stringBuffer.append('\"');
        for (byte b : bArr) {
            int i = b & 255;
            if (i == 92 || i == 34) {
                stringBuffer.append('\\');
            } else if (i < 32 || i >= 127) {
                stringBuffer.append(String.format("\\%03o", Integer.valueOf(i)));
            }
            stringBuffer.append((char) i);
        }
        stringBuffer.append('\"');
    }

    private static String b(String str) {
        if (!str.startsWith("http") && str.length() > 200) {
            str = str.substring(0, 200) + "[...]";
        }
        return c(str);
    }

    private static String c(String str) {
        int length = str.length();
        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt < ' ' || charAt > '~' || charAt == '\"' || charAt == '\'') {
                sb.append(String.format("\\u%04x", Integer.valueOf(charAt)));
            } else {
                sb.append(charAt);
            }
        }
        return sb.toString();
    }
}
