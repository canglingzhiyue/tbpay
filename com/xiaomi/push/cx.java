package com.xiaomi.push;

import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.util.Iterator;
import java.util.LinkedList;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes9.dex */
class cx implements Comparable<cx> {

    /* renamed from: a  reason: collision with root package name */
    protected int f24410a;

    /* renamed from: a  reason: collision with other field name */
    private long f193a;

    /* renamed from: a  reason: collision with other field name */
    String f194a;

    /* renamed from: a  reason: collision with other field name */
    private final LinkedList<cn> f195a;

    public cx() {
        this(null, 0);
    }

    public cx(String str) {
        this(str, 0);
    }

    public cx(String str, int i) {
        this.f195a = new LinkedList<>();
        this.f193a = 0L;
        this.f194a = str;
        this.f24410a = i;
    }

    @Override // java.lang.Comparable
    /* renamed from: a */
    public int compareTo(cx cxVar) {
        if (cxVar == null) {
            return 1;
        }
        return cxVar.f24410a - this.f24410a;
    }

    public synchronized cx a(JSONObject jSONObject) {
        this.f193a = jSONObject.getLong(PushConstants.PUSH_NOTIFICATION_CREATE_TIMES_TAMP);
        this.f24410a = jSONObject.getInt("wt");
        this.f194a = jSONObject.getString("host");
        JSONArray jSONArray = jSONObject.getJSONArray("ah");
        for (int i = 0; i < jSONArray.length(); i++) {
            this.f195a.add(new cn().a(jSONArray.getJSONObject(i)));
        }
        return this;
    }

    public synchronized JSONObject a() {
        JSONObject jSONObject;
        jSONObject = new JSONObject();
        jSONObject.put(PushConstants.PUSH_NOTIFICATION_CREATE_TIMES_TAMP, this.f193a);
        jSONObject.put("wt", this.f24410a);
        jSONObject.put("host", this.f194a);
        JSONArray jSONArray = new JSONArray();
        Iterator<cn> it = this.f195a.iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next().m1779a());
        }
        jSONObject.put("ah", jSONArray);
        return jSONObject;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public synchronized void a(cn cnVar) {
        if (cnVar != null) {
            this.f195a.add(cnVar);
            int a2 = cnVar.a();
            if (a2 > 0) {
                this.f24410a += cnVar.a();
            } else {
                int i = 0;
                for (int size = this.f195a.size() - 1; size >= 0 && this.f195a.get(size).a() < 0; size--) {
                    i++;
                }
                this.f24410a += a2 * i;
            }
            if (this.f195a.size() > 30) {
                this.f24410a -= this.f195a.remove().a();
            }
        }
    }

    public String toString() {
        return this.f194a + ":" + this.f24410a;
    }
}
