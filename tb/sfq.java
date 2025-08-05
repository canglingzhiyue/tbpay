package tb;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.taobao.util.l;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.ali.user.mobile.app.constant.UTConstant;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.mnncv.MNNCVExecutor;
import com.taobao.infoflow.taobao.subservice.biz.facedetectorservice.impl.AutoSelectView;
import com.taobao.infoflow.taobao.subservice.biz.facedetectorservice.impl.FaceDetectorConfig;
import com.taobao.mrt.task.MRTRuntimeException;
import com.taobao.taolive.uikit.api.TBLiveOpenCardView;
import java.util.Map;
import mtopsdk.mtop.upload.domain.UploadConstants;

/* loaded from: classes7.dex */
public class sfq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private TBLiveOpenCardView f33526a;
    private MNNCVExecutor b;
    private long d;
    private AutoSelectView e;
    private a f;
    private FaceDetectorConfig h;
    private volatile String l;
    private volatile boolean c = false;
    private ppk g = new ppk();

    static {
        kge.a(-1800222737);
    }

    public static /* synthetic */ ppk a(sfq sfqVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ppk) ipChange.ipc$dispatch("e9a3d6a1", new Object[]{sfqVar}) : sfqVar.g;
    }

    public static /* synthetic */ void a(sfq sfqVar, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7085e33", new Object[]{sfqVar, new Integer(i), str});
        } else {
            sfqVar.a(i, str);
        }
    }

    public static /* synthetic */ void a(sfq sfqVar, ViewGroup viewGroup, Rect rect) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19ab76a0", new Object[]{sfqVar, viewGroup, rect});
        } else {
            sfqVar.a(viewGroup, rect);
        }
    }

    public static /* synthetic */ void a(sfq sfqVar, TBLiveOpenCardView tBLiveOpenCardView, ppj ppjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f196e5e", new Object[]{sfqVar, tBLiveOpenCardView, ppjVar});
        } else {
            sfqVar.a(tBLiveOpenCardView, ppjVar);
        }
    }

    public static /* synthetic */ boolean a(sfq sfqVar, Runnable runnable, TBLiveOpenCardView tBLiveOpenCardView, ppj ppjVar, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("dd4ab038", new Object[]{sfqVar, runnable, tBLiveOpenCardView, ppjVar, new Boolean(z)})).booleanValue() : sfqVar.a(runnable, tBLiveOpenCardView, ppjVar, z);
    }

    public static /* synthetic */ boolean a(sfq sfqVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d5dbec7e", new Object[]{sfqVar, new Boolean(z)})).booleanValue();
        }
        sfqVar.c = z;
        return z;
    }

    public static /* synthetic */ boolean b(sfq sfqVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ed27001f", new Object[]{sfqVar})).booleanValue() : sfqVar.c;
    }

    public static /* synthetic */ void c(sfq sfqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dbaa069c", new Object[]{sfqVar});
        } else {
            sfqVar.c();
        }
    }

    public static /* synthetic */ String d(sfq sfqVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("2baf2523", new Object[]{sfqVar}) : sfqVar.l;
    }

    public static /* synthetic */ long e(sfq sfqVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("b8b01392", new Object[]{sfqVar})).longValue() : sfqVar.d;
    }

    public static /* synthetic */ FaceDetectorConfig f(sfq sfqVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FaceDetectorConfig) ipChange.ipc$dispatch("392db7ee", new Object[]{sfqVar}) : sfqVar.h;
    }

    public void a(FaceDetectorConfig faceDetectorConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf8d577", new Object[]{this, faceDetectorConfig});
            return;
        }
        this.h = faceDetectorConfig;
        this.g.a(faceDetectorConfig.g());
    }

    public void a(TBLiveOpenCardView tBLiveOpenCardView, JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39f2ed0a", new Object[]{this, tBLiveOpenCardView, jSONObject, jSONObject2});
        } else if (!sfr.a()) {
        } else {
            this.f33526a = tBLiveOpenCardView;
            if (this.f33526a == null) {
                return;
            }
            this.l = jSONObject == null ? "" : jSONObject.getString("sectionBizCode");
            if (this.f != null) {
                ljd.a().e(this.f);
            }
            this.g.a(this.h.g());
            this.f = new a(this.l, this.f33526a, jSONObject2);
            ljd.a().a(this.f);
        }
    }

    /* loaded from: classes7.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public TBLiveOpenCardView f33529a;
        private final String c;
        private final ppj d;
        private boolean e = true;

        static {
            kge.a(-2085980363);
            kge.a(-1390502639);
        }

        public static /* synthetic */ ppj a(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (ppj) ipChange.ipc$dispatch("816c4f7f", new Object[]{aVar}) : aVar.d;
        }

        public a(String str, TBLiveOpenCardView tBLiveOpenCardView, JSONObject jSONObject) {
            this.c = str;
            this.f33529a = tBLiveOpenCardView;
            this.d = sfq.a(sfq.this).a(str);
            this.d.c = System.currentTimeMillis();
            this.d.a(jSONObject);
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            if (!sfq.b(sfq.this)) {
                sfq.c(sfq.this);
            }
            if (!TextUtils.equals(this.c, sfq.d(sfq.this))) {
                return;
            }
            this.e = !sfq.a(sfq.this, this, this.f33529a, this.d, this.e);
        }
    }

    /* loaded from: classes7.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private View b;
        private ppj c;

        static {
            kge.a(975808204);
            kge.a(-1390502639);
        }

        public static /* synthetic */ View a(b bVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("77c7d0de", new Object[]{bVar}) : bVar.b;
        }

        public b(View view, ppj ppjVar) {
            this.b = view;
            this.c = ppjVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            ppj ppjVar = this.c;
            if (ppjVar != null) {
                ppjVar.a();
            }
            View view = this.b;
            if (view == null || view.getScaleX() == 1.0f) {
                return;
            }
            ljd.a().b(new Runnable() { // from class: tb.sfq.b.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    b.a(b.this).setScaleX(1.0f);
                    b.a(b.this).setScaleY(1.0f);
                }
            });
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (this.f == null) {
        } else {
            ljd.a().e(this.f);
            ljd.a().a(new b(this.f.f33529a, a.a(this.f)));
            this.f = null;
        }
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        this.b = new MNNCVExecutor("live_show_grounding_c");
        this.b.a(new MNNCVExecutor.a() { // from class: tb.sfq.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.mnncv.MNNCVExecutor.a
            public void onResult(MRTRuntimeException mRTRuntimeException) {
                IpChange ipChange2 = $ipChange;
                boolean z = true;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3b72e6cf", new Object[]{this, mRTRuntimeException});
                    return;
                }
                sfq sfqVar = sfq.this;
                if (mRTRuntimeException != null) {
                    z = false;
                }
                sfq.a(sfqVar, z);
                if (mRTRuntimeException == null) {
                    return;
                }
                sfq.a(sfq.this, mRTRuntimeException.errorCode, mRTRuntimeException.getMessage());
            }
        });
    }

    private boolean a(final Runnable runnable, final TBLiveOpenCardView tBLiveOpenCardView, final ppj ppjVar, boolean z) {
        byte[] a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1db9b286", new Object[]{this, runnable, tBLiveOpenCardView, ppjVar, new Boolean(z)})).booleanValue();
        }
        if (ppjVar == null) {
            ldf.d("FaceDetectMission", "faceInfo is null");
            a(1100, "faceInfo is null");
            return false;
        } else if (!this.c) {
            ldf.d("FaceDetectMission", "mnn引擎未初始化");
            ppjVar.A = "1101";
            return false;
        } else if (tBLiveOpenCardView == null) {
            ldf.d("FaceDetectMission", "view is null");
            ppjVar.A = "1102";
            return false;
        } else if (this.b == null) {
            ldf.d("FaceDetectMission", "mExecutor is null");
            ppjVar.A = "1103";
            return false;
        } else {
            this.d = System.currentTimeMillis();
            final Bitmap a3 = sfr.a(tBLiveOpenCardView);
            if (a3 == null) {
                ldf.d("FaceDetectMission", "cropBitmap is null");
                ppjVar.A = "1104";
                ljd.a().b(runnable, ppjVar.u);
                return false;
            } else if (z && ((a2 = l.a(a3)) == null || a2.length < a3.getWidth() * a3.getHeight() * 0.5d)) {
                ldf.d("FaceDetectMission", "cropBitmap size error");
                ljd.a().b(runnable, ppjVar.u);
                ppjVar.A = kcf.VIDEO_NO_COPYRIGHT_CODE;
                return false;
            } else {
                Map<String, Object> a4 = sfr.a(a3, ppjVar.d);
                final long currentTimeMillis = System.currentTimeMillis();
                ppjVar.f++;
                this.b.a(a4, new MNNCVExecutor.b() { // from class: tb.sfq.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.android.mnncv.MNNCVExecutor.b
                    public void onResult(MRTRuntimeException mRTRuntimeException, Map<String, Object> map) {
                        IpChange ipChange2 = $ipChange;
                        boolean z2 = false;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("dce89cd6", new Object[]{this, mRTRuntimeException, map});
                        } else if (!TextUtils.equals(ppjVar.d, sfq.d(sfq.this))) {
                            sfq.a(sfq.this, 4001, sft.LIVE_ALGO_FAILURE_BIZCODE_ERROR);
                        } else {
                            if (mRTRuntimeException != null) {
                                sfq.a(sfq.this, mRTRuntimeException.errorCode, mRTRuntimeException.getMessage());
                                ppjVar.g++;
                            } else {
                                sft.a(sft.LIVE_SINGLE_FRAME_DURATION, String.valueOf(System.currentTimeMillis() - currentTimeMillis), "");
                                if (map == null || !TextUtils.equals(String.valueOf(map.get(UTConstant.Args.UT_PROPERTY_SUCCESS)), "1")) {
                                    ppjVar.g++;
                                    sfq.a(sfq.this, 4002, sft.LIVE_ALGO_FAILURE_RESULT_ISNULL_ERROR);
                                } else {
                                    ppj ppjVar2 = ppjVar;
                                    ppjVar2.z = ppjVar2.f;
                                    Object obj = map.get(UploadConstants.BIZ_CODE);
                                    if (!(obj instanceof String)) {
                                        sfq.a(sfq.this, 4001, sft.LIVE_ALGO_FAILURE_NO_BIZCODE);
                                        return;
                                    } else if (!((String) obj).equals(sfq.d(sfq.this))) {
                                        sfq.a(sfq.this, 4001, sft.LIVE_ALGO_FAILURE_BIZCODE_ERROR);
                                        return;
                                    } else {
                                        Rect a5 = sfr.a(map, tBLiveOpenCardView);
                                        sfq.a(sfq.this).a(ppjVar, a5 != null, a5, a3.getWidth(), a3.getHeight(), tBLiveOpenCardView.getLeft(), tBLiveOpenCardView.getTop());
                                        sfq.a(sfq.this, tBLiveOpenCardView, ppjVar);
                                        sft.a(sft.LIVE_TOTAL_DURATION, String.valueOf(System.currentTimeMillis() - sfq.e(sfq.this)), String.valueOf(a5 != null));
                                    }
                                }
                            }
                            if (!ppjVar.s && ppjVar.f - ppjVar.z < sfq.f(sfq.this).g().getDetectionContinuedErrorCloseThreshold()) {
                                z2 = true;
                            }
                            if (!z2) {
                                return;
                            }
                            ljd.a().b(runnable, ppjVar.u);
                        }
                    }
                });
                return true;
            }
        }
    }

    private void a(final TBLiveOpenCardView tBLiveOpenCardView, final ppj ppjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d465d750", new Object[]{this, tBLiveOpenCardView, ppjVar});
        } else if (ppjVar == null || tBLiveOpenCardView == null) {
        } else {
            FaceDetectorConfig faceDetectorConfig = this.h;
            if (faceDetectorConfig != null && faceDetectorConfig.c() && jqm.a() && ppjVar.r != null) {
                ljd.a().b(new Runnable() { // from class: tb.sfq.3
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            sfq.a(sfq.this, tBLiveOpenCardView, ppjVar.r);
                        }
                    }
                });
            }
            FaceDetectorConfig faceDetectorConfig2 = this.h;
            if (faceDetectorConfig2 == null || !faceDetectorConfig2.b()) {
                return;
            }
            sfr.a(tBLiveOpenCardView, ppjVar);
        }
    }

    private void a(ViewGroup viewGroup, Rect rect) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87070612", new Object[]{this, viewGroup, rect});
        } else if (viewGroup == null || rect == null) {
        } else {
            AutoSelectView autoSelectView = this.e;
            if (autoSelectView == null) {
                this.e = new AutoSelectView(viewGroup.getContext(), rect);
                viewGroup.addView(this.e);
            } else if (autoSelectView.getParent() == null) {
                viewGroup.addView(this.e);
                this.e.setRect(rect);
            } else if (this.e.getParent() == viewGroup) {
                this.e.setRect(rect);
            } else {
                ((ViewGroup) this.e.getParent()).removeView(this.e);
                viewGroup.addView(this.e);
                this.e.setRect(rect);
            }
        }
    }

    private void a(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20f12ca5", new Object[]{this, new Integer(i), str});
        } else {
            sft.a(sft.LIVE_ALGO_FAILURE_DETAIL, String.valueOf(i), str);
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        if (this.f != null) {
            ljd.a().e(this.f);
        }
        this.f33526a = null;
        MNNCVExecutor mNNCVExecutor = this.b;
        if (mNNCVExecutor == null) {
            return;
        }
        mNNCVExecutor.a();
        this.c = false;
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        a aVar = this.f;
        if (aVar == null || a.a(aVar) == null) {
            return;
        }
        a.a(this.f).y = true;
    }
}
