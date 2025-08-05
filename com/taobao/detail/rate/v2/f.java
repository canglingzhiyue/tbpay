package com.taobao.detail.rate.v2;

import android.os.Bundle;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.util.at;
import com.taobao.android.litecreator.util.u;
import com.ut.mini.UTAnalytics;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import tb.kio;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u0000 \u001e2\u00020\u0001:\u0002\u001e\u001fB\u0005¢\u0006\u0002\u0010\u0002J$\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\bH\u0002J\b\u0010\u0014\u001a\u00020\u0006H\u0002J\u0010\u0010\u0015\u001a\u00020\u00102\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017J\u0006\u0010\u0018\u001a\u00020\u0019J\u0006\u0010\u001a\u001a\u00020\u0010J\u0006\u0010\u001b\u001a\u00020\u0010J\u0006\u0010\u001c\u001a\u00020\u0010J\u0006\u0010\u001d\u001a\u00020\u0010R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/taobao/detail/rate/v2/RateViewPerformanceTrackerV2;", "", "()V", "biz", "", "clickStartTimeMs", "", "commonArgs", "Lcom/alibaba/fastjson/JSONObject;", "firstFrameTimeMs", "fragmentCreateTimeMs", "fragmentResumeTimeMs", "navTimeMs", "tag", "viewItemGetTimeMs", "customerEvent", "", "arg2", "arg3", "custom", "getClickStartTime", "init", "bundle", "Landroid/os/Bundle;", "isFirstFrameCompleted", "", "setFirstFrameTimeMs", "setFragmentCreateTime", "setFragmentResumeTime", "setViewItemGetTimeMs", "Companion", "TrackerHolder", "tb_rate_display_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes7.dex */
public final class f {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    private final String f17028a = "RateViewPerformanceTracker";
    private final String b = "rate_preview_v2";
    private final JSONObject c = new JSONObject();
    private long d;
    private long e;
    private long f;
    private long g;
    private long h;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0001H\u0007¨\u0006\u0006"}, d2 = {"Lcom/taobao/detail/rate/v2/RateViewPerformanceTrackerV2$Companion;", "", "()V", "getInstance", "Lcom/taobao/detail/rate/v2/RateViewPerformanceTrackerV2;", "context", "tb_rate_display_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes7.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }
    }

    public final void a(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b668f6c", new Object[]{this, bundle});
            return;
        }
        long a2 = at.a(bundle != null ? bundle.getString("tagId") : null, 0L);
        if (a2 <= 0) {
            a2 = System.currentTimeMillis();
        }
        this.d = a2;
    }

    private final long e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5a4ca60", new Object[]{this})).longValue() : this.d;
    }

    public final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (this.e > 0) {
        } else {
            this.e = System.currentTimeMillis() - e();
            String str = this.f17028a;
            u.b(str, "fragmentCreateTimeMs: " + this.e);
            a(this, "process_" + this.b + "_FragmentCreate", String.valueOf(this.e), null, 4, null);
        }
    }

    public final void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (this.f > 0) {
        } else {
            this.f = System.currentTimeMillis() - e();
            String str = this.f17028a;
            u.b(str, "fragmentResumeTimeMs: " + this.f);
            a(this, "process_" + this.b + "_FragmentResume", String.valueOf(this.f), null, 4, null);
        }
    }

    public final void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else if (this.g > 0) {
        } else {
            this.g = System.currentTimeMillis() - e();
            String str = this.f17028a;
            u.b(str, "viewItemGetTimeMs: " + this.g);
            a(this, "process_" + this.b + "_ViewGet", String.valueOf(this.g), null, 4, null);
        }
    }

    public final void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else if (this.h > 0) {
        } else {
            this.h = System.currentTimeMillis() - e();
            String str = this.f17028a;
            u.b(str, "firstFrameTimeMs: " + this.h);
            if (this.h > kio.INSTANCE.z()) {
                return;
            }
            a(this, "first_frame_" + this.b, String.valueOf(this.h), null, 4, null);
        }
    }

    public static /* synthetic */ void a(f fVar, String str, String str2, JSONObject jSONObject, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f46ec65", new Object[]{fVar, str, str2, jSONObject, new Integer(i), obj});
            return;
        }
        if ((i & 4) != 0) {
            jSONObject = null;
        }
        fVar.a(str, str2, jSONObject);
    }

    private final void a(String str, String str2, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2bf4cf4", new Object[]{this, str, str2, jSONObject});
            return;
        }
        HashMap hashMap = new HashMap();
        for (String key : this.c.keySet()) {
            q.b(key, "key");
            String string = this.c.getString(key);
            q.b(string, "commonArgs.getString(key)");
            hashMap.put(key, string);
        }
        if (jSONObject != null) {
            for (String key2 : jSONObject.keySet()) {
                q.b(key2, "key");
                String string2 = jSONObject.getString(key2);
                q.b(string2, "custom.getString(key)");
                hashMap.put(key2, string2);
            }
        }
        UTOriginalCustomHitBuilder uTOriginalCustomHitBuilder = new UTOriginalCustomHitBuilder("rate_performance", 2201, "rate_cost", str, str2, hashMap);
        UTAnalytics uTAnalytics = UTAnalytics.getInstance();
        q.b(uTAnalytics, "UTAnalytics.getInstance()");
        uTAnalytics.getDefaultTracker().send(uTOriginalCustomHitBuilder.build());
    }
}
