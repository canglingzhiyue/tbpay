package com.taobao.android.detail.core.event;

import android.os.Bundle;
import com.taobao.android.trade.event.i;
import tb.emu;
import tb.kge;

/* loaded from: classes4.dex */
public class a implements i {
    public static final a FAILURE;
    public static final int RESULT_FAILURE = 1;
    public static final int RESULT_SUCCESS = 0;
    public static final a SUCCESS;

    /* renamed from: a  reason: collision with root package name */
    public int f9693a;
    public Bundle b;

    static {
        kge.a(1795672268);
        kge.a(789613348);
        SUCCESS = new a(0);
        FAILURE = new a(1);
    }

    public a(int i) {
        this.f9693a = i;
        emu.a("com.taobao.android.detail.core.event.DetailEventResult");
    }
}
