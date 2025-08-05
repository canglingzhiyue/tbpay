package com.alibaba.analytics.core.config;

import android.net.Uri;
import com.alibaba.analytics.core.config.UTClientConfigMgr;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
import tb.any;
import tb.apr;
import tb.aqc;
import tb.kge;
import tb.riy;

/* loaded from: classes2.dex */
public class r {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static r b;
    private List<s> c = new LinkedList();
    private Map<String, String> d = new HashMap();

    /* renamed from: a  reason: collision with root package name */
    private String f2072a = "";

    public static /* synthetic */ String a(r rVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("372996b2", new Object[]{rVar}) : rVar.f2072a;
    }

    public static /* synthetic */ void a(r rVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52c9c9f8", new Object[]{rVar, str});
        } else {
            rVar.a(str);
        }
    }

    static {
        kge.a(-1756095830);
        b = null;
    }

    private r() {
        apr.b("UTMCTPKBiz", "init tpk Content", "[{\"kn\":\"adid\",\"ty\":\"nearby\"},{\"kn\":\"ucm\",\"ty\":\"nearby\"},{\"kn\":\"bdid\",\"ty\":\"far\"},{\"kn\":\"ref_pid\",\"ty\":\"far\"},{\"kn\":\"pid\",\"ty\":\"far\"},{\"kn\":\"tpa\",\"ty\":\"far\"},{\"kn\":\"point\",\"ty\":\"far\"},{\"kn\":\"ali_trackid\",\"ty\":\"far\"},{\"kn\":\"xncode\",\"ty\":\"nearby\"},{\"kn\":\"ybhpss\",\"ty\":\"nearby\"},{\"kn\":\"a_n\",\"ty\":\"far\"},{\"kn\":\"i_d\",\"ty\":\"far\"},{\"kn\":\"h_d\",\"ty\":\"far\"},{\"kn\":\"r_n\",\"ty\":\"far\"},{\"kn\":\"uplusRankId\",\"ty\":\"nearby\"}]");
        a("[{\"kn\":\"adid\",\"ty\":\"nearby\"},{\"kn\":\"ucm\",\"ty\":\"nearby\"},{\"kn\":\"bdid\",\"ty\":\"far\"},{\"kn\":\"ref_pid\",\"ty\":\"far\"},{\"kn\":\"pid\",\"ty\":\"far\"},{\"kn\":\"tpa\",\"ty\":\"far\"},{\"kn\":\"point\",\"ty\":\"far\"},{\"kn\":\"ali_trackid\",\"ty\":\"far\"},{\"kn\":\"xncode\",\"ty\":\"nearby\"},{\"kn\":\"ybhpss\",\"ty\":\"nearby\"},{\"kn\":\"a_n\",\"ty\":\"far\"},{\"kn\":\"i_d\",\"ty\":\"far\"},{\"kn\":\"h_d\",\"ty\":\"far\"},{\"kn\":\"r_n\",\"ty\":\"far\"},{\"kn\":\"uplusRankId\",\"ty\":\"nearby\"}]");
        UTClientConfigMgr.a().a(new UTClientConfigMgr.a() { // from class: com.alibaba.analytics.core.config.r.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alibaba.analytics.core.config.UTClientConfigMgr.a
            public String getKey() {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("16c52370", new Object[]{this}) : "tpk_string";
            }

            @Override // com.alibaba.analytics.core.config.UTClientConfigMgr.a
            public void onChange(String str) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5bfd17c0", new Object[]{this, str});
                    return;
                }
                apr.b("UTMCTPKBiz", "onChange tpk_string", str);
                if (aqc.e(str) || str.equalsIgnoreCase(r.a(r.this))) {
                    apr.b("UTMCTPKBiz", "tpk_string do not need change");
                } else {
                    r.a(r.this, str);
                }
            }
        });
    }

    public static r a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (r) ipChange.ipc$dispatch("afc32eae", new Object[0]);
        }
        if (b == null) {
            synchronized (r.class) {
                if (b == null) {
                    b = new r();
                }
            }
        }
        return b;
    }

    public synchronized void a(s sVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5bb4640d", new Object[]{this, sVar});
            return;
        }
        if (sVar != null) {
            b(sVar);
            c();
        }
    }

    public synchronized void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
            return;
        }
        if (!aqc.e(str)) {
            if (str2 == null) {
                this.d.remove(str);
                return;
            }
            this.d.put(str, str2);
        }
    }

    private synchronized void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else if (!aqc.e(str)) {
            apr.b("UTMCTPKBiz", "_onTPKConfArrive update ConfContent", str);
            try {
                JSONArray jSONArray = new JSONArray(str);
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject optJSONObject = jSONArray.optJSONObject(i);
                    if (optJSONObject != null && optJSONObject.has("kn") && !optJSONObject.isNull("kn")) {
                        String string = optJSONObject.getString("kn");
                        if (!"a".equals(string)) {
                            s sVar = new s();
                            String optString = optJSONObject.optString("v");
                            if (aqc.e(optString)) {
                                optString = "${" + string + riy.BLOCK_END_STR;
                            }
                            String optString2 = optJSONObject.optString("ty", s.TYPE_FAR);
                            sVar.a(string);
                            sVar.c(optString);
                            sVar.b(optString2);
                            b(sVar);
                        }
                    }
                }
            } catch (Exception unused) {
            }
            c();
            this.f2072a = str;
        }
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else if (apr.a()) {
            for (s sVar : this.c) {
                apr.b("UTMCTPKBiz", "mTPKItems kn", sVar.a(), "type", sVar.b(), "kv", sVar.c());
            }
        }
    }

    private void b(s sVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6319992c", new Object[]{this, sVar});
        } else if (sVar != null && !aqc.e(sVar.a())) {
            for (s sVar2 : this.c) {
                if (sVar2.a().equalsIgnoreCase(sVar.a())) {
                    this.c.remove(sVar2);
                }
            }
            this.c.add(sVar);
        }
    }

    private String a(String str, Uri uri, Map<String, String> map) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2cf85310", new Object[]{this, str, uri, map});
        }
        if (aqc.e(str)) {
            return null;
        }
        if (str.startsWith("${url|") && str.length() > 7) {
            String substring = str.substring(6, str.length() - 1);
            if (!aqc.e(substring) && uri != null) {
                return uri.getQueryParameter(substring);
            }
        } else if (str.startsWith("${ut|") && str.length() > 6) {
            String substring2 = str.substring(5, str.length() - 1);
            if (!aqc.e(substring2) && map != null) {
                return map.get(substring2);
            }
        } else if (!str.startsWith("${") || str.length() <= 3) {
            return str;
        } else {
            String substring3 = str.substring(2, str.length() - 1);
            if (!aqc.e(substring3)) {
                if (map != null && (str2 = map.get(substring3)) != null) {
                    return str2;
                }
                if (uri != null) {
                    return uri.getQueryParameter(substring3);
                }
            }
        }
        return null;
    }

    public synchronized String a(Uri uri, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e67f3d9a", new Object[]{this, uri, map});
        }
        for (s sVar : this.c) {
            String a2 = sVar.a();
            String b2 = sVar.b();
            String c = sVar.c();
            if (aqc.e(a2)) {
                return null;
            }
            if (aqc.e(this.d.get(a2))) {
                String a3 = a(c, uri, map);
                if (!aqc.e(a3)) {
                    this.d.put(a2, a3);
                }
            } else if (!s.TYPE_FAR.equals(b2)) {
                String a4 = a(c, uri, map);
                if (!aqc.e(a4)) {
                    this.d.put(a2, a4);
                }
            }
        }
        if (!this.d.containsKey("ttid") && !aqc.e(any.d().h())) {
            this.d.put("ttid", any.d().h());
        }
        if (this.d.size() <= 0) {
            return null;
        }
        return riy.BLOCK_START_STR + aqc.a(this.d) + riy.BLOCK_END_STR;
    }

    public synchronized void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            this.d.clear();
        }
    }
}
