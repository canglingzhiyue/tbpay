package com.taobao.message.subscribe;

import android.content.Intent;
import android.support.v4.content.LocalBroadcastManager;
import mtopsdk.common.util.StringUtils;
import android.util.Log;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.security.realidentity.o;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.kit.core.IObserver;
import com.taobao.message.kit.util.UIHandler;
import com.taobao.message.message_open_api.api.data.topicsubscribe.rpc.SubScribeCenterResultDTO;
import com.taobao.message.message_open_api_adapter.api.data.eventchannel.ChannelEventManager;
import com.taobao.message.message_open_api_adapter.api.data.eventchannel.bean.ChannelEvent;
import com.taobao.message.message_open_api_adapter.api.data.eventchannel.bean.IChannelSubscriber;
import com.taobao.tao.Globals;
import com.taobao.tao.log.TLog;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.themis.kernel.i;
import com.taobao.uikit.extend.component.unify.Toast.TBToast;
import java.net.URLEncoder;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.q;
import kotlin.text.d;
import kotlin.text.n;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopResponse;
import tb.arz;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J$\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J.\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J$\u0010\r\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016¨\u0006\u000e"}, d2 = {"com/taobao/message/subscribe/SubscribeUtils$doSubscribe$1", "Lcom/taobao/tao/remotebusiness/IRemoteBaseListener;", "onError", "", i.CDN_REQUEST_TYPE, "", "mtopResponse", "Lmtopsdk/mtop/domain/MtopResponse;", o.b, "", "onSuccess", "baseOutDo", "Lmtopsdk/mtop/domain/BaseOutDo;", "onSystemError", "message_base_tb_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes7.dex */
public final class SubscribeUtils$doSubscribe$1 implements IRemoteBaseListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ String $activityType;
    public final /* synthetic */ IObserver $observer;
    public final /* synthetic */ String $subFrom;
    public final /* synthetic */ String $topicId;
    public final /* synthetic */ String $type;

    public SubscribeUtils$doSubscribe$1(IObserver iObserver, String str, String str2, String str3, String str4) {
        this.$observer = iObserver;
        this.$type = str;
        this.$topicId = str2;
        this.$activityType = str3;
        this.$subFrom = str4;
    }

    @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
    public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
            return;
        }
        try {
            final SubScribeCenterResultDTO subScribeCenterResultDTO = new SubScribeCenterResultDTO();
            subScribeCenterResultDTO.setToastText(Constants.DEFAULT_TOAST);
            subScribeCenterResultDTO.setRetCode("MTOP_FAIL");
            subScribeCenterResultDTO.setRetMsg("接口调用失败");
            UIHandler.post(new Runnable() { // from class: com.taobao.message.subscribe.SubscribeUtils$doSubscribe$1$onSystemError$1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public final void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    String toastText = SubScribeCenterResultDTO.this.getToastText();
                    q.a((Object) toastText, "subScribeCenterResultDTO.toastText");
                    TBToast.makeText(Globals.getApplication(), Util.processUIText(toastText)).show();
                }
            });
            this.$observer.onNext(subScribeCenterResultDTO);
            this.$observer.onComplete();
            if (mtopResponse != null) {
                byte[] bytedata = mtopResponse.getBytedata();
                if (bytedata == null) {
                    return;
                }
                TLog.loge(Constants.TAG, this.$type + " onSystemError() called with: requestType = [" + i + "], mtopResponse = [" + JSON.toJSONString((MtopTaobaoAlimpBentleySubscribeCenterActionBindingResponse) JSON.parseObject(new String(bytedata, d.UTF_8), MtopTaobaoAlimpBentleySubscribeCenterActionBindingResponse.class)) + "], o = [" + obj + ']');
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type mtopsdk.mtop.domain.MtopResponse");
        } catch (Throwable th) {
            TLog.loge(Constants.TAG, Log.getStackTraceString(th));
            this.$observer.onError(th);
        }
    }

    @Override // com.taobao.tao.remotebusiness.IRemoteListener
    public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
        MtopTaobaoAlimpBentleySubscribeCenterActionBindingResponseData mo2429getData;
        MtopTaobaoAlimpBentleySubscribeCenterActionBindingResponseData mo2429getData2;
        SubScribeCenterResultDTO subScribeCenterResultDTO;
        final String toastText;
        MtopTaobaoAlimpBentleySubscribeCenterActionBindingResponseData mo2429getData3;
        SubScribeCenterResultDTO subScribeCenterResultDTO2;
        Map<String, Object> subscribeConfirmResponse;
        MtopTaobaoAlimpBentleySubscribeCenterActionBindingResponseData mo2429getData4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
            return;
        }
        try {
            final MtopTaobaoAlimpBentleySubscribeCenterActionBindingResponse mtopTaobaoAlimpBentleySubscribeCenterActionBindingResponse = (MtopTaobaoAlimpBentleySubscribeCenterActionBindingResponse) baseOutDo;
            TLog.loge(Constants.TAG, this.$type + " onSuccess() called with: requestType = [" + i + "], mtopResponse = [" + JSON.toJSONString(mtopTaobaoAlimpBentleySubscribeCenterActionBindingResponse) + "], o = [" + obj + ']');
            if (mtopTaobaoAlimpBentleySubscribeCenterActionBindingResponse != null && (mo2429getData4 = mtopTaobaoAlimpBentleySubscribeCenterActionBindingResponse.mo2429getData()) != null && mo2429getData4.model != null) {
                String str = mtopTaobaoAlimpBentleySubscribeCenterActionBindingResponse.getRet()[0];
                q.a((Object) str, "response.ret[0]");
                List b = n.b((CharSequence) str, new String[]{"::"}, false, 0, 6, (Object) null);
                SubScribeCenterResultDTO subScribeCenterResultDTO3 = mtopTaobaoAlimpBentleySubscribeCenterActionBindingResponse.mo2429getData().model;
                q.a((Object) subScribeCenterResultDTO3, "response.data.model");
                subScribeCenterResultDTO3.setRetCode((String) b.get(0));
                SubScribeCenterResultDTO subScribeCenterResultDTO4 = mtopTaobaoAlimpBentleySubscribeCenterActionBindingResponse.mo2429getData().model;
                q.a((Object) subScribeCenterResultDTO4, "response.data.model");
                subScribeCenterResultDTO4.setRetMsg((String) b.get(1));
            }
            SubScribeCenterResultDTO subScribeCenterResultDTO5 = null;
            if (mtopTaobaoAlimpBentleySubscribeCenterActionBindingResponse != null && (mo2429getData3 = mtopTaobaoAlimpBentleySubscribeCenterActionBindingResponse.mo2429getData()) != null && (subScribeCenterResultDTO2 = mo2429getData3.model) != null && (subscribeConfirmResponse = subScribeCenterResultDTO2.getSubscribeConfirmResponse()) != null && q.a(subscribeConfirmResponse.get("needConfirm"), (Object) "true")) {
                final String uuid = UUID.randomUUID().toString();
                q.a((Object) uuid, "UUID.randomUUID().toString()");
                ChannelEventManager.INSTANCE.addSubscriber(new IChannelSubscriber() { // from class: com.taobao.message.subscribe.SubscribeUtils$doSubscribe$1$onSuccess$$inlined$let$lambda$1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.message.message_open_api_adapter.api.data.eventchannel.bean.IChannelSubscriber
                    public String topic() {
                        IpChange ipChange2 = $ipChange;
                        return ipChange2 instanceof IpChange ? (String) ipChange2.ipc$dispatch("9373c52a", new Object[]{this}) : "confirmStatus";
                    }

                    @Override // com.taobao.message.message_open_api_adapter.api.data.eventchannel.bean.IChannelSubscriber
                    public void onEvent(List<ChannelEvent> event) {
                        SubScribeCenterResultDTO subScribeCenterResultDTO6;
                        MtopTaobaoAlimpBentleySubscribeCenterActionBindingResponseData mo2429getData5;
                        MtopTaobaoAlimpBentleySubscribeCenterActionBindingResponseData mo2429getData6;
                        MtopTaobaoAlimpBentleySubscribeCenterActionBindingResponseData mo2429getData7;
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("38ab9ff3", new Object[]{this, event});
                            return;
                        }
                        q.c(event, "event");
                        if (!(!event.isEmpty())) {
                            return;
                        }
                        JSONObject data = event.get(0).getData();
                        if (!q.a((Object) uuid, (Object) data.getString("traceId"))) {
                            return;
                        }
                        String string = data.getString("retType");
                        String string2 = data.getString("retData");
                        if (string == null) {
                            return;
                        }
                        int hashCode = string.hashCode();
                        if (hashCode != -1093910523) {
                            if (hashCode != 193898076 || !string.equals("clickAllowResultFail")) {
                                return;
                            }
                            SubScribeCenterResultDTO subScribeCenterResultDTO7 = new SubScribeCenterResultDTO();
                            JSONObject parseObject = JSON.parseObject(string2);
                            subScribeCenterResultDTO7.setToastText("");
                            subScribeCenterResultDTO7.setRetCode(parseObject.getString("retCode"));
                            subScribeCenterResultDTO7.setRetMsg(parseObject.getString(arz.KEY_RET_MSG));
                            this.$observer.onNext(subScribeCenterResultDTO7);
                            this.$observer.onComplete();
                            ChannelEventManager.INSTANCE.removeSubscriber(this);
                        } else if (!string.equals("clickAllowResultSuccess")) {
                        } else {
                            try {
                                final MtopTaobaoAlimpBentleySubscribeCenterActionBindingResponse mtopTaobaoAlimpBentleySubscribeCenterActionBindingResponse2 = (MtopTaobaoAlimpBentleySubscribeCenterActionBindingResponse) JSON.parseObject(string2, MtopTaobaoAlimpBentleySubscribeCenterActionBindingResponse.class);
                                String str2 = null;
                                if ((mtopTaobaoAlimpBentleySubscribeCenterActionBindingResponse2 != null ? mtopTaobaoAlimpBentleySubscribeCenterActionBindingResponse2.mo2429getData() : null) != null) {
                                    if (((mtopTaobaoAlimpBentleySubscribeCenterActionBindingResponse2 == null || (mo2429getData7 = mtopTaobaoAlimpBentleySubscribeCenterActionBindingResponse2.mo2429getData()) == null) ? null : mo2429getData7.model) == null) {
                                        mtopTaobaoAlimpBentleySubscribeCenterActionBindingResponse2.mo2429getData().model = new SubScribeCenterResultDTO();
                                    }
                                }
                                if (mtopTaobaoAlimpBentleySubscribeCenterActionBindingResponse2 != null && (mo2429getData6 = mtopTaobaoAlimpBentleySubscribeCenterActionBindingResponse2.mo2429getData()) != null && mo2429getData6.model != null) {
                                    String str3 = mtopTaobaoAlimpBentleySubscribeCenterActionBindingResponse2.getRet()[0];
                                    q.a((Object) str3, "retResponse.ret[0]");
                                    List b2 = n.b((CharSequence) str3, new String[]{"::"}, false, 0, 6, (Object) null);
                                    SubScribeCenterResultDTO subScribeCenterResultDTO8 = mtopTaobaoAlimpBentleySubscribeCenterActionBindingResponse2.mo2429getData().model;
                                    q.a((Object) subScribeCenterResultDTO8, "retResponse.data.model");
                                    subScribeCenterResultDTO8.setRetCode((String) b2.get(0));
                                    SubScribeCenterResultDTO subScribeCenterResultDTO9 = mtopTaobaoAlimpBentleySubscribeCenterActionBindingResponse2.mo2429getData().model;
                                    q.a((Object) subScribeCenterResultDTO9, "retResponse.data.model");
                                    subScribeCenterResultDTO9.setRetMsg((String) b2.get(1));
                                }
                                IObserver iObserver = this.$observer;
                                SubScribeCenterResultDTO subScribeCenterResultDTO10 = (mtopTaobaoAlimpBentleySubscribeCenterActionBindingResponse2 == null || (mo2429getData5 = mtopTaobaoAlimpBentleySubscribeCenterActionBindingResponse2.mo2429getData()) == null) ? null : mo2429getData5.model;
                                if (subScribeCenterResultDTO10 == null) {
                                    q.a();
                                }
                                iObserver.onNext(subScribeCenterResultDTO10);
                                this.$observer.onComplete();
                                ChannelEventManager.INSTANCE.removeSubscriber(this);
                                MtopTaobaoAlimpBentleySubscribeCenterActionBindingResponseData mo2429getData8 = mtopTaobaoAlimpBentleySubscribeCenterActionBindingResponse2.mo2429getData();
                                if (mo2429getData8 != null && (subScribeCenterResultDTO6 = mo2429getData8.model) != null) {
                                    str2 = subScribeCenterResultDTO6.getToastText();
                                }
                                if (StringUtils.isEmpty(str2)) {
                                    return;
                                }
                                UIHandler.post(new Runnable() { // from class: com.taobao.message.subscribe.SubscribeUtils$doSubscribe$1$onSuccess$$inlined$let$lambda$1.1
                                    public static volatile transient /* synthetic */ IpChange $ipChange;

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        IpChange ipChange3 = $ipChange;
                                        if (ipChange3 instanceof IpChange) {
                                            ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                            return;
                                        }
                                        SubScribeCenterResultDTO subScribeCenterResultDTO11 = MtopTaobaoAlimpBentleySubscribeCenterActionBindingResponse.this.mo2429getData().model;
                                        q.a((Object) subScribeCenterResultDTO11, "retResponse.data.model");
                                        String toastText2 = subScribeCenterResultDTO11.getToastText();
                                        q.a((Object) toastText2, "retResponse.data.model.toastText");
                                        TBToast.makeText(Globals.getApplication(), Util.processUIText(toastText2)).show();
                                    }
                                });
                            } catch (Throwable unused) {
                                ChannelEventManager.INSTANCE.removeSubscriber(this);
                                this.$observer.onError(new RuntimeException("data parse error "));
                            }
                        }
                    }
                });
                Intent intent = new Intent("com.alibaba.poplayer.PopLayer.action.POP");
                intent.putExtra("event", "poplayer://2020SubscribeConfirm");
                StringBuilder sb = new StringBuilder();
                sb.append("poplayer://2020SubscribeConfirm?model=");
                MtopTaobaoAlimpBentleySubscribeCenterActionBindingResponseData mo2429getData5 = mtopTaobaoAlimpBentleySubscribeCenterActionBindingResponse.mo2429getData();
                if (mo2429getData5 != null) {
                    subScribeCenterResultDTO5 = mo2429getData5.model;
                }
                sb.append(URLEncoder.encode(JSON.toJSONString(subScribeCenterResultDTO5)));
                sb.append("&topicId=");
                sb.append(this.$topicId);
                sb.append("&activityType=");
                sb.append(this.$activityType);
                sb.append("&subFrom=");
                sb.append(this.$subFrom);
                sb.append("&traceId=");
                sb.append(uuid);
                intent.putExtra("param", sb.toString());
                LocalBroadcastManager.getInstance(Globals.getApplication()).sendBroadcast(intent);
                return;
            }
            if (mtopTaobaoAlimpBentleySubscribeCenterActionBindingResponse != null && (mo2429getData2 = mtopTaobaoAlimpBentleySubscribeCenterActionBindingResponse.mo2429getData()) != null && (subScribeCenterResultDTO = mo2429getData2.model) != null && (toastText = subScribeCenterResultDTO.getToastText()) != null && !StringUtils.isEmpty(toastText)) {
                UIHandler.post(new Runnable() { // from class: com.taobao.message.subscribe.SubscribeUtils$doSubscribe$1$onSuccess$3$1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public final void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            TBToast.makeText(Globals.getApplication(), Util.processUIText(toastText)).show();
                        }
                    }
                });
            }
            IObserver iObserver = this.$observer;
            if (mtopTaobaoAlimpBentleySubscribeCenterActionBindingResponse != null && (mo2429getData = mtopTaobaoAlimpBentleySubscribeCenterActionBindingResponse.mo2429getData()) != null) {
                subScribeCenterResultDTO5 = mo2429getData.model;
            }
            if (subScribeCenterResultDTO5 == null) {
                q.a();
            }
            iObserver.onNext(subScribeCenterResultDTO5);
            this.$observer.onComplete();
            Intent intent2 = new Intent("com.alibaba.poplayer.PopLayer.action.POP");
            intent2.putExtra("event", "poplayer://2020PushRecall");
            LocalBroadcastManager.getInstance(Globals.getApplication()).sendBroadcast(intent2);
        } catch (Throwable th) {
            TLog.loge(Constants.TAG, Log.getStackTraceString(th));
            this.$observer.onError(new RuntimeException("data parse error "));
        }
    }

    @Override // com.taobao.tao.remotebusiness.IRemoteListener
    public void onError(int i, MtopResponse mtopResponse, Object obj) {
        MtopTaobaoAlimpBentleySubscribeCenterActionBindingResponseData mo2429getData;
        MtopTaobaoAlimpBentleySubscribeCenterActionBindingResponseData mo2429getData2;
        SubScribeCenterResultDTO subScribeCenterResultDTO;
        MtopTaobaoAlimpBentleySubscribeCenterActionBindingResponseData mo2429getData3;
        SubScribeCenterResultDTO subScribeCenterResultDTO2;
        final String toastText;
        MtopTaobaoAlimpBentleySubscribeCenterActionBindingResponseData mo2429getData4;
        MtopTaobaoAlimpBentleySubscribeCenterActionBindingResponseData mo2429getData5;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
            return;
        }
        try {
            if (mtopResponse != null) {
                byte[] bytedata = mtopResponse.getBytedata();
                q.a((Object) bytedata, "(mtopResponse as MtopResponse).bytedata");
                MtopTaobaoAlimpBentleySubscribeCenterActionBindingResponse mtopTaobaoAlimpBentleySubscribeCenterActionBindingResponse = (MtopTaobaoAlimpBentleySubscribeCenterActionBindingResponse) JSON.parseObject(new String(bytedata, d.UTF_8), MtopTaobaoAlimpBentleySubscribeCenterActionBindingResponse.class);
                TLog.loge(Constants.TAG, this.$type + " onError() called with: requestType = [" + i + "], mtopResponse = [" + JSON.toJSONString(mtopTaobaoAlimpBentleySubscribeCenterActionBindingResponse) + "], o = [" + obj + ']');
                SubScribeCenterResultDTO subScribeCenterResultDTO3 = null;
                if ((mtopTaobaoAlimpBentleySubscribeCenterActionBindingResponse != null ? mtopTaobaoAlimpBentleySubscribeCenterActionBindingResponse.mo2429getData() : null) != null) {
                    if (((mtopTaobaoAlimpBentleySubscribeCenterActionBindingResponse == null || (mo2429getData5 = mtopTaobaoAlimpBentleySubscribeCenterActionBindingResponse.mo2429getData()) == null) ? null : mo2429getData5.model) == null) {
                        mtopTaobaoAlimpBentleySubscribeCenterActionBindingResponse.mo2429getData().model = new SubScribeCenterResultDTO();
                    }
                }
                if (mtopTaobaoAlimpBentleySubscribeCenterActionBindingResponse != null && (mo2429getData4 = mtopTaobaoAlimpBentleySubscribeCenterActionBindingResponse.mo2429getData()) != null && mo2429getData4.model != null) {
                    String str = mtopTaobaoAlimpBentleySubscribeCenterActionBindingResponse.getRet()[0];
                    q.a((Object) str, "response.ret[0]");
                    List b = n.b((CharSequence) str, new String[]{"::"}, false, 0, 6, (Object) null);
                    SubScribeCenterResultDTO subScribeCenterResultDTO4 = mtopTaobaoAlimpBentleySubscribeCenterActionBindingResponse.mo2429getData().model;
                    q.a((Object) subScribeCenterResultDTO4, "response.data.model");
                    subScribeCenterResultDTO4.setRetCode((String) b.get(0));
                    SubScribeCenterResultDTO subScribeCenterResultDTO5 = mtopTaobaoAlimpBentleySubscribeCenterActionBindingResponse.mo2429getData().model;
                    q.a((Object) subScribeCenterResultDTO5, "response.data.model");
                    subScribeCenterResultDTO5.setRetMsg((String) b.get(1));
                }
                if (mtopTaobaoAlimpBentleySubscribeCenterActionBindingResponse != null && (mo2429getData3 = mtopTaobaoAlimpBentleySubscribeCenterActionBindingResponse.mo2429getData()) != null && (subScribeCenterResultDTO2 = mo2429getData3.model) != null && (toastText = subScribeCenterResultDTO2.getToastText()) != null && !StringUtils.isEmpty(toastText)) {
                    UIHandler.post(new Runnable() { // from class: com.taobao.message.subscribe.SubscribeUtils$doSubscribe$1$onError$2$1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public final void run() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            } else {
                                TBToast.makeText(Globals.getApplication(), Util.processUIText(toastText)).show();
                            }
                        }
                    });
                }
                if (((mtopTaobaoAlimpBentleySubscribeCenterActionBindingResponse == null || (mo2429getData2 = mtopTaobaoAlimpBentleySubscribeCenterActionBindingResponse.mo2429getData()) == null || (subScribeCenterResultDTO = mo2429getData2.model) == null) ? null : subScribeCenterResultDTO.getToastText()) == null) {
                    UIHandler.post(SubscribeUtils$doSubscribe$1$onError$3.INSTANCE);
                }
                IObserver iObserver = this.$observer;
                if (mtopTaobaoAlimpBentleySubscribeCenterActionBindingResponse != null && (mo2429getData = mtopTaobaoAlimpBentleySubscribeCenterActionBindingResponse.mo2429getData()) != null) {
                    subScribeCenterResultDTO3 = mo2429getData.model;
                }
                if (subScribeCenterResultDTO3 == null) {
                    q.a();
                }
                iObserver.onNext(subScribeCenterResultDTO3);
                this.$observer.onComplete();
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type mtopsdk.mtop.domain.MtopResponse");
        } catch (Throwable th) {
            TLog.loge(Constants.TAG, Log.getStackTraceString(th));
            UIHandler.post(SubscribeUtils$doSubscribe$1$onError$4.INSTANCE);
        }
    }
}
