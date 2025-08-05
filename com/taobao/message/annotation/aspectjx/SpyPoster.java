package com.taobao.message.annotation.aspectjx;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.ut.monitor.DataReceiveMonitor;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import tb.kge;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u000bJ\u000e\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u0005J\u000e\u0010\u000f\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u0005R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/taobao/message/annotation/aspectjx/SpyPoster;", "", "()V", "mutableList", "", "Lcom/taobao/message/annotation/aspectjx/SpyListener;", "getMutableList", "()Ljava/util/List;", "post", "", "name", "", "args", "register", DataReceiveMonitor.CB_LISTENER, "unRegister", "message_annotation_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes7.dex */
public final class SpyPoster {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final SpyPoster INSTANCE;
    private static final List<SpyListener> mutableList;

    static {
        kge.a(1381172069);
        INSTANCE = new SpyPoster();
        mutableList = new ArrayList();
    }

    private SpyPoster() {
    }

    public final List<SpyListener> getMutableList() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("18244472", new Object[]{this}) : mutableList;
    }

    public final void post(String name, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a5ebabb", new Object[]{this, name, str});
            return;
        }
        q.c(name, "name");
        for (SpyListener spyListener : mutableList) {
            spyListener.invoked(name, str);
        }
    }

    public final void register(SpyListener listener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ceb318d", new Object[]{this, listener});
            return;
        }
        q.c(listener, "listener");
        mutableList.add(listener);
    }

    public final void unRegister(SpyListener listener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90c97c46", new Object[]{this, listener});
            return;
        }
        q.c(listener, "listener");
        mutableList.remove(listener);
    }
}
