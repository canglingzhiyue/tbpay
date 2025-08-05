package com.taobao.android.weex_uikit;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.AsyncTask;
import android.os.Build;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.monitor.b;
import com.taobao.android.weex_framework.ui.d;
import com.taobao.android.weex_framework.ui.g;
import com.taobao.android.weex_framework.ui.j;
import com.taobao.android.weex_framework.ui.k;
import com.taobao.android.weex_framework.ui.m;
import com.taobao.android.weex_framework.util.o;
import com.taobao.android.weex_uikit.ui.MUSView;
import com.taobao.android.weex_uikit.ui.cache.UIRenderView;
import com.taobao.android.weex_uikit.ui.f;
import com.taobao.android.weex_uikit.widget.a.A;
import com.taobao.android.weex_uikit.widget.div.Div;
import com.taobao.android.weex_uikit.widget.img.Image;
import com.taobao.android.weex_uikit.widget.input.Input;
import com.taobao.android.weex_uikit.widget.musview.MUSUrlView;
import com.taobao.android.weex_uikit.widget.overlay.MUSOverlay;
import com.taobao.android.weex_uikit.widget.richtext.RichText;
import com.taobao.android.weex_uikit.widget.scroller.Scroller;
import com.taobao.android.weex_uikit.widget.slide.Slide;
import com.taobao.android.weex_uikit.widget.text.Text;
import com.taobao.android.weex_uikit.widget.video.Video;
import tb.jwr;
import tb.kge;

/* loaded from: classes6.dex */
public class UIKitEngine {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static boolean hasInitSo;
    private static jwr imusViewCreator;
    private static final Bitmap sBitmap;

    public static /* synthetic */ boolean access$000() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("bcd6077b", new Object[0])).booleanValue() : hasInitSo;
    }

    public static /* synthetic */ boolean access$002(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e1554b7f", new Object[]{new Boolean(z)})).booleanValue();
        }
        hasInitSo = z;
        return z;
    }

    public static /* synthetic */ Bitmap access$100() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Bitmap) ipChange.ipc$dispatch("1b39e996", new Object[0]) : sBitmap;
    }

    static {
        kge.a(-1234998388);
        sBitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ALPHA_8);
        hasInitSo = false;
    }

    public static void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[0]);
            return;
        }
        j.a().a(new g() { // from class: com.taobao.android.weex_uikit.UIKitEngine.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.weex_framework.ui.g
            public View a(MUSDKInstance mUSDKInstance) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (View) ipChange2.ipc$dispatch("a0252f50", new Object[]{this, mUSDKInstance});
                }
                if (!UIKitEngine.access$000()) {
                    try {
                        System.loadLibrary("MuiseCore");
                        UIKitEngine.access$002(true);
                    } catch (Throwable th) {
                        b.a();
                        com.taobao.android.weex_framework.util.g.c("loadMuiseCore error", th);
                    }
                }
                MUSView mUSView = new MUSView(mUSDKInstance);
                if (Build.VERSION.SDK_INT >= 16) {
                    mUSView.setBackground(new BitmapDrawable(mUSDKInstance.getUIContext().getResources(), UIKitEngine.access$100()));
                }
                return mUSView;
            }
        });
        UIRenderView.init();
        registerInnerNode();
    }

    public static void registerVideoCreator(jwr jwrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb6d1486", new Object[]{jwrVar});
        } else {
            imusViewCreator = jwrVar;
        }
    }

    public static jwr getVideoCreator() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (jwr) ipChange.ipc$dispatch("68d513f3", new Object[0]) : imusViewCreator;
    }

    private static void registerInnerNode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d338801c", new Object[0]);
            return;
        }
        m.a("div", new Div.a());
        m.a("text", (d) new Text.a(), true);
        m.a("span", (d) new Text.a(), true);
        m.a("input", (d) new Input.a(), false);
        m.a("image", new Image.a());
        m.a("img", (d) new Image.a(), true);
        m.a("a", new A.a());
        m.a("richtext", (d) new RichText.a(), true);
        m.a("p", (d) new RichText.a(), true);
        m.a(f.SCROLLER, new Scroller.a());
        m.a(f.VIDEO, new Video.a());
        m.a(f.SLIDE, new Slide.a());
        m.a(f.MUS_VIEW, (d) new MUSUrlView.a(), true);
        m.a("mus-overlay", new k(new f.a(), MUSOverlay.class));
        innerNodeWarmUp();
    }

    private static void innerNodeWarmUp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4f501f", new Object[0]);
        } else {
            AsyncTask.THREAD_POOL_EXECUTOR.execute(new o() { // from class: com.taobao.android.weex_uikit.UIKitEngine.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.weex_framework.util.o
                public void a() throws Exception {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                        return;
                    }
                    new Div(0);
                    new Text(0);
                    new Image(0);
                    new A(0);
                    new RichText(0);
                    new Input(0);
                }
            });
        }
    }
}
