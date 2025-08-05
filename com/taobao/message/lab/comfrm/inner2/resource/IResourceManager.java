package com.taobao.message.lab.comfrm.inner2.resource;

import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\u0007H&J\b\u0010\t\u001a\u00020\nH&¨\u0006\u000b"}, d2 = {"Lcom/taobao/message/lab/comfrm/inner2/resource/IResourceManager;", "Lcom/taobao/message/lab/comfrm/inner2/resource/IResourceChangePublisher;", "addResourceProvider", "", "resourceProvider", "Lcom/taobao/message/lab/comfrm/inner2/resource/IResourceProvider;", "fetchResource", "", "filePartName", "isResourceChanged", "", "message_comfrm_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes7.dex */
public interface IResourceManager extends IResourceChangePublisher {
    void addResourceProvider(IResourceProvider iResourceProvider);

    String fetchResource(String str);

    boolean isResourceChanged();
}
