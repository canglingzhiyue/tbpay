package com.taobao.message.sp.framework.implement;

import com.alibaba.fastjson.JSON;
import com.alibaba.security.realidentity.p1;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.kit.core.IObserver;
import com.taobao.message.kit.threadpool.BaseRunnable;
import com.taobao.message.kit.threadpool.Coordinator;
import com.taobao.message.sp.framework.model.SimpleMessageListOriginal;
import com.taobao.message.sp.framework.model.SimpleMessageListResult;
import com.taobao.tao.remotebusiness.IRemoteListener;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopResponse;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J$\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J,\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\tH\u0016¨\u0006\r"}, d2 = {"com/taobao/message/sp/framework/implement/SimpleBCMessageService$listMessages$1", "Lcom/taobao/tao/remotebusiness/IRemoteListener;", "onError", "", "p0", "", p1.d, "Lmtopsdk/mtop/domain/MtopResponse;", "p2", "", "onSuccess", "Lmtopsdk/mtop/domain/BaseOutDo;", "p3", "message_sp_framework_debug"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes7.dex */
public final class SimpleBCMessageService$listMessages$1 implements IRemoteListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ boolean $isNick;
    public final /* synthetic */ IObserver $observer;

    public SimpleBCMessageService$listMessages$1(boolean z, IObserver iObserver) {
        this.$isNick = z;
        this.$observer = iObserver;
    }

    @Override // com.taobao.tao.remotebusiness.IRemoteListener
    public void onSuccess(int i, final MtopResponse p1, BaseOutDo baseOutDo, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), p1, baseOutDo, obj});
            return;
        }
        q.c(p1, "p1");
        Coordinator.doBackGroundTask(new BaseRunnable() { // from class: com.taobao.message.sp.framework.implement.SimpleBCMessageService$listMessages$1$onSuccess$1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.message.kit.threadpool.BaseRunnable
            public void execute() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("e48bb97c", new Object[]{this});
                    return;
                }
                try {
                    SimpleMessageListOriginal simpleMessageListOriginal = (SimpleMessageListOriginal) JSON.parseObject(p1.getDataJsonObject().toString(), SimpleMessageListOriginal.class);
                    SimpleMessageListResult simpleMessageListResult = new SimpleMessageListResult();
                    if (simpleMessageListOriginal != null) {
                        simpleMessageListResult.messageList = SimpleMessageListOriginal.parse(simpleMessageListOriginal.userMessages, SimpleBCMessageService$listMessages$1.this.$isNick);
                        simpleMessageListResult.hasMore = simpleMessageListOriginal.hasMore;
                        simpleMessageListResult.nextCursor = simpleMessageListOriginal.nextCursor;
                    }
                    SimpleBCMessageService$listMessages$1.this.$observer.onNext(simpleMessageListResult);
                    SimpleBCMessageService$listMessages$1.this.$observer.onComplete();
                } catch (Throwable th) {
                    SimpleBCMessageService$listMessages$1.this.$observer.onError(th);
                }
            }
        });
    }

    @Override // com.taobao.tao.remotebusiness.IRemoteListener
    public void onError(int i, MtopResponse mtopResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
        } else {
            this.$observer.onError(new IllegalStateException(String.valueOf(i)));
        }
    }
}
