package com.taobao.message.sp.category.source;

import com.alipay.android.msp.framework.statisticsv2.value.ErrorCode;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.chat.compat.tree.MergeData;
import com.taobao.message.chat.compat.tree.TreeQueryResult;
import com.taobao.message.kit.core.IObserver;
import com.taobao.message.lab.comfrm.StdActions;
import com.taobao.message.lab.comfrm.core.Action;
import com.taobao.message.lab.comfrm.core.ActionDispatcher;
import com.taobao.message.lab.comfrm.inner2.Command;
import com.taobao.message.lab.comfrm.inner2.Source;
import com.taobao.message.lab.comfrm.support.UserIdentifier;
import com.taobao.message.sp.framework.model.SimpleConversation;
import com.taobao.message.sp.framework.service.ISimpleConversationService;
import com.taobao.message.sp.framework.service.SimpleServiceFactory;
import com.taobao.message.tree.core.model.SimpleConversationContentNode;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.q;
import tb.kge;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\u00020\u0003B\u0005¢\u0006\u0002\u0010\u0004J\b\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0006H\u0016J\u001c\u0010\u000f\u001a\u00020\u00022\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0013\u001a\u00020\u0014J\u0010\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0002H\u0016J,\u0010\u001a\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u001c2\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u001f0\u001e2\u0006\u0010\u0013\u001a\u00020\u0014H\u0016R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006 "}, d2 = {"Lcom/taobao/message/sp/category/source/SimpleConversationListSource;", "Lcom/taobao/message/lab/comfrm/inner2/Source;", "Lcom/taobao/message/chat/compat/tree/TreeQueryResult;", "Lcom/taobao/message/lab/comfrm/support/UserIdentifier;", "()V", "mIdentifier", "", "getMIdentifier", "()Ljava/lang/String;", "setMIdentifier", "(Ljava/lang/String;)V", ErrorCode.DEFAULT_WINDOW_FRAME_DISPOSE_EX, "", "identifier", "s", "onData", "finalData", "", "Lcom/taobao/message/sp/framework/model/SimpleConversation;", "actionDispatcher", "Lcom/taobao/message/lab/comfrm/core/ActionDispatcher;", "subscribe", "updateOriginalData", "action", "Lcom/taobao/message/lab/comfrm/core/Action;", "treeQueryResult", "use", "command", "Lcom/taobao/message/lab/comfrm/inner2/Command;", "map", "", "", "message_sp_category_debug"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes7.dex */
public final class SimpleConversationListSource implements Source<TreeQueryResult>, UserIdentifier {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String mIdentifier;

    static {
        kge.a(1144673640);
        kge.a(-915263556);
        kge.a(451726918);
    }

    @Override // com.taobao.message.lab.comfrm.inner2.Source
    public void dispose() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("226c8326", new Object[]{this});
        }
    }

    @Override // com.taobao.message.lab.comfrm.inner2.Source
    public void subscribe(ActionDispatcher actionDispatcher) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c519475", new Object[]{this, actionDispatcher});
        } else {
            q.c(actionDispatcher, "actionDispatcher");
        }
    }

    @Override // com.taobao.message.lab.comfrm.inner2.Source
    public TreeQueryResult updateOriginalData(Action action, TreeQueryResult treeQueryResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TreeQueryResult) ipChange.ipc$dispatch("ed257f42", new Object[]{this, action, treeQueryResult});
        }
        q.c(action, "action");
        return null;
    }

    public final String getMIdentifier() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("22571b39", new Object[]{this}) : this.mIdentifier;
    }

    public final void setMIdentifier(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40437ac5", new Object[]{this, str});
        } else {
            this.mIdentifier = str;
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.List, T] */
    @Override // com.taobao.message.lab.comfrm.inner2.Source
    public void use(Command command, Map<String, ? extends Object> map, final ActionDispatcher actionDispatcher) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1c59d34", new Object[]{this, command, map, actionDispatcher});
            return;
        }
        q.c(command, "command");
        q.c(map, "map");
        q.c(actionDispatcher, "actionDispatcher");
        String str = this.mIdentifier;
        if (str == null) {
            q.a();
        }
        ISimpleConversationService iSimpleConversationService = (ISimpleConversationService) SimpleServiceFactory.obtain(str, "all", ISimpleConversationService.class);
        if (iSimpleConversationService == null) {
            return;
        }
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = new ArrayList();
        iSimpleConversationService.listConversations(40, (IObserver) new IObserver<List<? extends SimpleConversation>>() { // from class: com.taobao.message.sp.category.source.SimpleConversationListSource$use$$inlined$let$lambda$1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.message.kit.core.IObserver
            public void onComplete() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5cbffcbf", new Object[]{this});
                }
            }

            @Override // com.taobao.message.kit.core.IObserver
            public void onError(Throwable p0) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("cf54aa85", new Object[]{this, p0});
                } else {
                    q.c(p0, "p0");
                }
            }

            @Override // com.taobao.message.kit.core.IObserver
            public void onNext(List<? extends SimpleConversation> data) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("6d15fbea", new Object[]{this, data});
                    return;
                }
                q.c(data, "data");
                ((List) Ref.ObjectRef.this.element).addAll(data);
                this.onData((List) Ref.ObjectRef.this.element, actionDispatcher);
            }
        });
    }

    public final TreeQueryResult onData(List<SimpleConversation> finalData, ActionDispatcher actionDispatcher) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TreeQueryResult) ipChange.ipc$dispatch("2d9e0f4f", new Object[]{this, finalData, actionDispatcher});
        }
        q.c(finalData, "finalData");
        q.c(actionDispatcher, "actionDispatcher");
        TreeQueryResult treeQueryResult = new TreeQueryResult();
        treeQueryResult.mergedData = new MergeData();
        treeQueryResult.list = new ArrayList();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Map<String, Map<String, ?>> map = treeQueryResult.mergedData.originalDataPool;
        q.a((Object) map, "result.mergedData.originalDataPool");
        map.put("conversation", linkedHashMap);
        for (SimpleConversation simpleConversation : finalData) {
            if (!linkedHashMap.containsKey(simpleConversation.getConversationCode())) {
                String conversationCode = simpleConversation.getConversationCode();
                q.a((Object) conversationCode, "it.conversationCode");
                linkedHashMap.put(conversationCode, simpleConversation);
                treeQueryResult.list.add(new SimpleConversationContentNode(simpleConversation));
            }
        }
        actionDispatcher.dispatch(new Action.Build(StdActions.UPDATE_ORIGINAL_DATA).data(treeQueryResult).build());
        return treeQueryResult;
    }

    @Override // com.taobao.message.lab.comfrm.support.UserIdentifier
    public void identifier(String s) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee19127a", new Object[]{this, s});
            return;
        }
        q.c(s, "s");
        this.mIdentifier = s;
    }
}
