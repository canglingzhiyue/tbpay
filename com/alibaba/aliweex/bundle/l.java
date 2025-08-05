package com.alibaba.aliweex.bundle;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.Toast;
import com.alibaba.aliweex.bundle.WeexPageFragment;
import com.alibaba.aliweex.bundle.k;
import com.alibaba.aliweex.bundle.m;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.weex.WXEnvironment;
import com.taobao.weex.WXSDKInstance;
import com.taobao.weex.common.WXErrorCode;
import com.taobao.weex.utils.WXExceptionUtils;
import com.taobao.weex.utils.WXLogUtils;
import java.util.HashMap;
import tb.kge;

/* loaded from: classes2.dex */
public class l implements com.taobao.weex.d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private ViewGroup f2021a;
    private k.d b;
    private m.c c;
    private k.f d;
    private WeexPageFragment.a e;
    private WeexPageFragment.a f;

    static {
        kge.a(1447291623);
        kge.a(-748561575);
    }

    public WeexPageFragment.a a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WeexPageFragment.a) ipChange.ipc$dispatch("dce6d380", new Object[]{this}) : this.e;
    }

    public void a(WeexPageFragment.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81028440", new Object[]{this, aVar});
        } else {
            this.e = aVar;
        }
    }

    public l(ViewGroup viewGroup, m.c cVar, k.f fVar, WeexPageFragment.a aVar, WeexPageFragment.a aVar2) {
        this.f2021a = viewGroup;
        this.c = cVar;
        this.d = fVar;
        this.e = aVar;
        this.f = aVar2;
    }

    public void a(k.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2a77d08", new Object[]{this, dVar});
        } else {
            this.b = dVar;
        }
    }

    @Override // com.taobao.weex.d
    public void onViewCreated(WXSDKInstance wXSDKInstance, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9eab5f0f", new Object[]{this, wXSDKInstance, view});
            return;
        }
        WXLogUtils.d("WXRenderListener", "into--[onViewCreated]");
        if (this.f2021a == null) {
            return;
        }
        if (b()) {
            a(view);
            WeexPageFragment.a aVar = this.e;
            View onCreateView = aVar != null ? aVar.onCreateView(wXSDKInstance, view) : view;
            onCreateView.setId(R.id.weex_render_view);
            if (this.f2021a.getParent() instanceof FrameLayout) {
                ((ViewGroup) this.f2021a.getParent()).addView(onCreateView);
            } else {
                this.f2021a.addView(onCreateView);
            }
        } else if (view.getParent() == null) {
            if (this.f2021a.getChildCount() > 2) {
                this.f2021a.removeViewAt(2);
            }
            this.f2021a.addView(view);
        }
        m.c cVar = this.c;
        if (cVar != null) {
            cVar.a(false);
        }
        this.f.onViewCreated(wXSDKInstance, view);
        WeexPageFragment.a aVar2 = this.e;
        if (aVar2 != null) {
            aVar2.onViewCreated(wXSDKInstance, view);
        }
        k.f fVar = this.d;
        if (fVar == null) {
            return;
        }
        fVar.a(wXSDKInstance);
    }

    @Override // com.taobao.weex.d
    public void onRenderSuccess(WXSDKInstance wXSDKInstance, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c414a5f9", new Object[]{this, wXSDKInstance, new Integer(i), new Integer(i2)});
            return;
        }
        WXLogUtils.d("WXRenderListener", "into--[onRenderSuccess]");
        WeexPageFragment.a aVar = this.e;
        if (aVar != null) {
            aVar.onRenderSuccess(wXSDKInstance, i, i2);
        }
        m.c cVar = this.c;
        if (cVar == null) {
            return;
        }
        cVar.a(false);
    }

    @Override // com.taobao.weex.d
    public void onRefreshSuccess(WXSDKInstance wXSDKInstance, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d57f8320", new Object[]{this, wXSDKInstance, new Integer(i), new Integer(i2)});
            return;
        }
        WXLogUtils.d("WXRenderListener", "into--[onRefreshSuccess]");
        m.c cVar = this.c;
        if (cVar == null) {
            return;
        }
        cVar.a(false);
    }

    @Override // com.taobao.weex.d
    public void onException(WXSDKInstance wXSDKInstance, String str, String str2) {
        boolean shouldDegrade;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88f82eeb", new Object[]{this, wXSDKInstance, str, str2});
            return;
        }
        WXLogUtils.d("WXRenderListener", "into--[onException] errCode:" + str + " msg:" + str2);
        if (TextUtils.equals(str, WXErrorCode.WX_DEGRAD_ERR_NETWORK_BUNDLE_DOWNLOAD_FAILED.getErrorCode())) {
            this.b.a(wXSDKInstance.O(), this.f2021a);
            this.b.a(true, "网络错误，点击刷新重试！");
            a(wXSDKInstance, str2);
            shouldDegrade = false;
        } else {
            shouldDegrade = WeexPageFragment.shouldDegrade(wXSDKInstance, str, str2);
        }
        if (WXEnvironment.isApkDebugable()) {
            Toast.makeText(wXSDKInstance.O(), str2, 1).show();
        }
        m.c cVar = this.c;
        if (cVar != null) {
            cVar.a(false);
        }
        this.f.onException(wXSDKInstance, str, str2);
        WeexPageFragment.a aVar = this.e;
        if (aVar == null) {
            return;
        }
        aVar.onException(wXSDKInstance, shouldDegrade, str, str2);
    }

    private void a(WXSDKInstance wXSDKInstance, String str) {
        int indexOf;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("124be4d0", new Object[]{this, wXSDKInstance, str});
            return;
        }
        HashMap hashMap = new HashMap(1);
        if (!TextUtils.isEmpty(str) && str.contains("networkMsg==") && str.contains("networkErrorCode") && (indexOf = str.indexOf("|mWXResponse")) > 0) {
            String substring = str.substring(0, indexOf);
            hashMap.put("wxErrorMsgDetail", str);
            str = substring;
        }
        String N = wXSDKInstance.N();
        WXErrorCode wXErrorCode = WXErrorCode.WX_KEY_EXCEPTION_JS_DOWNLOAD_FAILED;
        WXExceptionUtils.commitCriticalExceptionRT(N, wXErrorCode, "WXRenderListener.onException", WXErrorCode.WX_KEY_EXCEPTION_JS_DOWNLOAD_FAILED.getErrorMsg() + "--" + str, hashMap);
    }

    private boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        WeexPageFragment.a aVar = this.e;
        return aVar != null && aVar.needWrapper();
    }

    private void a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9501e36a", new Object[]{this, view});
            return;
        }
        ViewParent parent = this.f2021a.getParent();
        View view2 = null;
        if (parent != null && (parent instanceof ViewGroup)) {
            ViewGroup viewGroup = (ViewGroup) parent;
            if (viewGroup.getChildCount() > 0 && (view2 = viewGroup.findViewById(R.id.weex_render_view)) != null) {
                b(view2);
            }
        }
        if (view2 == null && (view2 = this.f2021a.findViewById(R.id.weex_render_view)) != null) {
            this.f2021a.removeView(view2);
        }
        if (view2 != null) {
            return;
        }
        b(view);
    }

    private void b(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91037249", new Object[]{this, view});
        } else if (view == null || view.getParent() == null || !(view.getParent() instanceof ViewGroup)) {
        } else {
            ((ViewGroup) view.getParent()).removeView(view);
        }
    }
}
