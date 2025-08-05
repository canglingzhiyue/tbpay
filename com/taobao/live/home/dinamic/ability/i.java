package com.taobao.live.home.dinamic.ability;

import android.text.TextUtils;
import com.alibaba.ability.impl.log.LogAbility;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.festival.jsbridge.AliFestivalWVPlugin;
import com.taobao.tao.log.TLog;
import tb.dkx;
import tb.dky;
import tb.dle;
import tb.dlg;
import tb.dlh;
import tb.dll;
import tb.dln;

/* loaded from: classes7.dex */
public class i extends dlg {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long TBLTLOG = 4166530386970421247L;

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
        String string = c.getString(AliFestivalWVPlugin.PARAMS_MODULE_NAME);
        String string2 = c.getString("level");
        String string3 = c.getString("tag");
        String string4 = c.getString("content");
        if (TextUtils.isEmpty(string) || TextUtils.isEmpty(string2) || TextUtils.isEmpty(string3)) {
            return new dky();
        }
        if ("error".equals(string2)) {
            TLog.loge(string, string3, string4);
        } else if (LogAbility.API_WARN.equals(string2)) {
            TLog.logw(string, string3, string4);
        } else if ("info".equals(string2)) {
            TLog.logi(string, string3, string4);
        } else if ("debug".equals(string2)) {
            TLog.logd(string, string3, string4);
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

        public i a(Object obj) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (i) ipChange.ipc$dispatch("a22bfefd", new Object[]{this, obj}) : new i();
        }
    }
}
