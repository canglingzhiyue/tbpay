package com.taobao.tao.powermsg.model;

import mtopsdk.common.util.StringUtils;
import android.util.Base64;
import com.alibaba.fastjson.JSONArray;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.taobao.tao.messagekit.core.model.BaseMessage;
import com.taobao.tao.messagekit.core.utils.MsgLog;
import com.taobao.tao.messagekit.core.utils.e;
import java.util.HashMap;
import java.util.Map;
import tb.kge;
import tb.njv;
import tb.njw;

/* loaded from: classes8.dex */
public class Message extends BaseMessage {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public njw.i body;
    public byte[] content;

    static {
        kge.a(-9755634);
    }

    public Message() {
    }

    public Message(BaseMessage baseMessage) {
        super(baseMessage);
        this.msgType = 3;
        this.sysCode = 1;
        this.type = 1;
        this.body = new njw.i();
    }

    public static Message create() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Message) ipChange.ipc$dispatch("e0b42a6", new Object[0]);
        }
        Message message = new Message();
        message.assemble();
        message.msgType = 3;
        message.sysCode = 1;
        message.type = 1;
        message.body = new njw.i();
        return message;
    }

    public static /* synthetic */ Object ipc$super(Message message, String str, Object... objArr) {
        if (str.hashCode() == -1749473057) {
            super.fromProtocol((njv) objArr[0]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.tao.messagekit.core.model.BaseMessage
    public byte[] bizToProtocol() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("972ab150", new Object[]{this});
        }
        byte[] bArr = this.content;
        return bArr != null ? bArr : new byte[0];
    }

    @Override // com.taobao.tao.messagekit.core.model.BaseMessage
    public byte[] bodyToProtocol() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("d8e964e1", new Object[]{this});
        }
        njw.i iVar = this.body;
        return iVar != null ? njw.i.toByteArray(iVar) : new byte[0];
    }

    @Override // com.taobao.tao.messagekit.core.model.BaseMessage, com.taobao.tao.messagekit.core.model.IProtocol
    public void fromProtocol(njv njvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97b928df", new Object[]{this, njvVar});
            return;
        }
        super.fromProtocol(njvVar);
        this.body = njw.i.a(e.b(njvVar));
        this.content = e.c(njvVar);
    }

    @Override // com.taobao.tao.messagekit.core.model.BaseMessage, com.taobao.tao.messagekit.core.model.IProtocol
    public Map<String, Object> toMap() {
        String[] strArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("2dd9d11d", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        try {
            hashMap.put("namespace", Integer.valueOf(this.bizCode));
            hashMap.put("topic", this.header.f31524a);
            hashMap.put("sendAll", Boolean.valueOf(this.body.d));
            JSONArray jSONArray = new JSONArray();
            for (String str : this.body.e) {
                if (!StringUtils.isEmpty(str)) {
                    jSONArray.add(str);
                }
            }
            hashMap.put("tagList", jSONArray.toString());
            hashMap.put("subType", Integer.valueOf(this.header.g));
            hashMap.put(RemoteMessageConst.MSGID, this.header.f);
            hashMap.put("qos", Integer.valueOf(this.qosLevel));
            hashMap.put("sdkVersion", "0.3.0");
            if (this.content != null) {
                hashMap.put("bizData", Base64.encodeToString(this.content, 0));
            }
        } catch (Exception e) {
            MsgLog.c("Message", e, new Object[0]);
        }
        return hashMap;
    }
}
