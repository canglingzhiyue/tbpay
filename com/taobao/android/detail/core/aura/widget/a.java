package com.taobao.android.detail.core.aura.widget;

import mtopsdk.common.util.StringUtils;
import com.alibaba.android.aura.s;
import com.alibaba.android.aura.service.event.d;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Iterator;
import tb.arc;
import tb.axe;
import tb.emu;
import tb.kge;

/* loaded from: classes4.dex */
public class a extends axe {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_EVENT_HASH = 1544903441687469454L;

    static {
        kge.a(-1639421268);
    }

    public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
        if (str.hashCode() == 1732145304) {
            return new Boolean(super.a((d) objArr[0], (s) objArr[1]));
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public a() {
        emu.a("com.taobao.android.detail.core.aura.widget.AliDetailHandleDinamicXEventHandler");
    }

    @Override // tb.axe, tb.aru
    public boolean a(d dVar, s sVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("673e7098", new Object[]{this, dVar, sVar})).booleanValue();
        }
        Object[] e = dVar.e();
        if (e != null && e.length != 0) {
            Object obj = e[0];
            if (obj instanceof String) {
                return super.a(dVar, sVar);
            }
            if (obj instanceof JSONArray) {
                a((JSONArray) obj, dVar, sVar);
                return true;
            }
        }
        return false;
    }

    private void a(JSONArray jSONArray, d dVar, s sVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4badebbc", new Object[]{this, jSONArray, dVar, sVar});
            return;
        }
        Iterator<Object> it = jSONArray.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (next instanceof JSONObject) {
                JSONObject jSONObject = (JSONObject) next;
                String str = "type";
                if (StringUtils.isEmpty(jSONObject.getString(str))) {
                    str = "key";
                }
                String string = jSONObject.getString(str);
                String str2 = "fields";
                if (jSONObject.getJSONObject(str2) == null) {
                    str2 = "params";
                }
                JSONObject jSONObject2 = jSONObject.getJSONObject(str2);
                if (StringUtils.isEmpty(string)) {
                    arc.a().c("AliDetailHandleDinamicXEventHandler", "详情DX事件分发错误", "type为空");
                } else {
                    d dVar2 = new d(dVar);
                    dVar2.a(jSONObject2);
                    a(string, dVar2, sVar);
                }
            }
        }
    }
}
