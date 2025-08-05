package com.taobao.themis.pub.titlebar.action;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.ut.monitor.DataReceiveMonitor;
import com.taobao.taobao.R;
import com.taobao.themis.kernel.adapter.IImageAdapter;
import com.taobao.themis.kernel.container.Window;
import com.taobao.themis.kernel.page.ITMSPage;
import com.taobao.themis.pub_kit.guide.model.PubUserGuideModule;
import com.taobao.themis.utils.k;
import kotlin.Metadata;
import kotlin.collections.ai;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.kge;
import tb.ood;
import tb.qpt;
import tb.qrc;
import tb.qrd;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 $2\u00020\u00012\u00020\u0002:\u0001$B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0012\u001a\u00020\fH\u0002J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0018H\u0016J&\u0010\u0019\u001a\u00020\u000e2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J!\u0010\u0019\u001a\u0004\u0018\u00010\u000e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e¢\u0006\u0002\u0010 J!\u0010\u0019\u001a\u0004\u0018\u00010\u000e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u00052\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e¢\u0006\u0002\u0010!J&\u0010\u0019\u001a\u00020\u000e2\b\u0010\u001a\u001a\u0004\u0018\u00010\u00052\b\u0010\u001c\u001a\u0004\u0018\u00010\u00052\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J\u0010\u0010\"\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\fH\u0016J\b\u0010#\u001a\u00020\u0018H\u0016R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Lcom/taobao/themis/pub/titlebar/action/PubButtonAction;", "Lcom/taobao/themis/kernel/container/ui/titlebar/Action;", "Lcom/taobao/themis/container/title/action/base/IButtonAction;", "()V", "mDarkIcon", "", "mFrameLayout", "Landroid/widget/FrameLayout;", "mImageView", "Landroid/widget/ImageView;", "mLightIcon", "mStyle", "Lcom/taobao/themis/kernel/container/Window$Theme;", "attachPage", "", "page", "Lcom/taobao/themis/kernel/page/ITMSPage;", "getIconByStyle", "style", "getView", "Landroid/view/View;", "context", "Landroid/content/Context;", "hideButton", "", "setButton", "lightIcon", "Landroid/graphics/drawable/Drawable;", "darkIcon", DataReceiveMonitor.CB_LISTENER, "Landroid/view/View$OnClickListener;", "icon", "(Landroid/graphics/drawable/Drawable;Landroid/view/View$OnClickListener;)Lkotlin/Unit;", "(Ljava/lang/String;Landroid/view/View$OnClickListener;)Lkotlin/Unit;", "setStyle", "showButton", "Companion", "themis_pub_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class e extends com.taobao.themis.kernel.container.ui.titlebar.a implements com.taobao.themis.container.title.action.base.e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion;
    public static final String TAG = "PubButtonAction";

    /* renamed from: a  reason: collision with root package name */
    private FrameLayout f22760a;
    private ImageView b;
    private String c;
    private String d;
    private Window.Theme e = Window.Theme.DARK;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "view", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/taobao/themis/pub/titlebar/action/PubButtonAction$setButton$1$1"}, k = 3, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class b implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ String b;
        public final /* synthetic */ View.OnClickListener c;

        public b(String str, View.OnClickListener onClickListener) {
            this.b = str;
            this.c = onClickListener;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            com.taobao.themis.kernel.f b;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            ITMSPage a2 = e.a(e.this);
            if (a2 != null && (b = a2.b()) != null) {
                qrc.a(b, new qrd.b() { // from class: com.taobao.themis.pub.titlebar.action.e.b.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // tb.qrd.b
                    public void onResult(PubUserGuideModule pubUserGuideModule) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("6fdbe268", new Object[]{this, pubUserGuideModule});
                        } else if (pubUserGuideModule == null) {
                        } else {
                            ITMSPage a3 = e.a(e.this);
                            q.a(a3);
                            ITMSPage a4 = e.a(e.this);
                            q.a(a4);
                            ITMSPage a5 = e.a(e.this);
                            q.a(a5);
                            com.taobao.themis.pub_kit.utils.f.b("Page_MiniApp_Button-NavBar-5", ai.b(kotlin.j.a("miniapp_id", a3.b().h()), kotlin.j.a(ood.HOME_BUCKETS, com.taobao.themis.pub_kit.guide.model.a.a(pubUserGuideModule)), kotlin.j.a("spm", "Page_MiniApp.1.NavBar.5"), kotlin.j.a("pageId", a4.c().e().a()), kotlin.j.a("pageUrl", a5.e())));
                        }
                    }
                });
            }
            View.OnClickListener onClickListener = this.c;
            if (onClickListener == null) {
                return;
            }
            onClickListener.onClick(view);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "view", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/taobao/themis/pub/titlebar/action/PubButtonAction$setButton$2$1"}, k = 3, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class c implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ Drawable b;
        public final /* synthetic */ View.OnClickListener c;

        public c(Drawable drawable, View.OnClickListener onClickListener) {
            this.b = drawable;
            this.c = onClickListener;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            com.taobao.themis.kernel.f b;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            ITMSPage a2 = e.a(e.this);
            if (a2 != null && (b = a2.b()) != null) {
                qrc.a(b, new qrd.b() { // from class: com.taobao.themis.pub.titlebar.action.e.c.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // tb.qrd.b
                    public void onResult(PubUserGuideModule pubUserGuideModule) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("6fdbe268", new Object[]{this, pubUserGuideModule});
                        } else if (pubUserGuideModule == null) {
                        } else {
                            ITMSPage a3 = e.a(e.this);
                            q.a(a3);
                            ITMSPage a4 = e.a(e.this);
                            q.a(a4);
                            ITMSPage a5 = e.a(e.this);
                            q.a(a5);
                            com.taobao.themis.pub_kit.utils.f.b("Page_MiniApp_Button-NavBar-5", ai.b(kotlin.j.a("miniapp_id", a3.b().h()), kotlin.j.a(ood.HOME_BUCKETS, com.taobao.themis.pub_kit.guide.model.a.a(pubUserGuideModule)), kotlin.j.a("spm", "Page_MiniApp.1.NavBar.5"), kotlin.j.a("pageId", a4.c().e().a()), kotlin.j.a("pageUrl", a5.e())));
                        }
                    }
                });
            }
            View.OnClickListener onClickListener = this.c;
            if (onClickListener == null) {
                return;
            }
            onClickListener.onClick(view);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "view", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/taobao/themis/pub/titlebar/action/PubButtonAction$setButton$3$1"}, k = 3, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class d implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;
        public final /* synthetic */ View.OnClickListener d;

        public d(String str, String str2, View.OnClickListener onClickListener) {
            this.b = str;
            this.c = str2;
            this.d = onClickListener;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            com.taobao.themis.kernel.f b;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            ITMSPage a2 = e.a(e.this);
            if (a2 != null && (b = a2.b()) != null) {
                qrc.a(b, new qrd.b() { // from class: com.taobao.themis.pub.titlebar.action.e.d.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // tb.qrd.b
                    public void onResult(PubUserGuideModule pubUserGuideModule) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("6fdbe268", new Object[]{this, pubUserGuideModule});
                        } else if (pubUserGuideModule == null) {
                        } else {
                            ITMSPage a3 = e.a(e.this);
                            q.a(a3);
                            com.taobao.themis.pub_kit.utils.f.b("Page_MiniApp_Button-NavBar-5", ai.b(kotlin.j.a("miniapp_id", a3.b().h()), kotlin.j.a(ood.HOME_BUCKETS, com.taobao.themis.pub_kit.guide.model.a.a(pubUserGuideModule)), kotlin.j.a("spm", "Page_MiniApp.1.NavBar.5")));
                        }
                    }
                });
            }
            View.OnClickListener onClickListener = this.d;
            if (onClickListener == null) {
                return;
            }
            onClickListener.onClick(view);
        }
    }

    static {
        kge.a(-1711648360);
        kge.a(513376209);
        Companion = new a(null);
    }

    public static /* synthetic */ Object ipc$super(e eVar, String str, Object... objArr) {
        if (str.hashCode() == -78343661) {
            super.a((ITMSPage) objArr[0]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static final /* synthetic */ ITMSPage a(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ITMSPage) ipChange.ipc$dispatch("923ed0c0", new Object[]{eVar}) : eVar.d();
    }

    @Override // com.taobao.themis.kernel.container.ui.titlebar.a
    public View a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("876fa4a2", new Object[]{this, context});
        }
        q.d(context, "context");
        if (this.f22760a == null) {
            this.b = new ImageView(context);
            FrameLayout frameLayout = new FrameLayout(context);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(k.a(context, 32.0f), k.a(context, 32.0f));
            layoutParams.rightMargin = k.a(context, 12.0f);
            t tVar = t.INSTANCE;
            frameLayout.setLayoutParams(layoutParams);
            frameLayout.setBackgroundResource(R.drawable.tms_pub_square_bg_white);
            frameLayout.addView(this.b);
            t tVar2 = t.INSTANCE;
            this.f22760a = frameLayout;
            ImageView imageView = this.b;
            if (imageView != null) {
                ViewGroup.LayoutParams layoutParams2 = imageView.getLayoutParams();
                if (layoutParams2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                }
                FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) layoutParams2;
                layoutParams3.width = k.a(context, 28.0f);
                layoutParams3.height = k.a(context, 28.0f);
                layoutParams3.gravity = 17;
                t tVar3 = t.INSTANCE;
                imageView.setLayoutParams(layoutParams3);
            }
            FrameLayout frameLayout2 = this.f22760a;
            if (frameLayout2 != null) {
                frameLayout2.setTag(TAG);
            }
        }
        return this.f22760a;
    }

    public final t a(String str, View.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (t) ipChange.ipc$dispatch("920cc7f8", new Object[]{this, str, onClickListener});
        }
        ImageView imageView = this.b;
        if (imageView == null) {
            return null;
        }
        if (!TextUtils.isEmpty(str)) {
            imageView.setVisibility(0);
            IImageAdapter iImageAdapter = (IImageAdapter) qpt.b(IImageAdapter.class);
            if (iImageAdapter != null) {
                q.a((Object) str);
                iImageAdapter.setImageUrl(imageView, str, null);
            }
            imageView.setOnClickListener(new b(str, onClickListener));
        }
        return t.INSTANCE;
    }

    public final t a(Drawable drawable, View.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (t) ipChange.ipc$dispatch("8423d852", new Object[]{this, drawable, onClickListener});
        }
        ImageView imageView = this.b;
        if (imageView == null) {
            return null;
        }
        imageView.setVisibility(0);
        imageView.setImageDrawable(drawable);
        imageView.setOnClickListener(new c(drawable, onClickListener));
        return t.INSTANCE;
    }

    @Override // com.taobao.themis.container.title.action.base.e
    public void a(String str, String str2, View.OnClickListener onClickListener) {
        IImageAdapter iImageAdapter;
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4bb613d", new Object[]{this, str, str2, onClickListener});
            return;
        }
        ImageView imageView = this.b;
        if (imageView == null) {
            return;
        }
        String str3 = str;
        if (str3 == null || str3.length() == 0) {
            String str4 = str2;
            if (str4 == null || str4.length() == 0) {
                return;
            }
        }
        this.c = str;
        this.d = str2;
        imageView.setVisibility(0);
        String b2 = b(this.e);
        String str5 = b2;
        if (str5 != null && str5.length() != 0) {
            z = false;
        }
        if (!z && (iImageAdapter = (IImageAdapter) qpt.b(IImageAdapter.class)) != null) {
            iImageAdapter.setImageUrl(imageView, b2, null);
        }
        imageView.setOnClickListener(new d(str, str2, onClickListener));
    }

    @Override // com.taobao.themis.kernel.container.ui.titlebar.a
    public void a(final ITMSPage page) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb549213", new Object[]{this, page});
            return;
        }
        q.d(page, "page");
        super.a(page);
        qrc.a(page.b(), new qrd.b() { // from class: com.taobao.themis.pub.titlebar.action.PubButtonAction$attachPage$1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.qrd.b
            public void onResult(PubUserGuideModule pubUserGuideModule) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("6fdbe268", new Object[]{this, pubUserGuideModule});
                } else if (pubUserGuideModule == null) {
                } else {
                    com.taobao.themis.pub_kit.utils.f.a("Page_MiniApp_Show-NavBar-5", ai.b(kotlin.j.a("miniapp_id", ITMSPage.this.b().h()), kotlin.j.a(ood.HOME_BUCKETS, com.taobao.themis.pub_kit.guide.model.a.a(pubUserGuideModule)), kotlin.j.a("spm", "Page_MiniApp.1.NavBar.5"), kotlin.j.a("pageId", ITMSPage.this.c().e().a()), kotlin.j.a("pageUrl", ITMSPage.this.e())));
                }
            }
        });
    }

    @Override // com.taobao.themis.kernel.container.ui.titlebar.a
    public void a(Window.Theme style) {
        ImageView imageView;
        IImageAdapter iImageAdapter;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("209b885a", new Object[]{this, style});
            return;
        }
        q.d(style, "style");
        this.e = style;
        if (Window.Theme.LIGHT == style) {
            FrameLayout frameLayout = this.f22760a;
            if (frameLayout != null && frameLayout != null) {
                frameLayout.setBackgroundResource(R.drawable.tms_pub_square_bg_dark);
            }
        } else {
            FrameLayout frameLayout2 = this.f22760a;
            if (frameLayout2 != null) {
                frameLayout2.setBackgroundResource(R.drawable.tms_pub_square_bg_white);
            }
        }
        String b2 = b(style);
        if (b2 == null || (imageView = this.b) == null || (iImageAdapter = (IImageAdapter) qpt.b(IImageAdapter.class)) == null) {
            return;
        }
        iImageAdapter.setImageUrl(imageView, b2, null);
    }

    @Override // com.taobao.themis.container.title.action.base.e
    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        FrameLayout frameLayout = this.f22760a;
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
        }
        return true;
    }

    @Override // com.taobao.themis.container.title.action.base.e
    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        FrameLayout frameLayout = this.f22760a;
        if (frameLayout != null) {
            frameLayout.setVisibility(0);
        }
        return true;
    }

    private final String b(Window.Theme theme) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("90949ec7", new Object[]{this, theme});
        }
        String str = this.c;
        if (str == null || str.length() == 0) {
            return this.d;
        }
        String str2 = this.d;
        if (str2 == null || str2.length() == 0) {
            z = true;
        }
        if (z) {
            return this.c;
        }
        int i = m.$EnumSwitchMapping$0[theme.ordinal()];
        if (i == 1) {
            return this.d;
        }
        if (i == 2) {
            return this.c;
        }
        return this.c;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/taobao/themis/pub/titlebar/action/PubButtonAction$Companion;", "", "()V", RPCDataItems.SWITCH_TAG_LOG, "", "themis_pub_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class a {
        static {
            kge.a(727916256);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }
    }
}
