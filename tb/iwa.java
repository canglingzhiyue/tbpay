package tb;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010J \u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0006H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\n\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/taobao/detail/rate/util/track/RateListImageLoadedTarget;", "", "feedList", "Lcom/alibaba/fastjson/JSONArray;", "(Lcom/alibaba/fastjson/JSONArray;)V", "currentTargetHeadPicSize", "", "currentTargetUserPicSize", "targetHeadPicSize", "targetUserPicSize", "topRateLength", "getTopRateLength", "()I", "checkMeetTargetCondition", "", "imageBean", "Lcom/taobao/detail/rate/util/track/ImageLoadedSubStageBean;", "getTargetPicCount", "", "jsonArray", com.taobao.android.weex_framework.util.a.ATOM_length, "minTargetSize", "Companion", "tb_rate_display_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes7.dex */
public final class iwa {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    private int f29352a;
    private int b;
    private final int c;
    private int d;
    private int e;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/taobao/detail/rate/util/track/RateListImageLoadedTarget$Companion;", "", "()V", "DEFAULT_USER_PROFILE_PIC_SIZE", "", "tb_rate_display_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes7.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }
    }

    public iwa(JSONArray feedList) {
        q.d(feedList, "feedList");
        int x = kio.INSTANCE.x();
        this.c = x;
        a(feedList, x, kio.INSTANCE.y());
    }

    public final int a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue() : this.c;
    }

    private final void a(JSONArray jSONArray, int i, int i2) {
        JSONObject jSONObject;
        JSONArray jSONArray2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c099e1f0", new Object[]{this, jSONArray, new Integer(i), new Integer(i2)});
            return;
        }
        int d = rwf.d(i, jSONArray.size());
        int i3 = 0;
        for (int i4 = 0; i4 < d; i4++) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i4);
            JSONArray jSONArray3 = jSONObject2.getJSONArray("feedPicList");
            i3 += (jSONArray3 != null ? jSONArray3.size() : 0) + ((!jSONObject2.containsKey("appendedFeed") || (jSONObject = jSONObject2.getJSONObject("appendedFeed")) == null || !jSONObject.containsKey("appendFeedPicList") || (jSONArray2 = jSONObject.getJSONArray("appendFeedPicList")) == null) ? 0 : jSONArray2.size());
            if (i4 == 0 && jSONObject2.containsKey("video") && i3 > 0) {
                i3--;
            }
        }
        if (i3 == 0) {
            this.f29352a = 0;
            this.b = i;
        } else {
            this.f29352a = rwf.d(i3, i2);
            this.b = 1;
        }
        this.d = this.f29352a;
        this.e = this.b;
    }

    public final boolean a(ivx ivxVar) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ee782a11", new Object[]{this, ivxVar})).booleanValue();
        }
        if (ivxVar != null && (str = ivxVar.f29349a) != null) {
            int hashCode = str.hashCode();
            if (hashCode == 3198432) {
                if (str.equals(ivx.IMAGE_TYPE_HEAD)) {
                    this.e--;
                }
            } else if (hashCode == 3599307 && str.equals("user")) {
                this.d--;
            }
        }
        return this.e <= 0 && this.d <= 0;
    }
}
