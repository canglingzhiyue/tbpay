package tb;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.messagekit.core.model.Ack;
import com.taobao.tao.messagekit.core.model.BaseMessage;
import com.taobao.tao.messagekit.core.model.Command;
import com.taobao.tao.messagekit.core.model.b;
import com.taobao.tao.messagekit.core.utils.MsgLog;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes8.dex */
public class onc implements olv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private ConcurrentHashMap<String, Long> f32200a = new ConcurrentHashMap<>();

    static {
        kge.a(-2407829);
        kge.a(-1909143075);
    }

    private String a(int i, int i2, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bb05e444", new Object[]{this, new Integer(i), new Integer(i2), str, str2});
        }
        return "" + i + riy.PLUS + i2 + riy.PLUS + str + riy.PLUS + str2;
    }

    @Override // tb.olv
    public Ack a(Command command) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Ack) ipChange.ipc$dispatch("3702b6b0", new Object[]{this, command});
        }
        if (StringUtils.isEmpty(command.header.f31524a) && !command.header.h.equals(omg.f())) {
            return null;
        }
        int i = command.header.g;
        if (i == 301) {
            this.f32200a.put(a(command.sysCode, command.bizCode, command.header.f31524a, command.header.h), Long.valueOf(System.currentTimeMillis() + (command.body.b * 1000)));
            MsgLog.a("CMDBlock", "cmd block:", Integer.valueOf(command.bizCode), command.header.f31524a, command.header.h, Integer.valueOf(command.body.b));
        } else if (i == 302) {
            this.f32200a.remove(a(command.sysCode, command.bizCode, command.header.f31524a, command.header.h));
            MsgLog.a("CMDBlock", "cmd unBlock:", Integer.valueOf(command.bizCode), command.header.f31524a, command.header.h, Integer.valueOf(command.body.b));
        }
        return null;
    }

    public Ack a(b<BaseMessage> bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Ack) ipChange.ipc$dispatch("b99419a7", new Object[]{this, bVar});
        }
        if (bVar.f20780a.type != 1 || !a(bVar.b, bVar.f20780a.bizCode, bVar.f20780a.header.f31524a)) {
            return null;
        }
        Ack ack = new Ack(bVar.f20780a);
        ack.setStatus(-3002);
        bVar.f20780a = ack;
        bVar.b = ack.sysCode;
        return ack;
    }

    public boolean a(int i, int i2, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9d025a96", new Object[]{this, new Integer(i), new Integer(i2), str})).booleanValue();
        }
        String a2 = a(i, i2, str, omg.f());
        Long l = this.f32200a.get(a2);
        if (l == null || System.currentTimeMillis() > l.longValue()) {
            this.f32200a.remove(a2);
            return false;
        }
        MsgLog.a("CMDBlock", "block:", a2);
        return true;
    }
}
