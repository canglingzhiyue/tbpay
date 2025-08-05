package com.taobao.android.detail.industry.hourlydelivery;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.triver.triver_shop.newShop.ext.m;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import com.taobao.codetrack.sdk.assets.AssetsDelegate;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.MtopBusiness;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import tb.kge;

/* loaded from: classes4.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a */
    private Map<String, String> f10080a;
    private boolean b = false;
    private String c;
    private String d;

    /* loaded from: classes4.dex */
    public interface a {
        void a();

        void a(DXTemplateItem dXTemplateItem);
    }

    /* renamed from: com.taobao.android.detail.industry.hourlydelivery.b$b */
    /* loaded from: classes4.dex */
    public interface InterfaceC0389b {
        void a(JSONObject jSONObject);
    }

    static {
        kge.a(1260503256);
    }

    public static /* synthetic */ void a(b bVar, Context context, String str, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b45bc0af", new Object[]{bVar, context, str, aVar});
        } else {
            bVar.a(context, str, aVar);
        }
    }

    private DXTemplateItem a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXTemplateItem) ipChange.ipc$dispatch("5703255f", new Object[]{this, context});
        }
        String string = PreferenceManager.getDefaultSharedPreferences(context).getString("hourDeliveryDXTemplateItemData", "");
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        b(string);
        return a(string);
    }

    public void a(final Context context, final a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72ab66a6", new Object[]{this, context, aVar});
            return;
        }
        this.b = false;
        DXTemplateItem a2 = a(context);
        if (a2 != null) {
            this.b = true;
            aVar.a(a2);
        }
        MtopRequest mtopRequest = new MtopRequest();
        mtopRequest.setApiName("mtop.taobao.hourly.delivery.config.dx");
        mtopRequest.setVersion("1.0");
        MtopBusiness build = MtopBusiness.build(mtopRequest);
        build.mo1305reqMethod(MethodEnum.POST);
        build.mo1335useWua();
        build.registerListener((IRemoteListener) new IRemoteBaseListener() { // from class: com.taobao.android.detail.industry.hourlydelivery.TBHourDeliveryHelper$1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                } else if (mtopResponse == null || mtopResponse.getBytedata() == null) {
                } else {
                    b.a(b.this, context, new String(mtopResponse.getBytedata()), aVar);
                }
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
            public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                    return;
                }
                com.taobao.android.detail.industry.tool.a.a("TBHourDeliveryHelper", "request data system error : " + mtopResponse);
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                    return;
                }
                com.taobao.android.detail.industry.tool.a.a("TBHourDeliveryHelper", "request data error : " + mtopResponse);
            }
        });
        build.startRequest();
    }

    private void a(Context context, String str, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d298d99c", new Object[]{this, context, str, aVar});
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            a(context, str);
        }
        b(str);
        DXTemplateItem a2 = a(str);
        if (a2 != null && !TextUtils.isEmpty(a2.c)) {
            aVar.a(a2);
        } else if (this.b) {
        } else {
            aVar.a();
        }
    }

    private DXTemplateItem a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXTemplateItem) ipChange.ipc$dispatch("606b2ecd", new Object[]{this, str});
        }
        try {
            JSONObject jSONObject = JSONObject.parseObject(str).getJSONObject("data").getJSONObject("model");
            DXTemplateItem dXTemplateItem = new DXTemplateItem();
            dXTemplateItem.c = jSONObject.getString("url");
            dXTemplateItem.f11925a = jSONObject.getString("name");
            dXTemplateItem.b = jSONObject.getLongValue("version");
            return dXTemplateItem;
        } catch (Exception e) {
            com.taobao.android.detail.industry.tool.a.b("TBHourDeliveryHelper", "parseTemplateItem error : " + e.getMessage());
            return null;
        }
    }

    private void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
            return;
        }
        try {
            JSONObject jSONObject = JSONObject.parseObject(str).getJSONObject("data").getJSONObject("model");
            this.c = jSONObject.getString("updatePageName");
            this.d = jSONObject.getString("updatePageUtParam");
            this.f10080a = a(jSONObject.getJSONObject(m.UPDATE_PAGE_PROPERTIES));
        } catch (Exception e) {
            com.taobao.android.detail.industry.tool.a.b("TBHourDeliveryHelper", "updatePageProperties error : " + e.getMessage());
        }
    }

    private Map<String, String> a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("2b563fbd", new Object[]{this, jSONObject});
        }
        HashMap hashMap = new HashMap();
        for (String str : jSONObject.keySet()) {
            hashMap.put(str, jSONObject.getString(str));
        }
        return hashMap;
    }

    private void a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61b6362a", new Object[]{this, context, str});
            return;
        }
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(context).edit();
        edit.putString("hourDeliveryDXTemplateItemData", str);
        edit.apply();
    }

    public String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this});
        }
        if (TextUtils.isEmpty(this.c)) {
            this.c = "/Page_xsdshouye";
        }
        return this.c;
    }

    public String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : this.d;
    }

    public Map<String, String> c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("3b696c1f", new Object[]{this});
        }
        if (this.f10080a == null) {
            this.f10080a = new HashMap();
        }
        if (this.f10080a.isEmpty()) {
            this.f10080a.put("spm-cnt", "a21xl4.xsd-shouye.0.0");
            this.f10080a.put("xsd_source", "homeTab");
            this.f10080a.put("source", "1");
        }
        return this.f10080a;
    }

    public JSONObject b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("ecf0ff1f", new Object[]{this, context});
        }
        try {
            String string = PreferenceManager.getDefaultSharedPreferences(context).getString("hourDeliverySearchBoxData", "");
            if (TextUtils.isEmpty(string)) {
                return c(context);
            }
            return JSONObject.parseObject(string);
        } catch (Exception e) {
            com.taobao.android.detail.industry.tool.a.b("TBHourDeliveryHelper", "getLocalSearchBoxData error : " + e.getMessage());
            return c(context);
        }
    }

    public void a(final Context context, Map<String, String> map, final InterfaceC0389b interfaceC0389b) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a1d1aa0", new Object[]{this, context, map, interfaceC0389b});
            return;
        }
        MtopRequest mtopRequest = new MtopRequest();
        mtopRequest.setApiName("mtop.xsd.searchbar.info.get");
        mtopRequest.setVersion("1.0");
        if (map != null && !map.isEmpty()) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("extendMap", (Object) JSONObject.toJSONString(map));
            mtopRequest.setData(jSONObject.toJSONString());
        }
        MtopBusiness build = MtopBusiness.build(mtopRequest);
        build.mo1305reqMethod(MethodEnum.POST);
        build.mo1335useWua();
        build.registerListener((IRemoteListener) new IRemoteBaseListener() { // from class: com.taobao.android.detail.industry.hourlydelivery.TBHourDeliveryHelper$2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                } else if (mtopResponse == null || mtopResponse.getBytedata() == null) {
                    com.taobao.android.detail.industry.tool.a.a("TBHourDeliveryHelper", "requestSearchBoxData onSuccess : mtopResponse == null");
                } else {
                    String str = new String(mtopResponse.getBytedata());
                    if (TextUtils.isEmpty(str)) {
                        return;
                    }
                    try {
                        JSONObject jSONObject2 = JSONObject.parseObject(str).getJSONObject("data").getJSONObject("module").getJSONObject("searchBox");
                        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(context).edit();
                        edit.putString("hourDeliverySearchBoxData", jSONObject2.toJSONString());
                        edit.apply();
                        interfaceC0389b.a(jSONObject2);
                    } catch (Exception e) {
                        com.taobao.android.detail.industry.tool.a.b("TBHourDeliveryHelper", "requestSearchBoxData getSearchBox : " + e.getMessage());
                    }
                }
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
            public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                    return;
                }
                com.taobao.android.detail.industry.tool.a.a("TBHourDeliveryHelper", "requestSearchBoxData onSystemError : " + mtopResponse);
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                    return;
                }
                com.taobao.android.detail.industry.tool.a.a("TBHourDeliveryHelper", "requestSearchBoxData onError : " + mtopResponse);
            }
        });
        build.startRequest();
    }

    private JSONObject c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("812f6ebe", new Object[]{this, context});
        }
        try {
            InputStreamReader inputStreamReader = new InputStreamReader(AssetsDelegate.proxy_open(context.getAssets(), "hourdelivery/search_box_default_data.json"), "UTF-8");
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            StringBuilder sb = new StringBuilder();
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    sb.append(readLine);
                } else {
                    bufferedReader.close();
                    inputStreamReader.close();
                    return JSONObject.parseObject(sb.toString());
                }
            }
        } catch (Exception e) {
            com.taobao.android.detail.industry.tool.a.b("TBHourDeliveryHelper", "getDefSearchBoxData error : " + e.getMessage());
            return null;
        }
    }
}
