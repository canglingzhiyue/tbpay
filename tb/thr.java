package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.mobile.auth.gatewayauth.Constant;
import com.taobao.android.litecreator.util.u;
import com.taobao.detail.rate.widget.DisplayVideoViewV2;
import com.taobao.tbpoplayer.nativerender.l;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.p;
import kotlin.jvm.internal.q;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\rJ\u000e\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0004J\u0006\u0010\u0016\u001a\u00020\u0017J\u0006\u0010\u0018\u001a\u00020\u0017J\u0006\u0010\u0019\u001a\u00020\u0017J\u000e\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\rR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR!\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\r0\fj\b\u0012\u0004\u0012\u00020\r`\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, d2 = {"Lcom/taobao/detail/rate/vivid/manager/RecyclerScrollStatusManager;", "", "()V", "DX_RECYCLER_LAYOUT_SCROLL_STATE_BEGIN", "", "DX_RECYCLER_LAYOUT_SCROLL_STATE_END", l.TRIGGER_NAME_SCROLL_STATUS, "getScrollStatus", "()Ljava/lang/String;", "setScrollStatus", "(Ljava/lang/String;)V", "videoCache", "Ljava/util/ArrayList;", "Lcom/taobao/detail/rate/widget/DisplayVideoViewV2;", "Lkotlin/collections/ArrayList;", "getVideoCache", "()Ljava/util/ArrayList;", "addCanPlayVideo", "", "video", "changeScrollState", "state", Constant.API_PARAMS_KEY_ENABLE, "", "isScrollBegin", "isScrollEnd", "removeShouldStopVideo", "tb_rate_display_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes7.dex */
public final class thr {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DX_RECYCLER_LAYOUT_SCROLL_STATE_BEGIN = "onScrollBegin";
    public static final thr INSTANCE = new thr();
    public static final String DX_RECYCLER_LAYOUT_SCROLL_STATE_END = "onScrollEnd";

    /* renamed from: a  reason: collision with root package name */
    private static String f34098a = DX_RECYCLER_LAYOUT_SCROLL_STATE_END;
    private static final ArrayList<DisplayVideoViewV2> b = new ArrayList<>();

    private thr() {
    }

    public final boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        boolean z = xkm.INSTANCE.c() && (kjp.INSTANCE.b() || kjp.INSTANCE.a());
        String a2 = kin.INSTANCE.a();
        u.d(a2, "video control append = " + z);
        return z;
    }

    public final boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : a() && TextUtils.equals(DX_RECYCLER_LAYOUT_SCROLL_STATE_END, f34098a);
    }

    public final void a(DisplayVideoViewV2 video) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d38eb2f6", new Object[]{this, video});
            return;
        }
        q.d(video, "video");
        b.add(video);
    }

    public final void b(DisplayVideoViewV2 video) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fce30837", new Object[]{this, video});
            return;
        }
        q.d(video, "video");
        b.remove(video);
    }

    public final void a(String state) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, state});
            return;
        }
        q.d(state, "state");
        if (!a()) {
            return;
        }
        f34098a = state;
        if (!b() || b.size() <= 0) {
            return;
        }
        ((DisplayVideoViewV2) p.j((List<? extends Object>) b)).dealPlayVideo();
        b.clear();
    }
}
