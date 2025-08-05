package com.taobao.android.order.bundle.helper;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.megadesign.dx.view.DisplayVideoView;
import com.taobao.android.order.bundle.base.BaseActivity;
import com.taobao.android.order.bundle.base.parallelbiz.ParallelBizValueHelper;
import com.ut.mini.UTAnalytics;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import tb.hyn;
import tb.hze;
import tb.kge;

/* loaded from: classes6.dex */
public final class k {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1272833208);
    }

    public static void a(Context context, String str, ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4718469", new Object[]{context, str, viewGroup});
            return;
        }
        View a2 = a(viewGroup);
        if (!(a2 instanceof ViewGroup)) {
            return;
        }
        a(context, str, b((ViewGroup) a2));
    }

    private static View a(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("fb64bd29", new Object[]{viewGroup});
        }
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof DXRootView) {
                DXRootView dXRootView = (DXRootView) childAt;
                JSONObject data = dXRootView.getData();
                if (data != null && data.get("fields") != null && "true".equals((String) ((JSONObject) data.get("fields")).get("needsVideoAnalyze"))) {
                    return dXRootView;
                }
            } else if (childAt instanceof ViewGroup) {
                return a((ViewGroup) childAt);
            }
        }
        return null;
    }

    private static List<DisplayVideoView> b(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("cfb5981f", new Object[]{viewGroup});
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof DisplayVideoView) {
                arrayList.add((DisplayVideoView) childAt);
            } else if (childAt instanceof ViewGroup) {
                arrayList.addAll(b((ViewGroup) childAt));
            }
        }
        return arrayList;
    }

    private static void a(Context context, String str, List<DisplayVideoView> list) {
        DisplayVideoView next;
        Integer currentVideoPosition;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1572f1b", new Object[]{context, str, list});
            return;
        }
        Iterator<DisplayVideoView> it = list.iterator();
        while (it.hasNext() && (currentVideoPosition = (next = it.next()).getCurrentVideoPosition()) != null && currentVideoPosition.intValue() > 0) {
            try {
                str2 = ((hze) ((BaseActivity) context).i().e()).d().x().c().getJSONObject("events").getJSONObject("utExplosure").getJSONObject("fields").getJSONObject("args").getString("sellerId");
            } catch (Exception unused) {
                hyn.a("TBOrderDetailActivity", "Tips_video_UT", new String[0]);
                str2 = "";
            }
            HashMap hashMap = new HashMap();
            hashMap.put("orderId", str);
            String videoId = next.getVideoId();
            if (videoId == null) {
                videoId = "";
            }
            hashMap.put("videoId", videoId);
            hashMap.put("sellerId", str2);
            hashMap.put("currentTime", String.valueOf(currentVideoPosition));
            hashMap.put("videoDuration", next.getVideoDuration().toString());
            String a2 = ParallelBizValueHelper.a(ParallelBizValueHelper.PageType.order_detail);
            UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder(a2, 19999, a2 + "_Tips_AutoPlay", null, null, hashMap).build());
        }
    }
}
