package com.taobao.themis.utils.io;

import android.support.v4.util.LruCache;
import com.alibaba.security.realidentity.o;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.LinkedList;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.t;
import tb.kge;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0002\u0012\u0013B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0003J\u0010\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\fJ\b\u0010\u0011\u001a\u00020\u000fH\u0002R\u0012\u0010\u0005\u001a\u00060\u0006R\u00020\u0000X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/taobao/themis/utils/io/ByteArrayPool;", "", "mSizeLimit", "", "(I)V", "mBuffersFastCache", "Lcom/taobao/themis/utils/io/ByteArrayPool$BytePool;", "mCurrentSize", "mIsTriming", "Ljava/util/concurrent/atomic/AtomicBoolean;", "mSizeLock", "getBuf", "", "len", "returnBuf", "", "buf", "trim", "BytePool", "ConcurrentLinkedList", "themis_utils_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class ByteArrayPool {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final a f22878a = new a(12);
    private final Object b = new Object();
    private final AtomicBoolean c = new AtomicBoolean(false);
    private int d;
    private final int e;

    static {
        kge.a(557543640);
    }

    public static final /* synthetic */ Object a(ByteArrayPool byteArrayPool) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("9f7b0493", new Object[]{byteArrayPool}) : byteArrayPool.b;
    }

    public static final /* synthetic */ void a(ByteArrayPool byteArrayPool, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26254264", new Object[]{byteArrayPool, new Integer(i)});
        } else {
            byteArrayPool.d = i;
        }
    }

    public static final /* synthetic */ int b(ByteArrayPool byteArrayPool) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("97bd66b3", new Object[]{byteArrayPool})).intValue() : byteArrayPool.d;
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
        LinkedList<byte[]> linkedList = this.f22878a.get(Integer.valueOf(i));
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
            LinkedList<byte[]> linkedList = this.f22878a.get(Integer.valueOf(bArr.length));
            if (linkedList == null) {
                ConcurrentLinkedList concurrentLinkedList = new ConcurrentLinkedList();
                concurrentLinkedList.offer(bArr);
                this.f22878a.put(Integer.valueOf(bArr.length), concurrentLinkedList);
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
            a aVar = this.f22878a;
            aVar.trimToSize(aVar.size() / 2);
            this.c.set(false);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u0018\u0012\u0004\u0012\u00020\u0002\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u00030\u0001B\r\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0002\u0010\u0006J<\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00022\u0010\u0010\f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u00032\u0010\u0010\r\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003H\u0014¨\u0006\u000e"}, d2 = {"Lcom/taobao/themis/utils/io/ByteArrayPool$BytePool;", "Landroid/support/v4/util/LruCache;", "", "Ljava/util/LinkedList;", "", "maxSize", "(Lcom/taobao/themis/utils/io/ByteArrayPool;I)V", "entryRemoved", "", "evicted", "", "key", "oldValue", "newValue", "themis_utils_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public final class a extends LruCache<Integer, LinkedList<byte[]>> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-1094669392);
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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0082\u0004\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0005¢\u0006\u0002\u0010\u0003J\u0015\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0007J\u000f\u0010\b\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"Lcom/taobao/themis/utils/io/ByteArrayPool$ConcurrentLinkedList;", "T", "Ljava/util/LinkedList;", "(Lcom/taobao/themis/utils/io/ByteArrayPool;)V", "offer", "", o.b, "(Ljava/lang/Object;)Z", "poll", "()Ljava/lang/Object;", "themis_utils_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public final class ConcurrentLinkedList<T> extends LinkedList<T> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(350429146);
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
