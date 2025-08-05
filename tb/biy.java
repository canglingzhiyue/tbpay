package tb;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/* loaded from: classes2.dex */
public class biy {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "ultron.exprParser";

    /* renamed from: a  reason: collision with root package name */
    private static boolean f25935a;

    static {
        kge.a(-41223270);
        f25935a = false;
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : f25935a;
    }

    public static boolean a(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9e1d6464", new Object[]{context})).booleanValue() : f25935a && context != null && TextUtils.equals("com.taobao.android.detail.wrapper.activity.DetailActivity", context.getClass().getName());
    }

    public static boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        if (str.startsWith("@")) {
            return false;
        }
        char charAt = str.charAt(str.indexOf(36) + 1);
        return charAt == '{' || charAt == '[';
    }

    public static boolean a(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8bb65392", new Object[]{str, obj})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        if (obj instanceof JSONObject) {
            return bjc.a(a((JSONObject) obj, null, str));
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:80:0x014f, code lost:
        if (r8 != '}') goto L119;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object a(com.alibaba.fastjson.JSONObject r22, com.alibaba.fastjson.JSONObject r23, java.lang.String r24) {
        /*
            Method dump skipped, instructions count: 568
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.biy.a(com.alibaba.fastjson.JSONObject, com.alibaba.fastjson.JSONObject, java.lang.String):java.lang.Object");
    }

    private static void a(StringBuffer stringBuffer, ArrayList arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef722898", new Object[]{stringBuffer, arrayList});
        } else if (stringBuffer.length() <= 0) {
        } else {
            arrayList.add(stringBuffer.toString());
            stringBuffer.delete(0, stringBuffer.length());
        }
    }

    private static boolean a(Stack<bjc> stack, Stack stack2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3d2af78c", new Object[]{stack, stack2})).booleanValue();
        }
        while (true) {
            if (stack.size() <= 0) {
                break;
            }
            bjc pop = stack.pop();
            if (pop != null) {
                if (!pop.b(stack2)) {
                    stack.push(pop);
                    break;
                }
                stack2 = pop.d(stack2);
                if (stack2 == null) {
                    stack.clear();
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v4 */
    private static Object a(JSONObject jSONObject, List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("facc7fd9", new Object[]{jSONObject, list});
        }
        if (jSONObject == null || list == null || list.isEmpty()) {
            return null;
        }
        for (String str : list) {
            if (jSONObject instanceof JSONObject) {
                jSONObject = jSONObject.get(str);
            } else if (!(jSONObject instanceof JSONArray)) {
                return null;
            } else {
                try {
                    int intValue = Integer.valueOf(str).intValue();
                    if (intValue >= ((JSONArray) jSONObject).size()) {
                        return null;
                    }
                    jSONObject = ((JSONArray) jSONObject).get(intValue);
                } catch (Throwable unused) {
                    return null;
                }
            }
        }
        return jSONObject;
    }

    private static boolean a(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8123ad15", new Object[]{str, new Integer(i)})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        int length = str.length();
        if (i >= length - 1) {
            return true;
        }
        while (i < length) {
            char charAt = str.charAt(i);
            if (charAt != '(' && charAt != ')') {
                return false;
            }
            i++;
        }
        return true;
    }
}
