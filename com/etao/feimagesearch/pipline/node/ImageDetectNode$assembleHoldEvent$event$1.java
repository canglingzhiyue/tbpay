package com.etao.feimagesearch.pipline.node;

import android.os.SystemClock;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import java.util.concurrent.Future;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.q;
import tb.crj;
import tb.crl;
import tb.cro;
import tb.crq;
import tb.ruk;

/* loaded from: classes3.dex */
public final class ImageDetectNode$assembleHoldEvent$event$1 extends Lambda implements ruk<crl> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ crq $pipLineDS;
    public final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageDetectNode$assembleHoldEvent$event$1(b bVar, crq crqVar) {
        super(0);
        this.this$0 = bVar;
        this.$pipLineDS = crqVar;
    }

    @Override // tb.ruk
    /* renamed from: invoke  reason: collision with other method in class */
    public final crl mo2427invoke() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (crl) ipChange.ipc$dispatch("3b34766a", new Object[]{this});
        }
        cro croVar = new cro();
        b bVar = this.this$0;
        Future future = b.$ipChange;
        String str = "";
        if (future != null) {
            Map<String, String> map = (Map) future.get();
            this.this$0.a("watermarkResult", JSONObject.toJSONString(map));
            this.this$0.a("watermarkTime", String.valueOf(SystemClock.elapsedRealtime() - this.this$0.b()));
            if (map == null) {
                q.a();
            }
            String str2 = map.get("watermark");
            if (str2 == null) {
                str2 = str;
            }
            if (q.a((Object) "true", (Object) str2)) {
                com.etao.feimagesearch.newresult.perf.a.c(true);
                croVar.b(map);
                this.$pipLineDS.d(map);
                this.this$0.d();
                return this.this$0.a(croVar);
            }
        }
        b bVar2 = this.this$0;
        Future future2 = b.$ipChange;
        if (future2 != null) {
            Map<String, String> map2 = (Map) future2.get();
            this.this$0.a("videoWatermarkTime", JSONObject.toJSONString(map2));
            this.this$0.a("videoWatermarkTime", String.valueOf(SystemClock.elapsedRealtime() - this.this$0.b()));
            if (map2 == null) {
                q.a();
            }
            String str3 = map2.get("watermark");
            if (str3 != null) {
                str = str3;
            }
            if (q.a((Object) "true", (Object) str)) {
                com.etao.feimagesearch.newresult.perf.a.c(true);
                croVar.c(map2);
                this.$pipLineDS.e(map2);
                this.this$0.d();
                return this.this$0.a(croVar);
            }
        }
        this.this$0.d();
        return crj.a(this.this$0, -1, "No Detect Result", false, 4, null);
    }
}
