package com.flybird;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.PaintDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.support.v4.view.AccessibilityDelegateCompat;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.support.v4.view.accessibility.AccessibilityNodeProviderCompat;
import android.text.Spannable;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AnimationSet;
import android.widget.AbsListView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.alibaba.android.aura.taobao.adapter.extension.linkage.service.utils.LinkageUtils;
import com.alipay.android.app.template.FBResourceClient;
import com.alipay.android.app.template.HtmlLite;
import com.alipay.android.app.template.ITemplateDisposable;
import com.alipay.android.app.template.event.TElementEventHandler;
import com.alipay.birdnest.api.BirdNestEngine;
import com.alipay.birdnest.platform.Platform;
import com.alipay.birdnest.util.FBLogger;
import com.alipay.birdnest.util.UiUtil;
import com.alipay.mobile.common.transportext.amnet.Baggage;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.flybird.FBDocument;
import com.flybird.FBScrollView;
import com.taobao.android.weex_framework.common.MUSConstants;
import com.taobao.android.weex_framework.util.a;
import com.taobao.weex.common.Constants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import mtopsdk.network.impl.ResponseProtocolType;
import org.android.agoo.common.AgooConstants;
import org.json.JSONObject;
import tb.cul;
import tb.cun;
import tb.ieb;
import tb.ied;
import tb.riy;

/* loaded from: classes4.dex */
public class FBView implements View.OnClickListener, View.OnFocusChangeListener, View.OnKeyListener, View.OnLongClickListener, View.OnTouchListener, ITemplateDisposable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int FB_SCROLL_EVENT_TYPE_DRAG = -1;
    public static final int FB_SCROLL_EVENT_TYPE_DROP = 0;
    public static final int FB_SCROLL_EVENT_TYPE_ONGOING = 1;
    public static final int FB_SCROLL_EVENT_TYPE_STOP = 2;
    public static final String KEY_BIZID = "bizid";
    public static final String TAG = "FBView";
    public static final String THEME_ASSOCIATED_TYPE_CSS = "CSS";
    public static final String THEME_ASSOCIATED_TYPE_PROP = "prop";

    /* renamed from: a */
    public static int f7183a = -1;
    public static HashMap<String, String> b;
    public boolean behaviorInfoSet;
    public String[] c;
    public boolean d;
    public String e;
    public Drawable f;
    public boolean fixUepInputClick;
    public int g;
    public float h;
    public float[] i;
    public float j;
    public float[] k;
    public boolean l;
    public boolean m;
    public volatile FBDocument mDoc;
    public Bundle mExtParams;
    public boolean mHasHeight;
    public boolean mHasWidth;
    public int mHeight;
    public boolean mNeedHandleClick;
    public boolean mNeedHandleLongClick;
    public boolean mNeedHandleMoreClick;
    public volatile long mNode;
    public float mOpacity;
    public boolean mOverScrollEnabled;
    public boolean mScrollListenerEnabled;
    public boolean mScrollVisibleDetectEnabled;
    public String mTag;
    public int mTransformDegree;
    public int mTransitionTime;
    public View mView;
    public int mWidth;
    public AnimationSet n;
    public int o;
    public final LinkedHashMap<String, String[]> p;
    public volatile long q;
    public boolean r;
    public boolean s;
    public volatile boolean t;
    public boolean themeModeUseColorMapping;
    public boolean themeModeUseMaskMapping;
    public final FBScrollView.FBScrollViewListener u;
    public FrameLayout.LayoutParams v;
    public AbsListView.LayoutParams w;
    public long x;
    public HashMap<String, String> y;
    public cul<Integer, Void> z;

    /* loaded from: classes4.dex */
    public static final class ValueWithUnit {
        public ValueWithUnit(float f, int i) {
        }
    }

    static {
        HashMap<String, String> hashMap = new HashMap<>(16);
        b = hashMap;
        hashMap.put("header", "android.widget.TextView");
        b.put("text", "android.widget.TextView");
        b.put("link", "android.widget.TextView");
        b.put("img", "android.widget.ImageView");
        b.put("image", "android.widget.ImageView");
        b.put(a.ATOM_EXT_button, "android.widget.Button");
        b.put("searchfield", "android.widget.SearchView");
        b.put(UiUtil.INPUT_TYPE_VALUE_CHECKBOX, "android.widget.CheckBox");
        b.put("list", "android.widget.ListView");
        b.put("listitem", "android.widget.CheckedTextView");
    }

    public FBView(Context context, View view, FBDocument fBDocument) {
        this.c = new String[3];
        this.d = false;
        this.h = Float.NaN;
        this.i = new float[8];
        this.j = Float.NaN;
        this.mWidth = 0;
        this.mHeight = 0;
        this.k = new float[4];
        this.m = true;
        this.o = 0;
        this.mNeedHandleClick = false;
        this.mNeedHandleLongClick = false;
        this.mNeedHandleMoreClick = false;
        this.mScrollVisibleDetectEnabled = false;
        this.mOverScrollEnabled = false;
        this.mScrollListenerEnabled = false;
        this.themeModeUseColorMapping = true;
        this.themeModeUseMaskMapping = false;
        this.p = new LinkedHashMap<>(8);
        this.r = true;
        this.s = false;
        this.mHasWidth = false;
        this.mHasHeight = false;
        this.mTransitionTime = -1;
        this.mTransformDegree = -1;
        this.t = false;
        this.mExtParams = new Bundle();
        this.u = new FBScrollView.FBScrollViewListener() { // from class: com.flybird.FBView.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            {
                FBView.this = this;
            }

            @Override // com.flybird.FBScrollView.FBScrollViewListener
            public void onScrollBegin(int i, int i2, boolean z) {
                FBDocument fBDocument2;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("4d7cff70", new Object[]{this, new Integer(i), new Integer(i2), new Boolean(z)});
                } else if (!z || (fBDocument2 = FBView.this.getFBDocument()) == null || fBDocument2.mCore == 0) {
                } else {
                    float dp = FBDocumentAssistor.getDp();
                    FBView.nativePlatformOnScroll(FBView.this.mNode, -1, (int) (i / dp), (int) (i2 / dp));
                }
            }

            @Override // com.flybird.FBScrollView.FBScrollViewListener
            public void onScrollChanged(int i, int i2, int i3, int i4, boolean z) {
                FBPartialVisibilityHelper fBPartialVisibilityHelper;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("3f8bab65", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Boolean(z)});
                    return;
                }
                FBDocument fBDocument2 = FBView.this.getFBDocument();
                if (fBDocument2 == null || fBDocument2.mCore == 0) {
                    return;
                }
                float dp = FBDocumentAssistor.getDp();
                FBView fBView = FBView.this;
                float f = i2 / dp;
                fBView.o = (int) (f + 0.5d);
                if (z) {
                    FBView.nativePlatformOnScroll(fBView.mNode, 1, (int) (i / dp), (int) f);
                }
                if (!FBView.this.mScrollVisibleDetectEnabled || (fBPartialVisibilityHelper = fBDocument2.K) == null) {
                    return;
                }
                fBPartialVisibilityHelper.a();
            }

            @Override // com.flybird.FBScrollView.FBScrollViewListener
            public void onScrollEnd(int i, int i2, boolean z) {
                FBDocument fBDocument2;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("c054adfe", new Object[]{this, new Integer(i), new Integer(i2), new Boolean(z)});
                } else if (!z || (fBDocument2 = FBView.this.getFBDocument()) == null || fBDocument2.mCore == 0) {
                } else {
                    float dp = FBDocumentAssistor.getDp();
                    FBView.nativePlatformOnScroll(FBView.this.mNode, 0, (int) (i / dp), (int) (i2 / dp));
                }
            }

            @Override // com.flybird.FBScrollView.FBScrollViewListener
            public void onScrollStop(int i, int i2, boolean z) {
                FBDocument fBDocument2;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5488451f", new Object[]{this, new Integer(i), new Integer(i2), new Boolean(z)});
                } else if (!z || (fBDocument2 = FBView.this.getFBDocument()) == null || fBDocument2.mCore == 0) {
                } else {
                    float dp = FBDocumentAssistor.getDp();
                    FBView.nativePlatformOnScroll(FBView.this.mNode, 2, (int) (i / dp), (int) (i2 / dp));
                }
            }
        };
        this.v = new FrameLayout.LayoutParams(0, 0);
        this.w = new AbsListView.LayoutParams(0, 0);
        this.mOpacity = 1.0f;
        this.y = null;
        this.z = null;
        this.mDoc = fBDocument;
        setInnerView(view == null ? new FBFrameLayout(context) : view);
    }

    public static /* synthetic */ boolean a(FBView fBView, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9973c6b3", new Object[]{fBView, new Boolean(z)})).booleanValue();
        }
        fBView.m = z;
        return z;
    }

    public void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
        } else if (this.mView == null) {
        } else {
            try {
                String str2 = Platform.f5257a;
            } catch (Throwable unused) {
            }
        }
    }

    public static void dispatchOnLongClickEvent(boolean z, boolean z2, View view, FBView fBView, View.OnLongClickListener onLongClickListener, int i) {
        ViewGroup viewGroup;
        int childCount;
        View childAt;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c6b56cf", new Object[]{new Boolean(z), new Boolean(z2), view, fBView, onLongClickListener, new Integer(i)});
        } else if (view != null && fBView != null) {
            if (!z2 && z && !fBView.needHandleLongClick()) {
                view.setOnLongClickListener(onLongClickListener);
                fBView.needHandleLongClick(true);
            } else if (fBView.needHandleLongClick()) {
                onLongClickListener = fBView;
            }
            if (!(view instanceof ViewGroup) || (childCount = (viewGroup = (ViewGroup) view).getChildCount()) == 0) {
                return;
            }
            for (int i2 = 0; i2 < childCount; i2++) {
                if (viewGroup instanceof FBScrollView) {
                    childAt = ((FBScrollView) viewGroup).getFbChildAt(i2);
                } else if (viewGroup instanceof FBHScrollView) {
                    childAt = ((FBHScrollView) viewGroup).b.getChildAt(i2);
                } else {
                    childAt = viewGroup.getChildAt(i2);
                }
                View view2 = childAt;
                if (view2 != null && (view2.getTag(i) instanceof FBView)) {
                    try {
                        dispatchOnLongClickEvent(fBView.needHandleLongClick(), fBView.needHandleClick(), view2, (FBView) view2.getTag(i), onLongClickListener, i);
                    } catch (Throwable th) {
                        FBLogger.e(TAG, "subView.getTag fatal error, tagId: " + i, th);
                    }
                }
            }
        }
    }

    public static /* synthetic */ void lambda$4RHneod3Yv_qG5z1N2JBoOXEHhs(FBView fBView, String str) {
        fBView.a(str);
    }

    /* renamed from: lambda$BxBJuOrFCs1-hdnk_aKkVpoPVW4 */
    public static /* synthetic */ void m653lambda$BxBJuOrFCs1hdnk_aKkVpoPVW4(FBView fBView, String str) {
        fBView.b(str);
    }

    /* renamed from: lambda$R2PVQFL9f3a9qGC-PhB9sBHUOjg */
    public static /* synthetic */ Void m654lambda$R2PVQFL9f3a9qGCPhB9sBHUOjg(FBView fBView, Integer num) {
        return fBView.a(num);
    }

    public static /* synthetic */ void lambda$d_sIj4Ye21GJ7brgKLeFHXT3K_s(FBView fBView) {
        fBView.c();
    }

    public static /* synthetic */ void lambda$dqWzhK3JCk3JSjmjDPwCbed1G9I(FBView fBView, boolean z) {
        fBView.a(z);
    }

    public static /* synthetic */ void lambda$hgGqBFrT39GjCakPmC5OBRM4OPs(FBView fBView, String str) {
        fBView.c(str);
    }

    public static native boolean nativePlatformInvokeCallback(long j, String str, String str2);

    public static native boolean nativePlatformIsStableNode(long j);

    public static native boolean nativePlatformOnBlur(long j);

    public static native boolean nativePlatformOnCallback(long j, String str, String str2);

    public static native int nativePlatformOnChange(long j, String str);

    public static native boolean nativePlatformOnClick(long j);

    public static native boolean nativePlatformOnFocus(long j);

    public static native int nativePlatformOnInput(long j, String str);

    public static native boolean nativePlatformOnItemClick(long j, int i, int i2, long j2);

    public static native boolean nativePlatformOnKeyDown(long j, int i);

    public static native boolean nativePlatformOnLoadMore(long j);

    public static native boolean nativePlatformOnLongpress(long j);

    public static native boolean nativePlatformOnMoreClick(long j);

    public static native boolean nativePlatformOnMouseDown(long j, int i, int i2);

    public static native boolean nativePlatformOnMouseMove(long j, int i, int i2);

    public static native boolean nativePlatformOnMouseUp(long j, int i, int i2);

    public static native boolean nativePlatformOnNativeScheme(long j, String str);

    public static native boolean nativePlatformOnRefresh(long j);

    public static native void nativePlatformOnScroll(long j, int i, int i2, int i3);

    public static native boolean nativePlatformValidateEvent(long j, String str);

    public static float parseFontSize(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("314ab304", new Object[]{str})).floatValue();
        }
        String str2 = "px";
        if (!str.contains(str2)) {
            str2 = "rem";
        }
        int indexOf = str.indexOf(str2);
        if (indexOf != -1) {
            str = str.substring(0, indexOf);
        }
        try {
            return Float.parseFloat(str);
        } catch (NumberFormatException unused) {
            return 18.0f;
        }
    }

    public static ValueWithUnit parseFontSizeWithUnits(String str) {
        int i;
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ValueWithUnit) ipChange.ipc$dispatch("cf1af1e5", new Object[]{str});
        }
        if (str.contains("px")) {
            i2 = str.indexOf("px");
            i = Platform.f;
        } else if (str.contains("rem")) {
            i2 = str.indexOf("rem");
            i = Platform.f;
        } else if (str.contains("PX")) {
            i2 = str.indexOf("PX");
            i = 0;
        } else {
            i = Platform.f;
            i2 = -1;
        }
        if (i2 != -1) {
            str = str.substring(0, i2);
        }
        try {
            return new ValueWithUnit(Float.parseFloat(str), i);
        } catch (NumberFormatException unused) {
            return new ValueWithUnit(18.0f, Platform.f);
        }
    }

    public void addView(FBView fBView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76744a", new Object[]{this, fBView});
        } else {
            ((ViewGroup) getInnerView()).addView(fBView.getInnerView());
        }
    }

    public final void b(boolean z) {
        Drawable loadLocalDrawable;
        FBResourceClient fBResourceClient;
        Object shouldInterceptResource;
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
        } else if (!this.mDoc.isOnloadFinish() && z) {
        } else {
            String[] strArr = this.c;
            if (strArr[0] == null && strArr[1] == null && strArr[2] == null) {
                if (this.e != null) {
                    getFBDocument().getClass();
                    int i2 = this.mWidth;
                    int[] iArr = (i2 <= 0 || (i = this.mHeight) <= 0) ? null : new int[]{i2, i};
                    Context context = this.mDoc.k;
                    this.mDoc.getClass();
                    if (!TextUtils.isEmpty(this.e) && !this.e.startsWith("http") && !this.e.startsWith("https") && !this.e.startsWith("www") && !this.e.startsWith("data:") && this.e.contains("/")) {
                        loadLocalDrawable = this.mDoc.getEngine().getImageLoader().loadLocalDrawable(this.mDoc.getEngine().getConfig().getResourceProvider(), context, this.e, this.mDoc.param.bundleName, iArr, true, this.mView, false, false);
                    } else {
                        loadLocalDrawable = this.mDoc.getEngine().getImageLoader().loadLocalDrawable(this.mDoc.getEngine().getConfig().getResourceProvider(), context, this.e, this.mDoc.param.bundleName, iArr, true, this.mView, false, false);
                    }
                    if (loadLocalDrawable == null) {
                        this.mDoc.getEngine().getImageLoader().loadImage(this.mDoc.getEngine(), this.mView, this.e, this.mDoc.param.bundleName, iArr, true, null, null, 0, false, null, null, new BirdNestEngine.ResourceProvider.Callback() { // from class: com.flybird.FBView.4
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            {
                                FBView.this = this;
                            }

                            @Override // com.alipay.birdnest.api.BirdNestEngine.ResourceProvider.Callback
                            public void onLoadFailure(int i3, int i4, Object obj) {
                                IpChange ipChange2 = $ipChange;
                                if (ipChange2 instanceof IpChange) {
                                    ipChange2.ipc$dispatch("4bc2b2a8", new Object[]{this, new Integer(i3), new Integer(i4), obj});
                                    return;
                                }
                                FBView.this.mDoc.executeJs("document.onImgLoaded && typeof document.onImgLoaded === 'function' && document.onImgLoaded(false,\"" + FBView.this.e + "\");");
                            }

                            @Override // com.alipay.birdnest.api.BirdNestEngine.ResourceProvider.Callback
                            public void onLoadSuccess(int i3, int i4, Object obj) {
                                IpChange ipChange2 = $ipChange;
                                if (ipChange2 instanceof IpChange) {
                                    ipChange2.ipc$dispatch("a1462621", new Object[]{this, new Integer(i3), new Integer(i4), obj});
                                    return;
                                }
                                FBView.this.mDoc.executeJs("document.onImgLoaded && typeof document.onImgLoaded === 'function' && document.onImgLoaded(true,\"" + FBView.this.e + "\");");
                            }
                        }, getExtraParams());
                    }
                    if (loadLocalDrawable == null && (fBResourceClient = this.mDoc.param.resourceClient) != null && !TextUtils.isEmpty(this.e) && (shouldInterceptResource = fBResourceClient.shouldInterceptResource(this.e, FBResourceClient.Type.DRAWABLE)) != null) {
                        this.mView.setBackgroundDrawable((Drawable) shouldInterceptResource);
                        return;
                    } else if (loadLocalDrawable == null) {
                        return;
                    } else {
                        this.mView.setBackgroundDrawable(loadLocalDrawable);
                        return;
                    }
                } else if (this.f != null) {
                    if (getFBDocument() != null) {
                        getFBDocument().getClass();
                    }
                    if (this.f instanceof PaintDrawable) {
                        if (!Float.isNaN(this.j)) {
                            float f = this.j;
                            if (f > 0.0f) {
                                ((PaintDrawable) this.f).setCornerRadius(f);
                            }
                        }
                        ((PaintDrawable) this.f).setCornerRadii(this.i);
                    }
                    if (Build.VERSION.SDK_INT >= 16) {
                        this.mView.setBackground(this.f);
                        return;
                    } else {
                        this.mView.setBackgroundDrawable(this.f);
                        return;
                    }
                } else if (this.d && strArr[0] != null) {
                    GradientDrawable gradientDrawable = new GradientDrawable();
                    gradientDrawable.mutate();
                    gradientDrawable.setShape(0);
                    gradientDrawable.setColor(Color.parseColor("#CABBBBBB"));
                    if (!Float.isNaN(this.j)) {
                        gradientDrawable.setCornerRadius(this.j);
                    }
                    GradientDrawable gradientDrawable2 = new GradientDrawable();
                    gradientDrawable2.mutate();
                    gradientDrawable2.setShape(0);
                    gradientDrawable2.setColor(Color.parseColor(this.c[0]));
                    if (!Float.isNaN(this.j)) {
                        gradientDrawable2.setCornerRadius(this.j);
                    }
                    LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{gradientDrawable, gradientDrawable2});
                    layerDrawable.setLayerInset(1, 0, 0, 0, 0);
                    int i3 = Build.VERSION.SDK_INT;
                    if (i3 >= 21) {
                        this.mView.setElevation(18.0f);
                    }
                    if (i3 >= 16) {
                        this.mView.setBackground(layerDrawable);
                        return;
                    } else {
                        this.mView.setBackgroundDrawable(layerDrawable);
                        return;
                    }
                } else if (Float.isNaN(this.h) && Float.isNaN(this.j)) {
                    return;
                } else {
                    this.mView.setBackgroundDrawable(FBTools.generateBackGroundDrawable(this.h, this.g, this.j, this.i, null, 1.0f, FBDocumentAssistor.c(this.mDoc), FBDocumentAssistor.b(this.mDoc), this.themeModeUseColorMapping));
                    return;
                }
            }
            this.mView.setBackgroundDrawable(FBTools.generateBackGroundDrawable(this.h, this.g, this.j, this.i, strArr, 1.0f, FBDocumentAssistor.c(this.mDoc), FBDocumentAssistor.b(this.mDoc), this.themeModeUseColorMapping));
        }
    }

    public final float d(String str) {
        float remScale;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d23b17e5", new Object[]{this, str})).floatValue();
        }
        float dp = str.endsWith("PX") ? 1.0f : FBDocumentAssistor.getDp();
        try {
            if (str.endsWith("px")) {
                dp *= Float.parseFloat(str.substring(0, str.length() - 2));
                if (nativePlatformIsStableNode(this.mNode) || !this.mDoc.s) {
                    return dp;
                }
                remScale = this.mDoc.getRemScale();
            } else if (str.endsWith("PX")) {
                remScale = Float.parseFloat(str.substring(0, str.length() - 2));
            } else if (nativePlatformIsStableNode(this.mNode) || !str.endsWith("rem")) {
                return dp;
            } else {
                dp *= Float.parseFloat(str.substring(0, str.length() - 3));
                remScale = this.mDoc.getRemScale();
            }
            return dp * remScale;
        } catch (Exception e) {
            FBLogger.e(getClass().getName(), "exception", e);
            return dp;
        }
    }

    @Override // com.alipay.android.app.template.ITemplateDisposable
    public void destroy() {
        FBView value;
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        this.t = true;
        if (this == this.mDoc.mRoot) {
            z = true;
        }
        if (!z) {
            doDestroy();
            return;
        }
        for (Map.Entry<String, FBView> entry : this.mDoc.F.entrySet()) {
            if (entry != null && entry.getValue() != null && (value = entry.getValue()) != this) {
                value.doDestroy();
            }
        }
        this.mDoc = null;
        doDestroy();
    }

    public void doDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e637df6", new Object[]{this});
            return;
        }
        this.mDoc = null;
        this.v = null;
        this.k = null;
        View view = this.mView;
        if (view instanceof IBorderable) {
            ((IBorderable) view).destroy();
        }
        this.mView = null;
        this.mTag = null;
        this.c = null;
    }

    @Override // com.alipay.android.app.template.ITemplateDisposable
    public int getContextHashCode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("bfc6032e", new Object[]{this})).intValue() : this.mDoc.k.hashCode();
    }

    public String getEncryptValue() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("71c53bb7", new Object[]{this}) : "";
    }

    public Bundle getExtraParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bundle) ipChange.ipc$dispatch("72a8820b", new Object[]{this});
        }
        if (!this.mExtParams.containsKey("bizid") && this.mDoc != null && this.mDoc.getTid() != null) {
            Bundle bundle = this.mExtParams;
            bundle.putString("bizid", "BirdNest@" + this.mDoc.getTid());
        }
        return this.mExtParams;
    }

    public FBDocument getFBDocument() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FBDocument) ipChange.ipc$dispatch("cc27f2a9", new Object[]{this}) : this.mDoc;
    }

    public View getInnerView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("3a4c32ae", new Object[]{this}) : this.mView;
    }

    public int getInnerViewTag() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("637f7fef", new Object[]{this})).intValue();
        }
        if (f7183a == -1) {
            f7183a = this.mDoc.getEngine().getConfig().getIdProvider().getUniqueResId("alipay_msp_view_wrapper");
            cun.b(TAG, "innerViewId -> " + f7183a + " from " + this.mDoc.getEngine().getConfig().getIdProvider());
            int i = f7183a;
            if (i <= 0 || (i >>> 24) < 2) {
                cun.a(TAG, "id provider err 3. " + f7183a + " from " + this.mDoc.getEngine().getConfig().getIdProvider());
            }
        }
        return f7183a;
    }

    public long getNode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("beb89ef3", new Object[]{this})).longValue() : this.mNode;
    }

    public float getOpacity() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("2242c5cc", new Object[]{this})).floatValue() : this.mOpacity;
    }

    public int getScrollTop() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("94b1300c", new Object[]{this})).intValue() : this.o;
    }

    public String getTag() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("54a5a515", new Object[]{this}) : this.mTag;
    }

    @Override // com.alipay.android.app.template.ITemplateDisposable
    public boolean hiddenKeyboardService(boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("61ef5fed", new Object[]{this, new Boolean(z)})).booleanValue() : this.mDoc.hiddenKeyboardService(((Activity) this.mDoc.k).getWindow().getDecorView(), z);
    }

    public String invoke(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b56de6d", new Object[]{this, str, str2});
        }
        if (str == null) {
            return null;
        }
        FBLogger.d(TAG, "invoke -> " + str + ResponseProtocolType.COMMENT + str2);
        if (str.equals("fireBehavior")) {
            try {
                if (Looper.getMainLooper() != Looper.myLooper()) {
                    FBLogger.e(TAG, "behavior must be fired in main thread");
                    return null;
                }
                String str3 = Platform.f5257a;
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    @Override // com.alipay.android.app.template.ITemplateDisposable
    public boolean isDestroyed() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d65bd1a", new Object[]{this})).booleanValue() : this.mDoc == null || this.mDoc.mCore == 0 || this.t || this.mView == null;
    }

    public boolean isScrollVisibleDetectEnabled() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c9c0fe0e", new Object[]{this})).booleanValue() : this.mScrollVisibleDetectEnabled;
    }

    public boolean needHandleClick() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("68e89555", new Object[]{this})).booleanValue() : this.mNeedHandleClick;
    }

    public boolean needHandleLongClick() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f0dc0939", new Object[]{this})).booleanValue() : this.mNeedHandleLongClick;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
        } else if (isDestroyed() || this.q != this.mDoc.mCore) {
        } else {
            if (getFBDocument() != null) {
                getFBDocument().getClass();
            }
            FBDocument.ClickMode clickMode = this.mDoc.getClickMode();
            if (clickMode == FBDocument.ClickMode.GLOBAL_PROTECT_CLICK) {
                if (!this.mDoc.getGlobalClick()) {
                    return;
                }
                this.mDoc.setGlobalClick(false);
            } else if (clickMode == FBDocument.ClickMode.INDIVIDUAL_PROTECT_CLICK) {
                if (!this.m) {
                    return;
                }
                this.m = false;
                this.mDoc.b0.postDelayed(new Runnable() { // from class: com.flybird.FBView.8
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    {
                        FBView.this = this;
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            FBView.a(FBView.this, true);
                        }
                    }
                }, 600);
            }
            if (this.mDoc.getElementEventObserver() != null) {
                this.mDoc.getElementEventObserver().onEvent(TElementEventHandler.EventType.CLICK, null, null, this.mDoc);
            }
            nativePlatformOnClick(this.mNode);
        }
    }

    public void onFocusChange(View view, final boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1621df92", new Object[]{this, view, new Boolean(z)});
        } else {
            view.post(new Runnable() { // from class: com.flybird.-$$Lambda$FBView$dqWzhK3JCk3JSjmjDPwCbed1G9I
                {
                    FBView.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    FBView.lambda$dqWzhK3JCk3JSjmjDPwCbed1G9I(FBView.this, z);
                }
            });
        }
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bdbaa648", new Object[]{this, view, new Integer(i), keyEvent})).booleanValue();
        }
        if (isDestroyed()) {
            return true;
        }
        if (i == 4) {
            if (!this.mDoc.getGlobalClick()) {
                return true;
            }
            this.mDoc.setGlobalClick(false);
            if (hiddenKeyboardService(false)) {
                return true;
            }
            if (this.mDoc.mCore != 0) {
                return nativePlatformOnKeyDown(this.mNode, i);
            }
        }
        return false;
    }

    public void onLoadFinish() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b23670df", new Object[]{this});
        } else if (isDestroyed()) {
        } else {
            b(false);
            View view = this.mView;
            if ((!(view instanceof FBScrollView) && !(view instanceof FBHScrollView)) || !this.mDoc.isFullscreen() || !this.mDoc.c0 || this.mView.getLayoutParams() == null) {
                return;
            }
            ((FrameLayout.LayoutParams) this.mView.getLayoutParams()).height = -1;
            this.mDoc.mo650getBodyView().v.height = -1;
        }
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View view) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("7edba102", new Object[]{this, view})).booleanValue() : isDestroyed() || nativePlatformOnLongpress(this.mNode);
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        FBDocument fBDocument;
        FBDocument fBDocument2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d4aa3aa4", new Object[]{this, view, motionEvent})).booleanValue();
        }
        if (isDestroyed()) {
            return true;
        }
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action == 2) {
                    float dp = FBDocumentAssistor.getDp();
                    boolean nativePlatformOnMouseMove = nativePlatformOnMouseMove(this.mNode, (int) (motionEvent.getRawX() / dp), (int) (motionEvent.getRawY() / dp));
                    if (this.mDoc != null && (fBDocument2 = this.mDoc) != null) {
                        for (int i = 0; i < fBDocument2.I.size(); i++) {
                            fBDocument2.I.get(i).setScrollable(false);
                        }
                        for (int i2 = 0; i2 < fBDocument2.J.size(); i2++) {
                            fBDocument2.J.get(i2).setScrollable(false);
                        }
                    }
                    return nativePlatformOnMouseMove;
                } else if (action != 3) {
                    return false;
                }
            }
            float dp2 = FBDocumentAssistor.getDp();
            boolean nativePlatformOnMouseUp = nativePlatformOnMouseUp(this.mNode, (int) (motionEvent.getRawX() / dp2), (int) (motionEvent.getRawY() / dp2));
            if (this.mDoc != null && (fBDocument = this.mDoc) != null) {
                for (int i3 = 0; i3 < fBDocument.I.size(); i3++) {
                    fBDocument.I.get(i3).setScrollable(true);
                }
                for (int i4 = 0; i4 < fBDocument.J.size(); i4++) {
                    fBDocument.J.get(i4).setScrollable(true);
                }
            }
            if (System.currentTimeMillis() - this.x < 500) {
                view.performClick();
            }
            return nativePlatformOnMouseUp;
        }
        float dp3 = FBDocumentAssistor.getDp();
        boolean nativePlatformOnMouseDown = nativePlatformOnMouseDown(this.mNode, (int) (motionEvent.getRawX() / dp3), (int) (motionEvent.getRawY() / dp3));
        this.x = nativePlatformOnMouseDown ? System.currentTimeMillis() : 0L;
        if ((motionEvent.getFlags() & 2) == 0) {
            return nativePlatformOnMouseDown;
        }
        FBDocument fBDocument3 = this.mDoc;
        return nativePlatformOnMouseDown;
    }

    public void onVisibilityChange(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dfcb329b", new Object[]{this, new Integer(i)});
        }
    }

    public void performOnVisibilityChange(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c71a5cb", new Object[]{this, new Boolean(z)});
        } else if (this.mNode == 0) {
        } else {
            nativePlatformInvokeCallback(this.mNode, "onvisibleinparentchange", String.valueOf(z));
        }
    }

    public void putThemeModeAssociatedActions(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae77fc7f", new Object[]{this, str, str2, str3});
            return;
        }
        String str4 = str + ":" + str2;
        this.p.remove(str4);
        this.p.put(str4, new String[]{str2, str3});
    }

    public void removeView(FBView fBView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("357311ad", new Object[]{this, fBView});
        } else {
            ((ViewGroup) getInnerView()).removeView(fBView.getInnerView());
        }
    }

    public void replayThemeModeAssociatedActions() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc6b3839", new Object[]{this});
            return;
        }
        for (Map.Entry<String, String[]> entry : this.p.entrySet()) {
            String key = entry.getKey();
            key.hashCode();
            if (key.equals(THEME_ASSOCIATED_TYPE_CSS)) {
                updateCSS(entry.getValue()[0], entry.getValue()[1]);
            } else if (key.equals(THEME_ASSOCIATED_TYPE_PROP)) {
                updateAttr(entry.getValue()[0], entry.getValue()[1]);
            }
        }
    }

    public void setInnerView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63cd68f2", new Object[]{this, view});
        } else if (view == null) {
        } else {
            this.mView = view;
            try {
                view.setTag(getInnerViewTag(), this);
            } catch (Throwable th) {
                FBLogger.e(TAG, th);
            }
            this.mView.setLayoutParams(this.v);
        }
    }

    public void setNode(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74af7819", new Object[]{this, new Long(j)});
        } else if (this.mDoc == null || this.mDoc.mCore == 0) {
        } else {
            this.q = this.mDoc.mCore;
            this.mNode = j;
        }
    }

    public void setParentIsListView(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd538654", new Object[]{this, new Boolean(z)});
            return;
        }
        this.l = z;
        if (z) {
            AbsListView.LayoutParams layoutParams = this.w;
            FrameLayout.LayoutParams layoutParams2 = this.v;
            layoutParams.width = layoutParams2.width;
            layoutParams.height = layoutParams2.height;
            this.mView.setLayoutParams(layoutParams);
            return;
        }
        this.mView.setLayoutParams(this.v);
    }

    public void setRect(float f, float f2, float f3, float f4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3d89c6d", new Object[]{this, new Float(f), new Float(f2), new Float(f3), new Float(f4)});
        } else if (this.v == null || isDestroyed()) {
        } else {
            int i = (int) f3;
            this.mWidth = i;
            int i2 = (int) f4;
            this.mHeight = i2;
            FrameLayout.LayoutParams layoutParams = this.v;
            layoutParams.width = i;
            layoutParams.height = i2;
            if (this.mTransitionTime > 0) {
                ValueAnimator ofInt = ValueAnimator.ofInt(this.mView.getMeasuredWidth(), this.v.width);
                ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.flybird.FBView.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    {
                        FBView.this = this;
                    }

                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public void onAnimationUpdate(ValueAnimator valueAnimator) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                            return;
                        }
                        FrameLayout.LayoutParams layoutParams2 = FBView.this.v;
                        if (layoutParams2 == null) {
                            return;
                        }
                        layoutParams2.width = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                        FBView fBView = FBView.this;
                        View view = fBView.mView;
                        if (view == null) {
                            return;
                        }
                        view.setLayoutParams(fBView.v);
                    }
                });
                ofInt.setDuration(this.mTransitionTime);
                ofInt.start();
                ValueAnimator ofInt2 = ValueAnimator.ofInt(this.mView.getMeasuredHeight(), this.v.height);
                ofInt2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.flybird.FBView.3
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    {
                        FBView.this = this;
                    }

                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public void onAnimationUpdate(ValueAnimator valueAnimator) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                            return;
                        }
                        FrameLayout.LayoutParams layoutParams2 = FBView.this.v;
                        if (layoutParams2 == null) {
                            return;
                        }
                        layoutParams2.height = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                        FBView fBView = FBView.this;
                        View view = fBView.mView;
                        if (view == null) {
                            return;
                        }
                        view.setLayoutParams(fBView.v);
                    }
                });
                ofInt2.setDuration(this.mTransitionTime);
                ofInt2.start();
            }
            int i3 = this.mTransformDegree;
            if (i3 > 0) {
                int i4 = this.mTransitionTime;
                if (i4 <= 0) {
                    i4 = 350;
                }
                ObjectAnimator.ofFloat(this.mView, "rotation", 0.0f, i3).setDuration(i4).start();
            }
            View view = this.mView;
            if ((view instanceof FBScrollView) && (view.getLayoutParams() instanceof FrameLayout.LayoutParams)) {
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.mView.getLayoutParams();
                if (layoutParams2 != null) {
                    layoutParams2.topMargin = (int) f2;
                    layoutParams2.leftMargin = (int) f;
                    layoutParams2.height = this.mHeight;
                    if (((FBScrollView) this.mView).isScrollable()) {
                        layoutParams2.height = Math.min(this.mHeight, (FBTools.getScreenHeight(this.mView.getContext()) - FBTools.getTopFromRoot(this.mView)) - this.mDoc.actionBarHeight);
                    }
                    if (this.mNeedHandleClick || this.mNeedHandleLongClick) {
                        ((FBScrollView) this.mView).getChildAt(0).setMinimumHeight((this.mHeight - this.mView.getPaddingTop()) - this.mView.getPaddingBottom());
                    }
                }
            } else {
                View view2 = this.mView;
                if (view2 instanceof FBHScrollView) {
                    FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) view2.getLayoutParams();
                    if (layoutParams3 != null) {
                        layoutParams3.topMargin = (int) f2;
                        layoutParams3.leftMargin = (int) f;
                        layoutParams3.height = this.mHeight;
                        layoutParams3.width = this.mWidth;
                        View view3 = this.mView;
                        if (((FBHScrollView) view3).c) {
                            layoutParams3.width = Math.min(this.mWidth, FBTools.getScreenWidth(this.mView.getContext()) - FBTools.getLeftFromRoot(view3));
                        }
                        if (this.mNeedHandleClick || this.mNeedHandleLongClick) {
                            ((FBHScrollView) this.mView).getChildAt(0).setMinimumWidth((this.mWidth - this.mView.getPaddingLeft()) - this.mView.getPaddingRight());
                        }
                    }
                } else {
                    FrameLayout.LayoutParams layoutParams4 = this.v;
                    layoutParams4.leftMargin = (int) f;
                    layoutParams4.topMargin = (int) f2;
                }
            }
            View view4 = this.mView;
            if (view4 != null && this.l) {
                AbsListView.LayoutParams layoutParams5 = this.w;
                FrameLayout.LayoutParams layoutParams6 = this.v;
                layoutParams5.width = layoutParams6.width;
                layoutParams5.height = layoutParams6.height;
            }
            if (view4 == null) {
                return;
            }
            view4.requestLayout();
        }
    }

    public void setTag(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e9be069", new Object[]{this, str});
        } else {
            this.mTag = str;
        }
    }

    public void updateA12yNodeInfo() {
        final String str;
        final boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f94cd57", new Object[]{this});
            return;
        }
        HashMap<String, String> hashMap = this.y;
        int i = ied.f28960a;
        String str2 = hashMap != null ? hashMap.get("role") : null;
        final String str3 = str2 != null ? b.get(str2.toLowerCase()) : null;
        HashMap<String, String> hashMap2 = this.y;
        String str4 = hashMap2 != null ? hashMap2.get("aria-checked") : null;
        final Boolean valueOf = str4 != null ? Boolean.valueOf("true".equalsIgnoreCase(str4)) : null;
        if (Build.VERSION.SDK_INT >= 33) {
            View view = this.mView;
            if (view instanceof TextView) {
                CharSequence text = ((TextView) view).getText();
                if ((text instanceof Spannable) && HtmlLite.hasUrlSpan((Spannable) text)) {
                    str = text.toString();
                    z = true;
                    ViewCompat.setAccessibilityDelegate(this.mView, new AccessibilityDelegateCompat(this) { // from class: com.flybird.FBView.7
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        public static /* synthetic */ Object ipc$super(AnonymousClass7 anonymousClass7, String str5, Object... objArr) {
                            int hashCode = str5.hashCode();
                            if (hashCode == -1796852737) {
                                super.onInitializeAccessibilityNodeInfo((View) objArr[0], (AccessibilityNodeInfoCompat) objArr[1]);
                                return null;
                            } else if (hashCode != 1101969832) {
                                throw new InstantReloadException(String.format("String switch could not find '%s'", str5));
                            } else {
                                return super.getAccessibilityNodeProvider((View) objArr[0]);
                            }
                        }

                        @Override // android.support.v4.view.AccessibilityDelegateCompat
                        public AccessibilityNodeProviderCompat getAccessibilityNodeProvider(final View view2) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                return (AccessibilityNodeProviderCompat) ipChange2.ipc$dispatch("41aeb9a8", new Object[]{this, view2});
                            }
                            if (z) {
                                return new AccessibilityNodeProviderCompat() { // from class: com.flybird.FBView.7.1
                                    public static volatile transient /* synthetic */ IpChange $ipChange;

                                    {
                                        AnonymousClass7.this = this;
                                    }

                                    @Override // android.support.v4.view.accessibility.AccessibilityNodeProviderCompat
                                    public AccessibilityNodeInfoCompat createAccessibilityNodeInfo(int i2) {
                                        IpChange ipChange3 = $ipChange;
                                        if (ipChange3 instanceof IpChange) {
                                            return (AccessibilityNodeInfoCompat) ipChange3.ipc$dispatch("ce1fd005", new Object[]{this, new Integer(i2)});
                                        }
                                        try {
                                            AccessibilityNodeInfoCompat obtain = AccessibilityNodeInfoCompat.obtain(view2);
                                            obtain.setSource(view2);
                                            obtain.setClassName(view2.getClass().getName());
                                            obtain.setClickable(true);
                                            obtain.setText(str);
                                            obtain.setContentDescription(view2.getContentDescription());
                                            obtain.setPackageName(view2.getContext().getPackageName());
                                            obtain.setFocusable(true);
                                            obtain.setVisibleToUser(true);
                                            obtain.setEnabled(true);
                                            Rect rect = new Rect();
                                            view2.getGlobalVisibleRect(rect);
                                            obtain.setBoundsInScreen(rect);
                                            return obtain;
                                        } catch (Throwable th) {
                                            cun.a(FBView.TAG, "getAccessibilityNodeProvider failed ", th);
                                            return null;
                                        }
                                    }
                                };
                            }
                            return super.getAccessibilityNodeProvider(view2);
                        }

                        @Override // android.support.v4.view.AccessibilityDelegateCompat
                        public void onInitializeAccessibilityNodeInfo(View view2, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("94e633ff", new Object[]{this, view2, accessibilityNodeInfoCompat});
                                return;
                            }
                            super.onInitializeAccessibilityNodeInfo(view2, accessibilityNodeInfoCompat);
                            String str5 = str3;
                            if (str5 != null) {
                                accessibilityNodeInfoCompat.setClassName(str5);
                            }
                            if (valueOf == null) {
                                return;
                            }
                            accessibilityNodeInfoCompat.setCheckable(true);
                            accessibilityNodeInfoCompat.setChecked(valueOf.booleanValue());
                        }
                    });
                }
            }
        }
        str = null;
        z = false;
        ViewCompat.setAccessibilityDelegate(this.mView, new AccessibilityDelegateCompat(this) { // from class: com.flybird.FBView.7
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass7 anonymousClass7, String str5, Object... objArr) {
                int hashCode = str5.hashCode();
                if (hashCode == -1796852737) {
                    super.onInitializeAccessibilityNodeInfo((View) objArr[0], (AccessibilityNodeInfoCompat) objArr[1]);
                    return null;
                } else if (hashCode != 1101969832) {
                    throw new InstantReloadException(String.format("String switch could not find '%s'", str5));
                } else {
                    return super.getAccessibilityNodeProvider((View) objArr[0]);
                }
            }

            @Override // android.support.v4.view.AccessibilityDelegateCompat
            public AccessibilityNodeProviderCompat getAccessibilityNodeProvider(final View view2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (AccessibilityNodeProviderCompat) ipChange2.ipc$dispatch("41aeb9a8", new Object[]{this, view2});
                }
                if (z) {
                    return new AccessibilityNodeProviderCompat() { // from class: com.flybird.FBView.7.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        {
                            AnonymousClass7.this = this;
                        }

                        @Override // android.support.v4.view.accessibility.AccessibilityNodeProviderCompat
                        public AccessibilityNodeInfoCompat createAccessibilityNodeInfo(int i2) {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                return (AccessibilityNodeInfoCompat) ipChange3.ipc$dispatch("ce1fd005", new Object[]{this, new Integer(i2)});
                            }
                            try {
                                AccessibilityNodeInfoCompat obtain = AccessibilityNodeInfoCompat.obtain(view2);
                                obtain.setSource(view2);
                                obtain.setClassName(view2.getClass().getName());
                                obtain.setClickable(true);
                                obtain.setText(str);
                                obtain.setContentDescription(view2.getContentDescription());
                                obtain.setPackageName(view2.getContext().getPackageName());
                                obtain.setFocusable(true);
                                obtain.setVisibleToUser(true);
                                obtain.setEnabled(true);
                                Rect rect = new Rect();
                                view2.getGlobalVisibleRect(rect);
                                obtain.setBoundsInScreen(rect);
                                return obtain;
                            } catch (Throwable th) {
                                cun.a(FBView.TAG, "getAccessibilityNodeProvider failed ", th);
                                return null;
                            }
                        }
                    };
                }
                return super.getAccessibilityNodeProvider(view2);
            }

            @Override // android.support.v4.view.AccessibilityDelegateCompat
            public void onInitializeAccessibilityNodeInfo(View view2, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("94e633ff", new Object[]{this, view2, accessibilityNodeInfoCompat});
                    return;
                }
                super.onInitializeAccessibilityNodeInfo(view2, accessibilityNodeInfoCompat);
                String str5 = str3;
                if (str5 != null) {
                    accessibilityNodeInfoCompat.setClassName(str5);
                }
                if (valueOf == null) {
                    return;
                }
                accessibilityNodeInfoCompat.setCheckable(true);
                accessibilityNodeInfoCompat.setChecked(valueOf.booleanValue());
            }
        });
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    public void updateAttr(String str, final String str2) {
        char c;
        View view;
        IpChange ipChange = $ipChange;
        char c2 = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a285a75", new Object[]{this, str, str2});
        } else if (isDestroyed() || str == null) {
        } else {
            char c3 = 65535;
            switch (str.hashCode()) {
                case -1882277584:
                    if (str.equals("aria-label")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case -1838249595:
                    if (str.equals("associatedSpmId")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case -1750715231:
                    if (str.equals("overscroll")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case -402165208:
                    if (str.equals("scrollTo")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case -298026005:
                    if (str.equals("triggerAnimationWhenAttach")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 96681:
                    if (str.equals(MUSConstants.ALT)) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case 3506294:
                    if (str.equals("role")) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                case 93753710:
                    if (str.equals("bizid")) {
                        c = 7;
                        break;
                    }
                    c = 65535;
                    break;
                case 110066619:
                    if (str.equals("fullscreen")) {
                        c = '\b';
                        break;
                    }
                    c = 65535;
                    break;
                case 117992163:
                    if (str.equals("aria-checked")) {
                        c = '\t';
                        break;
                    }
                    c = 65535;
                    break;
                case 121618367:
                    if (str.equals("enableHorizontalScrollBar")) {
                        c = '\n';
                        break;
                    }
                    c = 65535;
                    break;
                case 270940796:
                    if (str.equals("disabled")) {
                        c = 11;
                        break;
                    }
                    c = 65535;
                    break;
                case 291553616:
                    if (str.equals("forcethememapping")) {
                        c = '\f';
                        break;
                    }
                    c = 65535;
                    break;
                case 417780552:
                    if (str.equals("scrollTop")) {
                        c = '\r';
                        break;
                    }
                    c = 65535;
                    break;
                case 564050925:
                    if (str.equals("enableVerticalScrollBar")) {
                        c = 14;
                        break;
                    }
                    c = 65535;
                    break;
                case 1118509956:
                    if (str.equals("animation")) {
                        c = 15;
                        break;
                    }
                    c = 65535;
                    break;
                case 1478379844:
                    if (str.equals("enableUserInteraction")) {
                        c = 16;
                        break;
                    }
                    c = 65535;
                    break;
                case 1543281462:
                    if (str.equals("associatedPageSpmId")) {
                        c = 17;
                        break;
                    }
                    c = 65535;
                    break;
                case 1671867118:
                    if (str.equals("aria-hidden")) {
                        c = 18;
                        break;
                    }
                    c = 65535;
                    break;
                case 1804119455:
                    if (str.equals("transtionend")) {
                        c = 19;
                        break;
                    }
                    c = 65535;
                    break;
                case 1946948128:
                    if (str.equals("behaviorInfo")) {
                        c = 20;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                case 5:
                    this.mView.setContentDescription(str2);
                    View view2 = this.mView;
                    if (!(view2 instanceof EditText)) {
                        return;
                    }
                    EditText editText = (EditText) view2;
                    if (editText.getText() == null || !TextUtils.isEmpty(editText.getText().toString())) {
                        return;
                    }
                    editText.setHint(str2);
                    return;
                case 1:
                    if (this.mView == null) {
                        return;
                    }
                    if (BirdNestEngine.useDelayedTorchBind) {
                        ieb.c.post(new Runnable() { // from class: com.flybird.-$$Lambda$FBView$4RHneod3Yv_qG5z1N2JBoOXEHhs
                            {
                                FBView.this = this;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                FBView.lambda$4RHneod3Yv_qG5z1N2JBoOXEHhs(FBView.this, str2);
                            }
                        });
                        return;
                    } else {
                        String str3 = Platform.f5257a;
                        return;
                    }
                case 2:
                    this.mOverScrollEnabled = TextUtils.equals(str2, "true");
                    a();
                    return;
                case 3:
                    View view3 = this.mView;
                    if (!(view3 instanceof FBScrollView) && !(view3 instanceof FBHScrollView)) {
                        return;
                    }
                    try {
                        JSONObject jSONObject = new JSONObject(str2);
                        int i = jSONObject.getInt("left");
                        int i2 = jSONObject.getInt("top");
                        String optString = jSONObject.optString("behavior");
                        if (optString == null) {
                            return;
                        }
                        int dp = (int) (i * FBDocumentAssistor.getDp());
                        int dp2 = (int) (i2 * FBDocumentAssistor.getDp());
                        int hashCode = optString.hashCode();
                        if (hashCode == -898533970) {
                            if (optString.equals("smooth")) {
                            }
                            c2 = 65535;
                        } else if (hashCode != 3005871) {
                            if (hashCode == 1957570017 && optString.equals(Baggage.Amnet.SECURITY_INSTANT)) {
                                c2 = 2;
                            }
                            c2 = 65535;
                        } else {
                            if (optString.equals("auto")) {
                                c2 = 1;
                            }
                            c2 = 65535;
                        }
                        if (c2 == 0 || c2 == 1) {
                            View view4 = this.mView;
                            if (view4 instanceof FBScrollView) {
                                ((FBScrollView) view4).smoothScrollTo(dp, dp2);
                                return;
                            } else if (!(view4 instanceof FBHScrollView)) {
                                return;
                            } else {
                                ((FBHScrollView) view4).smoothScrollTo(dp, dp2);
                                return;
                            }
                        } else if (c2 != 2) {
                            return;
                        } else {
                            View view5 = this.mView;
                            if (view5 instanceof FBScrollView) {
                                ((FBScrollView) view5).scrollTo(dp, dp2);
                                return;
                            } else if (!(view5 instanceof FBHScrollView)) {
                                return;
                            } else {
                                ((FBHScrollView) view5).scrollTo(dp, dp2);
                                return;
                            }
                        }
                    } catch (Throwable th) {
                        FBLogger.e(TAG, "error parsing scrollTo", th);
                        return;
                    }
                case 4:
                    this.r = Boolean.parseBoolean(str2);
                    return;
                case 6:
                case '\t':
                    if (this.y == null) {
                        this.y = new HashMap<>(8);
                    }
                    this.y.put(str, str2);
                    updateA12yNodeInfo();
                    return;
                case 7:
                    this.mExtParams.putString(str, str2);
                    return;
                case '\b':
                    this.mDoc.P = TextUtils.equals(str2, "true");
                    return;
                case '\n':
                    View view6 = this.mView;
                    if (!(view6 instanceof FBHScrollView)) {
                        return;
                    }
                    view6.setHorizontalScrollBarEnabled(Boolean.valueOf(str2).booleanValue());
                    return;
                case 11:
                    if (TextUtils.equals(str2, "disabled") || Boolean.parseBoolean(str2)) {
                        c2 = 1;
                    }
                    this.mView.setEnabled(c2 ^ 1);
                    return;
                case '\f':
                    boolean z = this.themeModeUseColorMapping;
                    boolean z2 = this.themeModeUseMaskMapping;
                    this.themeModeUseColorMapping = ied.a(str2, ",", "color");
                    this.themeModeUseMaskMapping = ied.a(str2, ",", "mask");
                    if (z != this.themeModeUseColorMapping) {
                        replayThemeModeAssociatedActions();
                    }
                    if (z2 == this.themeModeUseMaskMapping) {
                        return;
                    }
                    String str4 = Platform.f5257a;
                    return;
                case '\r':
                    if (!this.mDoc.isOnloadFinish()) {
                        return;
                    }
                    this.mView.scrollTo(0, (int) FBTools.parseUnit(str2));
                    return;
                case 14:
                    View view7 = this.mView;
                    if (!(view7 instanceof FBScrollView)) {
                        return;
                    }
                    view7.setVerticalScrollBarEnabled(Boolean.valueOf(str2).booleanValue());
                    return;
                case 15:
                    AnimationSet parseAnimation = FBTools.parseAnimation(this.mDoc.k, str2);
                    this.n = parseAnimation;
                    View view8 = this.mView;
                    if (view8 == null || parseAnimation == null) {
                        return;
                    }
                    view8.startAnimation(parseAnimation);
                    this.mView.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.flybird.FBView.6
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        {
                            FBView.this = this;
                        }

                        @Override // android.view.View.OnAttachStateChangeListener
                        public void onViewAttachedToWindow(View view9) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("3d337638", new Object[]{this, view9});
                                return;
                            }
                            FBView fBView = FBView.this;
                            if (!fBView.r) {
                                return;
                            }
                            try {
                                View view10 = fBView.mView;
                                if (view10 == null) {
                                    return;
                                }
                                if (view10.getVisibility() == 8) {
                                    FBView.this.mView.setVisibility(4);
                                }
                                FBView fBView2 = FBView.this;
                                fBView2.mView.startAnimation(fBView2.n);
                            } catch (Throwable th2) {
                                FBLogger.e(FBView.TAG, th2);
                            }
                        }

                        @Override // android.view.View.OnAttachStateChangeListener
                        public void onViewDetachedFromWindow(View view9) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("7f64d55b", new Object[]{this, view9});
                            }
                        }
                    });
                    return;
                case 16:
                    View view9 = this.mView;
                    if (!(view9 instanceof FBScrollView)) {
                        return;
                    }
                    ((FBScrollView) view9).setScrollable(Boolean.valueOf(str2).booleanValue());
                    return;
                case 17:
                    View view10 = this.mView;
                    if (view10 == null || !(view10.getContext() instanceof Activity)) {
                        return;
                    }
                    if (BirdNestEngine.useDelayedTorchBind) {
                        ieb.c.post(new Runnable() { // from class: com.flybird.-$$Lambda$FBView$hgGqBFrT39GjCakPmC5OBRM4OPs
                            {
                                FBView.this = this;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                FBView.lambda$hgGqBFrT39GjCakPmC5OBRM4OPs(FBView.this, str2);
                            }
                        });
                        return;
                    } else {
                        String str5 = Platform.f5257a;
                        return;
                    }
                case 18:
                    String lowerCase = str2 == null ? "" : str2.toLowerCase();
                    lowerCase.hashCode();
                    switch (lowerCase.hashCode()) {
                        case 3526476:
                            if (lowerCase.equals(LinkageUtils.PolicyType.SELF)) {
                                c3 = 0;
                                break;
                            }
                            break;
                        case 3569038:
                            if (lowerCase.equals("true")) {
                                c3 = 1;
                                break;
                            }
                            break;
                        case 97196323:
                            if (lowerCase.equals("false")) {
                                c3 = 2;
                                break;
                            }
                            break;
                        case 951530617:
                            if (lowerCase.equals("content")) {
                                c3 = 3;
                                break;
                            }
                            break;
                    }
                    if (c3 != 0) {
                        if (c3 != 1) {
                            if (c3 == 2) {
                                this.mView.setImportantForAccessibility(1);
                                return;
                            } else if (c3 != 3) {
                                this.mView.setImportantForAccessibility(0);
                                return;
                            }
                        }
                        if (Build.VERSION.SDK_INT < 19) {
                            return;
                        }
                        this.mView.setImportantForAccessibility(4);
                        return;
                    }
                    this.mView.setImportantForAccessibility(2);
                    return;
                case 19:
                    if (!"transtionend".equals(str2) || (view = this.mView) == null) {
                        return;
                    }
                    view.clearAnimation();
                    return;
                case 20:
                    if (Looper.getMainLooper() != Looper.myLooper()) {
                        FBLogger.e(TAG, "behavior info must be bind in main thread");
                        return;
                    } else if (this.mView == null) {
                        return;
                    } else {
                        Runnable runnable = new Runnable() { // from class: com.flybird.-$$Lambda$FBView$BxBJuOrFCs1-hdnk_aKkVpoPVW4
                            {
                                FBView.this = this;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                FBView.m653lambda$BxBJuOrFCs1hdnk_aKkVpoPVW4(FBView.this, str2);
                            }
                        };
                        if (BirdNestEngine.useDelayedTorchBind) {
                            ieb.c.post(runnable);
                            return;
                        } else {
                            runnable.run();
                            return;
                        }
                    }
                default:
                    return;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public void updateCSS(String str, String str2) {
        char c;
        FBDocument fBDocument;
        View view;
        ViewParent parent;
        FBDocument fBDocument2;
        FrameLayout frameLayout;
        String[] split;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c310ec95", new Object[]{this, str, str2});
        } else if (str != null && !isDestroyed()) {
            switch (str.hashCode()) {
                case -2114666131:
                    if (str.equals("overflow-x")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case -1724158635:
                    if (str.equals("transition")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case -1383304148:
                    if (str.equals("border")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case -1267206133:
                    if (str.equals("opacity")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case -1221029593:
                    if (str.equals("height")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case -897113616:
                    if (str.equals("show-shadow")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case -806339567:
                    if (str.equals("padding")) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                case -790206670:
                    if (str.equals("background-color:disabled")) {
                        c = 7;
                        break;
                    }
                    c = 65535;
                    break;
                case -408081145:
                    if (str.equals("visibility-display")) {
                        c = '\b';
                        break;
                    }
                    c = 65535;
                    break;
                case -127966916:
                    if (str.equals("background-color:active")) {
                        c = '\t';
                        break;
                    }
                    c = 65535;
                    break;
                case 113126854:
                    if (str.equals("width")) {
                        c = '\n';
                        break;
                    }
                    c = 65535;
                    break;
                case 529642498:
                    if (str.equals("overflow")) {
                        c = 11;
                        break;
                    }
                    c = 65535;
                    break;
                case 605322756:
                    if (str.equals("background-color")) {
                        c = '\f';
                        break;
                    }
                    c = 65535;
                    break;
                case 610793468:
                    if (str.equals(a.ATOM_EXT_UDL_background_image)) {
                        c = '\r';
                        break;
                    }
                    c = 65535;
                    break;
                case 881039699:
                    if (str.equals(a.ATOM_EXT_UDL_border_radius)) {
                        c = 14;
                        break;
                    }
                    c = 65535;
                    break;
                case 1052666732:
                    if (str.equals("transform")) {
                        c = 15;
                        break;
                    }
                    c = 65535;
                    break;
                case 1941332754:
                    if (str.equals("visibility")) {
                        c = 16;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                    View innerView = getInnerView();
                    if ((str2.equals("scroll") || this.mScrollVisibleDetectEnabled) && (innerView instanceof FBScrollView)) {
                        return;
                    }
                    if (str2.equals("hidden") && !(innerView instanceof FBHScrollView)) {
                        return;
                    }
                    if (str2.equals("scroll-detect-visible")) {
                        this.mScrollVisibleDetectEnabled = true;
                    }
                    if (!(innerView instanceof FrameLayout)) {
                        return;
                    }
                    FrameLayout frameLayout2 = (FrameLayout) innerView;
                    FrameLayout frameLayout3 = (FrameLayout) frameLayout2.getParent();
                    if (!str2.equals("scroll") && !this.mScrollVisibleDetectEnabled) {
                        if (!(frameLayout2 instanceof FBHScrollView)) {
                            return;
                        }
                        FBHScrollView fBHScrollView = (FBHScrollView) frameLayout2;
                        View view2 = (FrameLayout) fBHScrollView.getContainer();
                        fBHScrollView.b.removeView(view2);
                        view = view2;
                        if (this.mDoc != null) {
                            this.mDoc.J.remove(innerView);
                            view = view2;
                        }
                    } else {
                        if (frameLayout3 != null) {
                            frameLayout3.removeView(innerView);
                        }
                        innerView.setLayoutParams(new FrameLayout.LayoutParams(-2, -1));
                        FBHScrollView fBHScrollView2 = new FBHScrollView(frameLayout2.getContext(), frameLayout2);
                        fBHScrollView2.setLayoutParams(this.v);
                        fBHScrollView2.setScrollViewListener(this.u);
                        if (frameLayout3 != null) {
                            frameLayout3.addView(fBHScrollView2);
                        }
                        if (this.mDoc != null && (fBDocument = this.mDoc) != null) {
                            fBDocument.J.add(fBHScrollView2);
                        }
                        this.mHeight = FBTools.getScreenHeight(this.mView.getContext());
                        this.mWidth = FBTools.getScreenWidth(this.mView.getContext());
                        view = fBHScrollView2;
                    }
                    this.mView = view;
                    a();
                    b();
                    this.mView.setTag(getInnerViewTag(), this);
                    return;
                case 1:
                    try {
                        this.mTransitionTime = Integer.parseInt(str2);
                        return;
                    } catch (NumberFormatException e) {
                        FBLogger.e(TAG, e);
                        return;
                    }
                case 2:
                    putThemeModeAssociatedActions(THEME_ASSOCIATED_TYPE_CSS, str, str2);
                    String[] split2 = str2.split(" ");
                    if (split2.length <= 0) {
                        return;
                    }
                    float dp = FBDocumentAssistor.getDp();
                    for (String str3 : split2) {
                        if (!str3.contains("#") && !str3.contains("rgb")) {
                            if (!str3.contains(a.ATOM_EXT_solid) && (str3.contains("px") || str3.contains("PX") || str3.contains("rem"))) {
                                if (!this.mDoc.configRemScaled()) {
                                    try {
                                        this.h = Float.parseFloat(str3.substring(0, str3.length() - 2));
                                    } catch (Exception e2) {
                                        FBLogger.e(getClass().getName(), "exception", e2);
                                    }
                                    if (!str3.contains("PX")) {
                                        this.h *= dp;
                                    }
                                } else {
                                    this.h = d(str3);
                                }
                            }
                        } else {
                            this.g = FBTools.parseColor(str3, FBDocumentAssistor.c(this.mDoc), FBDocumentAssistor.b(this.mDoc), this.themeModeUseColorMapping);
                        }
                    }
                    if (!this.s) {
                        this.mView.setBackgroundColor(0);
                    }
                    View view3 = this.mView;
                    if (!(view3 instanceof IBorderable)) {
                        return;
                    }
                    ((IBorderable) view3).setBorder(this.g, (int) this.h);
                    return;
                case 3:
                    float parseFloat = Float.parseFloat(str2);
                    this.mOpacity = parseFloat;
                    if (parseFloat < 1.0f) {
                        this.mView.setLayerType(2, null);
                    }
                    UiUtil.setAlpha(this.mView, this.mOpacity);
                    if (!TextUtils.equals(this.mTag, AgooConstants.MESSAGE_BODY) || (parent = this.mView.getParent()) == null) {
                        return;
                    }
                    View view4 = (View) parent;
                    UiUtil.setAlpha(view4, this.mOpacity);
                    if (this.mOpacity >= 1.0f) {
                        return;
                    }
                    view4.setLayerType(2, null);
                    return;
                case 4:
                    this.mHasHeight = true;
                    return;
                case 5:
                    this.d = Boolean.parseBoolean(str2);
                    b(true);
                    this.s = true;
                    return;
                case 6:
                    String[] split3 = str2.split(" ");
                    this.k[0] = Float.parseFloat(split3[3]);
                    this.k[1] = Float.parseFloat(split3[0]);
                    this.k[2] = Float.parseFloat(split3[1]);
                    this.k[3] = Float.parseFloat(split3[2]);
                    float dp2 = FBDocumentAssistor.getDp();
                    View view5 = this.mView;
                    float[] fArr = this.k;
                    float f = fArr[0];
                    float f2 = this.j * dp2;
                    view5.setPadding((int) (f + f2), (int) (fArr[1] + f2), (int) (fArr[2] + f2), (int) (fArr[3] + f2));
                    return;
                case 7:
                    putThemeModeAssociatedActions(THEME_ASSOCIATED_TYPE_CSS, str, str2);
                    this.c[2] = str2;
                    b(true);
                    this.s = true;
                    return;
                case '\b':
                case 16:
                    int visibility = this.mView.getVisibility();
                    if (str2.equals("visible")) {
                        this.mView.setVisibility(0);
                    } else if (str2.equals("hidden")) {
                        this.mView.setVisibility(8);
                    }
                    int visibility2 = this.mView.getVisibility();
                    if (visibility == visibility2) {
                        return;
                    }
                    onVisibilityChange(visibility2);
                    return;
                case '\t':
                    putThemeModeAssociatedActions(THEME_ASSOCIATED_TYPE_CSS, str, str2);
                    this.c[1] = str2;
                    b(true);
                    this.s = true;
                    return;
                case '\n':
                    this.mHasWidth = true;
                    return;
                case 11:
                    View innerView2 = getInnerView();
                    if ((str2.equals("scroll") || this.mScrollVisibleDetectEnabled) && (innerView2 instanceof FBScrollView)) {
                        return;
                    }
                    if (str2.equals("hidden") && !(innerView2 instanceof FBScrollView)) {
                        return;
                    }
                    if (str2.equals("scroll-detect-visible")) {
                        this.mScrollVisibleDetectEnabled = true;
                    }
                    if (!(innerView2 instanceof FrameLayout)) {
                        return;
                    }
                    FrameLayout frameLayout4 = (FrameLayout) innerView2;
                    FrameLayout frameLayout5 = (FrameLayout) frameLayout4.getParent();
                    if (!str2.equals("scroll") && !this.mScrollVisibleDetectEnabled) {
                        if (!(frameLayout4 instanceof FBScrollView)) {
                            return;
                        }
                        FrameLayout frameLayout6 = (FrameLayout) ((FBScrollView) frameLayout4).getContainer();
                        frameLayout4.removeView(frameLayout6);
                        frameLayout = frameLayout6;
                        if (this.mDoc != null) {
                            this.mDoc.I.remove(innerView2);
                            frameLayout = frameLayout6;
                        }
                    } else {
                        if (frameLayout5 != null) {
                            frameLayout5.removeView(innerView2);
                        }
                        innerView2.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
                        FBScrollView fBScrollView = new FBScrollView(frameLayout4.getContext(), frameLayout4);
                        fBScrollView.setLayoutParams(this.v);
                        fBScrollView.setScrollViewListener(this.u);
                        if (frameLayout5 != null) {
                            frameLayout5.addView(fBScrollView);
                        }
                        if (this.mDoc != null && (fBDocument2 = this.mDoc) != null) {
                            fBDocument2.I.add(fBScrollView);
                        }
                        this.mHeight = FBTools.getScreenHeight(this.mView.getContext());
                        this.mWidth = FBTools.getScreenWidth(this.mView.getContext());
                        frameLayout = fBScrollView;
                    }
                    this.mView = frameLayout;
                    a();
                    b();
                    this.mView.setTag(getInnerViewTag(), this);
                    return;
                case '\f':
                    putThemeModeAssociatedActions(THEME_ASSOCIATED_TYPE_CSS, str, str2);
                    this.c[0] = str2;
                    b(true);
                    this.s = true;
                    return;
                case '\r':
                    putThemeModeAssociatedActions(THEME_ASSOCIATED_TYPE_CSS, str, str2);
                    if (str2.contains("linear-gradient(")) {
                        String trim = str2.replace("linear-gradient(", "").replace(riy.BRACKET_END_STR, "").trim();
                        final GradientDrawable.Orientation orientation = GradientDrawable.Orientation.BOTTOM_TOP;
                        if (!trim.startsWith("to top right") && !trim.startsWith("to right top")) {
                            if (!trim.startsWith("to bottom left") && !trim.startsWith("to left bottom")) {
                                if (!trim.startsWith("to top left") && !trim.startsWith("to left top")) {
                                    if (!trim.startsWith("to bottom right") && !trim.startsWith("to right bottom")) {
                                        if (trim.startsWith("to top")) {
                                            orientation = GradientDrawable.Orientation.BOTTOM_TOP;
                                        } else if (trim.startsWith("to right")) {
                                            orientation = GradientDrawable.Orientation.LEFT_RIGHT;
                                        } else if (trim.startsWith("to bottom")) {
                                            orientation = GradientDrawable.Orientation.TOP_BOTTOM;
                                        } else if (trim.startsWith("to left")) {
                                            orientation = GradientDrawable.Orientation.RIGHT_LEFT;
                                        }
                                    } else {
                                        orientation = GradientDrawable.Orientation.TL_BR;
                                    }
                                } else {
                                    orientation = GradientDrawable.Orientation.BR_TL;
                                }
                            } else {
                                orientation = GradientDrawable.Orientation.TR_BL;
                            }
                        } else {
                            orientation = GradientDrawable.Orientation.BL_TR;
                        }
                        try {
                            String[] split4 = trim.replaceAll("to (top|right|left|bottom)\\s*,\\s*", "").replaceAll("to (top|right|left|bottom)\\s*(top|right|left|bottom)\\s*,\\s*", "").split("\\s*,\\s*");
                            if (split4 == null || split4.length == 0) {
                                return;
                            }
                            final ArrayList arrayList = new ArrayList();
                            final ArrayList arrayList2 = new ArrayList();
                            int i = 0;
                            while (i < split4.length) {
                                String str4 = split4[i];
                                if (str4 != null && (split = str4.split("\\s+")) != null) {
                                    if (split4.length == 2 && split.length == 1) {
                                        arrayList.add(Integer.valueOf(Color.parseColor(split[0])));
                                        arrayList2.add(Float.valueOf(i == 0 ? 0.0f : 1.0f));
                                    } else if (split.length == 2 && split[0] != null && split[1] != null) {
                                        arrayList.add(Integer.valueOf(Color.parseColor(split[0])));
                                        arrayList2.add(Float.valueOf(Math.min(Float.parseFloat(split[1].replace(riy.MOD, "")) / 100.0f, 1.0f)));
                                    }
                                }
                                i++;
                            }
                            ShapeDrawable.ShaderFactory shaderFactory = new ShapeDrawable.ShaderFactory(this) { // from class: com.flybird.FBView.5
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                @Override // android.graphics.drawable.ShapeDrawable.ShaderFactory
                                public Shader resize(int i2, int i3) {
                                    LinearGradient linearGradient;
                                    LinearGradient linearGradient2;
                                    IpChange ipChange2 = $ipChange;
                                    if (ipChange2 instanceof IpChange) {
                                        return (Shader) ipChange2.ipc$dispatch("83f6a2c3", new Object[]{this, new Integer(i2), new Integer(i3)});
                                    }
                                    int[] iArr = new int[arrayList.size()];
                                    for (int i4 = 0; i4 < arrayList.size(); i4++) {
                                        if (arrayList.get(i4) != null) {
                                            iArr[i4] = ((Integer) arrayList.get(i4)).intValue();
                                        }
                                    }
                                    float[] fArr2 = new float[arrayList2.size()];
                                    for (int i5 = 0; i5 < arrayList2.size(); i5++) {
                                        if (arrayList.get(i5) != null) {
                                            fArr2[i5] = ((Float) arrayList2.get(i5)).floatValue();
                                        }
                                    }
                                    GradientDrawable.Orientation orientation2 = orientation;
                                    if (orientation2 == GradientDrawable.Orientation.LEFT_RIGHT) {
                                        linearGradient2 = new LinearGradient(0.0f, 0.0f, i2, 0.0f, iArr, fArr2, Shader.TileMode.REPEAT);
                                    } else if (orientation2 != GradientDrawable.Orientation.RIGHT_LEFT) {
                                        if (orientation2 == GradientDrawable.Orientation.TOP_BOTTOM) {
                                            linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, i3, iArr, fArr2, Shader.TileMode.REPEAT);
                                        } else if (orientation2 != GradientDrawable.Orientation.BOTTOM_TOP) {
                                            if (orientation2 == GradientDrawable.Orientation.BL_TR) {
                                                return new LinearGradient(0.0f, i3, i2, 0.0f, iArr, fArr2, Shader.TileMode.REPEAT);
                                            }
                                            if (orientation2 == GradientDrawable.Orientation.TR_BL) {
                                                return new LinearGradient(i2, 0.0f, 0.0f, i3, iArr, fArr2, Shader.TileMode.REPEAT);
                                            }
                                            if (orientation2 == GradientDrawable.Orientation.BR_TL) {
                                                return new LinearGradient(i2, i3, 0.0f, 0.0f, iArr, fArr2, Shader.TileMode.REPEAT);
                                            }
                                            if (orientation2 != GradientDrawable.Orientation.TL_BR) {
                                                return null;
                                            }
                                            return new LinearGradient(0.0f, 0.0f, i2, i3, iArr, fArr2, Shader.TileMode.REPEAT);
                                        } else {
                                            linearGradient = new LinearGradient(0.0f, i3, 0.0f, 0.0f, iArr, fArr2, Shader.TileMode.REPEAT);
                                        }
                                        return linearGradient;
                                    } else {
                                        linearGradient2 = new LinearGradient(i2, 0.0f, 0.0f, 0.0f, iArr, fArr2, Shader.TileMode.REPEAT);
                                    }
                                    return linearGradient2;
                                }
                            };
                            PaintDrawable paintDrawable = new PaintDrawable();
                            paintDrawable.setShape(new RectShape());
                            paintDrawable.setShaderFactory(shaderFactory);
                            this.f = paintDrawable;
                            if (this.mDoc == null || !this.mDoc.isOnloadFinish()) {
                                return;
                            }
                            b(true);
                            return;
                        } catch (Throwable th) {
                            FBLogger.e(TAG, th);
                            return;
                        }
                    } else if (!str2.contains("url(")) {
                        return;
                    } else {
                        this.e = str2.replace("url(", "").replace(riy.BRACKET_END_STR, "");
                        b(true);
                        this.s = true;
                        return;
                    }
                case 14:
                    String[] split5 = str2.split(" ");
                    float dp3 = FBDocumentAssistor.getDp();
                    if (split5.length == 1) {
                        if (!this.mDoc.configRemScaled()) {
                            this.j = Float.parseFloat(str2.substring(0, str2.length() - 2)) * dp3;
                        } else {
                            this.j = d(str2);
                        }
                        View view6 = this.mView;
                        if (!(view6 instanceof IBorderable)) {
                            return;
                        }
                        ((IBorderable) view6).setBorderRadius((int) this.j);
                        return;
                    } else if (split5.length == 8) {
                        for (int i2 = 0; i2 < split5.length; i2++) {
                            if (!this.mDoc.configRemScaled()) {
                                this.i[i2] = Float.parseFloat(split5[i2].substring(0, split5[i2].length() - 2)) * dp3;
                            } else {
                                this.i[i2] = d(split5[i2]);
                            }
                        }
                        View view7 = this.mView;
                        if (!(view7 instanceof IBorderable)) {
                            return;
                        }
                        ((IBorderable) view7).setBorderRadiusArray(this.i);
                        return;
                    } else if (split5.length != 4) {
                        return;
                    } else {
                        for (int i3 = 0; i3 < split5.length; i3++) {
                            if (!this.mDoc.configRemScaled()) {
                                int i4 = i3 << 1;
                                this.i[i4] = Float.parseFloat(split5[i3].substring(0, split5[i3].length() - 2)) * dp3;
                                this.i[i4 + 1] = Float.parseFloat(split5[i3].substring(0, split5[i3].length() - 2)) * dp3;
                            } else {
                                int i5 = i3 << 1;
                                this.i[i5] = d(split5[i3]);
                                float[] fArr2 = this.i;
                                fArr2[i5 + 1] = fArr2[i5];
                            }
                        }
                        View view8 = this.mView;
                        if (!(view8 instanceof IBorderable)) {
                            return;
                        }
                        ((IBorderable) view8).setBorderRadiusArray(this.i);
                        return;
                    }
                case 15:
                    Matcher matcher = Pattern.compile("rotate\\((\\d+)deg\\)").matcher(str2);
                    if (!matcher.find()) {
                        return;
                    }
                    try {
                        this.mTransformDegree = Integer.parseInt(matcher.group(1));
                        return;
                    } catch (NumberFormatException e3) {
                        FBLogger.e(TAG, e3);
                        return;
                    }
                default:
                    return;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x00d9, code lost:
        if (r9.equals("onmousedown") != false) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void updateEvent(java.lang.String r8, java.lang.String r9) {
        /*
            Method dump skipped, instructions count: 508
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.flybird.FBView.updateEvent(java.lang.String, java.lang.String):void");
    }

    public void updateFunc(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94461448", new Object[]{this, str, str2});
        } else if (str == null || isDestroyed()) {
        } else {
            if (str.equals(Constants.Event.BLUR)) {
                if (!this.mView.isFocused()) {
                    return;
                }
                this.mView.clearFocus();
            } else if (!str.equals(Constants.Event.FOCUS)) {
            } else {
                if (!this.mView.isFocusable() || !this.mView.isFocusableInTouchMode()) {
                    this.mView.setFocusable(true);
                    View view = this.mView;
                    if (view instanceof EditText) {
                        view.setFocusableInTouchMode(true);
                    }
                }
                this.mView.post(new Runnable() { // from class: com.flybird.-$$Lambda$FBView$d_sIj4Ye21GJ7brgKLeFHXT3K_s
                    {
                        FBView.this = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        FBView.lambda$d_sIj4Ye21GJ7brgKLeFHXT3K_s(FBView.this);
                    }
                });
            }
        }
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else if (this.mView == null) {
        } else {
            try {
                String str2 = Platform.f5257a;
            } catch (Throwable unused) {
            }
        }
    }

    public static View getInnerView(FBView fBView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("1864a3cb", new Object[]{fBView});
        }
        if (fBView != null) {
            return fBView.mView;
        }
        return null;
    }

    public void needHandleLongClick(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2aa5d03f", new Object[]{this, new Boolean(z)});
        } else {
            this.mNeedHandleLongClick = z;
        }
    }

    public /* synthetic */ void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        View view = this.mView;
        if (view == null) {
            return;
        }
        view.requestFocus();
        view.sendAccessibilityEvent(8);
        view.performAccessibilityAction(64, null);
    }

    public void addView(FBView fBView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5887f9", new Object[]{this, fBView, new Integer(i)});
        } else {
            ((ViewGroup) getInnerView()).addView(fBView.getInnerView(), i);
        }
    }

    public final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        View view = this.mView;
        if (view instanceof FBScrollView) {
            ((FBScrollView) view).setOverScrollEnabled(this.mOverScrollEnabled);
        } else if (!(view instanceof FBHScrollView)) {
        } else {
            ((FBHScrollView) view).setOverScrollEnabled(this.mOverScrollEnabled);
        }
    }

    public /* synthetic */ Void a(Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Void) ipChange.ipc$dispatch("9afd6c0e", new Object[]{this, num});
        }
        if (isDestroyed()) {
            return null;
        }
        nativePlatformInvokeCallback(this.mNode, "onthemechange", num.intValue() == 1 ? "dark" : "normal");
        return null;
    }

    public /* synthetic */ void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else if (isDestroyed()) {
        } else {
            if (z) {
                nativePlatformOnFocus(this.mNode);
            } else {
                nativePlatformOnBlur(this.mNode);
            }
        }
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
            return;
        }
        try {
            if (this.mView == null) {
                return;
            }
            String str2 = Platform.f5257a;
        } catch (Throwable unused) {
        }
    }

    public final void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        View view = this.mView;
        if (view instanceof FBScrollView) {
            ((FBScrollView) view).setScrollListened(this.mScrollListenerEnabled);
        } else if (!(view instanceof FBHScrollView)) {
        } else {
            ((FBHScrollView) view).setScrollListened(this.mScrollListenerEnabled);
        }
    }

    public FBView(FBDocument fBDocument) {
        this.c = new String[3];
        this.d = false;
        this.h = Float.NaN;
        this.i = new float[8];
        this.j = Float.NaN;
        this.mWidth = 0;
        this.mHeight = 0;
        this.k = new float[4];
        this.m = true;
        this.o = 0;
        this.mNeedHandleClick = false;
        this.mNeedHandleLongClick = false;
        this.mNeedHandleMoreClick = false;
        this.mScrollVisibleDetectEnabled = false;
        this.mOverScrollEnabled = false;
        this.mScrollListenerEnabled = false;
        this.themeModeUseColorMapping = true;
        this.themeModeUseMaskMapping = false;
        this.p = new LinkedHashMap<>(8);
        this.r = true;
        this.s = false;
        this.mHasWidth = false;
        this.mHasHeight = false;
        this.mTransitionTime = -1;
        this.mTransformDegree = -1;
        this.t = false;
        this.mExtParams = new Bundle();
        this.u = new FBScrollView.FBScrollViewListener() { // from class: com.flybird.FBView.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            {
                FBView.this = this;
            }

            @Override // com.flybird.FBScrollView.FBScrollViewListener
            public void onScrollBegin(int i, int i2, boolean z) {
                FBDocument fBDocument2;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("4d7cff70", new Object[]{this, new Integer(i), new Integer(i2), new Boolean(z)});
                } else if (!z || (fBDocument2 = FBView.this.getFBDocument()) == null || fBDocument2.mCore == 0) {
                } else {
                    float dp = FBDocumentAssistor.getDp();
                    FBView.nativePlatformOnScroll(FBView.this.mNode, -1, (int) (i / dp), (int) (i2 / dp));
                }
            }

            @Override // com.flybird.FBScrollView.FBScrollViewListener
            public void onScrollChanged(int i, int i2, int i3, int i4, boolean z) {
                FBPartialVisibilityHelper fBPartialVisibilityHelper;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("3f8bab65", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Boolean(z)});
                    return;
                }
                FBDocument fBDocument2 = FBView.this.getFBDocument();
                if (fBDocument2 == null || fBDocument2.mCore == 0) {
                    return;
                }
                float dp = FBDocumentAssistor.getDp();
                FBView fBView = FBView.this;
                float f = i2 / dp;
                fBView.o = (int) (f + 0.5d);
                if (z) {
                    FBView.nativePlatformOnScroll(fBView.mNode, 1, (int) (i / dp), (int) f);
                }
                if (!FBView.this.mScrollVisibleDetectEnabled || (fBPartialVisibilityHelper = fBDocument2.K) == null) {
                    return;
                }
                fBPartialVisibilityHelper.a();
            }

            @Override // com.flybird.FBScrollView.FBScrollViewListener
            public void onScrollEnd(int i, int i2, boolean z) {
                FBDocument fBDocument2;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("c054adfe", new Object[]{this, new Integer(i), new Integer(i2), new Boolean(z)});
                } else if (!z || (fBDocument2 = FBView.this.getFBDocument()) == null || fBDocument2.mCore == 0) {
                } else {
                    float dp = FBDocumentAssistor.getDp();
                    FBView.nativePlatformOnScroll(FBView.this.mNode, 0, (int) (i / dp), (int) (i2 / dp));
                }
            }

            @Override // com.flybird.FBScrollView.FBScrollViewListener
            public void onScrollStop(int i, int i2, boolean z) {
                FBDocument fBDocument2;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5488451f", new Object[]{this, new Integer(i), new Integer(i2), new Boolean(z)});
                } else if (!z || (fBDocument2 = FBView.this.getFBDocument()) == null || fBDocument2.mCore == 0) {
                } else {
                    float dp = FBDocumentAssistor.getDp();
                    FBView.nativePlatformOnScroll(FBView.this.mNode, 2, (int) (i / dp), (int) (i2 / dp));
                }
            }
        };
        this.v = new FrameLayout.LayoutParams(0, 0);
        this.w = new AbsListView.LayoutParams(0, 0);
        this.mOpacity = 1.0f;
        this.y = null;
        this.z = null;
        this.mDoc = fBDocument;
    }
}
