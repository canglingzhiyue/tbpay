package tb;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.kit.view.holder.c;
import com.taobao.android.detail.wrapper.fragment.weex.wxcomponent.WXAliDetailModel;
import com.taobao.weex.WXSDKEngine;
import com.taobao.weex.WXSDKInstance;
import com.taobao.weex.common.WXException;
import com.taobao.weex.common.WXRenderStrategy;
import com.taobao.weex.d;

/* loaded from: classes5.dex */
public class fbs extends c<fcd> implements d {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "WeexViewHolder";
    private WXSDKInstance g;
    private FrameLayout h;

    static {
        kge.a(1196948090);
        kge.a(-748561575);
    }

    public static /* synthetic */ Object ipc$super(fbs fbsVar, String str, Object... objArr) {
        if (str.hashCode() == 90991720) {
            super.a();
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.weex.d
    public void onException(WXSDKInstance wXSDKInstance, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88f82eeb", new Object[]{this, wXSDKInstance, str, str2});
        }
    }

    @Override // com.taobao.weex.d
    public void onRefreshSuccess(WXSDKInstance wXSDKInstance, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d57f8320", new Object[]{this, wXSDKInstance, new Integer(i), new Integer(i2)});
        }
    }

    @Override // com.taobao.weex.d
    public void onRenderSuccess(WXSDKInstance wXSDKInstance, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c414a5f9", new Object[]{this, wXSDKInstance, new Integer(i), new Integer(i2)});
        }
    }

    public fbs(Context context) {
        super(context);
        this.g = new WXSDKInstance(context);
        this.g.a(this);
        try {
            WXSDKEngine.registerModule("alidetail_event", WXAliDetailModel.class);
        } catch (WXException unused) {
        }
        emu.a("com.taobao.android.detail.wrapper.ext.component.main.viewholder.MainWeexViewHolder");
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.c
    public View a(Context context, ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("f1543f21", new Object[]{this, context, viewGroup});
        }
        this.h = new FrameLayout(context);
        this.h.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        return this.h;
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.c
    public void a(fcd fcdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e844ca31", new Object[]{this, fcdVar});
        } else if (TextUtils.isEmpty(fcdVar.f27786a)) {
        } else {
            this.g.c("WeexViewHolder", fcdVar.f27786a, null, JSONObject.toJSONString(fcdVar.b), WXRenderStrategy.APPEND_ASYNC);
        }
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.c
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        this.f9568a = null;
        this.g.onActivityDestroy();
        super.a();
    }

    @Override // com.taobao.weex.d
    public void onViewCreated(WXSDKInstance wXSDKInstance, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9eab5f0f", new Object[]{this, wXSDKInstance, view});
            return;
        }
        FrameLayout frameLayout = this.h;
        if (frameLayout == null) {
            return;
        }
        frameLayout.addView(view);
    }
}
