package com.taobao.android.artry;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import mtopsdk.common.util.StringUtils;
import android.util.Log;
import android.widget.Toast;
import com.alibaba.fastjson.JSONException;
import com.alipay.apmobilesecuritysdk.face.APSecuritySdk;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.base.TaoBaseService;
import com.taobao.android.artry.tblife.a;
import com.taobao.android.artry.utils.d;
import com.taobao.android.fluid.framework.hostcontainer.pageinterface.page.FullPage;
import com.taobao.android.nav.Nav;
import com.taobao.aranger.exception.IPCException;
import com.taobao.tao.log.TLog;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.MtopBusiness;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.intf.Mtop;
import org.json.JSONArray;
import org.json.JSONObject;
import tb.kge;
import tb.rrv;

/* loaded from: classes4.dex */
public class MetaServerAccsService extends TaoBaseService {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static boolean f9029a;
    private static final Handler b;
    private static String c;
    private static String d;

    @Override // com.taobao.accs.base.AccsDataListener
    public void onSendData(String str, String str2, int i, TaoBaseService.ExtraInfo extraInfo) throws IPCException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f29e89fa", new Object[]{this, str, str2, new Integer(i), extraInfo});
        }
    }

    public static /* synthetic */ String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str});
        }
        d = str;
        return str;
    }

    public static /* synthetic */ String a(String str, String str2, String str3, String str4, String str5) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("4e78d986", new Object[]{str, str2, str3, str4, str5}) : b(str, str2, str3, str4, str5);
    }

    public static /* synthetic */ String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[0]) : c;
    }

    public static /* synthetic */ void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{str});
        } else {
            e(str);
        }
    }

    public static /* synthetic */ void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{str});
        } else {
            f(str);
        }
    }

    public static /* synthetic */ void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d23b17f5", new Object[]{str});
        } else {
            g(str);
        }
    }

    static {
        kge.a(-513321917);
        f9029a = false;
        b = new Handler(Looper.getMainLooper());
        c = "";
        d = "http://d.m.taobao.com/goAlipay.htm?simplepay=1&signStr=";
    }

    @Override // com.taobao.accs.base.AccsDataListener
    public void onData(String str, String str2, String str3, byte[] bArr, TaoBaseService.ExtraInfo extraInfo) throws IPCException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("694255fc", new Object[]{this, str, str2, str3, bArr, extraInfo});
            return;
        }
        int b2 = d.b();
        String str4 = "onData: string val is " + b2;
        if (b2 != 0) {
            d = "http://d.wapa.taobao.com/goAlipay.htm?simplepay=1&signStr=";
        }
        String str5 = new String(bArr);
        String str6 = "onData: received val is " + str5;
        if (!f9029a) {
            c = str5;
        } else {
            e(str5);
        }
    }

    private static void e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c6cb136", new Object[]{str});
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString("payType");
            if ("avpAgreementPay".equals(string)) {
                String string2 = jSONObject.getString("signStr");
                String str2 = "onData: signStr " + string2;
                g(d + URLEncoder.encode(string2, "UTF-8"));
            } else if (!"orderPay".equals(string)) {
            } else {
                JSONObject jSONObject2 = new JSONObject(jSONObject.getString("orderPayInfo"));
                a(a.f9084a, jSONObject2.getString("orderId"), jSONObject2.getString("code"), jSONObject2.getString("appName"), jSONObject2.getString("isNeedWua"));
            }
        } catch (Throwable th) {
            String str3 = "onData: meet Throwable exception " + th;
        }
    }

    private static String b(String str, String str2, String str3, String str4, String str5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5c850365", new Object[]{str, str2, str3, str4, str5});
        }
        StringBuilder sb = new StringBuilder();
        sb.append("http://d.m.taobao.com/goAlipay.htm?");
        try {
            sb.append("backURL=");
            sb.append(URLEncoder.encode(str, "UTF-8"));
            sb.append("&simplepay=");
            sb.append(str5);
            sb.append("&singleTop=true");
            sb.append("&orderids=");
            sb.append(str2);
            sb.append("&signStr=");
            sb.append(URLEncoder.encode(str3, "UTF-8"));
            sb.append("&alipayURL=");
            sb.append(URLEncoder.encode(str4, "UTF-8"));
        } catch (UnsupportedEncodingException e) {
            String str6 = "generateOrderPayURL: e " + e;
        }
        String str7 = "generateOrderPayURL: val is " + sb.toString();
        return sb.toString();
    }

    private static void f(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("669e4a77", new Object[]{str});
        } else {
            b.post(new Runnable() { // from class: com.taobao.android.artry.MetaServerAccsService.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (a.f9084a == null) {
                    } else {
                        try {
                            Toast.makeText(a.f9084a, str, 0).show();
                        } catch (Throwable th) {
                            Log.e("MetaServerAccsService", "run: e " + th);
                        }
                    }
                }
            });
        }
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
        } else if (StringUtils.isEmpty(c)) {
        } else {
            b.post(new Runnable() { // from class: com.taobao.android.artry.MetaServerAccsService.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    int b2 = d.b();
                    String str = "pending message : string val is " + b2;
                    if (b2 != 0) {
                        MetaServerAccsService.a("http://d.wapa.taobao.com/goAlipay.htm?simplepay=1&signStr=");
                    }
                    String str2 = "run: pendingsignstr is " + MetaServerAccsService.b();
                    MetaServerAccsService.b(MetaServerAccsService.b());
                }
            });
        }
    }

    private static void g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0cfe3b8", new Object[]{str});
        } else if (a.f9084a == null) {
        } else {
            try {
                Nav.from(a.f9084a).toUri(str);
            } catch (Throwable th) {
                TLog.loge("MetaServerAccsService", "navToDestUrl", th);
            }
        }
    }

    private static void a(Context context, String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6fc7488", new Object[]{context, str, str2, str3, str4});
        } else if (a.f9084a == null) {
        } else {
            MtopRequest mtopRequest = new MtopRequest();
            mtopRequest.setApiName("mtop.order.dopay");
            mtopRequest.setVersion("4.0");
            mtopRequest.setNeedEcode(true);
            mtopRequest.setNeedSession(true);
            com.alibaba.fastjson.JSONObject jSONObject = new com.alibaba.fastjson.JSONObject();
            try {
                jSONObject.put("appName", (Object) str3);
                jSONObject.put("code", (Object) str2);
                String str5 = APSecuritySdk.getInstance(a.f9084a).getTokenResult().apdidToken;
                jSONObject.put(rrv.APDIDTOKEN, (Object) str5);
                jSONObject.put("orderId", (Object) str);
                String locale = a.f9084a.getResources().getConfiguration().locale.toString();
                jSONObject.put("websiteLanguage", (Object) locale);
                String str6 = "onData:  apdidToken " + str5 + " websiteLanguage " + locale;
            } catch (JSONException e) {
                e.printStackTrace();
            }
            mtopRequest.setData(jSONObject.toString());
            MtopBusiness mo1305reqMethod = MtopBusiness.build(Mtop.instance(Mtop.Id.INNER, context), mtopRequest).mo1305reqMethod(MethodEnum.POST);
            if ("true".equals(str4)) {
                mo1305reqMethod.mo1335useWua();
            }
            mo1305reqMethod.mo1312setConnectionTimeoutMilliSecond(3000);
            mo1305reqMethod.mo1326setSocketTimeoutMilliSecond(5000);
            mo1305reqMethod.registerListener((IRemoteListener) new IRemoteBaseListener() { // from class: com.taobao.android.artry.MetaServerAccsService.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
                public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                        return;
                    }
                    MetaServerAccsService.c("网络请求异常，请稍后重试");
                    StringBuilder sb = new StringBuilder();
                    sb.append("onSystemError: ");
                    sb.append(i);
                    sb.append(" mtopResponse val is  ");
                    sb.append(mtopResponse != null ? mtopResponse.toString() : "");
                    sb.append(" o ");
                    sb.append(obj);
                    sb.toString();
                }

                @Override // com.taobao.tao.remotebusiness.IRemoteListener
                public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                    } else if (mtopResponse == null || mtopResponse.getDataJsonObject() == null) {
                        MetaServerAccsService.c("网络请求异常，请稍后重试");
                        Log.e("MetaServerAccsService", "onSuccess: params error");
                    } else {
                        JSONObject dataJsonObject = mtopResponse.getDataJsonObject();
                        try {
                            String str7 = "onSuccess: dataObj " + dataJsonObject;
                            String string = dataJsonObject.getString(FullPage.PARAM_BACK2Tab2URL);
                            if ("false".equals(dataJsonObject.getString("canPay"))) {
                                MetaServerAccsService.c("订单状态异常，请稍后重试");
                                return;
                            }
                            JSONArray jSONArray = dataJsonObject.getJSONArray("orderIds");
                            if (jSONArray.length() <= 0) {
                                return;
                            }
                            MetaServerAccsService.d(MetaServerAccsService.a(string, jSONArray.getString(0), dataJsonObject.getString("signStr"), dataJsonObject.getString("alipayUrl"), dataJsonObject.getString("simplePay")));
                        } catch (org.json.JSONException e2) {
                            Log.e("MetaServerAccsService", "JSONException e is : " + e2);
                        }
                    }
                }

                @Override // com.taobao.tao.remotebusiness.IRemoteListener
                public void onError(int i, MtopResponse mtopResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                        return;
                    }
                    MetaServerAccsService.c("网络请求异常，请稍后重试");
                    StringBuilder sb = new StringBuilder();
                    sb.append("onError: i ");
                    sb.append(i);
                    sb.append(mtopResponse != null ? mtopResponse.toString() : "");
                    sb.append(" o ");
                    sb.append(obj);
                    sb.toString();
                }
            });
            mo1305reqMethod.startRequest();
        }
    }

    @Override // com.taobao.accs.base.AccsDataListener
    public void onBind(String str, int i, TaoBaseService.ExtraInfo extraInfo) throws IPCException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fa398db", new Object[]{this, str, new Integer(i), extraInfo});
            return;
        }
        String str2 = "onBind: s " + str + " i " + i;
    }

    @Override // com.taobao.accs.base.AccsDataListener
    public void onUnbind(String str, int i, TaoBaseService.ExtraInfo extraInfo) throws IPCException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b4e074", new Object[]{this, str, new Integer(i), extraInfo});
            return;
        }
        String str2 = "onUnbind: s " + str + " i " + i;
    }

    @Override // com.taobao.accs.base.AccsDataListener
    public void onResponse(String str, String str2, int i, byte[] bArr, TaoBaseService.ExtraInfo extraInfo) throws IPCException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5239c42", new Object[]{this, str, str2, new Integer(i), bArr, extraInfo});
            return;
        }
        String str3 = "onResponse: s " + str + " s1 " + str2 + " i " + i;
    }
}
