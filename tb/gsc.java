package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.mrt.task.desc.MRTPythonLibDescription;
import com.taobao.mrt.utils.a;
import com.taobao.orange.OrangeConfig;
import com.tmall.android.dai.internal.util.b;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public class gsc {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String LOG_TAG = "JarvisLibManager";

    /* renamed from: a  reason: collision with root package name */
    private static volatile gsc f28425a;

    static {
        kge.a(1566273997);
    }

    public static /* synthetic */ boolean a(gsc gscVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d2f55e1", new Object[]{gscVar, jSONObject})).booleanValue() : gscVar.a(jSONObject);
    }

    public static gsc a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (gsc) ipChange.ipc$dispatch("f053307", new Object[0]);
        }
        if (f28425a == null) {
            synchronized (gsc.class) {
                if (f28425a == null) {
                    f28425a = new gsc();
                }
            }
        }
        return f28425a;
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            b.b().a().execute(new Runnable() { // from class: tb.gsc.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    JSONObject c = gsc.this.c();
                    if (c == null) {
                        a.a(gsc.LOG_TAG, "reCheckJarvisLib lib json is null!!!");
                    } else {
                        gsc.a(gsc.this, c);
                    }
                }
            });
        }
    }

    public JSONObject c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("71733358", new Object[]{this}) : gsi.c(OrangeConfig.getInstance().getCustomConfig("ODCP_python_base_lib", ""));
    }

    private boolean a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3286165a", new Object[]{this, jSONObject})).booleanValue();
        }
        if (jSONObject == null) {
            a.d(LOG_TAG, "libConfig  empty");
            return false;
        }
        String f = rkq.d().f();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            try {
                String next = keys.next();
                JSONObject optJSONObject = jSONObject.optJSONObject(next);
                if (optJSONObject == null) {
                    a.d(LOG_TAG, "Parse lib config err, name:" + next);
                } else {
                    a(a(optJSONObject, f));
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return true;
    }

    private MRTPythonLibDescription a(JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MRTPythonLibDescription) ipChange.ipc$dispatch("d81cfca", new Object[]{this, jSONObject, str});
        }
        try {
            String optString = jSONObject.optString("packageName");
            String optString2 = jSONObject.optString(noa.KEY_IS_BETA);
            String optString3 = jSONObject.optString("ratio");
            JSONArray optJSONArray = jSONObject.optJSONArray("online");
            JSONArray optJSONArray2 = jSONObject.optJSONArray("beta");
            if (optString2 == null || !optString2.equals("true") || !gsh.a(optString3, optString)) {
                optJSONArray2 = optJSONArray;
            }
            int a2 = a(optJSONArray2, str);
            if (a2 < 0) {
                return null;
            }
            JSONObject jSONObject2 = optJSONArray2.getJSONObject(a2);
            return new MRTPythonLibDescription(optString, jSONObject2.optString("mmd5"), jSONObject2.optString("furl"), jSONObject2.optString("fmd5"), null);
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    private int a(JSONArray jSONArray, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f5d7a63f", new Object[]{this, jSONArray, str})).intValue();
        }
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i);
            if (optJSONObject != null && gsh.a(optJSONObject.optJSONObject("conditionTree"), str)) {
                return i;
            }
        }
        return -1;
    }

    private void a(MRTPythonLibDescription mRTPythonLibDescription) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a7b8b7c", new Object[]{this, mRTPythonLibDescription});
        } else {
            msm.a().a(mRTPythonLibDescription);
        }
    }
}
