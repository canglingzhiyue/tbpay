package org.android.spdy;

import android.util.LruCache;
import com.android.alibaba.ip.runtime.IpChange;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final c b = new c();

    /* renamed from: a  reason: collision with root package name */
    private final LruCache<ByteBuffer, String> f25075a = new LruCache<>(128);

    public static c a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("2b41d1cc", new Object[0]) : b;
    }

    private c() {
    }

    public String a(ByteBuffer byteBuffer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("83a719d7", new Object[]{this, byteBuffer});
        }
        String str = this.f25075a.get(byteBuffer);
        if (str != null) {
            return str;
        }
        try {
            str = new String(byteBuffer.array(), byteBuffer.position(), byteBuffer.limit() - byteBuffer.position(), "utf-8");
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.f25075a.put(byteBuffer, str);
        return str;
    }
}
