package tb;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.business.usertrack.track.b;
import com.taobao.android.fluid.framework.data.datamodel.a;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.Map;

/* loaded from: classes5.dex */
public class sor {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int VIEW_RENDER_LAYER_CELL = 2;
    public static final int VIEW_RENDER_LAYER_CONTAINER = 0;
    public static final int VIEW_RENDER_LAYER_INIT = -1;
    public static final int VIEW_RENDER_LAYER_LIST_ROOT = 1;

    /* renamed from: a  reason: collision with root package name */
    public snv f33778a;
    public String b;
    public long c = System.currentTimeMillis();
    public long d;
    public Map e;
    public Map f;
    public boolean g;
    public Map h;
    public Map i;
    public String j;
    public boolean k;
    public String l;
    public String m;
    public Drawable n;
    public TUrlImageView o;
    public boolean p;
    public boolean q;
    public boolean r;
    public boolean s;
    public boolean t;
    public a u;

    static {
        kge.a(-984900718);
    }

    public sor(snv snvVar, String str) {
        this.f33778a = snvVar;
        this.b = str;
        if (snvVar == null || snvVar.f() == null) {
            return;
        }
        snvVar.f().setTag(R.id.fluid_sdk_tag_preloadVideo, this);
    }

    public int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue();
        }
        snv snvVar = this.f33778a;
        if (snvVar != null && snvVar.f() != null) {
            return oec.a(this.f33778a.f().getTag(R.id.fluid_sdk_tag_video_render_layer), -1);
        }
        return -1;
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        snv snvVar = this.f33778a;
        if (snvVar == null || snvVar.f() == null) {
            return;
        }
        this.f33778a.f().setTag(R.id.fluid_sdk_tag_video_render_layer, Integer.valueOf(i));
    }

    public boolean a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e1d6464", new Object[]{this, context})).booleanValue();
        }
        snv snvVar = this.f33778a;
        if (snvVar == null || snvVar.f() == null) {
            return false;
        }
        String a2 = oeb.a("ShortVideo.videoAttachScenario", "huitui");
        if (!TextUtils.equals(a2, "all") && (!this.t || !TextUtils.equals(a2, "huitui"))) {
            return b(context);
        }
        return true;
    }

    public boolean b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9eca1003", new Object[]{this, context})).booleanValue();
        }
        snv snvVar = this.f33778a;
        return (snvVar == null || snvVar.f() == null || this.f33778a.f().getContext() != context) ? false : true;
    }

    public boolean c(Context context) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9f76bba2", new Object[]{this, context})).booleanValue();
        }
        snv snvVar = this.f33778a;
        if (snvVar != null && snvVar.f() != null && (this.f33778a.f().getParent() instanceof ViewGroup)) {
            Context context2 = ((ViewGroup) this.f33778a.f().getParent()).getContext();
            if (context != null && context2 == context) {
                z = true;
            }
        }
        spz.c("PickPreloadController_PickPreloadVideoModule_PreloadVideoData", "isVideoAttachAtContext: " + z + " context:" + context);
        return z;
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        b();
        if (this.f33778a == null) {
            return;
        }
        if (!z && !this.s && !this.k) {
            return;
        }
        this.f33778a.c();
        this.f33778a.d();
        b.c();
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        spz.c("PickPreloadController_PickPreloadVideoModule_PreloadVideoData", "PickPreloadControllerNew,removeFirstFrameLoadingView firstFrameImageView:" + this.o);
        if (this.o == null) {
            return;
        }
        oec.a(new Runnable() { // from class: tb.sor.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else if (sor.this.o == null || !(sor.this.o.getParent() instanceof ViewGroup)) {
                } else {
                    ((ViewGroup) sor.this.o.getParent()).removeView(sor.this.o);
                    sor.this.o = null;
                    spz.c("PickPreloadController_PickPreloadVideoModule_PreloadVideoData", "PickPreloadControllerNew,firstFrameImagerView 移除清空");
                }
            }
        });
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        snv snvVar = this.f33778a;
        if (snvVar == null) {
            return;
        }
        try {
            ViewGroup f = snvVar.f();
            if (f == null || f.getParent() != null) {
                return;
            }
            spz.c("PickPreloadController_PickPreloadVideoModule_PreloadVideoData", "销毁预创建的DW实例");
            this.f33778a.d();
        } catch (Throwable th) {
            spz.c("PickPreloadController_PickPreloadVideoModule_PreloadVideoData", "销毁预创建的DW实例:" + th.getMessage());
        }
    }

    public boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue() : this.f33778a != null;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder();
        sb.append("PreloadedVideo{videoId='");
        sb.append(this.b);
        sb.append('\'');
        sb.append(", mixConfig=");
        String str = "false";
        sb.append(ogv.a(this.h) ? str : "true");
        sb.append('\'');
        sb.append(", firstFrameUrl=");
        sb.append(TextUtils.isEmpty(this.m) ? str : "true");
        sb.append('\'');
        sb.append(", cacheTime=");
        sb.append(this.d);
        sb.append(", videoResourceStr='");
        sb.append(TextUtils.isEmpty(this.j) ? str : "true");
        sb.append('\'');
        sb.append(", isLocalVideo=");
        sb.append(this.k);
        sb.append(", localVideoStr='");
        sb.append(TextUtils.isEmpty(this.l) ? str : "true");
        sb.append('\'');
        sb.append(", isExposed=");
        sb.append(this.p);
        sb.append(", fromIconStream=");
        sb.append(this.q);
        sb.append(", detailResponse=");
        if (!ogv.a(this.e)) {
            str = "true";
        }
        sb.append(str);
        sb.append(", isFromLauncher=");
        sb.append(this.r);
        sb.append(", firstFrameUrl=");
        sb.append(this.m);
        sb.append('}');
        return sb.toString();
    }
}
