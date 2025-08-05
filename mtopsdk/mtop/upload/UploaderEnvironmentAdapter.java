package mtopsdk.mtop.upload;

import android.content.Context;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import mtopsdk.mtop.domain.EnvModeEnum;
import mtopsdk.mtop.global.SDKConfig;
import mtopsdk.mtop.intf.Mtop;
import tb.kge;
import tb.rpc;

/* loaded from: classes9.dex */
public class UploaderEnvironmentAdapter extends rpc {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Mtop mtopInstance;

    /* renamed from: mtopsdk.mtop.upload.UploaderEnvironmentAdapter$1  reason: invalid class name */
    /* loaded from: classes9.dex */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$mtopsdk$mtop$domain$EnvModeEnum = new int[EnvModeEnum.values().length];

        static {
            try {
                $SwitchMap$mtopsdk$mtop$domain$EnvModeEnum[EnvModeEnum.ONLINE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$mtopsdk$mtop$domain$EnvModeEnum[EnvModeEnum.PREPARE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$mtopsdk$mtop$domain$EnvModeEnum[EnvModeEnum.TEST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$mtopsdk$mtop$domain$EnvModeEnum[EnvModeEnum.TEST_SANDBOX.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static {
        kge.a(368447086);
    }

    public static /* synthetic */ Object ipc$super(UploaderEnvironmentAdapter uploaderEnvironmentAdapter, String str, Object... objArr) {
        if (str.hashCode() == 1216038615) {
            return new Integer(super.getEnvironment());
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public UploaderEnvironmentAdapter(Context context) {
        super(context);
        this.mtopInstance = Mtop.instance(null);
        setAuthCode(this.mtopInstance.getMtopConfig().authCode);
    }

    @Override // tb.rpc, com.uploader.export.IUploaderEnvironment
    public int getEnvironment() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("487b46d7", new Object[]{this})).intValue();
        }
        EnvModeEnum globalEnvMode = SDKConfig.getInstance().getGlobalEnvMode();
        if (globalEnvMode != null) {
            int i = AnonymousClass1.$SwitchMap$mtopsdk$mtop$domain$EnvModeEnum[globalEnvMode.ordinal()];
            if (i == 1) {
                return 0;
            }
            if (i == 2) {
                return 1;
            }
            if (i == 3 || i == 4) {
                return 2;
            }
        }
        return super.getEnvironment();
    }

    @Override // tb.rpc, com.uploader.export.IUploaderEnvironment
    public String getAppKey() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("49079005", new Object[]{this}) : this.mtopInstance.getMtopConfig().appKey;
    }

    @Override // tb.rpc, com.uploader.export.IUploaderEnvironment
    public String getUserId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("58ad3b3d", new Object[]{this}) : this.mtopInstance.getUserId();
    }

    @Override // tb.rpc, com.uploader.export.IUploaderEnvironment
    public String getAppVersion() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("65f009ac", new Object[]{this}) : this.mtopInstance.getMtopConfig().appVersion;
    }
}
