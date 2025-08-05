package tb;

import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.u;
import com.android.alibaba.ip.runtime.IpChange;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/* loaded from: classes3.dex */
public class aod extends u {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final ByteBuffer J;
    private final BlockingQueue<ByteBuffer> L;

    static {
        kge.a(283110826);
    }

    public aod(JSONReader.c cVar) {
        super(cVar, false);
        this.J = ByteBuffer.allocate(0);
        this.L = new LinkedBlockingQueue(4096);
        this.I = cVar.h();
    }

    public boolean a(ByteBuffer byteBuffer) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("2d64c9ed", new Object[]{this, byteBuffer})).booleanValue() : this.L.offer(byteBuffer);
    }

    @Override // com.alibaba.fastjson2.u
    public void aT() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa3b4f1a", new Object[]{this});
        } else if (this.G) {
        } else {
            try {
                ByteBuffer take = this.L.take();
                if (take == this.J) {
                    this.G = true;
                    this.x = this.F;
                    this.z = this.x;
                    return;
                }
                int capacity = take.capacity() - (this.H.length - this.F);
                if (capacity > 0) {
                    this.H = Arrays.copyOf(this.H, capacity > this.f2934a.h() ? this.H.length + capacity : this.f2934a.h() + this.H.length);
                }
                take.get(this.H, this.F, take.capacity());
                this.F += take.capacity();
            } catch (Exception e) {
                throw new JSONException("read error", e);
            }
        }
    }
}
