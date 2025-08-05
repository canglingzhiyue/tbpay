package tb;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.media.MediaMetadataRetriever;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.application.common.c;
import com.taobao.orange.OrangeConfig;
import com.taobao.share.multiapp.ShareBizAdapter;
import com.taobao.tao.TBMainHost;
import com.taobao.tao.TaoApplication;
import com.taobao.tao.util.TaoHelper;
import com.ut.share.business.ShareBusiness;
import io.reactivex.ad;
import io.reactivex.ae;
import io.reactivex.ag;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes8.dex */
public class ocp implements nzg {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public List<a> f31917a;

    /* loaded from: classes8.dex */
    public interface a {
        boolean intercept(Context context, String str);
    }

    /* loaded from: classes8.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static ocp f31919a;

        static {
            kge.a(-630609883);
            f31919a = new ocp();
        }

        public static /* synthetic */ ocp a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (ocp) ipChange.ipc$dispatch("f089b82", new Object[0]) : f31919a;
        }
    }

    static {
        kge.a(-2054233262);
        kge.a(858178270);
    }

    @Override // tb.nzg
    public List<String> h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("b7e2e578", new Object[]{this});
        }
        return null;
    }

    public static ocp i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ocp) ipChange.ipc$dispatch("4c95c67a", new Object[0]) : b.a();
    }

    private ocp() {
        this.f31917a = new ArrayList();
        try {
            this.f31917a.add((a) Class.forName("com.taobao.android.interactive.GuangguangShareNavIntercept").newInstance());
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // tb.nzg
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : TaoHelper.getTTID();
    }

    @Override // tb.nzg
    public Application b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Application) ipChange.ipc$dispatch("2271dcb8", new Object[]{this}) : acg.a();
    }

    @Override // tb.nzg
    public void a(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75c56f77", new Object[]{this, application});
        } else {
            new TaoApplication().onCreate(application);
        }
    }

    @Override // tb.nzg
    public Activity c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Activity) ipChange.ipc$dispatch("2515657e", new Object[]{this}) : c.b();
    }

    @Override // tb.nzg
    public String d() {
        Activity activity;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("43881515", new Object[]{this});
        }
        String str = null;
        try {
            if (com.taobao.share.copy.a.a().e() != null && (activity = com.taobao.share.copy.a.a().e().get()) != null) {
                if (TBMainHost.fromActivity(activity) != null) {
                    if (TBMainHost.a().getCurrentFragment() != null) {
                        str = TBMainHost.a().getCurrentFragment().getClass().getName();
                    }
                } else {
                    str = activity.getClass().getName();
                }
            }
        } catch (Throwable th) {
            nyy.c("TBAppEnv", "getCurPageName err" + th.getMessage());
        }
        return str;
    }

    @Override // tb.nzg
    public boolean e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue() : guc.a(acg.a(), "welBreak");
    }

    @Override // tb.nzg
    public boolean f() {
        com.taobao.global.setting.c a2;
        ksz b2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[]{this})).booleanValue();
        }
        if ("true".equals(OrangeConfig.getInstance().getConfig("android_share", "useTbSettingService", "true")) && (a2 = com.taobao.global.setting.c.a(b(), "mytaobao")) != null && (b2 = a2.b()) != null) {
            return b2.c(true);
        }
        return false;
    }

    @Override // tb.nzg
    public String a(final String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, str}) : (String) ad.create(new ag<String>() { // from class: tb.ocp.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public void subscribe(ae<String> aeVar) throws Exception {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("a8695e13", new Object[]{this, aeVar});
                    return;
                }
                MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                try {
                    mediaMetadataRetriever.setDataSource(str);
                    aeVar.onSuccess(oba.a(false, mediaMetadataRetriever.getFrameAtTime(nyg.d() * 1000 * 1000, 2), ShareBizAdapter.getInstance().getAppEnv().b().getCacheDir(), (Context) ShareBizAdapter.getInstance().getAppEnv().b()));
                } catch (Throwable th) {
                    try {
                        th.printStackTrace();
                        aeVar.onError(th);
                    } finally {
                        mediaMetadataRetriever.release();
                    }
                }
            }
        }).blockingGet();
    }

    @Override // tb.nzg
    public String g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d71944f2", new Object[]{this}) : ShareBusiness.getCacheTaopassword();
    }

    @Override // tb.nzg
    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else {
            ShareBusiness.putCacheTaopassword(str);
        }
    }

    @Override // tb.nzg
    public boolean c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("88097eb8", new Object[]{this, str})).booleanValue();
        }
        if ("true".equals(OrangeConfig.getInstance().getConfig("android_share_bizconfig", "ShareNavIntercept", "false"))) {
            for (a aVar : this.f31917a) {
                if (aVar != null && aVar.intercept(c(), str)) {
                    return false;
                }
            }
        }
        return true;
    }
}
