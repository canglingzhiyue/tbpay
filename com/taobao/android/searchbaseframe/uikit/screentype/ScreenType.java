package com.taobao.android.searchbaseframe.uikit.screentype;

import android.app.Activity;
import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.LifecycleOwner;
import android.arch.lifecycle.OnLifecycleEvent;
import android.content.Context;
import android.content.res.Configuration;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.OnScreenChangedListener;
import com.taobao.android.autosize.f;
import com.taobao.android.autosize.h;
import com.taobao.android.autosize.l;
import com.taobao.android.searchbaseframe.util.k;
import com.taobao.android.weex_framework.p;
import com.taobao.message.lab.comfrm.support.list.AbsListWidgetInstance;
import com.taobao.tao.Globals;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import tb.kge;

/* loaded from: classes6.dex */
public class ScreenType implements LifecycleObserver, OnScreenChangedListener {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final boolean IS_FOLDABLE;
    public static final boolean IS_PAD;
    public static final int SCREEN_TYPE_FOLDABLE_EXPAND = 3;
    public static final int SCREEN_TYPE_PAD_LANDSCAPE = 2;
    public static final int SCREEN_TYPE_PAD_PORTRAIT = 1;
    public static final int SCREEN_TYPE_PHONE_NORMAL = 0;
    private static final Map<Context, ScreenType> e;

    /* renamed from: a  reason: collision with root package name */
    private LifecycleOwner f15012a;
    private final Activity b;
    private int c;
    private List<a> d = new LinkedList();
    private boolean f;
    private boolean g;

    public static String a(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9064aa65", new Object[]{new Integer(i)}) : i != 0 ? i != 1 ? i != 2 ? i != 3 ? "" : AbsListWidgetInstance.KEY_SECTION_EXPAND : "compact" : "regular" : "normal";
    }

    @Override // com.taobao.android.autosize.OnScreenChangedListener
    public /* synthetic */ void onActivityChanged(Activity activity, int i, Configuration configuration) {
        OnScreenChangedListener.CC.$default$onActivityChanged(this, activity, i, configuration);
    }

    static {
        kge.a(812431284);
        kge.a(2139684418);
        kge.a(825059505);
        e = new HashMap();
        IS_FOLDABLE = l.d(Globals.getApplication());
        IS_PAD = l.b(Globals.getApplication());
    }

    private ScreenType(Activity activity) {
        this.b = activity;
        if (activity instanceof LifecycleOwner) {
            this.f15012a = (LifecycleOwner) activity;
            this.f15012a.getLifecycle().addObserver(this);
        }
        f.a(activity);
        int i = 0;
        if (!IS_PAD && !IS_FOLDABLE) {
            this.c = 0;
            return;
        }
        h.a().c(this);
        boolean b = h.a().b((Context) activity);
        if (IS_FOLDABLE) {
            this.c = !b ? 3 : i;
        } else {
            this.c = b ? 1 : 2;
        }
    }

    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7f33de6", new Object[]{this, aVar});
        } else {
            this.d.add(aVar);
        }
    }

    public void b(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ddf70945", new Object[]{this, aVar});
        } else {
            this.d.remove(aVar);
        }
    }

    public int a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue() : this.c;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    private void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        h.a().d(this);
        LifecycleOwner lifecycleOwner = this.f15012a;
        if (lifecycleOwner != null) {
            lifecycleOwner.getLifecycle().removeObserver(this);
        }
        this.d = null;
        e.remove(this.b);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    private void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
        } else {
            this.f = false;
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    private void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        this.f = true;
        if (!this.g) {
            return;
        }
        k.d("XS.ScreenType", "page resume, notify previous screen type change", new Object[0]);
        c();
    }

    @Override // com.taobao.android.autosize.OnScreenChangedListener
    public void onScreenChanged(int i, Configuration configuration) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cfdcd1d", new Object[]{this, new Integer(i), configuration});
            return;
        }
        int b = b(i);
        if (b == this.c) {
            return;
        }
        this.c = b;
        this.g = true;
        if (this.f) {
            c();
            return;
        }
        k.d("XS.ScreenType", "page[" + this.b.getClass().getSimpleName() + "] is not active,do not notify", new Object[0]);
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        this.g = false;
        for (a aVar : new LinkedList(this.d)) {
            aVar.i_(this.c);
        }
    }

    private int b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a9d66c2d", new Object[]{this, new Integer(i)})).intValue();
        }
        k.d("XS.ScreenType", "judge screen type: ScreenChangeType=" + i + ", isFoldable=" + IS_FOLDABLE + ", isPad=" + IS_PAD, new Object[0]);
        if (IS_FOLDABLE) {
            return i == 1 ? 0 : 3;
        } else if (!IS_PAD) {
            return 0;
        } else {
            return i == 1 ? 1 : 2;
        }
    }

    public static ScreenType a(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ScreenType) ipChange.ipc$dispatch("4987a7f1", new Object[]{context}) : e.get(context);
    }

    public static void a(p pVar) {
        ScreenType a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11e8b525", new Object[]{pVar});
        } else if (pVar == null || (a2 = a(pVar.getUIContext())) == null) {
        } else {
            pVar.addInstanceEnv(com.etao.feimagesearch.p.KEY_SCREEN_STYLE, a(a2.a()));
        }
    }

    public static ScreenType b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ScreenType) ipChange.ipc$dispatch("2f330472", new Object[]{context});
        }
        if (!(context instanceof Activity)) {
            return null;
        }
        ScreenType screenType = e.get(context);
        if (screenType != null) {
            return screenType;
        }
        ScreenType screenType2 = new ScreenType((Activity) context);
        e.put(context, screenType2);
        return screenType2;
    }

    public static String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("367c9fd7", new Object[0]);
        }
        if (IS_FOLDABLE) {
            return "Fold";
        }
        if (!IS_PAD) {
            return null;
        }
        return "Pad";
    }

    public static void a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{map});
            return;
        }
        String b = b();
        if (TextUtils.isEmpty(b)) {
            return;
        }
        map.put(com.etao.feimagesearch.p.KEY_DEVICE_TYPE, b);
    }
}
