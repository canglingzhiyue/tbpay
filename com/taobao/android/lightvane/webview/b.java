package com.taobao.android.lightvane.webview;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.kge;

/* loaded from: classes5.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    private static final String f13296a;
    private LinearLayout e;
    private View f;
    private Context g;
    private View b = null;
    private View c = null;
    private TextView d = null;
    private boolean h = false;
    private boolean i = true;
    private AtomicBoolean j = new AtomicBoolean(false);
    private boolean k = false;

    static {
        kge.a(1054493771);
        f13296a = b.class.getSimpleName();
    }

    public b(Context context, View view) {
        this.g = context;
        this.f = view;
        this.e = new LinearLayout(context);
    }
}
