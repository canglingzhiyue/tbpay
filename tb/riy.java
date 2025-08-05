package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.util.a;
import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import tb.mto;

/* loaded from: classes9.dex */
public class riy {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String AND = "&&";
    public static final String AND_NOT = "!";
    public static final char ARRAY_END = ']';
    public static final String ARRAY_END_STR = "]";
    public static final char ARRAY_SEPRATOR = ',';
    public static final String ARRAY_SEPRATOR_STR = ",";
    public static final char ARRAY_START = '[';
    public static final String ARRAY_START_STR = "[";
    public static final char BLOCK_END = '}';
    public static final String BLOCK_END_STR = "}";
    public static final char BLOCK_START = '{';
    public static final String BLOCK_START_STR = "{";
    public static final char BRACKET_END = ')';
    public static final String BRACKET_END_STR = ")";
    public static final char BRACKET_START = '(';
    public static final String BRACKET_START_STR = "(";
    public static final char CONDITION_IF = '?';
    public static final char CONDITION_IF_MIDDLE = ':';
    public static final String CONDITION_IF_STRING = "?";
    public static final String DIV = "/";
    public static final char DOLLAR = '$';
    public static final String DOLLAR_STR = "$";
    public static final char DOT = '.';
    public static final String DOT_STR = ".";
    public static final String EQUAL = "===";
    public static final String EQUAL2 = "==";
    public static final String G = ">";
    public static final String GE = ">=";
    public static final Map<String, Object> KEYWORDS;
    public static final String L = "<";
    public static final String LE = "<=";
    public static final String MOD = "%";
    public static final String MUL = "*";
    public static final String NOT_EQUAL = "!==";
    public static final String NOT_EQUAL2 = "!=";
    public static final String OR = "||";
    public static final String PLUS = "+";
    public static final char QUOTE = '\"';
    public static final char SINGLE_QUOTE = '\'';
    public static final char SPACE = ' ';
    public static final String SPACE_STR = " ";
    public static final String SUB = "-";

    /* renamed from: a  reason: collision with root package name */
    public static Map<String, Integer> f33176a;

    public static boolean a(char c) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a8217d19", new Object[]{new Character(c)})).booleanValue() : c == ')' || c == ']' || c == ' ' || c == ',';
    }

    public static Object a(rjb rjbVar, rjb rjbVar2, Object obj) {
        Object a2;
        Object a3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("2475de2", new Object[]{rjbVar, rjbVar2, obj});
        }
        if (rjbVar == null || rjbVar2 == null || (a2 = rjbVar.a(obj)) == null) {
            return null;
        }
        if (rjbVar2.b() != 0) {
            Object a4 = rjbVar2.a(obj);
            if (a4 instanceof Double) {
                a4 = Integer.valueOf(((Double) a4).intValue());
            }
            a3 = a(a2, a4 == null ? "" : a4.toString().trim());
        } else {
            a3 = rjbVar2.a(a2);
        }
        return a3 != null ? a3 : b(a2, rjbVar2.a());
    }

    public static Object a(Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("a12221e4", new Object[]{obj, str});
        }
        if (obj == null) {
            return null;
        }
        if (obj instanceof riv) {
            riv rivVar = (riv) obj;
            for (int a2 = rivVar.a() - 1; a2 >= 0; a2--) {
                Object a3 = rivVar.a(a2);
                if (a3 instanceof Map) {
                    Map map = (Map) a3;
                    if (map.containsKey(str)) {
                        return map.get(str);
                    }
                }
            }
        }
        if (obj instanceof Stack) {
            Stack stack = (Stack) obj;
            for (int size = stack.size() - 1; size >= 0; size--) {
                Object obj2 = stack.get(size);
                if (obj2 instanceof Map) {
                    Map map2 = (Map) obj2;
                    if (map2.containsKey(str)) {
                        return map2.get(str);
                    }
                }
            }
        }
        if (obj instanceof Map) {
            return ((Map) obj).get(str);
        }
        if (obj instanceof List) {
            try {
                return ((List) obj).get(Integer.parseInt(str));
            } catch (Exception unused) {
            }
        }
        if (obj.getClass().isArray()) {
            try {
                return Array.get(obj, Integer.parseInt(str));
            } catch (Exception unused2) {
            }
        }
        return null;
    }

    public static Object b(Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("2e0f3903", new Object[]{obj, str});
        }
        if (!a.ATOM_length.equals(str)) {
            return null;
        }
        if (obj instanceof CharSequence) {
            return Integer.valueOf(((CharSequence) obj).length());
        }
        boolean z = obj instanceof Map;
        if (z) {
            return Integer.valueOf(((Map) obj).size());
        }
        if (z) {
            return Integer.valueOf(((Map) obj).size());
        }
        if (obj instanceof List) {
            return Integer.valueOf(((List) obj).size());
        }
        if (!obj.getClass().isArray()) {
            return null;
        }
        return Integer.valueOf(Array.getLength(obj));
    }

    public static Object b(rjb rjbVar, rjb rjbVar2, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("37db0c1", new Object[]{rjbVar, rjbVar2, obj});
        }
        Object a2 = rjbVar != null ? rjbVar.a(obj) : null;
        Object a3 = rjbVar2 != null ? rjbVar2.a(obj) : null;
        String str = "";
        if ((a2 instanceof CharSequence) || (a3 instanceof CharSequence)) {
            if (a2 == null) {
                return a3;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(a2.toString());
            if (a3 != null) {
                str = a3.toString();
            }
            sb.append(str);
            return sb.toString();
        } else if ((a2 instanceof Number) || (a3 instanceof Number)) {
            return Double.valueOf(b(a2) + b(a3));
        } else {
            if (a2 == null && a3 == null) {
                return null;
            }
            if (a2 == null) {
                return a3.toString();
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(a2.toString());
            if (a3 != null) {
                str = a3.toString();
            }
            sb2.append(str);
            return sb2.toString();
        }
    }

    public static Object c(rjb rjbVar, rjb rjbVar2, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("4b403a0", new Object[]{rjbVar, rjbVar2, obj});
        }
        Object obj2 = null;
        Object a2 = rjbVar != null ? rjbVar.a(obj) : null;
        if (rjbVar2 != null) {
            obj2 = rjbVar2.a(obj);
        }
        return Double.valueOf(b(a2) - b(obj2));
    }

    public static Object d(rjb rjbVar, rjb rjbVar2, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("5ea567f", new Object[]{rjbVar, rjbVar2, obj});
        }
        Object obj2 = null;
        Object a2 = rjbVar != null ? rjbVar.a(obj) : null;
        if (rjbVar2 != null) {
            obj2 = rjbVar2.a(obj);
        }
        return Double.valueOf(b(a2) / b(obj2));
    }

    public static Object e(rjb rjbVar, rjb rjbVar2, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("720a95e", new Object[]{rjbVar, rjbVar2, obj});
        }
        Object obj2 = null;
        Object a2 = rjbVar != null ? rjbVar.a(obj) : null;
        if (rjbVar2 != null) {
            obj2 = rjbVar2.a(obj);
        }
        return Double.valueOf(b(a2) * b(obj2));
    }

    public static Object f(rjb rjbVar, rjb rjbVar2, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("856fc3d", new Object[]{rjbVar, rjbVar2, obj});
        }
        Object obj2 = null;
        Object a2 = rjbVar != null ? rjbVar.a(obj) : null;
        if (rjbVar2 != null) {
            obj2 = rjbVar2.a(obj);
        }
        return Double.valueOf(b(a2) % b(obj2));
    }

    public static Object a(rjb rjbVar, rjb rjbVar2, rjb rjbVar3, Object obj) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("48591b1c", new Object[]{rjbVar, rjbVar2, rjbVar3, obj});
        }
        if (rjbVar != null) {
            z = a(rjbVar.a(obj));
        }
        if (z) {
            if (rjbVar2 == null) {
                return null;
            }
            return rjbVar2.a(obj);
        } else if (rjbVar3 == null) {
            return null;
        } else {
            return rjbVar3.a(obj);
        }
    }

    public static boolean a(rjb rjbVar, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ada95dce", new Object[]{rjbVar, obj})).booleanValue();
        }
        if (rjbVar != null) {
            return a(rjbVar.a(obj));
        }
        return false;
    }

    public static double b(rjb rjbVar, Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("c29225f9", new Object[]{rjbVar, obj})).doubleValue() : rjbVar == null ? mto.a.GEO_NOT_SUPPORT : b(rjbVar.a(obj));
    }

    public static boolean g(rjb rjbVar, rjb rjbVar2, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4f8a8eda", new Object[]{rjbVar, rjbVar2, obj})).booleanValue();
        }
        if (rjbVar == null && rjbVar2 == null) {
            return true;
        }
        Object obj2 = null;
        Object a2 = rjbVar != null ? rjbVar.a(obj) : null;
        if (rjbVar2 != null) {
            obj2 = rjbVar2.a(obj);
        }
        if (a2 == null) {
            if (obj2 == null) {
                return true;
            }
            return (obj2 instanceof CharSequence) && a(obj2.toString());
        } else if (obj2 == null) {
            return a(a2.toString());
        } else if (a2 instanceof Number) {
            return obj2 instanceof Number ? ((Number) a2).doubleValue() == ((Number) obj2).doubleValue() : ((Number) a2).doubleValue() == b(obj2);
        } else if (obj2 instanceof Number) {
            return b(a2) == ((Number) obj2).doubleValue();
        } else if ((a2 instanceof CharSequence) || (obj2 instanceof CharSequence)) {
            return a2.toString().trim().equals(obj2.toString().trim());
        } else {
            return a2.equals(obj2);
        }
    }

    public static boolean a(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a6251248", new Object[]{obj})).booleanValue();
        }
        if (obj == null) {
            return false;
        }
        if (obj instanceof Number) {
            return ((Number) obj).doubleValue() != mto.a.GEO_NOT_SUPPORT;
        }
        String trim = obj.toString().trim();
        return !"false".equals(trim) && !"undefined".equals(trim) && !"null".equals(trim) && !a(trim);
    }

    public static boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{str})).booleanValue();
        }
        if (str == null) {
            return true;
        }
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                return false;
            }
        }
        return true;
    }

    public static double b(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f056ab73", new Object[]{obj})).doubleValue();
        }
        if (obj == null) {
            return mto.a.GEO_NOT_SUPPORT;
        }
        if (obj instanceof Number) {
            return ((Number) obj).doubleValue();
        }
        try {
            return Double.parseDouble(obj.toString());
        } catch (Exception unused) {
            return mto.a.GEO_NOT_SUPPORT;
        }
    }

    public static boolean b(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3dd7e577", new Object[]{str})).booleanValue() : a(str.charAt(0));
    }

    public static boolean c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("88097eb8", new Object[]{str})).booleanValue();
        }
        char charAt = str.charAt(0);
        return charAt == '.' || charAt == '[';
    }

    static {
        kge.a(-2137288794);
        HashMap hashMap = new HashMap();
        f33176a = hashMap;
        hashMap.put(BLOCK_END_STR, 0);
        f33176a.put(BRACKET_END_STR, 0);
        f33176a.put(" ", 0);
        f33176a.put(",", 0);
        f33176a.put(ARRAY_END_STR, 0);
        f33176a.put("||", 1);
        f33176a.put("&&", 1);
        f33176a.put(EQUAL, 2);
        f33176a.put("==", 2);
        f33176a.put(NOT_EQUAL, 2);
        f33176a.put("!=", 2);
        f33176a.put(">", 7);
        f33176a.put(">=", 7);
        f33176a.put("<", 7);
        f33176a.put("<=", 8);
        f33176a.put(PLUS, 9);
        f33176a.put("-", 9);
        f33176a.put("*", 10);
        f33176a.put("/", 10);
        f33176a.put(MOD, 10);
        f33176a.put(AND_NOT, 11);
        f33176a.put(".", 15);
        f33176a.put(ARRAY_START_STR, 16);
        f33176a.put(BRACKET_START_STR, 17);
        f33176a.put(BLOCK_START_STR, 17);
        HashMap hashMap2 = new HashMap();
        KEYWORDS = hashMap2;
        hashMap2.put("null", null);
        KEYWORDS.put("true", Boolean.TRUE);
        KEYWORDS.put("false", Boolean.FALSE);
        KEYWORDS.put("undefined", null);
    }
}
