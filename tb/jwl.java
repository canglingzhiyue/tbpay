package tb;

import android.graphics.Bitmap;
import android.util.LruCache;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes6.dex */
public class jwl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private LruCache<String, Bitmap> f29831a = new LruCache<>(5);

    /* loaded from: classes6.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static final jwl f29832a = new jwl();

        public static /* synthetic */ jwl a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (jwl) ipChange.ipc$dispatch("f06a03f", new Object[0]) : f29832a;
        }
    }

    public static jwl a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (jwl) ipChange.ipc$dispatch("f06a03f", new Object[0]) : a.a();
    }

    public void a(String str, Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c58b8a3c", new Object[]{this, str, bitmap});
        } else {
            this.f29831a.put(str, bitmap);
        }
    }

    public Bitmap a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Bitmap) ipChange.ipc$dispatch("30dda510", new Object[]{this, str}) : this.f29831a.remove(str);
    }

    public Bitmap b(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Bitmap) ipChange.ipc$dispatch("a657cb51", new Object[]{this, str}) : this.f29831a.get(str);
    }
}
