package com.taobao.tao.flexbox.layoutmanager.expression;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import tb.kge;
import tb.ogd;
import tb.ogg;
import tb.riy;

/* loaded from: classes8.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final Pattern f20394a;
    private static final Map<String, Integer> b;
    private List<String> c;
    private String d;
    private Map<String, Object> e;

    static {
        kge.a(-1920556826);
        f20394a = Pattern.compile(">=|<=|!=|==|[-\\+\\*/\\(\\)!><]|~|&&|\\|\\||\\?|:");
        HashMap hashMap = new HashMap();
        b = hashMap;
        hashMap.put(riy.BRACKET_START_STR, 1);
        b.put(riy.BRACKET_END_STR, 1);
        b.put(riy.AND_NOT, 2);
        b.put("*", 3);
        b.put("/", 3);
        b.put(riy.PLUS, 4);
        b.put("-", 4);
        b.put(">", 6);
        b.put(">=", 6);
        b.put("<", 6);
        b.put("<=", 6);
        b.put("==", 7);
        b.put("!=", 7);
        b.put("&&", 11);
        b.put("||", 12);
        b.put("?", 13);
        b.put("?:", 13);
    }

    public a(String str) {
        this(str, null);
    }

    public a(String str, Map<String, Object> map) {
        this.d = str.replace(" ", "");
        this.e = map;
    }

    private List<String> a() {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("627608df", new Object[]{this});
        }
        Matcher matcher = f20394a.matcher(this.d);
        Stack stack = new Stack();
        ArrayList arrayList = new ArrayList();
        while (matcher.find()) {
            String group = matcher.group();
            if (i < matcher.start()) {
                arrayList.add(this.d.substring(i, matcher.start()));
            }
            if (group.equals(riy.BRACKET_START_STR)) {
                stack.push(group);
            } else if (group.equals(riy.BRACKET_END_STR)) {
                while (!stack.isEmpty() && !((String) stack.peek()).equals(riy.BRACKET_START_STR)) {
                    arrayList.add(stack.pop());
                }
                if (!stack.isEmpty() && ((String) stack.peek()).equals(riy.BRACKET_START_STR)) {
                    stack.pop();
                } else {
                    throw new RuntimeException("Invalid expression, miss \"(\" in : " + this.d);
                }
            } else if (group.equals(":")) {
                while (!stack.isEmpty() && !((String) stack.peek()).equals("?")) {
                    arrayList.add(stack.pop());
                }
                if (!stack.isEmpty() && ((String) stack.peek()).equals("?")) {
                    stack.push(((String) stack.pop()) + group);
                } else {
                    throw new RuntimeException("Invalid expression, invalid \":\", miss \"?\" in : " + this.d);
                }
            } else {
                while (!stack.isEmpty() && !((String) stack.peek()).equals(riy.BRACKET_START_STR) && (b((String) stack.peek()) < b(group) || (d((String) stack.peek()) && b((String) stack.peek()) == b(group)))) {
                    arrayList.add(stack.pop());
                }
                stack.push(group);
            }
            i = matcher.end();
        }
        if (i < this.d.length()) {
            String str = this.d;
            arrayList.add(str.substring(i, str.length()));
        }
        while (!stack.isEmpty()) {
            if (((String) stack.peek()).equals(riy.BRACKET_START_STR) || ((String) stack.peek()).equals(riy.BRACKET_END_STR)) {
                throw new RuntimeException("Invalid expression, with unknown \"(\" or \"）\" in : " + this.d);
            } else if (((String) stack.peek()).equals("?") || ((String) stack.peek()).equals(":")) {
                throw new RuntimeException("Invalid expression, with unknown \"(\" or \"）\" in : " + this.d);
            } else {
                arrayList.add(stack.pop());
            }
        }
        return arrayList;
    }

    public synchronized Object a(Object obj) {
        Object obj2;
        Object obj3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("9798556e", new Object[]{this, obj});
        }
        if (this.c == null) {
            this.c = a();
        }
        Stack stack = new Stack();
        for (String str : this.c) {
            if (!c(str)) {
                stack.push(str);
            } else {
                try {
                    if (str.equals(riy.AND_NOT)) {
                        stack.push(c.a(a((String) stack.pop()), str).toString());
                    } else if (str.equals("?:")) {
                        stack.push(c.a(a((String) stack.pop()), a((String) stack.pop()), a((String) stack.pop()), str).toString());
                    } else {
                        try {
                            obj2 = a((String) stack.pop());
                        } catch (EmptyStackException unused) {
                            obj2 = "";
                        }
                        try {
                            obj3 = a((String) stack.pop());
                        } catch (EmptyStackException unused2) {
                            obj3 = "";
                        }
                        if (obj != null) {
                            if (obj3.equals(".")) {
                                obj3 = obj;
                            } else if (obj instanceof JSONObject) {
                                obj3 = ogd.a((JSONObject) obj, obj3.toString());
                            } else {
                                ogg.b("Expression", "expression left is wrong " + obj3);
                            }
                            if (obj3 instanceof String) {
                                String obj4 = obj2.toString();
                                if (obj4.startsWith("'") && obj4.endsWith("'")) {
                                    obj3 = "'" + obj3 + "'";
                                }
                            }
                        }
                        stack.push(c.a(obj3, obj2, str).toString());
                    }
                } catch (EmptyStackException unused3) {
                    throw new RuntimeException("Invalid expression: " + this.d);
                }
            }
        }
        if (stack.size() == 1) {
            return a((String) stack.pop());
        }
        throw new RuntimeException("invalid expression:  '" + this.d + "'");
    }

    public Object b() {
        Object obj;
        Object obj2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("43b9c269", new Object[]{this});
        }
        this.c = a();
        Stack stack = new Stack();
        for (String str : this.c) {
            if (!c(str)) {
                stack.push(str);
            } else {
                try {
                    if (str.equals(riy.AND_NOT)) {
                        stack.push(c.a(a((String) stack.pop()), str).toString());
                    } else if (str.equals("?:")) {
                        stack.push(c.a(a((String) stack.pop()), a((String) stack.pop()), a((String) stack.pop()), str).toString());
                    } else {
                        try {
                            obj = a((String) stack.pop());
                        } catch (EmptyStackException unused) {
                            obj = "";
                        }
                        try {
                            obj2 = a((String) stack.pop());
                        } catch (EmptyStackException unused2) {
                            obj2 = "";
                        }
                        stack.push(c.a(obj2, obj, str).toString());
                    }
                } catch (EmptyStackException unused3) {
                    throw new RuntimeException("Invalid expression: " + this.d);
                }
            }
        }
        if (stack.size() == 1) {
            return a((String) stack.pop());
        }
        throw new RuntimeException("invalid expression:  '" + this.d + "'");
    }

    private Object a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("17307540", new Object[]{this, str});
        }
        try {
            return Float.valueOf(str);
        } catch (NumberFormatException unused) {
            if (str.equalsIgnoreCase("true") || str.equalsIgnoreCase("false")) {
                return Boolean.valueOf(Boolean.parseBoolean(str));
            }
            Map<String, Object> map = this.e;
            if (map == null || !map.containsKey(str)) {
                return str;
            }
            try {
                if (this.e.get(str) != null) {
                    return Float.valueOf(this.e.get(str).toString());
                }
            } catch (NumberFormatException unused2) {
            }
            return this.e.get(str);
        }
    }

    private int b(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("3dd7e566", new Object[]{this, str})).intValue() : b.get(str).intValue();
    }

    private boolean c(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("88097eb8", new Object[]{this, str})).booleanValue() : b.containsKey(str);
    }

    private boolean d(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d23b17f9", new Object[]{this, str})).booleanValue() : !str.equals(riy.AND_NOT) && !str.equals("?:");
    }
}
