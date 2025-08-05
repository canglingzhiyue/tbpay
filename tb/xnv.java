package tb;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.festival.jsbridge.AliFestivalWVPlugin;
import kotlin.Metadata;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import tb.mtp;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\t\n\u0002\b\u0013\n\u0002\u0010\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\b\u0010B\u001a\u0004\u0018\u00010\u0000J\b\u0010C\u001a\u00020DH\u0002J\u0010\u0010E\u001a\u0004\u0018\u00010\u00032\u0006\u0010F\u001a\u00020\u0006J\b\u0010G\u001a\u0004\u0018\u00010\u0003J\u0010\u0010H\u001a\u0004\u0018\u00010\u00032\u0006\u0010F\u001a\u00020\u0006J\u0006\u0010I\u001a\u00020\u000fJ\u0006\u0010J\u001a\u00020DJ\u0006\u0010K\u001a\u00020DJ\u000e\u0010L\u001a\u00020D2\u0006\u0010M\u001a\u00020\u0003J\b\u0010N\u001a\u00020DH\u0002J\u0010\u0010O\u001a\u00020D2\u0006\u0010P\u001a\u00020\u0003H\u0002R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\nR\u001a\u0010\u000e\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0013\u001a\u0004\u0018\u00010\u000fX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0017\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u0004R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001a\u0010\"\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u001a\"\u0004\b$\u0010\u0004R\u001c\u0010%\u001a\u0004\u0018\u00010\u001dX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u001f\"\u0004\b'\u0010!R\u001c\u0010(\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u001a\"\u0004\b*\u0010\u0004R\u0010\u0010+\u001a\u0004\u0018\u00010\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010,\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u001a\"\u0004\b.\u0010\u0004R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010/\u001a\u0004\u0018\u000100X\u0086\u000e¢\u0006\u0010\n\u0002\u00105\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u001a\u00106\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u0010\u0010\"\u0004\b8\u0010\u0012R\u001c\u00109\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010\b\"\u0004\b;\u0010\nR\u001c\u0010<\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010\b\"\u0004\b>\u0010\nR\u001c\u0010?\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b@\u0010\b\"\u0004\bA\u0010\n¨\u0006Q"}, d2 = {"Lcom/taobao/mytaobao/dataservice/utils/DataMerger;", "", "mainData", "Lcom/alibaba/fastjson/JSONObject;", "(Lcom/alibaba/fastjson/JSONObject;)V", "customerServiceTxt", "", "getCustomerServiceTxt", "()Ljava/lang/String;", "setCustomerServiceTxt", "(Ljava/lang/String;)V", "customerServiceUrl", "getCustomerServiceUrl", "setCustomerServiceUrl", "is88Vip", "", "()Z", "set88Vip", "(Z)V", "isSuccess", "()Ljava/lang/Boolean;", "setSuccess", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "mGlobal", "getMGlobal", "()Lcom/alibaba/fastjson/JSONObject;", "setMGlobal", "mHierarchy", "Lcom/alibaba/fastjson/JSONArray;", "getMHierarchy", "()Lcom/alibaba/fastjson/JSONArray;", "setMHierarchy", "(Lcom/alibaba/fastjson/JSONArray;)V", "mHierarchyData", "getMHierarchyData", "setMHierarchyData", "mHierarchyList", "getMHierarchyList", "setMHierarchyList", "mHierarchyMap", "getMHierarchyMap", "setMHierarchyMap", "mMergedData", "mPagebackContext", "getMPagebackContext", "setMPagebackContext", mtp.a.PAGE_DATA_EXPIRES_TIME, "", "getPageDataExpireTime", "()Ljava/lang/Long;", "setPageDataExpireTime", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "refreshBasement", "getRefreshBasement", "setRefreshBasement", "settingButtonTxt", "getSettingButtonTxt", "setSettingButtonTxt", "settingButtonUrl", "getSettingButtonUrl", "setSettingButtonUrl", "userNick", "getUserNick", "setUserNick", "clone", "doInit", "", "getHierarchyByModuleName", AliFestivalWVPlugin.PARAMS_MODULE_NAME, "getMergedData", "getOriginDataByModuleName", "isDataComplete", "markFailed", "markSuccess", "mergeSteamData", "steamData", "parseGlobalParams", "parseHierarchyData", "hierarchyData", "taobao_mytaobao_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes7.dex */
public final class xnv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private JSONObject f34413a;
    private Boolean b;
    private JSONObject c;
    private JSONArray d;
    private JSONObject e;
    private JSONObject f;
    private JSONArray g;
    private JSONObject h;
    private boolean i;
    private boolean j;
    private Long k;
    private String l;
    private String m;
    private String n;
    private String o;
    private String p;
    private final JSONObject q;

    static {
        kge.a(-577161400);
    }

    public xnv() {
        this(null, 1, null);
    }

    public final boolean o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("631b57a", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public xnv(JSONObject jSONObject) {
        this.q = jSONObject;
        this.f = new JSONObject();
        r();
    }

    public /* synthetic */ xnv(JSONObject jSONObject, int i, o oVar) {
        this((i & 1) != 0 ? null : jSONObject);
    }

    public final JSONObject a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("709f7788", new Object[]{this}) : this.c;
    }

    public final JSONObject b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("84474b09", new Object[]{this}) : this.e;
    }

    public final JSONObject c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("97ef1e8a", new Object[]{this}) : this.f;
    }

    public final void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
        } else {
            this.h = jSONObject;
        }
    }

    public final JSONObject d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("ab96f20b", new Object[]{this}) : this.h;
    }

    public final boolean e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue() : this.i;
    }

    public final boolean f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[]{this})).booleanValue() : this.j;
    }

    public final Long g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Long) ipChange.ipc$dispatch("378135e7", new Object[]{this}) : this.k;
    }

    public final String h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("5d9eff91", new Object[]{this}) : this.l;
    }

    public final String i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e424ba30", new Object[]{this}) : this.m;
    }

    public final String j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6aaa74cf", new Object[]{this}) : this.n;
    }

    public final String k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f1302f6e", new Object[]{this}) : this.o;
    }

    public final String l() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("77b5ea0d", new Object[]{this}) : this.p;
    }

    public final xnv m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xnv) ipChange.ipc$dispatch("6b609d52", new Object[]{this});
        }
        JSONObject n = n();
        if (n == null) {
            return null;
        }
        xnv xnvVar = new xnv(JSONObject.parseObject(n.toJSONString()));
        xnvVar.b = this.b;
        return xnvVar;
    }

    public final JSONObject n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("70253515", new Object[]{this});
        }
        if (!q.a((Object) this.b, (Object) true)) {
            return null;
        }
        if (this.f34413a == null) {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject.put("data", (Object) jSONObject2);
            jSONObject2.put("pagebackContext", (Object) this.c);
            jSONObject2.put("hierarchy", (Object) this.d);
            jSONObject2.put("global", (Object) this.e);
            jSONObject2.put("hierarchyData", (Object) this.f);
            this.f34413a = jSONObject;
        }
        return this.f34413a;
    }

    public final JSONObject a(String moduleName) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("73d7af52", new Object[]{this, moduleName});
        }
        q.c(moduleName, "moduleName");
        return this.f.getJSONObject(moduleName);
    }

    public final JSONObject b(String moduleName) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("9d2c0493", new Object[]{this, moduleName});
        }
        q.c(moduleName, "moduleName");
        JSONObject jSONObject = this.h;
        if (jSONObject == null) {
            return null;
        }
        return jSONObject.getJSONObject(moduleName);
    }

    private final void r() {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65bfbf9", new Object[]{this});
            return;
        }
        JSONObject jSONObject3 = this.q;
        if (jSONObject3 == null || (jSONObject = jSONObject3.getJSONObject("data")) == null || (jSONObject2 = jSONObject.getJSONObject("pagebackContext")) == null) {
            return;
        }
        this.c = jSONObject2;
        JSONArray jSONArray = jSONObject.getJSONArray("hierarchy");
        if (jSONArray == null) {
            return;
        }
        this.d = jSONArray;
        JSONObject jSONObject4 = jSONObject.getJSONObject("global");
        if (jSONObject4 == null) {
            return;
        }
        this.e = jSONObject4;
        JSONObject jSONObject5 = jSONObject.getJSONObject("hierarchyData");
        if (jSONObject5 == null) {
            return;
        }
        this.f = jSONObject5;
        this.g = new JSONArray();
        this.h = new JSONObject();
        JSONArray jSONArray2 = this.d;
        if (jSONArray2 == null) {
            q.a();
        }
        int size = jSONArray2.size();
        for (int i = 0; i < size; i++) {
            JSONArray jSONArray3 = this.d;
            if (jSONArray3 == null) {
                q.a();
            }
            JSONArray array = jSONArray3.getJSONArray(i);
            JSONArray jSONArray4 = this.g;
            if (jSONArray4 == null) {
                q.a();
            }
            JSONArray jSONArray5 = array;
            jSONArray4.addAll(jSONArray5);
            q.a((Object) array, "array");
            int size2 = jSONArray5.size();
            for (int i2 = 0; i2 < size2; i2++) {
                JSONObject jSONObject6 = array.getJSONObject(i2);
                JSONObject jSONObject7 = this.h;
                if (jSONObject7 == null) {
                    q.a();
                }
                jSONObject7.put((JSONObject) jSONObject6.getString(AliFestivalWVPlugin.PARAMS_MODULE_NAME), (String) jSONObject6);
            }
        }
        s();
        c(this.f);
        this.f34413a = this.q;
        this.b = true;
    }

    public final void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63fccf7", new Object[]{this});
        } else if (q.a((Object) this.b, (Object) false)) {
        } else {
            this.b = true;
        }
    }

    public final void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64de478", new Object[]{this});
        } else {
            this.b = false;
        }
    }

    public final void b(JSONObject steamData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63b99827", new Object[]{this, steamData});
            return;
        }
        q.c(steamData, "steamData");
        JSONObject jSONObject = steamData.getJSONObject("pagebackContext");
        if (jSONObject != null) {
            this.c = jSONObject;
        }
        JSONArray jSONArray = steamData.getJSONArray("hierarchy");
        if (jSONArray != null) {
            JSONArray jSONArray2 = new JSONArray();
            JSONObject jSONObject2 = new JSONObject();
            int size = jSONArray.size();
            for (int i = 0; i < size; i++) {
                JSONArray array = jSONArray.getJSONArray(i);
                JSONArray jSONArray3 = array;
                jSONArray2.addAll(jSONArray3);
                q.a((Object) array, "array");
                int size2 = jSONArray3.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    JSONObject jSONObject3 = array.getJSONObject(i2);
                    jSONObject2.put((JSONObject) jSONObject3.getString(AliFestivalWVPlugin.PARAMS_MODULE_NAME), (String) jSONObject3);
                }
            }
            this.d = jSONArray;
            this.g = jSONArray2;
            this.h = jSONObject2;
        }
        JSONObject jSONObject4 = steamData.getJSONObject("global");
        if (jSONObject4 != null) {
            this.e = jSONObject4;
            s();
        }
        JSONObject jSONObject5 = steamData.getJSONObject("hierarchyData");
        if (jSONObject5 == null) {
            return;
        }
        this.f.putAll(jSONObject5);
        c(jSONObject5);
    }

    private final void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66a137a", new Object[]{this});
            return;
        }
        JSONObject jSONObject = this.e;
        if (jSONObject == null) {
            return;
        }
        this.i = jSONObject.getBooleanValue("is88Vip");
        this.j = jSONObject.getBooleanValue("refreshBasement");
        this.k = jSONObject.getLong("mainInterfaceExpireTime");
    }

    private final void c(JSONObject jSONObject) {
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        JSONObject jSONObject4;
        JSONObject jSONObject5;
        JSONObject jSONObject6;
        JSONObject jSONObject7;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c50c34c6", new Object[]{this, jSONObject});
            return;
        }
        JSONObject jSONObject8 = jSONObject.getJSONObject("headerModule");
        if (jSONObject8 == null) {
            return;
        }
        JSONObject jSONObject9 = jSONObject8.getJSONObject("fields");
        String str = null;
        this.l = jSONObject9 != null ? jSONObject9.getString("nick") : null;
        JSONObject jSONObject10 = jSONObject8.getJSONObject("fields");
        this.m = (jSONObject10 == null || (jSONObject7 = jSONObject10.getJSONObject("customerService")) == null) ? null : jSONObject7.getString("text");
        JSONObject jSONObject11 = jSONObject8.getJSONObject("fields");
        this.o = (jSONObject11 == null || (jSONObject6 = jSONObject11.getJSONObject("settingButton")) == null) ? null : jSONObject6.getString("text");
        JSONObject jSONObject12 = jSONObject8.getJSONObject("events");
        this.n = (jSONObject12 == null || (jSONObject4 = jSONObject12.getJSONObject("clickEvents")) == null || (jSONObject5 = jSONObject4.getJSONObject("openCustomerService")) == null) ? null : jSONObject5.getString("url");
        JSONObject jSONObject13 = jSONObject8.getJSONObject("events");
        if (jSONObject13 != null && (jSONObject2 = jSONObject13.getJSONObject("clickEvents")) != null && (jSONObject3 = jSONObject2.getJSONObject("openSetting")) != null) {
            str = jSONObject3.getString("url");
        }
        this.p = str;
    }
}
