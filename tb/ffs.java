package tb;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.event.a;
import com.taobao.android.detail.datasdk.model.viewmodel.main.TitleViewModel;
import com.taobao.android.detail.datasdk.protocol.model.share.ShareModel;
import com.taobao.android.detail.wrapper.newdesc.NewDetailDescManager;
import com.taobao.android.trade.event.ThreadMode;
import com.taobao.android.trade.event.i;
import com.taobao.android.trade.event.j;
import com.taobao.share.globalmodel.e;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes5.dex */
public class ffs implements j<eoi> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public List<String> f27908a = null;
    private String b;
    private Context c;
    private NewDetailDescManager d;
    private HashMap<String, String> e;

    static {
        kge.a(-2061779123);
        kge.a(-1453870097);
    }

    @Override // com.taobao.android.trade.event.j
    public /* synthetic */ i handleEvent(eoi eoiVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (i) ipChange.ipc$dispatch("caa7474e", new Object[]{this, eoiVar}) : a(eoiVar);
    }

    public ffs(Context context, NewDetailDescManager newDetailDescManager) {
        this.c = context;
        this.d = newDetailDescManager;
        emu.a("com.taobao.android.detail.wrapper.newdesc.event.ShareSubscriber");
    }

    private HashMap<String, String> a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("12dd5eeb", new Object[]{this, jSONObject});
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("resource");
        if (jSONObject2 == null || jSONObject2.isEmpty()) {
            com.taobao.android.detail.core.utils.i.a("[share][newdesc]ShareSubscriber", "resource null");
            return null;
        }
        JSONObject jSONObject3 = jSONObject2.getJSONObject("share");
        if (jSONObject3 == null || jSONObject3.isEmpty()) {
            com.taobao.android.detail.core.utils.i.a("[share][newdesc]ShareSubscriber", "share null");
            return null;
        }
        JSONObject jSONObject4 = jSONObject3.getJSONObject("params");
        if (jSONObject4 == null || jSONObject4.isEmpty()) {
            com.taobao.android.detail.core.utils.i.a("[share][newdesc]ShareSubscriber", "params null");
            return null;
        }
        HashMap<String, String> hashMap = new HashMap<>();
        for (Map.Entry<String, Object> entry : jSONObject4.entrySet()) {
            hashMap.put(entry.getKey(), String.valueOf(entry.getValue()));
        }
        return hashMap;
    }

    private String b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3f1ccf59", new Object[]{this, jSONObject});
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("item");
        if (jSONObject2 == null || jSONObject2.isEmpty()) {
            return "";
        }
        String string = jSONObject2.getString("itemId");
        return StringUtils.isEmpty(string) ? "" : string;
    }

    private String c(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6871249a", new Object[]{this, jSONObject});
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("item");
        if (jSONObject2 == null || jSONObject2.isEmpty()) {
            return "";
        }
        String string = jSONObject2.getString("title");
        return StringUtils.isEmpty(string) ? "" : string;
    }

    private String d(JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("91c579db", new Object[]{this, jSONObject});
        }
        JSONObject jSONObject3 = jSONObject.getJSONObject("price");
        if (jSONObject3 == null || jSONObject3.isEmpty() || (jSONObject2 = jSONObject3.getJSONObject("price")) == null || jSONObject2.isEmpty()) {
            return "";
        }
        String string = jSONObject2.getString("priceText");
        return StringUtils.isEmpty(string) ? "" : string;
    }

    private String e(JSONObject jSONObject) {
        JSONArray jSONArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bb19cf1c", new Object[]{this, jSONObject});
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("price");
        if (jSONObject2 != null && !jSONObject2.isEmpty() && (jSONArray = jSONObject2.getJSONArray("extraPrices")) != null && !jSONArray.isEmpty()) {
            JSONObject jSONObject3 = null;
            Iterator<Object> it = jSONArray.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (next instanceof JSONObject) {
                    JSONObject jSONObject4 = (JSONObject) next;
                    if (jSONObject4.getIntValue("type") == 2) {
                        jSONObject3 = jSONObject4;
                        break;
                    }
                }
            }
            if (jSONObject3 != null && !jSONObject3.isEmpty()) {
                String string = jSONObject3.getString("priceText");
                return StringUtils.isEmpty(string) ? "" : string;
            }
        }
        return "";
    }

    private boolean f(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e9040aa7", new Object[]{this, jSONObject})).booleanValue();
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("vertical");
        return (jSONObject2 == null || jSONObject2.isEmpty() || jSONObject2.getJSONObject("jhs") == null) ? false : true;
    }

    private List<String> g(JSONObject jSONObject) {
        JSONArray jSONArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("8ec77ec5", new Object[]{this, jSONObject});
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("item");
        ArrayList arrayList = null;
        if (jSONObject2 != null && !jSONObject2.isEmpty() && (jSONArray = jSONObject2.getJSONArray("images")) != null && !jSONArray.isEmpty()) {
            arrayList = new ArrayList();
            Iterator<Object> it = jSONArray.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (next instanceof String) {
                    arrayList.add((String) next);
                }
            }
        }
        return arrayList;
    }

    public i a(eoi eoiVar) {
        String str;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (i) ipChange.ipc$dispatch("a63f3ed6", new Object[]{this, eoiVar});
        }
        if (!(this.c instanceof Activity)) {
            com.taobao.android.detail.core.utils.i.a("[share][newdesc]ShareSubscriber", "mContext not instanceof Activity");
            return a.FAILURE;
        }
        JSONObject currentItemData = this.d.getCurrentItemData();
        if (currentItemData == null || currentItemData.isEmpty()) {
            com.taobao.android.detail.core.utils.i.a("[share][newdesc]ShareSubscriber", "itemData null");
            return a.FAILURE;
        }
        this.e = a(currentItemData);
        this.f27908a = new ArrayList();
        String b = b(currentItemData);
        this.b = c(currentItemData);
        String d = d(currentItemData);
        String str3 = null;
        if (eoiVar.b == null || !eoiVar.b.containsKey("share_businessId") || !eoiVar.b.containsKey("share_imageUrl")) {
            str = null;
        } else {
            str3 = eoiVar.b.remove("share_businessId");
            str = eoiVar.b.remove("share_imageUrl");
        }
        String e = e(currentItemData);
        Uri.Builder buildUpon = Uri.parse(e.NAV_URL_DETAIL_BASE + b + ".htm").buildUpon();
        if (!StringUtils.isEmpty(d)) {
            buildUpon.appendQueryParameter("price", d);
        }
        if (!StringUtils.isEmpty(e)) {
            buildUpon.appendQueryParameter("original_price", e);
        }
        buildUpon.appendQueryParameter("sourceType", "item");
        if (eoiVar != null && eoiVar.b != null) {
            for (Map.Entry<String, String> entry : eoiVar.b.entrySet()) {
                if (entry != null) {
                    buildUpon.appendQueryParameter(entry.getKey(), entry.getValue());
                }
            }
        }
        String builder = buildUpon.toString();
        if (f(currentItemData)) {
            str2 = this.c.getResources().getString(R.string.notice_share_juhuasuan) + this.b + this.c.getResources().getString(R.string.notice_share_tair);
        } else {
            str2 = this.b;
        }
        ShareModel shareModel = new ShareModel();
        shareModel.link = builder;
        shareModel.price = d;
        if (TitleViewModel.ShareType.SHARE_TYPE_AWARD == eoiVar.f27500a) {
            shareModel.title = " 想告诉谁";
            shareModel.msg = String.format(Locale.CHINA, "我剁手都要买的宝贝（%s），快来和我一起瓜分红包", this.b);
            shareModel.isActivity = "true";
            shareModel.businessId = "baobeixiangqingfenxiang";
        } else {
            shareModel.msg = str2;
            shareModel.title = "想告诉谁";
        }
        try {
            if (this.e.containsKey("bizId") && !StringUtils.isEmpty(this.e.get("bizId"))) {
                shareModel.businessId = this.e.get("bizId");
            }
        } catch (Exception e2) {
            com.taobao.android.detail.core.utils.i.a("ShareSubscriber", "handleEvent: 获取bizId过程中发生错误, exception: ", e2);
        }
        List<String> g = g(currentItemData);
        if (g != null) {
            this.f27908a.addAll(g);
        }
        if (StringUtils.isEmpty(shareModel.businessId) && !StringUtils.isEmpty(str3) && !StringUtils.isEmpty(str)) {
            shareModel.businessId = str3;
            this.f27908a.remove(str);
            this.f27908a.add(0, str);
        }
        shareModel.picUrlList = this.f27908a;
        epr.a((Activity) this.c, shareModel, this.e);
        StringBuilder sb = new StringBuilder();
        sb.append("shareItem:");
        sb.append(JSON.toJSONString(shareModel));
        sb.append(", activityParams:");
        sb.append(this.e);
        com.taobao.android.detail.core.utils.i.d("[share][newdesc]ShareSubscriber", sb.toString() == null ? "null" : JSON.toJSONString(this.e));
        return a.SUCCESS;
    }

    @Override // com.taobao.android.trade.event.j
    public ThreadMode getThreadMode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ThreadMode) ipChange.ipc$dispatch("6de50c9b", new Object[]{this}) : ThreadMode.MainThread;
    }
}
