package com.taobao.message.sp.category.transformer;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.chat.compat.tree.TreeQueryResult;
import com.taobao.message.kit.util.ValueUtil;
import com.taobao.message.lab.comfrm.core.Action;
import com.taobao.message.lab.comfrm.inner2.SharedState;
import com.taobao.message.lab.comfrm.inner2.Transformer;
import com.taobao.message.lab.comfrm.support.list.AbsListWidgetInstance;
import com.taobao.message.sp.framework.model.SimpleConversation;
import com.taobao.message.tree.core.SortHelper;
import com.taobao.message.tree.core.model.ContentNode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import tb.kge;

/* loaded from: classes7.dex */
public class SimpleSectionSortTransformer implements Transformer {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1564065768);
        kge.a(1437606424);
    }

    @Override // com.taobao.message.lab.comfrm.inner2.Transformer
    public SharedState transform(Action action, SharedState sharedState) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SharedState) ipChange.ipc$dispatch("e602685c", new Object[]{this, action, sharedState});
        }
        TreeQueryResult treeQueryResult = (TreeQueryResult) sharedState.getOriginData("treeSource", TreeQueryResult.class, null);
        if (treeQueryResult == null) {
            return sharedState;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList<ContentNode> arrayList3 = new ArrayList(treeQueryResult.list);
        Collections.sort(arrayList3, new SortHelper.ReversedComparatorWrapper(new NodeComparator(treeQueryResult.mergedData.originalDataPool.get("conversation"))));
        for (ContentNode contentNode : arrayList3) {
            if (ValueUtil.getInteger(contentNode.getComputedData(), AbsListWidgetInstance.SLOT_SECTION) > 0) {
                ArrayList arrayList4 = new ArrayList();
                if (contentNode.getChildNode() != null) {
                    arrayList4.addAll(contentNode.getChildNode());
                }
                Collections.sort(arrayList4, new SortHelper.ReversedComparatorWrapper(new SortHelper.RawNodeComparator()));
                arrayList.add(arrayList4);
            } else {
                arrayList2.add(contentNode);
            }
        }
        arrayList.add(arrayList2);
        HashMap hashMap = new HashMap(4);
        hashMap.put("sectionList", arrayList);
        return sharedState.updateRuntimeData(hashMap);
    }

    /* loaded from: classes7.dex */
    public static class NodeComparator implements Comparator<ContentNode> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public Map<String, SimpleConversation> conversationPool;

        static {
            kge.a(955582116);
            kge.a(-2099169482);
        }

        public NodeComparator(Map<String, SimpleConversation> map) {
            this.conversationPool = map;
        }

        private long getSortKey(ContentNode contentNode) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("5e91e75a", new Object[]{this, contentNode})).longValue();
            }
            if ("conversation".equals(contentNode.getOriginalObjectType())) {
                SimpleConversation simpleConversation = this.conversationPool.get(contentNode.getOriginalObjectId());
                return Math.max(simpleConversation.getConversationContent().getLastMessageSummary().getSendTime(), simpleConversation.getOrderTime());
            } else if (!"folder".equals(contentNode.getOriginalObjectType())) {
                return 0L;
            } else {
                return ValueUtil.getLong(contentNode.getComputedData(), "sortKey");
            }
        }

        private int getSortPriority(ContentNode contentNode) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("9571e306", new Object[]{this, contentNode})).intValue();
            }
            if ("conversation".equals(contentNode.getOriginalObjectType())) {
                return this.conversationPool.get(contentNode.getOriginalObjectId()).getPosition();
            }
            if (!"folder".equals(contentNode.getOriginalObjectType())) {
                return 0;
            }
            return ValueUtil.getInteger(contentNode.getComputedData(), "sortPriority");
        }

        @Override // java.util.Comparator
        public int compare(ContentNode contentNode, ContentNode contentNode2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("ec2ff847", new Object[]{this, contentNode, contentNode2})).intValue();
            }
            long sortKey = getSortKey(contentNode);
            long sortKey2 = getSortKey(contentNode2);
            int sortPriority = getSortPriority(contentNode);
            int sortPriority2 = getSortPriority(contentNode2);
            if (sortPriority == sortPriority2 && sortKey == sortKey2) {
                return 0;
            }
            return sortPriority != sortPriority2 ? sortPriority < sortPriority2 ? -1 : 1 : sortKey < sortKey2 ? -1 : 1;
        }
    }
}
