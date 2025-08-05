package com.taobao.android.icart.manager;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.BitmapDrawable;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import com.alibaba.ability.localization.b;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.OnScreenChangedListener;
import com.taobao.android.autosize.h;
import com.taobao.android.detail.industry.tool.DIConstants;
import com.taobao.android.icart.widget.CartLinearLayout;
import com.taobao.android.ultron.common.utils.UnifyLog;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.Map;
import mtopsdk.mtop.domain.MtopResponse;
import tb.bby;
import tb.bbz;
import tb.bem;
import tb.bmy;
import tb.bmz;
import tb.dcn;
import tb.jcz;
import tb.jdc;
import tb.jnv;
import tb.jny;
import tb.kge;

/* loaded from: classes5.dex */
public class a implements jcz {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private bbz f12835a;
    private PopupWindow b;
    private int c;
    private Context d;
    private View.OnClickListener e;
    private int f;
    private OnScreenChangedListener g;
    private int h;
    private int i;

    static {
        kge.a(166387889);
        kge.a(-1937309120);
    }

    public static /* synthetic */ int a(a aVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fa1d5f05", new Object[]{aVar, new Integer(i)})).intValue();
        }
        aVar.f = i;
        return i;
    }

    public static /* synthetic */ void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("399dd611", new Object[]{aVar});
        } else {
            aVar.a();
        }
    }

    public static /* synthetic */ int b(a aVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1829424", new Object[]{aVar, new Integer(i)})).intValue();
        }
        aVar.h = i;
        return i;
    }

    public static /* synthetic */ void b(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c63e0112", new Object[]{aVar});
        } else {
            aVar.b();
        }
    }

    public static /* synthetic */ int c(a aVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8e7c943", new Object[]{aVar, new Integer(i)})).intValue();
        }
        aVar.i = i;
        return i;
    }

    public static /* synthetic */ OnScreenChangedListener c(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (OnScreenChangedListener) ipChange.ipc$dispatch("41f01733", new Object[]{aVar}) : aVar.g;
    }

    public static /* synthetic */ int d(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("df7e5707", new Object[]{aVar})).intValue() : aVar.f;
    }

    public static /* synthetic */ int d(a aVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("104cfe62", new Object[]{aVar, new Integer(i)})).intValue();
        }
        aVar.c = i;
        return i;
    }

    public static /* synthetic */ bbz e(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (bbz) ipChange.ipc$dispatch("c7ea4dd7", new Object[]{aVar}) : aVar.f12835a;
    }

    public static /* synthetic */ Context f(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("fefaaa0e", new Object[]{aVar}) : aVar.d;
    }

    public static /* synthetic */ int g(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("855ed80a", new Object[]{aVar})).intValue() : aVar.i;
    }

    public static /* synthetic */ int h(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("11ff030b", new Object[]{aVar})).intValue() : aVar.h;
    }

    public static /* synthetic */ PopupWindow i(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (PopupWindow) ipChange.ipc$dispatch("df816efb", new Object[]{aVar}) : aVar.b;
    }

    public static /* synthetic */ int j(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("2b3f590d", new Object[]{aVar})).intValue() : aVar.c;
    }

    public static /* synthetic */ boolean k(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b7df841f", new Object[]{aVar})).booleanValue() : aVar.c();
    }

    public a(bbz bbzVar, View.OnClickListener onClickListener) {
        this.f12835a = bbzVar;
        this.h = bbzVar.x().a(12.0f);
        this.d = bbzVar.m();
        this.i = h.a().a(this.d);
        this.e = onClickListener;
        ((RecyclerView) this.f12835a.x().s()).addOnScrollListener(new RecyclerView.OnScrollListener() { // from class: com.taobao.android.icart.manager.a.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.support.v7.widget.RecyclerView.OnScrollListener
            public void onScrollStateChanged(RecyclerView recyclerView, int i) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("7fb6f2bf", new Object[]{this, recyclerView, new Integer(i)});
                } else {
                    a.a(a.this);
                }
            }

            @Override // android.support.v7.widget.RecyclerView.OnScrollListener
            public void onScrolled(RecyclerView recyclerView, int i, int i2) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("3018fdc0", new Object[]{this, recyclerView, new Integer(i), new Integer(i2)});
                } else {
                    a.a(a.this);
                }
            }
        });
        bbzVar.n().a(new jnv() { // from class: com.taobao.android.icart.manager.a.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.joc
            public void a(int i, MtopResponse mtopResponse, Object obj, boolean z, Map<String, ?> map) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("dc169ead", new Object[]{this, new Integer(i), mtopResponse, obj, new Boolean(z), map});
                } else {
                    a.this.a(true);
                }
            }

            @Override // tb.joc
            public void a(int i, MtopResponse mtopResponse, Object obj, jny jnyVar, Map<String, ?> map) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("b57ff8e", new Object[]{this, new Integer(i), mtopResponse, obj, jnyVar, map});
                } else {
                    a.this.a(true);
                }
            }
        });
        bbzVar.x().d().a(new bby.b() { // from class: com.taobao.android.icart.manager.a.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.bby.b
            public void a() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                } else {
                    a.b(a.this);
                }
            }

            @Override // tb.bby.b
            public void b() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("57a83e9", new Object[]{this});
                } else {
                    a.a(a.this);
                }
            }
        });
        this.f12835a.F().a("cartLifecycle", new bmy() { // from class: com.taobao.android.icart.manager.a.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.bmy
            public void a(bmz bmzVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("e20852e9", new Object[]{this, bmzVar});
                } else if (bmzVar == null) {
                } else {
                    switch (((Integer) bmzVar.b(DIConstants.EVENT_NAME_LIFE_CYCLE)).intValue()) {
                        case 10003:
                        case 10007:
                            a.a(a.this);
                            return;
                        case 10004:
                        default:
                            return;
                        case 10005:
                        case 10008:
                            a.b(a.this);
                            return;
                        case 10006:
                            if (a.c(a.this) == null) {
                                return;
                            }
                            h.a().d(a.c(a.this));
                            return;
                    }
                }
            }
        });
        ViewGroup u = this.f12835a.x().u();
        if (u instanceof CartLinearLayout) {
            final CartLinearLayout cartLinearLayout = (CartLinearLayout) u;
            cartLinearLayout.setChangeMeasureListener(new CartLinearLayout.a() { // from class: com.taobao.android.icart.manager.a.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.icart.widget.CartLinearLayout.a
                public void a() {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                        return;
                    }
                    int measuredHeight = cartLinearLayout.getMeasuredHeight();
                    if (measuredHeight == a.d(a.this)) {
                        return;
                    }
                    a.a(a.this, measuredHeight);
                    a.this.a(true);
                }
            });
        }
        if (dcn.a()) {
            if (this.g == null) {
                this.g = new OnScreenChangedListener() { // from class: com.taobao.android.icart.manager.a.6
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.android.autosize.OnScreenChangedListener
                    public /* synthetic */ void onActivityChanged(Activity activity, int i, Configuration configuration) {
                        OnScreenChangedListener.CC.$default$onActivityChanged(this, activity, i, configuration);
                    }

                    @Override // com.taobao.android.autosize.OnScreenChangedListener
                    public void onScreenChanged(int i, Configuration configuration) {
                        IpChange ipChange = $ipChange;
                        if (ipChange instanceof IpChange) {
                            ipChange.ipc$dispatch("cfdcd1d", new Object[]{this, new Integer(i), configuration});
                        } else {
                            a.this.a(true);
                        }
                    }
                };
            }
            h.a().c(this.g);
        }
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            a(false);
        }
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        PopupWindow popupWindow = this.b;
        if (popupWindow == null || !popupWindow.isShowing()) {
            return;
        }
        this.b.dismiss();
    }

    private boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue() : this.f12835a.x().f() || jdc.b(null);
    }

    @Override // tb.jcz
    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        String p = bem.p(this.f12835a.n());
        if (p == null || c()) {
            b();
            return;
        }
        final int a2 = this.f12835a.x().a(43.0f);
        final ViewGroup u = this.f12835a.x().u();
        final int a3 = this.f12835a.x().a(20.0f) + a2;
        if (this.f12835a.x().b()) {
            a(p, a2);
            if (!z && this.b.isShowing()) {
                return;
            }
            u.post(new Runnable() { // from class: com.taobao.android.icart.manager.a.7
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (!a.e(a.this).u().isResumed()) {
                        UnifyLog.d("ListTopManager", "pop return, fragment is not resume");
                    } else if (a.k(a.this)) {
                        a.b(a.this);
                    } else {
                        int[] iArr = new int[2];
                        u.getLocationOnScreen(iArr);
                        if (dcn.a()) {
                            a.c(a.this, h.a().a(a.f(a.this)));
                            a aVar = a.this;
                            a.b(aVar, a.e(aVar).x().a(12.0f));
                        }
                        int g = (a.g(a.this) - a.h(a.this)) - a2;
                        int i = iArr[1] - a3;
                        if (a.i(a.this).isShowing() && a.j(a.this) != i) {
                            a.b(a.this);
                        }
                        try {
                            a.i(a.this).showAtLocation(u, 0, g, i);
                        } catch (Throwable unused) {
                        }
                        a.d(a.this, i);
                    }
                }
            });
            return;
        }
        PopupWindow popupWindow = this.b;
        if (popupWindow == null || !popupWindow.isShowing()) {
            return;
        }
        u.post(new Runnable() { // from class: com.taobao.android.icart.manager.a.8
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    a.b(a.this);
                }
            }
        });
    }

    private void a(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8123ad11", new Object[]{this, str, new Integer(i)});
        } else if (this.b != null) {
        } else {
            this.b = new PopupWindow();
            TUrlImageView tUrlImageView = new TUrlImageView(this.d);
            tUrlImageView.setLayoutParams(new ViewGroup.LayoutParams(i, i));
            tUrlImageView.setEnableLayoutOptimize(true);
            this.b = new PopupWindow((View) tUrlImageView, i, i, true);
            this.b.setFocusable(false);
            this.b.setOutsideTouchable(false);
            this.b.setBackgroundDrawable(new BitmapDrawable());
            tUrlImageView.setOnClickListener(this.e);
            tUrlImageView.setContentDescription(b.a(R.string.taobao_app_1028_1_21637));
            View contentView = this.b.getContentView();
            if (!(contentView instanceof TUrlImageView)) {
                return;
            }
            ((TUrlImageView) contentView).setImageUrl(str);
        }
    }
}
