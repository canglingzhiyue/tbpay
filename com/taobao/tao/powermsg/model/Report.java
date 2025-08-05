package com.taobao.tao.powermsg.model;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.messagekit.core.model.BaseMessage;
import com.taobao.tao.messagekit.core.utils.e;
import java.util.HashMap;
import java.util.Map;
import tb.kge;
import tb.njv;
import tb.njw;
import tb.omg;

/* loaded from: classes8.dex */
public class Report extends BaseMessage {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public njw.k body;

    static {
        kge.a(281285709);
    }

    public Report() {
    }

    public Report(BaseMessage baseMessage, int i, String str, int i2) {
        super(baseMessage);
        this.msgType = 3;
        this.sysCode = 1;
        this.type = 6;
        this.body = new njw.k();
        this.body.b = baseMessage.header.g;
        this.body.c = i2;
        this.header.g = i;
        this.needACK = false;
        setBizTag(str);
        this.version = 1;
        this.serializeType = (byte) 1;
        this.typeVersion = (byte) 1;
        this.header.e = omg.d();
        this.header.d = "0.3.0";
        this.header.h = omg.f();
        this.header.i = omg.g();
        this.body.d = System.currentTimeMillis();
    }

    public static Report create() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Report) ipChange.ipc$dispatch("adf095b5", new Object[0]);
        }
        Report report = new Report();
        report.assemble();
        report.type = 6;
        report.msgType = 3;
        report.sysCode = 1;
        report.body = new njw.k();
        return report;
    }

    public static /* synthetic */ Object ipc$super(Report report, String str, Object... objArr) {
        if (str.hashCode() == -1749473057) {
            super.fromProtocol((njv) objArr[0]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.tao.messagekit.core.model.BaseMessage
    public byte[] bizToProtocol() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (byte[]) ipChange.ipc$dispatch("972ab150", new Object[]{this}) : new byte[0];
    }

    @Override // com.taobao.tao.messagekit.core.model.BaseMessage
    public byte[] bodyToProtocol() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("d8e964e1", new Object[]{this});
        }
        njw.k kVar = this.body;
        return kVar != null ? njw.k.toByteArray(kVar) : new byte[0];
    }

    @Override // com.taobao.tao.messagekit.core.model.BaseMessage, com.taobao.tao.messagekit.core.model.IProtocol
    public void fromProtocol(njv njvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97b928df", new Object[]{this, njvVar});
            return;
        }
        super.fromProtocol(njvVar);
        this.body = njw.k.a(e.b(njvVar));
    }

    public void setBizTag(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67dae25a", new Object[]{this, str});
        } else if (TextUtils.isEmpty(str)) {
        } else {
            this.body.f31519a = str;
        }
    }

    @Override // com.taobao.tao.messagekit.core.model.BaseMessage, com.taobao.tao.messagekit.core.model.IProtocol
    public Map<String, Object> toMap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("2dd9d11d", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        hashMap.put("namespace", Integer.valueOf(this.bizCode));
        hashMap.put("topic", this.header.f31524a);
        hashMap.put("biztag", this.body.f31519a);
        hashMap.put("messageid", this.header.f);
        hashMap.put("subtype", Integer.valueOf(this.header.g));
        hashMap.put("presubtype", Integer.valueOf(this.body.b));
        hashMap.put("source", Integer.valueOf(this.body.c));
        hashMap.put("sdkversion", "0.3.0");
        hashMap.put("timestamp", Long.valueOf(this.createTime));
        return hashMap;
    }
}
