package com.taobao.android.detail.wrapper.ext.request.client;

import android.content.Context;
import com.alibaba.ability.localization.b;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.constants.MspGlobalDefine;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.activity.base.BaseActivity;
import com.taobao.android.detail.core.detail.controller.callback.e;
import com.taobao.android.detail.core.request.MtopRequestListener;
import com.taobao.android.detail.core.utils.NetworkUtils;
import com.taobao.android.detail.wrapper.activity.DetailActivity;
import com.taobao.android.detail.wrapper.ext.request.client.a;
import com.taobao.android.live.plugin.atype.flexalocal.input.InputFrame3;
import com.taobao.login4android.session.constants.SessionConstants;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.taobao.R;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopResponse;
import tb.ecg;
import tb.emu;
import tb.enh;
import tb.epo;
import tb.kge;

/* loaded from: classes5.dex */
public class CustomApiRequestClient extends a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public WeakReference<MtopRequestListener<String>> d;

    static {
        kge.a(182369248);
    }

    public static /* synthetic */ Object ipc$super(CustomApiRequestClient customApiRequestClient, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public CustomApiRequestClient(Context context, Map<String, String> map, MtopRequestListener<String> mtopRequestListener) {
        super(context);
        a(map, mtopRequestListener);
        emu.a("com.taobao.android.detail.wrapper.ext.request.client.CustomApiRequestClient");
    }

    private void a(Map<String, String> map, MtopRequestListener<String> mtopRequestListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e27affd6", new Object[]{this, map, mtopRequestListener});
            return;
        }
        a(a(map));
        this.d = new WeakReference<>(mtopRequestListener);
        a(new MtopCallback());
    }

    private a.C0446a a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a.C0446a) ipChange.ipc$dispatch("1e1f2519", new Object[]{this, map});
        }
        a.C0446a c0446a = new a.C0446a();
        if (map != null && map.size() != 0) {
            JSONObject parseObject = JSONObject.parseObject(map.get("apiInfo"));
            c0446a.f11354a = parseObject.getString("apiName");
            c0446a.b = parseObject.getString("apiVersion");
            c0446a.c = parseObject.getString("method");
            c0446a.d = parseObject.getString("unitStrategy");
            c0446a.e = parseObject.getString("WUA");
            c0446a.f = parseObject.getString(SessionConstants.ECODE);
            c0446a.g = parseObject.getString(MspGlobalDefine.SESSION);
            c0446a.h = map.get("data");
            c0446a.i = JSONObject.parseObject(map.get("headerInfo"));
        }
        return c0446a;
    }

    /* loaded from: classes5.dex */
    public class MtopCallback implements IRemoteBaseListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-938125167);
            kge.a(-525336021);
        }

        private MtopCallback() {
        }

        public static /* synthetic */ boolean access$100(MtopCallback mtopCallback, MtopResponse mtopResponse, BaseActivity baseActivity) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9c956557", new Object[]{mtopCallback, mtopResponse, baseActivity})).booleanValue() : mtopCallback.handleNormalDetailUpdateError(mtopResponse, baseActivity);
        }

        @Override // com.taobao.tao.remotebusiness.IRemoteListener
        public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
            } else {
                callSuccessListener(getMtopData(mtopResponse), mtopResponse);
            }
        }

        private String getMtopData(MtopResponse mtopResponse) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("7cebab8c", new Object[]{this, mtopResponse});
            }
            if (mtopResponse != null && mtopResponse.getBytedata() != null) {
                return new String(mtopResponse.getBytedata());
            }
            return null;
        }

        private boolean callSuccessListener(String str, MtopResponse mtopResponse) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("a3745eb3", new Object[]{this, str, mtopResponse})).booleanValue();
            }
            MtopRequestListener<String> mtopRequestListener = CustomApiRequestClient.this.d.get();
            if (mtopRequestListener == null) {
                return false;
            }
            if (str == null) {
                mtopRequestListener.a(mtopResponse);
            } else {
                mtopRequestListener.b(str);
            }
            return true;
        }

        @Override // com.taobao.tao.remotebusiness.IRemoteListener
        public void onError(int i, MtopResponse mtopResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                return;
            }
            callFailureListener(mtopResponse);
            reportMtopError(false, mtopResponse);
        }

        @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
        public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                return;
            }
            callFailureListener(mtopResponse);
            reportMtopError(true, mtopResponse);
        }

        private boolean callFailureListener(MtopResponse mtopResponse) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("9d372cb0", new Object[]{this, mtopResponse})).booleanValue();
            }
            if (!(CustomApiRequestClient.this.f11353a instanceof DetailActivity) || ((DetailActivity) CustomApiRequestClient.this.f11353a).b == null) {
                return false;
            }
            final DetailActivity detailActivity = (DetailActivity) CustomApiRequestClient.this.f11353a;
            detailActivity.b.a(new e.c() { // from class: com.taobao.android.detail.wrapper.ext.request.client.CustomApiRequestClient.MtopCallback.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.detail.core.detail.controller.callback.e.c
                public void a(enh enhVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("e72cc599", new Object[]{this, enhVar});
                        return;
                    }
                    if (detailActivity.v != null) {
                        detailActivity.v.i();
                        detailActivity.v.b(detailActivity.b());
                    }
                    if (enhVar == null || enhVar.b == null) {
                        return;
                    }
                    detailActivity.b.a(enhVar.c, false);
                }

                @Override // com.taobao.android.detail.core.detail.controller.callback.e.c
                public void a(MtopResponse mtopResponse2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("ab3bce2d", new Object[]{this, mtopResponse2});
                        return;
                    }
                    if (detailActivity.v != null) {
                        detailActivity.v.a(mtopResponse2 != null ? mtopResponse2.getRetMsg() : "");
                    }
                    MtopCallback.access$100(MtopCallback.this, mtopResponse2, detailActivity);
                }
            }, new HashMap<String, String>() { // from class: com.taobao.android.detail.wrapper.ext.request.client.CustomApiRequestClient.MtopCallback.2
                {
                    put("forbidSkuWeexSku", "true");
                }
            });
            return true;
        }

        private boolean handleNormalDetailUpdateError(MtopResponse mtopResponse, BaseActivity baseActivity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("e6f68c27", new Object[]{this, mtopResponse, baseActivity})).booleanValue();
            }
            if (mtopResponse == null) {
                epo.a(b.a(R.string.x_detail_app_busy_system_tired));
                return true;
            } else if (mtopResponse.isApiSuccess()) {
                return false;
            } else {
                if (mtopResponse.isSessionInvalid()) {
                    return true;
                }
                if (mtopResponse.isNetworkError() && !NetworkUtils.a(epo.a())) {
                    com.taobao.android.detail.core.detail.kit.view.widget.base.a aVar = new com.taobao.android.detail.core.detail.kit.view.widget.base.a(baseActivity, baseActivity);
                    aVar.a((String) null);
                    aVar.a();
                    return true;
                }
                epo.a(b.a(R.string.x_detail_app_busy_system_tired));
                return true;
            }
        }

        private void reportMtopError(boolean z, MtopResponse mtopResponse) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a6709be6", new Object[]{this, new Boolean(z), mtopResponse});
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("requestParam", CustomApiRequestClient.this.b);
            ecg.a(CustomApiRequestClient.this.f11353a, mtopResponse, hashMap);
            HashMap hashMap2 = new HashMap();
            hashMap2.put(InputFrame3.TYPE_RESPONSE, mtopResponse);
            ecg.c(CustomApiRequestClient.this.f11353a, "CustomApiRequest", z ? "custom_api_system_error" : "custom_api_request_error", z ? "custom_api_onSystemError" : "custom_api_onError", hashMap2);
        }
    }
}
