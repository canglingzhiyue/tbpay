package com.xiaomi.push;

import android.text.TextUtils;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public class co {

    /* renamed from: a  reason: collision with other field name */
    private long f175a;

    /* renamed from: a  reason: collision with other field name */
    public String f176a;

    /* renamed from: b  reason: collision with other field name */
    public String f178b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    protected String h;
    private String i;

    /* renamed from: a  reason: collision with other field name */
    private ArrayList<cx> f177a = new ArrayList<>();

    /* renamed from: a  reason: collision with root package name */
    private double f24403a = 0.1d;
    private String j = "s.mi1.cc";
    private long b = 86400000;

    public co(String str) {
        this.f176a = "";
        if (!TextUtils.isEmpty(str)) {
            this.f175a = System.currentTimeMillis();
            this.f177a.add(new cx(str, -1));
            this.f176a = cs.m1789a();
            this.f178b = str;
            return;
        }
        throw new IllegalArgumentException("the host is empty");
    }

    private synchronized void c(String str) {
        Iterator<cx> it = this.f177a.iterator();
        while (it.hasNext()) {
            if (TextUtils.equals(it.next().f194a, str)) {
                it.remove();
            }
        }
    }

    public synchronized co a(JSONObject jSONObject) {
        this.f176a = jSONObject.optString("net");
        this.b = jSONObject.getLong(RemoteMessageConst.TTL);
        this.f24403a = jSONObject.getDouble("pct");
        this.f175a = jSONObject.getLong("ts");
        this.d = jSONObject.optString("city");
        this.c = jSONObject.optString("prv");
        this.g = jSONObject.optString("cty");
        this.e = jSONObject.optString("isp");
        this.f = jSONObject.optString(com.network.diagnosis.c.IP);
        this.f178b = jSONObject.optString("host");
        this.h = jSONObject.optString("xf");
        JSONArray jSONArray = jSONObject.getJSONArray("fbs");
        for (int i = 0; i < jSONArray.length(); i++) {
            a(new cx().a(jSONArray.getJSONObject(i)));
        }
        return this;
    }

    public synchronized String a() {
        if (!TextUtils.isEmpty(this.i)) {
            return this.i;
        } else if (TextUtils.isEmpty(this.e)) {
            return "hardcode_isp";
        } else {
            this.i = bm.a(new String[]{this.e, this.c, this.d, this.g, this.f}, "_");
            return this.i;
        }
    }

    /* renamed from: a  reason: collision with other method in class */
    public synchronized ArrayList<String> m1780a() {
        return a(false);
    }

    public ArrayList<String> a(String str) {
        if (!TextUtils.isEmpty(str)) {
            URL url = new URL(str);
            if (!TextUtils.equals(url.getHost(), this.f178b)) {
                throw new IllegalArgumentException("the url is not supported by the fallback");
            }
            ArrayList<String> arrayList = new ArrayList<>();
            Iterator<String> it = a(true).iterator();
            while (it.hasNext()) {
                cq a2 = cq.a(it.next(), url.getPort());
                arrayList.add(new URL(url.getProtocol(), a2.m1788a(), a2.a(), url.getFile()).toString());
            }
            return arrayList;
        }
        throw new IllegalArgumentException("the url is empty.");
    }

    public synchronized ArrayList<String> a(boolean z) {
        ArrayList<String> arrayList;
        String substring;
        cx[] cxVarArr = new cx[this.f177a.size()];
        this.f177a.toArray(cxVarArr);
        Arrays.sort(cxVarArr);
        arrayList = new ArrayList<>();
        for (cx cxVar : cxVarArr) {
            if (z) {
                substring = cxVar.f194a;
            } else {
                int indexOf = cxVar.f194a.indexOf(":");
                substring = indexOf != -1 ? cxVar.f194a.substring(0, indexOf) : cxVar.f194a;
            }
            arrayList.add(substring);
        }
        return arrayList;
    }

    /* renamed from: a  reason: collision with other method in class */
    public synchronized JSONObject m1781a() {
        JSONObject jSONObject;
        jSONObject = new JSONObject();
        jSONObject.put("net", this.f176a);
        jSONObject.put(RemoteMessageConst.TTL, this.b);
        jSONObject.put("pct", this.f24403a);
        jSONObject.put("ts", this.f175a);
        jSONObject.put("city", this.d);
        jSONObject.put("prv", this.c);
        jSONObject.put("cty", this.g);
        jSONObject.put("isp", this.e);
        jSONObject.put(com.network.diagnosis.c.IP, this.f);
        jSONObject.put("host", this.f178b);
        jSONObject.put("xf", this.h);
        JSONArray jSONArray = new JSONArray();
        Iterator<cx> it = this.f177a.iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next().a());
        }
        jSONObject.put("fbs", jSONArray);
        return jSONObject;
    }

    public void a(double d) {
        this.f24403a = d;
    }

    public void a(long j) {
        if (j > 0) {
            this.b = j;
            return;
        }
        throw new IllegalArgumentException("the duration is invalid " + j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void a(cx cxVar) {
        c(cxVar.f194a);
        this.f177a.add(cxVar);
    }

    /* renamed from: a  reason: collision with other method in class */
    public synchronized void m1782a(String str) {
        a(new cx(str));
    }

    public void a(String str, int i, long j, long j2, Exception exc) {
        a(str, new cn(i, j, j2, exc));
    }

    public void a(String str, long j, long j2) {
        try {
            b(new URL(str).getHost(), j, j2);
        } catch (MalformedURLException unused) {
        }
    }

    public void a(String str, long j, long j2, Exception exc) {
        try {
            b(new URL(str).getHost(), j, j2, exc);
        } catch (MalformedURLException unused) {
        }
    }

    public synchronized void a(String str, cn cnVar) {
        Iterator<cx> it = this.f177a.iterator();
        while (it.hasNext()) {
            cx next = it.next();
            if (TextUtils.equals(str, next.f194a)) {
                next.a(cnVar);
                return;
            }
        }
    }

    public synchronized void a(String[] strArr) {
        int i;
        int size = this.f177a.size() - 1;
        while (true) {
            i = 0;
            if (size < 0) {
                break;
            }
            int length = strArr.length;
            while (true) {
                if (i < length) {
                    if (TextUtils.equals(this.f177a.get(size).f194a, strArr[i])) {
                        this.f177a.remove(size);
                        break;
                    }
                    i++;
                }
            }
            size--;
        }
        Iterator<cx> it = this.f177a.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            cx next = it.next();
            if (next.f24410a > i2) {
                i2 = next.f24410a;
            }
        }
        while (i < strArr.length) {
            a(new cx(strArr[i], (strArr.length + i2) - i));
            i++;
        }
    }

    /* renamed from: a  reason: collision with other method in class */
    public boolean m1783a() {
        return TextUtils.equals(this.f176a, cs.m1789a());
    }

    public boolean a(co coVar) {
        return TextUtils.equals(this.f176a, coVar.f176a);
    }

    public void b(String str) {
        this.j = str;
    }

    public void b(String str, long j, long j2) {
        a(str, 0, j, j2, null);
    }

    public void b(String str, long j, long j2, Exception exc) {
        a(str, -1, j, j2, exc);
    }

    public boolean b() {
        return System.currentTimeMillis() - this.f175a < this.b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean c() {
        long j = this.b;
        if (864000000 >= j) {
            j = 864000000;
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j2 = this.f175a;
        if (currentTimeMillis - j2 <= j) {
            return currentTimeMillis - j2 > this.b && this.f176a.startsWith("WIFI-");
        }
        return true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f176a);
        sb.append("\n");
        sb.append(a());
        Iterator<cx> it = this.f177a.iterator();
        while (it.hasNext()) {
            sb.append("\n");
            sb.append(it.next().toString());
        }
        sb.append("\n");
        return sb.toString();
    }
}
