package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.network.diagnosis.c;
import com.taobao.artc.api.ArtcStats;
import com.uploader.export.k;
import com.uploader.implement.a;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import mtopsdk.mtop.upload.domain.UploadConstants;
import org.android.agoo.common.AgooConstants;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public class rnt {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static volatile boolean G = false;
    private static volatile boolean H = false;
    private static volatile boolean I = false;
    private static final byte[] J = new byte[0];
    public int A;
    public String B;
    public int C;
    public int D;
    public boolean E;
    public String F;
    private rnt K;

    /* renamed from: a  reason: collision with root package name */
    public final boolean f33248a;
    public long b;
    public long c;
    public String d;
    public String e;
    public int f;
    public int g;
    public String h;
    public String i;
    public String j;
    public long k;
    public long l;
    public long m;
    public long n;
    public long o;
    public String p;
    public String q;
    public int r;
    public long s;
    public int t;
    public boolean u;
    public String v = "2.3.2";
    public long w;
    public String x;
    public String y;
    public String z;

    public static /* synthetic */ rnt a(rnt rntVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (rnt) ipChange.ipc$dispatch("f75cf5ae", new Object[]{rntVar}) : rntVar.K;
    }

    public static /* synthetic */ boolean a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a821d370", new Object[]{new Boolean(z)})).booleanValue();
        }
        I = z;
        return z;
    }

    public static /* synthetic */ void b(rnt rntVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebe440a1", new Object[]{rntVar});
        } else {
            rntVar.f();
        }
    }

    public static /* synthetic */ boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[0])).booleanValue() : I;
    }

    public static /* synthetic */ byte[] e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (byte[]) ipChange.ipc$dispatch("aef483f1", new Object[0]) : J;
    }

    public rnt(boolean z, rnt rntVar) {
        this.f33248a = z;
        this.K = rntVar;
    }

    private rnt(boolean z) {
        this.f33248a = z;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (this.f33248a) {
        } else {
            final long currentTimeMillis = System.currentTimeMillis();
            rpa.a(new Runnable() { // from class: tb.rnt.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    rnt rntVar = rnt.this;
                    do {
                        rntVar = rnt.a(rntVar);
                        if (rntVar == null) {
                            HashMap hashMap = new HashMap();
                            HashMap hashMap2 = new HashMap();
                            hashMap2.put("biz", rnt.this.d);
                            hashMap2.put(UploadConstants.FILE_ID, rnt.this.p);
                            hashMap2.put("arupversion", rnt.this.v);
                            hashMap2.put("tasktype", String.valueOf(rnt.this.u ? 1 : 0));
                            hashMap2.put("eventtime", String.valueOf(currentTimeMillis));
                            if (!TextUtils.isEmpty(rnt.this.y)) {
                                hashMap2.put("md5", rnt.this.y);
                            }
                            if (!TextUtils.isEmpty(rnt.this.x)) {
                                hashMap2.put("mimetype", rnt.this.x);
                            }
                            if (!TextUtils.isEmpty(rnt.this.z)) {
                                hashMap2.put("trackid", rnt.this.z);
                            }
                            hashMap2.put(c.IP, rnt.this.e);
                            hashMap2.put("port", String.valueOf(rnt.this.f));
                            hashMap2.put("pageback", rnt.this.E ? "1" : "0");
                            hashMap2.put("concurrenttasks", String.valueOf(rnt.this.C));
                            if (!TextUtils.isEmpty(rnt.this.F)) {
                                hashMap2.put("protocol", rnt.this.F);
                            }
                            if (rnt.this.k > 0) {
                                hashMap.put("size", Double.valueOf(rnt.this.k));
                            }
                            if (!rnt.d()) {
                                synchronized (rnt.e()) {
                                    if (!rnt.d()) {
                                        rnt.b(rnt.this);
                                        rnt.a(true);
                                    }
                                }
                            }
                            if (a.a(16)) {
                                a.a(16, "ActionStatistics", "commit FileUploadStart, dimensions:" + hashMap2 + ", measures:" + hashMap);
                            }
                            com.uploader.implement.c.a("ARUP", "FileUploadStart", hashMap, hashMap2);
                            return;
                        }
                    } while (rntVar.f33248a);
                }
            });
        }
    }

    private void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        hashSet.add("biz");
        hashSet.add(UploadConstants.FILE_ID);
        hashSet.add("arupversion");
        hashSet.add("tasktype");
        hashSet.add("mimetype");
        hashSet.add("trackid");
        hashSet.add("md5");
        hashSet.add(c.IP);
        hashSet.add("port");
        hashSet.add("pageback");
        hashSet.add("concurrenttasks");
        hashSet.add("protocol");
        hashSet.add("eventtime");
        hashSet2.add("size");
        com.uploader.implement.c.a("ARUP", "FileUploadStart", hashSet2, hashSet, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x03f4  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0423  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02c0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String b() {
        /*
            Method dump skipped, instructions count: 1121
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.rnt.b():java.lang.String");
    }

    private Set<String> g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("7215bcdd", new Object[]{this});
        }
        HashSet hashSet = new HashSet();
        hashSet.add("biz");
        hashSet.add("token");
        hashSet.add(UploadConstants.FILE_ID);
        hashSet.add(c.IP);
        hashSet.add("port");
        hashSet.add(com.taobao.mtop.wvplugin.a.RESULT_KEY);
        hashSet.add("errorcode");
        hashSet.add("subcode");
        hashSet.add("errormsg");
        hashSet.add(UploadConstants.RETRY_TIMES);
        hashSet.add("arupversion");
        if (!this.f33248a) {
            hashSet.add(AgooConstants.MESSAGE_ENCRYPTED);
            hashSet.add("protocol");
            hashSet.add("tasktype");
            hashSet.add("uploadtrace");
            hashSet.add("mimetype");
            hashSet.add("trackid");
            hashSet.add("md5");
            hashSet.add("concurrenttasks");
            hashSet.add("pageback");
            hashSet.add("eventtime");
        }
        return hashSet;
    }

    private Set<String> h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("3fc01e9e", new Object[]{this});
        }
        HashSet hashSet = new HashSet();
        hashSet.add("connecttime");
        hashSet.add("costtime");
        hashSet.add("size");
        hashSet.add("speed");
        hashSet.add("totaltime");
        hashSet.add("md5time");
        hashSet.add("upstream");
        hashSet.add("downstream");
        if (!this.f33248a) {
            hashSet.add("serverrt");
            hashSet.add("uploadcount");
            hashSet.add("phasecount");
        }
        return hashSet;
    }

    public String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this});
        }
        try {
            JSONObject c = c(this);
            rnt rntVar = this.K;
            JSONObject jSONObject = c;
            while (rntVar != null) {
                if (rntVar.f33248a) {
                    rntVar = rntVar.K;
                } else {
                    JSONObject c2 = c(rntVar);
                    jSONObject.put("previous", c2);
                    rntVar = rntVar.K;
                    jSONObject = c2;
                }
            }
            return c.toString();
        } catch (JSONException e) {
            if (!a.a(16)) {
                return null;
            }
            a.a(16, "ActionStatistics", "toJsonString error.", e);
            return null;
        }
    }

    private JSONObject c(rnt rntVar) throws JSONException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("653ed310", new Object[]{this, rntVar});
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("costTimeMillisStart", rntVar.l);
        long j = rntVar.m;
        if (j <= 0) {
            j = System.currentTimeMillis();
        }
        jSONObject.put("costTimeMillisEnd", j);
        jSONObject.put("connectedTimeMillisStart", rntVar.n);
        jSONObject.put("connectedTimeMillisEnd", rntVar.o);
        jSONObject.put("prepareTime", rntVar.s);
        jSONObject.put("networkType", rntVar.B);
        jSONObject.put(ArtcStats.STAT_RETRYCOUNT, rntVar.r);
        jSONObject.put("phaseIndex", rntVar.A);
        jSONObject.put("upstream", rntVar.b);
        return jSONObject;
    }

    private static rnt a(JSONObject jSONObject) throws JSONException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rnt) ipChange.ipc$dispatch("ddc810b8", new Object[]{jSONObject});
        }
        rnt rntVar = new rnt(false);
        rntVar.l = jSONObject.getLong("costTimeMillisStart");
        rntVar.m = jSONObject.getLong("costTimeMillisEnd");
        rntVar.n = jSONObject.getLong("connectedTimeMillisStart");
        rntVar.o = jSONObject.getLong("connectedTimeMillisEnd");
        rntVar.s = jSONObject.getLong("prepareTime");
        rntVar.B = jSONObject.getString("networkType");
        rntVar.r = jSONObject.getInt(ArtcStats.STAT_RETRYCOUNT);
        rntVar.A = jSONObject.getInt("phaseIndex");
        rntVar.b = jSONObject.getLong("upstream");
        return rntVar;
    }

    public static rnt a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rnt) ipChange.ipc$dispatch("7c74cb5c", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            rnt a2 = a(jSONObject);
            rnt rntVar = a2;
            for (JSONObject optJSONObject = jSONObject.optJSONObject("previous"); optJSONObject != null; optJSONObject = optJSONObject.optJSONObject("previous")) {
                rntVar.K = a(optJSONObject);
                rntVar = rntVar.K;
            }
            return a2;
        } catch (Exception e) {
            if (a.a(16)) {
                a.a(16, "ActionStatistics", "buildFileUploadStatistics error.", e);
            }
            return new rnt(false);
        }
    }

    public void a(k kVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8d29c76", new Object[]{this, kVar});
            return;
        }
        this.g = 4;
        this.u = true;
        this.p = kVar.g;
        this.d = kVar.f24059a;
        b();
    }

    public void b(k kVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9a3a3d5", new Object[]{this, kVar});
            return;
        }
        this.g = 3;
        this.u = false;
        this.p = kVar.g;
        this.d = kVar.f24059a;
        b();
    }
}
