package com.taobao.android.fcanvas.integration;

import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fcanvas.integration.FCanvasInstance;
import com.taobao.android.fcanvas.integration.adapter.c;
import com.taobao.android.fcanvas.integration.bridge.FCanvasJNIBridge;
import com.taobao.android.fcanvas.integration.image.ExternalAdapterImageProvider;
import java.io.Serializable;
import org.json.JSONArray;
import tb.kge;

/* loaded from: classes5.dex */
public class FCanvas implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "FCanvas";
    private final ExternalAdapterImageProvider mImageProvider;
    private final boolean mIsTinyAppInsideMode;
    private final com.taobao.android.fcanvas.integration.adapter.a mLoggingAdapter;
    private final com.taobao.android.fcanvas.integration.adapter.c mOnlineConfigAdapter;

    static {
        kge.a(-1630313729);
        kge.a(1028243835);
    }

    private FCanvas(a aVar) {
        this.mLoggingAdapter = a.a(aVar);
        this.mOnlineConfigAdapter = a.b(aVar);
        this.mIsTinyAppInsideMode = a.c(aVar);
        this.mImageProvider = a.d(aVar);
    }

    private void loadUnicornLibrary(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a94aa38", new Object[]{this, context});
            return;
        }
        try {
            com.taobao.android.weex.e.a().a((Application) context.getApplicationContext());
            printLog(0, "[FCanvasJNIBridge] load library success", null);
        } catch (Throwable th) {
            printLog(3, "[FCanvasJNIBridge] load library failed because of " + th.getMessage(), th);
        }
    }

    private void loadFCanvasCoreLibrary() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ae1d5eb", new Object[]{this});
            return;
        }
        try {
            System.loadLibrary("fcanvas_core");
            printLog(0, "[FCanvasJNIBridge] load library success", null);
        } catch (Throwable th) {
            printLog(3, "[FCanvasJNIBridge] load library failed", th);
        }
    }

    public static void installImageProviderOnce(ExternalAdapterImageProvider externalAdapterImageProvider) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7fee950d", new Object[]{externalAdapterImageProvider});
        } else {
            FCanvasJNIBridge.installExternalAdapterImageProvider(externalAdapterImageProvider);
        }
    }

    private void installOnlineConfigAdapter(com.taobao.android.fcanvas.integration.adapter.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c855951", new Object[]{this, cVar});
        } else if (cVar == null) {
        } else {
            cVar.a(new c.a() { // from class: com.taobao.android.fcanvas.integration.FCanvas.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.fcanvas.integration.adapter.c.a
                public void a(String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f3a64c32", new Object[]{this, str});
                    } else if (TextUtils.isEmpty(str)) {
                    } else {
                        FCanvasJNIBridge.nNotifyOnOnlineConfigChanged(str);
                    }
                }
            });
        }
    }

    public FCanvasInstance createInstance(Context context, String str, String str2, FCanvasInstance.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FCanvasInstance) ipChange.ipc$dispatch("47ae000f", new Object[]{this, context, str, str2, aVar});
        }
        if (context == null || str == null || aVar == null) {
            return null;
        }
        if (this.mIsTinyAppInsideMode) {
            loadFCanvasCoreLibrary();
        } else {
            loadUnicornLibrary(context);
        }
        installImageProviderOnce(this.mImageProvider);
        installOnlineConfigAdapter(this.mOnlineConfigAdapter);
        return new FCanvasInstance(context, str, str2, aVar, this);
    }

    public static JSONArray dumpProfileInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("902e7806", new Object[0]);
        }
        String dumpProfileInfo = FCanvasJNIBridge.dumpProfileInfo();
        if (!TextUtils.isEmpty(dumpProfileInfo)) {
            try {
                return new JSONArray(dumpProfileInfo);
            } catch (Throwable th) {
                Log.e(TAG, "unhandled err : ", th);
            }
        }
        return new JSONArray();
    }

    public void printLog(int i, String str, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d875466", new Object[]{this, new Integer(i), str, th});
            return;
        }
        com.taobao.android.fcanvas.integration.adapter.a aVar = this.mLoggingAdapter;
        if (aVar == null) {
            return;
        }
        try {
            aVar.a(3, TAG, str, th);
        } catch (Throwable th2) {
            Log.e(TAG, "unhandled err : ", th2);
        }
    }

    public void updateOnlineConfig(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b1c22ef", new Object[]{this, str});
        } else if (TextUtils.isEmpty(str)) {
        } else {
            FCanvasJNIBridge.nNotifyOnOnlineConfigChanged(str);
        }
    }

    /* loaded from: classes5.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private com.taobao.android.fcanvas.integration.adapter.a f12316a;
        private ExternalAdapterImageProvider b;
        private com.taobao.android.fcanvas.integration.adapter.c c;
        private boolean d;

        static {
            kge.a(186829526);
        }

        public static /* synthetic */ com.taobao.android.fcanvas.integration.adapter.a a(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (com.taobao.android.fcanvas.integration.adapter.a) ipChange.ipc$dispatch("b10965a8", new Object[]{aVar}) : aVar.f12316a;
        }

        public static /* synthetic */ com.taobao.android.fcanvas.integration.adapter.c b(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (com.taobao.android.fcanvas.integration.adapter.c) ipChange.ipc$dispatch("da70dec5", new Object[]{aVar}) : aVar.c;
        }

        public static /* synthetic */ boolean c(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f74d3661", new Object[]{aVar})).booleanValue() : aVar.d;
        }

        public static /* synthetic */ ExternalAdapterImageProvider d(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (ExternalAdapterImageProvider) ipChange.ipc$dispatch("d54d6674", new Object[]{aVar}) : aVar.b;
        }

        public a a(com.taobao.android.fcanvas.integration.adapter.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("a427f834", new Object[]{this, aVar});
            }
            this.f12316a = aVar;
            return this;
        }

        public a a(ExternalAdapterImageProvider externalAdapterImageProvider) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("d76340cb", new Object[]{this, externalAdapterImageProvider});
            }
            this.b = externalAdapterImageProvider;
            return this;
        }

        public a a(com.taobao.android.fcanvas.integration.adapter.c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("be9d5b36", new Object[]{this, cVar});
            }
            this.c = cVar;
            return this;
        }

        public FCanvas a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (FCanvas) ipChange.ipc$dispatch("955e80fe", new Object[]{this}) : new FCanvas(this);
        }
    }
}
