package com.taobao.fence.client;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.service.Services;
import com.taobao.fence.aidl.ITBFenceService;
import com.taobao.fence.common.FenceDataDTO;
import com.taobao.fence.common.ResultEnums;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import tb.kge;

/* loaded from: classes7.dex */
public class TBFenceClient {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static WeakReference<TBFenceClient> c;

    /* renamed from: a  reason: collision with root package name */
    private ITBFenceService f17165a;
    private WeakReference<Context> b;
    private int d = -1;

    /* loaded from: classes7.dex */
    public enum TypeEnum {
        GEOMETRY(1),
        WIFI(2),
        IBEACON(4);
        
        public int type;

        TypeEnum(int i) {
            this.type = i;
        }

        public int getType() {
            return this.type;
        }
    }

    static {
        kge.a(1155207259);
    }

    public static /* synthetic */ ITBFenceService a(TBFenceClient tBFenceClient, ITBFenceService iTBFenceService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ITBFenceService) ipChange.ipc$dispatch("8cb5ec7a", new Object[]{tBFenceClient, iTBFenceService});
        }
        tBFenceClient.f17165a = iTBFenceService;
        return iTBFenceService;
    }

    public static /* synthetic */ WeakReference a(TBFenceClient tBFenceClient) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WeakReference) ipChange.ipc$dispatch("2d3e92c", new Object[]{tBFenceClient}) : tBFenceClient.b;
    }

    public static TBFenceClient newInstance(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBFenceClient) ipChange.ipc$dispatch("fc3e58a2", new Object[]{context});
        }
        TBFenceClient tBFenceClient = new TBFenceClient(context);
        WeakReference<TBFenceClient> weakReference = c;
        if (weakReference != null) {
            weakReference.clear();
            c = null;
        }
        c = new WeakReference<>(tBFenceClient);
        return tBFenceClient;
    }

    /* loaded from: classes7.dex */
    public final class a extends AsyncTask<Void, Void, Void> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(612622381);
        }

        private a() {
        }

        /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Void, java.lang.Object] */
        @Override // android.os.AsyncTask
        public /* synthetic */ Void doInBackground(Void[] voidArr) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ipChange.ipc$dispatch("e83e4786", new Object[]{this, voidArr}) : a(voidArr);
        }

        public Void a(Void... voidArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Void) ipChange.ipc$dispatch("54f0ab29", new Object[]{this, voidArr});
            }
            try {
                TBFenceClient.a(TBFenceClient.this, (ITBFenceService) Services.get((Context) TBFenceClient.a(TBFenceClient.this).get(), ITBFenceService.class));
                return null;
            } catch (Exception unused) {
                return null;
            }
        }
    }

    public int getScanTime() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("376298da", new Object[]{this})).intValue() : this.d;
    }

    public void setScanTime(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47c75d70", new Object[]{this, new Integer(i)});
        } else {
            this.d = i;
        }
    }

    public static TBFenceClient getFenceClient() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBFenceClient) ipChange.ipc$dispatch("49d798a3", new Object[0]);
        }
        WeakReference<TBFenceClient> weakReference = c;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    private TBFenceClient(Context context) {
        this.b = new WeakReference<>(context);
        new a().execute(new Void[0]);
    }

    public void gatherData(List<String> list, TypeEnum... typeEnumArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4335eb83", new Object[]{this, list, typeEnumArr});
        } else if (Thread.currentThread().getId() != Looper.getMainLooper().getThread().getId() && typeEnumArr != null && typeEnumArr.length != 0) {
            HashSet hashSet = new HashSet();
            for (TypeEnum typeEnum : typeEnumArr) {
                hashSet.add(typeEnum);
            }
            int a2 = a(hashSet);
            if (this.f17165a == null && this.b.get() != null) {
                this.f17165a = (ITBFenceService) Services.get(this.b.get(), ITBFenceService.class);
            }
            if (this.f17165a == null) {
                return;
            }
            try {
                this.f17165a.gatherData(a2, JSON.toJSONString(list));
            } catch (RemoteException unused) {
            }
        }
    }

    public FenceDataDTO getData(long j, List<String> list, TypeEnum... typeEnumArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FenceDataDTO) ipChange.ipc$dispatch("b39876bc", new Object[]{this, new Long(j), list, typeEnumArr});
        }
        if (Thread.currentThread().getId() == Looper.getMainLooper().getThread().getId()) {
            return new FenceDataDTO(false, ResultEnums.MAIN_THREAD_FAIL);
        }
        if (typeEnumArr == null || typeEnumArr.length == 0) {
            return new FenceDataDTO(false, ResultEnums.PARAMETER_FAIL);
        }
        HashSet hashSet = new HashSet();
        for (TypeEnum typeEnum : typeEnumArr) {
            hashSet.add(typeEnum);
        }
        int a2 = a(hashSet);
        if (this.f17165a == null && this.b.get() != null) {
            this.f17165a = (ITBFenceService) Services.get(this.b.get(), ITBFenceService.class);
        }
        if (this.f17165a == null) {
            return new FenceDataDTO(false, ResultEnums.SYS_FAIL);
        }
        try {
            return this.f17165a.getData(a2, j, JSON.toJSONString(list));
        } catch (RemoteException unused) {
            Log.e("TBFenceClient", "getData method fail!");
            return new FenceDataDTO(false, ResultEnums.REMOTE_ERROR);
        }
    }

    private static int a(Set<TypeEnum> set) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("64b9554a", new Object[]{set})).intValue();
        }
        if (set != null) {
            for (TypeEnum typeEnum : set) {
                i += typeEnum.getType();
            }
        }
        return i;
    }
}
