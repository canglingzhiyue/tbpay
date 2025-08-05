package com.taobao.themis.utils.io;

import android.support.v4.util.LruCache;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.LinkedList;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.kge;

/* loaded from: classes9.dex */
public class TMSByteArrayPool {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final int b;

    /* renamed from: a  reason: collision with root package name */
    private final a f22880a = new a(12);
    private final Object c = new Object();
    private final AtomicBoolean d = new AtomicBoolean(false);
    private int e = 0;

    static {
        kge.a(-173943768);
    }

    public static /* synthetic */ int a(TMSByteArrayPool tMSByteArrayPool, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4c1a765", new Object[]{tMSByteArrayPool, new Integer(i)})).intValue();
        }
        int i2 = tMSByteArrayPool.e - i;
        tMSByteArrayPool.e = i2;
        return i2;
    }

    public static /* synthetic */ Object a(TMSByteArrayPool tMSByteArrayPool) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("33f78da1", new Object[]{tMSByteArrayPool}) : tMSByteArrayPool.c;
    }

    public TMSByteArrayPool(int i) {
        this.b = i;
    }

    public byte[] a(int i) {
        byte[] poll;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("5c10e0a2", new Object[]{this, new Integer(i)});
        }
        LinkedList<byte[]> linkedList = this.f22880a.get(Integer.valueOf(i));
        if (linkedList != null && (poll = linkedList.poll()) != null) {
            synchronized (this.c) {
                this.e -= poll.length;
            }
            return poll;
        }
        return new byte[i];
    }

    public void a(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c19672f", new Object[]{this, bArr});
        } else if (bArr == null || bArr.length > this.b) {
        } else {
            synchronized (this.c) {
                this.e += bArr.length;
            }
            LinkedList<byte[]> linkedList = this.f22880a.get(Integer.valueOf(bArr.length));
            if (linkedList == null) {
                ConcurrentLinkedList concurrentLinkedList = new ConcurrentLinkedList();
                concurrentLinkedList.offer(bArr);
                this.f22880a.put(Integer.valueOf(bArr.length), concurrentLinkedList);
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
            a aVar = this.f22880a;
            aVar.trimToSize(aVar.size() / 2);
            this.d.set(false);
        }
    }

    /* loaded from: classes9.dex */
    public class a extends LruCache<Integer, LinkedList<byte[]>> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(986514016);
        }

        @Override // android.support.v4.util.LruCache
        public /* synthetic */ void entryRemoved(boolean z, Integer num, LinkedList<byte[]> linkedList, LinkedList<byte[]> linkedList2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cbb419b3", new Object[]{this, new Boolean(z), num, linkedList, linkedList2});
            } else {
                a(z, num, linkedList, linkedList2);
            }
        }

        private a(int i) {
            super(i);
        }

        public void a(boolean z, Integer num, LinkedList<byte[]> linkedList, LinkedList<byte[]> linkedList2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a1ce1fbb", new Object[]{this, new Boolean(z), num, linkedList, linkedList2});
                return;
            }
            synchronized (TMSByteArrayPool.a(TMSByteArrayPool.this)) {
                if (z || linkedList2 != null) {
                    TMSByteArrayPool.a(TMSByteArrayPool.this, num.intValue() * linkedList.size());
                }
            }
        }
    }

    /* loaded from: classes9.dex */
    public class ConcurrentLinkedList<T> extends LinkedList<T> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-583864694);
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
