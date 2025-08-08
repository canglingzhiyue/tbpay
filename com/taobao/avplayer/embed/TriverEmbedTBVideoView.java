package com.taobao.avplayer.embed;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.alibaba.android.bindingx.core.internal.BindingXConstants;
import com.alibaba.ariver.app.api.PageContext;
import com.alibaba.ariver.engine.api.EngineUtils;
import com.alibaba.ariver.engine.api.Render;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback;
import com.alibaba.ariver.engine.api.bridge.model.SendToRenderCallback;
import com.alibaba.ariver.engine.api.embedview.IEmbedCallback;
import com.alibaba.ariver.integration.embedview.BaseEmbedView;
import com.alibaba.ariver.kernel.RVEvents;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.datasdk.model.datamodel.node.RateNode;
import com.taobao.avplayer.DWAspectRatio;
import com.taobao.avplayer.TBPlayerConst;
import com.taobao.avplayer.av;
import com.taobao.avplayer.ax;
import com.taobao.avplayer.bk;
import com.taobao.avplayer.common.u;
import com.taobao.avplayer.common.z;
import com.taobao.avplayer.interactivelifecycle.frontcover.model.DWFrontCoverBean;
import com.taobao.media.MediaConstant;
import com.taobao.orange.OrangeConfig;
import com.taobao.taobaoavsdk.AVSDKLog;
import com.taobao.taobaoavsdk.util.b;
import com.taobao.weex.common.Constants;
import com.uc.webview.export.media.CommandID;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import tb.kcf;
import tb.kge;
import tb.mto;

/* loaded from: classes6.dex */
public class TriverEmbedTBVideoView extends BaseEmbedView implements av, ax, u, z {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int STATE_ENDED = 4;
    public static final int STATE_LOADING = 3;
    public static final int STATE_PAUSE = 2;
    public static final int STATE_PLAY = 1;
    public static final int STATE_RENDER_START = 5;
    public static final int STATE_STOP = 0;
    public static final String TYPE = "video";
    private boolean A;
    private boolean G;
    private boolean H;
    private BridgeCallback I;

    /* renamed from: a  reason: collision with root package name */
    public String f16498a;
    public FrameLayoutResize d;
    private bk e;
    private WeakReference<Context> f;
    private String h;
    private String j;
    private boolean k;
    private String l;
    private ImageView.ScaleType m;
    private DWAspectRatio n;
    private boolean s;
    private boolean t;
    private boolean u;
    private int x;
    public String b = "video";
    public String c = "vertical";
    private String g = "";
    private String i = "EmbedCDNVideo";
    private boolean o = false;
    private boolean p = false;
    private boolean q = b.a(OrangeConfig.getInstance().getConfig("DWInteractive", MediaConstant.ORANGE_DEFAULT_MUTE_WHEN_CREATE, "true"));
    private boolean r = false;
    private boolean v = false;
    private boolean w = false;
    private int y = 0;
    private int z = 0;
    private boolean B = false;
    private int C = 0;
    private boolean D = false;
    private boolean E = false;
    private boolean F = true;
    private boolean J = true;
    private boolean K = true;
    private boolean L = false;
    private boolean M = false;
    private HashMap<String, String> N = null;

    static {
        kge.a(-2107940211);
        kge.a(688755897);
        kge.a(857599862);
        kge.a(-1522005455);
        kge.a(-1226623529);
    }

    public static /* synthetic */ Object ipc$super(TriverEmbedTBVideoView triverEmbedTBVideoView, String str, Object... objArr) {
        if (str.hashCode() == 1664325763) {
            super.onCreate((Map) objArr[0]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.alibaba.ariver.engine.api.embedview.IEmbedView
    public Bitmap getSnapshot() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("a92c69f", new Object[]{this});
        }
        return null;
    }

    @Override // com.alibaba.ariver.engine.api.embedview.IEmbedView
    public String getType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("13e5e549", new Object[]{this}) : "video";
    }

    @Override // com.alibaba.ariver.engine.api.embedview.IEmbedView
    public void onEmbedViewVisibilityChanged(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48c81239", new Object[]{this, new Integer(i)});
        }
    }

    @Override // com.taobao.avplayer.ax
    public void onLoopCompletion() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a22ee66", new Object[]{this});
        }
    }

    @Override // com.taobao.avplayer.common.u
    public void onMutedChange(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ff26311", new Object[]{this, new Boolean(z)});
        }
    }

    @Override // com.alibaba.ariver.engine.api.embedview.IEmbedView
    public void onRequestPermissionResult(int i, String[] strArr, int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43aa2a2d", new Object[]{this, new Integer(i), strArr, iArr});
        }
    }

    @Override // com.taobao.avplayer.av
    public void onVideoClose() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24db3403", new Object[]{this});
        }
    }

    @Override // com.taobao.avplayer.av
    public void onVideoInfo(Object obj, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b7a5aed", new Object[]{this, obj, new Integer(i), new Integer(i2)});
        }
    }

    @Override // com.taobao.avplayer.av
    public void onVideoSeekTo(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd6694ad", new Object[]{this, new Integer(i)});
        }
    }

    public static /* synthetic */ void a(TriverEmbedTBVideoView triverEmbedTBVideoView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cff0f7aa", new Object[]{triverEmbedTBVideoView});
        } else {
            triverEmbedTBVideoView.c();
        }
    }

    /* loaded from: classes6.dex */
    public class FrameLayoutResize extends FrameLayout {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(818152468);
        }

        public FrameLayoutResize(Context context) {
            super(context);
        }

        @Override // android.view.View
        public void onSizeChanged(int i, int i2, int i3, int i4) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("52d28ddb", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            } else {
                TriverEmbedTBVideoView.this.a(i, i2);
            }
        }
    }

    @Override // com.alibaba.ariver.integration.embedview.BaseEmbedView, com.alibaba.ariver.engine.api.embedview.IEmbedView
    public void onCreate(Map<String, String> map) {
        PageContext pageContext;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63339883", new Object[]{this, map});
            return;
        }
        super.onCreate(map);
        if (this.mOuterPage != null && (pageContext = this.mOuterPage.getPageContext()) != null) {
            this.f = new WeakReference<>(pageContext.getActivity());
        }
        if (this.mOuterApp != null) {
            try {
                this.B = this.mOuterApp.getStartParams().getBoolean("enableVideoCache");
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        this.J = b.a(OrangeConfig.getInstance().getConfig("DWInteractive", "enableFixSizeChange", "true"));
        this.K = b.a(OrangeConfig.getInstance().getConfig("DWInteractive", "enableTriverResume", "true"));
        this.M = b.a(OrangeConfig.getInstance().getConfig("DWInteractive", "fixProgressUnit", "false"));
    }

    @Override // com.alibaba.ariver.engine.api.embedview.IEmbedView
    public View getView(int i, int i2, String str, String str2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("bcdbb931", new Object[]{this, new Integer(i), new Integer(i2), str, str2, map});
        }
        if (this.d == null) {
            this.d = new FrameLayoutResize(this.f.get());
        }
        this.y = i;
        this.z = i2;
        return this.d;
    }

    private boolean a(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6635bd02", new Object[]{this, str, jSONObject})).booleanValue();
        }
        try {
            return jSONObject.getBoolean(str).booleanValue();
        } catch (Throwable th) {
            th.printStackTrace();
            return false;
        }
    }

    private int b(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("676c0fd0", new Object[]{this, str, jSONObject})).intValue();
        }
        try {
            return jSONObject.getInteger(str).intValue();
        } catch (Throwable th) {
            th.printStackTrace();
            return 0;
        }
    }

    private double c(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("68a262aa", new Object[]{this, str, jSONObject})).doubleValue();
        }
        try {
            return jSONObject.getDouble(str).doubleValue();
        } catch (Throwable th) {
            th.printStackTrace();
            return mto.a.GEO_NOT_SUPPORT;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x01a8, code lost:
        if (r10 == 1) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x01ab, code lost:
        if (r10 == 2) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01ae, code lost:
        r18.n = com.taobao.avplayer.DWAspectRatio.DW_FIT_X_Y;
        r18.m = android.widget.ImageView.ScaleType.FIT_XY;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01b7, code lost:
        r18.n = com.taobao.avplayer.DWAspectRatio.DW_CENTER_CROP;
        r18.m = android.widget.ImageView.ScaleType.CENTER_CROP;
     */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0264 A[Catch: Throwable -> 0x02f4, TryCatch #1 {Throwable -> 0x02f4, blocks: (B:10:0x0043, B:12:0x0049, B:13:0x004f, B:15:0x0057, B:17:0x0061, B:29:0x0102, B:31:0x0108, B:40:0x0143, B:42:0x014b, B:45:0x0157, B:47:0x015d, B:48:0x0163, B:50:0x0169, B:52:0x0173, B:74:0x01ae, B:75:0x01b7, B:76:0x01c0, B:59:0x0188, B:62:0x0192, B:65:0x019c, B:77:0x01c8, B:79:0x01ce, B:80:0x01d4, B:82:0x01da, B:83:0x01e0, B:85:0x01e6, B:86:0x01ec, B:88:0x01f2, B:89:0x01f8, B:91:0x01fe, B:95:0x0211, B:97:0x0217, B:101:0x0220, B:102:0x0222, B:104:0x022a, B:105:0x0230, B:107:0x0238, B:108:0x0240, B:110:0x0248, B:112:0x0250, B:116:0x025b, B:118:0x0264, B:122:0x0270, B:123:0x0272, B:125:0x027b, B:129:0x0286, B:137:0x029f, B:139:0x02a7, B:140:0x02d1, B:142:0x02d9, B:143:0x02e1, B:145:0x02ea, B:130:0x0289, B:132:0x0292, B:136:0x029d, B:113:0x0254, B:92:0x0205, B:94:0x020b, B:44:0x0153, B:32:0x010f, B:34:0x0117, B:36:0x011b, B:37:0x0137, B:39:0x013f, B:18:0x0071), top: B:153:0x0043 }] */
    /* JADX WARN: Removed duplicated region for block: B:125:0x027b A[Catch: Throwable -> 0x02f4, TryCatch #1 {Throwable -> 0x02f4, blocks: (B:10:0x0043, B:12:0x0049, B:13:0x004f, B:15:0x0057, B:17:0x0061, B:29:0x0102, B:31:0x0108, B:40:0x0143, B:42:0x014b, B:45:0x0157, B:47:0x015d, B:48:0x0163, B:50:0x0169, B:52:0x0173, B:74:0x01ae, B:75:0x01b7, B:76:0x01c0, B:59:0x0188, B:62:0x0192, B:65:0x019c, B:77:0x01c8, B:79:0x01ce, B:80:0x01d4, B:82:0x01da, B:83:0x01e0, B:85:0x01e6, B:86:0x01ec, B:88:0x01f2, B:89:0x01f8, B:91:0x01fe, B:95:0x0211, B:97:0x0217, B:101:0x0220, B:102:0x0222, B:104:0x022a, B:105:0x0230, B:107:0x0238, B:108:0x0240, B:110:0x0248, B:112:0x0250, B:116:0x025b, B:118:0x0264, B:122:0x0270, B:123:0x0272, B:125:0x027b, B:129:0x0286, B:137:0x029f, B:139:0x02a7, B:140:0x02d1, B:142:0x02d9, B:143:0x02e1, B:145:0x02ea, B:130:0x0289, B:132:0x0292, B:136:0x029d, B:113:0x0254, B:92:0x0205, B:94:0x020b, B:44:0x0153, B:32:0x010f, B:34:0x0117, B:36:0x011b, B:37:0x0137, B:39:0x013f, B:18:0x0071), top: B:153:0x0043 }] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0289 A[Catch: Throwable -> 0x02f4, TryCatch #1 {Throwable -> 0x02f4, blocks: (B:10:0x0043, B:12:0x0049, B:13:0x004f, B:15:0x0057, B:17:0x0061, B:29:0x0102, B:31:0x0108, B:40:0x0143, B:42:0x014b, B:45:0x0157, B:47:0x015d, B:48:0x0163, B:50:0x0169, B:52:0x0173, B:74:0x01ae, B:75:0x01b7, B:76:0x01c0, B:59:0x0188, B:62:0x0192, B:65:0x019c, B:77:0x01c8, B:79:0x01ce, B:80:0x01d4, B:82:0x01da, B:83:0x01e0, B:85:0x01e6, B:86:0x01ec, B:88:0x01f2, B:89:0x01f8, B:91:0x01fe, B:95:0x0211, B:97:0x0217, B:101:0x0220, B:102:0x0222, B:104:0x022a, B:105:0x0230, B:107:0x0238, B:108:0x0240, B:110:0x0248, B:112:0x0250, B:116:0x025b, B:118:0x0264, B:122:0x0270, B:123:0x0272, B:125:0x027b, B:129:0x0286, B:137:0x029f, B:139:0x02a7, B:140:0x02d1, B:142:0x02d9, B:143:0x02e1, B:145:0x02ea, B:130:0x0289, B:132:0x0292, B:136:0x029d, B:113:0x0254, B:92:0x0205, B:94:0x020b, B:44:0x0153, B:32:0x010f, B:34:0x0117, B:36:0x011b, B:37:0x0137, B:39:0x013f, B:18:0x0071), top: B:153:0x0043 }] */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02a7 A[Catch: Throwable -> 0x02f4, TryCatch #1 {Throwable -> 0x02f4, blocks: (B:10:0x0043, B:12:0x0049, B:13:0x004f, B:15:0x0057, B:17:0x0061, B:29:0x0102, B:31:0x0108, B:40:0x0143, B:42:0x014b, B:45:0x0157, B:47:0x015d, B:48:0x0163, B:50:0x0169, B:52:0x0173, B:74:0x01ae, B:75:0x01b7, B:76:0x01c0, B:59:0x0188, B:62:0x0192, B:65:0x019c, B:77:0x01c8, B:79:0x01ce, B:80:0x01d4, B:82:0x01da, B:83:0x01e0, B:85:0x01e6, B:86:0x01ec, B:88:0x01f2, B:89:0x01f8, B:91:0x01fe, B:95:0x0211, B:97:0x0217, B:101:0x0220, B:102:0x0222, B:104:0x022a, B:105:0x0230, B:107:0x0238, B:108:0x0240, B:110:0x0248, B:112:0x0250, B:116:0x025b, B:118:0x0264, B:122:0x0270, B:123:0x0272, B:125:0x027b, B:129:0x0286, B:137:0x029f, B:139:0x02a7, B:140:0x02d1, B:142:0x02d9, B:143:0x02e1, B:145:0x02ea, B:130:0x0289, B:132:0x0292, B:136:0x029d, B:113:0x0254, B:92:0x0205, B:94:0x020b, B:44:0x0153, B:32:0x010f, B:34:0x0117, B:36:0x011b, B:37:0x0137, B:39:0x013f, B:18:0x0071), top: B:153:0x0043 }] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x02d9 A[Catch: Throwable -> 0x02f4, TryCatch #1 {Throwable -> 0x02f4, blocks: (B:10:0x0043, B:12:0x0049, B:13:0x004f, B:15:0x0057, B:17:0x0061, B:29:0x0102, B:31:0x0108, B:40:0x0143, B:42:0x014b, B:45:0x0157, B:47:0x015d, B:48:0x0163, B:50:0x0169, B:52:0x0173, B:74:0x01ae, B:75:0x01b7, B:76:0x01c0, B:59:0x0188, B:62:0x0192, B:65:0x019c, B:77:0x01c8, B:79:0x01ce, B:80:0x01d4, B:82:0x01da, B:83:0x01e0, B:85:0x01e6, B:86:0x01ec, B:88:0x01f2, B:89:0x01f8, B:91:0x01fe, B:95:0x0211, B:97:0x0217, B:101:0x0220, B:102:0x0222, B:104:0x022a, B:105:0x0230, B:107:0x0238, B:108:0x0240, B:110:0x0248, B:112:0x0250, B:116:0x025b, B:118:0x0264, B:122:0x0270, B:123:0x0272, B:125:0x027b, B:129:0x0286, B:137:0x029f, B:139:0x02a7, B:140:0x02d1, B:142:0x02d9, B:143:0x02e1, B:145:0x02ea, B:130:0x0289, B:132:0x0292, B:136:0x029d, B:113:0x0254, B:92:0x0205, B:94:0x020b, B:44:0x0153, B:32:0x010f, B:34:0x0117, B:36:0x011b, B:37:0x0137, B:39:0x013f, B:18:0x0071), top: B:153:0x0043 }] */
    /* JADX WARN: Removed duplicated region for block: B:145:0x02ea A[Catch: Throwable -> 0x02f4, TRY_LEAVE, TryCatch #1 {Throwable -> 0x02f4, blocks: (B:10:0x0043, B:12:0x0049, B:13:0x004f, B:15:0x0057, B:17:0x0061, B:29:0x0102, B:31:0x0108, B:40:0x0143, B:42:0x014b, B:45:0x0157, B:47:0x015d, B:48:0x0163, B:50:0x0169, B:52:0x0173, B:74:0x01ae, B:75:0x01b7, B:76:0x01c0, B:59:0x0188, B:62:0x0192, B:65:0x019c, B:77:0x01c8, B:79:0x01ce, B:80:0x01d4, B:82:0x01da, B:83:0x01e0, B:85:0x01e6, B:86:0x01ec, B:88:0x01f2, B:89:0x01f8, B:91:0x01fe, B:95:0x0211, B:97:0x0217, B:101:0x0220, B:102:0x0222, B:104:0x022a, B:105:0x0230, B:107:0x0238, B:108:0x0240, B:110:0x0248, B:112:0x0250, B:116:0x025b, B:118:0x0264, B:122:0x0270, B:123:0x0272, B:125:0x027b, B:129:0x0286, B:137:0x029f, B:139:0x02a7, B:140:0x02d1, B:142:0x02d9, B:143:0x02e1, B:145:0x02ea, B:130:0x0289, B:132:0x0292, B:136:0x029d, B:113:0x0254, B:92:0x0205, B:94:0x020b, B:44:0x0153, B:32:0x010f, B:34:0x0117, B:36:0x011b, B:37:0x0137, B:39:0x013f, B:18:0x0071), top: B:153:0x0043 }] */
    /* JADX WARN: Removed duplicated region for block: B:158:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void a(com.alibaba.fastjson.JSONObject r19) {
        /*
            Method dump skipped, instructions count: 761
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.avplayer.embed.TriverEmbedTBVideoView.a(com.alibaba.fastjson.JSONObject):void");
    }

    @Override // com.alibaba.ariver.integration.embedview.BaseEmbedView
    public void onEmbedViewSizeChanged(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6967c1b", new Object[]{this, new Integer(i), new Integer(i2)});
        } else {
            a(i, i2);
        }
    }

    @Override // com.alibaba.ariver.engine.api.embedview.IEmbedView
    public void onReceivedMessage(String str, JSONObject jSONObject, BridgeCallback bridgeCallback) {
        int b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("231420a4", new Object[]{this, str, jSONObject, bridgeCallback});
            return;
        }
        try {
            if (this.I == null) {
                this.I = bridgeCallback;
            }
            if ("play".equals(str)) {
                if (this.e != null && this.e.getVideoState() == 2) {
                    this.e.playVideo();
                } else {
                    e();
                    this.e.start();
                }
                a(bridgeCallback, "success");
            } else if (this.e == null) {
            } else {
                if ("pause".equals(str)) {
                    this.e.pauseVideo();
                } else if (TBPlayerConst.TBPlayerMethodSetup.equals(str)) {
                    e();
                } else if ("stop".equals(str)) {
                    b();
                } else if ("changeControllerStatus".equals(str)) {
                    this.H = StringUtils.equals(jSONObject.getString("status"), "1");
                    if (this.H) {
                        this.e.showController();
                    } else {
                        this.e.hideController();
                    }
                } else if ("mute".equals(str) && jSONObject != null && jSONObject.get("ison") != null) {
                    this.e.mute(a("ison", jSONObject));
                } else if ("seek".equals(str) && jSONObject != null && jSONObject.get("time") != null) {
                    if (f()) {
                        b = (int) (c("time", jSONObject) * 1000.0d);
                    } else {
                        b = b("time", jSONObject) * 1000;
                    }
                    this.e.seekTo(b);
                } else if (CommandID.exitFullScreen.equals(str)) {
                    if (!this.e.isFullScreen()) {
                        return;
                    }
                    this.e.toggleScreen();
                    return;
                } else if ("requestFullScreen".equals(str)) {
                    if (this.e.isFullScreen()) {
                        return;
                    }
                    this.e.toggleScreen();
                    return;
                } else if ("playbackRate".equals(str) && jSONObject != null && jSONObject.get(RateNode.TAG) != null) {
                    float floatValue = jSONObject.getFloatValue(RateNode.TAG);
                    if (floatValue <= 2.0f && floatValue >= 0.5f) {
                        this.e.setPlayRate(floatValue);
                    }
                }
                a(bridgeCallback, "success");
            }
        } catch (Throwable th) {
            AVSDKLog.e("AriverTBVideoComp", "onReceivedMessage Error = " + th.getMessage());
            th.printStackTrace();
            a(bridgeCallback, "fail");
        }
    }

    private void a(BridgeCallback bridgeCallback, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2aa2229e", new Object[]{this, bridgeCallback, str});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(str, "true");
        bridgeCallback.sendJSONResponse(jSONObject);
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("state", (Object) Integer.valueOf(i));
        sendEvent("onChangeState", jSONObject, new IEmbedCallback() { // from class: com.taobao.avplayer.embed.TriverEmbedTBVideoView.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alibaba.ariver.engine.api.embedview.IEmbedCallback
            public void onResponse(JSONObject jSONObject2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8435f409", new Object[]{this, jSONObject2});
                } else {
                    jSONObject2.toString();
                }
            }
        });
    }

    private void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("code", (Object) Integer.valueOf(i));
        sendEvent("onError", jSONObject, new IEmbedCallback() { // from class: com.taobao.avplayer.embed.TriverEmbedTBVideoView.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alibaba.ariver.engine.api.embedview.IEmbedCallback
            public void onResponse(JSONObject jSONObject2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8435f409", new Object[]{this, jSONObject2});
                } else {
                    AVSDKLog.d("EmbedLiveView", "sendError");
                }
            }
        });
    }

    private void a(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c194ce8", new Object[]{this, new Boolean(z), new Boolean(z2)});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        String str = "vertical";
        if (z2) {
            jSONObject.put("fullScreen", (Object) true);
            if (z) {
                str = Constants.Value.HORIZONTAL;
            }
            jSONObject.put("direction", (Object) str);
        } else {
            jSONObject.put("direction", (Object) str);
            jSONObject.put("fullScreen", (Object) false);
        }
        sendEvent("onFullScreenChange", jSONObject, null);
        if (this.I == null) {
            return;
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("onFullScreenChange", (Object) jSONObject);
        jSONObject2.put("success", (Object) "true");
        this.I.sendJSONResponse(jSONObject2);
    }

    @Override // com.alibaba.ariver.integration.embedview.BaseEmbedView, com.alibaba.ariver.engine.api.embedview.IEmbedView
    public void sendEvent(String str, JSONObject jSONObject, final IEmbedCallback iEmbedCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2b74017", new Object[]{this, str, jSONObject, iEmbedCallback});
        } else if (this.mOuterPage == null) {
            throw new IllegalStateException("You should call super.onCreate first!!!");
        } else {
            JSONObject jSONObject2 = new JSONObject();
            if (!str.equals(RVEvents.ON_TO_WEBVIEW_MESSAGE)) {
                str = "nbcomponent." + getType() + "." + str;
            }
            if (jSONObject != null) {
                jSONObject.put(BindingXConstants.KEY_ELEMENT, (Object) this.mViewId);
                jSONObject2.put("data", (Object) jSONObject);
            }
            Render render = this.mOuterPage.getRender();
            EngineUtils.sendToRender(render, render.getEngine().getEngineRouter().getWorkerById(EngineUtils.getWorkerId(render)), str, jSONObject2, new SendToRenderCallback() { // from class: com.taobao.avplayer.embed.TriverEmbedTBVideoView.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.alibaba.ariver.engine.api.bridge.model.SendToRenderCallback
                public void onCallBack(JSONObject jSONObject3) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("99ed7a65", new Object[]{this, jSONObject3});
                        return;
                    }
                    IEmbedCallback iEmbedCallback2 = iEmbedCallback;
                    if (iEmbedCallback2 == null) {
                        return;
                    }
                    iEmbedCallback2.onResponse(jSONObject3);
                }
            });
        }
    }

    @Override // com.alibaba.ariver.engine.api.embedview.IEmbedView
    public void onReceivedRender(JSONObject jSONObject, BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7cb20669", new Object[]{this, jSONObject, bridgeCallback});
        } else if (jSONObject == null || jSONObject.size() == 0) {
        } else {
            if (StringUtils.isEmpty(this.f16498a)) {
                a(jSONObject);
            }
            if ((!StringUtils.isEmpty(this.f16498a) || "TBVideo".equals(this.i) || ("YKVideo".equals(this.i) && !StringUtils.isEmpty(this.j))) && this.e == null) {
                e();
            } else {
                AVSDKLog.e("TriverEmbedTBVideoView", "src or videoid is empty");
            }
            bk bkVar = this.e;
            if (bkVar != null && bkVar.getView().getParent() == null) {
                this.d.addView(this.e.getView(), new FrameLayout.LayoutParams(-1, -1, 17));
            }
            a(bridgeCallback, "success");
        }
    }

    @Override // com.alibaba.ariver.engine.api.embedview.IEmbedView
    public void onWebViewResume() {
        bk bkVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb053b0e", new Object[]{this});
        } else if (!this.K || (bkVar = this.e) == null || bkVar.getVideoState() != 2) {
        } else {
            this.e.playVideo();
        }
    }

    @Override // com.alibaba.ariver.engine.api.embedview.IEmbedView
    public void onWebViewPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b457ef63", new Object[]{this});
            return;
        }
        bk bkVar = this.e;
        if (bkVar == null) {
            return;
        }
        bkVar.pauseVideo();
    }

    @Override // com.alibaba.ariver.engine.api.embedview.IEmbedView
    public void onAttachedToWebView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1bdbec2", new Object[]{this});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("elementid", (Object) this.mViewId);
        EngineUtils.sendToRender(this.mOuterPage.getRender(), RVEvents.NBCOMPONENT_CANRENDER, jSONObject, new SendToRenderCallback() { // from class: com.taobao.avplayer.embed.TriverEmbedTBVideoView.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alibaba.ariver.engine.api.bridge.model.SendToRenderCallback
            public void onCallBack(JSONObject jSONObject2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("99ed7a65", new Object[]{this, jSONObject2});
                } else {
                    AVSDKLog.d("TriverVideoView", jSONObject2.toString());
                }
            }
        });
    }

    @Override // com.alibaba.ariver.engine.api.embedview.IEmbedView
    public void onDetachedToWebView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("850d0fb4", new Object[]{this});
        } else {
            b();
        }
    }

    @Override // com.alibaba.ariver.integration.embedview.BaseEmbedView, com.alibaba.ariver.engine.api.embedview.IEmbedView
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        } else {
            b();
        }
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            this.f16498a = null;
        }
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        if (this.e != null) {
            this.A = false;
            if (d()) {
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.taobao.avplayer.embed.TriverEmbedTBVideoView.5
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            TriverEmbedTBVideoView.a(TriverEmbedTBVideoView.this);
                        }
                    }
                });
            } else {
                c();
            }
        }
        a();
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        bk bkVar = this.e;
        if (bkVar == null) {
            return;
        }
        if (bkVar.isFullScreen()) {
            ViewGroup view = this.e.getView();
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            if (viewGroup != null) {
                viewGroup.removeView(view);
            }
            this.e.toggleScreen();
        }
        this.e.setVideoLifecycleListener(null);
        this.e.destroy();
        this.e = null;
        a(0);
    }

    private boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue() : b.a(OrangeConfig.getInstance().getConfig("DWInteractive", "enTriverFullScreenDestroy", "true"));
    }

    private void e() {
        WeakReference<Context> weakReference;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else if (this.A || (weakReference = this.f) == null || weakReference.get() == null) {
        } else {
            bk.a aVar = new bk.a((Activity) this.f.get());
            aVar.k("triver");
            aVar.a(this.f16498a);
            aVar.f(this.q);
            aVar.g(false);
            aVar.c(this.y);
            aVar.b(this.j);
            aVar.c(this.i);
            aVar.d(this.z);
            aVar.j(false);
            aVar.B(this.o);
            aVar.e(this.g);
            aVar.a(this.w);
            aVar.c(this.G);
            aVar.E(false);
            aVar.p(false);
            aVar.G(false);
            aVar.F(false);
            aVar.s(this.s);
            aVar.y(true);
            aVar.h(g());
            aVar.r(true);
            aVar.t(this.t);
            aVar.v(true);
            aVar.w(true);
            aVar.x(this.u);
            aVar.n(!this.v);
            aVar.A(true);
            aVar.o(false);
            aVar.d(true);
            aVar.e(false);
            aVar.M(this.p);
            aVar.D(false);
            aVar.N(this.r);
            aVar.q(this.B);
            aVar.b(this.N);
            aVar.y(h());
            DWAspectRatio dWAspectRatio = this.n;
            if (dWAspectRatio != null) {
                aVar.a(dWAspectRatio);
            }
            if (!StringUtils.isEmpty(this.h)) {
                aVar.g(this.h);
            }
            if (!StringUtils.isEmpty(this.l)) {
                aVar.i(true);
                com.taobao.avplayer.interactivelifecycle.frontcover.model.a aVar2 = new com.taobao.avplayer.interactivelifecycle.frontcover.model.a();
                DWFrontCoverBean dWFrontCoverBean = new DWFrontCoverBean(0L, null, this.l);
                dWFrontCoverBean.setScaleType(this.m);
                aVar2.a(dWFrontCoverBean);
                aVar.a(aVar2);
            }
            this.e = aVar.c();
            if (this.H) {
                this.e.showController();
            } else {
                this.e.hideController();
            }
            this.e.hideGoodsListView();
            this.e.hideTopEventView();
            this.e.hideCloseView();
            this.e.setVideoLifecycleListener(this);
            if (this.G) {
                this.e.setIVideoLoopCompleteListener(this);
            }
            this.e.setRootViewClickListener(this);
            this.e.showOrHideInteractive(false);
            this.e.setIDWMutedChangeListener(this);
            if (this.k || (this.D && this.E)) {
                this.E = true;
                this.F = false;
                a(3);
                this.e.start();
            }
            this.A = true;
            if (!Constants.Value.HORIZONTAL.equals(this.c)) {
                return;
            }
            this.e.toggleScreen();
        }
    }

    public void a(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c1152c8", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        bk bkVar = this.e;
        if (bkVar == null) {
            return;
        }
        bkVar.setFrame(i, i2);
    }

    @Override // com.taobao.avplayer.av
    public void onVideoStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2b2d56d", new Object[]{this});
            return;
        }
        a(5);
        a(1);
    }

    @Override // com.taobao.avplayer.av
    public void onVideoPause(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee9d05f3", new Object[]{this, new Boolean(z)});
        } else {
            a(2);
        }
    }

    @Override // com.taobao.avplayer.av
    public void onVideoPlay() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("931007b7", new Object[]{this});
        } else {
            a(1);
        }
    }

    @Override // com.taobao.avplayer.av
    public void onVideoPrepared(Object obj) {
        bk bkVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3faee61c", new Object[]{this, obj});
            return;
        }
        int i = this.x;
        if (i <= 0 || (bkVar = this.e) == null) {
            return;
        }
        bkVar.seekTo(i * 1000);
        this.x = 0;
    }

    @Override // com.taobao.avplayer.av
    public void onVideoError(Object obj, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7a1a1cf", new Object[]{this, obj, new Integer(i), new Integer(i2)});
        } else if ((i == 1 && i2 == 0) || (-400 > i && i > -600)) {
            b(1008);
        } else if (i == -5 || i == -1094995529 || i == -104 || i == -110 || i == -103) {
            b(1005);
        } else {
            b(1);
        }
    }

    @Override // com.taobao.avplayer.av
    public void onVideoComplete() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3c2c53c", new Object[]{this});
        } else {
            a(4);
        }
    }

    @Override // com.taobao.avplayer.av
    public void onVideoFullScreen() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dcccbde", new Object[]{this});
        } else {
            a(true, true);
        }
    }

    @Override // com.taobao.avplayer.av
    public void onVideoNormalScreen() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff4b0936", new Object[]{this});
        } else {
            a(false, false);
        }
    }

    @Override // com.taobao.avplayer.av
    public void onVideoProgressChanged(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91a8a811", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        if (com.taobao.avplayer.b.d != null && b.a(com.taobao.avplayer.b.d.getConfig("DWInteractive", "EmbedTimeUpdateUseSecond", "true"))) {
            if (this.L || this.M) {
                double d = i / 1000.0d;
                jSONObject.put("currentTime", (Object) Double.valueOf(d));
                jSONObject.put("userPlayDuration", (Object) Double.valueOf(d));
                jSONObject.put("videoDuration", (Object) Double.valueOf(i3 / 1000.0d));
            } else {
                int i4 = i / 1000;
                jSONObject.put("currentTime", (Object) Integer.valueOf(i4));
                jSONObject.put("userPlayDuration", (Object) Integer.valueOf(i4));
                jSONObject.put("videoDuration", (Object) Integer.valueOf(i3 / 1000));
            }
        } else {
            jSONObject.put("currentTime", (Object) Integer.valueOf(i));
            jSONObject.put("userPlayDuration", (Object) Integer.valueOf(i));
            jSONObject.put("videoDuration", (Object) Integer.valueOf(i3));
        }
        sendEvent("onTimeUpdate", jSONObject, null);
    }

    @Override // com.taobao.avplayer.common.z
    public boolean hook() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e6b1302e", new Object[]{this})).booleanValue();
        }
        if (this.I != null) {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("x", (Object) 0);
            jSONObject2.put("y", (Object) 0);
            jSONObject.put("ptInView", (Object) jSONObject2);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("onTap", (Object) jSONObject);
            this.I.sendJSONResponse(jSONObject3);
        }
        return false;
    }

    private boolean f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[]{this})).booleanValue() : b.a(OrangeConfig.getInstance().getConfig("DWInteractive", "seekMsFlagInTriver", "true"));
    }

    private boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[]{this})).booleanValue();
        }
        String config = OrangeConfig.getInstance().getConfig("DWInteractive", "canPlayRateViewInTriver", "*");
        return !StringUtils.isEmpty(config) && ("*".equals(config) || b.b(this.g, config));
    }

    private boolean h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5cf10f3", new Object[]{this})).booleanValue() : b.b(this.g, OrangeConfig.getInstance().getConfig("DWInteractive", kcf.ORANGE_TRIVER_HIDDEN_LOADING_ICON_WHITELIST, ""));
    }
}
