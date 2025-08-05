package com.taobao.realtimerecommend;

import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavix.h;
import tb.kge;

/* loaded from: classes7.dex */
public class c implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private View f18967a;
    private Object b;
    private String c;
    private String d;

    static {
        kge.a(-1953863666);
        kge.a(-1390502639);
    }

    public c(View view, Object obj, String str, String str2) {
        this.f18967a = view;
        this.b = obj;
        this.c = str2;
        this.d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        String str = null;
        Object obj = this.b;
        if (obj instanceof String) {
            str = (String) obj;
        } else if (obj instanceof Integer) {
            str = ((Integer) obj).toString();
        }
        h.b(this.d, this.c, str, this.f18967a, new String[0]);
    }
}
