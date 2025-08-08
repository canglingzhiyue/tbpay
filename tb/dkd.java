package tb;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import anetwork.channel.Response;
import anetwork.channel.degrade.DegradableNetwork;
import anetwork.channel.entity.RequestImpl;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ab.api.b;
import com.taobao.android.ab.api.c;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class dkd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Context f26807a;
    private final String b;
    private final dkc c;

    public dkd(Context context, String str, dkc dkcVar) {
        this.f26807a = context;
        this.b = str;
        this.c = dkcVar;
    }

    public Map<String, dkl> a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("bf3e1ee7", new Object[]{this, str});
        }
        djy.a("RemoteConfigPuller", "syncPullFromRemote: " + str);
        Response syncSend = new DegradableNetwork(this.f26807a).syncSend(new RequestImpl(str), this);
        if (syncSend != null && syncSend.getStatusCode() == 200) {
            byte[] bytedata = syncSend.getBytedata();
            if (bytedata == null) {
                return null;
            }
            String str2 = new String(bytedata);
            if (StringUtils.isEmpty(str2)) {
                return null;
            }
            return b(str2);
        }
        djy.a("RemoteConfigPuller", "syncPullFromRemote: " + str + " failed");
        return null;
    }

    public Map<String, dkl> b(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("d2e5f268", new Object[]{this, str}) : new a(this.c, this.b).a(str);
    }

    /* loaded from: classes4.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final Map<String, dkk> f26808a = new HashMap();
        private final dkc b;
        private final String c;

        public a(dkc dkcVar, String str) {
            this.b = dkcVar;
            this.c = str;
        }

        public Map<String, dkl> a(String str) {
            JSONObject jSONObject;
            JSONObject optJSONObject;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("bf3e1ee7", new Object[]{this, str});
            }
            try {
                jSONObject = new JSONObject(str);
                optJSONObject = jSONObject.optJSONObject("var_config");
            } catch (JSONException e) {
                e.printStackTrace();
            }
            if (optJSONObject == null) {
                return Collections.emptyMap();
            }
            JSONObject optJSONObject2 = jSONObject.optJSONObject("exp_infos");
            if (optJSONObject2 == null) {
                return Collections.emptyMap();
            }
            Iterator<String> keys = optJSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                JSONObject optJSONObject3 = optJSONObject.optJSONObject(next);
                if (optJSONObject3 != null) {
                    a(optJSONObject2, next, optJSONObject3);
                }
            }
            return a(this.f26808a);
        }

        public Map<String, dkl> a(Map<String, dkk> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("4fc7ad92", new Object[]{this, map});
            }
            HashMap hashMap = new HashMap(map.size());
            dkk a2 = dko.a(dkl.EMPTY);
            for (Map.Entry<String, dkk> entry : map.entrySet()) {
                dkk value = entry.getValue();
                a2.a(value);
                value.g();
                hashMap.put(entry.getKey(), value);
            }
            hashMap.put(dkf.KEY_AGE_VARIATIONS, a2);
            return Collections.unmodifiableMap(hashMap);
        }

        public void a(JSONObject jSONObject, String str, JSONObject jSONObject2) {
            long j;
            JSONObject optJSONObject;
            dkl a2;
            JSONObject optJSONObject2;
            String optString;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("afa2ff1e", new Object[]{this, jSONObject, str, jSONObject2});
                return;
            }
            Iterator<String> keys = jSONObject2.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if (!StringUtils.isEmpty(next)) {
                    try {
                        j = Integer.parseInt(next);
                    } catch (NumberFormatException unused) {
                        j = -1;
                    }
                    if (j != -1 && (optJSONObject = jSONObject.optJSONObject(next)) != null && (a2 = a(jSONObject, j, optJSONObject)) != dkl.EMPTY && (optJSONObject2 = jSONObject2.optJSONObject(next)) != null && (optString = optJSONObject2.optString(String.valueOf(a2.d()), null)) != null) {
                        a(a2, str, optString);
                    }
                }
            }
        }

        public void a(dkl dklVar, String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a5d0ef87", new Object[]{this, dklVar, str, str2});
                return;
            }
            b a2 = dko.a(str, str2);
            djy.a("RemoteConfigPuller.Parser", "create variation " + a2.a() + ":" + a2.b());
            String valueOf = String.valueOf(dklVar.b());
            dkk dkkVar = this.f26808a.get(valueOf);
            if (dkkVar != null) {
                djy.a("RemoteConfigPuller.Parser", "updated variationSet: " + dklVar.f());
                dkkVar.a(a2);
                return;
            }
            dkk a3 = dko.a(dklVar);
            djy.a("RemoteConfigPuller.Parser", "created variationSet: " + dklVar.f());
            a3.a(a2);
            this.f26808a.put(valueOf, a3);
        }

        public dkl a(JSONObject jSONObject, long j, JSONObject jSONObject2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (dkl) ipChange.ipc$dispatch("ddf42111", new Object[]{this, jSONObject, new Long(j), jSONObject2});
            }
            dkk dkkVar = this.f26808a.get(String.valueOf(j));
            if (dkkVar != null) {
                return dkkVar;
            }
            JSONObject optJSONObject = jSONObject2.optJSONObject("conditions");
            if (optJSONObject == null) {
                return dkl.EMPTY;
            }
            if (!a(optJSONObject)) {
                return dkl.EMPTY;
            }
            int optInt = jSONObject2.optInt("bucket_num");
            if (optInt <= 0) {
                return dkl.EMPTY;
            }
            String optString = jSONObject2.optString("exp_hash_factor");
            if (StringUtils.isEmpty(optString)) {
                return dkl.EMPTY;
            }
            long a2 = djy.a(this.b.a(jSONObject2.optString("exp_hash_key")), optString, optInt);
            if (a2 == -1) {
                return dkl.EMPTY;
            }
            JSONObject optJSONObject2 = jSONObject2.optJSONObject("parent_exp");
            if (optJSONObject2 != null && a(jSONObject, optJSONObject2) == dkl.EMPTY) {
                return dkl.EMPTY;
            }
            JSONObject optJSONObject3 = jSONObject2.optJSONObject("groups");
            if (optJSONObject3 == null) {
                return dkl.EMPTY;
            }
            long a3 = a(optJSONObject3, a2);
            if (a3 == -1) {
                return dkl.EMPTY;
            }
            long optLong = jSONObject2.optLong("exp_version", -1L);
            if (optLong == -1) {
                return dkl.EMPTY;
            }
            return dko.a(jSONObject2.optString("exp_name", ""), j, optLong, a3, a2);
        }

        public c a(JSONObject jSONObject, JSONObject jSONObject2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (c) ipChange.ipc$dispatch("dffb3ca6", new Object[]{this, jSONObject, jSONObject2});
            }
            long optLong = jSONObject2.optLong("exp_id", -1L);
            String optString = jSONObject2.optString("group_id");
            if (optLong == -1 || StringUtils.isEmpty(optString)) {
                return dkl.EMPTY;
            }
            String valueOf = String.valueOf(optLong);
            dkk dkkVar = this.f26808a.get(valueOf);
            if (dkkVar != null) {
                return dkkVar;
            }
            JSONObject optJSONObject = jSONObject.optJSONObject(valueOf);
            if (optJSONObject != null) {
                dkl a2 = a(jSONObject, optLong, optJSONObject);
                if (a2 != dkl.EMPTY) {
                    this.f26808a.put(valueOf, dko.a(a2));
                }
                return a2;
            }
            return dkl.EMPTY;
        }

        public boolean a(JSONArray jSONArray, long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("36559e06", new Object[]{this, jSONArray, new Long(j)})).booleanValue();
            }
            for (int i = 0; i < jSONArray.length(); i++) {
                String optString = jSONArray.optString(i);
                if (StringUtils.isEmpty(optString)) {
                    return false;
                }
                String[] split = optString.split(",");
                if (split.length >= 2) {
                    try {
                        long parseLong = Long.parseLong(split[0].trim());
                        long parseLong2 = Long.parseLong(split[1].trim());
                        if (j >= parseLong && j < parseLong2) {
                            return true;
                        }
                        djy.a("RemoteConfigPuller.Parser", "bucketId " + j + " is not in range " + optString);
                    } catch (NumberFormatException e) {
                        djy.a("RemoteConfigPuller.Parser", "checkBucketRange failed due to " + e.getMessage());
                    }
                }
            }
            djy.a("RemoteConfigPuller.Parser", "bucketId " + j + " is not in any range");
            return false;
        }

        public long a(JSONObject jSONObject, long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("1e3d2b22", new Object[]{this, jSONObject, new Long(j)})).longValue();
            }
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                JSONArray optJSONArray = jSONObject.optJSONArray(next);
                if (optJSONArray != null && a(optJSONArray, j)) {
                    try {
                        return Long.parseLong(next);
                    } catch (NumberFormatException e) {
                        djy.a("RemoteConfigPuller.Parser", "gatherGroup failed due to " + e.getMessage());
                    }
                }
            }
            return -1L;
        }

        public boolean a(JSONObject jSONObject) {
            boolean z;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("3286165a", new Object[]{this, jSONObject})).booleanValue();
            }
            try {
                djy.a("RemoteConfigPuller.Parser", "checkCondition, condition: " + jSONObject.toString());
                JSONArray jSONArray = jSONObject.getJSONArray("app_version");
                if (jSONArray.length() > 0) {
                    for (int i = 0; i < jSONArray.length(); i++) {
                        String string = jSONArray.getString(i);
                        if (!StringUtils.isEmpty(string)) {
                            try {
                                z = Pattern.compile(string).matcher(this.c).matches();
                            } catch (PatternSyntaxException e) {
                                djy.a("RemoteConfigPuller.Parser", "compile pattern " + e.getPattern() + " failed due to:" + e.getMessage());
                                z = false;
                            }
                            if (z) {
                                djy.a("RemoteConfigPuller.Parser", "appVersion(" + this.c + ") matches " + string);
                                return true;
                            }
                        }
                    }
                }
            } catch (JSONException e2) {
                djy.a("RemoteConfigPuller.Parser", "checkCondition failed when parse json string: " + e2.toString());
            }
            djy.a("RemoteConfigPuller.Parser", "condition check failed");
            return false;
        }
    }
}
