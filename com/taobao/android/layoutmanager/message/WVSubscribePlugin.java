package com.taobao.android.layoutmanager.message;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.e;
import android.taobao.windvane.jsbridge.r;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.kit.core.IObserver;
import com.taobao.message.message_open_api.api.data.topicsubscribe.rpc.SubScribeCenterResultDTO;
import com.taobao.message.subscribe.SubscribeUtils;
import org.json.JSONException;
import org.json.JSONObject;
import tb.kge;

/* loaded from: classes5.dex */
public class WVSubscribePlugin extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ACTION_CANCEL_SUBSCRIBE = "cancelSubscribe";
    public static final String ACTION_DO_SUBSCRIBE = "doSubscribe";
    public static final String ACTION_QUERY_SUBSCRIBE = "querySubscribe";
    public static final String CLASS_NAME = "WVSubscribe";

    static {
        kge.a(268448823);
    }

    public static /* synthetic */ Object ipc$super(WVSubscribePlugin wVSubscribePlugin, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ void access$000(WVSubscribePlugin wVSubscribePlugin, String str, Object obj, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("951deff2", new Object[]{wVSubscribePlugin, str, obj, wVCallBackContext});
        } else {
            wVSubscribePlugin.callBackSuccess(str, obj, wVCallBackContext);
        }
    }

    public static /* synthetic */ void access$100(WVSubscribePlugin wVSubscribePlugin, String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bbad8957", new Object[]{wVSubscribePlugin, str, wVCallBackContext});
        } else {
            wVSubscribePlugin.callBackFail(str, wVCallBackContext);
        }
    }

    @Override // android.taobao.windvane.jsbridge.e
    public boolean execute(String str, String str2, final WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        try {
            JSONObject jSONObject = new JSONObject(str2);
            String optString = jSONObject.optString("activityType");
            String optString2 = jSONObject.optString("subFrom");
            String optString3 = jSONObject.optString("contentId");
            if (StringUtils.isEmpty(optString) || StringUtils.isEmpty(optString2) || StringUtils.isEmpty(optString3)) {
                wVCallBackContext.error();
                return false;
            }
            char c = 65535;
            int hashCode = str.hashCode();
            if (hashCode != -1420829441) {
                if (hashCode != 411977058) {
                    if (hashCode == 775649264 && str.equals(ACTION_CANCEL_SUBSCRIBE)) {
                        c = 1;
                    }
                } else if (str.equals(ACTION_QUERY_SUBSCRIBE)) {
                    c = 2;
                }
            } else if (str.equals(ACTION_DO_SUBSCRIBE)) {
                c = 0;
            }
            if (c == 0) {
                SubscribeUtils.INSTANCE.doSubscribe(optString3, optString, "1", optString2, new IObserver<SubScribeCenterResultDTO>() { // from class: com.taobao.android.layoutmanager.message.WVSubscribePlugin.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.message.kit.core.IObserver
                    public void onComplete() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5cbffcbf", new Object[]{this});
                        }
                    }

                    @Override // com.taobao.message.kit.core.IObserver
                    public /* synthetic */ void onNext(SubScribeCenterResultDTO subScribeCenterResultDTO) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("b4b8495", new Object[]{this, subScribeCenterResultDTO});
                        } else {
                            a(subScribeCenterResultDTO);
                        }
                    }

                    public void a(SubScribeCenterResultDTO subScribeCenterResultDTO) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("962936cf", new Object[]{this, subScribeCenterResultDTO});
                        } else if (subScribeCenterResultDTO == null) {
                        } else {
                            if ("SUCCESS".equals(subScribeCenterResultDTO.getRetCode())) {
                                WVSubscribePlugin.access$000(WVSubscribePlugin.this, "isSubscribed", "true", wVCallBackContext);
                            } else {
                                WVSubscribePlugin.access$100(WVSubscribePlugin.this, "mtop is success,but ret is fail", wVCallBackContext);
                            }
                        }
                    }

                    @Override // com.taobao.message.kit.core.IObserver
                    public void onError(Throwable th) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("cf54aa85", new Object[]{this, th});
                        } else {
                            WVSubscribePlugin.access$100(WVSubscribePlugin.this, th.getMessage(), wVCallBackContext);
                        }
                    }
                });
            } else if (c == 1) {
                SubscribeUtils.INSTANCE.cancelSubscribe(optString3, optString, "1", optString2, new IObserver<SubScribeCenterResultDTO>() { // from class: com.taobao.android.layoutmanager.message.WVSubscribePlugin.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.message.kit.core.IObserver
                    public void onComplete() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5cbffcbf", new Object[]{this});
                        }
                    }

                    @Override // com.taobao.message.kit.core.IObserver
                    public /* synthetic */ void onNext(SubScribeCenterResultDTO subScribeCenterResultDTO) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("b4b8495", new Object[]{this, subScribeCenterResultDTO});
                        } else {
                            a(subScribeCenterResultDTO);
                        }
                    }

                    public void a(SubScribeCenterResultDTO subScribeCenterResultDTO) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("962936cf", new Object[]{this, subScribeCenterResultDTO});
                        } else if (subScribeCenterResultDTO == null) {
                        } else {
                            if ("SUCCESS".equals(subScribeCenterResultDTO.getRetCode())) {
                                WVSubscribePlugin.access$000(WVSubscribePlugin.this, "isSubscribed", "false", wVCallBackContext);
                            } else {
                                WVSubscribePlugin.access$100(WVSubscribePlugin.this, "mtop is success,but ret is fail", wVCallBackContext);
                            }
                        }
                    }

                    @Override // com.taobao.message.kit.core.IObserver
                    public void onError(Throwable th) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("cf54aa85", new Object[]{this, th});
                        } else {
                            WVSubscribePlugin.access$100(WVSubscribePlugin.this, th.getMessage(), wVCallBackContext);
                        }
                    }
                });
            } else if (c == 2) {
                SubscribeUtils.INSTANCE.querySubscribe(optString3, optString, "1", optString2, new IObserver<SubScribeCenterResultDTO>() { // from class: com.taobao.android.layoutmanager.message.WVSubscribePlugin.3
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.message.kit.core.IObserver
                    public void onComplete() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5cbffcbf", new Object[]{this});
                        }
                    }

                    @Override // com.taobao.message.kit.core.IObserver
                    public /* synthetic */ void onNext(SubScribeCenterResultDTO subScribeCenterResultDTO) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("b4b8495", new Object[]{this, subScribeCenterResultDTO});
                        } else {
                            a(subScribeCenterResultDTO);
                        }
                    }

                    public void a(SubScribeCenterResultDTO subScribeCenterResultDTO) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("962936cf", new Object[]{this, subScribeCenterResultDTO});
                        } else if (subScribeCenterResultDTO == null) {
                        } else {
                            if ("SUCCESS".equals(subScribeCenterResultDTO.getRetCode())) {
                                try {
                                    if ("1".equals(subScribeCenterResultDTO.getSubScribeTopicList().get(0).getStatus())) {
                                        WVSubscribePlugin.access$000(WVSubscribePlugin.this, "isSubscribed", "true", wVCallBackContext);
                                        return;
                                    } else {
                                        WVSubscribePlugin.access$000(WVSubscribePlugin.this, "isSubscribed", "false", wVCallBackContext);
                                        return;
                                    }
                                } catch (Exception unused) {
                                    WVSubscribePlugin.access$100(WVSubscribePlugin.this, "mtop is success,but data parser running fail", wVCallBackContext);
                                    return;
                                }
                            }
                            WVSubscribePlugin.access$100(WVSubscribePlugin.this, "mtop is success,but ret is fail", wVCallBackContext);
                        }
                    }

                    @Override // com.taobao.message.kit.core.IObserver
                    public void onError(Throwable th) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("cf54aa85", new Object[]{this, th});
                        } else {
                            WVSubscribePlugin.access$100(WVSubscribePlugin.this, th.getMessage(), wVCallBackContext);
                        }
                    }
                });
            }
            return true;
        } catch (JSONException unused) {
            wVCallBackContext.error();
            return false;
        }
    }

    private void callBackSuccess(String str, Object obj, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96d4d1c8", new Object[]{this, str, obj, wVCallBackContext});
            return;
        }
        r rVar = new r();
        rVar.b();
        rVar.a(str, obj);
        wVCallBackContext.success(rVar);
    }

    private void callBackFail(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d831e8b1", new Object[]{this, str, wVCallBackContext});
            return;
        }
        r rVar = new r();
        rVar.a("HY_FAILED");
        rVar.a("errorMsg", str);
        wVCallBackContext.error(rVar);
    }
}
