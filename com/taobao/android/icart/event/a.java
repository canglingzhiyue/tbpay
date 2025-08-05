package com.taobao.android.icart.event;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import com.alibaba.android.icart.core.QueryParamsManager;
import com.alibaba.android.icart.core.data.config.RequestConfig;
import com.alibaba.android.ultron.trade.data.request.DataInfo;
import com.alibaba.android.ultron.trade.data.request.PageInfo;
import com.alibaba.android.ultron.trade.presenter.a;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.icart.manager.CartPopupWindowManager;
import com.taobao.android.icart.utils.AddCartUtil;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.android.ultron.common.utils.UnifyLog;
import com.taobao.login4android.qrcode.result.Result;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.RemoteBusiness;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import tb.bbz;
import tb.bca;
import tb.bem;
import tb.bmz;
import tb.kge;

/* loaded from: classes5.dex */
public class a extends bca {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private int c;

    static {
        kge.a(-55028147);
    }

    public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ bbz a(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (bbz) ipChange.ipc$dispatch("f0ec83c8", new Object[]{aVar}) : aVar.f25791a;
    }

    public static /* synthetic */ void b(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81eaa085", new Object[]{aVar});
        } else {
            aVar.g();
        }
    }

    public static /* synthetic */ bbz c(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (bbz) ipChange.ipc$dispatch("63db9f06", new Object[]{aVar}) : aVar.f25791a;
    }

    public static /* synthetic */ int d(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("13ec8efa", new Object[]{aVar})).intValue() : aVar.c;
    }

    public static /* synthetic */ IDMComponent e(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IDMComponent) ipChange.ipc$dispatch("c463ce4c", new Object[]{aVar}) : aVar.h;
    }

    public static /* synthetic */ bbz f(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (bbz) ipChange.ipc$dispatch("904247e3", new Object[]{aVar}) : aVar.f25791a;
    }

    public static /* synthetic */ bbz g(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (bbz) ipChange.ipc$dispatch("49b9d582", new Object[]{aVar}) : aVar.f25791a;
    }

    @Override // com.alibaba.android.ultron.trade.event.d
    public void b(bmz bmzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d08b596a", new Object[]{this, bmzVar});
            return;
        }
        String b = bmzVar.b();
        char c = 65535;
        switch (b.hashCode()) {
            case -770667622:
                if (b.equals("cartAddonFetch")) {
                    c = 0;
                    break;
                }
                break;
            case -227437228:
                if (b.equals("cartScrollToFeedflow")) {
                    c = 3;
                    break;
                }
                break;
            case 170418107:
                if (b.equals("cartAddonRefresh")) {
                    c = 4;
                    break;
                }
                break;
            case 1734529735:
                if (b.equals("cartAddonAddBag")) {
                    c = 1;
                    break;
                }
                break;
            case 2116736933:
                if (b.equals("cartAddonOpenUrl")) {
                    c = 2;
                    break;
                }
                break;
        }
        if (c == 0) {
            j();
        } else if (c == 1) {
            i();
        } else if (c == 2) {
            h();
        } else if (c != 3) {
            if (c != 4) {
                return;
            }
            f();
        } else if (this.f25791a.n().p()) {
            HashMap hashMap = new HashMap();
            hashMap.put(RequestConfig.IS_POP_LAYE_RQUERY, "true");
            hashMap.put(RequestConfig.IS_FULL_DATA_QUERY, "true");
            this.f25791a.b(true, hashMap, null);
            this.f25791a.n().b(new a.b() { // from class: com.taobao.android.icart.event.a.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                {
                    a.this = this;
                }

                @Override // com.alibaba.android.ultron.trade.presenter.a.b
                public void a(PageInfo pageInfo, DataInfo dataInfo) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("b29da491", new Object[]{this, pageInfo, dataInfo});
                        return;
                    }
                    ((CartPopupWindowManager) a.a(a.this).x().d()).a().post(new Runnable() { // from class: com.taobao.android.icart.event.a.1.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        {
                            AnonymousClass1.this = this;
                        }

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                            } else {
                                a.b(a.this);
                            }
                        }
                    });
                    a.c(a.this).n().a(this);
                }
            });
        } else {
            g();
        }
    }

    private void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        JSONObject fields = this.h.getFields();
        if (fields != null) {
            fields.remove("_asyncStatus");
        }
        this.f25791a.x().b(2);
    }

    private void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        final RecyclerView a2 = this.f25791a.x().d().a();
        final int itemCount = a2.getLayoutManager().getItemCount();
        if (itemCount == 0) {
            return;
        }
        a2.scrollToPosition(itemCount - 1);
        a2.post(new Runnable() { // from class: com.taobao.android.icart.event.a.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            {
                a.this = this;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    a2.scrollToPosition(itemCount - 1);
                }
            }
        });
    }

    private void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        JSONObject k = k();
        if (k == null) {
            return;
        }
        String string = k.getString("url");
        JSONObject c = c();
        if (c == null || string == null) {
            UnifyLog.a("CartAddOnItemSubscriber", "openUrl fail fields=" + c + ",url=" + string);
            return;
        }
        StringBuilder sb = new StringBuilder(string);
        Map<String, String> a2 = AddCartUtil.a((Activity) this.e, "detail", AddCartUtil.ADD_ON_MODULE, k.getString("customParam"));
        for (String str : a2.keySet()) {
            sb.append("&");
            sb.append(str);
            sb.append("=");
            sb.append(a2.get(str));
        }
        c.put("url", (Object) sb.toString());
        bmz a3 = this.f25791a.F().a();
        a3.c("itemClick");
        a3.a("openUrl");
        a3.a(this.d.e());
        this.f25791a.F().a(a3);
    }

    private void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
            return;
        }
        JSONObject k = k();
        if (k == null) {
            return;
        }
        AddCartUtil.a(this.f25791a, k, AddCartUtil.ADD_ON_MODULE, true);
    }

    private void j() {
        String str;
        String str2;
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
            return;
        }
        final JSONObject fields = this.h.getFields();
        if (fields.getString("_asyncStatus") != null) {
            return;
        }
        final int i = this.c + 1;
        this.c = i;
        fields.put("_asyncStatus", (Object) "Loading");
        MtopRequest mtopRequest = new MtopRequest();
        JSONObject c = c();
        JSONObject jSONObject2 = new JSONObject();
        if (c == null || !c.containsKey("mtopConfig") || (jSONObject = c.getJSONObject("mtopConfig")) == null) {
            str = "mtop.mine.cart.cou";
            str2 = "1.0";
        } else {
            str = jSONObject.getString("apiMethod");
            str2 = jSONObject.getString("apiVersion");
            jSONObject2.put("cartFrom", (Object) QueryParamsManager.DEFAULT_CART_FROM);
        }
        mtopRequest.setApiName(str);
        mtopRequest.setVersion(str2);
        jSONObject2.putAll(AddCartUtil.a(this.f25791a.m(), "detail", AddCartUtil.ADD_ON_MODULE, (String) null));
        final JSONObject i2 = bem.i(this.b);
        if (i2 != null) {
            jSONObject2.putAll(i2.getJSONObject("customParams"));
        }
        mtopRequest.setData(jSONObject2.toString());
        RemoteBusiness build = RemoteBusiness.build(mtopRequest);
        build.mo1305reqMethod(MethodEnum.POST);
        build.mo1328setUnitStrategy("UNIT_TRADE");
        build.registerListener((IRemoteListener) new IRemoteBaseListener() { // from class: com.taobao.android.icart.event.CartAddOnItemSubscriber$3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onSuccess(int i3, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i3), mtopResponse, baseOutDo, obj});
                } else if (a.d(a.this) != i) {
                    UnifyLog.a("CartAddOnItemSubscriber", "onSuccess return,requestId=" + i);
                } else if (mtopResponse == null || mtopResponse.getBytedata() == null) {
                } else {
                    String str3 = new String(mtopResponse.getBytedata());
                    UnifyLog.b("CartAddOnItemSubscriber", "body=" + str3);
                    try {
                        JSONObject jSONObject3 = JSONObject.parseObject(str3).getJSONObject("data");
                        JSONObject fields2 = a.e(a.this).getFields();
                        if (fields2 != null && jSONObject3 != null && !jSONObject3.isEmpty()) {
                            fields2.putAll(jSONObject3);
                            fields2.put("_asyncStatus", (Object) Result.MSG_SUCCESS);
                            JSONObject jSONObject4 = new JSONObject();
                            jSONObject4.putAll(i2.getJSONObject("customParams"));
                            fields2.put("_requestParams", (Object) jSONObject4);
                            fields2.put("_responseData", (Object) URLEncoder.encode(jSONObject3.toJSONString(), "UTF-8"));
                            a.f(a.this).x().d().a(2);
                        }
                    } catch (Exception e) {
                        UnifyLog.b("CartAddOnItemSubscriber", "parse mtop error msg=" + e.getMessage());
                    }
                }
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onError(int i3, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i3), mtopResponse, obj});
                    return;
                }
                UnifyLog.a("CartAddOnItemSubscriber", "onError mtopResponse=" + mtopResponse);
                fields.put("_asyncStatus", (Object) "Fail");
                a.g(a.this).x().b(2);
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
            public void onSystemError(int i3, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i3), mtopResponse, obj});
                } else {
                    onError(i3, mtopResponse, obj);
                }
            }
        });
        build.startRequest();
    }

    private JSONObject k() {
        Object[] objArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("352dba92", new Object[]{this});
        }
        JSONObject fields = this.h.getFields();
        if (fields != null && (objArr = (Object[]) this.d.b("extraParams")) != null && objArr.length == 2) {
            int i = -1;
            try {
                i = Integer.parseInt(objArr[1].toString());
            } catch (Exception e) {
                UnifyLog.d("CartAddOnItemSubscriber", "addBag parse int error=" + e.getMessage());
            }
            if (i < 0) {
                return null;
            }
            JSONArray jSONArray = fields.getJSONArray("items");
            if (jSONArray == null) {
                jSONArray = fields.getJSONArray("combinationItemList");
            }
            if (jSONArray != null && jSONArray.size() >= i + 1) {
                return jSONArray.getJSONObject(i);
            }
        }
        return null;
    }
}
