package com.taobao.themis.pub.splash;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.alipay.android.msp.constants.MspFlybirdDefine;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.themis.container.splash.ProgressView;
import com.taobao.themis.kernel.adapter.IImageAdapter;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import com.taobao.uikit.feature.features.RoundFeature;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.kge;
import tb.kkr;
import tb.qpt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005B\u0017\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bB\u001f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u000fH\u0016J\u0010\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u000fH\u0016J\u0018\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u000fH\u0002J\u0010\u0010\u001f\u001a\u00020\u00172\u0006\u0010 \u001a\u00020!H\u0016J\u0010\u0010\u001f\u001a\u00020\u00172\u0006\u0010\u001e\u001a\u00020\u000fH\u0016J\u0010\u0010\"\u001a\u00020\u00172\u0006\u0010#\u001a\u00020$H\u0016R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Lcom/taobao/themis/pub/splash/PubLoadingPage;", "Landroid/widget/RelativeLayout;", "Lcom/taobao/themis/container/splash/loading/ILoadingPage;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attributeSet", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "mImageView", "Lcom/taobao/uikit/extend/feature/view/TUrlImageView;", "mLogo", "", "mName", "mProgressView", "Lcom/taobao/themis/container/splash/ProgressView;", "mTextView", "Landroid/widget/TextView;", "mTips", "setAppName", "", "name", "setDeveloper", "developer", "setImage", "image", "Landroid/widget/ImageView;", MspFlybirdDefine.FLYBIRD_DIALOG_LOGO, "setLogo", com.taobao.share.ui.engine.friend.a.CONTACTS_INFO_NOT_EMPTY_STATUS, "Landroid/graphics/drawable/Drawable;", "setProcess", kkr.PERCENT, "", "themis_pub_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class PubLoadingPage extends RelativeLayout implements com.taobao.themis.container.splash.loading.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final TUrlImageView mImageView;
    private String mLogo;
    private String mName;
    private final ProgressView mProgressView;
    private final TextView mTextView;
    private final TextView mTips;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/taobao/themis/pub/splash/PubLoadingPage$setImage$1", "Lcom/taobao/themis/kernel/adapter/IImageAdapter$ImageListener;", "onImageFinish", "", com.taobao.share.ui.engine.friend.a.CONTACTS_INFO_NOT_EMPTY_STATUS, "Landroid/graphics/drawable/Drawable;", "themis_pub_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class a implements IImageAdapter.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ ImageView b;

        public a(ImageView imageView) {
            this.b = imageView;
        }

        @Override // com.taobao.themis.kernel.adapter.IImageAdapter.a
        public void a(Drawable drawable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dd037b8c", new Object[]{this, drawable});
            } else if (!(drawable instanceof BitmapDrawable)) {
            } else {
                this.b.setImageDrawable(drawable);
                if (!(this.b.getContext() instanceof Activity) || Build.VERSION.SDK_INT < 21) {
                    return;
                }
                ActivityManager.TaskDescription taskDescription = new ActivityManager.TaskDescription(PubLoadingPage.access$getMName$p(PubLoadingPage.this), ((BitmapDrawable) drawable).getBitmap());
                Context context = this.b.getContext();
                if (context == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.app.Activity");
                }
                ((Activity) context).setTaskDescription(taskDescription);
            }
        }
    }

    static {
        kge.a(-848866418);
        kge.a(87947417);
    }

    public static /* synthetic */ Object ipc$super(PubLoadingPage pubLoadingPage, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.themis.container.splash.loading.a
    public void setDeveloper(String developer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce9dfe19", new Object[]{this, developer});
        } else {
            q.d(developer, "developer");
        }
    }

    public void setProcess(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b36908c", new Object[]{this, new Float(f)});
        }
    }

    public static final /* synthetic */ String access$getMName$p(PubLoadingPage pubLoadingPage) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("acde5642", new Object[]{pubLoadingPage}) : pubLoadingPage.mName;
    }

    public static final /* synthetic */ void access$setMName$p(PubLoadingPage pubLoadingPage, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d5aea74", new Object[]{pubLoadingPage, str});
        } else {
            pubLoadingPage.mName = str;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PubLoadingPage(Context context) {
        super(context);
        q.d(context, "context");
        RelativeLayout.inflate(getContext(), R.layout.tms_pub_loading_view, this);
        setClickable(true);
        View findViewById = findViewById(R.id.tips);
        q.b(findViewById, "findViewById(R.id.tips)");
        this.mTips = (TextView) findViewById;
        View findViewById2 = findViewById(R.id.progressView);
        ProgressView progressView = (ProgressView) findViewById2;
        progressView.setDotMargin(4.5f);
        progressView.setDotSize(3.0f);
        t tVar = t.INSTANCE;
        q.b(findViewById2, "findViewById<ProgressVie… setDotSize(3f)\n        }");
        this.mProgressView = progressView;
        View findViewById3 = findViewById(R.id.appName);
        TextView textView = (TextView) findViewById3;
        if (!TextUtils.isEmpty(this.mName)) {
            q.b(textView, "this");
            textView.setText(this.mName);
        }
        t tVar2 = t.INSTANCE;
        q.b(findViewById3, "findViewById<TextView?>(…e\n            }\n        }");
        this.mTextView = textView;
        View findViewById4 = findViewById(R.id.appLogo);
        TUrlImageView tUrlImageView = (TUrlImageView) findViewById4;
        tUrlImageView.addFeature(new RoundFeature());
        if (!TextUtils.isEmpty(this.mLogo)) {
            q.b(tUrlImageView, "this");
            String str = this.mLogo;
            q.a((Object) str);
            setImage(tUrlImageView, str);
        }
        t tVar3 = t.INSTANCE;
        q.b(findViewById4, "findViewById<TUrlImageVi…)\n            }\n        }");
        this.mImageView = tUrlImageView;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PubLoadingPage(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        q.d(context, "context");
        q.d(attributeSet, "attributeSet");
        RelativeLayout.inflate(getContext(), R.layout.tms_pub_loading_view, this);
        setClickable(true);
        View findViewById = findViewById(R.id.tips);
        q.b(findViewById, "findViewById(R.id.tips)");
        this.mTips = (TextView) findViewById;
        View findViewById2 = findViewById(R.id.progressView);
        ProgressView progressView = (ProgressView) findViewById2;
        progressView.setDotMargin(4.5f);
        progressView.setDotSize(3.0f);
        t tVar = t.INSTANCE;
        q.b(findViewById2, "findViewById<ProgressVie… setDotSize(3f)\n        }");
        this.mProgressView = progressView;
        View findViewById3 = findViewById(R.id.appName);
        TextView textView = (TextView) findViewById3;
        if (!TextUtils.isEmpty(this.mName)) {
            q.b(textView, "this");
            textView.setText(this.mName);
        }
        t tVar2 = t.INSTANCE;
        q.b(findViewById3, "findViewById<TextView?>(…e\n            }\n        }");
        this.mTextView = textView;
        View findViewById4 = findViewById(R.id.appLogo);
        TUrlImageView tUrlImageView = (TUrlImageView) findViewById4;
        tUrlImageView.addFeature(new RoundFeature());
        if (!TextUtils.isEmpty(this.mLogo)) {
            q.b(tUrlImageView, "this");
            String str = this.mLogo;
            q.a((Object) str);
            setImage(tUrlImageView, str);
        }
        t tVar3 = t.INSTANCE;
        q.b(findViewById4, "findViewById<TUrlImageVi…)\n            }\n        }");
        this.mImageView = tUrlImageView;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PubLoadingPage(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        q.d(context, "context");
        q.d(attributeSet, "attributeSet");
        RelativeLayout.inflate(getContext(), R.layout.tms_pub_loading_view, this);
        setClickable(true);
        View findViewById = findViewById(R.id.tips);
        q.b(findViewById, "findViewById(R.id.tips)");
        this.mTips = (TextView) findViewById;
        View findViewById2 = findViewById(R.id.progressView);
        ProgressView progressView = (ProgressView) findViewById2;
        progressView.setDotMargin(4.5f);
        progressView.setDotSize(3.0f);
        t tVar = t.INSTANCE;
        q.b(findViewById2, "findViewById<ProgressVie… setDotSize(3f)\n        }");
        this.mProgressView = progressView;
        View findViewById3 = findViewById(R.id.appName);
        TextView textView = (TextView) findViewById3;
        if (!TextUtils.isEmpty(this.mName)) {
            q.b(textView, "this");
            textView.setText(this.mName);
        }
        t tVar2 = t.INSTANCE;
        q.b(findViewById3, "findViewById<TextView?>(…e\n            }\n        }");
        this.mTextView = textView;
        View findViewById4 = findViewById(R.id.appLogo);
        TUrlImageView tUrlImageView = (TUrlImageView) findViewById4;
        tUrlImageView.addFeature(new RoundFeature());
        if (!TextUtils.isEmpty(this.mLogo)) {
            q.b(tUrlImageView, "this");
            String str = this.mLogo;
            q.a((Object) str);
            setImage(tUrlImageView, str);
        }
        t tVar3 = t.INSTANCE;
        q.b(findViewById4, "findViewById<TUrlImageVi…)\n            }\n        }");
        this.mImageView = tUrlImageView;
    }

    @Override // com.taobao.themis.container.splash.loading.a
    public void setLogo(String logo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce8a5ffe", new Object[]{this, logo});
            return;
        }
        q.d(logo, "logo");
        if (TextUtils.equals(logo, this.mLogo)) {
            return;
        }
        setImage(this.mImageView, logo);
        this.mLogo = logo;
    }

    public void setLogo(Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cfeeb458", new Object[]{this, drawable});
            return;
        }
        q.d(drawable, "drawable");
        this.mImageView.setImageDrawable(drawable);
        if (Build.VERSION.SDK_INT < 21) {
            return;
        }
        ActivityManager.TaskDescription taskDescription = new ActivityManager.TaskDescription(this.mName, ((BitmapDrawable) drawable).getBitmap());
        Context context = this.mImageView.getContext();
        if (context == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.app.Activity");
        }
        ((Activity) context).setTaskDescription(taskDescription);
    }

    private final void setImage(ImageView imageView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f96f8524", new Object[]{this, imageView, str});
            return;
        }
        Object a2 = qpt.a(IImageAdapter.class);
        q.b(a2, "TMSAdapterManager.getNot…ImageAdapter::class.java)");
        ((IImageAdapter) a2).loadImage(str, null, new a(imageView));
    }

    @Override // com.taobao.themis.container.splash.loading.a
    public void setAppName(String name) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b790109b", new Object[]{this, name});
            return;
        }
        q.d(name, "name");
        this.mName = name;
        this.mTextView.setText(name);
    }
}
