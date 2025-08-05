package com.taobao.android.livehome.plugin.atype.flexalocal.dinamicx;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import tb.dkx;
import tb.dky;
import tb.dle;
import tb.dlg;
import tb.dlh;
import tb.dll;
import tb.dln;
import tb.kge;
import tb.mfg;

/* loaded from: classes6.dex */
public class j extends dlg {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long TBLSTABLETRACKER = 4885510248163492633L;

    static {
        kge.a(-2106467374);
    }

    @Override // tb.dlg
    public dkx a(dlh dlhVar, dle dleVar, dll dllVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dkx) ipChange.ipc$dispatch("1c5b757e", new Object[]{this, dlhVar, dleVar, dllVar});
        }
        JSONObject c = dlhVar == null ? null : dlhVar.c();
        if (c == null) {
            return new dky();
        }
        String string = c.getString("func");
        String string2 = c.getString("data");
        if (com.taobao.desktop.channel.calendar.a.CALENDAR_EVENT_ADD.equals(string) && string2 != null) {
            mfg.a().a("com.taobao.taolive.livehome.add.event", string2);
        } else if ("commit".equals(string) && string2 != null) {
            mfg.a().a("com.taobao.taolive.livehome.commit", string2);
        }
        return new dky();
    }

    /* loaded from: classes6.dex */
    public static class a implements dln {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-1187987287);
            kge.a(-1749066050);
        }

        @Override // tb.dln
        public /* synthetic */ dlg b(Object obj) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (dlg) ipChange.ipc$dispatch("1766b262", new Object[]{this, obj}) : a(obj);
        }

        public j a(Object obj) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (j) ipChange.ipc$dispatch("afe00d10", new Object[]{this, obj}) : new j();
        }
    }
}
