package com.taobao.message.sp.chat.transformer;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.datasdk.facade.model.ResultData;
import com.taobao.message.lab.comfrm.StdActions;
import com.taobao.message.lab.comfrm.core.Action;
import com.taobao.message.lab.comfrm.inner2.Diff;
import com.taobao.message.lab.comfrm.inner2.DiffResult;
import com.taobao.message.lab.comfrm.inner2.DiffTransfomer;
import com.taobao.message.lab.comfrm.inner2.SharedState;
import com.taobao.message.lab.comfrm.inner2.observable.RuntimeIncUpdateMap;
import com.taobao.message.sp.framework.model.SimpleMessage;
import com.taobao.message.sp.framework.model.SimpleMessageListData;
import java.util.HashMap;
import tb.kge;

/* loaded from: classes7.dex */
public class SimpleMessageViewWrapperTimeTransformer implements DiffTransfomer {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final long MERGE_TIME_INTERVAl = 300000;

    static {
        kge.a(1386013661);
        kge.a(-2124616881);
    }

    @Override // com.taobao.message.lab.comfrm.inner2.DiffTransfomer
    public DiffResult transform(Action action, SharedState sharedState, Diff diff) {
        ResultData<SimpleMessage> resultData;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DiffResult) ipChange.ipc$dispatch("8370bb6b", new Object[]{this, action, sharedState, diff});
        }
        if (StdActions.UPDATE_ORIGINAL_DATA.equals(action.getName())) {
            SimpleMessageListData simpleMessageListData = (SimpleMessageListData) sharedState.getOriginData(SimpleMessageListData.SOURCE_NAME_MESSAGE, SimpleMessageListData.class, null);
            RuntimeIncUpdateMap runtimeIncUpdateMap = (RuntimeIncUpdateMap) sharedState.getRuntimeData("messageNeedTimeMap", RuntimeIncUpdateMap.class, new RuntimeIncUpdateMap(16));
            if (simpleMessageListData != null && simpleMessageListData.list != null) {
                RuntimeIncUpdateMap copy = RuntimeIncUpdateMap.copy(runtimeIncUpdateMap);
                int i = 0;
                while (i < simpleMessageListData.list.size()) {
                    copy.put(simpleMessageListData.list.get(i).getMainData().getCode().getClientId(), (String) Integer.valueOf((i == 0 || (resultData = simpleMessageListData.list.get(i + (-1))) == null || Math.abs((resultData.getMainData().getSendTime() - resultData.getMainData().getSendTime()) / 300000) >= 1) ? 1 : 0));
                    i++;
                }
                HashMap hashMap = new HashMap(1);
                hashMap.put("messageNeedTimeMap", copy);
                return new DiffResult(sharedState.updateRuntimeData(hashMap), null);
            }
        }
        return null;
    }
}
