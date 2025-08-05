package com.taobao.message.sp.framework.implement;

import com.alibaba.fastjson.JSON;
import com.alipay.android.msp.constants.MspFlybirdDefine;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.kit.core.IObserver;
import com.taobao.message.sp.framework.model.SimpleProfile;
import com.taobao.message.sp.framework.model.SimpleTarget;
import com.taobao.message.sp.framework.mtop.MtopTaobaoBentleyPluginAccountBatchRequest;
import com.taobao.message.sp.framework.mtop.MtopTaobaoBentleyPluginAccountBatchResponse;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.RemoteBusiness;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.IMTOPDataObject;
import mtopsdk.mtop.domain.MtopResponse;
import org.json.JSONArray;
import org.json.JSONObject;
import tb.kge;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J2\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\t2\u0006\u0010\n\u001a\u00020\u00032\u0012\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\t0\fH\u0016J2\u0010\u000e\u001a\u00020\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\t2\u0006\u0010\n\u001a\u00020\u00032\u0012\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\t0\fH\u0016R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/taobao/message/sp/framework/implement/SimpleIMBAProfileService;", "Lcom/taobao/message/sp/framework/implement/SimpleBaseProfileService;", "mIdentifier", "", "mChannelType", "(Ljava/lang/String;Ljava/lang/String;)V", "listProfiles", "", "targetIds", "", "bizType", "observer", "Lcom/taobao/message/kit/core/IObserver;", "Lcom/taobao/message/sp/framework/model/SimpleProfile;", "listProfilesByNick", "targetNicks", "message_sp_framework_debug"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes7.dex */
public final class SimpleIMBAProfileService extends SimpleBaseProfileService {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final String mChannelType;
    private final String mIdentifier;

    static {
        kge.a(-185255083);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SimpleIMBAProfileService(String mIdentifier, String mChannelType) {
        super(mIdentifier, mChannelType);
        q.c(mIdentifier, "mIdentifier");
        q.c(mChannelType, "mChannelType");
        this.mIdentifier = mIdentifier;
        this.mChannelType = mChannelType;
    }

    @Override // com.taobao.message.sp.framework.service.ISimpleProfileService
    public void listProfiles(List<String> targetIds, String bizType, final IObserver<List<SimpleProfile>> observer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("391e4f54", new Object[]{this, targetIds, bizType, observer});
            return;
        }
        q.c(targetIds, "targetIds");
        q.c(bizType, "bizType");
        q.c(observer, "observer");
        MtopTaobaoBentleyPluginAccountBatchRequest mtopTaobaoBentleyPluginAccountBatchRequest = new MtopTaobaoBentleyPluginAccountBatchRequest();
        mtopTaobaoBentleyPluginAccountBatchRequest.setAccountIds(JSON.toJSONString(targetIds));
        RemoteBusiness.build((IMTOPDataObject) mtopTaobaoBentleyPluginAccountBatchRequest).registerListener(new IRemoteListener() { // from class: com.taobao.message.sp.framework.implement.SimpleIMBAProfileService$listProfiles$1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                JSONObject dataJsonObject;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                    return;
                }
                ArrayList arrayList = new ArrayList();
                JSONArray jSONArray = (mtopResponse == null || (dataJsonObject = mtopResponse.getDataJsonObject()) == null) ? null : dataJsonObject.getJSONArray("model");
                if (jSONArray != null && jSONArray.length() > 0) {
                    int length = jSONArray.length();
                    for (int i2 = 0; i2 < length; i2++) {
                        try {
                            SimpleProfile simpleProfile = new SimpleProfile();
                            com.alibaba.fastjson.JSONObject parseObject = JSON.parseObject(jSONArray.getString(i2));
                            simpleProfile.setDisplayName(parseObject.getString("name"));
                            simpleProfile.setAvatarURL(parseObject.getString(MspFlybirdDefine.FLYBIRD_DIALOG_LOGO));
                            simpleProfile.setTarget(SimpleTarget.obtain(parseObject.getString("oriId")));
                            simpleProfile.setBizType(parseObject.getString("bizType"));
                            arrayList.add(simpleProfile);
                        } catch (Exception unused) {
                        }
                    }
                }
                IObserver.this.onNext(arrayList);
                IObserver.this.onComplete();
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                } else {
                    IObserver.this.onError(new IllegalStateException(String.valueOf(i)));
                }
            }
        }).startRequest(MtopTaobaoBentleyPluginAccountBatchResponse.class);
    }

    @Override // com.taobao.message.sp.framework.service.ISimpleProfileService
    public void listProfilesByNick(List<String> targetNicks, String bizType, IObserver<List<SimpleProfile>> observer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a13131a", new Object[]{this, targetNicks, bizType, observer});
            return;
        }
        q.c(targetNicks, "targetNicks");
        q.c(bizType, "bizType");
        q.c(observer, "observer");
        observer.onError(new IllegalAccessException("not support"));
    }
}
