package tb;

import android.text.TextUtils;
import android.util.Pair;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.network.diagnosis.c;
import com.taobao.search.common.util.k;
import com.uploader.implement.a;
import com.uploader.implement.d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public class rno implements rny {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public rol f33243a;
    public final String b;
    public final long c;
    public final Pair<String, Integer> d;
    public final d e;
    public final int f = hashCode();
    public final rob g = new rob(null, 0, 0, 0, d(), null, null, null);

    @Override // tb.rny
    public /* synthetic */ rod c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (rod) ipChange.ipc$dispatch("1e6d6ef5", new Object[]{this}) : a();
    }

    public rno(d dVar) throws Exception {
        this.e = dVar;
        this.d = dVar.f24068a.b();
        this.b = dVar.f24068a.j();
        this.c = dVar.f24068a.g();
    }

    public rol a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rol) ipChange.ipc$dispatch("f0a252f", new Object[]{this});
        }
        rol rolVar = this.f33243a;
        if (rolVar != null) {
            return rolVar;
        }
        StringBuilder sb = new StringBuilder(32);
        if (((Integer) this.d.second).intValue() == 443) {
            sb.append(k.HTTPS_PREFIX);
            sb.append((String) this.d.first);
            sb.append(":");
            sb.append(this.d.second);
        } else {
            sb.append(k.HTTP_PREFIX);
            sb.append((String) this.d.first);
        }
        sb.append("/dispatchUpload.api");
        rol rolVar2 = new rol((String) this.d.first, ((Integer) this.d.second).intValue(), sb.toString(), this.b);
        this.f33243a = rolVar2;
        return rolVar2;
    }

    @Override // tb.rny
    public rob b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (rob) ipChange.ipc$dispatch("16bbc958", new Object[]{this}) : this.g;
    }

    @Override // tb.rny
    public Pair<rnz, Integer> a(Map<String, String> map, byte[] bArr, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("3deb344e", new Object[]{this, map, bArr, new Integer(i), new Integer(i2)});
        }
        if (map == null || bArr == null) {
            return new Pair<>(null, 0);
        }
        try {
            return new Pair<>(b(map, bArr, i, i2), Integer.valueOf(i2));
        } catch (Exception e) {
            if (a.a(2)) {
                a.a(2, "DeclareUploadActionRequest", e.toString());
            }
            return new Pair<>(null, -1);
        }
    }

    private rnz b(Map<String, String> map, byte[] bArr, int i, int i2) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rnz) ipChange.ipc$dispatch("cc2e7545", new Object[]{this, map, bArr, new Integer(i), new Integer(i2)});
        }
        if (map.get("x-arup-error-code") != null) {
            return new rns(5, map);
        }
        String str = null;
        if (bArr != null) {
            str = new String(bArr, i, i2);
        }
        map.put("divided_length", Integer.toString(i2));
        return new rns(1, map, a(str));
    }

    private final Map<String, String> d() throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("913cde0", new Object[]{this});
        }
        String str = this.e.b.a().b;
        String utdid = this.e.b.getUtdid();
        String userId = this.e.b.getUserId();
        String appVersion = this.e.b.getAppVersion();
        String valueOf = String.valueOf(this.c + (System.currentTimeMillis() / 1000));
        HashMap hashMap = new HashMap();
        hashMap.put("content-type", "application/json;charset=utf-8");
        hashMap.put("x-arup-version", "2.3.2");
        hashMap.put("host", rnw.b(this.b));
        hashMap.put("x-arup-appkey", rnw.b(str));
        hashMap.put("x-arup-appversion", rnw.b(appVersion));
        hashMap.put("x-arup-device-id", rnw.b(utdid));
        if (!TextUtils.isEmpty(userId)) {
            hashMap.put("x-arup-userinfo", rnw.b(userId));
        }
        hashMap.put("x-arup-timestamp", rnw.b(valueOf));
        StringBuilder sb = new StringBuilder(128);
        sb.append("/dispatchUpload.api");
        sb.append("&");
        sb.append(str);
        sb.append("&");
        sb.append(appVersion);
        sb.append("&");
        sb.append(utdid);
        sb.append("&");
        sb.append(valueOf);
        String signature = this.e.b.signature(sb.toString());
        if (a.a(2)) {
            a.a(2, "DeclareUploadActionRequest", "compute api sign:" + signature + ", input=" + ((Object) sb));
        }
        if (TextUtils.isEmpty(signature)) {
            if (a.a(16)) {
                a.a(16, "DeclareUploadActionRequest", "compute api sign failed.");
            }
            throw new Exception("compute api sign failed.");
        }
        hashMap.put("x-arup-sign", rnw.b(signature));
        if (a.a(2)) {
            a.a(2, "DeclareUploadActionRequest", " create declare header:" + hashMap.toString());
        }
        return hashMap;
    }

    private Object[] a(String str) throws Exception {
        long j;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Object[]) ipChange.ipc$dispatch("ba3f5a13", new Object[]{this, str});
        }
        JSONObject jSONObject = new JSONObject(str);
        JSONArray jSONArray = jSONObject.getJSONArray("apiServerList");
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int length = jSONArray.length() - 1; length >= 0; length--) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(length);
            arrayList.add(0, new Pair(jSONObject2.getString(c.IP), Integer.valueOf(jSONObject2.getInt("port"))));
        }
        JSONArray jSONArray2 = jSONObject.getJSONArray("uploadServerList");
        ArrayList arrayList2 = new ArrayList();
        for (int length2 = jSONArray2.length() - 1; length2 >= 0; length2--) {
            JSONObject jSONObject3 = jSONArray2.getJSONObject(length2);
            d.a.b bVar = new d.a.b();
            bVar.f24072a = jSONObject3.getString(c.IP);
            bVar.d = jSONObject3.getBoolean("encrypt");
            bVar.b = jSONObject3.getInt("port");
            bVar.c = jSONObject3.optString("protocol");
            arrayList2.add(0, bVar);
        }
        JSONObject optJSONObject = jSONObject.optJSONObject(RemoteMessageConst.TTL);
        long j2 = 0;
        if (optJSONObject != null) {
            j2 = optJSONObject.getLong("token");
            j = optJSONObject.getLong("file");
        } else {
            j = 0;
        }
        return new Object[]{jSONObject.getString("token"), Long.valueOf(j2), Long.valueOf(j), arrayList, arrayList2};
    }
}
