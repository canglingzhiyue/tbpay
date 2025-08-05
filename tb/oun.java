package tb;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.share.ui.engine.jsbridge.a;
import com.taobao.share.ui.engine.structure.BubbleTipsBean;

/* loaded from: classes8.dex */
public class oun {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-2009479977);
    }

    public static void a(final RecyclerView recyclerView, BubbleTipsBean bubbleTipsBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94ad8846", new Object[]{recyclerView, bubbleTipsBean});
        } else if (bubbleTipsBean == null || !nyl.c() || recyclerView == null) {
        } else {
            String index = bubbleTipsBean.getIndex();
            final String text = bubbleTipsBean.getText();
            try {
                final int parseInt = Integer.parseInt(index);
                if (TextUtils.isEmpty(text) || parseInt < 0) {
                    return;
                }
                recyclerView.post(new Runnable() { // from class: tb.oun.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            oun.a(RecyclerView.this, parseInt, text);
                        }
                    }
                });
                recyclerView.addOnScrollListener(new RecyclerView.OnScrollListener() { // from class: tb.oun.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    public static /* synthetic */ Object ipc$super(AnonymousClass2 anonymousClass2, String str, Object... objArr) {
                        int hashCode = str.hashCode();
                        if (hashCode == 806944192) {
                            super.onScrolled((RecyclerView) objArr[0], ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue());
                            return null;
                        } else if (hashCode != 2142696127) {
                            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
                        } else {
                            super.onScrollStateChanged((RecyclerView) objArr[0], ((Number) objArr[1]).intValue());
                            return null;
                        }
                    }

                    @Override // android.support.v7.widget.RecyclerView.OnScrollListener
                    public void onScrollStateChanged(RecyclerView recyclerView2, int i) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("7fb6f2bf", new Object[]{this, recyclerView2, new Integer(i)});
                            return;
                        }
                        super.onScrollStateChanged(recyclerView2, i);
                        if (i != 0) {
                            return;
                        }
                        RecyclerView.LayoutManager layoutManager = RecyclerView.this.getLayoutManager();
                        if (!(layoutManager instanceof LinearLayoutManager)) {
                            return;
                        }
                        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
                        int findFirstCompletelyVisibleItemPosition = linearLayoutManager.findFirstCompletelyVisibleItemPosition();
                        int findLastCompletelyVisibleItemPosition = linearLayoutManager.findLastCompletelyVisibleItemPosition();
                        int i2 = parseInt;
                        if (i2 < findFirstCompletelyVisibleItemPosition || i2 > findLastCompletelyVisibleItemPosition) {
                            return;
                        }
                        oun.a(RecyclerView.this, i2 - findFirstCompletelyVisibleItemPosition, text);
                    }

                    @Override // android.support.v7.widget.RecyclerView.OnScrollListener
                    public void onScrolled(RecyclerView recyclerView2, int i, int i2) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("3018fdc0", new Object[]{this, recyclerView2, new Integer(i), new Integer(i2)});
                            return;
                        }
                        super.onScrolled(recyclerView2, i, i2);
                        if (i <= 0) {
                            return;
                        }
                        a.a().a(a.HIDE_BUBBLE_EVENT, a.EMPTY_EVENT);
                    }
                });
            } catch (Exception unused) {
            }
        }
    }

    public static void a(RecyclerView recyclerView, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65b518b7", new Object[]{recyclerView, new Integer(i), str});
        } else if (i < 0 || i >= recyclerView.getChildCount()) {
        } else {
            View childAt = recyclerView.getChildAt(i);
            int left = (childAt.getLeft() + (childAt.getWidth() / 2)) - nyq.a(com.taobao.tao.config.a.a().getApplicationContext(), 26.0f);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("text", (Object) str);
            jSONObject.put("left", (Object) Integer.valueOf(left));
            a.a().a(a.SHOW_BUBBLE_EVENT, jSONObject);
            recyclerView.postDelayed(new Runnable() { // from class: tb.oun.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        a.a().a(a.HIDE_BUBBLE_EVENT, a.EMPTY_EVENT);
                    }
                }
            }, 5000L);
        }
    }
}
