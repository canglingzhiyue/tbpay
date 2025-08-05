package tb;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.wireless.security.open.SecurityGuardManager;
import com.alibaba.wireless.security.open.SecurityGuardParamContext;
import com.android.alibaba.ip.runtime.IpChange;
import com.ta.utdid2.device.UTDevice;
import com.uploader.export.UploaderGlobal;
import com.uploader.export.m;
import java.util.HashMap;

/* loaded from: classes.dex */
public class rpd extends m {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Context f33296a;
    private volatile String b;
    private volatile int c;

    @Override // com.uploader.export.IUploaderEnvironment
    public boolean enableFlowControl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8a8f2d57", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // com.uploader.export.IUploaderEnvironment
    public String getUserId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("58ad3b3d", new Object[]{this});
        }
        return null;
    }

    public rpd(Context context, int i) {
        super(i);
        this.c = 0;
        if (context == null) {
            this.f33296a = UploaderGlobal.a();
        } else {
            this.f33296a = context;
        }
    }

    public rpd(Context context) {
        this(context, 0);
    }

    @Override // com.uploader.export.m, com.uploader.export.IUploaderEnvironment
    public int getEnvironment() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("487b46d7", new Object[]{this})).intValue() : this.c;
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else {
            this.c = i;
        }
    }

    @Override // com.uploader.export.IUploaderEnvironment
    public String getUtdid() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3fdfad6f", new Object[]{this});
        }
        if (this.b != null) {
            return this.b;
        }
        try {
            this.b = UTDevice.getUtdid(this.f33296a);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return this.b;
    }

    @Override // com.uploader.export.IUploaderEnvironment
    public String getAppVersion() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("65f009ac", new Object[]{this});
        }
        try {
            String str = this.f33296a.getPackageManager().getPackageInfo(this.f33296a.getPackageName(), 0).versionName;
            return TextUtils.isEmpty(str) ? "0" : str;
        } catch (Throwable unused) {
            return "0";
        }
    }

    @Override // com.uploader.export.IUploaderEnvironment
    public String signature(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("59879677", new Object[]{this, str});
        }
        HashMap hashMap = new HashMap(1);
        hashMap.put("INPUT", str);
        SecurityGuardParamContext securityGuardParamContext = new SecurityGuardParamContext();
        securityGuardParamContext.appKey = getAppKey();
        securityGuardParamContext.paramMap = hashMap;
        securityGuardParamContext.requestType = 3;
        try {
            return SecurityGuardManager.getInstance(this.f33296a).getSecureSignatureComp().signRequest(securityGuardParamContext, a().e);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override // com.uploader.export.IUploaderEnvironment
    public int putSslTicket(Context context, String str, byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("699c5fdc", new Object[]{this, context, str, bArr})).intValue();
        }
        try {
            return SecurityGuardManager.getInstance(context).getDynamicDataStoreComp().putByteArray(str, bArr);
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }

    @Override // com.uploader.export.IUploaderEnvironment
    public byte[] getSslTicket(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("a0e03714", new Object[]{this, context, str});
        }
        try {
            return SecurityGuardManager.getInstance(context).getDynamicDataStoreComp().getByteArray(str);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override // com.uploader.export.IUploaderEnvironment
    public byte[] decrypt(Context context, String str, byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("6cd37cb8", new Object[]{this, context, str, bArr});
        }
        try {
            return SecurityGuardManager.getInstance(context).getStaticDataEncryptComp().staticBinarySafeDecryptNoB64(16, str, bArr, a().e);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
