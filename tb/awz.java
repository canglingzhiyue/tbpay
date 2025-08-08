package tb;

import android.app.Activity;
import android.content.Context;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.widget.ImageView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.standard.annotation.AliSDetailScaleType;
import com.taobao.avplayer.DWAspectRatio;
import com.taobao.avplayer.DWInstance;
import com.taobao.avplayer.av;
import com.taobao.avplayer.bk;
import com.taobao.avplayer.interactivelifecycle.frontcover.model.DWFrontCoverBean;

/* loaded from: classes2.dex */
public class awz {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Context f25660a;
    private DWInstance b;
    private String c;

    static {
        kge.a(740964911);
    }

    private awz(Context context, DWInstance dWInstance, String str) {
        this.f25660a = context;
        this.b = dWInstance;
        this.c = str;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            this.b.start();
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            this.b.playVideo();
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else {
            this.b.pauseVideo();
        }
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else {
            this.b.destroy();
        }
    }

    public void a(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c1152c8", new Object[]{this, new Integer(i), new Integer(i2)});
        } else {
            this.b.setFrame(i, i2);
        }
    }

    public void a(av avVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("173676bc", new Object[]{this, avVar});
        } else {
            this.b.setVideoLifecycleListener(avVar);
        }
    }

    public int e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5a4ca5f", new Object[]{this})).intValue() : this.b.getVideoState();
    }

    public View f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("8c57b8ef", new Object[]{this}) : this.b.getView();
    }

    public String g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d71944f2", new Object[]{this}) : this.c;
    }

    /* loaded from: classes2.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private Context f25661a;
        private String b;
        private String c;
        private String d;
        private String e = AliSDetailScaleType.centerCrop;
        private String f = AliSDetailScaleType.centerCrop;
        private String g = "true";
        private String h = "true";
        private String i = "true";
        private int j = 0;
        private int k = 0;

        static {
            kge.a(679965190);
        }

        public a(Context context) {
            this.f25661a = context;
        }

        public a a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("15ee4533", new Object[]{this, str});
            }
            this.b = str;
            return this;
        }

        public a b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("9e1e8512", new Object[]{this, str});
            }
            this.c = str;
            return this;
        }

        public a c(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("264ec4f1", new Object[]{this, str});
            }
            this.d = str;
            return this;
        }

        public a d(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("ae7f04d0", new Object[]{this, str});
            }
            if (StringUtils.isEmpty(str)) {
                str = AliSDetailScaleType.centerCrop;
            }
            this.e = str;
            return this;
        }

        public a e(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("36af44af", new Object[]{this, str});
            }
            if (StringUtils.isEmpty(str)) {
                str = AliSDetailScaleType.centerCrop;
            }
            this.f = str;
            return this;
        }

        public a f(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("bedf848e", new Object[]{this, str});
            }
            String str2 = "false";
            if (!StringUtils.equals(str, str2)) {
                str2 = "true";
            }
            this.g = str2;
            return this;
        }

        public a g(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("470fc46d", new Object[]{this, str});
            }
            String str2 = "false";
            if (!StringUtils.equals(str, str2)) {
                str2 = "true";
            }
            this.h = str2;
            return this;
        }

        public a h(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("cf40044c", new Object[]{this, str});
            }
            String str2 = "false";
            if (!StringUtils.equals(str, str2)) {
                str2 = "true";
            }
            this.i = str2;
            return this;
        }

        public a a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("cc5243ea", new Object[]{this, new Integer(i)});
            }
            if (i <= 0) {
                i = 0;
            }
            this.j = i;
            return this;
        }

        public a b(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("262dae2b", new Object[]{this, new Integer(i)});
            }
            if (i <= 0) {
                i = 0;
            }
            this.k = i;
            return this;
        }

        public awz a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (awz) ipChange.ipc$dispatch("f028a9a", new Object[]{this});
            }
            Context context = this.f25661a;
            if (!(context instanceof Activity)) {
                arc.a().b("AURAVideoPlayer.Builder:context is not Activity");
                return null;
            }
            bk.a aVar = new bk.a((Activity) context);
            aVar.e("AURA");
            aVar.c("TBVideo");
            aVar.q(true);
            aVar.N(StringUtils.equals(this.g, "true"));
            aVar.f(StringUtils.equals(this.i, "true"));
            aVar.a(0, 9, 35, 0);
            aVar.g(false);
            aVar.H(false);
            aVar.B(false);
            aVar.x(false);
            aVar.n(false);
            DWAspectRatio dWAspectRatio = DWAspectRatio.DW_CENTER_CROP;
            if (StringUtils.equals(this.e, AliSDetailScaleType.fitCenter)) {
                dWAspectRatio = DWAspectRatio.DW_FIT_CENTER;
            } else if (StringUtils.equals(this.e, "fitXY")) {
                dWAspectRatio = DWAspectRatio.DW_FIT_X_Y;
            }
            aVar.a(dWAspectRatio);
            aVar.b(this.b);
            aVar.a(this.c);
            aVar.c(this.j);
            aVar.d(this.k);
            if (!StringUtils.isEmpty(this.d)) {
                DWFrontCoverBean dWFrontCoverBean = new DWFrontCoverBean(0L, null, this.d);
                ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER_CROP;
                if (StringUtils.equals(this.f, AliSDetailScaleType.fitCenter)) {
                    scaleType = ImageView.ScaleType.FIT_CENTER;
                } else if (StringUtils.equals(this.f, "fitXY")) {
                    scaleType = ImageView.ScaleType.FIT_XY;
                }
                dWFrontCoverBean.setScaleType(scaleType);
                com.taobao.avplayer.interactivelifecycle.frontcover.model.a aVar2 = new com.taobao.avplayer.interactivelifecycle.frontcover.model.a();
                aVar2.a(dWFrontCoverBean);
                aVar.a(aVar2);
                aVar.i(true);
            } else {
                aVar.i(false);
            }
            bk c = aVar.c();
            if (c == null) {
                return null;
            }
            c.hideCloseView();
            c.hideMiniProgressBar();
            if (StringUtils.equals(this.h, "false")) {
                c.hideController();
            }
            return new awz(this.f25661a, c, this.b);
        }
    }
}
