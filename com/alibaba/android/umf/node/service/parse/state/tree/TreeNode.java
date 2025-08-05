package com.alibaba.android.umf.node.service.parse.state.tree;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicLong;
import tb.kge;

/* loaded from: classes2.dex */
public abstract class TreeNode<T> implements Serializable, Cloneable, Iterable<TreeNode<T>> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final AtomicLong ID_GENERATOR;
    public T data;
    private final long id = ID_GENERATOR.getAndIncrement();
    public TreeNode<T> parent;

    /* loaded from: classes2.dex */
    public interface a<T extends TreeNode> {
        void a(T t);

        boolean a();
    }

    public abstract boolean add(TreeNode<T> treeNode);

    public abstract void clear();

    public abstract boolean dropSubtree(TreeNode<T> treeNode);

    @Override // java.lang.Iterable
    public abstract TreeNode<T>.b iterator();

    public abstract Collection<? extends TreeNode<T>> subtrees();

    static {
        kge.a(1630291730);
        kge.a(-1037398426);
        kge.a(1028243835);
        kge.a(-723128125);
        ID_GENERATOR = new AtomicLong(0L);
    }

    public TreeNode(T t) {
        this.data = t;
    }

    public TreeNode() {
    }

    public T data() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (T) ipChange.ipc$dispatch("7b22b021", new Object[]{this}) : this.data;
    }

    public void setData(T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4f836cf", new Object[]{this, t});
        } else {
            this.data = t;
        }
    }

    public boolean isRoot() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c6b36bb7", new Object[]{this})).booleanValue() : this.parent == null;
    }

    public TreeNode<T> root() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TreeNode) ipChange.ipc$dispatch("27f8c72a", new Object[]{this});
        }
        if (isRoot()) {
            return this;
        }
        TreeNode<T> treeNode = this;
        do {
            treeNode = treeNode.parent();
        } while (!treeNode.isRoot());
        return treeNode;
    }

    public TreeNode<T> parent() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TreeNode) ipChange.ipc$dispatch("71670a62", new Object[]{this}) : this.parent;
    }

    public boolean isLeaf() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("2dc4ec33", new Object[]{this})).booleanValue() : subtrees().isEmpty();
    }

    public TreeNode<T> find(final T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TreeNode) ipChange.ipc$dispatch("e13a3b97", new Object[]{this, t});
        }
        if (isLeaf()) {
            if (data() == null) {
                if (t != null) {
                    return null;
                }
            } else if (!data().equals(t)) {
                return null;
            }
            return this;
        }
        final TreeNode<T>[] treeNodeArr = (TreeNode[]) Array.newInstance(getClass(), 1);
        traversePreOrder(new a<TreeNode<T>>() { // from class: com.alibaba.android.umf.node.service.parse.state.tree.TreeNode.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alibaba.android.umf.node.service.parse.state.tree.TreeNode.a
            public void a(TreeNode<T> treeNode) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("87a5e2c5", new Object[]{this, treeNode});
                    return;
                }
                if (treeNode.data() == null) {
                    if (t != null) {
                        return;
                    }
                } else if (!treeNode.data().equals(t)) {
                    return;
                }
                treeNodeArr[0] = treeNode;
            }

            @Override // com.alibaba.android.umf.node.service.parse.state.tree.TreeNode.a
            public boolean a() {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : treeNodeArr[0] != null;
            }
        });
        return treeNodeArr[0];
    }

    public boolean hasSubtree(TreeNode<T> treeNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("219aa6cc", new Object[]{this, treeNode})).booleanValue();
        }
        if (treeNode != null && !isLeaf() && !treeNode.isRoot()) {
            for (TreeNode<T> treeNode2 : subtrees()) {
                if (treeNode2.equals(treeNode)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean contains(com.alibaba.android.umf.node.service.parse.state.tree.TreeNode<T> r6) {
        /*
            r5 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.alibaba.android.umf.node.service.parse.state.tree.TreeNode.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L1c
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r3] = r5
            r1[r2] = r6
            java.lang.String r6 = "715987"
            java.lang.Object r6 = r0.ipc$dispatch(r6, r1)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            return r6
        L1c:
            if (r6 == 0) goto L4c
            boolean r0 = r5.isLeaf()
            if (r0 != 0) goto L4c
            boolean r0 = r6.isRoot()
            if (r0 == 0) goto L2b
            goto L4c
        L2b:
            java.util.Collection r0 = r5.subtrees()
            java.util.Iterator r0 = r0.iterator()
        L33:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L4c
            java.lang.Object r1 = r0.next()
            com.alibaba.android.umf.node.service.parse.state.tree.TreeNode r1 = (com.alibaba.android.umf.node.service.parse.state.tree.TreeNode) r1
            boolean r4 = r1.equals(r6)
            if (r4 != 0) goto L4b
            boolean r1 = r1.contains(r6)
            if (r1 == 0) goto L33
        L4b:
            return r2
        L4c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.android.umf.node.service.parse.state.tree.TreeNode.contains(com.alibaba.android.umf.node.service.parse.state.tree.TreeNode):boolean");
    }

    public boolean remove(TreeNode<T> treeNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cc1b796c", new Object[]{this, treeNode})).booleanValue();
        }
        if (treeNode != null && !isLeaf() && !treeNode.isRoot()) {
            if (dropSubtree(treeNode)) {
                return true;
            }
            for (TreeNode<T> treeNode2 : subtrees()) {
                if (treeNode2.remove(treeNode)) {
                    return true;
                }
            }
        }
        return false;
    }

    public void traversePreOrder(a<TreeNode<T>> aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43d7e244", new Object[]{this, aVar});
        } else if (!aVar.a()) {
            aVar.a(this);
            if (isLeaf()) {
                return;
            }
            for (TreeNode<T> treeNode : subtrees()) {
                treeNode.traversePreOrder(aVar);
            }
        }
    }

    public void traversePostOrder(a<TreeNode<T>> aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ccf3d243", new Object[]{this, aVar});
        } else if (!aVar.a()) {
            if (!isLeaf()) {
                for (TreeNode<T> treeNode : subtrees()) {
                    treeNode.traversePostOrder(aVar);
                }
            }
            aVar.a(this);
        }
    }

    public Collection<TreeNode<T>> preOrdered() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Collection) ipChange.ipc$dispatch("a9a57996", new Object[]{this});
        }
        if (isLeaf()) {
            return Collections.singleton(this);
        }
        ArrayList arrayList = new ArrayList();
        traversePreOrder(populateAction(arrayList));
        return arrayList;
    }

    public Collection<TreeNode<T>> postOrdered() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Collection) ipChange.ipc$dispatch("bb392b93", new Object[]{this});
        }
        if (isLeaf()) {
            return Collections.singleton(this);
        }
        ArrayList arrayList = new ArrayList();
        traversePostOrder(populateAction(arrayList));
        return arrayList;
    }

    public long size() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("32697bfc", new Object[]{this})).longValue();
        }
        if (isLeaf()) {
            return 1L;
        }
        final long[] jArr = {0};
        traversePreOrder(new a<TreeNode<T>>() { // from class: com.alibaba.android.umf.node.service.parse.state.tree.TreeNode.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alibaba.android.umf.node.service.parse.state.tree.TreeNode.a
            public boolean a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
                }
                return false;
            }

            @Override // com.alibaba.android.umf.node.service.parse.state.tree.TreeNode.a
            public void a(TreeNode<T> treeNode) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("87a5e2c5", new Object[]{this, treeNode});
                    return;
                }
                long[] jArr2 = jArr;
                jArr2[0] = jArr2[0] + 1;
            }
        });
        return jArr[0];
    }

    public int height() {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("58c32a21", new Object[]{this})).intValue();
        }
        if (isLeaf()) {
            return 0;
        }
        for (TreeNode<T> treeNode : subtrees()) {
            i = Math.max(i, treeNode.height());
        }
        return i + 1;
    }

    public int level() {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9d35bdfe", new Object[]{this})).intValue();
        }
        if (isRoot()) {
            return 0;
        }
        TreeNode<T> treeNode = this;
        do {
            treeNode = treeNode.parent();
            i++;
        } while (!treeNode.isRoot());
        return i;
    }

    /* renamed from: clone */
    public TreeNode<T> m155clone() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TreeNode) ipChange.ipc$dispatch("1c132ccf", new Object[]{this});
        }
        try {
            return (TreeNode) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new TreeNodeException("Unable to clone the current tree node", e);
        }
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.id == ((TreeNode) obj).id;
    }

    public int hashCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        long j = this.id;
        return (int) (j ^ (j >>> 32));
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("\n");
        final int level = level();
        traversePreOrder(new a<TreeNode<T>>() { // from class: com.alibaba.android.umf.node.service.parse.state.tree.TreeNode.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alibaba.android.umf.node.service.parse.state.tree.TreeNode.a
            public boolean a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
                }
                return false;
            }

            @Override // com.alibaba.android.umf.node.service.parse.state.tree.TreeNode.a
            public void a(TreeNode<T> treeNode) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("87a5e2c5", new Object[]{this, treeNode});
                    return;
                }
                int level2 = treeNode.level() - level;
                for (int i = 0; i < level2; i++) {
                    sb.append("|  ");
                }
                StringBuilder sb2 = sb;
                sb2.append("+- ");
                sb2.append(treeNode.data());
                sb2.append("\n");
            }
        });
        return sb.toString();
    }

    public static <T> a<TreeNode<T>> populateAction(final Collection<TreeNode<T>> collection) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("7b2771de", new Object[]{collection}) : new a<TreeNode<T>>() { // from class: com.alibaba.android.umf.node.service.parse.state.tree.TreeNode.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alibaba.android.umf.node.service.parse.state.tree.TreeNode.a
            public boolean a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
                }
                return false;
            }

            @Override // com.alibaba.android.umf.node.service.parse.state.tree.TreeNode.a
            public void a(TreeNode<T> treeNode) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("87a5e2c5", new Object[]{this, treeNode});
                } else {
                    collection.add(treeNode);
                }
            }
        };
    }

    public static <T> void linkParent(TreeNode<T> treeNode, TreeNode<T> treeNode2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61cd885", new Object[]{treeNode, treeNode2});
        } else if (treeNode == null) {
        } else {
            treeNode.parent = treeNode2;
        }
    }

    public static <T> void unlinkParent(TreeNode<T> treeNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a402901", new Object[]{treeNode});
        } else {
            treeNode.parent = null;
        }
    }

    public static <T> boolean isAnyNotNull(Collection<T> collection) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2dea6934", new Object[]{collection})).booleanValue();
        }
        if (collection != null && !collection.isEmpty()) {
            for (T t : collection) {
                if (t != null) {
                    return true;
                }
            }
        }
        return false;
    }

    public static <T> boolean areAllNulls(Collection<T> collection) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("68a3935b", new Object[]{collection})).booleanValue() : !isAnyNotNull(collection);
    }

    /* loaded from: classes2.dex */
    public abstract class b implements Iterator<TreeNode<T>> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private long f2861a;
        private TreeNode<T> c;
        private TreeNode<T> d;
        private boolean e = true;

        static {
            kge.a(-1757135168);
            kge.a(-1813181746);
        }

        public abstract TreeNode<T> a();

        public abstract TreeNode<T> b();

        public b() {
            this.f2861a = TreeNode.this.size();
            this.d = TreeNode.this;
        }

        @Override // java.util.Iterator
        public /* synthetic */ Object next() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ipChange.ipc$dispatch("b9bf2c78", new Object[]{this}) : c();
        }

        private TreeNode<T> d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (TreeNode) ipChange.ipc$dispatch("ebfc1068", new Object[]{this});
            }
            if (TreeNode.this.isLeaf()) {
                throw new TreeNodeException("Leftmost node can't be obtained. Current tree node is a leaf");
            }
            return a();
        }

        private TreeNode<T> e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (TreeNode) ipChange.ipc$dispatch("886a0cc7", new Object[]{this});
            }
            if (TreeNode.this.isRoot()) {
                throw new TreeNodeException("Right sibling node can't be obtained. Current tree node is root");
            }
            return b();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("291ab8", new Object[]{this})).booleanValue() : this.e;
        }

        public TreeNode<T> c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (TreeNode) ipChange.ipc$dispatch("4f8e1409", new Object[]{this});
            }
            f();
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            TreeNode<T> treeNode = this.d;
            this.c = treeNode;
            if (treeNode.isLeaf()) {
                if (!this.d.isRoot()) {
                    while (true) {
                        TreeNode<T> treeNode2 = this.d;
                        this.d = treeNode2.parent();
                        if (treeNode2.equals(TreeNode.this)) {
                            this.e = false;
                            break;
                        }
                        TreeNode<T> e = treeNode2.iterator().e();
                        if (e != null) {
                            this.d = e;
                            break;
                        }
                    }
                } else {
                    this.e = false;
                }
            } else {
                this.d = this.d.iterator().d();
            }
            return this.c;
        }

        private void f() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            } else if (this.f2861a != TreeNode.this.size()) {
                throw new ConcurrentModificationException();
            }
        }

        @Override // java.util.Iterator
        public void remove() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("41689b0b", new Object[]{this});
            } else if (!g()) {
                throw new IllegalStateException("Failed to remove the tree node. The iteration has not been performed yet");
            } else if (this.c.isRoot()) {
                throw new TreeNodeException(String.format("Failed to remove the tree node. The tree node %1$s is root", this.c));
            } else if (this.c.equals(TreeNode.this)) {
                throw new TreeNodeException("Failed to remove the tree node. The starting node can't be removed");
            } else {
                f();
                TreeNode<T> treeNode = this.c;
                while (true) {
                    if (treeNode.isRoot()) {
                        this.e = false;
                        break;
                    }
                    TreeNode<T> e = treeNode.iterator().e();
                    if (e != null) {
                        this.d = e;
                        break;
                    }
                    treeNode = treeNode.parent;
                }
                TreeNode<T> parent = this.c.parent();
                parent.dropSubtree(this.c);
                this.c = parent;
                this.f2861a = TreeNode.this.size();
            }
        }

        private boolean g() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[]{this})).booleanValue() : this.c != null;
        }
    }

    /* loaded from: classes2.dex */
    public static class TreeNodeException extends RuntimeException {
        static {
            kge.a(546202685);
        }

        public TreeNodeException(String str) {
            super(str);
        }

        public TreeNodeException(String str, Throwable th) {
            super(str, th);
        }
    }
}
