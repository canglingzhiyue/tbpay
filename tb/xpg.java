package tb;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.alinnkit.core.AliNNFlipType;
import com.taobao.android.alinnkit.entity.FaceDetectionReport;
import com.taobao.android.alinnkit.entity.NativeFaceInfo;
import com.taobao.android.alinnkit.net.FaceDetectionNet;
import com.taobao.taolive.room.utils.ab;
import com.taobao.taolive.room.utils.d;
import com.taobao.taolive.sdk.utils.o;
import java.util.HashMap;

/* loaded from: classes8.dex */
public class xpg {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static HashMap<Integer, xpg> f34455a;
    private FaceDetectionNet c;
    private Context e;
    private String f;
    private Handler g;
    private a h;
    private int i;
    private final String b = "jwH6QKsj+j1mHV3+pbi26Kh55aMzO/mKmHUqTY+E414CkWcXIqkh8kYP+7hkQn3lvEfmfx4RrRcitG0aMWLRsz2upDoAfAG/Yd5ry/iQf2M=";
    private FaceDetectionNet.a d = new FaceDetectionNet.a();
    private Runnable j = new Runnable() { // from class: tb.xpg.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (xpg.a(xpg.this) == null || xpg.b(xpg.this) <= 0) {
            } else {
                xpg xpgVar = xpg.this;
                xpg.a(xpgVar, xpg.a(xpgVar).a(), xpg.b(xpg.this), xpg.a(xpg.this), true);
            }
        }
    };

    /* loaded from: classes8.dex */
    public interface a {
        Bitmap a();

        void a(float f, int i);
    }

    public static /* synthetic */ FaceDetectionNet a(xpg xpgVar, FaceDetectionNet faceDetectionNet) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FaceDetectionNet) ipChange.ipc$dispatch("a016112d", new Object[]{xpgVar, faceDetectionNet});
        }
        xpgVar.c = faceDetectionNet;
        return faceDetectionNet;
    }

    public static /* synthetic */ a a(xpg xpgVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("60820df1", new Object[]{xpgVar}) : xpgVar.h;
    }

    public static /* synthetic */ void a(xpg xpgVar, Bitmap bitmap, int i, a aVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b602cfb2", new Object[]{xpgVar, bitmap, new Integer(i), aVar, new Boolean(z)});
        } else {
            xpgVar.a(bitmap, i, aVar, z);
        }
    }

    public static /* synthetic */ int b(xpg xpgVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("f6379a7d", new Object[]{xpgVar})).intValue() : xpgVar.i;
    }

    static {
        kge.a(575375129);
        f34455a = new HashMap<>();
    }

    public static void a(Context context, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("258f9aa3", new Object[]{context, new Integer(i)});
        } else if (!o.V() || f34455a.containsKey(Integer.valueOf(i))) {
        } else {
            f34455a.put(Integer.valueOf(i), new xpg(context));
            ab.b("TBLiveAIImmersiveService", "TBLiveAIImmersiveService generateInstance with identify = " + i);
        }
    }

    public static xpg a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xpg) ipChange.ipc$dispatch("e669cbfc", new Object[]{new Integer(i)});
        }
        if (!f34455a.containsKey(Integer.valueOf(i))) {
            return null;
        }
        return f34455a.get(Integer.valueOf(i));
    }

    public static void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{new Integer(i)});
        } else if (f34455a.get(Integer.valueOf(i)) == null) {
        } else {
            f34455a.get(Integer.valueOf(i)).a();
            f34455a.remove(Integer.valueOf(i));
            ab.b("TBLiveAIImmersiveService", "TBLiveAIImmersiveService onDestroy with identify = " + i);
        }
    }

    private xpg(Context context) {
        b();
        a(context);
        this.e = context;
        this.g = new Handler(Looper.getMainLooper());
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            this.d.f9026a = FaceDetectionNet.FaceDetectMode.SCOPE_DETECT_MODE_IMAGE;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(java.util.HashMap<java.lang.String, java.lang.String> r9, tb.xpg.a r10) {
        /*
            r8 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = tb.xpg.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 0
            if (r1 == 0) goto L18
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r2] = r8
            r2 = 1
            r1[r2] = r9
            r9 = 2
            r1[r9] = r10
            java.lang.String r9 = "32e7be0f"
            r0.ipc$dispatch(r9, r1)
            return
        L18:
            if (r10 != 0) goto L1b
            return
        L1b:
            java.lang.String r0 = "isMoveUp"
            java.lang.Object r0 = r9.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            boolean r0 = com.taobao.taolive.sdk.utils.l.a(r0, r2)
            java.lang.String r1 = "containerHeight"
            java.lang.Object r1 = r9.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            int r1 = com.taobao.taolive.sdk.utils.l.a(r1, r2)
            java.lang.String r3 = "scene"
            java.lang.Object r3 = r9.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r4 = "bizCode"
            java.lang.Object r9 = r9.get(r4)
            java.lang.String r9 = (java.lang.String) r9
            r8.h = r10
            r8.i = r1
            boolean r4 = r8.a(r3, r9)
            java.lang.String r5 = ", bizCode= "
            java.lang.String r6 = "TBLiveAIImmersiveService"
            if (r4 != 0) goto L6d
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r0 = "人脸服务鉴权失败，scene= "
            r10.append(r0)
            r10.append(r3)
            r10.append(r5)
            r10.append(r9)
            java.lang.String r9 = r10.toString()
            com.taobao.taolive.room.utils.ab.b(r6, r9)
            return
        L6d:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r7 = "startImmersive，scene="
            r4.append(r7)
            r4.append(r3)
            r4.append(r5)
            r4.append(r9)
            java.lang.String r9 = " isMoveUp"
            r4.append(r9)
            r4.append(r0)
            java.lang.String r9 = r4.toString()
            com.taobao.taolive.room.utils.ab.f(r6, r9)
            java.lang.String r9 = "GoodFrame"
            boolean r9 = r9.equals(r3)
            r4 = 4604705439004963635(0x3fe7333333333333, double:0.725)
            if (r9 == 0) goto La6
            int r9 = com.taobao.taolive.room.utils.d.f()
        La1:
            double r6 = (double) r9
            double r6 = r6 * r4
            int r1 = (int) r6
            goto Lb3
        La6:
            java.lang.String r9 = "insideDetail"
            boolean r9 = r9.equals(r3)
            if (r9 == 0) goto Lb3
            int r9 = com.taobao.taolive.room.utils.d.f()
            goto La1
        Lb3:
            r8.i = r1
            if (r0 == 0) goto Lc5
            java.lang.String r9 = r8.f
            if (r9 != 0) goto Ldf
            r8.f = r3
            android.graphics.Bitmap r9 = r10.a()
            r8.a(r9, r1, r10, r2)
            return
        Lc5:
            java.lang.String r9 = r8.f
            if (r9 == 0) goto Ldf
            boolean r9 = r9.equals(r3)
            if (r9 == 0) goto Ldf
            r9 = 0
            r8.f = r9
            android.os.Handler r9 = r8.g
            java.lang.Runnable r0 = r8.j
            r9.removeCallbacks(r0)
            r9 = 0
            r0 = 200(0xc8, float:2.8E-43)
            r10.a(r9, r0)
        Ldf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.xpg.a(java.util.HashMap, tb.xpg$a):void");
    }

    private boolean a(String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d9378d80", new Object[]{this, str, str2})).booleanValue() : o.V() && !o.Y().contains(str2) && str != null && !o.X().contains(str);
    }

    private void a(Bitmap bitmap, int i, a aVar, boolean z) {
        IpChange ipChange = $ipChange;
        int i2 = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a07a16b3", new Object[]{this, bitmap, new Integer(i), aVar, new Boolean(z)});
            return;
        }
        FaceDetectionReport[] a2 = a(bitmap);
        if (a2 != null) {
            int length = a2.length;
            int length2 = a2.length;
            int i3 = 0;
            while (i2 < length2) {
                i3 += a2[i2].rect.bottom;
                i2++;
            }
            i2 = d.f() - (i3 / length);
        } else if (o.W()) {
            i2 = c();
        } else if (!z && this.g != null) {
            ab.e("TBLiveAIImmersiveService", "calculateOffset repeat");
            this.g.postDelayed(this.j, 100L);
            return;
        }
        if (i2 <= 0 || i <= i2 || aVar == null) {
            return;
        }
        if (z) {
            aVar.a(-(i - i2), 150);
        } else {
            aVar.a(-(i - i2), 250);
        }
    }

    private int c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5889b5d", new Object[]{this})).intValue();
        }
        int e = o.e();
        if (e > 0) {
            return d.a(this.e, e);
        }
        return 0;
    }

    private FaceDetectionReport[] a(Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FaceDetectionReport[]) ipChange.ipc$dispatch("dc902086", new Object[]{this, bitmap});
        }
        if (bitmap == null) {
            ab.b("TBLiveAIImmersiveService", "bitmap is null");
            return null;
        } else if (this.c == null) {
            ab.b("TBLiveAIImmersiveService", "人脸检测网络模型创建中");
            a(this.e);
            return null;
        } else {
            long currentTimeMillis = System.currentTimeMillis();
            int[] iArr = new int[bitmap.getWidth() * bitmap.getHeight()];
            bitmap.getPixels(iArr, 0, bitmap.getWidth(), 0, 0, bitmap.getWidth(), bitmap.getHeight());
            FaceDetectionReport[] a2 = this.c.a(iArr, bitmap.getWidth(), bitmap.getHeight(), 0, 0L, 0, AliNNFlipType.FLIP_NONE, true, (NativeFaceInfo) null);
            ab.f("TBLiveAIImmersiveService", "faceDetect 耗时：" + (System.currentTimeMillis() - currentTimeMillis));
            if (a2 != null) {
                return a2;
            }
            ab.b("TBLiveAIImmersiveService", sft.LIVE_ALGO_FAILURE_RESULT_ISNULL_ERROR);
            return null;
        }
    }

    public void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
            return;
        }
        ab.b("TBLiveAIImmersiveService", "prepareNet start, appkey=" + pmd.a().u().b() + " appname=" + pmd.a().u().a(this.e));
        if (this.c != null) {
            a();
        }
        final long currentTimeMillis = System.currentTimeMillis();
        FaceDetectionNet.a(context, this.d, "jwH6QKsj+j1mHV3+pbi26Kh55aMzO/mKmHUqTY+E414CkWcXIqkh8kYP+7hkQn3lvEfmfx4RrRcitG0aMWLRsz2upDoAfAG/Yd5ry/iQf2M=", new dpu<FaceDetectionNet>() { // from class: tb.xpg.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.dpu
            public void a(FaceDetectionNet faceDetectionNet) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("83db4dcc", new Object[]{this, faceDetectionNet});
                    return;
                }
                xpg.a(xpg.this, faceDetectionNet);
                ab.e("TBLiveAIImmersiveService", "prepareNet 耗时：" + (System.currentTimeMillis() - currentTimeMillis));
            }

            @Override // tb.dpu
            public void a(int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
                } else {
                    ab.e("TBLiveAIImmersiveService", "prepareNet onProgressUpdate：");
                }
            }

            @Override // tb.dpu
            public void a(Throwable th) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("fb9ad88d", new Object[]{this, th});
                    return;
                }
                ab.b("TBLiveAIImmersiveService", "prepareNet onFailed：" + th.getMessage());
            }
        });
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        if (this.c != null) {
            ab.b("TBLiveAIImmersiveService", "forward_net onRelease");
            this.c.release();
            this.c = null;
        }
        Handler handler = this.g;
        if (handler == null) {
            return;
        }
        handler.removeCallbacksAndMessages(null);
        this.g = null;
    }
}
