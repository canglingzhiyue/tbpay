package android.taobao.windvane.jsbridge;

import com.android.alibaba.ip.runtime.IpChange;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import tb.kge;

/* loaded from: classes2.dex */
public class r {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CLOSED = "HY_CLOSED";
    public static final String ERROR_EXECUTE = "HY_ERROR_EXECUTE";
    public static final String FAIL = "HY_FAILED";
    public static final String NO_CLASS = "HY_NO_CLASS";
    public static final String NO_METHOD = "HY_NO_HANDLER";
    public static final String NO_PERMISSION = "HY_NO_PERMISSION";
    public static final String PARAM_ERR = "HY_PARAM_ERR";
    public static final r RET_CLOSED;
    public static final r RET_FAIL;
    public static final r RET_NO_METHOD;
    public static final r RET_NO_PERMISSION;
    public static final r RET_PARAM_ERR;
    public static final r RET_SUCCESS;
    public static final String SUCCESS = "HY_SUCCESS";

    /* renamed from: a  reason: collision with root package name */
    private int f1674a = 0;
    private JSONObject b = new JSONObject();
    private boolean c = false;

    static {
        kge.a(1235973109);
        RET_SUCCESS = new r("HY_SUCCESS");
        RET_FAIL = new r("HY_FAILED");
        RET_PARAM_ERR = new r("HY_PARAM_ERR");
        RET_NO_METHOD = new r("HY_NO_HANDLER");
        RET_NO_PERMISSION = new r("HY_NO_PERMISSION");
        RET_CLOSED = new r("HY_CLOSED");
    }

    public r() {
    }

    public r(String str) {
        a(str);
    }

    public void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32861656", new Object[]{this, jSONObject});
        } else if (jSONObject == null) {
        } else {
            this.b = jSONObject;
        }
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : this.c;
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.c = z;
        }
    }

    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
        } else if (str == null || str2 == null) {
        } else {
            try {
                this.b.put(str, str2);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    public void a(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3502d8cc", new Object[]{this, str, jSONObject});
        } else if (str == null || jSONObject == null) {
        } else {
            try {
                this.b.put(str, jSONObject);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    public void a(String str, JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d300fcc", new Object[]{this, str, jSONArray});
        } else if (str == null || jSONArray == null) {
        } else {
            try {
                this.b.put(str, jSONArray);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    public void a(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bb6538e", new Object[]{this, str, obj});
        } else if (str == null || obj == null) {
        } else {
            try {
                this.b.put(str, obj);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            this.f1674a = 1;
        }
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue() : this.f1674a == 1;
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        int i = 1;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        try {
            this.b.put(com.taobao.mtop.wvplugin.a.RESULT_KEY, str);
            if (!"HY_SUCCESS".equals(str)) {
                i = -1;
            }
            this.f1674a = i;
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("43881515", new Object[]{this});
        }
        try {
            if (this.f1674a == 1) {
                this.b.put(com.taobao.mtop.wvplugin.a.RESULT_KEY, "HY_SUCCESS");
            } else if (this.f1674a == 0) {
                this.b.put(com.taobao.mtop.wvplugin.a.RESULT_KEY, "HY_FAILED");
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return this.b.toString();
    }

    public String b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4204a5c3", new Object[]{this, str, str2});
        }
        try {
            return this.b == null ? "HY_FAILED_NO_RESULT" : this.b.optString(str, str2);
        } catch (Throwable unused) {
            return "HY_FAILED_EXCEPTION";
        }
    }
}
