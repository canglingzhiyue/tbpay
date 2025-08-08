package tb;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.proxy.ir.room.IRRoomProxy;

/* loaded from: classes6.dex */
public class hkl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private IRRoomProxy f28732a = null;

    /* loaded from: classes6.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static final hkl f28733a;

        static {
            kge.a(1829990578);
            f28733a = new hkl();
        }

        public static /* synthetic */ hkl a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (hkl) ipChange.ipc$dispatch("f058a75", new Object[0]) : f28733a;
        }
    }

    static {
        kge.a(-550882178);
    }

    public static hkl a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (hkl) ipChange.ipc$dispatch("f058a75", new Object[0]) : a.a();
    }

    public IRRoomProxy b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IRRoomProxy) ipChange.ipc$dispatch("ceebca2d", new Object[]{this});
        }
        if (!phg.d().a()) {
            if (this.f28732a == null) {
                this.f28732a = (IRRoomProxy) com.taobao.android.live.plugin.proxy.ir.a.a().a(IRRoomProxy.KEY);
            }
        } else if (this.f28732a == null) {
            this.f28732a = (IRRoomProxy) com.taobao.android.live.plugin.proxy.ir.a.a().a(IRRoomProxy.KEY_DIANTAO);
        }
        return this.f28732a;
    }

    public int a(String str) {
        Integer num;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f3a64c25", new Object[]{this, str})).intValue();
        }
        if (!StringUtils.isEmpty(str) && a().b() != null && a().b().getRoomRIdMap() != null && (num = a().b().getRoomRIdMap().get(str)) != null) {
            return num.intValue();
        }
        return -233;
    }
}
