package com.taobao.tao.handler.worker;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.support.v4.content.LocalBroadcastManager;
import android.text.TextUtils;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.share.multiapp.ShareBizAdapter;
import com.taobao.share.ui.engine.jsbridge.TBWeexShare;
import com.taobao.share.ui.engine.weex.c;
import com.taobao.vessel.VesselView;
import com.taobao.vessel.weex.VesselWeexView;
import com.taobao.weex.WXSDKInstance;
import com.taobao.weex.WXSDKManager;
import com.taobao.weex.ui.component.WXComponent;
import com.taobao.weex.ui.component.WXVContainer;
import com.taobao.weex.ui.view.WXScrollView;
import java.util.Iterator;
import org.json.JSONObject;
import tb.kge;
import tb.nyy;
import tb.oif;
import tb.oir;

/* loaded from: classes8.dex */
public class a extends oir implements com.taobao.share.ui.engine.weex.a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CHANNEL_TYPE_CODE = "code";
    public static final String CHANNEL_TYPE_PIC = "picture";
    private VesselView b;
    private WXScrollView c;
    private String d;
    private c.a e;
    private int f;
    private int g;
    private double h;
    private double i;
    private boolean j;
    private boolean k;
    private boolean l;
    private String m;
    private BroadcastReceiver n;

    static {
        kge.a(-872475058);
        kge.a(-155936732);
    }

    public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public a(oif oifVar) {
        super(oifVar);
        this.j = false;
        this.k = false;
        this.n = new BroadcastReceiver() { // from class: com.taobao.tao.handler.worker.CapturePicWorker$1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                    return;
                }
                boolean a2 = a.this.a(intent.getStringExtra("data"));
                if (a.this.e()) {
                    return;
                }
                a aVar = a.this;
                a.$ipChange.b.e = a2;
                a aVar2 = a.this;
                a.$ipChange.a(context, null);
            }
        };
        this.b = oifVar.b.b;
        this.f32104a.b.a(this);
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else {
            LocalBroadcastManager.getInstance(ShareBizAdapter.getInstance().getAppEnv().b().getApplicationContext()).registerReceiver(this.n, new IntentFilter(TBWeexShare.ACTION_SAVE_SHARE_IMAGE));
        }
    }

    @Override // com.taobao.share.ui.engine.weex.a
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else {
            LocalBroadcastManager.getInstance(ShareBizAdapter.getInstance().getAppEnv().b().getApplicationContext()).unregisterReceiver(this.n);
        }
    }

    public boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue();
        }
        try {
            int measuredWidth = this.b.getMeasuredWidth();
            int measuredHeight = this.b.getMeasuredHeight();
            JSONObject jSONObject = new JSONObject(str);
            this.f = jSONObject.optInt("x");
            this.g = jSONObject.optInt("y");
            this.h = jSONObject.optDouble("w");
            if (this.h <= 1.0d) {
                this.h = measuredWidth * this.h;
            }
            this.i = jSONObject.optDouble("h");
            if (this.i <= 1.0d) {
                this.i = measuredHeight * this.i;
            }
            this.j = jSONObject.optBoolean("hideBottomTip");
            boolean optBoolean = jSONObject.optBoolean("imageShare");
            this.d = jSONObject.optString("scrollerRefName");
            this.k = jSONObject.optBoolean("prepareLastFrame");
            this.m = jSONObject.optString("imgBgColor");
            this.l = !TextUtils.isEmpty(this.d);
            if (this.l) {
                WXSDKInstance wXSDKInstance = null;
                this.c = null;
                VesselWeexView vesselWeexView = (VesselWeexView) this.b.getChildProxyView();
                vesselWeexView.setClipChildren(false);
                Iterator<WXSDKInstance> it = WXSDKManager.getInstance().getWXRenderManager().getAllInstances().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    WXSDKInstance next = it.next();
                    if (next.am() == vesselWeexView.getChildView()) {
                        wXSDKInstance = next;
                        break;
                    }
                }
                if (wXSDKInstance != null) {
                    a((WXVContainer) wXSDKInstance.z());
                }
            }
            if (this.e != null) {
                a(this.e, true);
            }
            return optBoolean;
        } catch (Throwable th) {
            th.printStackTrace();
            nyy.c("CapturePicWorker", "setSnapShotParams err:" + th.getMessage());
            return false;
        }
    }

    public boolean e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue() : this.k;
    }

    private void a(WXVContainer wXVContainer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6267fbdb", new Object[]{this, wXVContainer});
        } else if (this.c == null) {
            for (int childCount = wXVContainer.getChildCount() - 1; childCount >= 0; childCount--) {
                WXComponent child = wXVContainer.getChild(childCount);
                if (TextUtils.equals(child.getBasicComponentData().getAttrs().optString("screenshot"), this.d)) {
                    this.c = (WXScrollView) child.mo1286getHostView().getInnerView();
                    return;
                }
                if (child instanceof WXVContainer) {
                    a((WXVContainer) child);
                }
            }
        }
    }

    @Override // com.taobao.share.ui.engine.weex.a
    public Bitmap a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("bc740346", new Object[]{this});
        }
        if (this.l) {
            return f();
        }
        try {
            return a(this.b, this.b.getMeasuredWidth(), this.b.getMeasuredHeight(), this.f, this.g, (int) this.h, (int) this.i);
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.taobao.share.ui.engine.weex.a
    public boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : this.j;
    }

    private Bitmap f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Bitmap) ipChange.ipc$dispatch("8b0379cb", new Object[]{this}) : a(null, false);
    }

    public Bitmap a(c.a aVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("b8f6ede0", new Object[]{this, aVar, new Boolean(z)});
        }
        this.e = aVar;
        int i = (int) (this.f + this.h);
        int i2 = (int) (this.g + this.i);
        if (i > 0 && i2 > 0) {
            z = true;
        }
        WXScrollView wXScrollView = this.c;
        if (wXScrollView != null && wXScrollView.getChildAt(0) != null && i == 0 && i2 == 0) {
            i = this.c.getChildAt(0).getMeasuredWidth();
            i2 = this.c.getChildAt(0).getMeasuredHeight();
            this.h = i;
            this.i = i2;
        }
        Bitmap a2 = a(this.c, i, i2, this.f, this.g, (int) this.h, (int) this.i);
        if (this.e != null && (z || a2 != null)) {
            this.e = null;
        }
        return a2;
    }

    private Bitmap a(View view, int i, int i2, int i3, int i4, int i5, int i6) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("7d1dd5e8", new Object[]{this, view, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6)});
        }
        try {
            Bitmap.Config config = Bitmap.Config.RGB_565;
            if (i * i2 <= 41472000) {
                config = Bitmap.Config.ARGB_8888;
            }
            Bitmap createBitmap = Bitmap.createBitmap(i, i2, config);
            Canvas canvas = new Canvas(createBitmap);
            if (!TextUtils.isEmpty(this.m)) {
                canvas.drawColor(Color.parseColor(this.m));
            }
            if (view == null) {
                return null;
            }
            view.draw(canvas);
            return Bitmap.createBitmap(createBitmap, i3, i4, i5, i6);
        } catch (Throwable th) {
            th.printStackTrace();
            nyy.c("CapturePicWorker", "getBitmapFromView err:" + th.getMessage());
            return null;
        }
    }
}
