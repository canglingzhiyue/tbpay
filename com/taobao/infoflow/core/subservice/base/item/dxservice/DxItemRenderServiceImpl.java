package com.taobao.infoflow.core.subservice.base.item.dxservice;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.l;
import com.taobao.android.dinamicx.DXEngineConfig;
import com.taobao.infoflow.core.subservice.base.item.dxservice.impl.render.a;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.infoflow.protocol.subservice.base.IDxItemRenderService;
import java.util.List;
import tb.kge;
import tb.lcz;
import tb.ldf;
import tb.ldy;
import tb.ljs;

/* loaded from: classes.dex */
public class DxItemRenderServiceImpl implements IDxItemRenderService {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "DxItemRenderServiceImpl";
    private a dxCardRender;
    private final ldy dxCenter = new ldy();
    private DXEngineConfig.a mDxEngineConfigBuilder;
    private IDxItemRenderService.a mDxRegisterListener;
    private ljs mInfoFlowContext;

    static {
        kge.a(952417858);
        kge.a(-83177686);
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onCreateService(ljs ljsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ceabc49c", new Object[]{this, ljsVar});
        } else {
            this.mInfoFlowContext = ljsVar;
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onDestroyService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("770ac0a1", new Object[]{this});
        } else {
            this.dxCenter.c();
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.base.IDxItemRenderService
    public synchronized void initDx() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5ef6c4b", new Object[]{this});
        } else if (this.dxCardRender != null) {
            ldf.d(TAG, "initDx 请勿重复初始化");
        } else if (this.mInfoFlowContext == null) {
            ldf.d(TAG, "initDx mInfoFlowContext is null");
        } else {
            ldf.d(TAG, "initDx");
            this.dxCenter.a(this.mInfoFlowContext, this.mDxEngineConfigBuilder, this.mDxRegisterListener);
            this.dxCardRender = this.dxCenter.a();
        }
    }

    @Override // com.taobao.infoflow.protocol.view.item.b
    public void preRender(Context context, BaseSectionModel<?> baseSectionModel, boolean z, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23eb059f", new Object[]{this, context, baseSectionModel, new Boolean(z), new Integer(i)});
            return;
        }
        if (this.dxCardRender == null) {
            initDx();
        }
        a aVar = this.dxCardRender;
        if (aVar == null) {
            return;
        }
        aVar.preRender(context, baseSectionModel, z, i);
    }

    @Override // com.taobao.infoflow.protocol.view.item.b
    public View createView(ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("97790b1e", new Object[]{this, viewGroup, new Integer(i)});
        }
        checkInit();
        return this.dxCardRender.createView(viewGroup, i);
    }

    @Override // com.taobao.infoflow.protocol.view.item.b
    public void bindData(View view, BaseSectionModel<?> baseSectionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43424acc", new Object[]{this, view, baseSectionModel});
            return;
        }
        checkInit();
        this.dxCardRender.bindData(view, baseSectionModel);
    }

    @Override // com.taobao.infoflow.protocol.view.item.b
    public int getViewType(BaseSectionModel<?> baseSectionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c9fbda37", new Object[]{this, baseSectionModel})).intValue();
        }
        checkInit();
        return this.dxCardRender.getViewType(baseSectionModel);
    }

    @Override // com.taobao.infoflow.protocol.subservice.base.IDxItemRenderService
    public void reset() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("788e6256", new Object[]{this});
        } else {
            this.dxCenter.b();
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.base.IDxItemRenderService
    public void downloadTemplate(List<BaseSectionModel> list, IDxItemRenderService.b bVar) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5262357f", new Object[]{this, list, bVar});
            return;
        }
        if (this.dxCardRender == null) {
            initDx();
        }
        if (this.dxCardRender == null) {
            return;
        }
        Application a2 = lcz.a();
        if (a2 != null && (l.d(a2) || l.b(a2))) {
            z = false;
        }
        this.dxCenter.a(this.mInfoFlowContext, list, bVar, z);
    }

    @Override // com.taobao.infoflow.protocol.subservice.base.IDxItemRenderService
    public void downloadTemplateWithoutPrefetch(List<BaseSectionModel> list, IDxItemRenderService.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b08e69a4", new Object[]{this, list, bVar});
            return;
        }
        if (this.dxCardRender == null) {
            initDx();
        }
        if (this.dxCardRender == null) {
            return;
        }
        this.dxCenter.a(this.mInfoFlowContext, list, bVar, false);
    }

    @Override // com.taobao.infoflow.protocol.subservice.base.IDxItemRenderService
    public void setOnDxRegisterListener(IDxItemRenderService.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62b4c0e7", new Object[]{this, aVar});
        } else {
            this.mDxRegisterListener = aVar;
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.base.IDxItemRenderService
    public void setDxEngineConfigBuilder(DXEngineConfig.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ed2626f", new Object[]{this, aVar});
        } else {
            this.mDxEngineConfigBuilder = aVar;
        }
    }

    private void checkInit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9fdaa2bf", new Object[]{this});
        } else if (this.dxCardRender == null) {
            throw new IllegalArgumentException("信息流DX引擎未初始化！请先调用：initDx");
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.base.IDxItemRenderService
    public void setDxEngineDesignScaleEnable(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33807f3e", new Object[]{this, new Boolean(z), new Boolean(z2)});
        } else {
            this.dxCenter.a(z, z2);
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.base.IDxItemRenderService
    public void setDxCurrentActivity(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("789a24b", new Object[]{this, activity});
        } else {
            this.dxCenter.a(activity);
        }
    }
}
