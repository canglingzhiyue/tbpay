package com.taobao.avplayer.hiv;

import android.app.Activity;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.avplayer.DWContext;
import com.taobao.avplayer.common.w;
import com.taobao.avplayer.core.model.DWResponse;
import com.taobao.avplayer.interactivelifecycle.hiv.request.ContentDetailData;
import com.taobao.avplayer.playercontrol.hiv.g;
import com.taobao.taobaoavsdk.AVSDKLog;
import com.taobao.taobaoavsdk.CodeUsageCounter;
import com.ut.device.UTDevice;
import java.util.HashMap;
import java.util.Map;
import tb.kge;

/* loaded from: classes6.dex */
public class a implements g {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private int b = 0;

    static {
        kge.a(-2049181544);
        kge.a(-124834476);
    }

    @Override // com.taobao.avplayer.playercontrol.hiv.g
    public void a(DWContext dWContext, Map<String, String> map, ContentDetailData contentDetailData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("738f5558", new Object[]{this, dWContext, map, contentDetailData});
            return;
        }
        CodeUsageCounter.a().a(CodeUsageCounter.componentName.dw_adapter_HivTBEventAdapter);
        if (dWContext == null || dWContext.getActivity() == null) {
            return;
        }
        Activity activity = dWContext.getActivity();
        String str = map.get("itemId");
        activity.overridePendingTransition(0, 0);
        if (dWContext.getVideo() != null && dWContext.getVideo().t() == 1) {
            dWContext.getVideo().k();
        }
        if (contentDetailData.taokeInfo == null) {
            return;
        }
        a(dWContext, str, contentDetailData);
    }

    public static void a(DWContext dWContext, String str, ContentDetailData contentDetailData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d794a2c3", new Object[]{dWContext, str, contentDetailData});
            return;
        }
        CodeUsageCounter.a().a(CodeUsageCounter.componentName.dw_adapter_HivTBEventAdapter);
        if (contentDetailData.taokeInfo == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("itemId", str);
        hashMap.put("accountId", contentDetailData.userId);
        hashMap.put("utdid", UTDevice.getUtdid(dWContext.getActivity()));
        hashMap.put("platform", "phone");
        hashMap.put("contentId", contentDetailData.feedId == null ? "" : contentDetailData.feedId);
        hashMap.put("sourceType", contentDetailData.taokeInfo.sourceType);
        hashMap.put("bizType", contentDetailData.taokeInfo.bizType);
        hashMap.put("sourceId", contentDetailData.taokeInfo.sourceId);
        dWContext.sendTaokeRequest(hashMap, new w() { // from class: com.taobao.avplayer.hiv.HivTBEventAdapter$1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.avplayer.common.w
            public void onSuccess(DWResponse dWResponse) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("c6105f72", new Object[]{this, dWResponse});
                } else {
                    AVSDKLog.d("HivEventAdapter", "[requestForTaoke]分佣成功");
                }
            }

            @Override // com.taobao.avplayer.common.w
            public void onError(DWResponse dWResponse) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("1f1dda8d", new Object[]{this, dWResponse});
                } else {
                    AVSDKLog.d("HivEventAdapter", "[requestForTaoke]分佣失败");
                }
            }
        });
    }
}
