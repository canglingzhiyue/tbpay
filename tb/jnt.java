package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import tb.joa;

/* loaded from: classes6.dex */
public abstract class jnt implements joa {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1689977697);
        kge.a(1611988376);
    }

    public abstract void a(JSONObject jSONObject, a aVar, joa.a aVar2);

    /* loaded from: classes6.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private byte[] f29650a;

        static {
            kge.a(-517089207);
        }

        public a a(byte[] bArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("6fc746aa", new Object[]{this, bArr});
            }
            this.f29650a = bArr;
            return this;
        }

        public byte[] a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (byte[]) ipChange.ipc$dispatch("a8212175", new Object[]{this}) : this.f29650a;
        }
    }
}
