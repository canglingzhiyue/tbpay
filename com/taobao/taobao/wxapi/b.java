package com.taobao.taobao.wxapi;

import android.app.Activity;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.taobao.internal.PayRequest;
import com.taobao.taobao.internal.PayResultInfo;
import com.taobao.taobao.internal.helper.c;
import com.tencent.mm.opensdk.modelbase.BaseResp;
import com.tencent.mm.opensdk.modelpay.PayReq;
import com.tencent.mm.opensdk.openapi.IWXAPI;
import com.tencent.mm.opensdk.openapi.WXAPIFactory;
import com.tencent.mm.opensdk.utils.ILog;
import java.lang.ref.WeakReference;
import java.util.Map;
import tb.jqg;
import tb.tdx;

/* loaded from: classes8.dex */
public class b implements com.taobao.taobao.internal.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static b f;

    /* renamed from: a  reason: collision with root package name */
    private final IWXAPI f21310a;
    private com.taobao.taobao.internal.b b;
    private PayRequest c;
    private final WeakReference<Activity> d;
    private final tdx e;

    public static b a(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("5e6ad52d", new Object[]{activity});
        }
        b bVar = new b(activity);
        f = bVar;
        return bVar;
    }

    public static b a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("c67afe5b", new Object[0]);
        }
        b bVar = f;
        if (bVar == null) {
            throw new NullPointerException("请先进行初始化");
        }
        return bVar;
    }

    public static boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[0])).booleanValue() : f == null;
    }

    public b(Activity activity) {
        this.d = new WeakReference<>(activity);
        String a2 = a.a();
        this.f21310a = WXAPIFactory.createWXAPI(activity, a2, true);
        this.f21310a.registerApp(a2);
        this.f21310a.setLogImpl(new ILog() { // from class: com.taobao.taobao.wxapi.b.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.tencent.mm.opensdk.utils.ILog
            public void v(String str, String str2) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("625b1491", new Object[]{this, str, str2});
                    return;
                }
                jqg.a("wxapi log: " + str + str2, new String[0]);
            }

            @Override // com.tencent.mm.opensdk.utils.ILog
            public void d(String str, String str2) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("7f180e7f", new Object[]{this, str, str2});
                    return;
                }
                jqg.b("WxPay", "wxapi log: " + str + str2);
            }

            @Override // com.tencent.mm.opensdk.utils.ILog
            public void i(String str, String str2) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("3e38e584", new Object[]{this, str, str2});
                    return;
                }
                jqg.b("WxPay", "wxapi log: " + str + str2);
            }

            @Override // com.tencent.mm.opensdk.utils.ILog
            public void w(String str, String str2) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("eefb3f92", new Object[]{this, str, str2});
                    return;
                }
                jqg.b("WxPay", "wxapi log: " + str + str2);
            }

            @Override // com.tencent.mm.opensdk.utils.ILog
            public void e(String str, String str2) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("bb83980", new Object[]{this, str, str2});
                    return;
                }
                jqg.b("WxPay", "wxapi log: " + str + str2);
            }
        });
        this.e = new tdx(this.d.get(), PayRequest.CALL_WEIXIN_SDK);
    }

    public com.taobao.taobao.internal.a a(com.taobao.taobao.internal.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.taobao.internal.a) ipChange.ipc$dispatch("cac5002f", new Object[]{this, bVar});
        }
        this.b = bVar;
        return this;
    }

    @Override // com.taobao.taobao.internal.a
    public void a(PayRequest payRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d94aa2e", new Object[]{this, payRequest});
            return;
        }
        this.c = payRequest;
        b(payRequest);
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : this.f21310a.isWXAppInstalled();
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue() : this.f21310a.getWXAppSupportAPI() >= 570425345;
    }

    private void b(PayRequest payRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4081138d", new Object[]{this, payRequest});
        } else if (!b()) {
            c.a(com.alibaba.ability.localization.b.a(R.string.taobao_app_wx_install_tip));
            com.taobao.taobao.utils.b.c("wxpay_app_not_install", "未安装微信");
            jqg.b("WxPay", "未安装微信");
            a(this.b, "8001", "wxpay_app_not_install", "未安装微信");
        } else if (!c()) {
            com.taobao.taobao.utils.b.c("wxpay_not_support", "您的微信版本不支持支付，请安装最新版");
            jqg.b("WxPay", "您的微信版本不支持支付，请安装最新版");
            a(this.b, "4000", "wxpay_not_support", "您的微信版本不支持支付，请安装最新版");
        } else {
            a(payRequest.getExtAttrMap());
            String actionParams = payRequest.getActionParams();
            PayReq payReq = new PayReq();
            try {
                JSONObject parseObject = JSONObject.parseObject(actionParams);
                payReq.packageValue = parseObject.getString("package");
                payReq.appId = parseObject.getString("appId");
                payReq.sign = parseObject.getString("sign");
                payReq.signType = parseObject.getString("signType");
                payReq.partnerId = parseObject.getString("partnerid");
                payReq.prepayId = parseObject.getString("prepayid");
                payReq.nonceStr = parseObject.getString("nonceStr");
                payReq.timeStamp = parseObject.getString("timeStamp");
                if (this.f21310a.sendReq(payReq)) {
                    return;
                }
                com.taobao.taobao.utils.b.c("wxpay_params_error", "支付参数错误");
                jqg.b("WxPay", "支付参数错误");
                a(this.b, "4000", "wxpay_params_error", "支付参数错误");
                this.b = null;
            } catch (Exception unused) {
                com.taobao.taobao.utils.b.c("wxpay_exception", "支付异常");
                jqg.b("WxPay", "支付异常");
                a(this.b, "4000", "wxpay_exception", "支付异常");
                this.b = null;
            }
        }
    }

    private void a(Map<String, String> map) {
        tdx tdxVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
        } else if (map == null || (tdxVar = this.e) == null) {
        } else {
            tdxVar.a(map, false);
            this.e.a();
        }
    }

    public void a(BaseResp baseResp) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("303e070d", new Object[]{this, baseResp});
        } else if (baseResp.getType() != 5) {
        } else {
            if (baseResp.errCode == 0) {
                com.taobao.taobao.internal.b bVar = this.b;
                if (bVar == null) {
                    return;
                }
                c(bVar, "9000", String.valueOf(baseResp.errCode), "支付成功");
                this.b = null;
            } else if (-2 == baseResp.errCode) {
                com.taobao.taobao.internal.b bVar2 = this.b;
                if (bVar2 == null) {
                    return;
                }
                b(bVar2, "6001", String.valueOf(baseResp.errCode), "用户取消");
                this.b = null;
            } else {
                com.taobao.taobao.internal.b bVar3 = this.b;
                if (bVar3 == null) {
                    return;
                }
                a(bVar3, "4000", String.valueOf(baseResp.errCode), "支付失败");
                this.b = null;
            }
        }
    }

    public void a(com.taobao.taobao.internal.b bVar, String str, String str2, String str3) {
        PayRequest payRequest;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3d27ff7", new Object[]{this, bVar, str, str2, str3});
        } else if (bVar == null || (payRequest = this.c) == null) {
        } else {
            PayResultInfo payResultInfo = new PayResultInfo(str, str2, str3, payRequest);
            tdx tdxVar = this.e;
            if (tdxVar != null) {
                tdxVar.a(payResultInfo.resultStatus);
            }
            bVar.b(this.c.getUnSuccessUrl(), payResultInfo);
        }
    }

    public void b(com.taobao.taobao.internal.b bVar, String str, String str2, String str3) {
        PayRequest payRequest;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("acda44f8", new Object[]{this, bVar, str, str2, str3});
        } else if (bVar == null || (payRequest = this.c) == null) {
        } else {
            PayResultInfo payResultInfo = new PayResultInfo(str, str2, str3, payRequest);
            tdx tdxVar = this.e;
            if (tdxVar != null) {
                tdxVar.a(payResultInfo.resultStatus);
            }
            bVar.c(this.c.getUnSuccessUrl(), payResultInfo);
        }
    }

    public void c(com.taobao.taobao.internal.b bVar, String str, String str2, String str3) {
        PayRequest payRequest;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95e209f9", new Object[]{this, bVar, str, str2, str3});
        } else if (bVar == null || (payRequest = this.c) == null) {
        } else {
            PayResultInfo payResultInfo = new PayResultInfo(str, str2, str3, payRequest);
            tdx tdxVar = this.e;
            if (tdxVar != null) {
                tdxVar.a(payResultInfo.resultStatus);
            }
            bVar.a(this.c.getSuccessUrl(), payResultInfo);
        }
    }
}
