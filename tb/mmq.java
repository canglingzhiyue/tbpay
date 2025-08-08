package tb;

import android.os.Build;
import mtopsdk.common.util.StringUtils;
import com.alipay.android.msp.framework.db.MspDBHelper;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.metrickit.utils.b;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class mmq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private String f31115a;
    private Map<String, String> b;
    private String c;

    public static /* synthetic */ String a(mmq mmqVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("29d23c4f", new Object[]{mmqVar, str});
        }
        mmqVar.f31115a = str;
        return str;
    }

    public static /* synthetic */ Map a(mmq mmqVar, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("54faa3f3", new Object[]{mmqVar, map});
        }
        mmqVar.b = map;
        return map;
    }

    public static /* synthetic */ String b(mmq mmqVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("639cde2e", new Object[]{mmqVar, str});
        }
        mmqVar.c = str;
        return str;
    }

    private mmq() {
    }

    public Map<String, String> a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("a014a89d", new Object[]{this}) : this.b;
    }

    public String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : this.c;
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue() : !StringUtils.isEmpty(this.f31115a) && this.b != null && !StringUtils.isEmpty(this.c);
    }

    /* loaded from: classes7.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private String f31116a;
        private Map<String, ?> b;
        private String c;
        private String d;

        public a a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("29d76a46", new Object[]{this, str});
            }
            this.f31116a = str;
            return this;
        }

        public a a(Map<String, ?> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("c5141cbb", new Object[]{this, map});
            }
            this.b = map;
            return this;
        }

        public a b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("b207aa25", new Object[]{this, str});
            }
            this.c = str;
            return this;
        }

        public a c(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("3a37ea04", new Object[]{this, str});
            }
            this.d = str;
            return this;
        }

        public mmq a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (mmq) ipChange.ipc$dispatch("f07d86d", new Object[]{this});
            }
            if (this.f31116a == null || ((this.b == null || StringUtils.isEmpty(this.c)) && StringUtils.isEmpty(this.d))) {
                return new mmq();
            }
            Map<String, String> b = b();
            mmq mmqVar = new mmq();
            mmq.a(mmqVar, this.f31116a);
            mmq.a(mmqVar, b);
            if (StringUtils.isEmpty(this.d)) {
                this.b.remove(mly.VALID_STORAGE_DATE);
                Object remove = this.b.remove(mly.VALID_STORAGE_PID);
                Object remove2 = this.b.remove(mly.VALID_STORAGE_LAUNCH_SESSION);
                String str = "";
                b.put(MspDBHelper.BizEntry.COLUMN_NAME_PID, remove == null ? str : String.valueOf(remove));
                if (remove2 != null) {
                    str = String.valueOf(remove2);
                }
                b.put("launchSession", str);
                mmq.b(mmqVar, a(this.b, this.c).toString());
            } else {
                mmq.b(mmqVar, this.d);
            }
            return mmqVar;
        }

        private Map<String, String> b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("6dbf0a5e", new Object[]{this});
            }
            HashMap hashMap = new HashMap();
            hashMap.put("protocolVersion", mlx.f31101a);
            hashMap.put("date", this.f31116a);
            hashMap.put("platformArchitectureBit", String.valueOf(b.a()));
            hashMap.put("javaMax", String.valueOf(Runtime.getRuntime().maxMemory()));
            hashMap.put("supportHonorDiagKit", String.valueOf(mlx.t));
            hashMap.put("honorDiagKitVersion", mlx.u);
            hashMap.put("appVersion", mlx.e);
            hashMap.put("process", mlx.q);
            hashMap.put("osApiLevel", String.valueOf(Build.VERSION.SDK_INT));
            if (!StringUtils.isEmpty(mlx.v) && !"unknown".equals(mlx.v)) {
                hashMap.put("lastAppVersion", mlx.v);
            }
            return hashMap;
        }

        /* JADX WARN: Removed duplicated region for block: B:36:0x00aa A[Catch: JSONException -> 0x00bc, TRY_LEAVE, TryCatch #5 {JSONException -> 0x00bc, blocks: (B:26:0x0083, B:28:0x0087, B:29:0x0093, B:31:0x0099, B:33:0x00a1, B:36:0x00aa), top: B:81:0x0083 }] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private org.json.JSONObject a(java.util.Map<java.lang.String, ?> r18, java.lang.String r19) {
            /*
                Method dump skipped, instructions count: 312
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: tb.mmq.a.a(java.util.Map, java.lang.String):org.json.JSONObject");
        }

        private void a(JSONObject jSONObject, String str, Object obj) {
            IpChange ipChange = $ipChange;
            boolean z = false;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f0f61e7c", new Object[]{this, jSONObject, str, obj});
                return;
            }
            try {
                if (!jSONObject.has("uploadErrorMetric") || !(jSONObject.get("uploadErrorMetric") instanceof JSONObject)) {
                    z = true;
                }
                if (z) {
                    jSONObject.put("uploadErrorMetric", new JSONObject());
                }
                jSONObject.getJSONObject("uploadErrorMetric").put(str, obj);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }
}
