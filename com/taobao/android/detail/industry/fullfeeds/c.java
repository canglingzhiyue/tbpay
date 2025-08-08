package com.taobao.android.detail.industry.fullfeeds;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.industry.tool.a;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.MtopBusiness;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import tb.ecn;
import tb.kge;

/* loaded from: classes4.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a */
    private a f10078a;
    private MtopBusiness b;
    private Context c;
    private JSONObject d;

    /* loaded from: classes4.dex */
    public interface a {
        void a();

        void a(DXTemplateItem dXTemplateItem);
    }

    static {
        kge.a(-237895195);
    }

    public static /* synthetic */ void a(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d21af903", new Object[]{cVar});
        } else {
            cVar.c();
        }
    }

    public static /* synthetic */ void a(c cVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e473080d", new Object[]{cVar, str});
        } else {
            cVar.e(str);
        }
    }

    public c(Context context, a aVar) {
        this.c = context;
        this.f10078a = aVar;
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        DXTemplateItem b = b(str);
        if (b != null) {
            this.f10078a.a(b);
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("bizId", (Object) "20201203");
        jSONObject.put("resId", (Object) "33943504");
        jSONObject.put("strategyCode", (Object) "full_screen_config");
        jSONObject.put("bizCode", (Object) str);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("params", (Object) jSONObject.toJSONString());
        MtopRequest mtopRequest = new MtopRequest();
        mtopRequest.setApiName("mtop.tmall.kangaroo.core.service.route.AldLampServiceFixedResV2");
        mtopRequest.setVersion("1.0");
        mtopRequest.setData(jSONObject2.toJSONString());
        this.b = MtopBusiness.build(mtopRequest);
        this.b.mo1305reqMethod(MethodEnum.POST);
        this.b.mo1335useWua();
        this.b.registerListener((IRemoteListener) new IRemoteBaseListener() { // from class: com.taobao.android.detail.industry.fullfeeds.FullFeedsHelper$1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                } else if (mtopResponse == null || mtopResponse.getBytedata() == null) {
                } else {
                    c.a(c.this, new String(mtopResponse.getBytedata()));
                }
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
            public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                    return;
                }
                a.a("FullFeedsRequest", "request data system error : " + mtopResponse);
                c.a(c.this);
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                    return;
                }
                a.a("FullFeedsRequest", "request data error : " + mtopResponse);
                c.a(c.this);
            }
        });
        this.b.startRequest();
    }

    public JSONObject a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("709f7788", new Object[]{this}) : this.d;
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        MtopBusiness mtopBusiness = this.b;
        if (mtopBusiness == null) {
            return;
        }
        mtopBusiness.cancelRequest();
    }

    private DXTemplateItem b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXTemplateItem) ipChange.ipc$dispatch("a86a8d2c", new Object[]{this, str});
        }
        if (!c(str)) {
            return null;
        }
        String a2 = ecn.a(this.c, "fullFeedsIndustryDXTemplateItemData");
        if (!StringUtils.isEmpty(a2)) {
            return d(a2);
        }
        return null;
    }

    private boolean c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("88097eb8", new Object[]{this, str})).booleanValue();
        }
        String a2 = ecn.a(this.c, "fullFeedsIndustryBizCode");
        if (!StringUtils.isEmpty(str)) {
            ecn.a(this.c, "fullFeedsIndustryBizCode", str);
        }
        return !StringUtils.isEmpty(a2) && a2.equals(str);
    }

    private DXTemplateItem d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXTemplateItem) ipChange.ipc$dispatch("386949ea", new Object[]{this, str});
        }
        try {
            JSONObject jSONObject = JSONObject.parseObject(str).getJSONObject("data").getJSONObject("resultValue").getJSONObject("33943504").getJSONArray("data").getJSONObject(0);
            JSONObject jSONObject2 = jSONObject.getJSONObject("configMap");
            DXTemplateItem dXTemplateItem = new DXTemplateItem();
            dXTemplateItem.c = jSONObject2.getString("url");
            dXTemplateItem.f11925a = jSONObject2.getString("name");
            dXTemplateItem.b = jSONObject2.getLongValue("version");
            this.d = jSONObject.getJSONObject("bizConfigMap");
            return dXTemplateItem;
        } catch (Exception e) {
            com.taobao.android.detail.industry.tool.a.b("FullFeedsRequest", "parseTemplateItem error : " + e.getMessage());
            return null;
        }
    }

    private void e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c6cb136", new Object[]{this, str});
            return;
        }
        if (!StringUtils.isEmpty(str)) {
            ecn.a(this.c, "fullFeedsIndustryDXTemplateItemData", str);
        }
        DXTemplateItem d = d(str);
        if (d == null || StringUtils.isEmpty(d.c)) {
            this.f10078a.a();
        } else {
            this.f10078a.a(d);
        }
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else {
            this.f10078a.a();
        }
    }
}
