package com.taobao.live.home.dinamic.ability;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import tb.dkx;
import tb.dky;
import tb.dle;
import tb.dlg;
import tb.dlh;
import tb.dll;
import tb.dln;

/* loaded from: classes7.dex */
public class d extends dlg {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long TBLCOUNTDOWN = 1313197267424491183L;

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
        String string = c.getString("type");
        String string2 = c.getString("identifier");
        String string3 = c.getString("time");
        if (StringUtils.isEmpty(string) || StringUtils.isEmpty(string2) || !StringUtils.isDigitsOnly(string3)) {
            return new dky();
        }
        try {
            if ("start".equals(string) && !StringUtils.isEmpty(string3) && StringUtils.isDigitsOnly(string3)) {
                long parseInt = Integer.parseInt(string3) * 1000;
                h.a().a(string2, parseInt, parseInt, dllVar);
            } else if ("end".equals(string)) {
                h.a().a(string2, dllVar);
            }
        } catch (Exception unused) {
        }
        return new dky();
    }

    /* loaded from: classes7.dex */
    public static class a implements dln {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.dln
        public /* synthetic */ dlg b(Object obj) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (dlg) ipChange.ipc$dispatch("1766b262", new Object[]{this, obj}) : a(obj);
        }

        public d a(Object obj) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (d) ipChange.ipc$dispatch("a22bfe62", new Object[]{this, obj}) : new d();
        }
    }
}
