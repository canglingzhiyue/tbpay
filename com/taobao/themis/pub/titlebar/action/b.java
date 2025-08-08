package com.taobao.themis.pub.titlebar.action;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.themis.kernel.adapter.IImageAdapter;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.container.Window;
import com.taobao.themis.utils.k;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import tb.kge;
import tb.qpt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001)B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010\u0012\u001a\u00020\u0013J\b\u0010\u0014\u001a\u00020\u000eH\u0016J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0016\u001a\u00020\bH\u0016J\u0019\u0010\u0017\u001a\u00020\u00132\n\b\u0001\u0010\u0018\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0002\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\u000eH\u0016J\u0012\u0010\u001c\u001a\u00020\u00132\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J\u0010\u0010\u001f\u001a\u00020\u00132\u0006\u0010 \u001a\u00020!H\u0016J\u0012\u0010\"\u001a\u00020\u00132\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J\u0012\u0010\"\u001a\u00020\u00132\b\u0010%\u001a\u0004\u0018\u00010\u001eH\u0016J\u0010\u0010&\u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\u000eH\u0016J\u000e\u0010'\u001a\u00020\u00132\u0006\u0010(\u001a\u00020\u000eR\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0083\u000e¢\u0006\u0004\n\u0002\u0010\u000fR\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006*"}, d2 = {"Lcom/taobao/themis/pub/titlebar/action/PubAppNameAction;", "Lcom/taobao/themis/kernel/container/ui/titlebar/Action;", "Lcom/taobao/themis/container/title/action/base/IAppNameAction;", "Lcom/taobao/themis/container/title/action/base/IImageTitleAction;", "mInvisibleCallback", "Lcom/taobao/themis/pub/titlebar/action/PubAppNameAction$AppNameInvisibleCallback;", "(Lcom/taobao/themis/pub/titlebar/action/PubAppNameAction$AppNameInvisibleCallback;)V", "mContext", "Landroid/content/Context;", "mImageView", "Landroid/widget/ImageView;", "mTextView", "Landroid/widget/TextView;", "mTitleColor", "", "Ljava/lang/Integer;", "mTitleView", "Landroid/view/View;", "changeViewParams", "", "getTitleColor", "getView", "context", "setAppNameColor", "color", "(Ljava/lang/Integer;)V", "setAppNameVisible", "visible", "setName", "name", "", "setStyle", "style", "Lcom/taobao/themis/kernel/container/Window$Theme;", "setTitleIcon", com.taobao.share.ui.engine.friend.a.CONTACTS_INFO_NOT_EMPTY_STATUS, "Landroid/graphics/drawable/Drawable;", "url", "setTitleIconVisible", "setTitleMaxWidth", "maxWidth", "AppNameInvisibleCallback", "themis_pub_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class b extends com.taobao.themis.kernel.container.ui.titlebar.a implements com.taobao.themis.container.title.action.base.a, com.taobao.themis.container.title.action.base.c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private TextView f22754a;
    private ImageView b;
    private View c;
    private Context d;
    private final a e;
    private Integer f;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/taobao/themis/pub/titlebar/action/PubAppNameAction$AppNameInvisibleCallback;", "", "onInvisible", "", "themis_pub_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public interface a {
        void a();
    }

    static {
        kge.a(-1414744558);
        kge.a(-1158459655);
        kge.a(-442752612);
    }

    public b(a mInvisibleCallback) {
        q.d(mInvisibleCallback, "mInvisibleCallback");
        this.e = mInvisibleCallback;
    }

    @Override // com.taobao.themis.kernel.container.ui.titlebar.a
    public View a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("876fa4a2", new Object[]{this, context});
        }
        q.d(context, "context");
        if (this.c == null) {
            View view = null;
            this.c = View.inflate(context, R.layout.tms_pub_title, null);
            this.d = context;
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, k.a(context, 48.0f));
            layoutParams.setMargins(k.a(context, 5.0f), 0, 0, 0);
            View view2 = this.c;
            if (view2 != null) {
                view2.setLayoutParams(layoutParams);
            }
            View view3 = this.c;
            View findViewById = view3 != null ? view3.findViewById(R.id.tvTitle) : null;
            if (findViewById == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
            }
            this.f22754a = (TextView) findViewById;
            View view4 = this.c;
            if (view4 != null) {
                view = view4.findViewById(R.id.imgTitleBg);
            }
            if (view == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
            }
            this.b = (ImageView) view;
            ImageView imageView = this.b;
            if (imageView != null) {
                imageView.setAdjustViewBounds(true);
            }
            View view5 = this.c;
            if (view5 != null) {
                view5.setTag("PubAppNameAction");
            }
        }
        return this.c;
    }

    @Override // com.taobao.themis.container.title.action.base.a
    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        ImageView imageView = this.b;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        TextView textView = this.f22754a;
        if (textView == null) {
            return;
        }
        String str2 = str;
        if (StringUtils.isEmpty(str2)) {
            textView.setVisibility(8);
            this.e.a();
            return;
        }
        textView.setVisibility(0);
        textView.setText(str2);
        textView.setTypeface(Typeface.defaultFromStyle(1));
    }

    @Override // com.taobao.themis.container.title.action.base.a
    public void a(Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6cdec50f", new Object[]{this, num});
        } else if (num == null) {
            this.f = null;
        } else {
            try {
                TextView textView = this.f22754a;
                if (textView != null) {
                    textView.setTextColor(num.intValue());
                }
                this.f = num;
            } catch (Throwable th) {
                TMSLogger.b("PubAppNameAction", th.getMessage(), th);
            }
        }
    }

    @Override // com.taobao.themis.container.title.action.base.c
    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else if (StringUtils.isEmpty(str)) {
        } else {
            ImageView imageView = this.b;
            if (imageView != null) {
                imageView.setVisibility(0);
                IImageAdapter.b bVar = new IImageAdapter.b();
                bVar.a("HEIGHT_LIMIT");
                IImageAdapter iImageAdapter = (IImageAdapter) qpt.b(IImageAdapter.class);
                if (iImageAdapter != null) {
                    q.a((Object) str);
                    iImageAdapter.setImageUrl(imageView, str, bVar);
                }
            }
            TextView textView = this.f22754a;
            if (textView == null) {
                return;
            }
            textView.setVisibility(8);
        }
    }

    @Override // com.taobao.themis.container.title.action.base.c
    public void a(Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd037b8c", new Object[]{this, drawable});
            return;
        }
        ImageView imageView = this.b;
        if (imageView != null) {
            imageView.setVisibility(0);
            imageView.setImageDrawable(drawable);
        }
        View view = this.c;
        if (view == null) {
            return;
        }
        view.setVisibility(8);
    }

    public final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        ImageView imageView = this.b;
        if (imageView != null) {
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            }
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            layoutParams2.leftMargin = k.a(this.d, 7.0f);
            imageView.setLayoutParams(layoutParams2);
        }
        TextView textView = this.f22754a;
        if (textView == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams3 = textView.getLayoutParams();
        if (layoutParams3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        }
        LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) layoutParams3;
        layoutParams4.leftMargin = k.a(this.d, 7.0f);
        textView.setLayoutParams(layoutParams4);
    }

    @Override // com.taobao.themis.kernel.container.ui.titlebar.a
    public void a(Window.Theme style) {
        TextView textView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("209b885a", new Object[]{this, style});
            return;
        }
        q.d(style, "style");
        if (this.f != null || (textView = this.f22754a) == null) {
            return;
        }
        textView.setTextColor(style == Window.Theme.LIGHT ? -1 : Color.parseColor("#333333"));
    }

    public final void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
            return;
        }
        TextView textView = this.f22754a;
        if (textView != null) {
            textView.setMaxWidth(i);
        }
        ImageView imageView = this.b;
        if (imageView == null) {
            return;
        }
        imageView.setMaxWidth(i);
    }
}
