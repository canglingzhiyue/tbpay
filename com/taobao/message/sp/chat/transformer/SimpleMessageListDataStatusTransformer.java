package com.taobao.message.sp.chat.transformer;

import com.alibaba.fastjson.JSONArray;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.lab.comfrm.inner2.SharedState;
import com.taobao.message.lab.comfrm.inner2.Transformer;
import tb.kge;

/* loaded from: classes7.dex */
public class SimpleMessageListDataStatusTransformer implements Transformer {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String VALUE_LOAD_MORE_END = "stopped";
    private static final String VALUE_LOAD_MORE_NO_DATA = "noMore";

    static {
        kge.a(972553600);
        kge.a(1437606424);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0086, code lost:
        if (r5.oldHasMore != false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0092, code lost:
        if (r5.newHasMore != false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0095, code lost:
        r4 = "noMore";
     */
    @Override // com.taobao.message.lab.comfrm.inner2.Transformer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.taobao.message.lab.comfrm.inner2.SharedState transform(com.taobao.message.lab.comfrm.core.Action r9, com.taobao.message.lab.comfrm.inner2.SharedState r10) {
        /*
            Method dump skipped, instructions count: 225
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.message.sp.chat.transformer.SimpleMessageListDataStatusTransformer.transform(com.taobao.message.lab.comfrm.core.Action, com.taobao.message.lab.comfrm.inner2.SharedState):com.taobao.message.lab.comfrm.inner2.SharedState");
    }

    /* loaded from: classes7.dex */
    public static class SimpleListInfo {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public JSONArray cmd;
        public int status;

        static {
            kge.a(-1466573310);
        }

        public static SimpleListInfo copyWithState(SharedState sharedState) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (SimpleListInfo) ipChange.ipc$dispatch("5e438b42", new Object[]{sharedState});
            }
            SimpleListInfo simpleListInfo = (SimpleListInfo) sharedState.getRuntimeData("listStatus", SimpleListInfo.class, null);
            SimpleListInfo simpleListInfo2 = new SimpleListInfo();
            if (simpleListInfo != null) {
                simpleListInfo2.status = simpleListInfo.status;
                JSONArray jSONArray = simpleListInfo.cmd;
                if (jSONArray != null) {
                    simpleListInfo2.cmd = new JSONArray(jSONArray);
                }
            }
            if (simpleListInfo2.cmd == null) {
                simpleListInfo2.cmd = new JSONArray();
            }
            return simpleListInfo2;
        }
    }
}
