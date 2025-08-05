package com.taobao.android.live.plugin.atype.flexalocal.smartlanding.strategy;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.common.Constants;
import com.taobao.android.live.plugin.atype.flexalocal.smartlanding.business.SmartLandingTask;
import com.taobao.android.live.plugin.atype.flexalocal.smartlanding.strategy.MemoryLog;
import com.taobao.taolive.sdk.utils.l;
import com.taobao.taolive.sdk.utils.q;
import com.taobao.weex.common.Constants;
import tb.kge;
import tb.pmd;

/* loaded from: classes6.dex */
public class d extends MemoryLog {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final String b;
    private String c;

    public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1907019348) {
            super.c((SmartLandingTask) objArr[0]);
            return null;
        } else if (hashCode != 90991720) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.a();
            return null;
        }
    }

    static {
        kge.a(1675397702);
        b = d.class.getSimpleName();
    }

    public d(String str, String str2) {
        super(str2);
        this.c = str;
        b();
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.smartlanding.strategy.MemoryLog, com.taobao.android.live.plugin.atype.flexalocal.smartlanding.strategy.c
    public void c(SmartLandingTask smartLandingTask) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e5531ac", new Object[]{this, smartLandingTask});
            return;
        }
        super.c(smartLandingTask);
        c();
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        try {
            String a2 = a.a(pmd.a().u().c(), this.c);
            if (l.e(a2)) {
                return;
            }
            JSONObject parseObject = JSON.parseObject(a2);
            for (String str : parseObject.keySet()) {
                JSONObject jSONObject = parseObject.getJSONObject(str);
                if (jSONObject != null) {
                    MemoryLog.LogItem logItem = new MemoryLog.LogItem();
                    logItem.times = jSONObject.getIntValue(Constants.KEY_TIMES);
                    logItem.interval = jSONObject.getLongValue(Constants.Name.INTERVAL);
                    this.f14019a.put(str, logItem);
                }
            }
        } catch (Exception e) {
            q.a(b, "loadData exp", e);
        }
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        try {
            a.a(pmd.a().u().c(), this.c, JSON.toJSONString(this.f14019a));
        } catch (Exception e) {
            q.a(b, "saveData exp.", e);
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.smartlanding.strategy.MemoryLog
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        super.a();
        try {
            a.a(pmd.a().u().c(), this.c, "");
        } catch (Exception e) {
            q.a(b, "clearCache exp", e);
        }
    }
}
