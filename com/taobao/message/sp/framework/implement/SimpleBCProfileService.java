package com.taobao.message.sp.framework.implement;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.kit.core.IObserver;
import com.taobao.message.sp.framework.model.SimpleProfile;
import com.taobao.message.sp.framework.model.SimpleTarget;
import com.taobao.message.sp.framework.mtop.MtopAmpAmpserviceGetbatchampuserinfoforimRequest;
import com.taobao.message.sp.framework.mtop.MtopTaobaoWirelessAmp2BcMessageSendResponse;
import com.taobao.message.uikit.util.ApplicationUtil;
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
import tb.kge;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J2\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\t2\u0006\u0010\n\u001a\u00020\u00032\u0012\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\t0\fH\u0016J:\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\t2\u0006\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\u0012\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\t0\fJ2\u0010\u0010\u001a\u00020\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\t2\u0006\u0010\n\u001a\u00020\u00032\u0012\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\t0\fH\u0016R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/taobao/message/sp/framework/implement/SimpleBCProfileService;", "Lcom/taobao/message/sp/framework/implement/SimpleBaseProfileService;", "mIdentifier", "", "mChannelType", "(Ljava/lang/String;Ljava/lang/String;)V", "listProfiles", "", "targetIds", "", "bizType", "observer", "Lcom/taobao/message/kit/core/IObserver;", "Lcom/taobao/message/sp/framework/model/SimpleProfile;", "isNick", "", "listProfilesByNick", "targetNicks", "message_sp_framework_debug"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes7.dex */
public final class SimpleBCProfileService extends SimpleBaseProfileService {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final String mChannelType;
    private final String mIdentifier;

    static {
        kge.a(-1655117773);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SimpleBCProfileService(String mIdentifier, String mChannelType) {
        super(mIdentifier, mChannelType);
        q.c(mIdentifier, "mIdentifier");
        q.c(mChannelType, "mChannelType");
        this.mIdentifier = mIdentifier;
        this.mChannelType = mChannelType;
    }

    @Override // com.taobao.message.sp.framework.service.ISimpleProfileService
    public void listProfiles(List<String> targetIds, String bizType, IObserver<List<SimpleProfile>> observer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("391e4f54", new Object[]{this, targetIds, bizType, observer});
            return;
        }
        q.c(targetIds, "targetIds");
        q.c(bizType, "bizType");
        q.c(observer, "observer");
        listProfiles(targetIds, bizType, false, observer);
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
        listProfiles(targetNicks, bizType, true, observer);
    }

    public static /* synthetic */ void listProfiles$default(SimpleBCProfileService simpleBCProfileService, List list, String str, boolean z, IObserver iObserver, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8816e332", new Object[]{simpleBCProfileService, list, str, new Boolean(z), iObserver, new Integer(i), obj});
            return;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        simpleBCProfileService.listProfiles(list, str, z, iObserver);
    }

    public final void listProfiles(List<String> targetIds, final String bizType, boolean z, final IObserver<List<SimpleProfile>> observer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7231f14", new Object[]{this, targetIds, bizType, new Boolean(z), observer});
            return;
        }
        q.c(targetIds, "targetIds");
        q.c(bizType, "bizType");
        q.c(observer, "observer");
        MtopAmpAmpserviceGetbatchampuserinfoforimRequest mtopAmpAmpserviceGetbatchampuserinfoforimRequest = new MtopAmpAmpserviceGetbatchampuserinfoforimRequest();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put((JSONObject) bizType, (String) targetIds);
        if (z) {
            mtopAmpAmpserviceGetbatchampuserinfoforimRequest.setTargetUserNickMapJson(JSON.toJSONString(jSONObject));
        } else {
            mtopAmpAmpserviceGetbatchampuserinfoforimRequest.setTargetUserIdMapJson(JSON.toJSONString(jSONObject));
        }
        mtopAmpAmpserviceGetbatchampuserinfoforimRequest.setChannel(1L);
        mtopAmpAmpserviceGetbatchampuserinfoforimRequest.setRole(0L);
        RemoteBusiness.build((IMTOPDataObject) mtopAmpAmpserviceGetbatchampuserinfoforimRequest).registerListener(new IRemoteListener() { // from class: com.taobao.message.sp.framework.implement.SimpleBCProfileService$listProfiles$1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                org.json.JSONObject dataJsonObject;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                    return;
                }
                ArrayList arrayList = new ArrayList();
                JSONArray jSONArray = (mtopResponse == null || (dataJsonObject = mtopResponse.getDataJsonObject()) == null) ? null : dataJsonObject.getJSONArray(bizType);
                if (jSONArray != null && jSONArray.length() > 0) {
                    int length = jSONArray.length();
                    for (int i2 = 0; i2 < length; i2++) {
                        try {
                            SimpleProfile simpleProfile = new SimpleProfile();
                            JSONObject parseObject = JSON.parseObject(jSONArray.getString(i2));
                            simpleProfile.setDisplayName(SimpleProfile.decryptBySecurityGuard(ApplicationUtil.getApplication(), parseObject.getString(SimpleProfile.KEY_DISPLAYNAME)));
                            simpleProfile.setNick(SimpleProfile.decryptBySecurityGuard(ApplicationUtil.getApplication(), parseObject.getString("nick")));
                            simpleProfile.setAvatarURL(parseObject.getString("headImgUr"));
                            simpleProfile.setTarget(SimpleTarget.obtain(SimpleProfile.decryptBySecurityGuard(ApplicationUtil.getApplication(), parseObject.getString("sUserId"))));
                            simpleProfile.setBizType(bizType);
                            arrayList.add(simpleProfile);
                        } catch (Exception unused) {
                        }
                    }
                }
                observer.onNext(arrayList);
                observer.onComplete();
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                } else {
                    observer.onError(new IllegalStateException(String.valueOf(i)));
                }
            }
        }).startRequest(MtopTaobaoWirelessAmp2BcMessageSendResponse.class);
    }
}
