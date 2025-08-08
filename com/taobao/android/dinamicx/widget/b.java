package com.taobao.android.dinamicx.widget;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.widget.ImageView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.AliUrlImageView;
import com.taobao.android.dinamicx.DXEngineConfig;
import com.taobao.android.dinamicx.bx;
import com.taobao.android.dinamicx.monitor.DXTraceUtil;
import com.taobao.android.dinamicx.widget.DXImageWidgetNode;
import com.taobao.tao.image.ImageStrategyConfig;
import com.taobao.tao.util.TaobaoImageUrlStrategy;
import com.taobao.uikit.extend.feature.features.PhenixOptions;
import com.taobao.uikit.feature.features.AbsFeature;
import com.taobao.uikit.feature.features.RoundRectShapeFeature;
import java.lang.ref.WeakReference;
import java.util.Map;
import tb.fqi;
import tb.fux;

/* loaded from: classes.dex */
public class b implements an {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // com.taobao.android.dinamicx.widget.an
    public ImageView a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ImageView) ipChange.ipc$dispatch("4124c730", new Object[]{this, context});
        }
        AliUrlImageView aliUrlImageView = new AliUrlImageView(context);
        aliUrlImageView.setReusableImageShape(true);
        return aliUrlImageView;
    }

    @Override // com.taobao.android.dinamicx.widget.an
    public void a(ImageView imageView, String str, DXImageWidgetNode.d dVar) {
        ImageStrategyConfig.a a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35de9ac6", new Object[]{this, imageView, str, dVar});
        } else if (!(imageView instanceof AliUrlImageView)) {
        } else {
            AliUrlImageView aliUrlImageView = (AliUrlImageView) imageView;
            if (fqi.m()) {
                aliUrlImageView.setSkipAutoSize(dVar.i() || dVar.g() || dVar.a() == 1 || dVar.o);
            }
            if (!fqi.m()) {
                aliUrlImageView.setSkipAutoSize(dVar.i() || dVar.g() || dVar.a() == 1 || dVar.o);
            }
            aliUrlImageView.setAutoRelease(dVar.j());
            aliUrlImageView.setPlaceHoldForeground(dVar.h);
            aliUrlImageView.setPlaceHoldImageResId(dVar.g);
            aliUrlImageView.setDarkModeOverlay(dVar.h(), (int) (dVar.k() * 255.0d));
            aliUrlImageView.setFadeIn(dVar.o() || dVar.v());
            aliUrlImageView.setWhenNullClearImg(dVar.E);
            boolean z = fqi.R() && Build.VERSION.SDK_INT >= 21;
            if (dVar.c()) {
                if (dVar.i() && z) {
                    AbsFeature<? super ImageView> findFeature = aliUrlImageView.findFeature(RoundRectShapeFeature.class);
                    if (!(findFeature instanceof RoundRectShapeFeature)) {
                        findFeature = new RoundRectShapeFeature();
                        aliUrlImageView.addFeature(findFeature);
                    }
                    int[] iArr = dVar.f11999a;
                    ((RoundRectShapeFeature) findFeature).setCornerRadius(Math.max(iArr[0], 0), Math.max(iArr[1], 0), Math.max(iArr[3], 0), Math.max(iArr[2], 0));
                } else {
                    int[] iArr2 = dVar.f11999a;
                    aliUrlImageView.setCornerRadius(iArr2[0], iArr2[1], iArr2[3], iArr2[2]);
                    aliUrlImageView.setShape(1);
                }
            }
            if (z && (!dVar.c() || !dVar.i())) {
                AbsFeature<? super ImageView> findFeature2 = aliUrlImageView.findFeature(RoundRectShapeFeature.class);
                if (findFeature2 instanceof RoundRectShapeFeature) {
                    ((RoundRectShapeFeature) findFeature2).reset();
                    aliUrlImageView.removeFeature(RoundRectShapeFeature.class);
                }
            }
            if (dVar.f()) {
                aliUrlImageView.setStrokeWidth(dVar.c);
            }
            if (dVar.e()) {
                aliUrlImageView.setStrokeColor(dVar.b);
            }
            if (!StringUtils.isEmpty(dVar.e) && dVar.f >= 0) {
                a2 = ImageStrategyConfig.a(dVar.e, dVar.f);
            } else {
                a2 = ImageStrategyConfig.a(dVar.e);
            }
            if (dVar.a() == 2) {
                a2.d(true);
            }
            if (dVar.d() && "heightLimit".equals(dVar.i)) {
                a2.a(ImageStrategyConfig.SizeLimitType.HEIGHT_LIMIT);
            }
            a2.a(a(dVar));
            aliUrlImageView.setStrategyConfig(a2.a());
            aliUrlImageView.setPriorityModuleName(dVar.u());
            if (dVar.j != null || (dVar.l && (dVar.l() != null || dVar.n >= 0))) {
                aliUrlImageView.succListener(new a(new WeakReference(imageView), dVar));
            } else {
                aliUrlImageView.succListener((com.taobao.android.i<com.taobao.android.l>) null);
            }
            a(str, aliUrlImageView, dVar);
        }
    }

    private void a(String str, AliUrlImageView aliUrlImageView, DXImageWidgetNode.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("363501df", new Object[]{this, str, aliUrlImageView, dVar});
        } else if (dVar != null && dVar.b()) {
            PhenixOptions phenixOptions = new PhenixOptions();
            if (dVar.m() != null) {
                for (Map.Entry<String, String> entry : dVar.m().entrySet()) {
                    phenixOptions.addLoaderExtra(entry.getKey(), entry.getValue());
                }
            }
            if (dVar.n() != null) {
                phenixOptions.setOpenTraceContext(dVar.n());
            }
            try {
                if (dVar.q() > 0) {
                    phenixOptions.bitmapProcessors(new com.taobao.phenix.compat.effects.b(aliUrlImageView.getContext(), dVar.q(), dVar.r()));
                }
            } catch (Throwable th) {
                fux.b("blur bitmapProcessors " + th.getLocalizedMessage());
            }
            phenixOptions.fuzzyMatchCache(dVar.t());
            phenixOptions.setStrictMatchCache(dVar.K);
            aliUrlImageView.enableSizeInLayoutParams(dVar.p());
            if (dVar.w() > 0) {
                if (dVar.w() == 1) {
                    DXTraceUtil.a("postSetImageUrl");
                    aliUrlImageView.asyncSetImageUrl(str, phenixOptions);
                    DXTraceUtil.a();
                } else if (dVar.w() == 2) {
                    DXTraceUtil.a("asyncSetImageUrl");
                    aliUrlImageView.async(true);
                    aliUrlImageView.setImageUrl(str, phenixOptions);
                    DXTraceUtil.a();
                } else {
                    DXTraceUtil.a("setImageUrl");
                    aliUrlImageView.setImageUrl(str, phenixOptions);
                    DXTraceUtil.a();
                }
            } else if (bx.b()) {
                DXTraceUtil.a("asyncSetImageUrl");
                aliUrlImageView.async(true);
                aliUrlImageView.setImageUrl(str, phenixOptions);
                DXTraceUtil.a();
            } else if (bx.j()) {
                DXTraceUtil.a("postSetImageUrl");
                aliUrlImageView.asyncSetImageUrl(str, phenixOptions);
                DXTraceUtil.a();
            } else {
                DXTraceUtil.a("setImageUrl");
                aliUrlImageView.setImageUrl(str, phenixOptions);
                DXTraceUtil.a();
            }
        }
    }

    /* loaded from: classes5.dex */
    public static class a implements com.taobao.android.i<com.taobao.android.l> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public DXImageWidgetNode.d f12072a;

        public a(WeakReference<View> weakReference, DXImageWidgetNode.d dVar) {
            this.f12072a = dVar;
        }

        @Override // com.taobao.android.i
        public boolean a(com.taobao.android.l lVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("f5589b42", new Object[]{this, lVar})).booleanValue();
            }
            DXImageWidgetNode.e eVar = new DXImageWidgetNode.e();
            BitmapDrawable a2 = lVar.a();
            eVar.f12000a = a2;
            if (this.f12072a.j != null) {
                this.f12072a.j.a(eVar);
            }
            if (this.f12072a.l && (a2 instanceof com.taobao.phenix.animate.b)) {
                com.taobao.phenix.animate.b bVar = (com.taobao.phenix.animate.b) a2;
                bVar.a(Math.max(this.f12072a.n, 0));
                if (this.f12072a.l() != null) {
                    bVar.a(new com.taobao.phenix.animate.c() { // from class: com.taobao.android.dinamicx.widget.b.a.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // com.taobao.phenix.animate.c
                        public boolean onLoopCompleted(int i, int i2) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                return ((Boolean) ipChange2.ipc$dispatch("a7565d93", new Object[]{this, new Integer(i), new Integer(i2)})).booleanValue();
                            }
                            DXImageWidgetNode.a l = a.this.f12072a.l();
                            if (l != null) {
                                l.a(i);
                            }
                            return true;
                        }
                    });
                } else {
                    bVar.a((com.taobao.phenix.animate.c) null);
                }
            }
            return false;
        }
    }

    public static TaobaoImageUrlStrategy.ImageQuality a(DXImageWidgetNode.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TaobaoImageUrlStrategy.ImageQuality) ipChange.ipc$dispatch("56ad564d", new Object[]{dVar});
        }
        DXEngineConfig.ImageQuality s = dVar.s();
        if (s == null) {
            return null;
        }
        if (s == DXEngineConfig.ImageQuality.q90) {
            return TaobaoImageUrlStrategy.ImageQuality.q90;
        }
        if (s == DXEngineConfig.ImageQuality.q75) {
            return TaobaoImageUrlStrategy.ImageQuality.q75;
        }
        if (s == DXEngineConfig.ImageQuality.q60) {
            return TaobaoImageUrlStrategy.ImageQuality.q60;
        }
        if (s == DXEngineConfig.ImageQuality.q50) {
            return TaobaoImageUrlStrategy.ImageQuality.q50;
        }
        if (s != DXEngineConfig.ImageQuality.q30) {
            return null;
        }
        return TaobaoImageUrlStrategy.ImageQuality.q30;
    }
}
