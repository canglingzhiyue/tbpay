package com.taobao.desktop.channel.calendar.api;

import mtopsdk.common.util.StringUtils;
import com.alibaba.ability.e;
import com.alibaba.ability.result.ErrorResult;
import com.alibaba.ability.result.ExecuteResult;
import com.alibaba.ability.result.FinishResult;
import com.alibaba.ability.result.a$a;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.desktop.channel.calendar.api.a;
import java.util.HashMap;
import java.util.Map;
import tb.aln;
import tb.als;
import tb.kge;
import tb.khb;
import tb.khu;

/* loaded from: classes7.dex */
public class a implements com.alibaba.ability.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1816065241);
        kge.a(-948502777);
    }

    @Override // com.alibaba.ability.b
    public ExecuteResult execute(String str, als alsVar, Map<String, ?> map, aln alnVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecuteResult) ipChange.ipc$dispatch("a38490db", new Object[]{this, str, alsVar, map, alnVar});
        }
        try {
            khu.a("CalendarServiceAbility execute api: " + str + ", params: " + map);
            b.a(khb.a().b(), str, JSONObject.parseObject(JSON.toJSONString(map)), new AnonymousClass1(alnVar));
            return null;
        } catch (Throwable th) {
            khu.a("CalendarServiceAbility execute." + map + ".error: " + th.getMessage());
            return new ErrorResult(th.getMessage());
        }
    }

    /* renamed from: com.taobao.desktop.channel.calendar.api.a$1 */
    /* loaded from: classes7.dex */
    public class AnonymousClass1 implements d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a */
        public final /* synthetic */ aln f16940a;

        public static /* synthetic */ void lambda$D9jS_C4d0l4_hl_2n84mz9BtPDQ(aln alnVar, String str) {
            a(alnVar, str);
        }

        public static /* synthetic */ void lambda$nECW1h_7Dt6mAMLmsstEhEoM2VU(aln alnVar, String str) {
            b(alnVar, str);
        }

        public AnonymousClass1(aln alnVar) {
            a.this = r1;
            this.f16940a = alnVar;
        }

        @Override // com.taobao.desktop.channel.calendar.api.d
        public void a(final String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
                return;
            }
            final aln alnVar = this.f16940a;
            e.a(new Runnable() { // from class: com.taobao.desktop.channel.calendar.api.-$$Lambda$a$1$nECW1h_7Dt6mAMLmsstEhEoM2VU
                @Override // java.lang.Runnable
                public final void run() {
                    a.AnonymousClass1.lambda$nECW1h_7Dt6mAMLmsstEhEoM2VU(aln.this, str);
                }
            }, -1L);
        }

        public static /* synthetic */ void b(aln alnVar, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("36a0d520", new Object[]{alnVar, str});
            } else if (alnVar == null) {
            } else {
                if (StringUtils.isEmpty(str)) {
                    alnVar.a(new FinishResult());
                } else if (com.taobao.desktop.channel.calendar.a.f16939a.containsKey(str)) {
                    alnVar.a(new ErrorResult(com.taobao.desktop.channel.calendar.a.f16939a.get(str), str));
                } else {
                    HashMap hashMap = new HashMap(1);
                    hashMap.put("value", str);
                    alnVar.a(new FinishResult(hashMap));
                }
            }
        }

        @Override // com.taobao.desktop.channel.calendar.api.d
        public void b(final String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
                return;
            }
            final aln alnVar = this.f16940a;
            e.a(new Runnable() { // from class: com.taobao.desktop.channel.calendar.api.-$$Lambda$a$1$D9jS_C4d0l4_hl_2n84mz9BtPDQ
                @Override // java.lang.Runnable
                public final void run() {
                    a.AnonymousClass1.lambda$D9jS_C4d0l4_hl_2n84mz9BtPDQ(aln.this, str);
                }
            }, -1L);
        }

        public static /* synthetic */ void a(aln alnVar, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("21b80cdf", new Object[]{alnVar, str});
            } else if (alnVar == null) {
            } else {
                alnVar.a(a$a.a(str));
            }
        }
    }
}
