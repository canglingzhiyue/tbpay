package com.taobao.detail.rate.vivid.ability;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.detail.rate.mtop.RateTranslateRequest;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.MtopBusiness;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.intf.Mtop;
import tb.dkx;
import tb.dla;
import tb.dle;
import tb.dlg;
import tb.dlh;
import tb.dll;
import tb.dln;
import tb.tfu;

/* loaded from: classes7.dex */
public class f extends dlg {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CALLBACK_FAILURE = "failure";
    public static final String CALLBACK_SUCCESS = "success";
    public static final long XRATETRANSLATE = 237350168599775648L;

    public static /* synthetic */ Object ipc$super(f fVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ JSONObject a(f fVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("31b75905", new Object[]{fVar, jSONObject}) : fVar.a(jSONObject);
    }

    public static /* synthetic */ List a(f fVar, JSONArray jSONArray, List list) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("59ad1343", new Object[]{fVar, jSONArray, list}) : fVar.a(jSONArray, (List<String>) list);
    }

    @Override // tb.dlg
    public dkx a(dlh dlhVar, dle dleVar, dll dllVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dkx) ipChange.ipc$dispatch("1c5b757e", new Object[]{this, dlhVar, dleVar, dllVar});
        }
        if (dlhVar == null || dlhVar.c() == null) {
            dllVar.callback("failure", new dla(new JSONObject()));
            return new dla();
        }
        JSONObject a2 = dlhVar.a("data");
        if (a2 == null || a2.size() == 0) {
            dllVar.callback("failure", new dla(new JSONObject()));
            return new dla();
        }
        a(a2, a((Object) a2), dllVar);
        return new dla();
    }

    private List<String> a(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("18196f83", new Object[]{this, obj});
        }
        ArrayList arrayList = new ArrayList();
        a(obj, arrayList);
        return arrayList;
    }

    private static void a(Object obj, List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5ce9735", new Object[]{obj, list});
        } else if (obj instanceof JSONObject) {
            JSONObject jSONObject = (JSONObject) obj;
            for (String str : jSONObject.keySet()) {
                a(jSONObject.get(str), list);
            }
        } else if (obj instanceof JSONArray) {
            JSONArray jSONArray = (JSONArray) obj;
            for (int i = 0; i < jSONArray.size(); i++) {
                a(jSONArray.get(i), list);
            }
        } else if (obj instanceof String) {
            String str2 = (String) obj;
            if (!a(str2)) {
                return;
            }
            list.add(str2);
        }
    }

    private static boolean a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{str})).booleanValue() : Pattern.compile("[\\u4E00-\\u9FA5]").matcher(str).find();
    }

    private void a(final JSONObject jSONObject, final List<String> list, final dll dllVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14edfa85", new Object[]{this, jSONObject, list, dllVar});
        } else if (list.size() <= 0) {
            dllVar.callback("success", new dla(jSONObject));
        } else {
            RateTranslateRequest rateTranslateRequest = new RateTranslateRequest();
            rateTranslateRequest.bizScene = "mtop_online_comment";
            rateTranslateRequest.sourceTextFormatType = "text";
            rateTranslateRequest.sourceTextContentType = tfu.COMMENT;
            rateTranslateRequest.sourceLanguage = "zh_CN";
            rateTranslateRequest.targetLanguage = "en_US";
            rateTranslateRequest.sourceTextList = list;
            MtopBusiness.build(Mtop.instance(null), rateTranslateRequest).registerListener((IRemoteListener) new IRemoteBaseListener() { // from class: com.taobao.detail.rate.vivid.ability.XRateTranslateAbility$1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
                public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                    } else {
                        dllVar.callback("failure", new dla(new JSONObject()));
                    }
                }

                @Override // com.taobao.tao.remotebusiness.IRemoteListener
                public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                    JSONArray jSONArray;
                    List a2;
                    IpChange ipChange2 = $ipChange;
                    boolean z = false;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                        return;
                    }
                    JSONObject parseObject = JSONObject.parseObject(mtopResponse.getDataJsonObject().toString());
                    JSONObject jSONObject2 = null;
                    if (parseObject != null && !parseObject.isEmpty() && (jSONArray = parseObject.getJSONArray("translateResponseList")) != null && jSONArray.size() > 0 && (a2 = f.a(f.this, jSONArray, list)) != null) {
                        jSONObject2 = f.a(f.this, jSONObject);
                        if (jSONObject2 != null) {
                            f.a(jSONObject2, list, a2);
                        } else {
                            jSONObject2 = jSONObject;
                        }
                        z = true;
                    }
                    if (z) {
                        dllVar.callback("success", new dla(jSONObject2));
                    } else {
                        dllVar.callback("failure", new dla(new JSONObject()));
                    }
                }

                @Override // com.taobao.tao.remotebusiness.IRemoteListener
                public void onError(int i, MtopResponse mtopResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                    } else {
                        dllVar.callback("failure", new dla(new JSONObject()));
                    }
                }
            }).mo1305reqMethod(MethodEnum.POST).startRequest();
        }
    }

    public static void a(Object obj, List<String> list, List<String> list2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9da1a26", new Object[]{obj, list, list2});
        } else if (obj instanceof JSONObject) {
            JSONObject jSONObject = (JSONObject) obj;
            for (String str : jSONObject.keySet()) {
                Object obj2 = jSONObject.get(str);
                if ((obj2 instanceof String) && a((String) obj2)) {
                    int indexOf = list.indexOf(obj2);
                    if (indexOf != -1) {
                        jSONObject.put(str, (Object) list2.get(indexOf));
                    }
                } else {
                    a(obj2, list, list2);
                }
            }
        } else if (obj instanceof JSONArray) {
            JSONArray jSONArray = (JSONArray) obj;
            for (int i = 0; i < jSONArray.size(); i++) {
                Object obj3 = jSONArray.get(i);
                if ((obj3 instanceof String) && a((String) obj3)) {
                    int indexOf2 = list.indexOf(obj3);
                    if (indexOf2 != -1) {
                        jSONArray.add(i, list2.get(indexOf2));
                    }
                } else {
                    a(obj3, list, list2);
                }
            }
        }
    }

    private JSONObject a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("429586a8", new Object[]{this, jSONObject}) : JSON.parseObject(JSON.toJSONString(jSONObject));
    }

    private List<String> a(JSONArray jSONArray, List<String> list) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("8e704da6", new Object[]{this, jSONArray, list});
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < jSONArray.size(); i++) {
            Object obj = jSONArray.get(i);
            if (obj instanceof JSONObject) {
                JSONObject jSONObject = (JSONObject) obj;
                arrayList2.add(jSONObject.getString("sourceText"));
                arrayList.add(jSONObject.getString("targetText"));
            }
        }
        if (list == null || !list.equals(arrayList2)) {
            z = false;
        }
        if (!z) {
            return null;
        }
        return arrayList;
    }

    /* loaded from: classes7.dex */
    public static class a implements dln {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.dln
        public /* synthetic */ dlg b(Object obj) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (dlg) ipChange.ipc$dispatch("1766b262", new Object[]{this, obj}) : a(obj);
        }

        public f a(Object obj) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (f) ipChange.ipc$dispatch("22fd2015", new Object[]{this, obj}) : new f();
        }
    }
}
