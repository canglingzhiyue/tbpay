package com.taobao.tao.handler.worker;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.support.v4.content.LocalBroadcastManager;
import mtopsdk.common.util.StringUtils;
import android.view.TextureView;
import android.widget.ScrollView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex.WeexInstance;
import com.taobao.share.multiapp.ShareBizAdapter;
import com.taobao.share.ui.engine.jsbridge.TBWeexShare;
import com.taobao.share.ui.engine.weex.WeexBizView;
import com.taobao.share.ui.engine.weex.c;
import com.taobao.tao.sharepanel.weex.component.ShareScrollViewView;
import org.json.JSONObject;
import tb.juh;
import tb.kge;
import tb.nyy;
import tb.nzo;
import tb.oif;
import tb.oir;

/* loaded from: classes8.dex */
public class g extends oir implements com.taobao.share.ui.engine.weex.a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CHANNEL_TYPE_CODE = "code";
    public static final String CHANNEL_TYPE_PIC = "picture";
    private WeexBizView b;
    private ScrollView c;
    private WeexInstance d;
    private WeexInstance e;
    private String f;
    private c.a g;
    private int h;
    private int i;
    private double j;
    private double k;
    private boolean l;
    private boolean m;
    private boolean n;
    private String o;
    private BroadcastReceiver p;

    static {
        kge.a(-267248989);
        kge.a(-155936732);
    }

    public static /* synthetic */ Object ipc$super(g gVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public g(oif oifVar) {
        super(oifVar);
        this.l = false;
        this.m = false;
        this.p = new BroadcastReceiver() { // from class: com.taobao.tao.handler.worker.CapturePicWorkerWeex2$1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                    return;
                }
                boolean a2 = g.this.a(intent.getStringExtra("data"));
                if (g.this.e()) {
                    return;
                }
                g gVar = g.this;
                g.$ipChange.b.e = a2;
                g gVar2 = g.this;
                g.$ipChange.a(context, null);
            }
        };
        this.b = oifVar.b.i;
        this.f32104a.b.a(this);
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else {
            LocalBroadcastManager.getInstance(ShareBizAdapter.getInstance().getAppEnv().b().getApplicationContext()).registerReceiver(this.p, new IntentFilter(TBWeexShare.ACTION_SAVE_SHARE_IMAGE));
        }
    }

    @Override // com.taobao.share.ui.engine.weex.a
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else {
            LocalBroadcastManager.getInstance(ShareBizAdapter.getInstance().getAppEnv().b().getApplicationContext()).unregisterReceiver(this.p);
        }
    }

    public boolean a(String str) {
        nzo shareWeexSdk;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue();
        }
        try {
            int measuredWidth = this.b.getMeasuredWidth();
            int measuredHeight = this.b.getMeasuredHeight();
            JSONObject jSONObject = new JSONObject(str);
            this.h = jSONObject.optInt("x");
            this.i = jSONObject.optInt("y");
            this.j = jSONObject.optDouble("w");
            if (this.j <= 1.0d) {
                this.j = measuredWidth * this.j;
            }
            this.k = jSONObject.optDouble("h");
            if (this.k <= 1.0d) {
                this.k = measuredHeight * this.k;
            }
            this.l = jSONObject.optBoolean("hideBottomTip");
            boolean optBoolean = jSONObject.optBoolean("imageShare");
            this.f = jSONObject.optString("scrollerRefName");
            this.m = jSONObject.optBoolean("prepareLastFrame");
            this.o = jSONObject.optString("imgBgColor");
            this.n = !StringUtils.isEmpty(this.f);
            if (this.c == null && (shareWeexSdk = ShareBizAdapter.getInstance().getShareWeexSdk("")) != null) {
                this.d = shareWeexSdk.f();
            }
            this.e = ShareScrollViewView.wxsdkInstance;
            if (this.g != null) {
                a(this.g, true);
            }
            return optBoolean;
        } catch (Throwable th) {
            th.printStackTrace();
            nyy.c("CapturePicWorkerWeex2", "setSnapShotParams err:" + th.getMessage());
            return false;
        }
    }

    public boolean e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue() : this.m;
    }

    @Override // com.taobao.share.ui.engine.weex.a
    public Bitmap a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("bc740346", new Object[]{this});
        }
        if (this.n) {
            return f();
        }
        try {
            return a(this.d, this.b.getMeasuredWidth(), this.b.getMeasuredHeight(), this.h, this.i, (int) this.j, (int) this.k);
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.taobao.share.ui.engine.weex.a
    public boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : this.l;
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
        this.g = aVar;
        int i = (int) (this.h + this.j);
        int i2 = (int) (this.i + this.k);
        if (i > 0 && i2 > 0) {
            z = true;
        }
        Bitmap a2 = a(this.e, i, i2, this.h, this.i, (int) this.j, (int) this.k);
        if (this.g != null && (z || a2 != null)) {
            this.g = null;
        }
        return a2;
    }

    private Bitmap a(WeexInstance weexInstance, int i, int i2, int i3, int i4, int i5, int i6) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("7ed91f04", new Object[]{this, weexInstance, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6)});
        }
        if (weexInstance == null) {
            return null;
        }
        try {
            Bitmap bitmap = ((TextureView) ((juh) weexInstance.getExtend(juh.class)).d()).getBitmap();
            return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight());
        } catch (Throwable th) {
            th.printStackTrace();
            nyy.c("CapturePicWorkerWeex2", "getBitmapFromView err:" + th.getMessage());
            return null;
        }
    }
}
