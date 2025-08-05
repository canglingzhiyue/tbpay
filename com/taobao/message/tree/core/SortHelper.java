package com.taobao.message.tree.core;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.kit.util.ValueUtil;
import com.taobao.message.tree.core.model.ContentNode;
import com.taobao.message.tree.core.model.INeedContentNode;
import java.util.Comparator;
import tb.kge;

/* loaded from: classes7.dex */
public class SortHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-811085882);
    }

    public static /* synthetic */ int access$000(ContentNode contentNode, ContentNode contentNode2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a72574d2", new Object[]{contentNode, contentNode2})).intValue() : compare(contentNode, contentNode2);
    }

    /* loaded from: classes7.dex */
    public static class RawNodeComparator implements Comparator<ContentNode> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-1553624766);
            kge.a(-2099169482);
        }

        @Override // java.util.Comparator
        public int compare(ContentNode contentNode, ContentNode contentNode2) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ec2ff847", new Object[]{this, contentNode, contentNode2})).intValue() : SortHelper.access$000(contentNode, contentNode2);
        }
    }

    /* loaded from: classes7.dex */
    public static class NodeComparator<T extends INeedContentNode> implements Comparator<T> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(1510499638);
            kge.a(-2099169482);
        }

        @Override // java.util.Comparator
        public int compare(T t, T t2) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("c2f950ff", new Object[]{this, t, t2})).intValue() : SortHelper.access$000(t.getContentNode(), t2.getContentNode());
        }
    }

    private static int compare(ContentNode contentNode, ContentNode contentNode2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ec2ff847", new Object[]{contentNode, contentNode2})).intValue();
        }
        long j = ValueUtil.getLong(contentNode.getViewMap(), "sort.key");
        long j2 = ValueUtil.getLong(contentNode2.getViewMap(), "sort.key");
        int integer = ValueUtil.getInteger(contentNode.getViewMap(), "sort.priority");
        int integer2 = ValueUtil.getInteger(contentNode2.getViewMap(), "sort.priority");
        if (integer == integer2 && j == j2) {
            return 0;
        }
        return integer != integer2 ? integer < integer2 ? -1 : 1 : j < j2 ? -1 : 1;
    }

    /* loaded from: classes7.dex */
    public static class ReversedComparatorWrapper<T> implements Comparator<T> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private Comparator<T> comparator;

        static {
            kge.a(-158492227);
            kge.a(-2099169482);
        }

        public ReversedComparatorWrapper(Comparator<T> comparator) {
            this.comparator = comparator;
        }

        @Override // java.util.Comparator
        public int compare(T t, T t2) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6a9be197", new Object[]{this, t, t2})).intValue() : -this.comparator.compare(t, t2);
        }
    }
}
