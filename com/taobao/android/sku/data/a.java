package com.taobao.android.sku.data;

import android.content.Context;
import android.net.Uri;
import mtopsdk.common.util.StringUtils;
import com.alibaba.android.ultron.vfw.instance.d;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.sku.c;
import com.taobao.android.sku.utils.o;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import tb.ixv;
import tb.ixw;
import tb.kge;

/* loaded from: classes6.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Context b;
    private c c;
    private d d;

    /* renamed from: a  reason: collision with root package name */
    private List<ixv> f15163a = new ArrayList();
    private AliXSkuDataContext e = new AliXSkuDataContext();

    static {
        kge.a(1319434799);
    }

    public a(c cVar, Context context, d dVar) {
        this.c = cVar;
        this.b = context;
        this.d = dVar;
    }

    public void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
        } else {
            this.e.initOriginalData(jSONObject);
        }
    }

    public void a(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee2b490", new Object[]{this, str, str2, str3, str4});
        } else {
            this.e.initOriginalData(str, str2, str3, str4);
        }
    }

    public JSONObject a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("709f7788", new Object[]{this}) : this.e.getJsH5SkuInfo();
    }

    public String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : this.e.getItemId();
    }

    public String c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this}) : this.e.getSellerId();
    }

    public String a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, str}) : this.e.getH5Url(str);
    }

    public String d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("43881515", new Object[]{this}) : this.e.getH5Url();
    }

    public String r() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9ed849c7", new Object[]{this}) : this.e.getDegradeSkuH5Url();
    }

    public String e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this}) : this.e.getWeexUrl();
    }

    public String f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("50938a53", new Object[]{this}) : this.e.getSkuV3WeexUrl();
    }

    public boolean s() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("66a137e", new Object[]{this})).booleanValue() : this.e.getShowSkuFeature();
    }

    public boolean t() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6782aff", new Object[]{this})).booleanValue() : this.e.getNewbuyShowSkuFeature();
    }

    public boolean v() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6945a01", new Object[]{this})).booleanValue() : this.e.getSkuSilentActionFeature();
    }

    public boolean w() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6a27182", new Object[]{this})).booleanValue() : this.e.isTradeCartOrBuyEnable("buyEnable");
    }

    public boolean x() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6b08903", new Object[]{this})).booleanValue() : this.e.isTradeCartOrBuyEnable("cartEnable");
    }

    public static boolean b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3dd7e577", new Object[]{str})).booleanValue();
        }
        if (StringUtils.isEmpty(str)) {
            return false;
        }
        try {
            return Boolean.parseBoolean(Uri.parse(str).getQueryParameter("enable_sukopt"));
        } catch (Throwable th) {
            o.d("isLazyInitSku2()", th.toString());
            return false;
        }
    }

    public void b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63b99827", new Object[]{this, jSONObject});
            return;
        }
        this.e.cleanStoredData();
        this.e.cleanOperationData();
        this.e.cleanBizData();
        this.e.initOriginalData(jSONObject);
    }

    public void c(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c50c34c6", new Object[]{this, jSONObject});
        } else {
            this.e.setExtInput(jSONObject);
        }
    }

    public void d(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("265ed165", new Object[]{this, jSONObject});
        } else {
            this.e.setStaticExtInput(jSONObject);
        }
    }

    public JSONObject g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("e68e6c8e", new Object[]{this}) : this.e.getExtInput();
    }

    public void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63fccf7", new Object[]{this});
        } else {
            this.e.cleanTimeExtInput();
        }
    }

    public JSONObject q() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("ab1caf98", new Object[]{this}) : this.e.getTimeExtInput();
    }

    public JSONObject h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("fa36400f", new Object[]{this}) : this.e.getOriginalData();
    }

    public void e(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87b16e04", new Object[]{this, jSONObject});
            return;
        }
        this.e.cleanStoredData();
        this.e.setStoredData(jSONObject);
    }

    public void f(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9040aa3", new Object[]{this, jSONObject});
            return;
        }
        this.e.cleanOperationData();
        this.e.setOperationData(jSONObject);
    }

    public String i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e424ba30", new Object[]{this}) : this.e.getUltronTemplateUrl();
    }

    public String j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6aaa74cf", new Object[]{this}) : this.e.getUltronTemplateMd5();
    }

    public String k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f1302f6e", new Object[]{this}) : this.e.getJavaScriptUrl();
    }

    public String l() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("77b5ea0d", new Object[]{this}) : this.e.getJavaScriptMd5();
    }

    public String m() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("fe3ba4ac", new Object[]{this}) : this.e.getSkuParams();
    }

    public JSONObject n() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("70253515", new Object[]{this}) : this.e.getStoredData();
    }

    public JSONObject o() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("83cd0896", new Object[]{this}) : this.e.getBizData();
    }

    public void g(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a56a742", new Object[]{this, jSONObject});
            return;
        }
        this.e.cleanBizData();
        this.e.setBizData(jSONObject);
    }

    public JSONObject h(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("d0b82b01", new Object[]{this, jSONObject});
        }
        if (jSONObject != null) {
            this.e.cleanOperationData();
            this.e.setOperationData(jSONObject);
        }
        JSONObject jSONObject2 = new JSONObject();
        List<ixv> list = this.f15163a;
        if (list != null && !list.isEmpty()) {
            for (ixv ixvVar : this.f15163a) {
                Map<String, ixw> a2 = ixvVar.a();
                if (a2 != null) {
                    for (Map.Entry<String, ixw> entry : a2.entrySet()) {
                        if (!StringUtils.isEmpty(entry.getKey()) && entry.getValue() != null) {
                            jSONObject2.put(entry.getKey(), entry.getValue().a(this.e.getOriginalData(), this.e.getStoredData(), this.e.getOperationData()));
                        }
                    }
                }
            }
            this.e.cleanOperationData();
            this.e.cleanBizData();
            this.e.setBizData(jSONObject2);
        }
        return jSONObject2;
    }
}
