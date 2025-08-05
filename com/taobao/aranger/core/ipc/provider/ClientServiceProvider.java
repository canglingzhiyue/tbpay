package com.taobao.aranger.core.ipc.provider;

import android.os.Binder;
import android.os.IBinder;
import android.os.Looper;
import android.os.Parcel;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.aranger.annotation.method.UIThread;
import com.taobao.aranger.constant.Constants;
import com.taobao.aranger.core.entity.Callback;
import com.taobao.aranger.core.entity.Reply;
import com.taobao.aranger.core.wrapper.ParameterWrapper;
import com.taobao.aranger.exception.IPCException;
import com.taobao.aranger.intf.IClientService;
import com.taobao.aranger.utils.CallbackManager;
import com.taobao.aranger.utils.TypeUtils;
import com.taobao.aranger.utils.b;
import com.taobao.aranger.utils.d;
import com.taobao.aranger.utils.j;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import tb.kak;
import tb.kge;

/* loaded from: classes.dex */
public class ClientServiceProvider extends Binder implements IClientService {
    private static final String TAG;
    private static volatile ClientServiceProvider sInstance;

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this;
    }

    static {
        kge.a(-262534572);
        kge.a(942366253);
        TAG = ClientServiceProvider.class.getSimpleName();
    }

    public static ClientServiceProvider getClientService() {
        if (sInstance == null) {
            synchronized (ClientServiceProvider.class) {
                if (sInstance == null) {
                    sInstance = new ClientServiceProvider();
                }
            }
        }
        return sInstance;
    }

    private ClientServiceProvider() {
        attachInterface(this, Constants.CLIENT_SERVICE_DESCRIPTOR);
    }

    @Override // android.os.Binder
    protected boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 3) {
            if (i == 4) {
                final ArrayList<String> createStringArrayList = parcel.createStringArrayList();
                b.a(false, false, new Runnable() { // from class: com.taobao.aranger.core.ipc.provider.ClientServiceProvider.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange = $ipChange;
                        if (ipChange instanceof IpChange) {
                            ipChange.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        try {
                            if (createStringArrayList == null) {
                                return;
                            }
                            ClientServiceProvider.this.recycle(createStringArrayList);
                        } catch (Exception e) {
                            kak.a(ClientServiceProvider.TAG, "[onTransact][recycle]", e, new Object[0]);
                        }
                    }
                });
            }
            return true;
        }
        final Callback createFromParcel = Callback.CREATOR.createFromParcel(parcel);
        if (i2 == 17 || i2 == 1) {
            b.a(false, false, new Runnable() { // from class: com.taobao.aranger.core.ipc.provider.ClientServiceProvider.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        ClientServiceProvider.this.sendCallback(createFromParcel);
                    }
                }
            });
        } else {
            try {
                Reply sendCallback = sendCallback(createFromParcel);
                if (!createFromParcel.getMethodWrapper().isVoid() || sendCallback.isError() || sendCallback.getFlowParameterWrappers() != null) {
                    sendCallback.writeToParcel(parcel2, 0);
                }
            } catch (Exception e) {
                Reply.obtain().setErrorCode(8).setErrorMessage(e.getMessage()).writeToParcel(parcel2, i2);
            }
        }
        return true;
    }

    @Override // com.taobao.aranger.intf.IClientService
    public Reply sendCallback(Callback callback) {
        Class<?>[] interfaces;
        Exception e;
        Object a2;
        Object a3 = CallbackManager.a().a(callback.getTimeStamp());
        if (a3 == null) {
            return Reply.obtain().setErrorCode(6).setErrorMessage("can't find callback in current process");
        }
        try {
            ArrayList<Integer> arrayList = new ArrayList();
            Method a4 = j.a().a(a3.getClass(), callback.getMethodWrapper(), callback.getParameterWrappers());
            Object[] a5 = d.a(callback.getParameterWrappers(), arrayList);
            boolean z = false;
            for (Class<?> cls : a3.getClass().getInterfaces()) {
                if (TypeUtils.a(cls.getAnnotations(), com.taobao.aranger.annotation.type.Callback.class)) {
                    z = TypeUtils.a(j.a().a(cls, callback.getMethodWrapper(), callback.getParameterWrappers()).getAnnotations(), UIThread.class);
                }
            }
            boolean z2 = true;
            boolean z3 = Looper.getMainLooper() == Looper.myLooper();
            Reply obtain = Reply.obtain();
            boolean z4 = z3 ^ z;
            ParameterWrapper[] parameterWrapperArr = null;
            if (z4) {
                try {
                    a aVar = new a(a4, a3, a5);
                    if (TypeUtils.b(a4.getReturnType()) && arrayList.isEmpty()) {
                        if (z3) {
                            z2 = false;
                        }
                        b.a(z2, false, aVar);
                        return obtain.setResult(null);
                    }
                    CountDownLatch countDownLatch = new CountDownLatch(1);
                    aVar.a(countDownLatch);
                    if (z3) {
                        z2 = false;
                    }
                    b.a(z2, false, aVar);
                    countDownLatch.await(z3 ? 1000L : 10000L, TimeUnit.MILLISECONDS);
                    e = aVar.b();
                    a2 = aVar.a();
                } catch (Exception e2) {
                    return obtain.setErrorCode(7).setErrorMessage("callback invoke error: " + e2.getMessage());
                }
            } else {
                try {
                    a2 = a4.invoke(a3, a5);
                    e = null;
                } catch (Exception e3) {
                    e = e3;
                    a2 = null;
                }
            }
            if (e != null) {
                throw new IPCException(4, e);
            }
            if (!arrayList.isEmpty()) {
                parameterWrapperArr = new ParameterWrapper[arrayList.size()];
                for (Integer num : arrayList) {
                    int intValue = num.intValue();
                    parameterWrapperArr[intValue] = ParameterWrapper.obtain().setData(a5[((Integer) arrayList.get(intValue)).intValue()]);
                }
            }
            return obtain.setFlowParameterWrappers(parameterWrapperArr).setResult(a2);
        } catch (IPCException e4) {
            kak.a(TAG, "[sendCallback]", e4, new Object[0]);
            return Reply.obtain().setErrorCode(e4.getErrorCode()).setErrorMessage(e4.getMessage());
        }
    }

    @Override // com.taobao.aranger.intf.IService
    public void recycle(List<String> list) {
        for (String str : list) {
            CallbackManager.a().b(str);
        }
    }

    /* loaded from: classes6.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private Object f16365a;
        private CountDownLatch b;
        private final Method c;
        private final Object d;
        private final Object[] e;
        private Exception f;

        static {
            kge.a(446244594);
            kge.a(-1390502639);
        }

        public a(Method method, Object obj, Object[] objArr) {
            this.c = method;
            this.d = obj;
            this.e = objArr;
        }

        public void a(CountDownLatch countDownLatch) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("feed444e", new Object[]{this, countDownLatch});
            } else {
                this.b = countDownLatch;
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                try {
                    this.f16365a = this.c.invoke(this.d, this.e);
                    CountDownLatch countDownLatch = this.b;
                    if (countDownLatch == null) {
                        return;
                    }
                    countDownLatch.countDown();
                } catch (Exception e) {
                    kak.a(ClientServiceProvider.TAG, "[CallbackRunnable][run]", e, new Object[0]);
                    this.f = e;
                    CountDownLatch countDownLatch2 = this.b;
                    if (countDownLatch2 == null) {
                        return;
                    }
                    countDownLatch2.countDown();
                }
            } catch (Throwable th) {
                CountDownLatch countDownLatch3 = this.b;
                if (countDownLatch3 != null) {
                    countDownLatch3.countDown();
                }
                throw th;
            }
        }

        public Object a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ipChange.ipc$dispatch("bd3407ca", new Object[]{this}) : this.f16365a;
        }

        public Exception b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Exception) ipChange.ipc$dispatch("c027351f", new Object[]{this}) : this.f;
        }
    }
}
