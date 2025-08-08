package com.alibaba.openid.device;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.provider.Settings;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.hihonor.cloudservice.oaid.IOAIDCallBack;
import com.hihonor.cloudservice.oaid.IOAIDService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import tb.bzi;
import tb.kge;

/* loaded from: classes2.dex */
public class HonorDeviceIdSupplier implements bzi {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static String f3164a;

    public static /* synthetic */ boolean a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{str})).booleanValue() : c(str);
    }

    public static /* synthetic */ String b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6111438d", new Object[]{str});
        }
        f3164a = str;
        return str;
    }

    static {
        kge.a(-2024695657);
        kge.a(981749981);
        f3164a = "";
    }

    @Override // tb.bzi
    public String a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bbc5dc40", new Object[]{this, context});
        }
        if (context == null) {
            return null;
        }
        try {
            if (!Boolean.parseBoolean(Settings.Secure.getString(context.getContentResolver(), "oaid_limit_state")) && Build.VERSION.SDK_INT >= 17) {
                String string = Settings.Global.getString(context.getContentResolver(), "oaid");
                if (c(string)) {
                    f3164a = string;
                    return string;
                }
            }
        } catch (Throwable unused) {
        }
        a aVar = new a();
        Intent intent = new Intent();
        intent.setAction("com.hihonor.id.HnOaIdService");
        intent.setPackage("com.hihonor.id");
        if (context.bindService(intent, aVar, 1)) {
            try {
                IOAIDService.Stub.asInterface(aVar.a()).getOAID(new OAIDCallBack());
                return f3164a;
            } catch (Exception unused2) {
            } finally {
                context.unbindService(aVar);
            }
        }
        return null;
    }

    /* loaded from: classes2.dex */
    private static final class OAIDCallBack extends IOAIDCallBack.Stub {
        static {
            kge.a(1255039199);
        }

        @Override // com.hihonor.cloudservice.oaid.IOAIDCallBack
        public void basicTypes(int i, long j, boolean z, float f, double d, String str) throws RemoteException {
        }

        private OAIDCallBack() {
        }

        @Override // com.hihonor.cloudservice.oaid.IOAIDCallBack
        public void handleResult(int i, Bundle bundle) throws RemoteException {
            if (i != 0 || bundle == null) {
                return;
            }
            String string = bundle.getString("oa_id_flag");
            if (!HonorDeviceIdSupplier.a(string)) {
                return;
            }
            HonorDeviceIdSupplier.b(string);
        }
    }

    /* loaded from: classes2.dex */
    public static final class a implements ServiceConnection {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public boolean f3165a;
        private final LinkedBlockingQueue<IBinder> b;

        static {
            kge.a(-1278271307);
            kge.a(808545181);
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5a4ef237", new Object[]{this, componentName});
            }
        }

        private a() {
            this.f3165a = false;
            this.b = new LinkedBlockingQueue<>();
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1495fa3c", new Object[]{this, componentName, iBinder});
                return;
            }
            try {
                this.b.put(iBinder);
            } catch (InterruptedException unused) {
            }
        }

        public IBinder a() throws InterruptedException {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (IBinder) ipChange.ipc$dispatch("a817e655", new Object[]{this});
            }
            if (this.f3165a) {
                throw new IllegalStateException();
            }
            this.f3165a = true;
            return this.b.poll(5L, TimeUnit.SECONDS);
        }
    }

    private static boolean c(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("88097eb8", new Object[]{str})).booleanValue() : !StringUtils.isEmpty(str) && !str.equalsIgnoreCase("00000000-0000-0000-0000-000000000000");
    }
}
