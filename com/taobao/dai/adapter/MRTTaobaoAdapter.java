package com.taobao.dai.adapter;

import android.content.Context;
import android.taobao.windvane.jsbridge.e;
import android.taobao.windvane.jsbridge.q;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.avplayer.TBPlayerConst;
import com.taobao.dai.realtimedebug.WVRealtimeDebugPlugin;
import com.taobao.mrt.c;
import com.taobao.mrt.d;
import com.taobao.mrt.f;
import com.taobao.mrt.utils.a;
import java.lang.reflect.Method;
import tb.kgq;
import tb.kgr;
import tb.kgs;

/* loaded from: classes7.dex */
public class MRTTaobaoAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "MRTTaobaoAdapter";
    public static boolean mBizSDKInit = false;
    public static Context mContext = null;
    public static String mTtid = null;
    public static boolean mWalleInited = false;

    public static /* synthetic */ boolean access$000(Context context, Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c4d2add1", new Object[]{context, obj})).booleanValue() : startDAI(context, obj);
    }

    public static /* synthetic */ void access$100(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18144810", new Object[]{context});
        } else {
            startMNNCV(context);
        }
    }

    public static void startMNNRuntime(Context context, String str, final Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39cfab3a", new Object[]{context, str, obj});
            return;
        }
        a.c(TAG, "[startMNNRuntime]");
        mContext = context;
        mTtid = str;
        registerService();
        c.f18243a = str;
        d.a(new d.a() { // from class: com.taobao.dai.adapter.MRTTaobaoAdapter.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.mrt.d.a
            public void a(d dVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5578d846", new Object[]{this, dVar});
                } else if (dVar == null) {
                } else {
                    if (!dVar.f18245a) {
                        a.c(MRTTaobaoAdapter.TAG, "MRT disabled by orange config: isEnable=false");
                        return;
                    }
                    synchronized (MRTTaobaoAdapter.class) {
                        if (!MRTTaobaoAdapter.mWalleInited) {
                            MRTTaobaoAdapter.mWalleInited = MRTTaobaoAdapter.access$000(MRTTaobaoAdapter.mContext, obj);
                        }
                        if (!MRTTaobaoAdapter.mBizSDKInit) {
                            MRTTaobaoAdapter.mBizSDKInit = true;
                            MRTTaobaoAdapter.access$100(MRTTaobaoAdapter.mContext);
                        }
                    }
                }
            }
        });
        c.a(mContext);
        q.a(com.taobao.dai.realtimedebug.a.REALTIME_DEBUG, (Class<? extends e>) WVRealtimeDebugPlugin.class);
        com.taobao.dai.realtimedebug.a.a();
        setupMNNWB(context);
    }

    private static void setupMNNWB(Context context) {
        try {
            if ((context.getApplicationInfo().flags & 2) == 0) {
                return;
            }
            try {
                Class<?> cls = Class.forName("com.taobao.android.mnndebug.workbench.MNNWB");
                if (cls == null) {
                    return;
                }
                cls.getDeclaredMethod("registerDebugWVPlugin", new Class[0]).invoke(cls, new Object[0]);
                cls.getDeclaredMethod(TBPlayerConst.TBPlayerMethodSetup, Context.class).invoke(cls, context);
                cls.getDeclaredMethod("tryToReconnect", new Class[0]).invoke(cls, new Object[0]);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    private static boolean startDAI(Context context, Object obj) {
        Method declaredMethod;
        if (context == null || obj == null) {
            return false;
        }
        try {
            Class<?> cls = Class.forName("com.tmall.android.dai.DAI");
            Class<?> cls2 = Class.forName("com.tmall.android.dai.DAIConfiguration");
            if (cls != null && cls2 != null && (declaredMethod = cls.getDeclaredMethod("initialize", Context.class, cls2)) != null) {
                declaredMethod.invoke(null, context, obj);
            }
        } catch (Throwable unused) {
            a.c(TAG, "init DAI failed");
        }
        return true;
    }

    private static void startMNNCV(Context context) {
        try {
            Method declaredMethod = Class.forName("com.taobao.android.mnncv.MNNCV").getDeclaredMethod("init", Context.class);
            if (declaredMethod == null) {
                return;
            }
            declaredMethod.invoke(null, context);
        } catch (Throwable unused) {
            a.c(TAG, "init MNNCV failed");
        }
    }

    private static void registerService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49ddee19", new Object[0]);
            return;
        }
        if (f.a().b() == null) {
            f.a().a(new kgs());
        }
        if (f.a().c() == null) {
            f.a().a(new kgr());
        }
        if (f.a().d() != null) {
            return;
        }
        f.a().a(new kgq());
    }
}
