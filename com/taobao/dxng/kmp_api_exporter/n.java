package com.taobao.dxng.kmp_api_exporter;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.dxng.kmp_api_exporter.m;
import kotlin.Metadata;
import tb.dlv;
import tb.kge;
import tb.rul;

@Metadata(d1 = {"\u0000z\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a¢\u0001\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0016\u0010\u0005\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00062\u0016\u0010\b\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00062\u0016\u0010\n\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00062\u0016\u0010\f\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00062\u0016\u0010\u000e\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00062\u0016\u0010\u0010\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0006\u001a\u0012\u0010\u0012\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u0012\u0010\u0013\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0014\u001a\u0012\u0010\u0015\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a*\u0010\u0016\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00172\u0016\u0010\u0018\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0019\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0006\u001a*\u0010\u001a\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u001b2\u0016\u0010\u0018\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0019\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0006\u001a*\u0010\u001c\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u001d2\u0016\u0010\u001e\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0019\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0006\u001a*\u0010\u001f\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020 2\u0016\u0010!\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\"\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0006\u001a*\u0010#\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020 2\u0016\u0010$\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010%\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0006\u001a*\u0010&\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020 2\u0016\u0010'\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010(\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0006¨\u0006)"}, d2 = {"constructClient", "", "Lcom/taobao/dxng/kmp_api_exporter/PowerMsg$Companion;", "params", "Lcom/taobao/dxng/kmp_api_exporter/PowerMsgBizParams;", "onTextMessageArrived", "Lkotlin/Function1;", "Lcom/taobao/dxng/kmp_api_exporter/PowerMsgTextMessage;", "onCountMessageArrived", "Lcom/taobao/dxng/kmp_api_exporter/PowerMsgCountMessage;", "onJoinMessageArrived", "Lcom/taobao/dxng/kmp_api_exporter/PowerMsgJoinMessage;", "onMessageArrived", "Lcom/taobao/dxng/kmp_api_exporter/PowerMsgPowerMessage;", "onSubscribed", "Lcom/taobao/dxng/kmp_api_exporter/PowerMsgSubscribeResult;", "onUnSubscribed", "Lcom/taobao/dxng/kmp_api_exporter/PowerMsgUnSubscribeResult;", "destroyClient", "subscribe", "Lcom/taobao/dxng/kmp_api_exporter/PowerMsgSubscribeParams;", dlv.API_UNSUBSCRIBE, "sendMessage", "Lcom/taobao/dxng/kmp_api_exporter/PowerMsgSendMessageParams;", "onSended", "Lcom/taobao/dxng/kmp_api_exporter/PowerMsgSendResult;", "sendText", "Lcom/taobao/dxng/kmp_api_exporter/PowerMsgSendTextParams;", "countValue", "Lcom/taobao/dxng/kmp_api_exporter/PowerMsgCountValueParams;", "onCountValue", "requestTopicStatus", "Lcom/taobao/dxng/kmp_api_exporter/PowerMsgTopicRequestParams;", "onTopicStatus", "Lcom/taobao/dxng/kmp_api_exporter/PowerMsgTopicStatusResult;", "requestTopicUsers", "onTopicUsers", "Lcom/taobao/dxng/kmp_api_exporter/PowerMsgTopicUsersResult;", "requestHistoryMessages", "onHistoryMessages", "Lcom/taobao/dxng/kmp_api_exporter/PowerMsgHistoryMessagesResult;", "kmp_api_exporter_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class n {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(290225254);
    }

    public static final void a(m.a aVar, u params, rul<? super p, kotlin.t> rulVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dc80360", new Object[]{aVar, params, rulVar});
            return;
        }
        kotlin.jvm.internal.q.d(aVar, "<this>");
        kotlin.jvm.internal.q.d(params, "params");
    }
}
