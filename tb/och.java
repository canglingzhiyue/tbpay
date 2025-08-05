package tb;

import android.app.Activity;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.social.sdk.net.ISocialBusinessListener;
import com.taobao.social.sdk.net.ISocialService;
import com.taobao.social.sdk.net.SocialServiceImpl;
import java.util.Map;

/* loaded from: classes8.dex */
public class och {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static och f31910a;
    private ISocialService b = new SocialServiceImpl();

    static {
        kge.a(400509289);
    }

    public void proLoad() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a838803a", new Object[]{this});
        }
    }

    private och() {
    }

    public static och getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (och) ipChange.ipc$dispatch("2012faa0", new Object[0]);
        }
        if (f31910a == null) {
            synchronized (och.class) {
                if (f31910a == null) {
                    f31910a = new och();
                }
            }
        }
        return f31910a;
    }

    public static void updateCurrentActivity(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e98bb378", new Object[]{activity});
        } else {
            SocialServiceImpl.updateCurrentActivity(activity);
        }
    }

    public void like(boolean z, long j, long j2, String str, ISocialBusinessListener iSocialBusinessListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("116b9d6d", new Object[]{this, new Boolean(z), new Long(j), new Long(j2), str, iSocialBusinessListener});
        } else if (!z) {
            f31910a.b.doLike(j, j2, str, iSocialBusinessListener);
        } else {
            f31910a.b.removeLike(j, j2, iSocialBusinessListener);
        }
    }

    public void like(long j, long j2, String str, ISocialBusinessListener iSocialBusinessListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("960ab5c5", new Object[]{this, new Long(j), new Long(j2), str, iSocialBusinessListener});
        } else {
            f31910a.b.doLike(j, j2, str, iSocialBusinessListener);
        }
    }

    public void like(ocj ocjVar, ISocialBusinessListener iSocialBusinessListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b30c3b75", new Object[]{this, ocjVar, iSocialBusinessListener});
        } else {
            f31910a.b.doLike(ocjVar, iSocialBusinessListener);
        }
    }

    public void like(ock ockVar, ISocialBusinessListener iSocialBusinessListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc6090b6", new Object[]{this, ockVar, iSocialBusinessListener});
        } else {
            f31910a.b.doLike(ockVar, iSocialBusinessListener);
        }
    }

    public void like(Map map, ISocialBusinessListener iSocialBusinessListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50089026", new Object[]{this, map, iSocialBusinessListener});
        } else {
            f31910a.b.doLike(map, iSocialBusinessListener);
        }
    }

    public void cancelLike(long j, long j2, ISocialBusinessListener iSocialBusinessListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1ddc7f5", new Object[]{this, new Long(j), new Long(j2), iSocialBusinessListener});
        } else {
            f31910a.b.removeLike(j, j2, iSocialBusinessListener);
        }
    }

    public void cancelLike(String str, String str2, ISocialBusinessListener iSocialBusinessListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f00b8e1", new Object[]{this, str, str2, iSocialBusinessListener});
        } else {
            f31910a.b.removeLike(str, str2, iSocialBusinessListener);
        }
    }

    public void cancelLike(Map map, ISocialBusinessListener iSocialBusinessListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c927a40", new Object[]{this, map, iSocialBusinessListener});
        } else {
            f31910a.b.removeLike(map, iSocialBusinessListener);
        }
    }

    public void report(long j, long j2, long j3, ISocialBusinessListener iSocialBusinessListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45d5df64", new Object[]{this, new Long(j), new Long(j2), new Long(j3), iSocialBusinessListener});
        } else {
            f31910a.b.report(j, j2, j3, iSocialBusinessListener);
        }
    }

    public void report(long j, long j2, ISocialBusinessListener iSocialBusinessListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6513d52", new Object[]{this, new Long(j), new Long(j2), iSocialBusinessListener});
        } else {
            f31910a.b.report(j, j2, iSocialBusinessListener);
        }
    }

    public void report(ocl oclVar, ISocialBusinessListener iSocialBusinessListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a77a00ba", new Object[]{this, oclVar, iSocialBusinessListener});
        } else {
            f31910a.b.report(oclVar, iSocialBusinessListener);
        }
    }

    public void report(Map map, ISocialBusinessListener iSocialBusinessListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15b76403", new Object[]{this, map, iSocialBusinessListener});
        } else {
            f31910a.b.report(map, iSocialBusinessListener);
        }
    }

    public void getCountAndStatus(oci ociVar, ISocialBusinessListener iSocialBusinessListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23312d5b", new Object[]{this, ociVar, iSocialBusinessListener});
        } else {
            f31910a.b.getCountAndStatus(ociVar, iSocialBusinessListener);
        }
    }

    public void getCountAndStatus(Map map, ISocialBusinessListener iSocialBusinessListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("132f3f1f", new Object[]{this, map, iSocialBusinessListener});
        } else {
            f31910a.b.getCountAndStatus(map, iSocialBusinessListener);
        }
    }
}
