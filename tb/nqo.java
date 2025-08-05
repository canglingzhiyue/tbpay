package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alipay.zoloz.toyger.blob.BlobManager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.nx3.bean.TemplateBean;
import com.taobao.ju.track.server.JTrackParams;
import com.taobao.search.common.util.ab;
import com.taobao.search.common.util.k;
import com.taobao.search.searchdoor.sf.widgets.activate.data.bean.ActivateTypedBean;
import com.taobao.search.searchdoor.sf.widgets.activate.data.bean.HintGuideBean;
import com.taobao.search.searchdoor.sf.widgets.activate.data.bean.HistoryCellBean;
import com.taobao.search.searchdoor.sf.widgets.activate.data.bean.MuiseActivateCellBean;
import com.taobao.search.searchdoor.sf.widgets.activate.data.bean.WeexActivateCellBean;
import com.taobao.search.searchdoor.sf.widgets.activate.data.bean.b;
import com.taobao.search.searchdoor.sf.widgets.activate.data.bean.c;
import com.taobao.search.sf.j;
import com.taobao.tao.flexbox.layoutmanager.container.dx.DxContainerActivity;
import com.taobao.taolive.room.utils.aw;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class nqo extends npp<b> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String b;
    private final itw c;
    private boolean d;

    static {
        kge.a(1594367);
    }

    public static /* synthetic */ Object ipc$super(nqo nqoVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.taobao.search.searchdoor.sf.widgets.activate.data.bean.b, java.lang.Object] */
    @Override // tb.npp
    public /* synthetic */ b b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("43b9c269", new Object[]{this}) : a();
    }

    /* JADX WARN: Type inference failed for: r4v4, types: [com.taobao.search.searchdoor.sf.widgets.activate.data.bean.b, java.lang.Object] */
    @Override // tb.npp
    public /* synthetic */ b b(JSONObject jSONObject, nul nulVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("6b4445f2", new Object[]{this, jSONObject, nulVar}) : a(jSONObject, nulVar);
    }

    public nqo(String str) {
        this.c = new ab();
        this.d = false;
        this.b = str;
    }

    public nqo(String str, boolean z) {
        this.c = new ab();
        this.d = false;
        this.b = str;
        this.d = z;
    }

    public b a(com.alibaba.fastjson.JSONObject jSONObject) {
        com.alibaba.fastjson.JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("d116e75a", new Object[]{this, jSONObject});
        }
        b bVar = new b();
        bVar.s = true;
        if (jSONObject == null) {
            return bVar;
        }
        String string = jSONObject.getString(aw.PARAM_PVID);
        String string2 = jSONObject.getString("tpp_trace");
        HashMap hashMap = new HashMap();
        hashMap.put("pvId", string);
        hashMap.put("tppTrace", string2);
        JSONArray jSONArray = jSONObject.getJSONArray("result");
        if (jSONArray == null || jSONArray.size() == 0 || (jSONObject2 = jSONArray.getJSONObject(0)) == null) {
            return bVar;
        }
        bVar.b = this.b;
        bVar.f19366a = jSONObject2.getString(k.KEY_SUGGEST_RN);
        hashMap.put("suggestRn", bVar.f19366a);
        a(jSONObject2, bVar, (ioz) null);
        if (!TextUtils.isEmpty(string)) {
            bVar.i.put(aw.PARAM_PVID, string);
        }
        return bVar;
    }

    private void a(com.alibaba.fastjson.JSONObject jSONObject, b bVar, ioz iozVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52831e70", new Object[]{this, jSONObject, bVar, iozVar});
        } else if (jSONObject == null) {
            if (iozVar == null) {
                return;
            }
            iozVar.f29197a = sft.LIVE_ALGO_FAILURE_RESULT_ISNULL_ERROR;
        } else {
            JSONArray jSONArray = jSONObject.getJSONArray("searchdoor");
            if (jSONArray == null || jSONArray.size() == 0) {
                if (iozVar == null) {
                    return;
                }
                iozVar.f29197a = "searchdoor array is empty";
                return;
            }
            bVar.d = new ArrayList();
            npy d = npz.a().d();
            if (d == null) {
                if (iozVar == null) {
                    return;
                }
                iozVar.f29197a = "parser is null";
                return;
            }
            StringBuilder sb = new StringBuilder();
            boolean z = false;
            for (int i = 0; i < jSONArray.size(); i++) {
                com.alibaba.fastjson.JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                if (jSONObject2 != null) {
                    if (jSONObject2.getString("tItemType").equals("ms_tb-webb-widget-cloud_search_door_trending_hot_textList")) {
                        jSONObject2.put("tItemType", "nt_hot_spots");
                    } else if (jSONObject2.getString("tItemType").equals("ms_tb-webb-widget_search_door_guess_discovery")) {
                        jSONObject2.put("tItemType", "nt_search_door_guess_discovery");
                    }
                    ActivateTypedBean a2 = d.a(jSONObject2, bVar);
                    if (a2 != null) {
                        if ((a2 instanceof MuiseActivateCellBean) || (a2 instanceof WeexActivateCellBean)) {
                            z = true;
                        }
                        sb.append(a2.type);
                        sb.append("/");
                        if ((a2 instanceof HistoryCellBean) && bVar.c == null) {
                            bVar.c = (HistoryCellBean) a2;
                        }
                        bVar.d.add(a2);
                    }
                }
            }
            bVar.t = z;
            if (iozVar == null) {
                return;
            }
            iozVar.f29197a = sb.toString();
        }
    }

    public b a(JSONObject jSONObject, nul nulVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("a9ac8461", new Object[]{this, jSONObject, nulVar});
        }
        b bVar = new b();
        if (jSONObject == null) {
            nul.a(nulVar, "DataConvert", "-1", "JSON is empty");
            return bVar;
        }
        bVar.r = jSONObject.toString();
        c(bVar, jSONObject);
        String optString = jSONObject.optString(aw.PARAM_PVID);
        String optString2 = jSONObject.optString("tpp_trace");
        a(jSONObject, bVar);
        HashMap hashMap = new HashMap();
        hashMap.put("pvId", optString);
        hashMap.put("tppTrace", optString2);
        org.json.JSONArray optJSONArray = jSONObject.optJSONArray("result");
        if (optJSONArray == null || optJSONArray.length() == 0) {
            hashMap.put("errCode", "-1");
            hashMap.put("errMsg", "result array is empty");
            nul.b(nulVar, "DataConvert", hashMap);
            return bVar;
        }
        JSONObject optJSONObject = optJSONArray.optJSONObject(0);
        if (optJSONObject == null) {
            hashMap.put("errCode", "-1");
            hashMap.put("errMsg", sft.LIVE_ALGO_FAILURE_RESULT_ISNULL_ERROR);
            nul.b(nulVar, "DataConvert", hashMap);
            return bVar;
        }
        bVar.b = this.b;
        bVar.f19366a = optJSONObject.optString(k.KEY_SUGGEST_RN);
        hashMap.put("suggestRn", bVar.f19366a);
        bVar.l = optJSONObject;
        ioz iozVar = new ioz();
        a(optJSONObject, bVar, iozVar);
        hashMap.put("pageStruct", iozVar.f29197a);
        bVar.f = npw.a(optJSONObject.optJSONObject("searchhint"), bVar.f19366a);
        ioz iozVar2 = new ioz();
        bVar.g = a(jSONObject, iozVar2);
        this.c.a(bVar.g);
        hashMap.put("templates", iozVar2.f29197a);
        bVar.j = optJSONObject.optString("searchDoorWeexUrl");
        if (!TextUtils.isEmpty(optString)) {
            bVar.i.put(aw.PARAM_PVID, optString);
        }
        JSONObject optJSONObject2 = jSONObject.optJSONObject(JTrackParams.TRACK_PARAMS);
        if (optJSONObject2 != null) {
            Iterator<String> keys = optJSONObject2.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                String optString3 = optJSONObject2.optString(next);
                if (!TextUtils.isEmpty(next) && !TextUtils.isEmpty(optString3)) {
                    bVar.i.put(next, optString3);
                }
            }
        }
        a(bVar, optJSONObject);
        b(bVar, optJSONObject);
        nul.a(nulVar, "DataConvert", hashMap);
        return bVar;
    }

    private void c(b bVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ca35e88", new Object[]{this, bVar, jSONObject});
            return;
        }
        JSONObject optJSONObject = jSONObject.optJSONObject("switchWhiteList");
        if (optJSONObject != null) {
            bVar.o = optJSONObject.optBoolean("openNewVoiceService");
            bVar.p = optJSONObject.optBoolean("openNewVoiceStyle");
        }
        JSONObject optJSONObject2 = jSONObject.optJSONObject("pageInfo");
        if (optJSONObject2 == null) {
            return;
        }
        bVar.q = JSON.parseObject(optJSONObject2.toString());
    }

    private void a(b bVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57ed30ca", new Object[]{this, bVar, jSONObject});
            return;
        }
        JSONObject optJSONObject = jSONObject.optJSONObject("guideBubble");
        if (optJSONObject == null) {
            return;
        }
        HintGuideBean hintGuideBean = new HintGuideBean();
        hintGuideBean.setTotalCount(optJSONObject.optInt("m"));
        hintGuideBean.setShowInterval(optJSONObject.optInt("n"));
        hintGuideBean.setNameSpace(optJSONObject.optString(DxContainerActivity.PARAMS_NAMESPACE));
        hintGuideBean.setShowText(optJSONObject.optString("showText"));
        bVar.m = hintGuideBean;
    }

    private void b(b bVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba4847a9", new Object[]{this, bVar, jSONObject});
            return;
        }
        JSONObject optJSONObject = jSONObject.optJSONObject(BlobManager.BLOB_ELEM_TYPE_CAMERA);
        if (optJSONObject == null) {
            return;
        }
        c cVar = new c();
        cVar.f19367a = optJSONObject.optInt("n");
        cVar.b = optJSONObject.optInt("m");
        cVar.c = optJSONObject.optString(DxContainerActivity.PARAMS_NAMESPACE);
        cVar.d = optJSONObject.optString("lottieUrl");
        bVar.n = cVar;
    }

    private void a(JSONObject jSONObject, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d43c0ee2", new Object[]{this, jSONObject, bVar});
            return;
        }
        JSONObject optJSONObject = jSONObject.optJSONObject("review");
        if (optJSONObject == null) {
            return;
        }
        bVar.e = new nrh();
        bVar.e.a(Boolean.valueOf(optJSONObject.optBoolean("show")));
        bVar.e.a(optJSONObject.optString("h5Url"));
        bVar.e.b(optJSONObject.optString("iconUrl"));
        bVar.e.c(optJSONObject.optString("showText"));
        bVar.e.d(nrh.TYPE_ACTIVATE);
    }

    private void a(JSONObject jSONObject, b bVar, ioz iozVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74c0f6be", new Object[]{this, jSONObject, bVar, iozVar});
        } else if (jSONObject == null) {
            if (iozVar == null) {
                return;
            }
            iozVar.f29197a = sft.LIVE_ALGO_FAILURE_RESULT_ISNULL_ERROR;
        } else {
            org.json.JSONArray optJSONArray = jSONObject.optJSONArray("searchdoor");
            if (optJSONArray == null || optJSONArray.length() == 0) {
                if (iozVar == null) {
                    return;
                }
                iozVar.f29197a = "searchdoor array is empty";
                return;
            }
            bVar.d = new ArrayList();
            npy d = npz.a().d();
            if (d == null) {
                if (iozVar == null) {
                    return;
                }
                iozVar.f29197a = "parser is null";
                return;
            }
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < optJSONArray.length(); i++) {
                com.alibaba.fastjson.JSONObject parseObject = JSON.parseObject(optJSONArray.optString(i));
                if (parseObject != null) {
                    if (this.d) {
                        if (parseObject.getString("tItemType").equals("ms_tb-webb-widget-cloud_search_door_trending_hot_textList")) {
                            parseObject.put("tItemType", (Object) "nt_hot_spots");
                        } else if (parseObject.getString("tItemType").equals("ms_tb-webb-widget_search_door_guess_discovery")) {
                            parseObject.put("tItemType", (Object) "nt_search_door_guess_discovery");
                        }
                    }
                    ActivateTypedBean a2 = d.a(parseObject, bVar);
                    if (a2 != null) {
                        sb.append(a2.type);
                        sb.append("/");
                        if ((a2 instanceof HistoryCellBean) && bVar.c == null) {
                            bVar.c = (HistoryCellBean) a2;
                        }
                        bVar.d.add(a2);
                    }
                }
            }
            if (iozVar == null) {
                return;
            }
            iozVar.f29197a = sb.toString();
        }
    }

    public b a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("e3a9227a", new Object[]{this}) : new b();
    }

    private Map<String, TemplateBean> a(JSONObject jSONObject, ioz iozVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("47d99ce7", new Object[]{this, jSONObject, iozVar});
        }
        String optString = jSONObject.optString("templates");
        if (!TextUtils.isEmpty(optString)) {
            return iub.a(JSONArray.parseArray(optString), iozVar, j.f19452a);
        }
        return null;
    }
}
