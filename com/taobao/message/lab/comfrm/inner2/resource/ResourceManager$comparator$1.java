package com.taobao.message.lab.comfrm.inner2.resource;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Comparator;
import kotlin.Metadata;
import kotlin.jvm.internal.q;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "o1", "Lcom/taobao/message/lab/comfrm/inner2/resource/IResourceProvider;", "kotlin.jvm.PlatformType", "o2", "compare"}, k = 3, mv = {1, 4, 1})
/* loaded from: classes7.dex */
public final class ResourceManager$comparator$1<T> implements Comparator<IResourceProvider> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final ResourceManager$comparator$1 INSTANCE = new ResourceManager$comparator$1();

    @Override // java.util.Comparator
    public final int compare(IResourceProvider iResourceProvider, IResourceProvider iResourceProvider2) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e8b7a2ff", new Object[]{this, iResourceProvider, iResourceProvider2})).intValue();
        }
        int priority = iResourceProvider != null ? iResourceProvider.getPriority() : 0;
        if (iResourceProvider2 != null) {
            i = iResourceProvider2.getPriority();
        }
        return q.a(i, priority);
    }
}
