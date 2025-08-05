package com.alibaba.ariver.kernel.common.io;

import android.support.v4.util.LruCache;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.LinkedList;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.kge;

/* loaded from: classes2.dex */
public class ByteArrayPool {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final int b;

    /* renamed from: a  reason: collision with root package name */
    private final BytePool f2907a = new BytePool(12);
    private final Object c = new Object();
    private final AtomicBoolean d = new AtomicBoolean(false);
    private int e = 0;

    static {
        kge.a(-1173285831);
    }

    public static /* synthetic */ Object access$200(ByteArrayPool byteArrayPool) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("b12c6d03", new Object[]{byteArrayPool}) : byteArrayPool.c;
    }

    public static /* synthetic */ int access$300(ByteArrayPool byteArrayPool) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("63dd4121", new Object[]{byteArrayPool})).intValue() : byteArrayPool.e;
    }

    public static /* synthetic */ int access$302(ByteArrayPool byteArrayPool, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("62f3698a", new Object[]{byteArrayPool, new Integer(i)})).intValue();
        }
        byteArrayPool.e = i;
        return i;
    }

    public ByteArrayPool(int i) {
        this.b = i;
    }

    public byte[] getBuf(int i) {
        byte[] poll;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("a0197a7e", new Object[]{this, new Integer(i)});
        }
        LinkedList<byte[]> linkedList = this.f2907a.get(Integer.valueOf(i));
        if (linkedList != null && (poll = linkedList.poll()) != null) {
            synchronized (this.c) {
                this.e -= poll.length;
            }
            return poll;
        }
        return new byte[i];
    }

    public void returnBuf(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15524871", new Object[]{this, bArr});
        } else if (bArr == null || bArr.length > this.b) {
        } else {
            synchronized (this.c) {
                this.e += bArr.length;
            }
            LinkedList<byte[]> linkedList = this.f2907a.get(Integer.valueOf(bArr.length));
            if (linkedList == null) {
                ConcurrentLinkedList concurrentLinkedList = new ConcurrentLinkedList();
                concurrentLinkedList.offer(bArr);
                this.f2907a.put(Integer.valueOf(bArr.length), concurrentLinkedList);
            } else {
                linkedList.offer(bArr);
            }
            a();
        }
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (this.d.get() || this.e <= this.b) {
        } else {
            this.d.set(true);
            BytePool bytePool = this.f2907a;
            bytePool.trimToSize(bytePool.size() / 2);
            this.d.set(false);
        }
    }

    /* loaded from: classes2.dex */
    public class BytePool extends LruCache<Integer, LinkedList<byte[]>> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-1738128017);
        }

        private BytePool(int i) {
            super(i);
        }

        @Override // android.support.v4.util.LruCache
        public void entryRemoved(boolean z, Integer num, LinkedList<byte[]> linkedList, LinkedList<byte[]> linkedList2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("69597c68", new Object[]{this, new Boolean(z), num, linkedList, linkedList2});
                return;
            }
            synchronized (ByteArrayPool.access$200(ByteArrayPool.this)) {
                if (z || linkedList2 != null) {
                    ByteArrayPool.access$302(ByteArrayPool.this, ByteArrayPool.access$300(ByteArrayPool.this) - (num.intValue() * linkedList.size()));
                }
            }
        }
    }

    /* loaded from: classes2.dex */
    public class ConcurrentLinkedList<T> extends LinkedList<T> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-508751079);
        }

        public static /* synthetic */ Object ipc$super(ConcurrentLinkedList concurrentLinkedList, String str, Object... objArr) {
            int hashCode = str.hashCode();
            if (hashCode != -340895956) {
                if (hashCode != 1107930627) {
                    throw new InstantReloadException(String.format("String switch could not find '%s'", str));
                }
                return new Boolean(super.offer(objArr[0]));
            }
            return super.poll();
        }

        private ConcurrentLinkedList() {
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
