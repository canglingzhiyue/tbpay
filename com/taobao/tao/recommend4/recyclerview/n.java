package com.taobao.tao.recommend4.recyclerview;

import android.support.v7.widget.RecyclerView;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Field;
import tb.gbg;
import tb.kge;
import tb.ldf;

/* loaded from: classes8.dex */
public class n {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-293519537);
    }

    public static float a(RecyclerView recyclerView) {
        if (recyclerView == null) {
            return 0.0f;
        }
        try {
            Field declaredField = RecyclerView.class.getDeclaredField("mViewFlinger");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(recyclerView);
            Field declaredField2 = obj.getClass().getDeclaredField("mScroller");
            declaredField2.setAccessible(true);
            Object obj2 = declaredField2.get(obj);
            Field declaredField3 = obj2.getClass().getDeclaredField("mScrollerY");
            declaredField3.setAccessible(true);
            Object obj3 = declaredField3.get(obj2);
            Field declaredField4 = obj3.getClass().getDeclaredField("mCurrVelocity");
            declaredField4.setAccessible(true);
            Object obj4 = declaredField4.get(obj3);
            if (!(obj4 instanceof Float)) {
                return 0.0f;
            }
            return gbg.a(recyclerView.getContext(), ((Float) obj4).intValue());
        } catch (Exception e) {
            ldf.a("RecyclerViewScrollVelocityUtils", "getCurrentScrollerYVelocity error", e);
            e.printStackTrace();
            return 0.0f;
        }
    }
}
