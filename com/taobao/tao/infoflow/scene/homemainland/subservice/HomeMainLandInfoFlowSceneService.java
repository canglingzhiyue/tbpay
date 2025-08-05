package com.taobao.tao.infoflow.scene.homemainland.subservice;

import android.content.Context;
import android.os.SystemClock;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.bi;
import com.taobao.android.goodprice.homepage.dx.GoodPriceDxCenter;
import com.taobao.android.home.component.utils.b;
import com.taobao.infoflow.core.subservice.biz.sceneservice.SceneServiceImpl;
import com.taobao.infoflow.protocol.engine.invoke.biz.e;
import com.taobao.infoflow.protocol.engine.invoke.biz.h;
import com.taobao.infoflow.protocol.engine.invoke.biz.l;
import com.taobao.infoflow.protocol.subservice.base.IDxItemRenderService;
import com.taobao.infoflow.protocol.subservice.framework.IThemeService;
import tb.gmi;
import tb.kge;
import tb.ldf;
import tb.ljs;
import tb.lms;
import tb.lrf;
import tb.oke;
import tb.okf;
import tb.okg;
import tb.tbr;

/* loaded from: classes.dex */
public class HomeMainLandInfoFlowSceneService extends SceneServiceImpl {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String GLOBAL_THEME_BIZ_NAME = "homepage";
    private static final String TAG = "HomeMainLandInfoFlowSceneService";
    private ljs infoFlowContext;
    private e naviBarInvoker;
    private oke pullDownRefreshInvoker;
    private okg utInvoker;

    static {
        kge.a(-218156244);
    }

    public static /* synthetic */ Object ipc$super(HomeMainLandInfoFlowSceneService homeMainLandInfoFlowSceneService, String str, Object... objArr) {
        if (str.hashCode() == -827603812) {
            super.onCreateService((ljs) objArr[0]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ void access$000(HomeMainLandInfoFlowSceneService homeMainLandInfoFlowSceneService, DinamicXEngine dinamicXEngine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35728fab", new Object[]{homeMainLandInfoFlowSceneService, dinamicXEngine});
        } else {
            homeMainLandInfoFlowSceneService.registerGoodPriceDx(dinamicXEngine);
        }
    }

    @Override // com.taobao.infoflow.core.subservice.biz.sceneservice.SceneServiceImpl, com.taobao.infoflow.protocol.subservice.ISubService
    public void onCreateService(ljs ljsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ceabc49c", new Object[]{this, ljsVar});
            return;
        }
        super.onCreateService(ljsVar);
        this.infoFlowContext = ljsVar;
        initBiz(ljsVar);
    }

    private void initBiz(ljs ljsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2995e685", new Object[]{this, ljsVar});
            return;
        }
        initDxCustomRegister(ljsVar);
        IThemeService iThemeService = (IThemeService) ljsVar.a(IThemeService.class);
        if (iThemeService == null) {
            return;
        }
        iThemeService.setEnableCreateGlobalTheme("homepage");
    }

    private void initDxCustomRegister(final ljs ljsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b18653a", new Object[]{this, ljsVar});
            return;
        }
        IDxItemRenderService iDxItemRenderService = (IDxItemRenderService) ljsVar.a(IDxItemRenderService.class);
        if (iDxItemRenderService == null) {
            return;
        }
        iDxItemRenderService.setOnDxRegisterListener(new IDxItemRenderService.a() { // from class: com.taobao.tao.infoflow.scene.homemainland.subservice.HomeMainLandInfoFlowSceneService.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.infoflow.protocol.subservice.base.IDxItemRenderService.a
            public void a(DinamicXEngine dinamicXEngine) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("37589d99", new Object[]{this, dinamicXEngine});
                    return;
                }
                lrf.a(dinamicXEngine, ljsVar);
                dinamicXEngine.a(tbr.DX_EVENT_HWEBVIEWPREREQUEST, new tbr());
                dinamicXEngine.a(new bi() { // from class: com.taobao.tao.infoflow.scene.homemainland.subservice.HomeMainLandInfoFlowSceneService.1.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.android.dinamicx.bi
                    public int a(int i, int i2) {
                        IpChange ipChange3 = $ipChange;
                        return ipChange3 instanceof IpChange ? ((Number) ipChange3.ipc$dispatch("5c1152bb", new Object[]{this, new Integer(i), new Integer(i2)})).intValue() : i2;
                    }

                    @Override // com.taobao.android.dinamicx.bi
                    public /* synthetic */ boolean a() {
                        return bi.CC.$default$a(this);
                    }

                    @Override // com.taobao.android.dinamicx.bi
                    public boolean a(Context context) {
                        IpChange ipChange3 = $ipChange;
                        return ipChange3 instanceof IpChange ? ((Boolean) ipChange3.ipc$dispatch("9e1d6464", new Object[]{this, context})).booleanValue() : b.a(context);
                    }
                });
                try {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    HomeMainLandInfoFlowSceneService.access$000(HomeMainLandInfoFlowSceneService.this, dinamicXEngine);
                    ldf.e(HomeMainLandInfoFlowSceneService.TAG, "好价版DX注册耗时：" + (SystemClock.elapsedRealtime() - elapsedRealtime));
                } catch (Throwable th) {
                    ldf.a(HomeMainLandInfoFlowSceneService.TAG, "好价版DX注册异常", th);
                }
            }
        });
    }

    @Override // com.taobao.infoflow.core.subservice.biz.sceneservice.SceneServiceImpl, tb.lkj
    public e getNaviBarInvoker() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e) ipChange.ipc$dispatch("3391ad3", new Object[]{this});
        }
        if (this.naviBarInvoker == null) {
            this.naviBarInvoker = new okf(this.infoFlowContext);
        }
        return this.naviBarInvoker;
    }

    @Override // com.taobao.infoflow.core.subservice.biz.sceneservice.SceneServiceImpl, tb.lkj
    public h getPullDownRefreshInvoker() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h) ipChange.ipc$dispatch("cb98e77", new Object[]{this});
        }
        if (this.pullDownRefreshInvoker == null) {
            this.pullDownRefreshInvoker = new oke(this.infoFlowContext);
        }
        return this.pullDownRefreshInvoker;
    }

    @Override // com.taobao.infoflow.core.subservice.biz.sceneservice.SceneServiceImpl, tb.lkj
    public l getUtInvoker() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (l) ipChange.ipc$dispatch("6541bcea", new Object[]{this});
        }
        if (this.utInvoker == null) {
            this.utInvoker = new okg(this.infoFlowContext);
        }
        return this.utInvoker;
    }

    private void registerGoodPriceDx(DinamicXEngine dinamicXEngine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a527ed5", new Object[]{this, dinamicXEngine});
            return;
        }
        gmi createGoodPriceDxRegistry = GoodPriceDxCenter.createGoodPriceDxRegistry("homepage");
        lms.a(dinamicXEngine, createGoodPriceDxRegistry.a());
        lms.b(dinamicXEngine, createGoodPriceDxRegistry.b());
        lms.c(dinamicXEngine, createGoodPriceDxRegistry.c());
        lms.d(dinamicXEngine, createGoodPriceDxRegistry.d());
    }
}
