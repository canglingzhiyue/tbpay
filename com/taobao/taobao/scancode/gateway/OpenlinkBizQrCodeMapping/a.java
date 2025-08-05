package com.taobao.taobao.scancode.gateway.OpenlinkBizQrCodeMapping;

import android.taobao.util.k;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilitykit.ability.pop.model.b;
import com.taobao.orange.OrangeConfig;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.RemoteBusiness;
import com.taobao.taobao.scancode.gateway.OpenlinkBizQrCodeMapping.a;
import java.util.regex.Pattern;
import mtopsdk.mtop.common.MtopListener;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.IMTOPDataObject;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.domain.MtopResponse;
import org.json.JSONArray;
import org.json.JSONObject;
import tb.kge;
import tb.oys;

/* loaded from: classes8.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: com.taobao.taobao.scancode.gateway.OpenlinkBizQrCodeMapping.a$a  reason: collision with other inner class name */
    /* loaded from: classes8.dex */
    public interface InterfaceC0885a {
        void a(String str);

        void b(String str);
    }

    static {
        kge.a(1981383772);
    }

    public static boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        k.a("UrlRouter", "needIntercept origin url:" + str);
        String customConfig = OrangeConfig.getInstance().getCustomConfig("scan_qr_code_android", "");
        if (!TextUtils.isEmpty(customConfig)) {
            try {
                k.a("UrlRouter", "needIntercept orange config:" + customConfig);
                JSONObject jSONObject = new JSONObject(customConfig.trim());
                if (jSONObject.has("InterceptUrls")) {
                    JSONArray jSONArray = jSONObject.getJSONArray("InterceptUrls");
                    k.a("UrlRouter", "needIntercept orange config InterceptUrls:" + jSONArray.toString());
                    for (int i = 0; i < jSONArray.length(); i++) {
                        JSONObject jSONObject2 = new JSONObject(jSONArray.getString(i));
                        String string = jSONObject2.getString("matchPattern");
                        String string2 = jSONObject2.getString(b.TAK_ABILITY_MATCH_CONTENT);
                        if (!TextUtils.isEmpty(string) && !TextUtils.isEmpty(string2)) {
                            boolean a2 = a(string, string2, str);
                            k.a("UrlRouter", "--- needIntercept:--- " + a2);
                            if (a2) {
                                return true;
                            }
                        }
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    private static boolean a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("929ad04a", new Object[]{str, str2, str3})).booleanValue();
        }
        try {
            k.a("UrlRouter", "calculateIntercept origin url：" + str3 + "\nmatchPattern:" + str + "  matchContent:" + str2);
            String lowerCase = str3.toLowerCase();
            if (lowerCase.startsWith(com.taobao.search.common.util.k.HTTP_PREFIX)) {
                str3 = str3.substring(7);
            }
            if (lowerCase.startsWith(com.taobao.search.common.util.k.HTTPS_PREFIX)) {
                str3 = str3.substring(8);
            }
            k.a("UrlRouter", "calculateIntercept http/https removed: " + str3);
            if (str.equalsIgnoreCase("prefix")) {
                if (str3.startsWith(str2)) {
                    return true;
                }
            } else if (str.equalsIgnoreCase("regex")) {
                return Pattern.compile(str2).matcher(str3).find();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public static void a(final String str, final InterfaceC0885a interfaceC0885a) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8693b7cd", new Object[]{str, interfaceC0885a});
            return;
        }
        oys.a().a("Open_link_biz_intercepted_url");
        MtopTaobaoOpenlinkBizQrCodeMappingRequest mtopTaobaoOpenlinkBizQrCodeMappingRequest = new MtopTaobaoOpenlinkBizQrCodeMappingRequest();
        mtopTaobaoOpenlinkBizQrCodeMappingRequest.setOriginUrl(str);
        RemoteBusiness build = RemoteBusiness.build((IMTOPDataObject) mtopTaobaoOpenlinkBizQrCodeMappingRequest);
        build.mo1305reqMethod(MethodEnum.POST);
        build.mo1337addListener((MtopListener) new IRemoteBaseListener() { // from class: com.taobao.taobao.scancode.gateway.OpenlinkBizQrCodeMapping.UrlRouter$1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
            public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                    return;
                }
                k.a("UrlRouter", "onSystemError");
                a.InterfaceC0885a interfaceC0885a2 = a.InterfaceC0885a.this;
                if (interfaceC0885a2 == null) {
                    return;
                }
                try {
                    interfaceC0885a2.b(str);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                    return;
                }
                k.a("UrlRouter", "onSuccess");
                if (mtopResponse == null) {
                    return;
                }
                try {
                    String string = mtopResponse.getDataJsonObject().getString("result");
                    if (TextUtils.isEmpty(string) || a.InterfaceC0885a.this == null) {
                        return;
                    }
                    try {
                        k.a("UrlRouter", "onSuccess result url:" + string);
                        a.InterfaceC0885a.this.a(string);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                    a.InterfaceC0885a interfaceC0885a2 = a.InterfaceC0885a.this;
                    if (interfaceC0885a2 == null) {
                        return;
                    }
                    try {
                        interfaceC0885a2.b(str);
                    } catch (Exception e3) {
                        e3.printStackTrace();
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
                k.a("UrlRouter", "onError");
                a.InterfaceC0885a interfaceC0885a2 = a.InterfaceC0885a.this;
                if (interfaceC0885a2 == null) {
                    return;
                }
                try {
                    interfaceC0885a2.b(str);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        build.startRequest();
    }
}
