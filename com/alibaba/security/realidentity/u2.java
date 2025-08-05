package com.alibaba.security.realidentity;

import android.content.Context;
import android.os.Build;
import com.alibaba.security.ccrc.enums.InitState;
import com.alibaba.security.ccrc.interfaces.OnCcrcCallback;
import com.alibaba.security.ccrc.interfaces.OnDetectRiskListener;
import com.alibaba.security.ccrc.model.InitResult;
import com.alibaba.security.ccrc.service.CcrcContext;
import com.alibaba.security.ccrc.service.CcrcDetectResult;
import com.alibaba.security.ccrc.service.CcrcService;
import com.alibaba.security.wukong.model.meta.ByteImage;
import com.alibaba.security.wukong.model.meta.Image;
import com.alibaba.security.wukong.model.multi.stream.ImageStreamRiskSample;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class u2 implements t2 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String f = "u2";
    public static final String g = "cro_rpsdk_identity";
    public static final String h = "1212@rpsdk_android_1.0";
    public static final String i = "originImgNum";
    public static final String j = "verifyImgNum";
    public static final String k = "retryTime";
    public static final String l = "rpSdkVersion";
    public static final String m = "rpSdkName";
    public static final String n = "osName";
    public static final String o = "osVersion";
    public static final String p = "mobileModel";
    public static final String q = "clientType";
    public static final String r = "appName";
    public static final String s = "appVersion";
    public static final String t = "clientInfo";

    /* renamed from: a  reason: collision with root package name */
    public String f3528a;
    public boolean b;
    public final Map<String, String> c;
    public Context d;
    public ImageStreamRiskSample e;

    /* loaded from: classes3.dex */
    public class a implements OnCcrcCallback {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ s2 f3529a;

        public a(s2 s2Var) {
            this.f3529a = s2Var;
        }

        @Override // com.alibaba.security.ccrc.interfaces.OnCcrcCallback
        public void onInit(InitState initState, InitResult initResult) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fe7d6f63", new Object[]{this, initState, initResult});
                return;
            }
            String a2 = u2.a();
            com.alibaba.security.realidentity.a.a(a2, "init result: " + initState + ", msg: " + initResult.getErrorMsg());
            if (initState.equals(InitState.INIT_SUCCESS) || initState.equals(InitState.INITED)) {
                this.f3529a.a();
            } else {
                this.f3529a.a(initResult.getPid(), initResult.getErrorMsg());
            }
        }
    }

    /* loaded from: classes3.dex */
    public class b implements OnDetectRiskListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ s2 f3530a;

        public b(s2 s2Var) {
            this.f3530a = s2Var;
        }

        @Override // com.alibaba.security.ccrc.interfaces.OnDetectRiskListener
        public void onDetectResult(CcrcDetectResult ccrcDetectResult) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3ef0f7da", new Object[]{this, ccrcDetectResult});
            } else if (ccrcDetectResult == null) {
            } else {
                this.f3530a.a(ccrcDetectResult.getDataID(), ccrcDetectResult.isSuccess(), ccrcDetectResult.isRisk(), ccrcDetectResult.getErrorMsg());
            }
        }
    }

    public u2() {
        this.b = true;
        this.c = new HashMap();
    }

    public static /* synthetic */ String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[0]) : f;
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        this.c.put("rpSdkVersion", g2.f3421a);
        this.c.put("rpSdkName", f2.f3401a);
        this.c.put("osName", "Android");
        this.c.put("osVersion", Build.VERSION.RELEASE);
        this.c.put("mobileModel", Build.MODEL);
        this.c.put(q, GrsBaseInfo.CountryCodeSource.APP);
        Context context = this.d;
        if (context == null) {
            return;
        }
        this.c.put("appName", j.b(context));
        this.c.put("appVersion", j.a(this.d));
    }

    private CcrcService c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CcrcService) ipChange.ipc$dispatch("ccc02a01", new Object[]{this});
        }
        try {
            return CcrcService.getService(g);
        } catch (Throwable unused) {
            return null;
        }
    }

    private boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue();
        }
        try {
            Class.forName("com.alibaba.security.ccrc.service.CcrcContext");
            Class.forName("com.alibaba.security.ccrc.service.CcrcService");
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    @Override // com.alibaba.security.realidentity.t2
    public void release() {
        CcrcService c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca5510e", new Object[]{this});
        } else if (!this.b || !d() || (c = c()) == null) {
        } else {
            c.deActivate();
        }
    }

    @Override // com.alibaba.security.realidentity.t2
    public void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
        } else if (!this.b || !d()) {
        } else {
            this.d = context;
            CcrcContext.init(context, h, false);
            CcrcService c = c();
            if (c == null) {
                return;
            }
            c.prepare();
        }
    }

    public u2(boolean z) {
        this.b = true;
        this.c = new HashMap();
        this.b = z;
    }

    @Override // com.alibaba.security.realidentity.t2
    public void a(String str, s2 s2Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90eb179d", new Object[]{this, str, s2Var});
        } else if (s2Var == null || !this.b || !d()) {
        } else {
            b();
            CcrcService.Config build = new CcrcService.Config.Builder().setPid(str).setExtras(null).build();
            CcrcService c = c();
            if (c == null) {
                return;
            }
            this.f3528a = str;
            this.e = new ImageStreamRiskSample(str);
            c.activate(build, new a(s2Var));
            c.setRiskCallback(new b(s2Var));
        }
    }

    @Override // com.alibaba.security.realidentity.t2
    public void a(byte[] bArr, int i2, int i3, int i4, int... iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9aa4f22", new Object[]{this, bArr, new Integer(i2), new Integer(i3), new Integer(i4), iArr});
        } else if (!this.b || !d() || this.e == null || bArr == null || bArr.length <= 0) {
        } else {
            HashMap hashMap = new HashMap(4);
            hashMap.put(i, Integer.valueOf(iArr[0]));
            hashMap.put(j, Integer.valueOf(iArr[1]));
            hashMap.put(k, Integer.valueOf(iArr[2]));
            hashMap.put("clientInfo", this.c);
            ByteImage byteImage = new ByteImage(bArr, i2, i3, 2);
            byteImage.setExtras(hashMap);
            this.e.detect(c(), (Image) byteImage, false);
        }
    }
}
