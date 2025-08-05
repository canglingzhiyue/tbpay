package com.alibaba.android.umf.node.service.parse.state.tree;

import android.text.TextUtils;
import com.alibaba.android.umf.node.service.parse.state.RenderComponent;
import com.alibaba.android.umf.node.service.parse.state.tree.TreeNode;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import tb.kge;

/* loaded from: classes2.dex */
public class MultiTreeNode extends TreeNode<RenderComponent> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int DEFAULT_BRANCHING_FACTOR = 10;
    private static final int MAX_ARRAY_SIZE = 2147483639;
    private static final long serialVersionUID = 1;
    private final int branchingFactor;
    private Object[] subtrees;
    private int subtreesSize;

    static {
        kge.a(1307654663);
    }

    public static /* synthetic */ Object ipc$super(MultiTreeNode multiTreeNode, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ Object[] access$000(MultiTreeNode multiTreeNode) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Object[]) ipChange.ipc$dispatch("e1acd264", new Object[]{multiTreeNode}) : multiTreeNode.subtrees;
    }

    public static /* synthetic */ int access$100(MultiTreeNode multiTreeNode, TreeNode treeNode) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("7afaba72", new Object[]{multiTreeNode, treeNode})).intValue() : multiTreeNode.indexOf(treeNode);
    }

    public static /* synthetic */ int access$200(MultiTreeNode multiTreeNode) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ce734174", new Object[]{multiTreeNode})).intValue() : multiTreeNode.subtreesSize;
    }

    public MultiTreeNode(RenderComponent renderComponent) {
        super(renderComponent);
        this.branchingFactor = 10;
        this.subtrees = new Object[this.branchingFactor];
    }

    public MultiTreeNode(RenderComponent renderComponent, int i) {
        super(renderComponent);
        if (i < 0) {
            throw new IllegalArgumentException("Branching factor can not be negative");
        }
        this.branchingFactor = i;
        this.subtrees = new Object[i];
    }

    public boolean isValid() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3fef87d", new Object[]{this})).booleanValue() : this.data != 0 && !TextUtils.isEmpty(((RenderComponent) this.data).key);
    }

    @Override // com.alibaba.android.umf.node.service.parse.state.tree.TreeNode
    public Collection<? extends TreeNode<RenderComponent>> subtrees() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Collection) ipChange.ipc$dispatch("420d51eb", new Object[]{this});
        }
        if (isLeaf()) {
            return Collections.emptySet();
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(this.subtreesSize);
        for (int i = 0; i < this.subtreesSize; i++) {
            linkedHashSet.add((TreeNode) this.subtrees[i]);
        }
        return linkedHashSet;
    }

    @Override // com.alibaba.android.umf.node.service.parse.state.tree.TreeNode
    public boolean add(TreeNode<RenderComponent> treeNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a6cf3b09", new Object[]{this, treeNode})).booleanValue();
        }
        if (treeNode == null) {
            return false;
        }
        linkParent(treeNode, this);
        ensureSubtreesCapacity(this.subtreesSize + 1);
        Object[] objArr = this.subtrees;
        int i = this.subtreesSize;
        this.subtreesSize = i + 1;
        objArr[i] = treeNode;
        return true;
    }

    private void ensureSubtreesCapacity(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d9cecef", new Object[]{this, new Integer(i)});
        } else if (i <= this.subtrees.length) {
        } else {
            increaseSubtreesCapacity(i);
        }
    }

    private void increaseSubtreesCapacity(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd64356b", new Object[]{this, new Integer(i)});
            return;
        }
        int length = this.subtrees.length;
        int i2 = length + (length >> 1);
        if (i2 < i) {
            i2 = i;
        }
        if (i2 > MAX_ARRAY_SIZE) {
            if (i < 0) {
                throw new OutOfMemoryError();
            }
            i2 = i > MAX_ARRAY_SIZE ? Integer.MAX_VALUE : MAX_ARRAY_SIZE;
        }
        this.subtrees = Arrays.copyOf(this.subtrees, i2);
    }

    @Override // com.alibaba.android.umf.node.service.parse.state.tree.TreeNode
    public boolean dropSubtree(TreeNode<RenderComponent> treeNode) {
        int indexOf;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2ca59b57", new Object[]{this, treeNode})).booleanValue();
        }
        if (treeNode == null || isLeaf() || treeNode.isRoot() || (indexOf = indexOf(treeNode)) < 0) {
            return false;
        }
        int i = (this.subtreesSize - indexOf) - 1;
        if (i > 0) {
            Object[] objArr = this.subtrees;
            System.arraycopy(objArr, indexOf + 1, objArr, indexOf, i);
        }
        Object[] objArr2 = this.subtrees;
        int i2 = this.subtreesSize - 1;
        this.subtreesSize = i2;
        objArr2[i2] = null;
        unlinkParent(treeNode);
        return true;
    }

    private int indexOf(TreeNode<RenderComponent> treeNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ff11b4a0", new Object[]{this, treeNode})).intValue();
        }
        for (int i = 0; i < this.subtreesSize; i++) {
            if (((TreeNode) this.subtrees[i]).equals(treeNode)) {
                return i;
            }
        }
        return -1;
    }

    @Override // com.alibaba.android.umf.node.service.parse.state.tree.TreeNode
    public void clear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b42d4c54", new Object[]{this});
        } else if (!isLeaf()) {
            for (int i = 0; i < this.subtreesSize; i++) {
                unlinkParent((TreeNode) this.subtrees[i]);
            }
            this.subtrees = new Object[this.branchingFactor];
            this.subtreesSize = 0;
        }
    }

    @Override // com.alibaba.android.umf.node.service.parse.state.tree.TreeNode, java.lang.Iterable
    /* renamed from: iterator */
    public TreeNode<RenderComponent>.b mo154iterator() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TreeNode.b) ipChange.ipc$dispatch("60060a60", new Object[]{this}) : new TreeNode<RenderComponent>.b() { // from class: com.alibaba.android.umf.node.service.parse.state.tree.MultiTreeNode.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alibaba.android.umf.node.service.parse.state.tree.TreeNode.b
            public TreeNode<RenderComponent> a() {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (TreeNode) ipChange2.ipc$dispatch("16b21b4b", new Object[]{this}) : (TreeNode) MultiTreeNode.access$000(MultiTreeNode.this)[0];
            }

            @Override // com.alibaba.android.umf.node.service.parse.state.tree.TreeNode.b
            public TreeNode<RenderComponent> b() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (TreeNode) ipChange2.ipc$dispatch("b32017aa", new Object[]{this});
                }
                MultiTreeNode multiTreeNode = (MultiTreeNode) MultiTreeNode.this.parent;
                int access$100 = MultiTreeNode.access$100(multiTreeNode, MultiTreeNode.this) + 1;
                if (access$100 >= MultiTreeNode.access$200(multiTreeNode)) {
                    return null;
                }
                return (TreeNode) MultiTreeNode.access$000(multiTreeNode)[access$100];
            }
        };
    }

    @Override // com.alibaba.android.umf.node.service.parse.state.tree.TreeNode
    public boolean isLeaf() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("2dc4ec33", new Object[]{this})).booleanValue() : this.subtreesSize == 0;
    }

    @Override // com.alibaba.android.umf.node.service.parse.state.tree.TreeNode
    public boolean hasSubtree(TreeNode<RenderComponent> treeNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("219aa6cc", new Object[]{this, treeNode})).booleanValue();
        }
        if (treeNode != null && !isLeaf() && !treeNode.isRoot()) {
            for (int i = 0; i < this.subtreesSize; i++) {
                if (treeNode.equals((TreeNode) this.subtrees[i])) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.alibaba.android.umf.node.service.parse.state.tree.TreeNode
    public boolean contains(TreeNode<RenderComponent> treeNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("715987", new Object[]{this, treeNode})).booleanValue();
        }
        if (treeNode != null && !isLeaf() && !treeNode.isRoot()) {
            for (int i = 0; i < this.subtreesSize; i++) {
                TreeNode treeNode2 = (TreeNode) this.subtrees[i];
                if (treeNode2.equals(treeNode) || treeNode2.contains(treeNode)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.alibaba.android.umf.node.service.parse.state.tree.TreeNode
    public boolean remove(TreeNode<RenderComponent> treeNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cc1b796c", new Object[]{this, treeNode})).booleanValue();
        }
        if (treeNode != null && !isLeaf() && !treeNode.isRoot()) {
            if (dropSubtree(treeNode)) {
                return true;
            }
            for (int i = 0; i < this.subtreesSize; i++) {
                if (((TreeNode) this.subtrees[i]).remove(treeNode)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.alibaba.android.umf.node.service.parse.state.tree.TreeNode
    public void traversePreOrder(TreeNode.a<TreeNode<RenderComponent>> aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43d7e244", new Object[]{this, aVar});
        } else if (!aVar.a()) {
            aVar.a(this);
            if (isLeaf()) {
                return;
            }
            for (int i = 0; i < this.subtreesSize; i++) {
                ((TreeNode) this.subtrees[i]).traversePreOrder(aVar);
            }
        }
    }

    @Override // com.alibaba.android.umf.node.service.parse.state.tree.TreeNode
    public void traversePostOrder(TreeNode.a<TreeNode<RenderComponent>> aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ccf3d243", new Object[]{this, aVar});
        } else if (!aVar.a()) {
            if (!isLeaf()) {
                for (int i = 0; i < this.subtreesSize; i++) {
                    ((TreeNode) this.subtrees[i]).traversePostOrder(aVar);
                }
            }
            aVar.a(this);
        }
    }

    @Override // com.alibaba.android.umf.node.service.parse.state.tree.TreeNode
    public int height() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("58c32a21", new Object[]{this})).intValue();
        }
        if (isLeaf()) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < this.subtreesSize; i2++) {
            i = Math.max(i, ((TreeNode) this.subtrees[i2]).height());
        }
        return i + 1;
    }
}
