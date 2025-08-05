package tb;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.wireless.security.open.SecurityGuardManager;
import com.alibaba.wireless.security.open.SecurityGuardParamContext;
import com.android.alibaba.ip.runtime.IpChange;
import com.ta.utdid2.device.UTDevice;
import com.uploader.export.IUploaderEnvironment;
import java.util.HashMap;

@Deprecated
/* loaded from: classes9.dex */
public class rpc implements IUploaderEnvironment {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private volatile String authCode;
    private final Context context;
    private volatile String utdid;
    private volatile int environment = 0;
    private volatile String onlineAppKey = "21646297";
    private volatile String prepareAppKey = "21646297";
    private volatile String dailyAppKey = "4272";
    private final int instanceType = 0;

    @Override // com.uploader.export.IUploaderEnvironment
    public boolean enableFlowControl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8a8f2d57", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // com.uploader.export.IUploaderEnvironment
    public String getDomain() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6fba2f7f", new Object[]{this});
        }
        return null;
    }

    @Override // com.uploader.export.IUploaderEnvironment
    public int getInstanceType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a67e1df", new Object[]{this})).intValue();
        }
        return 0;
    }

    @Override // com.uploader.export.IUploaderEnvironment
    public String getUserId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("58ad3b3d", new Object[]{this});
        }
        return null;
    }

    public rpc(Context context) {
        this.context = context;
    }

    @Override // com.uploader.export.IUploaderEnvironment
    public int getEnvironment() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("487b46d7", new Object[]{this})).intValue() : this.environment;
    }

    public void setEnvironment(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6aea9dab", new Object[]{this, new Integer(i)});
        } else {
            this.environment = i;
        }
    }

    @Override // com.uploader.export.IUploaderEnvironment
    public String getUtdid() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3fdfad6f", new Object[]{this});
        }
        if (this.utdid != null) {
            return this.utdid;
        }
        try {
            this.utdid = UTDevice.getUtdid(this.context);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return this.utdid;
    }

    @Override // com.uploader.export.IUploaderEnvironment
    public String getAppKey() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("49079005", new Object[]{this});
        }
        int environment = getEnvironment();
        if (environment == 0) {
            return this.onlineAppKey;
        }
        if (environment == 1) {
            return this.prepareAppKey;
        }
        if (environment == 2) {
            return this.dailyAppKey;
        }
        return this.onlineAppKey;
    }

    public void setAppKey(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7bc59ea5", new Object[]{this, str, str2, str3});
            return;
        }
        this.onlineAppKey = str;
        this.prepareAppKey = str2;
        this.dailyAppKey = str3;
    }

    @Override // com.uploader.export.IUploaderEnvironment
    public String getAppVersion() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("65f009ac", new Object[]{this});
        }
        try {
            String str = this.context.getPackageManager().getPackageInfo(this.context.getPackageName(), 0).versionName;
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
            return SecurityGuardManager.getInstance(this.context).getSecureSignatureComp().signRequest(securityGuardParamContext, this.authCode);
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
            return SecurityGuardManager.getInstance(context).getStaticDataEncryptComp().staticBinarySafeDecryptNoB64(16, str, bArr, this.authCode);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public void setAuthCode(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b493188", new Object[]{this, str});
        } else {
            this.authCode = str;
        }
    }
}
