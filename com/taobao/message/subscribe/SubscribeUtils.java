package com.taobao.message.subscribe;

import mtopsdk.common.util.StringUtils;
import android.util.Log;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.layoutmanager.message.WVSubscribePlugin;
import com.taobao.message.kit.core.IObserver;
import com.taobao.message.kit.util.UIHandler;
import com.taobao.message.message_open_api.api.data.topicsubscribe.rpc.SubScribeCenterResultDTO;
import com.taobao.tao.Globals;
import com.taobao.tao.log.TLog;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.RemoteBusiness;
import com.taobao.uikit.extend.component.unify.Toast.TBToast;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.q;
import kotlin.text.d;
import kotlin.text.n;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.IMTOPDataObject;
import mtopsdk.mtop.domain.MtopResponse;
import tb.kge;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J<\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bJ<\u0010\r\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bJ<\u0010\u000e\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¨\u0006\u0010"}, d2 = {"Lcom/taobao/message/subscribe/SubscribeUtils;", "", "()V", WVSubscribePlugin.ACTION_CANCEL_SUBSCRIBE, "", "topicId", "", "activityType", "version", "subFrom", "observer", "Lcom/taobao/message/kit/core/IObserver;", "Lcom/taobao/message/message_open_api/api/data/topicsubscribe/rpc/SubScribeCenterResultDTO;", WVSubscribePlugin.ACTION_DO_SUBSCRIBE, WVSubscribePlugin.ACTION_QUERY_SUBSCRIBE, "topicIds", "message_base_tb_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes7.dex */
public final class SubscribeUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final SubscribeUtils INSTANCE;

    static {
        kge.a(1005495367);
        INSTANCE = new SubscribeUtils();
    }

    private SubscribeUtils() {
    }

    public final void doSubscribe(String str, String str2, String str3, String str4, IObserver<SubScribeCenterResultDTO> observer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("881d0a90", new Object[]{this, str, str2, str3, str4, observer});
            return;
        }
        q.c(observer, "observer");
        if (!StringUtils.isEmpty(str) && !StringUtils.isEmpty(str2)) {
            MtopTaobaoAlimpBentleySubscribeCenterActionBindingRequest mtopTaobaoAlimpBentleySubscribeCenterActionBindingRequest = new MtopTaobaoAlimpBentleySubscribeCenterActionBindingRequest();
            if (str3 == null) {
                mtopTaobaoAlimpBentleySubscribeCenterActionBindingRequest.setVersion(1L);
            } else {
                mtopTaobaoAlimpBentleySubscribeCenterActionBindingRequest.setVersion(Long.parseLong(str3));
            }
            mtopTaobaoAlimpBentleySubscribeCenterActionBindingRequest.setTopicId(str);
            mtopTaobaoAlimpBentleySubscribeCenterActionBindingRequest.setActivityType(str2);
            mtopTaobaoAlimpBentleySubscribeCenterActionBindingRequest.setBindingPreCheck(true);
            mtopTaobaoAlimpBentleySubscribeCenterActionBindingRequest.setSdkVersion(Constants.SDK_VERSION);
            if (str4 != null) {
                mtopTaobaoAlimpBentleySubscribeCenterActionBindingRequest.setSubFrom(str4);
            }
            RemoteBusiness build = RemoteBusiness.build((IMTOPDataObject) mtopTaobaoAlimpBentleySubscribeCenterActionBindingRequest);
            build.registerListener((IRemoteListener) new SubscribeUtils$doSubscribe$1(observer, "DoSubscribeCall", str, str2, str4));
            build.startRequest(MtopTaobaoAlimpBentleySubscribeCenterActionBindingResponse.class);
            return;
        }
        observer.onError(new RuntimeException("param error "));
    }

    public final void cancelSubscribe(String str, String str2, String str3, String str4, final IObserver<SubScribeCenterResultDTO> observer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ced58bff", new Object[]{this, str, str2, str3, str4, observer});
            return;
        }
        q.c(observer, "observer");
        if (!StringUtils.isEmpty(str) && !StringUtils.isEmpty(str2)) {
            MtopTaobaoAlimpBentleySubscribeCenterActionCancelRequest mtopTaobaoAlimpBentleySubscribeCenterActionCancelRequest = new MtopTaobaoAlimpBentleySubscribeCenterActionCancelRequest();
            if (str3 == null) {
                mtopTaobaoAlimpBentleySubscribeCenterActionCancelRequest.setVersion(1L);
            } else {
                mtopTaobaoAlimpBentleySubscribeCenterActionCancelRequest.setVersion(Long.parseLong(str3));
            }
            mtopTaobaoAlimpBentleySubscribeCenterActionCancelRequest.setTopicId(str);
            mtopTaobaoAlimpBentleySubscribeCenterActionCancelRequest.setActivityType(str2);
            mtopTaobaoAlimpBentleySubscribeCenterActionCancelRequest.setSdkVersion(Constants.SDK_VERSION);
            if (str4 != null) {
                mtopTaobaoAlimpBentleySubscribeCenterActionCancelRequest.setSubFrom(str4);
            }
            RemoteBusiness build = RemoteBusiness.build((IMTOPDataObject) mtopTaobaoAlimpBentleySubscribeCenterActionCancelRequest);
            build.registerListener((IRemoteListener) new IRemoteBaseListener() { // from class: com.taobao.message.subscribe.SubscribeUtils$cancelSubscribe$1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
                public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                        return;
                    }
                    try {
                        final SubScribeCenterResultDTO subScribeCenterResultDTO = new SubScribeCenterResultDTO();
                        subScribeCenterResultDTO.setToastText(Constants.DEFAULT_TOAST);
                        subScribeCenterResultDTO.setRetCode("MTOP_FAIL");
                        subScribeCenterResultDTO.setRetMsg("接口调用失败");
                        UIHandler.post(new Runnable() { // from class: com.taobao.message.subscribe.SubscribeUtils$cancelSubscribe$1$onSystemError$1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // java.lang.Runnable
                            public final void run() {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                    return;
                                }
                                String toastText = SubScribeCenterResultDTO.this.getToastText();
                                q.a((Object) toastText, "subScribeCenterResultDTO.toastText");
                                TBToast.makeText(Globals.getApplication(), Util.processUIText(toastText)).show();
                            }
                        });
                        IObserver.this.onNext(subScribeCenterResultDTO);
                        IObserver.this.onComplete();
                        if (mtopResponse != null) {
                            byte[] bytedata = mtopResponse.getBytedata();
                            q.a((Object) bytedata, "(mtopResponse as MtopResponse).bytedata");
                            TLog.loge(Constants.TAG, r2 + " onSystemError() called with: requestType = [" + i + "], mtopResponse = [" + JSON.toJSONString((MtopTaobaoAlimpBentleySubscribeCenterActionCancelResponse) JSON.parseObject(new String(bytedata, d.UTF_8), MtopTaobaoAlimpBentleySubscribeCenterActionCancelResponse.class)) + "], o = [" + obj + ']');
                            return;
                        }
                        throw new TypeCastException("null cannot be cast to non-null type mtopsdk.mtop.domain.MtopResponse");
                    } catch (Throwable th) {
                        TLog.loge(Constants.TAG, Log.getStackTraceString(th));
                    }
                }

                @Override // com.taobao.tao.remotebusiness.IRemoteListener
                public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                    MtopTaobaoAlimpBentleySubscribeCenterActionCancelResponseData mo2429getData;
                    MtopTaobaoAlimpBentleySubscribeCenterActionCancelResponseData mo2429getData2;
                    SubScribeCenterResultDTO subScribeCenterResultDTO;
                    final String toastText;
                    MtopTaobaoAlimpBentleySubscribeCenterActionCancelResponseData mo2429getData3;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                        return;
                    }
                    try {
                        if (baseOutDo != null) {
                            MtopTaobaoAlimpBentleySubscribeCenterActionCancelResponse mtopTaobaoAlimpBentleySubscribeCenterActionCancelResponse = (MtopTaobaoAlimpBentleySubscribeCenterActionCancelResponse) baseOutDo;
                            TLog.loge(Constants.TAG, r2 + " onSuccess() called with: requestType = [" + i + "], mtopResponse = [" + JSON.toJSONString(mtopTaobaoAlimpBentleySubscribeCenterActionCancelResponse) + "], o = [" + obj + ']');
                            if (mtopTaobaoAlimpBentleySubscribeCenterActionCancelResponse != null && (mo2429getData3 = mtopTaobaoAlimpBentleySubscribeCenterActionCancelResponse.mo2429getData()) != null && mo2429getData3.model != null) {
                                String str5 = mtopTaobaoAlimpBentleySubscribeCenterActionCancelResponse.getRet()[0];
                                q.a((Object) str5, "response.ret[0]");
                                List b = n.b((CharSequence) str5, new String[]{"::"}, false, 0, 6, (Object) null);
                                SubScribeCenterResultDTO subScribeCenterResultDTO2 = mtopTaobaoAlimpBentleySubscribeCenterActionCancelResponse.mo2429getData().model;
                                q.a((Object) subScribeCenterResultDTO2, "response.data.model");
                                subScribeCenterResultDTO2.setRetCode((String) b.get(0));
                                SubScribeCenterResultDTO subScribeCenterResultDTO3 = mtopTaobaoAlimpBentleySubscribeCenterActionCancelResponse.mo2429getData().model;
                                q.a((Object) subScribeCenterResultDTO3, "response.data.model");
                                subScribeCenterResultDTO3.setRetMsg((String) b.get(1));
                            }
                            if (mtopTaobaoAlimpBentleySubscribeCenterActionCancelResponse != null && (mo2429getData2 = mtopTaobaoAlimpBentleySubscribeCenterActionCancelResponse.mo2429getData()) != null && (subScribeCenterResultDTO = mo2429getData2.model) != null && (toastText = subScribeCenterResultDTO.getToastText()) != null && !StringUtils.isEmpty(toastText)) {
                                UIHandler.post(new Runnable() { // from class: com.taobao.message.subscribe.SubscribeUtils$cancelSubscribe$1$onSuccess$2$1
                                    public static volatile transient /* synthetic */ IpChange $ipChange;

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        IpChange ipChange3 = $ipChange;
                                        if (ipChange3 instanceof IpChange) {
                                            ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                        } else {
                                            TBToast.makeText(Globals.getApplication(), Util.processUIText(toastText)).show();
                                        }
                                    }
                                });
                            }
                            IObserver iObserver = IObserver.this;
                            SubScribeCenterResultDTO subScribeCenterResultDTO4 = (mtopTaobaoAlimpBentleySubscribeCenterActionCancelResponse == null || (mo2429getData = mtopTaobaoAlimpBentleySubscribeCenterActionCancelResponse.mo2429getData()) == null) ? null : mo2429getData.model;
                            if (subScribeCenterResultDTO4 == null) {
                                q.a();
                            }
                            iObserver.onNext(subScribeCenterResultDTO4);
                            IObserver.this.onComplete();
                            return;
                        }
                        throw new TypeCastException("null cannot be cast to non-null type com.taobao.message.subscribe.MtopTaobaoAlimpBentleySubscribeCenterActionCancelResponse");
                    } catch (Throwable th) {
                        TLog.loge(Constants.TAG, Log.getStackTraceString(th));
                    }
                }

                @Override // com.taobao.tao.remotebusiness.IRemoteListener
                public void onError(int i, MtopResponse mtopResponse, Object obj) {
                    MtopTaobaoAlimpBentleySubscribeCenterActionCancelResponseData mo2429getData;
                    MtopTaobaoAlimpBentleySubscribeCenterActionCancelResponseData mo2429getData2;
                    SubScribeCenterResultDTO subScribeCenterResultDTO;
                    MtopTaobaoAlimpBentleySubscribeCenterActionCancelResponseData mo2429getData3;
                    SubScribeCenterResultDTO subScribeCenterResultDTO2;
                    final String toastText;
                    MtopTaobaoAlimpBentleySubscribeCenterActionCancelResponseData mo2429getData4;
                    MtopTaobaoAlimpBentleySubscribeCenterActionCancelResponseData mo2429getData5;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                        return;
                    }
                    try {
                        if (mtopResponse != null) {
                            byte[] bytedata = mtopResponse.getBytedata();
                            q.a((Object) bytedata, "(mtopResponse as MtopResponse).bytedata");
                            MtopTaobaoAlimpBentleySubscribeCenterActionCancelResponse mtopTaobaoAlimpBentleySubscribeCenterActionCancelResponse = (MtopTaobaoAlimpBentleySubscribeCenterActionCancelResponse) JSON.parseObject(new String(bytedata, d.UTF_8), MtopTaobaoAlimpBentleySubscribeCenterActionCancelResponse.class);
                            TLog.loge(Constants.TAG, r2 + " onError() called with: requestType = [" + i + "], mtopResponse = [" + JSON.toJSONString(mtopTaobaoAlimpBentleySubscribeCenterActionCancelResponse) + "], o = [" + obj + ']');
                            SubScribeCenterResultDTO subScribeCenterResultDTO3 = null;
                            if ((mtopTaobaoAlimpBentleySubscribeCenterActionCancelResponse != null ? mtopTaobaoAlimpBentleySubscribeCenterActionCancelResponse.mo2429getData() : null) != null) {
                                if (((mtopTaobaoAlimpBentleySubscribeCenterActionCancelResponse == null || (mo2429getData5 = mtopTaobaoAlimpBentleySubscribeCenterActionCancelResponse.mo2429getData()) == null) ? null : mo2429getData5.model) == null) {
                                    mtopTaobaoAlimpBentleySubscribeCenterActionCancelResponse.mo2429getData().model = new SubScribeCenterResultDTO();
                                }
                            }
                            if (mtopTaobaoAlimpBentleySubscribeCenterActionCancelResponse != null && (mo2429getData4 = mtopTaobaoAlimpBentleySubscribeCenterActionCancelResponse.mo2429getData()) != null && mo2429getData4.model != null) {
                                String str5 = mtopTaobaoAlimpBentleySubscribeCenterActionCancelResponse.getRet()[0];
                                q.a((Object) str5, "response.ret[0]");
                                List b = n.b((CharSequence) str5, new String[]{"::"}, false, 0, 6, (Object) null);
                                SubScribeCenterResultDTO subScribeCenterResultDTO4 = mtopTaobaoAlimpBentleySubscribeCenterActionCancelResponse.mo2429getData().model;
                                q.a((Object) subScribeCenterResultDTO4, "response.data.model");
                                subScribeCenterResultDTO4.setRetCode((String) b.get(0));
                                SubScribeCenterResultDTO subScribeCenterResultDTO5 = mtopTaobaoAlimpBentleySubscribeCenterActionCancelResponse.mo2429getData().model;
                                q.a((Object) subScribeCenterResultDTO5, "response.data.model");
                                subScribeCenterResultDTO5.setRetMsg((String) b.get(1));
                            }
                            if (mtopTaobaoAlimpBentleySubscribeCenterActionCancelResponse != null && (mo2429getData3 = mtopTaobaoAlimpBentleySubscribeCenterActionCancelResponse.mo2429getData()) != null && (subScribeCenterResultDTO2 = mo2429getData3.model) != null && (toastText = subScribeCenterResultDTO2.getToastText()) != null && !StringUtils.isEmpty(toastText)) {
                                UIHandler.post(new Runnable() { // from class: com.taobao.message.subscribe.SubscribeUtils$cancelSubscribe$1$onError$2$1
                                    public static volatile transient /* synthetic */ IpChange $ipChange;

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        IpChange ipChange3 = $ipChange;
                                        if (ipChange3 instanceof IpChange) {
                                            ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                        } else {
                                            TBToast.makeText(Globals.getApplication(), Util.processUIText(toastText)).show();
                                        }
                                    }
                                });
                            }
                            if (((mtopTaobaoAlimpBentleySubscribeCenterActionCancelResponse == null || (mo2429getData2 = mtopTaobaoAlimpBentleySubscribeCenterActionCancelResponse.mo2429getData()) == null || (subScribeCenterResultDTO = mo2429getData2.model) == null) ? null : subScribeCenterResultDTO.getToastText()) == null) {
                                UIHandler.post(SubscribeUtils$cancelSubscribe$1$onError$3.INSTANCE);
                            }
                            IObserver iObserver = IObserver.this;
                            if (mtopTaobaoAlimpBentleySubscribeCenterActionCancelResponse != null && (mo2429getData = mtopTaobaoAlimpBentleySubscribeCenterActionCancelResponse.mo2429getData()) != null) {
                                subScribeCenterResultDTO3 = mo2429getData.model;
                            }
                            if (subScribeCenterResultDTO3 == null) {
                                q.a();
                            }
                            iObserver.onNext(subScribeCenterResultDTO3);
                            IObserver.this.onComplete();
                            return;
                        }
                        throw new TypeCastException("null cannot be cast to non-null type mtopsdk.mtop.domain.MtopResponse");
                    } catch (Throwable th) {
                        TLog.loge(Constants.TAG, Log.getStackTraceString(th));
                        UIHandler.post(SubscribeUtils$cancelSubscribe$1$onError$4.INSTANCE);
                    }
                }
            });
            build.startRequest(MtopTaobaoAlimpBentleySubscribeCenterActionCancelResponse.class);
            return;
        }
        observer.onError(new RuntimeException("param error "));
    }

    public final void querySubscribe(String str, String str2, String str3, String str4, final IObserver<SubScribeCenterResultDTO> observer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6a4ed4d", new Object[]{this, str, str2, str3, str4, observer});
            return;
        }
        q.c(observer, "observer");
        if (!StringUtils.isEmpty(str) && !StringUtils.isEmpty(str2)) {
            MtopTaobaoAlimpBentleySubscribeCenterActionQueryRequest mtopTaobaoAlimpBentleySubscribeCenterActionQueryRequest = new MtopTaobaoAlimpBentleySubscribeCenterActionQueryRequest();
            if (str3 == null) {
                mtopTaobaoAlimpBentleySubscribeCenterActionQueryRequest.setVersion(1L);
            } else {
                mtopTaobaoAlimpBentleySubscribeCenterActionQueryRequest.setVersion(Long.parseLong(str3));
            }
            mtopTaobaoAlimpBentleySubscribeCenterActionQueryRequest.setTopicIds(str);
            mtopTaobaoAlimpBentleySubscribeCenterActionQueryRequest.setActivityType(str2);
            mtopTaobaoAlimpBentleySubscribeCenterActionQueryRequest.setSdkVersion(Constants.SDK_VERSION);
            if (str4 != null) {
                mtopTaobaoAlimpBentleySubscribeCenterActionQueryRequest.setSubFrom(str4);
            }
            RemoteBusiness build = RemoteBusiness.build((IMTOPDataObject) mtopTaobaoAlimpBentleySubscribeCenterActionQueryRequest);
            build.registerListener((IRemoteListener) new IRemoteBaseListener() { // from class: com.taobao.message.subscribe.SubscribeUtils$querySubscribe$1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
                public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                        return;
                    }
                    try {
                        SubScribeCenterResultDTO subScribeCenterResultDTO = new SubScribeCenterResultDTO();
                        subScribeCenterResultDTO.setToastText("");
                        subScribeCenterResultDTO.setRetCode("MTOP_FAIL");
                        subScribeCenterResultDTO.setRetMsg("接口调用失败");
                        IObserver.this.onNext(subScribeCenterResultDTO);
                        IObserver.this.onComplete();
                        if (mtopResponse != null) {
                            byte[] bytedata = mtopResponse.getBytedata();
                            q.a((Object) bytedata, "(mtopResponse as MtopResponse).bytedata");
                            TLog.loge(Constants.TAG, r2 + " onSystemError() called with: requestType = [" + i + "], mtopResponse = [" + JSON.toJSONString((MtopTaobaoAlimpBentleySubscribeCenterActionQueryResponse) JSON.parseObject(new String(bytedata, d.UTF_8), MtopTaobaoAlimpBentleySubscribeCenterActionQueryResponse.class)) + "], o = [" + obj + ']');
                            return;
                        }
                        throw new TypeCastException("null cannot be cast to non-null type mtopsdk.mtop.domain.MtopResponse");
                    } catch (Throwable th) {
                        TLog.loge(Constants.TAG, Log.getStackTraceString(th));
                    }
                }

                @Override // com.taobao.tao.remotebusiness.IRemoteListener
                public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                    MtopTaobaoAlimpBentleySubscribeCenterActionQueryResponseData mo2429getData;
                    MtopTaobaoAlimpBentleySubscribeCenterActionQueryResponseData mo2429getData2;
                    SubScribeCenterResultDTO subScribeCenterResultDTO;
                    final String toastText;
                    MtopTaobaoAlimpBentleySubscribeCenterActionQueryResponseData mo2429getData3;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                        return;
                    }
                    try {
                        if (baseOutDo != null) {
                            MtopTaobaoAlimpBentleySubscribeCenterActionQueryResponse mtopTaobaoAlimpBentleySubscribeCenterActionQueryResponse = (MtopTaobaoAlimpBentleySubscribeCenterActionQueryResponse) baseOutDo;
                            TLog.loge(Constants.TAG, r2 + " onSuccess() called with: requestType = [" + i + "], mtopResponse = [" + JSON.toJSONString(mtopTaobaoAlimpBentleySubscribeCenterActionQueryResponse) + "], o = [" + obj + ']');
                            if (mtopTaobaoAlimpBentleySubscribeCenterActionQueryResponse != null && (mo2429getData3 = mtopTaobaoAlimpBentleySubscribeCenterActionQueryResponse.mo2429getData()) != null && mo2429getData3.model != null) {
                                String str5 = mtopTaobaoAlimpBentleySubscribeCenterActionQueryResponse.getRet()[0];
                                q.a((Object) str5, "response.ret[0]");
                                List b = n.b((CharSequence) str5, new String[]{"::"}, false, 0, 6, (Object) null);
                                SubScribeCenterResultDTO subScribeCenterResultDTO2 = mtopTaobaoAlimpBentleySubscribeCenterActionQueryResponse.mo2429getData().model;
                                q.a((Object) subScribeCenterResultDTO2, "response.data.model");
                                subScribeCenterResultDTO2.setRetCode((String) b.get(0));
                                SubScribeCenterResultDTO subScribeCenterResultDTO3 = mtopTaobaoAlimpBentleySubscribeCenterActionQueryResponse.mo2429getData().model;
                                q.a((Object) subScribeCenterResultDTO3, "response.data.model");
                                subScribeCenterResultDTO3.setRetMsg((String) b.get(1));
                            }
                            if (mtopTaobaoAlimpBentleySubscribeCenterActionQueryResponse != null && (mo2429getData2 = mtopTaobaoAlimpBentleySubscribeCenterActionQueryResponse.mo2429getData()) != null && (subScribeCenterResultDTO = mo2429getData2.model) != null && (toastText = subScribeCenterResultDTO.getToastText()) != null && !StringUtils.isEmpty(toastText)) {
                                UIHandler.post(new Runnable() { // from class: com.taobao.message.subscribe.SubscribeUtils$querySubscribe$1$onSuccess$2$1
                                    public static volatile transient /* synthetic */ IpChange $ipChange;

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        IpChange ipChange3 = $ipChange;
                                        if (ipChange3 instanceof IpChange) {
                                            ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                        } else {
                                            TBToast.makeText(Globals.getApplication(), Util.processUIText(toastText)).show();
                                        }
                                    }
                                });
                            }
                            IObserver iObserver = IObserver.this;
                            SubScribeCenterResultDTO subScribeCenterResultDTO4 = (mtopTaobaoAlimpBentleySubscribeCenterActionQueryResponse == null || (mo2429getData = mtopTaobaoAlimpBentleySubscribeCenterActionQueryResponse.mo2429getData()) == null) ? null : mo2429getData.model;
                            if (subScribeCenterResultDTO4 == null) {
                                q.a();
                            }
                            iObserver.onNext(subScribeCenterResultDTO4);
                            IObserver.this.onComplete();
                            return;
                        }
                        throw new TypeCastException("null cannot be cast to non-null type com.taobao.message.subscribe.MtopTaobaoAlimpBentleySubscribeCenterActionQueryResponse");
                    } catch (Throwable th) {
                        TLog.loge(Constants.TAG, Log.getStackTraceString(th));
                    }
                }

                @Override // com.taobao.tao.remotebusiness.IRemoteListener
                public void onError(int i, MtopResponse mtopResponse, Object obj) {
                    MtopTaobaoAlimpBentleySubscribeCenterActionQueryResponseData mo2429getData;
                    MtopTaobaoAlimpBentleySubscribeCenterActionQueryResponseData mo2429getData2;
                    MtopTaobaoAlimpBentleySubscribeCenterActionQueryResponseData mo2429getData3;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                        return;
                    }
                    try {
                        if (mtopResponse != null) {
                            byte[] bytedata = mtopResponse.getBytedata();
                            q.a((Object) bytedata, "(mtopResponse as MtopResponse).bytedata");
                            MtopTaobaoAlimpBentleySubscribeCenterActionQueryResponse mtopTaobaoAlimpBentleySubscribeCenterActionQueryResponse = (MtopTaobaoAlimpBentleySubscribeCenterActionQueryResponse) JSON.parseObject(new String(bytedata, d.UTF_8), MtopTaobaoAlimpBentleySubscribeCenterActionQueryResponse.class);
                            TLog.loge(Constants.TAG, r2 + " onError() called with: requestType = [" + i + "], mtopResponse = [" + JSON.toJSONString(mtopTaobaoAlimpBentleySubscribeCenterActionQueryResponse) + "], o = [" + obj + ']');
                            SubScribeCenterResultDTO subScribeCenterResultDTO = null;
                            if ((mtopTaobaoAlimpBentleySubscribeCenterActionQueryResponse != null ? mtopTaobaoAlimpBentleySubscribeCenterActionQueryResponse.mo2429getData() : null) != null) {
                                if (((mtopTaobaoAlimpBentleySubscribeCenterActionQueryResponse == null || (mo2429getData3 = mtopTaobaoAlimpBentleySubscribeCenterActionQueryResponse.mo2429getData()) == null) ? null : mo2429getData3.model) == null) {
                                    mtopTaobaoAlimpBentleySubscribeCenterActionQueryResponse.mo2429getData().model = new SubScribeCenterResultDTO();
                                }
                            }
                            if (mtopTaobaoAlimpBentleySubscribeCenterActionQueryResponse != null && (mo2429getData2 = mtopTaobaoAlimpBentleySubscribeCenterActionQueryResponse.mo2429getData()) != null && mo2429getData2.model != null) {
                                String str5 = mtopTaobaoAlimpBentleySubscribeCenterActionQueryResponse.getRet()[0];
                                q.a((Object) str5, "response.ret[0]");
                                List b = n.b((CharSequence) str5, new String[]{"::"}, false, 0, 6, (Object) null);
                                SubScribeCenterResultDTO subScribeCenterResultDTO2 = mtopTaobaoAlimpBentleySubscribeCenterActionQueryResponse.mo2429getData().model;
                                q.a((Object) subScribeCenterResultDTO2, "response.data.model");
                                subScribeCenterResultDTO2.setRetCode((String) b.get(0));
                                SubScribeCenterResultDTO subScribeCenterResultDTO3 = mtopTaobaoAlimpBentleySubscribeCenterActionQueryResponse.mo2429getData().model;
                                q.a((Object) subScribeCenterResultDTO3, "response.data.model");
                                subScribeCenterResultDTO3.setRetMsg((String) b.get(1));
                            }
                            IObserver iObserver = IObserver.this;
                            if (mtopTaobaoAlimpBentleySubscribeCenterActionQueryResponse != null && (mo2429getData = mtopTaobaoAlimpBentleySubscribeCenterActionQueryResponse.mo2429getData()) != null) {
                                subScribeCenterResultDTO = mo2429getData.model;
                            }
                            if (subScribeCenterResultDTO == null) {
                                q.a();
                            }
                            iObserver.onNext(subScribeCenterResultDTO);
                            IObserver.this.onComplete();
                            return;
                        }
                        throw new TypeCastException("null cannot be cast to non-null type mtopsdk.mtop.domain.MtopResponse");
                    } catch (Throwable th) {
                        TLog.loge(Constants.TAG, Log.getStackTraceString(th));
                    }
                }
            });
            build.startRequest(MtopTaobaoAlimpBentleySubscribeCenterActionQueryResponse.class);
            return;
        }
        observer.onError(new RuntimeException("param error "));
    }
}
