package com.tmall.android.dai.trigger.protocol;

import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.tmall.android.dai.trigger.EventProcessResult;
import com.tmall.android.dai.trigger.TriggerMatchResult;
import tb.gsd;
import tb.kge;
import tb.rlh;
import tb.rln;

/* loaded from: classes9.dex */
public abstract class a<Source, SinkInput, Sink extends rln<SinkInput>> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f23730a;
    public rlh<Source> b;
    public Sink c;

    static {
        kge.a(2036847993);
    }

    public abstract String a();

    public abstract SinkInput c(Source source);

    public EventProcessResult a(Source source) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return (EventProcessResult) ipChange.ipc$dispatch("e94fdf60", new Object[]{this, source});
        }
        String a2 = a();
        TriggerMatchResult a3 = this.b.a(source);
        if (a2 == null || !gsd.a().a(a2)) {
            z = false;
        }
        if (a3.f23726a) {
            if (z) {
                com.taobao.mrt.utils.a.b(com.tmall.android.dai.trigger.c.TAG, "modelName " + a2 + "matched success");
            }
            this.c.a(c(source));
            return EventProcessResult.RESULT_COMPLETE;
        }
        if (z && a3.b()) {
            com.taobao.mrt.utils.a.b(com.tmall.android.dai.trigger.c.TAG, "mach failed modelName " + a2 + " onEvent: " + b(source) + "pattern:" + a((rlh) this.b) + " triggermatchresult: " + JSON.toJSONString(a3));
        }
        return EventProcessResult.RESULT_IGNORE;
    }

    public String b(Source source) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e17923bb", new Object[]{this, source}) : String.valueOf(source);
    }

    public String a(rlh<Source> rlhVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("95394736", new Object[]{this, rlhVar}) : rlhVar.toString();
    }

    public a(String str, rlh<Source> rlhVar, Sink sink, String str2) {
        this.f23730a = str;
        this.b = rlhVar;
        this.c = sink;
    }
}
