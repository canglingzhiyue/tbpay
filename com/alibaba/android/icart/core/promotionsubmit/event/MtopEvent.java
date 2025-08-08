package com.alibaba.android.icart.core.promotionsubmit.event;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import com.alibaba.ability.localization.b;
import com.alibaba.android.icart.core.promotionsubmit.event.BaseEvent;
import com.alibaba.android.icart.core.widget.d;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.parser.Feature;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.utils.UnifyLog;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.RemoteBusiness;
import com.taobao.taobao.R;
import java.io.Serializable;
import java.util.List;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import tb.bdz;
import tb.bed;
import tb.kge;

/* loaded from: classes2.dex */
public class MtopEvent extends BaseEvent {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "PromotionMtopEvent";
    public static final int TAOBAO_MTOP_BIZ_ID = 97;
    public String api;
    public MtopCallback callback;
    public List<bdz.a> failEvents;
    public JSONObject params;
    public List<bdz.a> successEvents;
    public String version;

    /* loaded from: classes2.dex */
    public static class MtopCallback implements Serializable {
        public JSONArray fail;
        public JSONArray success;

        static {
            kge.a(-885696431);
            kge.a(1028243835);
        }
    }

    static {
        kge.a(486155296);
    }

    public static /* synthetic */ Object ipc$super(MtopEvent mtopEvent, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ void access$000(MtopEvent mtopEvent, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82e2adaa", new Object[]{mtopEvent, jSONObject});
        } else {
            mtopEvent.runFinishedListener(jSONObject);
        }
    }

    public static /* synthetic */ void access$100(MtopEvent mtopEvent, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac4a2689", new Object[]{mtopEvent, jSONObject});
        } else {
            mtopEvent.runFailedEvent(jSONObject);
        }
    }

    public static /* synthetic */ JSONObject access$200(MtopEvent mtopEvent, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("e758aa88", new Object[]{mtopEvent, jSONObject}) : mtopEvent.dealSpecialMtopData(jSONObject);
    }

    public static /* synthetic */ void access$300(MtopEvent mtopEvent, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff191847", new Object[]{mtopEvent, jSONObject});
        } else {
            mtopEvent.runSuccessEvent(jSONObject);
        }
    }

    @Override // com.alibaba.android.icart.core.promotionsubmit.event.BaseEvent
    public BaseEvent initEvent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseEvent) ipChange.ipc$dispatch("9a19a69d", new Object[]{this});
        }
        if (this.eventParams != null) {
            this.api = this.eventParams.getString("api");
            this.version = this.eventParams.getString("version");
            this.params = this.eventParams.getJSONObject("params");
            this.callback = (MtopCallback) JSONObject.toJavaObject(this.eventParams.getJSONObject("callback"), MtopCallback.class);
        }
        MtopCallback mtopCallback = this.callback;
        if (mtopCallback != null) {
            this.successEvents = bdz.a(mtopCallback.success, (BaseEvent.a) null);
            this.failEvents = bdz.a(this.callback.fail, (BaseEvent.a) null);
        }
        return this;
    }

    @Override // com.alibaba.android.icart.core.promotionsubmit.event.BaseEvent
    public void runEvent(Context context, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d1adc7e", new Object[]{this, context, jSONObject});
            return;
        }
        setContext(context);
        sendRequest();
    }

    private void removeSpecialSuccessEvent(String str) {
        List<bdz.a> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dbc3761d", new Object[]{this, str});
        } else if (!StringUtils.isEmpty(str) && (list = this.successEvents) != null) {
            for (bdz.a aVar : list) {
                if (aVar != null && str.equals(aVar.f25829a)) {
                    this.successEvents.remove(aVar);
                    return;
                }
            }
        }
    }

    private JSONObject dealSpecialMtopData(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("bfe6e66a", new Object[]{this, jSONObject});
        }
        if (jSONObject == null) {
            return jSONObject;
        }
        bed.a(bed.a.b("settlementCouponApplySuccess").a("领券请求成功").a(true).b(true).a(0.01f));
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject("module");
            JSONArray jSONArray = jSONObject2.getJSONArray("applySuccessList");
            JSONArray jSONArray2 = jSONObject2.getJSONArray("applyFailList");
            int size = jSONArray != null ? jSONArray.size() : 0;
            if (jSONArray2 != null) {
                i = jSONArray2.size();
            }
            JSONObject jSONObject3 = new JSONObject();
            if (i <= 0) {
                jSONObject3.put("successNum", (Object) String.valueOf(size));
                removeSpecialSuccessEvent("toastPartSuccess");
                bed.a(bed.a.b("settlementCouponApplySuccess").a("全部成功").a(true).a(1).a(0.01f));
            } else {
                jSONObject3.put("successNum", (Object) String.valueOf(size));
                jSONObject3.put("failedNum", (Object) String.valueOf(i));
                removeSpecialSuccessEvent("toastAllSuccess");
                bed.a(bed.a.b("settlementCouponApplySuccess").a("部分成功").a(true).a(2).a(0.01f));
            }
            return jSONObject3;
        } catch (Throwable unused) {
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put("allSuccessNum", (Object) "0");
            return jSONObject4;
        }
    }

    private void runFailedEvent(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2fdb19b7", new Object[]{this, jSONObject});
            return;
        }
        List<bdz.a> list = this.failEvents;
        if (list == null) {
            return;
        }
        for (bdz.a aVar : list) {
            if (aVar.b == null) {
                return;
            }
            aVar.b.setModalBuy(this.isModalBuy).runEvent(this.context, jSONObject);
        }
    }

    private void runSuccessEvent(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1830a07", new Object[]{this, jSONObject});
            return;
        }
        List<bdz.a> list = this.successEvents;
        if (list == null) {
            return;
        }
        for (bdz.a aVar : list) {
            if (aVar.b == null) {
                return;
            }
            aVar.b.setModalBuy(this.isModalBuy).runEvent(this.context, jSONObject);
        }
    }

    private void runFinishedListener(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("281795f8", new Object[]{this, jSONObject});
        } else if (this.finishedListener == null) {
        } else {
            this.finishedListener.a(jSONObject);
        }
    }

    private void sendRequest() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9fa6eaee", new Object[]{this});
            return;
        }
        bed.a("settlementCouponApply", "发送领券请求", false, 0.01f);
        IRemoteBaseListener iRemoteBaseListener = new IRemoteBaseListener() { // from class: com.alibaba.android.icart.core.promotionsubmit.event.MtopEvent.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
            public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                    return;
                }
                d.a(MtopEvent.this.context, b.a(R.string.taobao_app_1028_1_21660));
                MtopEvent.access$000(MtopEvent.this, null);
                String str = "";
                String retCode = mtopResponse != null ? mtopResponse.getRetCode() : str;
                if (mtopResponse != null) {
                    str = mtopResponse.getRetMsg();
                }
                UnifyLog.EventType eventType = UnifyLog.EventType.ERROR;
                UnifyLog.a("iCart", MtopEvent.TAG, "onSystemError", "", "", eventType, "errorCode:" + retCode + ",errorMsg:" + str);
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                    return;
                }
                MtopEvent.access$000(MtopEvent.this, null);
                if (mtopResponse == null) {
                    return;
                }
                JSONObject jSONObject = ((JSONObject) JSON.parseObject(mtopResponse.getBytedata(), JSONObject.class, new Feature[0])).getJSONObject("data");
                if (jSONObject == null || jSONObject.getBooleanValue("error")) {
                    MtopEvent.access$100(MtopEvent.this, null);
                    bed.a(bed.a.b("settlementCouponApplyFail").a("领券结算请求失败").a(1.0f));
                } else {
                    MtopEvent mtopEvent = MtopEvent.this;
                    MtopEvent.access$300(mtopEvent, MtopEvent.access$200(mtopEvent, jSONObject));
                }
                try {
                    UnifyLog.EventType eventType = UnifyLog.EventType.NET;
                    UnifyLog.a("iCart", MtopEvent.TAG, "onSuccess", "", "", eventType, "response: " + mtopResponse.getDataJsonObject());
                } catch (Exception unused) {
                }
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                    return;
                }
                bed.a(bed.a.b("settlementCouponApplyFail").a("领券结算请求失败").a(1.0f));
                d.a(MtopEvent.this.context, b.a(R.string.taobao_app_1028_1_21660));
                MtopEvent.access$000(MtopEvent.this, null);
                String str = "";
                String retCode = mtopResponse != null ? mtopResponse.getRetCode() : str;
                if (mtopResponse != null) {
                    str = mtopResponse.getRetMsg();
                }
                UnifyLog.EventType eventType = UnifyLog.EventType.ERROR;
                UnifyLog.a("iCart", MtopEvent.TAG, "onError", "", "", eventType, "errorCode:" + retCode + ",errorMsg:" + str);
            }
        };
        MtopRequest mtopRequest = new MtopRequest();
        mtopRequest.setApiName(this.api);
        mtopRequest.setVersion(this.version);
        mtopRequest.setNeedSession(true);
        mtopRequest.setNeedEcode(true);
        JSONObject jSONObject = this.params;
        mtopRequest.setData(jSONObject != null ? jSONObject.toJSONString() : "{}");
        RemoteBusiness.build(mtopRequest).mo1340setBizId(97).registeListener((IRemoteListener) iRemoteBaseListener).mo1305reqMethod(MethodEnum.POST).startRequest();
        try {
            UnifyLog.EventType eventType = UnifyLog.EventType.NET;
            UnifyLog.a("iCart", TAG, "request", "", "", eventType, "request: " + mtopRequest.toString());
        } catch (Exception unused) {
        }
    }
}
