package tb;

import android.app.Application;
import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OConstant;
import java.util.HashMap;
import mtopsdk.mtop.intf.Mtop;
import mtopsdk.mtop.intf.MtopSetting;
import mtopsdk.mtop.intf.MtopUnitStrategy;

/* loaded from: classes.dex */
public class khm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static volatile khm f30073a;
    private Application b;
    private Context c;
    private String d;
    private String e;
    private int f = 0;

    public static khm a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (khm) ipChange.ipc$dispatch("f06dc6e", new Object[0]);
        }
        if (f30073a == null) {
            synchronized (khm.class) {
                if (f30073a == null) {
                    f30073a = new khm();
                }
            }
        }
        return f30073a;
    }

    public Application b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Application) ipChange.ipc$dispatch("2271dcb8", new Object[]{this}) : this.b;
    }

    public void a(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f47168dc", new Object[]{this, application, hashMap});
            return;
        }
        khu.a("init application " + application + ", params" + hashMap);
        this.b = application;
        a(hashMap);
        b(hashMap);
    }

    public void a(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75c56f77", new Object[]{this, application});
            return;
        }
        this.b = application;
        khp.a(application);
    }

    public void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
        } else {
            this.c = context;
        }
    }

    public Context c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("c833dc62", new Object[]{this});
        }
        khu.a("mApplication: " + this.b + ", mContext: " + this.c);
        Application application = this.b;
        return application != null ? application : this.c.getApplicationContext();
    }

    public String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("43881515", new Object[]{this});
        }
        khu.a("mTtid: " + this.e);
        return this.e;
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            this.e = str;
        }
    }

    public int e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5a4ca5f", new Object[]{this})).intValue() : this.f;
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else {
            this.f = i;
        }
    }

    public String f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("50938a53", new Object[]{this}) : this.d;
    }

    public void a(HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("656bbc4b", new Object[]{this, hashMap});
        } else {
            this.d = (String) hashMap.get("process");
        }
    }

    public void b(HashMap<String, Object> hashMap) {
        String str;
        String str2;
        int i;
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("616d4b2a", new Object[]{this, hashMap});
        } else if (!khp.a()) {
        } else {
            try {
                str = (String) hashMap.get("appVersion");
                try {
                    str2 = (String) hashMap.get("ttid");
                    try {
                        obj = hashMap.get(OConstant.LAUNCH_ENVINDEX);
                    } catch (Exception e) {
                        e = e;
                        khu.a("initQMtop: " + e.getMessage());
                        i = 0;
                        MtopSetting.setAppKeyIndex(Mtop.Id.INNER, 0, 2);
                        MtopSetting.setAppVersion(Mtop.Id.INNER, str);
                        MtopSetting.setMtopDomain(Mtop.Id.INNER, MtopUnitStrategy.GUIDE_ONLINE_DOMAIN, MtopUnitStrategy.GUIDE_PRE_DOMAIN, MtopUnitStrategy.GUIDE_DAILY_DOMAIN);
                        a(i);
                        a(str2);
                    }
                } catch (Exception e2) {
                    e = e2;
                    str2 = null;
                }
            } catch (Exception e3) {
                e = e3;
                str = null;
                str2 = null;
            }
            if (obj != null) {
                i = ((Integer) obj).intValue();
                MtopSetting.setAppKeyIndex(Mtop.Id.INNER, 0, 2);
                MtopSetting.setAppVersion(Mtop.Id.INNER, str);
                MtopSetting.setMtopDomain(Mtop.Id.INNER, MtopUnitStrategy.GUIDE_ONLINE_DOMAIN, MtopUnitStrategy.GUIDE_PRE_DOMAIN, MtopUnitStrategy.GUIDE_DAILY_DOMAIN);
                a(i);
                a(str2);
            }
            i = 0;
            MtopSetting.setAppKeyIndex(Mtop.Id.INNER, 0, 2);
            MtopSetting.setAppVersion(Mtop.Id.INNER, str);
            MtopSetting.setMtopDomain(Mtop.Id.INNER, MtopUnitStrategy.GUIDE_ONLINE_DOMAIN, MtopUnitStrategy.GUIDE_PRE_DOMAIN, MtopUnitStrategy.GUIDE_DAILY_DOMAIN);
            a(i);
            a(str2);
        }
    }
}
