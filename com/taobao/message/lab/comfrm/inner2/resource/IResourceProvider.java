package com.taobao.message.lab.comfrm.inner2.resource;

import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\u0007H&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\t"}, d2 = {"Lcom/taobao/message/lab/comfrm/inner2/resource/IResourceProvider;", "Lcom/taobao/message/lab/comfrm/inner2/resource/IResourceChangePublisher;", "priority", "", "getPriority", "()I", "fetchResource", "", "filePartName", "message_comfrm_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes7.dex */
public interface IResourceProvider extends IResourceChangePublisher {
    String fetchResource(String str);

    int getPriority();
}
