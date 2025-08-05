package com.taobao.android.detail.core.debug;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavix.utils.Debuggable;
import com.taobao.android.detail.core.detail.activity.DetailCoreActivity;
import com.taobao.android.trade.boost.annotations.MtopParams;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.RemoteBusiness;
import com.taobao.themis.kernel.i;
import java.util.HashMap;
import java.util.Map;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.intf.MtopBuilder;
import tb.emu;
import tb.jpx;
import tb.kge;

/* loaded from: classes4.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DATA_TYPE_RENDERT_DATA = "RenderData";
    public static final String KEY_DATA = "data";
    public static final String KEY_RENDERT_DATA = "protocalDetail";
    public static final String KEY_UPLOAD_DATA_TYPE = "dataType";
    public static final String KEY_UUID = "uuid";
    public static final String REQUEST_TYPE_NEW_DETAIL = "batchget";
    public static final String REQUEST_TYPE_NEW_MTOP = "detailget";
    public static final String REQUEST_TYPE_OLD_MTOP = "getdetail";
    public static final String REQUEST_TYPE_STREAM = "streamRequest";
    public static final String VALUE_TRUE = "true";

    static {
        kge.a(-1174240219);
        emu.a("com.taobao.android.detail.core.debug.PostDetailMtopResultHelper");
    }

    public static void a(Context context, MtopBuilder mtopBuilder, MtopResponse mtopResponse, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8363026b", new Object[]{context, mtopBuilder, mtopResponse, str});
        } else if (mtopBuilder == null || mtopBuilder.request == null) {
        } else {
            a(context, mtopBuilder.request.getData(), mtopResponse, str);
        }
    }

    public static void a(Context context, RemoteBusiness remoteBusiness, MtopResponse mtopResponse, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25cc2acf", new Object[]{context, remoteBusiness, mtopResponse, str});
        } else if (remoteBusiness == null || remoteBusiness.request == null) {
        } else {
            a(context, remoteBusiness.request.getData(), mtopResponse, str);
        }
    }

    public static boolean a(Context context, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1cb6e294", new Object[]{context, jSONObject})).booleanValue();
        }
        if (jpx.a(context) && (context instanceof DetailCoreActivity) && jSONObject != null) {
            return "true".equals(a(context, "e2eTestFlow"));
        }
        return false;
    }

    private static String a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cfe597b6", new Object[]{context, str});
        }
        if ((context instanceof DetailCoreActivity) && !TextUtils.isEmpty(str)) {
            return ((DetailCoreActivity) context).getIntent().getData().getQueryParameter(str);
        }
        return null;
    }

    public static void a(Context context, String str, MtopResponse mtopResponse, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c7e7379", new Object[]{context, str, mtopResponse, str2});
        } else if (!jpx.a(context)) {
        } else {
            try {
                HashMap hashMap = new HashMap();
                hashMap.put(i.CDN_REQUEST_TYPE, str2);
                hashMap.put("mtopDetailParams", str);
                hashMap.put("mtopDetailResp", "");
                RemoteBusiness a2 = a(hashMap, context);
                a2.registeListener((IRemoteListener) new IRemoteBaseListener() { // from class: com.taobao.android.detail.core.debug.PostDetailMtopResultHelper$1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
                    public void onSystemError(int i, MtopResponse mtopResponse2, Object obj) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse2, obj});
                        } else {
                            com.taobao.android.detail.core.utils.i.a("PostMtopHelper", new String(mtopResponse2.getBytedata()));
                        }
                    }

                    @Override // com.taobao.tao.remotebusiness.IRemoteListener
                    public void onSuccess(int i, MtopResponse mtopResponse2, BaseOutDo baseOutDo, Object obj) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse2, baseOutDo, obj});
                        } else {
                            com.taobao.android.detail.core.utils.i.a("PostMtopHelper", "postMtopResultSuccess");
                        }
                    }

                    @Override // com.taobao.tao.remotebusiness.IRemoteListener
                    public void onError(int i, MtopResponse mtopResponse2, Object obj) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse2, obj});
                        } else {
                            com.taobao.android.detail.core.utils.i.a("PostMtopHelper", new String(mtopResponse2.getBytedata()));
                        }
                    }
                });
                a2.asyncRequest();
            } catch (Throwable unused) {
            }
        }
    }

    public static void a(Map<String, String> map, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38873cb1", new Object[]{map, str, str2});
        } else if (!Debuggable.isDebug() || map == null || map.isEmpty() || TextUtils.isEmpty(map.get("pairUuid"))) {
        } else {
            String str3 = map.get("uuid");
            if (TextUtils.isEmpty(str3)) {
                return;
            }
            try {
                HashMap hashMap = new HashMap();
                hashMap.put(i.CDN_REQUEST_TYPE, str2);
                hashMap.put("protocalDetailParams", JSONObject.toJSONString(map));
                hashMap.put(KEY_RENDERT_DATA, str);
                HashMap hashMap2 = new HashMap();
                hashMap2.put("uuid", str3);
                hashMap2.put("data", JSONObject.toJSONString(hashMap));
                MtopRequest mtopRequest = new MtopRequest();
                mtopRequest.setData(JSONObject.toJSONString(hashMap2));
                mtopRequest.setApiName("mtop.taobao.detail.qa.submitE2EData");
                mtopRequest.setVersion("1.0");
                RemoteBusiness build = RemoteBusiness.build(mtopRequest);
                build.mo1305reqMethod(MethodEnum.POST);
                build.mo1328setUnitStrategy(MtopParams.UnitStrategy.UNIT_TRADE.toString());
                build.registeListener((IRemoteListener) new IRemoteBaseListener() { // from class: com.taobao.android.detail.core.debug.PostDetailMtopResultHelper$2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
                    public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                        } else {
                            com.taobao.android.detail.core.utils.i.a("PostMtopHelper", new String(mtopResponse.getBytedata()));
                        }
                    }

                    @Override // com.taobao.tao.remotebusiness.IRemoteListener
                    public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                        } else {
                            com.taobao.android.detail.core.utils.i.a("PostMtopHelper", "postMtopResultSuccess");
                        }
                    }

                    @Override // com.taobao.tao.remotebusiness.IRemoteListener
                    public void onError(int i, MtopResponse mtopResponse, Object obj) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                        } else {
                            com.taobao.android.detail.core.utils.i.a("PostMtopHelper", new String(mtopResponse.getBytedata()));
                        }
                    }
                });
                build.asyncRequest();
            } catch (Throwable unused) {
            }
        }
    }

    public static RemoteBusiness a(Map<String, String> map, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RemoteBusiness) ipChange.ipc$dispatch("42d46f8b", new Object[]{map, context});
        }
        map.putAll(a(context));
        HashMap hashMap = new HashMap();
        hashMap.put("uuid", b(context));
        hashMap.put("data", JSONObject.toJSONString(map));
        MtopRequest mtopRequest = new MtopRequest();
        mtopRequest.setData(JSONObject.toJSONString(hashMap));
        mtopRequest.setApiName("mtop.taobao.detail.qa.submitE2EData");
        mtopRequest.setVersion("1.0");
        RemoteBusiness build = RemoteBusiness.build(mtopRequest);
        build.mo1305reqMethod(MethodEnum.POST);
        build.mo1328setUnitStrategy(MtopParams.UnitStrategy.UNIT_TRADE.toString());
        return build;
    }

    private static Map<String, String> a(Context context) {
        Intent intent;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("4d84e95", new Object[]{context});
        }
        HashMap hashMap = new HashMap();
        if (!(context instanceof Activity) || (intent = ((Activity) context).getIntent()) == null) {
            return hashMap;
        }
        hashMap.put("pageUrl", intent.getDataString());
        Uri data = intent.getData();
        if (data != null) {
            hashMap.put("pairUuid", data.getQueryParameter("pairUuid"));
            hashMap.put("dataFlowType", data.getQueryParameter("dataFlowType"));
        }
        return hashMap;
    }

    private static String b(Context context) {
        Intent intent;
        Uri data;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("31400281", new Object[]{context});
        }
        String queryParameter = (!(context instanceof Activity) || (intent = ((Activity) context).getIntent()) == null || (data = intent.getData()) == null) ? "" : data.getQueryParameter("uuid");
        return TextUtils.isEmpty(queryParameter) ? "" : queryParameter;
    }
}
