package com.taobao.tao.powermsg.common;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.messagekit.core.model.BaseMessage;
import com.taobao.tao.powermsg.model.MessageFrame;
import java.util.ArrayList;
import java.util.List;
import tb.kge;
import tb.njw;
import tb.njx;

/* loaded from: classes8.dex */
public class PowerMessage {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public int bizCode;
    public byte[] data;
    public List<a> dataList;
    public String from;
    public StreamFullLinkMonitor fullLink;
    public int fullLinkFlag;
    public String messageId;
    public boolean needAck;
    public long pmDownTime;
    public int priority;
    public int qosLevel;
    public boolean sendFullTags;
    public long seqNum;
    public int sourceType;
    public String streamId;
    public String[] tags;
    public long timestamp;
    public String to;
    public String topic;
    public int type = -1;
    public String userId;

    /* loaded from: classes8.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private String f20835a;
        private byte[] b;

        static {
            kge.a(128980412);
        }

        public String a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.f20835a;
        }

        public void a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            } else {
                this.f20835a = str;
            }
        }

        public void a(byte[] bArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c19672f", new Object[]{this, bArr});
            } else {
                this.b = bArr;
            }
        }

        public byte[] b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (byte[]) ipChange.ipc$dispatch("a9d5fa14", new Object[]{this}) : this.b;
        }
    }

    static {
        kge.a(-1294946221);
    }

    public static String safeToString(PowerMessage powerMessage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("29c80e72", new Object[]{powerMessage});
        }
        if (powerMessage == null) {
            return "";
        }
        return "topic= " + powerMessage.topic + " messageid" + powerMessage.messageId + " bizCode=" + powerMessage.bizCode + " type=" + powerMessage.type;
    }

    public void copyStreamFromPackage(com.taobao.tao.messagekit.core.model.b<BaseMessage> bVar) {
        njw.g[] gVarArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33ec6631", new Object[]{this, bVar});
            return;
        }
        try {
            njx.a aVar = bVar.f20780a.header;
            if (aVar == null || TextUtils.isEmpty(aVar.p)) {
                return;
            }
            this.streamId = aVar.p;
            this.seqNum = aVar.o;
            this.pmDownTime = bVar.j;
            this.fullLink = bVar.p;
            if (!(bVar.f20780a instanceof MessageFrame) || (gVarArr = ((MessageFrame) bVar.f20780a).frame.f31514a) == null || gVarArr.length <= 0) {
                return;
            }
            if (this.dataList == null) {
                this.dataList = new ArrayList();
            }
            for (njw.g gVar : gVarArr) {
                a aVar2 = new a();
                aVar2.a(gVar.f31515a);
                aVar2.a(gVar.c);
                this.dataList.add(aVar2);
            }
        } catch (Throwable unused) {
        }
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (TextUtils.isEmpty(this.streamId) || !(obj instanceof PowerMessage)) {
            return super.equals(obj);
        }
        PowerMessage powerMessage = (PowerMessage) obj;
        return this.streamId.equals(powerMessage.streamId) && this.seqNum == powerMessage.seqNum;
    }

    public void fromData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da05c0fb", new Object[]{this});
        }
    }

    public void toData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("695e56cc", new Object[]{this});
        }
    }
}
