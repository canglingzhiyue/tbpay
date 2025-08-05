package org.json.alipay;

import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;

/* loaded from: classes9.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private ArrayList f25083a;

    public a() {
        this.f25083a = new ArrayList();
    }

    public a(c cVar) throws JSONException {
        this();
        char c;
        char c2;
        char c3 = cVar.c();
        if (c3 == '[') {
            c = ']';
        } else if (c3 != '(') {
            throw cVar.a("A JSONArray text must start with '['");
        } else {
            c = ')';
        }
        if (cVar.c() == ']') {
            return;
        }
        cVar.a();
        while (true) {
            if (cVar.c() == ',') {
                cVar.a();
                this.f25083a.add(null);
            } else {
                cVar.a();
                this.f25083a.add(cVar.d());
            }
            c2 = cVar.c();
            if (c2 == ')') {
                break;
            } else if (c2 == ',' || c2 == ';') {
                if (cVar.c() == ']') {
                    return;
                }
                cVar.a();
            } else if (c2 != ']') {
                throw cVar.a("Expected a ',' or ']'");
            }
        }
        if (c == c2) {
            return;
        }
        throw cVar.a("Expected a '" + new Character(c) + "'");
    }

    public a(String str) throws JSONException {
        this(new c(str));
    }

    public a(Collection collection) {
        this.f25083a = collection == null ? new ArrayList() : new ArrayList(collection);
    }

    public a(Object obj) throws JSONException {
        this();
        if (obj.getClass().isArray()) {
            int length = Array.getLength(obj);
            for (int i = 0; i < length; i++) {
                a(Array.get(obj, i));
            }
            return;
        }
        throw new JSONException("JSONArray initial value should be a string or collection or array.");
    }

    public Object a(int i) throws JSONException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("9da1ccf7", new Object[]{this, new Integer(i)});
        }
        Object b = b(i);
        if (b != null) {
            return b;
        }
        throw new JSONException("JSONArray[" + i + "] not found.");
    }

    public String a(String str) throws JSONException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, str});
        }
        int a2 = a();
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < a2; i++) {
            if (i > 0) {
                stringBuffer.append(str);
            }
            stringBuffer.append(b.b(this.f25083a.get(i)));
        }
        return stringBuffer.toString();
    }

    public int a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue() : this.f25083a.size();
    }

    public Object b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("e7d36638", new Object[]{this, new Integer(i)});
        }
        if (i >= 0 && i < a()) {
            return this.f25083a.get(i);
        }
        return null;
    }

    public a a(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("8ebecbbd", new Object[]{this, obj});
        }
        this.f25083a.add(obj);
        return this;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        try {
            return '[' + a(",") + ']';
        } catch (Exception unused) {
            return null;
        }
    }
}
