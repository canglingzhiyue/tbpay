package com.taobao.avplayer;

import android.os.AsyncTask;
import android.os.Build;
import android.os.Looper;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.change.app.icon.biz.ChangeAppIconBridge;
import com.taobao.avplayer.core.model.DWRequest;
import com.taobao.avplayer.core.model.DWResponse;
import com.taobao.mediaplay.model.MediaVideoResponse;
import com.taobao.taobaoavsdk.AVSDKLog;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;
import tb.aks;
import tb.kce;
import tb.kcj;
import tb.kge;
import tb.mjz;
import tb.mka;

/* loaded from: classes6.dex */
public class y implements mjz {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ boolean f16623a;
    private static volatile boolean e;
    private static volatile String f;
    private static volatile float g;
    private static volatile String h;
    private HashMap<String, String> b;
    private com.taobao.avplayer.common.v c;
    private String d;
    private mka i;

    static {
        kge.a(1476422975);
        kge.a(1828750134);
        f16623a = !y.class.desiredAssertionStatus();
        e = false;
    }

    public static /* synthetic */ void a(y yVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a982e46", new Object[]{yVar});
        } else {
            yVar.c();
        }
    }

    public static /* synthetic */ mka b(y yVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (mka) ipChange.ipc$dispatch("26e971e", new Object[]{yVar}) : yVar.i;
    }

    public y(String str, HashMap<String, String> hashMap) {
        if (!StringUtils.isEmpty(str)) {
            this.d = str;
        }
        if (hashMap != null) {
            this.b = hashMap;
        }
        try {
            this.c = (com.taobao.avplayer.common.v) Class.forName("com.taobao.avplayer.DWNetworkAdapter").getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (ClassNotFoundException e2) {
            e2.printStackTrace();
        } catch (IllegalAccessException e3) {
            e3.printStackTrace();
        } catch (InstantiationException e4) {
            e4.printStackTrace();
        } catch (NoSuchMethodException e5) {
            e5.printStackTrace();
        } catch (InvocationTargetException e6) {
            e6.printStackTrace();
        }
    }

    private void a(DWRequest dWRequest, com.taobao.avplayer.common.w wVar) {
        com.taobao.avplayer.common.v vVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5bf802e1", new Object[]{this, dWRequest, wVar});
        } else if (dWRequest == null || (vVar = this.c) == null) {
            wVar.onError(null);
        } else {
            vVar.sendRequest(wVar, dWRequest);
        }
    }

    private DWRequest b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DWRequest) ipChange.ipc$dispatch("d31d2450", new Object[]{this});
        }
        DWRequest dWRequest = new DWRequest();
        dWRequest.responseClass = null;
        dWRequest.apiName = h.VIDEOCONFIG_API_NAME;
        dWRequest.apiVersion = "3.0";
        dWRequest.paramMap = new HashMap();
        dWRequest.paramMap.put("expectedCodec", "h265");
        dWRequest.paramMap.put("sdkVersion", h.f16513a);
        dWRequest.paramMap.put("videoId", this.d);
        dWRequest.paramMap.put(ChangeAppIconBridge.KEY_DEVICEMODEL, Build.MODEL);
        dWRequest.paramMap.put("cpuModel", f);
        Map<String, String> map = dWRequest.paramMap;
        map.put("cpuHz", "" + g);
        dWRequest.paramMap.put("deviceMemory", h);
        Map<String, String> map2 = dWRequest.paramMap;
        map2.put("aliHARuntimeEvaluationLevel", "" + aks.a().g().f25407a);
        Map<String, String> map3 = dWRequest.paramMap;
        map3.put("androidSDKVersion", "" + Build.VERSION.SDK_INT);
        dWRequest.paramMap.put("useServerPriority", "1");
        dWRequest.paramMap.putAll(this.b);
        return dWRequest;
    }

    /* loaded from: classes6.dex */
    public class a extends AsyncTask<Void, Void, Void> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-1429999351);
        }

        private a() {
        }

        /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Void, java.lang.Object] */
        @Override // android.os.AsyncTask
        public /* synthetic */ Void doInBackground(Void[] voidArr) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ipChange.ipc$dispatch("e83e4786", new Object[]{this, voidArr}) : a(voidArr);
        }

        @Override // android.os.AsyncTask
        public /* synthetic */ void onPostExecute(Void r4) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b105c779", new Object[]{this, r4});
            } else {
                a(r4);
            }
        }

        public Void a(Void... voidArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Void) ipChange.ipc$dispatch("54f0ab29", new Object[]{this, voidArr});
            }
            y.this.a();
            return null;
        }

        public void a(Void r4) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6f8d528f", new Object[]{this, r4});
            } else {
                y.a(y.this);
            }
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (!e) {
            f = com.taobao.taobaoavsdk.util.b.a();
            g = 0.0f;
            int a2 = kce.a();
            for (int i = 0; i < a2; i++) {
                try {
                    float b = kcj.b(kce.a(i)) / 1000000.0f;
                    if (b > g) {
                        g = b;
                    }
                } catch (Exception e2) {
                    AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "Get MaxCpuFreq Error " + e2);
                }
            }
            h = String.format("%.2f", Double.valueOf((aks.a().f().f25406a / 1000.0d) / 1000.0d));
            e = true;
        }
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else {
            a(b(), new com.taobao.avplayer.common.w() { // from class: com.taobao.avplayer.y.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.avplayer.common.w
                public void onSuccess(DWResponse dWResponse) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("c6105f72", new Object[]{this, dWResponse});
                    } else if (y.b(y.this) == null) {
                    } else {
                        MediaVideoResponse mediaVideoResponse = new MediaVideoResponse();
                        if (dWResponse != null) {
                            mediaVideoResponse.data = dWResponse.data;
                            mediaVideoResponse.errorCode = dWResponse.errorCode;
                            mediaVideoResponse.errorMsg = dWResponse.errorMsg;
                        }
                        y.b(y.this).a(mediaVideoResponse);
                    }
                }

                @Override // com.taobao.avplayer.common.w
                public void onError(DWResponse dWResponse) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("1f1dda8d", new Object[]{this, dWResponse});
                    } else if (y.b(y.this) == null) {
                    } else {
                        MediaVideoResponse mediaVideoResponse = new MediaVideoResponse();
                        if (dWResponse != null) {
                            mediaVideoResponse.data = dWResponse.data;
                            mediaVideoResponse.errorCode = dWResponse.errorCode;
                            mediaVideoResponse.errorMsg = dWResponse.errorMsg;
                        }
                        y.b(y.this).b(mediaVideoResponse);
                    }
                }
            });
        }
    }

    @Override // tb.mjz
    public void a(mka mkaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4a61575", new Object[]{this, mkaVar});
        } else if (mkaVar == null || this.b == null || StringUtils.isEmpty(this.d)) {
        } else {
            this.i = mkaVar;
            if (!e) {
                if (!f16623a && Looper.myLooper() == null) {
                    throw new AssertionError();
                }
                new a().execute(new Void[0]);
                return;
            }
            c();
        }
    }
}
