package com.taobao.android.searchbaseframe.chitu;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.taobao.windvane.extra.uc.WVUCWebView;
import android.taobao.windvane.jsbridge.q;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.alibaba.android.split.core.splitcompat.j;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.ut.device.UTDevice;
import tb.imk;
import tb.imm;
import tb.imn;
import tb.kge;

/* loaded from: classes6.dex */
public class ChituPanelActivity extends Activity implements imm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static imn f14955a;
    private WVUCWebView b;

    static {
        kge.a(-780917690);
        kge.a(30984382);
    }

    public static /* synthetic */ Object ipc$super(ChituPanelActivity chituPanelActivity, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1504501726) {
            super.onDestroy();
            return null;
        } else if (hashCode == -641568046) {
            super.onCreate((Bundle) objArr[0]);
            return null;
        } else if (hashCode != 514894248) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.attachBaseContext((Context) objArr[0]);
            return null;
        }
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1eb0a9a8", new Object[]{this, context});
            return;
        }
        super.attachBaseContext(context);
        j.b(context);
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        if (f14955a == null) {
            finish();
            return;
        }
        FrameLayout frameLayout = new FrameLayout(this);
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        setContentView(frameLayout);
        f14955a.n().getClass();
        q.a("XSearchChiTuJSBridge", (Class<? extends android.taobao.windvane.jsbridge.e>) TBSearchChiTuJSBridge.class, true);
        this.b = new WVUCWebView(this);
        if (f14955a.c().l().f29271a != null) {
            f14955a.c().l();
        }
        this.b.setLayerType(1, null);
        this.b.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        frameLayout.addView(this.b);
        Uri.Builder buildUpon = Uri.parse(f14955a.n().f14963a).buildUpon();
        buildUpon.appendQueryParameter("utdid", UTDevice.getUtdid(this));
        String b = b();
        if (!TextUtils.isEmpty(b)) {
            buildUpon.appendQueryParameter("chituBiz", b);
        }
        buildUpon.appendQueryParameter("chituSubBiz", "nativeSearch");
        buildUpon.appendQueryParameter("version", "1.0");
        buildUpon.appendQueryParameter("appVersion", imk.e);
        this.b.loadUrl(buildUpon.toString());
    }

    @Override // android.app.Activity
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        WVUCWebView wVUCWebView = this.b;
        if (wVUCWebView != null) {
            wVUCWebView.removeAllViews();
            this.b.coreDestroy();
            this.b = null;
        }
        f14955a = null;
    }

    private String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this});
        }
        Bundle extras = getIntent().getExtras();
        return extras != null ? extras.getString("chituBiz") : "";
    }

    @Override // tb.imm
    public imn a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (imn) ipChange.ipc$dispatch("f060694", new Object[]{this}) : f14955a;
    }
}
