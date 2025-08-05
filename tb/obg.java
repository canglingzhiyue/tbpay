package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes8.dex */
public class obg {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String SHARE_HANDLER_CLASS_NAME = "com.taobao.tao.channel.ShareToChannelHandler";

    /* renamed from: a  reason: collision with root package name */
    private a f31887a;

    /* loaded from: classes8.dex */
    public interface a {
        void shareToChannel(JSONObject jSONObject);
    }

    /* loaded from: classes8.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static obg f31888a;

        static {
            kge.a(1165196522);
            f31888a = new obg();
        }

        public static /* synthetic */ obg a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (obg) ipChange.ipc$dispatch("f0896aa", new Object[0]) : f31888a;
        }
    }

    static {
        kge.a(-495723421);
    }

    private obg() {
    }

    public static obg a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (obg) ipChange.ipc$dispatch("f0896aa", new Object[0]) : b.a();
    }

    public void a(JSONObject jSONObject) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        if (this.f31887a == null) {
            this.f31887a = (a) Class.forName(SHARE_HANDLER_CLASS_NAME).newInstance();
        }
        a aVar = this.f31887a;
        if (aVar != null) {
            aVar.shareToChannel(jSONObject);
        }
    }
}
