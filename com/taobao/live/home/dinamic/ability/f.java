package com.taobao.live.home.dinamic.ability;

import android.taobao.windvane.standardmodal.WVStandardEventCenter;
import android.text.TextUtils;
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
public class f extends dlg {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long TBLPOSTMESSAGETOH5 = 99713629762691231L;

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
        String string = c.getString("name");
        String string2 = c.getString("param");
        if (!TextUtils.isEmpty(string) && !TextUtils.isEmpty(string2)) {
            WVStandardEventCenter.postNotificationToJS(string, string2);
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

        public f a(Object obj) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (f) ipChange.ipc$dispatch("a22bfea0", new Object[]{this, obj}) : new f();
        }
    }
}
