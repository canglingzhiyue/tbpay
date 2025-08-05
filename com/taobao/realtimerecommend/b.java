package com.taobao.realtimerecommend;

import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import tb.kge;

/* loaded from: classes7.dex */
public class b implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private View f18966a;
    private Object b;

    static {
        kge.a(2000559319);
        kge.a(-1390502639);
    }

    public b(View view, Object obj) {
        this.f18966a = view;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        View view = this.f18966a;
        if (view == null) {
            return;
        }
        view.setTag(R.id.tag_guess_item_id, this.b);
    }
}
