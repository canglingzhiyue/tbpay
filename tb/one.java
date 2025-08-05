package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.messagekit.core.model.Ack;
import com.taobao.tao.messagekit.core.model.BaseMessage;
import com.taobao.tao.messagekit.core.model.Command;
import com.taobao.tao.messagekit.core.model.b;
import com.taobao.tao.messagekit.core.utils.MsgLog;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes8.dex */
public class one implements olv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private ConcurrentHashMap<String, Long> f32201a = new ConcurrentHashMap<>();

    static {
        kge.a(2078241945);
        kge.a(-1909143075);
    }

    private boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue();
        }
        Long l = this.f32201a.get(str);
        if (l == null || System.currentTimeMillis() > l.longValue()) {
            this.f32201a.remove(str);
            return false;
        }
        MsgLog.b("CMD_Limit", "limit:", str);
        return true;
    }

    private String b(int i, int i2, String str, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c4c071cd", new Object[]{this, new Integer(i), new Integer(i2), str, new Integer(i3), new Integer(i4)});
        }
        StringBuilder sb = new StringBuilder();
        sb.append(i);
        if (i2 > 0) {
            sb.append(riy.PLUS);
            sb.append(i2);
        }
        if (!TextUtils.isEmpty(str)) {
            sb.append(riy.PLUS);
            sb.append(str);
        }
        if (i3 > 0) {
            sb.append(riy.PLUS);
            sb.append(i3);
        }
        if (i4 > 0) {
            sb.append(riy.PLUS);
            sb.append(i4);
        }
        return sb.toString();
    }

    @Override // tb.olv
    public Ack a(Command command) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Ack) ipChange.ipc$dispatch("3702b6b0", new Object[]{this, command});
        }
        this.f32201a.put(b(command.sysCode, command.bizCode, command.header.f31524a, command.body.c, command.body.d), Long.valueOf(System.currentTimeMillis() + (command.body.b * 1000)));
        return null;
    }

    public Ack a(b<BaseMessage> bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Ack) ipChange.ipc$dispatch("b99419a7", new Object[]{this, bVar});
        }
        if (!a(bVar.b, bVar.f20780a.bizCode, bVar.f20780a.header.f31524a, bVar.f20780a.type, bVar.f20780a.header.g)) {
            return null;
        }
        Ack ack = new Ack(bVar.f20780a);
        ack.setStatus(4001);
        bVar.f20780a = ack;
        bVar.b = ack.sysCode;
        return ack;
    }

    public boolean a(int i, int i2, String str, int i3, int i4) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("65e45e76", new Object[]{this, new Integer(i), new Integer(i2), str, new Integer(i3), new Integer(i4)})).booleanValue() : a(b(i, -1, null, -1, -1)) || a(b(i, i2, null, -1, -1)) || a(b(i, i2, str, -1, -1)) || a(b(i, i2, str, i3, -1)) || a(b(i, i2, str, i3, i4));
    }
}
