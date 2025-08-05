package tb;

import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail2.core.framework.data.model.CardInnerCommonNode;
import com.taobao.android.detail2.core.framework.data.model.MainMediaInfo;
import com.taobao.android.detail2.core.framework.data.model.d;
import com.taobao.ju.track.server.JTrackParams;
import com.taobao.popupcenter.strategy.PopStrategy;
import com.taobao.utils.Global;
import com.taobao.vessel.utils.b;
import com.ut.share.utils.Constants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes5.dex */
public class fhi extends d {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String VALUE_NINE_SIXTEEN_RATIO = "9:16";
    public a V;

    /* renamed from: a  reason: collision with root package name */
    public CardInnerCommonNode f27944a;
    private String aa;
    private boolean ab;
    public boolean ac;
    public boolean ad;
    public onl ae;
    public MainMediaInfo b;
    public List<CardInnerCommonNode> c;
    public boolean d;
    private boolean e;

    /* loaded from: classes5.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public String f27945a;
        public String b;
        public String c;
        public String d;
        public boolean e;

        static {
            kge.a(488320514);
        }
    }

    static {
        kge.a(1607911743);
    }

    private boolean d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d23b17f9", new Object[]{this, str})).booleanValue();
        }
        return false;
    }

    public static /* synthetic */ Object ipc$super(fhi fhiVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public fhi(fkr fkrVar) {
        super(fkrVar);
        this.c = new ArrayList();
        this.e = false;
        this.Z = "a2141.22412911";
    }

    @Override // com.taobao.android.detail2.core.framework.data.model.d
    public void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
        } else {
            c(jSONObject, true);
        }
    }

    @Override // com.taobao.android.detail2.core.framework.data.model.d
    public CardInnerCommonNode a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (CardInnerCommonNode) ipChange.ipc$dispatch("cd31ee55", new Object[]{this}) : this.f27944a;
    }

    public String b() {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : (this.H == null || (jSONObject = this.H.getJSONObject("trade")) == null) ? "" : jSONObject.getString(Constants.WEIBO_REDIRECTURL_KEY);
    }

    private void c(JSONObject jSONObject, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc7b16ce", new Object[]{this, jSONObject, new Boolean(z)});
        } else if (jSONObject == null) {
        } else {
            ctu.a("processItemNode");
            S();
            T();
            U();
            g(jSONObject);
            ctu.a();
        }
    }

    private void g(JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a56a742", new Object[]{this, jSONObject});
        } else if (this.J == null || (jSONObject2 = this.J.getJSONObject("mainPicNative")) == null) {
        } else {
            onl onlVar = this.ae;
            this.ae = new onl(jSONObject2, H());
            a(onlVar, this.ae);
            fjt.a(fjt.TAG_RENDER, "processMainPicNative生成节点成功" + this);
        }
    }

    private void a(onl onlVar, onl onlVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37201b2e", new Object[]{this, onlVar, onlVar2});
        } else if (onlVar == null || onlVar2 == null || onlVar.d == onlVar2.d) {
        } else {
            fjp.a(fjp.SCENE_MEDIA_PLAYER, fjp.ERROR_CODE_MAIN_PIC_NATIVE_INCONSISTENT, "瞬开与主接口mainPicNative数据不一致，oldHasPic: " + onlVar.d + ", newHasPic: " + onlVar2.d + ", nid: " + this.k + ", channel: " + C().k().W + ", newType: " + C().k().L + ", traceId: " + this.W + ", subtype: " + this.h, new HashMap());
        }
    }

    public void a(String str, String str2, String str3, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d5d0b6a", new Object[]{this, str, str2, str3, jSONObject});
            return;
        }
        this.H = new JSONObject();
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        this.H.put("feature", (Object) jSONObject);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject.put("mainPicContainer", (Object) jSONObject2);
        jSONObject2.put("bottomAreaBasic", (Object) jSONObject.getString("bottomAreaBasic"));
        jSONObject2.put("enableBlurImage", (Object) jSONObject.getString("enableBlurImage"));
        this.V = new a();
        a aVar = this.V;
        aVar.b = str;
        aVar.f27945a = str2;
        aVar.c = str3;
        aVar.d = jSONObject.getString("bottomAreaBasic");
        this.V.e = !"false".equals(jSONObject.getString("enableBlurImage"));
    }

    private void S() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a7235a", new Object[]{this});
        } else if (this.M == null) {
            this.e = false;
        } else {
            JSONObject jSONObject = this.M.getJSONObject("newMainPicData");
            if (jSONObject == null) {
                this.e = false;
            } else if ("9:16".equals(jSONObject.getString(fho.KEY_CONTAINER_DIMENSION))) {
                this.e = true;
            } else {
                this.e = false;
            }
        }
    }

    private boolean T() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4b53adf", new Object[]{this})).booleanValue();
        }
        if (this.N == null || this.N.size() <= 0) {
            return false;
        }
        this.c.clear();
        boolean z = false;
        for (int i = 0; i < this.N.size(); i++) {
            if (a(i, this.N.getJSONObject(i))) {
                z = true;
            }
        }
        V();
        return z;
    }

    private void U() {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c3525c", new Object[]{this});
            return;
        }
        if (this.J != null) {
            this.b = MainMediaInfo.transformToMainMediaInfo(this.J.getJSONObject("mainMedia"));
            if (this.b == null) {
                z = false;
            }
        }
        a("useNativeMedia", Boolean.valueOf(z));
    }

    private void V() {
        JSONObject jSONObject;
        JSONArray jSONArray;
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d169dd", new Object[]{this});
            return;
        }
        JSONObject jSONObject3 = this.M.getJSONObject("newMainPicData");
        if (jSONObject3 == null || (jSONObject = jSONObject3.getJSONObject("content")) == null || (jSONArray = jSONObject.getJSONArray("mainPicList")) == null || (jSONObject2 = jSONArray.getJSONObject(0)) == null) {
            return;
        }
        this.aa = jSONObject2.getString("dimension");
    }

    private boolean a(int i, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4e86c6b9", new Object[]{this, new Integer(i), jSONObject})).booleanValue();
        }
        if (jSONObject == null) {
            return false;
        }
        String string = jSONObject.getString("position");
        String string2 = jSONObject.getString("containerName");
        if ("fixed".equals(string) && i == 0) {
            f(jSONObject);
            return false;
        } else if (!PopStrategy.IDENTIFIER_FLOAT.equals(string)) {
            return false;
        } else {
            CardInnerCommonNode a2 = a(jSONObject, fhh.a(string2));
            if (c(a2)) {
                this.c.add(a2);
            }
            return true;
        }
    }

    private boolean c(CardInnerCommonNode cardInnerCommonNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3fe65b95", new Object[]{this, cardInnerCommonNode})).booleanValue();
        }
        if (cardInnerCommonNode != null) {
            return !d(cardInnerCommonNode.containerName);
        }
        fjp.b((d) this, "main", "10013", "生成DetailCardInnerNode失败", false);
        return false;
    }

    private void f(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9040aa3", new Object[]{this, jSONObject});
            return;
        }
        CardInnerCommonNode d = d(jSONObject);
        if (d == null || !d.isUrlValid()) {
            this.ab = true;
            if (this.G != null) {
                d = a(d, this.G.c(this.g));
            }
        } else {
            this.ab = false;
        }
        if (d != null && d.isUrlValid()) {
            this.f27944a = d;
        }
        if (ipa.q()) {
            String a2 = this.f27944a.containerInfo.a();
            if (!a2.contains(b.WX_TPL)) {
                a2 = a2 + "&_wx_tpl=https://dev.g.alicdn.com/newdetail/newflow/0.0.74/weex/home.v20.wlm";
            }
            if (!ipa.ae()) {
                fjt.a(fjt.TAG_TIP, "contentNewWeexUrl = " + a2);
                if (ipa.aq()) {
                    a2 = a2 + "&weex_cache_disabled=true";
                }
            }
            this.f27944a.containerInfo.a(a2);
        } else if (!fjk.a() || this.f27944a == null) {
        } else {
            String c = fky.c(Global.getApplication(), this.f27944a.containerName);
            if (fig.k != 1 || TextUtils.isEmpty(c) || this.f27944a.containerInfo == null) {
                return;
            }
            Uri.Builder buildUpon = Uri.parse(this.f27944a.containerInfo.a()).buildUpon();
            buildUpon.appendQueryParameter(b.WX_TPL, c);
            buildUpon.appendQueryParameter("weex_cache_disabled", "true");
            this.f27944a.containerInfo.a(buildUpon.toString());
        }
    }

    public JSONObject c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("97ef1e8a", new Object[]{this});
        }
        JSONObject g = g();
        if (g == null) {
            return new JSONObject();
        }
        return g.getJSONObject(JTrackParams.TRACK_PARAMS);
    }

    public JSONObject d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("ab96f20b", new Object[]{this});
        }
        JSONObject g = g();
        if (g == null) {
            return new JSONObject();
        }
        JSONObject jSONObject = g.getJSONObject("umbParams");
        if (jSONObject == null) {
            return new JSONObject();
        }
        jSONObject.put("bizIdentifyParams", (Object) jSONObject.getString("aliBizCode"));
        return jSONObject;
    }

    public String e() {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this}) : (this.H == null || (jSONObject = this.H.getJSONObject("seller")) == null) ? "" : jSONObject.getString("userId");
    }

    public boolean f() {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[]{this})).booleanValue();
        }
        if (this.H != null && (jSONObject = this.H.getJSONObject("seller")) != null) {
            return "B".equals(jSONObject.getString("sellerType"));
        }
        return false;
    }

    public JSONObject g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("e68e6c8e", new Object[]{this});
        }
        if (this.H != null) {
            return this.H.getJSONObject("params");
        }
        return null;
    }

    public JSONObject h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("fa36400f", new Object[]{this});
        }
        if (this.H != null) {
            return this.H.getJSONObject("item");
        }
        return null;
    }

    public JSONObject i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("dde1390", new Object[]{this});
        }
        if (this.H != null) {
            return this.H.getJSONObject("price");
        }
        return null;
    }

    public String j() {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6aaa74cf", new Object[]{this});
        }
        if (this.H != null && (jSONObject = this.H.getJSONObject("item")) != null) {
            return jSONObject.getString("itemid");
        }
        return null;
    }

    @Override // com.taobao.android.detail2.core.framework.data.model.d
    public void a(CardInnerCommonNode cardInnerCommonNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3194970f", new Object[]{this, cardInnerCommonNode});
        } else {
            this.f27944a = cardInnerCommonNode;
        }
    }

    @Override // com.taobao.android.detail2.core.framework.data.model.d
    public void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
        } else {
            this.f27944a = null;
        }
    }

    public long l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6076ee7", new Object[]{this})).longValue();
        }
        CardInnerCommonNode cardInnerCommonNode = this.f27944a;
        if (cardInnerCommonNode != null && cardInnerCommonNode.containerInfo != null && this.f27944a.containerInfo.c != null) {
            return this.f27944a.containerInfo.c.f11503a;
        }
        return -1L;
    }

    public String m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fe3ba4ac", new Object[]{this});
        }
        CardInnerCommonNode cardInnerCommonNode = this.f27944a;
        if (cardInnerCommonNode != null && cardInnerCommonNode.containerInfo != null) {
            return this.f27944a.containerInfo.a();
        }
        return null;
    }

    public String n() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("84c15f4b", new Object[]{this}) : this.aa;
    }

    public boolean o() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("631b57a", new Object[]{this})).booleanValue() : this.ab;
    }

    public MainMediaInfo W() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MainMediaInfo) ipChange.ipc$dispatch("b72edf79", new Object[]{this});
        }
        onl onlVar = this.ae;
        if (onlVar != null) {
            return onlVar.a();
        }
        MainMediaInfo mainMediaInfo = this.b;
        if (mainMediaInfo == null) {
            return null;
        }
        return mainMediaInfo;
    }

    public boolean X() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4ed98e3", new Object[]{this})).booleanValue();
        }
        onl onlVar = this.ae;
        if (onlVar != null) {
            return onlVar.c.h;
        }
        return !"false".equals(H().getString("enableBlurImage"));
    }

    public static flu p() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (flu) ipChange.ipc$dispatch("826d5720", new Object[0]) : new flu() { // from class: tb.fhi.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.flu
            public d a(com.taobao.android.detail2.core.framework.b bVar) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (d) ipChange2.ipc$dispatch("653177b5", new Object[]{this, bVar}) : new fhi(bVar.h());
            }
        };
    }
}
