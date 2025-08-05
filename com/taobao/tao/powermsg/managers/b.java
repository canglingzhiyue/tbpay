package com.taobao.tao.powermsg.managers;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.messagekit.core.model.Monitor;
import com.taobao.tao.messagekit.core.utils.MsgLog;
import java.util.List;
import tb.jdz;
import tb.jew;
import tb.kge;

/* loaded from: classes8.dex */
public class b extends com.taobao.tao.messagekit.base.monitor.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final int f20842a = 5000;

    static {
        kge.a(630665646);
    }

    @Override // tb.olw
    public int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue();
        }
        return 2;
    }

    @Override // com.taobao.tao.messagekit.base.monitor.a
    public com.taobao.tao.messagekit.base.monitor.b a(long j, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.tao.messagekit.base.monitor.b) ipChange.ipc$dispatch("80ea1426", new Object[]{this, new Long(j), str, str2});
        }
        JSONObject parseObject = JSON.parseObject(str2);
        if (parseObject == null) {
            return null;
        }
        com.taobao.tao.powermsg.model.a aVar = new com.taobao.tao.powermsg.model.a(str, parseObject.getIntValue("type"), parseObject.getIntValue("bizCode"), parseObject.getString("topic"), parseObject.getString(com.taobao.tao.powermsg.model.a.COL_BTAG), parseObject.getIntValue("code"), parseObject.getIntValue("mode"));
        aVar.f = parseObject.getIntValue("source");
        aVar.h = parseObject.getString(com.taobao.tao.powermsg.model.a.COL_TASK);
        aVar.j = parseObject.getLong("time").longValue();
        aVar.k = parseObject.getLong("mtopTime").longValue();
        aVar.l = parseObject.getLong(com.taobao.tao.powermsg.model.a.COL_S_TIME).longValue();
        aVar.m = parseObject.getIntValue(com.taobao.tao.powermsg.model.a.COL_MARK);
        aVar.n = j;
        return aVar;
    }

    @Override // com.taobao.tao.messagekit.base.monitor.a
    public void a(String str, List<com.taobao.tao.messagekit.base.monitor.b> list, final com.taobao.tao.messagekit.core.model.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b03be247", new Object[]{this, str, list, aVar});
        } else if (TextUtils.isEmpty(str)) {
            MsgLog.c(com.taobao.tao.messagekit.base.monitor.c.TAG, "reportAckByMtop data is empty");
        } else {
            final Monitor create = Monitor.create();
            create.setData(str);
            tao.reactivex.e.a(new com.taobao.tao.messagekit.core.model.b(create)).b(new jew<jdz>() { // from class: com.taobao.tao.powermsg.managers.b.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public void a(jdz jdzVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("ef304458", new Object[]{this, jdzVar});
                    } else {
                        com.taobao.tao.messagekit.base.d.a().e().a(create.header.f, aVar);
                    }
                }

                @Override // tb.jew
                public /* synthetic */ void accept(jdz jdzVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("b028bfab", new Object[]{this, jdzVar});
                    } else {
                        a(jdzVar);
                    }
                }
            }).b(com.taobao.tao.messagekit.base.d.a().b());
        }
    }

    @Override // com.taobao.tao.messagekit.base.monitor.a
    public int d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("596b2de", new Object[]{this})).intValue();
        }
        return 5000;
    }

    @Override // com.taobao.tao.messagekit.base.monitor.a
    public String g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d71944f2", new Object[]{this}) : com.taobao.tao.powermsg.model.a.COL_TASK;
    }
}
