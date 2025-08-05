package com.taobao.android.fluid.framework.adapter;

import android.os.Handler;
import android.os.Looper;
import anetwork.channel.NetworkCallBack;
import anetwork.channel.NetworkEvent;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import tb.kge;
import tb.spz;

/* loaded from: classes5.dex */
public interface IHttpNetAdapter extends IAdapter {
    public static final String ADAPTER_NAME = "IHttpNetAdapter";

    /* loaded from: classes5.dex */
    public interface a<T> {
        void a(int i, String str);

        void a(byte[] bArr, T t);

        T b(byte[] bArr, Class<T> cls);
    }

    /* loaded from: classes5.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public String f12451a;
        public int b;

        static {
            kge.a(225175813);
        }

        public c(String str) {
            this.f12451a = str;
        }
    }

    <T> void send(c cVar, a<T> aVar, Class<T> cls);

    /* loaded from: classes5.dex */
    public static class b<T> implements NetworkCallBack.FinishListener, NetworkCallBack.ProgressListener, NetworkCallBack.ResponseCodeListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private a<T> b;
        private Class<T> c;

        /* renamed from: a  reason: collision with root package name */
        private final Handler f12448a = new Handler(Looper.getMainLooper());
        private ByteArrayOutputStream d = new ByteArrayOutputStream();

        static {
            kge.a(1929907320);
            kge.a(-501869850);
            kge.a(1776397793);
            kge.a(-324998464);
        }

        public static /* synthetic */ a a(b bVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("9bb8af6f", new Object[]{bVar}) : bVar.b;
        }

        public b(a<T> aVar, Class<T> cls) {
            this.b = aVar;
            this.c = cls;
        }

        @Override // anetwork.channel.NetworkCallBack.ProgressListener
        public void onDataReceived(NetworkEvent.ProgressEvent progressEvent, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e27ec0e9", new Object[]{this, progressEvent, obj});
            } else if (this.b == null) {
            } else {
                try {
                    this.d.write(progressEvent.getBytedata(), 0, progressEvent.getSize());
                } catch (Exception e) {
                    spz.a("NetCallback", "", e);
                }
            }
        }

        @Override // anetwork.channel.NetworkCallBack.FinishListener
        public void onFinished(NetworkEvent.FinishEvent finishEvent, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a00910e8", new Object[]{this, finishEvent, obj});
                return;
            }
            try {
                if (this.b == null) {
                } else if (finishEvent == null) {
                    a(-1, "");
                    try {
                        this.d.close();
                    } catch (IOException e) {
                        spz.a("NetCallback", "", e);
                    }
                } else if (finishEvent.getHttpCode() < 0) {
                    a(finishEvent.getHttpCode(), finishEvent.getDesc());
                    try {
                        this.d.close();
                    } catch (IOException e2) {
                        spz.a("NetCallback", "", e2);
                    }
                } else {
                    byte[] byteArray = this.d.toByteArray();
                    if (byteArray == null) {
                        a(finishEvent.getHttpCode(), finishEvent.getDesc());
                        try {
                            this.d.close();
                            return;
                        } catch (IOException e3) {
                            spz.a("NetCallback", "", e3);
                            return;
                        }
                    }
                    try {
                        a(byteArray, (byte[]) this.b.b(byteArray, this.c));
                    } catch (Exception unused) {
                        a(finishEvent.getHttpCode(), finishEvent.getDesc());
                    }
                    try {
                        this.d.close();
                    } catch (IOException e4) {
                        spz.a("NetCallback", "", e4);
                    }
                }
            } finally {
                try {
                    this.d.close();
                } catch (IOException e5) {
                    spz.a("NetCallback", "", e5);
                }
            }
        }

        @Override // anetwork.channel.NetworkCallBack.ResponseCodeListener
        public boolean onResponseCode(int i, Map<String, List<String>> map, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("45b007d6", new Object[]{this, new Integer(i), map, obj})).booleanValue();
            }
            if (this.b == null) {
            }
            return false;
        }

        private void a(final int i, final String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("20f12ca5", new Object[]{this, new Integer(i), str});
            } else {
                this.f12448a.post(new Runnable() { // from class: com.taobao.android.fluid.framework.adapter.IHttpNetAdapter.b.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            b.a(b.this).a(i, str);
                        }
                    }
                });
            }
        }

        private void a(final byte[] bArr, final T t) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6cb9894b", new Object[]{this, bArr, t});
            } else {
                this.f12448a.post(new Runnable() { // from class: com.taobao.android.fluid.framework.adapter.IHttpNetAdapter.b.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            b.a(b.this).a(bArr, (byte[]) t);
                        }
                    }
                });
            }
        }
    }
}
