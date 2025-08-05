package com.taobao.tao.sharepanel.weex.component;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.platform.WXComponentProp;
import io.unicorn.plugin.platform.WeexPlatformView;
import tb.kge;

/* loaded from: classes8.dex */
public class ScrollViewWeex2 extends WeexPlatformView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static String SHARESCROLLVIEW_TAG;
    public Context context;
    public ShareScrollViewView scrollView;
    public String scrollheight;
    public String scrollwidth;
    public String weexUrl;

    public static /* synthetic */ Object ipc$super(ScrollViewWeex2 scrollViewWeex2, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -17468269) {
            super.onActivityDestroy();
            return null;
        } else if (hashCode == -12003312) {
            super.onCreated();
            return null;
        } else if (hashCode != 1056639943) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onDispose();
            return null;
        }
    }

    static {
        kge.a(217353961);
        SHARESCROLLVIEW_TAG = "sharescrollViewTag";
    }

    public ScrollViewWeex2(Context context, int i) {
        super(context, i);
        this.weexUrl = null;
        this.scrollwidth = "0";
        this.scrollheight = "0";
        this.scrollView = null;
        this.context = context;
    }

    @Override // io.unicorn.plugin.platform.WeexPlatformView
    public void onCreated() {
        float f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff48d810", new Object[]{this});
            return;
        }
        super.onCreated();
        if (this.scrollView != null) {
            return;
        }
        float f2 = 0.0f;
        try {
            f = Float.parseFloat(this.scrollheight);
            try {
                f2 = Float.parseFloat(this.scrollwidth);
            } catch (Throwable unused) {
            }
        } catch (Throwable unused2) {
            f = 0.0f;
        }
        this.scrollView = new ShareScrollViewView(this.context, this.weexUrl, f, f2);
        this.scrollView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.scrollView.setTag(SHARESCROLLVIEW_TAG);
    }

    @Override // io.unicorn.plugin.platform.WeexPlatformView, io.unicorn.plugin.platform.f
    public View getView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("576a35e4", new Object[]{this}) : this.scrollView;
    }

    @Override // io.unicorn.plugin.platform.WeexPlatformView, io.unicorn.plugin.platform.f
    public void onActivityDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fef57493", new Object[]{this});
            return;
        }
        super.onActivityDestroy();
        this.scrollView.clear();
    }

    @Override // io.unicorn.plugin.platform.WeexPlatformView
    public void onDispose() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3efb0bc7", new Object[]{this});
            return;
        }
        super.onDispose();
        this.scrollView.clear();
    }

    @WXComponentProp(name = "url")
    public void setUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1dea87e", new Object[]{this, str});
        } else {
            this.weexUrl = str;
        }
    }

    @WXComponentProp(name = "scrollwidth")
    public void setScrollwidth(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cbbac8a8", new Object[]{this, str});
        } else {
            this.scrollwidth = str;
        }
    }

    @WXComponentProp(name = "scrollheight")
    public void setScrollheight(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6dade5c7", new Object[]{this, str});
        } else {
            this.scrollheight = str;
        }
    }
}
