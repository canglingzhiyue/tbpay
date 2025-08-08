package tb;

import android.content.Context;
import android.graphics.drawable.Drawable;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.ut.monitor.DataReceiveMonitor;
import com.taobao.themis.container.title.action.base.e;
import com.taobao.themis.kernel.adapter.IImageAdapter;
import com.taobao.themis.kernel.container.Window;
import com.taobao.themis.utils.k;
import kotlin.Metadata;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import kotlin.t;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u001f2\u00020\u00012\u00020\u0002:\u0001\u001fB\u0005¢\u0006\u0002\u0010\u0003J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u00052\u0006\u0010\f\u001a\u00020\nH\u0002J\u0012\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0012H\u0016J&\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J!\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\u0010\u001a\u001a\u0004\u0018\u00010\u00162\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019¢\u0006\u0002\u0010\u001bJ!\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\u0010\u001a\u001a\u0004\u0018\u00010\u00052\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019¢\u0006\u0002\u0010\u001cJ&\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00052\b\u0010\u0017\u001a\u0004\u0018\u00010\u00052\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\u0010\u0010\u001d\u001a\u00020\u00142\u0006\u0010\f\u001a\u00020\nH\u0016J\b\u0010\u001e\u001a\u00020\u0012H\u0016R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/taobao/themis/container/title/action/impl/ButtonAction;", "Lcom/taobao/themis/kernel/container/ui/titlebar/Action;", "Lcom/taobao/themis/container/title/action/base/IButtonAction;", "()V", "mDarkIcon", "", "mImageView", "Landroid/widget/ImageView;", "mLightIcon", "mStyle", "Lcom/taobao/themis/kernel/container/Window$Theme;", "getIconByStyle", "style", "getView", "Landroid/view/View;", "context", "Landroid/content/Context;", "hideButton", "", "setButton", "", "lightIcon", "Landroid/graphics/drawable/Drawable;", "darkIcon", DataReceiveMonitor.CB_LISTENER, "Landroid/view/View$OnClickListener;", "icon", "(Landroid/graphics/drawable/Drawable;Landroid/view/View$OnClickListener;)Lkotlin/Unit;", "(Ljava/lang/String;Landroid/view/View$OnClickListener;)Lkotlin/Unit;", "setStyle", "showButton", "Companion", "themis_container_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class qov extends com.taobao.themis.kernel.container.ui.titlebar.a implements e {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion;
    private static final String f;

    /* renamed from: a  reason: collision with root package name */
    private ImageView f33001a;
    private String c;
    private String d;
    private Window.Theme e = Window.Theme.LIGHT;

    public static /* synthetic */ Object ipc$super(qov qovVar, String str, Object... objArr) {
        if (str.hashCode() == 547063898) {
            super.a((Window.Theme) objArr[0]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.themis.kernel.container.ui.titlebar.a
    public View a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("876fa4a2", new Object[]{this, context});
        }
        q.d(context, "context");
        if (this.f33001a == null) {
            ImageView imageView = new ImageView(context);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.width = k.a(context, 28.0f);
            layoutParams.height = k.a(context, 28.0f);
            layoutParams.gravity = 17;
            layoutParams.setMarginEnd(k.a(context, 12.0f));
            t tVar = t.INSTANCE;
            imageView.setLayoutParams(layoutParams);
            imageView.setTag(f);
            t tVar2 = t.INSTANCE;
            this.f33001a = imageView;
        }
        return this.f33001a;
    }

    public final t a(String str, View.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (t) ipChange.ipc$dispatch("920cc7f8", new Object[]{this, str, onClickListener});
        }
        ImageView imageView = this.f33001a;
        if (imageView == null) {
            return null;
        }
        if (!StringUtils.isEmpty(str)) {
            imageView.setVisibility(0);
            IImageAdapter iImageAdapter = (IImageAdapter) qpt.b(IImageAdapter.class);
            if (iImageAdapter != null) {
                q.a((Object) str);
                iImageAdapter.setImageUrl(imageView, str, null);
            }
            imageView.setOnClickListener(onClickListener);
        }
        return t.INSTANCE;
    }

    public final t a(Drawable drawable, View.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (t) ipChange.ipc$dispatch("8423d852", new Object[]{this, drawable, onClickListener});
        }
        ImageView imageView = this.f33001a;
        if (imageView == null) {
            return null;
        }
        imageView.setVisibility(0);
        imageView.setImageDrawable(drawable);
        imageView.setOnClickListener(onClickListener);
        return t.INSTANCE;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/taobao/themis/container/title/action/impl/ButtonAction$Companion;", "", "()V", RPCDataItems.SWITCH_TAG_LOG, "", "themis_container_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class a {
        static {
            kge.a(151485537);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }
    }

    static {
        kge.a(1267493977);
        kge.a(513376209);
        Companion = new a(null);
        String simpleName = qov.class.getSimpleName();
        q.b(simpleName, "ButtonAction::class.java.simpleName");
        f = simpleName;
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
        super.a(style);
        this.e = style;
        String b = b(style);
        if (b == null || (imageView = this.f33001a) == null || (iImageAdapter = (IImageAdapter) qpt.b(IImageAdapter.class)) == null) {
            return;
        }
        iImageAdapter.setImageUrl(imageView, b, null);
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
        ImageView imageView = this.f33001a;
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
        String b = b(this.e);
        String str5 = b;
        if (str5 != null && str5.length() != 0) {
            z = false;
        }
        if (!z && (iImageAdapter = (IImageAdapter) qpt.b(IImageAdapter.class)) != null) {
            iImageAdapter.setImageUrl(imageView, b, null);
        }
        imageView.setOnClickListener(onClickListener);
    }

    @Override // com.taobao.themis.container.title.action.base.e
    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        ImageView imageView = this.f33001a;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        return true;
    }

    @Override // com.taobao.themis.container.title.action.base.e
    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        ImageView imageView = this.f33001a;
        if (imageView != null) {
            imageView.setVisibility(0);
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
            return this.c;
        }
        String str2 = this.d;
        if (str2 == null || str2.length() == 0) {
            z = true;
        }
        if (z) {
            return this.d;
        }
        int i = tdt.$EnumSwitchMapping$0[theme.ordinal()];
        if (i == 1) {
            return this.c;
        }
        if (i == 2) {
            return this.d;
        }
        return this.c;
    }
}
