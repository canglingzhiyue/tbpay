package android.taobao.windvane.export.network;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.riverlogger.RVLLevel;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import tb.kge;

/* loaded from: classes2.dex */
public class RequestCache extends RequestCallback {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private boolean f1591a = false;
    private final List<a> b = new ArrayList();
    private boolean c = false;
    private RequestCallback d;
    private final Request e;

    /* loaded from: classes2.dex */
    public @interface EventType {
        public static final int ON_CUSTOM_EVENT = 5;
        public static final int ON_DATA_RECEIVED = 1;
        public static final int ON_ERROR = 2;
        public static final int ON_FINISHED = 3;
        public static final int ON_NETWORK_RESPONSE = 4;
        public static final int ON_RESPONSE = 0;
    }

    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f1592a;
        public final Object[] b;

        static {
            kge.a(1124445029);
        }

        public a(int i, Object... objArr) {
            this.f1592a = i;
            this.b = objArr;
        }
    }

    static {
        kge.a(-968005173);
    }

    public static /* synthetic */ Object ipc$super(RequestCache requestCache, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public RequestCache(Request request) {
        this.e = request;
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : this.f1591a;
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.f1591a = z;
        }
    }

    public Request b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Request) ipChange.ipc$dispatch("524d6565", new Object[]{this}) : this.e;
    }

    @Override // android.taobao.windvane.export.network.RequestCallback
    public void onResponse(int i, Map<String, List<String>> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb214fe9", new Object[]{this, new Integer(i), map});
            return;
        }
        synchronized (this) {
            if (this.c) {
                if (this.d != null) {
                    this.d.onResponse(i, map);
                }
            } else {
                this.b.add(new a(0, Integer.valueOf(i), map));
            }
        }
    }

    @Override // android.taobao.windvane.export.network.RequestCallback
    public void onNetworkResponse(int i, Map<String, List<String>> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92d71559", new Object[]{this, new Integer(i), map});
            return;
        }
        synchronized (this) {
            if (this.c) {
                if (this.d != null) {
                    this.d.onNetworkResponse(i, map);
                }
            } else {
                this.b.add(new a(4, Integer.valueOf(i), map));
            }
        }
    }

    @Override // android.taobao.windvane.export.network.RequestCallback
    public void onError(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a671c9d", new Object[]{this, new Integer(i), str});
            return;
        }
        synchronized (this) {
            if (this.c) {
                if (this.d != null) {
                    this.d.onError(i, str);
                }
                c();
            } else {
                this.b.add(new a(2, Integer.valueOf(i), str));
            }
        }
    }

    @Override // android.taobao.windvane.export.network.RequestCallback
    public void onFinish() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("badeed9", new Object[]{this});
            return;
        }
        synchronized (this) {
            if (this.c) {
                if (this.d != null) {
                    this.d.onFinish();
                }
                c();
            } else {
                this.b.add(new a(3, new Object[0]));
            }
        }
    }

    @Override // android.taobao.windvane.export.network.RequestCallback
    public void onCustomCallback(int i, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c344bdea", new Object[]{this, new Integer(i), objArr});
            return;
        }
        synchronized (this) {
            if (this.c) {
                if (this.d != null) {
                    this.d.onCustomCallback(i, objArr);
                }
            } else {
                this.b.add(new a(5, Integer.valueOf(i), objArr));
            }
        }
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else {
            this.b.clear();
        }
    }

    @Override // android.taobao.windvane.export.network.RequestCallback
    public void onReceiveData(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f24c16dc", new Object[]{this, bArr});
            return;
        }
        synchronized (this) {
            if (this.c) {
                if (this.d != null) {
                    this.d.onReceiveData(bArr);
                }
            } else {
                this.b.add(new a(1, bArr));
            }
        }
    }

    public boolean a(RequestCallback requestCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("89db773f", new Object[]{this, requestCallback})).booleanValue();
        }
        synchronized (this) {
            if (this.c) {
                com.taobao.android.riverlogger.e.a(RVLLevel.Error, Constants.TAG, "RequestCache has been consumed.");
                return false;
            }
            this.c = true;
            this.d = requestCallback;
            for (a aVar : this.b) {
                if (aVar != null) {
                    Map<String, List<String>> map = null;
                    r5 = null;
                    Object[] objArr = null;
                    String str = null;
                    if (aVar.f1592a != 0 && 4 != aVar.f1592a) {
                        if (1 == aVar.f1592a) {
                            onReceiveData((byte[]) aVar.b[0]);
                        } else if (2 == aVar.f1592a) {
                            int intValue = ((Integer) aVar.b[0]).intValue();
                            if (aVar.b[1] != null) {
                                str = (String) aVar.b[1];
                            }
                            onError(intValue, str);
                        } else if (3 == aVar.f1592a) {
                            onFinish();
                        } else if (5 == aVar.f1592a && aVar.b != null && aVar.b.length > 0) {
                            int intValue2 = ((Integer) aVar.b[0]).intValue();
                            if (aVar.b.length > 1 && aVar.b[1] != null) {
                                objArr = (Object[]) aVar.b[1];
                            }
                            onCustomCallback(intValue2, objArr);
                        }
                    }
                    int intValue3 = ((Integer) aVar.b[0]).intValue();
                    if (aVar.b[1] != null) {
                        map = (Map) aVar.b[1];
                    }
                    if (aVar.f1592a == 0) {
                        onResponse(intValue3, map);
                    } else {
                        onNetworkResponse(intValue3, map);
                    }
                }
            }
            return true;
        }
    }
}
