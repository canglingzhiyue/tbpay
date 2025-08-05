package com.taobao.android.tracker.intercept.ui;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AbsListView;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import tb.jiu;
import tb.jjb;
import tb.jjd;
import tb.jje;
import tb.jjf;
import tb.jjg;
import tb.kge;

/* loaded from: classes6.dex */
public class TFrameLayoutEx2 extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String LOG_TAG = "TEXFrameLayout";
    private jjf mInnerClickProxy;
    private jjb mListener;
    private String mUrl;
    private Field sHookField;
    private Method sHookMethod;

    static {
        kge.a(-1807678824);
    }

    public static /* synthetic */ Object ipc$super(TFrameLayoutEx2 tFrameLayoutEx2, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ void access$000(TFrameLayoutEx2 tFrameLayoutEx2, View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40e5e303", new Object[]{tFrameLayoutEx2, view, new Integer(i)});
        } else {
            tFrameLayoutEx2.hookViews(view, i);
        }
    }

    public static /* synthetic */ jjb access$100(TFrameLayoutEx2 tFrameLayoutEx2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (jjb) ipChange.ipc$dispatch("63ba7f13", new Object[]{tFrameLayoutEx2}) : tFrameLayoutEx2.mListener;
    }

    public static /* synthetic */ String access$200(TFrameLayoutEx2 tFrameLayoutEx2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("eb626b50", new Object[]{tFrameLayoutEx2}) : tFrameLayoutEx2.mUrl;
    }

    public TFrameLayoutEx2(Context context) {
        super(context);
        this.mInnerClickProxy = new jjf() { // from class: com.taobao.android.tracker.intercept.ui.TFrameLayoutEx2.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.jjf
            public boolean a(jjg jjgVar, View view) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("cf7c9ee5", new Object[]{this, jjgVar, view})).booleanValue();
                }
                if (TFrameLayoutEx2.access$100(TFrameLayoutEx2.this) != null) {
                    TFrameLayoutEx2.access$100(TFrameLayoutEx2.this).a(TFrameLayoutEx2.access$200(TFrameLayoutEx2.this), view);
                }
                return false;
            }
        };
        init(context);
    }

    public TFrameLayoutEx2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mInnerClickProxy = new jjf() { // from class: com.taobao.android.tracker.intercept.ui.TFrameLayoutEx2.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.jjf
            public boolean a(jjg jjgVar, View view) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("cf7c9ee5", new Object[]{this, jjgVar, view})).booleanValue();
                }
                if (TFrameLayoutEx2.access$100(TFrameLayoutEx2.this) != null) {
                    TFrameLayoutEx2.access$100(TFrameLayoutEx2.this).a(TFrameLayoutEx2.access$200(TFrameLayoutEx2.this), view);
                }
                return false;
            }
        };
        init(context);
    }

    public TFrameLayoutEx2(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mInnerClickProxy = new jjf() { // from class: com.taobao.android.tracker.intercept.ui.TFrameLayoutEx2.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.jjf
            public boolean a(jjg jjgVar, View view) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("cf7c9ee5", new Object[]{this, jjgVar, view})).booleanValue();
                }
                if (TFrameLayoutEx2.access$100(TFrameLayoutEx2.this) != null) {
                    TFrameLayoutEx2.access$100(TFrameLayoutEx2.this).a(TFrameLayoutEx2.access$200(TFrameLayoutEx2.this), view);
                }
                return false;
            }
        };
        init(context);
    }

    private void init(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{this, context});
            return;
        }
        initHook();
        initHookListener();
    }

    private void initHook() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6dcee95a", new Object[]{this});
            return;
        }
        initHookMethod();
        initHookField();
    }

    private void initHookMethod() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5389139b", new Object[]{this});
            return;
        }
        jjd a2 = jje.a();
        if (a2 == null) {
            return;
        }
        if (a2.f29579a) {
            this.sHookMethod = a2.b;
        } else {
            jiu.a("hookGetListenerInfo", this.mUrl, "", a2.d);
        }
    }

    private void initHookField() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5cdf6e", new Object[]{this});
            return;
        }
        jjd b = jje.b();
        if (b == null) {
            return;
        }
        if (b.f29579a) {
            this.sHookField = b.c;
        } else {
            jiu.a("hookOnClickListener", this.mUrl, "", b.d);
        }
    }

    private void initHookListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4481052e", new Object[]{this});
            return;
        }
        getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.taobao.android.tracker.intercept.ui.TFrameLayoutEx2.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("df7e7eb3", new Object[]{this});
                } else {
                    TFrameLayoutEx2.access$000(TFrameLayoutEx2.this, this, 0);
                }
            }
        });
        getViewTreeObserver().addOnScrollChangedListener(new ViewTreeObserver.OnScrollChangedListener() { // from class: com.taobao.android.tracker.intercept.ui.TFrameLayoutEx2.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public void onScrollChanged() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d815a80f", new Object[]{this});
                } else {
                    TFrameLayoutEx2.access$000(TFrameLayoutEx2.this, this, 0);
                }
            }
        });
    }

    public void setListener(jjb jjbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("934ab3cb", new Object[]{this, jjbVar});
        } else {
            this.mListener = jjbVar;
        }
    }

    public void setUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1dea87e", new Object[]{this, str});
        } else {
            this.mUrl = str;
        }
    }

    private void hookViews(View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbdf1183", new Object[]{this, view, new Integer(i)});
        } else if (view.getVisibility() == 0) {
            boolean z = i == 1;
            if (view instanceof ViewGroup) {
                boolean z2 = i > 0;
                ViewGroup viewGroup = (ViewGroup) view;
                if (((viewGroup instanceof AbsListView) || (viewGroup instanceof RecyclerView)) && !z2) {
                    i = 1;
                } else {
                    hookClickListener(view, i, z);
                    if (z2) {
                        i++;
                    }
                }
                int childCount = viewGroup.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    hookViews(viewGroup.getChildAt(i2), i);
                }
                return;
            }
            hookClickListener(view, i, z);
        }
    }

    private void hookClickListener(View view, int i, boolean z) {
        if (!z && (z = view.isClickable()) && i == 0) {
            z = view.getTag(jje.PrivateTagKey) == null;
        }
        if (z) {
            try {
                Object invoke = this.sHookMethod.invoke(view, new Object[0]);
                View.OnClickListener onClickListener = invoke == null ? null : (View.OnClickListener) this.sHookField.get(invoke);
                if (onClickListener == null || (onClickListener instanceof jjg)) {
                    return;
                }
                this.sHookField.set(invoke, new jjg(onClickListener, this.mInnerClickProxy));
                view.setTag(jje.PrivateTagKey, Integer.valueOf(i));
            } catch (Exception e) {
                jiu.a("hookClickListener", this.mUrl, "", e.getMessage());
            }
        }
    }
}
