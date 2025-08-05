package anet.channel.detect;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.ConcurrentLinkedQueue;
import tb.kge;

/* loaded from: classes.dex */
public class LimitedQueue<E> extends ConcurrentLinkedQueue<E> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final long serialVersionUID = 6883081710692451520L;
    private int limit;

    static {
        kge.a(-33106268);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object ipc$super(LimitedQueue limitedQueue, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode != -667118713) {
            if (hashCode != 195222152) {
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }
            return new Boolean(super.add(objArr[0]));
        }
        return super.remove();
    }

    public LimitedQueue(int i) {
        this.limit = i;
    }

    @Override // java.util.concurrent.ConcurrentLinkedQueue, java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection, java.util.Queue
    public boolean add(E e) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ba2da88", new Object[]{this, e})).booleanValue();
        }
        boolean add = super.add(e);
        while (add && size() > this.limit) {
            super.remove();
        }
        return add;
    }
}
