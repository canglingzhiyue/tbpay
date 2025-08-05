package tb;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.themis.kernel.adapter.IImageAdapter;
import com.taobao.themis.kernel.metaInfo.manifest.TabBarItem;
import com.taobao.themis.utils.k;
import kotlin.collections.ai;
import kotlin.j;
import kotlin.jvm.internal.q;
import kotlin.t;

/* loaded from: classes9.dex */
public final class sul {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private View f33908a;
    private ImageView b;
    private TextView c;
    private TabBarItem d;
    private Context e;
    private boolean f;

    static {
        kge.a(-2009105380);
    }

    public sul(TabBarItem tabItemModel, Context context, boolean z) {
        q.d(tabItemModel, "tabItemModel");
        q.d(context, "context");
        this.d = tabItemModel;
        this.e = context;
        this.f = z;
    }

    public final TabBarItem d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TabBarItem) ipChange.ipc$dispatch("e032580b", new Object[]{this}) : this.d;
    }

    private final void c() {
        IImageAdapter iImageAdapter;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        this.b = new ImageView(this.e);
        String iconNormal = this.d.getIconNormal();
        if (iconNormal != null && (iImageAdapter = (IImageAdapter) qpt.b(IImageAdapter.class)) != null) {
            ImageView imageView = this.b;
            q.a(imageView);
            iImageAdapter.setImageUrl(imageView, iconNormal, null);
        }
        if (this.f) {
            this.f33908a = this.b;
            return;
        }
        FrameLayout frameLayout = new FrameLayout(this.e);
        frameLayout.addView(this.b, new FrameLayout.LayoutParams(-1, -1));
        t tVar = t.INSTANCE;
        this.f33908a = frameLayout;
        String badgeText = this.d.getBadgeText();
        if (badgeText == null) {
            return;
        }
        a(badgeText);
    }

    public final View a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("195fbaaa", new Object[]{this});
        }
        if (this.f33908a == null) {
            c();
        }
        View view = this.f33908a;
        q.a(view);
        return view;
    }

    public final boolean a(String originalText) {
        int a2;
        IpChange ipChange = $ipChange;
        int i = 2;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, originalText})).booleanValue();
        }
        q.d(originalText, "originalText");
        if (this.f || !(this.f33908a instanceof FrameLayout)) {
            return false;
        }
        Object systemService = this.e.getSystemService("layout_inflater");
        if (!(systemService instanceof LayoutInflater)) {
            systemService = null;
        }
        LayoutInflater layoutInflater = (LayoutInflater) systemService;
        if (layoutInflater == null) {
            return false;
        }
        if (originalText.length() > 3) {
            originalText = "···";
        }
        Integer num = (Integer) ai.a(j.a(0, Integer.valueOf(R.layout.tms_tabbar_dot_badge)), j.a(1, Integer.valueOf(R.layout.tms_tabbar_single_word_badge)), j.a(2, Integer.valueOf(R.layout.tms_tabbar_rounded_corner_badge)), j.a(3, Integer.valueOf(R.layout.tms_tabbar_rounded_corner_badge))).get(Integer.valueOf(originalText.length()));
        if (num == null) {
            return false;
        }
        int intValue = num.intValue();
        b();
        this.d.setBadgeText(originalText);
        View view = this.f33908a;
        if (view == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        this.c = (TextView) layoutInflater.inflate(intValue, (ViewGroup) view, false);
        TextView textView = this.c;
        if (textView != null) {
            textView.setText(originalText);
        }
        int i2 = originalText.length() != 0 ? 29 : 38;
        if (originalText.length() != 0) {
            i = 0;
        }
        int i3 = originalText.length() != 0 ? 20 : 9;
        TextView textView2 = this.c;
        if (textView2 == null) {
            return false;
        }
        int length = originalText.length();
        if (length == 0) {
            a2 = k.a(this.e, 9.0f);
        } else if (length == 1) {
            a2 = k.a(this.e, 20.0f);
        } else {
            textView2.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
            a2 = textView2.getMeasuredWidth();
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(a2, k.a(this.e, i3));
        layoutParams.leftMargin = k.a(this.e, i2);
        layoutParams.topMargin = k.a(this.e, i);
        layoutParams.gravity = 48;
        View view2 = this.f33908a;
        if (!(view2 instanceof FrameLayout)) {
            view2 = null;
        }
        FrameLayout frameLayout = (FrameLayout) view2;
        if (frameLayout != null) {
            frameLayout.setClipChildren(false);
            frameLayout.setClipToPadding(false);
            frameLayout.addView(this.c, layoutParams);
        }
        return true;
    }

    public final boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        this.d.setBadgeText(null);
        TextView textView = this.c;
        if (textView != null) {
            ViewParent parent = textView.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(textView);
            }
        }
        this.c = null;
        return true;
    }

    public final void a(boolean z) {
        ImageView imageView;
        IImageAdapter iImageAdapter;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        String iconSelected = z ? this.d.getIconSelected() : this.d.getIconNormal();
        if (iconSelected == null || (imageView = this.b) == null || (iImageAdapter = (IImageAdapter) qpt.b(IImageAdapter.class)) == null) {
            return;
        }
        iImageAdapter.setImageUrl(imageView, iconSelected, null);
    }

    public final void a(TabBarItem tabBarItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1210d88", new Object[]{this, tabBarItem});
            return;
        }
        q.d(tabBarItem, "tabBarItem");
        this.d = tabBarItem;
    }
}
