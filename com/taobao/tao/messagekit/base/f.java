package com.taobao.tao.messagekit.base;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.messagekit.core.model.Ack;
import com.taobao.tao.messagekit.core.utils.MsgLog;
import com.taobao.taolive.sdk.model.message.PowerMsgType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import tao.reactivex.j;
import tb.jdz;
import tb.kge;

/* loaded from: classes8.dex */
public class f {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private HashMap<String, HashMap<String, a>> f20754a = new HashMap<>();

    /* loaded from: classes8.dex */
    public static class a implements j<com.taobao.tao.messagekit.core.model.b> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public com.taobao.tao.messagekit.core.model.b f20755a;
        public jdz b;

        static {
            kge.a(-6097843);
            kge.a(-605775859);
        }

        public a(com.taobao.tao.messagekit.core.model.b bVar) {
            this.f20755a = bVar;
        }

        private void b(com.taobao.tao.messagekit.core.model.b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7507e76c", new Object[]{this, bVar});
                return;
            }
            jdz jdzVar = this.b;
            if (jdzVar != null) {
                jdzVar.b_();
            }
            tao.reactivex.e.a(bVar).b(d.a().d());
            long currentTimeMillis = System.currentTimeMillis();
            com.taobao.tao.messagekit.core.model.b bVar2 = this.f20755a;
            bVar2.g = currentTimeMillis - bVar2.g;
            com.taobao.tao.messagekit.core.model.b bVar3 = this.f20755a;
            bVar3.h = currentTimeMillis - bVar3.f20780a.createTime();
            com.taobao.tao.messagekit.core.utils.d.a(this.f20755a);
        }

        public void a(com.taobao.tao.messagekit.core.model.b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("da6724eb", new Object[]{this, bVar});
            } else if (bVar == null) {
            } else {
                Ack ack = (Ack) bVar.f20780a;
                int statusCode = ack.statusCode();
                if (statusCode == -30000) {
                    if (!ack.needACK()) {
                        ack.setStatus(1000);
                    }
                    MsgLog.a("ResponseManager", "dataId:", bVar.c, "msgId:", ack.getID(), "status:", Integer.valueOf(ack.statusCode()), "topic:", ack.topic());
                } else if (statusCode == 1000) {
                    this.f20755a.f += bVar.f;
                    tao.reactivex.e.a(bVar).b(d.a().d());
                    b(bVar);
                    MsgLog.a("ResponseManager", "dataId:", bVar.c, "msgId:", ack.getID(), "status:", Integer.valueOf(ack.statusCode()), "topic:", ack.topic());
                }
                d.a().g().a(bVar.c, bVar.f20780a.getID());
                b(bVar);
                MsgLog.a("ResponseManager", "dataId:", bVar.c, "msgId:", ack.getID(), "status:", Integer.valueOf(ack.statusCode()), "topic:", ack.topic());
            }
        }

        @Override // tao.reactivex.j
        public void onComplete() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5cbffcbf", new Object[]{this});
            }
        }

        @Override // tao.reactivex.j
        public void onError(Throwable th) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cf54aa85", new Object[]{this, th});
            } else if (d.a().g().a(this.f20755a.c, this.f20755a.f20780a.getID()) == null) {
            } else {
                com.taobao.tao.messagekit.core.model.b bVar = new com.taobao.tao.messagekit.core.model.b(this.f20755a);
                Ack ack = new Ack(this.f20755a.f20780a);
                ack.setStatus(PowerMsgType.TIMEOUT);
                bVar.f20780a = ack;
                tao.reactivex.e.a(bVar).b(d.a().d());
                MsgLog.a("ResponseManager", "timeout:", Integer.valueOf(ack.statusCode()), "topic:", ack.topic());
            }
        }

        @Override // tao.reactivex.j
        public /* synthetic */ void onNext(com.taobao.tao.messagekit.core.model.b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b4b8495", new Object[]{this, bVar});
            } else {
                a(bVar);
            }
        }

        @Override // tao.reactivex.j
        public void onSubscribe(jdz jdzVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("940fff22", new Object[]{this, jdzVar});
            } else {
                this.b = jdzVar;
            }
        }
    }

    static {
        kge.a(306387950);
    }

    public synchronized a a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("6ab00ba4", new Object[]{this, str, str2});
        }
        MsgLog.a("ResponseManager", "pop:", str, "msgId:", str2);
        if (StringUtils.isEmpty(str)) {
            for (HashMap<String, a> hashMap : this.f20754a.values()) {
                a remove = hashMap.remove(str2);
                if (remove != null) {
                    return remove;
                }
            }
        } else {
            HashMap<String, a> hashMap2 = this.f20754a.get(str);
            if (hashMap2 != null) {
                return hashMap2.remove(str2);
            }
        }
        return null;
    }

    public synchronized ArrayList<a> a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("7153230c", new Object[]{this, str});
        }
        HashMap<String, a> hashMap = this.f20754a.get(str);
        if (hashMap != null) {
            return new ArrayList<>(hashMap.values());
        }
        return new ArrayList<>(0);
    }

    public synchronized void a(String str, com.taobao.tao.messagekit.core.model.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d777f2b5", new Object[]{this, str, bVar});
            return;
        }
        String id = bVar.f20780a.getID();
        HashMap<String, a> hashMap = this.f20754a.get(str);
        if (hashMap == null) {
            HashMap<String, HashMap<String, a>> hashMap2 = this.f20754a;
            HashMap<String, a> hashMap3 = new HashMap<>();
            hashMap2.put(str, hashMap3);
            hashMap = hashMap3;
        }
        a aVar = new a(bVar);
        tao.reactivex.e.a((Throwable) new Exception()).c(bVar.l, TimeUnit.SECONDS).b(aVar);
        a put = hashMap.put(id, aVar);
        if (put != null && put.b != null) {
            put.b.b_();
        }
        MsgLog.a("ResponseManager", "record:", str, "msgId:", bVar.f20780a.getID(), "topic:", bVar.f20780a.topic());
    }
}
