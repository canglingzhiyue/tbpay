package com.taobao.message.lab.comfrm.inner2.resource;

import com.alipay.android.msp.framework.statisticsv2.value.ErrorCode;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&¨\u0006\u0007"}, d2 = {"Lcom/taobao/message/lab/comfrm/inner2/resource/IResourceChangePublisher;", "", ErrorCode.DEFAULT_WINDOW_FRAME_DISPOSE_EX, "", "subscribeResourceChange", "observer", "Lcom/taobao/message/lab/comfrm/inner2/resource/IResourceChangeObserver;", "message_comfrm_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes7.dex */
public interface IResourceChangePublisher {
    void dispose();

    void subscribeResourceChange(IResourceChangeObserver iResourceChangeObserver);
}
