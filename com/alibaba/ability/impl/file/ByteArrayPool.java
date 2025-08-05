package com.alibaba.ability.impl.file;

import android.support.v4.util.LruCache;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.LinkedList;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.t;
import tb.kge;

/* loaded from: classes2.dex */
public final class ByteArrayPool {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final a f1886a = new a(12);
    private final Object b = new Object();
    private final AtomicBoolean c = new AtomicBoolean(false);
    private int d;
    private final int e;

    static {
        kge.a(-1386557533);
    }

    public static final /* synthetic */ Object a(ByteArrayPool byteArrayPool) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("e5e2fd9c", new Object[]{byteArrayPool}) : byteArrayPool.b;
    }

    public static final /* synthetic */ void a(ByteArrayPool byteArrayPool, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f84a6d6d", new Object[]{byteArrayPool, new Integer(i)});
        } else {
            byteArrayPool.d = i;
        }
    }

    public static final /* synthetic */ int b(ByteArrayPool byteArrayPool) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("d061b668", new Object[]{byteArrayPool})).intValue() : byteArrayPool.d;
    }

    public ByteArrayPool(int i) {
        this.e = i;
    }

    public final byte[] a(int i) {
        byte[] poll;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("5c10e0a2", new Object[]{this, new Integer(i)});
        }
        LinkedList<byte[]> linkedList = this.f1886a.get(Integer.valueOf(i));
        if (linkedList != null && (poll = linkedList.poll()) != null) {
            synchronized (this.b) {
                this.d -= poll.length;
                t tVar = t.INSTANCE;
            }
            return poll;
        }
        return new byte[i];
    }

    public final void a(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c19672f", new Object[]{this, bArr});
        } else if (bArr == null || bArr.length > this.e) {
        } else {
            synchronized (this.b) {
                this.d += bArr.length;
                t tVar = t.INSTANCE;
            }
            LinkedList<byte[]> linkedList = this.f1886a.get(Integer.valueOf(bArr.length));
            if (linkedList == null) {
                ConcurrentLinkedList concurrentLinkedList = new ConcurrentLinkedList();
                concurrentLinkedList.offer(bArr);
                this.f1886a.put(Integer.valueOf(bArr.length), concurrentLinkedList);
            } else {
                linkedList.offer(bArr);
            }
            a();
        }
    }

    private final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (this.c.get() || this.d <= this.e) {
        } else {
            this.c.set(true);
            a aVar = this.f1886a;
            aVar.trimToSize(aVar.size() / 2);
            this.c.set(false);
        }
    }

    /* loaded from: classes2.dex */
    public final class a extends LruCache<Integer, LinkedList<byte[]>> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(323469637);
        }

        public a(int i) {
            super(i);
        }

        @Override // android.support.v4.util.LruCache
        public /* synthetic */ void entryRemoved(boolean z, Integer num, LinkedList<byte[]> linkedList, LinkedList<byte[]> linkedList2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cbb419b3", new Object[]{this, new Boolean(z), num, linkedList, linkedList2});
            } else {
                a(z, num.intValue(), linkedList, linkedList2);
            }
        }

        public void a(boolean z, int i, LinkedList<byte[]> linkedList, LinkedList<byte[]> linkedList2) {
            IpChange ipChange = $ipChange;
            int i2 = 0;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5104b347", new Object[]{this, new Boolean(z), new Integer(i), linkedList, linkedList2});
                return;
            }
            synchronized (ByteArrayPool.a(ByteArrayPool.this)) {
                if (z || linkedList2 != null) {
                    ByteArrayPool byteArrayPool = ByteArrayPool.this;
                    int b = ByteArrayPool.b(byteArrayPool);
                    if (linkedList != null) {
                        i2 = linkedList.size();
                    }
                    ByteArrayPool.a(byteArrayPool, b - (i * i2));
                }
                t tVar = t.INSTANCE;
            }
        }
    }

    /* loaded from: classes2.dex */
    public final class ConcurrentLinkedList<T> extends LinkedList<T> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(1756724719);
        }

        public static /* synthetic */ Object ipc$super(ConcurrentLinkedList concurrentLinkedList, String str, Object... objArr) {
            switch (str.hashCode()) {
                case -475350822:
                    return super.remove(((Number) objArr[0]).intValue());
                case -340895956:
                    return super.poll();
                case 845773819:
                    return new Integer(super.size());
                case 1107930627:
                    return new Boolean(super.offer(objArr[0]));
                default:
                    throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }
        }

        public ConcurrentLinkedList() {
        }

        public int getSize() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ae43b971", new Object[]{this})).intValue() : super.size();
        }

        @Override // java.util.LinkedList, java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
        public final T remove(int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (T) ipChange.ipc$dispatch("e3aab8da", new Object[]{this, new Integer(i)}) : (T) removeAt(i);
        }

        public Object removeAt(int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ipChange.ipc$dispatch("19801fed", new Object[]{this, new Integer(i)}) : super.remove(i);
        }

        @Override // java.util.LinkedList, java.util.AbstractCollection, java.util.Collection, java.util.List, java.util.Deque
        public final int size() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("32697bfb", new Object[]{this})).intValue() : getSize();
        }

        @Override // java.util.LinkedList, java.util.Deque, java.util.Queue
        public T poll() {
            T t;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (T) ipChange.ipc$dispatch("ebae572c", new Object[]{this});
            }
            synchronized (this) {
                t = (T) super.poll();
            }
            return t;
        }

        @Override // java.util.LinkedList, java.util.Deque, java.util.Queue
        public boolean offer(T t) {
            boolean offer;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("4209ae03", new Object[]{this, t})).booleanValue();
            }
            synchronized (this) {
                offer = super.offer(t);
            }
            return offer;
        }
    }
}
