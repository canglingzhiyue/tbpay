package tb;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.kit.core.IObserver;
import com.taobao.message.message_open_api.api.data.topicsubscribe.rpc.SubScribeCenterResultDTO;
import com.taobao.message.message_open_api.api.data.topicsubscribe.rpc.SubScribeTopicList;
import com.taobao.message.subscribe.SubscribeUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes8.dex */
public class pan implements poa {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1807129934);
        kge.a(1648684352);
    }

    @Override // tb.poa
    public void b(String str, String str2, String str3, Context context, final pob pobVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("262f90ee", new Object[]{this, str, str2, str3, context, pobVar});
        } else if (StringUtils.isEmpty(str) || StringUtils.isEmpty(str2) || StringUtils.isEmpty(str3)) {
        } else {
            SubscribeUtils.INSTANCE.doSubscribe(str, str3, null, str2, new IObserver<SubScribeCenterResultDTO>() { // from class: tb.pan.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.message.kit.core.IObserver
                public void onComplete() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5cbffcbf", new Object[]{this});
                    }
                }

                @Override // com.taobao.message.kit.core.IObserver
                public void onError(Throwable th) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("cf54aa85", new Object[]{this, th});
                    }
                }

                @Override // com.taobao.message.kit.core.IObserver
                public /* synthetic */ void onNext(SubScribeCenterResultDTO subScribeCenterResultDTO) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("b4b8495", new Object[]{this, subScribeCenterResultDTO});
                    } else {
                        a(subScribeCenterResultDTO);
                    }
                }

                public void a(SubScribeCenterResultDTO subScribeCenterResultDTO) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("962936cf", new Object[]{this, subScribeCenterResultDTO});
                    } else if (!(subScribeCenterResultDTO instanceof SubScribeCenterResultDTO)) {
                    } else {
                        String str4 = "subscribeLiveTopic onNext getRetCode = " + subScribeCenterResultDTO.getRetCode();
                        pobVar.a(pan.this.a(subScribeCenterResultDTO));
                    }
                }
            });
        }
    }

    @Override // tb.poa
    public void c(String str, String str2, String str3, Context context, final pob pobVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2556204d", new Object[]{this, str, str2, str3, context, pobVar});
        } else if (StringUtils.isEmpty(str) || StringUtils.isEmpty(str2) || StringUtils.isEmpty(str3)) {
        } else {
            SubscribeUtils.INSTANCE.cancelSubscribe(str, str3, null, str2, new IObserver<SubScribeCenterResultDTO>() { // from class: tb.pan.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.message.kit.core.IObserver
                public void onComplete() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5cbffcbf", new Object[]{this});
                    }
                }

                @Override // com.taobao.message.kit.core.IObserver
                public void onError(Throwable th) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("cf54aa85", new Object[]{this, th});
                    }
                }

                @Override // com.taobao.message.kit.core.IObserver
                public /* synthetic */ void onNext(SubScribeCenterResultDTO subScribeCenterResultDTO) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("b4b8495", new Object[]{this, subScribeCenterResultDTO});
                    } else {
                        a(subScribeCenterResultDTO);
                    }
                }

                public void a(SubScribeCenterResultDTO subScribeCenterResultDTO) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("962936cf", new Object[]{this, subScribeCenterResultDTO});
                    } else if (!(subScribeCenterResultDTO instanceof SubScribeCenterResultDTO)) {
                    } else {
                        pobVar.a(pan.this.a(subScribeCenterResultDTO));
                    }
                }
            });
        }
    }

    public poc a(SubScribeCenterResultDTO subScribeCenterResultDTO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (poc) ipChange.ipc$dispatch("ebce3f13", new Object[]{this, subScribeCenterResultDTO});
        }
        poc pocVar = new poc();
        List<SubScribeTopicList> subScribeTopicList = subScribeCenterResultDTO.getSubScribeTopicList();
        if (subScribeTopicList != null) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < subScribeTopicList.size(); i++) {
                SubScribeTopicList subScribeTopicList2 = subScribeTopicList.get(i);
                pod podVar = new pod();
                if (!StringUtils.isEmpty(subScribeTopicList2.getErrCode())) {
                    podVar.a(subScribeTopicList2.getErrCode());
                }
                if (!StringUtils.isEmpty(subScribeTopicList2.getStatus())) {
                    podVar.b(subScribeTopicList2.getStatus());
                }
                if (!StringUtils.isEmpty(subScribeTopicList2.getTopicId())) {
                    podVar.c(subScribeTopicList2.getTopicId());
                }
                arrayList.add(podVar);
            }
            pocVar.b(arrayList);
        }
        if (!StringUtils.isEmpty(subScribeCenterResultDTO.getRetCode())) {
            pocVar.a(subScribeCenterResultDTO.getRetCode());
        }
        if (!StringUtils.isEmpty(subScribeCenterResultDTO.getRetMsg())) {
            pocVar.b(subScribeCenterResultDTO.getRetMsg());
        }
        if (!StringUtils.isEmpty(subScribeCenterResultDTO.getToastText())) {
            pocVar.c(subScribeCenterResultDTO.getToastText());
        }
        Map<String, Object> subscribeConfirmResponse = subScribeCenterResultDTO.getSubscribeConfirmResponse();
        if (subscribeConfirmResponse != null) {
            pocVar.a(subscribeConfirmResponse);
        }
        List<String> errTopicId = subScribeCenterResultDTO.getErrTopicId();
        if (errTopicId != null) {
            pocVar.a(errTopicId);
        }
        return pocVar;
    }
}
