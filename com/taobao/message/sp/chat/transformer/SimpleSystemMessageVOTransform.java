package com.taobao.message.sp.chat.transformer;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.datasdk.facade.message.newmsgbody.SystemMsgBody;
import com.taobao.message.datasdk.facade.model.ResultData;
import com.taobao.message.lab.comfrm.core.Action;
import com.taobao.message.lab.comfrm.inner2.ItemState;
import com.taobao.message.lab.comfrm.inner2.IteratorTransformer;
import com.taobao.message.lab.comfrm.inner2.SharedState;
import com.taobao.message.sp.framework.model.SimpleMessage;
import java.util.HashMap;
import java.util.Map;
import tb.kge;

/* loaded from: classes7.dex */
public class SimpleSystemMessageVOTransform implements IteratorTransformer<ResultData<SimpleMessage>> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(346146147);
        kge.a(1186226634);
    }

    @Override // com.taobao.message.lab.comfrm.inner2.IteratorTransformer
    public ItemState transform(Action action, SharedState sharedState, ResultData<SimpleMessage> resultData, ItemState itemState) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ItemState) ipChange.ipc$dispatch("e7333691", new Object[]{this, action, sharedState, resultData, itemState});
        }
        Map map = (Map) itemState.getData("messageViewData", Map.class, new HashMap());
        if (resultData.getMainData().getMsgType() == 106) {
            SystemMsgBody systemMsgBody = new SystemMsgBody(resultData.getMainData().getOriginalData());
            map.put("content", systemMsgBody.getContent());
            map.put("activeContent", systemMsgBody.getActiveContent());
            map.put("templateContent", systemMsgBody.getTemplateContent());
        }
        HashMap hashMap = new HashMap();
        hashMap.put("messageViewData", map);
        return itemState.updateData(hashMap);
    }
}
