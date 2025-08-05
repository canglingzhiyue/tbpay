package com.taobao.message.sp.framework.implement;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.security.realidentity.p1;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.kit.core.IObserver;
import com.taobao.message.kit.threadpool.BaseRunnable;
import com.taobao.message.kit.threadpool.Coordinator;
import com.taobao.message.sp.framework.model.SimpleMessageListOriginal;
import com.taobao.message.sp.framework.model.SimpleMessageListResult;
import com.taobao.tao.remotebusiness.IRemoteListener;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopResponse;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J$\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J.\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\tH\u0016¨\u0006\r"}, d2 = {"com/taobao/message/sp/framework/implement/SimpleIMBAMessageService$listMessagesByCCode$1", "Lcom/taobao/tao/remotebusiness/IRemoteListener;", "onError", "", "p0", "", p1.d, "Lmtopsdk/mtop/domain/MtopResponse;", "p2", "", "onSuccess", "Lmtopsdk/mtop/domain/BaseOutDo;", "p3", "message_sp_framework_debug"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes7.dex */
public final class SimpleIMBAMessageService$listMessagesByCCode$1 implements IRemoteListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ IObserver $observer;

    public SimpleIMBAMessageService$listMessagesByCCode$1(IObserver iObserver) {
        this.$observer = iObserver;
    }

    @Override // com.taobao.tao.remotebusiness.IRemoteListener
    public void onSuccess(int i, final MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
        } else {
            Coordinator.doBackGroundTask(new BaseRunnable() { // from class: com.taobao.message.sp.framework.implement.SimpleIMBAMessageService$listMessagesByCCode$1$onSuccess$1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.message.kit.threadpool.BaseRunnable
                public void execute() {
                    SimpleMessageListOriginal.SimpleMessageIMBAObjectTypeData simpleMessageIMBAObjectTypeData;
                    JSONObject dataJsonObject;
                    JSONObject dataJsonObject2;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("e48bb97c", new Object[]{this});
                        return;
                    }
                    SimpleMessageListResult simpleMessageListResult = new SimpleMessageListResult();
                    try {
                        MtopResponse mtopResponse2 = mtopResponse;
                        String string = (mtopResponse2 == null || (dataJsonObject2 = mtopResponse2.getDataJsonObject()) == null) ? null : dataJsonObject2.getString("dataProtocols");
                        MtopResponse mtopResponse3 = mtopResponse;
                        boolean z = (mtopResponse3 == null || (dataJsonObject = mtopResponse3.getDataJsonObject()) == null) ? false : dataJsonObject.getBoolean("hasMore");
                        JSONArray parseArray = JSON.parseArray(string);
                        ArrayList arrayList = new ArrayList();
                        if (parseArray != null) {
                            int size = parseArray.size();
                            for (int i2 = 0; i2 < size; i2++) {
                                SimpleMessageListOriginal.SimpleMessageIMBAObject item = (SimpleMessageListOriginal.SimpleMessageIMBAObject) parseArray.getObject(i2, SimpleMessageListOriginal.SimpleMessageIMBAObject.class);
                                q.a((Object) item, "item");
                                arrayList.add(item);
                                SimpleMessageListOriginal.SimpleMessageIMBAObjectBody simpleMessageIMBAObjectBody = item.body;
                                simpleMessageListResult.nextCursor = (simpleMessageIMBAObjectBody == null || (simpleMessageIMBAObjectTypeData = simpleMessageIMBAObjectBody.typeData) == null) ? 0L : simpleMessageIMBAObjectTypeData.sendTime;
                            }
                        }
                        simpleMessageListResult.messageList = SimpleMessageListOriginal.parseIMBA(arrayList);
                        simpleMessageListResult.hasMore = z;
                    } catch (Throwable unused) {
                        SimpleIMBAMessageService$listMessagesByCCode$1.this.$observer.onError(new IllegalStateException("json parse error"));
                    }
                    SimpleIMBAMessageService$listMessagesByCCode$1.this.$observer.onNext(simpleMessageListResult);
                    SimpleIMBAMessageService$listMessagesByCCode$1.this.$observer.onComplete();
                }
            });
        }
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
