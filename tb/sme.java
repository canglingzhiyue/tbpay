package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.deprecated.message.IMessageService;
import java.util.HashMap;

/* loaded from: classes5.dex */
public class sme {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1547215681);
    }

    public static void a(FluidContext fluidContext, psw pswVar, float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be604736", new Object[]{fluidContext, pswVar, new Float(f), new Float(f2)});
        } else if (pswVar.c() == 2) {
        } else {
            HashMap hashMap = new HashMap(2);
            hashMap.put("x", Float.valueOf(f));
            hashMap.put("y", Float.valueOf(f2));
            spz.c("sendCardDoubleClickMessage", "onDoubleClick，x=" + f + " y=" + f2);
            spy spyVar = new spy("VSMSG_doubleClickFavor", pswVar.D().c, hashMap);
            spy spyVar2 = new spy("VSMSG_requestFavor", pswVar.D().c, null);
            ((IMessageService) fluidContext.getService(IMessageService.class)).sendMessage(spyVar);
            ((IMessageService) fluidContext.getService(IMessageService.class)).sendMessage(spyVar2);
        }
    }

    public static void b(FluidContext fluidContext, psw pswVar, float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf1613f7", new Object[]{fluidContext, pswVar, new Float(f), new Float(f2)});
        } else if (pswVar.c() == 2) {
        } else {
            HashMap hashMap = new HashMap(2);
            hashMap.put("x", Float.valueOf(f));
            hashMap.put("y", Float.valueOf(f2));
            spz.c("sendCardTripleClickMessage", "onTripleClick，x=" + f + " y=" + f2);
            ((IMessageService) fluidContext.getService(IMessageService.class)).sendMessage(new spy("VSMSG_tripleClick", pswVar.D().c, hashMap));
        }
    }

    public static void b(FluidContext fluidContext, psw pswVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7bdadb7", new Object[]{fluidContext, pswVar});
        } else {
            ((IMessageService) fluidContext.getService(IMessageService.class)).sendMessage(new spy("VSMSG_longPress", pswVar.D().c, null));
        }
    }

    public static void b(psw pswVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8c26205", new Object[]{pswVar});
        } else {
            smk.a(pswVar.z(), pswVar.r(), obz.a(pswVar.D().i()), false, pswVar.D().i().hasExposed);
        }
    }

    public static void a(sic sicVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("338047f5", new Object[]{sicVar, str});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("url", str);
        if (sicVar.h() == null || sicVar.h().f12530a == null || TextUtils.isEmpty(sicVar.h().f12530a.c)) {
            return;
        }
        ((IMessageService) sicVar.z().getService(IMessageService.class)).sendMessage(new spy("VSMSG_liveModeGotoLiveRoom", sicVar.h().f12530a.c, hashMap));
    }

    public static void b(sic sicVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48691036", new Object[]{sicVar, str});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("state", str);
        hashMap.put("focus_mode", "0");
        ((IMessageService) sicVar.z().getService(IMessageService.class)).sendMessage(new spy(suz.VIDEO_STATE_CHANGE_NAME, sicVar.f(), hashMap));
        String a2 = smm.a(str);
        if (a2 == null) {
            return;
        }
        ((IMessageService) sicVar.z().getService(IMessageService.class)).sendMessage(new spy(a2, sicVar.f(), hashMap));
    }
}
