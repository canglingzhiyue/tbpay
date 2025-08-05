package tb;

import android.util.LruCache;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes8.dex */
public class pem<E> extends LruCache<E, Object> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final Object f32572a = new Object();

    public static /* synthetic */ Object ipc$super(pem pemVar, String str, Object... objArr) {
        if (str.hashCode() == -605927644) {
            return super.put(objArr[0], objArr[1]);
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public pem(int i) {
        super(i);
    }

    public boolean a(E e) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a6251248", new Object[]{this, e})).booleanValue() : e != null && super.put(e, f32572a) == null;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            evictAll();
        }
    }
}
