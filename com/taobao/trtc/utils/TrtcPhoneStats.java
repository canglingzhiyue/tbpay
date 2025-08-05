package com.taobao.trtc.utils;

import android.content.Context;
import android.os.Build;
import android.support.v4.content.ContextCompat;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyCallback;
import android.telephony.TelephonyManager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.kge;

/* loaded from: classes9.dex */
public class TrtcPhoneStats {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static com.taobao.trtc.impl.f b;
    private static AtomicBoolean d;

    /* renamed from: a  reason: collision with root package name */
    private final Context f23185a;
    private Object c;

    public static /* synthetic */ void a(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20f12ca5", new Object[]{new Integer(i), str});
        } else {
            b(i, str);
        }
    }

    static {
        kge.a(-450244885);
        d = new AtomicBoolean(false);
    }

    /* loaded from: classes9.dex */
    public static class a extends PhoneStateListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-891926424);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            if (str.hashCode() == -1198008378) {
                super.onCallStateChanged(((Number) objArr[0]).intValue(), (String) objArr[1]);
                return null;
            }
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        private a() {
        }

        @Override // android.telephony.PhoneStateListener
        public void onCallStateChanged(int i, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b897d7c6", new Object[]{this, new Integer(i), str});
                return;
            }
            super.onCallStateChanged(i, str);
            TrtcPhoneStats.a(i, str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes9.dex */
    public static class TrtcTelephonyCallback extends TelephonyCallback implements TelephonyCallback.CallStateListener {
        static {
            kge.a(-1485709961);
            kge.a(-2031327255);
        }

        private TrtcTelephonyCallback() {
        }

        @Override // android.telephony.TelephonyCallback.CallStateListener
        public void onCallStateChanged(int i) {
            TrtcPhoneStats.a(i, "");
        }
    }

    public TrtcPhoneStats(Context context, com.taobao.trtc.impl.f fVar) {
        this.f23185a = context;
        b = fVar;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (ContextCompat.checkSelfPermission(this.f23185a, "android.permission.READ_PHONE_STATE") != 0) {
            TrtcLog.d("TrtcPhoneState", "start error, need android.permission.READ_PHONE_STATE");
        } else {
            try {
                TelephonyManager telephonyManager = (TelephonyManager) com.taobao.trtc.impl.h.f23132a.getSystemService("phone");
                if (telephonyManager == null) {
                    return;
                }
                if (Build.VERSION.SDK_INT < 31) {
                    this.c = new a();
                    telephonyManager.listen((PhoneStateListener) this.c, 32);
                } else {
                    this.c = new TrtcTelephonyCallback();
                    telephonyManager.registerTelephonyCallback(this.f23185a.getMainExecutor(), (TelephonyCallback) this.c);
                }
                d.set(true);
                TrtcLog.d("TrtcPhoneState", "start success");
            } catch (Throwable unused) {
            }
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        d.set(false);
        b = null;
        try {
            TelephonyManager telephonyManager = (TelephonyManager) com.taobao.trtc.impl.h.f23132a.getSystemService("phone");
            if (telephonyManager == null) {
                return;
            }
            if (Build.VERSION.SDK_INT < 31) {
                telephonyManager.listen((PhoneStateListener) this.c, 0);
            } else {
                telephonyManager.unregisterTelephonyCallback((TelephonyCallback) this.c);
            }
            TrtcLog.d("TrtcPhoneState", "stop success");
        } catch (Throwable unused) {
        }
    }

    private static void b(int i, String str) {
        com.taobao.trtc.impl.f fVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1cf2bb84", new Object[]{new Integer(i), str});
        } else if (!d.get() || (fVar = b) == null) {
        } else {
            if (i == 0) {
                fVar.a(110, str);
            } else if (i != 2) {
            } else {
                fVar.a(113, str);
            }
        }
    }
}
