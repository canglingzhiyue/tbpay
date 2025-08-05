package org.json.alipay;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import tb.riy;

/* loaded from: classes9.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final Object NULL = new a();

    /* renamed from: a  reason: collision with root package name */
    private Map f25084a;

    /* loaded from: classes9.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public final Object clone() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ipChange.ipc$dispatch("78b3604e", new Object[]{this}) : this;
        }

        public boolean equals(Object obj) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue() : obj == null || obj == this;
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this}) : "null";
        }

        private a() {
        }
    }

    public b() {
        this.f25084a = new HashMap();
    }

    public b(c cVar) throws JSONException {
        this();
        if (cVar.c() == '{') {
            while (true) {
                char c = cVar.c();
                if (c == 0) {
                    throw cVar.a("A JSONObject text must end with '}'");
                }
                if (c == '}') {
                    return;
                }
                cVar.a();
                String obj = cVar.d().toString();
                char c2 = cVar.c();
                if (c2 == '=') {
                    if (cVar.b() != '>') {
                        cVar.a();
                    }
                } else if (c2 != ':') {
                    throw cVar.a("Expected a ':' after a key");
                }
                a(obj, cVar.d());
                char c3 = cVar.c();
                if (c3 != ',' && c3 != ';') {
                    if (c3 != '}') {
                        throw cVar.a("Expected a ',' or '}'");
                    }
                    return;
                } else if (cVar.c() == '}') {
                    return;
                } else {
                    cVar.a();
                }
            }
        } else {
            throw cVar.a("A JSONObject text must begin with '{'");
        }
    }

    public b(Map map) {
        this.f25084a = map == null ? new HashMap() : map;
    }

    public b(String str) throws JSONException {
        this(new c(str));
    }

    public Object a(String str) throws JSONException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("17307540", new Object[]{this, str});
        }
        Object c = c(str);
        if (c != null) {
            return c;
        }
        throw new JSONException("JSONObject[" + d(str) + "] not found.");
    }

    public boolean b(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3dd7e577", new Object[]{this, str})).booleanValue() : this.f25084a.containsKey(str);
    }

    public Iterator a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Iterator) ipChange.ipc$dispatch("88a51a0f", new Object[]{this}) : this.f25084a.keySet().iterator();
    }

    public static String a(Number number) throws JSONException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("616101e6", new Object[]{number});
        }
        if (number == null) {
            throw new JSONException("Null pointer");
        }
        a((Object) number);
        String obj = number.toString();
        if (obj.indexOf(46) <= 0 || obj.indexOf(101) >= 0 || obj.indexOf(69) >= 0) {
            return obj;
        }
        while (obj.endsWith("0")) {
            obj = obj.substring(0, obj.length() - 1);
        }
        return obj.endsWith(".") ? obj.substring(0, obj.length() - 1) : obj;
    }

    public Object c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("c56c56fe", new Object[]{this, str});
        }
        if (str != null) {
            return this.f25084a.get(str);
        }
        return null;
    }

    public b a(String str, Object obj) throws JSONException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("48220ea6", new Object[]{this, str, obj});
        }
        if (str == null) {
            throw new JSONException("Null key.");
        }
        if (obj != null) {
            a(obj);
            this.f25084a.put(str, obj);
        } else {
            e(str);
        }
        return this;
    }

    public static String d(String str) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f4d254b", new Object[]{str});
        }
        if (str == null || str.length() == 0) {
            return "\"\"";
        }
        int length = str.length();
        StringBuffer stringBuffer = new StringBuffer(length + 4);
        stringBuffer.append('\"');
        char c = 0;
        while (i < length) {
            char charAt = str.charAt(i);
            if (charAt == '\f') {
                stringBuffer.append("\\f");
            } else if (charAt != '\r') {
                if (charAt != '\"') {
                    if (charAt == '/') {
                        if (c == '<') {
                            stringBuffer.append('\\');
                        }
                        stringBuffer.append(charAt);
                    } else if (charAt != '\\') {
                        switch (charAt) {
                            case '\b':
                                stringBuffer.append("\\b");
                                continue;
                            case '\t':
                                stringBuffer.append("\\t");
                                continue;
                            case '\n':
                                stringBuffer.append("\\n");
                                continue;
                            default:
                                if (charAt < ' ' || ((charAt >= 128 && charAt < 160) || (charAt >= 8192 && charAt < 8448))) {
                                    String str2 = "000" + Integer.toHexString(charAt);
                                    stringBuffer.append("\\u" + str2.substring(str2.length() - 4));
                                    break;
                                } else {
                                    stringBuffer.append(charAt);
                                    continue;
                                }
                        }
                    }
                }
                stringBuffer.append('\\');
                stringBuffer.append(charAt);
            } else {
                stringBuffer.append("\\r");
            }
            i++;
            c = charAt;
        }
        stringBuffer.append('\"');
        return stringBuffer.toString();
    }

    public Object e(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("73a838bc", new Object[]{this, str}) : this.f25084a.remove(str);
    }

    public static void a(Object obj) throws JSONException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6251244", new Object[]{obj});
        } else if (obj == null) {
        } else {
            if (obj instanceof Double) {
                Double d = (Double) obj;
                if (!d.isInfinite() && !d.isNaN()) {
                    return;
                }
                throw new JSONException("JSON does not allow non-finite numbers.");
            } else if (!(obj instanceof Float)) {
            } else {
                Float f = (Float) obj;
                if (!f.isInfinite() && !f.isNaN()) {
                    return;
                }
                throw new JSONException("JSON does not allow non-finite numbers.");
            }
        }
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        try {
            Iterator a2 = a();
            StringBuffer stringBuffer = new StringBuffer(riy.BLOCK_START_STR);
            while (a2.hasNext()) {
                if (stringBuffer.length() > 1) {
                    stringBuffer.append(',');
                }
                Object next = a2.next();
                stringBuffer.append(d(next.toString()));
                stringBuffer.append(riy.CONDITION_IF_MIDDLE);
                stringBuffer.append(b(this.f25084a.get(next)));
            }
            stringBuffer.append('}');
            return stringBuffer.toString();
        } catch (Exception unused) {
            return null;
        }
    }

    public static String b(Object obj) throws JSONException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e17923bb", new Object[]{obj});
        }
        if (obj == null || obj.equals(null)) {
            return "null";
        }
        if (obj instanceof Number) {
            return a((Number) obj);
        }
        if ((obj instanceof Boolean) || (obj instanceof b) || (obj instanceof org.json.alipay.a)) {
            return obj.toString();
        }
        if (obj instanceof Map) {
            return new b((Map) obj).toString();
        }
        if (obj instanceof Collection) {
            return new org.json.alipay.a((Collection) obj).toString();
        }
        if (obj.getClass().isArray()) {
            return new org.json.alipay.a(obj).toString();
        }
        return d(obj.toString());
    }
}
