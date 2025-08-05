package com.taobao.message.sp.chat.transformer;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.datasdk.facade.model.ResultData;
import com.taobao.message.lab.comfrm.StdActions;
import com.taobao.message.lab.comfrm.core.Action;
import com.taobao.message.lab.comfrm.inner2.Diff;
import com.taobao.message.lab.comfrm.inner2.SharedState;
import com.taobao.message.lab.comfrm.inner2.SplitPart;
import com.taobao.message.lab.comfrm.inner2.SplitTransformer;
import com.taobao.message.sp.framework.model.SimpleMessage;
import com.taobao.message.sp.framework.model.SimpleMessageListData;
import java.util.ArrayList;
import java.util.List;
import tb.kge;

/* loaded from: classes7.dex */
public class SimpleSplitMessagePartTransformer implements SplitTransformer {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-495812527);
        kge.a(787953664);
    }

    @Override // com.taobao.message.lab.comfrm.inner2.SplitTransformer
    public List<SplitPart> transform(Action action, SharedState sharedState, Diff diff, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("56a8e20e", new Object[]{this, action, sharedState, diff, obj});
        }
        if (StdActions.UPDATE_ORIGINAL_DATA.equals(action.getName())) {
            SimpleMessageListData simpleMessageListData = (SimpleMessageListData) sharedState.getOriginData(SimpleMessageListData.SOURCE_NAME_MESSAGE, SimpleMessageListData.class, null);
            List<ResultData> arrayList = simpleMessageListData == null ? new ArrayList(0) : simpleMessageListData.list;
            if (!arrayList.isEmpty()) {
                ArrayList arrayList2 = new ArrayList();
                for (ResultData resultData : arrayList) {
                    arrayList2.add(new SplitPart("default", resultData, ((SimpleMessage) resultData.getMainData()).getCode()));
                }
                return arrayList2;
            }
        }
        return new ArrayList();
    }
}
