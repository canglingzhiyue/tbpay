package com.taobao.tao.sharepanel.weex.component;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex.WeexErrorType;
import com.taobao.android.weex.WeexInstance;
import com.taobao.android.weex.WeexInstanceMode;
import com.taobao.android.weex.WeexRenderType;
import com.taobao.android.weex.config.WeexUnicornConfig;
import com.taobao.android.weex.config.b;
import com.taobao.android.weex.e;
import com.taobao.android.weex.h;
import com.taobao.android.weex_framework.ui.i;
import tb.kge;

/* loaded from: classes8.dex */
public class ShareScrollViewView extends ScrollView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static WeexInstance wxsdkInstance;
    private String TAG;
    private Context mContext;
    public String weexUrl;

    public static /* synthetic */ Object ipc$super(ShareScrollViewView shareScrollViewView, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -244855388) {
            super.onLayout(((Boolean) objArr[0]).booleanValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue(), ((Number) objArr[4]).intValue());
            return null;
        } else if (hashCode == 949399698) {
            super.onDetachedFromWindow();
            return null;
        } else if (hashCode != 1004220751) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onScrollChanged(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue());
            return null;
        }
    }

    public static /* synthetic */ String access$000(ShareScrollViewView shareScrollViewView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e54ee3da", new Object[]{shareScrollViewView}) : shareScrollViewView.TAG;
    }

    static {
        kge.a(1806318624);
        wxsdkInstance = null;
    }

    public ShareScrollViewView(Context context, String str, float f, float f2) {
        super(context);
        this.weexUrl = null;
        this.TAG = "ShareScrollViewView";
        this.mContext = context;
        this.weexUrl = str;
        setFillViewport(true);
        setEnabled(true);
        initWeexView(f, f2);
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
            return;
        }
        super.onDetachedFromWindow();
        clear();
    }

    public void initWeexView(float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9dba5bd", new Object[]{this, new Float(f), new Float(f2)});
            return;
        }
        try {
            WeexInstance generateWeexInstance = generateWeexInstance(this.weexUrl, f, f2);
            wxsdkInstance = generateWeexInstance;
            generateWeexInstance.initWithURL(this.weexUrl);
            wxsdkInstance.render(null);
        } catch (Throwable unused) {
        }
    }

    private WeexInstance generateWeexInstance(String str, float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexInstance) ipChange.ipc$dispatch("c165ddd8", new Object[]{this, str, new Float(f), new Float(f2)});
        }
        WeexInstance weexInstance = wxsdkInstance;
        if (weexInstance != null) {
            return weexInstance;
        }
        b bVar = new b();
        WeexUnicornConfig weexUnicornConfig = new WeexUnicornConfig();
        bVar.a(weexUnicornConfig);
        weexUnicornConfig.a((i) null);
        weexUnicornConfig.a(true);
        weexUnicornConfig.a(WeexUnicornConfig.RenderMode.texture);
        wxsdkInstance = e.a(this.mContext, str, WeexInstanceMode.DOM, WeexRenderType.UNICORN, null, bVar);
        try {
            String str2 = "scrollheight：" + f + " scrollwidth：" + f2;
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            LinearLayout linearLayout = new LinearLayout(this.mContext);
            linearLayout.setLayoutParams(layoutParams);
            linearLayout.addView(wxsdkInstance.getRootView());
            wxsdkInstance.getRootView().setFocusable(false);
            wxsdkInstance.getRootView().setFocusableInTouchMode(true);
            addView(linearLayout, layoutParams);
        } catch (Throwable unused) {
        }
        wxsdkInstance.addInstanceListener(new h() { // from class: com.taobao.tao.sharepanel.weex.component.ShareScrollViewView.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.weex.h
            public void onInitSuccess(WeexInstance weexInstance2, boolean z) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f794a71b", new Object[]{this, weexInstance2, new Boolean(z)});
                } else {
                    ShareScrollViewView.access$000(ShareScrollViewView.this);
                }
            }

            @Override // com.taobao.android.weex.h
            public void onInitFailed(WeexInstance weexInstance2, boolean z, WeexErrorType weexErrorType, String str3) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8bee002", new Object[]{this, weexInstance2, new Boolean(z), weexErrorType, str3});
                    return;
                }
                ShareScrollViewView.access$000(ShareScrollViewView.this);
                ShareScrollViewView.this.clear();
            }

            @Override // com.taobao.android.weex.h
            public void onRenderSuccess(WeexInstance weexInstance2, boolean z) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("a414e261", new Object[]{this, weexInstance2, new Boolean(z)});
                } else {
                    ShareScrollViewView.access$000(ShareScrollViewView.this);
                }
            }

            @Override // com.taobao.android.weex.h
            public void onRenderFailed(WeexInstance weexInstance2, boolean z, WeexErrorType weexErrorType, String str3) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("99cc9148", new Object[]{this, weexInstance2, new Boolean(z), weexErrorType, str3});
                    return;
                }
                ShareScrollViewView.access$000(ShareScrollViewView.this);
                String str4 = "onRenderFailed:" + str3;
                ShareScrollViewView.this.clear();
            }

            @Override // com.taobao.android.weex.h
            public void onExecuteSuccess(WeexInstance weexInstance2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("ad8178b2", new Object[]{this, weexInstance2});
                } else {
                    ShareScrollViewView.access$000(ShareScrollViewView.this);
                }
            }

            @Override // com.taobao.android.weex.h
            public void onExecuteFailed(WeexInstance weexInstance2, WeexErrorType weexErrorType, String str3) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("55726f6d", new Object[]{this, weexInstance2, weexErrorType, str3});
                } else {
                    ShareScrollViewView.access$000(ShareScrollViewView.this);
                }
            }

            @Override // com.taobao.android.weex.h
            public void onScriptException(WeexInstance weexInstance2, WeexErrorType weexErrorType, String str3) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("52b846bb", new Object[]{this, weexInstance2, weexErrorType, str3});
                } else {
                    ShareScrollViewView.access$000(ShareScrollViewView.this);
                }
            }

            @Override // com.taobao.android.weex.h
            public void onEngineException(WeexInstance weexInstance2, WeexErrorType weexErrorType, String str3) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7a7821b2", new Object[]{this, weexInstance2, weexErrorType, str3});
                } else {
                    ShareScrollViewView.access$000(ShareScrollViewView.this);
                }
            }

            @Override // com.taobao.android.weex.h
            public void onDestroyed(WeexInstance weexInstance2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("68c948df", new Object[]{this, weexInstance2});
                } else {
                    ShareScrollViewView.access$000(ShareScrollViewView.this);
                }
            }
        });
        return wxsdkInstance;
    }

    public ShareScrollViewView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.weexUrl = null;
        this.TAG = "ShareScrollViewView";
    }

    public ShareScrollViewView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.weexUrl = null;
        this.TAG = "ShareScrollViewView";
    }

    public void clear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b42d4c54", new Object[]{this});
            return;
        }
        WeexInstance weexInstance = wxsdkInstance;
        if (weexInstance == null) {
            return;
        }
        weexInstance.destroy();
        wxsdkInstance = null;
    }

    @Override // android.view.View
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3bdb314f", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        super.onScrollChanged(i, i2, i3, i4);
        String str = "onScrollChanged l, t, oldl, oldt:" + i + "," + i2 + "," + i3 + "," + i4;
    }

    @Override // android.widget.ScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f167cda4", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        super.onLayout(z, i, i2, i3, i4);
        if (getChildCount() <= 0) {
            return;
        }
        String str = "getChildAt height:" + getChildAt(0).getHeight() + " getLayoutParams height:" + getLayoutParams().height;
    }
}
