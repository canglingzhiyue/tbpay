package com.taobao.tao.messagekit.base;

import android.support.v4.util.ArrayMap;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.messagekit.core.model.AccsConnInfo;
import com.taobao.tao.messagekit.core.model.Ack;
import com.taobao.tao.messagekit.core.utils.MsgLog;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.android.agoo.common.AgooConstants;
import tb.dck;
import tb.jew;
import tb.kge;
import tb.njw;
import tb.olt;

/* loaded from: classes8.dex */
public class a implements jew<com.taobao.tao.messagekit.core.model.b> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private ConcurrentHashMap<String, com.taobao.tao.messagekit.core.model.a> f20747a = new ConcurrentHashMap<>();

    static {
        kge.a(-700628118);
        kge.a(1964946585);
    }

    public void a(com.taobao.tao.messagekit.core.model.b bVar) {
        njw.n nVar;
        Object obj;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da6724eb", new Object[]{this, bVar});
        } else if (bVar.f20780a instanceof AccsConnInfo) {
            MsgLog.a("CallbackManager", "callback AccsConnInfo, ignore");
        } else {
            ArrayMap arrayMap = new ArrayMap(10);
            arrayMap.put("mqtt_type", Integer.valueOf(((Ack) bVar.f20780a).msgType));
            arrayMap.put("msg_type", Integer.valueOf(((Ack) bVar.f20780a).type()));
            arrayMap.put("sub_type", Integer.valueOf(((Ack) bVar.f20780a).header.g));
            arrayMap.put("type", Integer.valueOf(((Ack) bVar.f20780a).header.g));
            arrayMap.put(AgooConstants.MESSAGE_BODY, ((Ack) bVar.f20780a).body);
            arrayMap.put("data", ((Ack) bVar.f20780a).data);
            arrayMap.put("context", bVar.n);
            if (((Ack) bVar.f20780a).msgType != 9) {
                if (olt.b() && ((Ack) bVar.f20780a).msgType == 8 && (nVar = (njw.n) ((Ack) bVar.f20780a).data) != null) {
                    arrayMap.put(dck.COL_STREAM, nVar.h);
                    obj = nVar.i;
                    str = "stream_seq";
                }
                a(((Ack) bVar.f20780a).header.f, ((Ack) bVar.f20780a).statusCode(), arrayMap);
                MsgLog.a("CallbackManager", "callback:", Integer.valueOf(((Ack) bVar.f20780a).statusCode()), ((Ack) bVar.f20780a).header.f, "subType:", Integer.valueOf(((Ack) bVar.f20780a).header.g));
            }
            obj = ((Ack) bVar.f20780a).header.n;
            str = "systemExt";
            arrayMap.put(str, obj);
            a(((Ack) bVar.f20780a).header.f, ((Ack) bVar.f20780a).statusCode(), arrayMap);
            MsgLog.a("CallbackManager", "callback:", Integer.valueOf(((Ack) bVar.f20780a).statusCode()), ((Ack) bVar.f20780a).header.f, "subType:", Integer.valueOf(((Ack) bVar.f20780a).header.g));
        }
    }

    public boolean a(String str, int i, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7a6e4a58", new Object[]{this, str, new Integer(i), map})).booleanValue();
        }
        MsgLog.a("CallbackManager", "callback:", Integer.valueOf(i), str);
        if (str == null) {
            return false;
        }
        if (i == 1000) {
            com.taobao.tao.messagekit.core.utils.d.a("MKT", "MKT_MSG_RATE");
        } else {
            com.taobao.tao.messagekit.core.utils.d.a("MKT", "MKT_MSG_RATE", "" + i, (String) null);
        }
        com.taobao.tao.messagekit.core.model.a aVar = this.f20747a.get(str);
        if (aVar != null) {
            aVar.a(i, map);
            this.f20747a.remove(str);
        }
        return true;
    }

    public boolean a(String str, com.taobao.tao.messagekit.core.model.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d7777e5a", new Object[]{this, str, aVar})).booleanValue();
        }
        if (aVar == null) {
            return false;
        }
        this.f20747a.put(str, aVar);
        return true;
    }

    @Override // tb.jew
    public /* synthetic */ void accept(com.taobao.tao.messagekit.core.model.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b028bfab", new Object[]{this, bVar});
        } else {
            a(bVar);
        }
    }
}
