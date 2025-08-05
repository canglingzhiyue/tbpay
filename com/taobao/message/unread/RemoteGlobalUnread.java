package com.taobao.message.unread;

import android.util.Log;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.RemoteBusiness;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.q;
import kotlin.t;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.IMTOPDataObject;
import mtopsdk.mtop.domain.MtopResponse;
import org.json.JSONObject;
import tb.kge;
import tb.rul;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J>\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00040\t2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00040\tH\u0007¨\u0006\f"}, d2 = {"Lcom/taobao/message/unread/RemoteGlobalUnread;", "", "()V", "request", "", "channelTypes", "", "", "onSuccess", "Lkotlin/Function1;", "", "onFail", "message_base_tb_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes7.dex */
public final class RemoteGlobalUnread {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final RemoteGlobalUnread INSTANCE;

    static {
        kge.a(1881149245);
        INSTANCE = new RemoteGlobalUnread();
    }

    private RemoteGlobalUnread() {
    }

    @JvmStatic
    public static final void request(List<String> channelTypes, final rul<? super Integer, t> onSuccess, final rul<? super String, t> onFail) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c08215", new Object[]{channelTypes, onSuccess, onFail});
            return;
        }
        q.c(channelTypes, "channelTypes");
        q.c(onSuccess, "onSuccess");
        q.c(onFail, "onFail");
        MtopTaobaoWirelessAmpMessageUnreadcountRequest mtopTaobaoWirelessAmpMessageUnreadcountRequest = new MtopTaobaoWirelessAmpMessageUnreadcountRequest();
        mtopTaobaoWirelessAmpMessageUnreadcountRequest.setSource("mtop");
        mtopTaobaoWirelessAmpMessageUnreadcountRequest.setMsgChannelTypeList(JSON.toJSONString(channelTypes));
        mtopTaobaoWirelessAmpMessageUnreadcountRequest.setStartTime(System.currentTimeMillis() - 1209600000);
        RemoteBusiness.build((IMTOPDataObject) mtopTaobaoWirelessAmpMessageUnreadcountRequest).registerListener(new IRemoteListener() { // from class: com.taobao.message.unread.RemoteGlobalUnread$request$1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                JSONObject dataJsonObject;
                JSONObject jSONObject;
                IpChange ipChange2 = $ipChange;
                int i2 = 0;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                    return;
                }
                if (mtopResponse != null && (dataJsonObject = mtopResponse.getDataJsonObject()) != null && !dataJsonObject.getBoolean("fail")) {
                    try {
                        rul rulVar = rul.this;
                        JSONObject dataJsonObject2 = mtopResponse.getDataJsonObject();
                        if (dataJsonObject2 != null && (jSONObject = dataJsonObject2.getJSONObject("data")) != null) {
                            i2 = jSONObject.getInt("totalUnReadNum");
                        }
                        rulVar.mo2421invoke(Integer.valueOf(i2));
                        return;
                    } catch (Exception e) {
                        TLog.loge("RemoteGlobalUnread", Log.getStackTraceString(e));
                        onFail.mo2421invoke("lack data");
                    }
                }
                onFail.mo2421invoke("service fail");
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                } else {
                    onFail.mo2421invoke("onError");
                }
            }
        }).startRequest(MtopTaobaoWirelessAmpMessageUnreadcountResponse.class);
    }
}
