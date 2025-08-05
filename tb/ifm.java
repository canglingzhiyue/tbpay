package tb;

import android.content.Context;
import android.os.MessageQueue;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.alibaba.android.ultron.vfw.viewholder.h;
import com.alibaba.android.ultron.vfw.weex2.highPerformance.management.a;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.tao.TBMainHost;
import java.util.Objects;
import tb.bed;

/* loaded from: classes2.dex */
public final class ifm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static long f28993a;
    private static String b;

    public static void a(final Context context, final String str, final JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("564cf206", new Object[]{context, str, jSONObject});
        } else if (context == null) {
        } else {
            jqh.a(new MessageQueue.IdleHandler() { // from class: tb.ifm.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.os.MessageQueue.IdleHandler
                public boolean queueIdle() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("b5e69690", new Object[]{this})).booleanValue();
                    }
                    try {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("context", (Object) context);
                        if (jSONObject != null) {
                            jSONObject2.putAll(jSONObject);
                        }
                        a.a().a(str, "tabCart", jSONObject2);
                    } catch (Exception e) {
                        bed.a("notifyStageChangedException", e.getMessage());
                    }
                    return false;
                }
            });
        }
    }

    public static void a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61b6362a", new Object[]{context, str});
        } else {
            a(context, str, (JSONObject) null);
        }
    }

    public static void a(bbz bbzVar, RecyclerView recyclerView, int i) {
        View childAt;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30848f7", new Object[]{bbzVar, recyclerView, new Integer(i)});
            return;
        }
        try {
            int childCount = recyclerView.getChildCount();
            if (childCount <= 0 || (childAt = recyclerView.getChildAt(childCount - 1)) == null || childAt.getId() != i) {
                return;
            }
            boolean z = TBMainHost.a().getContext() == bbzVar.m();
            bex.c(bbzVar, "Page_ShoppingCart_LoadMore_Exposure", "isMain=" + z);
            bed.a("loadMoreExposure", "加载更多曝光", true, 0.01f);
            a(recyclerView);
        } catch (Exception e) {
            jqg.a("reportEndLoadMoreExposureException", e.getMessage());
        }
    }

    static {
        kge.a(1499083999);
        f28993a = 0L;
        b = null;
    }

    private static void a(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46606596", new Object[]{recyclerView});
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        try {
            int childCount = recyclerView.getChildCount();
            if (childCount < 2) {
                return;
            }
            RecyclerView.ViewHolder findViewHolderForLayoutPosition = recyclerView.findViewHolderForLayoutPosition(childCount - 2);
            if (!(findViewHolderForLayoutPosition instanceof h)) {
                return;
            }
            IDMComponent f = ((h) findViewHolderForLayoutPosition).f();
            if (f == null) {
                return;
            }
            String key = f.getKey();
            if (key == null) {
                return;
            }
            if (Objects.equals(b, key)) {
                jpt c = bed.a.b("loadMoreExposeTooFrequently").c("加载下一页可能出错了");
                bed.a(c.a("两次上拉时间间隔：" + (currentTimeMillis - f28993a)).a(1.0f));
            }
            b = key;
        } finally {
            f28993a = currentTimeMillis;
        }
    }
}
