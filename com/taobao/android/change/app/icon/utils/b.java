package com.taobao.android.change.app.icon.utils;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.change.app.icon.mtop.ChangeAppIconMtopRequest;
import com.taobao.android.change.app.icon.mtop.ChangeAppIconMtopResponse;
import com.taobao.android.change.app.icon.mtop.ChangeAppIconRequest;
import com.taobao.login4android.Login;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.MtopBusiness;
import com.taobao.tlog.adapter.AdapterForTLog;
import java.util.HashMap;
import mtopsdk.mtop.common.MtopListener;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import org.json.JSONObject;
import tb.igc;
import tb.kge;
import tb.riy;

/* loaded from: classes4.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1953004975);
    }

    public static /* synthetic */ ChangeAppIconMtopResponse a(MtopResponse mtopResponse, Class cls) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ChangeAppIconMtopResponse) ipChange.ipc$dispatch("90ae88b9", new Object[]{mtopResponse, cls}) : b(mtopResponse, cls);
    }

    public static void a(ChangeAppIconRequest changeAppIconRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa6efb27", new Object[]{changeAppIconRequest});
        } else {
            a(changeAppIconRequest, (com.taobao.android.change.app.icon.mtop.a) null);
        }
    }

    public static void a(final ChangeAppIconRequest changeAppIconRequest, final com.taobao.android.change.app.icon.mtop.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c53cbbc4", new Object[]{changeAppIconRequest, aVar});
            return;
        }
        boolean a2 = c.a(c.ORANGE_KEY_CHANGE_APP_ICON_ENABLE_MTOP_REPORT, "true");
        AdapterForTLog.loge(igc.TAG, "sendChangeAppIconInfo report:" + a2);
        if (!a2) {
            return;
        }
        f.a().a(new Runnable() { // from class: com.taobao.android.change.app.icon.utils.b.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                try {
                    boolean checkSessionValid = Login.checkSessionValid();
                    AdapterForTLog.loge(igc.TAG, "sendChangeAppIconInfo checkSessionValid:" + checkSessionValid);
                    if (!checkSessionValid) {
                        return;
                    }
                    HashMap hashMap = new HashMap();
                    if (!TextUtils.isEmpty(changeAppIconRequest.errorMsg)) {
                        String str = changeAppIconRequest.errorMsg;
                        changeAppIconRequest.errorMsg = h.a(str, c.a(c.ORANGE_KEY_CHANGE_APP_ICON_ERROR_MSG_MTOP_MAX_LENGTH, 20));
                        hashMap.put("error", h.a(str));
                    }
                    String jSONString = JSON.toJSONString(changeAppIconRequest);
                    g.c(g.PAGE_NAME, "mtop", "requestInfo:" + jSONString, changeAppIconRequest.status, hashMap);
                    ChangeAppIconMtopRequest changeAppIconMtopRequest = new ChangeAppIconMtopRequest();
                    changeAppIconMtopRequest.API_NAME = "mtop.taobao.tlens.icon.log.upload";
                    changeAppIconMtopRequest.VERSION = "1.0";
                    changeAppIconMtopRequest.addParam("request", jSONString);
                    b.a(changeAppIconMtopRequest, ChangeAppIconMtopResponse.class, Login.getUserId(), new com.taobao.android.change.app.icon.mtop.a() { // from class: com.taobao.android.change.app.icon.utils.b.1.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        {
                            AnonymousClass1.this = this;
                        }

                        @Override // com.taobao.android.change.app.icon.mtop.a
                        public void a(ChangeAppIconMtopResponse changeAppIconMtopResponse) {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("8f429f71", new Object[]{this, changeAppIconMtopResponse});
                                return;
                            }
                            AdapterForTLog.loge(igc.TAG, "sendChangeAppIconInfo success");
                            if (aVar == null) {
                                return;
                            }
                            aVar.a(changeAppIconMtopResponse);
                        }

                        @Override // com.taobao.android.change.app.icon.mtop.a
                        public void b(ChangeAppIconMtopResponse changeAppIconMtopResponse) {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("118d5450", new Object[]{this, changeAppIconMtopResponse});
                                return;
                            }
                            AdapterForTLog.loge(igc.TAG, "sendChangeAppIconInfo fail");
                            if (aVar == null) {
                                return;
                            }
                            aVar.b(changeAppIconMtopResponse);
                        }
                    });
                } catch (Throwable th) {
                    AdapterForTLog.loge(igc.TAG, "sendChangeAppIconInfo error", th);
                    com.taobao.android.change.app.icon.mtop.a aVar2 = aVar;
                    if (aVar2 == null) {
                        return;
                    }
                    aVar2.b(null);
                }
            }
        });
    }

    public static <T extends ChangeAppIconMtopResponse<?>> void a(ChangeAppIconMtopRequest changeAppIconMtopRequest, final Class<T> cls, String str, final com.taobao.android.change.app.icon.mtop.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8cbfcf3", new Object[]{changeAppIconMtopRequest, cls, str, aVar});
            return;
        }
        try {
            MtopBusiness build = MtopBusiness.build(a(changeAppIconMtopRequest));
            if (!TextUtils.isEmpty(str)) {
                build.mo1325setReqUserId(str);
            }
            build.mo1305reqMethod(MethodEnum.POST);
            build.mo1312setConnectionTimeoutMilliSecond(changeAppIconMtopRequest.connectionTimeoutMilliSecond);
            build.mo1326setSocketTimeoutMilliSecond(changeAppIconMtopRequest.socketTimeoutMilliSecond);
            build.mo1342showLoginUI(false);
            build.mo1337addListener((MtopListener) new IRemoteBaseListener() { // from class: com.taobao.android.change.app.icon.utils.MtopUtils$2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.tao.remotebusiness.IRemoteListener
                public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                        return;
                    }
                    AdapterForTLog.loge("ChangeAppIcon.mtop", "onSuccess() called with: requestType = [" + i + "], response = [" + mtopResponse + "], pojo = [" + baseOutDo + "], requestContext = [" + obj + riy.ARRAY_END_STR);
                    ChangeAppIconMtopResponse a2 = b.a(mtopResponse, cls);
                    com.taobao.android.change.app.icon.mtop.a aVar2 = aVar;
                    if (aVar2 == null) {
                        return;
                    }
                    aVar2.a(a2);
                }

                @Override // com.taobao.tao.remotebusiness.IRemoteListener
                public void onError(int i, MtopResponse mtopResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                    } else {
                        handleError(i, mtopResponse, obj, cls, aVar);
                    }
                }

                @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
                public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                    } else {
                        handleError(i, mtopResponse, obj, cls, aVar);
                    }
                }

                private <T extends ChangeAppIconMtopResponse<?>> void handleError(int i, MtopResponse mtopResponse, Object obj, Class<T> cls2, com.taobao.android.change.app.icon.mtop.a aVar2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5161056b", new Object[]{this, new Integer(i), mtopResponse, obj, cls2, aVar2});
                        return;
                    }
                    AdapterForTLog.loge("ChangeAppIcon.mtop", "onError() called with: requestType = [" + i + "], response = [" + mtopResponse + "], requestContext = [" + obj + riy.ARRAY_END_STR);
                    try {
                        try {
                            ChangeAppIconMtopResponse a2 = b.a(mtopResponse, cls2);
                            if (aVar2 == null) {
                                return;
                            }
                            aVar2.b(a2);
                        } catch (Exception e) {
                            AdapterForTLog.loge("ChangeAppIcon.mtop", "handleError exception", e);
                            if (aVar2 == null) {
                                return;
                            }
                            aVar2.b(null);
                        }
                    } catch (Throwable th) {
                        if (aVar2 != null) {
                            aVar2.b(null);
                        }
                        throw th;
                    }
                }
            });
            AdapterForTLog.loge("ChangeAppIcon.mtop", "startRequest() request:" + JSON.toJSONString(changeAppIconMtopRequest));
            build.startRequest();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private static MtopRequest a(ChangeAppIconMtopRequest changeAppIconMtopRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopRequest) ipChange.ipc$dispatch("f9ea3c3a", new Object[]{changeAppIconMtopRequest});
        }
        if (changeAppIconMtopRequest == null) {
            return null;
        }
        try {
            MtopRequest mtopRequest = new MtopRequest();
            mtopRequest.setApiName(changeAppIconMtopRequest.API_NAME);
            mtopRequest.setVersion(changeAppIconMtopRequest.VERSION);
            mtopRequest.setNeedEcode(changeAppIconMtopRequest.NEED_ECODE);
            mtopRequest.setNeedSession(changeAppIconMtopRequest.NEED_SESSION);
            JSONObject jSONObject = new JSONObject();
            for (int i = 0; i < changeAppIconMtopRequest.paramNames.size(); i++) {
                if (changeAppIconMtopRequest.paramNames.get(i) != null && changeAppIconMtopRequest.paramValues.get(i) != null) {
                    jSONObject.put(changeAppIconMtopRequest.paramNames.get(i), changeAppIconMtopRequest.paramValues.get(i).toString());
                }
            }
            mtopRequest.setData(jSONObject.toString());
            return mtopRequest;
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    private static <T extends ChangeAppIconMtopResponse<?>> T b(MtopResponse mtopResponse, Class<T> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("d39327d8", new Object[]{mtopResponse, cls});
        }
        try {
            JSONObject dataJsonObject = mtopResponse.getDataJsonObject();
            if (dataJsonObject == null) {
                return null;
            }
            return (T) JSON.parseObject(dataJsonObject.toString(), cls);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
