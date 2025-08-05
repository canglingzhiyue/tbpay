package com.taobao.mytaobao.ultron.event;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.message.biz.contacts.MessageBoxService;
import com.taobao.message.kit.core.GlobalContainer;
import tb.fuf;
import tb.kge;

/* loaded from: classes7.dex */
public class k extends fuf {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_GETUNREADMSGCOUNT = 6515486422507271648L;

    static {
        kge.a(1169684008);
    }

    @Override // tb.fuf, tb.fut
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (objArr == null) {
            return null;
        }
        MessageBoxService messageBoxService = (MessageBoxService) GlobalContainer.getInstance().get(MessageBoxService.class);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("tipType", (Object) String.valueOf(messageBoxService.getUnreadInfo().getTipType()));
        jSONObject.put("tipNumber", (Object) String.valueOf(messageBoxService.getUnreadInfo().getTipNumber()));
        return jSONObject.toString();
    }
}
