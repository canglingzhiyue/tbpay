package com.taobao.message.lab.comfrm.inner2.resource;

import com.alipay.android.msp.framework.statisticsv2.value.ErrorCode;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.lab.comfrm.util.FileUtil;
import com.taobao.message.uikit.util.ApplicationUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import tb.kge;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0007\u001a\u00020\bH\u0016J\u0012\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0010\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000eH\u0016R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/taobao/message/lab/comfrm/inner2/resource/ReleaseResourceProvider;", "Lcom/taobao/message/lab/comfrm/inner2/resource/IResourceProvider;", "()V", "priority", "", "getPriority", "()I", ErrorCode.DEFAULT_WINDOW_FRAME_DISPOSE_EX, "", "fetchResource", "", "filePartName", "subscribeResourceChange", "observer", "Lcom/taobao/message/lab/comfrm/inner2/resource/IResourceChangeObserver;", "message_comfrm_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes7.dex */
public final class ReleaseResourceProvider implements IResourceProvider {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final int priority;

    static {
        kge.a(-494708890);
        kge.a(990544840);
    }

    @Override // com.taobao.message.lab.comfrm.inner2.resource.IResourceChangePublisher
    public void dispose() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("226c8326", new Object[]{this});
        }
    }

    @Override // com.taobao.message.lab.comfrm.inner2.resource.IResourceChangePublisher
    public void subscribeResourceChange(IResourceChangeObserver observer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92f0d3f5", new Object[]{this, observer});
        } else {
            q.d(observer, "observer");
        }
    }

    @Override // com.taobao.message.lab.comfrm.inner2.resource.IResourceProvider
    public int getPriority() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("49b31e94", new Object[]{this})).intValue() : this.priority;
    }

    @Override // com.taobao.message.lab.comfrm.inner2.resource.IResourceProvider
    public String fetchResource(String filePartName) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("59f10447", new Object[]{this, filePartName});
        }
        q.d(filePartName, "filePartName");
        return FileUtil.readAssetsTextFile(ApplicationUtil.getApplication(), filePartName);
    }
}
