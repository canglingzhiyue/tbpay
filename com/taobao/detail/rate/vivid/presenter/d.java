package com.taobao.detail.rate.vivid.presenter;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.image.ImageStrategyConfig;
import com.taobao.tao.util.ImageStrategyDecider;
import kotlin.Metadata;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import tb.fxr;
import tb.kio;
import tb.rwf;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0002J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002J \u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0004H\u0002J\u000e\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0013R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/taobao/detail/rate/vivid/presenter/UserImagePreloadPresenter;", "", "()V", "preLoadFeedListSize", "", "preLoadItemPicSize", "getRealSize", "currentIndex", "size", "onPreloadHeadPic", "", "headPic", "", "onPreloadPic", "thumbnail", "height", "width", "preLoadImage", "data", "Lcom/alibaba/fastjson/JSONObject;", "Companion", "tb_rate_display_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes7.dex */
public final class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    private int f17050a = kio.INSTANCE.x();
    private int b = kio.INSTANCE.y();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/taobao/detail/rate/vivid/presenter/UserImagePreloadPresenter$Companion;", "", "()V", "HEAD_PIC_SIZE", "", "tb_rate_display_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes7.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }
    }

    private final int a(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5c1152bb", new Object[]{this, new Integer(i), new Integer(i2)})).intValue();
        }
        if (i2 == 1) {
            return 600;
        }
        if (i2 == 2) {
            return 460;
        }
        return (i2 == 3 && i == 1) ? 600 : 320;
    }

    public final void a(JSONObject data) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, data});
            return;
        }
        q.d(data, "data");
        JSONArray jSONArray = data.getJSONArray("rateList");
        if (jSONArray == null || jSONArray.isEmpty()) {
            return;
        }
        int d = rwf.d(this.f17050a, jSONArray.size());
        for (int i = 0; i < d; i++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            String headPicUrl = fxr.a("headPicUrl", jSONObject, "");
            if (!StringUtils.isEmpty(headPicUrl)) {
                q.b(headPicUrl, "headPicUrl");
                a(headPicUrl);
            }
            JSONArray jSONArray2 = jSONObject.getJSONArray("feedPicList");
            if (jSONArray2 != null && !jSONArray.isEmpty()) {
                int size = jSONArray2.size();
                int min = Math.min(this.b, size);
                for (int i2 = 0; i2 < min; i2++) {
                    Object obj = jSONArray2.get(i2);
                    if (obj == null) {
                        throw new NullPointerException("null cannot be cast to non-null type com.alibaba.fastjson.JSONObject");
                    }
                    String thumbnail = fxr.a("thumbnail", (JSONObject) obj, "");
                    if (!StringUtils.isEmpty(thumbnail)) {
                        int a2 = a(i2, size);
                        q.b(thumbnail, "thumbnail");
                        a(thumbnail, a2, a2);
                    }
                }
                continue;
            }
        }
    }

    private final void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            com.taobao.phenix.intf.b.h().a(str).fetch();
        }
    }

    private final void a(String str, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3526812", new Object[]{this, str, new Integer(i), new Integer(i2)});
            return;
        }
        ImageStrategyConfig a2 = ImageStrategyConfig.a("default").a(i2).b(i).c(true).d(true).a();
        q.b(a2, "ImageStrategyConfig.newB…forceWebPOn(true).build()");
        String decideUrl = ImageStrategyDecider.decideUrl(str, Integer.valueOf(i2), Integer.valueOf(i), a2);
        q.b(decideUrl, "ImageStrategyDecider.dec…l, width, height, config)");
        com.taobao.phenix.intf.b.h().a(decideUrl).fetch();
    }
}
