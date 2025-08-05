package com.taobao.themis.widget.broadcast;

import com.alibaba.triver.triver_shop.container.shopLoft.b;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import tb.kge;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0015B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\"\u0010\u000f\u001a\u00020\u00102\u001a\u0010\u0011\u001a\u0016\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012j\n\u0012\u0004\u0012\u00020\u0013\u0018\u0001`\u0014R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0016"}, d2 = {"Lcom/taobao/themis/widget/broadcast/BroadcastMember;", "", "instanceId", "", "mListener", "Lcom/taobao/themis/widget/broadcast/BroadcastMember$MessageListener;", "(Ljava/lang/String;Lcom/taobao/themis/widget/broadcast/BroadcastMember$MessageListener;)V", "getInstanceId", "()Ljava/lang/String;", "setInstanceId", "(Ljava/lang/String;)V", "getMListener", "()Lcom/taobao/themis/widget/broadcast/BroadcastMember$MessageListener;", "setMListener", "(Lcom/taobao/themis/widget/broadcast/BroadcastMember$MessageListener;)V", "sendMessage", "", "msgs", "Ljava/util/ArrayList;", "Lcom/taobao/themis/widget/broadcast/BroadcastMsg;", "Lkotlin/collections/ArrayList;", "MessageListener", "themis_widget_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private String f22920a;
    private a b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J$\u0010\u0002\u001a\u00020\u00032\u001a\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00020\u0006\u0018\u0001`\u0007H&¨\u0006\b"}, d2 = {"Lcom/taobao/themis/widget/broadcast/BroadcastMember$MessageListener;", "", b.c.EVENT_ON_MESSAGE, "", "msgs", "Ljava/util/ArrayList;", "Lcom/taobao/themis/widget/broadcast/BroadcastMsg;", "Lkotlin/collections/ArrayList;", "themis_widget_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public interface a {
        void a(ArrayList<BroadcastMsg> arrayList);
    }

    static {
        kge.a(-2018205608);
    }

    public c(String instanceId, a aVar) {
        q.d(instanceId, "instanceId");
        this.f22920a = instanceId;
        this.b = aVar;
    }

    public final String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.f22920a;
    }

    public final void a(ArrayList<BroadcastMsg> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dfaf7e42", new Object[]{this, arrayList});
            return;
        }
        a aVar = this.b;
        if (aVar == null) {
            return;
        }
        aVar.a(arrayList);
    }
}
