package com.etao.feimagesearch.quicksearch;

import android.app.StatusBarManager;
import android.content.ComponentName;
import android.content.Context;
import android.graphics.drawable.Icon;
import android.os.Handler;
import android.os.Looper;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import java.util.concurrent.Executor;
import java.util.function.Consumer;
import kotlin.TypeCastException;
import kotlin.jvm.internal.q;
import tb.coy;
import tb.cuk;
import tb.kge;

/* loaded from: classes3.dex */
public final class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1170517894);
    }

    public static final void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{context});
            return;
        }
        q.c(context, "context");
        Object systemService = context.getSystemService(StatusBarManager.class);
        if (systemService == null) {
            throw new TypeCastException("null cannot be cast to non-null type android.app.StatusBarManager");
        }
        coy.a("Page_PhotoSearchResult", "requestQuickSearch", 19999, new String[0]);
        ((StatusBarManager) systemService).requestAddTileService(new ComponentName(context, ScreenShotService.class), com.alibaba.ability.localization.b.a(R.string.taobao_app_1007_1_19033), Icon.createWithResource(context, R.drawable.ic_quick_search), a.INSTANCE, new b(context));
    }

    /* loaded from: classes3.dex */
    public static final class a implements Executor {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final a INSTANCE = new a();

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1afb0dfa", new Object[]{this, runnable});
            } else {
                runnable.run();
            }
        }
    }

    /* loaded from: classes3.dex */
    static final class b<T> implements Consumer<Integer> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f6960a;

        b(Context context) {
            this.f6960a = context;
        }

        @Override // java.util.function.Consumer
        /* renamed from: a */
        public final void accept(Integer num) {
            if (num != null && num.intValue() == 2) {
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.etao.feimagesearch.quicksearch.c.b.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public final void run() {
                        IpChange ipChange = $ipChange;
                        if (ipChange instanceof IpChange) {
                            ipChange.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        coy.a("Page_PhotoSearchResult", "addQuickSearchSuccess", 19999, new String[0]);
                        cuk.a(b.this.f6960a, com.alibaba.ability.localization.b.a(R.string.taobao_app_1007_1_19041), 0);
                    }
                });
            }
        }
    }
}
