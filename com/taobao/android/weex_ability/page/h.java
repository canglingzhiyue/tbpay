package com.taobao.android.weex_ability.page;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.i;
import com.taobao.android.autosize.l;
import com.taobao.android.weex_framework.adapter.j;
import tb.kge;

/* loaded from: classes6.dex */
public class h implements j {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static boolean f15967a;

    static {
        kge.a(-814106480);
        kge.a(1370087789);
        f15967a = false;
    }

    @Override // com.taobao.android.weex_framework.adapter.j
    public Rect a(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Rect) ipChange.ipc$dispatch("28388f83", new Object[]{this, activity});
        }
        if (!f15967a) {
            try {
                if (l.d((Context) activity) || l.b((Context) activity)) {
                    return i.a(activity);
                }
            } catch (Throwable th) {
                com.taobao.android.weex_framework.util.g.d(com.taobao.android.weex_framework.util.g.b(th));
                if (th instanceof NoClassDefFoundError) {
                    f15967a = true;
                }
            }
        }
        return new Rect(0, 0, com.taobao.android.weex_framework.util.l.e(activity), com.taobao.android.weex_framework.util.l.g(activity));
    }
}
